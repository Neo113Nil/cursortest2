package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.data.ContentHiderConfig;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.di.ContentHiderComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.presentation.ContentHiderViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "ContentHiderWidget", "()Ln20/i;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentHiderWidgetKt {
    @NotNull
    public static final i ContentHiderWidget() {
        final long[] supportedVersions = ContentHiderConfig.INSTANCE.getSupportedVersions();
        final String str = "travel";
        final String str2 = "contentHider";
        return new i(str, str2, supportedVersions) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.ContentHiderWidgetKt$ContentHiderWidget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ContentHiderConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ContentHiderViewMapper[]{new ContentHiderViewMapper((ContentHiderComponent) storage.getComponent(ContentHiderComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(final C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{new C7473e(N.b(ContentHiderComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.ContentHiderWidgetKt$ContentHiderWidget$3$1
                    @Override // k20.InterfaceC7469a
                    public final ContentHiderComponent component() {
                        return new ContentHiderComponent(C7475g.this);
                    }
                })};
            }
        };
    }
}
