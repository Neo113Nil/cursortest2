package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownView;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownWidgetViewHolder$onAttach$1", f = "DirectFlightsDropdownWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class DirectFlightsDropdownWidgetViewHolder$onAttach$1 extends j implements Function2<DirectFlightsDropdownVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DirectFlightsDropdownWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownWidgetViewHolder$onAttach$1$1", f = "DirectFlightsDropdownWidgetViewHolder.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownWidgetViewHolder$onAttach$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ DirectFlightsDropdownVO $it;
        int label;
        final /* synthetic */ DirectFlightsDropdownWidgetViewHolder this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownWidgetViewHolder$onAttach$1$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C18881 extends C7735q implements Function0<Unit> {
            C18881(Object obj) {
                super(0, obj, DirectFlightsDropdownViewModel.class, "switchExpandedState", "switchExpandedState()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((DirectFlightsDropdownViewModel) this.receiver).switchExpandedState();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder, DirectFlightsDropdownVO directFlightsDropdownVO, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = directFlightsDropdownWidgetViewHolder;
            this.$it = directFlightsDropdownVO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$it, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DirectFlightsDropdownView directFlightsDropdownView;
            int i11;
            DirectFlightsDropdownView directFlightsDropdownView2;
            DirectFlightsDropdownViewModel directFlightsDropdownViewModel;
            a aVar = a.COROUTINE_SUSPENDED;
            int i12 = this.label;
            if (i12 == 0) {
                s.b(obj);
                directFlightsDropdownView = this.this$0.view;
                if (directFlightsDropdownView.getHeight() == 0) {
                    i11 = -2;
                    directFlightsDropdownView2 = this.this$0.view;
                    DirectFlightsDropdownVO directFlightsDropdownVO = this.$it;
                    directFlightsDropdownViewModel = this.this$0.viewModel;
                    directFlightsDropdownView2.bind(directFlightsDropdownVO, i11, new C18881(directFlightsDropdownViewModel));
                    return Unit.f71690a;
                }
                DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder = this.this$0;
                DirectFlightsDropdownVO.ItemVO itemVO = (DirectFlightsDropdownVO.ItemVO) C7714v.M(this.$it.getVisibleItems());
                if (itemVO == null) {
                    return Unit.f71690a;
                }
                int size = this.$it.getVisibleItems().size();
                this.label = 1;
                obj = directFlightsDropdownWidgetViewHolder.calculateRVHeight(itemVO, size, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            i11 = ((Number) obj).intValue();
            directFlightsDropdownView2 = this.this$0.view;
            DirectFlightsDropdownVO directFlightsDropdownVO2 = this.$it;
            directFlightsDropdownViewModel = this.this$0.viewModel;
            directFlightsDropdownView2.bind(directFlightsDropdownVO2, i11, new C18881(directFlightsDropdownViewModel));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownWidgetViewHolder$onAttach$1(DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder, d<? super DirectFlightsDropdownWidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = directFlightsDropdownWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DirectFlightsDropdownWidgetViewHolder$onAttach$1 directFlightsDropdownWidgetViewHolder$onAttach$1 = new DirectFlightsDropdownWidgetViewHolder$onAttach$1(this.this$0, dVar);
        directFlightsDropdownWidgetViewHolder$onAttach$1.L$0 = obj;
        return directFlightsDropdownWidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DirectFlightsDropdownVO directFlightsDropdownVO = (DirectFlightsDropdownVO) this.L$0;
        this.this$0.cancelJob();
        DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder = this.this$0;
        directFlightsDropdownWidgetViewHolder.job = C10727i.c(K.a(directFlightsDropdownWidgetViewHolder), null, null, new AnonymousClass1(this.this$0, directFlightsDropdownVO, null), 3);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DirectFlightsDropdownVO directFlightsDropdownVO, d<? super Unit> dVar) {
        return ((DirectFlightsDropdownWidgetViewHolder$onAttach$1) create(directFlightsDropdownVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
