package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f {
    public AdSession a;
    public AdEvents b;
    public MediaEvents c;
    public boolean d = false;
    public boolean e = false;
    public t0 f;

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.a != null) {
                    verificationScriptResource = (TextUtils.isEmpty(hVar.e) || TextUtils.isEmpty(hVar.d)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.a) : VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.e, hVar.a, hVar.d);
                }
            } catch (Throwable th) {
                a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String q = dmi.q("OpenMeasurementNativeVideoTracker - ", th.getMessage());
        t0 t0Var = this.f;
        z.a(simpleName, q, t0Var != null ? t0Var.a : null, t0Var != null ? t0Var.b : null);
    }
}
