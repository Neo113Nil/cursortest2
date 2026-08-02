package ru.ozon.app.android.fresh.main.widgets.catalogTile.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "", "<init>", "(Ljava/lang/String;I)V", "PRESET_INVALID", "PRESET_1XL", "PRESET_2XL_R", "PRESET_2XL_L", "PRESET_3S_ALL", "PRESET_3XL_ALL_L", "PRESET_3XL_ALL_R", "PRESET_4XL_LD", "PRESET_4XL_LU", "PRESET_4XL_RU", "PRESET_4XL_RD", "PRESET_5XL_L", "PRESET_5XL_R", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TilePreset {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TilePreset[] $VALUES;

    @i(name = "PRESET_INVALID")
    public static final TilePreset PRESET_INVALID = new TilePreset("PRESET_INVALID", 0);

    @i(name = "PRESET_1XL")
    public static final TilePreset PRESET_1XL = new TilePreset("PRESET_1XL", 1);

    @i(name = "PRESET_2XL_R")
    public static final TilePreset PRESET_2XL_R = new TilePreset("PRESET_2XL_R", 2);

    @i(name = "PRESET_2XL_L")
    public static final TilePreset PRESET_2XL_L = new TilePreset("PRESET_2XL_L", 3);

    @i(name = "PRESET_3S_ALL")
    public static final TilePreset PRESET_3S_ALL = new TilePreset("PRESET_3S_ALL", 4);

    @i(name = "PRESET_3XL_ALL_L")
    public static final TilePreset PRESET_3XL_ALL_L = new TilePreset("PRESET_3XL_ALL_L", 5);

    @i(name = "PRESET_3XL_ALL_R")
    public static final TilePreset PRESET_3XL_ALL_R = new TilePreset("PRESET_3XL_ALL_R", 6);

    @i(name = "PRESET_4XL_LD")
    public static final TilePreset PRESET_4XL_LD = new TilePreset("PRESET_4XL_LD", 7);

    @i(name = "PRESET_4XL_LU")
    public static final TilePreset PRESET_4XL_LU = new TilePreset("PRESET_4XL_LU", 8);

    @i(name = "PRESET_4XL_RU")
    public static final TilePreset PRESET_4XL_RU = new TilePreset("PRESET_4XL_RU", 9);

    @i(name = "PRESET_4XL_RD")
    public static final TilePreset PRESET_4XL_RD = new TilePreset("PRESET_4XL_RD", 10);

    @i(name = "PRESET_5XL_L")
    public static final TilePreset PRESET_5XL_L = new TilePreset("PRESET_5XL_L", 11);

    @i(name = "PRESET_5XL_R")
    public static final TilePreset PRESET_5XL_R = new TilePreset("PRESET_5XL_R", 12);

    private static final /* synthetic */ TilePreset[] $values() {
        return new TilePreset[]{PRESET_INVALID, PRESET_1XL, PRESET_2XL_R, PRESET_2XL_L, PRESET_3S_ALL, PRESET_3XL_ALL_L, PRESET_3XL_ALL_R, PRESET_4XL_LD, PRESET_4XL_LU, PRESET_4XL_RU, PRESET_4XL_RD, PRESET_5XL_L, PRESET_5XL_R};
    }

    static {
        TilePreset[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TilePreset(String str, int i11) {
    }

    @NotNull
    public static a<TilePreset> getEntries() {
        return $ENTRIES;
    }

    public static TilePreset valueOf(String str) {
        return (TilePreset) Enum.valueOf(TilePreset.class, str);
    }

    public static TilePreset[] values() {
        return (TilePreset[]) $VALUES.clone();
    }
}
