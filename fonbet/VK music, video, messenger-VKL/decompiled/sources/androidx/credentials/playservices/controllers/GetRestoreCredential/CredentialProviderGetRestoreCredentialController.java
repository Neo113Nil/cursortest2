package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetRestoreCredentialOption;
import androidx.credentials.RestoreCredential;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cqi;
import xsna.f5o0;
import xsna.flx;
import xsna.glx;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.znk0;

/* compiled from: CredentialProviderGetRestoreCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<GetCredentialRequest, GetRestoreCredentialRequest, GetRestoreCredentialResponse, GetCredentialResponse, GetCredentialException> {
    private final Context context;

    public CredentialProviderGetRestoreCredentialController(Context context) {
        super(context);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new GetCredentialUnknownException(cqi.b(exc, new StringBuilder("Get restore credential failed for unknown reason, failure: ")));
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            if (apiException.g() == 40201) {
                ref$ObjectRef.element = new GetCredentialUnknownException(cqi.b(exc, new StringBuilder("The restore credential internal service had a failure, failure: ")));
            } else {
                ref$ObjectRef.element = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + apiException.g());
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(executor, credentialManagerCallback, ref$ObjectRef));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetRestoreCredentialRequest convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) {
        GetRestoreCredentialOption getRestoreCredentialOption;
        Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                getRestoreCredentialOption = null;
                break;
            }
            CredentialOption next = it.next();
            if (next instanceof GetRestoreCredentialOption) {
                getRestoreCredentialOption = (GetRestoreCredentialOption) next;
                break;
            }
        }
        return new GetRestoreCredentialRequest((getRestoreCredentialOption != null ? getRestoreCredentialOption : null).getRequestData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialResponse convertResponseToCredentialManager(GetRestoreCredentialResponse getRestoreCredentialResponse) {
        return new GetCredentialResponse(Credential.Companion.createFrom(RestoreCredential.TYPE_RESTORE_CREDENTIAL, getRestoreCredentialResponse.b));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(GetCredentialRequest getCredentialRequest, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        GetRestoreCredentialRequest convertRequestToPlayServices = convertRequestToPlayServices(getCredentialRequest);
        glx x = znk0.x(this.context);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zzk};
        flx flxVar = new flx();
        flxVar.b = convertRequestToPlayServices;
        a.a = flxVar;
        a.e = 1695;
        Task<TResult> doRead = x.doRead(a.a());
        final izs<GetRestoreCredentialResponse, s3q0> izsVar = new izs<GetRestoreCredentialResponse, s3q0>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1

            /* compiled from: CredentialProviderGetRestoreCredentialController.kt */
            /* renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends Lambda implements gzs<s3q0> {
                final /* synthetic */ CredentialManagerCallback<GetCredentialResponse, GetCredentialException> $callback;
                final /* synthetic */ Executor $executor;
                final /* synthetic */ GetCredentialResponse $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, GetCredentialResponse getCredentialResponse) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = credentialManagerCallback;
                    this.$response = getCredentialResponse;
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Executor executor = this.$executor;
                    final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.$callback;
                    final GetCredentialResponse getCredentialResponse = this.$response;
                    executor.execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE 
                          (r0v0 'executor' java.util.concurrent.Executor)
                          (wrap:java.lang.Runnable:0x0008: CONSTRUCTOR 
                          (r1v0 'credentialManagerCallback' androidx.credentials.CredentialManagerCallback<androidx.credentials.GetCredentialResponse, androidx.credentials.exceptions.GetCredentialException> A[DONT_INLINE])
                          (r2v0 'getCredentialResponse' androidx.credentials.GetCredentialResponse A[DONT_INLINE])
                         A[MD:(androidx.credentials.CredentialManagerCallback, androidx.credentials.GetCredentialResponse):void (m), WRAPPED] call: androidx.credentials.playservices.controllers.GetRestoreCredential.f.<init>(androidx.credentials.CredentialManagerCallback, androidx.credentials.GetCredentialResponse):void type: CONSTRUCTOR)
                         INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (c)] in method: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1.1.invoke():void, file: classes12.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.credentials.playservices.controllers.GetRestoreCredential.f, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.util.concurrent.Executor r0 = r4.$executor
                        androidx.credentials.CredentialManagerCallback<androidx.credentials.GetCredentialResponse, androidx.credentials.exceptions.GetCredentialException> r1 = r4.$callback
                        androidx.credentials.GetCredentialResponse r2 = r4.$response
                        androidx.credentials.playservices.controllers.GetRestoreCredential.f r3 = new androidx.credentials.playservices.controllers.GetRestoreCredential.f
                        r3.<init>(r1, r2)
                        r0.execute(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1.AnonymousClass1.invoke2():void");
                }
            }

            /* compiled from: CredentialProviderGetRestoreCredentialController.kt */
            /* renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements gzs<s3q0> {
                final /* synthetic */ CredentialManagerCallback<GetCredentialResponse, GetCredentialException> $callback;
                final /* synthetic */ Exception $e;
                final /* synthetic */ Executor $executor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback, Exception exc) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = credentialManagerCallback;
                    this.$e = exc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
                    credentialManagerCallback.onError(exc instanceof NoCredentialException ? (GetCredentialException) exc : new GetCredentialUnknownException(exc.getMessage()));
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Executor executor = this.$executor;
                    final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.$callback;
                    final Exception exc = this.$e;
                    executor.execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE 
                          (r0v0 'executor' java.util.concurrent.Executor)
                          (wrap:java.lang.Runnable:0x0008: CONSTRUCTOR 
                          (r1v0 'credentialManagerCallback' androidx.credentials.CredentialManagerCallback<androidx.credentials.GetCredentialResponse, androidx.credentials.exceptions.GetCredentialException> A[DONT_INLINE])
                          (r2v0 'exc' java.lang.Exception A[DONT_INLINE])
                         A[MD:(androidx.credentials.CredentialManagerCallback, java.lang.Exception):void (m), WRAPPED] call: androidx.credentials.playservices.controllers.GetRestoreCredential.g.<init>(androidx.credentials.CredentialManagerCallback, java.lang.Exception):void type: CONSTRUCTOR)
                         INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (c)] in method: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1.2.invoke():void, file: classes12.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.credentials.playservices.controllers.GetRestoreCredential.g, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.util.concurrent.Executor r0 = r4.$executor
                        androidx.credentials.CredentialManagerCallback<androidx.credentials.GetCredentialResponse, androidx.credentials.exceptions.GetCredentialException> r1 = r4.$callback
                        java.lang.Exception r2 = r4.$e
                        androidx.credentials.playservices.controllers.GetRestoreCredential.g r3 = new androidx.credentials.playservices.controllers.GetRestoreCredential.g
                        r3.<init>(r1, r2)
                        r0.execute(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1.AnonymousClass2.invoke2():void");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(GetRestoreCredentialResponse getRestoreCredentialResponse) {
                invoke2(getRestoreCredentialResponse);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GetRestoreCredentialResponse getRestoreCredentialResponse) {
                try {
                    GetCredentialResponse convertResponseToCredentialManager = CredentialProviderGetRestoreCredentialController.this.convertResponseToCredentialManager(getRestoreCredentialResponse);
                    CredentialProviderController.Companion companion = CredentialProviderController.Companion;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, credentialManagerCallback, convertResponseToCredentialManager));
                } catch (Exception e) {
                    CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(executor, credentialManagerCallback, e));
                }
            }
        };
        doRead.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.jdk
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                izs.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.kdk
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$1(cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }
}
