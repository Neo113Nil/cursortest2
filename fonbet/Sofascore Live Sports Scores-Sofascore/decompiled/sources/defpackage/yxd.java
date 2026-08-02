package defpackage;

import com.ironsource.C4435zd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yxd {
    public static final wxf b;
    public static final yxd c;
    public static final /* synthetic */ yxd[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;

    static {
        yxd yxdVar = new yxd("NO_RUNS", 0, "noruns");
        c = yxdVar;
        yxd[] yxdVarArr = {yxdVar, new yxd("SINGLE_RUNS", 1, C4435zd.d), new yxd("FOURS", 2, "fours"), new yxd("SIXES", 3, "sixes"), new yxd("WICKETS", 4, "wickets"), new yxd("ERRORS", 5, "errors"), new yxd("DRS", 6, "drs")};
        d = yxdVarArr;
        e = new kp5(yxdVarArr);
        b = new wxf(29);
    }

    public yxd(String str, int i, String str2) {
        this.a = str2;
    }

    public static yxd valueOf(String str) {
        return (yxd) Enum.valueOf(yxd.class, str);
    }

    public static yxd[] values() {
        return (yxd[]) d.clone();
    }
}
