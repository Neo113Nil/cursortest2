package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mh {
    public static final mh a;
    public static final mh b;
    public static final mh c;
    public static final /* synthetic */ mh[] d;

    static {
        mh mhVar = new mh("None", 0);
        a = mhVar;
        mh mhVar2 = new mh("Label", 1);
        b = mhVar2;
        mh mhVar3 = new mh("Icon", 2);
        c = mhVar3;
        d = new mh[]{mhVar, mhVar2, mhVar3};
    }

    public static mh valueOf(String str) {
        return (mh) Enum.valueOf(mh.class, str);
    }

    public static mh[] values() {
        return (mh[]) d.clone();
    }
}
