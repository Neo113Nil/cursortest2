package ru.ozon.app.android.atoms.data.productMedia;

import C.o0;
import D40.c;
import N3.C3660k;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.app.android.atoms.data.common.CornerRadius;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 R2\u00020\u0001:\bRSTUVWXYB¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00105\u001a\u000206H\u0016J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0019HÆ\u0003J¶\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u000206J\u0013\u0010H\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u000206HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\u0016\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u000206R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006Z"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "context", "", "image", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Image;", "width", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Width;", "ratio", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Ratio;", "radius", "Lru/ozon/app/android/atoms/data/common/CornerRadius;", "backgroundColor", "border", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Border;", "hasParanja", "", "hasOverlay", "icon", "Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "label", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Label;", "smallIcon", "smallLabel", "common", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Image;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Width;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Ratio;Lru/ozon/app/android/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Border;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Label;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)V", "getContext", "()Ljava/lang/String;", "getImage", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Image;", "getWidth", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Width;", "getRatio", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Ratio;", "getRadius", "()Lru/ozon/app/android/atoms/data/common/CornerRadius;", "getBackgroundColor", "getBorder", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Border;", "getHasParanja", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasOverlay", "getIcon", "()Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;", "getLabel", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Label;", "getSmallIcon", "getSmallLabel", "getCommon", "()Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Image;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Width;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Ratio;Lru/ozon/app/android/atoms/data/common/CornerRadius;Ljava/lang/String;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Border;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Label;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Image", "Border", "Label", "FitType", "Width", "Ratio", "BorderStyle", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductMediaDTO extends AtomDTO {
    public static final int $stable = 0;
    private static final int DEFAULT_BORDER_WIDTH = 2;
    private final String backgroundColor;
    private final Border border;
    private final CommonControlSettings common;
    private final String context;
    private final Boolean hasOverlay;
    private final Boolean hasParanja;
    private final CommonAtomIconDTO icon;
    private final Image image;
    private final Label label;
    private final CornerRadius radius;
    private final Ratio ratio;
    private final String smallIcon;
    private final String smallLabel;
    private final Width width;

    @NotNull
    public static final Parcelable.Creator<ProductMediaDTO> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$BorderStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "DASH", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BorderStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BorderStyle[] $VALUES;
        public static final BorderStyle SOLID = new BorderStyle("SOLID", 0);
        public static final BorderStyle DASH = new BorderStyle("DASH", 1);

        private static final /* synthetic */ BorderStyle[] $values() {
            return new BorderStyle[]{SOLID, DASH};
        }

        static {
            BorderStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BorderStyle(String str, int i11) {
        }

        @NotNull
        public static a<BorderStyle> getEntries() {
            return $ENTRIES;
        }

        public static BorderStyle valueOf(String str) {
            return (BorderStyle) Enum.valueOf(BorderStyle.class, str);
        }

        public static BorderStyle[] values() {
            return (BorderStyle[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductMediaDTO> {
        @Override // android.os.Parcelable.Creator
        public final ProductMediaDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Image createFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            Width valueOf3 = parcel.readInt() == 0 ? null : Width.valueOf(parcel.readString());
            Ratio valueOf4 = parcel.readInt() == 0 ? null : Ratio.valueOf(parcel.readString());
            CornerRadius valueOf5 = parcel.readInt() == 0 ? null : CornerRadius.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            Border createFromParcel2 = parcel.readInt() == 0 ? null : Border.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProductMediaDTO(readString, createFromParcel, valueOf3, valueOf4, valueOf5, readString2, createFromParcel2, valueOf, valueOf2, parcel.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Label.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductMediaDTO[] newArray(int i11) {
            return new ProductMediaDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "FIT_CENTER", "FILL_CENTER", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FitType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FitType[] $VALUES;
        public static final FitType FIT_CENTER = new FitType("FIT_CENTER", 0);
        public static final FitType FILL_CENTER = new FitType("FILL_CENTER", 1);

        private static final /* synthetic */ FitType[] $values() {
            return new FitType[]{FIT_CENTER, FILL_CENTER};
        }

        static {
            FitType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FitType(String str, int i11) {
        }

        @NotNull
        public static a<FitType> getEntries() {
            return $ENTRIES;
        }

        public static FitType valueOf(String str) {
            return (FitType) Enum.valueOf(FitType.class, str);
        }

        public static FitType[] values() {
            return (FitType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Ratio;", "", "<init>", "(Ljava/lang/String;I)V", "RATIO_1_1", "RATIO_3_4", "RATIO_4_3", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ratio {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Ratio[] $VALUES;
        public static final Ratio RATIO_1_1 = new Ratio("RATIO_1_1", 0);
        public static final Ratio RATIO_3_4 = new Ratio("RATIO_3_4", 1);
        public static final Ratio RATIO_4_3 = new Ratio("RATIO_4_3", 2);

        private static final /* synthetic */ Ratio[] $values() {
            return new Ratio[]{RATIO_1_1, RATIO_3_4, RATIO_4_3};
        }

        static {
            Ratio[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Ratio(String str, int i11) {
        }

        @NotNull
        public static a<Ratio> getEntries() {
            return $ENTRIES;
        }

        public static Ratio valueOf(String str) {
            return (Ratio) Enum.valueOf(Ratio.class, str);
        }

        public static Ratio[] values() {
            return (Ratio[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Width;", "", "dp", "", "<init>", "(Ljava/lang/String;II)V", "getDp", "()I", "WIDTH_300", "WIDTH_400", "WIDTH_500", "WIDTH_600", "WIDTH_700", "WIDTH_800", "WIDTH_900", "WIDTH_1000", "WIDTH_1100", "WIDTH_1200", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Width {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Width[] $VALUES;
        private final int dp;
        public static final Width WIDTH_300 = new Width("WIDTH_300", 0, 24);
        public static final Width WIDTH_400 = new Width("WIDTH_400", 1, 32);
        public static final Width WIDTH_500 = new Width("WIDTH_500", 2, 44);
        public static final Width WIDTH_600 = new Width("WIDTH_600", 3, 56);
        public static final Width WIDTH_700 = new Width("WIDTH_700", 4, 72);
        public static final Width WIDTH_800 = new Width("WIDTH_800", 5, 88);
        public static final Width WIDTH_900 = new Width("WIDTH_900", 6, 112);
        public static final Width WIDTH_1000 = new Width("WIDTH_1000", 7, 132);
        public static final Width WIDTH_1100 = new Width("WIDTH_1100", 8, 156);
        public static final Width WIDTH_1200 = new Width("WIDTH_1200", 9, 206);

        private static final /* synthetic */ Width[] $values() {
            return new Width[]{WIDTH_300, WIDTH_400, WIDTH_500, WIDTH_600, WIDTH_700, WIDTH_800, WIDTH_900, WIDTH_1000, WIDTH_1100, WIDTH_1200};
        }

        static {
            Width[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Width(String str, int i11, int i12) {
            this.dp = i12;
        }

        @NotNull
        public static a<Width> getEntries() {
            return $ENTRIES;
        }

        public static Width valueOf(String str) {
            return (Width) Enum.valueOf(Width.class, str);
        }

        public static Width[] values() {
            return (Width[]) $VALUES.clone();
        }

        public final int getDp() {
            return this.dp;
        }
    }

    public ProductMediaDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component10, reason: from getter */
    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component11, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSmallLabel() {
        return this.smallLabel;
    }

    /* renamed from: component14, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final Width getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final Ratio getRatio() {
        return this.ratio;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getRadius() {
        return this.radius;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final Border getBorder() {
        return this.border;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHasParanja() {
        return this.hasParanja;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getHasOverlay() {
        return this.hasOverlay;
    }

    @NotNull
    public final ProductMediaDTO copy(String context, Image image, Width width, Ratio ratio, CornerRadius radius, String backgroundColor, Border border, Boolean hasParanja, Boolean hasOverlay, CommonAtomIconDTO icon, Label label, String smallIcon, String smallLabel, CommonControlSettings common) {
        return new ProductMediaDTO(context, image, width, ratio, radius, backgroundColor, border, hasParanja, hasOverlay, icon, label, smallIcon, smallLabel, common);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMediaDTO)) {
            return false;
        }
        ProductMediaDTO productMediaDTO = (ProductMediaDTO) other;
        return Intrinsics.d(this.context, productMediaDTO.context) && Intrinsics.d(this.image, productMediaDTO.image) && this.width == productMediaDTO.width && this.ratio == productMediaDTO.ratio && this.radius == productMediaDTO.radius && Intrinsics.d(this.backgroundColor, productMediaDTO.backgroundColor) && Intrinsics.d(this.border, productMediaDTO.border) && Intrinsics.d(this.hasParanja, productMediaDTO.hasParanja) && Intrinsics.d(this.hasOverlay, productMediaDTO.hasOverlay) && Intrinsics.d(this.icon, productMediaDTO.icon) && Intrinsics.d(this.label, productMediaDTO.label) && Intrinsics.d(this.smallIcon, productMediaDTO.smallIcon) && Intrinsics.d(this.smallLabel, productMediaDTO.smallLabel) && Intrinsics.d(this.common, productMediaDTO.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.app.android.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Boolean getHasOverlay() {
        return this.hasOverlay;
    }

    public final Boolean getHasParanja() {
        return this.hasParanja;
    }

    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    public final Image getImage() {
        return this.image;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.productMedia;
    }

    public final Label getLabel() {
        return this.label;
    }

    public final CornerRadius getRadius() {
        return this.radius;
    }

    public final Ratio getRatio() {
        return this.ratio;
    }

    public final String getSmallIcon() {
        return this.smallIcon;
    }

    public final String getSmallLabel() {
        return this.smallLabel;
    }

    public final Width getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.context;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Width width = this.width;
        int hashCode3 = (hashCode2 + (width == null ? 0 : width.hashCode())) * 31;
        Ratio ratio = this.ratio;
        int hashCode4 = (hashCode3 + (ratio == null ? 0 : ratio.hashCode())) * 31;
        CornerRadius cornerRadius = this.radius;
        int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Border border = this.border;
        int hashCode7 = (hashCode6 + (border == null ? 0 : border.hashCode())) * 31;
        Boolean bool = this.hasParanja;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasOverlay;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        int hashCode10 = (hashCode9 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        Label label = this.label;
        int hashCode11 = (hashCode10 + (label == null ? 0 : label.hashCode())) * 31;
        String str3 = this.smallIcon;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.smallLabel;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode13 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductMediaDTO(context=" + this.context + ", image=" + this.image + ", width=" + this.width + ", ratio=" + this.ratio + ", radius=" + this.radius + ", backgroundColor=" + this.backgroundColor + ", border=" + this.border + ", hasParanja=" + this.hasParanja + ", hasOverlay=" + this.hasOverlay + ", icon=" + this.icon + ", label=" + this.label + ", smallIcon=" + this.smallIcon + ", smallLabel=" + this.smallLabel + ", common=" + this.common + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        Image image = this.image;
        if (image == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            image.writeToParcel(dest, flags);
        }
        Width width = this.width;
        if (width == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(width.name());
        }
        Ratio ratio = this.ratio;
        if (ratio == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ratio.name());
        }
        CornerRadius cornerRadius = this.radius;
        if (cornerRadius == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cornerRadius.name());
        }
        dest.writeString(this.backgroundColor);
        Border border = this.border;
        if (border == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            border.writeToParcel(dest, flags);
        }
        Boolean bool = this.hasParanja;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.hasOverlay;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        if (commonAtomIconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomIconDTO.writeToParcel(dest, flags);
        }
        Label label = this.label;
        if (label == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            label.writeToParcel(dest, flags);
        }
        dest.writeString(this.smallIcon);
        dest.writeString(this.smallLabel);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ ProductMediaDTO(String str, Image image, Width width, Ratio ratio, CornerRadius cornerRadius, String str2, Border border, Boolean bool, Boolean bool2, CommonAtomIconDTO commonAtomIconDTO, Label label, String str3, String str4, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : image, (i11 & 4) != 0 ? Width.WIDTH_500 : width, (i11 & 8) != 0 ? Ratio.RATIO_1_1 : ratio, (i11 & 16) != 0 ? CornerRadius.RADIUS_300 : cornerRadius, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : border, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Boolean.FALSE : bool, (i11 & 256) != 0 ? Boolean.FALSE : bool2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : commonAtomIconDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : label, (i11 & 2048) != 0 ? null : str3, (i11 & 4096) != 0 ? null : str4, (i11 & 8192) != 0 ? null : commonControlSettings);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Image;", "Landroid/os/Parcelable;", ImagesContract.URL, "", "fitType", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$FitType;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$FitType;)V", "getUrl", "()Ljava/lang/String;", "getFitType", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$FitType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @NotNull
        private final FitType fitType;

        @NotNull
        private final String url;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image(parcel.readString(), FitType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i11) {
                return new Image[i11];
            }
        }

        public Image(@NotNull String url, @NotNull FitType fitType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(fitType, "fitType");
            this.url = url;
            this.fitType = fitType;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, FitType fitType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.url;
            }
            if ((i11 & 2) != 0) {
                fitType = image.fitType;
            }
            return image.copy(str, fitType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final FitType getFitType() {
            return this.fitType;
        }

        @NotNull
        public final Image copy(@NotNull String url, @NotNull FitType fitType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(fitType, "fitType");
            return new Image(url, fitType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.url, image.url) && this.fitType == image.fitType;
        }

        @NotNull
        public final FitType getFitType() {
            return this.fitType;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.fitType.hashCode() + (this.url.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Image(url=" + this.url + ", fitType=" + this.fitType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.url);
            dest.writeString(this.fitType.name());
        }

        public /* synthetic */ Image(String str, FitType fitType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? FitType.FIT_CENTER : fitType);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Border;", "Landroid/os/Parcelable;", "style", "Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$BorderStyle;", "color", "", "width", "", "<init>", "(Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$BorderStyle;Ljava/lang/String;Ljava/lang/Integer;)V", "getStyle", "()Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$BorderStyle;", "getColor", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$BorderStyle;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Border;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Border implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Border> CREATOR = new Creator();
        private final String color;

        @NotNull
        private final BorderStyle style;
        private final Integer width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Border> {
            @Override // android.os.Parcelable.Creator
            public final Border createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Border(BorderStyle.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Border[] newArray(int i11) {
                return new Border[i11];
            }
        }

        public Border(@NotNull BorderStyle style, String str, Integer num) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.style = style;
            this.color = str;
            this.width = num;
        }

        public static /* synthetic */ Border copy$default(Border border, BorderStyle borderStyle, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                borderStyle = border.style;
            }
            if ((i11 & 2) != 0) {
                str = border.color;
            }
            if ((i11 & 4) != 0) {
                num = border.width;
            }
            return border.copy(borderStyle, str, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BorderStyle getStyle() {
            return this.style;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        @NotNull
        public final Border copy(@NotNull BorderStyle style, String color, Integer width) {
            Intrinsics.checkNotNullParameter(style, "style");
            return new Border(style, color, width);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Border)) {
                return false;
            }
            Border border = (Border) other;
            return this.style == border.style && Intrinsics.d(this.color, border.color) && Intrinsics.d(this.width, border.width);
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final BorderStyle getStyle() {
            return this.style;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            int hashCode = this.style.hashCode() * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.width;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            BorderStyle borderStyle = this.style;
            String str = this.color;
            Integer num = this.width;
            StringBuilder sb2 = new StringBuilder("Border(style=");
            sb2.append(borderStyle);
            sb2.append(", color=");
            sb2.append(str);
            sb2.append(", width=");
            return Ep.a.c(sb2, num, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.style.name());
            dest.writeString(this.color);
            Integer num = this.width;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
        }

        public /* synthetic */ Border(BorderStyle borderStyle, String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(borderStyle, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 2 : num);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/data/productMedia/ProductMediaDTO$Label;", "Landroid/os/Parcelable;", "text", "", "color", "typographyToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getColor", "getTypographyToken", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Label implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Label> CREATOR = new Creator();
        private final String color;

        @NotNull
        private final String text;
        private final String typographyToken;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Label> {
            @Override // android.os.Parcelable.Creator
            public final Label createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Label(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Label[] newArray(int i11) {
                return new Label[i11];
            }
        }

        public Label(@NotNull String text, String str, String str2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = str;
            this.typographyToken = str2;
        }

        public static /* synthetic */ Label copy$default(Label label, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = label.text;
            }
            if ((i11 & 2) != 0) {
                str2 = label.color;
            }
            if ((i11 & 4) != 0) {
                str3 = label.typographyToken;
            }
            return label.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTypographyToken() {
            return this.typographyToken;
        }

        @NotNull
        public final Label copy(@NotNull String text, String color, String typographyToken) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Label(text, color, typographyToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.d(this.text, label.text) && Intrinsics.d(this.color, label.color) && Intrinsics.d(this.typographyToken, label.typographyToken);
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final String getTypographyToken() {
            return this.typographyToken;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.typographyToken;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.color;
            return o0.c(C3660k.d("Label(text=", str, ", color=", str2, ", typographyToken="), this.typographyToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeString(this.color);
            dest.writeString(this.typographyToken);
        }

        public /* synthetic */ Label(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }
    }

    public ProductMediaDTO(String str, Image image, Width width, Ratio ratio, CornerRadius cornerRadius, String str2, Border border, Boolean bool, Boolean bool2, CommonAtomIconDTO commonAtomIconDTO, Label label, String str3, String str4, CommonControlSettings commonControlSettings) {
        super(DsAtomsType.PRODUCT_MEDIA, str, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        this.context = str;
        this.image = image;
        this.width = width;
        this.ratio = ratio;
        this.radius = cornerRadius;
        this.backgroundColor = str2;
        this.border = border;
        this.hasParanja = bool;
        this.hasOverlay = bool2;
        this.icon = commonAtomIconDTO;
        this.label = label;
        this.smallIcon = str3;
        this.smallLabel = str4;
        this.common = commonControlSettings;
    }
}
