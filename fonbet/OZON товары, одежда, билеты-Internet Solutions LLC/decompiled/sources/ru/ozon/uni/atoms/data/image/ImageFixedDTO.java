package ru.ozon.uni.atoms.data.image;

import B0.C2454a;
import C.J;
import D40.d;
import De.C2859b;
import Kk.C3532b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
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
@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010+\u001a\u00020\nH\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0095\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0006\u00108\u001a\u00020\nJ\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\nHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006D"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageFixedDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "image", "", "backgroundColor", "aspectRatio", "Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "hasParanja", "", "imageWidth", "", "layoutPaddingTop", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingBottom", "cornerRadius", "Lru/ozon/uni/atoms/data/image/CornerRadius;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageAspectRatio;ZILru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/image/CornerRadius;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getBackgroundColor", "getAspectRatio", "()Lru/ozon/uni/atoms/data/image/ImageAspectRatio;", "getHasParanja", "()Z", "getImageWidth", "()I", "getLayoutPaddingTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLayoutPaddingBottom", "getCornerRadius", "()Lru/ozon/uni/atoms/data/image/CornerRadius;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ImageFixedDTO extends AtomDTO {
    private static final int DEFAULT_WIDTH = 168;

    @EnumNullFallback
    private final ImageAspectRatio aspectRatio;
    private final String backgroundColor;
    private final String context;

    @EnumNullFallback
    private final CornerRadius cornerRadius;
    private final boolean hasParanja;
    private final String image;
    private final int imageWidth;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding layoutPaddingBottom;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding layoutPaddingTop;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ImageFixedDTO> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ImageFixedDTO> {
        @Override // android.os.Parcelable.Creator
        public final ImageFixedDTO createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            LinkedHashMap linkedHashMap = null;
            ImageAspectRatio valueOf = parcel2.readInt() == 0 ? null : ImageAspectRatio.valueOf(parcel2.readString());
            boolean z11 = parcel2.readInt() != 0;
            int readInt = parcel2.readInt();
            CommonCellSettings.LayoutPadding valueOf2 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding valueOf3 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            CornerRadius valueOf4 = parcel2.readInt() == 0 ? null : CornerRadius.valueOf(parcel2.readString());
            String readString3 = parcel2.readString();
            TestInfo createFromParcel = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() != 0) {
                int readInt2 = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = C2859b.a(ImageFixedDTO.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    readInt2 = readInt2;
                }
            }
            return new ImageFixedDTO(readString, readString2, valueOf, z11, readInt, valueOf2, valueOf3, valueOf4, readString3, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageFixedDTO[] newArray(int i11) {
            return new ImageFixedDTO[i11];
        }
    }

    public ImageFixedDTO() {
        this(null, null, null, false, 0, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ ImageFixedDTO copy$default(ImageFixedDTO imageFixedDTO, String str, String str2, ImageAspectRatio imageAspectRatio, boolean z11, int i11, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CornerRadius cornerRadius, String str3, TestInfo testInfo, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageFixedDTO.image;
        }
        if ((i12 & 2) != 0) {
            str2 = imageFixedDTO.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            imageAspectRatio = imageFixedDTO.aspectRatio;
        }
        if ((i12 & 8) != 0) {
            z11 = imageFixedDTO.hasParanja;
        }
        if ((i12 & 16) != 0) {
            i11 = imageFixedDTO.imageWidth;
        }
        if ((i12 & 32) != 0) {
            layoutPadding = imageFixedDTO.layoutPaddingTop;
        }
        if ((i12 & 64) != 0) {
            layoutPadding2 = imageFixedDTO.layoutPaddingBottom;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cornerRadius = imageFixedDTO.cornerRadius;
        }
        if ((i12 & 256) != 0) {
            str3 = imageFixedDTO.context;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            testInfo = imageFixedDTO.testInfo;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = imageFixedDTO.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        CornerRadius cornerRadius2 = cornerRadius;
        String str4 = str3;
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding2;
        int i13 = i11;
        ImageAspectRatio imageAspectRatio2 = imageAspectRatio;
        return imageFixedDTO.copy(str, str2, imageAspectRatio2, z11, i13, layoutPadding3, layoutPadding4, cornerRadius2, str4, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component10, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
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
    public final int getImageWidth() {
        return this.imageWidth;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLayoutPaddingTop() {
        return this.layoutPaddingTop;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLayoutPaddingBottom() {
        return this.layoutPaddingBottom;
    }

    /* renamed from: component8, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final ImageFixedDTO copy(String image, String backgroundColor, ImageAspectRatio aspectRatio, boolean hasParanja, int imageWidth, CommonCellSettings.LayoutPadding layoutPaddingTop, CommonCellSettings.LayoutPadding layoutPaddingBottom, CornerRadius cornerRadius, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new ImageFixedDTO(image, backgroundColor, aspectRatio, hasParanja, imageWidth, layoutPaddingTop, layoutPaddingBottom, cornerRadius, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageFixedDTO)) {
            return false;
        }
        ImageFixedDTO imageFixedDTO = (ImageFixedDTO) other;
        return Intrinsics.d(this.image, imageFixedDTO.image) && Intrinsics.d(this.backgroundColor, imageFixedDTO.backgroundColor) && this.aspectRatio == imageFixedDTO.aspectRatio && this.hasParanja == imageFixedDTO.hasParanja && this.imageWidth == imageFixedDTO.imageWidth && this.layoutPaddingTop == imageFixedDTO.layoutPaddingTop && this.layoutPaddingBottom == imageFixedDTO.layoutPaddingBottom && this.cornerRadius == imageFixedDTO.cornerRadius && Intrinsics.d(this.context, imageFixedDTO.context) && Intrinsics.d(this.testInfo, imageFixedDTO.testInfo) && Intrinsics.d(this.trackingInfo, imageFixedDTO.trackingInfo);
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

    public final boolean getHasParanja() {
        return this.hasParanja;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.image_fixed;
    }

    public final CommonCellSettings.LayoutPadding getLayoutPaddingBottom() {
        return this.layoutPaddingBottom;
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
        int a11 = C2454a.a(this.imageWidth, C3532b.a((hashCode2 + (imageAspectRatio == null ? 0 : imageAspectRatio.hashCode())) * 31, 31, this.hasParanja), 31);
        CommonCellSettings.LayoutPadding layoutPadding = this.layoutPaddingTop;
        int hashCode3 = (a11 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.layoutPaddingBottom;
        int hashCode4 = (hashCode3 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        String str3 = this.context;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode7 = (hashCode6 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.backgroundColor;
        ImageAspectRatio imageAspectRatio = this.aspectRatio;
        boolean z11 = this.hasParanja;
        int i11 = this.imageWidth;
        CommonCellSettings.LayoutPadding layoutPadding = this.layoutPaddingTop;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.layoutPaddingBottom;
        CornerRadius cornerRadius = this.cornerRadius;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ImageFixedDTO(image=", str, ", backgroundColor=", str2, ", aspectRatio=");
        d11.append(imageAspectRatio);
        d11.append(", hasParanja=");
        d11.append(z11);
        d11.append(", imageWidth=");
        d11.append(i11);
        d11.append(", layoutPaddingTop=");
        d11.append(layoutPadding);
        d11.append(", layoutPaddingBottom=");
        d11.append(layoutPadding2);
        d11.append(", cornerRadius=");
        d11.append(cornerRadius);
        d11.append(", context=");
        C4070a.b(d11, str3, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(d11, map, ")");
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
        dest.writeInt(this.imageWidth);
        CommonCellSettings.LayoutPadding layoutPadding = this.layoutPaddingTop;
        if (layoutPadding == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding);
        }
        CommonCellSettings.LayoutPadding layoutPadding2 = this.layoutPaddingBottom;
        if (layoutPadding2 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding2);
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
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    public /* synthetic */ ImageFixedDTO(String str, String str2, ImageAspectRatio imageAspectRatio, boolean z11, int i11, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CornerRadius cornerRadius, String str3, TestInfo testInfo, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? ImageAspectRatio.RATIO_1_1 : imageAspectRatio, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? DEFAULT_WIDTH : i11, (i12 & 32) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i12 & 64) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i12 & 256) != 0 ? null : str3, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : map);
    }

    public ImageFixedDTO(String str, String str2, ImageAspectRatio imageAspectRatio, boolean z11, int i11, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CornerRadius cornerRadius, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(DsAtomsType.IMAGE_FIXED, str3, map, testInfo);
        this.image = str;
        this.backgroundColor = str2;
        this.aspectRatio = imageAspectRatio;
        this.hasParanja = z11;
        this.imageWidth = i11;
        this.layoutPaddingTop = layoutPadding;
        this.layoutPaddingBottom = layoutPadding2;
        this.cornerRadius = cornerRadius;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
