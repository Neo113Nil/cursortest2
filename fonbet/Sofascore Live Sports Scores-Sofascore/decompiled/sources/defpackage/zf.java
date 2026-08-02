package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zf {
    public static final zf a;
    public static final zf b;
    public static final zf c;
    public static final zf d;
    public static final zf e;
    public static final zf f;
    public static final zf g;
    public static final zf h;
    public static final zf i;
    public static final zf j;
    public static final zf k;
    public static final /* synthetic */ zf[] l;

    static {
        zf zfVar = new zf("LOADED", 0);
        a = zfVar;
        zf zfVar2 = new zf("IMPRESSION", 1);
        b = zfVar2;
        zf zfVar3 = new zf("CLICKED", 2);
        c = zfVar3;
        zf zfVar4 = new zf("PAUSED", 3);
        d = zfVar4;
        zf zfVar5 = new zf("RESUMED", 4);
        e = zfVar5;
        zf zfVar6 = new zf("FIRST_QUARTILE", 5);
        f = zfVar6;
        zf zfVar7 = new zf("MIDPOINT", 6);
        g = zfVar7;
        zf zfVar8 = new zf("THIRD_QUARTILE", 7);
        h = zfVar8;
        zf zfVar9 = new zf("COMPLETED", 8);
        i = zfVar9;
        zf zfVar10 = new zf("SKIPPED", 9);
        zf zfVar11 = new zf("DESTROYED", 10);
        j = zfVar11;
        zf zfVar12 = new zf("VOLUME_CHANGED", 11);
        k = zfVar12;
        l = new zf[]{zfVar, zfVar2, zfVar3, zfVar4, zfVar5, zfVar6, zfVar7, zfVar8, zfVar9, zfVar10, zfVar11, zfVar12};
    }

    public static zf valueOf(String str) {
        return (zf) Enum.valueOf(zf.class, str);
    }

    public static zf[] values() {
        return (zf[]) l.clone();
    }
}
