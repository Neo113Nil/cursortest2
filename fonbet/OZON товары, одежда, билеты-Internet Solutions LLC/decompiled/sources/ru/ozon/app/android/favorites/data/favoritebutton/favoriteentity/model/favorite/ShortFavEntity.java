package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite;

import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/ShortFavEntity;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "keyModel", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "isFavorite", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;Lru/ozon/uni/atoms/data/AtomActionDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "getKeyModel", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Z", "()Z", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShortFavEntity {
    private final AtomActionDTO action;
    private final boolean isFavorite;

    @NotNull
    private final KeyFavoriteEntityModel keyModel;

    public ShortFavEntity(@NotNull KeyFavoriteEntityModel keyModel, AtomActionDTO atomActionDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(keyModel, "keyModel");
        this.keyModel = keyModel;
        this.action = atomActionDTO;
        this.isFavorite = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortFavEntity)) {
            return false;
        }
        ShortFavEntity shortFavEntity = (ShortFavEntity) other;
        return Intrinsics.d(this.keyModel, shortFavEntity.keyModel) && Intrinsics.d(this.action, shortFavEntity.action) && this.isFavorite == shortFavEntity.isFavorite;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final KeyFavoriteEntityModel getKeyModel() {
        return this.keyModel;
    }

    public int hashCode() {
        int hashCode = this.keyModel.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        return Boolean.hashCode(this.isFavorite) + ((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31);
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        KeyFavoriteEntityModel keyFavoriteEntityModel = this.keyModel;
        AtomActionDTO atomActionDTO = this.action;
        boolean z11 = this.isFavorite;
        StringBuilder sb2 = new StringBuilder("ShortFavEntity(keyModel=");
        sb2.append(keyFavoriteEntityModel);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", isFavorite=");
        return a.a(")", sb2, z11);
    }
}
