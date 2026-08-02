package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.unity3d.ads.BuildConfig;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseLinkButtonStyleDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonStyleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseLinkButtonStyleDto[] $VALUES;

    @pmi0("after_toolbar")
    public static final BaseLinkButtonStyleDto AFTER_TOOLBAR;

    @pmi0("artist_mix")
    public static final BaseLinkButtonStyleDto ARTIST_MIX;

    @pmi0("artist_mix_blurred")
    public static final BaseLinkButtonStyleDto ARTIST_MIX_BLURRED;

    @pmi0("borderless_with_icon")
    public static final BaseLinkButtonStyleDto BORDERLESS_WITH_ICON;

    @pmi0("button_primary")
    public static final BaseLinkButtonStyleDto BUTTON_PRIMARY;

    @pmi0("cell_button_centered_icon")
    public static final BaseLinkButtonStyleDto CELL_BUTTON_CENTERED_ICON;
    public static final Parcelable.Creator<BaseLinkButtonStyleDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final BaseLinkButtonStyleDto DEFAULT;

    @pmi0("flat")
    public static final BaseLinkButtonStyleDto FLAT;

    @pmi0("flat_theme")
    public static final BaseLinkButtonStyleDto FLAT_THEME;

    @pmi0("float_bottom")
    public static final BaseLinkButtonStyleDto FLOAT_BOTTOM;

    @pmi0("gray")
    public static final BaseLinkButtonStyleDto GRAY;

    @pmi0("grid_item_category_square")
    public static final BaseLinkButtonStyleDto GRID_ITEM_CATEGORY_SQUARE;

    @pmi0("icon_title_button_primary_color")
    public static final BaseLinkButtonStyleDto ICON_TITLE_BUTTON_PRIMARY_COLOR;

    @pmi0("information_block_single_button")
    public static final BaseLinkButtonStyleDto INFORMATION_BLOCK_SINGLE_BUTTON;

    @pmi0("information_block_without_button")
    public static final BaseLinkButtonStyleDto INFORMATION_BLOCK_WITHOUT_BUTTON;

    @pmi0("inline")
    public static final BaseLinkButtonStyleDto INLINE;

    @pmi0("modal")
    public static final BaseLinkButtonStyleDto MODAL;

    @pmi0("negative")
    public static final BaseLinkButtonStyleDto NEGATIVE;

    @pmi0("open_kids_mode_onboarding")
    public static final BaseLinkButtonStyleDto OPEN_KIDS_MODE_ONBOARDING;

    @pmi0("open_kids_profile_onboarding")
    public static final BaseLinkButtonStyleDto OPEN_KIDS_PROFILE_ONBOARDING;

    @pmi0("outline_with_chevron")
    public static final BaseLinkButtonStyleDto OUTLINE_WITH_CHEVRON;

    @pmi0("primary")
    public static final BaseLinkButtonStyleDto PRIMARY;

    @pmi0("right_button")
    public static final BaseLinkButtonStyleDto RIGHT_BUTTON;

    @pmi0(X3.i.Y)
    public static final BaseLinkButtonStyleDto SECONDARY;

    @pmi0("small_flat")
    public static final BaseLinkButtonStyleDto SMALL_FLAT;

    @pmi0("square")
    public static final BaseLinkButtonStyleDto SQUARE;

    @pmi0("square_theme")
    public static final BaseLinkButtonStyleDto SQUARE_THEME;

    @pmi0("start_icon_with_chevron")
    public static final BaseLinkButtonStyleDto START_ICON_WITH_CHEVRON;

    @pmi0("tab")
    public static final BaseLinkButtonStyleDto TAB;

    @pmi0("tertiary")
    public static final BaseLinkButtonStyleDto TERTIARY;

    @pmi0(SignalingProtocol.KEY_UPDATES)
    public static final BaseLinkButtonStyleDto UPDATES;
    private final String value;

    /* compiled from: BaseLinkButtonStyleDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonStyleDto createFromParcel(Parcel parcel) {
            return BaseLinkButtonStyleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonStyleDto[] newArray(int i) {
            return new BaseLinkButtonStyleDto[i];
        }
    }

    static {
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = new BaseLinkButtonStyleDto("UPDATES", 0, SignalingProtocol.KEY_UPDATES);
        UPDATES = baseLinkButtonStyleDto;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto2 = new BaseLinkButtonStyleDto("DEFAULT", 1, BuildConfig.FLAVOR);
        DEFAULT = baseLinkButtonStyleDto2;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto3 = new BaseLinkButtonStyleDto("PRIMARY", 2, "primary");
        PRIMARY = baseLinkButtonStyleDto3;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto4 = new BaseLinkButtonStyleDto("SECONDARY", 3, X3.i.Y);
        SECONDARY = baseLinkButtonStyleDto4;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto5 = new BaseLinkButtonStyleDto("NEGATIVE", 4, "negative");
        NEGATIVE = baseLinkButtonStyleDto5;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto6 = new BaseLinkButtonStyleDto("TERTIARY", 5, "tertiary");
        TERTIARY = baseLinkButtonStyleDto6;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto7 = new BaseLinkButtonStyleDto("FLOAT_BOTTOM", 6, "float_bottom");
        FLOAT_BOTTOM = baseLinkButtonStyleDto7;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto8 = new BaseLinkButtonStyleDto("CELL_BUTTON_CENTERED_ICON", 7, "cell_button_centered_icon");
        CELL_BUTTON_CENTERED_ICON = baseLinkButtonStyleDto8;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto9 = new BaseLinkButtonStyleDto("ICON_TITLE_BUTTON_PRIMARY_COLOR", 8, "icon_title_button_primary_color");
        ICON_TITLE_BUTTON_PRIMARY_COLOR = baseLinkButtonStyleDto9;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto10 = new BaseLinkButtonStyleDto("BORDERLESS_WITH_ICON", 9, "borderless_with_icon");
        BORDERLESS_WITH_ICON = baseLinkButtonStyleDto10;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto11 = new BaseLinkButtonStyleDto("GRAY", 10, "gray");
        GRAY = baseLinkButtonStyleDto11;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto12 = new BaseLinkButtonStyleDto("FLAT", 11, "flat");
        FLAT = baseLinkButtonStyleDto12;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto13 = new BaseLinkButtonStyleDto("OUTLINE_WITH_CHEVRON", 12, "outline_with_chevron");
        OUTLINE_WITH_CHEVRON = baseLinkButtonStyleDto13;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto14 = new BaseLinkButtonStyleDto("START_ICON_WITH_CHEVRON", 13, "start_icon_with_chevron");
        START_ICON_WITH_CHEVRON = baseLinkButtonStyleDto14;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto15 = new BaseLinkButtonStyleDto("INLINE", 14, "inline");
        INLINE = baseLinkButtonStyleDto15;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto16 = new BaseLinkButtonStyleDto("MODAL", 15, "modal");
        MODAL = baseLinkButtonStyleDto16;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto17 = new BaseLinkButtonStyleDto("RIGHT_BUTTON", 16, "right_button");
        RIGHT_BUTTON = baseLinkButtonStyleDto17;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto18 = new BaseLinkButtonStyleDto("OPEN_KIDS_MODE_ONBOARDING", 17, "open_kids_mode_onboarding");
        OPEN_KIDS_MODE_ONBOARDING = baseLinkButtonStyleDto18;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto19 = new BaseLinkButtonStyleDto("OPEN_KIDS_PROFILE_ONBOARDING", 18, "open_kids_profile_onboarding");
        OPEN_KIDS_PROFILE_ONBOARDING = baseLinkButtonStyleDto19;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto20 = new BaseLinkButtonStyleDto("AFTER_TOOLBAR", 19, "after_toolbar");
        AFTER_TOOLBAR = baseLinkButtonStyleDto20;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto21 = new BaseLinkButtonStyleDto("INFORMATION_BLOCK_SINGLE_BUTTON", 20, "information_block_single_button");
        INFORMATION_BLOCK_SINGLE_BUTTON = baseLinkButtonStyleDto21;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto22 = new BaseLinkButtonStyleDto("INFORMATION_BLOCK_WITHOUT_BUTTON", 21, "information_block_without_button");
        INFORMATION_BLOCK_WITHOUT_BUTTON = baseLinkButtonStyleDto22;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto23 = new BaseLinkButtonStyleDto("SQUARE", 22, "square");
        SQUARE = baseLinkButtonStyleDto23;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto24 = new BaseLinkButtonStyleDto("FLAT_THEME", 23, "flat_theme");
        FLAT_THEME = baseLinkButtonStyleDto24;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto25 = new BaseLinkButtonStyleDto("SQUARE_THEME", 24, "square_theme");
        SQUARE_THEME = baseLinkButtonStyleDto25;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto26 = new BaseLinkButtonStyleDto("SMALL_FLAT", 25, "small_flat");
        SMALL_FLAT = baseLinkButtonStyleDto26;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto27 = new BaseLinkButtonStyleDto("TAB", 26, "tab");
        TAB = baseLinkButtonStyleDto27;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto28 = new BaseLinkButtonStyleDto("GRID_ITEM_CATEGORY_SQUARE", 27, "grid_item_category_square");
        GRID_ITEM_CATEGORY_SQUARE = baseLinkButtonStyleDto28;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto29 = new BaseLinkButtonStyleDto("ARTIST_MIX", 28, "artist_mix");
        ARTIST_MIX = baseLinkButtonStyleDto29;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto30 = new BaseLinkButtonStyleDto("ARTIST_MIX_BLURRED", 29, "artist_mix_blurred");
        ARTIST_MIX_BLURRED = baseLinkButtonStyleDto30;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto31 = new BaseLinkButtonStyleDto("BUTTON_PRIMARY", 30, "button_primary");
        BUTTON_PRIMARY = baseLinkButtonStyleDto31;
        BaseLinkButtonStyleDto[] baseLinkButtonStyleDtoArr = {baseLinkButtonStyleDto, baseLinkButtonStyleDto2, baseLinkButtonStyleDto3, baseLinkButtonStyleDto4, baseLinkButtonStyleDto5, baseLinkButtonStyleDto6, baseLinkButtonStyleDto7, baseLinkButtonStyleDto8, baseLinkButtonStyleDto9, baseLinkButtonStyleDto10, baseLinkButtonStyleDto11, baseLinkButtonStyleDto12, baseLinkButtonStyleDto13, baseLinkButtonStyleDto14, baseLinkButtonStyleDto15, baseLinkButtonStyleDto16, baseLinkButtonStyleDto17, baseLinkButtonStyleDto18, baseLinkButtonStyleDto19, baseLinkButtonStyleDto20, baseLinkButtonStyleDto21, baseLinkButtonStyleDto22, baseLinkButtonStyleDto23, baseLinkButtonStyleDto24, baseLinkButtonStyleDto25, baseLinkButtonStyleDto26, baseLinkButtonStyleDto27, baseLinkButtonStyleDto28, baseLinkButtonStyleDto29, baseLinkButtonStyleDto30, baseLinkButtonStyleDto31};
        $VALUES = baseLinkButtonStyleDtoArr;
        $ENTRIES = new asp(baseLinkButtonStyleDtoArr);
        CREATOR = new a();
    }

    private BaseLinkButtonStyleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseLinkButtonStyleDto valueOf(String str) {
        return (BaseLinkButtonStyleDto) Enum.valueOf(BaseLinkButtonStyleDto.class, str);
    }

    public static BaseLinkButtonStyleDto[] values() {
        return (BaseLinkButtonStyleDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
