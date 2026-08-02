package ru.ozon.app.android.storefront.core.socialAtoms.iconButton;

import C.J;
import De.C2859b;
import G.g;
import Pk0.h;
import Sh.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.socialAtoms.SocialAtomType;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size;
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010+\u001a\u00020\"J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\"HÖ\u0001J\t\u00101\u001a\u00020\tHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00067"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "style", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "cornerStyle", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;", "size", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getStyle", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Style;", "getCornerStyle", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/CornerStyle;", "getSize", "()Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/style/Size;", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SocialIconButtonDTO extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<SocialIconButtonDTO> CREATOR = new Creator();
    private final AtomActionDTO action;

    @NotNull
    private final CornerStyle cornerStyle;

    @NotNull
    private final String icon;

    @NotNull
    private final Size size;

    @NotNull
    private final Style style;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<SocialIconButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final SocialIconButtonDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Style valueOf = Style.valueOf(parcel.readString());
            CornerStyle valueOf2 = CornerStyle.valueOf(parcel.readString());
            Size valueOf3 = Size.valueOf(parcel.readString());
            String readString = parcel.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(SocialIconButtonDTO.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(SocialIconButtonDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new SocialIconButtonDTO(valueOf, valueOf2, valueOf3, readString, atomActionDTO, linkedHashMap, (TestInfo) parcel.readParcelable(SocialIconButtonDTO.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SocialIconButtonDTO[] newArray(int i11) {
            return new SocialIconButtonDTO[i11];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SocialIconButtonDTO(ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style r9, ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle r10, ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size r11, java.lang.String r12, ru.ozon.uni.atoms.data.AtomActionDTO r13, java.util.Map r14, ru.ozon.uni.atoms.data.TestInfo r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L6
            ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle r10 = ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle.CORNER_STYLE_DEFAULT
        L6:
            r2 = r10
            r10 = r16 & 16
            r0 = 0
            if (r10 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r10 = r16 & 64
            if (r10 == 0) goto L1a
            r7 = r0
            r1 = r9
            r3 = r11
            r4 = r12
            r6 = r14
            r0 = r8
            goto L20
        L1a:
            r7 = r15
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r6 = r14
        L20:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO.<init>(ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Style, ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.CornerStyle, ru.ozon.app.android.storefront.core.socialAtoms.iconButton.style.Size, java.lang.String, ru.ozon.uni.atoms.data.AtomActionDTO, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ SocialIconButtonDTO copy$default(SocialIconButtonDTO socialIconButtonDTO, Style style, CornerStyle cornerStyle, Size size, String str, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            style = socialIconButtonDTO.style;
        }
        if ((i11 & 2) != 0) {
            cornerStyle = socialIconButtonDTO.cornerStyle;
        }
        if ((i11 & 4) != 0) {
            size = socialIconButtonDTO.size;
        }
        if ((i11 & 8) != 0) {
            str = socialIconButtonDTO.icon;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = socialIconButtonDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = socialIconButtonDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = socialIconButtonDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Size size2 = size;
        return socialIconButtonDTO.copy(style, cornerStyle, size2, str, atomActionDTO2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CornerStyle getCornerStyle() {
        return this.cornerStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final SocialIconButtonDTO copy(@NotNull Style style, @NotNull CornerStyle cornerStyle, @NotNull Size size, @NotNull String icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(cornerStyle, "cornerStyle");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new SocialIconButtonDTO(style, cornerStyle, size, icon, action, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialIconButtonDTO)) {
            return false;
        }
        SocialIconButtonDTO socialIconButtonDTO = (SocialIconButtonDTO) other;
        return this.style == socialIconButtonDTO.style && this.cornerStyle == socialIconButtonDTO.cornerStyle && this.size == socialIconButtonDTO.size && Intrinsics.d(this.icon, socialIconButtonDTO.icon) && Intrinsics.d(this.action, socialIconButtonDTO.action) && Intrinsics.d(this.trackingInfo, socialIconButtonDTO.trackingInfo) && Intrinsics.d(this.testInfo, socialIconButtonDTO.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final CornerStyle getCornerStyle() {
        return this.cornerStyle;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_social_icon_button_dto;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
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
        int a11 = g.a((this.size.hashCode() + ((this.cornerStyle.hashCode() + (this.style.hashCode() * 31)) * 31)) * 31, 31, this.icon);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Style style = this.style;
        CornerStyle cornerStyle = this.cornerStyle;
        Size size = this.size;
        String str = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("SocialIconButtonDTO(style=");
        sb2.append(style);
        sb2.append(", cornerStyle=");
        sb2.append(cornerStyle);
        sb2.append(", size=");
        sb2.append(size);
        sb2.append(", icon=");
        sb2.append(str);
        sb2.append(", action=");
        b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.style.name());
        dest.writeString(this.cornerStyle.name());
        dest.writeString(this.size.name());
        dest.writeString(this.icon);
        dest.writeParcelable(this.action, flags);
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
    public SocialIconButtonDTO(@NotNull Style style, @NotNull CornerStyle cornerStyle, @NotNull Size size, @NotNull String icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(SocialAtomType.SOCIAL_ICON_BUTTON_ATOM, null, map, testInfo);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(cornerStyle, "cornerStyle");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.style = style;
        this.cornerStyle = cornerStyle;
        this.size = size;
        this.icon = icon;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
