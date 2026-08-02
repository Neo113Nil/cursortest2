package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Sc.s;
import Wc.a;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "showLoaderFlag", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$onAttachViewModel$4", f = "LegalDetailsEditorViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewHolder$onAttachViewModel$4 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LegalDetailsEditorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewHolder$onAttachViewModel$4(LegalDetailsEditorViewHolder legalDetailsEditorViewHolder, d<? super LegalDetailsEditorViewHolder$onAttachViewModel$4> dVar) {
        super(2, dVar);
        this.this$0 = legalDetailsEditorViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LegalDetailsEditorViewHolder$onAttachViewModel$4 legalDetailsEditorViewHolder$onAttachViewModel$4 = new LegalDetailsEditorViewHolder$onAttachViewModel$4(this.this$0, dVar);
        legalDetailsEditorViewHolder$onAttachViewModel$4.Z$0 = ((Boolean) obj).booleanValue();
        return legalDetailsEditorViewHolder$onAttachViewModel$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        composerReferences = this.this$0.references;
        InterfaceC7851b controller = composerReferences.getController();
        if (z11) {
            controller.e(new l.a.C1079a(0L, null, 3));
        } else {
            controller.hideLoader();
        }
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((LegalDetailsEditorViewHolder$onAttachViewModel$4) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
