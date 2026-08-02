package ru.ozon.app.android.cart.controls.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.l;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3ViewHolder$processCheckBoxClick$1$2", f = "ControlsV3ViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ControlsV3ViewHolder$processCheckBoxClick$1$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ControlsV3VO $item;
    int label;
    final /* synthetic */ ControlsV3ViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll20/d;", "invoke", "()Ll20/d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3ViewHolder$processCheckBoxClick$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<l20.d> {
        final /* synthetic */ ControlsV3ViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ControlsV3ViewHolder controlsV3ViewHolder) {
            super(0);
            this.this$0 = controlsV3ViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final l20.d invoke() {
            l viewItem = this.this$0.getViewItem();
            if (viewItem != null) {
                return viewItem.c();
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlsV3ViewHolder$processCheckBoxClick$1$2(ControlsV3VO controlsV3VO, ControlsV3ViewHolder controlsV3ViewHolder, d<? super ControlsV3ViewHolder$processCheckBoxClick$1$2> dVar) {
        super(2, dVar);
        this.$item = controlsV3VO;
        this.this$0 = controlsV3ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ControlsV3ViewHolder$processCheckBoxClick$1$2(this.$item, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        WZ.l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ControlsV3VO invertCheckBox = UtilsKt.toInvertCheckBox(this.$item);
        composerReferences = this.this$0.refs;
        composerReferences.getController().update(UpdateControl.m511boximpl(UpdateControl.m512constructorimpl(invertCheckBox)));
        lVar = this.this$0.tokenizedAnalytics;
        UtilsKt.trackSelectAction(invertCheckBox, lVar, new AnonymousClass1(this.this$0));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ControlsV3ViewHolder$processCheckBoxClick$1$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
