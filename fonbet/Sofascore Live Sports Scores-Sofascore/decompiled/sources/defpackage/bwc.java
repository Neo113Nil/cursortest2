package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bwc {
    public static final bwc a;
    public static final bwc b;
    public static final bwc c;
    public static final bwc d;
    public static final bwc e;
    public static final /* synthetic */ bwc[] f;

    static {
        bwc bwcVar = new bwc("DefaultSpatial", 0);
        a = bwcVar;
        bwc bwcVar2 = new bwc("FastSpatial", 1);
        b = bwcVar2;
        bwc bwcVar3 = new bwc("SlowSpatial", 2);
        bwc bwcVar4 = new bwc("DefaultEffects", 3);
        c = bwcVar4;
        bwc bwcVar5 = new bwc("FastEffects", 4);
        d = bwcVar5;
        bwc bwcVar6 = new bwc("SlowEffects", 5);
        e = bwcVar6;
        f = new bwc[]{bwcVar, bwcVar2, bwcVar3, bwcVar4, bwcVar5, bwcVar6};
    }

    public static bwc valueOf(String str) {
        return (bwc) Enum.valueOf(bwc.class, str);
    }

    public static bwc[] values() {
        return (bwc[]) f.clone();
    }
}
