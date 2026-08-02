package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zx9 implements SdkInitializationListener {
    public static zx9 c;
    public final ArrayList b = new ArrayList();
    public int a = 0;

    public final void a(Context context, String str, yx9 yx9Var) {
        if (this.a == 2) {
            yx9Var.b();
            return;
        }
        this.b.add(yx9Var);
        if (this.a == 1) {
            return;
        }
        this.a = 1;
        InMobiSdk.init(context, str, xx9.a, this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public final void onInitializationComplete(Error error) {
        ArrayList arrayList = this.b;
        if (error == null) {
            this.a = 2;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((yx9) it.next()).b();
            }
        } else {
            this.a = 0;
            AdError u = yso.u(101, error.getLocalizedMessage());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((yx9) it2.next()).a(u);
            }
        }
        arrayList.clear();
    }
}
