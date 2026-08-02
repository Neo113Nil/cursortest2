package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s7e implements PAGSdk.PAGInitCallback {
    public static s7e d;
    public boolean a = false;
    public boolean b = false;
    public final ArrayList c = new ArrayList();

    public final void a(Context context, String str, r7e r7eVar) {
        if (TextUtils.isEmpty(str)) {
            AdError y = jaa.y(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            y.toString();
            r7eVar.a(y);
            return;
        }
        boolean z = this.a;
        ArrayList arrayList = this.c;
        if (z) {
            arrayList.add(r7eVar);
        } else {
            if (this.b) {
                r7eVar.b();
                return;
            }
            this.a = true;
            arrayList.add(r7eVar);
            PAGSdk.init(context, new PAGConfig.Builder().appId(str).setAdxId("207").setUserData("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"8.1.0.5.0\"}]").build(), this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i, String str) {
        this.a = false;
        this.b = false;
        AdError A = jaa.A(i, str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r7e) it.next()).a(A);
        }
        arrayList.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.a = false;
        this.b = true;
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r7e) it.next()).b();
        }
        arrayList.clear();
    }
}
