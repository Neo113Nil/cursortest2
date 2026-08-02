package ru.ozon.app.android.favorites.data.shoppinglists.models;

import I0.C3173b;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "", "id", "", "deeplink", "", "link", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "errorForUser", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeeplink", "()Ljava/lang/String;", "getLink", "getTitle", "getDescription", "getErrorForUser", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListResponse;", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateFavoritesListResponse {
    private final String deeplink;
    private final String description;
    private final String errorForUser;
    private final Long id;
    private final String link;
    private final String title;

    public CreateFavoritesListResponse(Long l11, String str, String str2, String str3, String str4, String str5) {
        this.id = l11;
        this.deeplink = str;
        this.link = str2;
        this.title = str3;
        this.description = str4;
        this.errorForUser = str5;
    }

    public static /* synthetic */ CreateFavoritesListResponse copy$default(CreateFavoritesListResponse createFavoritesListResponse, Long l11, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = createFavoritesListResponse.id;
        }
        if ((i11 & 2) != 0) {
            str = createFavoritesListResponse.deeplink;
        }
        if ((i11 & 4) != 0) {
            str2 = createFavoritesListResponse.link;
        }
        if ((i11 & 8) != 0) {
            str3 = createFavoritesListResponse.title;
        }
        if ((i11 & 16) != 0) {
            str4 = createFavoritesListResponse.description;
        }
        if ((i11 & 32) != 0) {
            str5 = createFavoritesListResponse.errorForUser;
        }
        String str6 = str4;
        String str7 = str5;
        return createFavoritesListResponse.copy(l11, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getErrorForUser() {
        return this.errorForUser;
    }

    @NotNull
    public final CreateFavoritesListResponse copy(Long id2, String deeplink, String link, String title, String description, String errorForUser) {
        return new CreateFavoritesListResponse(id2, deeplink, link, title, description, errorForUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFavoritesListResponse)) {
            return false;
        }
        CreateFavoritesListResponse createFavoritesListResponse = (CreateFavoritesListResponse) other;
        return Intrinsics.d(this.id, createFavoritesListResponse.id) && Intrinsics.d(this.deeplink, createFavoritesListResponse.deeplink) && Intrinsics.d(this.link, createFavoritesListResponse.link) && Intrinsics.d(this.title, createFavoritesListResponse.title) && Intrinsics.d(this.description, createFavoritesListResponse.description) && Intrinsics.d(this.errorForUser, createFavoritesListResponse.errorForUser);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorForUser() {
        return this.errorForUser;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Long l11 = this.id;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorForUser;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l11 = this.id;
        String str = this.deeplink;
        String str2 = this.link;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.errorForUser;
        StringBuilder sb2 = new StringBuilder("CreateFavoritesListResponse(id=");
        sb2.append(l11);
        sb2.append(", deeplink=");
        sb2.append(str);
        sb2.append(", link=");
        a.h(sb2, str2, ", title=", str3, ", description=");
        return C3173b.c(sb2, str4, ", errorForUser=", str5, ")");
    }
}
