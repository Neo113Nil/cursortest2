package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view;

import Am.C2438a;
import Sc.InterfaceC4008j;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.d;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.x;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.flashsale.StockBarHolderKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.platform.rv.looped.LoopedRecyclerView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.adapter.HotelsSearchResultsV5CardBadgesDecorator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.adapter.images.HotelsSearchResultsV5ItemImagesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView$layerDrawable$2;
import ru.ozon.app.android.travel.molecules.utils.RoundedFrameLayout;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeVI;
import ru.ozon.app.android.travel.molecules.view.awardBadge.AwardBadgeView;
import ru.ozon.app.android.travel.molecules.view.indicator.DottedIndicatorView;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000É\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001u\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020$¢\u0006\u0004\b)\u0010'J\u0017\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010$¢\u0006\u0004\b+\u0010'J\u0017\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u0001002\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b4\u0010'J!\u00108\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u0001052\b\u00107\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b8\u00109J#\u0010<\u001a\u00020\t2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002000\u001f2\u0006\u0010;\u001a\u00020\u0017¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010CJ\u000f\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bH\u0010CR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010KR\u0014\u0010P\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR\u0014\u0010Q\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010KR\u0014\u0010R\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010KR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010KR\u0014\u0010W\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010KR\u0014\u0010X\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010KR\u0014\u0010Y\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010KR\u0014\u0010Z\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010KR\u0014\u0010[\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010KR\u0014\u0010\\\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010KR\u0014\u0010]\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010KR\u0014\u0010^\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010KR\u0014\u0010_\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010KR\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010KR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010l\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010l\u001a\u0004\bw\u0010xR\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001d\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001d\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001e\u0010\u009b\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010|\u001a\u0005\b\u009a\u0001\u0010~R \u0010 \u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010|\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010£\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010|\u001a\u0005\b¢\u0001\u0010~R\u001e\u0010¦\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¤\u0001\u0010|\u001a\u0005\b¥\u0001\u0010~R \u0010«\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¨\u0001\u0010|\u001a\u0006\b©\u0001\u0010ª\u0001R \u0010°\u0001\u001a\u00030¬\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010|\u001a\u0006\b®\u0001\u0010¯\u0001R \u0010³\u0001\u001a\u00030¬\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b±\u0001\u0010|\u001a\u0006\b²\u0001\u0010¯\u0001R\u001e\u0010¶\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b´\u0001\u0010|\u001a\u0005\bµ\u0001\u0010~R\u001d\u0010¸\u0001\u001a\u00030·\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u001e\u0010¾\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¼\u0001\u0010|\u001a\u0005\b½\u0001\u0010~R\u0018\u0010À\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R \u0010Ä\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bÂ\u0001\u0010|\u001a\u0006\bÃ\u0001\u0010\u009f\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001e\u0010Ê\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bÈ\u0001\u0010|\u001a\u0005\bÉ\u0001\u0010~R\u0018\u0010Ì\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Í\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ò\u0001¨\u0006Ô\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function0;", "", "imageItemClickListener", "initAdapter", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onViewEvent", "showNewState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "isActivated", "setIsFavoriteFeatureActivated", "(Z)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "bindFavoriteProductButton", "setFavoriteButton", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;Lkotlin/jvm/functions/Function1;)V", "", "", "images", "bindImages", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "bindAddress", "reviews", "bindReviews", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "reviewsIcon", "bindReviewsIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rating", "bindRatingBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "bindPromoTitle", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradient", "backgroundColor", "bindBackground", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;Ljava/lang/String;)V", "imageBadges", "isImageBadgesVisible", "bindImageBadges", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "awardBadge", "bindAwardBadge", "(Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;)V", "hidePriceBlock", "()V", "vo", "setupPriceContent", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;)V", "applyConstraints", "addViews", "", "dp1", "I", "", "dp24f", "F", "dp46", "dp68", "dp114", "dp206", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp2", "dp4", "dp6", "dp8", "dp10", "dp12", "dp14", "dp16", "dp32", "dp44", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "cachedCardLayoutVariant", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "imageBadgeAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/adapter/images/HotelsSearchResultsV5ItemImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/adapter/images/HotelsSearchResultsV5ItemImagesAdapter;", "maxWidthView", "Landroid/graphics/drawable/PaintDrawable;", "paintBackground$delegate", "LSc/j;", "getPaintBackground", "()Landroid/graphics/drawable/PaintDrawable;", "paintBackground", "Landroid/graphics/drawable/GradientDrawable;", "gradientBackground$delegate", "getGradientBackground", "()Landroid/graphics/drawable/GradientDrawable;", "gradientBackground", "ru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView$layerDrawable$2$1", "layerDrawable$delegate", "getLayerDrawable", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/view/HotelsSearchResultsV5CardView$layerDrawable$2$1;", "layerDrawable", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsSearchResultsV5CardPromoTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getHotelsSearchResultsV5CardPromoTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsSearchResultsV5CardPromoTAV", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "hotelsSearchResultsV5CardPhotosRV", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeView;", "hotelsSearchResultsV5AwardBadgeABV", "Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeView;", "Lru/ozon/app/android/travel/molecules/utils/RoundedFrameLayout;", "hotelsSearchResultsV5CardPhotosRFL", "Lru/ozon/app/android/travel/molecules/utils/RoundedFrameLayout;", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "hotelsSearchResultsV5CardIndicatorDIV", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "hotelsSearchResultsV5CardImageBadgesVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "favoriteButtonPFMBV", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "getFavoriteButtonPFMBV", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "hotelsSearchResultsV5FavoriteButtonWrapper", "Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "getHotelsSearchResultsV5FavoriteButtonWrapper", "()Lru/ozon/app/android/travel/utils/viewGroup/TouchEventsThiefFrameLayout;", "hotelsSearchResultsV5CardTitleTAV$delegate", "getHotelsSearchResultsV5CardTitleTAV", "hotelsSearchResultsV5CardTitleTAV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsSearchResultsV5CardRatingBadgeBV$delegate", "getHotelsSearchResultsV5CardRatingBadgeBV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsSearchResultsV5CardRatingBadgeBV", "hotelsSearchResultsV5CardAddressTAV$delegate", "getHotelsSearchResultsV5CardAddressTAV", "hotelsSearchResultsV5CardAddressTAV", "hotelsSearchResultsV5ReviewsTAV$delegate", "getHotelsSearchResultsV5ReviewsTAV", "hotelsSearchResultsV5ReviewsTAV", "Lru/ozon/uni/android/atom/icon/IconView;", "hotelsSearchResultsV5ReviewsIconIV$delegate", "getHotelsSearchResultsV5ReviewsIconIV", "()Lru/ozon/uni/android/atom/icon/IconView;", "hotelsSearchResultsV5ReviewsIconIV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "hotelsSearchResultsV5CardMarketingPricePV$delegate", "getHotelsSearchResultsV5CardMarketingPricePV", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "hotelsSearchResultsV5CardMarketingPricePV", "hotelsSearchResultsV5CardMainPricePV$delegate", "getHotelsSearchResultsV5CardMainPricePV", "hotelsSearchResultsV5CardMainPricePV", "hotelsSearchResultsV5CardPriceDescTAV$delegate", "getHotelsSearchResultsV5CardPriceDescTAV", "hotelsSearchResultsV5CardPriceDescTAV", "Lcom/google/android/flexbox/FlexboxLayout;", "hotelsSearchResultsV5CardPriceContentFl", "Lcom/google/android/flexbox/FlexboxLayout;", "getHotelsSearchResultsV5CardPriceContentFl", "()Lcom/google/android/flexbox/FlexboxLayout;", "hotelsSearchResultsV5RemainingOptionsTAV$delegate", "getHotelsSearchResultsV5RemainingOptionsTAV", "hotelsSearchResultsV5RemainingOptionsTAV", "Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "hotelsSearchResultsV5CardStockBarSBV", "Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "hotelsSearchResultsV5CardPremiumBV$delegate", "getHotelsSearchResultsV5CardPremiumBV", "hotelsSearchResultsV5CardPremiumBV", "Landroid/view/View;", "hotelsSearchResultsV5CardSeparatorView", "Landroid/view/View;", "hotelsSearchResultsV5PriceErrorMessageTAV$delegate", "getHotelsSearchResultsV5PriceErrorMessageTAV", "hotelsSearchResultsV5PriceErrorMessageTAV", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "hotelsSearchResultsV5CardPriceShimmer", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "hotelsSearchResultsV5CardPriceDescShimmer", "hotelsSearchResultsV5CardPremiumBadgeShimmer", "Landroidx/constraintlayout/widget/Group;", "shimmerGroup", "Landroidx/constraintlayout/widget/Group;", "errorMessageGroup", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5CardView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardPromoTAV", "getHotelsSearchResultsV5CardPromoTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardTitleTAV", "getHotelsSearchResultsV5CardTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardRatingBadgeBV", "getHotelsSearchResultsV5CardRatingBadgeBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardAddressTAV", "getHotelsSearchResultsV5CardAddressTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5ReviewsTAV", "getHotelsSearchResultsV5ReviewsTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5ReviewsIconIV", "getHotelsSearchResultsV5ReviewsIconIV()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardMarketingPricePV", "getHotelsSearchResultsV5CardMarketingPricePV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardMainPricePV", "getHotelsSearchResultsV5CardMainPricePV()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardPriceDescTAV", "getHotelsSearchResultsV5CardPriceDescTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5RemainingOptionsTAV", "getHotelsSearchResultsV5RemainingOptionsTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5CardPremiumBV", "getHotelsSearchResultsV5CardPremiumBV()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsSearchResultsV5CardView.class, "hotelsSearchResultsV5PriceErrorMessageTAV", "getHotelsSearchResultsV5PriceErrorMessageTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cachedCardLayoutVariant;
    private final int dp1;
    private final int dp10;
    private final int dp114;
    private final int dp12;
    private final int dp14;
    private final int dp16;
    private final int dp2;
    private final int dp206;
    private final float dp24f;
    private final int dp32;
    private final int dp4;
    private final int dp44;
    private final int dp46;
    private final int dp6;
    private final int dp68;
    private final int dp8;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final Group errorMessageGroup;

    @NotNull
    private final ProductFavoriteMoleculeButtonView favoriteButtonPFMBV;

    /* renamed from: gradientBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientBackground;

    @NotNull
    private final AwardBadgeView hotelsSearchResultsV5AwardBadgeABV;

    /* renamed from: hotelsSearchResultsV5CardAddressTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardAddressTAV;

    @NotNull
    private final VerticalAtomsLayout hotelsSearchResultsV5CardImageBadgesVAL;

    @NotNull
    private final DottedIndicatorView hotelsSearchResultsV5CardIndicatorDIV;

    /* renamed from: hotelsSearchResultsV5CardMainPricePV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardMainPricePV;

    /* renamed from: hotelsSearchResultsV5CardMarketingPricePV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardMarketingPricePV;

    @NotNull
    private final RoundedFrameLayout hotelsSearchResultsV5CardPhotosRFL;

    @NotNull
    private final LoopedRecyclerView hotelsSearchResultsV5CardPhotosRV;

    /* renamed from: hotelsSearchResultsV5CardPremiumBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardPremiumBV;

    @NotNull
    private final RoundedShimmerView hotelsSearchResultsV5CardPremiumBadgeShimmer;

    @NotNull
    private final FlexboxLayout hotelsSearchResultsV5CardPriceContentFl;

    @NotNull
    private final RoundedShimmerView hotelsSearchResultsV5CardPriceDescShimmer;

    /* renamed from: hotelsSearchResultsV5CardPriceDescTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardPriceDescTAV;

    @NotNull
    private final RoundedShimmerView hotelsSearchResultsV5CardPriceShimmer;

    /* renamed from: hotelsSearchResultsV5CardPromoTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardPromoTAV;

    /* renamed from: hotelsSearchResultsV5CardRatingBadgeBV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardRatingBadgeBV;

    @NotNull
    private final View hotelsSearchResultsV5CardSeparatorView;

    @NotNull
    private final StockBarView hotelsSearchResultsV5CardStockBarSBV;

    /* renamed from: hotelsSearchResultsV5CardTitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5CardTitleTAV;

    @NotNull
    private final TouchEventsThiefFrameLayout hotelsSearchResultsV5FavoriteButtonWrapper;

    /* renamed from: hotelsSearchResultsV5PriceErrorMessageTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5PriceErrorMessageTAV;

    /* renamed from: hotelsSearchResultsV5RemainingOptionsTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5RemainingOptionsTAV;

    /* renamed from: hotelsSearchResultsV5ReviewsIconIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5ReviewsIconIV;

    /* renamed from: hotelsSearchResultsV5ReviewsTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsSearchResultsV5ReviewsTAV;

    @NotNull
    private final AtomsAdapter imageBadgeAtomsAdapter;
    private HotelsSearchResultsV5ItemImagesAdapter imagesAdapter;

    /* renamed from: layerDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layerDrawable;
    private final int maxWidthView;

    /* renamed from: paintBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paintBackground;

    @NotNull
    private final Group shimmerGroup;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant.values().length];
            try {
                iArr[HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant.f94114V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant.f94115V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant.f94116V3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsSearchResultsV5CardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dp24f = pxF;
        int px2 = ResourceExtKt.toPx(46, context);
        this.dp46 = px2;
        int px3 = ResourceExtKt.toPx(68, context);
        this.dp68 = px3;
        int px4 = ResourceExtKt.toPx(114, context);
        this.dp114 = px4;
        int px5 = ResourceExtKt.toPx(206, context);
        this.dp206 = px5;
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        int margin2 = dimens$default.getMargin2();
        this.dp2 = margin2;
        this.dp4 = dimens$default.getMargin4();
        this.dp6 = dimens$default.getMargin6();
        int margin8 = dimens$default.getMargin8();
        this.dp8 = margin8;
        this.dp10 = dimens$default.getMargin10();
        int margin12 = dimens$default.getMargin12();
        this.dp12 = margin12;
        int margin14 = dimens$default.getMargin14();
        this.dp14 = margin14;
        this.dp16 = dimens$default.getMargin16();
        int margin32 = dimens$default.getMargin32();
        this.dp32 = margin32;
        int margin44 = dimens$default.getMargin44();
        this.dp44 = margin44;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.imageBadgeAtomsAdapter = atomsAdapter;
        this.maxWidthView = context.getResources().getDisplayMetrics().widthPixels - margin32;
        this.paintBackground = LazyUtilsKt.unsafeLazy(new HotelsSearchResultsV5CardView$paintBackground$2(context, this));
        this.gradientBackground = LazyUtilsKt.unsafeLazy(new HotelsSearchResultsV5CardView$gradientBackground$2(this));
        this.layerDrawable = LazyUtilsKt.unsafeLazy(new HotelsSearchResultsV5CardView$layerDrawable$2(this));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.hotelsSearchResultsV5CardPromoTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$1(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$2());
        LoopedRecyclerView loopedRecyclerView = new LoopedRecyclerView(context, null, 0, 6, null);
        loopedRecyclerView.setId(View.generateViewId());
        loopedRecyclerView.setNestedScrollingEnabled(false);
        loopedRecyclerView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        loopedRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        loopedRecyclerView.setHasFixedSize(true);
        new x().attachToRecyclerView(loopedRecyclerView);
        loopedRecyclerView.initListeners();
        this.hotelsSearchResultsV5CardPhotosRV = loopedRecyclerView;
        AwardBadgeView awardBadgeView = new AwardBadgeView(context, null, 0, 6, null);
        awardBadgeView.setId(View.generateViewId());
        awardBadgeView.setVisibility(8);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.setMarginStart(margin14);
        awardBadgeView.setLayoutParams(bVar);
        this.hotelsSearchResultsV5AwardBadgeABV = awardBadgeView;
        RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context, null, 0, 6, null);
        roundedFrameLayout.setId(View.generateViewId());
        roundedFrameLayout.setLayoutParams(new ConstraintLayout.b(0, px5));
        roundedFrameLayout.setCornerRadius(pxF);
        roundedFrameLayout.addView(loopedRecyclerView);
        roundedFrameLayout.addView(awardBadgeView);
        this.hotelsSearchResultsV5CardPhotosRFL = roundedFrameLayout;
        DottedIndicatorView dottedIndicatorView = new DottedIndicatorView(context, null, 2, null);
        dottedIndicatorView.setId(View.generateViewId());
        dottedIndicatorView.setDotColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        dottedIndicatorView.setDotRadius(margin2);
        dottedIndicatorView.setHighlightedDotColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        dottedIndicatorView.setHighlightedDotLength(margin8);
        dottedIndicatorView.setSpacing(margin2);
        this.hotelsSearchResultsV5CardIndicatorDIV = dottedIndicatorView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new HotelsSearchResultsV5CardBadgesDecorator(context));
        verticalAtomsLayout.setVisibility(8);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41616W = true;
        bVar2.f41617X = true;
        bVar2.f41599F = 1.0f;
        bVar2.f41598E = 0.0f;
        verticalAtomsLayout.setLayoutParams(bVar2);
        this.hotelsSearchResultsV5CardImageBadgesVAL = verticalAtomsLayout;
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(context, null, 0, 6, null);
        productFavoriteMoleculeButtonView.setId(View.generateViewId());
        productFavoriteMoleculeButtonView.setLayoutParams(new ConstraintLayout.b(margin44, margin44));
        productFavoriteMoleculeButtonView.getFavIcon().setScaleType(ImageView.ScaleType.CENTER);
        this.favoriteButtonPFMBV = productFavoriteMoleculeButtonView;
        TouchEventsThiefFrameLayout touchEventsThiefFrameLayout = new TouchEventsThiefFrameLayout(context, null, 0, 0, 14, null);
        touchEventsThiefFrameLayout.setId(View.generateViewId());
        touchEventsThiefFrameLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        touchEventsThiefFrameLayout.addView(productFavoriteMoleculeButtonView);
        this.hotelsSearchResultsV5FavoriteButtonWrapper = touchEventsThiefFrameLayout;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.hotelsSearchResultsV5CardTitleTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$3(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.hotelsSearchResultsV5CardRatingBadgeBV = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$5(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.hotelsSearchResultsV5CardAddressTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$7(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.hotelsSearchResultsV5ReviewsTAV = new PreCreationViewPoolDelegate(context6, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$9(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$10());
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.hotelsSearchResultsV5ReviewsIconIV = new PreCreationViewPoolDelegate(context7, N.b(IconView.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$11(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$12());
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.hotelsSearchResultsV5CardMarketingPricePV = new PreCreationViewPoolDelegate(context8, N.b(PriceAtomView.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$13(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$14());
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        this.hotelsSearchResultsV5CardMainPricePV = new PreCreationViewPoolDelegate(context9, N.b(PriceAtomView.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$15(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$16());
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        this.hotelsSearchResultsV5CardPriceDescTAV = new PreCreationViewPoolDelegate(context10, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$17(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$18());
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setId(View.generateViewId());
        flexboxLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        flexboxLayout.setVisibility(8);
        flexboxLayout.setFlexDirection(0);
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setAlignItems(1);
        flexboxLayout.setShowDivider(2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicWidth(margin8);
        flexboxLayout.setDividerDrawable(shapeDrawable);
        flexboxLayout.addView(getHotelsSearchResultsV5CardMainPricePV(), new FlexboxLayout.a(-2, -2));
        TextAtomV2View hotelsSearchResultsV5CardPriceDescTAV = getHotelsSearchResultsV5CardPriceDescTAV();
        FlexboxLayout.a aVar = new FlexboxLayout.a(-2, -2);
        aVar.b();
        Unit unit = Unit.f71690a;
        flexboxLayout.addView(hotelsSearchResultsV5CardPriceDescTAV, aVar);
        this.hotelsSearchResultsV5CardPriceContentFl = flexboxLayout;
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        this.hotelsSearchResultsV5RemainingOptionsTAV = new PreCreationViewPoolDelegate(context11, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$19(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$20());
        StockBarView stockBarView = new StockBarView(context, null, 0, 6, null);
        stockBarView.setId(View.generateViewId());
        stockBarView.setVisibility(8);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41598E = 0.0f;
        stockBarView.setLayoutParams(bVar3);
        this.hotelsSearchResultsV5CardStockBarSBV = stockBarView;
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        this.hotelsSearchResultsV5CardPremiumBV = new PreCreationViewPoolDelegate(context12, N.b(BadgeView.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$21(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$22());
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setVisibility(8);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        this.hotelsSearchResultsV5CardSeparatorView = view;
        Context context13 = getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
        this.hotelsSearchResultsV5PriceErrorMessageTAV = new PreCreationViewPoolDelegate(context13, N.b(TextAtomV2View.class), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$23(this), new HotelsSearchResultsV5CardView$special$$inlined$preCreationViewPool$default$24());
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setVisibility(8);
        roundedShimmerView.setCornerRadius(dimens$default.getRadius6());
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px4, dimens$default.getMargin24()));
        this.hotelsSearchResultsV5CardPriceShimmer = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setVisibility(8);
        roundedShimmerView2.setCornerRadius(dimens$default.getRadius6());
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px2, dimens$default.getMargin16()));
        this.hotelsSearchResultsV5CardPriceDescShimmer = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setVisibility(8);
        roundedShimmerView3.setCornerRadius(dimens$default.getRadius6());
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px3, dimens$default.getMargin24()));
        this.hotelsSearchResultsV5CardPremiumBadgeShimmer = roundedShimmerView3;
        Group group = new Group(context);
        group.setId(View.generateViewId());
        group.setReferencedIds(new int[]{roundedShimmerView.getId(), roundedShimmerView2.getId(), roundedShimmerView3.getId()});
        this.shimmerGroup = group;
        Group group2 = new Group(context);
        group2.setId(View.generateViewId());
        group2.setReferencedIds(new int[]{view.getId(), getHotelsSearchResultsV5PriceErrorMessageTAV().getId()});
        this.errorMessageGroup = group2;
        setPadding(0, 0, 0, margin12);
        addViews();
        applyConstraints();
    }

    private final void addViews() {
        addView(getHotelsSearchResultsV5CardPromoTAV());
        addView(this.hotelsSearchResultsV5CardPhotosRFL);
        addView(this.hotelsSearchResultsV5CardIndicatorDIV);
        addView(this.hotelsSearchResultsV5CardImageBadgesVAL);
        addView(this.hotelsSearchResultsV5FavoriteButtonWrapper);
        addView(getHotelsSearchResultsV5CardTitleTAV());
        addView(getHotelsSearchResultsV5CardRatingBadgeBV());
        addView(getHotelsSearchResultsV5CardAddressTAV());
        addView(getHotelsSearchResultsV5ReviewsTAV());
        addView(getHotelsSearchResultsV5ReviewsIconIV());
        addView(getHotelsSearchResultsV5CardMarketingPricePV());
        addView(this.hotelsSearchResultsV5CardPriceContentFl);
        addView(getHotelsSearchResultsV5RemainingOptionsTAV());
        addView(this.hotelsSearchResultsV5CardStockBarSBV);
        addView(getHotelsSearchResultsV5CardPremiumBV());
        addView(this.hotelsSearchResultsV5CardSeparatorView);
        addView(getHotelsSearchResultsV5PriceErrorMessageTAV());
        addView(this.hotelsSearchResultsV5CardPriceShimmer);
        addView(this.hotelsSearchResultsV5CardPriceDescShimmer);
        addView(this.hotelsSearchResultsV5CardPremiumBadgeShimmer);
        addView(this.shimmerGroup);
        addView(this.errorMessageGroup);
    }

    private final void applyConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getHotelsSearchResultsV5CardPromoTAV(), this.dp8);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getHotelsSearchResultsV5CardPromoTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getHotelsSearchResultsV5CardPromoTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.hotelsSearchResultsV5CardPhotosRFL, getHotelsSearchResultsV5CardPromoTAV(), this.dp6);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.hotelsSearchResultsV5CardPhotosRFL, this.dp2);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.hotelsSearchResultsV5CardPhotosRFL, this.dp2);
        dVar.Z(this.hotelsSearchResultsV5CardPhotosRFL.getId(), 3, this.dp2);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.hotelsSearchResultsV5CardIndicatorDIV, this.hotelsSearchResultsV5CardPhotosRFL, this.dp4);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.hotelsSearchResultsV5CardIndicatorDIV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.hotelsSearchResultsV5CardIndicatorDIV);
        ConstraintLayoutExtensionsKt.topToTop(dVar, this.hotelsSearchResultsV5CardImageBadgesVAL, this.hotelsSearchResultsV5CardPhotosRFL, this.dp8);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.hotelsSearchResultsV5CardImageBadgesVAL, this.hotelsSearchResultsV5CardPhotosRFL, this.dp8);
        ConstraintLayoutExtensionsKt.startToStart(dVar, this.hotelsSearchResultsV5CardImageBadgesVAL, this.hotelsSearchResultsV5CardPhotosRFL, this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.hotelsSearchResultsV5CardImageBadgesVAL);
        ConstraintLayoutExtensionsKt.topToTop(dVar, this.hotelsSearchResultsV5FavoriteButtonWrapper, this.hotelsSearchResultsV5CardPhotosRFL, this.dp4);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.hotelsSearchResultsV5FavoriteButtonWrapper, this.dp6);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getHotelsSearchResultsV5CardTitleTAV(), this.hotelsSearchResultsV5CardPhotosRFL, this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getHotelsSearchResultsV5CardTitleTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getHotelsSearchResultsV5CardTitleTAV(), getHotelsSearchResultsV5CardRatingBadgeBV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getHotelsSearchResultsV5CardRatingBadgeBV(), getHotelsSearchResultsV5CardTitleTAV());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getHotelsSearchResultsV5CardRatingBadgeBV(), getHotelsSearchResultsV5CardTitleTAV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getHotelsSearchResultsV5CardRatingBadgeBV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getHotelsSearchResultsV5CardAddressTAV(), getHotelsSearchResultsV5CardTitleTAV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getHotelsSearchResultsV5CardAddressTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getHotelsSearchResultsV5CardAddressTAV(), getHotelsSearchResultsV5ReviewsIconIV(), this.dp16);
        ConstraintLayoutExtensionsKt.baselineToBaseline(dVar, getHotelsSearchResultsV5ReviewsTAV(), getHotelsSearchResultsV5CardAddressTAV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getHotelsSearchResultsV5ReviewsTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getHotelsSearchResultsV5ReviewsIconIV(), getHotelsSearchResultsV5ReviewsTAV());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getHotelsSearchResultsV5ReviewsIconIV(), getHotelsSearchResultsV5ReviewsTAV());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getHotelsSearchResultsV5ReviewsIconIV(), getHotelsSearchResultsV5ReviewsTAV(), this.dp2);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getHotelsSearchResultsV5CardMarketingPricePV(), getHotelsSearchResultsV5CardAddressTAV(), this.dp8);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getHotelsSearchResultsV5CardMarketingPricePV(), this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getHotelsSearchResultsV5CardMarketingPricePV(), getHotelsSearchResultsV5CardPremiumBV());
        dVar.Z(getHotelsSearchResultsV5CardMarketingPricePV().getId(), 3, this.dp8);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.hotelsSearchResultsV5CardPriceContentFl, getHotelsSearchResultsV5CardMarketingPricePV(), this.dp8);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.hotelsSearchResultsV5CardPriceContentFl, this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.hotelsSearchResultsV5CardPriceContentFl, getHotelsSearchResultsV5CardPremiumBV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getHotelsSearchResultsV5RemainingOptionsTAV(), this.hotelsSearchResultsV5CardPriceContentFl, this.dp4);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getHotelsSearchResultsV5RemainingOptionsTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getHotelsSearchResultsV5RemainingOptionsTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.hotelsSearchResultsV5CardStockBarSBV, this.hotelsSearchResultsV5CardPriceContentFl, this.dp2);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.hotelsSearchResultsV5CardStockBarSBV, this.dp16);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.hotelsSearchResultsV5CardStockBarSBV, getHotelsSearchResultsV5CardPremiumBV(), this.dp8);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getHotelsSearchResultsV5CardPremiumBV(), getHotelsSearchResultsV5CardAddressTAV(), this.dp12);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getHotelsSearchResultsV5CardPremiumBV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.hotelsSearchResultsV5CardSeparatorView, getHotelsSearchResultsV5CardAddressTAV(), this.dp8);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.hotelsSearchResultsV5CardSeparatorView, this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.hotelsSearchResultsV5CardSeparatorView, this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getHotelsSearchResultsV5PriceErrorMessageTAV(), this.hotelsSearchResultsV5CardSeparatorView, this.dp8);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getHotelsSearchResultsV5PriceErrorMessageTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getHotelsSearchResultsV5PriceErrorMessageTAV(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.hotelsSearchResultsV5CardPriceShimmer, getHotelsSearchResultsV5CardAddressTAV(), this.dp10);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.hotelsSearchResultsV5CardPriceShimmer, this.dp16);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.hotelsSearchResultsV5CardPriceDescShimmer, this.hotelsSearchResultsV5CardPriceShimmer, this.dp8);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.hotelsSearchResultsV5CardPriceDescShimmer, this.hotelsSearchResultsV5CardPriceShimmer);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.hotelsSearchResultsV5CardPremiumBadgeShimmer, this.dp16);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.hotelsSearchResultsV5CardPremiumBadgeShimmer, this.hotelsSearchResultsV5CardPriceShimmer);
        dVar.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradientDrawable getGradientBackground() {
        return (GradientDrawable) this.gradientBackground.getValue();
    }

    private final TextAtomV2View getHotelsSearchResultsV5CardAddressTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5CardAddressTAV.getValue(this, $$delegatedProperties[3]);
    }

    private final PriceAtomView getHotelsSearchResultsV5CardMarketingPricePV() {
        return (PriceAtomView) this.hotelsSearchResultsV5CardMarketingPricePV.getValue(this, $$delegatedProperties[6]);
    }

    private final BadgeView getHotelsSearchResultsV5CardPremiumBV() {
        return (BadgeView) this.hotelsSearchResultsV5CardPremiumBV.getValue(this, $$delegatedProperties[10]);
    }

    private final TextAtomV2View getHotelsSearchResultsV5CardPriceDescTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5CardPriceDescTAV.getValue(this, $$delegatedProperties[8]);
    }

    private final TextAtomV2View getHotelsSearchResultsV5CardPromoTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5CardPromoTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final BadgeView getHotelsSearchResultsV5CardRatingBadgeBV() {
        return (BadgeView) this.hotelsSearchResultsV5CardRatingBadgeBV.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getHotelsSearchResultsV5CardTitleTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5CardTitleTAV.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getHotelsSearchResultsV5PriceErrorMessageTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5PriceErrorMessageTAV.getValue(this, $$delegatedProperties[11]);
    }

    private final TextAtomV2View getHotelsSearchResultsV5RemainingOptionsTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5RemainingOptionsTAV.getValue(this, $$delegatedProperties[9]);
    }

    private final IconView getHotelsSearchResultsV5ReviewsIconIV() {
        return (IconView) this.hotelsSearchResultsV5ReviewsIconIV.getValue(this, $$delegatedProperties[5]);
    }

    private final TextAtomV2View getHotelsSearchResultsV5ReviewsTAV() {
        return (TextAtomV2View) this.hotelsSearchResultsV5ReviewsTAV.getValue(this, $$delegatedProperties[4]);
    }

    private final HotelsSearchResultsV5CardView$layerDrawable$2.AnonymousClass1 getLayerDrawable() {
        return (HotelsSearchResultsV5CardView$layerDrawable$2.AnonymousClass1) this.layerDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaintDrawable getPaintBackground() {
        return (PaintDrawable) this.paintBackground.getValue();
    }

    private final void hidePriceBlock() {
        ViewExtKt.gone(getHotelsSearchResultsV5CardMarketingPricePV());
        ViewExtKt.gone(this.hotelsSearchResultsV5CardPriceContentFl);
        ViewExtKt.gone(getHotelsSearchResultsV5CardPremiumBV());
        ViewExtKt.gone(this.hotelsSearchResultsV5CardStockBarSBV);
        ViewExtKt.gone(getHotelsSearchResultsV5RemainingOptionsTAV());
    }

    private final void setupPriceContent(HotelsSearchResultsV5CardVO vo) {
        FlexboxLayout flexboxLayout = this.hotelsSearchResultsV5CardPriceContentFl;
        if (this.cachedCardLayoutVariant != vo.getLayoutVariant()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[vo.getLayoutVariant().ordinal()];
            if (i11 == 1) {
                flexboxLayout.setFlexDirection(0);
                flexboxLayout.setFlexWrap(0);
                flexboxLayout.setAlignItems(1);
            } else if (i11 == 2) {
                flexboxLayout.setFlexDirection(0);
                flexboxLayout.setFlexWrap(1);
                flexboxLayout.setAlignItems(1);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                flexboxLayout.setFlexDirection(2);
                flexboxLayout.setFlexWrap(1);
                flexboxLayout.setAlignItems(0);
            }
            this.cachedCardLayoutVariant = vo.getLayoutVariant();
        }
        PriceAtomHolderKt.bindOrGone$default(getHotelsSearchResultsV5CardMainPricePV(), vo.getMainPrice(), null, 2, null);
        TextHolderKt.bindOrGone$default(getHotelsSearchResultsV5CardPriceDescTAV(), vo.getPriceDescription(), null, 2, null);
        ViewExtKt.showOrGone(flexboxLayout, Boolean.valueOf(getHotelsSearchResultsV5CardMainPricePV().getVisibility() == 0 || getHotelsSearchResultsV5CardPriceDescTAV().getVisibility() == 0));
    }

    public final void bindAddress(@NotNull TextDTO address) {
        Intrinsics.checkNotNullParameter(address, "address");
        TextHolderKt.bind$default(getHotelsSearchResultsV5CardAddressTAV(), address, null, 2, null);
    }

    public final void bindAwardBadge(AwardBadgeVI awardBadge) {
        this.hotelsSearchResultsV5AwardBadgeABV.bindOrGone(awardBadge);
    }

    public final void bindBackground(Color.Gradient gradient, String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        getPaintBackground().setTint(styleParser.parseColor(context, backgroundColor, R$color.layer_floor_1));
        if (gradient == null) {
            setBackground(getPaintBackground());
            return;
        }
        setBackground(getLayerDrawable());
        GradientDrawable gradientBackground = getGradientBackground();
        gradientBackground.setOrientation(gradient.getOrientation());
        gradientBackground.setColors(gradient.getColors());
        getHotelsSearchResultsV5CardPromoTAV().measure(View.MeasureSpec.makeMeasureSpec(this.maxWidthView, 1073741824), 0);
        int measuredHeight = getHotelsSearchResultsV5CardPromoTAV().getMeasuredHeight() + this.dp16;
        HotelsSearchResultsV5CardView$layerDrawable$2.AnonymousClass1 layerDrawable = getLayerDrawable();
        int i11 = this.dp2;
        layerDrawable.setLayerInset(1, i11, measuredHeight, i11, i11);
        getLayerDrawable().updateBounds();
    }

    public final void bindImageBadges(@NotNull List<BadgeDTO> imageBadges, boolean isImageBadgesVisible) {
        Intrinsics.checkNotNullParameter(imageBadges, "imageBadges");
        AtomsAdapter atomsAdapter = this.imageBadgeAtomsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, imageBadges);
        this.hotelsSearchResultsV5CardImageBadgesVAL.setVisibility(isImageBadgesVisible ? 0 : 8);
    }

    public final void bindImages(@NotNull List<String> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        HotelsSearchResultsV5ItemImagesAdapter hotelsSearchResultsV5ItemImagesAdapter = this.imagesAdapter;
        if (hotelsSearchResultsV5ItemImagesAdapter != null) {
            hotelsSearchResultsV5ItemImagesAdapter.setItems(images);
        }
    }

    public final void bindPromoTitle(TextDTO title) {
        TextHolderKt.bindOrGone$default(getHotelsSearchResultsV5CardPromoTAV(), title, null, 2, null);
    }

    public final void bindRatingBadge(BadgeDTO rating, Function1<? super AtomAction, Unit> actionHandler) {
        BadgeHolderKt.bindOrGone(getHotelsSearchResultsV5CardRatingBadgeBV(), rating, actionHandler);
    }

    public final void bindReviews(TextDTO reviews) {
        TextHolderKt.bindOrGone$default(getHotelsSearchResultsV5ReviewsTAV(), reviews, null, 2, null);
    }

    public final void bindReviewsIcon(IconDTO reviewsIcon) {
        IconHolderKt.bindOrGone$default(getHotelsSearchResultsV5ReviewsIconIV(), reviewsIcon, null, 2, null);
    }

    public final void bindTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(getHotelsSearchResultsV5CardTitleTAV(), title, null, 2, null);
    }

    @NotNull
    public final ProductFavoriteMoleculeButtonView getFavoriteButtonPFMBV() {
        return this.favoriteButtonPFMBV;
    }

    @NotNull
    public final PriceAtomView getHotelsSearchResultsV5CardMainPricePV() {
        return (PriceAtomView) this.hotelsSearchResultsV5CardMainPricePV.getValue(this, $$delegatedProperties[7]);
    }

    @NotNull
    public final FlexboxLayout getHotelsSearchResultsV5CardPriceContentFl() {
        return this.hotelsSearchResultsV5CardPriceContentFl;
    }

    @NotNull
    public final TouchEventsThiefFrameLayout getHotelsSearchResultsV5FavoriteButtonWrapper() {
        return this.hotelsSearchResultsV5FavoriteButtonWrapper;
    }

    public final void initAdapter(@NotNull J lifecycleOwner, @NotNull Function0<Unit> imageItemClickListener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(imageItemClickListener, "imageItemClickListener");
        HotelsSearchResultsV5ItemImagesAdapter hotelsSearchResultsV5ItemImagesAdapter = new HotelsSearchResultsV5ItemImagesAdapter(lifecycleOwner, imageItemClickListener);
        this.imagesAdapter = hotelsSearchResultsV5ItemImagesAdapter;
        this.hotelsSearchResultsV5CardPhotosRV.setAdapter(hotelsSearchResultsV5ItemImagesAdapter);
        this.hotelsSearchResultsV5CardIndicatorDIV.attachTo(this.hotelsSearchResultsV5CardPhotosRV);
    }

    public final void setFavoriteButton(@NotNull HotelsSearchResultsV5CardVO item, @NotNull Function1<? super FavoriteButton, Unit> bindFavoriteProductButton) {
        boolean z11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(bindFavoriteProductButton, "bindFavoriteProductButton");
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.favoriteButtonPFMBV;
        FavoriteProductMolecule favoriteButton = item.getFavoriteButton();
        if (favoriteButton != null) {
            bindFavoriteProductButton.invoke(productFavoriteMoleculeButtonView);
            this.hotelsSearchResultsV5FavoriteButtonWrapper.setTouchEventOneTimePassEnabled(favoriteButton.isFavorite());
            z11 = true;
        } else {
            z11 = false;
        }
        ViewExtKt.showOrGone(productFavoriteMoleculeButtonView, Boolean.valueOf(z11));
    }

    public final void setIsFavoriteFeatureActivated(boolean isActivated) {
        this.hotelsSearchResultsV5FavoriteButtonWrapper.setThiefActivated(isActivated);
    }

    public final void showNewState(@NotNull HotelsSearchResultsV5CardVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> onViewEvent) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        if (item.getIsShimmerState()) {
            hidePriceBlock();
            ViewExtKt.show(this.shimmerGroup);
            ViewExtKt.gone(this.errorMessageGroup);
            return;
        }
        if (item.getIsPriceErrorMessageVisible()) {
            hidePriceBlock();
            ViewExtKt.gone(this.shimmerGroup);
            ViewExtKt.show(this.errorMessageGroup);
            TextHolderKt.bindOrGone$default(getHotelsSearchResultsV5PriceErrorMessageTAV(), item.getPriceErrorMessage(), null, 2, null);
            return;
        }
        ViewExtKt.gone(this.shimmerGroup);
        ViewExtKt.gone(this.errorMessageGroup);
        PriceAtomHolderKt.bindOrGone$default(getHotelsSearchResultsV5CardMarketingPricePV(), item.getMarketingPrice(), null, 2, null);
        setupPriceContent(item);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            onViewEvent.invoke(viewEvent);
        }
        BadgeHolderKt.bindOrGone(getHotelsSearchResultsV5CardPremiumBV(), item.getPremiumBadge(), actionHandler);
        StockBarHolderKt.bindOrGone$default(this.hotelsSearchResultsV5CardStockBarSBV, item.getStockBar(), null, 2, null);
        TextHolderKt.bindOrGone$default(getHotelsSearchResultsV5RemainingOptionsTAV(), item.getRemainingOptions(), null, 2, null);
        TextAtomV2View hotelsSearchResultsV5CardPromoTAV = getHotelsSearchResultsV5CardPromoTAV();
        HotelsSearchResultsV5CardVO.ItemHeaderVO marketingHeader = item.getMarketingHeader();
        TextHolderKt.bindOrGone$default(hotelsSearchResultsV5CardPromoTAV, marketingHeader != null ? marketingHeader.getTitle() : null, null, 2, null);
        HotelsSearchResultsV5CardVO.ItemHeaderVO marketingHeader2 = item.getMarketingHeader();
        bindBackground(marketingHeader2 != null ? marketingHeader2.getBackgroundGradient() : null, item.getCardBackgroundColor());
        AtomsAdapter atomsAdapter = this.imageBadgeAtomsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getImageBadges());
        this.hotelsSearchResultsV5CardImageBadgesVAL.setVisibility(item.getIsImageBadgesVisible() ? 0 : 8);
        this.hotelsSearchResultsV5AwardBadgeABV.setVisibility(item.getAwardBadge() != null ? 0 : 8);
    }
}
