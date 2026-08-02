package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kxh {
    public static final kxh a;
    public static final kxh b;
    public static final kxh c;
    public static final kxh d;
    public static final /* synthetic */ kxh[] e;

    static {
        kxh kxhVar = new kxh("NEWS_GROUP", 0);
        a = kxhVar;
        kxh kxhVar2 = new kxh("VIDEO_GROUP", 1);
        b = kxhVar2;
        kxh kxhVar3 = new kxh("INFLUENCER_VIDEO_GROUP", 2);
        c = kxhVar3;
        kxh kxhVar4 = new kxh("SHORTS_GROUP", 3);
        d = kxhVar4;
        e = new kxh[]{kxhVar, kxhVar2, kxhVar3, kxhVar4};
    }

    public static kxh valueOf(String str) {
        return (kxh) Enum.valueOf(kxh.class, str);
    }

    public static kxh[] values() {
        return (kxh[]) e.clone();
    }
}
