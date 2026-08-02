package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class had {
    public final Context a;
    public final ConnectivityManager b;
    public final fdi c;
    public final jof d;
    public final c2a e;
    public boolean f;

    public had(Context context) {
        this.a = context;
        this.b = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        fdi a = gdi.a(hbd.a);
        this.c = a;
        this.d = un0.u(a);
        this.e = new c2a(this, 1);
    }
}
