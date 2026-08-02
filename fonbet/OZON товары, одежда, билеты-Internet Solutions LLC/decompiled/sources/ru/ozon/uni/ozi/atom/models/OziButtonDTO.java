package ru.ozon.uni.ozi.atom.models;

import D40.c;
import G.g;
import I0.C3173b;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ABB\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010&\u001a\u00020'H\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00105J\u0006\u00106\u001a\u00020'J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020'HÖ\u0001J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020'R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\n\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u0006C"}, d2 = {"Lru/ozon/uni/ozi/atom/models/OziButtonDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "styleType", "Lru/ozon/uni/ozi/atom/models/OziButtonDTO$StyleTypes;", "size", "Lru/ozon/uni/ozi/atom/models/OziButtonDTO$Sizes;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "icon", "isDisabled", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "titleColor", "subtitleColor", "iconColor", "backgroundColor", "context", "<init>", "(Lru/ozon/uni/ozi/atom/models/OziButtonDTO$StyleTypes;Lru/ozon/uni/ozi/atom/models/OziButtonDTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStyleType", "()Lru/ozon/uni/ozi/atom/models/OziButtonDTO$StyleTypes;", "getSize", "()Lru/ozon/uni/ozi/atom/models/OziButtonDTO$Sizes;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTitleColor", "getSubtitleColor", "getIconColor", "getBackgroundColor", "getContext", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/uni/ozi/atom/models/OziButtonDTO$StyleTypes;Lru/ozon/uni/ozi/atom/models/OziButtonDTO$Sizes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/ozi/atom/models/OziButtonDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Sizes", "StyleTypes", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OziButtonDTO extends AtomDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OziButtonDTO> CREATOR = new Creator();
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final String context;
    private final String icon;
    private final String iconColor;
    private final Boolean isDisabled;
    private final Sizes size;
    private final StyleTypes styleType;
    private final String subtitle;
    private final String subtitleColor;

    @NotNull
    private final String title;
    private final String titleColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OziButtonDTO> {
        @Override // android.os.Parcelable.Creator
        public final OziButtonDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StyleTypes valueOf2 = parcel.readInt() == 0 ? null : StyleTypes.valueOf(parcel.readString());
            Sizes valueOf3 = parcel.readInt() == 0 ? null : Sizes.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OziButtonDTO(valueOf2, valueOf3, readString, readString2, readString3, valueOf, parcel.readInt() != 0 ? CommonControlSettings.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OziButtonDTO[] newArray(int i11) {
            return new OziButtonDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/atom/models/OziButtonDTO$Sizes;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_INVALID", "SIZE_400", "SIZE_500", "SIZE_600", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Sizes[] $VALUES;
        public static final Sizes SIZE_INVALID = new Sizes("SIZE_INVALID", 0);
        public static final Sizes SIZE_400 = new Sizes("SIZE_400", 1);
        public static final Sizes SIZE_500 = new Sizes("SIZE_500", 2);
        public static final Sizes SIZE_600 = new Sizes("SIZE_600", 3);

        private static final /* synthetic */ Sizes[] $values() {
            return new Sizes[]{SIZE_INVALID, SIZE_400, SIZE_500, SIZE_600};
        }

        static {
            Sizes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Sizes(String str, int i11) {
        }

        public static Sizes valueOf(String str) {
            return (Sizes) Enum.valueOf(Sizes.class, str);
        }

        public static Sizes[] values() {
            return (Sizes[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/atom/models/OziButtonDTO$StyleTypes;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_INVALID", "ACTION_PRIMARY", "ACTION_SECONDARY", "NEGATIVE_SECONDARY", "NEUTRAL_SECONDARY", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StyleTypes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StyleTypes[] $VALUES;
        public static final StyleTypes STYLE_INVALID = new StyleTypes("STYLE_INVALID", 0);
        public static final StyleTypes ACTION_PRIMARY = new StyleTypes("ACTION_PRIMARY", 1);
        public static final StyleTypes ACTION_SECONDARY = new StyleTypes("ACTION_SECONDARY", 2);
        public static final StyleTypes NEGATIVE_SECONDARY = new StyleTypes("NEGATIVE_SECONDARY", 3);
        public static final StyleTypes NEUTRAL_SECONDARY = new StyleTypes("NEUTRAL_SECONDARY", 4);
        public static final StyleTypes CUSTOM = new StyleTypes("CUSTOM", 5);

        private static final /* synthetic */ StyleTypes[] $values() {
            return new StyleTypes[]{STYLE_INVALID, ACTION_PRIMARY, ACTION_SECONDARY, NEGATIVE_SECONDARY, NEUTRAL_SECONDARY, CUSTOM};
        }

        static {
            StyleTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StyleTypes(String str, int i11) {
        }

        public static StyleTypes valueOf(String str) {
            return (StyleTypes) Enum.valueOf(StyleTypes.class, str);
        }

        public static StyleTypes[] values() {
            return (StyleTypes[]) $VALUES.clone();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OziButtonDTO(ru.ozon.uni.ozi.atom.models.OziButtonDTO.StyleTypes r2, ru.ozon.uni.ozi.atom.models.OziButtonDTO.Sizes r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Boolean r7, ru.ozon.uni.atoms.data.controls.CommonControlSettings r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            ru.ozon.uni.ozi.atom.models.OziButtonDTO$StyleTypes r2 = ru.ozon.uni.ozi.atom.models.OziButtonDTO.StyleTypes.ACTION_PRIMARY
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Lc
            ru.ozon.uni.ozi.atom.models.OziButtonDTO$Sizes r3 = ru.ozon.uni.ozi.atom.models.OziButtonDTO.Sizes.SIZE_500
        Lc:
            r15 = r14 & 8
            r0 = 0
            if (r15 == 0) goto L12
            r5 = r0
        L12:
            r15 = r14 & 16
            if (r15 == 0) goto L17
            r6 = r0
        L17:
            r15 = r14 & 32
            if (r15 == 0) goto L1d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L1d:
            r15 = r14 & 64
            if (r15 == 0) goto L22
            r8 = r0
        L22:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L27
            r9 = r0
        L27:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L2c
            r10 = r0
        L2c:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L31
            r11 = r0
        L31:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L36
            r12 = r0
        L36:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L48
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L55
        L48:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L55:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.ozi.atom.models.OziButtonDTO.<init>(ru.ozon.uni.ozi.atom.models.OziButtonDTO$StyleTypes, ru.ozon.uni.ozi.atom.models.OziButtonDTO$Sizes, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, ru.ozon.uni.atoms.data.controls.CommonControlSettings, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ OziButtonDTO copy$default(OziButtonDTO oziButtonDTO, StyleTypes styleTypes, Sizes sizes, String str, String str2, String str3, Boolean bool, CommonControlSettings commonControlSettings, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            styleTypes = oziButtonDTO.styleType;
        }
        if ((i11 & 2) != 0) {
            sizes = oziButtonDTO.size;
        }
        if ((i11 & 4) != 0) {
            str = oziButtonDTO.title;
        }
        if ((i11 & 8) != 0) {
            str2 = oziButtonDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            str3 = oziButtonDTO.icon;
        }
        if ((i11 & 32) != 0) {
            bool = oziButtonDTO.isDisabled;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = oziButtonDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str4 = oziButtonDTO.titleColor;
        }
        if ((i11 & 256) != 0) {
            str5 = oziButtonDTO.subtitleColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str6 = oziButtonDTO.iconColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str7 = oziButtonDTO.backgroundColor;
        }
        if ((i11 & 2048) != 0) {
            str8 = oziButtonDTO.context;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str13 = str4;
        String str14 = str3;
        Boolean bool2 = bool;
        return oziButtonDTO.copy(styleTypes, sizes, str, str2, str14, bool2, commonControlSettings2, str13, str11, str12, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final StyleTypes getStyleType() {
        return this.styleType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final Sizes getSize() {
        return this.size;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final OziButtonDTO copy(StyleTypes styleType, Sizes size, @NotNull String title, String subtitle, String icon, Boolean isDisabled, CommonControlSettings common, String titleColor, String subtitleColor, String iconColor, String backgroundColor, String context) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OziButtonDTO(styleType, size, title, subtitle, icon, isDisabled, common, titleColor, subtitleColor, iconColor, backgroundColor, context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OziButtonDTO)) {
            return false;
        }
        OziButtonDTO oziButtonDTO = (OziButtonDTO) other;
        return this.styleType == oziButtonDTO.styleType && this.size == oziButtonDTO.size && Intrinsics.d(this.title, oziButtonDTO.title) && Intrinsics.d(this.subtitle, oziButtonDTO.subtitle) && Intrinsics.d(this.icon, oziButtonDTO.icon) && Intrinsics.d(this.isDisabled, oziButtonDTO.isDisabled) && Intrinsics.d(this.common, oziButtonDTO.common) && Intrinsics.d(this.titleColor, oziButtonDTO.titleColor) && Intrinsics.d(this.subtitleColor, oziButtonDTO.subtitleColor) && Intrinsics.d(this.iconColor, oziButtonDTO.iconColor) && Intrinsics.d(this.backgroundColor, oziButtonDTO.backgroundColor) && Intrinsics.d(this.context, oziButtonDTO.context);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.oziButton;
    }

    public final Sizes getSize() {
        return this.size;
    }

    public final StyleTypes getStyleType() {
        return this.styleType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        StyleTypes styleTypes = this.styleType;
        int hashCode = (styleTypes == null ? 0 : styleTypes.hashCode()) * 31;
        Sizes sizes = this.size;
        int a11 = g.a((hashCode + (sizes == null ? 0 : sizes.hashCode())) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        String str3 = this.titleColor;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitleColor;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconColor;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backgroundColor;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.context;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        StyleTypes styleTypes = this.styleType;
        Sizes sizes = this.size;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.icon;
        Boolean bool = this.isDisabled;
        CommonControlSettings commonControlSettings = this.common;
        String str4 = this.titleColor;
        String str5 = this.subtitleColor;
        String str6 = this.iconColor;
        String str7 = this.backgroundColor;
        String str8 = this.context;
        StringBuilder sb2 = new StringBuilder("OziButtonDTO(styleType=");
        sb2.append(styleTypes);
        sb2.append(", size=");
        sb2.append(sizes);
        sb2.append(", title=");
        Nh.a.h(sb2, str, ", subtitle=", str2, ", icon=");
        Sh.a.d(bool, str3, ", isDisabled=", ", common=", sb2);
        sb2.append(commonControlSettings);
        sb2.append(", titleColor=");
        sb2.append(str4);
        sb2.append(", subtitleColor=");
        Nh.a.h(sb2, str5, ", iconColor=", str6, ", backgroundColor=");
        return C3173b.c(sb2, str7, ", context=", str8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StyleTypes styleTypes = this.styleType;
        if (styleTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleTypes.name());
        }
        Sizes sizes = this.size;
        if (sizes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizes.name());
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.icon);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        dest.writeString(this.titleColor);
        dest.writeString(this.subtitleColor);
        dest.writeString(this.iconColor);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OziButtonDTO(StyleTypes styleTypes, Sizes sizes, @NotNull String title, String str, String str2, Boolean bool, CommonControlSettings commonControlSettings, String str3, String str4, String str5, String str6, String str7) {
        super(OziAtomsType.OziButton, str7, commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null, commonControlSettings != null ? commonControlSettings.getTestInfo() : null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.styleType = styleTypes;
        this.size = sizes;
        this.title = title;
        this.subtitle = str;
        this.icon = str2;
        this.isDisabled = bool;
        this.common = commonControlSettings;
        this.titleColor = str3;
        this.subtitleColor = str4;
        this.iconColor = str5;
        this.backgroundColor = str6;
        this.context = str7;
    }
}
