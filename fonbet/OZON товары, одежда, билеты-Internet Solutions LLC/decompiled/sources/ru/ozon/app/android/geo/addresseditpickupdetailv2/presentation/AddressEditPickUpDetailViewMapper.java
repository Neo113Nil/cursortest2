package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation;

import A00.a;
import B90.C2618u;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.data.AddressEditPickUpDetailDTO;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R2\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/di/AddressEditPickupDetailWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/di/AddressEditPickupDetailWidgetComponent;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/di/AddressEditPickupDetailWidgetComponent;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailMapper;", "mapper", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailMapper;", "getMapper", "()Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "CollapsingState", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickUpDetailViewMapper extends WidgetViewMapper<AddressEditPickUpDetailDTO, AddressEditPickUpDetailVO> {

    @NotNull
    private final AddressEditPickupDetailWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddressEditPickUpDetailVO>> holderProducer;
    private final int layout;

    @NotNull
    private final AddressEditPickupDetailMapper mapper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailViewMapper$CollapsingState;", "LA00/a$J$a;", "", "isCollapsed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CollapsingState implements a.J.InterfaceC0007a {
        private final boolean isCollapsed;

        public CollapsingState(boolean z11) {
            this.isCollapsed = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CollapsingState) && this.isCollapsed == ((CollapsingState) other).isCollapsed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCollapsed);
        }

        /* renamed from: isCollapsed, reason: from getter */
        public final boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        @NotNull
        public String toString() {
            return C2618u.g("CollapsingState(isCollapsed=", ")", this.isCollapsed);
        }
    }

    public AddressEditPickUpDetailViewMapper(@NotNull AddressEditPickupDetailWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new AddressEditPickupDetailMapper();
        this.layout = R$layout.widget_address_edit_pickup_detail_v2;
        this.holderProducer = new AddressEditPickUpDetailViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.a0(CollapsingState.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddressEditPickUpDetailVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddressEditPickUpDetailDTO, d, List<AddressEditPickUpDetailVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public AddressEditPickUpDetailVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddressEditPickUpDetailVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        AddressEditPickUpDetailVO.Schedule schedule = oldItem.getSchedule();
        return AddressEditPickUpDetailVO.copy$default(oldItem, 0L, null, null, null, null, null, null, schedule != null ? AddressEditPickUpDetailVO.Schedule.copy$default(schedule, 0, null, null, null, null, null, ((CollapsingState) update).getIsCollapsed(), false, null, null, 959, null) : null, null, null, null, null, null, null, null, null, null, null, false, null, null, 2097023, null);
    }
}
