package ru.ozon.uni.atoms.data.image;

import C.J;
import Cm.e;
import D40.d;
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
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0004Z[\\]BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010<\u001a\u00020\u0017H\u0016J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010J\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001dHÆ\u0003JØ\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020\u0017J\u0013\u0010P\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\u0017HÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006^"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "image", "", "backgroundColor", "aspectRatio", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "hasParanja", "", "layoutPaddingLeft", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingRight", "layoutPaddingTop", "layoutPaddingBottom", "cornerRadius", "Lru/ozon/uni/atoms/data/image/CornerRadius;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "imageWidth", "", "imageType", "Lru/ozon/uni/atoms/data/image/ImageDTO$ImageType;", "fitType", "Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;", "customRatio", "Lru/ozon/uni/atoms/data/image/ImageDTO$CustomRatio;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageAspectRatio;ZLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/image/CornerRadius;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/image/ImageDTO$ImageType;Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;Lru/ozon/uni/atoms/data/image/ImageDTO$CustomRatio;)V", "getImage", "()Ljava/lang/String;", "getBackgroundColor", "getAspectRatio", "()Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "getHasParanja", "()Z", "getLayoutPaddingLeft", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLayoutPaddingRight", "getLayoutPaddingTop", "getLayoutPaddingBottom", "getCornerRadius", "()Lru/ozon/uni/atoms/data/image/CornerRadius;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getImageWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageType", "()Lru/ozon/uni/atoms/data/image/ImageDTO$ImageType;", "getFitType", "()Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;", "getCustomRatio", "()Lru/ozon/uni/atoms/data/image/ImageDTO$CustomRatio;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageAspectRatio;ZLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/image/CornerRadius;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/image/ImageDTO$ImageType;Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;Lru/ozon/uni/atoms/data/image/ImageDTO$CustomRatio;)Lru/ozon/uni/atoms/data/image/ImageDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "ImageType", "FitType", "CustomRatio", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ImageDTO extends AtomDTO {
    public static final int $stable = 0;

    @EnumNullFallback
    private final ImageAspectRatio aspectRatio;
    private final String backgroundColor;
    private final String context;

    @EnumNullFallback
    private final CornerRadius cornerRadius;
    private final CustomRatio customRatio;

    @EnumNullFallback
    private final FitType fitType;
    private final boolean hasParanja;
    private final String image;
    private final ImageType imageType;
    private final Integer imageWidth;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding layoutPaddingBottom;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding layoutPaddingLeft;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding layoutPaddingRight;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding layoutPaddingTop;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ImageDTO> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO$Companion;", "", "<init>", "()V", "toImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/image/ImageFixedDTO;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImageDTO toImage(@NotNull ImageFixedDTO imageFixedDTO) {
            Intrinsics.checkNotNullParameter(imageFixedDTO, "<this>");
            return new ImageDTO(imageFixedDTO.getImage(), imageFixedDTO.getBackgroundColor(), imageFixedDTO.getAspectRatio(), imageFixedDTO.getHasParanja(), null, null, imageFixedDTO.getLayoutPaddingTop(), imageFixedDTO.getLayoutPaddingBottom(), imageFixedDTO.getCornerRadius(), imageFixedDTO.getContext(), imageFixedDTO.getTestInfo(), imageFixedDTO.getTrackingInfo(), Integer.valueOf(imageFixedDTO.getImageWidth()), ImageType.FIX, null, null, 49200, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageDTO> {
        @Override // android.os.Parcelable.Creator
        public final ImageDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ImageAspectRatio valueOf = parcel.readInt() == 0 ? null : ImageAspectRatio.valueOf(parcel.readString());
            boolean z11 = parcel.readInt() != 0;
            CommonCellSettings.LayoutPadding valueOf2 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf3 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf4 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding valueOf5 = parcel.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            CornerRadius valueOf6 = parcel.readInt() == 0 ? null : CornerRadius.valueOf(parcel.readString());
            CommonCellSettings.LayoutPadding layoutPadding = valueOf2;
            String readString3 = parcel.readString();
            TestInfo createFromParcel = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(ImageDTO.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    readInt = readInt;
                }
            }
            return new ImageDTO(readString, readString2, valueOf, z11, layoutPadding, valueOf3, valueOf4, valueOf5, valueOf6, readString3, createFromParcel, linkedHashMap, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ImageType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : FitType.valueOf(parcel.readString()), parcel.readInt() != 0 ? CustomRatio.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageDTO[] newArray(int i11) {
            return new ImageDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO$CustomRatio;", "Landroid/os/Parcelable;", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomRatio implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<CustomRatio> CREATOR = new Creator();
        private final int height;
        private final int width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "FIT_CENTER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FitType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FitType[] $VALUES;
        public static final FitType FIT_CENTER = new FitType("FIT_CENTER", 0);

        private static final /* synthetic */ FitType[] $values() {
            return new FitType[]{FIT_CENTER};
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO$ImageType;", "", "isFixed", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "FIX", "FILL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImageType[] $VALUES;
        private final boolean isFixed;
        public static final ImageType FIX = new ImageType("FIX", 0, true);
        public static final ImageType FILL = new ImageType("FILL", 1, false);

        private static final /* synthetic */ ImageType[] $values() {
            return new ImageType[]{FIX, FILL};
        }

        static {
            ImageType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ImageType(String str, int i11, boolean z11) {
            this.isFixed = z11;
        }

        @NotNull
        public static a<ImageType> getEntries() {
            return $ENTRIES;
        }

        public static ImageType valueOf(String str) {
            return (ImageType) Enum.valueOf(ImageType.class, str);
        }

        public static ImageType[] values() {
            return (ImageType[]) $VALUES.clone();
        }

        /* renamed from: isFixed, reason: from getter */
        public final boolean getIsFixed() {
            return this.isFixed;
        }
    }

    public ImageDTO() {
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
    public final ImageAspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasParanja() {
        return this.hasParanja;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLayoutPaddingLeft() {
        return this.layoutPaddingLeft;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLayoutPaddingRight() {
        return this.layoutPaddingRight;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLayoutPaddingTop() {
        return this.layoutPaddingTop;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLayoutPaddingBottom() {
        return this.layoutPaddingBottom;
    }

    /* renamed from: component9, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final ImageDTO copy(String image, String backgroundColor, ImageAspectRatio aspectRatio, boolean hasParanja, CommonCellSettings.LayoutPadding layoutPaddingLeft, CommonCellSettings.LayoutPadding layoutPaddingRight, CommonCellSettings.LayoutPadding layoutPaddingTop, CommonCellSettings.LayoutPadding layoutPaddingBottom, CornerRadius cornerRadius, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Integer imageWidth, ImageType imageType, FitType fitType, CustomRatio customRatio) {
        return new ImageDTO(image, backgroundColor, aspectRatio, hasParanja, layoutPaddingLeft, layoutPaddingRight, layoutPaddingTop, layoutPaddingBottom, cornerRadius, context, testInfo, trackingInfo, imageWidth, imageType, fitType, customRatio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDTO)) {
            return false;
        }
        ImageDTO imageDTO = (ImageDTO) other;
        return Intrinsics.d(this.image, imageDTO.image) && Intrinsics.d(this.backgroundColor, imageDTO.backgroundColor) && this.aspectRatio == imageDTO.aspectRatio && this.hasParanja == imageDTO.hasParanja && this.layoutPaddingLeft == imageDTO.layoutPaddingLeft && this.layoutPaddingRight == imageDTO.layoutPaddingRight && this.layoutPaddingTop == imageDTO.layoutPaddingTop && this.layoutPaddingBottom == imageDTO.layoutPaddingBottom && this.cornerRadius == imageDTO.cornerRadius && Intrinsics.d(this.context, imageDTO.context) && Intrinsics.d(this.testInfo, imageDTO.testInfo) && Intrinsics.d(this.trackingInfo, imageDTO.trackingInfo) && Intrinsics.d(this.imageWidth, imageDTO.imageWidth) && this.imageType == imageDTO.imageType && this.fitType == imageDTO.fitType && Intrinsics.d(this.customRatio, imageDTO.customRatio);
    }

    public final ImageAspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final CornerRadius getCornerRadius() {
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
        return R$id.image;
    }

    public final CommonCellSettings.LayoutPadding getLayoutPaddingBottom() {
        return this.layoutPaddingBottom;
    }

    public final CommonCellSettings.LayoutPadding getLayoutPaddingLeft() {
        return this.layoutPaddingLeft;
    }

    public final CommonCellSettings.LayoutPadding getLayoutPaddingRight() {
        return this.layoutPaddingRight;
    }

    public final CommonCellSettings.LayoutPadding getLayoutPaddingTop() {
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
        ImageAspectRatio imageAspectRatio = this.aspectRatio;
        int a11 = C3532b.a((hashCode2 + (imageAspectRatio == null ? 0 : imageAspectRatio.hashCode())) * 31, 31, this.hasParanja);
        CommonCellSettings.LayoutPadding layoutPadding = this.layoutPaddingLeft;
        int hashCode3 = (a11 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.layoutPaddingRight;
        int hashCode4 = (hashCode3 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.layoutPaddingTop;
        int hashCode5 = (hashCode4 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.layoutPaddingBottom;
        int hashCode6 = (hashCode5 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode7 = (hashCode6 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str3 = this.context;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
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
        ImageAspectRatio imageAspectRatio = this.aspectRatio;
        boolean z11 = this.hasParanja;
        CommonCellSettings.LayoutPadding layoutPadding = this.layoutPaddingLeft;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.layoutPaddingRight;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.layoutPaddingTop;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.layoutPaddingBottom;
        CornerRadius cornerRadius = this.cornerRadius;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Integer num = this.imageWidth;
        ImageType imageType = this.imageType;
        FitType fitType = this.fitType;
        CustomRatio customRatio = this.customRatio;
        StringBuilder d11 = C3660k.d("ImageDTO(image=", str, ", backgroundColor=", str2, ", aspectRatio=");
        d11.append(imageAspectRatio);
        d11.append(", hasParanja=");
        d11.append(z11);
        d11.append(", layoutPaddingLeft=");
        Ep.a.f(d11, layoutPadding, ", layoutPaddingRight=", layoutPadding2, ", layoutPaddingTop=");
        Ep.a.f(d11, layoutPadding3, ", layoutPaddingBottom=", layoutPadding4, ", cornerRadius=");
        d11.append(cornerRadius);
        d11.append(", context=");
        d11.append(str3);
        d11.append(", testInfo=");
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
        ImageAspectRatio imageAspectRatio = this.aspectRatio;
        if (imageAspectRatio == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(imageAspectRatio.name());
        }
        dest.writeInt(this.hasParanja ? 1 : 0);
        CommonCellSettings.LayoutPadding layoutPadding = this.layoutPaddingLeft;
        if (layoutPadding == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding);
        }
        CommonCellSettings.LayoutPadding layoutPadding2 = this.layoutPaddingRight;
        if (layoutPadding2 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding2);
        }
        CommonCellSettings.LayoutPadding layoutPadding3 = this.layoutPaddingTop;
        if (layoutPadding3 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding3);
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = this.layoutPaddingBottom;
        if (layoutPadding4 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding4);
        }
        CornerRadius cornerRadius = this.cornerRadius;
        if (cornerRadius == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cornerRadius.name());
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

    public /* synthetic */ ImageDTO(String str, String str2, ImageAspectRatio imageAspectRatio, boolean z11, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CornerRadius cornerRadius, String str3, TestInfo testInfo, Map map, Integer num, ImageType imageType, FitType fitType, CustomRatio customRatio, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? ImageAspectRatio.RATIO_1_1 : imageAspectRatio, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 32) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 64) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4, (i11 & 256) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : map, (i11 & 4096) != 0 ? null : num, (i11 & 8192) != 0 ? null : imageType, (i11 & 16384) != 0 ? null : fitType, (i11 & 32768) != 0 ? null : customRatio);
    }

    public ImageDTO(String str, String str2, ImageAspectRatio imageAspectRatio, boolean z11, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, CornerRadius cornerRadius, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Integer num, ImageType imageType, FitType fitType, CustomRatio customRatio) {
        super(DsAtomsType.IMAGE, str3, map, testInfo);
        this.image = str;
        this.backgroundColor = str2;
        this.aspectRatio = imageAspectRatio;
        this.hasParanja = z11;
        this.layoutPaddingLeft = layoutPadding;
        this.layoutPaddingRight = layoutPadding2;
        this.layoutPaddingTop = layoutPadding3;
        this.layoutPaddingBottom = layoutPadding4;
        this.cornerRadius = cornerRadius;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.imageWidth = num;
        this.imageType = imageType;
        this.fitType = fitType;
        this.customRatio = customRatio;
    }
}
