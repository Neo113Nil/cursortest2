package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetHotelsPageDetailsBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.HotelsPageDetailsVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.additionalInfo.AdditionalInfoAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.additionalInfo.AdditionalInfoDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.facilities.FacilitiesAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0016\u0010\u001aJ3\u0010!\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$TabInfoVO;", "tabInfo", "", "bindTabInfo", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$TabInfoVO;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsPageDetailsBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetHotelsPageDetailsBinding;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/additionalInfo/AdditionalInfoAdapter;", "additionalInfoAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/additionalInfo/AdditionalInfoAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/facilities/FacilitiesAdapter;", "facilitiesAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/facilities/FacilitiesAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageDetailsWidgetViewHolder extends k<HotelsPageDetailsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdditionalInfoAdapter additionalInfoAdapter;

    @NotNull
    private final WidgetHotelsPageDetailsBinding binding;

    @NotNull
    private final FacilitiesAdapter facilitiesAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsPageDetailsWidgetViewHolder(@NotNull View containerView, @NotNull final ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetHotelsPageDetailsBinding bind = WidgetHotelsPageDetailsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AdditionalInfoAdapter additionalInfoAdapter = new AdditionalInfoAdapter();
        this.additionalInfoAdapter = additionalInfoAdapter;
        FacilitiesAdapter facilitiesAdapter = new FacilitiesAdapter();
        this.facilitiesAdapter = facilitiesAdapter;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        TabLayout tabInfoTL = bind.tabInfoTL;
        Intrinsics.checkNotNullExpressionValue(tabInfoTL, "tabInfoTL");
        tabInfoTL.c(new TabLayout.b() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.HotelsPageDetailsWidgetViewHolder$special$$inlined$addTabSelectedListeners$default$1
            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabReselected(TabLayout.e tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabSelected(TabLayout.e tab) {
                HotelsPageDetailsVO boundData;
                Intrinsics.checkNotNullParameter(tab, "tab");
                int d11 = tab.d();
                Integer valueOf = Integer.valueOf(d11);
                if (d11 == -1 || ((boundData = HotelsPageDetailsWidgetViewHolder.this.getBoundData()) != null && d11 == boundData.getSelectedTabIndex())) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    references.getController().update(new HotelsPageDetailsTabSelected(valueOf.intValue()));
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabUnselected(TabLayout.e tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }
        });
        RecyclerView recyclerView = bind.hotelAdditionalInfoRV;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(additionalInfoAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new AdditionalInfoDecoration(context));
        RecyclerView recyclerView2 = bind.facilitiesRv;
        recyclerView2.setAdapter(facilitiesAdapter);
        recyclerView2.setItemAnimator(null);
        bind.hotelDescriptionTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void bindTabInfo(final HotelsPageDetailsVO.TabInfoVO tabInfo) {
        this.additionalInfoAdapter.setItems(tabInfo.getAdditionalInfo());
        RecyclerView hotelAdditionalInfoRV = this.binding.hotelAdditionalInfoRV;
        Intrinsics.checkNotNullExpressionValue(hotelAdditionalInfoRV, "hotelAdditionalInfoRV");
        hotelAdditionalInfoRV.setVisibility(tabInfo.getIsAdditionalInfoVisible() ? 0 : 8);
        this.binding.descriptionMoreLBV.bindOrGone(tabInfo.getExtendButton(), this.actionHandler);
        RecyclerView facilitiesRv = this.binding.facilitiesRv;
        Intrinsics.checkNotNullExpressionValue(facilitiesRv, "facilitiesRv");
        facilitiesRv.setVisibility(tabInfo.getIsFacilitiesVisible() ? 0 : 8);
        this.facilitiesAdapter.setItems(tabInfo.getFacilities());
        AppCompatTextView hotelDescriptionTv = this.binding.hotelDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(hotelDescriptionTv, "hotelDescriptionTv");
        hotelDescriptionTv.setVisibility(tabInfo.getIsDescriptionVisible() ? 0 : 8);
        if (tabInfo.getIsDescriptionVisible()) {
            if (tabInfo.getShortDescription() == null || tabInfo.getShortDescription().getIsFullDescriptionShown()) {
                this.binding.hotelDescriptionTv.setText(tabInfo.getFullDescription());
                return;
            }
            final HotelsPageDetailsVO.ShortDescription shortDescription = tabInfo.getShortDescription();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(shortDescription.getText());
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.HotelsPageDetailsWidgetViewHolder$bindTabInfo$1$clickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    WidgetHotelsPageDetailsBinding widgetHotelsPageDetailsBinding;
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    HotelsPageDetailsVO.ShortDescription.this.setFullDescriptionShown(true);
                    widgetHotelsPageDetailsBinding = this.binding;
                    widgetHotelsPageDetailsBinding.hotelDescriptionTv.setText(tabInfo.getFullDescription());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    ds.setColor(HotelsPageDetailsVO.ShortDescription.this.getSpanColor());
                    ds.setUnderlineText(false);
                }
            }, shortDescription.getSpanStartIndex(), shortDescription.getSpanEndIndex(), 33);
            this.binding.hotelDescriptionTv.setText(spannableStringBuilder);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsPageDetailsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsPageDetailsWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsPageDetailsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsPageDetailsVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof HotelsPageDetailsTabSelectedPayload) {
            TabLayout tabLayout = this.binding.tabInfoTL;
            if (tabLayout.j() != item.getSelectedTabIndex()) {
                tabLayout.s(tabLayout.k(item.getSelectedTabIndex()), true);
            }
            bindTabInfo(item.getTabs().get(item.getSelectedTabIndex()));
            return;
        }
        AppCompatTextView hotelTitleATV = this.binding.hotelTitleATV;
        Intrinsics.checkNotNullExpressionValue(hotelTitleATV, "hotelTitleATV");
        hotelTitleATV.setVisibility(!item.getHasTabs() ? 0 : 8);
        TabLayout tabInfoTL = this.binding.tabInfoTL;
        Intrinsics.checkNotNullExpressionValue(tabInfoTL, "tabInfoTL");
        tabInfoTL.setVisibility(item.getHasTabs() ? 0 : 8);
        if (item.getHasTabs()) {
            this.binding.tabInfoTL.o();
            int i11 = 0;
            for (Object obj : item.getTabs()) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    TabLayout.e m11 = this.binding.tabInfoTL.m();
                    m11.n(((HotelsPageDetailsVO.TabInfoVO) obj).getTitle());
                    this.binding.tabInfoTL.e(m11, i11 == item.getSelectedTabIndex());
                    i11 = i12;
                } else {
                    C7714v.O0();
                    throw null;
                }
            }
            bindTabInfo(item.getTabs().get(item.getSelectedTabIndex()));
            return;
        }
        HotelsPageDetailsVO.TabInfoVO tabInfoVO = (HotelsPageDetailsVO.TabInfoVO) C7714v.K(item.getTabs());
        this.binding.hotelTitleATV.setText(tabInfoVO.getTitle());
        bindTabInfo(tabInfoVO);
    }
}
