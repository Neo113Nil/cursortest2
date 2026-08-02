package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bok {
    public static final bok b;
    public static final /* synthetic */ bok[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;

    static {
        bok bokVar = new bok("SUMMARY", 0, R.string.summary);
        bok bokVar2 = new bok("MATCHES", 1, R.string.matches);
        b = bokVar2;
        bok[] bokVarArr = {bokVar, bokVar2};
        c = bokVarArr;
        d = new kp5(bokVarArr);
    }

    public bok(String str, int i, int i2) {
        this.a = i2;
    }

    public static bok valueOf(String str) {
        return (bok) Enum.valueOf(bok.class, str);
    }

    public static bok[] values() {
        return (bok[]) c.clone();
    }
}
