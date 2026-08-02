package ru.ozon.uni.atoms.data.button;

import C.J;
import De.C2859b;
import Ql.c;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ji\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonIcon;", "Lru/ozon/uni/atoms/data/AtomDTO;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tintColor", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTintColor", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ButtonIcon extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ButtonIcon> CREATOR = new Creator();
    private final AtomActionDTO action;
    private final String context;
    private final String icon;
    private final TestInfo testInfo;
    private final ButtonV3Atom.LargeIconButtonStyle theme;
    private final String tintColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ButtonIcon> {
        @Override // android.os.Parcelable.Creator
        public final ButtonIcon createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            ButtonV3Atom.LargeIconButtonStyle valueOf = parcel.readInt() == 0 ? null : ButtonV3Atom.LargeIconButtonStyle.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(ButtonIcon.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ButtonIcon(readString, createFromParcel, readString2, valueOf, readString3, createFromParcel2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonIcon[] newArray(int i11) {
            return new ButtonIcon[i11];
        }
    }

    public /* synthetic */ ButtonIcon(String str, AtomActionDTO atomActionDTO, String str2, ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : largeIconButtonStyle, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
    }

    public static /* synthetic */ ButtonIcon copy$default(ButtonIcon buttonIcon, String str, AtomActionDTO atomActionDTO, String str2, ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonIcon.icon;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = buttonIcon.action;
        }
        if ((i11 & 4) != 0) {
            str2 = buttonIcon.tintColor;
        }
        if ((i11 & 8) != 0) {
            largeIconButtonStyle = buttonIcon.theme;
        }
        if ((i11 & 16) != 0) {
            str3 = buttonIcon.context;
        }
        if ((i11 & 32) != 0) {
            testInfo = buttonIcon.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = buttonIcon.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str4 = str3;
        String str5 = str2;
        return buttonIcon.copy(str, atomActionDTO, str5, largeIconButtonStyle, str4, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeIconButtonStyle getTheme() {
        return this.theme;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final ButtonIcon copy(String icon, AtomActionDTO action, String tintColor, ButtonV3Atom.LargeIconButtonStyle theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new ButtonIcon(icon, action, tintColor, theme, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonIcon)) {
            return false;
        }
        ButtonIcon buttonIcon = (ButtonIcon) other;
        return Intrinsics.d(this.icon, buttonIcon.icon) && Intrinsics.d(this.action, buttonIcon.action) && Intrinsics.d(this.tintColor, buttonIcon.tintColor) && this.theme == buttonIcon.theme && Intrinsics.d(this.context, buttonIcon.context) && Intrinsics.d(this.testInfo, buttonIcon.testInfo) && Intrinsics.d(this.trackingInfo, buttonIcon.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_button_icon;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final ButtonV3Atom.LargeIconButtonStyle getTheme() {
        return this.theme;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str2 = this.tintColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle = this.theme;
        int hashCode4 = (hashCode3 + (largeIconButtonStyle == null ? 0 : largeIconButtonStyle.hashCode())) * 31;
        String str3 = this.context;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.tintColor;
        ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle = this.theme;
        String str3 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = c.c("ButtonIcon(icon=", str, ", action=", atomActionDTO, ", tintColor=");
        c11.append(str2);
        c11.append(", theme=");
        c11.append(largeIconButtonStyle);
        c11.append(", context=");
        C4070a.b(c11, str3, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(c11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.icon);
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
        }
        dest.writeString(this.tintColor);
        ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle = this.theme;
        if (largeIconButtonStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(largeIconButtonStyle.name());
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

    public ButtonIcon(String str, AtomActionDTO atomActionDTO, String str2, ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(AtomTypeImpl.BUTTON_ICON, str3, map, testInfo);
        this.icon = str;
        this.action = atomActionDTO;
        this.tintColor = str2;
        this.theme = largeIconButtonStyle;
        this.context = str3;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
