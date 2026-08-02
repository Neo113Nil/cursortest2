package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b!\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002@ABo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b?\u0010\u001e¨\u0006B"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "stateId", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$ImageComponent;", "imageComponent", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "stateInfo", "", "stateHeight", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileButtonModel;", "button", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "islandBackgroundColor", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$ImageComponent;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileButtonModel;LWZ/t;Lru/ozon/app/android/product/common/TileThemeConfigVO;Ljava/lang/String;)V", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getStateId", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$ImageComponent;", "getImageComponent", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$ImageComponent;", "Ljava/util/List;", "getStateInfo", "()Ljava/util/List;", "Ljava/lang/Integer;", "getStateHeight", "()Ljava/lang/Integer;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileButtonModel;", "getButton", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileButtonModel;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getIslandBackgroundColor", "SmallTileImageOptions", "ImageComponent", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SmallTileMoleculeVO implements c {
    private final AtomAction action;
    private final SmallTileButtonModel button;
    private final long id;

    @NotNull
    private final ImageComponent imageComponent;
    private final String islandBackgroundColor;
    private final Integer stateHeight;

    @NotNull
    private final String stateId;
    private final List<TileContentItem> stateInfo;

    @NotNull
    private final TileThemeConfigVO theme;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$SmallTileImageOptions;", "", "", "isCompactFavoriteIcon", "enableParanja", "Landroid/widget/ImageView$ScaleType;", "scaleType", "<init>", "(ZZLandroid/widget/ImageView$ScaleType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getEnableParanja", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmallTileImageOptions {
        private final boolean enableParanja;
        private final boolean isCompactFavoriteIcon;

        @NotNull
        private final ImageView.ScaleType scaleType;

        public SmallTileImageOptions(boolean z11, boolean z12, @NotNull ImageView.ScaleType scaleType) {
            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            this.isCompactFavoriteIcon = z11;
            this.enableParanja = z12;
            this.scaleType = scaleType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallTileImageOptions)) {
                return false;
            }
            SmallTileImageOptions smallTileImageOptions = (SmallTileImageOptions) other;
            return this.isCompactFavoriteIcon == smallTileImageOptions.isCompactFavoriteIcon && this.enableParanja == smallTileImageOptions.enableParanja && this.scaleType == smallTileImageOptions.scaleType;
        }

        public final boolean getEnableParanja() {
            return this.enableParanja;
        }

        @NotNull
        public final ImageView.ScaleType getScaleType() {
            return this.scaleType;
        }

        public int hashCode() {
            return this.scaleType.hashCode() + C3532b.a(Boolean.hashCode(this.isCompactFavoriteIcon) * 31, 31, this.enableParanja);
        }

        /* renamed from: isCompactFavoriteIcon, reason: from getter */
        public final boolean getIsCompactFavoriteIcon() {
            return this.isCompactFavoriteIcon;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isCompactFavoriteIcon;
            boolean z12 = this.enableParanja;
            ImageView.ScaleType scaleType = this.scaleType;
            StringBuilder d11 = a.d("SmallTileImageOptions(isCompactFavoriteIcon=", ", enableParanja=", ", scaleType=", z11, z12);
            d11.append(scaleType);
            d11.append(")");
            return d11.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmallTileMoleculeVO(long j11, @NotNull String stateId, AtomAction atomAction, @NotNull ImageComponent imageComponent, List<? extends TileContentItem> list, Integer num, SmallTileButtonModel smallTileButtonModel, t tVar, @NotNull TileThemeConfigVO theme, String str) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(imageComponent, "imageComponent");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.id = j11;
        this.stateId = stateId;
        this.action = atomAction;
        this.imageComponent = imageComponent;
        this.stateInfo = list;
        this.stateHeight = num;
        this.button = smallTileButtonModel;
        this.tokenizedEvent = tVar;
        this.theme = theme;
        this.islandBackgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallTileMoleculeVO)) {
            return false;
        }
        SmallTileMoleculeVO smallTileMoleculeVO = (SmallTileMoleculeVO) other;
        return this.id == smallTileMoleculeVO.id && Intrinsics.d(this.stateId, smallTileMoleculeVO.stateId) && Intrinsics.d(this.action, smallTileMoleculeVO.action) && Intrinsics.d(this.imageComponent, smallTileMoleculeVO.imageComponent) && Intrinsics.d(this.stateInfo, smallTileMoleculeVO.stateInfo) && Intrinsics.d(this.stateHeight, smallTileMoleculeVO.stateHeight) && Intrinsics.d(this.button, smallTileMoleculeVO.button) && Intrinsics.d(this.tokenizedEvent, smallTileMoleculeVO.tokenizedEvent) && Intrinsics.d(this.theme, smallTileMoleculeVO.theme) && Intrinsics.d(this.islandBackgroundColor, smallTileMoleculeVO.islandBackgroundColor);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final SmallTileButtonModel getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageComponent getImageComponent() {
        return this.imageComponent;
    }

    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getStateHeight() {
        return this.stateHeight;
    }

    @NotNull
    public final String getStateId() {
        return this.stateId;
    }

    public final List<TileContentItem> getStateInfo() {
        return this.stateInfo;
    }

    @NotNull
    public final TileThemeConfigVO getTheme() {
        return this.theme;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.stateId);
        AtomAction atomAction = this.action;
        int hashCode = (this.imageComponent.hashCode() + ((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31;
        List<TileContentItem> list = this.stateInfo;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.stateHeight;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SmallTileButtonModel smallTileButtonModel = this.button;
        int hashCode4 = (hashCode3 + (smallTileButtonModel == null ? 0 : smallTileButtonModel.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode5 = (this.theme.hashCode() + ((hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
        String str = this.islandBackgroundColor;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdult() {
        return this.imageComponent.getImageModel().getBlurMolecule() != null;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.stateId;
        AtomAction atomAction = this.action;
        ImageComponent imageComponent = this.imageComponent;
        List<TileContentItem> list = this.stateInfo;
        Integer num = this.stateHeight;
        SmallTileButtonModel smallTileButtonModel = this.button;
        t tVar = this.tokenizedEvent;
        TileThemeConfigVO tileThemeConfigVO = this.theme;
        String str2 = this.islandBackgroundColor;
        StringBuilder c11 = C2436a.c(j11, "SmallTileMoleculeVO(id=", ", stateId=", str);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", imageComponent=");
        c11.append(imageComponent);
        c11.append(", stateInfo=");
        c11.append(list);
        c11.append(", stateHeight=");
        c11.append(num);
        c11.append(", button=");
        c11.append(smallTileButtonModel);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", theme=");
        c11.append(tileThemeConfigVO);
        c11.append(", islandBackgroundColor=");
        c11.append(str2);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO$ImageComponent;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "imageModel", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProductMolecule", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "isCompactFavoriteIcon", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "getImageModel", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteProductMolecule", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageComponent {
        private final BadgeDTO badge;
        private final FavoriteProductMolecule favoriteProductMolecule;

        @NotNull
        private final SmallTileAdultImageModel imageModel;
        private final boolean isCompactFavoriteIcon;

        public ImageComponent(@NotNull SmallTileAdultImageModel imageModel, FavoriteProductMolecule favoriteProductMolecule, BadgeDTO badgeDTO, boolean z11) {
            Intrinsics.checkNotNullParameter(imageModel, "imageModel");
            this.imageModel = imageModel;
            this.favoriteProductMolecule = favoriteProductMolecule;
            this.badge = badgeDTO;
            this.isCompactFavoriteIcon = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageComponent)) {
                return false;
            }
            ImageComponent imageComponent = (ImageComponent) other;
            return Intrinsics.d(this.imageModel, imageComponent.imageModel) && Intrinsics.d(this.favoriteProductMolecule, imageComponent.favoriteProductMolecule) && Intrinsics.d(this.badge, imageComponent.badge) && this.isCompactFavoriteIcon == imageComponent.isCompactFavoriteIcon;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final FavoriteProductMolecule getFavoriteProductMolecule() {
            return this.favoriteProductMolecule;
        }

        @NotNull
        public final SmallTileAdultImageModel getImageModel() {
            return this.imageModel;
        }

        public int hashCode() {
            int hashCode = this.imageModel.hashCode() * 31;
            FavoriteProductMolecule favoriteProductMolecule = this.favoriteProductMolecule;
            int hashCode2 = (hashCode + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            return Boolean.hashCode(this.isCompactFavoriteIcon) + ((hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "ImageComponent(imageModel=" + this.imageModel + ", favoriteProductMolecule=" + this.favoriteProductMolecule + ", badge=" + this.badge + ", isCompactFavoriteIcon=" + this.isCompactFavoriteIcon + ")";
        }

        public /* synthetic */ ImageComponent(SmallTileAdultImageModel smallTileAdultImageModel, FavoriteProductMolecule favoriteProductMolecule, BadgeDTO badgeDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(smallTileAdultImageModel, favoriteProductMolecule, badgeDTO, (i11 & 8) != 0 ? false : z11);
        }
    }
}
