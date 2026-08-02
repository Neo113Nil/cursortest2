package ru.ozon.app.android.search.widgets.expandableCells.core;

import He.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.expandableCells.data.ExpandableCellsDTO;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionRequest;
import ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellVO;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellView;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.ExpandableCellViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0001\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001:B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'J+\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00020+j\b\u0012\u0004\u0012\u00020\u0002`,2\n\u0010*\u001a\u00060(j\u0002`)H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R0\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0017028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent;", "Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "<init>", "()V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lxe/M;", "warlockScope", "Lxe/M;", "Lkotlin/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "", "getHolderProducer", "()Ljava/lang/Void;", "holderProducer", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpandableCellViewMapper extends WidgetViewMapper2<ExpandableCellsComponent, ExpandableCellsDTO, ExpandableCellVO> {

    @NotNull
    private final M warlockScope;
    public static final int $stable = 8;

    public ExpandableCellViewMapper() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("ExpandableCellViewMapper", "getSimpleName(...)");
        this.warlockScope = N.a(d11.plus(new L("ExpandableCellViewMapper")).plus(new ExpandableCellViewMapper$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ExpandableCellsDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        super.constructLayout(composerRootView, viewObject, references, viewItemHelper);
        final AbstractC5434v lifecycle = references.getContainer().e().getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            N.c(this.warlockScope, null);
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellViewMapper$constructLayout$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(androidx.lifecycle.J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    N.c(this.warlockScope, null);
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<ExpandableCellVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ExpandableCellViewHolder((ExpandableCellView) view, container, component().getComposerStore(), component().getComposerUpdateMapper(), component().getTileGridmapper(), component().getViewModel());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ExpandableCellView expandableCellView = new ExpandableCellView(context);
        expandableCellView.setLayoutParams(new RecyclerView.p(-1, -2));
        return expandableCellView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ExpandableCellsDTO, d, List<ExpandableCellVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ExpandableCellsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ExpandableCellsComponent.INSTANCE.create(storage);
    }

    @NotNull
    public Void getHolderProducer() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, m20.InterfaceC8046a
    @NotNull
    public List<ExpandableCellVO> map(@NotNull ExpandableCellsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        List<ExpandableCellVO> map = super.map((ExpandableCellViewMapper) state, info);
        ArrayList arrayList = new ArrayList();
        for (Object obj : map) {
            if (((ExpandableCellVO) obj).getAutoExpand()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ExpandableCellVO expandableCellVO = (ExpandableCellVO) it.next();
            C10727i.c(this.warlockScope, null, null, new ExpandableCellViewMapper$map$2$1(this, new ActionV2Request(new GetWarlockSectionRequest(expandableCellVO.getCell().getCellId(), expandableCellVO.getBaseLink()), "getWarlockSectionAction", false, 4, null), expandableCellVO, null), 3);
        }
        return map;
    }
}
