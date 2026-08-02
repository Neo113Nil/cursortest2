package ru.ozon.app.android.atoms.data.common;

import B0.C2454a;
import C.J;
import D40.c;
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
import oi.C8740d;
import org.jetbrains.annotations.NotNull;
import pi.k;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.AtomTypeImpl;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0004TUVWB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b.\u0010\u001bJ\u0012\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u001e\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b5\u00106J¨\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010$J\u0010\u0010:\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b:\u0010\u001bJ\u001a\u0010=\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\bA\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bN\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bO\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00104R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010R\u001a\u0004\bS\u00106¨\u0006X"}, d2 = {"Lru/ozon/app/android/atoms/data/common/TooltipDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "hasCloseIcon", "Lru/ozon/app/android/atoms/data/common/TooltipDTO$StyleType;", "styleType", "Lru/ozon/app/android/atoms/data/common/TooltipDTO$SizeType;", "sizeType", "Lru/ozon/app/android/atoms/data/common/TooltipDTO$BeakPosition;", "beakPosition", "", "minWidth", "Loi/d;", "leftMargin", "rightMargin", "context", "Lru/ozon/app/android/atoms/data/TestInfo;", "testInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/TooltipDTO$StyleType;Lru/ozon/app/android/atoms/data/common/TooltipDTO$SizeType;Lru/ozon/app/android/atoms/data/common/TooltipDTO$BeakPosition;ILoi/d;Loi/d;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)V", "getItemType", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lru/ozon/app/android/atoms/data/common/TooltipDTO$StyleType;", "component5", "()Lru/ozon/app/android/atoms/data/common/TooltipDTO$SizeType;", "component6", "()Lru/ozon/app/android/atoms/data/common/TooltipDTO$BeakPosition;", "component7", "component8", "()Loi/d;", "component9", "component10", "component11", "()Lru/ozon/app/android/atoms/data/TestInfo;", "component12", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/TooltipDTO$StyleType;Lru/ozon/app/android/atoms/data/common/TooltipDTO$SizeType;Lru/ozon/app/android/atoms/data/common/TooltipDTO$BeakPosition;ILoi/d;Loi/d;Ljava/lang/String;Lru/ozon/app/android/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/common/TooltipDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "getHasCloseIcon", "Lru/ozon/app/android/atoms/data/common/TooltipDTO$StyleType;", "getStyleType", "Lru/ozon/app/android/atoms/data/common/TooltipDTO$SizeType;", "getSizeType", "Lru/ozon/app/android/atoms/data/common/TooltipDTO$BeakPosition;", "getBeakPosition", "I", "getMinWidth", "Loi/d;", "getLeftMargin", "getRightMargin", "getContext", "Lru/ozon/app/android/atoms/data/TestInfo;", "getTestInfo", "Ljava/util/Map;", "getTrackingInfo", "Companion", "BeakPosition", "SizeType", "StyleType", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TooltipDTO extends AtomDTO {
    public static final int TOOLTIP_MIN_WIDTH = 100;
    private final BeakPosition beakPosition;
    private final String context;
    private final Boolean hasCloseIcon;
    private final C8740d leftMargin;
    private final int minWidth;
    private final C8740d rightMargin;
    private final SizeType sizeType;
    private final StyleType styleType;
    private final String subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<TooltipDTO> CREATOR = new Creator();

    @NotNull
    private static final SizeType DefaultSizeType = SizeType.FIXED;

    @NotNull
    private static final StyleType DefaultStyleType = StyleType.DEFAULT;

    @NotNull
    private static final BeakPosition DefaultBeakPosition = BeakPosition.BOTTOM_CENTER;

    @NotNull
    private static final C8740d DefaultLeftMargin = k.d().f();

    @NotNull
    private static final C8740d DefaultRightMargin = k.d().f();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/common/TooltipDTO$BeakPosition;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOM_CENTER", "BOTTOM_CUSTOM", "TOP_CENTER", "TOP_CUSTOM", "LEFT_CENTER", "RIGHT_CENTER", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BeakPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BeakPosition[] $VALUES;
        public static final BeakPosition BOTTOM_CENTER = new BeakPosition("BOTTOM_CENTER", 0);
        public static final BeakPosition BOTTOM_CUSTOM = new BeakPosition("BOTTOM_CUSTOM", 1);
        public static final BeakPosition TOP_CENTER = new BeakPosition("TOP_CENTER", 2);
        public static final BeakPosition TOP_CUSTOM = new BeakPosition("TOP_CUSTOM", 3);
        public static final BeakPosition LEFT_CENTER = new BeakPosition("LEFT_CENTER", 4);
        public static final BeakPosition RIGHT_CENTER = new BeakPosition("RIGHT_CENTER", 5);

        private static final /* synthetic */ BeakPosition[] $values() {
            return new BeakPosition[]{BOTTOM_CENTER, BOTTOM_CUSTOM, TOP_CENTER, TOP_CUSTOM, LEFT_CENTER, RIGHT_CENTER};
        }

        static {
            BeakPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BeakPosition(String str, int i11) {
        }

        @NotNull
        public static a<BeakPosition> getEntries() {
            return $ENTRIES;
        }

        public static BeakPosition valueOf(String str) {
            return (BeakPosition) Enum.valueOf(BeakPosition.class, str);
        }

        public static BeakPosition[] values() {
            return (BeakPosition[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TooltipDTO> {
        @Override // android.os.Parcelable.Creator
        public final TooltipDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel2.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel2.readInt() != 0);
            }
            StyleType valueOf2 = parcel2.readInt() == 0 ? null : StyleType.valueOf(parcel2.readString());
            SizeType valueOf3 = parcel2.readInt() == 0 ? null : SizeType.valueOf(parcel2.readString());
            BeakPosition valueOf4 = parcel2.readInt() == 0 ? null : BeakPosition.valueOf(parcel2.readString());
            Boolean bool = valueOf;
            int readInt = parcel2.readInt();
            C8740d c8740d = (C8740d) parcel2.readParcelable(TooltipDTO.class.getClassLoader());
            C8740d c8740d2 = (C8740d) parcel2.readParcelable(TooltipDTO.class.getClassLoader());
            BeakPosition beakPosition = valueOf4;
            String readString3 = parcel2.readString();
            TestInfo createFromParcel = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() != 0) {
                int readInt2 = parcel2.readInt();
                int i11 = 0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                while (i11 != readInt2) {
                    i11 = C2859b.a(TooltipDTO.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    readInt2 = readInt2;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TooltipDTO(readString, readString2, bool, valueOf2, valueOf3, beakPosition, readInt, c8740d, c8740d2, readString3, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TooltipDTO[] newArray(int i11) {
            return new TooltipDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/common/TooltipDTO$SizeType;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED", "HUG", "FILLED", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SizeType[] $VALUES;
        public static final SizeType FIXED = new SizeType("FIXED", 0);
        public static final SizeType HUG = new SizeType("HUG", 1);
        public static final SizeType FILLED = new SizeType("FILLED", 2);

        private static final /* synthetic */ SizeType[] $values() {
            return new SizeType[]{FIXED, HUG, FILLED};
        }

        static {
            SizeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SizeType(String str, int i11) {
        }

        @NotNull
        public static a<SizeType> getEntries() {
            return $ENTRIES;
        }

        public static SizeType valueOf(String str) {
            return (SizeType) Enum.valueOf(SizeType.class, str);
        }

        public static SizeType[] values() {
            return (SizeType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/common/TooltipDTO$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "STATIC_LIGHT", "STATIC_DARK", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;
        public static final StyleType DEFAULT = new StyleType("DEFAULT", 0);
        public static final StyleType STATIC_LIGHT = new StyleType("STATIC_LIGHT", 1);
        public static final StyleType STATIC_DARK = new StyleType("STATIC_DARK", 2);

        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{DEFAULT, STATIC_LIGHT, STATIC_DARK};
        }

        static {
            StyleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleType(String str, int i11) {
        }

        @NotNull
        public static a<StyleType> getEntries() {
            return $ENTRIES;
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TooltipDTO(String str, String str2, Boolean bool, StyleType styleType, SizeType sizeType, BeakPosition beakPosition, int i11, C8740d c8740d, C8740d c8740d2, String str3, TestInfo testInfo, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? Boolean.FALSE : bool, (i12 & 8) != 0 ? DefaultStyleType : styleType, (i12 & 16) != 0 ? DefaultSizeType : sizeType, (i12 & 32) != 0 ? DefaultBeakPosition : beakPosition, (i12 & 64) != 0 ? 100 : i11, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? DefaultLeftMargin : c8740d, (i12 & 256) != 0 ? DefaultRightMargin : c8740d2, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str3, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i12 & 2048) != 0 ? null : map);
    }

    public static /* synthetic */ TooltipDTO copy$default(TooltipDTO tooltipDTO, String str, String str2, Boolean bool, StyleType styleType, SizeType sizeType, BeakPosition beakPosition, int i11, C8740d c8740d, C8740d c8740d2, String str3, TestInfo testInfo, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tooltipDTO.title;
        }
        if ((i12 & 2) != 0) {
            str2 = tooltipDTO.subtitle;
        }
        if ((i12 & 4) != 0) {
            bool = tooltipDTO.hasCloseIcon;
        }
        if ((i12 & 8) != 0) {
            styleType = tooltipDTO.styleType;
        }
        if ((i12 & 16) != 0) {
            sizeType = tooltipDTO.sizeType;
        }
        if ((i12 & 32) != 0) {
            beakPosition = tooltipDTO.beakPosition;
        }
        if ((i12 & 64) != 0) {
            i11 = tooltipDTO.minWidth;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            c8740d = tooltipDTO.leftMargin;
        }
        if ((i12 & 256) != 0) {
            c8740d2 = tooltipDTO.rightMargin;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str3 = tooltipDTO.context;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            testInfo = tooltipDTO.testInfo;
        }
        if ((i12 & 2048) != 0) {
            map = tooltipDTO.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        C8740d c8740d3 = c8740d2;
        String str4 = str3;
        int i13 = i11;
        C8740d c8740d4 = c8740d;
        SizeType sizeType2 = sizeType;
        BeakPosition beakPosition2 = beakPosition;
        return tooltipDTO.copy(str, str2, bool, styleType, sizeType2, beakPosition2, i13, c8740d4, c8740d3, str4, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component11, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasCloseIcon() {
        return this.hasCloseIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final StyleType getStyleType() {
        return this.styleType;
    }

    /* renamed from: component5, reason: from getter */
    public final SizeType getSizeType() {
        return this.sizeType;
    }

    /* renamed from: component6, reason: from getter */
    public final BeakPosition getBeakPosition() {
        return this.beakPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: component8, reason: from getter */
    public final C8740d getLeftMargin() {
        return this.leftMargin;
    }

    /* renamed from: component9, reason: from getter */
    public final C8740d getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    public final TooltipDTO copy(@NotNull String title, String subtitle, Boolean hasCloseIcon, StyleType styleType, SizeType sizeType, BeakPosition beakPosition, int minWidth, C8740d leftMargin, C8740d rightMargin, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TooltipDTO(title, subtitle, hasCloseIcon, styleType, sizeType, beakPosition, minWidth, leftMargin, rightMargin, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipDTO)) {
            return false;
        }
        TooltipDTO tooltipDTO = (TooltipDTO) other;
        return Intrinsics.d(this.title, tooltipDTO.title) && Intrinsics.d(this.subtitle, tooltipDTO.subtitle) && Intrinsics.d(this.hasCloseIcon, tooltipDTO.hasCloseIcon) && this.styleType == tooltipDTO.styleType && this.sizeType == tooltipDTO.sizeType && this.beakPosition == tooltipDTO.beakPosition && this.minWidth == tooltipDTO.minWidth && Intrinsics.d(this.leftMargin, tooltipDTO.leftMargin) && Intrinsics.d(this.rightMargin, tooltipDTO.rightMargin) && Intrinsics.d(this.context, tooltipDTO.context) && Intrinsics.d(this.testInfo, tooltipDTO.testInfo) && Intrinsics.d(this.trackingInfo, tooltipDTO.trackingInfo);
    }

    public final BeakPosition getBeakPosition() {
        return this.beakPosition;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Boolean getHasCloseIcon() {
        return this.hasCloseIcon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.tooltip;
    }

    public final C8740d getLeftMargin() {
        return this.leftMargin;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final C8740d getRightMargin() {
        return this.rightMargin;
    }

    public final SizeType getSizeType() {
        return this.sizeType;
    }

    public final StyleType getStyleType() {
        return this.styleType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasCloseIcon;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        StyleType styleType = this.styleType;
        int hashCode4 = (hashCode3 + (styleType == null ? 0 : styleType.hashCode())) * 31;
        SizeType sizeType = this.sizeType;
        int hashCode5 = (hashCode4 + (sizeType == null ? 0 : sizeType.hashCode())) * 31;
        BeakPosition beakPosition = this.beakPosition;
        int a11 = C2454a.a(this.minWidth, (hashCode5 + (beakPosition == null ? 0 : beakPosition.hashCode())) * 31, 31);
        C8740d c8740d = this.leftMargin;
        int hashCode6 = (a11 + (c8740d == null ? 0 : c8740d.hashCode())) * 31;
        C8740d c8740d2 = this.rightMargin;
        int hashCode7 = (hashCode6 + (c8740d2 == null ? 0 : c8740d2.hashCode())) * 31;
        String str2 = this.context;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode9 = (hashCode8 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode9 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        Boolean bool = this.hasCloseIcon;
        StyleType styleType = this.styleType;
        SizeType sizeType = this.sizeType;
        BeakPosition beakPosition = this.beakPosition;
        int i11 = this.minWidth;
        C8740d c8740d = this.leftMargin;
        C8740d c8740d2 = this.rightMargin;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("TooltipDTO(title=", str, ", subtitle=", str2, ", hasCloseIcon=");
        d11.append(bool);
        d11.append(", styleType=");
        d11.append(styleType);
        d11.append(", sizeType=");
        d11.append(sizeType);
        d11.append(", beakPosition=");
        d11.append(beakPosition);
        d11.append(", minWidth=");
        d11.append(i11);
        d11.append(", leftMargin=");
        d11.append(c8740d);
        d11.append(", rightMargin=");
        d11.append(c8740d2);
        d11.append(", context=");
        d11.append(str3);
        d11.append(", testInfo=");
        d11.append(testInfo);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        Boolean bool = this.hasCloseIcon;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        StyleType styleType = this.styleType;
        if (styleType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleType.name());
        }
        SizeType sizeType = this.sizeType;
        if (sizeType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizeType.name());
        }
        BeakPosition beakPosition = this.beakPosition;
        if (beakPosition == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(beakPosition.name());
        }
        dest.writeInt(this.minWidth);
        dest.writeParcelable(this.leftMargin, flags);
        dest.writeParcelable(this.rightMargin, flags);
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
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipDTO(@NotNull String title, String str, Boolean bool, StyleType styleType, SizeType sizeType, BeakPosition beakPosition, int i11, C8740d c8740d, C8740d c8740d2, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.TOOLTIP, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.hasCloseIcon = bool;
        this.styleType = styleType;
        this.sizeType = sizeType;
        this.beakPosition = beakPosition;
        this.minWidth = i11;
        this.leftMargin = c8740d;
        this.rightMargin = c8740d2;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
