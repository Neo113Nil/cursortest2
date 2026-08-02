package ru.ozon.app.android.atoms.data.color;

import Bk.C2638a;
import C.J;
import De.C2859b;
import Kk.C3532b;
import N3.C3660k;
import Pk0.h;
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
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020\u001dJ\u0013\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001dHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/color/ColorAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "hex", "", "count", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getHex", "()Ljava/lang/String;", "getCount", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ColorAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<ColorAtom> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final String count;

    @NotNull
    private final String hex;
    private final boolean isSelected;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<ColorAtom> {
        @Override // android.os.Parcelable.Creator
        public final ColorAtom createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ColorAtom.class.getClassLoader());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(ColorAtom.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new ColorAtom(readString, readString2, z11, atomActionDTO, readString3, linkedHashMap, (TestInfo) parcel.readParcelable(ColorAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ColorAtom[] newArray(int i11) {
            return new ColorAtom[i11];
        }
    }

    public /* synthetic */ ColorAtom(String str, String str2, boolean z11, AtomActionDTO atomActionDTO, String str3, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : map, (i11 & 64) != 0 ? null : testInfo);
    }

    public static /* synthetic */ ColorAtom copy$default(ColorAtom colorAtom, String str, String str2, boolean z11, AtomActionDTO atomActionDTO, String str3, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = colorAtom.hex;
        }
        if ((i11 & 2) != 0) {
            str2 = colorAtom.count;
        }
        if ((i11 & 4) != 0) {
            z11 = colorAtom.isSelected;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = colorAtom.action;
        }
        if ((i11 & 16) != 0) {
            str3 = colorAtom.context;
        }
        if ((i11 & 32) != 0) {
            map = colorAtom.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = colorAtom.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str4 = str3;
        boolean z12 = z11;
        return colorAtom.copy(str, str2, z12, atomActionDTO, str4, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHex() {
        return this.hex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final ColorAtom copy(@NotNull String hex, String count, boolean isSelected, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(hex, "hex");
        return new ColorAtom(hex, count, isSelected, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorAtom)) {
            return false;
        }
        ColorAtom colorAtom = (ColorAtom) other;
        return Intrinsics.d(this.hex, colorAtom.hex) && Intrinsics.d(this.count, colorAtom.count) && this.isSelected == colorAtom.isSelected && Intrinsics.d(this.action, colorAtom.action) && Intrinsics.d(this.context, colorAtom.context) && Intrinsics.d(this.trackingInfo, colorAtom.trackingInfo) && Intrinsics.d(this.testInfo, colorAtom.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getCount() {
        return this.count;
    }

    @NotNull
    public final String getHex() {
        return this.hex;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_color_atom;
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
        int hashCode = this.hex.hashCode() * 31;
        String str = this.count;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.context;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.hex;
        String str2 = this.count;
        boolean z11 = this.isSelected;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder d11 = C3660k.d("ColorAtom(hex=", str, ", count=", str2, ", isSelected=");
        d11.append(z11);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", context=");
        C2638a.e(d11, str3, ", trackingInfo=", map, ", testInfo=");
        return h.c(d11, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.hex);
        dest.writeString(this.count);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeParcelable(this.action, flags);
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
        dest.writeParcelable(this.testInfo, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorAtom(@NotNull String hex, String str, boolean z11, AtomActionDTO atomActionDTO, String str2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.COLOR, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(hex, "hex");
        this.hex = hex;
        this.count = str;
        this.isSelected = z11;
        this.action = atomActionDTO;
        this.context = str2;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
