package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dsc {
    public static final dsc a;
    public static final dsc b;
    public static final /* synthetic */ dsc[] c;

    static {
        dsc dscVar = new dsc("FIGHT", 0);
        a = dscVar;
        dsc dscVar2 = new dsc("FIGHTER", 1);
        b = dscVar2;
        c = new dsc[]{dscVar, dscVar2};
    }

    public static dsc valueOf(String str) {
        return (dsc) Enum.valueOf(dsc.class, str);
    }

    public static dsc[] values() {
        return (dsc[]) c.clone();
    }
}
