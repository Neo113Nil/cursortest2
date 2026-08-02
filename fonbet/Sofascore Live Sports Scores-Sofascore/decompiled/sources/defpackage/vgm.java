package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.ignite.h;
import com.fyber.inneractive.sdk.ignite.k;
import com.fyber.inneractive.sdk.ignite.l;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vgm extends ebm {
    public g7h c;
    public l d;
    public final c0l e;
    public final n2f f;
    public oul g;
    public iql h;
    public final boolean i;
    public final boolean j;
    public final AtomicBoolean k;

    public vgm(hql hqlVar, boolean z, boolean z2, h hVar, l lVar) {
        super(hqlVar, hVar);
        boolean z3 = false;
        this.i = false;
        this.j = false;
        this.k = new AtomicBoolean(false);
        this.d = lVar;
        this.i = z;
        this.f = new n2f(6);
        this.e = new c0l(hqlVar.g(), 5);
        this.j = z2;
        if (z2) {
            Context g = hqlVar.g();
            g7h g7hVar = new g7h(26, z3);
            g7hVar.c = g.getApplicationContext();
            lql lqlVar = new lql();
            lqlVar.b = false;
            lqlVar.a = g7hVar;
            g7hVar.b = lqlVar;
            g7hVar.d = this;
            g7hVar.e = this;
            this.c = g7hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    @Override // defpackage.ebm, defpackage.hql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        k kVar;
        String w;
        oul a;
        hpo hpoVar = hpo.c;
        p5m p5mVar = p5m.ENCRYPTION_EXCEPTION;
        oul oulVar = this.g;
        AtomicBoolean atomicBoolean = this.k;
        if (oulVar == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            k kVar2 = (k) hpoVar.a;
            if (kVar2 != null) {
                kVar2.i("%s : initializing new Ignite authentication session", objArr);
            }
            c0l c0lVar = this.e;
            c0lVar.getClass();
            ujg ujgVar = (ujg) c0lVar.c;
            try {
                ujgVar.x();
            } catch (IOException e) {
                e = e;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e3) {
                e = e3;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e4) {
                e = e4;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e6) {
                e = e6;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e7) {
                e = e7;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e8) {
                e = e8;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e9) {
                e = e9;
                de0.l(p5mVar, z1a.g(e, h2m.FAILED_INIT_ENCRYPTION));
            } catch (Exception e10) {
                de0.l(p5mVar, z1a.g(e10, h2m.FAILED_INIT_ENCRYPTION));
            }
            String string = ((SharedPreferences) c0lVar.b).getString("odt", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    w = ujgVar.w(jSONArray.getString(1), Base64.decode(jSONArray.getString(0), 0));
                } catch (IOException e11) {
                    e = e11;
                    de0.l(p5mVar, z1a.g(e, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                    w = "";
                    this.f.getClass();
                    a = n2f.a(w);
                    this.g = a;
                    if (a.b <= System.currentTimeMillis() / 1000) {
                    }
                    z = this.j;
                    if (!z) {
                    }
                    if (this.i) {
                    }
                    Object[] objArr2 = {"OneDTAuthenticator"};
                    kVar = (k) hpoVar.a;
                    if (kVar != null) {
                    }
                    this.a.b();
                } catch (InvalidAlgorithmParameterException e12) {
                    e = e12;
                    de0.l(p5mVar, z1a.g(e, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                    w = "";
                    this.f.getClass();
                    a = n2f.a(w);
                    this.g = a;
                    if (a.b <= System.currentTimeMillis() / 1000) {
                    }
                    z = this.j;
                    if (!z) {
                    }
                    if (this.i) {
                    }
                    Object[] objArr22 = {"OneDTAuthenticator"};
                    kVar = (k) hpoVar.a;
                    if (kVar != null) {
                    }
                    this.a.b();
                } catch (InvalidKeyException e13) {
                    e = e13;
                    de0.l(p5mVar, z1a.g(e, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                    w = "";
                    this.f.getClass();
                    a = n2f.a(w);
                    this.g = a;
                    if (a.b <= System.currentTimeMillis() / 1000) {
                    }
                    z = this.j;
                    if (!z) {
                    }
                    if (this.i) {
                    }
                    Object[] objArr222 = {"OneDTAuthenticator"};
                    kVar = (k) hpoVar.a;
                    if (kVar != null) {
                    }
                    this.a.b();
                } catch (NoSuchAlgorithmException e14) {
                    e = e14;
                    de0.l(p5mVar, z1a.g(e, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                    w = "";
                    this.f.getClass();
                    a = n2f.a(w);
                    this.g = a;
                    if (a.b <= System.currentTimeMillis() / 1000) {
                    }
                    z = this.j;
                    if (!z) {
                    }
                    if (this.i) {
                    }
                    Object[] objArr2222 = {"OneDTAuthenticator"};
                    kVar = (k) hpoVar.a;
                    if (kVar != null) {
                    }
                    this.a.b();
                } catch (NoSuchPaddingException e15) {
                    e = e15;
                    de0.l(p5mVar, z1a.g(e, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                    w = "";
                    this.f.getClass();
                    a = n2f.a(w);
                    this.g = a;
                    if (a.b <= System.currentTimeMillis() / 1000) {
                    }
                    z = this.j;
                    if (!z) {
                    }
                    if (this.i) {
                    }
                    Object[] objArr22222 = {"OneDTAuthenticator"};
                    kVar = (k) hpoVar.a;
                    if (kVar != null) {
                    }
                    this.a.b();
                } catch (JSONException e16) {
                    e = e16;
                    de0.l(p5mVar, z1a.g(e, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                    w = "";
                    this.f.getClass();
                    a = n2f.a(w);
                    this.g = a;
                    if (a.b <= System.currentTimeMillis() / 1000) {
                    }
                    z = this.j;
                    if (!z) {
                    }
                    if (this.i) {
                    }
                    Object[] objArr222222 = {"OneDTAuthenticator"};
                    kVar = (k) hpoVar.a;
                    if (kVar != null) {
                    }
                    this.a.b();
                } catch (Exception e17) {
                    de0.l(p5mVar, z1a.g(e17, h2m.FAILED_EXTRACT_ENCRYPTED_DATA));
                }
                this.f.getClass();
                a = n2f.a(w);
                this.g = a;
                if (a.b <= System.currentTimeMillis() / 1000) {
                    hpo.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                    oul oulVar2 = this.g;
                    l lVar = this.d;
                    if (lVar != null) {
                        hpo.a("%s : setting one dt entity", "IgniteManager");
                        lVar.b = oulVar2;
                    }
                } else {
                    atomicBoolean.set(true);
                }
            }
            w = "";
            this.f.getClass();
            a = n2f.a(w);
            this.g = a;
            if (a.b <= System.currentTimeMillis() / 1000) {
            }
        }
        z = this.j;
        if (!z && this.c == null) {
            hpo.h("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (this.i && !atomicBoolean.get()) {
            if (z) {
                this.c.c();
            }
        } else {
            Object[] objArr2222222 = {"OneDTAuthenticator"};
            kVar = (k) hpoVar.a;
            if (kVar != null) {
                kVar.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2222222);
            }
            this.a.b();
        }
    }

    @Override // defpackage.ebm, defpackage.hql
    public final void c(String str) {
        super.c(str);
        hql hqlVar = this.a;
        if (hqlVar.h()) {
            AtomicBoolean atomicBoolean = this.k;
            if (atomicBoolean.get() && hqlVar.j()) {
                atomicBoolean.set(false);
                l();
            }
        }
    }

    @Override // defpackage.ebm, defpackage.hql
    public final String d() {
        hql hqlVar = this.a;
        if (hqlVar instanceof ebm) {
            return hqlVar.d();
        }
        return null;
    }

    @Override // defpackage.ebm, defpackage.hql
    public final void destroy() {
        this.d = null;
        g7h g7hVar = this.c;
        if (g7hVar != null) {
            lql lqlVar = (lql) g7hVar.b;
            if (lqlVar != null && lqlVar.b) {
                ((Context) g7hVar.c).unregisterReceiver(lqlVar);
                lqlVar = (lql) g7hVar.b;
                lqlVar.b = false;
            }
            if (lqlVar != null) {
                lqlVar.a = null;
                g7hVar.b = null;
            }
            g7hVar.d = null;
            g7hVar.c = null;
            g7hVar.e = null;
            this.c = null;
        }
        iql iqlVar = this.h;
        if (iqlVar != null) {
            pul pulVar = iqlVar.b;
            if (pulVar != null) {
                pulVar.c.clear();
                iqlVar.b = null;
            }
            iqlVar.c = null;
            iqlVar.a = null;
            this.h = null;
        }
        this.b = null;
        this.a.destroy();
    }

    @Override // defpackage.ebm, defpackage.hql
    public final void e(ComponentName componentName, IBinder iBinder) {
        pp0 pp0Var;
        hql hqlVar = this.a;
        boolean j = hqlVar.j();
        if (!j && (pp0Var = this.b) != null) {
            pp0Var.onOdtUnsupported();
        }
        if (this.c != null && hqlVar.j() && this.j) {
            this.c.c();
        }
        if (j || this.i) {
            super.e(componentName, iBinder);
        }
    }

    @Override // defpackage.ebm, defpackage.hql
    public final String i() {
        hql hqlVar = this.a;
        if (hqlVar instanceof ebm) {
            return hqlVar.i();
        }
        return null;
    }

    @Override // defpackage.ebm, defpackage.hql
    public final boolean j() {
        return this.a.j();
    }

    public final void l() {
        hql hqlVar = this.a;
        IIgniteServiceAPI k = hqlVar.k();
        p5m p5mVar = p5m.ONE_DT_REQUEST_ERROR;
        if (k == null) {
            hpo.h("%s : service is unavailable", "OneDTAuthenticator");
            h2m h2mVar = h2m.FAILED_INIT_ENCRYPTION;
            de0.l(p5mVar, "error_code", "Ignite service unavailable");
            return;
        }
        if (this.h == null) {
            iql iqlVar = new iql();
            iqlVar.a = this;
            iqlVar.b = new pul(iqlVar);
            iqlVar.c = k;
            this.h = iqlVar;
        }
        if (TextUtils.isEmpty(hqlVar.e())) {
            h2m h2mVar2 = h2m.FAILED_INIT_ENCRYPTION;
            de0.l(p5mVar, "error_code", "Invalid session token");
            hpo.h("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        iql iqlVar2 = this.h;
        String e = hqlVar.e();
        iqlVar2.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", e);
            iqlVar2.c.getProperty("onedtid", bundle, new Bundle(), iqlVar2.b);
        } catch (RemoteException e2) {
            de0.g(p5mVar, e2);
            hpo.h("%s : request failed : %s", "OneDTPropertyHandler", e2.toString());
        }
    }
}
