package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.ignite.k;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o8m implements hql {
    public Context e;
    public String f;
    public String g;
    public final String h;
    public n6g i;
    public IIgniteServiceAPI j;
    public ebm n;
    public ebm o;
    public boolean a = false;
    public boolean b = false;
    public long c = 0;
    public boolean d = false;
    public final Bundle k = new Bundle();
    public final Object l = new Object();
    public String p = null;
    public final kac q = new kac(this, 27);
    public final gql m = new gql(this);

    public o8m(Context context) {
        String str = null;
        this.e = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.e;
        if (context2 != null) {
            List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices.size() > 0) {
                str = queryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.h = str;
        this.i = new n6g(3, "", false);
    }

    @Override // defpackage.hql
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.d && (iIgniteServiceAPI = this.j) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // defpackage.hql
    public final void b() {
        if (TextUtils.isEmpty(this.h)) {
            hpo.h("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            i2m.a.execute(this.q);
        } else {
            if (!this.a || f()) {
                l();
                return;
            }
            Object[] objArr = {"IgniteAuthenticationComponent"};
            k kVar = (k) hpo.c.a;
            if (kVar != null) {
                kVar.i("%s : already authenticated", objArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.hql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        String str2;
        ebm ebmVar;
        hpo.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.b = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.p = str;
        this.k.putString("clientToken", str);
        this.a = true;
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), C.UTF8_NAME);
            } catch (Exception e) {
                hpo.h("%s : decodeJwtBody : %s", "JwtUtil", e.toString());
            }
            if (!str2.isEmpty()) {
                try {
                    long optLong = new JSONObject(str2).optLong("exp");
                    this.c = optLong;
                    long millis = TimeUnit.SECONDS.toMillis(optLong);
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(millis);
                        str3 = simpleDateFormat.format(calendar.getTime());
                    } catch (Exception unused) {
                    }
                    hpo.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
                } catch (Exception e2) {
                    de0.g(p5m.ONE_DT_GENERAL_ERROR, e2);
                    hpo.h("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e2.toString());
                }
            }
            ebmVar = this.n;
            if (ebmVar == null) {
                ebmVar.c(str);
                return;
            }
            return;
        }
        str2 = "";
        if (!str2.isEmpty()) {
        }
        ebmVar = this.n;
        if (ebmVar == null) {
        }
    }

    @Override // defpackage.hql
    public final String d() {
        return this.h;
    }

    @Override // defpackage.hql
    public final void destroy() {
        if (this.e != null && a()) {
            this.e.unbindService(this);
            this.e = null;
        }
        this.o = null;
        this.n = null;
        this.j = null;
    }

    @Override // defpackage.hql
    public final void e(ComponentName componentName, IBinder iBinder) {
        ebm ebmVar = this.o;
        if (ebmVar != null) {
            ebmVar.e(componentName, iBinder);
        }
    }

    @Override // defpackage.hql
    public final boolean f() {
        return this.c > 0 && System.currentTimeMillis() / 1000 > this.c;
    }

    @Override // defpackage.hql
    public final Context g() {
        return this.e;
    }

    @Override // defpackage.hql
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.hql
    public final String i() {
        return this.i.c;
    }

    @Override // defpackage.hql
    public final boolean j() {
        return this.i.b;
    }

    @Override // defpackage.hql
    public final IIgniteServiceAPI k() {
        return this.j;
    }

    public final void l() {
        Bundle bundle = this.k;
        if (a()) {
            String str = this.f;
            String str2 = this.g;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.b) {
                return;
            }
            if ((f() || !this.a) && this.j != null) {
                try {
                    this.b = true;
                    bundle.putInt("sdkFlowTypeKey", 1);
                    this.j.authenticate(this.f, this.g, bundle, this.m);
                } catch (RemoteException e) {
                    this.b = false;
                    de0.g(p5m.ONE_DT_AUTHENTICATION_ERROR, e);
                    hpo.h("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e.toString());
                }
            }
        }
    }

    @Override // defpackage.jql
    public final void onCredentialsRequestFailed(String str) {
        hpo.h("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // defpackage.jql
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f = str;
        this.g = str2;
        l();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hpo.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.j = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.d = true;
        i2m.a.execute(new pyn(this, new lv4(12, this, componentName, iBinder), false, 23));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d = false;
        this.c = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // defpackage.hql
    public final String e() {
        return this.p;
    }

    @Override // defpackage.hql
    public final void a(String str) {
        hpo.h("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.b = false;
        ebm ebmVar = this.n;
        if (ebmVar != null) {
            ebmVar.a(str);
        }
    }

    @Override // defpackage.hql
    public final void b(String str) {
        hpo.h("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        ebm ebmVar = this.o;
        if (ebmVar != null) {
            ebmVar.b(str);
        }
    }

    @Override // defpackage.hql
    public final void b(ebm ebmVar) {
        this.o = ebmVar;
    }

    @Override // defpackage.hql
    public final void c(ebm ebmVar) {
        this.n = ebmVar;
    }

    @Override // defpackage.hql
    public final boolean c() {
        return f() || !a();
    }
}
