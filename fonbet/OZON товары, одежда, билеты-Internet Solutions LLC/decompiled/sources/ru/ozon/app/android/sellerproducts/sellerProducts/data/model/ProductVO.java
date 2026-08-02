package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import B0.C2454a;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import Pk0.f;
import Tl.b;
import WZ.t;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.common.product.ImageBadge;
import ru.ozon.app.android.product.common.product.OverlayTitleModel;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.videocover.VideoTileItem;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\bG\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u007f\u0080\u0001B\u009d\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020)\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u001a¢\u0006\u0004\b2\u00103JÔ\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020)HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bD\u0010@R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010JR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u000f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\b\u000f\u0010MR$\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010P\u001a\u0004\b\u0010\u0010Q\"\u0004\bR\u0010SR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u0010VR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bW\u0010JR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u0010ZR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\b^\u0010ZR%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bf\u0010gR\"\u0010!\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010K\u001a\u0004\b!\u0010M\"\u0004\bh\u0010OR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010i\u001a\u0004\bj\u0010kR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010l\u001a\u0004\bm\u0010nR\u0019\u0010&\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b&\u0010o\u001a\u0004\bp\u00107R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010q\u001a\u0004\br\u0010sR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010t\u001a\u0004\bu\u00109R\u0017\u0010+\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b+\u0010t\u001a\u0004\bv\u00109R\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010w\u001a\u0004\bx\u0010yR\u0019\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u0010z\u001a\u0004\b{\u0010|R\u0017\u00100\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b}\u0010@R\u0017\u00101\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b1\u0010o\u001a\u0004\b~\u00107¨\u0006\u0081\u0001"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "Ll20/c;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "type", "skuId", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;", "imageModel", "", "Lru/ozon/app/android/product/common/product/ImageBadge;", "imageBadges", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isFavorite", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "link", "Lru/ozon/uni/atoms/data/AtomDTO;", "state", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3", "secondaryButton", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "containerOptions", "isLast", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "buttonSubtitle", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteButton", "imageOverlayPicture", "", "imageAlpha", "", "buttonSubtitleHeight", "stateHeight", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "imageOverlayTitle", "Lru/ozon/app/android/product/common/wave/WaveModel;", "waveModel", "widgetId", "backgroundColor", "<init>", "(JLru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;JLru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;Ljava/util/List;ZZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;LWZ/t;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;ZLru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Ljava/lang/String;FIILru/ozon/app/android/product/common/product/OverlayTitleModel;Lru/ozon/app/android/product/common/wave/WaveModel;JLjava/lang/String;)V", "copy", "(JLru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;JLru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;Ljava/util/List;ZZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;LWZ/t;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;ZLru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Ljava/lang/String;FIILru/ozon/app/android/product/common/product/OverlayTitleModel;Lru/ozon/app/android/product/common/wave/WaveModel;JLjava/lang/String;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "getType", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "getSkuId", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;", "getImageModel", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;", "Ljava/util/List;", "getImageBadges", "()Ljava/util/List;", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLink", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getState", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonV3", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondaryButton", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "getContainerOptions", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "setLast", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getButtonSubtitle", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Ljava/lang/String;", "getImageOverlayPicture", "F", "getImageAlpha", "()F", "I", "getButtonSubtitleHeight", "getStateHeight", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "getImageOverlayTitle", "()Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "Lru/ozon/app/android/product/common/wave/WaveModel;", "getWaveModel", "()Lru/ozon/app/android/product/common/wave/WaveModel;", "getWidgetId", "getBackgroundColor", "GalleryItem", "Type", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductVO implements c, AdultVO {

    @NotNull
    private final String backgroundColor;
    private final AtomDTO button;
    private final TextAtomWithIcon buttonSubtitle;
    private final int buttonSubtitleHeight;
    private final ButtonV3DTO buttonV3;
    private final ProductContainerDTO.Options containerOptions;
    private final FavoriteProductMolecule favoriteButton;
    private final long id;
    private final float imageAlpha;
    private final List<ImageBadge> imageBadges;

    @NotNull
    private final SkuImageModel imageModel;
    private final String imageOverlayPicture;
    private final OverlayTitleModel imageOverlayTitle;
    private final boolean isAdult;
    private Boolean isFavorite;
    private boolean isLast;
    private final AtomActionDTO link;
    private final AtomDTO secondaryButton;
    private boolean shouldBlur;
    private final long skuId;
    private final List<AtomDTO> state;
    private final int stateHeight;
    private final t tokenizedEvent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;
    private final WaveModel waveModel;
    private final long widgetId;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00020\t8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)V", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "ImageItem", "VideoItem", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$ImageItem;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GalleryItem implements AdultVO {

        @NotNull
        private final AdultImageView.Image image;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$ImageItem;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)V", "copy", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$ImageItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageItem extends GalleryItem {

            @NotNull
            private final AdultImageView.Image image;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageItem(@NotNull AdultImageView.Image image) {
                super(image, null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
            }

            @NotNull
            public final ImageItem copy(@NotNull AdultImageView.Image image) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new ImageItem(image);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImageItem) && Intrinsics.d(this.image, ((ImageItem) other).image);
            }

            @NotNull
            public AdultImageView.Image getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.image.hashCode();
            }

            @NotNull
            public String toString() {
                return "ImageItem(image=" + this.image + ")";
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0010R\u001a\u0010%\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem;", "Lru/ozon/app/android/videocover/VideoTileItem;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "", "link", "LWZ/t;", "startedTokenizedEvent", "finishedTokenizedEvent", "interruptedTokenizedEvent", "<init>", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;)V", "copy", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Ljava/lang/String;LWZ/t;LWZ/t;LWZ/t;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "Ljava/lang/String;", "getLink", "LWZ/t;", "getStartedTokenizedEvent", "()LWZ/t;", "getFinishedTokenizedEvent", "getInterruptedTokenizedEvent", "videoUrl", "getVideoUrl", "shouldShowBlurredPreview", "Z", "getShouldShowBlurredPreview", "()Z", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VideoItem extends GalleryItem implements VideoTileItem {
            private final t finishedTokenizedEvent;

            @NotNull
            private final AdultImageView.Image image;
            private final t interruptedTokenizedEvent;

            @NotNull
            private final String link;
            private final boolean shouldShowBlurredPreview;
            private final t startedTokenizedEvent;

            @NotNull
            private final String videoUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoItem(@NotNull AdultImageView.Image image, @NotNull String link, t tVar, t tVar2, t tVar3) {
                super(image, null);
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(link, "link");
                this.image = image;
                this.link = link;
                this.startedTokenizedEvent = tVar;
                this.finishedTokenizedEvent = tVar2;
                this.interruptedTokenizedEvent = tVar3;
                this.videoUrl = link;
                this.shouldShowBlurredPreview = getShouldBlur();
            }

            public static /* synthetic */ VideoItem copy$default(VideoItem videoItem, AdultImageView.Image image, String str, t tVar, t tVar2, t tVar3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    image = videoItem.image;
                }
                if ((i11 & 2) != 0) {
                    str = videoItem.link;
                }
                if ((i11 & 4) != 0) {
                    tVar = videoItem.startedTokenizedEvent;
                }
                if ((i11 & 8) != 0) {
                    tVar2 = videoItem.finishedTokenizedEvent;
                }
                if ((i11 & 16) != 0) {
                    tVar3 = videoItem.interruptedTokenizedEvent;
                }
                t tVar4 = tVar3;
                t tVar5 = tVar;
                return videoItem.copy(image, str, tVar5, tVar2, tVar4);
            }

            @NotNull
            public final VideoItem copy(@NotNull AdultImageView.Image image, @NotNull String link, t startedTokenizedEvent, t finishedTokenizedEvent, t interruptedTokenizedEvent) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(link, "link");
                return new VideoItem(image, link, startedTokenizedEvent, finishedTokenizedEvent, interruptedTokenizedEvent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoItem)) {
                    return false;
                }
                VideoItem videoItem = (VideoItem) other;
                return Intrinsics.d(this.image, videoItem.image) && Intrinsics.d(this.link, videoItem.link) && Intrinsics.d(this.startedTokenizedEvent, videoItem.startedTokenizedEvent) && Intrinsics.d(this.finishedTokenizedEvent, videoItem.finishedTokenizedEvent) && Intrinsics.d(this.interruptedTokenizedEvent, videoItem.interruptedTokenizedEvent);
            }

            @Override // ru.ozon.app.android.videocover.VideoTileItem
            public t getFinishedTokenizedEvent() {
                return this.finishedTokenizedEvent;
            }

            @NotNull
            public AdultImageView.Image getImage() {
                return this.image;
            }

            @Override // ru.ozon.app.android.videocover.VideoTileItem
            public t getInterruptedTokenizedEvent() {
                return this.interruptedTokenizedEvent;
            }

            @Override // ru.ozon.app.android.videocover.VideoTileItem
            public boolean getShouldShowBlurredPreview() {
                return this.shouldShowBlurredPreview;
            }

            @Override // ru.ozon.app.android.videocover.VideoTileItem
            public t getStartedTokenizedEvent() {
                return this.startedTokenizedEvent;
            }

            @Override // ru.ozon.app.android.videocover.VideoTileItem
            @NotNull
            public String getVideoUrl() {
                return this.videoUrl;
            }

            public int hashCode() {
                int a11 = g.a(this.image.hashCode() * 31, 31, this.link);
                t tVar = this.startedTokenizedEvent;
                int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                t tVar2 = this.finishedTokenizedEvent;
                int hashCode2 = (hashCode + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
                t tVar3 = this.interruptedTokenizedEvent;
                return hashCode2 + (tVar3 != null ? tVar3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                AdultImageView.Image image = this.image;
                String str = this.link;
                t tVar = this.startedTokenizedEvent;
                t tVar2 = this.finishedTokenizedEvent;
                t tVar3 = this.interruptedTokenizedEvent;
                StringBuilder sb2 = new StringBuilder("VideoItem(image=");
                sb2.append(image);
                sb2.append(", link=");
                sb2.append(str);
                sb2.append(", startedTokenizedEvent=");
                sb2.append(tVar);
                sb2.append(", finishedTokenizedEvent=");
                sb2.append(tVar2);
                sb2.append(", interruptedTokenizedEvent=");
                return b.d(sb2, tVar3, ")");
            }
        }

        public /* synthetic */ GalleryItem(AdultImageView.Image image, DefaultConstructorMarker defaultConstructorMarker) {
            this(image);
        }

        public boolean getShouldBlur() {
            return this.image.getShouldBlur();
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult */
        public boolean getIsAdult() {
            return this.image.getIsAdult();
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.image.setShouldBlur(z11);
        }

        private GalleryItem(AdultImageView.Image image) {
            this.image = image;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SCROLL", "LIST", "GRID1", "GRID2", "GRID3", "ADVVIDEOBANNER", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<String, Type> values;

        @NotNull
        private final String value;
        public static final Type SCROLL = new Type("SCROLL", 0, "skuScroll");
        public static final Type LIST = new Type("LIST", 1, "sellerProducts");
        public static final Type GRID1 = new Type("GRID1", 2, "skuGrid1");
        public static final Type GRID2 = new Type("GRID2", 3, "skuGrid2");
        public static final Type GRID3 = new Type("GRID3", 4, "skuGrid3");
        public static final Type ADVVIDEOBANNER = new Type("ADVVIDEOBANNER", 5, "advVideoBannerMobile");

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "fromString", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type fromString(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Object obj = Type.values.get(value);
                if (obj != null) {
                    return (Type) obj;
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SCROLL, LIST, GRID1, GRID2, GRID3, ADVVIDEOBANNER};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
            INSTANCE = new Companion(null);
            Type[] values2 = values();
            int h11 = U.h(values2.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (Type type : values2) {
                linkedHashMap.put(type.value, type);
            }
            values = linkedHashMap;
        }

        private Type(String str, int i11, String str2) {
            this.value = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductVO(long j11, @NotNull Type type, long j12, @NotNull SkuImageModel imageModel, List<ImageBadge> list, boolean z11, boolean z12, Boolean bool, AtomActionDTO atomActionDTO, List<? extends AtomDTO> list2, AtomDTO atomDTO, ButtonV3DTO buttonV3DTO, AtomDTO atomDTO2, Map<String, TokenizedTrackingInfo> map, t tVar, ProductContainerDTO.Options options, boolean z13, TextAtomWithIcon textAtomWithIcon, FavoriteProductMolecule favoriteProductMolecule, String str, float f7, int i11, int i12, OverlayTitleModel overlayTitleModel, WaveModel waveModel, long j13, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.type = type;
        this.skuId = j12;
        this.imageModel = imageModel;
        this.imageBadges = list;
        this.shouldBlur = z11;
        this.isAdult = z12;
        this.isFavorite = bool;
        this.link = atomActionDTO;
        this.state = list2;
        this.button = atomDTO;
        this.buttonV3 = buttonV3DTO;
        this.secondaryButton = atomDTO2;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
        this.containerOptions = options;
        this.isLast = z13;
        this.buttonSubtitle = textAtomWithIcon;
        this.favoriteButton = favoriteProductMolecule;
        this.imageOverlayPicture = str;
        this.imageAlpha = f7;
        this.buttonSubtitleHeight = i11;
        this.stateHeight = i12;
        this.imageOverlayTitle = overlayTitleModel;
        this.waveModel = waveModel;
        this.widgetId = j13;
        this.backgroundColor = backgroundColor;
    }

    public static /* synthetic */ ProductVO copy$default(ProductVO productVO, long j11, Type type, long j12, SkuImageModel skuImageModel, List list, boolean z11, boolean z12, Boolean bool, AtomActionDTO atomActionDTO, List list2, AtomDTO atomDTO, ButtonV3DTO buttonV3DTO, AtomDTO atomDTO2, Map map, t tVar, ProductContainerDTO.Options options, boolean z13, TextAtomWithIcon textAtomWithIcon, FavoriteProductMolecule favoriteProductMolecule, String str, float f7, int i11, int i12, OverlayTitleModel overlayTitleModel, WaveModel waveModel, long j13, String str2, int i13, Object obj) {
        String str3;
        long j14;
        long j15 = (i13 & 1) != 0 ? productVO.id : j11;
        Type type2 = (i13 & 2) != 0 ? productVO.type : type;
        long j16 = (i13 & 4) != 0 ? productVO.skuId : j12;
        SkuImageModel skuImageModel2 = (i13 & 8) != 0 ? productVO.imageModel : skuImageModel;
        List list3 = (i13 & 16) != 0 ? productVO.imageBadges : list;
        boolean z14 = (i13 & 32) != 0 ? productVO.shouldBlur : z11;
        boolean z15 = (i13 & 64) != 0 ? productVO.isAdult : z12;
        Boolean bool2 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productVO.isFavorite : bool;
        AtomActionDTO atomActionDTO2 = (i13 & 256) != 0 ? productVO.link : atomActionDTO;
        List list4 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productVO.state : list2;
        AtomDTO atomDTO3 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productVO.button : atomDTO;
        ButtonV3DTO buttonV3DTO2 = (i13 & 2048) != 0 ? productVO.buttonV3 : buttonV3DTO;
        long j17 = j15;
        AtomDTO atomDTO4 = (i13 & 4096) != 0 ? productVO.secondaryButton : atomDTO2;
        Map map2 = (i13 & 8192) != 0 ? productVO.trackingInfo : map;
        AtomDTO atomDTO5 = atomDTO4;
        t tVar2 = (i13 & 16384) != 0 ? productVO.tokenizedEvent : tVar;
        ProductContainerDTO.Options options2 = (i13 & 32768) != 0 ? productVO.containerOptions : options;
        boolean z16 = (i13 & 65536) != 0 ? productVO.isLast : z13;
        TextAtomWithIcon textAtomWithIcon2 = (i13 & 131072) != 0 ? productVO.buttonSubtitle : textAtomWithIcon;
        FavoriteProductMolecule favoriteProductMolecule2 = (i13 & 262144) != 0 ? productVO.favoriteButton : favoriteProductMolecule;
        String str4 = (i13 & 524288) != 0 ? productVO.imageOverlayPicture : str;
        float f11 = (i13 & 1048576) != 0 ? productVO.imageAlpha : f7;
        int i14 = (i13 & 2097152) != 0 ? productVO.buttonSubtitleHeight : i11;
        int i15 = (i13 & 4194304) != 0 ? productVO.stateHeight : i12;
        OverlayTitleModel overlayTitleModel2 = (i13 & 8388608) != 0 ? productVO.imageOverlayTitle : overlayTitleModel;
        WaveModel waveModel2 = (i13 & 16777216) != 0 ? productVO.waveModel : waveModel;
        t tVar3 = tVar2;
        long j18 = (i13 & 33554432) != 0 ? productVO.widgetId : j13;
        if ((i13 & 67108864) != 0) {
            j14 = j18;
            str3 = productVO.backgroundColor;
        } else {
            str3 = str2;
            j14 = j18;
        }
        return productVO.copy(j17, type2, j16, skuImageModel2, list3, z14, z15, bool2, atomActionDTO2, list4, atomDTO3, buttonV3DTO2, atomDTO5, map2, tVar3, options2, z16, textAtomWithIcon2, favoriteProductMolecule2, str4, f11, i14, i15, overlayTitleModel2, waveModel2, j14, str3);
    }

    @NotNull
    public final ProductVO copy(long id2, @NotNull Type type, long skuId, @NotNull SkuImageModel imageModel, List<ImageBadge> imageBadges, boolean shouldBlur, boolean isAdult, Boolean isFavorite, AtomActionDTO link, List<? extends AtomDTO> state, AtomDTO button, ButtonV3DTO buttonV3, AtomDTO secondaryButton, Map<String, TokenizedTrackingInfo> trackingInfo, t tokenizedEvent, ProductContainerDTO.Options containerOptions, boolean isLast, TextAtomWithIcon buttonSubtitle, FavoriteProductMolecule favoriteButton, String imageOverlayPicture, float imageAlpha, int buttonSubtitleHeight, int stateHeight, OverlayTitleModel imageOverlayTitle, WaveModel waveModel, long widgetId, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new ProductVO(id2, type, skuId, imageModel, imageBadges, shouldBlur, isAdult, isFavorite, link, state, button, buttonV3, secondaryButton, trackingInfo, tokenizedEvent, containerOptions, isLast, buttonSubtitle, favoriteButton, imageOverlayPicture, imageAlpha, buttonSubtitleHeight, stateHeight, imageOverlayTitle, waveModel, widgetId, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVO)) {
            return false;
        }
        ProductVO productVO = (ProductVO) other;
        return this.id == productVO.id && this.type == productVO.type && this.skuId == productVO.skuId && Intrinsics.d(this.imageModel, productVO.imageModel) && Intrinsics.d(this.imageBadges, productVO.imageBadges) && this.shouldBlur == productVO.shouldBlur && this.isAdult == productVO.isAdult && Intrinsics.d(this.isFavorite, productVO.isFavorite) && Intrinsics.d(this.link, productVO.link) && Intrinsics.d(this.state, productVO.state) && Intrinsics.d(this.button, productVO.button) && Intrinsics.d(this.buttonV3, productVO.buttonV3) && Intrinsics.d(this.secondaryButton, productVO.secondaryButton) && Intrinsics.d(this.trackingInfo, productVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, productVO.tokenizedEvent) && Intrinsics.d(this.containerOptions, productVO.containerOptions) && this.isLast == productVO.isLast && Intrinsics.d(this.buttonSubtitle, productVO.buttonSubtitle) && Intrinsics.d(this.favoriteButton, productVO.favoriteButton) && Intrinsics.d(this.imageOverlayPicture, productVO.imageOverlayPicture) && Float.compare(this.imageAlpha, productVO.imageAlpha) == 0 && this.buttonSubtitleHeight == productVO.buttonSubtitleHeight && this.stateHeight == productVO.stateHeight && Intrinsics.d(this.imageOverlayTitle, productVO.imageOverlayTitle) && Intrinsics.d(this.waveModel, productVO.waveModel) && this.widgetId == productVO.widgetId && Intrinsics.d(this.backgroundColor, productVO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    public final TextAtomWithIcon getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    public final ButtonV3DTO getButtonV3() {
        return this.buttonV3;
    }

    public final FavoriteProductMolecule getFavoriteButton() {
        return this.favoriteButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getImageAlpha() {
        return this.imageAlpha;
    }

    public final List<ImageBadge> getImageBadges() {
        return this.imageBadges;
    }

    @NotNull
    public final SkuImageModel getImageModel() {
        return this.imageModel;
    }

    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
    }

    public final OverlayTitleModel getImageOverlayTitle() {
        return this.imageOverlayTitle;
    }

    public final AtomActionDTO getLink() {
        return this.link;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomDTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final List<AtomDTO> getState() {
        return this.state;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final WaveModel getWaveModel() {
        return this.waveModel;
    }

    public int hashCode() {
        int hashCode = (this.imageModel.hashCode() + Pk0.c.a((this.type.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.skuId)) * 31;
        List<ImageBadge> list = this.imageBadges;
        int a11 = C3532b.a(C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.shouldBlur), 31, this.isAdult);
        Boolean bool = this.isFavorite;
        int hashCode2 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.link;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        List<AtomDTO> list2 = this.state;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode5 = (hashCode4 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        int hashCode6 = (hashCode5 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.secondaryButton;
        int hashCode7 = (hashCode6 + (atomDTO2 == null ? 0 : atomDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode9 = (hashCode8 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ProductContainerDTO.Options options = this.containerOptions;
        int a12 = C3532b.a((hashCode9 + (options == null ? 0 : options.hashCode())) * 31, 31, this.isLast);
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        int hashCode10 = (a12 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        int hashCode11 = (hashCode10 + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31;
        String str = this.imageOverlayPicture;
        int a13 = C2454a.a(this.stateHeight, C2454a.a(this.buttonSubtitleHeight, Pk0.b.a(this.imageAlpha, (hashCode11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        OverlayTitleModel overlayTitleModel = this.imageOverlayTitle;
        int hashCode12 = (a13 + (overlayTitleModel == null ? 0 : overlayTitleModel.hashCode())) * 31;
        WaveModel waveModel = this.waveModel;
        return this.backgroundColor.hashCode() + Pk0.c.a((hashCode12 + (waveModel != null ? waveModel.hashCode() : 0)) * 31, 31, this.widgetId);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Type type = this.type;
        long j12 = this.skuId;
        SkuImageModel skuImageModel = this.imageModel;
        List<ImageBadge> list = this.imageBadges;
        boolean z11 = this.shouldBlur;
        boolean z12 = this.isAdult;
        Boolean bool = this.isFavorite;
        AtomActionDTO atomActionDTO = this.link;
        List<AtomDTO> list2 = this.state;
        AtomDTO atomDTO = this.button;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        AtomDTO atomDTO2 = this.secondaryButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.tokenizedEvent;
        ProductContainerDTO.Options options = this.containerOptions;
        boolean z13 = this.isLast;
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        String str = this.imageOverlayPicture;
        float f7 = this.imageAlpha;
        int i11 = this.buttonSubtitleHeight;
        int i12 = this.stateHeight;
        OverlayTitleModel overlayTitleModel = this.imageOverlayTitle;
        WaveModel waveModel = this.waveModel;
        long j13 = this.widgetId;
        String str2 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("ProductVO(id=");
        sb2.append(j11);
        sb2.append(", type=");
        sb2.append(type);
        C2942q.f(sb2, ", skuId=", j12, ", imageModel=");
        sb2.append(skuImageModel);
        sb2.append(", imageBadges=");
        sb2.append(list);
        sb2.append(", shouldBlur=");
        f.c(", isAdult=", ", isFavorite=", sb2, z11, z12);
        sb2.append(bool);
        sb2.append(", link=");
        sb2.append(atomActionDTO);
        sb2.append(", state=");
        sb2.append(list2);
        sb2.append(", button=");
        sb2.append(atomDTO);
        sb2.append(", buttonV3=");
        sb2.append(buttonV3DTO);
        sb2.append(", secondaryButton=");
        sb2.append(atomDTO2);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", containerOptions=");
        sb2.append(options);
        sb2.append(", isLast=");
        sb2.append(z13);
        sb2.append(", buttonSubtitle=");
        sb2.append(textAtomWithIcon);
        sb2.append(", favoriteButton=");
        sb2.append(favoriteProductMolecule);
        sb2.append(", imageOverlayPicture=");
        sb2.append(str);
        sb2.append(", imageAlpha=");
        sb2.append(f7);
        sb2.append(", buttonSubtitleHeight=");
        Ek.a.f(i11, i12, ", stateHeight=", ", imageOverlayTitle=", sb2);
        sb2.append(overlayTitleModel);
        sb2.append(", waveModel=");
        sb2.append(waveModel);
        sb2.append(", widgetId=");
        sb2.append(j13);
        sb2.append(", backgroundColor=");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductVO(long r33, ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO.Type r35, long r36, ru.ozon.app.android.sellerproducts.sellerProducts.data.model.SkuImageModel r38, java.util.List r39, boolean r40, boolean r41, java.lang.Boolean r42, ru.ozon.uni.atoms.data.AtomActionDTO r43, java.util.List r44, ru.ozon.uni.atoms.data.AtomDTO r45, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO r46, ru.ozon.uni.atoms.data.AtomDTO r47, java.util.Map r48, WZ.t r49, ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO.Options r50, boolean r51, ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon r52, ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule r53, java.lang.String r54, float r55, int r56, int r57, ru.ozon.app.android.product.common.product.OverlayTitleModel r58, ru.ozon.app.android.product.common.wave.WaveModel r59, long r60, java.lang.String r62, int r63, kotlin.jvm.internal.DefaultConstructorMarker r64) {
        /*
            r32 = this;
            r0 = r63 & 64
            if (r0 == 0) goto L7
            r10 = r40
            goto L9
        L7:
            r10 = r41
        L9:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r63 & r0
            r1 = 0
            if (r0 == 0) goto L13
            r25 = r1
            goto L15
        L13:
            r25 = r56
        L15:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r63 & r0
            if (r0 == 0) goto L1e
            r26 = r1
            goto L20
        L1e:
            r26 = r57
        L20:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r63 & r0
            if (r0 == 0) goto L5b
            r0 = 0
            r29 = r0
            r2 = r33
            r4 = r35
            r5 = r36
            r7 = r38
            r8 = r39
            r9 = r40
            r11 = r42
            r12 = r43
            r13 = r44
            r14 = r45
            r15 = r46
            r16 = r47
            r17 = r48
            r18 = r49
            r19 = r50
            r20 = r51
            r21 = r52
            r22 = r53
            r23 = r54
            r24 = r55
            r27 = r58
            r28 = r59
            r31 = r62
            r1 = r32
            goto L8d
        L5b:
            r29 = r60
            r1 = r32
            r2 = r33
            r4 = r35
            r5 = r36
            r7 = r38
            r8 = r39
            r9 = r40
            r11 = r42
            r12 = r43
            r13 = r44
            r14 = r45
            r15 = r46
            r16 = r47
            r17 = r48
            r18 = r49
            r19 = r50
            r20 = r51
            r21 = r52
            r22 = r53
            r23 = r54
            r24 = r55
            r27 = r58
            r28 = r59
            r31 = r62
        L8d:
            r1.<init>(r2, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO.<init>(long, ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO$Type, long, ru.ozon.app.android.sellerproducts.sellerProducts.data.model.SkuImageModel, java.util.List, boolean, boolean, java.lang.Boolean, ru.ozon.uni.atoms.data.AtomActionDTO, java.util.List, ru.ozon.uni.atoms.data.AtomDTO, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO, ru.ozon.uni.atoms.data.AtomDTO, java.util.Map, WZ.t, ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO$Options, boolean, ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon, ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule, java.lang.String, float, int, int, ru.ozon.app.android.product.common.product.OverlayTitleModel, ru.ozon.app.android.product.common.wave.WaveModel, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
