package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import Sc.s;
import Wc.a;
import io.reactivex.InterfaceC7095c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import ru.ozon.app.android.utils.Result;
import ru.ozon.app.android.utils.ResultKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1", f = "ComparisonBottomSheetViewModel.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7095c $emitter;
    int label;
    final /* synthetic */ ComparisonBottomSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1(ComparisonBottomSheetViewModel comparisonBottomSheetViewModel, InterfaceC7095c interfaceC7095c, d<? super ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1> dVar) {
        super(2, dVar);
        this.this$0 = comparisonBottomSheetViewModel;
        this.$emitter = interfaceC7095c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1(this.this$0, this.$emitter, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LinkedList linkedList;
        ComparisonRepository comparisonRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                linkedList = this.this$0.keyCharacteristics;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedList) {
                    if (((CharacteristicsPickVO.CellData.CellDataValue) obj2).getCell().isSelected()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CharacteristicsPickVO.CellData.CellDataValue) it.next()).getId());
                }
                comparisonRepository = this.this$0.comparisonRepository;
                this.label = 1;
                obj = comparisonRepository.submitSelectedCharacteristics(arrayList2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            ResultKt.getOrThrow((Result) obj);
            this.$emitter.onComplete();
        } catch (Exception e11) {
            this.$emitter.onError(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ComparisonBottomSheetViewModel$submitSelectedCharacteristics$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
