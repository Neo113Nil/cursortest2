package ru.ozon.app.android.atoms.data.deprecated;

import C.J;
import De.C2859b;
import GR.b;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jq\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010+\u001a\u00020!J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020!HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Checkbox;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtext", "", "isChecked", "", "rightIcon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtext", "()Ljava/lang/String;", "()Z", "getRightIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Checkbox extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Checkbox> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final boolean isChecked;
    private final String rightIcon;
    private final String subtext;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<Checkbox> {
        @Override // android.os.Parcelable.Creator
        public final Checkbox createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
            String readString = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(Checkbox.class.getClassLoader());
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Checkbox.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new Checkbox(create, readString, z11, readString2, atomActionDTO, readString3, linkedHashMap, (TestInfo) parcel.readParcelable(Checkbox.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Checkbox[] newArray(int i11) {
            return new Checkbox[i11];
        }
    }

    public /* synthetic */ Checkbox(OzonSpannableString ozonSpannableString, String str, boolean z11, String str2, AtomActionDTO atomActionDTO, String str3, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : atomActionDTO, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo);
    }

    public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, OzonSpannableString ozonSpannableString, String str, boolean z11, String str2, AtomActionDTO atomActionDTO, String str3, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = checkbox.text;
        }
        if ((i11 & 2) != 0) {
            str = checkbox.subtext;
        }
        if ((i11 & 4) != 0) {
            z11 = checkbox.isChecked;
        }
        if ((i11 & 8) != 0) {
            str2 = checkbox.rightIcon;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = checkbox.action;
        }
        if ((i11 & 32) != 0) {
            str3 = checkbox.context;
        }
        if ((i11 & 64) != 0) {
            map = checkbox.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = checkbox.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str4 = str3;
        return checkbox.copy(ozonSpannableString, str, z11, str2, atomActionDTO2, str4, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final Checkbox copy(@NotNull OzonSpannableString text, String subtext, boolean isChecked, String rightIcon, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new Checkbox(text, subtext, isChecked, rightIcon, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Checkbox)) {
            return false;
        }
        Checkbox checkbox = (Checkbox) other;
        return Intrinsics.d(this.text, checkbox.text) && Intrinsics.d(this.subtext, checkbox.subtext) && this.isChecked == checkbox.isChecked && Intrinsics.d(this.rightIcon, checkbox.rightIcon) && Intrinsics.d(this.action, checkbox.action) && Intrinsics.d(this.context, checkbox.context) && Intrinsics.d(this.trackingInfo, checkbox.trackingInfo) && Intrinsics.d(this.testInfo, checkbox.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_checkbox;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getSubtext() {
        return this.subtext;
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
        String str = this.subtext;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isChecked);
        String str2 = this.rightIcon;
        int hashCode2 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str3 = this.context;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.subtext;
        boolean z11 = this.isChecked;
        String str2 = this.rightIcon;
        AtomActionDTO atomActionDTO = this.action;
        String str3 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder f7 = b.f("Checkbox(text=", ozonSpannableString, ", subtext=", str, ", isChecked=");
        C5766e.a(", rightIcon=", str2, ", action=", f7, z11);
        HY.b.d(", context=", str3, ", trackingInfo=", f7, atomActionDTO);
        return Ns.b.b(", testInfo=", ")", f7, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeString(this.subtext);
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeString(this.rightIcon);
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
    public Checkbox(@NotNull OzonSpannableString text, String str, boolean z11, String str2, AtomActionDTO atomActionDTO, String str3, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.CHECKBOX, str3, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.subtext = str;
        this.isChecked = z11;
        this.rightIcon = str2;
        this.action = atomActionDTO;
        this.context = str3;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
