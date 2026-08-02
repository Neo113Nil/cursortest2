package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tfh {
    public static final tfh b;
    public static final /* synthetic */ tfh[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;

    static {
        tfh tfhVar = new tfh("MADE", 0, R.string.shotmap_made);
        tfh tfhVar2 = new tfh("TOTAL", 1, R.string.total);
        b = tfhVar2;
        tfh[] tfhVarArr = {tfhVar, tfhVar2, new tfh("MISSED", 2, R.string.shotmap_missed)};
        c = tfhVarArr;
        d = new kp5(tfhVarArr);
    }

    public tfh(String str, int i, int i2) {
        this.a = i2;
    }

    public static tfh valueOf(String str) {
        return (tfh) Enum.valueOf(tfh.class, str);
    }

    public static tfh[] values() {
        return (tfh[]) c.clone();
    }
}
