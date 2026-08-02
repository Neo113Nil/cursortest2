package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects;

import G.g;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "groupSwipeId", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "favMolecule", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "removeButton", "<init>", "(LWZ/t;Ljava/lang/String;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;)V", "copy", "(LWZ/t;Ljava/lang/String;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/String;", "getGroupSwipeId", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavMolecule", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "getRemoveButton", "()Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SwipeInfoVO {
    private final FavoriteProductModel favMolecule;

    @NotNull
    private final String groupSwipeId;
    private final SwipeButtonVO removeButton;
    private final t tokenizedEvent;

    public SwipeInfoVO(t tVar, @NotNull String groupSwipeId, FavoriteProductModel favoriteProductModel, SwipeButtonVO swipeButtonVO) {
        Intrinsics.checkNotNullParameter(groupSwipeId, "groupSwipeId");
        this.tokenizedEvent = tVar;
        this.groupSwipeId = groupSwipeId;
        this.favMolecule = favoriteProductModel;
        this.removeButton = swipeButtonVO;
    }

    public static /* synthetic */ SwipeInfoVO copy$default(SwipeInfoVO swipeInfoVO, t tVar, String str, FavoriteProductModel favoriteProductModel, SwipeButtonVO swipeButtonVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tVar = swipeInfoVO.tokenizedEvent;
        }
        if ((i11 & 2) != 0) {
            str = swipeInfoVO.groupSwipeId;
        }
        if ((i11 & 4) != 0) {
            favoriteProductModel = swipeInfoVO.favMolecule;
        }
        if ((i11 & 8) != 0) {
            swipeButtonVO = swipeInfoVO.removeButton;
        }
        return swipeInfoVO.copy(tVar, str, favoriteProductModel, swipeButtonVO);
    }

    @NotNull
    public final SwipeInfoVO copy(t tokenizedEvent, @NotNull String groupSwipeId, FavoriteProductModel favMolecule, SwipeButtonVO removeButton) {
        Intrinsics.checkNotNullParameter(groupSwipeId, "groupSwipeId");
        return new SwipeInfoVO(tokenizedEvent, groupSwipeId, favMolecule, removeButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeInfoVO)) {
            return false;
        }
        SwipeInfoVO swipeInfoVO = (SwipeInfoVO) other;
        return Intrinsics.d(this.tokenizedEvent, swipeInfoVO.tokenizedEvent) && Intrinsics.d(this.groupSwipeId, swipeInfoVO.groupSwipeId) && Intrinsics.d(this.favMolecule, swipeInfoVO.favMolecule) && Intrinsics.d(this.removeButton, swipeInfoVO.removeButton);
    }

    public final FavoriteProductModel getFavMolecule() {
        return this.favMolecule;
    }

    @NotNull
    public final String getGroupSwipeId() {
        return this.groupSwipeId;
    }

    public final SwipeButtonVO getRemoveButton() {
        return this.removeButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        t tVar = this.tokenizedEvent;
        int a11 = g.a((tVar == null ? 0 : tVar.hashCode()) * 31, 31, this.groupSwipeId);
        FavoriteProductModel favoriteProductModel = this.favMolecule;
        int hashCode = (a11 + (favoriteProductModel == null ? 0 : favoriteProductModel.hashCode())) * 31;
        SwipeButtonVO swipeButtonVO = this.removeButton;
        return hashCode + (swipeButtonVO != null ? swipeButtonVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SwipeInfoVO(tokenizedEvent=" + this.tokenizedEvent + ", groupSwipeId=" + this.groupSwipeId + ", favMolecule=" + this.favMolecule + ", removeButton=" + this.removeButton + ")";
    }
}
