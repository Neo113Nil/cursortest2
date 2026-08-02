package ru.ozon.app.android.atoms.data.controls.chip;

import C.o0;
import Nj.EnumC3673a;
import Oj.d;
import Oj.e;
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
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.indicator.IndicatorDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002JKBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/Jz\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b2\u0010/J\u0010\u00103\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b3\u0010\u0017J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bC\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010/¨\u0006L"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "preset", "Lru/ozon/app/android/atoms/data/controls/chip/Style;", "style", "LNj/a;", "state", "Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "indicatorType", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "indicator", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "common", "", "context", "<init>", "(Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;Lru/ozon/app/android/atoms/data/controls/chip/Style;LNj/a;Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "", "getItemType", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "component2", "()Lru/ozon/app/android/atoms/data/controls/chip/Style;", "component3", "()LNj/a;", "component4", "()Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "component5", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "component6", "component7", "()Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "component8", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "component9", "()Ljava/lang/String;", "copy", "(Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;Lru/ozon/app/android/atoms/data/controls/chip/Style;LNj/a;Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "getPreset", "Lru/ozon/app/android/atoms/data/controls/chip/Style;", "getStyle", "LNj/a;", "getState", "Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "getIndicatorType", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getTitle", "getSubtitle", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "getIndicator", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getCommon", "Ljava/lang/String;", "getContext", "Preset", "IndicatorType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
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
    private final EnumC3673a state;

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
            EnumC3673a valueOf3 = parcel.readInt() == 0 ? null : EnumC3673a.valueOf(parcel.readString());
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$IndicatorType;", "", "<init>", "(Ljava/lang/String;I)V", "INDICATOR", "MARKER", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/atoms/data/controls/chip/IndicatorLabelChipDTO$Preset;", "", "LOj/e;", "settings", "LBh/a;", "mainPresetIndicator", "mainPresetMarker", "<init>", "(Ljava/lang/String;ILOj/e;LBh/a;LBh/a;)V", "LOj/e;", "getSettings", "()LOj/e;", "LBh/a;", "getMainPresetIndicator", "()LBh/a;", "getMainPresetMarker", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Preset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Preset[] $VALUES;
        public static final Preset SIZE_400 = new Preset("SIZE_400", 0, d.b(), Bh.b.b(), Bh.b.m());
        public static final Preset SIZE_500 = new Preset("SIZE_500", 1, d.c(), Bh.b.f(), Bh.b.n());
        public static final Preset SIZE_600 = new Preset("SIZE_600", 2, d.d(), Bh.b.h(), Bh.b.o());
        public static final Preset SIZE_700 = new Preset("SIZE_700", 3, d.e(), Bh.b.j(), Bh.b.p());

        @NotNull
        private final Bh.a mainPresetIndicator;

        @NotNull
        private final Bh.a mainPresetMarker;

        @NotNull
        private final e settings;

        private static final /* synthetic */ Preset[] $values() {
            return new Preset[]{SIZE_400, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            Preset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Preset(String str, int i11, e eVar, Bh.a aVar, Bh.a aVar2) {
            this.settings = eVar;
            this.mainPresetIndicator = aVar;
            this.mainPresetMarker = aVar2;
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
        public final Bh.a getMainPresetIndicator() {
            return this.mainPresetIndicator;
        }

        @NotNull
        public final Bh.a getMainPresetMarker() {
            return this.mainPresetMarker;
        }

        @NotNull
        public final e getSettings() {
            return this.settings;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IndicatorLabelChipDTO(ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO.Preset r2, ru.ozon.app.android.atoms.data.controls.chip.Style r3, Nj.EnumC3673a r4, ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO.IndicatorType r5, ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO r6, ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO r7, ru.ozon.app.android.atoms.data.indicator.IndicatorDTO r8, ru.ozon.app.android.atoms.data.controls.CommonControlSettings r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO$Preset r2 = ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO.Preset.SIZE_400
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            ru.ozon.app.android.atoms.data.controls.chip.Style r3 = ru.ozon.app.android.atoms.data.controls.chip.Style.ASPECT_PRIMARY
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L12
            Nj.a r4 = Nj.EnumC3673a.ENABLED
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L18
            ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO$IndicatorType r5 = ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO.IndicatorType.INDICATOR
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
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO.<init>(ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO$Preset, ru.ozon.app.android.atoms.data.controls.chip.Style, Nj.a, ru.ozon.app.android.atoms.data.controls.chip.IndicatorLabelChipDTO$IndicatorType, ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO, ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO, ru.ozon.app.android.atoms.data.indicator.IndicatorDTO, ru.ozon.app.android.atoms.data.controls.CommonControlSettings, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ IndicatorLabelChipDTO copy$default(IndicatorLabelChipDTO indicatorLabelChipDTO, Preset preset, Style style, EnumC3673a enumC3673a, IndicatorType indicatorType, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, IndicatorDTO indicatorDTO, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            preset = indicatorLabelChipDTO.preset;
        }
        if ((i11 & 2) != 0) {
            style = indicatorLabelChipDTO.style;
        }
        if ((i11 & 4) != 0) {
            enumC3673a = indicatorLabelChipDTO.state;
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
        EnumC3673a enumC3673a2 = enumC3673a;
        return indicatorLabelChipDTO.copy(preset, style, enumC3673a2, indicatorType, commonAtomLabelDTO4, commonAtomLabelDTO3, indicatorDTO2, commonControlSettings2, str2);
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
    public final EnumC3673a getState() {
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
    public final IndicatorLabelChipDTO copy(Preset preset, Style style, EnumC3673a state, IndicatorType indicatorType, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, IndicatorDTO indicator, CommonControlSettings common, String context) {
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

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
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
        return R.id.iconChip;
    }

    public final Preset getPreset() {
        return this.preset;
    }

    public final EnumC3673a getState() {
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
        EnumC3673a enumC3673a = this.state;
        int hashCode3 = (hashCode2 + (enumC3673a == null ? 0 : enumC3673a.hashCode())) * 31;
        IndicatorType indicatorType = this.indicatorType;
        int c11 = Tl.a.c(this.title, (hashCode3 + (indicatorType == null ? 0 : indicatorType.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode4 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
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
        EnumC3673a enumC3673a = this.state;
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
        sb2.append(enumC3673a);
        sb2.append(", indicatorType=");
        sb2.append(indicatorType);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", indicator=");
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
        EnumC3673a enumC3673a = this.state;
        if (enumC3673a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC3673a.name());
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
    public IndicatorLabelChipDTO(Preset preset, Style style, EnumC3673a enumC3673a, IndicatorType indicatorType, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, IndicatorDTO indicatorDTO, CommonControlSettings commonControlSettings, String str) {
        super(DsAtomsType.INDICATOR_LABEL_CHIP, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.preset = preset;
        this.style = style;
        this.state = enumC3673a;
        this.indicatorType = indicatorType;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.indicator = indicatorDTO;
        this.common = commonControlSettings;
        this.context = str;
    }
}
