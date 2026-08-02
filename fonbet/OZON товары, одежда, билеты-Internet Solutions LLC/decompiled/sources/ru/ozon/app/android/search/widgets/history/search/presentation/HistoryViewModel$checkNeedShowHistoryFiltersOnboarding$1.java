package ru.ozon.app.android.search.widgets.history.search.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryUiEffect;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1", f = "HistoryViewModel.kt", l = {127, UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HistoryVO $item;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1(HistoryVO historyVO, HistoryViewModel historyViewModel, d<? super HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1> dVar) {
        super(2, dVar);
        this.$item = historyVO;
        this.this$0 = historyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1(this.$item, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008e, code lost:
    
        if (r8.emit(r3, r7) != r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        HistoryItem.TagButtonVO tagButtonVO;
        HistoryViewModel historyViewModel;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            List<HistoryItem> historyItems = this.$item.getHistoryItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : historyItems) {
                if (obj3 instanceof HistoryItem.TagButtonVO) {
                    arrayList.add(obj3);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((HistoryItem.TagButtonVO) obj2).isFilterTag()) {
                    break;
                }
            }
            tagButtonVO = (HistoryItem.TagButtonVO) obj2;
            if (tagButtonVO != null) {
                HistoryViewModel historyViewModel2 = this.this$0;
                this.L$0 = historyViewModel2;
                this.L$1 = tagButtonVO;
                this.label = 1;
                if (Y.b(100L, this) != aVar) {
                    historyViewModel = historyViewModel2;
                    w0Var = historyViewModel._effects;
                    HistoryUiEffect.ShowHistoryFiltersOnboarding showHistoryFiltersOnboarding = new HistoryUiEffect.ShowHistoryFiltersOnboarding(tagButtonVO);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                }
                return aVar;
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
        tagButtonVO = (HistoryItem.TagButtonVO) this.L$1;
        historyViewModel = (HistoryViewModel) this.L$0;
        s.b(obj);
        w0Var = historyViewModel._effects;
        HistoryUiEffect.ShowHistoryFiltersOnboarding showHistoryFiltersOnboarding2 = new HistoryUiEffect.ShowHistoryFiltersOnboarding(tagButtonVO);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
