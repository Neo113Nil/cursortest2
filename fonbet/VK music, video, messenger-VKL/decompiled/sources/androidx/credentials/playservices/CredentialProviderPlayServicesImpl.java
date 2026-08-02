package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreateRestoreCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.CredentialProvider;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.GetRestoreCredentialOption;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dut;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.qjg;
import xsna.s3q0;
import xsna.zcl;
import xsna.znk0;

/* compiled from: CredentialProviderPlayServicesImpl.kt */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements CredentialProvider {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();

    /* compiled from: CredentialProviderPlayServicesImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            return cancellationSignal != null && cancellationSignal.isCanceled();
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, gzs<s3q0> gzsVar) {
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            gzsVar.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(GetCredentialRequest getCredentialRequest) {
            Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetDigitalCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(GetCredentialRequest getCredentialRequest) {
            Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GetRestoreCredentialOption) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(GetCredentialRequest getCredentialRequest) {
            Iterator<CredentialOption> it = getCredentialRequest.getCredentialOptions().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof dut) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        this.context = context;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.c(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, androidx.credentials.exceptions.ClearCredentialUnknownException] */
    public static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).g() == 40201) {
            ref$ObjectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$3$1(executor, credentialManagerCallback, ref$ObjectRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$5$1$1(exc, executor, credentialManagerCallback));
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // androidx.credentials.CredentialProvider
    public void onClearCredential(ClearCredentialStateRequest clearCredentialStateRequest, final CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (!epx.f(clearCredentialStateRequest.getRequestType(), ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            Task<Void> signOut = qjg.c(this.context).signOut();
            final izs<Void, s3q0> izsVar = new izs<Void, s3q0>() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4

                /* compiled from: CredentialProviderPlayServicesImpl.kt */
                /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4$1, reason: invalid class name */
                public static final class AnonymousClass1 extends Lambda implements gzs<s3q0> {
                    final /* synthetic */ CredentialManagerCallback<Void, ClearCredentialException> $callback;
                    final /* synthetic */ Executor $executor;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
                        super(0);
                        this.$executor = executor;
                        this.$callback = credentialManagerCallback;
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Executor executor = this.$executor;
                        final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback = this.$callback;
                        executor.execute(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE 
                              (r0v0 'executor' java.util.concurrent.Executor)
                              (wrap:java.lang.Runnable:0x0006: CONSTRUCTOR 
                              (r1v0 'credentialManagerCallback' androidx.credentials.CredentialManagerCallback<java.lang.Void, androidx.credentials.exceptions.ClearCredentialException> A[DONT_INLINE])
                             A[MD:(androidx.credentials.CredentialManagerCallback):void (m), WRAPPED] call: androidx.credentials.playservices.d.<init>(androidx.credentials.CredentialManagerCallback):void type: CONSTRUCTOR)
                             INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (c)] in method: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4.1.invoke():void, file: classes12.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.credentials.playservices.d, state: NOT_LOADED
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
                            java.util.concurrent.Executor r0 = r3.$executor
                            androidx.credentials.CredentialManagerCallback<java.lang.Void, androidx.credentials.exceptions.ClearCredentialException> r1 = r3.$callback
                            androidx.credentials.playservices.d r2 = new androidx.credentials.playservices.d
                            r2.<init>(r1)
                            r0.execute(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4.AnonymousClass1.invoke2():void");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Void r1) {
                    invoke2(r1);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Void r5) {
                    CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass1(executor, credentialManagerCallback));
                }
            };
            signOut.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.ndk
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    izs.this.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: xsna.odk
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, credentialManagerCallback, exc);
                }
            });
        } else {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$1(executor, credentialManagerCallback));
                return;
            }
            Task<Boolean> a = znk0.x(this.context).a(new ClearRestoreCredentialRequest(clearCredentialStateRequest.getRequestBundle()));
            final izs<Boolean, s3q0> izsVar2 = new izs<Boolean, s3q0>() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2

                /* compiled from: CredentialProviderPlayServicesImpl.kt */
                /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends Lambda implements gzs<s3q0> {
                    final /* synthetic */ CredentialManagerCallback<Void, ClearCredentialException> $callback;
                    final /* synthetic */ Executor $executor;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
                        super(0);
                        this.$executor = executor;
                        this.$callback = credentialManagerCallback;
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Executor executor = this.$executor;
                        final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback = this.$callback;
                        executor.execute(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE 
                              (r0v0 'executor' java.util.concurrent.Executor)
                              (wrap:java.lang.Runnable:0x0006: CONSTRUCTOR 
                              (r1v0 'credentialManagerCallback' androidx.credentials.CredentialManagerCallback<java.lang.Void, androidx.credentials.exceptions.ClearCredentialException> A[DONT_INLINE])
                             A[MD:(androidx.credentials.CredentialManagerCallback):void (m), WRAPPED] call: androidx.credentials.playservices.b.<init>(androidx.credentials.CredentialManagerCallback):void type: CONSTRUCTOR)
                             INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (c)] in method: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2.1.invoke():void, file: classes12.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.credentials.playservices.b, state: NOT_LOADED
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
                            java.util.concurrent.Executor r0 = r3.$executor
                            androidx.credentials.CredentialManagerCallback<java.lang.Void, androidx.credentials.exceptions.ClearCredentialException> r1 = r3.$callback
                            androidx.credentials.playservices.b r2 = new androidx.credentials.playservices.b
                            r2.<init>(r1)
                            r0.execute(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2.AnonymousClass1.invoke2():void");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                    invoke2(bool);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Boolean bool) {
                    CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass1(executor, credentialManagerCallback));
                }
            };
            a.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.ldk
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    izs.this.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: xsna.mdk
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, credentialManagerCallback, exc);
                }
            });
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (createCredentialRequest instanceof CreatePasswordRequest) {
            CredentialProviderCreatePasswordController.Companion.getInstance(context).invokePlayServices((CreatePasswordRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
            return;
        }
        if (createCredentialRequest instanceof CreatePublicKeyCredentialRequest) {
            CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((CreatePublicKeyCredentialRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        } else {
            if (!(createCredentialRequest instanceof CreateRestoreCredentialRequest)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((CreateRestoreCredentialRequest) createCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onCreateCredential$1(executor, credentialManagerCallback));
            }
        }
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(getCredentialRequest)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onGetCredential$1(executor, credentialManagerCallback));
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(getCredentialRequest)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onGetCredential$3(executor, credentialManagerCallback));
                return;
            }
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(getCredentialRequest)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(getCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
        }
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        this.googleApiAvailability = googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int i) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            new ConnectionResult(isGooglePlayServicesAvailable).toString();
        }
        return z;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }
}
