package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer;

import A00.a;
import Fu.C3060a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h20.InterfaceC6786a;
import java.util.ArrayList;
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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectFooterWrapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di.TravelRailwaySeatSelectWithSchemeComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.UpdateSeatSelect;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AtomDTOHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001dj\b\u0012\u0004\u0012\u00020\u0002`\u001e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060/j\u0002`0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040(0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010'R \u00108\u001a\u000e\u0012\n\b\u0001\u0012\u000604j\u0002`5038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/TravelRailwaySeatSelectFooterViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/di/TravelRailwaySeatSelectWithSchemeComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterWrapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/TravelRailwaySeatSelectFooterWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/UpdateSeatSelect;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySeatSelectFooterViewMapper extends WidgetViewMapper2<TravelRailwaySeatSelectWithSchemeComponent, TravelRailwaySeatSelectFooterWrapper, TravelRailwaySeatSelectFooterVO> {

    @NotNull
    private final Function2<View, ComposerReferences, TravelRailwaySeatSelectFooterWidgetViewHolder> holderProducer = new TravelRailwaySeatSelectFooterViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<UpdateSeatSelect>> supportedUpdates = C7714v.a0(UpdateSeatSelect.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelRailwaySeatSelectWithSchemeComponent widgetComponent$lambda$3(C7475g c7475g) {
        return new TravelRailwaySeatSelectWithSchemeComponent(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TravelRailwaySeatSelectFooterWrapper) && !((TravelRailwaySeatSelectFooterWrapper) state).getFooter().isEmptyState();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TravelRailwaySeatSelectFooterWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelRailwaySeatSelectFooterWrapper, d, List<TravelRailwaySeatSelectFooterVO>> getMapper() {
        return component().getFooterMapper();
    }

    public void getPayload(@NotNull TravelRailwaySeatSelectFooterVO oldItem, @NotNull TravelRailwaySeatSelectFooterVO newItem) {
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
        return new C7473e<>(N.b(TravelRailwaySeatSelectWithSchemeComponent.class), new C3060a(storage, 7));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((TravelRailwaySeatSelectFooterVO) cVar, (TravelRailwaySeatSelectFooterVO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public TravelRailwaySeatSelectFooterVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TravelRailwaySeatSelectFooterVO oldItem) {
        TravelRailwaySeatSelectFooterVO copy$default;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof UpdateSeatSelect)) {
            return null;
        }
        UpdateSeatSelect updateSeatSelect = (UpdateSeatSelect) update;
        TravelRailwaySeatSelectFooterVO newFooter = updateSeatSelect.getNewFooter();
        TravelRailwaySeatSelectFooterVO travelRailwaySeatSelectFooterVO = (newFooter == null || (copy$default = TravelRailwaySeatSelectFooterVO.copy$default(newFooter, oldItem.getId(), null, null, 6, null)) == null) ? oldItem : copy$default;
        if (updateSeatSelect.getIsSeatsLeftVisible() == null) {
            return travelRailwaySeatSelectFooterVO;
        }
        ArrayList arrayList = new ArrayList();
        TextAtom seatsLeft = travelRailwaySeatSelectFooterVO.getSeatsLeft();
        AtomDTOHolder atomDTOHolder = seatsLeft != null ? new AtomDTOHolder(seatsLeft.hashCode(), seatsLeft) : null;
        if (updateSeatSelect.getIsSeatsLeftVisible().booleanValue() && atomDTOHolder != null) {
            arrayList.add(atomDTOHolder);
        }
        List<TravelRailwaySeatSelectFooterVO.FooterItem> footerContent = travelRailwaySeatSelectFooterVO.getFooterContent();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : footerContent) {
            if (!Intrinsics.d((TravelRailwaySeatSelectFooterVO.FooterItem) obj, atomDTOHolder)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return TravelRailwaySeatSelectFooterVO.copy$default(travelRailwaySeatSelectFooterVO, 0L, arrayList, null, 5, null);
    }
}
