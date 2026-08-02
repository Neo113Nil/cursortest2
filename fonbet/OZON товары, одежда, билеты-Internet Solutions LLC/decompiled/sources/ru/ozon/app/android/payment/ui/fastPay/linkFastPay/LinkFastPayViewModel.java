package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import W10.c;
import Wc.a;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.fastPay.FastPayRepository;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ9\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;", "repository", "<init>", "(Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;)V", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayResponse;", "response", "", "processLinkFastPay", "(Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "showDefaultError", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "sendShowLoader", "()V", "sendHideLoader", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "body", "linkFastPay", "(Ljava/lang/String;LW10/c;Ljava/util/Map;)V", "Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;", "LAe/w0;", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayEvent;", "_eventsFlow", "LAe/w0;", "LAe/x0;", "", "_isLoading", "LAe/x0;", "LAe/B0;", "eventsFlow", "LAe/B0;", "getEventsFlow", "()LAe/B0;", "LAe/M0;", "isLoading", "LAe/M0;", "()LAe/M0;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LinkFastPayViewModel extends w0 {

    @NotNull
    private final Ae.w0<LinkFastPayEvent> _eventsFlow;

    @NotNull
    private final x0<Boolean> _isLoading;

    @NotNull
    private final B0<LinkFastPayEvent> eventsFlow;

    @NotNull
    private final M0<Boolean> isLoading;

    @NotNull
    private final FastPayRepository repository;

    public LinkFastPayViewModel(@NotNull FastPayRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._eventsFlow = b11;
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._isLoading = a11;
        this.eventsFlow = C2399j.a(b11);
        this.isLoading = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processLinkFastPay(LinkFastPayResponse linkFastPayResponse, d<? super Unit> dVar) {
        Object emit = this._eventsFlow.emit(new LinkFastPayEvent.LinkFastPay(linkFastPayResponse), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHideLoader() {
        this._isLoading.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendShowLoader() {
        this._isLoading.setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDefaultError(d<? super Unit> dVar) {
        Object emit = this._eventsFlow.emit(LinkFastPayEvent.ShowError.INSTANCE, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @NotNull
    public final B0<LinkFastPayEvent> getEventsFlow() {
        return this.eventsFlow;
    }

    @NotNull
    public final M0<Boolean> isLoading() {
        return this.isLoading;
    }

    public final void linkFastPay(@NotNull String actionName, @NotNull c trackingData, Map<String, String> body) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new LinkFastPayViewModel$linkFastPay$1(this, actionName, trackingData, body, null), 3);
    }
}
