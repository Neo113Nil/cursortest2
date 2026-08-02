package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h20.InterfaceC6786a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper.MapperExtKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectWithSchemeV2DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di.TravelRailwaySeatSelectWithSchemeComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.UpdateSeatSelect;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001dj\b\u0012\u0004\u0012\u00020\u0002`\u001e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R<\u0010%\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\"\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040#j\b\u0012\u0004\u0012\u00020\u0004`$0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R0\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000600j\u0002`1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040)0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(R \u00109\u001a\u000e\u0012\n\b\u0001\u0012\u000605j\u0002`6048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/di/TravelRailwaySeatSelectWithSchemeComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectWithSchemeV2DTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/UpdateSeatSelect;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySeatSelectWithSchemeV2ViewMapper extends WidgetViewMapper2<TravelRailwaySeatSelectWithSchemeComponent, TravelRailwaySeatSelectWithSchemeV2DTO, TravelRailwaySeatSelectWithSchemeVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<TravelRailwaySeatSelectWithSchemeVO>> holderProducer = new TravelRailwaySeatSelectWithSchemeV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<UpdateSeatSelect>> supportedUpdates = C7714v.a0(UpdateSeatSelect.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelRailwaySeatSelectWithSchemeComponent widgetComponent$lambda$1(C7475g c7475g) {
        return new TravelRailwaySeatSelectWithSchemeComponent(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TravelRailwaySeatSelectWithSchemeV2DTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelRailwaySeatSelectWithSchemeView travelRailwaySeatSelectWithSchemeView = new TravelRailwaySeatSelectWithSchemeView(context, component().getSchemeController());
        travelRailwaySeatSelectWithSchemeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = travelRailwaySeatSelectWithSchemeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        travelRailwaySeatSelectWithSchemeView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        return travelRailwaySeatSelectWithSchemeView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TravelRailwaySeatSelectWithSchemeVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelRailwaySeatSelectWithSchemeV2DTO, d, List<TravelRailwaySeatSelectWithSchemeVO>> getMapper() {
        return component().getSchemeMapperV2();
    }

    public void getPayload(@NotNull TravelRailwaySeatSelectWithSchemeVO oldItem, @NotNull TravelRailwaySeatSelectWithSchemeVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<UpdateSeatSelect>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getRailwaySeatSelectViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelRailwaySeatSelectWithSchemeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TravelRailwaySeatSelectWithSchemeComponent.class), new CN.a(storage, 12));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((TravelRailwaySeatSelectWithSchemeVO) cVar, (TravelRailwaySeatSelectWithSchemeVO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public TravelRailwaySeatSelectWithSchemeVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TravelRailwaySeatSelectWithSchemeVO oldItem) {
        TravelRailwaySeatSelectWithSchemeVO copy;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof UpdateSeatSelect)) {
            return null;
        }
        UpdateSeatSelect updateSeatSelect = (UpdateSeatSelect) update;
        List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> newSeats = updateSeatSelect.getNewSeats();
        Integer findScrollXPosition = newSeats != null ? MapperExtKt.findScrollXPosition(newSeats) : null;
        List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> newSeats2 = updateSeatSelect.getNewSeats();
        if (newSeats2 == null) {
            newSeats2 = oldItem.getSeats();
        }
        List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> list = newSeats2;
        Boolean isSeatsLeftVisible = updateSeatSelect.getIsSeatsLeftVisible();
        copy = oldItem.copy((r32 & 1) != 0 ? oldItem.id : 0L, (r32 & 2) != 0 ? oldItem.tabSelector : null, (r32 & 4) != 0 ? oldItem.isTabSelectorVisible : false, (r32 & 8) != 0 ? oldItem.seats : list, (r32 & 16) != 0 ? oldItem.compartmentGenders : null, (r32 & 32) != 0 ? oldItem.genderIndicator : null, (r32 & 64) != 0 ? oldItem.seatTypes : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.darkSchemeLink : null, (r32 & 256) != 0 ? oldItem.lightSchemeLink : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.schemeScrollDescription : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.trainDirection : null, (r32 & 2048) != 0 ? oldItem.isBorderVisible : isSeatsLeftVisible != null ? isSeatsLeftVisible.booleanValue() : oldItem.getIsBorderVisible(), (r32 & 4096) != 0 ? oldItem.viewEvent : null, (r32 & 8192) != 0 ? oldItem.scrollXPosition : findScrollXPosition);
        return copy;
    }
}
