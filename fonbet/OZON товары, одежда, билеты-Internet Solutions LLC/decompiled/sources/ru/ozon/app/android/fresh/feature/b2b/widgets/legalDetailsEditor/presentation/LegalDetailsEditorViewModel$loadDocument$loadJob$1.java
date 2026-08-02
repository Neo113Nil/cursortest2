package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import G.g;
import Sc.o;
import Sc.s;
import Wc.a;
import We.C;
import We.D;
import We.J;
import We.K;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewModel$loadDocument$loadJob$1", f = "LegalDetailsEditorViewModel.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewModel$loadDocument$loadJob$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $position;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ LegalDetailsEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewModel$loadDocument$loadJob$1(LegalDetailsEditorViewModel legalDetailsEditorViewModel, String str, Uri uri, int i11, d<? super LegalDetailsEditorViewModel$loadDocument$loadJob$1> dVar) {
        super(2, dVar);
        this.this$0 = legalDetailsEditorViewModel;
        this.$fileName = str;
        this.$uri = uri;
        this.$position = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LegalDetailsEditorViewModel$loadDocument$loadJob$1(this.this$0, this.$fileName, this.$uri, this.$position, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        FileHelper fileHelper;
        LegalDetailsEditorRepository legalDetailsEditorRepository;
        FileHelper fileHelper2;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO;
        SingleDocumentResponseDTO.ErrorResponse.Message message;
        Map map2;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO2;
        FileHelper fileHelper3;
        FileHelper fileHelper4;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO3;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            map = this.this$0.fileNameToKeyMap;
            map.remove(this.$fileName);
            String str = this.$fileName;
            fileHelper = this.this$0.fileHelper;
            String c11 = g.c(str, ".", fileHelper.getFileExtension(this.$uri));
            legalDetailsEditorRepository = this.this$0.repository;
            K.Companion companion = K.INSTANCE;
            String str2 = this.$fileName;
            C.f33536g.getClass();
            C b11 = C.a.b("text/plain");
            companion.getClass();
            J b12 = K.Companion.b(str2, b11);
            fileHelper2 = this.this$0.fileHelper;
            D.c createMultipartBodyPart = fileHelper2.createMultipartBodyPart(c11, this.$uri);
            this.label = 1;
            obj = legalDetailsEditorRepository.loadDocument(b12, createMultipartBodyPart, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO5 = null;
        r1 = null;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO6 = null;
        r1 = null;
        LegalDetailsEditorVO.FileFieldVO fileFieldVO7 = null;
        r1 = null;
        String str3 = null;
        fileFieldVO5 = null;
        if (result instanceof Result.Failure) {
            List<LegalDetailsEditorVO.FileFieldVO> value = this.this$0.getFileFields().getValue();
            LegalDetailsEditorVO.Status status = (value == null || (fileFieldVO4 = value.get(this.$position)) == null) ? null : fileFieldVO4.getStatus();
            LegalDetailsEditorVO.Status.Loading loading = status instanceof LegalDetailsEditorVO.Status.Loading ? (LegalDetailsEditorVO.Status.Loading) status : null;
            String fullFileName = loading != null ? loading.getFullFileName() : null;
            fileHelper4 = this.this$0.fileHelper;
            if (Intrinsics.d(fullFileName, fileHelper4.getFileName(this.$uri))) {
                List<LegalDetailsEditorVO.FileFieldVO> value2 = this.this$0.getFileFields().getValue();
                if (value2 != null && (fileFieldVO3 = value2.get(this.$position)) != null) {
                    fileFieldVO6 = LegalDetailsEditorVO.FileFieldVO.copy$default(fileFieldVO3, null, null, null, 0L, null, null, new LegalDetailsEditorVO.Status.UnknownError(null), 63, null);
                }
                this.this$0.updateFileFieldByPosition(fileFieldVO6, this.$position);
            }
        } else {
            if (!(result instanceof Result.Success)) {
                throw new o();
            }
            SingleDocumentResponseDTO singleDocumentResponseDTO = (SingleDocumentResponseDTO) ((Result.Success) result).getValue();
            if (Intrinsics.d(singleDocumentResponseDTO.isSuccess(), Boolean.TRUE) && singleDocumentResponseDTO.getError() == null) {
                List<LegalDetailsEditorVO.FileFieldVO> value3 = this.this$0.getFileFields().getValue();
                if (value3 != null && (fileFieldVO2 = value3.get(this.$position)) != null) {
                    Uri uri = this.$uri;
                    fileHelper3 = this.this$0.fileHelper;
                    fileFieldVO7 = LegalDetailsEditorVO.FileFieldVO.copy$default(fileFieldVO2, null, null, null, 0L, null, null, new LegalDetailsEditorVO.Status.Success(uri, fileHelper3.getFileName(this.$uri)), 63, null);
                }
                this.this$0.updateFileFieldByPosition(fileFieldVO7, this.$position);
                String key = singleDocumentResponseDTO.getKey();
                if (key != null && key.length() != 0) {
                    map2 = this.this$0.fileNameToKeyMap;
                    map2.put(this.$fileName, singleDocumentResponseDTO.getKey());
                }
            } else {
                List<LegalDetailsEditorVO.FileFieldVO> value4 = this.this$0.getFileFields().getValue();
                if (value4 != null && (fileFieldVO = value4.get(this.$position)) != null) {
                    SingleDocumentResponseDTO.ErrorResponse error = singleDocumentResponseDTO.getError();
                    if (error != null && (message = error.getMessage()) != null) {
                        str3 = message.getText();
                    }
                    fileFieldVO5 = LegalDetailsEditorVO.FileFieldVO.copy$default(fileFieldVO, null, null, null, 0L, null, null, new LegalDetailsEditorVO.Status.UnknownError(str3), 63, null);
                }
                this.this$0.updateFileFieldByPosition(fileFieldVO5, this.$position);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LegalDetailsEditorViewModel$loadDocument$loadJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
