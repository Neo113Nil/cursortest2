package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class htl {
    public static final /* synthetic */ htl[] b;
    public static final /* synthetic */ kp5 c;
    public final int a;

    static {
        htl[] htlVarArr = {new htl("REASON_REPEAT", 0, 0), new htl("REASON_AUTO", 1, 1), new htl("REASON_SEEK", 2, 2), new htl("REASON_PLAYLIST_CHANGED", 3, 3)};
        b = htlVarArr;
        c = new kp5(htlVarArr);
    }

    public htl(String str, int i, int i2) {
        this.a = i2;
    }

    public static htl valueOf(String str) {
        return (htl) Enum.valueOf(htl.class, str);
    }

    public static htl[] values() {
        return (htl[]) b.clone();
    }
}
