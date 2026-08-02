package ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.di;

import Pc.a;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.data.HideTabBarOnScrollConfig;
import ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.HideTabBarOnScrollViewMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/di/HideTabbarOnScrollWidgetModule;", "", "<init>", "()V", "LPc/a;", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/data/HideTabBarOnScrollConfig;", "config", "Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/HideTabBarOnScrollViewMapper;", "viewMapper", "", "Ln20/i;", "provideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsRelease", "(LPc/a;LPc/a;)Ljava/util/Set;", "provideHideTabBarOnScrollWidget", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HideTabbarOnScrollWidgetModule {

    @NotNull
    public static final HideTabbarOnScrollWidgetModule INSTANCE = new HideTabbarOnScrollWidgetModule();

    private HideTabbarOnScrollWidgetModule() {
    }

    @NotNull
    public final Set<i> provideHideTabBarOnScrollWidget$tabbar_prodGoogleAllVendorsRelease(@NotNull final a<HideTabBarOnScrollConfig> config, @NotNull final a<HideTabBarOnScrollViewMapper> viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        final long[] b11 = j.b();
        final String str = "tabBar";
        final String str2 = "hideTabBarOnScroll";
        return e0.h(new i(str, str2, b11) { // from class: ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.di.HideTabbarOnScrollWidgetModule$provideHideTabBarOnScrollWidget$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                Object obj = config.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (InterfaceC7243a) obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HideTabBarOnScrollViewMapper[]{viewMapper.get()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        });
    }
}
