package ru.ozon.app.android.atoms.data.deprecated;

import C.J;
import De.C2859b;
import GR.b;
import HY.a;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u00100\u001a\u00020$J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020$HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006<"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/TextSubtext;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "subtext", "subtextColor", "image", "tintColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "()Ljava/lang/String;", "getSubtext", "getSubtextColor", "getImage", "getTintColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TextSubtext extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<TextSubtext> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final String image;
    private final OzonSpannableString subtext;
    private final String subtextColor;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final String textColor;
    private final String tintColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<TextSubtext> {
        @Override // android.os.Parcelable.Creator
        public final TextSubtext createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
            String readString = parcel.readString();
            OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(TextSubtext.class.getClassLoader());
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(TextSubtext.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new TextSubtext(create, readString, create2, readString2, readString3, readString4, atomActionDTO, readString5, linkedHashMap, (TestInfo) parcel.readParcelable(TextSubtext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextSubtext[] newArray(int i11) {
            return new TextSubtext[i11];
        }
    }

    public /* synthetic */ TextSubtext(OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, String str2, String str3, String str4, AtomActionDTO atomActionDTO, String str5, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? null : str, ozonSpannableString2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo);
    }

    public static /* synthetic */ TextSubtext copy$default(TextSubtext textSubtext, OzonSpannableString ozonSpannableString, String str, OzonSpannableString ozonSpannableString2, String str2, String str3, String str4, AtomActionDTO atomActionDTO, String str5, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = textSubtext.text;
        }
        if ((i11 & 2) != 0) {
            str = textSubtext.textColor;
        }
        if ((i11 & 4) != 0) {
            ozonSpannableString2 = textSubtext.subtext;
        }
        if ((i11 & 8) != 0) {
            str2 = textSubtext.subtextColor;
        }
        if ((i11 & 16) != 0) {
            str3 = textSubtext.image;
        }
        if ((i11 & 32) != 0) {
            str4 = textSubtext.tintColor;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = textSubtext.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str5 = textSubtext.context;
        }
        if ((i11 & 256) != 0) {
            map = textSubtext.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            testInfo = textSubtext.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return textSubtext.copy(ozonSpannableString, str, ozonSpannableString2, str2, str7, str8, atomActionDTO2, str6, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final OzonSpannableString getSubtext() {
        return this.subtext;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtextColor() {
        return this.subtextColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextSubtext copy(@NotNull OzonSpannableString text, String textColor, OzonSpannableString subtext, String subtextColor, String image, String tintColor, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextSubtext(text, textColor, subtext, subtextColor, image, tintColor, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextSubtext)) {
            return false;
        }
        TextSubtext textSubtext = (TextSubtext) other;
        return Intrinsics.d(this.text, textSubtext.text) && Intrinsics.d(this.textColor, textSubtext.textColor) && Intrinsics.d(this.subtext, textSubtext.subtext) && Intrinsics.d(this.subtextColor, textSubtext.subtextColor) && Intrinsics.d(this.image, textSubtext.image) && Intrinsics.d(this.tintColor, textSubtext.tintColor) && Intrinsics.d(this.action, textSubtext.action) && Intrinsics.d(this.context, textSubtext.context) && Intrinsics.d(this.trackingInfo, textSubtext.trackingInfo) && Intrinsics.d(this.testInfo, textSubtext.testInfo);
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
        return R$id.atom_type_text_subtext;
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

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OzonSpannableString ozonSpannableString = this.subtext;
        int hashCode3 = (hashCode2 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str2 = this.subtextColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tintColor;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str5 = this.context;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode9 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.textColor;
        OzonSpannableString ozonSpannableString2 = this.subtext;
        String str2 = this.subtextColor;
        String str3 = this.image;
        String str4 = this.tintColor;
        AtomActionDTO atomActionDTO = this.action;
        String str5 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder f7 = b.f("TextSubtext(text=", ozonSpannableString, ", textColor=", str, ", subtext=");
        a.c(", subtextColor=", str2, ", image=", f7, ozonSpannableString2);
        Nh.a.h(f7, str3, ", tintColor=", str4, ", action=");
        HY.b.d(", context=", str5, ", trackingInfo=", f7, atomActionDTO);
        return Ns.b.b(", testInfo=", ")", f7, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
        ozonSpannableStringParceler.write(this.text, dest, flags);
        dest.writeString(this.textColor);
        ozonSpannableStringParceler.write(this.subtext, dest, flags);
        dest.writeString(this.subtextColor);
        dest.writeString(this.image);
        dest.writeString(this.tintColor);
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
    public TextSubtext(@NotNull OzonSpannableString text, String str, OzonSpannableString ozonSpannableString, String str2, String str3, String str4, AtomActionDTO atomActionDTO, String str5, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.TEXT_SUBTEXT, str5, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textColor = str;
        this.subtext = ozonSpannableString;
        this.subtextColor = str2;
        this.image = str3;
        this.tintColor = str4;
        this.action = atomActionDTO;
        this.context = str5;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
