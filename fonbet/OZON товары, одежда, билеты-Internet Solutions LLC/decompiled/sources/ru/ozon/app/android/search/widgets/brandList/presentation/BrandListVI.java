package ru.ozon.app.android.search.widgets.brandList.presentation;

import G.g;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "navBar", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "titleFavorite", "", "favorites", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "sections", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;Ljava/util/List;Ljava/util/Map;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "getNavBar", "()Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "getTitleFavorite", "()Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "Ljava/util/List;", "getFavorites", "()Ljava/util/List;", "Ljava/util/Map;", "getSections", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BrandListVI implements c {

    @NotNull
    private final List<Long> favorites;
    private final long id;
    private final BrandListDTO.NavBar navBar;
    private final Map<TitleCell, List<FavoriteCell>> sections;

    @NotNull
    private final TitleCell titleFavorite;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public BrandListVI(long j11, BrandListDTO.NavBar navBar, @NotNull TitleCell titleFavorite, @NotNull List<Long> favorites, Map<TitleCell, ? extends List<FavoriteCell>> map, t tVar) {
        Intrinsics.checkNotNullParameter(titleFavorite, "titleFavorite");
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        this.id = j11;
        this.navBar = navBar;
        this.titleFavorite = titleFavorite;
        this.favorites = favorites;
        this.sections = map;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandListVI)) {
            return false;
        }
        BrandListVI brandListVI = (BrandListVI) other;
        return this.id == brandListVI.id && Intrinsics.d(this.navBar, brandListVI.navBar) && Intrinsics.d(this.titleFavorite, brandListVI.titleFavorite) && Intrinsics.d(this.favorites, brandListVI.favorites) && Intrinsics.d(this.sections, brandListVI.sections) && Intrinsics.d(this.tokenizedEvent, brandListVI.tokenizedEvent);
    }

    @NotNull
    public final List<Long> getFavorites() {
        return this.favorites;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BrandListDTO.NavBar getNavBar() {
        return this.navBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Map<TitleCell, List<FavoriteCell>> getSections() {
        return this.sections;
    }

    @NotNull
    public final TitleCell getTitleFavorite() {
        return this.titleFavorite;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BrandListDTO.NavBar navBar = this.navBar;
        int b11 = g.b((this.titleFavorite.hashCode() + ((hashCode + (navBar == null ? 0 : navBar.hashCode())) * 31)) * 31, 31, this.favorites);
        Map<TitleCell, List<FavoriteCell>> map = this.sections;
        int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BrandListVI(id=" + this.id + ", navBar=" + this.navBar + ", titleFavorite=" + this.titleFavorite + ", favorites=" + this.favorites + ", sections=" + this.sections + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
