package ru.ozon.uni.atoms.data.selectionControls.checkbox;

import C.J;
import C.o0;
import De.C2859b;
import N3.C3660k;
import Xc.a;
import Xc.b;
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
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004CDEFB\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0092\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\u0010J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0010HÖ\u0001J\t\u0010=\u001a\u00020\tHÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'¨\u0006G"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "size", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "status", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "state", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "quantity", "", "customStyle", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;", "customInvalidStyle", "customDisabledStyle", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;)V", "getSize", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "getStatus", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "getState", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCustomStyle", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;", "getCustomInvalidStyle", "getCustomDisabledStyle", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;)Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CheckBoxSize", "CheckboxStatus", "CheckboxState", "Style", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CheckBoxDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CheckBoxDTO> CREATOR = new Creator();
    private final String context;
    private final Style customDisabledStyle;
    private final Style customInvalidStyle;
    private final Style customStyle;
    private final Integer quantity;

    @EnumNullFallback
    private final CheckBoxSize size;

    @EnumNullFallback
    private final CheckboxState state;

    @EnumNullFallback
    private final CheckboxStatus status;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckBoxSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CheckBoxSize[] $VALUES;
        public static final CheckBoxSize SIZE_500 = new CheckBoxSize("SIZE_500", 0);
        public static final CheckBoxSize SIZE_600 = new CheckBoxSize("SIZE_600", 1);

        private static final /* synthetic */ CheckBoxSize[] $values() {
            return new CheckBoxSize[]{SIZE_500, SIZE_600};
        }

        static {
            CheckBoxSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CheckBoxSize(String str, int i11) {
        }

        @NotNull
        public static a<CheckBoxSize> getEntries() {
            return $ENTRIES;
        }

        public static CheckBoxSize valueOf(String str) {
            return (CheckBoxSize) Enum.valueOf(CheckBoxSize.class, str);
        }

        public static CheckBoxSize[] values() {
            return (CheckBoxSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "ERROR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckboxState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CheckboxState[] $VALUES;
        public static final CheckboxState ENABLED = new CheckboxState("ENABLED", 0);
        public static final CheckboxState DISABLED = new CheckboxState("DISABLED", 1);
        public static final CheckboxState ERROR = new CheckboxState("ERROR", 2);

        private static final /* synthetic */ CheckboxState[] $values() {
            return new CheckboxState[]{ENABLED, DISABLED, ERROR};
        }

        static {
            CheckboxState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CheckboxState(String str, int i11) {
        }

        @NotNull
        public static a<CheckboxState> getEntries() {
            return $ENTRIES;
        }

        public static CheckboxState valueOf(String str) {
            return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
        }

        public static CheckboxState[] values() {
            return (CheckboxState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", "SELECTED", "INDETERMINATE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckboxStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CheckboxStatus[] $VALUES;
        public static final CheckboxStatus EMPTY = new CheckboxStatus("EMPTY", 0);
        public static final CheckboxStatus SELECTED = new CheckboxStatus("SELECTED", 1);
        public static final CheckboxStatus INDETERMINATE = new CheckboxStatus("INDETERMINATE", 2);

        private static final /* synthetic */ CheckboxStatus[] $values() {
            return new CheckboxStatus[]{EMPTY, SELECTED, INDETERMINATE};
        }

        static {
            CheckboxStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CheckboxStatus(String str, int i11) {
        }

        @NotNull
        public static a<CheckboxStatus> getEntries() {
            return $ENTRIES;
        }

        public static CheckboxStatus valueOf(String str) {
            return (CheckboxStatus) Enum.valueOf(CheckboxStatus.class, str);
        }

        public static CheckboxStatus[] values() {
            return (CheckboxStatus[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<CheckBoxDTO> {
        @Override // android.os.Parcelable.Creator
        public final CheckBoxDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CheckBoxSize valueOf = parcel.readInt() == 0 ? null : CheckBoxSize.valueOf(parcel.readString());
            CheckboxStatus valueOf2 = parcel.readInt() == 0 ? null : CheckboxStatus.valueOf(parcel.readString());
            CheckboxState valueOf3 = parcel.readInt() == 0 ? null : CheckboxState.valueOf(parcel.readString());
            String readString = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(CheckBoxDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CheckBoxDTO(valueOf, valueOf2, valueOf3, readString, createFromParcel, linkedHashMap, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Style.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckBoxDTO[] newArray(int i11) {
            return new CheckBoxDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;", "Landroid/os/Parcelable;", "backgroundColor", "", "borderColor", "color", "iconColor", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getColor", "getIconColor", "getTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Style implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Style> CREATOR = new Creator();
        private final String backgroundColor;
        private final String borderColor;
        private final String color;
        private final String iconColor;
        private final String textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Style> {
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Style(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i11) {
                return new Style[i11];
            }
        }

        public Style() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Style copy$default(Style style, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = style.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = style.borderColor;
            }
            if ((i11 & 4) != 0) {
                str3 = style.color;
            }
            if ((i11 & 8) != 0) {
                str4 = style.iconColor;
            }
            if ((i11 & 16) != 0) {
                str5 = style.textColor;
            }
            String str6 = str5;
            String str7 = str3;
            return style.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final Style copy(String backgroundColor, String borderColor, String color, String iconColor, String textColor) {
            return new Style(backgroundColor, borderColor, color, iconColor, textColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return Intrinsics.d(this.backgroundColor, style.backgroundColor) && Intrinsics.d(this.borderColor, style.borderColor) && Intrinsics.d(this.color, style.color) && Intrinsics.d(this.iconColor, style.iconColor) && Intrinsics.d(this.textColor, style.textColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final String getColor() {
            return this.color;
        }

        public final String getIconColor() {
            return this.iconColor;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.borderColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.color;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.iconColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.textColor;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.borderColor;
            String str3 = this.color;
            String str4 = this.iconColor;
            String str5 = this.textColor;
            StringBuilder d11 = C3660k.d("Style(backgroundColor=", str, ", borderColor=", str2, ", color=");
            Nh.a.h(d11, str3, ", iconColor=", str4, ", textColor=");
            return o0.c(d11, str5, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.backgroundColor);
            dest.writeString(this.borderColor);
            dest.writeString(this.color);
            dest.writeString(this.iconColor);
            dest.writeString(this.textColor);
        }

        public Style(String str, String str2, String str3, String str4, String str5) {
            this.backgroundColor = str;
            this.borderColor = str2;
            this.color = str3;
            this.iconColor = str4;
            this.textColor = str5;
        }

        public /* synthetic */ Style(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
        }
    }

    public CheckBoxDTO() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CheckBoxDTO copy$default(CheckBoxDTO checkBoxDTO, CheckBoxSize checkBoxSize, CheckboxStatus checkboxStatus, CheckboxState checkboxState, String str, TestInfo testInfo, Map map, Integer num, Style style, Style style2, Style style3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkBoxSize = checkBoxDTO.size;
        }
        if ((i11 & 2) != 0) {
            checkboxStatus = checkBoxDTO.status;
        }
        if ((i11 & 4) != 0) {
            checkboxState = checkBoxDTO.state;
        }
        if ((i11 & 8) != 0) {
            str = checkBoxDTO.context;
        }
        if ((i11 & 16) != 0) {
            testInfo = checkBoxDTO.testInfo;
        }
        if ((i11 & 32) != 0) {
            map = checkBoxDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            num = checkBoxDTO.quantity;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            style = checkBoxDTO.customStyle;
        }
        if ((i11 & 256) != 0) {
            style2 = checkBoxDTO.customInvalidStyle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            style3 = checkBoxDTO.customDisabledStyle;
        }
        Style style4 = style2;
        Style style5 = style3;
        Integer num2 = num;
        Style style6 = style;
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return checkBoxDTO.copy(checkBoxSize, checkboxStatus, checkboxState, str, testInfo2, map2, num2, style6, style4, style5);
    }

    /* renamed from: component1, reason: from getter */
    public final CheckBoxSize getSize() {
        return this.size;
    }

    /* renamed from: component10, reason: from getter */
    public final Style getCustomDisabledStyle() {
        return this.customDisabledStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final CheckboxStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final CheckboxState getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component8, reason: from getter */
    public final Style getCustomStyle() {
        return this.customStyle;
    }

    /* renamed from: component9, reason: from getter */
    public final Style getCustomInvalidStyle() {
        return this.customInvalidStyle;
    }

    @NotNull
    public final CheckBoxDTO copy(CheckBoxSize size, CheckboxStatus status, CheckboxState state, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Integer quantity, Style customStyle, Style customInvalidStyle, Style customDisabledStyle) {
        return new CheckBoxDTO(size, status, state, context, testInfo, trackingInfo, quantity, customStyle, customInvalidStyle, customDisabledStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBoxDTO)) {
            return false;
        }
        CheckBoxDTO checkBoxDTO = (CheckBoxDTO) other;
        return this.size == checkBoxDTO.size && this.status == checkBoxDTO.status && this.state == checkBoxDTO.state && Intrinsics.d(this.context, checkBoxDTO.context) && Intrinsics.d(this.testInfo, checkBoxDTO.testInfo) && Intrinsics.d(this.trackingInfo, checkBoxDTO.trackingInfo) && Intrinsics.d(this.quantity, checkBoxDTO.quantity) && Intrinsics.d(this.customStyle, checkBoxDTO.customStyle) && Intrinsics.d(this.customInvalidStyle, checkBoxDTO.customInvalidStyle) && Intrinsics.d(this.customDisabledStyle, checkBoxDTO.customDisabledStyle);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Style getCustomDisabledStyle() {
        return this.customDisabledStyle;
    }

    public final Style getCustomInvalidStyle() {
        return this.customInvalidStyle;
    }

    public final Style getCustomStyle() {
        return this.customStyle;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.checkbox;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final CheckBoxSize getSize() {
        return this.size;
    }

    public final CheckboxState getState() {
        return this.state;
    }

    public final CheckboxStatus getStatus() {
        return this.status;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        CheckBoxSize checkBoxSize = this.size;
        int hashCode = (checkBoxSize == null ? 0 : checkBoxSize.hashCode()) * 31;
        CheckboxStatus checkboxStatus = this.status;
        int hashCode2 = (hashCode + (checkboxStatus == null ? 0 : checkboxStatus.hashCode())) * 31;
        CheckboxState checkboxState = this.state;
        int hashCode3 = (hashCode2 + (checkboxState == null ? 0 : checkboxState.hashCode())) * 31;
        String str = this.context;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Style style = this.customStyle;
        int hashCode8 = (hashCode7 + (style == null ? 0 : style.hashCode())) * 31;
        Style style2 = this.customInvalidStyle;
        int hashCode9 = (hashCode8 + (style2 == null ? 0 : style2.hashCode())) * 31;
        Style style3 = this.customDisabledStyle;
        return hashCode9 + (style3 != null ? style3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckBoxDTO(size=" + this.size + ", status=" + this.status + ", state=" + this.state + ", context=" + this.context + ", testInfo=" + this.testInfo + ", trackingInfo=" + this.trackingInfo + ", quantity=" + this.quantity + ", customStyle=" + this.customStyle + ", customInvalidStyle=" + this.customInvalidStyle + ", customDisabledStyle=" + this.customDisabledStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CheckBoxSize checkBoxSize = this.size;
        if (checkBoxSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(checkBoxSize.name());
        }
        CheckboxStatus checkboxStatus = this.status;
        if (checkboxStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(checkboxStatus.name());
        }
        CheckboxState checkboxState = this.state;
        if (checkboxState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(checkboxState.name());
        }
        dest.writeString(this.context);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
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
        Integer num = this.quantity;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Style style = this.customStyle;
        if (style == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            style.writeToParcel(dest, flags);
        }
        Style style2 = this.customInvalidStyle;
        if (style2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            style2.writeToParcel(dest, flags);
        }
        Style style3 = this.customDisabledStyle;
        if (style3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            style3.writeToParcel(dest, flags);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CheckBoxDTO(ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.CheckBoxSize r2, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.CheckboxStatus r3, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.CheckboxState r4, java.lang.String r5, ru.ozon.uni.atoms.data.TestInfo r6, java.util.Map r7, java.lang.Integer r8, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.Style r9, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.Style r10, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.Style r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$CheckBoxSize r2 = ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.CheckBoxSize.SIZE_500
        L6:
            r13 = r12 & 2
            if (r13 == 0) goto Lc
            ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$CheckboxStatus r3 = ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.CheckboxStatus.EMPTY
        Lc:
            r13 = r12 & 4
            if (r13 == 0) goto L12
            ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$CheckboxState r4 = ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.CheckboxState.ENABLED
        L12:
            r13 = r12 & 8
            r0 = 0
            if (r13 == 0) goto L18
            r5 = r0
        L18:
            r13 = r12 & 16
            if (r13 == 0) goto L1d
            r6 = r0
        L1d:
            r13 = r12 & 32
            if (r13 == 0) goto L22
            r7 = r0
        L22:
            r13 = r12 & 64
            if (r13 == 0) goto L27
            r8 = r0
        L27:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L2c
            r9 = r0
        L2c:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L31
            r10 = r0
        L31:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L41
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4c
        L41:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO.<init>(ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$CheckBoxSize, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$CheckboxStatus, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$CheckboxState, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, java.lang.Integer, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$Style, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$Style, ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO$Style, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public CheckBoxDTO(CheckBoxSize checkBoxSize, CheckboxStatus checkboxStatus, CheckboxState checkboxState, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Integer num, Style style, Style style2, Style style3) {
        super(DsAtomsType.CHECKBOX, str, map, testInfo);
        this.size = checkBoxSize;
        this.status = checkboxStatus;
        this.state = checkboxState;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.quantity = num;
        this.customStyle = style;
        this.customInvalidStyle = style2;
        this.customDisabledStyle = style3;
    }
}
