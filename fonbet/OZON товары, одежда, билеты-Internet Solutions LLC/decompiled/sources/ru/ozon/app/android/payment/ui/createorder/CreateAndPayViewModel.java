package ru.ozon.app.android.payment.ui.createorder;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import B0.A0;
import D40.a;
import De.C2859b;
import G.g;
import N3.C3660k;
import Sc.o;
import V.e;
import W10.c;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.payment.GooglePayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentDO;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.CreateAndPayModelsKt;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.OrderDO;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.logger.OzonLogger;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.payment.domain.createorder.busevents.OrderTrackingBus;
import ru.ozon.app.android.payment.ui.createOrderV2.CreateOrderV2Response;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewState;
import ru.ozon.app.android.payment.ui.createorder.highload.HighLoadProgressBar;
import ru.ozon.app.android.payment.ui.data.NativePaymentErrorModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u009a\u0001\u0018\u0000 ©\u00012\u00020\u0001:\u0004©\u0001ª\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ-\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010 \u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\f\b\u0002\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ\u001f\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b/\u0010.J\u0015\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eJ#\u00105\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b5\u00106J+\u00105\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u00107\u001a\u00020\u001aH\u0002¢\u0006\u0004\b5\u0010\u001dJA\u00108\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001eH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\f2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\u00020\f2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u0010\u000eJ\u001d\u0010K\u001a\u00020\f2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0FH\u0002¢\u0006\u0004\bK\u0010IJ\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010\u000eJ\u0017\u0010N\u001a\u00020\f2\u0006\u0010;\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\f2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\f2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020\u0015H\u0002¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u00020\f2\b\b\u0002\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\fH\u0002¢\u0006\u0004\bc\u0010\u000eJ\u000f\u0010d\u001a\u00020\fH\u0002¢\u0006\u0004\bd\u0010\u000eJ\u000f\u0010e\u001a\u00020\fH\u0002¢\u0006\u0004\be\u0010\u000eJ\u000f\u0010f\u001a\u00020\fH\u0002¢\u0006\u0004\bf\u0010\u000eJ\u000f\u0010g\u001a\u00020\fH\u0002¢\u0006\u0004\bg\u0010\u000eJ%\u0010j\u001a\u00020\f2\b\u0010h\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\f2\u0006\u0010;\u001a\u00020lH\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010q\u001a\u00020\f2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\f2\u0006\u0010p\u001a\u00020>H\u0002¢\u0006\u0004\bs\u0010AJ\u0017\u0010v\u001a\u00020\f2\u0006\u0010u\u001a\u00020tH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\f2\u0006\u0010u\u001a\u00020xH\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020\f2\u0006\u0010;\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010~R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u007fR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0080\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0081\u0001R\u001f\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u0089\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010\u0099\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R#\u0010 \u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009f\u0001R\u001f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010£\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¨\u0001\u001a\u00030\u0083\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001¨\u0006«\u0001"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "repository", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "orderTrackingBus", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "googlePayManager", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "createAndPayAnalytics", "<init>", "(Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;)V", "", "onCleared", "()V", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "initAnalytics", "(LSg/a;)V", "subscribeToAppTerminated", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;", "progressBar", "createOrder", "(Ljava/lang/String;LW10/c;Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;)V", "", "body", "createOrderV2", "(Ljava/lang/String;LW10/c;Ljava/util/Map;Lru/ozon/app/android/payment/ui/createorder/highload/HighLoadProgressBar;)V", "pay", "(Ljava/lang/String;Ljava/util/Map;LW10/c;)V", "retryCreateOrder", "", "resultCode", "Landroid/content/Intent;", "data", "onGooglePayResult", "(ILandroid/content/Intent;)V", "Landroid/os/Bundle;", "bundle", "saveState", "(Landroid/os/Bundle;)V", "loadState", "Lru/ozon/app/android/payment/ui/createorder/CancelLinkProcessor;", "newCancelLinkProcessor", "setCancelLinkProcessor", "(Lru/ozon/app/android/payment/ui/createorder/CancelLinkProcessor;)V", "hideProgressBar", "internalCreateOrder", "(Ljava/lang/String;LW10/c;)V", "item", "internalCreateOrderV2", "(Ljava/lang/String;LW10/c;Ljava/util/Map;)V", "Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response;", "response", "processOrderV2Response", "(Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response;)V", "", "throwable", "processOrderV2Error", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response$Pooling;", "poolingDetails", "processPooling", "(Lru/ozon/app/android/payment/ui/createOrderV2/CreateOrderV2Response$Pooling;)V", "Lkotlin/Function0;", "afterComplete", "withHideProgressBar", "(Lkotlin/jvm/functions/Function0;)V", "showLoading", "hideLoading", "cancelAndSendCloseFlow", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;", "processOrderCreated", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO;)V", "Lcom/google/android/gms/wallet/PaymentData;", "paymentData", "handlePaymentSuccess", "(Lcom/google/android/gms/wallet/PaymentData;)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDO;", "authorizeDO", "processAuthorizeResponse", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/AuthorizePaymentDO;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "handleAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", ImagesContract.URL, "convert3dsUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Li10/l$a;", "type", "sendShowLoader", "(Li10/l$a;)V", "sendHideLoader", "sendShowProgressBar", "sendHideProgressBar", "cancelJobHideProgress", "sendOnOrderCreated", "link", "cancelLink", "sendCloseFlow", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderRedirect;", "sendRedirect", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderRedirect;)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError;", "error", "sendError", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError;)V", "sendCriticalError", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay;", "payInfo", "sendProcessSberPay", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay;)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative;", "sendRequestGooglePay", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative;)V", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByFastPay;", "sendProcessFastPay", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByFastPay;)V", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayRepository;", "Lru/ozon/app/android/payment/domain/createorder/busevents/OrderTrackingBus;", "Lru/ozon/app/android/checkoutgeo/payment/GooglePayManager;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayAnalytics;", "LAe/x0;", "", "_isHideProgressBar", "LAe/x0;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewState;", "mutableViewState", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "singleViewEffects", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState;", "vmState", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModelState;", "cancelLinkProcessor", "Lru/ozon/app/android/payment/ui/createorder/CancelLinkProcessor;", "Lxe/B0;", "hideProgressJob", "Lxe/B0;", "isLoading", "Z", "isActionInProgress", "ru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$lifecycleObserver$1;", "Landroidx/lifecycle/P;", "getViewState", "()Landroidx/lifecycle/P;", "viewState", "getViewEffects", "viewEffects", "LAe/h;", "isHideProgressBar", "()LAe/h;", "getShouldShowProgressBar", "()Z", "shouldShowProgressBar", "Companion", "CreateAndPayViewEffects", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateAndPayViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final x0<Boolean> _isHideProgressBar;

    @NotNull
    private CancelLinkProcessor cancelLinkProcessor;

    @NotNull
    private final CreateAndPayAnalytics createAndPayAnalytics;

    @NotNull
    private final GooglePayManager googlePayManager;
    private B0 hideProgressJob;
    private boolean isActionInProgress;
    private boolean isLoading;

    @NotNull
    private final CreateAndPayViewModel$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final V<HandledState<CreateAndPayViewState>> mutableViewState;

    @NotNull
    private final OrderTrackingBus orderTrackingBus;

    @NotNull
    private final CreateAndPayRepository repository;

    @NotNull
    private final SingleLiveEvent<CreateAndPayViewEffects> singleViewEffects;

    @NotNull
    private final CreateAndPayViewModelState vmState;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$Companion;", "", "<init>", "()V", "DEFAULT_DURATION_MILLIS", "", "CREATE_ORDER_CANCELLED", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "", "<init>", "()V", "CloseFlow", "RequestGooglePay", "ProcessFastPay", "ProcessSberPay", "Redirect", "Error", "CriticalError", "HandleAction", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$CloseFlow;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$CriticalError;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$Error;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$HandleAction;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$ProcessFastPay;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$ProcessSberPay;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$Redirect;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$RequestGooglePay;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class CreateAndPayViewEffects {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$CloseFlow;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "", "link", "cancelLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getCancelLink", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CloseFlow extends CreateAndPayViewEffects {
            private final String cancelLink;
            private final String link;

            public CloseFlow(String str, String str2) {
                super(null);
                this.link = str;
                this.cancelLink = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CloseFlow)) {
                    return false;
                }
                CloseFlow closeFlow = (CloseFlow) other;
                return Intrinsics.d(this.link, closeFlow.link) && Intrinsics.d(this.cancelLink, closeFlow.cancelLink);
            }

            public final String getCancelLink() {
                return this.cancelLink;
            }

            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                String str = this.link;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.cancelLink;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return e.a("CloseFlow(link=", this.link, ", cancelLink=", this.cancelLink, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$CriticalError;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CriticalError extends CreateAndPayViewEffects {

            @NotNull
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CriticalError(@NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CriticalError) && Intrinsics.d(this.throwable, ((CriticalError) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public String toString() {
                return a.c("CriticalError(throwable=", ")", this.throwable);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$Error;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "", "duration", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "getType", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$OrderError$TYPE;", "Ljava/lang/String;", "getTitle", "getMessage", "Ljava/lang/Long;", "getDuration", "()Ljava/lang/Long;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends CreateAndPayViewEffects {
            private final Long duration;

            @NotNull
            private final String message;
            private final String title;

            @NotNull
            private final OrderDO.OrderError.TYPE type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull OrderDO.OrderError.TYPE type, String str, @NotNull String message, Long l11) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(message, "message");
                this.type = type;
                this.title = str;
                this.message = message;
                this.duration = l11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return this.type == error.type && Intrinsics.d(this.title, error.title) && Intrinsics.d(this.message, error.message) && Intrinsics.d(this.duration, error.duration);
            }

            public final Long getDuration() {
                return this.duration;
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public final String getTitle() {
                return this.title;
            }

            @NotNull
            public final OrderDO.OrderError.TYPE getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.title;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.message);
                Long l11 = this.duration;
                return a11 + (l11 != null ? l11.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Error(type=" + this.type + ", title=" + this.title + ", message=" + this.message + ", duration=" + this.duration + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$HandleAction;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HandleAction extends CreateAndPayViewEffects {

            @NotNull
            private final AtomActionDTO action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandleAction(@NotNull AtomActionDTO action) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleAction) && Intrinsics.d(this.action, ((HandleAction) other).action);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            @NotNull
            public String toString() {
                return C2859b.f("HandleAction(action=", ")", this.action);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$ProcessFastPay;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "", "fastPayLink", "cancelLink", "", "isRedirectBank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFastPayLink", "getCancelLink", "Z", "()Z", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProcessFastPay extends CreateAndPayViewEffects {
            private final String cancelLink;

            @NotNull
            private final String fastPayLink;
            private final boolean isRedirectBank;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProcessFastPay(@NotNull String fastPayLink, String str, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(fastPayLink, "fastPayLink");
                this.fastPayLink = fastPayLink;
                this.cancelLink = str;
                this.isRedirectBank = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProcessFastPay)) {
                    return false;
                }
                ProcessFastPay processFastPay = (ProcessFastPay) other;
                return Intrinsics.d(this.fastPayLink, processFastPay.fastPayLink) && Intrinsics.d(this.cancelLink, processFastPay.cancelLink) && this.isRedirectBank == processFastPay.isRedirectBank;
            }

            public final String getCancelLink() {
                return this.cancelLink;
            }

            @NotNull
            public final String getFastPayLink() {
                return this.fastPayLink;
            }

            public int hashCode() {
                int hashCode = this.fastPayLink.hashCode() * 31;
                String str = this.cancelLink;
                return Boolean.hashCode(this.isRedirectBank) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            /* renamed from: isRedirectBank, reason: from getter */
            public final boolean getIsRedirectBank() {
                return this.isRedirectBank;
            }

            @NotNull
            public String toString() {
                String str = this.fastPayLink;
                String str2 = this.cancelLink;
                return Pk0.a.a(")", C3660k.d("ProcessFastPay(fastPayLink=", str, ", cancelLink=", str2, ", isRedirectBank="), this.isRedirectBank);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$ProcessSberPay;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "", "redirectLink", "link", "cancelLink", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "sberPayInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirectLink", "getLink", "getCancelLink", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "getSberPayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayBySberPay$SberPayInfo;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProcessSberPay extends CreateAndPayViewEffects {
            private final String cancelLink;
            private final String link;
            private final String redirectLink;

            @NotNull
            private final OrderDO.PayBySberPay.SberPayInfo sberPayInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProcessSberPay(String str, String str2, String str3, @NotNull OrderDO.PayBySberPay.SberPayInfo sberPayInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(sberPayInfo, "sberPayInfo");
                this.redirectLink = str;
                this.link = str2;
                this.cancelLink = str3;
                this.sberPayInfo = sberPayInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProcessSberPay)) {
                    return false;
                }
                ProcessSberPay processSberPay = (ProcessSberPay) other;
                return Intrinsics.d(this.redirectLink, processSberPay.redirectLink) && Intrinsics.d(this.link, processSberPay.link) && Intrinsics.d(this.cancelLink, processSberPay.cancelLink) && Intrinsics.d(this.sberPayInfo, processSberPay.sberPayInfo);
            }

            public final String getCancelLink() {
                return this.cancelLink;
            }

            public final String getLink() {
                return this.link;
            }

            public final String getRedirectLink() {
                return this.redirectLink;
            }

            @NotNull
            public final OrderDO.PayBySberPay.SberPayInfo getSberPayInfo() {
                return this.sberPayInfo;
            }

            public int hashCode() {
                String str = this.redirectLink;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.link;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cancelLink;
                return this.sberPayInfo.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                String str = this.redirectLink;
                String str2 = this.link;
                String str3 = this.cancelLink;
                OrderDO.PayBySberPay.SberPayInfo sberPayInfo = this.sberPayInfo;
                StringBuilder d11 = C3660k.d("ProcessSberPay(redirectLink=", str, ", link=", str2, ", cancelLink=");
                d11.append(str3);
                d11.append(", sberPayInfo=");
                d11.append(sberPayInfo);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$Redirect;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "", "redirectLink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirectLink", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Redirect extends CreateAndPayViewEffects {

            @NotNull
            private final String redirectLink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Redirect(@NotNull String redirectLink) {
                super(null);
                Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
                this.redirectLink = redirectLink;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Redirect) && Intrinsics.d(this.redirectLink, ((Redirect) other).redirectLink);
            }

            @NotNull
            public final String getRedirectLink() {
                return this.redirectLink;
            }

            public int hashCode() {
                return this.redirectLink.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Redirect(redirectLink=", this.redirectLink, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects$RequestGooglePay;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel$CreateAndPayViewEffects;", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "googlePayInfo", "<init>", "(Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "getGooglePayInfo", "()Lru/ozon/app/android/checkoutgeo/payment/sberpay/OrderDO$PayByNative$NativePaymentInfo;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestGooglePay extends CreateAndPayViewEffects {

            @NotNull
            private final OrderDO.PayByNative.NativePaymentInfo googlePayInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestGooglePay(@NotNull OrderDO.PayByNative.NativePaymentInfo googlePayInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(googlePayInfo, "googlePayInfo");
                this.googlePayInfo = googlePayInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequestGooglePay) && Intrinsics.d(this.googlePayInfo, ((RequestGooglePay) other).googlePayInfo);
            }

            @NotNull
            public final OrderDO.PayByNative.NativePaymentInfo getGooglePayInfo() {
                return this.googlePayInfo;
            }

            public int hashCode() {
                return this.googlePayInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "RequestGooglePay(googlePayInfo=" + this.googlePayInfo + ")";
            }
        }

        public /* synthetic */ CreateAndPayViewEffects(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CreateAndPayViewEffects() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$lifecycleObserver$1] */
    public CreateAndPayViewModel(@NotNull CreateAndPayRepository repository, @NotNull OrderTrackingBus orderTrackingBus, @NotNull GooglePayManager googlePayManager, @NotNull CreateAndPayAnalytics createAndPayAnalytics) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(orderTrackingBus, "orderTrackingBus");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(createAndPayAnalytics, "createAndPayAnalytics");
        this.repository = repository;
        this.orderTrackingBus = orderTrackingBus;
        this.googlePayManager = googlePayManager;
        this.createAndPayAnalytics = createAndPayAnalytics;
        this._isHideProgressBar = O0.a(Boolean.FALSE);
        this.mutableViewState = new V<>();
        this.singleViewEffects = new SingleLiveEvent<>();
        this.vmState = new CreateAndPayViewModelState();
        this.cancelLinkProcessor = new DefaultCancelLinkProcessor();
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                boolean z11;
                Intrinsics.checkNotNullParameter(owner, "owner");
                z11 = CreateAndPayViewModel.this.isActionInProgress;
                if (z11) {
                    OzonLogger.DefaultImpls.logEvent$default(BxLogger.INSTANCE, "create_order_canceled", null, null, 5, 6, null);
                }
            }
        };
    }

    private final void cancelAndSendCloseFlow() {
        sendCloseFlow$default(this, this.vmState.getLastCancelLink(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelJobHideProgress() {
        this._isHideProgressBar.setValue(Boolean.FALSE);
        B0 b02 = this.hideProgressJob;
        if (b02 == null || !b02.isActive()) {
            return;
        }
        b02.j(null);
    }

    private final String convert3dsUrl(String url) {
        String uri = LinkGenerator.payment$default(LinkGenerator.INSTANCE, url, null, 2, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    public static /* synthetic */ void createOrder$default(CreateAndPayViewModel createAndPayViewModel, String str, c cVar, HighLoadProgressBar highLoadProgressBar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            highLoadProgressBar = null;
        }
        createAndPayViewModel.createOrder(str, cVar, highLoadProgressBar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createOrderV2$default(CreateAndPayViewModel createAndPayViewModel, String str, c cVar, Map map, HighLoadProgressBar highLoadProgressBar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cVar = createAndPayViewModel.vmState.getLastTrackingData();
        }
        if ((i11 & 4) != 0) {
            map = null;
        }
        if ((i11 & 8) != 0) {
            highLoadProgressBar = createAndPayViewModel.vmState.getLastProgressBar();
        }
        createAndPayViewModel.createOrderV2(str, cVar, map, highLoadProgressBar);
    }

    private final boolean getShouldShowProgressBar() {
        return this.vmState.getLastProgressBar() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomActionDTO action) {
        this.singleViewEffects.postValue(new CreateAndPayViewEffects.HandleAction(action));
    }

    private final void handlePaymentSuccess(PaymentData paymentData) {
        String json = paymentData.toJson();
        if (json == null) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$handlePaymentSuccess$1(this, json, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading(Function0<Unit> afterComplete) {
        this.isLoading = false;
        if (getShouldShowProgressBar()) {
            withHideProgressBar(new CreateAndPayViewModel$hideLoading$1(afterComplete));
        } else {
            sendHideLoader();
            afterComplete.invoke();
        }
    }

    private final void internalCreateOrder(String actionName, c trackingData) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$internalCreateOrder$1(this, actionName, trackingData, null), 3);
    }

    private final void internalCreateOrderV2(String actionName, c trackingData, Map<String, String> body) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$internalCreateOrderV2$1(this, actionName, trackingData, body, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<Boolean> isHideProgressBar() {
        return this._isHideProgressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processAuthorizeResponse(AuthorizePaymentDO authorizeDO) {
        String redirect3dsUrl = authorizeDO.getRedirect3dsUrl();
        String str = null;
        if (redirect3dsUrl != null) {
            if (h.K(redirect3dsUrl)) {
                redirect3dsUrl = null;
            }
            if (redirect3dsUrl != null) {
                str = convert3dsUrl(redirect3dsUrl);
            }
        }
        sendCloseFlow(str, this.vmState.getLastCancelLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOrderCreated(OrderDO response) {
        sendOnOrderCreated();
        if (response instanceof OrderDO.PayByNative) {
            sendRequestGooglePay((OrderDO.PayByNative) response);
        } else if (response instanceof OrderDO.PayBySberPay) {
            sendProcessSberPay((OrderDO.PayBySberPay) response);
        } else if (response instanceof OrderDO.PayByFastPay) {
            sendProcessFastPay((OrderDO.PayByFastPay) response);
        } else if (response instanceof OrderDO.PayByOther) {
            OrderDO.PayByOther payByOther = (OrderDO.PayByOther) response;
            sendCloseFlow(payByOther.getLink(), this.cancelLinkProcessor.transform(payByOther.getCancelLink()));
        } else if (response instanceof OrderDO.OrderRedirect) {
            sendRedirect((OrderDO.OrderRedirect) response);
        } else if (response instanceof OrderDO.OrderError) {
            sendError((OrderDO.OrderError) response);
        } else {
            if (!(response instanceof OrderDO.WithAction)) {
                throw new o();
            }
            handleAction(((OrderDO.WithAction) response).getAction());
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOrderV2Error(Throwable throwable) {
        this.isActionInProgress = false;
        sendHideLoader();
        sendCriticalError(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processOrderV2Response(CreateOrderV2Response response) {
        if (response.getCreateOrderResponse() != null) {
            this.isActionInProgress = false;
            hideLoading(new CreateAndPayViewModel$processOrderV2Response$1(this, CreateAndPayModelsKt.toDO(response.getCreateOrderResponse())));
        } else if (response.getPoolingDetails() != null) {
            processPooling(response.getPoolingDetails());
        }
    }

    private final void processPooling(CreateOrderV2Response.Pooling poolingDetails) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$processPooling$1(poolingDetails, this, null), 3);
    }

    private final void sendCloseFlow(String link, String cancelLink) {
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.CloseFlow(link, cancelLink));
    }

    static /* synthetic */ void sendCloseFlow$default(CreateAndPayViewModel createAndPayViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        createAndPayViewModel.sendCloseFlow(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCriticalError(Throwable error) {
        Lm0.a.f17149a.e(error);
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.CriticalError(error));
    }

    private final void sendError(OrderDO.OrderError error) {
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.Error(error.getType(), error.getTitle(), error.getMessage(), error.getDuration()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHideLoader() {
        this.mutableViewState.setValue(new OneTimeHandledState(CreateAndPayViewState.HideLoading.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendHideProgressBar() {
        this.vmState.setLastProgressBar(null);
        this.mutableViewState.setValue(new OneTimeHandledState(CreateAndPayViewState.HighLoadProgressBar.Hide.INSTANCE));
    }

    private final void sendOnOrderCreated() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$sendOnOrderCreated$1(this, null), 3);
    }

    private final void sendProcessFastPay(OrderDO.PayByFastPay response) {
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.ProcessFastPay(response.getExternalLink(), response.getCancelLink(), response.getIsRedirectBank()));
        sendShowLoader(new l.a.C1079a(0L, null, 2));
    }

    private final void sendProcessSberPay(OrderDO.PayBySberPay payInfo) {
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.ProcessSberPay(payInfo.getRedirectLink(), payInfo.getLink(), payInfo.getCancelLink(), payInfo.getSberPayInfo()));
    }

    private final void sendRedirect(OrderDO.OrderRedirect response) {
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.Redirect(response.getRedirectLink()));
    }

    private final void sendRequestGooglePay(OrderDO.PayByNative payInfo) {
        this.vmState.setLastGooglePayInfo(payInfo.getNativePaymentInfo());
        this.vmState.setLastCancelLink(payInfo.getCancelLink());
        this.singleViewEffects.setValue(new CreateAndPayViewEffects.RequestGooglePay(payInfo.getNativePaymentInfo()));
    }

    private final void sendShowLoader(l.a type) {
        this.mutableViewState.setValue(new UsualHandledState(new CreateAndPayViewState.ShowLoading(type)));
    }

    static /* synthetic */ void sendShowLoader$default(CreateAndPayViewModel createAndPayViewModel, l.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new l.a.b(0L, null, 3);
        }
        createAndPayViewModel.sendShowLoader(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendShowProgressBar() {
        this.mutableViewState.setValue(new UsualHandledState(CreateAndPayViewState.HighLoadProgressBar.Show.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        if (this.isLoading) {
            return;
        }
        if (getShouldShowProgressBar()) {
            sendShowProgressBar();
        } else {
            sendShowLoader$default(this, null, 1, null);
        }
        this.isLoading = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withHideProgressBar(Function0<Unit> afterComplete) {
        cancelJobHideProgress();
        this.hideProgressJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$withHideProgressBar$1(this, afterComplete, null), 3);
    }

    public final void createOrder(@NotNull String actionName, @NotNull c trackingData, HighLoadProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.isActionInProgress = true;
        this.vmState.setLastActionName(actionName);
        this.vmState.setLastProgressBar(progressBar);
        this.vmState.setLastTrackingData(trackingData);
        if (progressBar == null) {
            internalCreateOrder(actionName, trackingData);
        } else {
            internalCreateOrder(actionName, trackingData, progressBar);
        }
    }

    public final void createOrderV2(@NotNull String actionName, @NotNull c trackingData, Map<String, String> body, HighLoadProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.isActionInProgress = true;
        this.vmState.setLastActionName(actionName);
        this.vmState.setLastProgressBar(progressBar);
        this.vmState.setLastTrackingData(trackingData);
        internalCreateOrderV2(actionName, trackingData, body);
    }

    @NotNull
    public final P<CreateAndPayViewEffects> getViewEffects() {
        return this.singleViewEffects;
    }

    @NotNull
    public final P<HandledState<CreateAndPayViewState>> getViewState() {
        return this.mutableViewState;
    }

    public final void hideProgressBar() {
        this._isHideProgressBar.setValue(Boolean.TRUE);
    }

    public final void initAnalytics(@NotNull Sg.a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.createAndPayAnalytics.init(analyticsScreenStorage);
    }

    public final void loadState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.vmState.loadState(bundle);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        ProcessLifecycleOwner processLifecycleOwner;
        super.onCleared();
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().e(this.lifecycleObserver);
    }

    public final void onGooglePayResult(int resultCode, Intent data) {
        Unit unit;
        if (resultCode == -1) {
            if (data != null) {
                PaymentData fromIntent = PaymentData.getFromIntent(data);
                if (fromIntent != null) {
                    handlePaymentSuccess(fromIntent);
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
            }
            cancelAndSendCloseFlow();
            return;
        }
        if (resultCode == 0) {
            this.createAndPayAnalytics.sendGooglePayCanceledEvent();
            cancelAndSendCloseFlow();
        } else {
            if (resultCode != 1) {
                return;
            }
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(data);
            if (statusFromIntent != null) {
                LoggerExtKt.sendNonFatal$default(null, Nk.a.b("OnGooglePayResult error ", NativePaymentErrorModel.INSTANCE.fromValue(Integer.valueOf(statusFromIntent.getStatusCode())).name()), "GOOGLE_PAY_RESULT_ERROR", null, 9, null);
            }
            cancelAndSendCloseFlow();
        }
    }

    public final void pay(@NotNull String actionName, @NotNull Map<String, String> body, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.vmState.setLastActionName(actionName);
        this.vmState.setLastTrackingData(trackingData);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$pay$1(this, actionName, trackingData, body, null), 3);
    }

    public final void retryCreateOrder() {
        String lastActionName = this.vmState.getLastActionName();
        if (lastActionName == null) {
            return;
        }
        if (lastActionName.equals("createOrder")) {
            createOrder(lastActionName, this.vmState.getLastTrackingData(), this.vmState.getLastProgressBar());
        } else if (lastActionName.equals("createOrderV2")) {
            createOrderV2$default(this, lastActionName, this.vmState.getLastTrackingData(), null, this.vmState.getLastProgressBar(), 4, null);
        }
    }

    public final void saveState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.vmState.saveState(bundle);
    }

    public final void setCancelLinkProcessor(@NotNull CancelLinkProcessor newCancelLinkProcessor) {
        Intrinsics.checkNotNullParameter(newCancelLinkProcessor, "newCancelLinkProcessor");
        this.cancelLinkProcessor = newCancelLinkProcessor;
    }

    public final void subscribeToAppTerminated() {
        ProcessLifecycleOwner processLifecycleOwner;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(this.lifecycleObserver);
    }

    private final void internalCreateOrder(String actionName, c trackingData, HighLoadProgressBar item) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new CreateAndPayViewModel$internalCreateOrder$2(this, actionName, trackingData, item, null), 3);
    }
}
