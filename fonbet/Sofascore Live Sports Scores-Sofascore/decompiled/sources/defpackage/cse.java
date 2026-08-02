package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cse {
    public static final cse c;
    public final String a;
    public final ase b;

    static {
        new cse("");
        c = new cse("preload");
    }

    public cse(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new ase(0) : null;
    }

    public final synchronized LogSessionId a() {
        ase aseVar;
        aseVar = this.b;
        aseVar.getClass();
        return aseVar.a;
    }
}
