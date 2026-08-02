package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j08 {
    public static final wib c;
    public static final /* synthetic */ j08[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;
    public final int b;

    static {
        j08[] j08VarArr = {new j08("BOXING", 0, "boxing", R.string.mma_fighting_style_boxing), new j08("BRAZILIAN_JIU_JITSU", 1, "brazilian-jiu-jitsu", R.string.mma_fighting_style_brazilian_jiu_jitsu), new j08("JIU_JITSU", 2, "jiu-jitsu", R.string.mma_fighting_style_jiu_jitsu), new j08("JUDO", 3, "judo", R.string.mma_fighting_style_judo), new j08("KARATE", 4, "karate", R.string.mma_fighting_style_karate), new j08("KICKBOXING", 5, "kickboxing", R.string.mma_fighting_style_kickboxing), new j08("KUNG_FU", 6, "kung-fu", R.string.mma_fighting_style_kung_fu), new j08("TAEKWONDO", 7, "taekwondo", R.string.mma_fighting_style_taekwondo), new j08("WRESTLING", 8, "wrestling", R.string.mma_fighting_style_wrestling), new j08("STRIKER", 9, "striker", R.string.mma_fighting_style_striker), new j08("FREESTYLE", 10, "freestyle", R.string.mma_fighting_style_freestyle), new j08("MUAY_THAI", 11, "muay-thai", R.string.mma_fighting_style_muay_thai), new j08("MMA", 12, Sports.MMA, R.string.mma), new j08("UNKNOWN", 13, "", R.string.value_unknown)};
        d = j08VarArr;
        e = new kp5(j08VarArr);
        c = new wib(23);
    }

    public j08(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static j08 valueOf(String str) {
        return (j08) Enum.valueOf(j08.class, str);
    }

    public static j08[] values() {
        return (j08[]) d.clone();
    }
}
