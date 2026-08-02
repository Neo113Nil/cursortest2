package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ebm implements hql {
    public final hql a;
    public pp0 b;

    public ebm(hql hqlVar, pp0 pp0Var) {
        this.a = hqlVar;
        this.b = pp0Var;
        hqlVar.b(this);
        hqlVar.c(this);
    }

    @Override // defpackage.hql
    public void a(String str) {
        pp0 pp0Var = this.b;
        if (pp0Var != null) {
            pp0Var.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // defpackage.hql
    public void b(String str) {
        pp0 pp0Var = this.b;
        if (pp0Var != null) {
            pp0Var.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // defpackage.hql
    public void c(String str) {
        pp0 pp0Var = this.b;
        if (pp0Var != null) {
            pp0Var.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // defpackage.hql
    public String d() {
        return null;
    }

    @Override // defpackage.hql
    public void destroy() {
        this.b = null;
        this.a.destroy();
    }

    @Override // defpackage.hql
    public void e(ComponentName componentName, IBinder iBinder) {
        pp0 pp0Var = this.b;
        if (pp0Var != null) {
            pp0Var.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // defpackage.hql
    public boolean f() {
        return this.a.f();
    }

    @Override // defpackage.hql
    public Context g() {
        return this.a.g();
    }

    @Override // defpackage.hql
    public boolean h() {
        return this.a.h();
    }

    @Override // defpackage.hql
    public String i() {
        return null;
    }

    @Override // defpackage.hql
    public boolean j() {
        return false;
    }

    @Override // defpackage.hql
    public IIgniteServiceAPI k() {
        return this.a.k();
    }

    @Override // defpackage.jql
    public void onCredentialsRequestFailed(String str) {
        this.a.onCredentialsRequestFailed(str);
    }

    @Override // defpackage.jql
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.a.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }

    @Override // defpackage.hql
    public boolean a() {
        return this.a.a();
    }

    @Override // defpackage.hql
    public void b() {
        this.a.b();
    }

    @Override // defpackage.hql
    public boolean c() {
        return this.a.c();
    }

    @Override // defpackage.hql
    public final String e() {
        return this.a.e();
    }

    @Override // defpackage.hql
    public final void b(ebm ebmVar) {
        this.a.b(ebmVar);
    }

    @Override // defpackage.hql
    public final void c(ebm ebmVar) {
        this.a.c(ebmVar);
    }
}
