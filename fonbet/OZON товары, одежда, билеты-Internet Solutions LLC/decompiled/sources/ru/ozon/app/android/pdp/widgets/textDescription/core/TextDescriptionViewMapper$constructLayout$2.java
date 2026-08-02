package ru.ozon.app.android.pdp.widgets.textDescription.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.textDescription.data.TextDescriptionDTO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "dto", "Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper$constructLayout$2", f = "TextDescriptionViewMapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TextDescriptionViewMapper$constructLayout$2 extends j implements Function2<TextDescriptionDTO, d<? super Unit>, Object> {
    final /* synthetic */ ComposerReferences $references;
    final /* synthetic */ l $viewObject;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextDescriptionViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextDescriptionViewMapper$constructLayout$2(ComposerReferences composerReferences, TextDescriptionViewMapper textDescriptionViewMapper, l lVar, d<? super TextDescriptionViewMapper$constructLayout$2> dVar) {
        super(2, dVar);
        this.$references = composerReferences;
        this.this$0 = textDescriptionViewMapper;
        this.$viewObject = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TextDescriptionViewMapper$constructLayout$2 textDescriptionViewMapper$constructLayout$2 = new TextDescriptionViewMapper$constructLayout$2(this.$references, this.this$0, this.$viewObject, dVar);
        textDescriptionViewMapper$constructLayout$2.L$0 = obj;
        return textDescriptionViewMapper$constructLayout$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$references.getController().update(new AsyncTextDescriptionUpdateKey(this.this$0.component().getMapper().extractVo$pdp_prodGoogleAllVendorsRelease((TextDescriptionDTO) this.L$0, this.$viewObject.c())));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextDescriptionDTO textDescriptionDTO, d<? super Unit> dVar) {
        return ((TextDescriptionViewMapper$constructLayout$2) create(textDescriptionDTO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
