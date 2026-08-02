package ru.ozon.fintech.features.finwebview.ui;

import Ae.w0;
import B0.A0;
import B90.h0;
import C.D;
import C90.d;
import Ca.s;
import D90.g;
import L60.e;
import L60.h;
import Le.InterfaceC3583a;
import Me.f;
import Oe.C3687f;
import Oe.G;
import Oe.K;
import Oe.N;
import Oe.T;
import Oe.W;
import Oe.Z;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.r;
import Sc.v;
import Xc.a;
import a5.C4945c;
import a5.C4947e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.fragment.app.r;
import androidx.lifecycle.I;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

@Keep
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ¾\u00012\u00020\u00012\u00020\u0002:\b¿\u0001À\u0001Á\u0001Â\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010\"J\u0015\u0010(\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b(\u0010\"J\r\u0010)\u001a\u00020\u0010¢\u0006\u0004\b)\u0010\u001cJ\r\u0010*\u001a\u00020\u0010¢\u0006\u0004\b*\u0010\u001cJ\u001f\u0010.\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0013H\u0007¢\u0006\u0004\b.\u0010/J%\u00103\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00132\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u000101¢\u0006\u0004\b3\u00104J)\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001306j\b\u0012\u0004\u0012\u00020\u0013`705¢\u0006\u0004\b8\u00109J%\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130;0:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000b¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0010¢\u0006\u0004\bE\u0010\u001cJ\u0015\u0010H\u001a\u00020\u00102\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u0004\u0018\u00010F¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0010¢\u0006\u0004\bL\u0010\u001cJ\u000f\u0010M\u001a\u00020\u0010H\u0002¢\u0006\u0004\bM\u0010\u001cJ\u0017\u0010M\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00102\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ9\u0010X\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00132\u0006\u0010V\u001a\u00020U2\b\u0010W\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010[\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020ZH\u0002¢\u0006\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010fR\u001e\u0010h\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010^R$\u0010k\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010d\u001a\u0004\bl\u0010\u001e\"\u0004\bm\u0010\"R>\u0010o\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR0\u0010v\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R9\u0010}\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R>\u0010\u0085\u0001\u001a\u0018\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u0010\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010~\u001a\u0006\b\u0086\u0001\u0010\u0080\u0001\"\u0006\b\u0087\u0001\u0010\u0082\u0001RB\u0010\u0089\u0001\u001a\u001c\u0012\u0007\u0012\u0005\u0018\u00010\u0083\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0088\u0001\u0012\u0004\u0012\u00020\u0010\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0089\u0001\u0010~\u001a\u0006\b\u008a\u0001\u0010\u0080\u0001\"\u0006\b\u008b\u0001\u0010\u0082\u0001R4\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010w\u001a\u0005\b\u008d\u0001\u0010y\"\u0005\b\u008e\u0001\u0010{RE\u0010\u0090\u0001\u001a!\u0012\u0004\u0012\u00020\u0013\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010p\u001a\u0005\b\u0091\u0001\u0010r\"\u0005\b\u0092\u0001\u0010tR4\u0010\u0093\u0001\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010w\u001a\u0005\b\u0094\u0001\u0010y\"\u0005\b\u0095\u0001\u0010{RK\u0010\u0099\u0001\u001a%\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u000101\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u0010\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0099\u0001\u0010~\u001a\u0006\b\u009a\u0001\u0010\u0080\u0001\"\u0006\b\u009b\u0001\u0010\u0082\u0001R6\u0010\u009c\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010w\u001a\u0005\b\u009d\u0001\u0010y\"\u0005\b\u009e\u0001\u0010{R5\u0010 \u0001\u001a\u0011\u0012\u0005\u0012\u00030\u009f\u0001\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010w\u001a\u0005\b¡\u0001\u0010y\"\u0005\b¢\u0001\u0010{R6\u0010£\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010w\u001a\u0005\b¤\u0001\u0010y\"\u0005\b¥\u0001\u0010{R5\u0010§\u0001\u001a\u0011\u0012\u0005\u0012\u00030¦\u0001\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010w\u001a\u0005\b¨\u0001\u0010y\"\u0005\b©\u0001\u0010{R4\u0010ª\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010w\u001a\u0005\b«\u0001\u0010y\"\u0005\b¬\u0001\u0010{R0\u0010®\u0001\u001a\u0005\u0018\u00010\u009f\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R,\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R!\u0010½\u0001\u001a\u00030\u008f\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001¨\u0006Ã\u0001"}, d2 = {"Lru/ozon/fintech/features/finwebview/ui/FintechWebView;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/I;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeBridgeConfigurator;", "nativeBridgeConfigurator", "", "configure", "(Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeBridgeConfigurator;)V", "", ImagesContract.URL, "replace", "goSpa", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "includeDiskFiles", "clearCache", "(Z)V", "reloadUrl", "()V", "getUrl", "()Ljava/lang/String;", "stopLoading", "data", "loadDataWithBaseURL", "(Ljava/lang/String;)V", "clearHistory", "loadUrl", "(Ljava/lang/String;Z)V", "from", "onResume", "onPause", "onStart", "onStop", "", "jsInterface", AppMeasurementSdk.ConditionalUserProperty.NAME, "addJavascriptInterface", "(Ljava/lang/Object;Ljava/lang/String;)V", "script", "Landroid/webkit/ValueCallback;", "resultCallback", "evaluateJavascript", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getNativeBridgeNames", "()Ljava/util/Map;", "LAe/w0;", "LSc/v;", "observeCallbacks", "()LAe/w0;", "canGoBack", "()Z", "goBack", "()Lkotlin/Unit;", "Landroid/webkit/WebBackForwardList;", "copyBackForwardList", "()Landroid/webkit/WebBackForwardList;", "resetToFirst", "Landroidx/fragment/app/r;", "fragmentActivity", "setParentFragmentActivity", "(Landroidx/fragment/app/r;)V", "getParentFragmentActivity", "()Landroidx/fragment/app/r;", "onDestroy", "createAndAddWebView", "(Landroid/content/Context;)V", "LM60/c;", "client", "attachWebViewClient", "(LM60/c;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "contentDisposition", "", "length", "mimeType", "onDownloadListenerCalled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "Lru/ozon/fintech/features/finwebview/ui/FintechWebView$c;", "configureNativeBridge", "(Ljava/lang/String;Lru/ozon/fintech/features/finwebview/ui/FintechWebView$c;)V", "isEdgeSwipe", "Z", "", "startX", "F", "startY", "clearHistoryUrl", "Ljava/lang/String;", "curTitle", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeBridgeConfigurator;", "Ljava/lang/ref/WeakReference;", "parentActivityWeakRef", "Ljava/lang/ref/WeakReference;", "isDestroyed", "tabId", "getTabId", "setTabId", "Lkotlin/Function3;", "onUpdateVisitedHistory", "Lfd/n;", "getOnUpdateVisitedHistory", "()Lfd/n;", "setOnUpdateVisitedHistory", "(Lfd/n;)V", "Lkotlin/Function1;", "onPageLoadingStarted", "Lkotlin/jvm/functions/Function1;", "getOnPageLoadingStarted", "()Lkotlin/jvm/functions/Function1;", "setOnPageLoadingStarted", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "onPageLoadingFinished", "Lkotlin/jvm/functions/Function2;", "getOnPageLoadingFinished", "()Lkotlin/jvm/functions/Function2;", "setOnPageLoadingFinished", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/webkit/WebResourceRequest;", "Landroid/webkit/WebResourceError;", "onErrorReceived", "getOnErrorReceived", "setOnErrorReceived", "Landroid/webkit/WebResourceResponse;", "onHttpErrorReceived", "getOnHttpErrorReceived", "setOnHttpErrorReceived", "onRedirectUrlListener", "getOnRedirectUrlListener", "setOnRedirectUrlListener", "", "onWebViewJsErrorListener", "getOnWebViewJsErrorListener", "setOnWebViewJsErrorListener", "onPermissionRequestStatusListener", "getOnPermissionRequestStatusListener", "setOnPermissionRequestStatusListener", "", "Landroid/net/Uri;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "onShowFileChooserListener", "getOnShowFileChooserListener", "setOnShowFileChooserListener", "onReceiveTitleListener", "getOnReceiveTitleListener", "setOnReceiveTitleListener", "Landroid/webkit/WebView;", "onWebViewCreated", "getOnWebViewCreated", "setOnWebViewCreated", "onLoadResource", "getOnLoadResource", "setOnLoadResource", "Lru/ozon/fintech/features/finwebview/ui/FintechWebView$b;", "onCreateErrorReceived", "getOnCreateErrorReceived", "setOnCreateErrorReceived", "onRenderProcessGoneListener", "getOnRenderProcessGoneListener", "setOnRenderProcessGoneListener", AppMeasurementSdk.ConditionalUserProperty.VALUE, "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Landroid/widget/Button;", "reloadButt", "Landroid/widget/Button;", "getReloadButt", "()Landroid/widget/Button;", "setReloadButt", "(Landroid/widget/Button;)V", "screenEdge$delegate", "LSc/j;", "getScreenEdge", "()I", "screenEdge", "Companion", "a", "c", "b", "ObankNav", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechWebView extends FrameLayout implements I {
    private static final boolean ACCEPT_THIRD_PARTY_COOKIES = false;
    private static final int DEFAULT_EDGE_WIDTH = D.d(30);
    private static final int DEFAULT_TEXT_ZOOM = 100;

    @NotNull
    private static final String NO_WEB_VIEW_EXCEPTION_MESSAGE = "No WebView installed";

    @NotNull
    private static final String TAG = "FintechWebView";
    private static final int TOP_VIEW_INDEX = 0;
    private boolean clearHistory;
    private String clearHistoryUrl;
    private String curTitle;
    private boolean isDestroyed;
    private boolean isEdgeSwipe;
    private NativeBridgeConfigurator nativeBridgeConfigurator;
    private Function1<? super b, Unit> onCreateErrorReceived;
    private Function2<? super WebResourceRequest, ? super WebResourceError, Unit> onErrorReceived;
    private Function2<? super WebResourceRequest, ? super WebResourceResponse, Unit> onHttpErrorReceived;
    private Function1<? super String, Unit> onLoadResource;
    private Function2<? super String, ? super Boolean, Unit> onPageLoadingFinished;
    private Function1<? super String, Unit> onPageLoadingStarted;
    private Function1<Object, Unit> onPermissionRequestStatusListener;
    private Function1<? super String, Unit> onReceiveTitleListener;
    private Function1<? super String, Boolean> onRedirectUrlListener;
    private Function1<? super Boolean, Unit> onRenderProcessGoneListener;
    private Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener;
    private InterfaceC6511n<? super String, ? super Boolean, ? super Boolean, Unit> onUpdateVisitedHistory;
    private Function1<? super WebView, Unit> onWebViewCreated;
    private InterfaceC6511n<? super String, ? super Integer, ? super String, Unit> onWebViewJsErrorListener;
    private WeakReference<r> parentActivityWeakRef;
    private Button reloadButt;

    /* renamed from: screenEdge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenEdge;
    private float startX;
    private float startY;
    private String tabId;
    private WebView webView;

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav;", "", "Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;", ProductAction.ACTION_DETAIL, "<init>", "(Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;)V", "", "seen0", "LOe/W;", "serializationConstructorMarker", "(ILru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;LOe/W;)V", "self", "LNe/b;", "output", "LMe/f;", "serialDesc", "", "write$Self$finwebview_prodRelease", "(Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav;LNe/b;LMe/f;)V", "write$Self", "component1", "()Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;", "copy", "(Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;)Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;", "getDetail", "Companion", "Detail", "a", "b", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ObankNav {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(0);

        @NotNull
        private final Detail detail;

        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;", "", "", ImagesContract.URL, "", "replace", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "LOe/W;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;LOe/W;)V", "self", "LNe/b;", "output", "LMe/f;", "serialDesc", "", "write$Self$finwebview_prodRelease", "(Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;LNe/b;LMe/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/fintech/features/finwebview/ui/FintechWebView$ObankNav$Detail;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Ljava/lang/Boolean;", "getReplace", "Companion", "a", "b", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Detail {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(0);
            private final Boolean replace;

            @NotNull
            private final String url;

            @InterfaceC3999a
            public /* synthetic */ class a implements Oe.r<Detail> {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final a f95659a;

                @NotNull
                private static final f descriptor;

                static {
                    a aVar = new a();
                    f95659a = aVar;
                    N n11 = new N("Detail", aVar, 2);
                    n11.j(ImagesContract.URL, false);
                    n11.j("replace", false);
                    descriptor = n11;
                }

                @Override // Oe.r
                @NotNull
                public final InterfaceC3583a<?>[] a() {
                    InterfaceC3583a interfaceC3583a = C3687f.f20290a;
                    Intrinsics.checkNotNullParameter(interfaceC3583a, "<this>");
                    if (!((T) interfaceC3583a.b()).b()) {
                        interfaceC3583a = new G(interfaceC3583a);
                    }
                    return new InterfaceC3583a[]{Z.f20279a, interfaceC3583a};
                }

                @Override // Le.f
                @NotNull
                public final f b() {
                    return descriptor;
                }

                @Override // Le.f
                public final void c(Ne.a encoder, Object obj) {
                    Detail value = (Detail) obj;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    f fVar = descriptor;
                    Ne.b e11 = encoder.e(fVar);
                    Detail.write$Self$finwebview_prodRelease(value, e11, fVar);
                    e11.B(fVar);
                }
            }

            /* renamed from: ru.ozon.fintech.features.finwebview.ui.FintechWebView$ObankNav$Detail$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final InterfaceC3583a<Detail> serializer() {
                    return a.f95659a;
                }

                public /* synthetic */ Companion(int i11) {
                    this();
                }
            }

            public /* synthetic */ Detail(int i11, String str, Boolean bool, W w11) {
                if (3 != (i11 & 3)) {
                    K.a(i11, 3, a.f95659a.b());
                    throw null;
                }
                this.url = str;
                this.replace = bool;
            }

            public static /* synthetic */ Detail copy$default(Detail detail, String str, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = detail.url;
                }
                if ((i11 & 2) != 0) {
                    bool = detail.replace;
                }
                return detail.copy(str, bool);
            }

            public static final /* synthetic */ void write$Self$finwebview_prodRelease(Detail self, Ne.b output, f serialDesc) {
                output.k(serialDesc, 0, self.url);
                output.t(serialDesc, 1, C3687f.f20290a, self.replace);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getReplace() {
                return this.replace;
            }

            @NotNull
            public final Detail copy(@NotNull String url, Boolean replace) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Detail(url, replace);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Detail)) {
                    return false;
                }
                Detail detail = (Detail) other;
                return Intrinsics.d(this.url, detail.url) && Intrinsics.d(this.replace, detail.replace);
            }

            public final Boolean getReplace() {
                return this.replace;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                Boolean bool = this.replace;
                return hashCode + (bool == null ? 0 : bool.hashCode());
            }

            @NotNull
            public String toString() {
                return "Detail(url=" + this.url + ", replace=" + this.replace + ")";
            }

            public Detail(@NotNull String url, Boolean bool) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.replace = bool;
            }
        }

        @InterfaceC3999a
        public /* synthetic */ class a implements Oe.r<ObankNav> {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f95660a;

            @NotNull
            private static final f descriptor;

            static {
                a aVar = new a();
                f95660a = aVar;
                N n11 = new N("ObankNav", aVar, 1);
                n11.j(ProductAction.ACTION_DETAIL, false);
                descriptor = n11;
            }

            @Override // Oe.r
            @NotNull
            public final InterfaceC3583a<?>[] a() {
                return new InterfaceC3583a[]{Detail.a.f95659a};
            }

            @Override // Le.f
            @NotNull
            public final f b() {
                return descriptor;
            }

            @Override // Le.f
            public final void c(Ne.a encoder, Object obj) {
                ObankNav value = (ObankNav) obj;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                f fVar = descriptor;
                Ne.b e11 = encoder.e(fVar);
                ObankNav.write$Self$finwebview_prodRelease(value, e11, fVar);
                e11.B(fVar);
            }
        }

        /* renamed from: ru.ozon.fintech.features.finwebview.ui.FintechWebView$ObankNav$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final InterfaceC3583a<ObankNav> serializer() {
                return a.f95660a;
            }

            public /* synthetic */ Companion(int i11) {
                this();
            }
        }

        public /* synthetic */ ObankNav(int i11, Detail detail, W w11) {
            if (1 == (i11 & 1)) {
                this.detail = detail;
            } else {
                K.a(i11, 1, a.f95660a.b());
                throw null;
            }
        }

        public static /* synthetic */ ObankNav copy$default(ObankNav obankNav, Detail detail, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                detail = obankNav.detail;
            }
            return obankNav.copy(detail);
        }

        public static final /* synthetic */ void write$Self$finwebview_prodRelease(ObankNav self, Ne.b output, f serialDesc) {
            output.u(serialDesc, 0, Detail.a.f95659a, self.detail);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Detail getDetail() {
            return this.detail;
        }

        @NotNull
        public final ObankNav copy(@NotNull Detail detail) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new ObankNav(detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ObankNav) && Intrinsics.d(this.detail, ((ObankNav) other).detail);
        }

        @NotNull
        public final Detail getDetail() {
            return this.detail;
        }

        public int hashCode() {
            return this.detail.hashCode();
        }

        @NotNull
        public String toString() {
            return "ObankNav(detail=" + this.detail + ")";
        }

        public ObankNav(@NotNull Detail detail) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.detail = detail;
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Exception f95661a;

        public static final class a extends b {
        }

        /* renamed from: ru.ozon.fintech.features.finwebview.ui.FintechWebView$b$b, reason: collision with other inner class name */
        public static final class C2037b extends b {
        }

        public b(Exception exc) {
            this.f95661a = exc;
        }

        @NotNull
        public final Exception a() {
            return this.f95661a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c ON_PAGE_COMMIT_VISIBLE;
        public static final c ON_PAGE_STARTED;

        static {
            c cVar = new c("ON_PAGE_STARTED", 0);
            ON_PAGE_STARTED = cVar;
            c cVar2 = new c("ON_PAGE_COMMIT_VISIBLE", 1);
            ON_PAGE_COMMIT_VISIBLE = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FintechWebView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void attachWebViewClient(M60.c client) {
        int i11 = 1;
        client.l(new g(this, i11));
        client.i(new F90.c(this, i11));
        client.g(new h0(this, 2));
        client.n(new e(this));
        client.h(new L60.f(this, 0));
        client.j(new L60.g(this));
        client.k(new h(this));
        client.f(new d(this, 3));
        client.m(new s(this, 1));
        WebView webView = this.webView;
        if (webView != null) {
            webView.setWebViewClient(client);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachWebViewClient$lambda$21$lambda$12(FintechWebView fintechWebView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Function1<? super String, Boolean> function1 = fintechWebView.onRedirectUrlListener;
        if (function1 != null) {
            return function1.invoke(url).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$13(FintechWebView fintechWebView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("SCRIPTSSS", "setOnPageLoadStartedListener url=" + url);
        fintechWebView.configureNativeBridge(url, c.ON_PAGE_STARTED);
        Function1<? super String, Unit> function1 = fintechWebView.onPageLoadingStarted;
        if (function1 != null) {
            function1.invoke(url);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$14(FintechWebView fintechWebView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("SCRIPTSSS", "setOnPageCommitVisibleListener url=" + url);
        fintechWebView.configureNativeBridge(url, c.ON_PAGE_COMMIT_VISIBLE);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$15(FintechWebView fintechWebView, String str, boolean z11, boolean z12) {
        InterfaceC6511n<? super String, ? super Boolean, ? super Boolean, Unit> interfaceC6511n = fintechWebView.onUpdateVisitedHistory;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(str, Boolean.valueOf(z11), Boolean.valueOf(z12));
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$16(FintechWebView fintechWebView, String url, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (fintechWebView.clearHistory && Intrinsics.d(url, fintechWebView.clearHistoryUrl)) {
            fintechWebView.clearHistory = false;
            fintechWebView.clearHistoryUrl = null;
            WebView webView = fintechWebView.webView;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        Function2<? super String, ? super Boolean, Unit> function2 = fintechWebView.onPageLoadingFinished;
        if (function2 != null) {
            function2.invoke(url, Boolean.valueOf(z11));
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$17(FintechWebView fintechWebView, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        Function2<? super WebResourceRequest, ? super WebResourceError, Unit> function2 = fintechWebView.onErrorReceived;
        if (function2 != null) {
            function2.invoke(request, error);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$18(FintechWebView fintechWebView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Function2<? super WebResourceRequest, ? super WebResourceResponse, Unit> function2 = fintechWebView.onHttpErrorReceived;
        if (function2 != null) {
            function2.invoke(webResourceRequest, webResourceResponse);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$19(FintechWebView fintechWebView, String str) {
        Function1<? super String, Unit> function1 = fintechWebView.onLoadResource;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachWebViewClient$lambda$21$lambda$20(FintechWebView fintechWebView, boolean z11) {
        Function1<? super Boolean, Unit> function1 = fintechWebView.onRenderProcessGoneListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$6$lambda$4$lambda$1(FintechWebView fintechWebView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(valueCallback, "valueCallback");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> function2 = fintechWebView.onShowFileChooserListener;
        if (function2 != null) {
            function2.invoke(valueCallback, fileChooserParams);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$6$lambda$4$lambda$2(FintechWebView fintechWebView, String str) {
        fintechWebView.curTitle = str;
        Function1<? super String, Unit> function1 = fintechWebView.onReceiveTitleListener;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$6$lambda$4$lambda$3(FintechWebView fintechWebView, String error, Integer num, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC6511n<? super String, ? super Integer, ? super String, Unit> interfaceC6511n = fintechWebView.onWebViewJsErrorListener;
        if (interfaceC6511n != null) {
            interfaceC6511n.invoke(error, num, str);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$6$lambda$5(FintechWebView fintechWebView, String str, String str2, String str3, String str4, long j11) {
        String str5 = fintechWebView.curTitle;
        if (str5 == null) {
            str5 = "";
        }
        Intrinsics.f(str);
        Intrinsics.f(str3);
        fintechWebView.onDownloadListenerCalled(str5, str, str3, j11, str4);
    }

    private final void configureNativeBridge(String url, c from) {
        StringBuilder sb2 = new StringBuilder();
        WebView webView = this.webView;
        Fj.c.f("webView?.url= ", webView != null ? webView.getUrl() : null, " ", sb2);
        NativeBridgeConfigurator nativeBridgeConfigurator = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator == null) {
            Intrinsics.n("nativeBridgeConfigurator");
            throw null;
        }
        sb2.append("isNativeBridgeOn=" + nativeBridgeConfigurator.N());
        NativeBridgeConfigurator nativeBridgeConfigurator2 = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator2 == null) {
            Intrinsics.n("nativeBridgeConfigurator");
            throw null;
        }
        if (nativeBridgeConfigurator2.C(url)) {
            L80.a.a(TAG, "defineNativeBridge " + ((Object) sb2) + " and put auth header for " + url);
            NativeBridgeConfigurator nativeBridgeConfigurator3 = this.nativeBridgeConfigurator;
            if (nativeBridgeConfigurator3 == null) {
                Intrinsics.n("nativeBridgeConfigurator");
                throw null;
            }
            nativeBridgeConfigurator3.H().d(true);
            NativeBridgeConfigurator nativeBridgeConfigurator4 = this.nativeBridgeConfigurator;
            if (nativeBridgeConfigurator4 != null) {
                nativeBridgeConfigurator4.E(url, from);
                return;
            } else {
                Intrinsics.n("nativeBridgeConfigurator");
                throw null;
            }
        }
        L80.a.a(TAG, "undefineNativeBridge " + ((Object) sb2) + " and restrict auth header for " + url);
        NativeBridgeConfigurator nativeBridgeConfigurator5 = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator5 == null) {
            Intrinsics.n("nativeBridgeConfigurator");
            throw null;
        }
        nativeBridgeConfigurator5.H().d(false);
        NativeBridgeConfigurator nativeBridgeConfigurator6 = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator6 != null) {
            nativeBridgeConfigurator6.g0();
        } else {
            Intrinsics.n("nativeBridgeConfigurator");
            throw null;
        }
    }

    private final void createAndAddWebView() {
        try {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            createAndAddWebView(context);
        } catch (Resources.NotFoundException unused) {
            Context createConfigurationContext = getContext().createConfigurationContext(new Configuration());
            Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
            createAndAddWebView(createConfigurationContext);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null || !kotlin.text.h.t(message, NO_WEB_VIEW_EXCEPTION_MESSAGE, false)) {
                Function1<? super b, Unit> function1 = this.onCreateErrorReceived;
                if (function1 != null) {
                    Intrinsics.checkNotNullParameter(e11, "e");
                    function1.invoke(new b.C2037b(e11));
                    return;
                }
                return;
            }
            Function1<? super b, Unit> function12 = this.onCreateErrorReceived;
            if (function12 != null) {
                Intrinsics.checkNotNullParameter(e11, "e");
                function12.invoke(new b.a(e11));
            }
        }
    }

    public static /* synthetic */ void loadUrl$default(FintechWebView fintechWebView, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        fintechWebView.loadUrl(str, z11);
    }

    private final void onDownloadListenerCalled(String title, String url, String contentDisposition, long length, String mimeType) {
        NativeBridgeConfigurator nativeBridgeConfigurator = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator != null) {
            nativeBridgeConfigurator.G().v0(title, url, length, contentDisposition, mimeType, false, null);
        } else {
            Intrinsics.n("nativeBridgeConfigurator");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int screenEdge_delegate$lambda$0(FintechWebView fintechWebView) {
        int systemGestures;
        Insets insets;
        int i11;
        if (Build.VERSION.SDK_INT < 30) {
            return DEFAULT_EDGE_WIDTH;
        }
        WindowInsets rootWindowInsets = fintechWebView.getRootWindowInsets();
        if (rootWindowInsets != null) {
            systemGestures = WindowInsets.Type.systemGestures();
            insets = rootWindowInsets.getInsets(systemGestures);
            if (insets != null) {
                i11 = insets.left;
                return i11;
            }
        }
        return DEFAULT_EDGE_WIDTH;
    }

    @SuppressLint({"JavascriptInterface"})
    public final void addJavascriptInterface(@NotNull Object jsInterface, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jsInterface, "jsInterface");
        Intrinsics.checkNotNullParameter(name, "name");
        WebView webView = this.webView;
        if (webView != null) {
            webView.addJavascriptInterface(jsInterface, name);
        }
    }

    public final boolean canGoBack() {
        WebView webView = this.webView;
        return webView != null && webView.canGoBack();
    }

    public final void clearCache(boolean includeDiskFiles) {
        WebView webView = this.webView;
        if (webView != null) {
            webView.clearCache(includeDiskFiles);
        }
    }

    public final void configure(@NotNull NativeBridgeConfigurator nativeBridgeConfigurator) {
        Object a11;
        int i11 = 0;
        Intrinsics.checkNotNullParameter(nativeBridgeConfigurator, "nativeBridgeConfigurator");
        if (!nativeBridgeConfigurator.M()) {
            throw new IllegalStateException("Please configure native bridge before, use setCallbacks() method");
        }
        this.nativeBridgeConfigurator = nativeBridgeConfigurator;
        createAndAddWebView();
        WebView webView = this.webView;
        if (webView != null) {
            try {
                r.Companion companion = Sc.r.INSTANCE;
                if (Build.VERSION.SDK_INT < 33 && C4947e.a("FORCE_DARK")) {
                    Context context = webView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    C4945c.a(webView.getSettings(), H30.e.d(context) ? 2 : 0);
                    if (C4947e.a("FORCE_DARK_STRATEGY")) {
                        C4945c.b(webView.getSettings());
                    }
                }
                webView.setHapticFeedbackEnabled(false);
                Intrinsics.checkNotNullParameter(webView, "webView");
                M60.a aVar = new M60.a();
                aVar.b(new Function2() { // from class: L60.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit configure$lambda$6$lambda$4$lambda$1;
                        configure$lambda$6$lambda$4$lambda$1 = FintechWebView.configure$lambda$6$lambda$4$lambda$1(FintechWebView.this, (ValueCallback) obj, (WebChromeClient.FileChooserParams) obj2);
                        return configure$lambda$6$lambda$4$lambda$1;
                    }
                });
                aVar.a(new L60.b(this, i11));
                aVar.c(new InterfaceC6511n() { // from class: L60.c
                    @Override // fd.InterfaceC6511n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit configure$lambda$6$lambda$4$lambda$3;
                        configure$lambda$6$lambda$4$lambda$3 = FintechWebView.configure$lambda$6$lambda$4$lambda$3(FintechWebView.this, (String) obj, (Integer) obj2, (String) obj3);
                        return configure$lambda$6$lambda$4$lambda$3;
                    }
                });
                webView.setWebChromeClient(aVar);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setSupportZoom(false);
                webView.getSettings().setAllowFileAccess(false);
                webView.getSettings().setAllowContentAccess(false);
                webView.getSettings().setDatabaseEnabled(false);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
                webView.getSettings().setMixedContentMode(1);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setTextZoom(100);
                webView.setDownloadListener(new DownloadListener() { // from class: L60.d
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                        FintechWebView.configure$lambda$6$lambda$5(FintechWebView.this, str, str2, str3, str4, j11);
                    }
                });
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.setRendererPriorityPolicy(2, false);
                a11 = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            Object f26106a = Sc.r.a(a11).getF26106a();
            if (f26106a instanceof r.b) {
                L80.a.c(TAG, "webView?.runCatching", Sc.r.b(f26106a));
            }
        }
        nativeBridgeConfigurator.f0(this);
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, false);
        } catch (Throwable unused) {
            L80.a.b(TAG, "can't get instance of CookieManager");
        }
        attachWebViewClient(nativeBridgeConfigurator.H());
    }

    public final WebBackForwardList copyBackForwardList() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.copyBackForwardList();
        }
        return null;
    }

    public final void evaluateJavascript(@NotNull String script, ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        if (this.isDestroyed) {
            return;
        }
        L80.a.a(TAG, script);
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript(script, resultCallback);
        }
    }

    @NotNull
    public final Map<String, ArrayList<String>> getNativeBridgeNames() {
        NativeBridgeConfigurator nativeBridgeConfigurator = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator != null) {
            return nativeBridgeConfigurator.I();
        }
        Intrinsics.n("nativeBridgeConfigurator");
        throw null;
    }

    public final Function1<b, Unit> getOnCreateErrorReceived() {
        return this.onCreateErrorReceived;
    }

    public final Function2<WebResourceRequest, WebResourceError, Unit> getOnErrorReceived() {
        return this.onErrorReceived;
    }

    public final Function2<WebResourceRequest, WebResourceResponse, Unit> getOnHttpErrorReceived() {
        return this.onHttpErrorReceived;
    }

    public final Function1<String, Unit> getOnLoadResource() {
        return this.onLoadResource;
    }

    public final Function2<String, Boolean, Unit> getOnPageLoadingFinished() {
        return this.onPageLoadingFinished;
    }

    public final Function1<String, Unit> getOnPageLoadingStarted() {
        return this.onPageLoadingStarted;
    }

    public final Function1<Object, Unit> getOnPermissionRequestStatusListener() {
        return this.onPermissionRequestStatusListener;
    }

    public final Function1<String, Unit> getOnReceiveTitleListener() {
        return this.onReceiveTitleListener;
    }

    public final Function1<String, Boolean> getOnRedirectUrlListener() {
        return this.onRedirectUrlListener;
    }

    public final Function1<Boolean, Unit> getOnRenderProcessGoneListener() {
        return this.onRenderProcessGoneListener;
    }

    public final Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> getOnShowFileChooserListener() {
        return this.onShowFileChooserListener;
    }

    public final InterfaceC6511n<String, Boolean, Boolean, Unit> getOnUpdateVisitedHistory() {
        return this.onUpdateVisitedHistory;
    }

    public final Function1<WebView, Unit> getOnWebViewCreated() {
        return this.onWebViewCreated;
    }

    public final InterfaceC6511n<String, Integer, String, Unit> getOnWebViewJsErrorListener() {
        return this.onWebViewJsErrorListener;
    }

    public final androidx.fragment.app.r getParentFragmentActivity() {
        WeakReference<androidx.fragment.app.r> weakReference = this.parentActivityWeakRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final Button getReloadButt() {
        return this.reloadButt;
    }

    public final int getScreenEdge() {
        return ((Number) this.screenEdge.getValue()).intValue();
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final Unit goBack() {
        WebView webView = this.webView;
        if (webView == null) {
            return null;
        }
        webView.goBack();
        return Unit.f71690a;
    }

    public final void goSpa(@NotNull String url, Boolean replace) {
        Intrinsics.checkNotNullParameter(url, "url");
        String b11 = A0.b("window.dispatchEvent(new CustomEvent('obank-nav', ", Pe.b.f22280c.a(ObankNav.INSTANCE.serializer(), new ObankNav(new ObankNav.Detail(url, replace))), "))");
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript(b11, null);
        }
    }

    public final void loadDataWithBaseURL(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
            webView.loadDataWithBaseURL(null, data, "text/html", "UTF-8", null);
        }
    }

    public final void loadUrl(@NotNull String url, boolean clearHistory) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.nativeBridgeConfigurator == null) {
            throw new IllegalStateException("Please set native bridge before! Use configure() function");
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
            this.clearHistory = clearHistory;
            this.clearHistoryUrl = url;
            NativeBridgeConfigurator nativeBridgeConfigurator = this.nativeBridgeConfigurator;
            if (nativeBridgeConfigurator != null) {
                nativeBridgeConfigurator.H().e(webView, url);
            } else {
                Intrinsics.n("nativeBridgeConfigurator");
                throw null;
            }
        }
    }

    @NotNull
    public final w0<v<String, String, String>> observeCallbacks() {
        NativeBridgeConfigurator nativeBridgeConfigurator = this.nativeBridgeConfigurator;
        if (nativeBridgeConfigurator != null) {
            return nativeBridgeConfigurator.O();
        }
        Intrinsics.n("nativeBridgeConfigurator");
        throw null;
    }

    public final void onDestroy() {
        try {
            CookieManager.getInstance().flush();
        } catch (Throwable unused) {
            L80.a.b(TAG, "can't get instance of CookieManager");
        }
        this.isDestroyed = true;
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Integer valueOf = ev != null ? Integer.valueOf(ev.getActionMasked()) : null;
        boolean z11 = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.startX = ev.getX();
            this.startY = ev.getY();
            if (this.startX > getScreenEdge() && this.startX < getWidth() - getScreenEdge()) {
                z11 = false;
            }
            this.isEdgeSwipe = z11;
        } else if (valueOf != null && valueOf.intValue() == 2) {
            if (this.isEdgeSwipe) {
                float abs = Math.abs(ev.getX() - this.startX);
                if (abs > Math.abs(ev.getY() - this.startY) && abs < getScreenEdge()) {
                    return true;
                }
                if (abs >= getScreenEdge()) {
                    this.isEdgeSwipe = false;
                }
            }
        } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 1)) {
            this.isEdgeSwipe = false;
            this.startX = 0.0f;
            this.startY = 0.0f;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void onPause(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void onResume(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void reloadUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
            webView.reload();
        }
    }

    public final void resetToFirst() {
        String str;
        WebHistoryItem itemAtIndex;
        WebView webView = this.webView;
        WebBackForwardList copyBackForwardList = webView != null ? webView.copyBackForwardList() : null;
        if (copyBackForwardList == null || (itemAtIndex = copyBackForwardList.getItemAtIndex(0)) == null || (str = itemAtIndex.getUrl()) == null) {
            str = "";
        }
        this.clearHistoryUrl = str;
        L80.a.a(TAG, "bfl?.currentIndex= " + (copyBackForwardList != null ? Integer.valueOf(copyBackForwardList.getCurrentIndex()) : null) + " url=" + str);
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.goBackOrForward(-(copyBackForwardList != null ? copyBackForwardList.getCurrentIndex() : 0));
        }
    }

    public final void setOnCreateErrorReceived(Function1<? super b, Unit> function1) {
        this.onCreateErrorReceived = function1;
    }

    public final void setOnErrorReceived(Function2<? super WebResourceRequest, ? super WebResourceError, Unit> function2) {
        this.onErrorReceived = function2;
    }

    public final void setOnHttpErrorReceived(Function2<? super WebResourceRequest, ? super WebResourceResponse, Unit> function2) {
        this.onHttpErrorReceived = function2;
    }

    public final void setOnLoadResource(Function1<? super String, Unit> function1) {
        this.onLoadResource = function1;
    }

    public final void setOnPageLoadingFinished(Function2<? super String, ? super Boolean, Unit> function2) {
        this.onPageLoadingFinished = function2;
    }

    public final void setOnPageLoadingStarted(Function1<? super String, Unit> function1) {
        this.onPageLoadingStarted = function1;
    }

    public final void setOnPermissionRequestStatusListener(Function1<Object, Unit> function1) {
        this.onPermissionRequestStatusListener = function1;
    }

    public final void setOnReceiveTitleListener(Function1<? super String, Unit> function1) {
        this.onReceiveTitleListener = function1;
    }

    public final void setOnRedirectUrlListener(Function1<? super String, Boolean> function1) {
        this.onRedirectUrlListener = function1;
    }

    public final void setOnRenderProcessGoneListener(Function1<? super Boolean, Unit> function1) {
        this.onRenderProcessGoneListener = function1;
    }

    public final void setOnShowFileChooserListener(Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> function2) {
        this.onShowFileChooserListener = function2;
    }

    public final void setOnUpdateVisitedHistory(InterfaceC6511n<? super String, ? super Boolean, ? super Boolean, Unit> interfaceC6511n) {
        this.onUpdateVisitedHistory = interfaceC6511n;
    }

    public final void setOnWebViewCreated(Function1<? super WebView, Unit> function1) {
        this.onWebViewCreated = function1;
    }

    public final void setOnWebViewJsErrorListener(InterfaceC6511n<? super String, ? super Integer, ? super String, Unit> interfaceC6511n) {
        this.onWebViewJsErrorListener = interfaceC6511n;
    }

    public final void setParentFragmentActivity(@NotNull androidx.fragment.app.r fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.parentActivityWeakRef = new WeakReference<>(fragmentActivity);
    }

    public final void setReloadButt(Button button) {
        this.reloadButt = button;
    }

    public final void setTabId(String str) {
        this.tabId = str;
    }

    public final void stopLoading() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.stopLoading();
        }
    }

    public /* synthetic */ FintechWebView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FintechWebView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.screenEdge = k.a(n.PUBLICATION, new F90.d(this, 2));
    }

    private final void createAndAddWebView(Context context) {
        WebView webView = new WebView(context);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Function1<? super WebView, Unit> function1 = this.onWebViewCreated;
        if (function1 != null) {
            function1.invoke(webView);
        }
        this.webView = webView;
        addView(webView, 0);
    }
}
