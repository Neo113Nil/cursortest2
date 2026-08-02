package defpackage;

import com.ironsource.C4227o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xsd {
    public static final zic c;
    public static final xsd d;
    public static final /* synthetic */ xsd[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;
    public final String b;

    static {
        xsd xsdVar = new xsd("Intro", 0, 1, "intro");
        d = xsdVar;
        xsd[] xsdVarArr = {xsdVar, new xsd("SelectFavorites", 1, 2, "select_favorites"), new xsd("Notifications", 2, 3, C4227o2.x)};
        e = xsdVarArr;
        f = new kp5(xsdVarArr);
        c = new zic(29);
    }

    public xsd(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str2;
    }

    public static xsd valueOf(String str) {
        return (xsd) Enum.valueOf(xsd.class, str);
    }

    public static xsd[] values() {
        return (xsd[]) e.clone();
    }
}
