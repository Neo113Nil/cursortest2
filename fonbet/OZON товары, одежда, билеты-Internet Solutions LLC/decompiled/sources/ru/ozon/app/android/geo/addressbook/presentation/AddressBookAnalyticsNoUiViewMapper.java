package ru.ozon.app.android.geo.addressbook.presentation;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addressbook.data.AddressBookDTO;
import ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookVO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAnalyticsNoUiViewMapper;", "Lc20/r;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Analytics;", "Lru/ozon/app/android/geo/addressbook/di/AddressBookWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addressbook/di/AddressBookWidgetComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/geo/addressbook/di/AddressBookWidgetComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookAnalyticsNoUiViewMapper extends r<AddressBookDTO, AddressBookVO.Analytics> {

    @NotNull
    private final AddressBookWidgetComponent component;

    @NotNull
    private final r.a viewType;

    public AddressBookAnalyticsNoUiViewMapper(@NotNull AddressBookWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof AddressBookDTO.Analytics;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AddressBookVO.Analytics> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new AddressBookAnalyticsViewHolder(container.X());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AddressBookVO.Analytics> map(@NotNull AddressBookDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getAnalyticsMapper().invoke(state, info);
    }
}
