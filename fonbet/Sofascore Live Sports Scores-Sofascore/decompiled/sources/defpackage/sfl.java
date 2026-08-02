package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sfl {
    public static final sfl b;
    public static final sfl c;
    public static final sfl d;
    public static final /* synthetic */ sfl[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;

    static {
        sfl sflVar = new sfl("MATCHES", 0, R.string.matches);
        b = sflVar;
        sfl sflVar2 = new sfl("LEADERS", 1, R.string.leaders);
        c = sflVar2;
        sfl sflVar3 = new sfl("VIDEOS", 2, R.string.videos);
        d = sflVar3;
        sfl[] sflVarArr = {sflVar, sflVar2, sflVar3};
        e = sflVarArr;
        f = new kp5(sflVarArr);
    }

    public sfl(String str, int i, int i2) {
        this.a = i2;
    }

    public static sfl valueOf(String str) {
        return (sfl) Enum.valueOf(sfl.class, str);
    }

    public static sfl[] values() {
        return (sfl[]) e.clone();
    }
}
