package ru.ozon.app.android.atoms.data.deprecated;

import B3.p;
import C.J;
import De.C2859b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
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
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Ji\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0006\u0010%\u001a\u00020\u001cJ\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001cHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Header;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "textColor", "image", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getImage", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Header extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Header> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final String image;
    private final TestInfo testInfo;
    private final String text;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<Header> {
        @Override // android.os.Parcelable.Creator
        public final Header createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(Header.class.getClassLoader());
            TestInfo testInfo = (TestInfo) parcel.readParcelable(Header.class.getClassLoader());
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Header.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Header(readString, readString2, readString3, atomActionDTO, testInfo, readString4, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Header[] newArray(int i11) {
            return new Header[i11];
        }
    }

    public Header() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, AtomActionDTO atomActionDTO, TestInfo testInfo, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = header.text;
        }
        if ((i11 & 2) != 0) {
            str2 = header.textColor;
        }
        if ((i11 & 4) != 0) {
            str3 = header.image;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = header.action;
        }
        if ((i11 & 16) != 0) {
            testInfo = header.testInfo;
        }
        if ((i11 & 32) != 0) {
            str4 = header.context;
        }
        if ((i11 & 64) != 0) {
            map = header.trackingInfo;
        }
        String str5 = str4;
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str6 = str3;
        return header.copy(str, str2, str6, atomActionDTO, testInfo2, str5, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final Header copy(String text, String textColor, String image, AtomActionDTO action, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new Header(text, textColor, image, action, testInfo, context, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.d(this.text, header.text) && Intrinsics.d(this.textColor, header.textColor) && Intrinsics.d(this.image, header.image) && Intrinsics.d(this.action, header.action) && Intrinsics.d(this.testInfo, header.testInfo) && Intrinsics.d(this.context, header.context) && Intrinsics.d(this.trackingInfo, header.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
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
        return R$id.atom_type_header;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        String str4 = this.context;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textColor;
        String str3 = this.image;
        AtomActionDTO atomActionDTO = this.action;
        TestInfo testInfo = this.testInfo;
        String str4 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("Header(text=", str, ", textColor=", str2, ", image=");
        p.c(str3, ", action=", ", testInfo=", d11, atomActionDTO);
        d11.append(testInfo);
        d11.append(", context=");
        d11.append(str4);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.textColor);
        dest.writeString(this.image);
        dest.writeParcelable(this.action, flags);
        dest.writeParcelable(this.testInfo, flags);
        dest.writeString(this.context);
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

    public /* synthetic */ Header(String str, String str2, String str3, AtomActionDTO atomActionDTO, TestInfo testInfo, String str4, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : map);
    }

    public Header(String str, String str2, String str3, AtomActionDTO atomActionDTO, TestInfo testInfo, String str4, Map<String, TokenizedTrackingInfo> map) {
        super(Type.HEADER, str4, map, testInfo);
        this.text = str;
        this.textColor = str2;
        this.image = str3;
        this.action = atomActionDTO;
        this.testInfo = testInfo;
        this.context = str4;
        this.trackingInfo = map;
    }
}
