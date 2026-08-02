package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import W10.c;
import WZ.l;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import gk0.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryReviewProductV2Binding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductInfoView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ReviewGalleryProductAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ReviewGalleryProductItemDecoration;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ReviewGalleryProductsViewTracker;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.CommentFooterView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.RatingTextView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views.ReviewGalleryView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u009c\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J7\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010%¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0017¢\u0006\u0004\b,\u0010!J+\u0010-\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b3\u0010!J\u0017\u00106\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J!\u0010<\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\r¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00132\u0006\u0010C\u001a\u000208H\u0002¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u00132\u0006\u0010C\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bF\u0010=J\u001b\u0010H\u001a\u00020\u0013*\u00020G2\u0006\u0010C\u001a\u000208H\u0002¢\u0006\u0004\bH\u0010IJ+\u0010L\u001a\u00020K2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010J\u001a\u00020\rH\u0002¢\u0006\u0004\bL\u0010MJ)\u0010R\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00010N2\u0006\u0010O\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010U\u001a\u00020\u0013*\u00020T2\u0006\u0010O\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010+\u001a\u00020\u0001H\u0002¢\u0006\u0004\bX\u0010YJ)\u0010Z\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00010N2\u0006\u0010O\u001a\u00020\u00172\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bZ\u0010SJ\u000f\u0010[\u001a\u00020GH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020f2\u0006\u0010+\u001a\u00020\u0017H\u0002¢\u0006\u0004\bg\u0010hJ\u0013\u0010i\u001a\u00020f*\u00020\u0017H\u0002¢\u0006\u0004\bi\u0010hJ\u0013\u0010k\u001a\u00020\r*\u00020jH\u0002¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010mR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010oR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010pR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010qR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010rR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020G0\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020]0\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001f\u0010\u008d\u0001\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u0088\u0001\u001a\u0005\b\u008c\u0001\u0010eR\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020f0\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020f0\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020f0\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001R*\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0005\b\u0097\u0001\u0010!R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009d\u0001"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate;", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "reviewGalleryView", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favProductMoleculeDelegateFactory", "", "isFreshMiniApp", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;LWZ/l;Lkotlin/jvm/functions/Function0;Z)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "setupActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "newItem", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "setupSubviews", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;LW10/c;Lru/ozon/composer/ui/widget/l;)V", "setupProduct", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;)V", "resetScroll", "setupProductsContainer", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;LW10/c;Lru/ozon/composer/ui/widget/l;Z)V", "Landroid/os/Parcelable;", "scrollState", "updateProductsRecyclerViewScroll", "(Landroid/os/Parcelable;)V", "getProductsRecyclerScrollState", "()Landroid/os/Parcelable;", "item", "setupReviewRating", "setupSocialHeader", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.SOCIAL_USER_FIELD_NAME, "updateSocialHeader", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$SocialUser;)V", "setupSubviewsContainers", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "setupBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_BUTTON_FOOTER_FIELD_NAME, "setupCommentFooter", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentButtonFooterDTO;)V", "onRecycle", "()V", "isVisible", "onParentVisibilityChanged", "(Z)V", CommentV3DTO.FOOTER_FIELD_NAME, "setupCommentFooterText", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;)V", "setupCommentFooterContainer", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "applyCommentTextBackground", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$CommentFooterDTO;)V", "isInBottomItems", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductAdapter;", "createProductsAdapter", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;LW10/c;Z)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductAdapter;", "", "vo", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate$ContainerType;", "containerType", "setupItemsToContainer", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate$ContainerType;)V", "Landroidx/constraintlayout/widget/d;", "applyRightPanelAnchor", "(Landroidx/constraintlayout/widget/d;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;)V", "Landroid/view/View;", "mapItemToView", "(Ljava/lang/Object;)Landroid/view/View;", "updateItems", "createCommentFooterText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/CommentFooterView;", "createCommentFooterContainer", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/CommentFooterView;", "Landroid/widget/FrameLayout;", "createBadgeViewContainer", "()Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "createBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "", "getBottomMediaItemsMargin", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;)I", "compactControlsOffset", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;", "isSingleProductInfo", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemsContainerDTO;)Z", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/ReviewGalleryView;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "Z", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryHeaderDelegate;", "headerDelegate", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryHeaderDelegate;", "Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "productBinding", "Lru/ozon/app/android/ugc/core/databinding/ViewGalleryReviewProductV2Binding;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductsViewTracker;", "productsViewTracker", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductsViewTracker;", "Landroid/graphics/drawable/ShapeDrawable;", "commentFooterBackground", "Landroid/graphics/drawable/ShapeDrawable;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "commentTextRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "", "commentTextColor", "Ljava/lang/String;", "LSc/j;", "commentFooterTextDelegate", "LSc/j;", "commentFooterContainerDelegate", "badgeViewContainerDelegate", "badgeView$delegate", "getBadgeView", "badgeView", "", "topMediaItemsIds", "Ljava/util/List;", "bottomMediaItemsIds", "bottomItemsIds", "currentItem", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "getCurrentItem", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO;", "setCurrentItem", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "ContainerType", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubviewsDelegate {
    private Function1<? super AtomAction, Unit> actionHandler;

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeView;

    @NotNull
    private final InterfaceC4008j<FrameLayout> badgeViewContainerDelegate;

    @NotNull
    private final List<Integer> bottomItemsIds;

    @NotNull
    private final List<Integer> bottomMediaItemsIds;

    @NotNull
    private final ReviewGalleryV2ProductButtonBinder cartButtonBinder;

    @NotNull
    private final ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder;
    private ShapeDrawable commentFooterBackground;

    @NotNull
    private final InterfaceC4008j<CommentFooterView> commentFooterContainerDelegate;

    @NotNull
    private final InterfaceC4008j<TextAtomV2View> commentFooterTextDelegate;
    private String commentTextColor;
    private CornerRadius commentTextRadius;
    private ReviewGalleryVO currentItem;

    @NotNull
    private final Function0<FavoriteProductV4Delegate> favProductMoleculeDelegateFactory;

    @NotNull
    private final ReviewGalleryHeaderDelegate headerDelegate;
    private final boolean isFreshMiniApp;

    @NotNull
    private final ViewGalleryReviewProductV2Binding productBinding;
    private ReviewGalleryProductsViewTracker productsViewTracker;

    @NotNull
    private final ReviewGalleryView reviewGalleryView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final List<Integer> topMediaItemsIds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/SubviewsDelegate$ContainerType;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_MEDIA", "BOTTOM_MEDIA", "BOTTOM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContainerType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ContainerType[] $VALUES;
        public static final ContainerType TOP_MEDIA = new ContainerType("TOP_MEDIA", 0);
        public static final ContainerType BOTTOM_MEDIA = new ContainerType("BOTTOM_MEDIA", 1);
        public static final ContainerType BOTTOM = new ContainerType("BOTTOM", 2);

        private static final /* synthetic */ ContainerType[] $values() {
            return new ContainerType[]{TOP_MEDIA, BOTTOM_MEDIA, BOTTOM};
        }

        static {
            ContainerType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ContainerType(String str, int i11) {
        }

        public static ContainerType valueOf(String str) {
            return (ContainerType) Enum.valueOf(ContainerType.class, str);
        }

        public static ContainerType[] values() {
            return (ContainerType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContainerType.values().length];
            try {
                iArr[ContainerType.TOP_MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContainerType.BOTTOM_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContainerType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubviewsDelegate(@NotNull ReviewGalleryView reviewGalleryView, @NotNull ReviewGalleryV2ProductButtonBinder cartButtonBinder, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder, @NotNull l tokenizedAnalytics, @NotNull Function0<? extends FavoriteProductV4Delegate> favProductMoleculeDelegateFactory, boolean z11) {
        Intrinsics.checkNotNullParameter(reviewGalleryView, "reviewGalleryView");
        Intrinsics.checkNotNullParameter(cartButtonBinder, "cartButtonBinder");
        Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegateFactory, "favProductMoleculeDelegateFactory");
        this.reviewGalleryView = reviewGalleryView;
        this.cartButtonBinder = cartButtonBinder;
        this.cartButtonContainerBinder = cartButtonContainerBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.favProductMoleculeDelegateFactory = favProductMoleculeDelegateFactory;
        this.isFreshMiniApp = z11;
        this.headerDelegate = new ReviewGalleryHeaderDelegate(reviewGalleryView);
        this.productBinding = reviewGalleryView.getProductBinding();
        this.commentFooterTextDelegate = DelegatesKt.lazyUnsafe(new SubviewsDelegate$special$$inlined$lazyView$1(reviewGalleryView, this));
        this.commentFooterContainerDelegate = DelegatesKt.lazyUnsafe(new SubviewsDelegate$special$$inlined$lazyView$2(reviewGalleryView, this));
        InterfaceC4008j<FrameLayout> lazyUnsafe = DelegatesKt.lazyUnsafe(new SubviewsDelegate$special$$inlined$lazyView$3(reviewGalleryView, this));
        this.badgeViewContainerDelegate = lazyUnsafe;
        this.badgeView = DelegatesKt.lazyUnsafe(new SubviewsDelegate$special$$inlined$lazyView$4(lazyUnsafe.getValue(), this));
        this.topMediaItemsIds = new ArrayList();
        this.bottomMediaItemsIds = new ArrayList();
        this.bottomItemsIds = new ArrayList();
    }

    private final void applyCommentTextBackground(TextAtomV2View textAtomV2View, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooterDTO) {
        Paint paint;
        CornerRadius cornerRadius = commentFooterDTO.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_350;
        }
        String backgroundColor = commentFooterDTO.getBackgroundColor();
        if (this.commentFooterBackground != null && cornerRadius == this.commentTextRadius) {
            if (Intrinsics.d(backgroundColor, this.commentTextColor)) {
                return;
            }
            this.commentTextColor = backgroundColor;
            ShapeDrawable shapeDrawable = this.commentFooterBackground;
            if (shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null) {
                return;
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = textAtomV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint.setColor(styleParser.parseColor(context, backgroundColor, UniColors.CLEAR_LIGHT_KEY_400.getResId()));
            return;
        }
        this.commentTextRadius = cornerRadius;
        this.commentTextColor = backgroundColor;
        Context context2 = textAtomV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(cornerRadius.getPx());
        CornersConfig cornersConfig = CornersConfig.ALL;
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context3 = textAtomV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ShapeDrawable createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context2, pxF, cornersConfig, 0, styleParser2.parseColor(context3, backgroundColor, UniColors.CLEAR_LIGHT_KEY_400.getResId()), null, 20, null);
        textAtomV2View.setBackground(createRoundRectShape$default);
        this.commentFooterBackground = createRoundRectShape$default;
    }

    private final void applyRightPanelAnchor(d dVar, ReviewGalleryVO reviewGalleryVO) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel = reviewGalleryVO.getRightPanel();
        Integer bottomPadding = rightPanel != null ? rightPanel.getBottomPadding() : null;
        if (bottomPadding != null) {
            ConstraintSetExtKt.bottomToBottom(dVar, this.reviewGalleryView.getRightPanel().getId(), this.reviewGalleryView.getContentContainer().getId(), bottomPadding.intValue() + compactControlsOffset(reviewGalleryVO));
            return;
        }
        Integer num = (Integer) C7714v.M(this.bottomMediaItemsIds);
        if (num != null) {
            ConstraintSetExtKt.bottomToTop(dVar, this.reviewGalleryView.getRightPanel().getId(), num.intValue(), Dimens.INSTANCE.getDP_16());
        }
    }

    private final int compactControlsOffset(ReviewGalleryVO reviewGalleryVO) {
        if (reviewGalleryVO.getIsCompactControls() && reviewGalleryVO.getIsVideo()) {
            return Dimens.INSTANCE.getDP_12();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView createBadgeView() {
        BadgeView badgeView = new BadgeView(getContext(), null, 0, 0, 14, null);
        badgeView.setId(R$id.freshBadge);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        badgeView.setLayoutParams(layoutParams);
        return badgeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout createBadgeViewContainer() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        int i11 = R$id.ratingText;
        bVar.f41640k = i11;
        bVar.f41656t = i11;
        frameLayout.setLayoutParams(bVar);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommentFooterView createCommentFooterContainer() {
        CommentFooterView commentFooterView = new CommentFooterView(getContext());
        commentFooterView.setId(R$id.reviewGalleryCommentFooterContainer);
        commentFooterView.setLayoutParams(new ConstraintLayout.b(0, -2));
        commentFooterView.setOnClickListener(new Jm0.a(this, 7));
        return commentFooterView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCommentFooterContainer$lambda$33$lambda$32(SubviewsDelegate subviewsDelegate, View view) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter;
        AtomActionDTO clickAction;
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        ReviewGalleryVO reviewGalleryVO = subviewsDelegate.currentItem;
        if (reviewGalleryVO != null) {
            ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooter = reviewGalleryVO.getCommentButtonFooter();
            if (commentButtonFooter == null || (commentFooter = commentButtonFooter.getFooter()) == null) {
                commentFooter = reviewGalleryVO.getCommentFooter();
            }
            if (commentFooter == null || (clickAction = commentFooter.getClickAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(clickAction, commentFooter.getTrackingInfo())) == null || (function1 = subviewsDelegate.actionHandler) == null) {
                return;
            }
            function1.invoke(atomAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createCommentFooterText() {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), getContext());
        if (textAtomV2View == null) {
            textAtomV2View = new TextAtomV2View(getContext(), null, 0, 6, null);
        }
        textAtomV2View.setId(R$id.reviewGalleryCommentFooter);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setOnClickListener(new FX.a(this, 8));
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCommentFooterText$lambda$29$lambda$28(SubviewsDelegate subviewsDelegate, View view) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter;
        AtomActionDTO clickAction;
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        ReviewGalleryVO reviewGalleryVO = subviewsDelegate.currentItem;
        if (reviewGalleryVO == null || (commentFooter = reviewGalleryVO.getCommentFooter()) == null || (clickAction = commentFooter.getClickAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(clickAction, commentFooter.getTrackingInfo())) == null || (function1 = subviewsDelegate.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final ReviewGalleryProductAdapter createProductsAdapter(ReviewGalleryVO newItem, c trackingData, boolean isInBottomItems) {
        ReviewGalleryProductAdapter reviewGalleryProductAdapter = new ReviewGalleryProductAdapter(this.actionHandler, this.tokenizedAnalytics, this.favProductMoleculeDelegateFactory, trackingData, this.cartButtonContainerBinder, newItem.getId(), isInBottomItems, this.isFreshMiniApp);
        RecyclerView productRecyclerView = this.reviewGalleryView.getProductRecyclerView();
        productRecyclerView.setAdapter(reviewGalleryProductAdapter);
        productRecyclerView.addItemDecoration(new ReviewGalleryProductItemDecoration());
        this.productsViewTracker = new ReviewGalleryProductsViewTracker(productRecyclerView, this.tokenizedAnalytics);
        return reviewGalleryProductAdapter;
    }

    private final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue();
    }

    private final int getBottomMediaItemsMargin(ReviewGalleryVO item) {
        if (!item.getIsVideo()) {
            return Dimens.INSTANCE.getDP_16();
        }
        if (item.getIsCompactControls()) {
            return Dimens.INSTANCE.getDP_16() + compactControlsOffset(item);
        }
        Dimens dimens = Dimens.INSTANCE;
        return dimens.getDP_4() + dimens.getDP_40() + dimens.getDP_16();
    }

    private final Context getContext() {
        Context context = this.reviewGalleryView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    private final boolean isSingleProductInfo(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainerDTO) {
        Object M11 = C7714v.M(productItemsContainerDTO.getProductItems());
        return (M11 instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo ? (ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo) M11 : null) != null && productItemsContainerDTO.getProductItems().size() == 1;
    }

    private final View mapItemToView(Object item) {
        if (item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser) {
            return this.headerDelegate.getSocialHeaderView();
        }
        if (item instanceof ReviewProductTileDTO) {
            return this.productBinding.productContainerCl;
        }
        if (item instanceof BadgeDTO) {
            return this.badgeViewContainerDelegate.getValue();
        }
        if (item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO) {
            return this.reviewGalleryView.getRatingText();
        }
        if (item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO) {
            return ((ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO) item).getIcon() != null ? this.commentFooterContainerDelegate.getValue() : this.commentFooterTextDelegate.getValue();
        }
        if (item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO) {
            return this.commentFooterContainerDelegate.getValue();
        }
        if (item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO) {
            return isSingleProductInfo((ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO) item) ? this.reviewGalleryView.getProductInfoView() : this.reviewGalleryView.getProductRecyclerView();
        }
        if (item instanceof ReviewGalleryV2DTO.SideButtonsDTO) {
            return this.reviewGalleryView.getSideButtonsHeader();
        }
        return null;
    }

    private final void setupCommentFooterContainer(ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO footer, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooter) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonDTO button;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonDTO button2;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonDTO button3;
        CommentFooterView value = this.commentFooterContainerDelegate.getValue();
        ViewExtKt.show(value);
        value.setBackgroundToken(footer.getBackgroundColor());
        value.setCornerRadius(footer.getCornerRadius());
        value.bindTitle(footer.getTitle());
        value.bindIcon(footer.getIcon());
        Paddings paddings = null;
        ButtonV3DTO button4 = (commentButtonFooter == null || (button3 = commentButtonFooter.getButton()) == null) ? null : button3.getButton();
        Paddings leftPadding = (commentButtonFooter == null || (button2 = commentButtonFooter.getButton()) == null) ? null : button2.getLeftPadding();
        if (commentButtonFooter != null && (button = commentButtonFooter.getButton()) != null) {
            paddings = button.getRightPadding();
        }
        value.bindButton(button4, leftPadding, paddings, new SubviewsDelegate$setupCommentFooterContainer$1$1(this));
    }

    private final void setupCommentFooterText(ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO footer) {
        TextAtomV2View value = this.commentFooterTextDelegate.getValue();
        ViewExtKt.show(value);
        applyCommentTextBackground(value, footer);
        TextHolderKt.bindOrGone$default(value, footer.getTitle(), null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, r8 != null ? r8.getBottomPadding() : null) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setupItemsToContainer(List<? extends Object> list, ReviewGalleryVO reviewGalleryVO, ContainerType containerType) {
        List<Integer> list2;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel;
        ReviewGalleryVO reviewGalleryVO2;
        ReviewGalleryVO reviewGalleryVO3;
        int i11 = WhenMappings.$EnumSwitchMapping$0[containerType.ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            list2 = this.topMediaItemsIds;
        } else if (i11 == 2) {
            list2 = this.bottomMediaItemsIds;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            list2 = this.bottomItemsIds;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View mapItemToView = mapItemToView(it.next());
            Integer valueOf = mapItemToView != null ? Integer.valueOf(mapItemToView.getId()) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        boolean d11 = Intrinsics.d(list2, arrayList);
        ContainerType containerType2 = ContainerType.BOTTOM_MEDIA;
        boolean z12 = containerType == containerType2 && ((reviewGalleryVO2 = this.currentItem) == null || reviewGalleryVO2.getIsVideo() != reviewGalleryVO.getIsVideo() || (reviewGalleryVO3 = this.currentItem) == null || reviewGalleryVO3.getIsCompactControls() != reviewGalleryVO.getIsCompactControls());
        if (containerType == containerType2) {
            ReviewGalleryVO reviewGalleryVO4 = this.currentItem;
            Integer bottomPadding = (reviewGalleryVO4 == null || (rightPanel = reviewGalleryVO4.getRightPanel()) == null) ? null : rightPanel.getBottomPadding();
            ReviewGalleryV2DTO.ReviewGalleryV2Item.ReviewsRightPanelDTO rightPanel2 = reviewGalleryVO.getRightPanel();
        }
        z11 = false;
        if (!d11) {
            list2.clear();
            list2.addAll(arrayList);
            updateItems(list, reviewGalleryVO, containerType);
            return;
        }
        if (!z12) {
            if (z11) {
                ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
                d dVar = new d();
                dVar.p(reviewGalleryView);
                applyRightPanelAnchor(dVar, reviewGalleryVO);
                dVar.f(reviewGalleryView);
                return;
            }
            return;
        }
        Integer num = (Integer) C7714v.Z(this.bottomMediaItemsIds);
        if (num != null) {
            int intValue = num.intValue();
            ReviewGalleryView reviewGalleryView2 = this.reviewGalleryView;
            d dVar2 = new d();
            dVar2.p(reviewGalleryView2);
            ConstraintSetExtKt.bottomToBottom(dVar2, intValue, this.reviewGalleryView.getContentContainer().getId(), getBottomMediaItemsMargin(reviewGalleryVO));
            applyRightPanelAnchor(dVar2, reviewGalleryVO);
            dVar2.f(reviewGalleryView2);
        }
    }

    public static /* synthetic */ void setupProductsContainer$default(SubviewsDelegate subviewsDelegate, ReviewGalleryVO reviewGalleryVO, c cVar, ru.ozon.composer.ui.widget.l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        subviewsDelegate.setupProductsContainer(reviewGalleryVO, cVar, lVar, z11);
    }

    private final void updateItems(List<? extends Object> list, ReviewGalleryVO reviewGalleryVO, ContainerType containerType) {
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        d dVar = new d();
        dVar.p(reviewGalleryView);
        int i11 = WhenMappings.$EnumSwitchMapping$0[containerType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new o();
                }
                View contentContainer = this.reviewGalleryView.getContentContainer();
                loop0: while (true) {
                    int i12 = 0;
                    for (Object obj : list) {
                        if (obj instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO) {
                            i12 += ((ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO) obj).m1504unboximpl();
                        } else {
                            View mapItemToView = mapItemToView(obj);
                            if (mapItemToView != null) {
                                ConstraintSetExtKt.clearTop(dVar, mapItemToView.getId());
                                int id2 = mapItemToView.getId();
                                Dimens dimens = Dimens.INSTANCE;
                                ConstraintSetExtKt.bottomToBottom(dVar, id2, 0, dimens.getDP_10());
                                if (Intrinsics.d(contentContainer, this.reviewGalleryView.getContentContainer())) {
                                    dVar.g0(mapItemToView.getId(), 2);
                                    ConstraintSetExtKt.bottomToTop(dVar, contentContainer.getId(), mapItemToView.getId(), -compactControlsOffset(reviewGalleryVO));
                                    ConstraintSetExtKt.topToBottom(dVar, mapItemToView.getId(), contentContainer.getId(), ResourceExtKt.toPx(i12));
                                } else {
                                    ConstraintSetExtKt.bottomToTop(dVar, contentContainer.getId(), mapItemToView.getId(), ResourceExtKt.toPx(i12));
                                    ConstraintSetExtKt.topToBottom(dVar, mapItemToView.getId(), contentContainer.getId(), ResourceExtKt.toPx(i12));
                                }
                                if (mapItemToView.getId() != R$id.reviewGalleryProductsRecyclerView) {
                                    ConstraintSetExtKt.startToStart(dVar, mapItemToView.getId(), 0, dimens.getDP_16());
                                    ConstraintSetExtKt.endToEnd(dVar, mapItemToView.getId(), 0, dimens.getDP_16());
                                }
                                contentContainer = mapItemToView;
                            }
                        }
                    }
                    break loop0;
                }
            } else {
                View contentContainer2 = this.reviewGalleryView.getContentContainer();
                loop2: while (true) {
                    int i13 = 0;
                    for (Object obj2 : C7714v.z0(list)) {
                        if (obj2 instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO) {
                            i13 += ((ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO) obj2).m1504unboximpl();
                        } else {
                            View mapItemToView2 = mapItemToView(obj2);
                            if (mapItemToView2 != null) {
                                ConstraintSetExtKt.clearTop(dVar, mapItemToView2.getId());
                                if (mapItemToView2.getId() != R$id.reviewGalleryProductsRecyclerView) {
                                    int id3 = mapItemToView2.getId();
                                    Dimens dimens2 = Dimens.INSTANCE;
                                    ConstraintSetExtKt.startToStart(dVar, id3, 0, dimens2.getDP_16());
                                    ConstraintSetExtKt.endToEnd(dVar, mapItemToView2.getId(), 0, dimens2.getDP_16());
                                }
                                if (Intrinsics.d(contentContainer2, this.reviewGalleryView.getContentContainer())) {
                                    ConstraintSetExtKt.bottomToBottom(dVar, mapItemToView2.getId(), contentContainer2.getId(), ResourceExtKt.toPx(i13) + getBottomMediaItemsMargin(reviewGalleryVO));
                                } else {
                                    ConstraintSetExtKt.bottomToTop(dVar, mapItemToView2.getId(), contentContainer2.getId(), ResourceExtKt.toPx(i13));
                                }
                                contentContainer2 = mapItemToView2;
                            }
                        }
                    }
                    break loop2;
                }
                applyRightPanelAnchor(dVar, reviewGalleryVO);
            }
        } else {
            View contentContainer3 = this.reviewGalleryView.getContentContainer();
            int i14 = 0;
            for (Object obj3 : list) {
                if (obj3 instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO) {
                    i14 += ((ReviewGalleryV2DTO.ReviewGalleryV2Item.SpacerDTO) obj3).m1504unboximpl();
                } else {
                    View mapItemToView3 = mapItemToView(obj3);
                    if (mapItemToView3 != null) {
                        ConstraintSetExtKt.clearBottom(dVar, mapItemToView3.getId());
                        if (reviewGalleryVO.getCloseButton() != null) {
                            int id4 = mapItemToView3.getId();
                            Dimens dimens3 = Dimens.INSTANCE;
                            ConstraintSetExtKt.startToStart(dVar, id4, 0, dimens3.getDP_16());
                            ConstraintSetExtKt.endToStart(dVar, mapItemToView3.getId(), this.reviewGalleryView.getCloseButton().getId(), dimens3.getDP_20());
                        } else {
                            ConstraintSetExtKt.startToStart$default(dVar, mapItemToView3.getId(), 0, 0, 4, null);
                            ConstraintSetExtKt.endToEnd$default(dVar, mapItemToView3.getId(), 0, 0, 4, null);
                        }
                        if (Intrinsics.d(contentContainer3, this.reviewGalleryView.getContentContainer())) {
                            ConstraintSetExtKt.topToTop(dVar, mapItemToView3.getId(), contentContainer3.getId(), ResourceExtKt.toPx(i14));
                        } else {
                            ConstraintSetExtKt.topToBottom(dVar, mapItemToView3.getId(), contentContainer3.getId(), ResourceExtKt.toPx(i14));
                        }
                        i14 = 0;
                        contentContainer3 = mapItemToView3;
                    }
                }
            }
        }
        dVar.f(reviewGalleryView);
    }

    public final Parcelable getProductsRecyclerScrollState() {
        M m11 = new M();
        this.reviewGalleryView.ifProductsRecyclerViewInitialized(new SubviewsDelegate$getProductsRecyclerScrollState$1(m11));
        return (Parcelable) m11.f71787a;
    }

    public final void onParentVisibilityChanged(boolean isVisible) {
        ReviewGalleryProductsViewTracker reviewGalleryProductsViewTracker = this.productsViewTracker;
        if (reviewGalleryProductsViewTracker != null) {
            reviewGalleryProductsViewTracker.onVisibilityChanged(isVisible);
        }
    }

    public final void onRecycle() {
        this.cartButtonBinder.unbind();
        this.cartButtonContainerBinder.unbind();
        this.reviewGalleryView.getRatingText().unbind();
        this.actionHandler = null;
        ReviewGalleryProductsViewTracker reviewGalleryProductsViewTracker = this.productsViewTracker;
        if (reviewGalleryProductsViewTracker != null) {
            reviewGalleryProductsViewTracker.reset();
        }
    }

    public final void setupActionHandler(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    public final void setupBadge(BadgeDTO badge) {
        if (badge != null || this.badgeViewContainerDelegate.isInitialized()) {
            ReviewGalleryVO reviewGalleryVO = this.currentItem;
            if (Intrinsics.d(badge, reviewGalleryVO != null ? reviewGalleryVO.getBadge() : null)) {
                return;
            }
            BadgeHolderKt.bindOrGone(getBadgeView(), badge, this.actionHandler);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setupCommentFooter(ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO commentFooter, ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentButtonFooterDTO commentButtonFooter) {
        boolean z11;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.CommentFooterDTO footer;
        if (commentButtonFooter != null && (footer = commentButtonFooter.getFooter()) != null) {
            commentFooter = footer;
        }
        if (commentButtonFooter == null) {
            if ((commentFooter != null ? commentFooter.getIcon() : null) == null) {
                z11 = false;
                if (commentFooter != null) {
                    if (this.commentFooterTextDelegate.isInitialized()) {
                        ViewExtKt.gone(this.commentFooterTextDelegate.getValue());
                    }
                    if (this.commentFooterContainerDelegate.isInitialized()) {
                        ViewExtKt.gone(this.commentFooterContainerDelegate.getValue());
                        return;
                    }
                    return;
                }
                if (z11) {
                    if (this.commentFooterTextDelegate.isInitialized()) {
                        ViewExtKt.gone(this.commentFooterTextDelegate.getValue());
                    }
                    setupCommentFooterContainer(commentFooter, commentButtonFooter);
                    return;
                } else {
                    if (this.commentFooterContainerDelegate.isInitialized()) {
                        ViewExtKt.gone(this.commentFooterContainerDelegate.getValue());
                    }
                    setupCommentFooterText(commentFooter);
                    return;
                }
            }
        }
        z11 = true;
        if (commentFooter != null) {
        }
    }

    public final void setupProduct(@NotNull ReviewGalleryVO newItem) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ViewGalleryReviewProductV2Binding viewGalleryReviewProductV2Binding = this.productBinding;
        ReviewProductTileDTO product = newItem.getProduct();
        ReviewGalleryVO reviewGalleryVO = this.currentItem;
        if (Intrinsics.d(product, reviewGalleryVO != null ? reviewGalleryVO.getProduct() : null)) {
            return;
        }
        ConstraintLayout productContainerCl = viewGalleryReviewProductV2Binding.productContainerCl;
        Intrinsics.checkNotNullExpressionValue(productContainerCl, "productContainerCl");
        ViewExtKt.showOrGone(productContainerCl, Boolean.valueOf(product != null));
        if (product == null) {
            return;
        }
        ShapeableImageView productIv = viewGalleryReviewProductV2Binding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.load$default(productIv, product.getImage(), null, null, null, null, false, null, 126, null);
        PriceView priceAtomView = viewGalleryReviewProductV2Binding.priceAtomView;
        Intrinsics.checkNotNullExpressionValue(priceAtomView, "priceAtomView");
        PriceHolderKt.bind$default(priceAtomView, product.getPrice(), null, 2, null);
        TextAtomV2View productDescriptionTAV = viewGalleryReviewProductV2Binding.productDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(productDescriptionTAV, "productDescriptionTAV");
        TextHolderKt.bind$default(productDescriptionTAV, TextMapperKt.getDsTextAtom(product.getText()), null, 2, null);
        ReviewGalleryV2ProductButtonBinder reviewGalleryV2ProductButtonBinder = this.cartButtonBinder;
        AppCompatImageButton addToCartBtn = viewGalleryReviewProductV2Binding.addToCartBtn;
        Intrinsics.checkNotNullExpressionValue(addToCartBtn, "addToCartBtn");
        reviewGalleryV2ProductButtonBinder.bindOrGone(addToCartBtn, product.getAddToCartButton(), this.tokenizedAnalytics, Long.valueOf(newItem.getId()));
        ConstraintLayout productContainerCl2 = viewGalleryReviewProductV2Binding.productContainerCl;
        Intrinsics.checkNotNullExpressionValue(productContainerCl2, "productContainerCl");
        ViewGroup.LayoutParams layoutParams = productContainerCl2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.bottomMargin = getBottomMediaItemsMargin(newItem);
        if (i11 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = productContainerCl2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = productContainerCl2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = productContainerCl2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        productContainerCl2.setLayoutParams(marginLayoutParams);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setupProductsContainer(@NotNull ReviewGalleryVO newItem, @NotNull c trackingData, ru.ozon.composer.ui.widget.l widgetViewItem, boolean resetScroll) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        List<Object> items;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainer;
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        ReviewGalleryView reviewGalleryView = this.reviewGalleryView;
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO productItemsContainer2 = newItem.getProductItemsContainer();
        List<ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO> productItems = productItemsContainer2 != null ? productItemsContainer2.getProductItems() : null;
        boolean z11 = true;
        boolean z12 = productItemsContainer2 != null && isSingleProductInfo(productItemsContainer2);
        List<ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO> list = productItems;
        if (list == null || list.isEmpty()) {
            reviewGalleryView.ifProductsRecyclerViewInitialized(SubviewsDelegate$setupProductsContainer$1$1.INSTANCE);
            reviewGalleryView.ifProductInfoViewInitialized(SubviewsDelegate$setupProductsContainer$1$2.INSTANCE);
            return;
        }
        if (resetScroll && !z12) {
            reviewGalleryView.ifProductsRecyclerViewInitialized(SubviewsDelegate$setupProductsContainer$1$3.INSTANCE);
        }
        ReviewGalleryVO reviewGalleryVO = this.currentItem;
        if (Intrinsics.d(productItems, (reviewGalleryVO == null || (productItemsContainer = reviewGalleryVO.getProductItemsContainer()) == null) ? null : productItemsContainer.getProductItems())) {
            return;
        }
        if (z12) {
            reviewGalleryView.ifProductsRecyclerViewInitialized(SubviewsDelegate$setupProductsContainer$1$4.INSTANCE);
            ViewExtKt.show(reviewGalleryView.getProductInfoView());
            Object K11 = C7714v.K(productItems);
            Intrinsics.g(K11, "null cannot be cast to non-null type ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo");
            reviewGalleryView.getProductInfoView().bind((ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo) K11, this.actionHandler, this.favProductMoleculeDelegateFactory, widgetViewItem, trackingData, this.tokenizedAnalytics, Long.valueOf(newItem.getId()), this.cartButtonContainerBinder);
            ProductInfoView productInfoView = reviewGalleryView.getProductInfoView();
            ViewGroup.LayoutParams layoutParams = productInfoView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 == null) {
                return;
            }
            int i11 = marginLayoutParams2.leftMargin;
            int i12 = marginLayoutParams2.topMargin;
            int i13 = marginLayoutParams2.rightMargin;
            int i14 = marginLayoutParams2.bottomMargin;
            marginLayoutParams2.bottomMargin = getBottomMediaItemsMargin(newItem);
            if (i11 == marginLayoutParams2.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = productInfoView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = productInfoView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = productInfoView.getLayoutParams();
                        marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        if (i14 == (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                            return;
                        }
                    }
                }
            }
            productInfoView.setLayoutParams(marginLayoutParams2);
            return;
        }
        reviewGalleryView.ifProductInfoViewInitialized(SubviewsDelegate$setupProductsContainer$1$6.INSTANCE);
        ViewExtKt.show(reviewGalleryView.getProductRecyclerView());
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomItems = newItem.getBottomItems();
        if (bottomItems != null && (items = bottomItems.getItems()) != null) {
            List<Object> list2 = items;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemsContainerDTO) {
                        break;
                    }
                }
            }
        }
        z11 = false;
        RecyclerView.g adapter = reviewGalleryView.getProductRecyclerView().getAdapter();
        ReviewGalleryProductAdapter reviewGalleryProductAdapter = adapter instanceof ReviewGalleryProductAdapter ? (ReviewGalleryProductAdapter) adapter : null;
        if (reviewGalleryProductAdapter == null) {
            reviewGalleryProductAdapter = createProductsAdapter(newItem, trackingData, z11);
        }
        reviewGalleryProductAdapter.submitList(productItems, widgetViewItem);
        ReviewGalleryProductsViewTracker reviewGalleryProductsViewTracker = this.productsViewTracker;
        if (reviewGalleryProductsViewTracker != null) {
            reviewGalleryProductsViewTracker.onItemsChanged(productItems, newItem.getId());
        }
        RecyclerView productRecyclerView = reviewGalleryView.getProductRecyclerView();
        ViewGroup.LayoutParams layoutParams5 = productRecyclerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams5 == null) {
            return;
        }
        int i15 = marginLayoutParams5.leftMargin;
        int i16 = marginLayoutParams5.topMargin;
        int i17 = marginLayoutParams5.rightMargin;
        int i18 = marginLayoutParams5.bottomMargin;
        marginLayoutParams5.bottomMargin = getBottomMediaItemsMargin(newItem);
        if (i15 == marginLayoutParams5.leftMargin) {
            ViewGroup.LayoutParams layoutParams6 = productRecyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            if (i16 == (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams7 = productRecyclerView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                if (i17 == (marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams8 = productRecyclerView.getLayoutParams();
                    marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    if (i18 == (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        productRecyclerView.setLayoutParams(marginLayoutParams5);
    }

    public final void setupReviewRating(@NotNull ReviewGalleryVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        RatingTextView ratingText = this.reviewGalleryView.getRatingText();
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO rating = item.getRating();
        if (rating != null) {
            ratingText.bind(rating);
        }
        if (item.getWithContainers()) {
            ratingText.setIncludeFontPadding(false);
        }
    }

    public final void setupSocialHeader(@NotNull ReviewGalleryVO newItem, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        this.headerDelegate.setupSocialHeader$core_prodGoogleAllVendorsRelease(newItem.getUser(), newItem.getSocialUser(), actionHandler);
    }

    public final void setupSubviews(@NotNull ReviewGalleryVO newItem, @NotNull c trackingData, ru.ozon.composer.ui.widget.l widgetViewItem) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        setupProduct(newItem);
        setupProductsContainer$default(this, newItem, trackingData, widgetViewItem, false, 8, null);
        setupReviewRating(newItem);
        setupBadge(newItem.getBadge());
        setupCommentFooter(newItem.getCommentFooter(), newItem.getCommentButtonFooter());
        setupSocialHeader(newItem, this.actionHandler);
        setupSubviewsContainers(newItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        if (r6 != (r1 != null ? r1.bottomMargin : 0)) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setupSubviewsContainers(@NotNull ReviewGalleryVO newItem) {
        List<Object> items;
        List<Object> items2;
        List<Object> items3;
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO topMediaItems = newItem.getTopMediaItems();
        if (topMediaItems != null && (items3 = topMediaItems.getItems()) != null) {
            setupItemsToContainer(items3, newItem, ContainerType.TOP_MEDIA);
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomMediaItems = newItem.getBottomMediaItems();
        if (bottomMediaItems != null && (items2 = bottomMediaItems.getItems()) != null) {
            setupItemsToContainer(items2, newItem, ContainerType.BOTTOM_MEDIA);
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomItems = newItem.getBottomItems();
        if (bottomItems != null && (items = bottomItems.getItems()) != null) {
            setupItemsToContainer(items, newItem, ContainerType.BOTTOM);
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO bottomItems2 = newItem.getBottomItems();
        if (CollectionsExtKt.isNotNullOrEmpty(bottomItems2 != null ? bottomItems2.getItems() : null)) {
            FrameLayout contentContainer = this.reviewGalleryView.getContentContainer();
            ViewGroup.LayoutParams layoutParams = contentContainer.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.leftMargin;
                int i12 = marginLayoutParams.topMargin;
                int i13 = marginLayoutParams.rightMargin;
                int i14 = marginLayoutParams.bottomMargin;
                marginLayoutParams.bottomMargin = -compactControlsOffset(newItem);
                if (i11 == marginLayoutParams.leftMargin) {
                    ViewGroup.LayoutParams layoutParams2 = contentContainer.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = contentContainer.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = contentContainer.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        }
                    }
                }
                contentContainer.setLayoutParams(marginLayoutParams);
            }
        }
        this.currentItem = newItem;
    }

    public final void updateProductsRecyclerViewScroll(@NotNull Parcelable scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.reviewGalleryView.ifProductsRecyclerViewInitialized(new SubviewsDelegate$updateProductsRecyclerViewScroll$1(scrollState));
    }

    public final void updateSocialHeader(@NotNull ReviewGalleryV2DTO.ReviewGalleryV2Item.SocialUser socialUser) {
        Intrinsics.checkNotNullParameter(socialUser, "socialUser");
        ReviewGalleryHeaderDelegate.setupSocialHeader$core_prodGoogleAllVendorsRelease$default(this.headerDelegate, null, socialUser, this.actionHandler, 1, null);
    }
}
