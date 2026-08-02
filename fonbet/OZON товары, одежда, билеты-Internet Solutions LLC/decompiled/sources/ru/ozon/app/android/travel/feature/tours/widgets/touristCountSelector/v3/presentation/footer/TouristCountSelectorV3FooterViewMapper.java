package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import gk0.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3FooterMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomsUpdate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/di/TouristCountSelectorV3Component;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterWidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomsUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3FooterMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3FooterMapper;", "mapper", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TouristCountSelectorV3FooterViewMapper extends OverlayWidgetScreenViewItemMapper2<TouristCountSelectorV3Component, TouristCountSelectorV3DTO, TouristCountSelectorV3FooterVO> {

    @NotNull
    private final List<Class<TouristCountSelectorV3RoomsUpdate>> supportedUpdates = C7714v.a0(TouristCountSelectorV3RoomsUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$7(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = UiExtKt.toPx(16, context2);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        linearLayout.setPadding(px, px, px, UiExtKt.toPx(32, context3));
        linearLayout.setElevation(px);
        linearLayout.setClickable(true);
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), linearLayout.getContext());
        if (buttonV3View == null) {
            Context context4 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            buttonV3View = new ButtonV3View(context4, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context5 = buttonV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        layoutParams.bottomMargin = UiExtKt.toPx(12, context5);
        buttonV3View.setLayoutParams(layoutParams);
        linearLayout.addView(buttonV3View);
        ButtonV3View buttonV3View2 = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), linearLayout.getContext());
        if (buttonV3View2 == null) {
            Context context6 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            buttonV3View2 = new ButtonV3View(context6, null, 0, 0, 14, null);
        }
        buttonV3View2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(buttonV3View2);
        return linearLayout;
    }

    private final TouristCountSelectorV3FooterMapper getMapper() {
        return component().getFooterMapper();
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<TouristCountSelectorV3RoomsUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TouristCountSelectorV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TouristCountSelectorV3Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public TouristCountSelectorV3FooterWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        v b02 = container.b0();
        final a<TouristCountSelectorV3ViewModel> viewModelProvider = component().getViewModelProvider();
        w0 a11 = new z0(b02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer.TouristCountSelectorV3FooterViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel = (TouristCountSelectorV3ViewModel) a.this.get();
                Intrinsics.g(touristCountSelectorV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return touristCountSelectorV3ViewModel;
            }
        }).a(TouristCountSelectorV3ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new TouristCountSelectorV3FooterWidgetViewHolder(container, (TouristCountSelectorV3ViewModel) a11, new ET.a(0));
    }

    @Override // c20.r, I00.d
    public TouristCountSelectorV3FooterVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TouristCountSelectorV3FooterVO oldItem) {
        boolean z11;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof TouristCountSelectorV3RoomsUpdate)) {
            return null;
        }
        if (oldItem.getAddRoomButton() != null) {
            List<TouristCountSelectorV3RoomVO> rooms = ((TouristCountSelectorV3RoomsUpdate) update).getRooms();
            if (!(rooms instanceof Collection) || !rooms.isEmpty()) {
                Iterator<T> it = rooms.iterator();
                while (it.hasNext()) {
                    if (!((TouristCountSelectorV3RoomVO) it.next()).getIsRoomVisible()) {
                        z11 = true;
                        break;
                    }
                }
            }
        }
        z11 = false;
        boolean z12 = z11;
        if (z12 == oldItem.getIsAddRoomButtonVisible()) {
            return null;
        }
        return TouristCountSelectorV3FooterVO.copy$default(oldItem, 0L, null, z12, null, 11, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TouristCountSelectorV3FooterVO> map(@NotNull TouristCountSelectorV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
