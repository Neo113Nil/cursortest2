package ru.ozon.app.android.atoms.data.deprecated;

import Bl.C2639a;
import C.J;
import D40.c;
import De.C2859b;
import HY.b;
import Ih.a;
import Sc.InterfaceC3999a;
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
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u008e\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020%J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020%HÖ\u0001J\t\u00107\u001a\u00020\u0006HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\n\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\f\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006="}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/PaymentMethod;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtext", "subtextColor", "", "image", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isSelected", "", "isDefault", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtext", "getSubtextColor", "()Ljava/lang/String;", "getImage", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/deprecated/PaymentMethod;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentMethod extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

    @NotNull
    private final AtomActionDTO action;
    private final String context;
    private final String image;
    private final Boolean isDefault;
    private final Boolean isSelected;
    private final OzonSpannableString subtext;
    private final String subtextColor;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
            OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(PaymentMethod.class.getClassLoader());
            LinkedHashMap linkedHashMap = null;
            if (parcel2.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            String readString3 = parcel2.readString();
            TestInfo testInfo = (TestInfo) parcel2.readParcelable(PaymentMethod.class.getClassLoader());
            if (parcel2.readInt() != 0) {
                int readInt = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(PaymentMethod.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PaymentMethod(create, create2, readString, readString2, atomActionDTO, valueOf, valueOf2, readString3, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i11) {
            return new PaymentMethod[i11];
        }
    }

    public /* synthetic */ PaymentMethod(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, String str2, AtomActionDTO atomActionDTO, Boolean bool, Boolean bool2, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, ozonSpannableString2, str, str2, atomActionDTO, bool, bool2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3, (i11 & 256) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, String str2, AtomActionDTO atomActionDTO, Boolean bool, Boolean bool2, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = paymentMethod.text;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString2 = paymentMethod.subtext;
        }
        if ((i11 & 4) != 0) {
            str = paymentMethod.subtextColor;
        }
        if ((i11 & 8) != 0) {
            str2 = paymentMethod.image;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = paymentMethod.action;
        }
        if ((i11 & 32) != 0) {
            bool = paymentMethod.isSelected;
        }
        if ((i11 & 64) != 0) {
            bool2 = paymentMethod.isDefault;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = paymentMethod.context;
        }
        if ((i11 & 256) != 0) {
            testInfo = paymentMethod.testInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = paymentMethod.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        Boolean bool3 = bool2;
        String str4 = str3;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Boolean bool4 = bool;
        return paymentMethod.copy(ozonSpannableString, ozonSpannableString2, str, str2, atomActionDTO2, bool4, bool3, str4, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtext() {
        return this.subtext;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtextColor() {
        return this.subtextColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component9, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final PaymentMethod copy(@NotNull OzonSpannableString text, OzonSpannableString subtext, String subtextColor, String image, @NotNull AtomActionDTO action, Boolean isSelected, Boolean isDefault, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new PaymentMethod(text, subtext, subtextColor, image, action, isSelected, isDefault, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.d(this.text, paymentMethod.text) && Intrinsics.d(this.subtext, paymentMethod.subtext) && Intrinsics.d(this.subtextColor, paymentMethod.subtextColor) && Intrinsics.d(this.image, paymentMethod.image) && Intrinsics.d(this.action, paymentMethod.action) && Intrinsics.d(this.isSelected, paymentMethod.isSelected) && Intrinsics.d(this.isDefault, paymentMethod.isDefault) && Intrinsics.d(this.context, paymentMethod.context) && Intrinsics.d(this.testInfo, paymentMethod.testInfo) && Intrinsics.d(this.trackingInfo, paymentMethod.trackingInfo);
    }

    @NotNull
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
        return R$id.atom_type_payment_method;
    }

    public final OzonSpannableString getSubtext() {
        return this.subtext;
    }

    public final String getSubtextColor() {
        return this.subtextColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtext;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str = this.subtextColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int b11 = a.b(this.action, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool = this.isSelected;
        int hashCode4 = (b11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefault;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.context;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode7 = (hashCode6 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        OzonSpannableString ozonSpannableString2 = this.subtext;
        String str = this.subtextColor;
        String str2 = this.image;
        AtomActionDTO atomActionDTO = this.action;
        Boolean bool = this.isSelected;
        Boolean bool2 = this.isDefault;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PaymentMethod(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", subtext=");
        sb2.append((Object) ozonSpannableString2);
        sb2.append(", subtextColor=");
        Nh.a.h(sb2, str, ", image=", str2, ", action=");
        sb2.append(atomActionDTO);
        sb2.append(", isSelected=");
        sb2.append(bool);
        sb2.append(", isDefault=");
        b.c(bool2, ", context=", str3, ", testInfo=", sb2);
        return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
        ozonSpannableStringParceler.write(this.text, dest, flags);
        ozonSpannableStringParceler.write(this.subtext, dest, flags);
        dest.writeString(this.subtextColor);
        dest.writeString(this.image);
        dest.writeParcelable(this.action, flags);
        Boolean bool = this.isSelected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        Boolean bool2 = this.isDefault;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
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
    public PaymentMethod(@NotNull OzonSpannableString text, OzonSpannableString ozonSpannableString, String str, String str2, @NotNull AtomActionDTO action, Boolean bool, Boolean bool2, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.TEXT_SUBTEXT, str3, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.text = text;
        this.subtext = ozonSpannableString;
        this.subtextColor = str;
        this.image = str2;
        this.action = action;
        this.isSelected = bool;
        this.isDefault = bool2;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
