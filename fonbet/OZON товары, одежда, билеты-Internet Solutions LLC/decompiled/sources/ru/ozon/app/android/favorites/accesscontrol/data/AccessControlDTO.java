package ru.ozon.app.android.favorites.accesscontrol.data;

import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "listName", "icon", "subtitle", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "users", "", "Lru/ozon/app/android/favorites/accesscontrol/data/UserDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getListName", "getIcon", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getUsers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccessControlDTO {
    private final ButtonV3Atom.SmallButton button;

    @NotNull
    private final String icon;
    private final String listName;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final List<UserDTO> users;

    public AccessControlDTO(@NotNull String title, String str, @NotNull String icon, @NotNull String subtitle, ButtonV3Atom.SmallButton smallButton, List<UserDTO> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.listName = str;
        this.icon = icon;
        this.subtitle = subtitle;
        this.button = smallButton;
        this.users = list;
    }

    public static /* synthetic */ AccessControlDTO copy$default(AccessControlDTO accessControlDTO, String str, String str2, String str3, String str4, ButtonV3Atom.SmallButton smallButton, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accessControlDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = accessControlDTO.listName;
        }
        if ((i11 & 4) != 0) {
            str3 = accessControlDTO.icon;
        }
        if ((i11 & 8) != 0) {
            str4 = accessControlDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            smallButton = accessControlDTO.button;
        }
        if ((i11 & 32) != 0) {
            list = accessControlDTO.users;
        }
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        List list2 = list;
        return accessControlDTO.copy(str, str2, str3, str4, smallButton2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getListName() {
        return this.listName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final List<UserDTO> component6() {
        return this.users;
    }

    @NotNull
    public final AccessControlDTO copy(@NotNull String title, String listName, @NotNull String icon, @NotNull String subtitle, ButtonV3Atom.SmallButton button, List<UserDTO> users) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new AccessControlDTO(title, listName, icon, subtitle, button, users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessControlDTO)) {
            return false;
        }
        AccessControlDTO accessControlDTO = (AccessControlDTO) other;
        return Intrinsics.d(this.title, accessControlDTO.title) && Intrinsics.d(this.listName, accessControlDTO.listName) && Intrinsics.d(this.icon, accessControlDTO.icon) && Intrinsics.d(this.subtitle, accessControlDTO.subtitle) && Intrinsics.d(this.button, accessControlDTO.button) && Intrinsics.d(this.users, accessControlDTO.users);
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getListName() {
        return this.listName;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final List<UserDTO> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.listName;
        int a11 = g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon), 31, this.subtitle);
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode2 = (a11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        List<UserDTO> list = this.users;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.listName;
        String str3 = this.icon;
        String str4 = this.subtitle;
        ButtonV3Atom.SmallButton smallButton = this.button;
        List<UserDTO> list = this.users;
        StringBuilder d11 = C3660k.d("AccessControlDTO(title=", str, ", listName=", str2, ", icon=");
        a.h(d11, str3, ", subtitle=", str4, ", button=");
        d11.append(smallButton);
        d11.append(", users=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }
}
