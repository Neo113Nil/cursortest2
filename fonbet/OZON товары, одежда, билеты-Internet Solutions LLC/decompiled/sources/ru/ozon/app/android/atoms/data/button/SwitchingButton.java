package ru.ozon.app.android.atoms.data.button;

import C.J;
import De.C2859b;
import Kk.C3532b;
import Sc.InterfaceC3999a;
import Ul.C4070a;
import Ve.C4636t5;
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
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JY\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\"\u001a\u00020\u001aJ\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u001aHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, d2 = {"Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "Lru/ozon/uni/atoms/data/AtomDTO;", "id", "", "isActive", "", "defaultButton", "activeButton", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "()Z", "setActive", "(Z)V", "getDefaultButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getActiveButton", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SwitchingButton extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<SwitchingButton> CREATOR = new Creator();
    private final AtomDTO activeButton;
    private final String context;

    @NotNull
    private final AtomDTO defaultButton;
    private final String id;
    private boolean isActive;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<SwitchingButton> {
        @Override // android.os.Parcelable.Creator
        public final SwitchingButton createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            AtomDTO atomDTO = (AtomDTO) parcel.readParcelable(SwitchingButton.class.getClassLoader());
            AtomDTO atomDTO2 = (AtomDTO) parcel.readParcelable(SwitchingButton.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(SwitchingButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SwitchingButton(readString, z11, atomDTO, atomDTO2, readString2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final SwitchingButton[] newArray(int i11) {
            return new SwitchingButton[i11];
        }
    }

    public /* synthetic */ SwitchingButton(String str, boolean z11, AtomDTO atomDTO, AtomDTO atomDTO2, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11, atomDTO, atomDTO2, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : map);
    }

    public static /* synthetic */ SwitchingButton copy$default(SwitchingButton switchingButton, String str, boolean z11, AtomDTO atomDTO, AtomDTO atomDTO2, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = switchingButton.id;
        }
        if ((i11 & 2) != 0) {
            z11 = switchingButton.isActive;
        }
        if ((i11 & 4) != 0) {
            atomDTO = switchingButton.defaultButton;
        }
        if ((i11 & 8) != 0) {
            atomDTO2 = switchingButton.activeButton;
        }
        if ((i11 & 16) != 0) {
            str2 = switchingButton.context;
        }
        if ((i11 & 32) != 0) {
            map = switchingButton.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        return switchingButton.copy(str, z11, atomDTO, atomDTO2, str3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomDTO getDefaultButton() {
        return this.defaultButton;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomDTO getActiveButton() {
        return this.activeButton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final SwitchingButton copy(String id2, boolean isActive, @NotNull AtomDTO defaultButton, AtomDTO activeButton, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
        return new SwitchingButton(id2, isActive, defaultButton, activeButton, context, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchingButton)) {
            return false;
        }
        SwitchingButton switchingButton = (SwitchingButton) other;
        return Intrinsics.d(this.id, switchingButton.id) && this.isActive == switchingButton.isActive && Intrinsics.d(this.defaultButton, switchingButton.defaultButton) && Intrinsics.d(this.activeButton, switchingButton.activeButton) && Intrinsics.d(this.context, switchingButton.context) && Intrinsics.d(this.trackingInfo, switchingButton.trackingInfo);
    }

    public final AtomDTO getActiveButton() {
        return this.activeButton;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @NotNull
    public final AtomDTO getDefaultButton() {
        return this.defaultButton;
    }

    public final String getId() {
        return this.id;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_switching_button;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (this.defaultButton.hashCode() + C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isActive)) * 31;
        AtomDTO atomDTO = this.activeButton;
        int hashCode2 = (hashCode + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        String str2 = this.context;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z11) {
        this.isActive = z11;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z11 = this.isActive;
        AtomDTO atomDTO = this.defaultButton;
        AtomDTO atomDTO2 = this.activeButton;
        String str2 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = C4636t5.b("SwitchingButton(id=", str, ", isActive=", ", defaultButton=", z11);
        b11.append(atomDTO);
        b11.append(", activeButton=");
        b11.append(atomDTO2);
        b11.append(", context=");
        return C4070a.a(b11, str2, ", trackingInfo=", map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeParcelable(this.defaultButton, flags);
        dest.writeParcelable(this.activeButton, flags);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchingButton(String str, boolean z11, @NotNull AtomDTO defaultButton, AtomDTO atomDTO, String str2, Map<String, TokenizedTrackingInfo> map) {
        super(Type.SWITCHING_BUTTON, str2, map, null, 8, null);
        Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
        this.id = str;
        this.isActive = z11;
        this.defaultButton = defaultButton;
        this.activeButton = atomDTO;
        this.context = str2;
        this.trackingInfo = map;
    }
}
