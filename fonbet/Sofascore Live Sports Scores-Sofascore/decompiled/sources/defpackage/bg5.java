package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bg5 {
    public static final /* synthetic */ bg5[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final int b;

    static {
        bg5[] bg5VarArr = {new bg5("RED", 0, R.color.esp_lol_red, R.color.esp_lol_blue), new bg5("BLUE", 1, R.color.esp_lol_blue, R.color.esp_lol_red), new bg5("DIRE", 2, R.color.esp_dota_dire, R.color.esp_dota_radiant), new bg5("RADIANT", 3, R.color.esp_dota_radiant, R.color.esp_dota_dire), new bg5("TERRORISTS", 4, R.color.esp_csgo_t, R.color.esp_csgo_ct), new bg5("COUNTER_TERRORISTS", 5, R.color.esp_csgo_ct, R.color.esp_csgo_t)};
        c = bg5VarArr;
        d = new kp5(bg5VarArr);
    }

    public bg5(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static bg5 valueOf(String str) {
        return (bg5) Enum.valueOf(bg5.class, str);
    }

    public static bg5[] values() {
        return (bg5[]) c.clone();
    }
}
