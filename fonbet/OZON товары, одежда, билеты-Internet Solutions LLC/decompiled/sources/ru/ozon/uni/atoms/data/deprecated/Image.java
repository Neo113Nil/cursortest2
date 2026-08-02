package ru.ozon.uni.atoms.data.deprecated;

import Bl.C2639a;
import C.J;
import De.C2859b;
import HY.b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J]\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\"\u001a\u00020\u001aJ\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u001aHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lru/ozon/uni/atoms/data/deprecated/Image;", "Lru/ozon/uni/atoms/data/AtomDTO;", "image", "", "borderColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getBorderColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Image extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Image> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String borderColor;
    private final String context;
    private final String image;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Image> {
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Image.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Image(readString, readString2, createFromParcel, readString3, createFromParcel2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i11) {
            return new Image[i11];
        }
    }

    public /* synthetic */ Image(String str, String str2, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : atomActionDTO, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map);
    }

    public static /* synthetic */ Image copy$default(Image image, String str, String str2, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = image.image;
        }
        if ((i11 & 2) != 0) {
            str2 = image.borderColor;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = image.action;
        }
        if ((i11 & 8) != 0) {
            str3 = image.context;
        }
        if ((i11 & 16) != 0) {
            testInfo = image.testInfo;
        }
        if ((i11 & 32) != 0) {
            map = image.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return image.copy(str, str2, atomActionDTO, str3, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
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

    @NotNull
    public final Image copy(String image, String borderColor, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new Image(image, borderColor, action, context, testInfo, trackingInfo);
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
        return Intrinsics.d(this.image, image.image) && Intrinsics.d(this.borderColor, image.borderColor) && Intrinsics.d(this.action, image.action) && Intrinsics.d(this.context, image.context) && Intrinsics.d(this.testInfo, image.testInfo) && Intrinsics.d(this.trackingInfo, image.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getImage() {
        return this.image;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_image;
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
        String str2 = this.borderColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str3 = this.context;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.borderColor;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("Image(image=", str, ", borderColor=", str2, ", action=");
        b.d(", context=", str3, ", testInfo=", d11, atomActionDTO);
        return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.image);
        dest.writeString(this.borderColor);
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
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

    public Image(String str, String str2, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.IMAGE, str3, map, testInfo);
        this.image = str;
        this.borderColor = str2;
        this.action = atomActionDTO;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
