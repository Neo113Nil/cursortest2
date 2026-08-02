package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay;

import A00.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.VisiblePlaceholders;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ExpressNavBarOverlayHolder$observeBusEvents$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ ExpressNavBarOverlayHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressNavBarOverlayHolder$observeBusEvents$1(ExpressNavBarOverlayHolder expressNavBarOverlayHolder) {
        super(1);
        this.this$0 = expressNavBarOverlayHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a aVar) {
        HashMap hashMap;
        I00.a aVar2;
        if (aVar instanceof a.J) {
            hashMap = this.this$0.currentPlaceholders;
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar2 = this.this$0.composerItemMapper;
                ArrayList c11 = aVar2.c(((a.J) aVar).d(), ((VisiblePlaceholders) entry.getValue()).getPlaceholders());
                if (c11 == null || ((VisiblePlaceholders) entry.getValue()).getAreContentTheSame() || ((VisiblePlaceholders) entry.getValue()).getPlaceholders().isEmpty()) {
                    return;
                }
                List<l> placeholders = ((VisiblePlaceholders) entry.getValue()).getPlaceholders();
                ExpressNavBarOverlayHolder expressNavBarOverlayHolder = this.this$0;
                int i11 = 0;
                for (Object obj : placeholders) {
                    int i12 = i11 + 1;
                    Object obj2 = null;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    l lVar = (l) obj;
                    Iterator it = c11.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((l) next).j() == lVar.j()) {
                            obj2 = next;
                            break;
                        }
                    }
                    l lVar2 = (l) obj2;
                    if (lVar2 == null) {
                        return;
                    }
                    expressNavBarOverlayHolder.updatePlaceHolders(lVar, lVar2, (String) entry.getKey(), i11);
                    i11 = i12;
                }
            }
        }
    }
}
