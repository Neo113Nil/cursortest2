package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.data.StarsTileConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.di.StarsTileComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation.StarsTileViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "StarsTileWidget", "()Ln20/i;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StarsTileWidgetKt {
    @NotNull
    public static final i StarsTileWidget() {
        final long[] b11 = j.b();
        final String str = "travel";
        final String str2 = "starsTile";
        return new i(str, str2, b11) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.StarsTileWidgetKt$StarsTileWidget$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StarsTileConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new StarsTileViewMapper[]{new StarsTileViewMapper(new StarsTileComponent(storage))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return j.a();
            }
        };
    }
}
