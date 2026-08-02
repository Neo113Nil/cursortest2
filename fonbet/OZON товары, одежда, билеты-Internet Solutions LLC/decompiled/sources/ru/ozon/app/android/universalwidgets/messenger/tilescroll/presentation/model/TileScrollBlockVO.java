package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model;

import Ak.C2436a;
import B0.C2454a;
import C.o0;
import Cm.e;
import Kk.C3532b;
import Pk0.f;
import Xc.a;
import Xc.b;
import android.os.Parcelable;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderVO;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.j;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.data.TileScrollBlockDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001;Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b/\u0010\u0018R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO;", "Lru/ozon/android/messenger/framework/presentation/models/g;", "Lru/ozon/android/messenger/framework/presentation/models/j;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "blockId", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "items", "", "backgroundColor", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "visibleCellsCount", "contentDescription", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Landroid/os/Parcelable;", "layoutManagerState", "sendTime", "<init>", "(Lru/ozon/android/messenger/framework/presentation/models/c;Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;Ljava/lang/String;Ljava/util/Map;Landroid/os/Parcelable;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/framework/presentation/models/c;", "getBlockId", "()Lru/ozon/android/messenger/framework/presentation/models/c;", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "getHeader", "()Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "getVisibleCellsCount", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "getContentDescription", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "getSendTime", "setSendTime", "(Ljava/lang/String;)V", "TileVO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TileScrollBlockVO implements g, j {
    private final String backgroundColor;

    @NotNull
    private final c blockId;

    @NotNull
    private final String contentDescription;
    private final HeaderVO header;

    @NotNull
    private final List<TileVO> items;
    private Parcelable layoutManagerState;
    private String sendTime;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001:\u0001LB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\b\u0017\u0010CR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\b\u0018\u0010!R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010!R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "", "Lru/ozon/android/messenger/framework/presentation/models/c;", "blockId", "", "id", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent;", "imageComponent", "", "mainState", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "stateInfo", "", "stateHeight", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "addToCartButton", "", "isTextTagSupported", "isCompactFavoriteIcon", "enableParanja", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "imageRatio", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "<init>", "(Lru/ozon/android/messenger/framework/presentation/models/c;JLru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Ljava/lang/Boolean;ZZLru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;Lru/ozon/app/android/product/common/TileThemeConfigVO;)V", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/framework/presentation/models/c;", "getBlockId", "()Lru/ozon/android/messenger/framework/presentation/models/c;", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent;", "getImageComponent", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent;", "Ljava/util/List;", "getMainState", "()Ljava/util/List;", "getStateInfo", "Ljava/lang/Integer;", "getStateHeight", "()Ljava/lang/Integer;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "getAddToCartButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Z", "getEnableParanja", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "getImageRatio", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "ImageComponent", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileVO {
        private final AtomAction action;
        private final AddToCartButtonDTO addToCartButton;

        @NotNull
        private final c blockId;
        private final boolean enableParanja;
        private final long id;

        @NotNull
        private final ImageComponent imageComponent;

        @NotNull
        private final TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio;
        private final boolean isCompactFavoriteIcon;
        private final Boolean isTextTagSupported;
        private final List<Object> mainState;
        private final Integer stateHeight;
        private final List<TileContentItem> stateInfo;

        @NotNull
        private final TileThemeConfigVO theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent;", "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;", "imageModel", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProductMolecule", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "isCompactFavoriteIcon", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;", "getImageModel", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteProductMolecule", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "SmallTileAdultImageModel", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageComponent {
            private final BadgeDTO badge;
            private final FavoriteProductMolecule favoriteProductMolecule;

            @NotNull
            private final SmallTileAdultImageModel imageModel;
            private final boolean isCompactFavoriteIcon;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel;", "", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage;", "image", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "blurMolecule", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage;", "getImage", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "getBlurMolecule", "()Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "SmallTileModelImage", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SmallTileAdultImageModel {
                private final BlurMoleculeVO blurMolecule;

                @NotNull
                private final SmallTileModelImage image;

                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage;", "", "", ImagesContract.URL, "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;", "ratio", "", "widthImage", "heightImage", "", "enableParanja", "isCompactFavoriteIcon", "Landroid/widget/ImageView$ScaleType;", "scaleType", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;IIZZLandroid/widget/ImageView$ScaleType;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;", "getRatio", "()Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;", "I", "getWidthImage", "getHeightImage", "Z", "getEnableParanja", "()Z", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "Ratio", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class SmallTileModelImage {
                    private final boolean enableParanja;
                    private final int heightImage;
                    private final boolean isCompactFavoriteIcon;

                    @NotNull
                    private final Ratio ratio;

                    @NotNull
                    private final ImageView.ScaleType scaleType;

                    @NotNull
                    private final String url;
                    private final int widthImage;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO$ImageComponent$SmallTileAdultImageModel$SmallTileModelImage$Ratio;", "", "ratio", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;F)V", "getRatio", "()Ljava/lang/String;", "getValue", "()F", "RATIO_1_1", "RATIO_3_4", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final class Ratio {
                        private static final /* synthetic */ a $ENTRIES;
                        private static final /* synthetic */ Ratio[] $VALUES;
                        public static final Ratio RATIO_1_1 = new Ratio("RATIO_1_1", 0, "1:1", 1.0f);
                        public static final Ratio RATIO_3_4 = new Ratio("RATIO_3_4", 1, "3:4", 1.3333334f);

                        @NotNull
                        private final String ratio;
                        private final float value;

                        private static final /* synthetic */ Ratio[] $values() {
                            return new Ratio[]{RATIO_1_1, RATIO_3_4};
                        }

                        static {
                            Ratio[] $values = $values();
                            $VALUES = $values;
                            $ENTRIES = b.a($values);
                        }

                        private Ratio(String str, int i11, String str2, float f7) {
                            this.ratio = str2;
                            this.value = f7;
                        }

                        public static Ratio valueOf(String str) {
                            return (Ratio) Enum.valueOf(Ratio.class, str);
                        }

                        public static Ratio[] values() {
                            return (Ratio[]) $VALUES.clone();
                        }

                        @NotNull
                        public final String getRatio() {
                            return this.ratio;
                        }

                        public final float getValue() {
                            return this.value;
                        }
                    }

                    public SmallTileModelImage(@NotNull String url, @NotNull Ratio ratio, int i11, int i12, boolean z11, boolean z12, @NotNull ImageView.ScaleType scaleType) {
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(ratio, "ratio");
                        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
                        this.url = url;
                        this.ratio = ratio;
                        this.widthImage = i11;
                        this.heightImage = i12;
                        this.enableParanja = z11;
                        this.isCompactFavoriteIcon = z12;
                        this.scaleType = scaleType;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof SmallTileModelImage)) {
                            return false;
                        }
                        SmallTileModelImage smallTileModelImage = (SmallTileModelImage) other;
                        return Intrinsics.d(this.url, smallTileModelImage.url) && this.ratio == smallTileModelImage.ratio && this.widthImage == smallTileModelImage.widthImage && this.heightImage == smallTileModelImage.heightImage && this.enableParanja == smallTileModelImage.enableParanja && this.isCompactFavoriteIcon == smallTileModelImage.isCompactFavoriteIcon && this.scaleType == smallTileModelImage.scaleType;
                    }

                    public final boolean getEnableParanja() {
                        return this.enableParanja;
                    }

                    public final int getHeightImage() {
                        return this.heightImage;
                    }

                    @NotNull
                    public final Ratio getRatio() {
                        return this.ratio;
                    }

                    @NotNull
                    public final ImageView.ScaleType getScaleType() {
                        return this.scaleType;
                    }

                    @NotNull
                    public final String getUrl() {
                        return this.url;
                    }

                    public final int getWidthImage() {
                        return this.widthImage;
                    }

                    public int hashCode() {
                        return this.scaleType.hashCode() + C3532b.a(C3532b.a(C2454a.a(this.heightImage, C2454a.a(this.widthImage, (this.ratio.hashCode() + (this.url.hashCode() * 31)) * 31, 31), 31), 31, this.enableParanja), 31, this.isCompactFavoriteIcon);
                    }

                    /* renamed from: isCompactFavoriteIcon, reason: from getter */
                    public final boolean getIsCompactFavoriteIcon() {
                        return this.isCompactFavoriteIcon;
                    }

                    @NotNull
                    public String toString() {
                        String str = this.url;
                        Ratio ratio = this.ratio;
                        int i11 = this.widthImage;
                        int i12 = this.heightImage;
                        boolean z11 = this.enableParanja;
                        boolean z12 = this.isCompactFavoriteIcon;
                        ImageView.ScaleType scaleType = this.scaleType;
                        StringBuilder sb2 = new StringBuilder("SmallTileModelImage(url=");
                        sb2.append(str);
                        sb2.append(", ratio=");
                        sb2.append(ratio);
                        sb2.append(", widthImage=");
                        Ek.a.f(i11, i12, ", heightImage=", ", enableParanja=", sb2);
                        f.c(", isCompactFavoriteIcon=", ", scaleType=", sb2, z11, z12);
                        sb2.append(scaleType);
                        sb2.append(")");
                        return sb2.toString();
                    }
                }

                public SmallTileAdultImageModel(@NotNull SmallTileModelImage image, BlurMoleculeVO blurMoleculeVO) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.image = image;
                    this.blurMolecule = blurMoleculeVO;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SmallTileAdultImageModel)) {
                        return false;
                    }
                    SmallTileAdultImageModel smallTileAdultImageModel = (SmallTileAdultImageModel) other;
                    return Intrinsics.d(this.image, smallTileAdultImageModel.image) && Intrinsics.d(this.blurMolecule, smallTileAdultImageModel.blurMolecule);
                }

                public final BlurMoleculeVO getBlurMolecule() {
                    return this.blurMolecule;
                }

                @NotNull
                public final SmallTileModelImage getImage() {
                    return this.image;
                }

                public int hashCode() {
                    int hashCode = this.image.hashCode() * 31;
                    BlurMoleculeVO blurMoleculeVO = this.blurMolecule;
                    return hashCode + (blurMoleculeVO == null ? 0 : blurMoleculeVO.hashCode());
                }

                @NotNull
                public String toString() {
                    return "SmallTileAdultImageModel(image=" + this.image + ", blurMolecule=" + this.blurMolecule + ")";
                }
            }

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
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TileVO(@NotNull c blockId, long j11, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, @NotNull ImageComponent imageComponent, List<? extends Object> list, List<? extends TileContentItem> list2, Integer num, AddToCartButtonDTO addToCartButtonDTO, Boolean bool, boolean z11, boolean z12, @NotNull TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio, @NotNull TileThemeConfigVO theme) {
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            Intrinsics.checkNotNullParameter(imageComponent, "imageComponent");
            Intrinsics.checkNotNullParameter(imageRatio, "imageRatio");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.blockId = blockId;
            this.id = j11;
            this.action = atomAction;
            this.trackingInfo = map;
            this.imageComponent = imageComponent;
            this.mainState = list;
            this.stateInfo = list2;
            this.stateHeight = num;
            this.addToCartButton = addToCartButtonDTO;
            this.isTextTagSupported = bool;
            this.isCompactFavoriteIcon = z11;
            this.enableParanja = z12;
            this.imageRatio = imageRatio;
            this.theme = theme;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileVO)) {
                return false;
            }
            TileVO tileVO = (TileVO) other;
            return Intrinsics.d(this.blockId, tileVO.blockId) && this.id == tileVO.id && Intrinsics.d(this.action, tileVO.action) && Intrinsics.d(this.trackingInfo, tileVO.trackingInfo) && Intrinsics.d(this.imageComponent, tileVO.imageComponent) && Intrinsics.d(this.mainState, tileVO.mainState) && Intrinsics.d(this.stateInfo, tileVO.stateInfo) && Intrinsics.d(this.stateHeight, tileVO.stateHeight) && Intrinsics.d(this.addToCartButton, tileVO.addToCartButton) && Intrinsics.d(this.isTextTagSupported, tileVO.isTextTagSupported) && this.isCompactFavoriteIcon == tileVO.isCompactFavoriteIcon && this.enableParanja == tileVO.enableParanja && this.imageRatio == tileVO.imageRatio && Intrinsics.d(this.theme, tileVO.theme);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final AddToCartButtonDTO getAddToCartButton() {
            return this.addToCartButton;
        }

        @NotNull
        public final c getBlockId() {
            return this.blockId;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final ImageComponent getImageComponent() {
            return this.imageComponent;
        }

        public final Integer getStateHeight() {
            return this.stateHeight;
        }

        public final List<TileContentItem> getStateInfo() {
            return this.stateInfo;
        }

        @NotNull
        public final TileThemeConfigVO getTheme() {
            return this.theme;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = Pk0.c.a(this.blockId.hashCode() * 31, 31, this.id);
            AtomAction atomAction = this.action;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (this.imageComponent.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
            List<Object> list = this.mainState;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<TileContentItem> list2 = this.stateInfo;
            int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.stateHeight;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            AddToCartButtonDTO addToCartButtonDTO = this.addToCartButton;
            int hashCode6 = (hashCode5 + (addToCartButtonDTO == null ? 0 : addToCartButtonDTO.hashCode())) * 31;
            Boolean bool = this.isTextTagSupported;
            return this.theme.hashCode() + ((this.imageRatio.hashCode() + C3532b.a(C3532b.a((hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.isCompactFavoriteIcon), 31, this.enableParanja)) * 31);
        }

        public final boolean isAdult() {
            return this.imageComponent.getImageModel().getBlurMolecule() != null;
        }

        @NotNull
        public String toString() {
            c cVar = this.blockId;
            long j11 = this.id;
            AtomAction atomAction = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            ImageComponent imageComponent = this.imageComponent;
            List<Object> list = this.mainState;
            List<TileContentItem> list2 = this.stateInfo;
            Integer num = this.stateHeight;
            AddToCartButtonDTO addToCartButtonDTO = this.addToCartButton;
            Boolean bool = this.isTextTagSupported;
            boolean z11 = this.isCompactFavoriteIcon;
            boolean z12 = this.enableParanja;
            TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio = this.imageRatio;
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            StringBuilder sb2 = new StringBuilder("TileVO(blockId=");
            sb2.append(cVar);
            sb2.append(", id=");
            sb2.append(j11);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", imageComponent=");
            sb2.append(imageComponent);
            sb2.append(", mainState=");
            sb2.append(list);
            sb2.append(", stateInfo=");
            sb2.append(list2);
            sb2.append(", stateHeight=");
            sb2.append(num);
            sb2.append(", addToCartButton=");
            sb2.append(addToCartButtonDTO);
            sb2.append(", isTextTagSupported=");
            sb2.append(bool);
            C2436a.e(", isCompactFavoriteIcon=", ", enableParanja=", sb2, z11, z12);
            sb2.append(", imageRatio=");
            sb2.append(imageRatio);
            sb2.append(", theme=");
            sb2.append(tileThemeConfigVO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public TileScrollBlockVO(@NotNull c blockId, HeaderVO headerVO, @NotNull List<TileVO> items, String str, @NotNull TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount, @NotNull String contentDescription, Map<String, TokenizedTrackingInfo> map, Parcelable parcelable, String str2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(visibleCellsCount, "visibleCellsCount");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.blockId = blockId;
        this.header = headerVO;
        this.items = items;
        this.backgroundColor = str;
        this.visibleCellsCount = visibleCellsCount;
        this.contentDescription = contentDescription;
        this.trackingInfo = map;
        this.layoutManagerState = parcelable;
        this.sendTime = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileScrollBlockVO)) {
            return false;
        }
        TileScrollBlockVO tileScrollBlockVO = (TileScrollBlockVO) other;
        return Intrinsics.d(this.blockId, tileScrollBlockVO.blockId) && Intrinsics.d(this.header, tileScrollBlockVO.header) && Intrinsics.d(this.items, tileScrollBlockVO.items) && Intrinsics.d(this.backgroundColor, tileScrollBlockVO.backgroundColor) && this.visibleCellsCount == tileScrollBlockVO.visibleCellsCount && Intrinsics.d(this.contentDescription, tileScrollBlockVO.contentDescription) && Intrinsics.d(this.trackingInfo, tileScrollBlockVO.trackingInfo) && Intrinsics.d(this.layoutManagerState, tileScrollBlockVO.layoutManagerState) && Intrinsics.d(this.sendTime, tileScrollBlockVO.sendTime);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public c getBlockId() {
        return this.blockId;
    }

    public final HeaderVO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<TileVO> getItems() {
        return this.items;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public String getSendTime() {
        return this.sendTime;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.blockId.hashCode() * 31;
        HeaderVO headerVO = this.header;
        int b11 = G.g.b((hashCode + (headerVO == null ? 0 : headerVO.hashCode())) * 31, 31, this.items);
        String str = this.backgroundColor;
        int a11 = G.g.a((this.visibleCellsCount.hashCode() + ((b11 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.contentDescription);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Parcelable parcelable = this.layoutManagerState;
        int hashCode3 = (hashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        String str2 = this.sendTime;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.j
    public void setSendTime(String str) {
        this.sendTime = str;
    }

    @NotNull
    public String toString() {
        c cVar = this.blockId;
        HeaderVO headerVO = this.header;
        List<TileVO> list = this.items;
        String str = this.backgroundColor;
        TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount = this.visibleCellsCount;
        String str2 = this.contentDescription;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Parcelable parcelable = this.layoutManagerState;
        String str3 = this.sendTime;
        StringBuilder sb2 = new StringBuilder("TileScrollBlockVO(blockId=");
        sb2.append(cVar);
        sb2.append(", header=");
        sb2.append(headerVO);
        sb2.append(", items=");
        e.i(", backgroundColor=", str, ", visibleCellsCount=", sb2, list);
        sb2.append(visibleCellsCount);
        sb2.append(", contentDescription=");
        sb2.append(str2);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", layoutManagerState=");
        sb2.append(parcelable);
        sb2.append(", sendTime=");
        return o0.c(sb2, str3, ")");
    }

    public /* synthetic */ TileScrollBlockVO(c cVar, HeaderVO headerVO, List list, String str, TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount, String str2, Map map, Parcelable parcelable, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, headerVO, list, str, visibleCellsCount, str2, map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : parcelable, (i11 & 256) != 0 ? null : str3);
    }
}
