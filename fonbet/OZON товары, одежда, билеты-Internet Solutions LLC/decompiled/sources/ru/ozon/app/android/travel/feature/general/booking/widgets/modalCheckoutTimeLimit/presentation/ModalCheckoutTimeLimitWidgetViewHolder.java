package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.view.ModalCheckoutTimeLimitView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u0017\u0010\u001bJ)\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/view/ModalCheckoutTimeLimitView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/view/ModalCheckoutTimeLimitView;LWZ/l;Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;)V", "", "text", "", "updateTimerText", "(Ljava/lang/CharSequence;)V", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/view/ModalCheckoutTimeLimitView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCheckoutTimeLimitWidgetViewHolder extends k<ModalCheckoutTimeLimitVO> {

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ModalCheckoutTimeLimitView view;

    @NotNull
    private final ModalCheckoutTimeLimitViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalCheckoutTimeLimitWidgetViewHolder(@NotNull ModalCheckoutTimeLimitView view, @NotNull l tokenizedAnalytics, @NotNull ModalCheckoutTimeLimitViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerText(CharSequence text) {
        TextDTO timerText;
        ModalCheckoutTimeLimitVO boundData = getBoundData();
        if (boundData == null || (timerText = boundData.getTimerText()) == null) {
            return;
        }
        ModalCheckoutTimeLimitView modalCheckoutTimeLimitView = this.view;
        Intrinsics.g(text, "null cannot be cast to non-null type ru.ozon.uni.atoms.utils.OzonSpannableString");
        modalCheckoutTimeLimitView.updateTimerText(TextDTO.copy$default(timerText, (OzonSpannableString) text, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.formattedTimeLiveData().observe(this, new ModalCheckoutTimeLimitWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ModalCheckoutTimeLimitWidgetViewHolder$onAttach$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ModalCheckoutTimeLimitVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            m.c(this.tokenizedAnalytics, viewEvent, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ModalCheckoutTimeLimitVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item.getTitle(), item.getTimerText());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ModalCheckoutTimeLimitVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Intrinsics.d(payload, "modal_checkout_time_limit_empty_payload")) {
            TextDTO timerText = item.getTimerText();
            if (timerText != null) {
                this.view.updateTimerText(timerText);
                return;
            }
            return;
        }
        bind(item, info);
    }
}
