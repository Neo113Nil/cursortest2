package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation;

import AI.b;
import T00.a;
import Vg.d;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.t;
import androidx.core.content.res.g;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 G2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001GBM\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u001f2\b\u0010'\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00022\n\u0010.\u001a\u00060,j\u0002`-H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0019H\u0016¢\u0006\u0004\b1\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00106R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010%¨\u0006H"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/appcompat/widget/AppCompatImageView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler;", "atomActionSheetHandlers", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "minifyLinkViewModel", "<init>", "(Landroidx/appcompat/widget/AppCompatImageView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Ljava/util/Set;LVg/d;Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "setIconIndents", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "processCustomAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "text", "share", "(Ljava/lang/String;)V", "item", "trackView", "(Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;)V", ImagesContract.URL, "navBarTintColor", "tintIcon", "(Ljava/lang/String;Ljava/lang/String;)V", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;Ll20/d;)V", "onDetach", "Landroidx/appcompat/widget/AppCompatImageView;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Ljava/util/Set;", "LVg/d;", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "", "defaultNavIconColor", "I", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "getActionHandler", "()Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "setActionHandler", "(Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;", "getItem", "()Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;", "setItem", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavBarIconButtonWidgetViewHolder extends k<NavBarIconButtonVO> {
    private DisposableActionHandler actionHandler;

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final Set<AtomActionSheetHandler> atomActionSheetHandlers;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final int defaultNavIconColor;
    private NavBarIconButtonVO item;

    @NotNull
    private final MinifyLinkViewModel minifyLinkViewModel;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AppCompatImageView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int shareIconMarginStart = UiExtKt.toPx(5);
    private static final int shareIconPadding = UiExtKt.toPx(6);
    private static final int commonIconPadding = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonWidgetViewHolder$Companion;", "", "<init>", "()V", "", "SHARE_DATA_TYPE", "Ljava/lang/String;", "SHARE_CART_FROM_QUERY_PARAM", "SHARE_ACTION_ID", "SHARE_TEXT_KEY", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavBarIconButtonWidgetViewHolder(@NotNull AppCompatImageView view, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences ref, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull Set<? extends AtomActionSheetHandler> atomActionSheetHandlers, @NotNull d customActionHandlersStoreFactory, @NotNull MinifyLinkViewModel minifyLinkViewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(atomActionSheetHandlers, "atomActionSheetHandlers");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(minifyLinkViewModel, "minifyLinkViewModel");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.ref = ref;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.atomActionSheetHandlers = atomActionSheetHandlers;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.minifyLinkViewModel = minifyLinkViewModel;
        this.defaultNavIconColor = g.b(getContext().getResources(), R$color.oz_semantic_text_primary, getContext().getTheme());
        view.setOnClickListener(new b(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NavBarIconButtonWidgetViewHolder navBarIconButtonWidgetViewHolder, View view) {
        AtomActionDTO action;
        DisposableActionHandler disposableActionHandler;
        Function1<AtomAction, Unit> handler;
        NavBarIconButtonVO navBarIconButtonVO = navBarIconButtonWidgetViewHolder.item;
        if (navBarIconButtonVO == null || (action = navBarIconButtonVO.getAction()) == null || (disposableActionHandler = navBarIconButtonWidgetViewHolder.actionHandler) == null || (handler = disposableActionHandler.getHandler()) == null) {
            return;
        }
        NavBarIconButtonVO navBarIconButtonVO2 = navBarIconButtonWidgetViewHolder.item;
        handler.invoke(AtomActionMapperKt.toAtomAction(action, navBarIconButtonVO2 != null ? navBarIconButtonVO2.getTrackingInfo() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCustomAction(AtomAction.Click action) {
        if (Intrinsics.d(action.getId(), "share")) {
            Map<String, String> params = action.getParams();
            this.minifyLinkViewModel.onClickShare(String.valueOf(action.getLink()), getTrackingData(), new NavBarIconButtonWidgetViewHolder$processCustomAction$1(params != null ? params.get("shareText") : null, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (kotlin.text.h.t(r4, "shareCartFrom", false) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setIconIndents(AtomActionDTO action) {
        boolean z11;
        boolean d11 = Intrinsics.d(action.getId(), "share");
        String link = action.getLink();
        if (link != null) {
            z11 = true;
        }
        z11 = false;
        int i11 = (d11 || z11) ? shareIconPadding : commonIconPadding;
        int i12 = d11 ? shareIconMarginStart : 0;
        AppCompatImageView appCompatImageView = this.view;
        appCompatImageView.setPadding(i11, i11, i11, i11);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i12);
        appCompatImageView.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void share(String text) {
        t.a aVar = new t.a(this.ref.getContainer().i());
        aVar.g("text/plain");
        aVar.f(text);
        aVar.c(R$string.common_action_share);
        aVar.h();
    }

    private final void tintIcon(String url, String navBarTintColor) {
        if (navBarTintColor != null) {
            AppCompatImageView appCompatImageView = this.view;
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), navBarTintColor);
            ThemeExtKt.tint(appCompatImageView, Integer.valueOf(parseColor != null ? parseColor.intValue() : this.defaultNavIconColor));
        } else if (url == null || !h.t(url, "shareCartFrom", false)) {
            ThemeExtKt.semanticTint(this.view, UniColors.TEXT_PRIMARY.getResId());
        } else {
            ThemeExtKt.tint(this.view, Integer.valueOf(ResourceExtKt.color(getContext(), UniColors.GRAPHIC_TERTIARY.getResId())));
        }
    }

    private final void trackView(NavBarIconButtonVO item) {
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null), null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation.NavBarIconButtonWidgetViewHolder$onAttach$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Set set;
                Intrinsics.checkNotNullParameter(owner, "owner");
                set = NavBarIconButtonWidgetViewHolder.this.atomActionSheetHandlers;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((AtomActionSheetHandler) it.next()).clear();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Set set;
                Intrinsics.checkNotNullParameter(owner, "owner");
                set = NavBarIconButtonWidgetViewHolder.this.atomActionSheetHandlers;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((AtomActionSheetHandler) it.next()).clear();
                }
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        DisposableActionHandler disposableActionHandler = this.actionHandler;
        if (disposableActionHandler != null) {
            disposableActionHandler.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavBarIconButtonVO item, @NotNull l20.d info) {
        T00.k k11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        for (AtomActionSheetHandler atomActionSheetHandler : this.atomActionSheetHandlers) {
            if (atomActionSheetHandler instanceof FavoritesListAtomActionSheetHandler) {
                ((FavoritesListAtomActionSheetHandler) atomActionSheetHandler).setRequestId(item.getId());
            }
            atomActionSheetHandler.onBind();
        }
        this.actionHandler = new ActionHandler.Builder(this.ref, this).onClick(new NavBarIconButtonWidgetViewHolder$bind$2(this)).onPreProcess(new NavBarIconButtonWidgetViewHolder$bind$3(this)).customActionHandlers(new NavBarIconButtonWidgetViewHolder$bind$4(this)).buildDisposableHandler(item.getId(), U7.d.c(this.ref), this.actionSheetEventHandler);
        setIconIndents(item.getAction());
        ImageViewExtKt.load$default(this.view, item.getIcon(), null, null, null, null, false, null, 126, null);
        trackView(item);
        String link = item.getAction().getLink();
        a b11 = info.b();
        tintIcon(link, (b11 == null || (k11 = b11.k()) == null) ? null : k11.c());
    }
}
