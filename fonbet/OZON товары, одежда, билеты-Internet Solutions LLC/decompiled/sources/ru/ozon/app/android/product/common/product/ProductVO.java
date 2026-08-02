package ru.ozon.app.android.product.common.product;

import B0.C2454a;
import Cm.e;
import D3.h;
import E0.C2942q;
import G.g;
import Kk.C3532b;
import WZ.t;
import Xc.a;
import Xc.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import c8.C5766e;
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
import ru.ozon.app.android.product.common.core.ButtonSizeModel;
import ru.ozon.app.android.product.common.core.OffsetModel;
import ru.ozon.app.android.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b]\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004\u0094\u0001\u0095\u0001BÑ\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0013\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020)\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\u0004\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\b\u00103\u001a\u0004\u0018\u000101\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u00106\u001a\u00020\u000e\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010;\u001a\u00020)¢\u0006\u0004\b<\u0010=J\u0090\u0003\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00100\u001a\u00020\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00103\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\b\b\u0002\u00106\u001a\u00020\u000e2\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u00020)HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020)HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\bE\u0010FR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bM\u0010IR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010PR\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\b\r\u0010SR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010V\u001a\u0004\bW\u0010AR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010X\u001a\u0004\b\u0010\u0010Y\"\u0004\bZ\u0010[R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u0010^R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010e\u001a\u0004\bf\u0010gR%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bi\u0010jR\u001f\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010n\u001a\u0004\bo\u0010pR\"\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010Q\u001a\u0004\b!\u0010S\"\u0004\bq\u0010UR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010r\u001a\u0004\bs\u0010tR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00138\u0006¢\u0006\f\n\u0004\b%\u0010_\u001a\u0004\bu\u0010aR\u0019\u0010&\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010V\u001a\u0004\bv\u0010AR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010z\u001a\u0004\b{\u0010CR\u0017\u0010+\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b+\u0010z\u001a\u0004\b|\u0010CR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010}\u001a\u0004\b~\u0010\u007fR\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000f\n\u0005\b/\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u00100\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b0\u0010G\u001a\u0005\b\u0083\u0001\u0010IR\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0005\b2\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u00103\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0005\b3\u0010\u0084\u0001\u001a\u0006\b\u0087\u0001\u0010\u0086\u0001R\u001c\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000f\n\u0005\b5\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u00106\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\b6\u0010V\u001a\u0005\b\u008b\u0001\u0010AR\u001c\u00108\u001a\u0004\u0018\u0001078\u0006¢\u0006\u000f\n\u0005\b8\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010:\u001a\u0002098\u0006¢\u0006\u000f\n\u0005\b:\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010;\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\u000e\n\u0004\b;\u0010z\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0096\u0001"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/app/android/product/common/product/ProductVO$Type;", "type", "skuId", "Lru/ozon/app/android/product/common/product/SkuImageModel;", "imageModel", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "blurPlaceholderImage", "isFavorite", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "state", "button", "Lru/ozon/uni/atoms/data/TestInfo;", "widgetTestInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;", "containerOptions", "isLast", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "buttonSubtitle", "", "topRightButtons", "imageOverlayPicture", "", "imageAlpha", "", "buttonSubtitleHeight", "stateHeight", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "imageOverlayTitle", "Lru/ozon/app/android/product/common/wave/WaveModel;", "waveModel", "widgetId", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "leftBottomBadge", "secondLeftBottomBadge", "Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;", "badgePadding", "backgroundColor", "Lru/ozon/app/android/product/common/core/OffsetModel;", "offsetModel", "Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "buttonSizeModel", "scrollWidgetKey", "<init>", "(JLru/ozon/app/android/product/common/product/ProductVO$Type;JLru/ozon/app/android/product/common/product/SkuImageModel;ZZLjava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;LWZ/t;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;ZLru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Ljava/util/List;Ljava/lang/String;FIILru/ozon/app/android/product/common/product/OverlayTitleModel;Lru/ozon/app/android/product/common/wave/WaveModel;JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;Ljava/lang/String;Lru/ozon/app/android/product/common/core/OffsetModel;Lru/ozon/app/android/product/common/core/ButtonSizeModel;I)V", "copy", "(JLru/ozon/app/android/product/common/product/ProductVO$Type;JLru/ozon/app/android/product/common/product/SkuImageModel;ZZLjava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;LWZ/t;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;ZLru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Ljava/util/List;Ljava/lang/String;FIILru/ozon/app/android/product/common/product/OverlayTitleModel;Lru/ozon/app/android/product/common/wave/WaveModel;JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;Ljava/lang/String;Lru/ozon/app/android/product/common/core/OffsetModel;Lru/ozon/app/android/product/common/core/ButtonSizeModel;I)Lru/ozon/app/android/product/common/product/ProductVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/product/common/product/ProductVO$Type;", "getType", "()Lru/ozon/app/android/product/common/product/ProductVO$Type;", "getSkuId", "Lru/ozon/app/android/product/common/product/SkuImageModel;", "getImageModel", "()Lru/ozon/app/android/product/common/product/SkuImageModel;", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Ljava/lang/String;", "getBlurPlaceholderImage", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getState", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/data/TestInfo;", "getWidgetTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;", "getContainerOptions", "()Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;", "setLast", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getButtonSubtitle", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getTopRightButtons", "getImageOverlayPicture", "F", "getImageAlpha", "()F", "I", "getButtonSubtitleHeight", "getStateHeight", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "getImageOverlayTitle", "()Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "Lru/ozon/app/android/product/common/wave/WaveModel;", "getWaveModel", "()Lru/ozon/app/android/product/common/wave/WaveModel;", "getWidgetId", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLeftBottomBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSecondLeftBottomBadge", "Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;", "getBadgePadding", "()Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;", "getBackgroundColor", "Lru/ozon/app/android/product/common/core/OffsetModel;", "getOffsetModel", "()Lru/ozon/app/android/product/common/core/OffsetModel;", "Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "getButtonSizeModel", "()Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Type", "BadgePadding", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductVO implements c, AdultVO {
    private final AtomAction action;

    @NotNull
    private final String backgroundColor;
    private final BadgePadding badgePadding;
    private final String blurPlaceholderImage;
    private final AtomDTO button;

    @NotNull
    private final ButtonSizeModel buttonSizeModel;
    private final TextAtomWithIcon buttonSubtitle;
    private final int buttonSubtitleHeight;
    private final ProductContainerDTO.Options containerOptions;
    private final long id;
    private final float imageAlpha;

    @NotNull
    private final SkuImageModel imageModel;
    private final String imageOverlayPicture;
    private final OverlayTitleModel imageOverlayTitle;
    private final boolean isAdult;
    private Boolean isFavorite;
    private boolean isLast;
    private final BadgeDTO leftBottomBadge;
    private final OffsetModel offsetModel;
    private final int scrollWidgetKey;
    private final BadgeDTO secondLeftBottomBadge;
    private boolean shouldBlur;
    private final long skuId;
    private final List<AtomDTO> state;
    private final int stateHeight;
    private final t tokenizedEvent;

    @NotNull
    private final List<Object> topRightButtons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;
    private final WaveModel waveModel;
    private final long widgetId;
    private final TestInfo widgetTestInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;", "", "badgePaddingBetweenInPx", "", "<init>", "(Ljava/lang/String;II)V", "getBadgePaddingBetweenInPx", "()I", "SMALL", "MEDIUM", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class BadgePadding {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BadgePadding[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int badgePaddingBetweenInPx;
        public static final BadgePadding SMALL = new BadgePadding("SMALL", 0, UiExtKt.toPx(2));
        public static final BadgePadding MEDIUM = new BadgePadding("MEDIUM", 1, UiExtKt.toPx(4));

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding$Companion;", "", "<init>", "()V", "fromType", "Lru/ozon/app/android/product/common/product/ProductVO$BadgePadding;", "type", "Lru/ozon/app/android/product/common/product/ProductVO$Type;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Type.values().length];
                    try {
                        iArr[Type.GRID1.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BadgePadding fromType(@NotNull Type type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1 ? BadgePadding.MEDIUM : BadgePadding.SMALL;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ BadgePadding[] $values() {
            return new BadgePadding[]{SMALL, MEDIUM};
        }

        static {
            BadgePadding[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
        }

        private BadgePadding(String str, int i11, int i12) {
            this.badgePaddingBetweenInPx = i12;
        }

        public static BadgePadding valueOf(String str) {
            return (BadgePadding) Enum.valueOf(BadgePadding.class, str);
        }

        public static BadgePadding[] values() {
            return (BadgePadding[]) $VALUES.clone();
        }

        public final int getBadgePaddingBetweenInPx() {
            return this.badgePaddingBetweenInPx;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductVO$Type;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SCROLL", "LIST", "GRID1", "GRID2", "GRID3", "ADVVIDEOBANNER", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
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
        public static final Type LIST = new Type("LIST", 1, "skuList");
        public static final Type GRID1 = new Type("GRID1", 2, "skuGrid1");
        public static final Type GRID2 = new Type("GRID2", 3, "skuGrid2");
        public static final Type GRID3 = new Type("GRID3", 4, "skuGrid3");
        public static final Type ADVVIDEOBANNER = new Type("ADVVIDEOBANNER", 5, "advVideoBannerMobile");

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductVO$Type$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/product/common/product/ProductVO$Type;", "fromString", AppMeasurementSdk.ConditionalUserProperty.VALUE, "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            $ENTRIES = b.a($values);
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
    public ProductVO(long j11, @NotNull Type type, long j12, @NotNull SkuImageModel imageModel, boolean z11, boolean z12, String str, Boolean bool, AtomAction atomAction, List<? extends AtomDTO> list, AtomDTO atomDTO, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, t tVar, ProductContainerDTO.Options options, boolean z13, TextAtomWithIcon textAtomWithIcon, @NotNull List<? extends Object> topRightButtons, String str2, float f7, int i11, int i12, OverlayTitleModel overlayTitleModel, WaveModel waveModel, long j13, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgePadding badgePadding, @NotNull String backgroundColor, OffsetModel offsetModel, @NotNull ButtonSizeModel buttonSizeModel, int i13) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(topRightButtons, "topRightButtons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonSizeModel, "buttonSizeModel");
        this.id = j11;
        this.type = type;
        this.skuId = j12;
        this.imageModel = imageModel;
        this.shouldBlur = z11;
        this.isAdult = z12;
        this.blurPlaceholderImage = str;
        this.isFavorite = bool;
        this.action = atomAction;
        this.state = list;
        this.button = atomDTO;
        this.widgetTestInfo = testInfo;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
        this.containerOptions = options;
        this.isLast = z13;
        this.buttonSubtitle = textAtomWithIcon;
        this.topRightButtons = topRightButtons;
        this.imageOverlayPicture = str2;
        this.imageAlpha = f7;
        this.buttonSubtitleHeight = i11;
        this.stateHeight = i12;
        this.imageOverlayTitle = overlayTitleModel;
        this.waveModel = waveModel;
        this.widgetId = j13;
        this.leftBottomBadge = badgeDTO;
        this.secondLeftBottomBadge = badgeDTO2;
        this.badgePadding = badgePadding;
        this.backgroundColor = backgroundColor;
        this.offsetModel = offsetModel;
        this.buttonSizeModel = buttonSizeModel;
        this.scrollWidgetKey = i13;
    }

    public static /* synthetic */ ProductVO copy$default(ProductVO productVO, long j11, Type type, long j12, SkuImageModel skuImageModel, boolean z11, boolean z12, String str, Boolean bool, AtomAction atomAction, List list, AtomDTO atomDTO, TestInfo testInfo, Map map, t tVar, ProductContainerDTO.Options options, boolean z13, TextAtomWithIcon textAtomWithIcon, List list2, String str2, float f7, int i11, int i12, OverlayTitleModel overlayTitleModel, WaveModel waveModel, long j13, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgePadding badgePadding, String str3, OffsetModel offsetModel, ButtonSizeModel buttonSizeModel, int i13, int i14, Object obj) {
        int i15;
        ButtonSizeModel buttonSizeModel2;
        boolean z14;
        TextAtomWithIcon textAtomWithIcon2;
        List list3;
        String str4;
        float f11;
        int i16;
        int i17;
        OverlayTitleModel overlayTitleModel2;
        ProductContainerDTO.Options options2;
        WaveModel waveModel2;
        long j14;
        BadgeDTO badgeDTO3;
        BadgePadding badgePadding2;
        String str5;
        OffsetModel offsetModel2;
        BadgeDTO badgeDTO4;
        t tVar2;
        Type type2;
        long j15;
        SkuImageModel skuImageModel2;
        boolean z15;
        boolean z16;
        String str6;
        Boolean bool2;
        AtomAction atomAction2;
        List list4;
        AtomDTO atomDTO2;
        TestInfo testInfo2;
        long j16;
        Map map2;
        ProductVO productVO2;
        long j17 = (i14 & 1) != 0 ? productVO.id : j11;
        Type type3 = (i14 & 2) != 0 ? productVO.type : type;
        long j18 = (i14 & 4) != 0 ? productVO.skuId : j12;
        SkuImageModel skuImageModel3 = (i14 & 8) != 0 ? productVO.imageModel : skuImageModel;
        boolean z17 = (i14 & 16) != 0 ? productVO.shouldBlur : z11;
        boolean z18 = (i14 & 32) != 0 ? productVO.isAdult : z12;
        String str7 = (i14 & 64) != 0 ? productVO.blurPlaceholderImage : str;
        Boolean bool3 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productVO.isFavorite : bool;
        AtomAction atomAction3 = (i14 & 256) != 0 ? productVO.action : atomAction;
        List list5 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productVO.state : list;
        AtomDTO atomDTO3 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productVO.button : atomDTO;
        TestInfo testInfo3 = (i14 & 2048) != 0 ? productVO.widgetTestInfo : testInfo;
        long j19 = j17;
        Map map3 = (i14 & 4096) != 0 ? productVO.trackingInfo : map;
        t tVar3 = (i14 & 8192) != 0 ? productVO.tokenizedEvent : tVar;
        Map map4 = map3;
        ProductContainerDTO.Options options3 = (i14 & 16384) != 0 ? productVO.containerOptions : options;
        boolean z19 = (i14 & 32768) != 0 ? productVO.isLast : z13;
        TextAtomWithIcon textAtomWithIcon3 = (i14 & 65536) != 0 ? productVO.buttonSubtitle : textAtomWithIcon;
        List list6 = (i14 & 131072) != 0 ? productVO.topRightButtons : list2;
        String str8 = (i14 & 262144) != 0 ? productVO.imageOverlayPicture : str2;
        float f12 = (i14 & 524288) != 0 ? productVO.imageAlpha : f7;
        int i18 = (i14 & 1048576) != 0 ? productVO.buttonSubtitleHeight : i11;
        int i19 = (i14 & 2097152) != 0 ? productVO.stateHeight : i12;
        OverlayTitleModel overlayTitleModel3 = (i14 & 4194304) != 0 ? productVO.imageOverlayTitle : overlayTitleModel;
        WaveModel waveModel3 = (i14 & 8388608) != 0 ? productVO.waveModel : waveModel;
        ProductContainerDTO.Options options4 = options3;
        long j21 = (i14 & 16777216) != 0 ? productVO.widgetId : j13;
        BadgeDTO badgeDTO5 = (i14 & 33554432) != 0 ? productVO.leftBottomBadge : badgeDTO;
        BadgeDTO badgeDTO6 = (i14 & 67108864) != 0 ? productVO.secondLeftBottomBadge : badgeDTO2;
        BadgeDTO badgeDTO7 = badgeDTO5;
        BadgePadding badgePadding3 = (i14 & 134217728) != 0 ? productVO.badgePadding : badgePadding;
        String str9 = (i14 & 268435456) != 0 ? productVO.backgroundColor : str3;
        OffsetModel offsetModel3 = (i14 & 536870912) != 0 ? productVO.offsetModel : offsetModel;
        ButtonSizeModel buttonSizeModel3 = (i14 & 1073741824) != 0 ? productVO.buttonSizeModel : buttonSizeModel;
        if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            buttonSizeModel2 = buttonSizeModel3;
            i15 = productVO.scrollWidgetKey;
            z14 = z19;
            textAtomWithIcon2 = textAtomWithIcon3;
            list3 = list6;
            str4 = str8;
            f11 = f12;
            i16 = i18;
            i17 = i19;
            overlayTitleModel2 = overlayTitleModel3;
            waveModel2 = waveModel3;
            j14 = j21;
            badgeDTO3 = badgeDTO7;
            badgePadding2 = badgePadding3;
            str5 = str9;
            offsetModel2 = offsetModel3;
            badgeDTO4 = badgeDTO6;
            tVar2 = tVar3;
            type2 = type3;
            j15 = j18;
            skuImageModel2 = skuImageModel3;
            z15 = z17;
            z16 = z18;
            bool2 = bool3;
            atomAction2 = atomAction3;
            list4 = list5;
            atomDTO2 = atomDTO3;
            testInfo2 = testInfo3;
            j16 = j19;
            map2 = map4;
            options2 = options4;
            productVO2 = productVO;
            str6 = str7;
        } else {
            i15 = i13;
            buttonSizeModel2 = buttonSizeModel3;
            z14 = z19;
            textAtomWithIcon2 = textAtomWithIcon3;
            list3 = list6;
            str4 = str8;
            f11 = f12;
            i16 = i18;
            i17 = i19;
            overlayTitleModel2 = overlayTitleModel3;
            options2 = options4;
            waveModel2 = waveModel3;
            j14 = j21;
            badgeDTO3 = badgeDTO7;
            badgePadding2 = badgePadding3;
            str5 = str9;
            offsetModel2 = offsetModel3;
            badgeDTO4 = badgeDTO6;
            tVar2 = tVar3;
            type2 = type3;
            j15 = j18;
            skuImageModel2 = skuImageModel3;
            z15 = z17;
            z16 = z18;
            str6 = str7;
            bool2 = bool3;
            atomAction2 = atomAction3;
            list4 = list5;
            atomDTO2 = atomDTO3;
            testInfo2 = testInfo3;
            j16 = j19;
            map2 = map4;
            productVO2 = productVO;
        }
        return productVO2.copy(j16, type2, j15, skuImageModel2, z15, z16, str6, bool2, atomAction2, list4, atomDTO2, testInfo2, map2, tVar2, options2, z14, textAtomWithIcon2, list3, str4, f11, i16, i17, overlayTitleModel2, waveModel2, j14, badgeDTO3, badgeDTO4, badgePadding2, str5, offsetModel2, buttonSizeModel2, i15);
    }

    @NotNull
    public final ProductVO copy(long id2, @NotNull Type type, long skuId, @NotNull SkuImageModel imageModel, boolean shouldBlur, boolean isAdult, String blurPlaceholderImage, Boolean isFavorite, AtomAction action, List<? extends AtomDTO> state, AtomDTO button, TestInfo widgetTestInfo, Map<String, TokenizedTrackingInfo> trackingInfo, t tokenizedEvent, ProductContainerDTO.Options containerOptions, boolean isLast, TextAtomWithIcon buttonSubtitle, @NotNull List<? extends Object> topRightButtons, String imageOverlayPicture, float imageAlpha, int buttonSubtitleHeight, int stateHeight, OverlayTitleModel imageOverlayTitle, WaveModel waveModel, long widgetId, BadgeDTO leftBottomBadge, BadgeDTO secondLeftBottomBadge, BadgePadding badgePadding, @NotNull String backgroundColor, OffsetModel offsetModel, @NotNull ButtonSizeModel buttonSizeModel, int scrollWidgetKey) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Intrinsics.checkNotNullParameter(topRightButtons, "topRightButtons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttonSizeModel, "buttonSizeModel");
        return new ProductVO(id2, type, skuId, imageModel, shouldBlur, isAdult, blurPlaceholderImage, isFavorite, action, state, button, widgetTestInfo, trackingInfo, tokenizedEvent, containerOptions, isLast, buttonSubtitle, topRightButtons, imageOverlayPicture, imageAlpha, buttonSubtitleHeight, stateHeight, imageOverlayTitle, waveModel, widgetId, leftBottomBadge, secondLeftBottomBadge, badgePadding, backgroundColor, offsetModel, buttonSizeModel, scrollWidgetKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVO)) {
            return false;
        }
        ProductVO productVO = (ProductVO) other;
        return this.id == productVO.id && this.type == productVO.type && this.skuId == productVO.skuId && Intrinsics.d(this.imageModel, productVO.imageModel) && this.shouldBlur == productVO.shouldBlur && this.isAdult == productVO.isAdult && Intrinsics.d(this.blurPlaceholderImage, productVO.blurPlaceholderImage) && Intrinsics.d(this.isFavorite, productVO.isFavorite) && Intrinsics.d(this.action, productVO.action) && Intrinsics.d(this.state, productVO.state) && Intrinsics.d(this.button, productVO.button) && Intrinsics.d(this.widgetTestInfo, productVO.widgetTestInfo) && Intrinsics.d(this.trackingInfo, productVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, productVO.tokenizedEvent) && Intrinsics.d(this.containerOptions, productVO.containerOptions) && this.isLast == productVO.isLast && Intrinsics.d(this.buttonSubtitle, productVO.buttonSubtitle) && Intrinsics.d(this.topRightButtons, productVO.topRightButtons) && Intrinsics.d(this.imageOverlayPicture, productVO.imageOverlayPicture) && Float.compare(this.imageAlpha, productVO.imageAlpha) == 0 && this.buttonSubtitleHeight == productVO.buttonSubtitleHeight && this.stateHeight == productVO.stateHeight && Intrinsics.d(this.imageOverlayTitle, productVO.imageOverlayTitle) && Intrinsics.d(this.waveModel, productVO.waveModel) && this.widgetId == productVO.widgetId && Intrinsics.d(this.leftBottomBadge, productVO.leftBottomBadge) && Intrinsics.d(this.secondLeftBottomBadge, productVO.secondLeftBottomBadge) && this.badgePadding == productVO.badgePadding && Intrinsics.d(this.backgroundColor, productVO.backgroundColor) && Intrinsics.d(this.offsetModel, productVO.offsetModel) && Intrinsics.d(this.buttonSizeModel, productVO.buttonSizeModel) && this.scrollWidgetKey == productVO.scrollWidgetKey;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgePadding getBadgePadding() {
        return this.badgePadding;
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    @NotNull
    public final ButtonSizeModel getButtonSizeModel() {
        return this.buttonSizeModel;
    }

    public final TextAtomWithIcon getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    public final int getButtonSubtitleHeight() {
        return this.buttonSubtitleHeight;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getImageAlpha() {
        return this.imageAlpha;
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

    public final BadgeDTO getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    public final OffsetModel getOffsetModel() {
        return this.offsetModel;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    public final BadgeDTO getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
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

    public final int getStateHeight() {
        return this.stateHeight;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
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

    public final TestInfo getWidgetTestInfo() {
        return this.widgetTestInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a((this.imageModel.hashCode() + Pk0.c.a((this.type.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.skuId)) * 31, 31, this.shouldBlur), 31, this.isAdult);
        String str = this.blurPlaceholderImage;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        List<AtomDTO> list = this.state;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode5 = (hashCode4 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        TestInfo testInfo = this.widgetTestInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode8 = (hashCode7 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ProductContainerDTO.Options options = this.containerOptions;
        int a12 = C3532b.a((hashCode8 + (options == null ? 0 : options.hashCode())) * 31, 31, this.isLast);
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        int b11 = g.b((a12 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31, 31, this.topRightButtons);
        String str2 = this.imageOverlayPicture;
        int a13 = C2454a.a(this.stateHeight, C2454a.a(this.buttonSubtitleHeight, Pk0.b.a(this.imageAlpha, (b11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        OverlayTitleModel overlayTitleModel = this.imageOverlayTitle;
        int hashCode9 = (a13 + (overlayTitleModel == null ? 0 : overlayTitleModel.hashCode())) * 31;
        WaveModel waveModel = this.waveModel;
        int a14 = Pk0.c.a((hashCode9 + (waveModel == null ? 0 : waveModel.hashCode())) * 31, 31, this.widgetId);
        BadgeDTO badgeDTO = this.leftBottomBadge;
        int hashCode10 = (a14 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadge;
        int hashCode11 = (hashCode10 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        BadgePadding badgePadding = this.badgePadding;
        int a15 = g.a((hashCode11 + (badgePadding == null ? 0 : badgePadding.hashCode())) * 31, 31, this.backgroundColor);
        OffsetModel offsetModel = this.offsetModel;
        return Integer.hashCode(this.scrollWidgetKey) + ((this.buttonSizeModel.hashCode() + ((a15 + (offsetModel != null ? offsetModel.hashCode() : 0)) * 31)) * 31);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
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
        boolean z11 = this.shouldBlur;
        boolean z12 = this.isAdult;
        String str = this.blurPlaceholderImage;
        Boolean bool = this.isFavorite;
        AtomAction atomAction = this.action;
        List<AtomDTO> list = this.state;
        AtomDTO atomDTO = this.button;
        TestInfo testInfo = this.widgetTestInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.tokenizedEvent;
        ProductContainerDTO.Options options = this.containerOptions;
        boolean z13 = this.isLast;
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        List<Object> list2 = this.topRightButtons;
        String str2 = this.imageOverlayPicture;
        float f7 = this.imageAlpha;
        int i11 = this.buttonSubtitleHeight;
        int i12 = this.stateHeight;
        OverlayTitleModel overlayTitleModel = this.imageOverlayTitle;
        WaveModel waveModel = this.waveModel;
        long j13 = this.widgetId;
        BadgeDTO badgeDTO = this.leftBottomBadge;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadge;
        BadgePadding badgePadding = this.badgePadding;
        String str3 = this.backgroundColor;
        OffsetModel offsetModel = this.offsetModel;
        ButtonSizeModel buttonSizeModel = this.buttonSizeModel;
        int i13 = this.scrollWidgetKey;
        StringBuilder sb2 = new StringBuilder("ProductVO(id=");
        sb2.append(j11);
        sb2.append(", type=");
        sb2.append(type);
        C2942q.f(sb2, ", skuId=", j12, ", imageModel=");
        sb2.append(skuImageModel);
        sb2.append(", shouldBlur=");
        sb2.append(z11);
        sb2.append(", isAdult=");
        C5766e.a(", blurPlaceholderImage=", str, ", isFavorite=", sb2, z12);
        sb2.append(bool);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", state=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(atomDTO);
        sb2.append(", widgetTestInfo=");
        sb2.append(testInfo);
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
        sb2.append(", topRightButtons=");
        e.i(", imageOverlayPicture=", str2, ", imageAlpha=", sb2, list2);
        sb2.append(f7);
        sb2.append(", buttonSubtitleHeight=");
        sb2.append(i11);
        sb2.append(", stateHeight=");
        sb2.append(i12);
        sb2.append(", imageOverlayTitle=");
        sb2.append(overlayTitleModel);
        sb2.append(", waveModel=");
        sb2.append(waveModel);
        sb2.append(", widgetId=");
        sb2.append(j13);
        sb2.append(", leftBottomBadge=");
        sb2.append(badgeDTO);
        sb2.append(", secondLeftBottomBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", badgePadding=");
        sb2.append(badgePadding);
        sb2.append(", backgroundColor=");
        sb2.append(str3);
        sb2.append(", offsetModel=");
        sb2.append(offsetModel);
        sb2.append(", buttonSizeModel=");
        sb2.append(buttonSizeModel);
        return h.b(sb2, ", scrollWidgetKey=", i13, ")");
    }

    public /* synthetic */ ProductVO(long j11, Type type, long j12, SkuImageModel skuImageModel, boolean z11, boolean z12, String str, Boolean bool, AtomAction atomAction, List list, AtomDTO atomDTO, TestInfo testInfo, Map map, t tVar, ProductContainerDTO.Options options, boolean z13, TextAtomWithIcon textAtomWithIcon, List list2, String str2, float f7, int i11, int i12, OverlayTitleModel overlayTitleModel, WaveModel waveModel, long j13, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, BadgePadding badgePadding, String str3, OffsetModel offsetModel, ButtonSizeModel buttonSizeModel, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, type, j12, skuImageModel, z11, (i14 & 32) != 0 ? z11 : z12, str, bool, atomAction, list, atomDTO, testInfo, map, tVar, options, z13, textAtomWithIcon, list2, str2, f7, (i14 & 1048576) != 0 ? 0 : i11, (i14 & 2097152) != 0 ? 0 : i12, overlayTitleModel, waveModel, (i14 & 16777216) != 0 ? 0L : j13, badgeDTO, badgeDTO2, badgePadding, str3, (i14 & 536870912) != 0 ? null : offsetModel, buttonSizeModel, i13);
    }
}
