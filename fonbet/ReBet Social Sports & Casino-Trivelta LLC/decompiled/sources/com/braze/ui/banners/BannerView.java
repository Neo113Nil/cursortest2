package com.braze.ui.banners;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.managers.banners.IBannerView;
import com.braze.models.Banner;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$styleable;
import com.braze.ui.banners.BannerView;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.banners.utils.BannerWebViewClient;
import com.braze.ui.support.WebViewUtilsKt;
import com.twilio.voice.EventKeys;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n*\u00012\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0011R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000b\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R0\u00106\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000b\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R \u00109\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010)R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u0011¨\u0006?"}, d2 = {"Lcom/braze/ui/banners/BannerView;", "Landroid/webkit/WebView;", "Lcom/braze/managers/banners/IBannerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "", "init", "(Landroid/util/AttributeSet;I)V", "", "placementId", "configureWebView", "(Ljava/lang/String;)V", "loadHtmlData", "setWebviewToEmpty", "()V", "dismiss", "performDismissTeardown", "Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener;", "createBannerWebViewClientListener$android_sdk_ui_release", "()Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener;", "createBannerWebViewClientListener", "initBanner", "_placementId", "Ljava/lang/String;", "loadedHtml", "currentUserId", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDismissed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/braze/ui/banners/BannerDismissSnapshot;", "dismissSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlin/Function1;", "onDismissCallback", "Lkotlin/jvm/functions/Function1;", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function1;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/BannerDismissedEvent;", "dismissSubscriber", "Lcom/braze/events/IEventSubscriber;", "com/braze/ui/banners/BannerView$attachStateListener$1", "attachStateListener", "Lcom/braze/ui/banners/BannerView$attachStateListener$1;", "", "heightCallback", "getHeightCallback", "setHeightCallback", "internalHeightCallback", EventKeys.VALUE_KEY, "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerView.kt\ncom/braze/ui/banners/BannerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n58#2,2:303\n1#3:305\n*S KotlinDebug\n*F\n+ 1 BannerView.kt\ncom/braze/ui/banners/BannerView\n*L\n119#1:303,2\n*E\n"})
/* loaded from: classes.dex */
public final class BannerView extends WebView implements IBannerView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Nullable
    private String _placementId;

    @NotNull
    private final BannerView$attachStateListener$1 attachStateListener;

    @Nullable
    private String currentUserId;

    @NotNull
    private final AtomicReference<BannerDismissSnapshot> dismissSnapshot;

    @NotNull
    private final IEventSubscriber<BannerDismissedEvent> dismissSubscriber;

    @Nullable
    private Function1<? super Double, Unit> heightCallback;

    @NotNull
    private final Function1<Double, Unit> internalHeightCallback;

    @NotNull
    private final AtomicBoolean isDismissed;

    @Nullable
    private String loadedHtml;

    @Nullable
    private Function1<? super BannerDismissSnapshot, Unit> onDismissCallback;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/banners/BannerView$Companion;", "", "<init>", "()V", "JS_BRIDGE_NAME", "", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View$OnAttachStateChangeListener, com.braze.ui.banners.BannerView$attachStateListener$1] */
    public BannerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isDismissed = new AtomicBoolean(false);
        this.dismissSnapshot = new AtomicReference<>(null);
        this.dismissSubscriber = new IEventSubscriber() { // from class: d4.a
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BannerView.dismissSubscriber$lambda$0(BannerView.this, (BannerDismissedEvent) obj);
            }
        };
        ?? r42 = new View.OnAttachStateChangeListener() { // from class: com.braze.ui.banners.BannerView$attachStateListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
                IEventSubscriber<BannerDismissedEvent> iEventSubscriber;
                Intrinsics.checkNotNullParameter(v10, "v");
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = BannerView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iEventSubscriber = BannerView.this.dismissSubscriber;
                brazeInternal.subscribeToBannersDismissedEvent(context2, iEventSubscriber);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                IEventSubscriber<BannerDismissedEvent> iEventSubscriber;
                Intrinsics.checkNotNullParameter(v10, "v");
                BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
                Context context2 = BannerView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iEventSubscriber = BannerView.this.dismissSubscriber;
                brazeInternal.unsubscribeFromBannersDismissedEvent(context2, iEventSubscriber);
            }
        };
        this.attachStateListener = r42;
        this.internalHeightCallback = new Function1() { // from class: d4.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit internalHeightCallback$lambda$0;
                internalHeightCallback$lambda$0 = BannerView.internalHeightCallback$lambda$0(BannerView.this, ((Double) obj).doubleValue());
                return internalHeightCallback$lambda$0;
            }
        };
        addOnAttachStateChangeListener(r42);
        init(null, 0);
    }

    private final void configureWebView(String placementId) {
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WebViewUtilsKt.setWebViewSettings(settings, context);
        setLayerType(2, null);
        setBackgroundColor(0);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setWebViewClient(new BannerWebViewClient(context2, createBannerWebViewClientListener$android_sdk_ui_release()));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        addJavascriptInterface(new BannerJavascriptInterface(context3, placementId, this.internalHeightCallback), "brazeInternalBridge");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        if (this.isDismissed.compareAndSet(false, true)) {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                performDismissTeardown();
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BannerView.dismiss$lambda$0(BannerView.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$0(BannerView bannerView) {
        if (bannerView.isDismissed.get()) {
            bannerView.performDismissTeardown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissSubscriber$lambda$0(BannerView bannerView, BannerDismissedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getPlacementId(), bannerView._placementId)) {
            bannerView.dismiss();
        }
    }

    private final void init(AttributeSet attrs, int defStyle) {
        setBackgroundColor(0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] BannerView = R$styleable.BannerView;
        Intrinsics.checkNotNullExpressionValue(BannerView, "BannerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, BannerView, defStyle, 0);
        if (obtainStyledAttributes.hasValue(R$styleable.BannerView_placementId)) {
            this._placementId = obtainStyledAttributes.getString(R$styleable.BannerView_placementId);
        }
        obtainStyledAttributes.recycle();
        initBanner(get_placementId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit internalHeightCallback$lambda$0(BannerView bannerView, double d10) {
        Function1<? super Double, Unit> function1 = bannerView.heightCallback;
        if (function1 != null) {
            function1.invoke(Double.valueOf(d10));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHtmlData(String placementId) {
        if (this.isDismissed.getAndSet(false)) {
            onResume();
            getSettings().setJavaScriptEnabled(true);
            setVisibility(0);
        }
        configureWebView(placementId);
        String str = this.loadedHtml;
        if (str != null) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = Base64.encodeToString(bytes, 1);
            if (encodeToString == null) {
                encodeToString = "";
            }
            loadData(encodeToString, "text/html", "base64");
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:2:0x0000, B:4:0x0032, B:6:0x0036, B:11:0x0045, B:13:0x004d, B:14:0x0051, B:16:0x0040, B:17:0x0057), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:2:0x0000, B:4:0x0032, B:6:0x0036, B:11:0x0045, B:13:0x004d, B:14:0x0051, B:16:0x0040, B:17:0x0057), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void performDismissTeardown() {
        String str;
        try {
            stopLoading();
            setWebviewToEmpty();
            clearHistory();
            getSettings().setJavaScriptEnabled(false);
            removeJavascriptInterface("brazeInternalBridge");
            setWebViewClient(new WebViewClient());
            onPause();
            setVisibility(8);
            BannerDismissSnapshot bannerDismissSnapshot = this.dismissSnapshot.get();
            Function1<? super BannerDismissSnapshot, Unit> function1 = this.onDismissCallback;
            if (function1 != null) {
                if (bannerDismissSnapshot != null) {
                    str = bannerDismissSnapshot.getPlacementId();
                    if (str == null) {
                    }
                    function1.invoke(new BannerDismissSnapshot(str, bannerDismissSnapshot == null ? bannerDismissSnapshot.getStableKey() : null, bannerDismissSnapshot != null ? bannerDismissSnapshot.getTrackingId() : null));
                }
                str = this._placementId;
                function1.invoke(new BannerDismissSnapshot(str, bannerDismissSnapshot == null ? bannerDismissSnapshot.getStableKey() : null, bannerDismissSnapshot != null ? bannerDismissSnapshot.getTrackingId() : null));
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: d4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performDismissTeardown$lambda$0;
                    performDismissTeardown$lambda$0 = BannerView.performDismissTeardown$lambda$0(BannerView.this);
                    return performDismissTeardown$lambda$0;
                }
            }, 6, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: d4.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String performDismissTeardown$lambda$1;
                    performDismissTeardown$lambda$1 = BannerView.performDismissTeardown$lambda$1(BannerView.this);
                    return performDismissTeardown$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performDismissTeardown$lambda$0(BannerView bannerView) {
        return "Banner dismiss completed. placementId=" + bannerView._placementId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performDismissTeardown$lambda$1(BannerView bannerView) {
        return "Banner dismiss: error during view teardown or onDismissCallback for placementId=" + bannerView._placementId;
    }

    private final void setWebviewToEmpty() {
        this.loadedHtml = null;
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d4.d
                @Override // java.lang.Runnable
                public final void run() {
                    BannerView.setWebviewToEmpty$lambda$0(BannerView.this);
                }
            });
            return;
        }
        loadData("", "text/html", "base64");
        invalidate();
        this.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWebviewToEmpty$lambda$0(BannerView bannerView) {
        bannerView.loadData("", "text/html", "base64");
        bannerView.invalidate();
        bannerView.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    @NotNull
    public final DefaultBannerWebViewClientListener createBannerWebViewClientListener$android_sdk_ui_release() {
        return new DefaultBannerWebViewClientListener() { // from class: com.braze.ui.banners.BannerView$createBannerWebViewClientListener$1
            @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
            public void onCloseAction(Context context, String url, Bundle queryBundle) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
                BannerView.this.dismiss();
            }
        };
    }

    @Nullable
    public final Function1<Double, Unit> getHeightCallback() {
        return this.heightCallback;
    }

    @Nullable
    public final Function1<BannerDismissSnapshot, Unit> getOnDismissCallback() {
        return this.onDismissCallback;
    }

    @Nullable
    /* renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    @Override // com.braze.managers.banners.IBannerView
    public void initBanner(@Nullable final String placementId) {
        Banner banner;
        if (placementId != null) {
            Braze.Companion companion = Braze.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            banner = companion.getInstance(context).getBanner(placementId);
        } else {
            banner = null;
        }
        if (banner == null) {
            this.dismissSnapshot.set(null);
            this.currentUserId = null;
            setWebviewToEmpty();
            if (placementId != null) {
                BrazeInternal.INSTANCE.addBannerViewMonitor(placementId, this, true);
                return;
            }
            return;
        }
        this.dismissSnapshot.set(new BannerDismissSnapshot(banner.getPlacementId(), banner.getStableKey(), banner.getTrackingId()));
        if (Intrinsics.areEqual(banner.getHtml(), this.loadedHtml) && Intrinsics.areEqual(banner.getUserId(), this.currentUserId)) {
            return;
        }
        this.loadedHtml = banner.getHtml();
        this.currentUserId = banner.getUserId();
        if (banner.getIsControl()) {
            setWebviewToEmpty();
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            loadHtmlData(placementId);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d4.c
                @Override // java.lang.Runnable
                public final void run() {
                    BannerView.this.loadHtmlData(placementId);
                }
            });
        }
        BrazeInternal.INSTANCE.addBannerViewMonitor(banner.getPlacementId(), this, false);
    }

    public final void setHeightCallback(@Nullable Function1<? super Double, Unit> function1) {
        this.heightCallback = function1;
    }

    public final void setOnDismissCallback(@Nullable Function1<? super BannerDismissSnapshot, Unit> function1) {
        this.onDismissCallback = function1;
    }

    public final void setPlacementId(@Nullable String str) {
        this._placementId = str;
        initBanner(str);
    }
}
