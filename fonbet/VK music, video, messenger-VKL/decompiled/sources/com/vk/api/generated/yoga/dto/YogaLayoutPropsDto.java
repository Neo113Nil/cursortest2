package com.vk.api.generated.yoga.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: YogaLayoutPropsDto.kt */
/* loaded from: classes15.dex */
public final class YogaLayoutPropsDto implements Parcelable {
    public static final Parcelable.Creator<YogaLayoutPropsDto> CREATOR = new a();

    @pmi0("align_content")
    private final YogaAlignDto alignContent;

    @pmi0("align_items")
    private final YogaAlignDto alignItems;

    @pmi0("align_self")
    private final YogaAlignDto alignSelf;

    @pmi0("aspect_ratio")
    private final Float aspectRatio;

    @pmi0("border_bottom_width")
    private final Float borderBottomWidth;

    @pmi0("border_end_width")
    private final Float borderEndWidth;

    @pmi0("border_left_width")
    private final Float borderLeftWidth;

    @pmi0("border_right_width")
    private final Float borderRightWidth;

    @pmi0("border_start_width")
    private final Float borderStartWidth;

    @pmi0("border_top_width")
    private final Float borderTopWidth;

    @pmi0("bottom")
    private final YogaValueDto bottom;

    @pmi0(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    private final DirectionDto direction;

    @pmi0("display")
    private final DisplayDto display;

    @pmi0(TtmlNode.END)
    private final YogaValueDto end;

    @pmi0("flex")
    private final Float flex;

    @pmi0("flex_basis")
    private final YogaValueDto flexBasis;

    @pmi0("flex_direction")
    private final FlexDirectionDto flexDirection;

    @pmi0("flex_grow")
    private final Float flexGrow;

    @pmi0("flex_shrink")
    private final Float flexShrink;

    @pmi0("flex_wrap")
    private final FlexWrapDto flexWrap;

    @pmi0("height")
    private final YogaValueDto height;

    @pmi0("justify_content")
    private final JustifyContentDto justifyContent;

    @pmi0(TtmlNode.LEFT)
    private final YogaValueDto left;

    @pmi0("margin")
    private final YogaValueDto margin;

    @pmi0("margin_bottom")
    private final YogaValueDto marginBottom;

    @pmi0("margin_end")
    private final YogaValueDto marginEnd;

    @pmi0("margin_horizontal")
    private final YogaValueDto marginHorizontal;

    @pmi0("margin_left")
    private final YogaValueDto marginLeft;

    @pmi0("margin_right")
    private final YogaValueDto marginRight;

    @pmi0("margin_start")
    private final YogaValueDto marginStart;

    @pmi0("margin_top")
    private final YogaValueDto marginTop;

    @pmi0("margin_vertical")
    private final YogaValueDto marginVertical;

    @pmi0("max_height")
    private final YogaValueDto maxHeight;

    @pmi0("max_width")
    private final YogaValueDto maxWidth;

    @pmi0("min_height")
    private final YogaValueDto minHeight;

    @pmi0("minWidth")
    private final YogaValueDto minWidth;

    @pmi0("overflow")
    private final OverflowDto overflow;

    @pmi0("padding")
    private final YogaValueDto padding;

    @pmi0("padding_bottom")
    private final YogaValueDto paddingBottom;

    @pmi0("padding_end")
    private final YogaValueDto paddingEnd;

    @pmi0("padding_horizontal")
    private final YogaValueDto paddingHorizontal;

    @pmi0("padding_left")
    private final YogaValueDto paddingLeft;

    @pmi0("padding_right")
    private final YogaValueDto paddingRight;

    @pmi0("padding_start")
    private final YogaValueDto paddingStart;

    @pmi0("padding_top")
    private final YogaValueDto paddingTop;

    @pmi0("padding_vertical")
    private final YogaValueDto paddingVertical;

    @pmi0("position_type")
    private final PositionTypeDto positionType;

    @pmi0(TtmlNode.RIGHT)
    private final YogaValueDto right;

    @pmi0("start")
    private final YogaValueDto start;

    @pmi0("top")
    private final YogaValueDto top;

    @pmi0("width")
    private final YogaValueDto width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class DirectionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        @pmi0("0")
        public static final DirectionDto INHERIT;

        @pmi0("1")
        public static final DirectionDto LTR;

        @pmi0("2")
        public static final DirectionDto RTL;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<DirectionDto> {
            @Override // android.os.Parcelable.Creator
            public final DirectionDto createFromParcel(Parcel parcel) {
                return DirectionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DirectionDto[] newArray(int i) {
                return new DirectionDto[i];
            }
        }

        static {
            DirectionDto directionDto = new DirectionDto("INHERIT", 0, 0);
            INHERIT = directionDto;
            DirectionDto directionDto2 = new DirectionDto("LTR", 1, 1);
            LTR = directionDto2;
            DirectionDto directionDto3 = new DirectionDto("RTL", 2, 2);
            RTL = directionDto3;
            DirectionDto[] directionDtoArr = {directionDto, directionDto2, directionDto3};
            $VALUES = directionDtoArr;
            $ENTRIES = new asp(directionDtoArr);
            CREATOR = new a();
        }

        private DirectionDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class DisplayDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisplayDto[] $VALUES;
        public static final Parcelable.Creator<DisplayDto> CREATOR;

        @pmi0("0")
        public static final DisplayDto FLEX;

        @pmi0("1")
        public static final DisplayDto NONE;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<DisplayDto> {
            @Override // android.os.Parcelable.Creator
            public final DisplayDto createFromParcel(Parcel parcel) {
                return DisplayDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DisplayDto[] newArray(int i) {
                return new DisplayDto[i];
            }
        }

        static {
            DisplayDto displayDto = new DisplayDto("FLEX", 0, 0);
            FLEX = displayDto;
            DisplayDto displayDto2 = new DisplayDto("NONE", 1, 1);
            NONE = displayDto2;
            DisplayDto[] displayDtoArr = {displayDto, displayDto2};
            $VALUES = displayDtoArr;
            $ENTRIES = new asp(displayDtoArr);
            CREATOR = new a();
        }

        private DisplayDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static DisplayDto valueOf(String str) {
            return (DisplayDto) Enum.valueOf(DisplayDto.class, str);
        }

        public static DisplayDto[] values() {
            return (DisplayDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class FlexDirectionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FlexDirectionDto[] $VALUES;

        @pmi0("0")
        public static final FlexDirectionDto COLUMN;

        @pmi0("1")
        public static final FlexDirectionDto COLUMN_REVERSE;
        public static final Parcelable.Creator<FlexDirectionDto> CREATOR;

        @pmi0("2")
        public static final FlexDirectionDto ROW;

        @pmi0("3")
        public static final FlexDirectionDto ROW_REVERSE;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<FlexDirectionDto> {
            @Override // android.os.Parcelable.Creator
            public final FlexDirectionDto createFromParcel(Parcel parcel) {
                return FlexDirectionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FlexDirectionDto[] newArray(int i) {
                return new FlexDirectionDto[i];
            }
        }

        static {
            FlexDirectionDto flexDirectionDto = new FlexDirectionDto("COLUMN", 0, 0);
            COLUMN = flexDirectionDto;
            FlexDirectionDto flexDirectionDto2 = new FlexDirectionDto("COLUMN_REVERSE", 1, 1);
            COLUMN_REVERSE = flexDirectionDto2;
            FlexDirectionDto flexDirectionDto3 = new FlexDirectionDto("ROW", 2, 2);
            ROW = flexDirectionDto3;
            FlexDirectionDto flexDirectionDto4 = new FlexDirectionDto("ROW_REVERSE", 3, 3);
            ROW_REVERSE = flexDirectionDto4;
            FlexDirectionDto[] flexDirectionDtoArr = {flexDirectionDto, flexDirectionDto2, flexDirectionDto3, flexDirectionDto4};
            $VALUES = flexDirectionDtoArr;
            $ENTRIES = new asp(flexDirectionDtoArr);
            CREATOR = new a();
        }

        private FlexDirectionDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static FlexDirectionDto valueOf(String str) {
            return (FlexDirectionDto) Enum.valueOf(FlexDirectionDto.class, str);
        }

        public static FlexDirectionDto[] values() {
            return (FlexDirectionDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class FlexWrapDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FlexWrapDto[] $VALUES;
        public static final Parcelable.Creator<FlexWrapDto> CREATOR;

        @pmi0("0")
        public static final FlexWrapDto NOWRAP;

        @pmi0("1")
        public static final FlexWrapDto WRAP;

        @pmi0("2")
        public static final FlexWrapDto WRAP_REVERSE;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<FlexWrapDto> {
            @Override // android.os.Parcelable.Creator
            public final FlexWrapDto createFromParcel(Parcel parcel) {
                return FlexWrapDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FlexWrapDto[] newArray(int i) {
                return new FlexWrapDto[i];
            }
        }

        static {
            FlexWrapDto flexWrapDto = new FlexWrapDto("NOWRAP", 0, 0);
            NOWRAP = flexWrapDto;
            FlexWrapDto flexWrapDto2 = new FlexWrapDto("WRAP", 1, 1);
            WRAP = flexWrapDto2;
            FlexWrapDto flexWrapDto3 = new FlexWrapDto("WRAP_REVERSE", 2, 2);
            WRAP_REVERSE = flexWrapDto3;
            FlexWrapDto[] flexWrapDtoArr = {flexWrapDto, flexWrapDto2, flexWrapDto3};
            $VALUES = flexWrapDtoArr;
            $ENTRIES = new asp(flexWrapDtoArr);
            CREATOR = new a();
        }

        private FlexWrapDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static FlexWrapDto valueOf(String str) {
            return (FlexWrapDto) Enum.valueOf(FlexWrapDto.class, str);
        }

        public static FlexWrapDto[] values() {
            return (FlexWrapDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class JustifyContentDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ JustifyContentDto[] $VALUES;

        @pmi0("1")
        public static final JustifyContentDto CENTER;
        public static final Parcelable.Creator<JustifyContentDto> CREATOR;

        @pmi0("2")
        public static final JustifyContentDto FLEX_END;

        @pmi0("0")
        public static final JustifyContentDto FLEX_START;

        @pmi0("4")
        public static final JustifyContentDto SPACE_AROUND;

        @pmi0("3")
        public static final JustifyContentDto SPACE_BETWEEN;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final JustifyContentDto SPACE_EVENLY;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<JustifyContentDto> {
            @Override // android.os.Parcelable.Creator
            public final JustifyContentDto createFromParcel(Parcel parcel) {
                return JustifyContentDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final JustifyContentDto[] newArray(int i) {
                return new JustifyContentDto[i];
            }
        }

        static {
            JustifyContentDto justifyContentDto = new JustifyContentDto("FLEX_START", 0, 0);
            FLEX_START = justifyContentDto;
            JustifyContentDto justifyContentDto2 = new JustifyContentDto("CENTER", 1, 1);
            CENTER = justifyContentDto2;
            JustifyContentDto justifyContentDto3 = new JustifyContentDto("FLEX_END", 2, 2);
            FLEX_END = justifyContentDto3;
            JustifyContentDto justifyContentDto4 = new JustifyContentDto("SPACE_BETWEEN", 3, 3);
            SPACE_BETWEEN = justifyContentDto4;
            JustifyContentDto justifyContentDto5 = new JustifyContentDto("SPACE_AROUND", 4, 4);
            SPACE_AROUND = justifyContentDto5;
            JustifyContentDto justifyContentDto6 = new JustifyContentDto("SPACE_EVENLY", 5, 5);
            SPACE_EVENLY = justifyContentDto6;
            JustifyContentDto[] justifyContentDtoArr = {justifyContentDto, justifyContentDto2, justifyContentDto3, justifyContentDto4, justifyContentDto5, justifyContentDto6};
            $VALUES = justifyContentDtoArr;
            $ENTRIES = new asp(justifyContentDtoArr);
            CREATOR = new a();
        }

        private JustifyContentDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static JustifyContentDto valueOf(String str) {
            return (JustifyContentDto) Enum.valueOf(JustifyContentDto.class, str);
        }

        public static JustifyContentDto[] values() {
            return (JustifyContentDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class OverflowDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OverflowDto[] $VALUES;
        public static final Parcelable.Creator<OverflowDto> CREATOR;

        @pmi0("1")
        public static final OverflowDto HIDDEN;

        @pmi0("2")
        public static final OverflowDto SCROLL;

        @pmi0("0")
        public static final OverflowDto VISIBLE;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<OverflowDto> {
            @Override // android.os.Parcelable.Creator
            public final OverflowDto createFromParcel(Parcel parcel) {
                return OverflowDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OverflowDto[] newArray(int i) {
                return new OverflowDto[i];
            }
        }

        static {
            OverflowDto overflowDto = new OverflowDto("VISIBLE", 0, 0);
            VISIBLE = overflowDto;
            OverflowDto overflowDto2 = new OverflowDto("HIDDEN", 1, 1);
            HIDDEN = overflowDto2;
            OverflowDto overflowDto3 = new OverflowDto("SCROLL", 2, 2);
            SCROLL = overflowDto3;
            OverflowDto[] overflowDtoArr = {overflowDto, overflowDto2, overflowDto3};
            $VALUES = overflowDtoArr;
            $ENTRIES = new asp(overflowDtoArr);
            CREATOR = new a();
        }

        private OverflowDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static OverflowDto valueOf(String str) {
            return (OverflowDto) Enum.valueOf(OverflowDto.class, str);
        }

        public static OverflowDto[] values() {
            return (OverflowDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class PositionTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PositionTypeDto[] $VALUES;

        @pmi0("2")
        public static final PositionTypeDto ABSOLUTE;
        public static final Parcelable.Creator<PositionTypeDto> CREATOR;

        @pmi0("1")
        public static final PositionTypeDto RELATIVE;

        @pmi0("0")
        public static final PositionTypeDto STATIC;
        private final int value;

        /* compiled from: YogaLayoutPropsDto.kt */
        public static final class a implements Parcelable.Creator<PositionTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final PositionTypeDto createFromParcel(Parcel parcel) {
                return PositionTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PositionTypeDto[] newArray(int i) {
                return new PositionTypeDto[i];
            }
        }

        static {
            PositionTypeDto positionTypeDto = new PositionTypeDto("STATIC", 0, 0);
            STATIC = positionTypeDto;
            PositionTypeDto positionTypeDto2 = new PositionTypeDto("RELATIVE", 1, 1);
            RELATIVE = positionTypeDto2;
            PositionTypeDto positionTypeDto3 = new PositionTypeDto("ABSOLUTE", 2, 2);
            ABSOLUTE = positionTypeDto3;
            PositionTypeDto[] positionTypeDtoArr = {positionTypeDto, positionTypeDto2, positionTypeDto3};
            $VALUES = positionTypeDtoArr;
            $ENTRIES = new asp(positionTypeDtoArr);
            CREATOR = new a();
        }

        private PositionTypeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static PositionTypeDto valueOf(String str) {
            return (PositionTypeDto) Enum.valueOf(PositionTypeDto.class, str);
        }

        public static PositionTypeDto[] values() {
            return (PositionTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: YogaLayoutPropsDto.kt */
    public static final class a implements Parcelable.Creator<YogaLayoutPropsDto> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto, still in use, count: 2, list:
              (r1v0 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto) from 0x00ee: MOVE (r17v1 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto) = (r1v0 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto) (LINE:239)
              (r1v0 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto) from 0x00ea: MOVE (r17v4 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto) = (r1v0 com.vk.api.generated.yoga.dto.YogaLayoutPropsDto) (LINE:235)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.yoga.dto.YogaLayoutPropsDto createFromParcel(android.os.Parcel r55) {
            /*
                Method dump skipped, instructions count: 1041
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.yoga.dto.YogaLayoutPropsDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final YogaLayoutPropsDto[] newArray(int i) {
            return new YogaLayoutPropsDto[i];
        }
    }

    public YogaLayoutPropsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YogaLayoutPropsDto)) {
            return false;
        }
        YogaLayoutPropsDto yogaLayoutPropsDto = (YogaLayoutPropsDto) obj;
        return this.direction == yogaLayoutPropsDto.direction && this.flexDirection == yogaLayoutPropsDto.flexDirection && this.justifyContent == yogaLayoutPropsDto.justifyContent && this.alignContent == yogaLayoutPropsDto.alignContent && this.alignItems == yogaLayoutPropsDto.alignItems && this.alignSelf == yogaLayoutPropsDto.alignSelf && this.flexWrap == yogaLayoutPropsDto.flexWrap && epx.f(this.flex, yogaLayoutPropsDto.flex) && epx.f(this.flexGrow, yogaLayoutPropsDto.flexGrow) && epx.f(this.flexShrink, yogaLayoutPropsDto.flexShrink) && epx.f(this.flexBasis, yogaLayoutPropsDto.flexBasis) && this.positionType == yogaLayoutPropsDto.positionType && epx.f(this.margin, yogaLayoutPropsDto.margin) && epx.f(this.marginHorizontal, yogaLayoutPropsDto.marginHorizontal) && epx.f(this.marginVertical, yogaLayoutPropsDto.marginVertical) && epx.f(this.marginTop, yogaLayoutPropsDto.marginTop) && epx.f(this.marginBottom, yogaLayoutPropsDto.marginBottom) && epx.f(this.marginLeft, yogaLayoutPropsDto.marginLeft) && epx.f(this.marginRight, yogaLayoutPropsDto.marginRight) && epx.f(this.marginStart, yogaLayoutPropsDto.marginStart) && epx.f(this.marginEnd, yogaLayoutPropsDto.marginEnd) && epx.f(this.padding, yogaLayoutPropsDto.padding) && epx.f(this.paddingHorizontal, yogaLayoutPropsDto.paddingHorizontal) && epx.f(this.paddingVertical, yogaLayoutPropsDto.paddingVertical) && epx.f(this.paddingTop, yogaLayoutPropsDto.paddingTop) && epx.f(this.paddingBottom, yogaLayoutPropsDto.paddingBottom) && epx.f(this.paddingLeft, yogaLayoutPropsDto.paddingLeft) && epx.f(this.paddingRight, yogaLayoutPropsDto.paddingRight) && epx.f(this.paddingStart, yogaLayoutPropsDto.paddingStart) && epx.f(this.paddingEnd, yogaLayoutPropsDto.paddingEnd) && epx.f(this.width, yogaLayoutPropsDto.width) && epx.f(this.height, yogaLayoutPropsDto.height) && epx.f(this.minWidth, yogaLayoutPropsDto.minWidth) && epx.f(this.minHeight, yogaLayoutPropsDto.minHeight) && epx.f(this.maxWidth, yogaLayoutPropsDto.maxWidth) && epx.f(this.maxHeight, yogaLayoutPropsDto.maxHeight) && epx.f(this.aspectRatio, yogaLayoutPropsDto.aspectRatio) && epx.f(this.borderTopWidth, yogaLayoutPropsDto.borderTopWidth) && epx.f(this.borderBottomWidth, yogaLayoutPropsDto.borderBottomWidth) && epx.f(this.borderStartWidth, yogaLayoutPropsDto.borderStartWidth) && epx.f(this.borderEndWidth, yogaLayoutPropsDto.borderEndWidth) && epx.f(this.borderLeftWidth, yogaLayoutPropsDto.borderLeftWidth) && epx.f(this.borderRightWidth, yogaLayoutPropsDto.borderRightWidth) && this.overflow == yogaLayoutPropsDto.overflow && this.display == yogaLayoutPropsDto.display && epx.f(this.top, yogaLayoutPropsDto.top) && epx.f(this.right, yogaLayoutPropsDto.right) && epx.f(this.bottom, yogaLayoutPropsDto.bottom) && epx.f(this.left, yogaLayoutPropsDto.left) && epx.f(this.start, yogaLayoutPropsDto.start) && epx.f(this.end, yogaLayoutPropsDto.end);
    }

    public final int hashCode() {
        DirectionDto directionDto = this.direction;
        int hashCode = (directionDto == null ? 0 : directionDto.hashCode()) * 31;
        FlexDirectionDto flexDirectionDto = this.flexDirection;
        int hashCode2 = (hashCode + (flexDirectionDto == null ? 0 : flexDirectionDto.hashCode())) * 31;
        JustifyContentDto justifyContentDto = this.justifyContent;
        int hashCode3 = (hashCode2 + (justifyContentDto == null ? 0 : justifyContentDto.hashCode())) * 31;
        YogaAlignDto yogaAlignDto = this.alignContent;
        int hashCode4 = (hashCode3 + (yogaAlignDto == null ? 0 : yogaAlignDto.hashCode())) * 31;
        YogaAlignDto yogaAlignDto2 = this.alignItems;
        int hashCode5 = (hashCode4 + (yogaAlignDto2 == null ? 0 : yogaAlignDto2.hashCode())) * 31;
        YogaAlignDto yogaAlignDto3 = this.alignSelf;
        int hashCode6 = (hashCode5 + (yogaAlignDto3 == null ? 0 : yogaAlignDto3.hashCode())) * 31;
        FlexWrapDto flexWrapDto = this.flexWrap;
        int hashCode7 = (hashCode6 + (flexWrapDto == null ? 0 : flexWrapDto.hashCode())) * 31;
        Float f = this.flex;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.flexGrow;
        int hashCode9 = (hashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.flexShrink;
        int hashCode10 = (hashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        YogaValueDto yogaValueDto = this.flexBasis;
        int hashCode11 = (hashCode10 + (yogaValueDto == null ? 0 : yogaValueDto.hashCode())) * 31;
        PositionTypeDto positionTypeDto = this.positionType;
        int hashCode12 = (hashCode11 + (positionTypeDto == null ? 0 : positionTypeDto.hashCode())) * 31;
        YogaValueDto yogaValueDto2 = this.margin;
        int hashCode13 = (hashCode12 + (yogaValueDto2 == null ? 0 : yogaValueDto2.hashCode())) * 31;
        YogaValueDto yogaValueDto3 = this.marginHorizontal;
        int hashCode14 = (hashCode13 + (yogaValueDto3 == null ? 0 : yogaValueDto3.hashCode())) * 31;
        YogaValueDto yogaValueDto4 = this.marginVertical;
        int hashCode15 = (hashCode14 + (yogaValueDto4 == null ? 0 : yogaValueDto4.hashCode())) * 31;
        YogaValueDto yogaValueDto5 = this.marginTop;
        int hashCode16 = (hashCode15 + (yogaValueDto5 == null ? 0 : yogaValueDto5.hashCode())) * 31;
        YogaValueDto yogaValueDto6 = this.marginBottom;
        int hashCode17 = (hashCode16 + (yogaValueDto6 == null ? 0 : yogaValueDto6.hashCode())) * 31;
        YogaValueDto yogaValueDto7 = this.marginLeft;
        int hashCode18 = (hashCode17 + (yogaValueDto7 == null ? 0 : yogaValueDto7.hashCode())) * 31;
        YogaValueDto yogaValueDto8 = this.marginRight;
        int hashCode19 = (hashCode18 + (yogaValueDto8 == null ? 0 : yogaValueDto8.hashCode())) * 31;
        YogaValueDto yogaValueDto9 = this.marginStart;
        int hashCode20 = (hashCode19 + (yogaValueDto9 == null ? 0 : yogaValueDto9.hashCode())) * 31;
        YogaValueDto yogaValueDto10 = this.marginEnd;
        int hashCode21 = (hashCode20 + (yogaValueDto10 == null ? 0 : yogaValueDto10.hashCode())) * 31;
        YogaValueDto yogaValueDto11 = this.padding;
        int hashCode22 = (hashCode21 + (yogaValueDto11 == null ? 0 : yogaValueDto11.hashCode())) * 31;
        YogaValueDto yogaValueDto12 = this.paddingHorizontal;
        int hashCode23 = (hashCode22 + (yogaValueDto12 == null ? 0 : yogaValueDto12.hashCode())) * 31;
        YogaValueDto yogaValueDto13 = this.paddingVertical;
        int hashCode24 = (hashCode23 + (yogaValueDto13 == null ? 0 : yogaValueDto13.hashCode())) * 31;
        YogaValueDto yogaValueDto14 = this.paddingTop;
        int hashCode25 = (hashCode24 + (yogaValueDto14 == null ? 0 : yogaValueDto14.hashCode())) * 31;
        YogaValueDto yogaValueDto15 = this.paddingBottom;
        int hashCode26 = (hashCode25 + (yogaValueDto15 == null ? 0 : yogaValueDto15.hashCode())) * 31;
        YogaValueDto yogaValueDto16 = this.paddingLeft;
        int hashCode27 = (hashCode26 + (yogaValueDto16 == null ? 0 : yogaValueDto16.hashCode())) * 31;
        YogaValueDto yogaValueDto17 = this.paddingRight;
        int hashCode28 = (hashCode27 + (yogaValueDto17 == null ? 0 : yogaValueDto17.hashCode())) * 31;
        YogaValueDto yogaValueDto18 = this.paddingStart;
        int hashCode29 = (hashCode28 + (yogaValueDto18 == null ? 0 : yogaValueDto18.hashCode())) * 31;
        YogaValueDto yogaValueDto19 = this.paddingEnd;
        int hashCode30 = (hashCode29 + (yogaValueDto19 == null ? 0 : yogaValueDto19.hashCode())) * 31;
        YogaValueDto yogaValueDto20 = this.width;
        int hashCode31 = (hashCode30 + (yogaValueDto20 == null ? 0 : yogaValueDto20.hashCode())) * 31;
        YogaValueDto yogaValueDto21 = this.height;
        int hashCode32 = (hashCode31 + (yogaValueDto21 == null ? 0 : yogaValueDto21.hashCode())) * 31;
        YogaValueDto yogaValueDto22 = this.minWidth;
        int hashCode33 = (hashCode32 + (yogaValueDto22 == null ? 0 : yogaValueDto22.hashCode())) * 31;
        YogaValueDto yogaValueDto23 = this.minHeight;
        int hashCode34 = (hashCode33 + (yogaValueDto23 == null ? 0 : yogaValueDto23.hashCode())) * 31;
        YogaValueDto yogaValueDto24 = this.maxWidth;
        int hashCode35 = (hashCode34 + (yogaValueDto24 == null ? 0 : yogaValueDto24.hashCode())) * 31;
        YogaValueDto yogaValueDto25 = this.maxHeight;
        int hashCode36 = (hashCode35 + (yogaValueDto25 == null ? 0 : yogaValueDto25.hashCode())) * 31;
        Float f4 = this.aspectRatio;
        int hashCode37 = (hashCode36 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.borderTopWidth;
        int hashCode38 = (hashCode37 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.borderBottomWidth;
        int hashCode39 = (hashCode38 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.borderStartWidth;
        int hashCode40 = (hashCode39 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.borderEndWidth;
        int hashCode41 = (hashCode40 + (f8 == null ? 0 : f8.hashCode())) * 31;
        Float f9 = this.borderLeftWidth;
        int hashCode42 = (hashCode41 + (f9 == null ? 0 : f9.hashCode())) * 31;
        Float f10 = this.borderRightWidth;
        int hashCode43 = (hashCode42 + (f10 == null ? 0 : f10.hashCode())) * 31;
        OverflowDto overflowDto = this.overflow;
        int hashCode44 = (hashCode43 + (overflowDto == null ? 0 : overflowDto.hashCode())) * 31;
        DisplayDto displayDto = this.display;
        int hashCode45 = (hashCode44 + (displayDto == null ? 0 : displayDto.hashCode())) * 31;
        YogaValueDto yogaValueDto26 = this.top;
        int hashCode46 = (hashCode45 + (yogaValueDto26 == null ? 0 : yogaValueDto26.hashCode())) * 31;
        YogaValueDto yogaValueDto27 = this.right;
        int hashCode47 = (hashCode46 + (yogaValueDto27 == null ? 0 : yogaValueDto27.hashCode())) * 31;
        YogaValueDto yogaValueDto28 = this.bottom;
        int hashCode48 = (hashCode47 + (yogaValueDto28 == null ? 0 : yogaValueDto28.hashCode())) * 31;
        YogaValueDto yogaValueDto29 = this.left;
        int hashCode49 = (hashCode48 + (yogaValueDto29 == null ? 0 : yogaValueDto29.hashCode())) * 31;
        YogaValueDto yogaValueDto30 = this.start;
        int hashCode50 = (hashCode49 + (yogaValueDto30 == null ? 0 : yogaValueDto30.hashCode())) * 31;
        YogaValueDto yogaValueDto31 = this.end;
        return hashCode50 + (yogaValueDto31 != null ? yogaValueDto31.hashCode() : 0);
    }

    public final String toString() {
        return "YogaLayoutPropsDto(direction=" + this.direction + ", flexDirection=" + this.flexDirection + ", justifyContent=" + this.justifyContent + ", alignContent=" + this.alignContent + ", alignItems=" + this.alignItems + ", alignSelf=" + this.alignSelf + ", flexWrap=" + this.flexWrap + ", flex=" + this.flex + ", flexGrow=" + this.flexGrow + ", flexShrink=" + this.flexShrink + ", flexBasis=" + this.flexBasis + ", positionType=" + this.positionType + ", margin=" + this.margin + ", marginHorizontal=" + this.marginHorizontal + ", marginVertical=" + this.marginVertical + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", marginLeft=" + this.marginLeft + ", marginRight=" + this.marginRight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", padding=" + this.padding + ", paddingHorizontal=" + this.paddingHorizontal + ", paddingVertical=" + this.paddingVertical + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", paddingLeft=" + this.paddingLeft + ", paddingRight=" + this.paddingRight + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", width=" + this.width + ", height=" + this.height + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ", aspectRatio=" + this.aspectRatio + ", borderTopWidth=" + this.borderTopWidth + ", borderBottomWidth=" + this.borderBottomWidth + ", borderStartWidth=" + this.borderStartWidth + ", borderEndWidth=" + this.borderEndWidth + ", borderLeftWidth=" + this.borderLeftWidth + ", borderRightWidth=" + this.borderRightWidth + ", overflow=" + this.overflow + ", display=" + this.display + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left=" + this.left + ", start=" + this.start + ", end=" + this.end + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DirectionDto directionDto = this.direction;
        if (directionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directionDto.writeToParcel(parcel, i);
        }
        FlexDirectionDto flexDirectionDto = this.flexDirection;
        if (flexDirectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flexDirectionDto.writeToParcel(parcel, i);
        }
        JustifyContentDto justifyContentDto = this.justifyContent;
        if (justifyContentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            justifyContentDto.writeToParcel(parcel, i);
        }
        YogaAlignDto yogaAlignDto = this.alignContent;
        if (yogaAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaAlignDto.writeToParcel(parcel, i);
        }
        YogaAlignDto yogaAlignDto2 = this.alignItems;
        if (yogaAlignDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaAlignDto2.writeToParcel(parcel, i);
        }
        YogaAlignDto yogaAlignDto3 = this.alignSelf;
        if (yogaAlignDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaAlignDto3.writeToParcel(parcel, i);
        }
        FlexWrapDto flexWrapDto = this.flexWrap;
        if (flexWrapDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flexWrapDto.writeToParcel(parcel, i);
        }
        Float f = this.flex;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.flexGrow;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.flexShrink;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        YogaValueDto yogaValueDto = this.flexBasis;
        if (yogaValueDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto.writeToParcel(parcel, i);
        }
        PositionTypeDto positionTypeDto = this.positionType;
        if (positionTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            positionTypeDto.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto2 = this.margin;
        if (yogaValueDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto2.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto3 = this.marginHorizontal;
        if (yogaValueDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto3.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto4 = this.marginVertical;
        if (yogaValueDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto4.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto5 = this.marginTop;
        if (yogaValueDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto5.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto6 = this.marginBottom;
        if (yogaValueDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto6.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto7 = this.marginLeft;
        if (yogaValueDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto7.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto8 = this.marginRight;
        if (yogaValueDto8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto8.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto9 = this.marginStart;
        if (yogaValueDto9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto9.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto10 = this.marginEnd;
        if (yogaValueDto10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto10.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto11 = this.padding;
        if (yogaValueDto11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto11.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto12 = this.paddingHorizontal;
        if (yogaValueDto12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto12.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto13 = this.paddingVertical;
        if (yogaValueDto13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto13.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto14 = this.paddingTop;
        if (yogaValueDto14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto14.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto15 = this.paddingBottom;
        if (yogaValueDto15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto15.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto16 = this.paddingLeft;
        if (yogaValueDto16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto16.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto17 = this.paddingRight;
        if (yogaValueDto17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto17.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto18 = this.paddingStart;
        if (yogaValueDto18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto18.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto19 = this.paddingEnd;
        if (yogaValueDto19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto19.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto20 = this.width;
        if (yogaValueDto20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto20.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto21 = this.height;
        if (yogaValueDto21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto21.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto22 = this.minWidth;
        if (yogaValueDto22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto22.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto23 = this.minHeight;
        if (yogaValueDto23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto23.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto24 = this.maxWidth;
        if (yogaValueDto24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto24.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto25 = this.maxHeight;
        if (yogaValueDto25 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto25.writeToParcel(parcel, i);
        }
        Float f4 = this.aspectRatio;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f4);
        }
        Float f5 = this.borderTopWidth;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f5);
        }
        Float f6 = this.borderBottomWidth;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f6);
        }
        Float f7 = this.borderStartWidth;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f7);
        }
        Float f8 = this.borderEndWidth;
        if (f8 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f8);
        }
        Float f9 = this.borderLeftWidth;
        if (f9 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f9);
        }
        Float f10 = this.borderRightWidth;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f10);
        }
        OverflowDto overflowDto = this.overflow;
        if (overflowDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overflowDto.writeToParcel(parcel, i);
        }
        DisplayDto displayDto = this.display;
        if (displayDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayDto.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto26 = this.top;
        if (yogaValueDto26 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto26.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto27 = this.right;
        if (yogaValueDto27 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto27.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto28 = this.bottom;
        if (yogaValueDto28 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto28.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto29 = this.left;
        if (yogaValueDto29 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto29.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto30 = this.start;
        if (yogaValueDto30 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto30.writeToParcel(parcel, i);
        }
        YogaValueDto yogaValueDto31 = this.end;
        if (yogaValueDto31 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaValueDto31.writeToParcel(parcel, i);
        }
    }

    public YogaLayoutPropsDto(DirectionDto directionDto, FlexDirectionDto flexDirectionDto, JustifyContentDto justifyContentDto, YogaAlignDto yogaAlignDto, YogaAlignDto yogaAlignDto2, YogaAlignDto yogaAlignDto3, FlexWrapDto flexWrapDto, Float f, Float f2, Float f3, YogaValueDto yogaValueDto, PositionTypeDto positionTypeDto, YogaValueDto yogaValueDto2, YogaValueDto yogaValueDto3, YogaValueDto yogaValueDto4, YogaValueDto yogaValueDto5, YogaValueDto yogaValueDto6, YogaValueDto yogaValueDto7, YogaValueDto yogaValueDto8, YogaValueDto yogaValueDto9, YogaValueDto yogaValueDto10, YogaValueDto yogaValueDto11, YogaValueDto yogaValueDto12, YogaValueDto yogaValueDto13, YogaValueDto yogaValueDto14, YogaValueDto yogaValueDto15, YogaValueDto yogaValueDto16, YogaValueDto yogaValueDto17, YogaValueDto yogaValueDto18, YogaValueDto yogaValueDto19, YogaValueDto yogaValueDto20, YogaValueDto yogaValueDto21, YogaValueDto yogaValueDto22, YogaValueDto yogaValueDto23, YogaValueDto yogaValueDto24, YogaValueDto yogaValueDto25, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, OverflowDto overflowDto, DisplayDto displayDto, YogaValueDto yogaValueDto26, YogaValueDto yogaValueDto27, YogaValueDto yogaValueDto28, YogaValueDto yogaValueDto29, YogaValueDto yogaValueDto30, YogaValueDto yogaValueDto31) {
        this.direction = directionDto;
        this.flexDirection = flexDirectionDto;
        this.justifyContent = justifyContentDto;
        this.alignContent = yogaAlignDto;
        this.alignItems = yogaAlignDto2;
        this.alignSelf = yogaAlignDto3;
        this.flexWrap = flexWrapDto;
        this.flex = f;
        this.flexGrow = f2;
        this.flexShrink = f3;
        this.flexBasis = yogaValueDto;
        this.positionType = positionTypeDto;
        this.margin = yogaValueDto2;
        this.marginHorizontal = yogaValueDto3;
        this.marginVertical = yogaValueDto4;
        this.marginTop = yogaValueDto5;
        this.marginBottom = yogaValueDto6;
        this.marginLeft = yogaValueDto7;
        this.marginRight = yogaValueDto8;
        this.marginStart = yogaValueDto9;
        this.marginEnd = yogaValueDto10;
        this.padding = yogaValueDto11;
        this.paddingHorizontal = yogaValueDto12;
        this.paddingVertical = yogaValueDto13;
        this.paddingTop = yogaValueDto14;
        this.paddingBottom = yogaValueDto15;
        this.paddingLeft = yogaValueDto16;
        this.paddingRight = yogaValueDto17;
        this.paddingStart = yogaValueDto18;
        this.paddingEnd = yogaValueDto19;
        this.width = yogaValueDto20;
        this.height = yogaValueDto21;
        this.minWidth = yogaValueDto22;
        this.minHeight = yogaValueDto23;
        this.maxWidth = yogaValueDto24;
        this.maxHeight = yogaValueDto25;
        this.aspectRatio = f4;
        this.borderTopWidth = f5;
        this.borderBottomWidth = f6;
        this.borderStartWidth = f7;
        this.borderEndWidth = f8;
        this.borderLeftWidth = f9;
        this.borderRightWidth = f10;
        this.overflow = overflowDto;
        this.display = displayDto;
        this.top = yogaValueDto26;
        this.right = yogaValueDto27;
        this.bottom = yogaValueDto28;
        this.left = yogaValueDto29;
        this.start = yogaValueDto30;
        this.end = yogaValueDto31;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ YogaLayoutPropsDto(DirectionDto directionDto, FlexDirectionDto flexDirectionDto, JustifyContentDto justifyContentDto, YogaAlignDto yogaAlignDto, YogaAlignDto yogaAlignDto2, YogaAlignDto yogaAlignDto3, FlexWrapDto flexWrapDto, Float f, Float f2, Float f3, YogaValueDto yogaValueDto, PositionTypeDto positionTypeDto, YogaValueDto yogaValueDto2, YogaValueDto yogaValueDto3, YogaValueDto yogaValueDto4, YogaValueDto yogaValueDto5, YogaValueDto yogaValueDto6, YogaValueDto yogaValueDto7, YogaValueDto yogaValueDto8, YogaValueDto yogaValueDto9, YogaValueDto yogaValueDto10, YogaValueDto yogaValueDto11, YogaValueDto yogaValueDto12, YogaValueDto yogaValueDto13, YogaValueDto yogaValueDto14, YogaValueDto yogaValueDto15, YogaValueDto yogaValueDto16, YogaValueDto yogaValueDto17, YogaValueDto yogaValueDto18, YogaValueDto yogaValueDto19, YogaValueDto yogaValueDto20, YogaValueDto yogaValueDto21, YogaValueDto yogaValueDto22, YogaValueDto yogaValueDto23, YogaValueDto yogaValueDto24, YogaValueDto yogaValueDto25, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, OverflowDto overflowDto, DisplayDto displayDto, YogaValueDto yogaValueDto26, YogaValueDto yogaValueDto27, YogaValueDto yogaValueDto28, YogaValueDto yogaValueDto29, YogaValueDto yogaValueDto30, YogaValueDto yogaValueDto31, int i, int i2, zcl zclVar) {
        this(r2, (i & 2) != 0 ? null : flexDirectionDto, (i & 4) != 0 ? null : justifyContentDto, (i & 8) != 0 ? null : yogaAlignDto, (i & 16) != 0 ? null : yogaAlignDto2, (i & 32) != 0 ? null : yogaAlignDto3, (i & 64) != 0 ? null : flexWrapDto, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : f2, (i & 512) != 0 ? null : f3, (i & 1024) != 0 ? null : yogaValueDto, (i & 2048) != 0 ? null : positionTypeDto, (i & 4096) != 0 ? null : yogaValueDto2, (i & 8192) != 0 ? null : yogaValueDto3, (i & 16384) != 0 ? null : yogaValueDto4, (i & 32768) != 0 ? null : yogaValueDto5, (i & 65536) != 0 ? null : yogaValueDto6, (i & 131072) != 0 ? null : yogaValueDto7, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : yogaValueDto8, (i & 524288) != 0 ? null : yogaValueDto9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : yogaValueDto10, (i & 2097152) != 0 ? null : yogaValueDto11, (i & 4194304) != 0 ? null : yogaValueDto12, (i & 8388608) != 0 ? null : yogaValueDto13, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : yogaValueDto14, (i & 33554432) != 0 ? null : yogaValueDto15, (i & 67108864) != 0 ? null : yogaValueDto16, (i & 134217728) != 0 ? null : yogaValueDto17, (i & 268435456) != 0 ? null : yogaValueDto18, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : yogaValueDto19, (i & 1073741824) != 0 ? null : yogaValueDto20, (i & Integer.MIN_VALUE) != 0 ? null : yogaValueDto21, (i2 & 1) != 0 ? null : yogaValueDto22, (i2 & 2) != 0 ? null : yogaValueDto23, (i2 & 4) != 0 ? null : yogaValueDto24, (i2 & 8) != 0 ? null : yogaValueDto25, (i2 & 16) != 0 ? null : f4, (i2 & 32) != 0 ? null : f5, (i2 & 64) != 0 ? null : f6, (i2 & 128) != 0 ? null : f7, (i2 & 256) != 0 ? null : f8, (i2 & 512) != 0 ? null : f9, (i2 & 1024) != 0 ? null : f10, (i2 & 2048) != 0 ? null : overflowDto, (i2 & 4096) != 0 ? null : displayDto, (i2 & 8192) != 0 ? null : yogaValueDto26, (i2 & 16384) != 0 ? null : yogaValueDto27, (i2 & 32768) != 0 ? null : yogaValueDto28, (i2 & 65536) != 0 ? null : yogaValueDto29, (i2 & 131072) != 0 ? null : yogaValueDto30, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : yogaValueDto31);
        DirectionDto directionDto2 = (i & 1) != 0 ? null : directionDto;
    }
}
