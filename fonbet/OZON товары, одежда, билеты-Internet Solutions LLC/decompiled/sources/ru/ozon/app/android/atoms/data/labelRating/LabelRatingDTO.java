package ru.ozon.app.android.atoms.data.labelRating;

import C.J;
import De.C2859b;
import Xc.a;
import Xc.b;
import ah.C5022a;
import ah.C5023b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.rating.RatingDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002<=Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0006\u00100\u001a\u00020&J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020&HÖ\u0001J\t\u00106\u001a\u00020\rHÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006>"}, d2 = {"Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "rating", "Lru/ozon/app/android/atoms/data/rating/RatingDTO;", "label", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "preset", "Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingPreset;", "style", "Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingStyle;", "action", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/rating/RatingDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingPreset;Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingStyle;Lru/ozon/app/android/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/atoms/data/TestInfo;)V", "getRating", "()Lru/ozon/app/android/atoms/data/rating/RatingDTO;", "getLabel", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getPreset", "()Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingPreset;", "getStyle", "()Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingStyle;", "getAction", "()Lru/ozon/app/android/atoms/data/AtomActionDTO;", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LabelRatingPreset", "LabelRatingStyle", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LabelRatingDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<LabelRatingDTO> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final CommonAtomLabelDTO label;
    private final LabelRatingPreset preset;

    @NotNull
    private final RatingDTO rating;
    private final LabelRatingStyle style;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LabelRatingDTO> {
        @Override // android.os.Parcelable.Creator
        public final LabelRatingDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            RatingDTO createFromParcel = RatingDTO.CREATOR.createFromParcel(parcel);
            CommonAtomLabelDTO createFromParcel2 = parcel.readInt() == 0 ? null : CommonAtomLabelDTO.CREATOR.createFromParcel(parcel);
            LabelRatingPreset valueOf = parcel.readInt() == 0 ? null : LabelRatingPreset.valueOf(parcel.readString());
            LabelRatingStyle valueOf2 = parcel.readInt() == 0 ? null : LabelRatingStyle.valueOf(parcel.readString());
            AtomActionDTO createFromParcel3 = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(LabelRatingDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new LabelRatingDTO(createFromParcel, createFromParcel2, valueOf, valueOf2, createFromParcel3, readString, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LabelRatingDTO[] newArray(int i11) {
            return new LabelRatingDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingPreset;", "", "Lah/a;", "preset", "<init>", "(Ljava/lang/String;ILah/a;)V", "Lah/a;", "getPreset", "()Lah/a;", "HORIZONTAL_END_200", "HORIZONTAL_START_200", "VERTICAL_END_200_LEADING", "VERTICAL_END_200_CENTER", "HORIZONTAL_END_300", "HORIZONTAL_START_300", "VERTICAL_END_300_LEADING", "VERTICAL_END_300_CENTER", "HORIZONTAL_END_500", "HORIZONTAL_START_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LabelRatingPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LabelRatingPreset[] $VALUES;

        @NotNull
        private final C5022a preset;
        public static final LabelRatingPreset HORIZONTAL_END_200 = new LabelRatingPreset("HORIZONTAL_END_200", 0, C5023b.a());
        public static final LabelRatingPreset HORIZONTAL_START_200 = new LabelRatingPreset("HORIZONTAL_START_200", 1, C5023b.d());
        public static final LabelRatingPreset VERTICAL_END_200_LEADING = new LabelRatingPreset("VERTICAL_END_200_LEADING", 2, C5023b.h());
        public static final LabelRatingPreset VERTICAL_END_200_CENTER = new LabelRatingPreset("VERTICAL_END_200_CENTER", 3, C5023b.g());
        public static final LabelRatingPreset HORIZONTAL_END_300 = new LabelRatingPreset("HORIZONTAL_END_300", 4, C5023b.b());
        public static final LabelRatingPreset HORIZONTAL_START_300 = new LabelRatingPreset("HORIZONTAL_START_300", 5, C5023b.e());
        public static final LabelRatingPreset VERTICAL_END_300_LEADING = new LabelRatingPreset("VERTICAL_END_300_LEADING", 6, C5023b.j());
        public static final LabelRatingPreset VERTICAL_END_300_CENTER = new LabelRatingPreset("VERTICAL_END_300_CENTER", 7, C5023b.i());
        public static final LabelRatingPreset HORIZONTAL_END_500 = new LabelRatingPreset("HORIZONTAL_END_500", 8, C5023b.c());
        public static final LabelRatingPreset HORIZONTAL_START_500 = new LabelRatingPreset("HORIZONTAL_START_500", 9, C5023b.f());

        private static final /* synthetic */ LabelRatingPreset[] $values() {
            return new LabelRatingPreset[]{HORIZONTAL_END_200, HORIZONTAL_START_200, VERTICAL_END_200_LEADING, VERTICAL_END_200_CENTER, HORIZONTAL_END_300, HORIZONTAL_START_300, VERTICAL_END_300_LEADING, VERTICAL_END_300_CENTER, HORIZONTAL_END_500, HORIZONTAL_START_500};
        }

        static {
            LabelRatingPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LabelRatingPreset(String str, int i11, C5022a c5022a) {
            this.preset = c5022a;
        }

        @NotNull
        public static a<LabelRatingPreset> getEntries() {
            return $ENTRIES;
        }

        public static LabelRatingPreset valueOf(String str) {
            return (LabelRatingPreset) Enum.valueOf(LabelRatingPreset.class, str);
        }

        public static LabelRatingPreset[] values() {
            return (LabelRatingPreset[]) $VALUES.clone();
        }

        @NotNull
        public final C5022a getPreset() {
            return this.preset;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/labelRating/LabelRatingDTO$LabelRatingStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "DEFAULT_ON_DARK", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LabelRatingStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LabelRatingStyle[] $VALUES;
        public static final LabelRatingStyle DEFAULT = new LabelRatingStyle("DEFAULT", 0);
        public static final LabelRatingStyle DEFAULT_ON_DARK = new LabelRatingStyle("DEFAULT_ON_DARK", 1);

        private static final /* synthetic */ LabelRatingStyle[] $values() {
            return new LabelRatingStyle[]{DEFAULT, DEFAULT_ON_DARK};
        }

        static {
            LabelRatingStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LabelRatingStyle(String str, int i11) {
        }

        @NotNull
        public static a<LabelRatingStyle> getEntries() {
            return $ENTRIES;
        }

        public static LabelRatingStyle valueOf(String str) {
            return (LabelRatingStyle) Enum.valueOf(LabelRatingStyle.class, str);
        }

        public static LabelRatingStyle[] values() {
            return (LabelRatingStyle[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LabelRatingDTO(RatingDTO ratingDTO, CommonAtomLabelDTO commonAtomLabelDTO, LabelRatingPreset labelRatingPreset, LabelRatingStyle labelRatingStyle, AtomActionDTO atomActionDTO, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ratingDTO, commonAtomLabelDTO, (i11 & 4) != 0 ? LabelRatingPreset.HORIZONTAL_END_300 : labelRatingPreset, (i11 & 8) != 0 ? LabelRatingStyle.DEFAULT : labelRatingStyle, (i11 & 16) != 0 ? null : atomActionDTO, (i11 & 32) != 0 ? null : str, map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo);
    }

    public static /* synthetic */ LabelRatingDTO copy$default(LabelRatingDTO labelRatingDTO, RatingDTO ratingDTO, CommonAtomLabelDTO commonAtomLabelDTO, LabelRatingPreset labelRatingPreset, LabelRatingStyle labelRatingStyle, AtomActionDTO atomActionDTO, String str, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ratingDTO = labelRatingDTO.rating;
        }
        if ((i11 & 2) != 0) {
            commonAtomLabelDTO = labelRatingDTO.label;
        }
        if ((i11 & 4) != 0) {
            labelRatingPreset = labelRatingDTO.preset;
        }
        if ((i11 & 8) != 0) {
            labelRatingStyle = labelRatingDTO.style;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = labelRatingDTO.action;
        }
        if ((i11 & 32) != 0) {
            str = labelRatingDTO.context;
        }
        if ((i11 & 64) != 0) {
            map = labelRatingDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = labelRatingDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str2 = str;
        return labelRatingDTO.copy(ratingDTO, commonAtomLabelDTO, labelRatingPreset, labelRatingStyle, atomActionDTO2, str2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonAtomLabelDTO getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final LabelRatingPreset getPreset() {
        return this.preset;
    }

    /* renamed from: component4, reason: from getter */
    public final LabelRatingStyle getStyle() {
        return this.style;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final LabelRatingDTO copy(@NotNull RatingDTO rating, CommonAtomLabelDTO label, LabelRatingPreset preset, LabelRatingStyle style, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        return new LabelRatingDTO(rating, label, preset, style, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelRatingDTO)) {
            return false;
        }
        LabelRatingDTO labelRatingDTO = (LabelRatingDTO) other;
        return Intrinsics.d(this.rating, labelRatingDTO.rating) && Intrinsics.d(this.label, labelRatingDTO.label) && this.preset == labelRatingDTO.preset && this.style == labelRatingDTO.style && Intrinsics.d(this.action, labelRatingDTO.action) && Intrinsics.d(this.context, labelRatingDTO.context) && Intrinsics.d(this.trackingInfo, labelRatingDTO.trackingInfo) && Intrinsics.d(this.testInfo, labelRatingDTO.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.ds_label_rating;
    }

    public final CommonAtomLabelDTO getLabel() {
        return this.label;
    }

    public final LabelRatingPreset getPreset() {
        return this.preset;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    public final LabelRatingStyle getStyle() {
        return this.style;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.rating.hashCode() * 31;
        CommonAtomLabelDTO commonAtomLabelDTO = this.label;
        int hashCode2 = (hashCode + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        LabelRatingPreset labelRatingPreset = this.preset;
        int hashCode3 = (hashCode2 + (labelRatingPreset == null ? 0 : labelRatingPreset.hashCode())) * 31;
        LabelRatingStyle labelRatingStyle = this.style;
        int hashCode4 = (hashCode3 + (labelRatingStyle == null ? 0 : labelRatingStyle.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.context;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode7 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LabelRatingDTO(rating=" + this.rating + ", label=" + this.label + ", preset=" + this.preset + ", style=" + this.style + ", action=" + this.action + ", context=" + this.context + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.rating.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.label;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        LabelRatingPreset labelRatingPreset = this.preset;
        if (labelRatingPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(labelRatingPreset.name());
        }
        LabelRatingStyle labelRatingStyle = this.style;
        if (labelRatingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(labelRatingStyle.name());
        }
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelRatingDTO(@NotNull RatingDTO rating, CommonAtomLabelDTO commonAtomLabelDTO, LabelRatingPreset labelRatingPreset, LabelRatingStyle labelRatingStyle, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(DsAtomsType.LABEL_RATING, str, map, testInfo);
        Intrinsics.checkNotNullParameter(rating, "rating");
        this.rating = rating;
        this.label = commonAtomLabelDTO;
        this.preset = labelRatingPreset;
        this.style = labelRatingStyle;
        this.action = atomActionDTO;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
