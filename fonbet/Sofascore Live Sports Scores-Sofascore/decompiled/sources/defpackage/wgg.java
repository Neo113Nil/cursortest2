package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wgg {
    public static final wgg a;
    public static final wgg b;
    public static final /* synthetic */ wgg[] c;

    static {
        wgg wggVar = new wgg("PAUSED", 0);
        a = wggVar;
        wgg wggVar2 = new wgg("PLAYING", 1);
        b = wggVar2;
        c = new wgg[]{wggVar, wggVar2};
    }

    public static wgg valueOf(String str) {
        return (wgg) Enum.valueOf(wgg.class, str);
    }

    public static wgg[] values() {
        return (wgg[]) c.clone();
    }
}
