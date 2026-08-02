package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.data;

import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.data.MainTabsDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \"2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\"B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u0003j\u0002`\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO$Tab;", "tab", "", "tabHorizontalPadding", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO$Tab;", "mapTab", "(Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO$Tab;I)Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO$Tab;", "", "hashCode", "(Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO$Tab;)J", "", "prefetchImages", "(Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO$Tab;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainTabsMapper implements Function2<MainTabsDTO, d, List<? extends MainTabsVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ImageDTO> imagePrefetcher;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsMapper$Companion;", "", "<init>", "()V", "DEFAULT_TABS_SPACE", "", "DEFAULT_TABS_PADDING", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MainTabsMapper(@NotNull Context context, @NotNull ImagePrefetcher<ImageDTO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    private final long hashCode(MainTabsDTO.Tab tab) {
        return ((155 + tab.getIconButton().hashCode()) * 31) + tab.getSubtitle().hashCode();
    }

    private final MainTabsVO.Tab mapTab(MainTabsDTO.Tab tab, int tabHorizontalPadding) {
        MainTabsVO.Tab tab2 = new MainTabsVO.Tab(hashCode(tab), tab.getIconButton(), tab.getSubtitle(), tab.getTopImage(), tabHorizontalPadding);
        prefetchImages(tab);
        return tab2;
    }

    private final void prefetchImages(MainTabsDTO.Tab tab) {
        PrefetchUtilsKt.prefetchImage(this.context, tab.getTopImage(), this.imagePrefetcher);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MainTabsVO> invoke(@NotNull MainTabsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Integer tabsHorizontalPadding = state.getTabsHorizontalPadding();
        int px = ResourceExtKt.toPx(tabsHorizontalPadding != null ? tabsHorizontalPadding.intValue() : 8, this.context);
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        List<MainTabsDTO.Tab> tabs = state.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTab((MainTabsDTO.Tab) it.next(), px));
        }
        Integer tabsSpace = state.getTabsSpace();
        return C7714v.a0(new MainTabsVO(hashCode, title, subtitle, arrayList, ResourceExtKt.toPx(tabsSpace != null ? tabsSpace.intValue() : 4, this.context), b11, state.getBackgroundColor()));
    }
}
