package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "emailSet", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewHolder$onAttachViewModel$3", f = "ChangeEmailViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChangeEmailViewHolder$onAttachViewModel$3 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ChangeEmailViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewHolder$onAttachViewModel$3(ChangeEmailViewHolder changeEmailViewHolder, d<? super ChangeEmailViewHolder$onAttachViewModel$3> dVar) {
        super(2, dVar);
        this.this$0 = changeEmailViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChangeEmailViewHolder$onAttachViewModel$3 changeEmailViewHolder$onAttachViewModel$3 = new ChangeEmailViewHolder$onAttachViewModel$3(this.this$0, dVar);
        changeEmailViewHolder$onAttachViewModel$3.Z$0 = ((Boolean) obj).booleanValue();
        return changeEmailViewHolder$onAttachViewModel$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.Z$0) {
            composerReferences = this.this$0.composerReferences;
            ComposerExtKt.sendRefreshToTargetFragment$default(composerReferences.getContainer(), null, null, null, null, 15, null);
            composerReferences2 = this.this$0.composerReferences;
            composerReferences2.getNavigator().popBackStack();
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((ChangeEmailViewHolder$onAttachViewModel$3) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
