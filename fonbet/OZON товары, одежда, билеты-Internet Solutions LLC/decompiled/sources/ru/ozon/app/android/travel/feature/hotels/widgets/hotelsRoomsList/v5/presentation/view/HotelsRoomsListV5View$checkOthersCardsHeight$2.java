package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffVO;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5View$checkOthersCardsHeight$2", f = "HotelsRoomsListV5View.kt", l = {419, 430}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsRoomsListV5View$checkOthersCardsHeight$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<TariffVO> $tariffs;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ HotelsRoomsListV5View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsRoomsListV5View$checkOthersCardsHeight$2(HotelsRoomsListV5View hotelsRoomsListV5View, List<TariffVO> list, d<? super HotelsRoomsListV5View$checkOthersCardsHeight$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsRoomsListV5View;
        this.$tariffs = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsRoomsListV5View$checkOthersCardsHeight$2(this.this$0, this.$tariffs, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        if (ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt.awaitNextLayout(r10, r9) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0092 -> B:6:0x0095). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        int i11;
        Iterator<TariffVO> it;
        int i12;
        RecyclerView recyclerView2;
        HotelsRoomsListV5TariffView hotelsRoomsListV5TariffView;
        HotelsRoomsListV5TariffView hotelsRoomsListV5TariffView2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            recyclerView = this.this$0.hotelsRoomsListTariffsRv;
            this.label = 1;
        } else if (i13 == 1) {
            s.b(obj);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.I$1;
            int i14 = this.I$0;
            it = (Iterator) this.L$0;
            s.b(obj);
            i11 = Math.max(i11, ((Number) obj).intValue());
            i12 = i14;
            if (it.hasNext()) {
                TariffVO next = it.next();
                if (next.getSpecialTariffBadge() != null) {
                    i12 = 1;
                }
                hotelsRoomsListV5TariffView = this.this$0.hotelsRoomsListMeasureTariff;
                hotelsRoomsListV5TariffView.bind(next);
                hotelsRoomsListV5TariffView2 = this.this$0.hotelsRoomsListMeasureTariff;
                this.L$0 = it;
                this.I$0 = i12;
                this.I$1 = i11;
                this.label = 2;
                Object heightAfterLayout = ViewExtensionsKt.getHeightAfterLayout(hotelsRoomsListV5TariffView2, this);
                if (heightAfterLayout != aVar) {
                    i14 = i12;
                    obj = heightAfterLayout;
                    i11 = Math.max(i11, ((Number) obj).intValue());
                    i12 = i14;
                    if (it.hasNext()) {
                        this.this$0.updateTariffHeight(i11);
                        recyclerView2 = this.this$0.hotelsRoomsListTariffsRv;
                        ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt.safeUpdateMargins$default(recyclerView2, new Integer(i12 != 0 ? this.this$0.dp8 : this.this$0.dp12), null, null, null, 14, null);
                        return Unit.f71690a;
                    }
                }
                return aVar;
            }
        }
        linearLayoutManager = this.this$0.tariffsLayoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        linearLayoutManager2 = this.this$0.tariffsLayoutManager;
        if ((linearLayoutManager2.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1 == this.$tariffs.size()) {
            return Unit.f71690a;
        }
        i11 = 0;
        it = this.$tariffs.iterator();
        i12 = 0;
        if (it.hasNext()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsRoomsListV5View$checkOthersCardsHeight$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
