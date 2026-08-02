package ru.ozon.uni.atoms.data.controls.chip;

import C.o0;
import D40.c;
import D40.d;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.data.IndicatorTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.indicator.indicatorTitleSubtitleCell.data.IndicatorTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperPreset;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002>?Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010&\u001a\u00020'H\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0006\u00102\u001a\u00020'J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020'HÖ\u0001J\t\u00108\u001a\u00020\u0012HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020'R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006@"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "preset", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "style", "Lru/ozon/uni/atoms/data/controls/chip/Style;", "state", "Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "indicatorType", "Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "context", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;Lru/ozon/uni/atoms/data/controls/chip/Style;Lru/ozon/uni/android/wrappers/main/chip/ChipState;Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getPreset", "()Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/chip/Style;", "getState", "()Lru/ozon/uni/android/wrappers/main/chip/ChipState;", "getIndicatorType", "()Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "getTitle", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getContext", "()Ljava/lang/String;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Preset", "IndicatorType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IndicatorLabelChipDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IndicatorLabelChipDTO> CREATOR = new Creator();
    private final CommonControlSettings common;
    private final String context;
    private final IndicatorDTO indicator;

    @EnumNullFallback
    private final IndicatorType indicatorType;

    @EnumNullFallback
    private final Preset preset;

    @EnumNullFallback
    private final ChipState state;

    @EnumNullFallback
    private final Style style;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndicatorLabelChipDTO> {
        @Override // android.os.Parcelable.Creator
        public final IndicatorLabelChipDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Preset valueOf = parcel.readInt() == 0 ? null : Preset.valueOf(parcel.readString());
            Style valueOf2 = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            ChipState valueOf3 = parcel.readInt() == 0 ? null : ChipState.valueOf(parcel.readString());
            IndicatorType valueOf4 = parcel.readInt() == 0 ? null : IndicatorType.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new IndicatorLabelChipDTO(valueOf, valueOf2, valueOf3, valueOf4, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : IndicatorDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IndicatorLabelChipDTO[] newArray(int i11) {
            return new IndicatorLabelChipDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "", "<init>", "(Ljava/lang/String;I)V", "INDICATOR", "MARKER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndicatorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IndicatorType[] $VALUES;
        public static final IndicatorType INDICATOR = new IndicatorType("INDICATOR", 0);
        public static final IndicatorType MARKER = new IndicatorType("MARKER", 1);

        private static final /* synthetic */ IndicatorType[] $values() {
            return new IndicatorType[]{INDICATOR, MARKER};
        }

        static {
            IndicatorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IndicatorType(String str, int i11) {
        }

        @NotNull
        public static a<IndicatorType> getEntries() {
            return $ENTRIES;
        }

        public static IndicatorType valueOf(String str) {
            return (IndicatorType) Enum.valueOf(IndicatorType.class, str);
        }

        public static IndicatorType[] values() {
            return (IndicatorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "", "settings", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "mainPresetIndicator", "Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "mainPresetMarker", "<init>", "(Ljava/lang/String;ILru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;)V", "getSettings", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getMainPresetIndicator", "()Lru/ozon/uni/android/cell/indicator/indicatorTitleSubtitleCell/data/IndicatorTitleSubtitleWrapperPreset;", "getMainPresetMarker", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400;
        public static final Preset SIZE_500;
        public static final Preset SIZE_600;
        public static final Preset SIZE_700;

        @NotNull
        private final IndicatorTitleSubtitleWrapperPreset mainPresetIndicator;

        @NotNull
        private final IndicatorTitleSubtitleWrapperPreset mainPresetMarker;

        @NotNull
        private final BackgroundWrapperSettings settings;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            BackgroundWrapperPreset backgroundWrapperPreset = BackgroundWrapperPreset.INSTANCE;
            BackgroundWrapperSettings button400$uni_release = backgroundWrapperPreset.getButton400$uni_release();
            IndicatorTitleSubtitleWrapperPresets indicatorTitleSubtitleWrapperPresets = IndicatorTitleSubtitleWrapperPresets.INSTANCE;
            SIZE_400 = new Preset("SIZE_400", 0, button400$uni_release, indicatorTitleSubtitleWrapperPresets.getCenterEnd400Control400Control400$uni_release(), indicatorTitleSubtitleWrapperPresets.getMarker400CenterEnd500Control400Default400$uni_release());
            SIZE_500 = new Preset("SIZE_500", 1, backgroundWrapperPreset.getButton500$uni_release(), indicatorTitleSubtitleWrapperPresets.getCenterEnd500Control500Control500$uni_release(), indicatorTitleSubtitleWrapperPresets.getMarker400CenterEnd500Control500Default500$uni_release());
            SIZE_600 = new Preset("SIZE_600", 2, backgroundWrapperPreset.getButton600$uni_release(), indicatorTitleSubtitleWrapperPresets.getCenterEnd500Control600Control500$uni_release(), indicatorTitleSubtitleWrapperPresets.getMarker400CenterEnd500Control600Default500$uni_release());
            SIZE_700 = new Preset("SIZE_700", 3, backgroundWrapperPreset.getButton700$uni_release(), indicatorTitleSubtitleWrapperPresets.getCenterEnd500Control800Control500$uni_release(), indicatorTitleSubtitleWrapperPresets.getMarker400CenterEnd500Control800Default500$uni_release());
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, BackgroundWrapperSettings backgroundWrapperSettings, IndicatorTitleSubtitleWrapperPreset indicatorTitleSubtitleWrapperPreset, IndicatorTitleSubtitleWrapperPreset indicatorTitleSubtitleWrapperPreset2) {
            this.settings = backgroundWrapperSettings;
            this.mainPresetIndicator = indicatorTitleSubtitleWrapperPreset;
            this.mainPresetMarker = indicatorTitleSubtitleWrapperPreset2;
        }

        @NotNull
        public static a<Preset> getEntries() {
            return $ENTRIES;
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) $VALUES.clone();
        }

        @NotNull
        public final IndicatorTitleSubtitleWrapperPreset getMainPresetIndicator() {
            return this.mainPresetIndicator;
        }

        @NotNull
        public final IndicatorTitleSubtitleWrapperPreset getMainPresetMarker() {
            return this.mainPresetMarker;
        }

        @NotNull
        public final BackgroundWrapperSettings getSettings() {
            return this.settings;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IndicatorLabelChipDTO(ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO.Preset r2, ru.ozon.uni.atoms.data.controls.chip.Style r3, ru.ozon.uni.android.wrappers.main.chip.ChipState r4, ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO.IndicatorType r5, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO r6, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO r7, ru.ozon.uni.atoms.data.indicator.IndicatorDTO r8, ru.ozon.uni.atoms.data.controls.CommonControlSettings r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO$Preset r2 = ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO.Preset.SIZE_400
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            ru.ozon.uni.atoms.data.controls.chip.Style r3 = ru.ozon.uni.atoms.data.controls.chip.Style.ASPECT_PRIMARY
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L12
            ru.ozon.uni.android.wrappers.main.chip.ChipState r4 = ru.ozon.uni.android.wrappers.main.chip.ChipState.ENABLED
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L18
            ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO$IndicatorType r5 = ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO.IndicatorType.INDICATOR
        L18:
            r12 = r11 & 32
            r0 = 0
            if (r12 == 0) goto L1e
            r7 = r0
        L1e:
            r12 = r11 & 64
            if (r12 == 0) goto L23
            r8 = r0
        L23:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L32
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3c
        L32:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO.<init>(ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO$Preset, ru.ozon.uni.atoms.data.controls.chip.Style, ru.ozon.uni.android.wrappers.main.chip.ChipState, ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO$IndicatorType, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO, ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO, ru.ozon.uni.atoms.data.indicator.IndicatorDTO, ru.ozon.uni.atoms.data.controls.CommonControlSettings, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ IndicatorLabelChipDTO copy$default(IndicatorLabelChipDTO indicatorLabelChipDTO, Preset preset, Style style, ChipState chipState, IndicatorType indicatorType, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IndicatorDTO indicatorDTO, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = indicatorLabelChipDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = indicatorLabelChipDTO.style;
        }
        if ((i11 & 4) != 0) {
            chipState = indicatorLabelChipDTO.state;
        }
        if ((i11 & 8) != 0) {
            indicatorType = indicatorLabelChipDTO.indicatorType;
        }
        if ((i11 & 16) != 0) {
            commonAtomLabelDTO = indicatorLabelChipDTO.title;
        }
        if ((i11 & 32) != 0) {
            commonAtomLabelDTO2 = indicatorLabelChipDTO.subtitle;
        }
        if ((i11 & 64) != 0) {
            indicatorDTO = indicatorLabelChipDTO.indicator;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = indicatorLabelChipDTO.common;
        }
        if ((i11 & 256) != 0) {
            str = indicatorLabelChipDTO.context;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str2 = str;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        CommonAtomLabelDTO commonAtomLabelDTO4 = commonAtomLabelDTO;
        ChipState chipState2 = chipState;
        return indicatorLabelChipDTO.copy(preset, style, chipState2, indicatorType, commonAtomLabelDTO4, commonAtomLabelDTO3, indicatorDTO2, commonControlSettings2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Preset getPreset() {
        return this.preset;
    }

    /* renamed from: component2, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final ChipState getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final IndicatorType getIndicatorType() {
        return this.indicatorType;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final IndicatorLabelChipDTO copy(Preset preset, Style style, ChipState state, IndicatorType indicatorType, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IndicatorDTO indicator, CommonControlSettings common, String context) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IndicatorLabelChipDTO(preset, style, state, indicatorType, title, subtitle, indicator, common, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorLabelChipDTO)) {
            return false;
        }
        IndicatorLabelChipDTO indicatorLabelChipDTO = (IndicatorLabelChipDTO) other;
        return this.preset == indicatorLabelChipDTO.preset && this.style == indicatorLabelChipDTO.style && this.state == indicatorLabelChipDTO.state && this.indicatorType == indicatorLabelChipDTO.indicatorType && Intrinsics.d(this.title, indicatorLabelChipDTO.title) && Intrinsics.d(this.subtitle, indicatorLabelChipDTO.subtitle) && Intrinsics.d(this.indicator, indicatorLabelChipDTO.indicator) && Intrinsics.d(this.common, indicatorLabelChipDTO.common) && Intrinsics.d(this.context, indicatorLabelChipDTO.context);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    public final IndicatorType getIndicatorType() {
        return this.indicatorType;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.iconChip;
    }

    public final Preset getPreset() {
        return this.preset;
    }

    public final ChipState getState() {
        return this.state;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        Preset preset = this.preset;
        int hashCode = (preset == null ? 0 : preset.hashCode()) * 31;
        Style style = this.style;
        int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
        ChipState chipState = this.state;
        int hashCode3 = (hashCode2 + (chipState == null ? 0 : chipState.hashCode())) * 31;
        IndicatorType indicatorType = this.indicatorType;
        int b11 = d.b(this.title, (hashCode3 + (indicatorType == null ? 0 : indicatorType.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode4 = (b11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode5 = (hashCode4 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str = this.context;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Preset preset = this.preset;
        Style style = this.style;
        ChipState chipState = this.state;
        IndicatorType indicatorType = this.indicatorType;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        IndicatorDTO indicatorDTO = this.indicator;
        CommonControlSettings commonControlSettings = this.common;
        String str = this.context;
        StringBuilder sb2 = new StringBuilder("IndicatorLabelChipDTO(preset=");
        sb2.append(preset);
        sb2.append(", style=");
        sb2.append(style);
        sb2.append(", state=");
        sb2.append(chipState);
        sb2.append(", indicatorType=");
        sb2.append(indicatorType);
        sb2.append(", title=");
        c.e(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", context=");
        return o0.c(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Preset preset = this.preset;
        if (preset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(preset.name());
        }
        Style style = this.style;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(style.name());
        }
        ChipState chipState = this.state;
        if (chipState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(chipState.name());
        }
        IndicatorType indicatorType = this.indicatorType;
        if (indicatorType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(indicatorType.name());
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        IndicatorDTO indicatorDTO = this.indicator;
        if (indicatorDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            indicatorDTO.writeToParcel(dest, flags);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLabelChipDTO(Preset preset, Style style, ChipState chipState, IndicatorType indicatorType, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IndicatorDTO indicatorDTO, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.INDICATOR_LABEL_CHIP, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.state = chipState;
        this.indicatorType = indicatorType;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.indicator = indicatorDTO;
        this.common = commonControlSettings;
        this.context = str;
    }
}
