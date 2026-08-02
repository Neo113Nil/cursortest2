package defpackage;

import com.sofascore.model.newNetwork.commentary.BaseballPitchType;
import com.sofascore.results.R;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class m91 {
    public static final it7 e;
    public static final /* synthetic */ m91[] f;
    public static final /* synthetic */ kp5 g;
    public final Set a;
    public final int b;
    public final int c;
    public final int d;

    static {
        m91[] m91VarArr = {new m91("FourSeamFastball", 0, w9h.b(BaseballPitchType.FourSeamFastball), R.string.baseball_pitch_four_seam_fastball_short, R.string.baseball_pitch_four_seam_fastball, R.color.rating_10), new m91("Sinker", 1, w9h.b(BaseballPitchType.Sinker), R.string.baseball_pitch_sinker_short, R.string.baseball_pitch_sinker, R.color.baseball_pitch_type_sinker), new m91("Cutter", 2, w9h.b(BaseballPitchType.Cutter), R.string.baseball_pitch_cutter_short, R.string.baseball_pitch_cutter, R.color.cricket_6s), new m91("Slider", 3, w9h.b(BaseballPitchType.Slider), R.string.baseball_pitch_slider_short, R.string.baseball_pitch_slider, R.color.rating_65), new m91("Sweeper", 4, w9h.b(BaseballPitchType.Sweeper), R.string.baseball_pitch_sweeper_short, R.string.baseball_pitch_sweeper, R.color.rating_60), new m91("Slurve", 5, w9h.b(BaseballPitchType.Slurve), R.string.baseball_pitch_slurve_short, R.string.baseball_pitch_slurve, R.color.baseball_pitch_type_slurve), new m91("Curveball", 6, ph0.a0(new BaseballPitchType[]{BaseballPitchType.Curveball, BaseballPitchType.SlowCurve}), R.string.baseball_pitch_curveball_short, R.string.baseball_pitch_curveball, R.color.rating_80), new m91("KnuckleCurve", 7, w9h.b(BaseballPitchType.KnuckleCurve), R.string.baseball_pitch_knuckle_curve_short, R.string.baseball_pitch_knuckle_curve, R.color.rating_90), new m91("Changeup", 8, w9h.b(BaseballPitchType.Changeup), R.string.baseball_pitch_changeup_short, R.string.baseball_pitch_changeup, R.color.success), new m91("Splitter", 9, w9h.b(BaseballPitchType.Splitter), R.string.baseball_pitch_splitter_short, R.string.baseball_pitch_splitter, R.color.other_prom_2), new m91("Forkball", 10, w9h.b(BaseballPitchType.Forkball), R.string.baseball_pitch_forkball_short, R.string.baseball_pitch_forkball, R.color.other_prom_1), new m91("Screwball", 11, w9h.b(BaseballPitchType.Screwball), R.string.baseball_pitch_screwball_short, R.string.baseball_pitch_screwball, R.color.n_lv_1), new m91("Knuckleball", 12, w9h.b(BaseballPitchType.Knuckleball), R.string.baseball_pitch_knuckleball_short, R.string.baseball_pitch_knuckleball, R.color.hardcourt_outdoor), new m91("EephusPitch", 13, w9h.b(BaseballPitchType.EephusPitch), R.string.baseball_pitch_eephus_short, R.string.baseball_pitch_eephus, R.color.brand_tertiary_variant), new m91("Other", 14, ph0.a0(new BaseballPitchType[]{BaseballPitchType.Unknown, BaseballPitchType.Fastball, BaseballPitchType.Slutter, BaseballPitchType.Gyroball}), R.string.baseball_pitch_type_other_short, R.string.baseball_pitch_type_other, R.color.neutral_default)};
        f = m91VarArr;
        g = new kp5(m91VarArr);
        e = new it7(17);
    }

    public m91(String str, int i, Set set, int i2, int i3, int i4) {
        this.a = set;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static m91 valueOf(String str) {
        return (m91) Enum.valueOf(m91.class, str);
    }

    public static m91[] values() {
        return (m91[]) f.clone();
    }
}
