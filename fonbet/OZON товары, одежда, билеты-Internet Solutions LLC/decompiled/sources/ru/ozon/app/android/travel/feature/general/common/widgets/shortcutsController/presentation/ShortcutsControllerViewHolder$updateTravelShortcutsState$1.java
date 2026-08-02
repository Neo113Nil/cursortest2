package ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.presentation;

import Sc.s;
import Wc.a;
import android.content.pm.ShortcutManager;
import android.os.Build;
import com.google.protobuf.DescriptorProtos$FileOptions;
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
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.presentation.ShortcutsControllerViewHolder$updateTravelShortcutsState$1", f = "ShortcutsControllerViewHolder.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ShortcutsControllerViewHolder$updateTravelShortcutsState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $hide;
    final /* synthetic */ ShortcutManager $shortcutManager;
    final /* synthetic */ List<String> $travelShortcuts;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortcutsControllerViewHolder$updateTravelShortcutsState$1(boolean z11, ShortcutManager shortcutManager, List<String> list, d<? super ShortcutsControllerViewHolder$updateTravelShortcutsState$1> dVar) {
        super(2, dVar);
        this.$hide = z11;
        this.$shortcutManager = shortcutManager;
        this.$travelShortcuts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShortcutsControllerViewHolder$updateTravelShortcutsState$1(this.$hide, this.$shortcutManager, this.$travelShortcuts, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        try {
            if (this.$hide) {
                this.$shortcutManager.disableShortcuts(this.$travelShortcuts);
                if (Build.VERSION.SDK_INT >= 33) {
                    this.$shortcutManager.reportShortcutUsed("hotels");
                }
            } else {
                this.$shortcutManager.enableShortcuts(this.$travelShortcuts);
            }
        } catch (RuntimeException e11) {
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShortcutsControllerViewHolder$updateTravelShortcutsState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
