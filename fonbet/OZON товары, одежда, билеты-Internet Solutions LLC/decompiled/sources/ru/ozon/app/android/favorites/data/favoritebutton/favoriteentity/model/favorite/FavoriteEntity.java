package ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite;

import E0.C2942q;
import J0.C3349u1;
import Kk.C3532b;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "", "type", "", "id", "", "isFavorite", "", "favoriteButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "unfavoriteButton", "<init>", "(Ljava/lang/String;JZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getType", "()Ljava/lang/String;", "getId", "()J", "()Z", "getFavoriteButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getUnfavoriteButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteEntity {

    @NotNull
    private final ButtonV3Atom.SmallIconButton favoriteButton;
    private final long id;
    private final boolean isFavorite;

    @NotNull
    private final String type;

    @NotNull
    private final ButtonV3Atom.SmallIconButton unfavoriteButton;

    public FavoriteEntity(@NotNull String type, long j11, boolean z11, @NotNull ButtonV3Atom.SmallIconButton favoriteButton, @NotNull ButtonV3Atom.SmallIconButton unfavoriteButton) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        this.type = type;
        this.id = j11;
        this.isFavorite = z11;
        this.favoriteButton = favoriteButton;
        this.unfavoriteButton = unfavoriteButton;
    }

    public static /* synthetic */ FavoriteEntity copy$default(FavoriteEntity favoriteEntity, String str, long j11, boolean z11, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favoriteEntity.type;
        }
        if ((i11 & 2) != 0) {
            j11 = favoriteEntity.id;
        }
        if ((i11 & 4) != 0) {
            z11 = favoriteEntity.isFavorite;
        }
        if ((i11 & 8) != 0) {
            smallIconButton = favoriteEntity.favoriteButton;
        }
        if ((i11 & 16) != 0) {
            smallIconButton2 = favoriteEntity.unfavoriteButton;
        }
        ButtonV3Atom.SmallIconButton smallIconButton3 = smallIconButton2;
        boolean z12 = z11;
        return favoriteEntity.copy(str, j11, z12, smallIconButton, smallIconButton3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    @NotNull
    public final FavoriteEntity copy(@NotNull String type, long id2, boolean isFavorite, @NotNull ButtonV3Atom.SmallIconButton favoriteButton, @NotNull ButtonV3Atom.SmallIconButton unfavoriteButton) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        return new FavoriteEntity(type, id2, isFavorite, favoriteButton, unfavoriteButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteEntity)) {
            return false;
        }
        FavoriteEntity favoriteEntity = (FavoriteEntity) other;
        return Intrinsics.d(this.type, favoriteEntity.type) && this.id == favoriteEntity.id && this.isFavorite == favoriteEntity.isFavorite && Intrinsics.d(this.favoriteButton, favoriteEntity.favoriteButton) && Intrinsics.d(this.unfavoriteButton, favoriteEntity.unfavoriteButton);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getFavoriteButton() {
        return this.favoriteButton;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    public int hashCode() {
        return this.unfavoriteButton.hashCode() + C3349u1.d(this.favoriteButton, C3532b.a(c.a(this.type.hashCode() * 31, 31, this.id), 31, this.isFavorite), 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        long j11 = this.id;
        boolean z11 = this.isFavorite;
        ButtonV3Atom.SmallIconButton smallIconButton = this.favoriteButton;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.unfavoriteButton;
        StringBuilder d11 = C2942q.d(j11, "FavoriteEntity(type=", str, ", id=");
        d11.append(", isFavorite=");
        d11.append(z11);
        d11.append(", favoriteButton=");
        d11.append(smallIconButton);
        d11.append(", unfavoriteButton=");
        d11.append(smallIconButton2);
        d11.append(")");
        return d11.toString();
    }
}
