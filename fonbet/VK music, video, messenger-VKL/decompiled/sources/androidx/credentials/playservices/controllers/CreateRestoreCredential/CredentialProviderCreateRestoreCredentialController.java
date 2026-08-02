package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreateRestoreCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cqi;
import xsna.elx;
import xsna.f5o0;
import xsna.glx;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.znk0;

/* compiled from: CredentialProviderCreateRestoreCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<CreateRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest, CreateRestoreCredentialResponse, CreateCredentialResponse, CreateCredentialException> {
    private final Context context;

    public CredentialProviderCreateRestoreCredentialController(Context context) {
        super(context);
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, androidx.credentials.exceptions.restorecredential.E2eeUnavailableException] */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new CreateCredentialUnknownException(cqi.b(exc, new StringBuilder("Create restore credential failed for unknown reason, failure: ")));
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            switch (apiException.g()) {
                case 40201:
                    ref$ObjectRef.element = new CreateCredentialUnknownException(cqi.b(exc, new StringBuilder("The restore credential internal service had a failure, failure: ")));
                    break;
                case 40202:
                    ref$ObjectRef.element = new CreateRestoreCredentialDomException(new DataError(), cqi.b(exc, new StringBuilder("The request did not match the fido spec, failure: ")));
                    break;
                case 40203:
                    ref$ObjectRef.element = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.");
                    break;
                default:
                    ref$ObjectRef.element = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + apiException.g());
                    break;
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1(executor, credentialManagerCallback, ref$ObjectRef));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest convertRequestToPlayServices(CreateRestoreCredentialRequest createRestoreCredentialRequest) {
        return new com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest(createRestoreCredentialRequest.getCredentialData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateCredentialResponse convertResponseToCredentialManager(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
        return androidx.credentials.CreateRestoreCredentialResponse.Companion.createFrom(createRestoreCredentialResponse.b);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(CreateRestoreCredentialRequest createRestoreCredentialRequest, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest convertRequestToPlayServices = convertRequestToPlayServices(createRestoreCredentialRequest);
        glx x = znk0.x(this.context);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zzj};
        elx elxVar = new elx();
        elxVar.b = convertRequestToPlayServices;
        a.a = elxVar;
        a.e = 1693;
        Task<TResult> doRead = x.doRead(a.a());
        final izs<CreateRestoreCredentialResponse, s3q0> izsVar = new izs<CreateRestoreCredentialResponse, s3q0>() { // from class: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1

            /* compiled from: CredentialProviderCreateRestoreCredentialController.kt */
            /* renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends Lambda implements gzs<s3q0> {
                final /* synthetic */ CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> $callback;
                final /* synthetic */ Executor $executor;
                final /* synthetic */ CreateCredentialResponse $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, CreateCredentialResponse createCredentialResponse) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = credentialManagerCallback;
                    this.$response = createCredentialResponse;
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Executor executor = this.$executor;
                    final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = this.$callback;
                    final CreateCredentialResponse createCredentialResponse = this.$response;
                    executor.execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE 
                          (r0v0 'executor' java.util.concurrent.Executor)
                          (wrap:java.lang.Runnable:0x0008: CONSTRUCTOR 
                          (r1v0 'credentialManagerCallback' androidx.credentials.CredentialManagerCallback<androidx.credentials.CreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException> A[DONT_INLINE])
                          (r2v0 'createCredentialResponse' androidx.credentials.CreateCredentialResponse A[DONT_INLINE])
                         A[MD:(androidx.credentials.CredentialManagerCallback, androidx.credentials.CreateCredentialResponse):void (m), WRAPPED] call: androidx.credentials.playservices.controllers.CreateRestoreCredential.a.<init>(androidx.credentials.CredentialManagerCallback, androidx.credentials.CreateCredentialResponse):void type: CONSTRUCTOR)
                         INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (c)] in method: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1.1.invoke():void, file: classes12.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.credentials.playservices.controllers.CreateRestoreCredential.a, state: NOT_LOADED
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
                        androidx.credentials.CredentialManagerCallback<androidx.credentials.CreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException> r1 = r4.$callback
                        androidx.credentials.CreateCredentialResponse r2 = r4.$response
                        androidx.credentials.playservices.controllers.CreateRestoreCredential.a r3 = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a
                        r3.<init>(r1, r2)
                        r0.execute(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1.AnonymousClass1.invoke2():void");
                }
            }

            /* compiled from: CredentialProviderCreateRestoreCredentialController.kt */
            /* renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements gzs<s3q0> {
                final /* synthetic */ CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> $callback;
                final /* synthetic */ Exception $e;
                final /* synthetic */ Executor $executor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback, Exception exc) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = credentialManagerCallback;
                    this.$e = exc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(CredentialManagerCallback credentialManagerCallback, Exception exc) {
                    credentialManagerCallback.onError(new CreateCredentialUnknownException(exc.getMessage()));
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Executor executor = this.$executor;
                    final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback = this.$callback;
                    final Exception exc = this.$e;
                    executor.execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE 
                          (r0v0 'executor' java.util.concurrent.Executor)
                          (wrap:java.lang.Runnable:0x0008: CONSTRUCTOR 
                          (r1v0 'credentialManagerCallback' androidx.credentials.CredentialManagerCallback<androidx.credentials.CreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException> A[DONT_INLINE])
                          (r2v0 'exc' java.lang.Exception A[DONT_INLINE])
                         A[MD:(androidx.credentials.CredentialManagerCallback, java.lang.Exception):void (m), WRAPPED] call: androidx.credentials.playservices.controllers.CreateRestoreCredential.b.<init>(androidx.credentials.CredentialManagerCallback, java.lang.Exception):void type: CONSTRUCTOR)
                         INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (c)] in method: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1.2.invoke():void, file: classes12.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.credentials.playservices.controllers.CreateRestoreCredential.b, state: NOT_LOADED
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
                        androidx.credentials.CredentialManagerCallback<androidx.credentials.CreateCredentialResponse, androidx.credentials.exceptions.CreateCredentialException> r1 = r4.$callback
                        java.lang.Exception r2 = r4.$e
                        androidx.credentials.playservices.controllers.CreateRestoreCredential.b r3 = new androidx.credentials.playservices.controllers.CreateRestoreCredential.b
                        r3.<init>(r1, r2)
                        r0.execute(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1.AnonymousClass2.invoke2():void");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
                invoke2(createRestoreCredentialResponse);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
                try {
                    CreateCredentialResponse convertResponseToCredentialManager = CredentialProviderCreateRestoreCredentialController.this.convertResponseToCredentialManager(createRestoreCredentialResponse);
                    CredentialProviderController.Companion companion = CredentialProviderController.Companion;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, credentialManagerCallback, convertResponseToCredentialManager));
                } catch (Exception e) {
                    CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(executor, credentialManagerCallback, e));
                }
            }
        };
        doRead.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.fdk
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                izs.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.gdk
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$1(cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }
}
