package ru.ozon.app.android.fresh.navigation.tab;

import GZ.g;
import HZ.e;
import JZ.a;
import OZ.d;
import OZ.f;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7749i;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.navigation.deeplinks.FreshPdpInBottomSheetHandler;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.handlers.page.PdpPageInfo;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u0001:\u0001=B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001b*\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001b¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b)\u0010*J5\u0010,\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-J%\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/fresh/navigation/tab/FreshNavigationHelper;", "", "LGZ/g;", "router", "LHZ/e;", "deeplinkPageResolver", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "pdpInBottomSheetHandler", "<init>", "(LGZ/g;LHZ/e;Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;)V", "Landroid/os/Bundle;", "args", "", "deeplink", "LJZ/a;", "pageInfo", "LOZ/f;", "getDestinationFromPageInfo", "(Landroid/os/Bundle;Ljava/lang/String;LJZ/a;)LOZ/f;", "LNZ/g;", "tabNavigator", "", "handleClickSelectedItem", "(LNZ/g;)V", "", "isFragmentAdded", "(LNZ/g;)Z", "", "link", "containsDeeplink", "(Ljava/util/List;Ljava/lang/String;)Z", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "getDeeplinks", "(Ljava/util/List;)Ljava/util/List;", "Landroid/net/Uri$Builder;", "kotlin.jvm.PlatformType", "appendNavSource", "(Landroid/net/Uri$Builder;)Landroid/net/Uri$Builder;", DynamicElementDTO.TABS, "handleArgs", "(Landroid/os/Bundle;Ljava/util/List;)V", "getPageInfo", "(Ljava/lang/String;)LJZ/a;", "savedInstanceState", "getDestination", "(Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;LJZ/a;)LOZ/f;", "Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;", "current", "selected", "LDZ/a;", "navigator", "onNavigationItemSelected", "(Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;Lru/ozon/app/android/tabbar/ui/model/BottomMenuItem;LDZ/a;)Z", "LGZ/g;", "LHZ/e;", "Lru/ozon/app/android/fresh/navigation/deeplinks/FreshPdpInBottomSheetHandler;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "mainDeeplink", "Ljava/lang/String;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshNavigationHelper {

    @NotNull
    private static final List<String> EXCLUSION_QUERY_PARAMS = C7714v.a0("text");

    @NotNull
    private final e deeplinkPageResolver;

    @NotNull
    private final Handler handler;

    @NotNull
    private final String mainDeeplink;

    @NotNull
    private final FreshPdpInBottomSheetHandler pdpInBottomSheetHandler;

    @NotNull
    private final g router;

    public FreshNavigationHelper(@NotNull g router, @NotNull e deeplinkPageResolver, @NotNull FreshPdpInBottomSheetHandler pdpInBottomSheetHandler) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(deeplinkPageResolver, "deeplinkPageResolver");
        Intrinsics.checkNotNullParameter(pdpInBottomSheetHandler, "pdpInBottomSheetHandler");
        this.router = router;
        this.deeplinkPageResolver = deeplinkPageResolver;
        this.pdpInBottomSheetHandler = pdpInBottomSheetHandler;
        this.handler = new Handler(Looper.getMainLooper());
        String builder = appendNavSource(MiniAppExtKt.appendExpress(LinkGenerator.INSTANCE.express())).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        this.mainDeeplink = builder;
    }

    private final Uri.Builder appendNavSource(Uri.Builder builder) {
        return builder.appendQueryParameter("navSource", "tabBar");
    }

    private final boolean containsDeeplink(List<String> list, String str) {
        Object obj;
        Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Iterator<T> it = queryParameterNames.iterator();
        while (it.hasNext()) {
            if (EXCLUSION_QUERY_PARAMS.contains((String) it.next())) {
                return false;
            }
        }
        Uri build = Uri.parse(str).buildUpon().clearQuery().build();
        Sequence d11 = Regex.d(new Regex("\\d+"), String.valueOf(build.getPath()));
        Intrinsics.checkNotNullParameter(d11, "<this>");
        C7749i.a aVar = (C7749i.a) d11.iterator();
        if (aVar.hasNext()) {
            Object next = aVar.next();
            while (aVar.hasNext()) {
                next = aVar.next();
            }
            obj = next;
        } else {
            obj = null;
        }
        MatchResult matchResult = (MatchResult) obj;
        if (matchResult == null) {
            return false;
        }
        String str2 = build.getScheme() + "://" + build.getHost() + "/" + matchResult.getValue();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            String uri = Uri.parse((String) it2.next()).buildUpon().clearQuery().build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            if (Intrinsics.d(str2, uri)) {
                return true;
            }
        }
        return false;
    }

    private final List<String> getDeeplinks(List<BottomNavigationItem> list) {
        List<BottomNavigationItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BottomNavigationItem) it.next()).getDeeplink());
        }
        return arrayList;
    }

    private final f getDestinationFromPageInfo(Bundle args, String deeplink, a pageInfo) {
        if (!(pageInfo instanceof PdpPageInfo) || this.pdpInBottomSheetHandler.shouldOpenInBottomSheet(false, true)) {
            return null;
        }
        args.remove("supermarket");
        return new d((int) System.nanoTime(), deeplink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleArgs$lambda$0(FreshNavigationHelper freshNavigationHelper, String str) {
        g.a.a(freshNavigationHelper.router, str, null, null, 6);
    }

    private final void handleClickSelectedItem(NZ.g tabNavigator) {
        if (tabNavigator.clearBackStack() || !isFragmentAdded(tabNavigator)) {
            return;
        }
        tabNavigator.scrollToTop();
    }

    private final boolean isFragmentAdded(NZ.g gVar) {
        NZ.d dVar = gVar instanceof NZ.d ? (NZ.d) gVar : null;
        if (dVar != null) {
            return dVar.isAdded();
        }
        return false;
    }

    public final f getDestination(Bundle savedInstanceState, @NotNull Bundle args, String deeplink, a pageInfo) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (savedInstanceState != null || deeplink == null || pageInfo == null) {
            return null;
        }
        return getDestinationFromPageInfo(args, deeplink, pageInfo);
    }

    public final a getPageInfo(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.deeplinkPageResolver.a(deeplink);
    }

    public final void handleArgs(@NotNull Bundle args, List<BottomNavigationItem> tabs) {
        List<String> list;
        Intrinsics.checkNotNullParameter(args, "args");
        String string = args.getString("supermarket");
        if (string == null || string.equals(this.mainDeeplink)) {
            return;
        }
        if (tabs == null || (list = getDeeplinks(tabs)) == null) {
            list = K.f71697a;
        }
        if (containsDeeplink(list, string)) {
            return;
        }
        this.handler.post(new Sw.a(0, this, string));
    }

    public final boolean onNavigationItemSelected(@NotNull BottomMenuItem current, @NotNull BottomMenuItem selected, @NotNull DZ.a navigator) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!Intrinsics.d(current, selected)) {
            EZ.g.navigate$default(navigator, EZ.f.a(new OZ.e(current.getId(), null)), 0, 2, null);
            return true;
        }
        NZ.g activeTabOrNull = navigator.activeTabOrNull();
        if (activeTabOrNull == null) {
            return true;
        }
        handleClickSelectedItem(activeTabOrNull);
        return true;
    }
}
