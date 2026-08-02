package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ydl {
    public static final ydl g;
    public static final /* synthetic */ ydl[] h;
    public static final /* synthetic */ kp5 i;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final eil e;
    public final String f;

    static {
        ydl ydlVar = new ydl("FANTASY", 0, R.string.sofascore_fantasy, R.string.sofascore_fantasy_banner_body, R.string.fantasy_play_now_button, R.drawable.fantasy_cta_background_formation, wgl.a, "wc26_fantasy_play_now");
        ydl ydlVar2 = new ydl("CHOOSE_YOUR_LEGENDS", 1, R.string.banner_wc_choose_your_legends, R.string.banner_wc_choose_your_legends_body, R.string.button_get_started, R.drawable.wc_never_miss_image, tgl.a, "wc26_choose_your_legends_get_started");
        g = ydlVar2;
        ydl[] ydlVarArr = {ydlVar, ydlVar2};
        h = ydlVarArr;
        i = new kp5(ydlVarArr);
    }

    public ydl(String str, int i2, int i3, int i4, int i5, int i6, eil eilVar, String str2) {
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = i6;
        this.e = eilVar;
        this.f = str2;
    }

    public static ydl valueOf(String str) {
        return (ydl) Enum.valueOf(ydl.class, str);
    }

    public static ydl[] values() {
        return (ydl[]) h.clone();
    }
}
