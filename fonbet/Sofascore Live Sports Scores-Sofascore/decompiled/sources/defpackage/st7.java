package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class st7 implements vt7 {
    public static final st7 a = new st7();
    public static final b7 b;
    public static final int c;
    public static final String d;
    public static final String e;

    static {
        rt7.b.getClass();
        b = rt7.e;
        c = R.string.sofascore_analyst;
        d = "AnalystInfoModal";
        e = "AnalystFootball";
    }

    @Override // defpackage.vt7
    public final String a() {
        return d;
    }

    @Override // defpackage.vt7
    public final String b() {
        return Sports.FOOTBALL;
    }

    @Override // defpackage.vt7
    public final int c() {
        return c;
    }

    @Override // defpackage.vt7
    public final b7 d() {
        return b;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof st7);
    }

    @Override // defpackage.vt7
    public final String getKey() {
        return e;
    }

    public final int hashCode() {
        return 1372229169;
    }

    public final String toString() {
        return "AnalystFootball";
    }
}
