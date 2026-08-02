package r7;

import android.app.ActivityManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.widget.c1;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.m;
import c4.p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.sports.insider.data.sdk.advertising.InstallReceiver;
import d7.f;
import e6.k;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import k7.j;
import k7.k1;
import k7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oi.s0;
import s4.b;
import s7.e2;
import s7.f1;
import s7.f3;
import s7.l0;
import s7.n0;
import s7.n1;
import s7.p1;
import s7.q1;
import s7.u3;
import s7.v0;
import s7.z0;
import t2.d;
import w7.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements b, u3, s2.b, v3.b, k, InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22317a;

    /* renamed from: b, reason: collision with root package name */
    public Object f22318b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f22317a = i5;
        this.f22318b = obj;
    }

    public static a n(String str) {
        return new a(4, (TextUtils.isEmpty(str) || str.length() > 1) ? n1.UNINITIALIZED : q1.e(str.charAt(0)));
    }

    @Override // s7.u3
    public void a(String str, String str2, Bundle bundle) {
        e2 e2Var = (e2) this.f22318b;
        if (!TextUtils.isEmpty(str)) {
            e2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((f1) e2Var.f3328a).f22749k.getClass();
        e2Var.o("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        f fVar = new f(1, (g) obj2);
        l1 l1Var = (l1) ((k1) obj).m();
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) this.f22318b;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(l1Var.f18894f);
        int i5 = j.f18882a;
        obtain.writeStrongBinder(fVar);
        obtain.writeInt(1);
        publicKeyCredentialCreationOptions.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            l1Var.f18893a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // s4.b
    public void b(m mVar) {
        switch (this.f22317a) {
            case 1:
                re.k.b((re.k) this.f22318b, mVar);
                break;
        }
    }

    @Override // s2.b
    public s2.a c(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        d dVar = (d) this.f22318b;
        String databaseName = dVar.getDatabaseName();
        if (databaseName == null) {
            if (!Intrinsics.areEqual(fileName, ":memory:")) {
                throw new IllegalArgumentException(c1.n("This driver is configured to open an in-memory database but a file-based named '", fileName, "' was requested.").toString());
            }
        } else if (!Intrinsics.areEqual(databaseName, fileName) && !Intrinsics.areEqual(StringsKt.V('/', databaseName, databaseName), StringsKt.V('/', fileName, fileName))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + dVar.getDatabaseName() + "' but '" + fileName + "' was requested.").toString());
        }
        return new v2.a(dVar.Q());
    }

    @Override // s4.b
    public void d(m mVar) {
        switch (this.f22317a) {
            case 1:
                re.k.b((re.k) this.f22318b, mVar);
                break;
        }
    }

    @Override // s2.b
    public boolean e() {
        return true;
    }

    @Override // s4.b
    public void f(m result) {
        switch (this.f22317a) {
            case 1:
                re.k.b((re.k) this.f22318b, result);
                break;
            default:
                Intrinsics.checkNotNullParameter(result, "result");
                ConstraintLayout constraintLayout = (ConstraintLayout) this.f22318b;
                Resources resources = constraintLayout.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                constraintLayout.setBackground(p.b(result, resources));
                break;
        }
    }

    public Object g(qg.g descriptor, ug.k key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) ((ConcurrentHashMap) this.f22318b).get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // v3.b
    public v3.a getMsg4xx() {
        return null;
    }

    @Override // v3.b
    public s0 getResponse() {
        return (s0) this.f22318b;
    }

    public void j() {
        f3 f3Var = (f3) this.f22318b;
        f3Var.j();
        f1 f1Var = (f1) f3Var.f3328a;
        v0 v0Var = f1Var.f22744e;
        f1.k(v0Var);
        q6.a aVar = f1Var.f22749k;
        aVar.getClass();
        if (v0Var.t(System.currentTimeMillis())) {
            v0 v0Var2 = f1Var.f22744e;
            f1.k(v0Var2);
            v0Var2.f23132l.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22910n.a("Detected application was in foreground");
                aVar.getClass();
                o(System.currentTimeMillis());
            }
        }
    }

    public void k(int i5, String str, List list, boolean z5, boolean z7) {
        l0 l0Var;
        z0 z0Var = (z0) this.f22318b;
        int i10 = i5 - 1;
        if (i10 == 0) {
            n0 n0Var = ((f1) z0Var.f3328a).f22745f;
            f1.m(n0Var);
            l0Var = n0Var.f22909m;
        } else if (i10 != 1) {
            if (i10 == 3) {
                n0 n0Var2 = ((f1) z0Var.f3328a).f22745f;
                f1.m(n0Var2);
                l0Var = n0Var2.f22910n;
            } else if (i10 != 4) {
                n0 n0Var3 = ((f1) z0Var.f3328a).f22745f;
                f1.m(n0Var3);
                l0Var = n0Var3.f22908l;
            } else if (z5) {
                n0 n0Var4 = ((f1) z0Var.f3328a).f22745f;
                f1.m(n0Var4);
                l0Var = n0Var4.j;
            } else if (z7) {
                n0 n0Var5 = ((f1) z0Var.f3328a).f22745f;
                f1.m(n0Var5);
                l0Var = n0Var5.f22906i;
            } else {
                n0 n0Var6 = ((f1) z0Var.f3328a).f22745f;
                f1.m(n0Var6);
                l0Var = n0Var6.f22907k;
            }
        } else if (z5) {
            n0 n0Var7 = ((f1) z0Var.f3328a).f22745f;
            f1.m(n0Var7);
            l0Var = n0Var7.f22904g;
        } else if (z7) {
            n0 n0Var8 = ((f1) z0Var.f3328a).f22745f;
            f1.m(n0Var8);
            l0Var = n0Var8.f22903f;
        } else {
            n0 n0Var9 = ((f1) z0Var.f3328a).f22745f;
            f1.m(n0Var9);
            l0Var = n0Var9.f22905h;
        }
        int size = list.size();
        if (size == 1) {
            l0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            l0Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            l0Var.a(str);
        } else {
            l0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void l(long j) {
        f3 f3Var = (f3) this.f22318b;
        f3Var.j();
        f3Var.n();
        f1 f1Var = (f1) f3Var.f3328a;
        v0 v0Var = f1Var.f22744e;
        f1.k(v0Var);
        if (v0Var.t(j)) {
            f1.k(v0Var);
            v0Var.f23132l.b(true);
            f1Var.r().o();
        }
        f1.k(v0Var);
        v0Var.f23136p.b(j);
        if (v0Var.f23132l.a()) {
            o(j);
        }
    }

    public void m(p1 p1Var, int i5) {
        s7.f fVar;
        if (i5 != -30) {
            if (i5 != -20) {
                if (i5 == -10) {
                    fVar = s7.f.MANIFEST;
                } else if (i5 != 0) {
                    fVar = i5 != 30 ? s7.f.UNSET : s7.f.INITIALIZATION;
                }
            }
            fVar = s7.f.API;
        } else {
            fVar = s7.f.TCF;
        }
        ((EnumMap) this.f22318b).put((EnumMap) p1Var, (p1) fVar);
    }

    public void o(long j) {
        f3 f3Var = (f3) this.f22318b;
        f3Var.j();
        f1 f1Var = (f1) f3Var.f3328a;
        if (f1Var.d()) {
            v0 v0Var = f1Var.f22744e;
            f1.k(v0Var);
            v0Var.f23136p.b(j);
            f1Var.f22749k.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j6 = j / 1000;
            Long valueOf = Long.valueOf(j6);
            e2 e2Var = f1Var.f22751m;
            f1.l(e2Var);
            e2Var.u(j, valueOf, "auto", "_sid");
            f1.k(v0Var);
            v0Var.q.b(j6);
            v0Var.f23132l.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j6);
            f1.l(e2Var);
            e2Var.r(j, bundle, "auto", "_s");
            String h10 = v0Var.f23141v.h();
            if (TextUtils.isEmpty(h10)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", h10);
            f1.l(e2Var);
            e2Var.r(j, bundle2, "auto", "_ssr");
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        InstallReceiver installReceiver = (InstallReceiver) this.f22318b;
        InstallReferrerClient installReferrerClient = installReceiver.f6875a;
        if (installReferrerClient != null) {
            installReferrerClient.endConnection();
        }
        installReceiver.f6875a = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
    
        if (r4 != 4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onInstallReferrerSetupFinished(int i5) {
        InstallReferrerClient installReferrerClient;
        InstallReceiver installReceiver = (InstallReceiver) this.f22318b;
        try {
            try {
                if (i5 != -1) {
                    if (i5 == 0) {
                        InstallReferrerClient installReferrerClient2 = installReceiver.f6875a;
                        if (installReferrerClient2 != null) {
                            installReferrerClient2.getInstallReferrer();
                        }
                        installReferrerClient = installReceiver.f6875a;
                        if (installReferrerClient != null) {
                            installReferrerClient.endConnection();
                        }
                        installReceiver.f6875a = null;
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                            }
                        }
                    }
                }
                int i10 = InstallReceiver.f6874b;
                installReferrerClient = installReceiver.f6875a;
                if (installReferrerClient != null) {
                }
                installReceiver.f6875a = null;
            } catch (Exception e7) {
                e7.printStackTrace();
                InstallReferrerClient installReferrerClient3 = installReceiver.f6875a;
                if (installReferrerClient3 != null) {
                    installReferrerClient3.endConnection();
                }
                installReceiver.f6875a = null;
            }
        } catch (Throwable th2) {
            InstallReferrerClient installReferrerClient4 = installReceiver.f6875a;
            if (installReferrerClient4 != null) {
                installReferrerClient4.endConnection();
            }
            installReceiver.f6875a = null;
            throw th2;
        }
    }

    public void p(p1 p1Var, s7.f fVar) {
        ((EnumMap) this.f22318b).put((EnumMap) p1Var, (p1) fVar);
    }

    public String toString() {
        switch (this.f22317a) {
            case 3:
                StringBuilder sb2 = new StringBuilder("1");
                for (p1 p1Var : p1.values()) {
                    s7.f fVar = (s7.f) ((EnumMap) this.f22318b).get(p1Var);
                    if (fVar == null) {
                        fVar = s7.f.UNSET;
                    }
                    sb2.append(fVar.f22726a);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(x6.a aVar, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.f22317a = 19;
        this.f22318b = publicKeyCredentialCreationOptions;
    }

    public a(int i5) {
        this.f22317a = i5;
        switch (i5) {
            case 11:
                this.f22318b = null;
                break;
            case 12:
                this.f22318b = new ConcurrentHashMap(16);
                break;
            case 13:
            case 14:
            default:
                this.f22318b = new EnumMap(p1.class);
                break;
            case 15:
                break;
        }
    }

    public a(EnumMap enumMap) {
        this.f22317a = 3;
        EnumMap enumMap2 = new EnumMap(p1.class);
        this.f22318b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public a(d openHelper) {
        this.f22317a = 13;
        Intrinsics.checkNotNullParameter(openHelper, "openHelper");
        this.f22318b = openHelper;
    }

    private final /* bridge */ void h(m mVar) {
    }

    private final /* bridge */ void i(m mVar) {
    }
}
