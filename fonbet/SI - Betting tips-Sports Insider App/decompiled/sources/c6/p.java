package c6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzt;
import g6.s;
import g6.t;
import g6.u;
import g6.v;
import io.sentry.android.core.w0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final k f3685a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f3686b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile u f3687c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f3688d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f3689e;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        new k(0, "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset));
        new k(1, "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset));
        new k(2, "0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset));
        new k(3, "0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset));
        f3685a = new k(4, "0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset));
        f3686b = new k(5, "0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset));
        f3688d = new Object();
    }

    public static synchronized void a(Context context) {
        synchronized (p.class) {
            if (f3689e != null) {
                w0.m("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f3689e = context.getApplicationContext();
            }
        }
    }

    public static void b() {
        u sVar;
        if (f3687c != null) {
            return;
        }
        v.h(f3689e);
        synchronized (f3688d) {
            try {
                if (f3687c == null) {
                    IBinder b10 = u6.f.c(f3689e, u6.f.f24056d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i5 = t.f9871f;
                    if (b10 == null) {
                        sVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        sVar = queryLocalInterface instanceof u ? (u) queryLocalInterface : new s(b10, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 4);
                    }
                    f3687c = sVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static r c(String str, m mVar, boolean z5, boolean z7) {
        try {
            b();
            v.h(f3689e);
            zzt zztVar = new zzt(str, mVar, z5, z7);
            try {
                u uVar = f3687c;
                t6.b bVar = new t6.b(f3689e.getPackageManager());
                s sVar = (s) uVar;
                Parcel O = sVar.O();
                int i5 = j7.g.f18276a;
                boolean z10 = true;
                O.writeInt(1);
                zztVar.writeToParcel(O, 0);
                j7.g.b(O, bVar);
                Parcel f6 = sVar.f(O, 5);
                if (f6.readInt() == 0) {
                    z10 = false;
                }
                f6.recycle();
                return z10 ? r.f3691d : new q(new n(z5, str, mVar));
            } catch (RemoteException e7) {
                w0.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return r.c("module call", e7);
            }
        } catch (u6.b e9) {
            w0.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return r.c("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }
}
