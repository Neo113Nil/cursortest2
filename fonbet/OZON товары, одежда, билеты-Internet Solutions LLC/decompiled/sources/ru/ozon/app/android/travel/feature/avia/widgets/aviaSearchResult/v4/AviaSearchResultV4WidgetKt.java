package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4;

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
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4Config;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di.AviaSearchResultV4Component;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.AviaSearchResultV4LoadingViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "AviaSearchResultV4Widget", "()Ln20/i;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaSearchResultV4WidgetKt {
    @NotNull
    public static final i AviaSearchResultV4Widget() {
        final long[] jArr = {4};
        final String str = "travel";
        final String str2 = "aviaSearchResult";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.AviaSearchResultV4WidgetKt$AviaSearchResultV4Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new AviaSearchResultV4Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                AviaSearchResultV4Component aviaSearchResultV4Component = (AviaSearchResultV4Component) storage.getComponent(AviaSearchResultV4Component.class);
                return new WidgetViewMapper[]{new AviaSearchResultV4LoadingViewMapper(aviaSearchResultV4Component), new AviaSearchResultV4AllDoneViewMapper(aviaSearchResultV4Component)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(final C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{new C7473e(N.b(AviaSearchResultV4Component.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.AviaSearchResultV4WidgetKt$AviaSearchResultV4Widget$3$1
                    @Override // k20.InterfaceC7469a
                    public final AviaSearchResultV4Component component() {
                        return new AviaSearchResultV4Component(C7475g.this);
                    }
                })};
            }
        };
    }
}
