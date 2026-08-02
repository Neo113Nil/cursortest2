package zc;

import Ph.C1469p;
import android.content.Context;
import android.content.SharedPreferences;
import c.C2431a0;
import c.H;
import c.L;
import c.P;
import c.T;
import c.W;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.surt.guardian.utils.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import zc.AbstractC6956b;

/* renamed from: zc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6957c {

    /* renamed from: d, reason: collision with root package name */
    public static final C6955a f68668d = new C6955a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f68669a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f68670b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f68671c;

    public C6957c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68669a = context;
        this.f68670b = LazyKt.lazy(new H(this));
        this.f68671c = LazyKt.lazy(new L(this));
    }

    public final Object a(String str, Long l10, P p10) {
        Task<IntegrityTokenResponse> requestIntegrityToken;
        Task<IntegrityTokenResponse> addOnFailureListener;
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(p10), 1);
        c1469p.F();
        try {
            IntegrityTokenRequest.Builder nonce = IntegrityTokenRequest.builder().setNonce(StringsKt.replace$default(StringsKt.replace$default(str, '+', '-', false, 4, (Object) null), '/', '_', false, 4, (Object) null));
            if (l10 != null) {
                nonce.setCloudProjectNumber(l10.longValue());
            }
            IntegrityTokenRequest build = nonce.build();
            IntegrityManager integrityManager = (IntegrityManager) this.f68670b.getValue();
            if (integrityManager != null && (requestIntegrityToken = integrityManager.requestIntegrityToken(build)) != null) {
                final T t10 = new T(c1469p);
                Task<IntegrityTokenResponse> addOnSuccessListener = requestIntegrityToken.addOnSuccessListener(new OnSuccessListener(t10) { // from class: c.e0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Function1 f26551a;

                    {
                        Intrinsics.checkNotNullParameter(t10, "function");
                        this.f26551a = t10;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj) {
                        this.f26551a.invoke(obj);
                    }
                });
                if (addOnSuccessListener != null && (addOnFailureListener = addOnSuccessListener.addOnFailureListener(new W(c1469p))) != null) {
                    addOnFailureListener.addOnCanceledListener(new C2431a0(c1469p));
                }
            }
        } catch (Exception e10) {
            Result.Companion companion = Result.INSTANCE;
            c1469p.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(e10)));
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(p10);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Long l10, Continuation continuation) {
        P p10;
        int i10;
        C6957c c6957c;
        String str2 = str;
        try {
            if (continuation instanceof P) {
                p10 = (P) continuation;
                int i11 = p10.f26485r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    p10.f26485r = i11 - Integer.MIN_VALUE;
                    Object obj = p10.f26483p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = p10.f26485r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (((IntegrityManager) this.f68670b.getValue()) == null) {
                            Logger.f41582a.f("AttestationManager", "Play Integrity not available on this device");
                            return new AbstractC6956b.c("Play Services not available");
                        }
                        String string = ((SharedPreferences) this.f68671c.getValue()).getString("attestation_token_cache", null);
                        if (string != null) {
                            if (System.currentTimeMillis() - ((SharedPreferences) this.f68671c.getValue()).getLong("attestation_timestamp", 0L) <= 3600000 && Intrinsics.areEqual(((SharedPreferences) this.f68671c.getValue()).getString("attestation_nonce", null), str2)) {
                                Logger.f41582a.a("AttestationManager", "Using cached attestation token (matching nonce)");
                                return new AbstractC6956b.C0983b(string, ((SharedPreferences) this.f68671c.getValue()).getLong("attestation_timestamp", 0L), true);
                            }
                        }
                        Logger.f41582a.d("AttestationManager", "Requesting new Play Integrity token");
                        p10.f26481n = this;
                        p10.f26482o = str2;
                        p10.f26485r = 1;
                        obj = a(str2, l10, p10);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c6957c = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = p10.f26482o;
                        c6957c = p10.f26481n;
                        ResultKt.throwOnFailure(obj);
                    }
                    String str3 = (String) obj;
                    c6957c.d(str3, str2);
                    return new AbstractC6956b.C0983b(str3, System.currentTimeMillis(), false);
                }
            }
            if (i10 != 0) {
            }
            String str32 = (String) obj;
            c6957c.d(str32, str2);
            return new AbstractC6956b.C0983b(str32, System.currentTimeMillis(), false);
        } catch (Exception e10) {
            Logger.f41582a.b("AttestationManager", "Error requesting attestation", e10);
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new AbstractC6956b.a(message);
        }
        p10 = new P(this, continuation);
        Object obj2 = p10.f26483p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = p10.f26485r;
    }

    public final void c() {
        ((SharedPreferences) this.f68671c.getValue()).edit().remove("attestation_token_cache").remove("attestation_nonce").remove("attestation_timestamp").apply();
        Logger.f41582a.a("AttestationManager", "Attestation cache cleared");
    }

    public final void d(String str, String str2) {
        ((SharedPreferences) this.f68671c.getValue()).edit().putString("attestation_token_cache", str).putString("attestation_nonce", str2).putLong("attestation_timestamp", System.currentTimeMillis()).apply();
        Logger.f41582a.a("AttestationManager", "Attestation token cached");
    }

    public final boolean e() {
        return ((IntegrityManager) this.f68670b.getValue()) != null;
    }
}
