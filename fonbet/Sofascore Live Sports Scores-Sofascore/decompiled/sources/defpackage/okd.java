package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class okd {
    public static final okd a;
    public static final okd b;
    public static final okd c;
    public static final /* synthetic */ okd[] d;

    static {
        okd okdVar = new okd("NO_OP", 0);
        a = okdVar;
        okd okdVar2 = new okd("ADD", 1);
        b = okdVar2;
        okd okdVar3 = new okd("REMOVE", 2);
        c = okdVar3;
        d = new okd[]{okdVar, okdVar2, okdVar3};
    }

    public static okd valueOf(String str) {
        return (okd) Enum.valueOf(okd.class, str);
    }

    public static okd[] values() {
        return (okd[]) d.clone();
    }
}
