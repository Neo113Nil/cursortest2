package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Ae.x0;
import G.g;
import Sc.s;
import Wc.a;
import We.C;
import We.D;
import We.J;
import We.K;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FileHelper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerVO;
import ru.ozon.app.android.utils.Result;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewModel$uploadFile$newFile$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Uri $uri;
    final /* synthetic */ ReconciliationActsDeclinerViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewModel$uploadFile$newFile$1$1$1", f = "ReconciliationActsDeclinerViewModel.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.ReconciliationActsDeclinerViewModel$uploadFile$newFile$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $fileName;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ ReconciliationActsDeclinerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel, Uri uri, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$fileName = str;
            this.this$0 = reconciliationActsDeclinerViewModel;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$fileName, this.this$0, this.$uri, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FileHelper fileHelper;
            ReconciliationActsDeclinerRepository reconciliationActsDeclinerRepository;
            FileHelper fileHelper2;
            x0 x0Var;
            x0 x0Var2;
            x0 x0Var3;
            x0 x0Var4;
            x0 x0Var5;
            x0 x0Var6;
            FileHelper fileHelper3;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                String str = this.$fileName;
                fileHelper = this.this$0.fileHelper;
                String c11 = g.c(str, ".", fileHelper.getFileExtension(this.$uri));
                reconciliationActsDeclinerRepository = this.this$0.repository;
                K.Companion companion = K.INSTANCE;
                String str2 = this.$fileName;
                C.f33536g.getClass();
                C b11 = C.a.b("text/plain");
                companion.getClass();
                J b12 = K.Companion.b(str2, b11);
                fileHelper2 = this.this$0.fileHelper;
                D.c createMultipartBodyPart = fileHelper2.createMultipartBodyPart(c11, this.$uri);
                this.label = 1;
                obj = reconciliationActsDeclinerRepository.loadDocument(b12, createMultipartBodyPart, this);
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
            x0Var = this.this$0._fileField;
            x0Var2 = this.this$0._fileField;
            ReconciliationActsDeclinerVO.AttachField attachField = (ReconciliationActsDeclinerVO.AttachField) x0Var2.getValue();
            x0Var.setValue(attachField != null ? ReconciliationActsDeclinerVO.AttachField.copy$default(attachField, null, null, null, 0, null, new ReconciliationActsDeclinerVO.Status.Loading(this.$uri, this.$fileName), null, 95, null) : null);
            if (result instanceof Result.Success) {
                x0Var5 = this.this$0._fileField;
                x0Var6 = this.this$0._fileField;
                ReconciliationActsDeclinerVO.AttachField attachField2 = (ReconciliationActsDeclinerVO.AttachField) x0Var6.getValue();
                if (attachField2 != null) {
                    Uri uri = this.$uri;
                    fileHelper3 = this.this$0.fileHelper;
                    r1 = ReconciliationActsDeclinerVO.AttachField.copy$default(attachField2, null, null, null, 0, null, new ReconciliationActsDeclinerVO.Status.Success(uri, fileHelper3.getFileName(this.$uri)), null, 95, null);
                }
                x0Var5.setValue(r1);
                ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel = this.this$0;
                String key = ((SingleDocumentResponseDTO) ((Result.Success) result).getValue()).getKey();
                reconciliationActsDeclinerViewModel.fileKey = key != null ? key : "";
            } else {
                x0Var3 = this.this$0._fileField;
                x0Var4 = this.this$0._fileField;
                ReconciliationActsDeclinerVO.AttachField attachField3 = (ReconciliationActsDeclinerVO.AttachField) x0Var4.getValue();
                x0Var3.setValue(attachField3 != null ? ReconciliationActsDeclinerVO.AttachField.copy$default(attachField3, null, null, null, 0, null, new ReconciliationActsDeclinerVO.Status.UnknownError(""), null, 95, null) : null);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewModel$uploadFile$newFile$1$1(ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel, Uri uri) {
        super(0);
        this.this$0 = reconciliationActsDeclinerViewModel;
        this.$uri = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        x0 x0Var;
        String str;
        x0Var = this.this$0._fileField;
        ReconciliationActsDeclinerVO.AttachField attachField = (ReconciliationActsDeclinerVO.AttachField) x0Var.getValue();
        if (attachField == null || (str = attachField.getName()) == null) {
            str = "reconciliationAct";
        }
        C10727i.c(androidx.lifecycle.x0.a(this.this$0), null, null, new AnonymousClass1(str, this.this$0, this.$uri, null), 3);
    }
}
