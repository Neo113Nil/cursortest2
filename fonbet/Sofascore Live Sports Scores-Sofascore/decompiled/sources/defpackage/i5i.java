package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i5i {
    public static final /* synthetic */ i5i[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final g5i b;
    public final g5i c;
    public final g5i d;
    public final g5i e;

    static {
        i5i[] i5iVarArr = {new i5i("TourDeFrance", 0, "tour-de-france", R.color.stay_tour_de_france, new g5i(R.color.stay_tour_de_france, null), new g5i(R.color.stay_tour_de_france_sprint, null), new g5i(R.color.stay_tour_de_france_climb_young, Integer.valueOf(R.color.red_no)), new g5i(R.color.stay_tour_de_france_climb_young, null)), new i5i("GiroDItalia", 1, "giro-ditalia", R.color.stay_giro_ditalia, new g5i(R.color.stay_giro_ditalia, null), new g5i(R.color.stay_giro_ditalia_sprint, null), new g5i(R.color.stay_giro_ditalia_climb, null), new g5i(R.color.stay_tour_de_france_climb_young, null)), new i5i("VueltaAEspana", 2, "la-vuelta-ciclista-a-espana", R.color.stay_vuelta_a_espana, new g5i(R.color.stay_vuelta_a_espana, null), new g5i(R.color.stay_tour_de_france_sprint, null), new g5i(R.color.stay_tour_de_france_climb_young, Integer.valueOf(R.color.blue_fighter_default)), new g5i(R.color.stay_tour_de_france_climb_young, null))};
        f = i5iVarArr;
        g = new kp5(i5iVarArr);
    }

    public i5i(String str, int i, String str2, int i2, g5i g5iVar, g5i g5iVar2, g5i g5iVar3, g5i g5iVar4) {
        this.a = str2;
        this.b = g5iVar;
        this.c = g5iVar2;
        this.d = g5iVar3;
        this.e = g5iVar4;
    }

    public static i5i valueOf(String str) {
        return (i5i) Enum.valueOf(i5i.class, str);
    }

    public static i5i[] values() {
        return (i5i[]) f.clone();
    }
}
