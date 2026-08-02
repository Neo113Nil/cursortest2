package ru.ozon.app.android.atoms.data.authorBlock;

import C.J;
import De.C2859b;
import HY.b;
import N3.C3660k;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010#\u001a\u00020$H\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jq\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u0010.\u001a\u00020$J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020$HÖ\u0001J\t\u00104\u001a\u00020\fHÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006;"}, d2 = {"Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock;", "Lru/ozon/uni/atoms/data/AtomDTO;", "avatar", "Lru/ozon/uni/atoms/data/avatar/Avatar;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock$Title;", "subtitle", "iconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/avatar/Avatar;Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock$Title;Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock$Title;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getTitle", "()Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock$Title;", "getSubtitle", "getIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Title", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AuthorBlock extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<AuthorBlock> CREATOR = new Creator();
    private final AtomActionDTO action;

    @NotNull
    private final Avatar avatar;
    private final String context;
    private final ButtonV3Atom.SmallIconButton iconButton;
    private final Title subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final Title title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<AuthorBlock> {
        @Override // android.os.Parcelable.Creator
        public final AuthorBlock createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Avatar avatar = (Avatar) parcel.readParcelable(AuthorBlock.class.getClassLoader());
            Parcelable.Creator<Title> creator = Title.CREATOR;
            Title createFromParcel = creator.createFromParcel(parcel);
            LinkedHashMap linkedHashMap = null;
            Title createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            ButtonV3Atom.SmallIconButton smallIconButton = (ButtonV3Atom.SmallIconButton) parcel.readParcelable(AuthorBlock.class.getClassLoader());
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(AuthorBlock.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(AuthorBlock.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AuthorBlock(avatar, createFromParcel, createFromParcel2, smallIconButton, atomActionDTO, readString, linkedHashMap, (TestInfo) parcel.readParcelable(AuthorBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorBlock[] newArray(int i11) {
            return new AuthorBlock[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/atoms/data/authorBlock/AuthorBlock$Title;", "Landroid/os/Parcelable;", "text", "", "color", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;)V", "getText", "()Ljava/lang/String;", "getColor", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Title implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Title> CREATOR = new Creator();
        private final String color;
        private final Icon icon;

        @NotNull
        private final String text;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Title> {
            @Override // android.os.Parcelable.Creator
            public final Title createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Title(parcel.readString(), parcel.readString(), (Icon) parcel.readParcelable(Title.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Title[] newArray(int i11) {
                return new Title[i11];
            }
        }

        public Title(@NotNull String text, String str, Icon icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = str;
            this.icon = icon;
        }

        public static /* synthetic */ Title copy$default(Title title, String str, String str2, Icon icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = title.text;
            }
            if ((i11 & 2) != 0) {
                str2 = title.color;
            }
            if ((i11 & 4) != 0) {
                icon = title.icon;
            }
            return title.copy(str, str2, icon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final Title copy(@NotNull String text, String color, Icon icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Title(text, color, icon);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return Intrinsics.d(this.text, title.text) && Intrinsics.d(this.color, title.color) && Intrinsics.d(this.icon, title.icon);
        }

        public final String getColor() {
            return this.color;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Icon icon = this.icon;
            return hashCode2 + (icon != null ? icon.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.color;
            Icon icon = this.icon;
            StringBuilder d11 = C3660k.d("Title(text=", str, ", color=", str2, ", icon=");
            d11.append(icon);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeString(this.color);
            dest.writeParcelable(this.icon, flags);
        }
    }

    public /* synthetic */ AuthorBlock(Avatar avatar, Title title, Title title2, ButtonV3Atom.SmallIconButton smallIconButton, AtomActionDTO atomActionDTO, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(avatar, title, title2, smallIconButton, atomActionDTO, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo);
    }

    public static /* synthetic */ AuthorBlock copy$default(AuthorBlock authorBlock, Avatar avatar, Title title, Title title2, ButtonV3Atom.SmallIconButton smallIconButton, AtomActionDTO atomActionDTO, String str, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            avatar = authorBlock.avatar;
        }
        if ((i11 & 2) != 0) {
            title = authorBlock.title;
        }
        if ((i11 & 4) != 0) {
            title2 = authorBlock.subtitle;
        }
        if ((i11 & 8) != 0) {
            smallIconButton = authorBlock.iconButton;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = authorBlock.action;
        }
        if ((i11 & 32) != 0) {
            str = authorBlock.context;
        }
        if ((i11 & 64) != 0) {
            map = authorBlock.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            testInfo = authorBlock.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str2 = str;
        return authorBlock.copy(avatar, title, title2, smallIconButton, atomActionDTO2, str2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Title getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Title getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
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
    public final AuthorBlock copy(@NotNull Avatar avatar, @NotNull Title title, Title subtitle, ButtonV3Atom.SmallIconButton iconButton, AtomActionDTO action, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AuthorBlock(avatar, title, subtitle, iconButton, action, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorBlock)) {
            return false;
        }
        AuthorBlock authorBlock = (AuthorBlock) other;
        return Intrinsics.d(this.avatar, authorBlock.avatar) && Intrinsics.d(this.title, authorBlock.title) && Intrinsics.d(this.subtitle, authorBlock.subtitle) && Intrinsics.d(this.iconButton, authorBlock.iconButton) && Intrinsics.d(this.action, authorBlock.action) && Intrinsics.d(this.context, authorBlock.context) && Intrinsics.d(this.trackingInfo, authorBlock.trackingInfo) && Intrinsics.d(this.testInfo, authorBlock.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final ButtonV3Atom.SmallIconButton getIconButton() {
        return this.iconButton;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_author_block;
    }

    public final Title getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final Title getTitle() {
        return this.title;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.title.hashCode() + (this.avatar.hashCode() * 31)) * 31;
        Title title = this.subtitle;
        int hashCode2 = (hashCode + (title == null ? 0 : title.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        int hashCode3 = (hashCode2 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.context;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Avatar avatar = this.avatar;
        Title title = this.title;
        Title title2 = this.subtitle;
        ButtonV3Atom.SmallIconButton smallIconButton = this.iconButton;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("AuthorBlock(avatar=");
        sb2.append(avatar);
        sb2.append(", title=");
        sb2.append(title);
        sb2.append(", subtitle=");
        sb2.append(title2);
        sb2.append(", iconButton=");
        sb2.append(smallIconButton);
        sb2.append(", action=");
        b.d(", context=", str, ", trackingInfo=", sb2, atomActionDTO);
        return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.avatar, flags);
        this.title.writeToParcel(dest, flags);
        Title title = this.subtitle;
        if (title == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            title.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.iconButton, flags);
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
    public AuthorBlock(@NotNull Avatar avatar, @NotNull Title title, Title title2, ButtonV3Atom.SmallIconButton smallIconButton, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.AUTHOR_BLOCK, str, map, testInfo);
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(title, "title");
        this.avatar = avatar;
        this.title = title;
        this.subtitle = title2;
        this.iconButton = smallIconButton;
        this.action = atomActionDTO;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
