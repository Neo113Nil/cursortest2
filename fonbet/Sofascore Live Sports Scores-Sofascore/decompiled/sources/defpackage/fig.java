package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.ads.interactivemedia.v3.internal.zzms;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fig implements mu9, RemoteCall, zzdu {
    public static fig e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public fig(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        this.d = packageName;
        try {
            PackageManager packageManager = context.getPackageManager();
            this.b = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
        } catch (PackageManager.NameNotFoundException unused) {
            this.b = "(unknown)";
        }
        try {
            this.c = context.getPackageManager().getPackageInfo((String) this.d, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused2) {
            this.c = "(unknown)";
        }
        try {
            try {
                Class.forName("com.facebook.react.views.view.ReactViewGroup");
                this.a = 2;
            } catch (ClassNotFoundException unused3) {
                this.a = 1;
            }
        } catch (ClassNotFoundException unused4) {
            Class.forName("io.flutter.embedding.android.FlutterView");
            this.a = 3;
        }
    }

    public static synchronized fig c(Context context) {
        fig figVar;
        synchronized (fig.class) {
            figVar = e;
            if (figVar == null) {
                figVar = new fig(context);
                e = figVar;
            }
        }
        return figVar;
    }

    public boolean a() {
        jwj jwjVar = (jwj) this.b;
        i1d i1dVar = (i1d) this.d;
        int i = this.a - 1;
        this.a = i;
        if (i == 0 && i1dVar.c != 0) {
            scj scjVar = jwjVar.a;
            q4a q4aVar = jwjVar.b;
            haj hajVar = haj.a;
            scjVar.b.a().q();
            l9j l9jVar = scjVar.b;
            if (jwjVar.c == null) {
                this.c = l9jVar;
            }
            Object[] objArr = i1dVar.a;
            int i2 = i1dVar.c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((Function1) objArr[i3]).invoke(l9jVar);
            }
            jwjVar.l(l9jVar);
            scjVar.b(q4aVar, false, hajVar);
            scjVar.e(true);
            i1dVar.n();
        }
        return this.a > 0;
    }

    public int b() {
        int i = this.a;
        return i != 2 ? i != 3 ? 0 : 512 : a.o;
    }

    public void d() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                z1a.E(this.a > 0);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mu9
    public long e(long j) {
        jwj jwjVar = (jwj) this.b;
        return jwjVar.c != null ? jwjVar.f(j) : j;
    }

    @Override // defpackage.mu9
    public int f() {
        l9j l9jVar = (l9j) this.c;
        return l9jVar != null ? l9jVar.c.length() : ((jwj) this.b).d().c.length();
    }

    @Override // defpackage.mu9
    public long g(long j) {
        jwj jwjVar = (jwj) this.b;
        return jwjVar.c != null ? jwjVar.e(j) : j;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        ryo ryoVar = new ryo((vyo) this.d, taskCompletionSource);
        zxo zxoVar = (zxo) ((wyo) anyClient).getService();
        zzms zzmsVar = new zzms((String) this.b, this.a, (String) this.c);
        vxo vxoVar = (vxo) zxoVar;
        Parcel J = vxoVar.J();
        int i = avo.a;
        J.writeInt(1);
        zzmsVar.writeToParcel(J, 0);
        avo.b(J, ryoVar);
        try {
            vxoVar.a.transact(2, J, null, 1);
        } finally {
            J.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzxz) obj).e(0, ((zzxy) this.b).a, (zzxf) this.c, (zzxk) this.d, this.a);
    }

    public /* synthetic */ fig(vyo vyoVar, String str, int i, String str2) {
        this.d = vyoVar;
        this.b = str;
        this.a = i;
        this.c = str2;
    }

    public fig(d6d d6dVar, int i) {
        this.b = d6dVar.f;
        this.a = i;
        f6d f6dVar = d6dVar.h;
        this.c = f6dVar.a();
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.d = E;
        f6dVar.h.b(E);
    }

    public fig(Bundle bundle) {
        bundle.getClass();
        bundle.getClass();
        this.b = o3a.C(bundle, "nav-entry-state:id");
        this.a = o3a.y(bundle, "nav-entry-state:destination-id");
        this.c = o3a.B(bundle, "nav-entry-state:args");
        this.d = o3a.B(bundle, "nav-entry-state:saved-state");
    }

    public fig() {
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.a = 0;
    }

    public /* synthetic */ fig(zzxy zzxyVar, zzxf zzxfVar, zzxk zzxkVar, int i) {
        this.b = zzxyVar;
        this.c = zzxfVar;
        this.d = zzxkVar;
        this.a = i;
    }

    public fig(jwj jwjVar) {
        this.b = jwjVar;
        this.d = new i1d(new Function1[16], 0);
    }

    public fig(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }
}
