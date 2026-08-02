package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm;

import Sc.InterfaceC3999a;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.data.HotelsPageRoomsSearchFormConfig;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.di.HotelsPageRoomsSearchFormComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.presentation.HotelsPageRoomsSearchFormNoUiViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "HotelsPageRoomsSearchFormWidget", "()Ln20/i;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsPageRoomsSearchFormWidgetKt {
    @InterfaceC3999a
    @NotNull
    public static final i HotelsPageRoomsSearchFormWidget() {
        final long[] jArr = {1};
        final String str = "travel";
        final String str2 = "hotelsPageRoomsSearchForm";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.HotelsPageRoomsSearchFormWidgetKt$HotelsPageRoomsSearchFormWidget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsPageRoomsSearchFormConfig();
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsPageRoomsSearchFormNoUiViewMapper[]{new HotelsPageRoomsSearchFormNoUiViewMapper((HotelsPageRoomsSearchFormComponent) storage.getComponent(HotelsPageRoomsSearchFormComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(final C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{new C7473e(N.b(HotelsPageRoomsSearchFormComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageRoomsSearchForm.HotelsPageRoomsSearchFormWidgetKt$HotelsPageRoomsSearchFormWidget$3$1
                    @Override // k20.InterfaceC7469a
                    public final HotelsPageRoomsSearchFormComponent component() {
                        return new HotelsPageRoomsSearchFormComponent(C7475g.this);
                    }
                })};
            }
        };
    }
}
