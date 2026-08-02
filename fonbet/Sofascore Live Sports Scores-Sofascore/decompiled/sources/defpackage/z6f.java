package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z6f {
    public static final z6f c;
    public static final z6f d;
    public static final z6f e;
    public static final /* synthetic */ z6f[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final boolean b;

    static {
        z6f z6fVar = new z6f(0, R.string.selected_sport, "MATCHES", true);
        z6f z6fVar2 = new z6f(1, R.string.favourites, "FAVORITES", true);
        c = z6fVar2;
        z6f z6fVar3 = new z6f(2, R.string.never_miss, "FEED", true);
        d = z6fVar3;
        rv7.c.getClass();
        z6f z6fVar4 = new z6f(3, R.string.afcon_25, "FEATURED_TOURNAMENT", ml4.e0());
        e = z6fVar4;
        z6f[] z6fVarArr = {z6fVar, z6fVar2, z6fVar3, z6fVar4};
        f = z6fVarArr;
        g = new kp5(z6fVarArr);
    }

    public z6f(int i, int i2, String str, boolean z) {
        this.a = i2;
        this.b = z;
    }

    public static z6f valueOf(String str) {
        return (z6f) Enum.valueOf(z6f.class, str);
    }

    public static z6f[] values() {
        return (z6f[]) f.clone();
    }
}
