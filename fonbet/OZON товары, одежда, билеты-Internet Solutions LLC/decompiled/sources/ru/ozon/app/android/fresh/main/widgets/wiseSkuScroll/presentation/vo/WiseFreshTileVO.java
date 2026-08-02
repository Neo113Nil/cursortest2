package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo;

import Ak.C2436a;
import De.C2860c;
import G.g;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J5\u0010&\u001a\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b&\u0010'Jº\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001dHÆ\u0001¢\u0006\u0004\b&\u0010(J\u0010\u0010)\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u00107R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010=R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bA\u0010@R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010GR\"\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010Q\u001a\u0004\bR\u0010*R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\b\u001e\u0010TR\u0017\u0010\u001f\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010S\u001a\u0004\bU\u0010TR\u001a\u0010V\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u00102\u001a\u0004\bW\u00104R\u001c\u0010X\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bY\u0010G¨\u0006Z"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollElement;", "", "widgetId", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "type", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "productMedia", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "actionBar", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomList", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeList", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "favoriteButton", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "actionBarV2", "", "automatizationId", "", "isCombo", "hasBanner", "<init>", "(JLru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;Ljava/lang/String;ZZ)V", "newActionBarVO", "newProductMediaVO", "newFavoriteButton", "newActionBarVOV2", "copy", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "(JLru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;Ljava/lang/String;ZZ)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "getType", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "getActionBar", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "Ljava/util/List;", "getAtomList", "()Ljava/util/List;", "getBadgeList", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "getFavoriteButton", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "getActionBarV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "Ljava/lang/String;", "getAutomatizationId", "Z", "()Z", "getHasBanner", "id", "getId", "atomAction", "getAtomAction", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseFreshTileVO implements FreshTileModel, WiseSkuScrollElement {
    private final ProductActionBarVO actionBar;
    private final ProductActionBarVOV2 actionBarV2;
    private final AtomAction atomAction;

    @NotNull
    private final List<AtomDTO> atomList;
    private final String automatizationId;

    @NotNull
    private final List<BadgeDTO> badgeList;
    private final AtomAction clickAction;
    private final FreshFavoriteMoleculeVO favoriteButton;
    private final boolean hasBanner;
    private final long id;
    private final boolean isCombo;

    @NotNull
    private final FreshTileModel.PaddingsVO paddings;

    @NotNull
    private final ProductMediaVO productMedia;
    private final t tokenizedEvent;

    @NotNull
    private final FreshTileType type;
    private final long widgetId;

    /* JADX WARN: Multi-variable type inference failed */
    public WiseFreshTileVO(long j11, @NotNull FreshTileType type, @NotNull ProductMediaVO productMedia, ProductActionBarVO productActionBarVO, @NotNull List<? extends AtomDTO> atomList, @NotNull List<BadgeDTO> badgeList, @NotNull FreshTileModel.PaddingsVO paddings, AtomAction atomAction, t tVar, FreshFavoriteMoleculeVO freshFavoriteMoleculeVO, ProductActionBarVOV2 productActionBarVOV2, String str, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(atomList, "atomList");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.widgetId = j11;
        this.type = type;
        this.productMedia = productMedia;
        this.actionBar = productActionBarVO;
        this.atomList = atomList;
        this.badgeList = badgeList;
        this.paddings = paddings;
        this.clickAction = atomAction;
        this.tokenizedEvent = tVar;
        this.favoriteButton = freshFavoriteMoleculeVO;
        this.actionBarV2 = productActionBarVOV2;
        this.automatizationId = str;
        this.isCombo = z11;
        this.hasBanner = z12;
        this.id = hashCode();
        this.atomAction = getClickAction();
    }

    public static /* synthetic */ WiseFreshTileVO copy$default(WiseFreshTileVO wiseFreshTileVO, long j11, FreshTileType freshTileType, ProductMediaVO productMediaVO, ProductActionBarVO productActionBarVO, List list, List list2, FreshTileModel.PaddingsVO paddingsVO, AtomAction atomAction, t tVar, FreshFavoriteMoleculeVO freshFavoriteMoleculeVO, ProductActionBarVOV2 productActionBarVOV2, String str, boolean z11, boolean z12, int i11, Object obj) {
        return wiseFreshTileVO.copy((i11 & 1) != 0 ? wiseFreshTileVO.widgetId : j11, (i11 & 2) != 0 ? wiseFreshTileVO.type : freshTileType, (i11 & 4) != 0 ? wiseFreshTileVO.productMedia : productMediaVO, (i11 & 8) != 0 ? wiseFreshTileVO.actionBar : productActionBarVO, (i11 & 16) != 0 ? wiseFreshTileVO.atomList : list, (i11 & 32) != 0 ? wiseFreshTileVO.badgeList : list2, (i11 & 64) != 0 ? wiseFreshTileVO.paddings : paddingsVO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? wiseFreshTileVO.clickAction : atomAction, (i11 & 256) != 0 ? wiseFreshTileVO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? wiseFreshTileVO.favoriteButton : freshFavoriteMoleculeVO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? wiseFreshTileVO.actionBarV2 : productActionBarVOV2, (i11 & 2048) != 0 ? wiseFreshTileVO.automatizationId : str, (i11 & 4096) != 0 ? wiseFreshTileVO.isCombo : z11, (i11 & 8192) != 0 ? wiseFreshTileVO.hasBanner : z12);
    }

    @NotNull
    public final WiseFreshTileVO copy(long widgetId, @NotNull FreshTileType type, @NotNull ProductMediaVO productMedia, ProductActionBarVO actionBar, @NotNull List<? extends AtomDTO> atomList, @NotNull List<BadgeDTO> badgeList, @NotNull FreshTileModel.PaddingsVO paddings, AtomAction clickAction, t tokenizedEvent, FreshFavoriteMoleculeVO favoriteButton, ProductActionBarVOV2 actionBarV2, String automatizationId, boolean isCombo, boolean hasBanner) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(atomList, "atomList");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new WiseFreshTileVO(widgetId, type, productMedia, actionBar, atomList, badgeList, paddings, clickAction, tokenizedEvent, favoriteButton, actionBarV2, automatizationId, isCombo, hasBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseFreshTileVO)) {
            return false;
        }
        WiseFreshTileVO wiseFreshTileVO = (WiseFreshTileVO) other;
        return this.widgetId == wiseFreshTileVO.widgetId && this.type == wiseFreshTileVO.type && Intrinsics.d(this.productMedia, wiseFreshTileVO.productMedia) && Intrinsics.d(this.actionBar, wiseFreshTileVO.actionBar) && Intrinsics.d(this.atomList, wiseFreshTileVO.atomList) && Intrinsics.d(this.badgeList, wiseFreshTileVO.badgeList) && Intrinsics.d(this.paddings, wiseFreshTileVO.paddings) && Intrinsics.d(this.clickAction, wiseFreshTileVO.clickAction) && Intrinsics.d(this.tokenizedEvent, wiseFreshTileVO.tokenizedEvent) && Intrinsics.d(this.favoriteButton, wiseFreshTileVO.favoriteButton) && Intrinsics.d(this.actionBarV2, wiseFreshTileVO.actionBarV2) && Intrinsics.d(this.automatizationId, wiseFreshTileVO.automatizationId) && this.isCombo == wiseFreshTileVO.isCombo && this.hasBanner == wiseFreshTileVO.hasBanner;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public ProductActionBarVO getActionBar() {
        return this.actionBar;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public ProductActionBarVOV2 getActionBarV2() {
        return this.actionBarV2;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollElement
    public AtomAction getAtomAction() {
        return this.atomAction;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    @NotNull
    public List<AtomDTO> getAtomList() {
        return this.atomList;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public String getAutomatizationId() {
        return this.automatizationId;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    @NotNull
    public List<BadgeDTO> getBadgeList() {
        return this.badgeList;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public AtomAction getClickAction() {
        return this.clickAction;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public FreshFavoriteMoleculeVO getFavoriteButton() {
        return this.favoriteButton;
    }

    public final boolean getHasBanner() {
        return this.hasBanner;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    @NotNull
    public FreshTileModel.PaddingsVO getPaddings() {
        return this.paddings;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    @NotNull
    public ProductMediaVO getProductMedia() {
        return this.productMedia;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.productMedia.hashCode() + ((this.type.hashCode() + (Long.hashCode(this.widgetId) * 31)) * 31)) * 31;
        ProductActionBarVO productActionBarVO = this.actionBar;
        int hashCode2 = (this.paddings.hashCode() + g.b(g.b((hashCode + (productActionBarVO == null ? 0 : productActionBarVO.hashCode())) * 31, 31, this.atomList), 31, this.badgeList)) * 31;
        AtomAction atomAction = this.clickAction;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        FreshFavoriteMoleculeVO freshFavoriteMoleculeVO = this.favoriteButton;
        int hashCode5 = (hashCode4 + (freshFavoriteMoleculeVO == null ? 0 : freshFavoriteMoleculeVO.hashCode())) * 31;
        ProductActionBarVOV2 productActionBarVOV2 = this.actionBarV2;
        int hashCode6 = (hashCode5 + (productActionBarVOV2 == null ? 0 : productActionBarVOV2.hashCode())) * 31;
        String str = this.automatizationId;
        return Boolean.hashCode(this.hasBanner) + C3532b.a((hashCode6 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isCombo);
    }

    /* renamed from: isCombo, reason: from getter */
    public final boolean getIsCombo() {
        return this.isCombo;
    }

    @NotNull
    public String toString() {
        long j11 = this.widgetId;
        FreshTileType freshTileType = this.type;
        ProductMediaVO productMediaVO = this.productMedia;
        ProductActionBarVO productActionBarVO = this.actionBar;
        List<AtomDTO> list = this.atomList;
        List<BadgeDTO> list2 = this.badgeList;
        FreshTileModel.PaddingsVO paddingsVO = this.paddings;
        AtomAction atomAction = this.clickAction;
        t tVar = this.tokenizedEvent;
        FreshFavoriteMoleculeVO freshFavoriteMoleculeVO = this.favoriteButton;
        ProductActionBarVOV2 productActionBarVOV2 = this.actionBarV2;
        String str = this.automatizationId;
        boolean z11 = this.isCombo;
        boolean z12 = this.hasBanner;
        StringBuilder sb2 = new StringBuilder("WiseFreshTileVO(widgetId=");
        sb2.append(j11);
        sb2.append(", type=");
        sb2.append(freshTileType);
        sb2.append(", productMedia=");
        sb2.append(productMediaVO);
        sb2.append(", actionBar=");
        sb2.append(productActionBarVO);
        C2860c.g(", atomList=", ", badgeList=", sb2, list, list2);
        sb2.append(", paddings=");
        sb2.append(paddingsVO);
        sb2.append(", clickAction=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", favoriteButton=");
        sb2.append(freshFavoriteMoleculeVO);
        sb2.append(", actionBarV2=");
        sb2.append(productActionBarVOV2);
        sb2.append(", automatizationId=");
        sb2.append(str);
        C2436a.e(", isCombo=", ", hasBanner=", sb2, z11, z12);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    @NotNull
    public FreshTileModel copy(ProductActionBarVO newActionBarVO, @NotNull ProductMediaVO newProductMediaVO, FreshFavoriteMoleculeVO newFavoriteButton, ProductActionBarVOV2 newActionBarVOV2) {
        Intrinsics.checkNotNullParameter(newProductMediaVO, "newProductMediaVO");
        return copy$default(this, 0L, null, newProductMediaVO, newActionBarVO, null, null, null, null, null, newFavoriteButton, newActionBarVOV2, null, false, false, 14835, null);
    }
}
