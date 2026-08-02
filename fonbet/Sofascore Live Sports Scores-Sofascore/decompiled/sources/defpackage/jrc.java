package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jrc {
    public static final zic a;
    public static final jrc b;
    public static final jrc c;
    public static final /* synthetic */ jrc[] d;

    static {
        jrc jrcVar = new jrc("CAREER", 0);
        b = jrcVar;
        jrc jrcVar2 = new jrc("EVENT", 1);
        c = jrcVar2;
        d = new jrc[]{jrcVar, jrcVar2};
        a = new zic(28);
    }

    public static jrc valueOf(String str) {
        return (jrc) Enum.valueOf(jrc.class, str);
    }

    public static jrc[] values() {
        return (jrc[]) d.clone();
    }
}
