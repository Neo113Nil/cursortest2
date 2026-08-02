package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealApplyFilterUpdateKey;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealClearFilterUpdateKey;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealSelectUpdateKey;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListVO;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListView;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u000f\u001a\u00020\r*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00162\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0010\u0010#\u001a\f\u0012\u0004\u0012\u00020\u001c0!j\u0002`\"H\u0016¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\n\u0010)\u001a\u00060'j\u0002`(H\u0016¢\u0006\u0004\b+\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R,\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001109088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R0\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060?j\u0002`@\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0004080>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/di/ToursMealComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "<init>", "()V", "", "selectLink", "consumeSelection", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "newFilterKey", "consumeFiltration", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "filterKey", "applyFilter", "(Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;Ljava/lang/String;)Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/reflect/KFunction2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealWidgetViewHolder;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursMealViewMapper extends WidgetViewMapper2<ToursMealComponent, ToursMealDTO, ToursMealVO> {
    private final Integer layout;

    @NotNull
    private final h<ToursMealWidgetViewHolder> holderProducer = ToursMealViewMapper$holderProducer$1.INSTANCE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ToursMealSelectUpdateKey.class, ToursMealApplyFilterUpdateKey.class, ToursMealClearFilterUpdateKey.class);

    private final TravelCellListVO applyFilter(TravelCellListVO travelCellListVO, String str) {
        if (str == null) {
            return travelCellListVO;
        }
        List<AtomDTO> cells = travelCellListVO.getCells();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            AtomDTO atomDTO = (AtomDTO) obj;
            if (atomDTO instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
                OzonSpannableString subtitle = ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) atomDTO).getSubtitle();
                if (Intrinsics.d(subtitle != null ? subtitle.toString() : null, str)) {
                    arrayList.add(obj);
                }
            }
        }
        TravelCellListVO copy$default = TravelCellListVO.copy$default(travelCellListVO, 0L, null, null, 0, 0, 0, arrayList, 63, null);
        return copy$default == null ? travelCellListVO : copy$default;
    }

    private final ToursMealVO consumeFiltration(ToursMealVO toursMealVO, String str) {
        if (Intrinsics.d(toursMealVO.getFilterKey(), str)) {
            return null;
        }
        return ToursMealVO.copy$default(toursMealVO, 0L, null, applyFilter(toursMealVO.getOriginCellList(), str), !r5.getCells().isEmpty(), str, false, 35, null);
    }

    private final ToursMealVO consumeSelection(ToursMealVO toursMealVO, String str) {
        List<AtomDTO> cells = toursMealVO.getOriginCellList().getCells();
        Iterator<AtomDTO> it = cells.iterator();
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (!it.hasNext() || (i12 != -1 && i13 != -1)) {
                break;
            }
            AtomDTO next = it.next();
            if (next instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) {
                if (i12 == -1 && ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) next).isSelected()) {
                    i12 = i11;
                }
                if (i13 == -1) {
                    AtomActionDTO action = ((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) next).getAction();
                    if (Intrinsics.d(action != null ? action.getLink() : null, str)) {
                        i13 = i11;
                    }
                    i11++;
                }
            }
            i11++;
        }
        if (i12 < 0 && i13 < 0) {
            return null;
        }
        if (i12 == i13) {
            return ToursMealVO.copy$default(toursMealVO, 0L, null, null, false, null, true, 31, null);
        }
        ArrayList W02 = C7714v.W0(cells);
        if (i12 >= 0) {
            Object obj = W02.get(i12);
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter");
            W02.set(i12, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) obj, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 1048574, null));
        }
        if (i13 >= 0) {
            Object obj2 = W02.get(i13);
            Intrinsics.g(obj2, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter");
            W02.set(i13, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.copy$default((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter) obj2, true, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 1048574, null));
        }
        TravelCellListVO copy$default = TravelCellListVO.copy$default(toursMealVO.getOriginCellList(), 0L, null, null, 0, 0, 0, W02, 63, null);
        return ToursMealVO.copy$default(toursMealVO, 0L, copy$default, applyFilter(copy$default, toursMealVO.getFilterKey()), false, null, false, 57, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull j10.h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(composerRootView);
        composerRecyclerView.setItemAnimator(null);
        composerRecyclerView.setLayoutAnimation(null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelCellListView travelCellListView = new TravelCellListView(context, null, 0, 0, 14, null);
        travelCellListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = travelCellListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context2);
        Context context3 = travelCellListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(16, context3);
        travelCellListView.setPadding(px2, px, px2, px);
        TravelCellListView.updateTitleMargin$default(travelCellListView, 0, 0, 0, px, 7, null);
        return travelCellListView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ToursMealDTO, d, List<ToursMealVO>> getMapper() {
        return component().getToursMealMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ToursMealComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ToursMealComponent.INSTANCE.create(storage);
    }

    @NotNull
    public h<ToursMealWidgetViewHolder> getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ToursMealVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ToursMealVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ToursMealSelectUpdateKey) {
            return consumeSelection(oldItem, ((ToursMealSelectUpdateKey) update).getSelectLink());
        }
        if (update instanceof ToursMealApplyFilterUpdateKey) {
            return consumeFiltration(oldItem, ((ToursMealApplyFilterUpdateKey) update).getFilterKey());
        }
        if (update instanceof ToursMealClearFilterUpdateKey) {
            return consumeFiltration(oldItem, null);
        }
        return null;
    }
}
