package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Tg.b;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6617b;
import java.util.List;
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
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data.FloatCartButtonDTO;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.data.FloatCartButtonMapperKt;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonViewModelFactory;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonVO;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonWidgetHolderKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FloatCartButtonViewMapperKt$floatCartViewMapper$1 extends AbstractC7737t implements Function1<e<FloatCartButtonDTO, FloatCartButtonVO>, Unit> {
    public static final FloatCartButtonViewMapperKt$floatCartViewMapper$1 INSTANCE = new FloatCartButtonViewMapperKt$floatCartViewMapper$1();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "invoke", "(Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/data/FloatCartButtonDTO;Ll20/d;)Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core.FloatCartButtonViewMapperKt$floatCartViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<FloatCartButtonDTO, d, FloatCartButtonVO> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final FloatCartButtonVO invoke(FloatCartButtonDTO state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return FloatCartButtonMapperKt.toVO(state, info.d().hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core.FloatCartButtonViewMapperKt$floatCartViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<FloatCartButtonVO>, Unit> {
        final /* synthetic */ InterfaceC4008j<FloatCartButtonDIComponent> $diComponent$delegate;
        final /* synthetic */ e<FloatCartButtonDTO, FloatCartButtonVO> $this_overlayViewMapper;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.core.FloatCartButtonViewMapperKt$floatCartViewMapper$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<FloatCartButtonVO>, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ InterfaceC4008j<FloatCartButtonDIComponent> $diComponent$delegate;
            final /* synthetic */ e<FloatCartButtonDTO, FloatCartButtonVO> $this_overlayViewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(e<FloatCartButtonDTO, FloatCartButtonVO> eVar, InterfaceC4008j<? extends FloatCartButtonDIComponent> interfaceC4008j) {
                super(3);
                this.$this_overlayViewMapper = eVar;
                this.$diComponent$delegate = interfaceC4008j;
            }

            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Unit invoke(i<FloatCartButtonVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<FloatCartButtonVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                List<Long> skuList;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                if ((i11 & 6) == 0) {
                    i11 |= interfaceC3967k.n(content) ? 4 : 2;
                }
                if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
                B0 a11 = ((h) interfaceC3967k.m(b00.f.f())).a();
                FloatCartButtonViewModelFactory viewModelFactory = FloatCartButtonViewMapperKt$floatCartViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getViewModelFactory();
                interfaceC3967k.B(1729797275);
                w0 a12 = C6617b.a(N.b(FloatCartButtonViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                interfaceC3967k.K();
                FloatCartButtonViewModel floatCartButtonViewModel = (FloatCartButtonViewModel) a12;
                FloatCartButtonVO b11 = content.b();
                FloatCartButtonVO floatCartButtonVO = b11 instanceof FloatCartButtonVO ? b11 : null;
                if (floatCartButtonVO != null && (skuList = floatCartButtonVO.getSkuList()) != null) {
                    floatCartButtonViewModel.setSkuList(skuList);
                }
                FloatCartButtonWidgetHolderKt.m709FloatCartButtonWidgetHolderFJfuzF0(content.b(), floatCartButtonViewModel, m470buildHandlerimpl, FloatCartButtonViewMapperKt$floatCartViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getTokenizedAnalytics(), 0.0f, interfaceC3967k, 0, 16);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(e<FloatCartButtonDTO, FloatCartButtonVO> eVar, InterfaceC4008j<? extends FloatCartButtonDIComponent> interfaceC4008j) {
            super(1);
            this.$this_overlayViewMapper = eVar;
            this.$diComponent$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f<FloatCartButtonVO> fVar) {
            invoke2(fVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f<FloatCartButtonVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 2008528208, new AnonymousClass1(this.$this_overlayViewMapper, this.$diComponent$delegate)));
        }
    }

    FloatCartButtonViewMapperKt$floatCartViewMapper$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FloatCartButtonDIComponent invoke$lambda$0(InterfaceC4008j<? extends FloatCartButtonDIComponent> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e<FloatCartButtonDTO, FloatCartButtonVO> eVar) {
        invoke2(eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e<FloatCartButtonDTO, FloatCartButtonVO> overlayViewMapper) {
        Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new FloatCartButtonViewMapperKt$floatCartViewMapper$1$diComponent$2(overlayViewMapper));
        c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
        overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(overlayViewMapper, unsafeLazy));
    }
}
