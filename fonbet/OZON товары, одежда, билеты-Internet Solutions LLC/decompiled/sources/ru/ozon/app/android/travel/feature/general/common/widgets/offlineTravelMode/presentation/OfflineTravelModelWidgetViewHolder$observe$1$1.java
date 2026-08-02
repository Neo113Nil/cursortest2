package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelWidgetsStateDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelWidgetViewHolder$observe$1$1", f = "OfflineTravelModelWidgetViewHolder.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OfflineTravelModelWidgetViewHolder$observe$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OfflineTravelModelWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel$Data;", "data", "", "emit", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel$Data;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineTravelModelWidgetViewHolder$observe$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ OfflineTravelModelWidgetViewHolder this$0;

        AnonymousClass1(OfflineTravelModelWidgetViewHolder offlineTravelModelWidgetViewHolder) {
            this.this$0 = offlineTravelModelWidgetViewHolder;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((OfflineTravelModelViewModel.Data) obj, (d<? super Unit>) dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
        
            if (r7.saveWidgetsState(r6, r0) != r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(OfflineTravelModelViewModel.Data data, d<? super Unit> dVar) {
            OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1 offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1;
            int i11;
            OfflineTravelStorage offlineTravelStorage;
            AnonymousClass1<T> anonymousClass1;
            OfflineTravelStorage offlineTravelStorage2;
            if (dVar instanceof OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1) {
                offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1 = (OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1) dVar;
                int i12 = offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        offlineTravelStorage = this.this$0.offlineTravelStorage;
                        String widgetsHash = data.getWidgetsHash();
                        offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$0 = this;
                        offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$1 = data;
                        offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label = 1;
                        if (offlineTravelStorage.saveWidgetsHash(widgetsHash, offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1) != aVar) {
                            anonymousClass1 = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    data = (OfflineTravelModelViewModel.Data) offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$0;
                    s.b(obj);
                    offlineTravelStorage2 = anonymousClass1.this$0.offlineTravelStorage;
                    OfflineTravelWidgetsStateDTO widgetsState = data.getWidgetsState();
                    offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$0 = null;
                    offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$1 = null;
                    offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label = 2;
                }
            }
            offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1 = new OfflineTravelModelWidgetViewHolder$observe$1$1$1$emit$1(this, dVar);
            Object obj2 = offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label;
            if (i11 != 0) {
            }
            offlineTravelStorage2 = anonymousClass1.this$0.offlineTravelStorage;
            OfflineTravelWidgetsStateDTO widgetsState2 = data.getWidgetsState();
            offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$0 = null;
            offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.L$1 = null;
            offlineTravelModelWidgetViewHolder$observe$1$1$1$emit$1.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelModelWidgetViewHolder$observe$1$1(OfflineTravelModelWidgetViewHolder offlineTravelModelWidgetViewHolder, d<? super OfflineTravelModelWidgetViewHolder$observe$1$1> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelModelWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelModelWidgetViewHolder$observe$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OfflineTravelModelViewModel offlineTravelModelViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            offlineTravelModelViewModel = this.this$0.viewModel;
            B0<OfflineTravelModelViewModel.Data> serializableWidgets = offlineTravelModelViewModel.getSerializableWidgets();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (serializableWidgets.collect(anonymousClass1, this) == aVar) {
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
        return ((OfflineTravelModelWidgetViewHolder$observe$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
