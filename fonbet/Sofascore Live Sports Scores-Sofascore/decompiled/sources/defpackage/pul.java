package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.ignite.l;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pul extends IIgniteServiceCallback.Stub {
    public final ArrayList c;

    public pul(iql iqlVar) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(iqlVar);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        hpo.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            vgm vgmVar = ((iql) it.next()).a;
            if (vgmVar != null) {
                hpo.a("%s : on one dt error", "OneDTAuthenticator");
                vgmVar.k.set(true);
                if (vgmVar.d != null) {
                    hpo.h("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        hpo.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            vgm vgmVar = ((iql) it.next()).a;
            if (vgmVar != null) {
                if (TextUtils.isEmpty(str)) {
                    hpo.a("%s : on one dt error", "OneDTAuthenticator");
                    vgmVar.k.set(true);
                    if (vgmVar.d != null) {
                        hpo.h("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    h2m h2mVar = h2m.FAILED_INIT_ENCRYPTION;
                    de0.l(p5m.RAW_ONE_DT_ERROR, "error_code", "received empty one dt from the service");
                } else {
                    c0l c0lVar = vgmVar.e;
                    c0lVar.getClass();
                    p5m p5mVar = p5m.ENCRYPTION_EXCEPTION;
                    try {
                        Pair e = ((ujg) c0lVar.c).e(str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(e.first).put(e.second);
                        ((SharedPreferences) c0lVar.b).edit().putString("odt", jSONArray.toString()).apply();
                    } catch (IOException e2) {
                        e = e2;
                        de0.l(p5mVar, z1a.g(e, h2m.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        de0.l(p5mVar, z1a.g(e, h2m.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (InvalidKeyException e4) {
                        e = e4;
                        de0.l(p5mVar, z1a.g(e, h2m.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (NoSuchAlgorithmException e5) {
                        e = e5;
                        de0.l(p5mVar, z1a.g(e, h2m.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (NoSuchPaddingException e6) {
                        e = e6;
                        de0.l(p5mVar, z1a.g(e, h2m.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (Exception e7) {
                        de0.l(p5mVar, z1a.g(e7, h2m.FAILED_STORE_ENCRYPTED_DATA));
                    }
                    vgmVar.f.getClass();
                    oul a = n2f.a(str);
                    vgmVar.g = a;
                    l lVar = vgmVar.d;
                    if (lVar != null) {
                        hpo.a("%s : setting one dt entity", "IgniteManager");
                        lVar.b = a;
                    }
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
