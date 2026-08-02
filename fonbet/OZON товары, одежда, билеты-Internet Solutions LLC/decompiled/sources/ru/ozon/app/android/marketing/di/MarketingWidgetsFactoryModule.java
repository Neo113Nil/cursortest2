package ru.ozon.app.android.marketing.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.marketing.widgets.ladderActions.core.LadderActionsConfig;
import ru.ozon.app.android.marketing.widgets.ladderActions.core.LadderActionsViewMapper;
import ru.ozon.app.android.marketing.widgets.ladderActions.di.LadderActionsComponent;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core.StaticCouponListWidgetKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/marketing/di/MarketingWidgetsFactoryModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$marketing_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarketingWidgetsFactoryModule {
    @NotNull
    public final Set<i> provideWidgets$marketing_prodGoogleAllVendorsRelease() {
        final long[] jArr = {2};
        final String str = "marketingInfo";
        final String str2 = "ladderActions";
        i[] elements = {new i(str, str2, jArr) { // from class: ru.ozon.app.android.marketing.di.MarketingWidgetsFactoryModule$provideWidgets$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new LadderActionsConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new LadderActionsViewMapper[]{new LadderActionsViewMapper((LadderActionsComponent) storage.getComponent(LadderActionsComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{LadderActionsComponent.Companion.create(storage)};
            }
        }, StaticCouponListWidgetKt.StaticCouponListWidgetFactory()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
