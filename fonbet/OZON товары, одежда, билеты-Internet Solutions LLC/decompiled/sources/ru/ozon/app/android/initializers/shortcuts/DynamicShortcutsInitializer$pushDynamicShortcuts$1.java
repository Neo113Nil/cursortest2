package ru.ozon.app.android.initializers.shortcuts;

import Sc.s;
import Wc.a;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.shortcuts.DynamicShortcutsInitializer$pushDynamicShortcuts$1", f = "DynamicShortcutsInitializer.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DynamicShortcutsInitializer$pushDynamicShortcuts$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ShortcutManager $shortcutManager;
    int label;
    final /* synthetic */ DynamicShortcutsInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicShortcutsInitializer$pushDynamicShortcuts$1(ShortcutManager shortcutManager, DynamicShortcutsInitializer dynamicShortcutsInitializer, d<? super DynamicShortcutsInitializer$pushDynamicShortcuts$1> dVar) {
        super(2, dVar);
        this.$shortcutManager = shortcutManager;
        this.this$0 = dynamicShortcutsInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DynamicShortcutsInitializer$pushDynamicShortcuts$1(this.$shortcutManager, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<ShortcutInfo> generateDynamicShortcuts;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        try {
            ShortcutManager shortcutManager = this.$shortcutManager;
            generateDynamicShortcuts = this.this$0.generateDynamicShortcuts();
            shortcutManager.addDynamicShortcuts(generateDynamicShortcuts);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DynamicShortcutsInitializer$pushDynamicShortcuts$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
