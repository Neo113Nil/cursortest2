package ru.ozon.app.android.atoms.data.deprecated;

import Bk.C2638a;
import C.J;
import De.C2859b;
import Kk.C3532b;
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
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/RadioItem;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "isChecked", "", "isEnabled", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ZZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RadioItem extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<RadioItem> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final boolean isChecked;
    private final boolean isEnabled;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RadioItem> {
        @Override // android.os.Parcelable.Creator
        public final RadioItem createFromParcel(Parcel parcel) {
            boolean z11;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            boolean z13 = parcel.readInt() != 0 ? z11 : false;
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(RadioItem.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(RadioItem.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new RadioItem(create, z12, z13, atomActionDTO, readString, linkedHashMap, (TestInfo) parcel.readParcelable(RadioItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RadioItem[] newArray(int i11) {
            return new RadioItem[i11];
        }
    }

    public /* synthetic */ RadioItem(OzonSpannableString ozonSpannableString, boolean z11, boolean z12, AtomActionDTO atomActionDTO, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12, atomActionDTO, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : map, (i11 & 64) != 0 ? null : testInfo);
    }

    public static /* synthetic */ RadioItem copy$default(RadioItem radioItem, OzonSpannableString ozonSpannableString, boolean z11, boolean z12, AtomActionDTO atomActionDTO, String str, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = radioItem.text;
        }
        if ((i11 & 2) != 0) {
            z11 = radioItem.isChecked;
        }
        if ((i11 & 4) != 0) {
            z12 = radioItem.isEnabled;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = radioItem.action;
        }
        if ((i11 & 16) != 0) {
            str = radioItem.context;
        }
        if ((i11 & 32) != 0) {
            map = radioItem.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = radioItem.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        String str2 = str;
        boolean z13 = z12;
        return radioItem.copy(ozonSpannableString, z11, z13, atomActionDTO, str2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
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
    public final RadioItem copy(@NotNull OzonSpannableString text, boolean isChecked, boolean isEnabled, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new RadioItem(text, isChecked, isEnabled, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioItem)) {
            return false;
        }
        RadioItem radioItem = (RadioItem) other;
        return Intrinsics.d(this.text, radioItem.text) && this.isChecked == radioItem.isChecked && this.isEnabled == radioItem.isEnabled && Intrinsics.d(this.action, radioItem.action) && Intrinsics.d(this.context, radioItem.context) && Intrinsics.d(this.trackingInfo, radioItem.trackingInfo) && Intrinsics.d(this.testInfo, radioItem.testInfo);
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
        return R$id.atom_type_radio_item;
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
        int a11 = C3532b.a(C3532b.a(this.text.hashCode() * 31, 31, this.isChecked), 31, this.isEnabled);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.context;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        boolean z11 = this.isChecked;
        boolean z12 = this.isEnabled;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("RadioItem(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", isChecked=");
        sb2.append(z11);
        sb2.append(", isEnabled=");
        sb2.append(z12);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", context=");
        C2638a.e(sb2, str, ", trackingInfo=", map, ", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeInt(this.isEnabled ? 1 : 0);
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
    public RadioItem(@NotNull OzonSpannableString text, boolean z11, boolean z12, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.RADIO_ITEM, str, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isChecked = z11;
        this.isEnabled = z12;
        this.action = atomActionDTO;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
