package ru.ozon.uni.ozi.atom.models.image;

import C.J;
import Cm.e;
import De.C2859b;
import Kk.C3532b;
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
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.ozi.atom.models.OziAtomsType;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004VWXYBÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00108\u001a\u00020\u0015H\u0016J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bHÆ\u0003JØ\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020\u0015J\u0013\u0010L\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\u0015HÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006Z"}, d2 = {"Lru/ozon/uni/ozi/atom/models/image/OziImageDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "image", "", "backgroundColor", "aspectRatio", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$AspectRatio;", "hasParanja", "", "layoutPaddingLeft", "layoutPaddingRight", "layoutPaddingTop", "layoutPaddingBottom", "cornerRadius", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "imageWidth", "", "imageType", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$ImageType;", "fitType", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$FitType;", "customRatio", "Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$CustomRatio;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$AspectRatio;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$ImageType;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$FitType;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$CustomRatio;)V", "getImage", "()Ljava/lang/String;", "getBackgroundColor", "getAspectRatio", "()Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$AspectRatio;", "getHasParanja", "()Z", "getLayoutPaddingLeft", "getLayoutPaddingRight", "getLayoutPaddingTop", "getLayoutPaddingBottom", "getCornerRadius", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getImageWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageType", "()Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$ImageType;", "getFitType", "()Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$FitType;", "getCustomRatio", "()Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$CustomRatio;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$AspectRatio;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$ImageType;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$FitType;Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$CustomRatio;)Lru/ozon/uni/ozi/atom/models/image/OziImageDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ImageType", "FitType", "AspectRatio", "CustomRatio", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OziImageDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OziImageDTO> CREATOR = new Creator();
    private final AspectRatio aspectRatio;
    private final String backgroundColor;
    private final String context;
    private final String cornerRadius;
    private final CustomRatio customRatio;
    private final FitType fitType;
    private final boolean hasParanja;
    private final String image;
    private final ImageType imageType;
    private final Integer imageWidth;
    private final String layoutPaddingBottom;
    private final String layoutPaddingLeft;
    private final String layoutPaddingRight;
    private final String layoutPaddingTop;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$AspectRatio;", "", "", "widthRatio", "heightRatio", "<init>", "(Ljava/lang/String;III)V", "I", "getWidthRatio", "()I", "getHeightRatio", "RATIO_1_1", "RATIO_2_1", "RATIO_2_3", "RATIO_3_1", "RATIO_3_2", "RATIO_3_4", "RATIO_4_3", "RATIO_5_2", "RATIO_9_16", "RATIO_16_9", "CUSTOM_RATIO", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AspectRatio {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AspectRatio[] $VALUES;
        private final int heightRatio;
        private final int widthRatio;
        public static final AspectRatio RATIO_1_1 = new AspectRatio("RATIO_1_1", 0, 1, 1);
        public static final AspectRatio RATIO_2_1 = new AspectRatio("RATIO_2_1", 1, 2, 1);
        public static final AspectRatio RATIO_2_3 = new AspectRatio("RATIO_2_3", 2, 2, 3);
        public static final AspectRatio RATIO_3_1 = new AspectRatio("RATIO_3_1", 3, 3, 1);
        public static final AspectRatio RATIO_3_2 = new AspectRatio("RATIO_3_2", 4, 3, 2);
        public static final AspectRatio RATIO_3_4 = new AspectRatio("RATIO_3_4", 5, 3, 4);
        public static final AspectRatio RATIO_4_3 = new AspectRatio("RATIO_4_3", 6, 4, 3);
        public static final AspectRatio RATIO_5_2 = new AspectRatio("RATIO_5_2", 7, 5, 2);
        public static final AspectRatio RATIO_9_16 = new AspectRatio("RATIO_9_16", 8, 9, 16);
        public static final AspectRatio RATIO_16_9 = new AspectRatio("RATIO_16_9", 9, 16, 9);
        public static final AspectRatio CUSTOM_RATIO = new AspectRatio("CUSTOM_RATIO", 10, 1, 1);

        private static final /* synthetic */ AspectRatio[] $values() {
            return new AspectRatio[]{RATIO_1_1, RATIO_2_1, RATIO_2_3, RATIO_3_1, RATIO_3_2, RATIO_3_4, RATIO_4_3, RATIO_5_2, RATIO_9_16, RATIO_16_9, CUSTOM_RATIO};
        }

        static {
            AspectRatio[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AspectRatio(String str, int i11, int i12, int i13) {
            this.widthRatio = i12;
            this.heightRatio = i13;
        }

        public static AspectRatio valueOf(String str) {
            return (AspectRatio) Enum.valueOf(AspectRatio.class, str);
        }

        public static AspectRatio[] values() {
            return (AspectRatio[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OziImageDTO> {
        @Override // android.os.Parcelable.Creator
        public final OziImageDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AspectRatio valueOf = parcel.readInt() == 0 ? null : AspectRatio.valueOf(parcel.readString());
            boolean z11 = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            AspectRatio aspectRatio = valueOf;
            String readString6 = parcel.readString();
            boolean z12 = z11;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(OziImageDTO.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    readInt = readInt;
                }
            }
            return new OziImageDTO(readString, readString2, aspectRatio, z12, readString3, readString4, readString5, readString6, readString7, readString8, createFromParcel, linkedHashMap, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ImageType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : FitType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CustomRatio.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OziImageDTO[] newArray(int i11) {
            return new OziImageDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$CustomRatio;", "Landroid/os/Parcelable;", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomRatio implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomRatio> CREATOR = new Creator();
        private final int height;
        private final int width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomRatio> {
            @Override // android.os.Parcelable.Creator
            public final CustomRatio createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomRatio(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomRatio[] newArray(int i11) {
                return new CustomRatio[i11];
            }
        }

        public CustomRatio(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }

        public static /* synthetic */ CustomRatio copy$default(CustomRatio customRatio, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = customRatio.width;
            }
            if ((i13 & 2) != 0) {
                i12 = customRatio.height;
            }
            return customRatio.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final CustomRatio copy(int width, int height) {
            return new CustomRatio(width, height);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomRatio)) {
                return false;
            }
            CustomRatio customRatio = (CustomRatio) other;
            return this.width == customRatio.width && this.height == customRatio.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("CustomRatio(width=", this.width, ", height=", ")", this.height);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.width);
            dest.writeInt(this.height);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "FILL_CENTER", "FIT_CENTER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FitType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FitType[] $VALUES;
        public static final FitType FILL_CENTER = new FitType("FILL_CENTER", 0);
        public static final FitType FIT_CENTER = new FitType("FIT_CENTER", 1);

        private static final /* synthetic */ FitType[] $values() {
            return new FitType[]{FILL_CENTER, FIT_CENTER};
        }

        static {
            FitType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FitType(String str, int i11) {
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/atom/models/image/OziImageDTO$ImageType;", "", "<init>", "(Ljava/lang/String;I)V", "FIX", "FILL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImageType[] $VALUES;
        public static final ImageType FIX = new ImageType("FIX", 0);
        public static final ImageType FILL = new ImageType("FILL", 1);

        private static final /* synthetic */ ImageType[] $values() {
            return new ImageType[]{FIX, FILL};
        }

        static {
            ImageType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ImageType(String str, int i11) {
        }

        public static ImageType valueOf(String str) {
            return (ImageType) Enum.valueOf(ImageType.class, str);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }
    }

    public OziImageDTO() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
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

    /* renamed from: component13, reason: from getter */
    public final Integer getImageWidth() {
        return this.imageWidth;
    }

    /* renamed from: component14, reason: from getter */
    public final ImageType getImageType() {
        return this.imageType;
    }

    /* renamed from: component15, reason: from getter */
    public final FitType getFitType() {
        return this.fitType;
    }

    /* renamed from: component16, reason: from getter */
    public final CustomRatio getCustomRatio() {
        return this.customRatio;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final AspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasParanja() {
        return this.hasParanja;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLayoutPaddingLeft() {
        return this.layoutPaddingLeft;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLayoutPaddingRight() {
        return this.layoutPaddingRight;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLayoutPaddingTop() {
        return this.layoutPaddingTop;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLayoutPaddingBottom() {
        return this.layoutPaddingBottom;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final OziImageDTO copy(String image, String backgroundColor, AspectRatio aspectRatio, boolean hasParanja, String layoutPaddingLeft, String layoutPaddingRight, String layoutPaddingTop, String layoutPaddingBottom, String cornerRadius, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Integer imageWidth, ImageType imageType, FitType fitType, CustomRatio customRatio) {
        return new OziImageDTO(image, backgroundColor, aspectRatio, hasParanja, layoutPaddingLeft, layoutPaddingRight, layoutPaddingTop, layoutPaddingBottom, cornerRadius, context, testInfo, trackingInfo, imageWidth, imageType, fitType, customRatio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OziImageDTO)) {
            return false;
        }
        OziImageDTO oziImageDTO = (OziImageDTO) other;
        return Intrinsics.d(this.image, oziImageDTO.image) && Intrinsics.d(this.backgroundColor, oziImageDTO.backgroundColor) && this.aspectRatio == oziImageDTO.aspectRatio && this.hasParanja == oziImageDTO.hasParanja && Intrinsics.d(this.layoutPaddingLeft, oziImageDTO.layoutPaddingLeft) && Intrinsics.d(this.layoutPaddingRight, oziImageDTO.layoutPaddingRight) && Intrinsics.d(this.layoutPaddingTop, oziImageDTO.layoutPaddingTop) && Intrinsics.d(this.layoutPaddingBottom, oziImageDTO.layoutPaddingBottom) && Intrinsics.d(this.cornerRadius, oziImageDTO.cornerRadius) && Intrinsics.d(this.context, oziImageDTO.context) && Intrinsics.d(this.testInfo, oziImageDTO.testInfo) && Intrinsics.d(this.trackingInfo, oziImageDTO.trackingInfo) && Intrinsics.d(this.imageWidth, oziImageDTO.imageWidth) && this.imageType == oziImageDTO.imageType && this.fitType == oziImageDTO.fitType && Intrinsics.d(this.customRatio, oziImageDTO.customRatio);
    }

    public final AspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getCornerRadius() {
        return this.cornerRadius;
    }

    public final CustomRatio getCustomRatio() {
        return this.customRatio;
    }

    public final FitType getFitType() {
        return this.fitType;
    }

    public final boolean getHasParanja() {
        return this.hasParanja;
    }

    public final String getImage() {
        return this.image;
    }

    public final ImageType getImageType() {
        return this.imageType;
    }

    public final Integer getImageWidth() {
        return this.imageWidth;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.oziImage;
    }

    public final String getLayoutPaddingBottom() {
        return this.layoutPaddingBottom;
    }

    public final String getLayoutPaddingLeft() {
        return this.layoutPaddingLeft;
    }

    public final String getLayoutPaddingRight() {
        return this.layoutPaddingRight;
    }

    public final String getLayoutPaddingTop() {
        return this.layoutPaddingTop;
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
        String str = this.image;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AspectRatio aspectRatio = this.aspectRatio;
        int a11 = C3532b.a((hashCode2 + (aspectRatio == null ? 0 : aspectRatio.hashCode())) * 31, 31, this.hasParanja);
        String str3 = this.layoutPaddingLeft;
        int hashCode3 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.layoutPaddingRight;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.layoutPaddingTop;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.layoutPaddingBottom;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cornerRadius;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.context;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode9 = (hashCode8 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.imageWidth;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        ImageType imageType = this.imageType;
        int hashCode12 = (hashCode11 + (imageType == null ? 0 : imageType.hashCode())) * 31;
        FitType fitType = this.fitType;
        int hashCode13 = (hashCode12 + (fitType == null ? 0 : fitType.hashCode())) * 31;
        CustomRatio customRatio = this.customRatio;
        return hashCode13 + (customRatio != null ? customRatio.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.backgroundColor;
        AspectRatio aspectRatio = this.aspectRatio;
        boolean z11 = this.hasParanja;
        String str3 = this.layoutPaddingLeft;
        String str4 = this.layoutPaddingRight;
        String str5 = this.layoutPaddingTop;
        String str6 = this.layoutPaddingBottom;
        String str7 = this.cornerRadius;
        String str8 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Integer num = this.imageWidth;
        ImageType imageType = this.imageType;
        FitType fitType = this.fitType;
        CustomRatio customRatio = this.customRatio;
        StringBuilder d11 = C3660k.d("OziImageDTO(image=", str, ", backgroundColor=", str2, ", aspectRatio=");
        d11.append(aspectRatio);
        d11.append(", hasParanja=");
        d11.append(z11);
        d11.append(", layoutPaddingLeft=");
        Nh.a.h(d11, str3, ", layoutPaddingRight=", str4, ", layoutPaddingTop=");
        Nh.a.h(d11, str5, ", layoutPaddingBottom=", str6, ", cornerRadius=");
        Nh.a.h(d11, str7, ", context=", str8, ", testInfo=");
        d11.append(testInfo);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(", imageWidth=");
        d11.append(num);
        d11.append(", imageType=");
        d11.append(imageType);
        d11.append(", fitType=");
        d11.append(fitType);
        d11.append(", customRatio=");
        d11.append(customRatio);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.image);
        dest.writeString(this.backgroundColor);
        AspectRatio aspectRatio = this.aspectRatio;
        if (aspectRatio == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aspectRatio.name());
        }
        dest.writeInt(this.hasParanja ? 1 : 0);
        dest.writeString(this.layoutPaddingLeft);
        dest.writeString(this.layoutPaddingRight);
        dest.writeString(this.layoutPaddingTop);
        dest.writeString(this.layoutPaddingBottom);
        dest.writeString(this.cornerRadius);
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
        Integer num = this.imageWidth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        ImageType imageType = this.imageType;
        if (imageType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(imageType.name());
        }
        FitType fitType = this.fitType;
        if (fitType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fitType.name());
        }
        CustomRatio customRatio = this.customRatio;
        if (customRatio == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customRatio.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ OziImageDTO(String str, String str2, AspectRatio aspectRatio, boolean z11, String str3, String str4, String str5, String str6, String str7, String str8, TestInfo testInfo, Map map, Integer num, ImageType imageType, FitType fitType, CustomRatio customRatio, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? AspectRatio.RATIO_1_1 : aspectRatio, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str8, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : map, (i11 & 4096) != 0 ? null : num, (i11 & 8192) != 0 ? null : imageType, (i11 & 16384) != 0 ? FitType.FILL_CENTER : fitType, (i11 & 32768) != 0 ? null : customRatio);
    }

    public OziImageDTO(String str, String str2, AspectRatio aspectRatio, boolean z11, String str3, String str4, String str5, String str6, String str7, String str8, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Integer num, ImageType imageType, FitType fitType, CustomRatio customRatio) {
        super(OziAtomsType.OziImage, str8, map, testInfo);
        this.image = str;
        this.backgroundColor = str2;
        this.aspectRatio = aspectRatio;
        this.hasParanja = z11;
        this.layoutPaddingLeft = str3;
        this.layoutPaddingRight = str4;
        this.layoutPaddingTop = str5;
        this.layoutPaddingBottom = str6;
        this.cornerRadius = str7;
        this.context = str8;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.imageWidth = num;
        this.imageType = imageType;
        this.fitType = fitType;
        this.customRatio = customRatio;
    }
}
