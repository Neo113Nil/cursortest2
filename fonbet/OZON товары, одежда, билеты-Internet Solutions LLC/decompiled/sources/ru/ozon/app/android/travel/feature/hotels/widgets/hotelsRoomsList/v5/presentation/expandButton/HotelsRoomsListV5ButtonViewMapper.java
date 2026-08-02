package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.expandButton;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006$²\u0006\f\u0010\u001e\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/expandButton/HotelsRoomsListV5ButtonViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/expandButton/HotelsRoomsListV5ButtonVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5ButtonViewMapper extends g<HotelsRoomsListV5DTO, HotelsRoomsListV5ButtonVO> {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {N.g(new C(HotelsRoomsListV5ButtonViewMapper.class, "view", "<v#0>", 0))};
    public static final int $stable = 8;

    @NotNull
    private final HotelsRoomsListV5Component component;

    public HotelsRoomsListV5ButtonViewMapper(@NotNull HotelsRoomsListV5Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    private static final ButtonV3View createView$lambda$1(PreCreationViewPoolDelegate<ButtonV3View> preCreationViewPoolDelegate) {
        return preCreationViewPoolDelegate.getValue(null, $$delegatedProperties[0]);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsRoomsListV5DTO) && ((HotelsRoomsListV5DTO) state).getExpandButton() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsRoomsListV5ButtonVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsRoomsListV5ButtonWidgetViewHolder((ButtonV3View) view, container, this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return createView$lambda$1(new PreCreationViewPoolDelegate(context, N.b(ButtonV3View.class), new HotelsRoomsListV5ButtonViewMapper$createView$$inlined$preCreationViewPool$default$1(parent), new HotelsRoomsListV5ButtonViewMapper$createView$$inlined$preCreationViewPool$default$2()));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new HotelsRoomsListButtonDecoration(context));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsRoomsListV5ButtonVO> map(@NotNull HotelsRoomsListV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getButtonMapper().invoke(state, info);
    }
}
