package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mqc {
    public static final /* synthetic */ mqc[] b;
    public static final /* synthetic */ kp5 c;
    public final int a;

    static {
        mqc[] mqcVarArr = {new mqc("MALE", 0, R.string.mens_division), new mqc("FEMALE", 1, R.string.womens_division)};
        b = mqcVarArr;
        c = new kp5(mqcVarArr);
    }

    public mqc(String str, int i, int i2) {
        this.a = i2;
    }

    public static mqc valueOf(String str) {
        return (mqc) Enum.valueOf(mqc.class, str);
    }

    public static mqc[] values() {
        return (mqc[]) b.clone();
    }
}
