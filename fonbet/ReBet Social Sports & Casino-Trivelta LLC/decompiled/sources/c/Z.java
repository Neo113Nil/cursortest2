package c;

import Ph.C1469p;
import ai.verisoul.sdk.Verisoul;
import ai.verisoul.sdk.VerisoulEnvironment;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.surt.guardian.core.Configuration;
import com.surt.guardian.utils.Logger;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: c, reason: collision with root package name */
    public static final Cc.e f26509c = new Cc.e(null);

    /* renamed from: d, reason: collision with root package name */
    public static volatile Z f26510d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f26511a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26512b;

    public Z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26511a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        O o10;
        int i10;
        try {
            if (continuation instanceof O) {
                o10 = (O) continuation;
                int i11 = o10.f26479p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    o10.f26479p = i11 - Integer.MIN_VALUE;
                    Object obj = o10.f26477n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = o10.f26479p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!this.f26512b) {
                            Logger.f41582a.f("VerisoulModule", "Verisoul not initialized, cannot get session ID");
                            return null;
                        }
                        o10.f26479p = 1;
                        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(o10), 1);
                        c1469p.F();
                        Verisoul.INSTANCE.getSessionId(new S(c1469p));
                        new Handler(Looper.getMainLooper()).postDelayed(new V(c1469p), 5000L);
                        obj = c1469p.z();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(o10);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (String) obj;
                }
            }
            if (i10 != 0) {
            }
            return (String) obj;
        } catch (Exception e10) {
            Logger.f41582a.b("VerisoulModule", "Error getting Verisoul session ID: " + e10.getMessage(), e10);
            return null;
        }
        o10 = new O(this, continuation);
        Object obj2 = o10.f26477n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = o10.f26479p;
    }

    public final void b() {
        if (!this.f26512b) {
            Logger.f41582a.f("VerisoulModule", "Verisoul not initialized, cannot reinitialize");
            return;
        }
        try {
            Verisoul.INSTANCE.reinitialize();
            Logger.f41582a.d("VerisoulModule", "Verisoul session reinitialized");
        } catch (Exception e10) {
            Logger.f41582a.b("VerisoulModule", "Error reinitializing Verisoul: " + e10.getMessage(), e10);
        }
    }

    public final void c(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String verisoulProjectId = configuration.getVerisoulProjectId();
        if (verisoulProjectId == null || StringsKt.isBlank(verisoulProjectId)) {
            Logger.f41582a.f("VerisoulModule", "Verisoul SDK not initialized - no project ID provided");
            return;
        }
        try {
            Verisoul.INSTANCE.init(this.f26511a, VerisoulEnvironment.Prod.INSTANCE, verisoulProjectId, false);
            this.f26512b = true;
            Logger.f41582a.d("VerisoulModule", "Verisoul SDK initialized (project: " + StringsKt.take(verisoulProjectId, 8) + "..., env: Prod)");
        } catch (Exception e10) {
            Logger.f41582a.b("VerisoulModule", "Failed to initialize Verisoul SDK: " + e10.getMessage(), e10);
            this.f26512b = false;
        }
    }
}
