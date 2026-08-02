package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import A00.a;
import B0.C2454a;
import C.o0;
import E0.C2942q;
import G.g;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B\u0093\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J5\u0010'\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b'\u0010(J´\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\b'\u0010)J\u0010\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u00108R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bE\u0010DR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u001a\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\bO\u00105R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010V\u001a\u0004\bW\u0010+¨\u0006X"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "type", "", "scrollWidgetKey", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "productMedia", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "actionBar", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atomList", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeList", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "tokenizedEvent", "widgetId", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "favoriteButton", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "actionBarV2", "", "automatizationId", "<init>", "(JLru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;ILru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;JLru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;Ljava/lang/String;)V", "newActionBarVO", "newProductMediaVO", "newFavoriteButton", "newActionBarVOV2", "copy", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "(JLru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;ILru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;JLru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;Ljava/lang/String;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "getType", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "getActionBar", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "Ljava/util/List;", "getAtomList", "()Ljava/util/List;", "getBadgeList", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getWidgetId", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "getFavoriteButton", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "getActionBarV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "Ljava/lang/String;", "getAutomatizationId", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FreshTileVO implements c, FreshTileModel, a.J.InterfaceC0007a {
    private final ProductActionBarVO actionBar;
    private final ProductActionBarVOV2 actionBarV2;

    @NotNull
    private final List<AtomDTO> atomList;
    private final String automatizationId;

    @NotNull
    private final List<BadgeDTO> badgeList;
    private final AtomAction clickAction;
    private final FreshFavoriteMoleculeVO favoriteButton;
    private final long id;

    @NotNull
    private final FreshTileModel.PaddingsVO paddings;

    @NotNull
    private final ProductMediaVO productMedia;
    private final int scrollWidgetKey;
    private final t tokenizedEvent;

    @NotNull
    private final FreshTileType type;
    private final long widgetId;

    /* JADX WARN: Multi-variable type inference failed */
    public FreshTileVO(long j11, @NotNull FreshTileType type, int i11, @NotNull ProductMediaVO productMedia, ProductActionBarVO productActionBarVO, @NotNull List<? extends AtomDTO> atomList, @NotNull List<BadgeDTO> badgeList, @NotNull FreshTileModel.PaddingsVO paddings, AtomAction atomAction, t tVar, long j12, FreshFavoriteMoleculeVO freshFavoriteMoleculeVO, ProductActionBarVOV2 productActionBarVOV2, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(atomList, "atomList");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.type = type;
        this.scrollWidgetKey = i11;
        this.productMedia = productMedia;
        this.actionBar = productActionBarVO;
        this.atomList = atomList;
        this.badgeList = badgeList;
        this.paddings = paddings;
        this.clickAction = atomAction;
        this.tokenizedEvent = tVar;
        this.widgetId = j12;
        this.favoriteButton = freshFavoriteMoleculeVO;
        this.actionBarV2 = productActionBarVOV2;
        this.automatizationId = str;
    }

    public static /* synthetic */ FreshTileVO copy$default(FreshTileVO freshTileVO, long j11, FreshTileType freshTileType, int i11, ProductMediaVO productMediaVO, ProductActionBarVO productActionBarVO, List list, List list2, FreshTileModel.PaddingsVO paddingsVO, AtomAction atomAction, t tVar, long j12, FreshFavoriteMoleculeVO freshFavoriteMoleculeVO, ProductActionBarVOV2 productActionBarVOV2, String str, int i12, Object obj) {
        return freshTileVO.copy((i12 & 1) != 0 ? freshTileVO.id : j11, (i12 & 2) != 0 ? freshTileVO.type : freshTileType, (i12 & 4) != 0 ? freshTileVO.scrollWidgetKey : i11, (i12 & 8) != 0 ? freshTileVO.productMedia : productMediaVO, (i12 & 16) != 0 ? freshTileVO.actionBar : productActionBarVO, (i12 & 32) != 0 ? freshTileVO.atomList : list, (i12 & 64) != 0 ? freshTileVO.badgeList : list2, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? freshTileVO.paddings : paddingsVO, (i12 & 256) != 0 ? freshTileVO.clickAction : atomAction, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? freshTileVO.tokenizedEvent : tVar, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? freshTileVO.widgetId : j12, (i12 & 2048) != 0 ? freshTileVO.favoriteButton : freshFavoriteMoleculeVO, (i12 & 4096) != 0 ? freshTileVO.actionBarV2 : productActionBarVOV2, (i12 & 8192) != 0 ? freshTileVO.automatizationId : str);
    }

    @NotNull
    public final FreshTileVO copy(long id2, @NotNull FreshTileType type, int scrollWidgetKey, @NotNull ProductMediaVO productMedia, ProductActionBarVO actionBar, @NotNull List<? extends AtomDTO> atomList, @NotNull List<BadgeDTO> badgeList, @NotNull FreshTileModel.PaddingsVO paddings, AtomAction clickAction, t tokenizedEvent, long widgetId, FreshFavoriteMoleculeVO favoriteButton, ProductActionBarVOV2 actionBarV2, String automatizationId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(atomList, "atomList");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new FreshTileVO(id2, type, scrollWidgetKey, productMedia, actionBar, atomList, badgeList, paddings, clickAction, tokenizedEvent, widgetId, favoriteButton, actionBarV2, automatizationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshTileVO)) {
            return false;
        }
        FreshTileVO freshTileVO = (FreshTileVO) other;
        return this.id == freshTileVO.id && this.type == freshTileVO.type && this.scrollWidgetKey == freshTileVO.scrollWidgetKey && Intrinsics.d(this.productMedia, freshTileVO.productMedia) && Intrinsics.d(this.actionBar, freshTileVO.actionBar) && Intrinsics.d(this.atomList, freshTileVO.atomList) && Intrinsics.d(this.badgeList, freshTileVO.badgeList) && Intrinsics.d(this.paddings, freshTileVO.paddings) && Intrinsics.d(this.clickAction, freshTileVO.clickAction) && Intrinsics.d(this.tokenizedEvent, freshTileVO.tokenizedEvent) && this.widgetId == freshTileVO.widgetId && Intrinsics.d(this.favoriteButton, freshTileVO.favoriteButton) && Intrinsics.d(this.actionBarV2, freshTileVO.actionBarV2) && Intrinsics.d(this.automatizationId, freshTileVO.automatizationId);
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public ProductActionBarVO getActionBar() {
        return this.actionBar;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public ProductActionBarVOV2 getActionBarV2() {
        return this.actionBarV2;
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

    @Override // l20.c
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

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public FreshTileType getType() {
        return this.type;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    public long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = (this.productMedia.hashCode() + C2454a.a(this.scrollWidgetKey, (this.type.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31)) * 31;
        ProductActionBarVO productActionBarVO = this.actionBar;
        int hashCode2 = (this.paddings.hashCode() + g.b(g.b((hashCode + (productActionBarVO == null ? 0 : productActionBarVO.hashCode())) * 31, 31, this.atomList), 31, this.badgeList)) * 31;
        AtomAction atomAction = this.clickAction;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int a11 = Pk0.c.a((hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.widgetId);
        FreshFavoriteMoleculeVO freshFavoriteMoleculeVO = this.favoriteButton;
        int hashCode4 = (a11 + (freshFavoriteMoleculeVO == null ? 0 : freshFavoriteMoleculeVO.hashCode())) * 31;
        ProductActionBarVOV2 productActionBarVOV2 = this.actionBarV2;
        int hashCode5 = (hashCode4 + (productActionBarVOV2 == null ? 0 : productActionBarVOV2.hashCode())) * 31;
        String str = this.automatizationId;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FreshTileType freshTileType = this.type;
        int i11 = this.scrollWidgetKey;
        ProductMediaVO productMediaVO = this.productMedia;
        ProductActionBarVO productActionBarVO = this.actionBar;
        List<AtomDTO> list = this.atomList;
        List<BadgeDTO> list2 = this.badgeList;
        FreshTileModel.PaddingsVO paddingsVO = this.paddings;
        AtomAction atomAction = this.clickAction;
        t tVar = this.tokenizedEvent;
        long j12 = this.widgetId;
        FreshFavoriteMoleculeVO freshFavoriteMoleculeVO = this.favoriteButton;
        ProductActionBarVOV2 productActionBarVOV2 = this.actionBarV2;
        String str = this.automatizationId;
        StringBuilder sb2 = new StringBuilder("FreshTileVO(id=");
        sb2.append(j11);
        sb2.append(", type=");
        sb2.append(freshTileType);
        sb2.append(", scrollWidgetKey=");
        sb2.append(i11);
        sb2.append(", productMedia=");
        sb2.append(productMediaVO);
        sb2.append(", actionBar=");
        sb2.append(productActionBarVO);
        sb2.append(", atomList=");
        sb2.append(list);
        sb2.append(", badgeList=");
        sb2.append(list2);
        sb2.append(", paddings=");
        sb2.append(paddingsVO);
        Fj.c.e(tVar, ", clickAction=", ", tokenizedEvent=", sb2, atomAction);
        C2942q.f(sb2, ", widgetId=", j12, ", favoriteButton=");
        sb2.append(freshFavoriteMoleculeVO);
        sb2.append(", actionBarV2=");
        sb2.append(productActionBarVOV2);
        sb2.append(", automatizationId=");
        return o0.c(sb2, str, ")");
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel
    @NotNull
    public FreshTileModel copy(ProductActionBarVO newActionBarVO, @NotNull ProductMediaVO newProductMediaVO, FreshFavoriteMoleculeVO newFavoriteButton, ProductActionBarVOV2 newActionBarVOV2) {
        Intrinsics.checkNotNullParameter(newProductMediaVO, "newProductMediaVO");
        return copy$default(this, 0L, null, 0, newProductMediaVO, newActionBarVO, null, null, null, null, null, 0L, newFavoriteButton, newActionBarVOV2, null, 10215, null);
    }

    public /* synthetic */ FreshTileVO(long j11, FreshTileType freshTileType, int i11, ProductMediaVO productMediaVO, ProductActionBarVO productActionBarVO, List list, List list2, FreshTileModel.PaddingsVO paddingsVO, AtomAction atomAction, t tVar, long j12, FreshFavoriteMoleculeVO freshFavoriteMoleculeVO, ProductActionBarVOV2 productActionBarVOV2, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, freshTileType, i11, productMediaVO, productActionBarVO, list, list2, paddingsVO, atomAction, tVar, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? j11 : j12, freshFavoriteMoleculeVO, (i12 & 4096) != 0 ? null : productActionBarVOV2, str);
    }
}
