package ru.ozon.app.android.favorites.data.shoppinglists.models;

import Ak.C2436a;
import G.g;
import Nh.a;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesList;", "", "", "id", "", "deeplink", "link", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getDeeplink", "getLink", "getTitle", "getDescription", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateFavoritesList {

    @NotNull
    private final String deeplink;

    @NotNull
    private final String description;
    private final long id;

    @NotNull
    private final String link;

    @NotNull
    private final String title;

    public CreateFavoritesList(long j11, @NotNull String deeplink, @NotNull String link, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = j11;
        this.deeplink = deeplink;
        this.link = link;
        this.title = title;
        this.description = description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFavoritesList)) {
            return false;
        }
        CreateFavoritesList createFavoritesList = (CreateFavoritesList) other;
        return this.id == createFavoritesList.id && Intrinsics.d(this.deeplink, createFavoritesList.deeplink) && Intrinsics.d(this.link, createFavoritesList.link) && Intrinsics.d(this.title, createFavoritesList.title) && Intrinsics.d(this.description, createFavoritesList.description);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return this.description.hashCode() + g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.deeplink), 31, this.link), 31, this.title);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.deeplink;
        String str2 = this.link;
        String str3 = this.title;
        String str4 = this.description;
        StringBuilder c11 = C2436a.c(j11, "CreateFavoritesList(id=", ", deeplink=", str);
        a.h(c11, ", link=", str2, ", title=", str3);
        return C6594f.a(", description=", str4, ")", c11);
    }
}
