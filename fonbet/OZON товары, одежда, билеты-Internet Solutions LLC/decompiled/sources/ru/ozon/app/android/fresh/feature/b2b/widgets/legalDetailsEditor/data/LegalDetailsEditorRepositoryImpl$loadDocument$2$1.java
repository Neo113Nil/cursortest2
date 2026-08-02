package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import Sc.s;
import Wc.a;
import We.D;
import We.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepositoryImpl$loadDocument$2$1", f = "LegalDetailsEditorRepositoryImpl.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorRepositoryImpl$loadDocument$2$1 extends j implements Function2<M, d<? super SingleDocumentResponseDTO>, Object> {
    final /* synthetic */ K $documentType;
    final /* synthetic */ D.c $file;
    final /* synthetic */ LegalDetailsEditorRepositoryImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorRepositoryImpl$loadDocument$2$1(LegalDetailsEditorRepositoryImpl legalDetailsEditorRepositoryImpl, K k11, D.c cVar, d<? super LegalDetailsEditorRepositoryImpl$loadDocument$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = legalDetailsEditorRepositoryImpl;
        this.$documentType = k11;
        this.$file = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LegalDetailsEditorRepositoryImpl$loadDocument$2$1(this.$this_runCatching, this.$documentType, this.$file, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LegalDetailsEditorApi legalDetailsEditorApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        legalDetailsEditorApi = this.$this_runCatching.api;
        K k11 = this.$documentType;
        D.c cVar = this.$file;
        this.label = 1;
        Object loadDocument = legalDetailsEditorApi.loadDocument(k11, cVar, this);
        return loadDocument == aVar ? aVar : loadDocument;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SingleDocumentResponseDTO> dVar) {
        return ((LegalDetailsEditorRepositoryImpl$loadDocument$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
