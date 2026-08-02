package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k6c {
    public static final hjg c;
    public static final k6c d;
    public static final k6c e;
    public static final k6c f;
    public static final /* synthetic */ k6c[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final String b;

    static {
        k6c k6cVar = new k6c("FOR_YOU", 0, R.string.feed_for_you, "for_you");
        d = k6cVar;
        k6c k6cVar2 = new k6c("POPULAR", 1, R.string.popular, "popular");
        e = k6cVar2;
        k6c k6cVar3 = new k6c("COUNTRY", 2, R.string.country, "from_country");
        f = k6cVar3;
        k6c[] k6cVarArr = {k6cVar, k6cVar2, k6cVar3};
        g = k6cVarArr;
        h = new kp5(k6cVarArr);
        c = new hjg();
    }

    public k6c(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public static k6c valueOf(String str) {
        return (k6c) Enum.valueOf(k6c.class, str);
    }

    public static k6c[] values() {
        return (k6c[]) g.clone();
    }
}
