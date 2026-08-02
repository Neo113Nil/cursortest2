package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ywl {
    public static final ywl b;
    public static final ywl c;
    public static final ywl d;
    public static final ywl e;
    public static final ywl f;
    public static final ywl g;
    public static final ywl h;
    public static final ywl i;
    public static final /* synthetic */ ywl[] j;
    public static final /* synthetic */ kp5 k;
    public final int a;

    static {
        ywl ywlVar = new ywl("STATE_IDLE", 0, 1);
        b = ywlVar;
        ywl ywlVar2 = new ywl("STATE_BUFFERING", 1, 2);
        c = ywlVar2;
        ywl ywlVar3 = new ywl("STATE_READY", 2, 3);
        ywl ywlVar4 = new ywl("STATE_ENDED", 3, 4);
        d = ywlVar4;
        ywl ywlVar5 = new ywl("STATE_ERROR_ASSET_EXPIRY", 4, 5);
        e = ywlVar5;
        ywl ywlVar6 = new ywl("STATE_ERROR_IMAGE", 5, 6);
        f = ywlVar6;
        ywl ywlVar7 = new ywl("STATE_ERROR_UNKNOWN", 6, 7);
        g = ywlVar7;
        ywl ywlVar8 = new ywl("STATE_MEDIA_ITEM_PLAYBACK_ENDED", 7, 8);
        h = ywlVar8;
        ywl ywlVar9 = new ywl("STATE_ERROR_INTERNET_CONNECTION", 8, 9);
        i = ywlVar9;
        ywl[] ywlVarArr = {ywlVar, ywlVar2, ywlVar3, ywlVar4, ywlVar5, ywlVar6, ywlVar7, ywlVar8, ywlVar9};
        j = ywlVarArr;
        k = new kp5(ywlVarArr);
    }

    public ywl(String str, int i2, int i3) {
        this.a = i3;
    }

    public static ywl valueOf(String str) {
        return (ywl) Enum.valueOf(ywl.class, str);
    }

    public static ywl[] values() {
        return (ywl[]) j.clone();
    }
}
