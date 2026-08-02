package ru.ozon.app.android.search.catalog.components.meta;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import android.text.Spanned;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012Jf\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b\r\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "Landroid/text/Spanned;", "description", "Lru/ozon/app/android/search/catalog/components/meta/DesignType;", "designType", "", "isClickEnabled", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "favoriteEntityButton", "shareText", "<init>", "(JLjava/lang/String;Ljava/lang/String;Landroid/text/Spanned;Lru/ozon/app/android/search/catalog/components/meta/DesignType;ZLru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Landroid/text/Spanned;Lru/ozon/app/android/search/catalog/components/meta/DesignType;ZLru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Ljava/lang/String;)Lru/ozon/app/android/search/catalog/components/meta/MetaVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getImage", "Landroid/text/Spanned;", "getDescription", "()Landroid/text/Spanned;", "Lru/ozon/app/android/search/catalog/components/meta/DesignType;", "getDesignType", "()Lru/ozon/app/android/search/catalog/components/meta/DesignType;", "Z", "()Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getFavoriteEntityButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getShareText", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MetaVO implements c {
    private final Spanned description;

    @NotNull
    private final DesignType designType;
    private final FavoriteEntity favoriteEntityButton;
    private final long id;
    private final String image;
    private final boolean isClickEnabled;

    @NotNull
    private final String shareText;

    @NotNull
    private final String title;

    public MetaVO(long j11, @NotNull String title, String str, Spanned spanned, @NotNull DesignType designType, boolean z11, FavoriteEntity favoriteEntity, @NotNull String shareText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        this.id = j11;
        this.title = title;
        this.image = str;
        this.description = spanned;
        this.designType = designType;
        this.isClickEnabled = z11;
        this.favoriteEntityButton = favoriteEntity;
        this.shareText = shareText;
    }

    public static /* synthetic */ MetaVO copy$default(MetaVO metaVO, long j11, String str, String str2, Spanned spanned, DesignType designType, boolean z11, FavoriteEntity favoriteEntity, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = metaVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = metaVO.title;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = metaVO.image;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            spanned = metaVO.description;
        }
        return metaVO.copy(j12, str4, str5, spanned, (i11 & 16) != 0 ? metaVO.designType : designType, (i11 & 32) != 0 ? metaVO.isClickEnabled : z11, (i11 & 64) != 0 ? metaVO.favoriteEntityButton : favoriteEntity, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? metaVO.shareText : str3);
    }

    @NotNull
    public final MetaVO copy(long id2, @NotNull String title, String image, Spanned description, @NotNull DesignType designType, boolean isClickEnabled, FavoriteEntity favoriteEntityButton, @NotNull String shareText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        return new MetaVO(id2, title, image, description, designType, isClickEnabled, favoriteEntityButton, shareText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaVO)) {
            return false;
        }
        MetaVO metaVO = (MetaVO) other;
        return this.id == metaVO.id && Intrinsics.d(this.title, metaVO.title) && Intrinsics.d(this.image, metaVO.image) && Intrinsics.d(this.description, metaVO.description) && this.designType == metaVO.designType && this.isClickEnabled == metaVO.isClickEnabled && Intrinsics.d(this.favoriteEntityButton, metaVO.favoriteEntityButton) && Intrinsics.d(this.shareText, metaVO.shareText);
    }

    public final Spanned getDescription() {
        return this.description;
    }

    @NotNull
    public final DesignType getDesignType() {
        return this.designType;
    }

    public final FavoriteEntity getFavoriteEntityButton() {
        return this.favoriteEntityButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getShareText() {
        return this.shareText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.image;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Spanned spanned = this.description;
        int a12 = C3532b.a((this.designType.hashCode() + ((hashCode + (spanned == null ? 0 : spanned.hashCode())) * 31)) * 31, 31, this.isClickEnabled);
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        return this.shareText.hashCode() + ((a12 + (favoriteEntity != null ? favoriteEntity.hashCode() : 0)) * 31);
    }

    /* renamed from: isClickEnabled, reason: from getter */
    public final boolean getIsClickEnabled() {
        return this.isClickEnabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.image;
        Spanned spanned = this.description;
        DesignType designType = this.designType;
        boolean z11 = this.isClickEnabled;
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        String str3 = this.shareText;
        StringBuilder c11 = C2436a.c(j11, "MetaVO(id=", ", title=", str);
        c11.append(", image=");
        c11.append(str2);
        c11.append(", description=");
        c11.append((Object) spanned);
        c11.append(", designType=");
        c11.append(designType);
        c11.append(", isClickEnabled=");
        c11.append(z11);
        c11.append(", favoriteEntityButton=");
        c11.append(favoriteEntity);
        c11.append(", shareText=");
        c11.append(str3);
        c11.append(")");
        return c11.toString();
    }
}
