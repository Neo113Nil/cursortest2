package ru.ozon.app.android.storefront.navBar;

import A00.a;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import l20.c;
import l20.d;
import ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.navBar.databinding.WidgetNavbarBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavBarOverlayViewHolder$observeBusEvents$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ NavBarOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarOverlayViewHolder$observeBusEvents$1(NavBarOverlayViewHolder navBarOverlayViewHolder) {
        super(1);
        this.this$0 = navBarOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019e, code lost:
    
        r2 = r8.appBar;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(a aVar) {
        ViewGroup viewGroup;
        NavBarVO navBarVO;
        WidgetNavbarBinding widgetNavbarBinding;
        WidgetNavbarBinding widgetNavbarBinding2;
        i iVar;
        boolean z11;
        AppBarLayout appBarLayout;
        Object obj;
        c d11;
        HashMap hashMap;
        ru.ozon.composer.ui.widget.a aVar2;
        WidgetNavbarBinding widgetNavbarBinding3;
        boolean z12 = true;
        if (aVar instanceof a.J) {
            for (Map.Entry entry : this.this$0.currentPlaceholders.entrySet()) {
                String str = (String) entry.getKey();
                switch (str.hashCode()) {
                    case -1939100487:
                        if (str.equals(NavBarDTO.NESTED_PLACEHOLDER_EXPANDED) && (navBarVO = this.this$0.dataItem) != null) {
                            viewGroup = this.this$0.getExpandedContainerOrNull(navBarVO.getIsExpanded());
                            break;
                        }
                        viewGroup = null;
                        break;
                    case 3317767:
                        if (str.equals("left")) {
                            widgetNavbarBinding = this.this$0.binding;
                            viewGroup = widgetNavbarBinding.actionPointsLeftLL;
                            break;
                        }
                        viewGroup = null;
                        break;
                    case 108511772:
                        if (str.equals("right")) {
                            widgetNavbarBinding2 = this.this$0.binding;
                            viewGroup = widgetNavbarBinding2.actionPointsRightLL;
                            break;
                        }
                        viewGroup = null;
                        break;
                    case 1544803905:
                        if (str.equals("default")) {
                            widgetNavbarBinding3 = this.this$0.binding;
                            viewGroup = widgetNavbarBinding3.placeholderFl;
                            break;
                        }
                        viewGroup = null;
                        break;
                    default:
                        viewGroup = null;
                        break;
                }
                if (viewGroup != null) {
                    iVar = this.this$0.uiContainer;
                    ArrayList c11 = iVar.J().s().c(((a.J) aVar).d(), ((NavBarOverlayViewHolder.VisiblePlaceholders) entry.getValue()).getPlaceholders());
                    if (c11 != null) {
                        NavBarOverlayViewHolder navBarOverlayViewHolder = this.this$0;
                        if (!((NavBarOverlayViewHolder.VisiblePlaceholders) entry.getValue()).getAreContentTheSame()) {
                            if (((NavBarOverlayViewHolder.VisiblePlaceholders) entry.getValue()).getPlaceholders().isEmpty()) {
                                navBarOverlayViewHolder.removeViewsIfNotEmpty(viewGroup);
                                navBarOverlayViewHolder.addNestedWidgetsIntoViewGroup(navBarOverlayViewHolder.dataItem, c11, viewGroup);
                                NavBarVO navBarVO2 = navBarOverlayViewHolder.dataItem;
                                if (navBarVO2 != null) {
                                    z11 = true;
                                    if (navBarOverlayViewHolder.isExpanded(navBarVO2, navBarOverlayViewHolder.currentPlaceholders) && appBarLayout != null) {
                                        navBarOverlayViewHolder.observeSystemInsets(appBarLayout);
                                    }
                                } else {
                                    z11 = true;
                                }
                                z12 = z11;
                            } else {
                                int i11 = 0;
                                for (Object obj2 : ((NavBarOverlayViewHolder.VisiblePlaceholders) entry.getValue()).getPlaceholders()) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        C7714v.O0();
                                        throw null;
                                    }
                                    l lVar = (l) obj2;
                                    Iterator it = c11.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (((l) obj).j() == lVar.j()) {
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    l lVar2 = (l) obj;
                                    if (lVar2 != null && (d11 = lVar2.d()) != null) {
                                        NavBarOverlayViewHolder.VisiblePlaceholders visiblePlaceholders = (NavBarOverlayViewHolder.VisiblePlaceholders) navBarOverlayViewHolder.currentPlaceholders.get(entry.getKey());
                                        if (visiblePlaceholders != null) {
                                            HashMap hashMap2 = navBarOverlayViewHolder.currentPlaceholders;
                                            Object key = entry.getKey();
                                            ArrayList W02 = C7714v.W0(visiblePlaceholders.getPlaceholders());
                                            W02.set(i11, lVar2);
                                            Unit unit = Unit.f71690a;
                                            hashMap2.put(key, NavBarOverlayViewHolder.VisiblePlaceholders.copy$default(visiblePlaceholders, null, W02, false, 5, null));
                                        }
                                        hashMap = navBarOverlayViewHolder.currentViewHolders;
                                        k kVar = (k) hashMap.get(Integer.valueOf(lVar.j()));
                                        if (kVar != null) {
                                            d c12 = lVar.c();
                                            aVar2 = navBarOverlayViewHolder.widgetsFactory;
                                            kVar.bindItem(d11, c12, aVar2.g(lVar, lVar2));
                                        }
                                    }
                                    i11 = i12;
                                    z12 = true;
                                }
                            }
                        }
                        z11 = z12;
                        z12 = z11;
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
