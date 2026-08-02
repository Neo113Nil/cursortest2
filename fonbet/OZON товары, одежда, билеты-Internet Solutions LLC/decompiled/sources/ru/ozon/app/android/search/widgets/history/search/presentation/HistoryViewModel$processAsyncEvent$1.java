package ru.ozon.app.android.search.widgets.history.search.presentation;

import Ae.w0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryMapper;
import ru.ozon.app.android.search.widgets.history.search.presentation.updateKey.TagsOpened;
import ru.ozon.uni.atoms.data.AtomDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewModel$processAsyncEvent$1", f = "HistoryViewModel.kt", l = {63, 71}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewModel$processAsyncEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Long $id;
    final /* synthetic */ Map<String, Object> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewModel$processAsyncEvent$1(HistoryViewModel historyViewModel, String str, Map<String, ? extends Object> map, Long l11, d<? super HistoryViewModel$processAsyncEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = historyViewModel;
        this.$asyncData = str;
        this.$params = map;
        this.$id = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HistoryViewModel$processAsyncEvent$1 historyViewModel$processAsyncEvent$1 = new HistoryViewModel$processAsyncEvent$1(this.this$0, this.$asyncData, this.$params, this.$id, dVar);
        historyViewModel$processAsyncEvent$1.L$0 = obj;
        return historyViewModel$processAsyncEvent$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r13.emit(r4, r12) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HistoryViewModel$processAsyncEvent$1 historyViewModel$processAsyncEvent$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Object obj2;
        InterfaceC7851b interfaceC7851b;
        w0 w0Var;
        HistoryMapper historyMapper;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HistoryViewModel historyViewModel = this.this$0;
            String str = this.$asyncData;
            Map<String, Object> map = this.$params;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = historyViewModel.asyncWidgetRepository;
                this.label = 1;
                historyViewModel$processAsyncEvent$1 = this;
            } catch (Throwable th3) {
                th = th3;
                historyViewModel$processAsyncEvent$1 = this;
                th2 = th;
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                HistoryViewModel historyViewModel2 = historyViewModel$processAsyncEvent$1.this$0;
                Long l11 = historyViewModel$processAsyncEvent$1.$id;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            try {
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, map, HistoryDTO.class, null, historyViewModel$processAsyncEvent$1, 8, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                HistoryViewModel historyViewModel22 = historyViewModel$processAsyncEvent$1.this$0;
                Long l112 = historyViewModel$processAsyncEvent$1.$id;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar2 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                a.b bVar22 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                    bVar22.e(b11);
                }
                return Unit.f71690a;
            }
            try {
                s.b(obj);
                historyViewModel$processAsyncEvent$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                historyViewModel$processAsyncEvent$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                HistoryViewModel historyViewModel222 = historyViewModel$processAsyncEvent$1.this$0;
                Long l1122 = historyViewModel$processAsyncEvent$1.$id;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar222 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        HistoryViewModel historyViewModel2222 = historyViewModel$processAsyncEvent$1.this$0;
        Long l11222 = historyViewModel$processAsyncEvent$1.$id;
        if (!(obj2 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj2;
            interfaceC7851b = historyViewModel2222.composerController;
            long longValue = l11222.longValue();
            List<AtomDTO> historyItems = ((HistoryDTO) composerAsyncWidgetResponse.getState()).getHistoryItems();
            ArrayList arrayList = new ArrayList(C7714v.z(historyItems, 10));
            for (AtomDTO atomDTO : historyItems) {
                historyMapper = historyViewModel2222.mapper;
                arrayList.add(historyMapper.mapHistoryItemToVO(atomDTO));
            }
            interfaceC7851b.update(new TagsOpened(longValue, arrayList));
            w0Var = historyViewModel2222._events;
            historyViewModel$processAsyncEvent$1.L$0 = obj2;
            historyViewModel$processAsyncEvent$1.label = 2;
        }
        a.b bVar2222 = Lm0.a.f17149a;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HistoryViewModel$processAsyncEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
