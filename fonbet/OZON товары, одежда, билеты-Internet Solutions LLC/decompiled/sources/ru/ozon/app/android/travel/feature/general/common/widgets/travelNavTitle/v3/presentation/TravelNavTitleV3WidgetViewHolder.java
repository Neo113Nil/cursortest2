package ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.presentation;

import Sc.o;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.activity.C;
import androidx.activity.J;
import androidx.appcompat.app.g;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetTravelNavTitleV3Binding;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.data.TravelNavTitleV3DTO;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/presentation/TravelNavTitleV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/presentation/TravelNavTitleV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "addBackPressedCallback", "()V", "disableBackPressedCallback", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/presentation/TravelNavTitleV3VO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelNavTitleV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelNavTitleV3Binding;", "Landroidx/activity/J;", "onBackPressedDispatcher", "Landroidx/activity/J;", "Landroidx/activity/C;", "onBackPressedCallback", "Landroidx/activity/C;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelNavTitleV3WidgetViewHolder extends k<TravelNavTitleV3VO> {

    @NotNull
    private final WidgetTravelNavTitleV3Binding binding;
    private C onBackPressedCallback;
    private final J onBackPressedDispatcher;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelNavTitleV3WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelNavTitleV3Binding bind = WidgetTravelNavTitleV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        r a11 = references.getContainer().a();
        this.onBackPressedDispatcher = a11 != null ? a11.getOnBackPressedDispatcher() : null;
        ViewExtensionsKt.centerInToolbar(containerView, references, this);
    }

    private final void addBackPressedCallback() {
        C c11 = new C() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.presentation.TravelNavTitleV3WidgetViewHolder$addBackPressedCallback$callback$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TravelNavTitleV3DTO.BackButtonBehaviorType.values().length];
                    try {
                        iArr[TravelNavTitleV3DTO.BackButtonBehaviorType.BACK_WITH_FLOW.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TravelNavTitleV3DTO.BackButtonBehaviorType.BACK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                ComposerReferences composerReferences;
                l lVar;
                ComposerReferences composerReferences2;
                ComposerReferences composerReferences3;
                ComposerReferences composerReferences4;
                setEnabled(false);
                TravelNavTitleV3VO boundData = TravelNavTitleV3WidgetViewHolder.this.getBoundData();
                if (boundData != null) {
                    TravelNavTitleV3WidgetViewHolder travelNavTitleV3WidgetViewHolder = TravelNavTitleV3WidgetViewHolder.this;
                    String url = boundData.getUrl();
                    if (url != null) {
                        int i11 = WhenMappings.$EnumSwitchMapping$0[boundData.getBackButtonBehaviorType().ordinal()];
                        if (i11 == 1) {
                            composerReferences2 = travelNavTitleV3WidgetViewHolder.references;
                            ComposerExtKt.closeFlow(composerReferences2.getContainer());
                        } else {
                            if (i11 != 2) {
                                throw new o();
                            }
                            composerReferences4 = travelNavTitleV3WidgetViewHolder.references;
                            composerReferences4.getNavigator().popBackStack();
                        }
                        composerReferences3 = travelNavTitleV3WidgetViewHolder.references;
                        ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences3.getNavigator(), url, null, 2, null);
                    } else {
                        composerReferences = travelNavTitleV3WidgetViewHolder.references;
                        r a11 = composerReferences.getContainer().a();
                        g gVar = a11 instanceof g ? (g) a11 : null;
                        if (gVar != null) {
                            gVar.onSupportNavigateUp();
                        }
                    }
                    t backButtonClickEvent = boundData.getBackButtonClickEvent();
                    if (backButtonClickEvent != null) {
                        lVar = travelNavTitleV3WidgetViewHolder.tokenizedAnalytics;
                        TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, backButtonClickEvent, null, 2, null);
                    }
                }
            }
        };
        this.onBackPressedCallback = c11;
        J j11 = this.onBackPressedDispatcher;
        if (j11 != null) {
            j11.h(this, c11);
        }
    }

    private final void disableBackPressedCallback() {
        C c11 = this.onBackPressedCallback;
        if (c11 != null) {
            c11.setEnabled(false);
        }
        this.onBackPressedCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelNavTitleV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView travelNavTitleV3TAV = this.binding.travelNavTitleV3TAV;
        Intrinsics.checkNotNullExpressionValue(travelNavTitleV3TAV, "travelNavTitleV3TAV");
        TextAtomHolderKt.bind$default(travelNavTitleV3TAV, item.getTitle(), null, 2, null);
        TextAtomView travelNavSubtitleV3TAV = this.binding.travelNavSubtitleV3TAV;
        Intrinsics.checkNotNullExpressionValue(travelNavSubtitleV3TAV, "travelNavSubtitleV3TAV");
        TextAtomHolderKt.bindOrGone$default(travelNavSubtitleV3TAV, item.getSubTitle(), null, 2, null);
        disableBackPressedCallback();
        if (item.getShouldHandleBackButtonClicks()) {
            addBackPressedCallback();
        }
    }
}
