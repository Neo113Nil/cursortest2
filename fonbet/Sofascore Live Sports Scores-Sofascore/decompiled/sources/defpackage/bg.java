package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bg {
    public static final bg a;
    public static final bg b;
    public static final /* synthetic */ bg[] c;

    static {
        bg bgVar = new bg("IDLE", 0);
        a = bgVar;
        bg bgVar2 = new bg("AD_LOADING", 1);
        b = bgVar2;
        c = new bg[]{bgVar, bgVar2};
    }

    public static bg valueOf(String str) {
        return (bg) Enum.valueOf(bg.class, str);
    }

    public static bg[] values() {
        return (bg[]) c.clone();
    }
}
