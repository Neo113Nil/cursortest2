package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4077a = 0;

    static {
        int i5 = s0.R;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + StringUtils.PROCESS_POSTFIX_DELIMITER + message;
            int i5 = p1.f5547a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static q4 b(int i5, int i10, k kVar) {
        try {
            p4 r5 = q4.r();
            t4 r6 = u4.r();
            r6.f(kVar.f4037a);
            String str = kVar.f4038b;
            r6.e();
            u4.o((u4) r6.f5450b, str);
            r6.g(i5);
            r5.f(r6);
            r5.g(i10);
            return (q4) r5.b();
        } catch (Exception e7) {
            p1.h("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }

    public static q4 c(int i5, int i10, k kVar, String str) {
        try {
            t4 r5 = u4.r();
            r5.f(kVar.f4037a);
            String str2 = kVar.f4038b;
            r5.e();
            u4.o((u4) r5.f5450b, str2);
            r5.g(i5);
            if (str != null) {
                r5.e();
                u4.n((u4) r5.f5450b, str);
            }
            p4 r6 = q4.r();
            r6.f(r5);
            r6.g(i10);
            return (q4) r6.b();
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static s4 d(int i5) {
        try {
            r4 q = s4.q();
            q.e();
            s4.p((s4) q.f5450b, i5);
            return (s4) q.b();
        } catch (Exception e7) {
            p1.h("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }
}
