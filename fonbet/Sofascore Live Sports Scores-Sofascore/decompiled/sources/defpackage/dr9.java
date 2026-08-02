package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class dr9 implements jql {
    public ebm a;
    public oul b;

    public void authenticate() {
        i2m.a.execute(new kac(this, 26));
    }

    public void destroy() {
        this.b = null;
        this.a.destroy();
    }

    public String getOdt() {
        oul oulVar = this.b;
        return oulVar != null ? oulVar.a : "";
    }

    public boolean isAuthenticated() {
        return this.a.h();
    }

    public boolean isConnected() {
        return this.a.a();
    }

    @Override // defpackage.jql
    public void onCredentialsRequestFailed(String str) {
        this.a.onCredentialsRequestFailed(str);
    }

    @Override // defpackage.jql
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.a.onCredentialsRequestSuccess(str, str2);
    }
}
