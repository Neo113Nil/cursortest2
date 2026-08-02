package ru.ozon.app.android.travel.feature.entry.fragment;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.tabbar.data.TabConfig;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragment$observeViewModel$1", f = "OzonTravelFragment.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OzonTravelFragment$observeViewModel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonTravelFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonTravelFragment$observeViewModel$1(OzonTravelFragment ozonTravelFragment, d<? super OzonTravelFragment$observeViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = ozonTravelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonTravelFragment$observeViewModel$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonTravelFragmentViewModel viewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            viewModel = this.this$0.getViewModel();
            M0<TabConfig> tabConfigFlow = viewModel.getTabConfigFlow();
            final OzonTravelFragment ozonTravelFragment = this.this$0;
            InterfaceC2397i<? super TabConfig> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragment$observeViewModel$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((TabConfig) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(TabConfig tabConfig, d<? super Unit> dVar) {
                    TabConfig tabConfig2;
                    tabConfig2 = OzonTravelFragment.this.tabConfig;
                    if (!Intrinsics.d(tabConfig2, tabConfig)) {
                        OzonTravelFragment.this.tabConfig = tabConfig;
                        OzonTravelFragment.this.bindConfig(tabConfig);
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (tabConfigFlow.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OzonTravelFragment$observeViewModel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
