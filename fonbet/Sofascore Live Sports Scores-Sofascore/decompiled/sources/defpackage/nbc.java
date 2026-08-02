package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nbc {
    public final gbc a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final yia d;
    public hbc e;

    public nbc(gbc gbcVar, boolean z) {
        this.a = gbcVar;
        this.d = gbcVar.b;
        this.c = z;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
