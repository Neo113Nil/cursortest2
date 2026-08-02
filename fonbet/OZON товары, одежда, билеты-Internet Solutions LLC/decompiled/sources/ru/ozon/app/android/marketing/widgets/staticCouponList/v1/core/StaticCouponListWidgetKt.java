package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.di.StaticCouponListComponent;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "StaticCouponListWidgetFactory", "()Ln20/i;", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticCouponListWidgetKt {
    @NotNull
    public static final i StaticCouponListWidgetFactory() {
        final long[] versions = StaticCouponListConfig.INSTANCE.getVersions();
        final String str = "marketingInfo";
        final String str2 = "staticCouponList";
        return new i(str, str2, versions) { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core.StaticCouponListWidgetKt$StaticCouponListWidgetFactory$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StaticCouponListConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StaticCouponListViewMapper[]{new StaticCouponListViewMapper((StaticCouponListComponent) storage.getComponent(StaticCouponListComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(final C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{new C7473e(N.b(StaticCouponListComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core.StaticCouponListWidgetKt$StaticCouponListWidgetFactory$3$1
                    @Override // k20.InterfaceC7469a
                    public final StaticCouponListComponent component() {
                        return new StaticCouponListComponent(C7475g.this);
                    }
                })};
            }
        };
    }
}
