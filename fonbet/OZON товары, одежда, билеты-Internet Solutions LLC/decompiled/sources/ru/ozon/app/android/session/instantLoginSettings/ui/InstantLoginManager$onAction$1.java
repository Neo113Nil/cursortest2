package ru.ozon.app.android.session.instantLoginSettings.ui;

import Jc0.b;
import Ob0.a;
import Sc.r;
import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginManager$onAction$1", f = "InstantLoginManager.kt", l = {20, 22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InstantLoginManager$onAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $action;
    final /* synthetic */ ComposerReferences $composerReferences;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ InstantLoginManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantLoginManager$onAction$1(String str, InstantLoginManager instantLoginManager, Map<String, String> map, ComposerReferences composerReferences, d<? super InstantLoginManager$onAction$1> dVar) {
        super(2, dVar);
        this.$action = str;
        this.this$0 = instantLoginManager;
        this.$params = map;
        this.$composerReferences = composerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InstantLoginManager$onAction$1(this.$action, this.this$0, this.$params, this.$composerReferences, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r5.a(r1, r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (Jc0.b.a.a(r5, r1, r3, r4, 10) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (Intrinsics.d(this.$action, "instantLoginDisable")) {
                aVar2 = this.this$0.ozonIdAppApi;
                b h11 = aVar2.h();
                Map<String, String> map = this.$params;
                this.label = 1;
            } else {
                aVar = this.this$0.ozonIdAppApi;
                b h12 = aVar.h();
                String str = this.$action;
                Map<String, String> map2 = this.$params;
                this.label = 2;
            }
            return aVar3;
        }
        if (i11 == 1) {
            s.b(obj);
            ((r) obj).getClass();
            r.Companion companion = r.INSTANCE;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        InterfaceC7851b.a.e(this.$composerReferences.getController(), null, null, null, 7);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InstantLoginManager$onAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
