package ru.ozon.app.android.pdp.view.pdp;

import A00.a;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.m;
import WZ.t;
import a00.C4908c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ScrollDirectionHandler;
import ru.ozon.app.android.pdp.utils.ScrollDirectionHandlerKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/view/pdp/PdpGalleryFullViewConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "setupStatusBar", "LA00/a;", "event", "busEventHandler", "(LA00/a;)V", "Landroid/content/Context;", "context", "Landroid/widget/ImageView;", "createCloseButton", "(Landroid/content/Context;)Landroid/widget/ImageView;", "Landroid/view/View;", "rootView", "updateCloseButtonMargin", "(Landroid/view/View;)V", "Landroid/graphics/drawable/LayerDrawable;", "createSelectDrawableWithTint", "(Landroid/content/Context;)Landroid/graphics/drawable/LayerDrawable;", "onComposerInitialized", "", "fullViewColor$delegate", "LSc/j;", "getFullViewColor", "()Ljava/lang/Integer;", "fullViewColor", "previewStatusBarColor", "Ljava/lang/Integer;", "", "isPreviewAppearanceLightStatusBars", "Ljava/lang/Boolean;", "Landroidx/lifecycle/W;", "busEventObserver", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "scrollHandler", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "closeButtonView", "Landroid/widget/ImageView;", "LWZ/t;", "closeButtonEvent", "LWZ/t;", "isFirstInitialized", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpGalleryFullViewConfigurator extends ComposerScreenConfig.PageConfigurator {
    private t closeButtonEvent;
    private ImageView closeButtonView;
    private Boolean isPreviewAppearanceLightStatusBars;
    private Integer previewStatusBarColor;

    /* renamed from: fullViewColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fullViewColor = DelegatesKt.lazyUnsafe(new PdpGalleryFullViewConfigurator$fullViewColor$2(this));

    @NotNull
    private final W<a> busEventObserver = new PdpGalleryFullViewConfigurator$busEventObserver$1(this);

    @NotNull
    private final ScrollDirectionHandler scrollHandler = new ScrollDirectionHandler();
    private boolean isFirstInitialized = true;

    /* JADX INFO: Access modifiers changed from: private */
    public final void busEventHandler(a event) {
        ComposerNavigator navigator;
        ConfiguratorReferences references;
        l tokenizedAnalytics;
        ViewGroup rootView;
        CoordinatorLayout composerCoordinatorLayout;
        if (event instanceof a.C2370k) {
            if (this.isFirstInitialized) {
                setupStatusBar();
                ComponentCallbacksC5392m c11 = getContainer().c();
                if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null && (composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(rootView)) != null) {
                    composerCoordinatorLayout.removeView(this.closeButtonView);
                    composerCoordinatorLayout.addView(this.closeButtonView);
                    updateCloseButtonMargin(composerCoordinatorLayout);
                }
                this.isFirstInitialized = false;
                return;
            }
            return;
        }
        if (event instanceof a.J) {
            a.J.InterfaceC0007a d11 = ((a.J) event).d();
            GalleryFullViewCloseButton galleryFullViewCloseButton = d11 instanceof GalleryFullViewCloseButton ? (GalleryFullViewCloseButton) d11 : null;
            if (galleryFullViewCloseButton == null) {
                return;
            }
            if (!galleryFullViewCloseButton.getIsClose()) {
                this.closeButtonEvent = galleryFullViewCloseButton.getTokenizedEvent();
                ImageView imageView = this.closeButtonView;
                if (imageView != null) {
                    ViewExtKt.showOrGone(imageView, Boolean.valueOf(galleryFullViewCloseButton.getIsShow()));
                    return;
                }
                return;
            }
            t tVar = this.closeButtonEvent;
            if (tVar != null && (references = getReferences()) != null && (tokenizedAnalytics = references.getTokenizedAnalytics()) != null) {
                m.a(tokenizedAnalytics, tVar, null);
            }
            ConfiguratorReferences references2 = getReferences();
            if (references2 == null || (navigator = references2.getNavigator()) == null) {
                return;
            }
            navigator.popBackStack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView createCloseButton(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.closeIv);
        imageView.setBackground(AppTypeResolver.INSTANCE.isSelect(context) ? createSelectDrawableWithTint(context) : androidx.core.content.a.getDrawable(context, R$drawable.ic_close_circle_gallery_full_view));
        Dimens dimens = Dimens.INSTANCE;
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(dimens.getDP_32(), dimens.getDP_32());
        fVar.f41884c = 8388661;
        fVar.setMargins(((ViewGroup.MarginLayoutParams) fVar).leftMargin, dimens.getDP_10(), dimens.getDP_10(), ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        imageView.setLayoutParams(fVar);
        imageView.setOnClickListener(new Jm0.a(this, 1));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseButton$lambda$7$lambda$6(PdpGalleryFullViewConfigurator pdpGalleryFullViewConfigurator, View view) {
        ComposerNavigator navigator;
        ConfiguratorReferences references;
        l tokenizedAnalytics;
        t tVar = pdpGalleryFullViewConfigurator.closeButtonEvent;
        if (tVar != null && (references = pdpGalleryFullViewConfigurator.getReferences()) != null && (tokenizedAnalytics = references.getTokenizedAnalytics()) != null) {
            m.a(tokenizedAnalytics, tVar, null);
        }
        ConfiguratorReferences references2 = pdpGalleryFullViewConfigurator.getReferences();
        if (references2 == null || (navigator = references2.getNavigator()) == null) {
            return;
        }
        navigator.popBackStack();
    }

    private final LayerDrawable createSelectDrawableWithTint(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int color = androidx.core.content.a.getColor(context, UniColors.CLEAR_LIGHT_KEY_300.getResId());
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(color);
        Dimens dimens = Dimens.INSTANCE;
        gradientDrawable.setSize(dimens.getDP_32(), dimens.getDP_32());
        Drawable drawable = androidx.core.content.a.getDrawable(context, ru.ozon.uni.R$drawable.ic_s_cross_filled);
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        int color2 = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_SECONDARY_ON_DARK.getResId());
        if (mutate != null) {
            mutate.setTint(color2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, mutate});
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    private final Integer getFullViewColor() {
        return (Integer) this.fullViewColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupStatusBar() {
        Integer fullViewColor = getFullViewColor();
        if (fullViewColor != null) {
            int intValue = fullViewColor.intValue();
            StatusBarController statusBarController = StatusBarController.INSTANCE;
            ComponentCallbacksC5392m c11 = getContainer().c();
            StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
            statusBarController.setStatusBarBackgroundColor(c11, newState, intValue);
            StatusBarController.setStatusBarContentColor$default(statusBarController, getContainer().c(), newState, true, false, 8, null);
        }
    }

    private final void updateCloseButtonMargin(View rootView) {
        ImageView imageView;
        C5353y0 n11 = Y.n(rootView);
        if (n11 == null) {
            return;
        }
        int i11 = n11.f(1).f42127b;
        if (rootView.getFitsSystemWindows() || (imageView = this.closeButtonView) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + i11, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        imageView.setLayoutParams(marginLayoutParams);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        Context context;
        Window window;
        super.onComposerInitialized();
        r a11 = getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null) {
            this.previewStatusBarColor = Integer.valueOf(window.getStatusBarColor());
            this.isPreviewAppearanceLightStatusBars = Boolean.valueOf(new Q0(window.getDecorView(), window).c());
        }
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (context = c11.getContext()) == null) {
            return;
        }
        this.closeButtonView = createCloseButton(context);
        getOwner().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdp.view.pdp.PdpGalleryFullViewConfigurator$onComposerInitialized$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Integer num;
                Boolean bool;
                ViewGroup rootView;
                CoordinatorLayout composerCoordinatorLayout;
                ImageView imageView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                num = PdpGalleryFullViewConfigurator.this.previewStatusBarColor;
                if (num != null) {
                    StatusBarController.INSTANCE.setStatusBarBackgroundColor(PdpGalleryFullViewConfigurator.this.getContainer().c(), StatusBarController.UpdateReason.Recovery.INSTANCE, num.intValue());
                }
                bool = PdpGalleryFullViewConfigurator.this.isPreviewAppearanceLightStatusBars;
                if (bool != null) {
                    StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, PdpGalleryFullViewConfigurator.this.getContainer().c(), StatusBarController.UpdateReason.Recovery.INSTANCE, !bool.booleanValue(), false, 8, null);
                }
                ComponentCallbacksC5392m c12 = PdpGalleryFullViewConfigurator.this.getContainer().c();
                if (c12 != null && (rootView = ContextExtKt.getRootView(c12)) != null && (composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(rootView)) != null) {
                    imageView = PdpGalleryFullViewConfigurator.this.closeButtonView;
                    composerCoordinatorLayout.removeView(imageView);
                }
                PdpGalleryFullViewConfigurator.this.closeButtonView = null;
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                InterfaceC7851b controller;
                C5423j events;
                W w11;
                ViewGroup rootView;
                RecyclerView composerRecyclerViewOrNull;
                ScrollDirectionHandler scrollDirectionHandler;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onPause(owner);
                ComponentCallbacksC5392m c12 = PdpGalleryFullViewConfigurator.this.getContainer().c();
                if (c12 != null && (rootView = ContextExtKt.getRootView(c12)) != null && (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) != null) {
                    scrollDirectionHandler = PdpGalleryFullViewConfigurator.this.scrollHandler;
                    ScrollDirectionHandlerKt.removeScrollDirectionHandler(composerRecyclerViewOrNull, scrollDirectionHandler);
                }
                ConfiguratorReferences references = PdpGalleryFullViewConfigurator.this.getReferences();
                if (references == null || (controller = references.getController()) == null || (events = controller.getEvents()) == null) {
                    return;
                }
                w11 = PdpGalleryFullViewConfigurator.this.busEventObserver;
                events.removeObserver(w11);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                boolean z11;
                InterfaceC7851b controller;
                C5423j events;
                W w11;
                ViewGroup rootView;
                RecyclerView composerRecyclerViewOrNull;
                ScrollDirectionHandler scrollDirectionHandler;
                ViewGroup rootView2;
                CoordinatorLayout composerCoordinatorLayout;
                boolean z12;
                ImageView createCloseButton;
                ImageView imageView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                z11 = PdpGalleryFullViewConfigurator.this.isFirstInitialized;
                if (!z11) {
                    PdpGalleryFullViewConfigurator.this.setupStatusBar();
                }
                ComponentCallbacksC5392m c12 = PdpGalleryFullViewConfigurator.this.getContainer().c();
                if (c12 != null && (rootView2 = ContextExtKt.getRootView(c12)) != null && (composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(rootView2)) != null) {
                    PdpGalleryFullViewConfigurator pdpGalleryFullViewConfigurator = PdpGalleryFullViewConfigurator.this;
                    if (composerCoordinatorLayout.findViewById(R$id.closeIv) == null) {
                        z12 = pdpGalleryFullViewConfigurator.isFirstInitialized;
                        if (!z12) {
                            Context context2 = composerCoordinatorLayout.getContext();
                            if (context2 == null) {
                                return;
                            }
                            createCloseButton = pdpGalleryFullViewConfigurator.createCloseButton(context2);
                            pdpGalleryFullViewConfigurator.closeButtonView = createCloseButton;
                            imageView = pdpGalleryFullViewConfigurator.closeButtonView;
                            composerCoordinatorLayout.addView(imageView);
                        }
                    }
                }
                ComponentCallbacksC5392m c13 = PdpGalleryFullViewConfigurator.this.getContainer().c();
                if (c13 != null && (rootView = ContextExtKt.getRootView(c13)) != null && (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) != null) {
                    scrollDirectionHandler = PdpGalleryFullViewConfigurator.this.scrollHandler;
                    ScrollDirectionHandlerKt.addScrollDirectionHandler(composerRecyclerViewOrNull, scrollDirectionHandler);
                }
                ConfiguratorReferences references = PdpGalleryFullViewConfigurator.this.getReferences();
                if (references == null || (controller = references.getController()) == null || (events = controller.getEvents()) == null) {
                    return;
                }
                C4908c g10 = PdpGalleryFullViewConfigurator.this.getContainer().g();
                w11 = PdpGalleryFullViewConfigurator.this.busEventObserver;
                events.observe(g10, w11);
            }
        });
    }
}
