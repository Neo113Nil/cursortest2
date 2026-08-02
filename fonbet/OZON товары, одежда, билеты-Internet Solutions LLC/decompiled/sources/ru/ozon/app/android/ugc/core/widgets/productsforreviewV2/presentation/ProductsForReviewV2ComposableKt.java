package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import J0.C3349u1;
import K00.b;
import Pk0.h;
import S0.A0;
import S0.C0;
import S0.C3969l;
import S0.D;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import S0.J0;
import S0.Q;
import Sc.o;
import T7.E;
import WZ.t;
import Z1.d;
import a00.C4911f;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.RecyclerView;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import m0.C7980b;
import m0.C7984d;
import m0.C7998k;
import m0.C8004n;
import m0.C8008p;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.compose.TimerMoleculeWidgetKt;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.EnumC9909s;
import x1.L;
import xe.M;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aq\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001ak\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001c\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010!\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010(\u001a\u00020#*\u00020#2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001aI\u0010-\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00142\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b-\u0010.\u001aA\u00106\u001a\u00020\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00102\u001a\u00020$2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b4\u00105\u001a%\u00109\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00022\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b9\u0010:\u001a+\u0010;\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0003¢\u0006\u0004\b;\u0010<\u001aA\u0010=\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u001c\u001a\u00020\u00192\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0003¢\u0006\u0004\b=\u0010>\u001a\u001f\u0010C\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010D\u001a4\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0F*\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010E\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010H\"\u0014\u0010I\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010K\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M²\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "state", "", "shouldShowOnboarding", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "onCardClick", "Lkotlin/Function0;", "onTimerFinish", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeAction;", "onSwipeActionClick", "onSwipeStarted", "onOnboardingShown", "ProductsForReviewV2Composable", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "ProductsForReviewV2Content", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;", "content", "SwipeableCard", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "Lm0/b;", "", "Lm0/p;", "offsetX", "actionsWidthPx", "Lxe/M;", "scope", "DraggableCardContent", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;Lm0/b;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lxe/M;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "ProductCardContent", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Landroidx/compose/ui/e;", "LZ1/h;", "reservedSpaceBelow", "hideIfNotFits-3ABfNKs", "(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;", "hideIfNotFits", "modifier", "swipeActions", "onActionClick", "onWidthChanged", "SwipeActions", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$Badge;", "badges", "leftPadding", "onBadgeClick", "ProductBadges-uFdPcIQ", "(Ljava/util/List;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "ProductBadges", "isExpanded", "onScroll", "ObserveScreenScroll", "(ZLkotlin/jvm/functions/Function0;LS0/k;I)V", "ObserveExpandedChanges", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductVI$SwipeActionsVI;Lm0/b;LS0/k;I)V", "ShowOnboardingIfNeeded", "(ZLm0/b;FLkotlin/jvm/functions/Function0;LS0/k;I)V", "", "link", "", "selectedRating", "buildRateTapActionLink", "(Ljava/lang/String;I)Ljava/lang/String;", "targetValue", "Lm0/k;", "smoothAnimateTo", "(Lm0/b;FLkotlin/coroutines/d;)Ljava/lang/Object;", "CARD_HEIGHT", "F", "mock", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductsForReviewV2ComposableKt {
    private static final float CARD_HEIGHT = 142;

    @NotNull
    private static final ProductForReviewV2VI mock;

    static {
        t tVar;
        ImageDTO imageDTO = new ImageDTO("https://cdn1.ozone.ru/s3/multimedia-1-0/8353253340.jpg", null, ImageAspectRatio.RATIO_3_4, true, null, null, null, null, CornerRadius.RADIUS_600, null, null, null, 88, null, null, null, 61170, null);
        ProductVI.Badge.BadgeContentVI badgeContentVI = new ProductVI.Badge.BadgeContentVI(new BadgeDTO("10\u2009000 за обзоррррррробзоррррррробзоррррррробзоррррррр", "ic_m_points_filled", BadgeDTO.BadgeSize.SIZE_400, null, new BadgeDTO.CustomStyle(new BadgeDTO.CustomBackground("grMarketingPrimary", null, 2, null), null, "textLightKey", "graphicLightKey", null, 18, null), null, null, Boolean.TRUE, BadgeDTO.Style.CUSTOM, null, null, null, 3688, null), false);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("20\u2009:\u200910\u2009:\u200941");
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_200;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_100;
        TextDTO textDTO = new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, textPreset, "tsBodyNumeric300XSmall", "textMarketing", null, null, null, null, false, null, null, null, null, 1, 261632, null);
        DateTime dateTime = new DateTime();
        Intrinsics.checkNotNullExpressionValue(dateTime, "now(...)");
        DateTime dateTime2 = new DateTime();
        DateTime n11 = dateTime2.n(dateTime2.getChronology().E().a(21, dateTime2.getMillis()));
        DateTime m11 = n11.n(n11.getChronology().K().a(54, n11.getMillis())).m(21);
        Intrinsics.checkNotNullExpressionValue(m11, "plusSeconds(...)");
        ru.ozon.uni.atoms.data.common.CornerRadius cornerRadius = ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_600;
        ProductVI productVI = new ProductVI(1L, imageDTO, C7714v.b0(badgeContentVI, new ProductVI.Badge.TimerContentVI(new TimerVO(textDTO, dateTime, m11, 2L, "bgMarketingSecondary", cornerRadius), true)), Paddings.PADDING_200, new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Футболка Modjimoda Футболка унисекс"), null, null, null, null, null, textPreset, "tsCompact500Medium", "textPrimary", null, null, null, null, false, null, null, null, null, null, 523838, null), Paddings.PADDING_100.m1867getDpD9Ej5fM(), new TextDTO(OzonSpannableStringKt.toOzonSpannableString("46 • Белый"), null, null, null, null, null, textPreset, "tsCompact300XSmall", "textSecondary", null, null, null, null, false, null, null, null, null, null, 523838, null), new RatingDTO(null, RatingDTO.RatingSize.SIZE_600, null, null, null, null, null, 125, null), cornerRadius, StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR, false, true, new ProductVI.SwipeActionsVI(K.f71697a, null, 1.0f, false), null);
        CommonControlSettings commonControlSettings = new CommonControlSettings(null, null, null, 7, null);
        Parcelable.Creator<t> creator = t.CREATOR;
        tVar = t.f33400b;
        mock = new ProductForReviewV2VI(1L, productVI, commonControlSettings, tVar, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DraggableCardContent(ProductVI.SwipeActionsVI swipeActionsVI, C7980b<Float, C8008p> c7980b, float f7, Function0<Unit> function0, Function1<? super t, Unit> function1, M m11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f11;
        Function1<? super t, Unit> function12;
        Unit unit;
        boolean z11;
        C3969l u11 = interfaceC3967k.u(1047919235);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(swipeActionsVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(c7980b) : u11.F(c7980b) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            f11 = f7;
            i12 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            f11 = f7;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            function12 = function1;
            i12 |= u11.F(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(m11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function2) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            u11.o(1277914415);
            int i14 = i13 & 112;
            boolean z12 = i14 == 32 || ((i13 & 64) != 0 && u11.F(c7980b));
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ProductsForReviewV2ComposableKt$DraggableCardContent$1$1(c7980b);
                u11.x(C11);
            }
            u11.k();
            e a11 = a.a(aVar, (Function1) C11);
            Unit unit2 = Unit.f71690a;
            u11.o(1277917886);
            boolean F11 = (i14 == 32 || ((i13 & 64) != 0 && u11.F(c7980b))) | ((i13 & 7168) == 2048) | u11.F(m11) | ((i13 & 896) == 256) | u11.F(swipeActionsVI) | ((57344 & i13) == 16384);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                Function1<? super t, Unit> function13 = function12;
                unit = unit2;
                z11 = false;
                ProductsForReviewV2ComposableKt$DraggableCardContent$2$1 productsForReviewV2ComposableKt$DraggableCardContent$2$1 = new ProductsForReviewV2ComposableKt$DraggableCardContent$2$1(function0, m11, c7980b, f11, swipeActionsVI, function13, null);
                u11.x(productsForReviewV2ComposableKt$DraggableCardContent$2$1);
                C12 = productsForReviewV2ComposableKt$DraggableCardContent$2$1;
            } else {
                unit = unit2;
                z11 = false;
            }
            u11.k();
            e b11 = L.b(a11, unit, (Function2) C12);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), z11);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C3349u1.e((i13 >> 18) & 14, function2, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$DraggableCardContent$4(swipeActionsVI, c7980b, f7, function0, function1, m11, function2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ObserveExpandedChanges(ProductVI.SwipeActionsVI swipeActionsVI, C7980b<Float, C8008p> c7980b, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1106390819);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(swipeActionsVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(c7980b) : u11.F(c7980b) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Boolean valueOf = Boolean.valueOf(swipeActionsVI.getIsExpanded());
            u11.o(-1080520137);
            boolean F11 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(c7980b))) | u11.F(swipeActionsVI);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ProductsForReviewV2ComposableKt$ObserveExpandedChanges$1$1(swipeActionsVI, c7980b, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ObserveExpandedChanges$2(swipeActionsVI, c7980b, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ObserveScreenScroll(boolean z11, final Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        View view;
        C3969l u11 = interfaceC3967k.u(455807928);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C4911f c4911f = (C4911f) u11.m(f.d());
            u11.o(1277994596);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                ComponentCallbacksC5392m c11 = c4911f.c();
                C11 = (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view);
                u11.x(C11);
            }
            RecyclerView recyclerView = (RecyclerView) C11;
            Object b11 = h.b(u11, 1277997775);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1
                    @Override // androidx.recyclerview.widget.RecyclerView.t
                    public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                        Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                        if (newState == 1) {
                            function0.invoke();
                        }
                    }
                };
                u11.x(b11);
            }
            ProductsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1 productsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1 = (ProductsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1) b11;
            u11.k();
            Boolean valueOf = Boolean.valueOf(z11);
            u11.o(1278008508);
            boolean F11 = ((i12 & 14) == 4) | u11.F(recyclerView);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ProductsForReviewV2ComposableKt$ObserveScreenScroll$1$1(z11, recyclerView, productsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1);
                u11.x(C12);
            }
            u11.k();
            Q.c(valueOf, (Function1) C12, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ObserveScreenScroll$2(z11, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProductBadges-uFdPcIQ, reason: not valid java name */
    public static final void m1493ProductBadgesuFdPcIQ(List<? extends ProductVI.Badge> list, float f7, Function0<Unit> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11) {
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        C3969l u11 = interfaceC3967k.u(769715376);
        int i14 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= u11.q(f7) ? 32 : 16;
        }
        int i15 = 256;
        if ((i11 & 384) == 0) {
            i14 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = 2048;
        if ((i11 & 3072) == 0) {
            i14 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e a11 = androidx.compose.foundation.layout.M.a(T.j(e.f40358c0, f7, 0.0f, 0.0f, 8, 6), EnumC9909s.Min);
            Y b11 = X.b(C5179b.n(4), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            List<? extends ProductVI.Badge> list2 = list;
            boolean z13 = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((ProductVI.Badge) it.next()).getIsFullWidth()) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            u11.o(-595467905);
            for (ProductVI.Badge badge : list2) {
                e eVar = e.f40358c0;
                if (z11 && !badge.getIsFullWidth()) {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                    eVar = new LayoutWeightElement(1.0f, z13);
                }
                e c11 = a0.c(eVar);
                if (badge instanceof ProductVI.Badge.BadgeContentVI) {
                    u11.o(89730507);
                    BadgeDTO badge2 = ((ProductVI.Badge.BadgeContentVI) badge).getBadge();
                    u11.o(89734332);
                    boolean z14 = (i14 & 7168) == i16 ? true : z13;
                    Object C11 = u11.C();
                    if (z14 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ProductsForReviewV2ComposableKt$ProductBadges$1$1$1$1(function02);
                        u11.x(C11);
                    }
                    u11.k();
                    C3969l c3969l = u11;
                    DsBadgeAtomKt.DsBadgeAtom(badge2, c11, (Function1) C11, c3969l, 0, 0);
                    c3969l.k();
                    i12 = i15;
                    z12 = z13;
                    i13 = i16;
                    u11 = c3969l;
                } else {
                    int i17 = i16;
                    C3969l c3969l2 = u11;
                    int i18 = i15;
                    if (!(badge instanceof ProductVI.Badge.TimerContentVI)) {
                        c3969l2.o(89728718);
                        c3969l2.k();
                        throw new o();
                    }
                    c3969l2.o(89737508);
                    TimerVO timer = ((ProductVI.Badge.TimerContentVI) badge).getTimer();
                    c3969l2.o(89740860);
                    boolean z15 = (i14 & 7168) == i17 ? true : z13;
                    Object C12 = c3969l2.C();
                    if (z15 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ProductsForReviewV2ComposableKt$ProductBadges$1$1$2$1(function02);
                        c3969l2.x(C12);
                    }
                    c3969l2.k();
                    e c12 = i.c(c11, false, null, null, (Function0) C12, 7);
                    c3969l2.o(89742697);
                    boolean z16 = (i14 & 896) == i18 ? true : z13;
                    Object C13 = c3969l2.C();
                    if (z16 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new ProductsForReviewV2ComposableKt$ProductBadges$1$1$3$1(function0);
                        c3969l2.x(C13);
                    }
                    c3969l2.k();
                    i12 = i18;
                    u11 = c3969l2;
                    z12 = z13;
                    i13 = i17;
                    TimerMoleculeWidgetKt.TimerMoleculeWidget(timer, c12, (Function0) C13, false, null, false, u11, 0, 56);
                    u11.k();
                }
                i15 = i12;
                z13 = z12;
                i16 = i13;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ProductBadges$2(list, f7, function0, function02, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProductCardContent(ProductForReviewV2VI productForReviewV2VI, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        boolean z11;
        Function0<Unit> function02 = function0;
        C3969l u11 = interfaceC3967k.u(1052484017);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(productForReviewV2VI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            ProductVI product = productForReviewV2VI.getProduct();
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            float m1866getDpD9Ej5fM = product.getIsFirst() ? 0 : product.getCornerRadius().m1866getDpD9Ej5fM();
            boolean z12 = ((d) u11.m(K0.e())).u1() > 1.0f;
            C5179b.i n11 = C5179b.n(8);
            d.b i13 = InterfaceC6250b.a.i();
            e.a aVar = e.f40358c0;
            C7807Z parseColorToken = TokenParserKt.parseColorToken(UniColors.LAYER_FLOOR_0.getToken(), u11, 0);
            float f7 = m1866getDpD9Ej5fM;
            b11 = androidx.compose.foundation.e.b(aVar, parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m, y0.a());
            e f11 = a0.f(a0.e(T.j(b11, 0.0f, 0.0f, 0.0f, product.getIsLast() ? 0 : 4, 7), 1.0f), CARD_HEIGHT);
            C7807Z parseColorToken2 = TokenParserKt.parseColorToken(product.getBackgroundColor(), u11, 0);
            e b12 = androidx.compose.foundation.e.b(f11, parseColorToken2 != null ? parseColorToken2.w() : C7807Z.f72259m, A0.h.c(f7, f7, product.getCornerRadius().m1866getDpD9Ej5fM(), product.getCornerRadius().m1866getDpD9Ej5fM()));
            u11.o(-239828359);
            int i14 = i12 & 112;
            boolean F11 = u11.F(productForReviewV2VI) | (i14 == 32);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ProductsForReviewV2ComposableKt$ProductCardContent$1$1(productForReviewV2VI, function1);
                u11.x(C11);
            }
            u11.k();
            e b13 = i.b(b12, null, null, false, null, null, (Function0) C11, 28);
            float f12 = 12;
            e i15 = T.i(b13, f12, f12, 16, f12);
            Y b14 = X.b(n11, i13, u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, i15);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b14, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            ImageDTO image = product.getImage();
            u11.o(696658601);
            if (image != null) {
                DsImageAtomKt.DsImageAtom(image, null, u11, 0, 2);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e j11 = T.j(a0.c(a0.e(aVar, 1.0f)), 0.0f, 10, 0.0f, 1, 5);
            C5194q a12 = C5193p.a(C5179b.d(), InterfaceC6250b.a.k(), u11, 6);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, j11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f15 = c.f(u11, aVar);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a14, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                Ep.a.d(I13, u11, I13, g11);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            u11.o(156554018);
            if (CollectionsExtKt.isNotNullOrEmpty(product.getBadges())) {
                List<ProductVI.Badge> badges = product.getBadges();
                float m1867getDpD9Ej5fM = product.getBadgesLeftPadding().m1867getDpD9Ej5fM();
                u11.o(156562874);
                boolean F12 = u11.F(productForReviewV2VI) | (i14 == 32);
                Object C12 = u11.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new ProductsForReviewV2ComposableKt$ProductCardContent$2$2$1$1$1(productForReviewV2VI, function1);
                    u11.x(C12);
                }
                u11.k();
                function02 = function0;
                m1493ProductBadgesuFdPcIQ(badges, m1867getDpD9Ej5fM, function02, (Function0) C12, u11, i12 & 896);
            } else {
                function02 = function0;
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(product.getTitle(), null, u11, 0, 2);
            u11.o(156568253);
            if (z12 || product.getAspectText() == null) {
                z11 = false;
            } else {
                RatingDTO.RatingSize size = product.getRating().getSize();
                if (size == null) {
                    size = RatingDTO.RatingSize.SIZE_600;
                }
                e m1495hideIfNotFits3ABfNKs = m1495hideIfNotFits3ABfNKs(aVar, size.getSize());
                C5194q a16 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                int I14 = u11.I();
                A0 d14 = u11.d();
                e f16 = c.f(u11, m1495hideIfNotFits3ABfNKs);
                Function0 a17 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a17);
                } else {
                    u11.e();
                }
                Function2 g12 = b.g(u11, a16, u11, d14);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                    Ep.a.d(I14, u11, I14, g12);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                u0.E.a(u11, a0.f(aVar, product.getSpacerAboveAspectHeight()));
                z11 = false;
                DsTextAtomKt.DsTextAtom(product.getAspectText(), null, u11, 0, 2);
                u11.f();
            }
            u11.k();
            u11.f();
            RatingDTO rating = product.getRating();
            u11.o(406822082);
            boolean F13 = u11.F(view) | u11.F(productForReviewV2VI) | (i14 != 32 ? z11 : true);
            Object C13 = u11.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ProductsForReviewV2ComposableKt$ProductCardContent$2$2$2$1(view, productForReviewV2VI, function1);
                u11.x(C13);
            }
            u11.k();
            DsRatingKt.DsRatingAtom(rating, null, null, (Function1) C13, u11, RatingDTO.$stable, 6);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ProductCardContent$3(productForReviewV2VI, function1, function02, i11));
        }
    }

    public static final void ProductsForReviewV2Composable(@NotNull ProductForReviewV2VI state, boolean z11, @NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> onCardClick, @NotNull Function0<Unit> onTimerFinish, @NotNull Function1<? super ProductVI.SwipeAction, Unit> onSwipeActionClick, @NotNull Function0<Unit> onSwipeStarted, @NotNull Function0<Unit> onOnboardingShown, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onCardClick, "onCardClick");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Intrinsics.checkNotNullParameter(onSwipeActionClick, "onSwipeActionClick");
        Intrinsics.checkNotNullParameter(onSwipeStarted, "onSwipeStarted");
        Intrinsics.checkNotNullParameter(onOnboardingShown, "onOnboardingShown");
        C3969l u11 = interfaceC3967k.u(1574095923);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onView) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onCardClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onTimerFinish) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onSwipeActionClick) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onSwipeStarted) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onOnboardingShown) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(1295187369);
            if (state.getTokenizedEvent() != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1295190215);
                boolean F11 = ((i12 & 896) == 256) | u11.F(state);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ProductsForReviewV2ComposableKt$ProductsForReviewV2Composable$1$1(onView, state);
                    u11.x(C11);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C11, u11, 6);
            }
            u11.k();
            int i13 = i12 >> 3;
            c3969l = u11;
            ProductsForReviewV2Content(state, z12, onCardClick, onTimerFinish, onSwipeActionClick, onSwipeStarted, onView, onOnboardingShown, c3969l, (i12 & 29360128) | (i12 & 126) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752) | ((i12 << 12) & 3670016));
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ProductsForReviewV2Composable$2(state, z11, onView, onCardClick, onTimerFinish, onSwipeActionClick, onSwipeStarted, onOnboardingShown, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProductsForReviewV2Content(ProductForReviewV2VI productForReviewV2VI, boolean z11, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, Function1<? super ProductVI.SwipeAction, Unit> function12, Function0<Unit> function02, Function1<? super t, Unit> function13, Function0<Unit> function03, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super t, Unit> function14;
        Function0<Unit> function04;
        C3969l u11 = interfaceC3967k.u(-1373800215);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(productForReviewV2VI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function02) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            function14 = function13;
            i12 |= u11.F(function14) ? 1048576 : 524288;
        } else {
            function14 = function13;
        }
        if ((12582912 & i11) == 0) {
            function04 = function03;
            i12 |= u11.F(function04) ? 8388608 : 4194304;
        } else {
            function04 = function03;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
        } else if (productForReviewV2VI.getProduct().getSwipeActions().getActions().isEmpty()) {
            u11.o(1269125354);
            int i13 = i12 & 14;
            int i14 = i12 >> 3;
            ProductCardContent(productForReviewV2VI, function1, function0, u11, (i14 & 896) | i13 | (i14 & 112));
            u11.k();
        } else {
            u11.o(1268731902);
            int i15 = i12 >> 6;
            SwipeableCard(productForReviewV2VI.getProduct().getSwipeActions(), z11, function12, function02, function04, function14, a1.c.c(-1951373317, new ProductsForReviewV2ComposableKt$ProductsForReviewV2Content$1(productForReviewV2VI, function1, function0), u11), u11, 1572864 | (i12 & 112) | (i15 & 896) | (i15 & 7168) | ((i12 >> 9) & 57344) | ((i12 >> 3) & 458752));
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ProductsForReviewV2Content$2(productForReviewV2VI, z11, function1, function0, function12, function02, function13, function03, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShowOnboardingIfNeeded(boolean z11, C7980b<Float, C8008p> c7980b, float f7, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        boolean z12;
        int i12;
        float f11;
        Function0<Unit> function02;
        C3969l u11 = interfaceC3967k.u(-275212291);
        if ((i11 & 6) == 0) {
            z12 = z11;
            i12 = (u11.p(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(c7980b) : u11.F(c7980b) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            f11 = f7;
            i12 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            f11 = f7;
        }
        if ((i11 & 3072) == 0) {
            function02 = function0;
            i12 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function02 = function0;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            Boolean valueOf = Boolean.valueOf(z12);
            Float valueOf2 = Float.valueOf(f11);
            u11.o(-1487350652);
            boolean z13 = ((i12 & 14) == 4) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(c7980b))) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object C11 = u11.C();
            if (z13 || C11 == InterfaceC3967k.a.a()) {
                ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1 productsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1 = new ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1(z11, c7980b, f11, function02, null);
                u11.x(productsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1);
                C11 = productsForReviewV2ComposableKt$ShowOnboardingIfNeeded$1$1;
            }
            u11.k();
            Q.g(valueOf, valueOf2, (Function2) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$ShowOnboardingIfNeeded$2(z11, c7980b, f7, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeActions(e eVar, ProductVI.SwipeActionsVI swipeActionsVI, Function1<? super ProductVI.SwipeAction, Unit> function1, Function1<? super Float, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        ProductVI.SwipeActionsVI swipeActionsVI2;
        boolean z11;
        Object C11;
        int I11;
        int size;
        int i14;
        e eVar3;
        e eVar4;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1121666083);
        int i15 = i12 & 1;
        int i16 = 2;
        if (i15 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            swipeActionsVI2 = swipeActionsVI;
            i13 |= u11.F(swipeActionsVI2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i15 != 0) {
                    eVar2 = e.f40358c0;
                }
                e t2 = a0.t(androidx.compose.foundation.layout.M.a(eVar2, EnumC9909s.Max), 0.0f, (int) (swipeActionsVI2.getSwipeBlockWidthFraction() * ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp), 1);
                u11.o(-919979446);
                z11 = (i13 & 7168) != 2048;
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ProductsForReviewV2ComposableKt$SwipeActions$1$1(function12);
                    u11.x(C11);
                }
                u11.k();
                e h11 = T.h(androidx.compose.ui.layout.c.a(t2, (Function1) C11), 12, 0.0f, 2);
                Y b11 = X.b(C5179b.n(8), InterfaceC6250b.a.l(), u11, 6);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, h11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h12 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, h12);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                u11.o(1133306591);
                List<ProductVI.SwipeAction> actions = swipeActionsVI2.getActions();
                size = actions.size();
                i14 = 0;
                while (i14 < size) {
                    ProductVI.SwipeAction swipeAction = actions.get(i14);
                    e.a aVar = e.f40358c0;
                    e c11 = androidx.compose.foundation.layout.M.c(aVar, EnumC9909s.Max);
                    if (swipeActionsVI2.getActions().size() == i16) {
                        eVar4 = eVar2;
                        if (1.0f <= 0.0d) {
                            throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                        }
                        c11 = c11.l0(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    } else {
                        eVar4 = eVar2;
                    }
                    C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f11 = c.f(u11, c11);
                    Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = b.g(u11, a12, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        Ep.a.d(I12, u11, I12, g10);
                    }
                    e c12 = GZ.e.c(u11, f11, aVar, 1.0f);
                    C7807Z parseColorToken = TokenParserKt.parseColorToken(swipeAction.getBackground(), u11, 0);
                    e b12 = androidx.compose.foundation.e.b(c12, parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m, A0.h.b(40));
                    u11.o(431122156);
                    boolean F11 = ((i13 & 896) == 256) | u11.F(swipeAction);
                    Object C12 = u11.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ProductsForReviewV2ComposableKt$SwipeActions$2$1$2$1$1(function1, swipeAction);
                        u11.x(C12);
                    }
                    u11.k();
                    DsIconAtomKt.DsIconAtom(swipeAction.getIcon(), T.f(i.c(b12, false, null, null, (Function0) C12, 7), 16), u11, IconDTO.$stable, 0);
                    TextDTO title = swipeAction.getTitle();
                    u11.o(431127230);
                    if (title != null) {
                        DsTextAtomKt.DsTextAtom(title, a0.e(aVar, 1.0f), u11, 48, 0);
                        Unit unit = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                    i14++;
                    eVar2 = eVar4;
                    i16 = 2;
                }
                u11.k();
                u11.f();
                eVar3 = eVar2;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new ProductsForReviewV2ComposableKt$SwipeActions$3(eVar3, swipeActionsVI2, function1, function12, i11, i12));
                return;
            }
            return;
        }
        swipeActionsVI2 = swipeActionsVI;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        e t22 = a0.t(androidx.compose.foundation.layout.M.a(eVar2, EnumC9909s.Max), 0.0f, (int) (swipeActionsVI2.getSwipeBlockWidthFraction() * ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp), 1);
        u11.o(-919979446);
        if ((i13 & 7168) != 2048) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new ProductsForReviewV2ComposableKt$SwipeActions$1$1(function12);
        u11.x(C11);
        u11.k();
        e h112 = T.h(androidx.compose.ui.layout.c.a(t22, (Function1) C11), 12, 0.0f, 2);
        Y b112 = X.b(C5179b.n(8), InterfaceC6250b.a.l(), u11, 6);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, h112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h122 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, h122);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        u11.o(1133306591);
        List<ProductVI.SwipeAction> actions2 = swipeActionsVI2.getActions();
        size = actions2.size();
        i14 = 0;
        while (i14 < size) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar2;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwipeableCard(ProductVI.SwipeActionsVI swipeActionsVI, boolean z11, Function1<? super ProductVI.SwipeAction, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super t, Unit> function12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-256509194);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(swipeActionsVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function02) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function12) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function2) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            M a11 = ((D) C11).a();
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            u11.o(-238981131);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = C0.a(0.0f);
                u11.x(C12);
            }
            InterfaceC3970l0 interfaceC3970l0 = (InterfaceC3970l0) C12;
            Object b12 = h.b(u11, -238979348);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = C7984d.a(0.0f);
                u11.x(b12);
            }
            C7980b c7980b = (C7980b) b12;
            u11.k();
            boolean isExpanded = swipeActionsVI.getIsExpanded();
            u11.o(-238975199);
            boolean F11 = u11.F(a11) | u11.F(c7980b);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ProductsForReviewV2ComposableKt$SwipeableCard$1$1(a11, c7980b);
                u11.x(C13);
            }
            u11.k();
            ObserveScreenScroll(isExpanded, (Function0) C13, u11, 0);
            int i14 = i13 & 14;
            ObserveExpandedChanges(swipeActionsVI, c7980b, u11, i14 | 64);
            int i15 = i13 >> 3;
            ShowOnboardingIfNeeded(z11, c7980b, interfaceC3970l0.getFloatValue(), function02, u11, (i15 & 14) | 64 | (i15 & 7168));
            e.a aVar = e.f40358c0;
            e f7 = a0.f(a0.e(aVar, 1.0f), CARD_HEIGHT);
            C7807Z parseColorToken = TokenParserKt.parseColorToken(UniColors.LAYER_FLOOR_0.getToken(), u11, 0);
            b11 = androidx.compose.foundation.e.b(f7, parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m, y0.a());
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            e a13 = C5187j.f39515a.a(aVar, InterfaceC6250b.a.f());
            u11.o(-491492831);
            boolean F12 = u11.F(c7980b);
            Object C14 = u11.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new ProductsForReviewV2ComposableKt$SwipeableCard$2$1$1(c7980b, interfaceC3970l0);
                u11.x(C14);
            }
            u11.k();
            e a14 = a.a(a13, (Function1) C14);
            u11.o(-491486437);
            boolean F13 = u11.F(view) | u11.F(a11) | u11.F(c7980b) | ((i13 & 896) == 256);
            Object C15 = u11.C();
            if (F13 || C15 == InterfaceC3967k.a.a()) {
                C15 = new ProductsForReviewV2ComposableKt$SwipeableCard$2$2$1(view, a11, c7980b, function1);
                u11.x(C15);
            }
            Function1 function13 = (Function1) C15;
            Object b13 = h.b(u11, -491489181);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = new ProductsForReviewV2ComposableKt$SwipeableCard$2$3$1(interfaceC3970l0);
                u11.x(b13);
            }
            u11.k();
            SwipeActions(a14, swipeActionsVI, function13, (Function1) b13, u11, ((i13 << 3) & 112) | 3072, 0);
            DraggableCardContent(swipeActionsVI, c7980b, interfaceC3970l0.getFloatValue(), function0, function12, a11, a1.c.c(686517899, new ProductsForReviewV2ComposableKt$SwipeableCard$2$4(function2), u11), u11, i14 | 1572928 | (i13 & 7168) | (i15 & 57344));
            c3969l = u11;
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new ProductsForReviewV2ComposableKt$SwipeableCard$3(swipeActionsVI, z11, function1, function0, function02, function12, function2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String buildRateTapActionLink(String str, int i11) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("selectedRating", String.valueOf(i11));
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* renamed from: hideIfNotFits-3ABfNKs, reason: not valid java name */
    private static final e m1495hideIfNotFits3ABfNKs(e eVar, float f7) {
        return androidx.compose.ui.layout.b.a(new ProductsForReviewV2ComposableKt$hideIfNotFits$1(f7), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object smoothAnimateTo(C7980b<Float, C8008p> c7980b, float f7, kotlin.coroutines.d<? super C7998k<Float, C8008p>> dVar) {
        return C7980b.f(c7980b, new Float(f7), C8004n.d(300, 0, null, 6), null, dVar, 12);
    }
}
