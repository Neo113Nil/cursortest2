package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleOrchestrator;
import com.socure.docv.capturesdk.feature.orchestrator.ModuleSubmission;
import com.socure.docv.capturesdk.feature.orchestrator.OnModuleSubmissionErrorUseCase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MultipartBody;

/* compiled from: UnstructuredDocPreviewFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$submitDocument$1", f = "UnstructuredDocPreviewFragment.kt", i = {1}, l = {334, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 344, 345}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class UnstructuredDocPreviewFragment$submitDocument$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrchestratorActivityComponent $component;
    final /* synthetic */ Uri $fileUri;
    Object L$0;
    int label;
    final /* synthetic */ UnstructuredDocPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnstructuredDocPreviewFragment$submitDocument$1(UnstructuredDocPreviewFragment unstructuredDocPreviewFragment, Uri uri, OrchestratorActivityComponent orchestratorActivityComponent, Continuation<? super UnstructuredDocPreviewFragment$submitDocument$1> continuation) {
        super(2, continuation);
        this.this$0 = unstructuredDocPreviewFragment;
        this.$fileUri = uri;
        this.$component = orchestratorActivityComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnstructuredDocPreviewFragment$submitDocument$1(this.this$0, this.$fileUri, this.$component, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnstructuredDocPreviewFragment$submitDocument$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        if (r9.$component.getOnModuleCompletedUseCase().invoke(r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r10.invoke(kotlin.Result.m13470constructorimpl(r1), r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$submitDocument$1.AnonymousClass1(r9.this$0, null), r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r10 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean isImage;
        Uri uri;
        MultipartBody.Part createMultipartBodyPart;
        Object mo11539onFinishedgIAlus;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            isImage = this.this$0.isImage(this.$fileUri);
            if (isImage) {
                uri = this.this$0.compressImage(this.$fileUri);
            } else {
                uri = this.$fileUri;
            }
            if (uri != null) {
                ModuleOrchestrator orchestratorModuleOrchestrator = this.$component.getOrchestratorModuleOrchestrator();
                createMultipartBodyPart = this.this$0.createMultipartBodyPart(uri);
                this.label = 1;
                mo11539onFinishedgIAlus = orchestratorModuleOrchestrator.mo11539onFinishedgIAlus(new ModuleSubmission.Unstructured(createMultipartBodyPart, null, 2, null), this);
            } else {
                FragmentActivity requireActivity = this.this$0.requireActivity();
                OrchestratorActivity orchestratorActivity = requireActivity instanceof OrchestratorActivity ? (OrchestratorActivity) requireActivity : null;
                if (orchestratorActivity != null) {
                    orchestratorActivity.backToCallerUnknown();
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            mo11539onFinishedgIAlus = ((Result) obj).getValue();
            obj2 = mo11539onFinishedgIAlus;
            this.L$0 = obj2;
            this.label = 2;
        } else if (i == 2) {
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            OnModuleSubmissionErrorUseCase onModuleSubmissionErrorUseCase = this.$component.getOnModuleSubmissionErrorUseCase();
            if (Result.m13477isSuccessimpl(obj2)) {
                Result.Companion companion = Result.INSTANCE;
                obj2 = Unit.INSTANCE;
            }
            this.L$0 = null;
            this.label = 3;
        } else if (i == 3) {
            ResultKt.throwOnFailure(obj);
            this.label = 4;
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UnstructuredDocPreviewFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$submitDocument$1$1", f = "UnstructuredDocPreviewFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$submitDocument$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UnstructuredDocPreviewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UnstructuredDocPreviewFragment unstructuredDocPreviewFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unstructuredDocPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AlertDialog alertDialog;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                alertDialog = this.this$0.progressDialog;
                if (alertDialog == null) {
                    return null;
                }
                alertDialog.dismiss();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
