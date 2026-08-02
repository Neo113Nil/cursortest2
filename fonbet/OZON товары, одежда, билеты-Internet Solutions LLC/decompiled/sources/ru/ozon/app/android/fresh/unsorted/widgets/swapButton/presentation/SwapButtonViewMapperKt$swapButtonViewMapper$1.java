package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6617b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.SwapButtonDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.SwapButtonMapperKt;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonViewModelFactory;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SwapButtonDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SwapButtonViewMapperKt$swapButtonViewMapper$1 extends AbstractC7737t implements Function1<j<SwapButtonDTO, SwapButtonVO>, Unit> {
    public static final SwapButtonViewMapperKt$swapButtonViewMapper$1 INSTANCE = new SwapButtonViewMapperKt$swapButtonViewMapper$1();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SwapButtonDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SwapButtonDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewMapperKt$swapButtonViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<SwapButtonDTO, d, SwapButtonVO> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final SwapButtonVO invoke(SwapButtonDTO state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return SwapButtonMapperKt.toVO(state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewMapperKt$swapButtonViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<SwapButtonVO>, Unit> {
        final /* synthetic */ InterfaceC4008j<SwapButtonDIComponent> $diComponent$delegate;
        final /* synthetic */ j<SwapButtonDTO, SwapButtonVO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewMapperKt$swapButtonViewMapper$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<SwapButtonVO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ InterfaceC4008j<SwapButtonDIComponent> $diComponent$delegate;
            final /* synthetic */ j<SwapButtonDTO, SwapButtonVO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(j<SwapButtonDTO, SwapButtonVO> jVar, InterfaceC4008j<? extends SwapButtonDIComponent> interfaceC4008j) {
                super(4);
                this.$this_viewMapper = jVar;
                this.$diComponent$delegate = interfaceC4008j;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<SwapButtonVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<SwapButtonVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i11 |= interfaceC3967k.n(content) ? 4 : 2;
                }
                if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                B0 b11 = ((h) interfaceC3967k.m(f.f())).b();
                SwapButtonViewModelFactory viewModelFactory = SwapButtonViewMapperKt$swapButtonViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getViewModelFactory();
                interfaceC3967k.B(1729797275);
                w0 a11 = C6617b.a(N.b(SwapButtonViewModel.class), b11, null, viewModelFactory, b11 instanceof InterfaceC5431s ? ((InterfaceC5431s) b11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                interfaceC3967k.K();
                SwapButtonWidgetHolderKt.m774SwapButtonWidgetHolderegy_3UM(null, content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), (SwapButtonViewModel) a11, SwapButtonViewMapperKt$swapButtonViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getNavigator(), SwapButtonViewMapperKt$swapButtonViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getController(), SwapButtonViewMapperKt$swapButtonViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getTokenizedAnalytics(), 0.0f, interfaceC3967k, 0, 129);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(j<SwapButtonDTO, SwapButtonVO> jVar, InterfaceC4008j<? extends SwapButtonDIComponent> interfaceC4008j) {
            super(1);
            this.$this_viewMapper = jVar;
            this.$diComponent$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<SwapButtonVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<SwapButtonVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, -1809942560, new AnonymousClass1(this.$this_viewMapper, this.$diComponent$delegate)));
        }
    }

    SwapButtonViewMapperKt$swapButtonViewMapper$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwapButtonDIComponent invoke$lambda$0(InterfaceC4008j<? extends SwapButtonDIComponent> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<SwapButtonDTO, SwapButtonVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<SwapButtonDTO, SwapButtonVO> viewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new SwapButtonViewMapperKt$swapButtonViewMapper$1$diComponent$2(viewMapper));
        c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
        viewMapper.G(new AnonymousClass2(viewMapper, unsafeLazy));
    }
}
