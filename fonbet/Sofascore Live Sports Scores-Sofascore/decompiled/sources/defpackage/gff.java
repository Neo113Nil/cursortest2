package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gff {
    public static final gff a;
    public static final /* synthetic */ gff[] b;

    static {
        gff gffVar = new gff("DEFAULT", 0);
        a = gffVar;
        b = new gff[]{gffVar, new gff("SIGNED", 1), new gff("FIXED", 2)};
    }

    public static gff valueOf(String str) {
        return (gff) Enum.valueOf(gff.class, str);
    }

    public static gff[] values() {
        return (gff[]) b.clone();
    }
}
