package ru.ozon.app.android.gallery;

import BF.b;
import I0.C3173b;
import Pc.a;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.C;
import androidx.appcompat.app.g;
import androidx.fragment.app.G;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.gallery.GalleryViewModel;
import ru.ozon.app.android.gallery.databinding.ActivityGalleryBinding;
import ru.ozon.app.android.gallery.details.DaggerGalleryActivityComponent;
import ru.ozon.app.android.gallery.details.GalleryActivityComponent;
import ru.ozon.app.android.gallery.view.GalleryView;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.FullScreenModel;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0005J#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0014¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010#R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/gallery/GalleryActivity;", "Landroidx/appcompat/app/g;", "Lru/ozon/app/android/gallery/FullScreenListener;", "Lru/ozon/app/android/gallery/VideoPlayerListener;", "<init>", "()V", "Lru/ozon/app/android/gallery/GalleryViewModel$Action;", "action", "", "handleAction", "(Lru/ozon/app/android/gallery/GalleryViewModel$Action;)V", "enterFullScreen", "exitFullScreen", "close", "Lru/ozon/app/android/video/VideoPosition;", "videoPosition", "", "widgetName", "Lru/ozon/app/android/gallery/view/GalleryView;", "createView", "(Lru/ozon/app/android/video/VideoPosition;Ljava/lang/String;)Lru/ozon/app/android/gallery/view/GalleryView;", "startViewModelObservation", "Landroid/content/Intent;", "intent", "", "initViewModel", "(Landroid/content/Intent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "zoomState", "onZoomChanged", "(Z)V", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "fullScreenModel", "onFullScreenChange", "(Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;)V", "onDestroy", "isRewinding", "onVideoRewindStateChanged", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "LPc/a;", "Lru/ozon/app/android/gallery/GalleryViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "manualStateBundleActivityCallback", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "getManualStateBundleActivityCallback", "()Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "setManualStateBundleActivityCallback", "(Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;)V", "view", "Lru/ozon/app/android/gallery/view/GalleryView;", "Lru/ozon/app/android/gallery/GalleryViewModel;", "viewModel", "Lru/ozon/app/android/gallery/GalleryViewModel;", "Lru/ozon/app/android/gallery/databinding/ActivityGalleryBinding;", "binding", "Lru/ozon/app/android/gallery/databinding/ActivityGalleryBinding;", "Lru/ozon/app/android/gallery/GalleryRequest;", "request", "Lru/ozon/app/android/gallery/GalleryRequest;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/gallery/GalleryCloseListener;", "closeListener", "Lru/ozon/app/android/gallery/GalleryCloseListener;", "getCloseListener", "()Lru/ozon/app/android/gallery/GalleryCloseListener;", "setCloseListener", "(Lru/ozon/app/android/gallery/GalleryCloseListener;)V", "Companion", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryActivity extends g implements FullScreenListener, VideoPlayerListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private ActivityGalleryBinding binding;
    private GalleryCloseListener closeListener;

    @NotNull
    private final C8486a disposables = new C8486a();
    public ManualStateBundleActivityCallback manualStateBundleActivityCallback;
    public a<GalleryViewModelImpl> pViewModel;
    private GalleryRequest request;
    public GZ.g router;
    private GalleryView view;
    private GalleryViewModel viewModel;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/gallery/GalleryActivity$Companion;", "", "<init>", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "request", "Lru/ozon/app/android/gallery/GalleryRequest;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent newIntent(@NotNull Context context, @NotNull GalleryRequest request) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(request, "request");
            Intent intent = new Intent(context, (Class<?>) GalleryActivity.class);
            intent.putExtra("REQUEST_ID", GalleryRequestsHolder.INSTANCE.putRequest(request));
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        t popupCloseTokenizedFullEvent;
        l tokenizedAnalytics;
        GalleryRequest galleryRequest = this.request;
        if (galleryRequest != null && (popupCloseTokenizedFullEvent = galleryRequest.getPopupCloseTokenizedFullEvent()) != null && (tokenizedAnalytics = StorageAnalytic.INSTANCE.getTokenizedAnalytics()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, popupCloseTokenizedFullEvent, null, 2, null);
        }
        GalleryCloseListener galleryCloseListener = this.closeListener;
        if (galleryCloseListener != null) {
            galleryCloseListener.onClose();
        }
        finish();
    }

    private final GalleryView createView(VideoPosition videoPosition, String widgetName) {
        ActivityGalleryBinding activityGalleryBinding = this.binding;
        if (activityGalleryBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        G supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        GalleryViewModel galleryViewModel = this.viewModel;
        if (galleryViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        GalleryActivity$createView$1 galleryActivity$createView$1 = new GalleryActivity$createView$1(galleryViewModel);
        GalleryViewModel galleryViewModel2 = this.viewModel;
        if (galleryViewModel2 != null) {
            return new GalleryView(activityGalleryBinding, window, supportFragmentManager, galleryActivity$createView$1, new GalleryActivity$createView$2(galleryViewModel2), videoPosition, widgetName);
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    private final void enterFullScreen() {
        GalleryView galleryView = this.view;
        if (galleryView == null) {
            Intrinsics.n("view");
            throw null;
        }
        ActivityGalleryBinding activityGalleryBinding = this.binding;
        if (activityGalleryBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityGalleryBinding.galleryContainer.setBackgroundResource(R$color.black);
        galleryView.hidePreview();
        galleryView.hideCloseBtn();
        galleryView.setFullScreen(true);
    }

    private final void exitFullScreen() {
        GalleryView galleryView = this.view;
        if (galleryView == null) {
            Intrinsics.n("view");
            throw null;
        }
        ActivityGalleryBinding activityGalleryBinding = this.binding;
        if (activityGalleryBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityGalleryBinding.galleryContainer.setBackground(null);
        galleryView.setFullScreen(false);
        galleryView.showPreview();
        galleryView.showCloseBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(GalleryViewModel.Action action) {
        if (action instanceof GalleryViewModel.Action.BindItems) {
            GalleryView galleryView = this.view;
            if (galleryView == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView.bindItems(((GalleryViewModel.Action.BindItems) action).getItems());
        } else if (action instanceof GalleryViewModel.Action.SetCurrentPage) {
            GalleryView galleryView2 = this.view;
            if (galleryView2 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView2.setCurrentPage(((GalleryViewModel.Action.SetCurrentPage) action).getPage());
        } else if (action instanceof GalleryViewModel.Action.SmoothScrollToPage) {
            GalleryView galleryView3 = this.view;
            if (galleryView3 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView3.smoothScrollToPosition(((GalleryViewModel.Action.SmoothScrollToPage) action).getPage());
        } else if (Intrinsics.d(action, GalleryViewModel.Action.NotifyPreviewAdapter.INSTANCE)) {
            GalleryView galleryView4 = this.view;
            if (galleryView4 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView4.notifyPreviewAdapter();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.Close.INSTANCE)) {
            close();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.LockPager.INSTANCE)) {
            GalleryView galleryView5 = this.view;
            if (galleryView5 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView5.lockPager();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.UnlockPager.INSTANCE)) {
            GalleryView galleryView6 = this.view;
            if (galleryView6 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView6.unLockPager();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.ShowPreview.INSTANCE)) {
            GalleryView galleryView7 = this.view;
            if (galleryView7 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView7.showPreview();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.HidePreview.INSTANCE)) {
            GalleryView galleryView8 = this.view;
            if (galleryView8 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView8.hidePreview();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.HideSystemUI.INSTANCE)) {
            enterFullScreen();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.HideCloseBtn.INSTANCE)) {
            GalleryView galleryView9 = this.view;
            if (galleryView9 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView9.hideCloseBtn();
        } else if (Intrinsics.d(action, GalleryViewModel.Action.ShowSystemUI.INSTANCE)) {
            exitFullScreen();
        } else {
            if (!Intrinsics.d(action, GalleryViewModel.Action.ShowCloseBtn.INSTANCE)) {
                throw new o();
            }
            GalleryView galleryView10 = this.view;
            if (galleryView10 == null) {
                Intrinsics.n("view");
                throw null;
            }
            galleryView10.showCloseBtn();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final boolean initViewModel(Intent intent) {
        l tokenizedAnalytics;
        long longExtra = intent.getLongExtra("REQUEST_ID", -1L);
        Long valueOf = Long.valueOf(longExtra);
        if (longExtra == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            throw new IllegalArgumentException("Bundle doesn't contain required arguments: " + intent.getExtras());
        }
        long longValue = valueOf.longValue();
        GalleryRequest takeRequest = GalleryRequestsHolder.INSTANCE.takeRequest(longValue);
        this.request = takeRequest;
        if (takeRequest == null) {
            BxLogger.INSTANCE.log(6, "GalleryActivity", C3173b.b(longValue, "Failed to find matching request for id="));
            return false;
        }
        this.viewModel = (GalleryViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.gallery.GalleryActivity$initViewModel$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GalleryViewModelImpl galleryViewModelImpl = GalleryActivity.this.getPViewModel().get();
                Intrinsics.g(galleryViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return galleryViewModelImpl;
            }
        }).a(GalleryViewModelImpl.class);
        GalleryRequest galleryRequest = this.request;
        VideoPosition videoPosition = galleryRequest != null ? galleryRequest.getVideoPosition() : null;
        GalleryRequest galleryRequest2 = this.request;
        this.view = createView(videoPosition, galleryRequest2 != null ? galleryRequest2.getWidgetName() : null);
        startViewModelObservation();
        GalleryRequest galleryRequest3 = this.request;
        if (galleryRequest3 == null) {
            return true;
        }
        GalleryViewModel galleryViewModel = this.viewModel;
        if (galleryViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        galleryViewModel.init(galleryRequest3);
        t popupTokenizedFullEvent = galleryRequest3.getPopupTokenizedFullEvent();
        if (popupTokenizedFullEvent == null || (tokenizedAnalytics = StorageAnalytic.INSTANCE.getTokenizedAnalytics()) == null) {
            return true;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, popupTokenizedFullEvent, null, 2, null);
        return true;
    }

    private final void startViewModelObservation() {
        C8486a c8486a = this.disposables;
        GalleryViewModel galleryViewModel = this.viewModel;
        if (galleryViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        InterfaceC8487b subscribe = galleryViewModel.getAction().observeOn(C8125a.a()).subscribe(new b(new GalleryActivity$startViewModelObservation$1(this), 10), new DM.b(new GalleryActivity$startViewModelObservation$2(Lm0.a.f17149a), 6));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    @NotNull
    public final ManualStateBundleActivityCallback getManualStateBundleActivityCallback() {
        ManualStateBundleActivityCallback manualStateBundleActivityCallback = this.manualStateBundleActivityCallback;
        if (manualStateBundleActivityCallback != null) {
            return manualStateBundleActivityCallback;
        }
        Intrinsics.n("manualStateBundleActivityCallback");
        throw null;
    }

    @NotNull
    public final a<GalleryViewModelImpl> getPViewModel() {
        a<GalleryViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R$style.OzonTheme);
        this.binding = ActivityGalleryBinding.inflate(getLayoutInflater());
        GalleryActivityComponent.Factory factory = DaggerGalleryActivityComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, (AndroidPlatformComponentApi) dependencyStorage2.b(AndroidPlatformComponentApi.class)).inject(this);
        getManualStateBundleActivityCallback().onActivityPreCreated(this, savedInstanceState);
        super.onCreate(savedInstanceState);
        ActivityGalleryBinding activityGalleryBinding = this.binding;
        if (activityGalleryBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(activityGalleryBinding.getConstraintLayout());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (!initViewModel(intent)) {
            finish();
        }
        getOnBackPressedDispatcher().h(this, new C() { // from class: ru.ozon.app.android.gallery.GalleryActivity$onCreate$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                GalleryActivity.this.close();
            }
        });
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected void onDestroy() {
        this.disposables.d();
        super.onDestroy();
        if (isFinishing()) {
            GalleryRequestsHolder.INSTANCE.removeRequest(getIntent().getLongExtra("REQUEST_ID", -1L));
        }
        StorageAnalytic.INSTANCE.setTokenizedAnalytics(null);
    }

    @Override // ru.ozon.app.android.gallery.VideoPlayerListener
    public void onFullScreenChange(@NotNull FullScreenModel fullScreenModel) {
        Intrinsics.checkNotNullParameter(fullScreenModel, "fullScreenModel");
        GalleryViewModel galleryViewModel = this.viewModel;
        if (galleryViewModel != null) {
            galleryViewModel.onOrientationChanged(fullScreenModel);
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getManualStateBundleActivityCallback().onActivityPostSaveInstanceState(outState);
    }

    @Override // ru.ozon.app.android.gallery.VideoPlayerListener
    public void onVideoRewindStateChanged(boolean isRewinding) {
        GalleryViewModel galleryViewModel = this.viewModel;
        if (galleryViewModel != null) {
            galleryViewModel.onVideoRewindChanged(isRewinding);
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.gallery.FullScreenListener
    public void onZoomChanged(boolean zoomState) {
        GalleryViewModel galleryViewModel = this.viewModel;
        if (galleryViewModel != null) {
            galleryViewModel.onZoomChanged(zoomState);
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    public final void setCloseListener(GalleryCloseListener galleryCloseListener) {
        this.closeListener = galleryCloseListener;
    }
}
