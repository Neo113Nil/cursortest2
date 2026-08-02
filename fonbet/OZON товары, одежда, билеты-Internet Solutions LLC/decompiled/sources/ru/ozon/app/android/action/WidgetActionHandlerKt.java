package ru.ozon.app.android.action;

import A00.a;
import C.C2699t;
import S0.InterfaceC3967k;
import Tg.b;
import Vg.e;
import Wg.d;
import a00.C4911f;
import a00.h;
import b00.f;
import i10.h;
import i10.l;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.navigations.destinations.ComposerNestedPageDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.flags.SmoothAtomScrollToWidgetFlag;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a9\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0014\u001a+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%\u001a+\u0010+\u001a\u00020\u001c*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b+\u0010,\u001a9\u0010+\u001a\u00020\u001c*\u00020&2\u0006\u0010(\u001a\u00020'2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b+\u00100\u001a#\u00102\u001a\u00020\u001c*\u00020&2\u0006\u0010(\u001a\u0002012\b\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/composer/ui/widget/k;", "Ll10/i;", "container", "Lk20/g;", "storage", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "sheetConfig", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "widgetActionHandlerBuilder", "(Lru/ozon/composer/ui/widget/k;Ll10/i;Lk20/g;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)LVg/e$a;", "Lru/ozon/composer/compose/widget/i;", "La00/f;", "La00/h;", "viewModelOwnerProvider", "(Lru/ozon/composer/compose/widget/i;Lk20/g;La00/f;La00/h;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;LS0/k;II)LVg/e$a;", "Ll20/a;", "widgetViewItem", "WidgetActionHandlerBuilder", "(La00/f;La00/h;Lk20/g;Ll20/a;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)LVg/e$a;", "Lkotlin/Function0;", "(La00/f;La00/h;Lk20/g;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)LVg/e$a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "widgetKey", "", "scrollToWidgetByKey", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Ll10/b;I)V", "LTg/a;", "navigator", "LTg/b$f;", "scrollPosition", "Li10/h$b;", "getScrollOneTimePostProcessing", "(LTg/a;LTg/b$f;)Li10/h$b;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "action", "composerViewItem", "bottomSheetConfig", "openNestedPage", "(Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;Ll20/a;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)V", "", "", "nestedPages", "(Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;Ljava/util/Map;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)V", "Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;", "openComposerNestedPage", "(Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)V", "action_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetActionHandlerKt {
    @NotNull
    public static final e.a WidgetActionHandlerBuilder(@NotNull C4911f container, @NotNull h viewModelOwnerProvider, @NotNull C7475g storage, @NotNull C7854a widgetViewItem, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        return WidgetActionHandlerBuilder(container, viewModelOwnerProvider, storage, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$2(widgetViewItem), bottomSheetConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final h.b getScrollOneTimePostProcessing(Tg.a aVar, b.f fVar) {
        h.b b11;
        return fVar instanceof b.f.InterfaceC0547b ? new h.b(new a.C.C0000a(), null, 2) : (fVar == null || (b11 = aVar.get$converter().b(fVar)) == null) ? new h.b((a.C) null, new l.a.b(0L, 0 == true ? 1 : 0, 3)) : b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void openComposerNestedPage(@NotNull ComposerNavigator composerNavigator, @NotNull AtomAction.OpenComposerNestedPage action, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        Intrinsics.checkNotNullParameter(composerNavigator, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        AtomAction.CurtainShowConfig showConfig = action.getShowConfig();
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2 = bottomSheetConfig == null ? BaseActionHandlerKt.toBottomSheetConfig(showConfig) : bottomSheetConfig;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (showConfig instanceof AtomAction.CurtainShowConfig.None) {
            showConfig = null;
        }
        int i11 = 0;
        composerNavigator.navigate(new ComposerNestedPageDestination(new ComposerScreenConfig(new h.c.a(action.getLink(), str, (String) (objArr2 == true ? 1 : 0), 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(i11, false, null, null, null, null, 61, null), i11, 2, objArr == true ? 1 : 0), false, ComposerScreenConfig.BottomSheetConfig.copy$default(bottomSheetConfig2, null, false, false, null, 0, action.getCancellable(), false, false, false, false, false, 2015, null), false, false, false, false, null, false, false, false, null, null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16744372, null), action.getLink(), action.getLink(), showConfig != null ? new BottomSheetComposerFragment.OverrideDisplayMode(bottomSheetConfig2.getDisplayMode()) : null), Integer.valueOf(action.getLink().hashCode()));
    }

    public static final void openNestedPage(@NotNull ComposerNavigator composerNavigator, @NotNull AtomAction.OpenNestedPage action, @NotNull C7854a composerViewItem, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        Intrinsics.checkNotNullParameter(composerNavigator, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(composerViewItem, "composerViewItem");
        openNestedPage(composerNavigator, action, composerViewItem.h(), bottomSheetConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToWidgetByKey(FeatureChecker featureChecker, InterfaceC7851b interfaceC7851b, int i11) {
        InterfaceC7851b.a.b(interfaceC7851b, i11, 0, featureChecker.isEnabled(SmoothAtomScrollToWidgetFlag.INSTANCE), 10);
    }

    @NotNull
    public static final e.a widgetActionHandlerBuilder(@NotNull k<?> kVar, @NotNull i container, @NotNull C7475g storage, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return WidgetActionHandlerBuilder(container.Q(), container.a0(), storage, new WidgetActionHandlerKt$widgetActionHandlerBuilder$1(kVar), bottomSheetConfig);
    }

    public static /* synthetic */ e.a widgetActionHandlerBuilder$default(k kVar, i iVar, C7475g c7475g, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bottomSheetConfig = null;
        }
        return widgetActionHandlerBuilder(kVar, iVar, c7475g, bottomSheetConfig);
    }

    @NotNull
    public static final e.a WidgetActionHandlerBuilder(@NotNull C4911f container, @NotNull a00.h viewModelOwnerProvider, @NotNull C7475g storage, @NotNull Function0<? extends C7854a> widgetViewItem, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        ComposerNavigator composerNavigator = ((RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class)).getComposerNavigator();
        InterfaceC7851b composerController = ((RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class)).getComposerController();
        FeatureChecker featureChecker = ((NetworkComponentApi) storage.getComponent(NetworkComponentApi.class)).getFeatureChecker();
        Ug.a aVar = (Ug.a) storage.getComponent(Ug.a.class);
        Tg.a a11 = ((C2699t) aVar.getActionNavigatorFactory()).a(container);
        int i11 = d.f33849e;
        Tg.a withScrollPositionConverter = ComposerExtKt.withScrollPositionConverter(a11, d.b.a(new WidgetActionHandlerKt$WidgetActionHandlerBuilder$actionNavigator$1(container)));
        e.a aVar2 = new e.a(container, viewModelOwnerProvider, widgetViewItem, aVar.getTokenizedAnalytics(), withScrollPositionConverter, composerController, aVar.getStorage());
        aVar2.d(AtomAction.OpenNestedPage.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$3(composerNavigator, widgetViewItem, bottomSheetConfig));
        aVar2.d(AtomAction.OpenComposerNestedPage.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$4(composerNavigator, bottomSheetConfig));
        aVar2.d(AtomAction.Refresh.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$5(composerController, withScrollPositionConverter));
        aVar2.d(RefreshAndScroll.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$6(composerController, withScrollPositionConverter));
        aVar2.d(AtomAction.DismissAndScroll.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$7(composerNavigator, container));
        aVar2.d(AtomAction.DismissRefresh.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$8(composerNavigator, container, withScrollPositionConverter));
        aVar2.d(DismissAndRefreshAndScroll.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$9(composerNavigator, container, withScrollPositionConverter));
        aVar2.d(AtomAction.ScrollToWidget.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$10(composerController));
        aVar2.d(AtomAction.ScrollToWidgetByKey.class, new WidgetActionHandlerKt$WidgetActionHandlerBuilder$11(featureChecker, composerController));
        return WidgetActionHandlerBuilder.m471constructorimpl(aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void openNestedPage(@NotNull ComposerNavigator composerNavigator, @NotNull AtomAction.OpenNestedPage action, Map<String, String> map, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
        String str;
        Intrinsics.checkNotNullParameter(composerNavigator, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        String nestedPageKey = action.getNestedPageKey();
        if (map == null || (str = map.get(nestedPageKey)) == null) {
            return;
        }
        h.c.b bVar = new h.c.b(str);
        BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode = null;
        ComposerScreenConfig composerScreenConfig = new ComposerScreenConfig(bVar, new ComposerScreenConfig.ToolbarConfig(null, 0, 2, 0 == true ? 1 : 0), false, bottomSheetConfig == null ? BaseActionHandlerKt.toBottomSheetConfig(action.getShowConfig()) : bottomSheetConfig, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777140, null);
        Integer valueOf = Integer.valueOf(nestedPageKey.hashCode());
        if (bottomSheetConfig != null) {
            overrideDisplayMode = new BottomSheetComposerFragment.OverrideDisplayMode(bottomSheetConfig.getDisplayMode());
        }
        ComposerNavigator.DefaultImpls.openBottomSheet$default(composerNavigator, nestedPageKey, composerScreenConfig, valueOf, null, overrideDisplayMode, 8, null);
    }

    @NotNull
    public static final e.a widgetActionHandlerBuilder(@NotNull ru.ozon.composer.compose.widget.i<?> iVar, @NotNull C7475g storage, C4911f c4911f, a00.h hVar, ComposerScreenConfig.BottomSheetConfig bottomSheetConfig, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(storage, "storage");
        interfaceC3967k.o(-1937900756);
        if ((i12 & 2) != 0) {
            c4911f = (C4911f) interfaceC3967k.m(f.d());
        }
        if ((i12 & 4) != 0) {
            hVar = (a00.h) interfaceC3967k.m(f.f());
        }
        if ((i12 & 8) != 0) {
            bottomSheetConfig = null;
        }
        e.a WidgetActionHandlerBuilder = WidgetActionHandlerBuilder(c4911f, hVar, storage, iVar.getViewItem(), bottomSheetConfig);
        interfaceC3967k.k();
        return WidgetActionHandlerBuilder;
    }
}
