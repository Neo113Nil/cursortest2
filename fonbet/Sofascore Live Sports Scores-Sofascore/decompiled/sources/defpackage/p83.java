package defpackage;

import com.sofascore.model.mvvm.model.Team;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class p83 {
    public final hwg a;
    public final String b;
    public final Class c;
    public final int d;
    public final String e;

    public p83(hwg hwgVar, String str, Class cls, int i, String str2) {
        this.a = hwgVar;
        this.b = str;
        this.c = cls;
        this.d = i;
        this.e = str2;
    }

    public p83(hwg hwgVar, int i) {
        this(hwgVar, "team", Team.class, i, hwgVar.a);
    }
}
