package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.core;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.data.EdoProvidersV2DTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.data.EdoProvidersV2MapperKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.di.EdoProvidersV2Component;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.domain.EdoProvidersV2VO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.presentation.EdoProvidersV2ComposableKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1 extends AbstractC7737t implements Function1<j<EdoProvidersV2DTO, EdoProvidersV2VO>, Unit> {
    public static final EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1 INSTANCE = new EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO;", "state", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO;Ll20/d;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.core.EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<EdoProvidersV2DTO, d, EdoProvidersV2VO> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final EdoProvidersV2VO invoke(EdoProvidersV2DTO state, d widgetInfo) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
            return EdoProvidersV2MapperKt.toVO(state, widgetInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.core.EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<EdoProvidersV2VO>, Unit> {
        final /* synthetic */ InterfaceC4008j<EdoProvidersV2Component> $component$delegate;
        final /* synthetic */ j<EdoProvidersV2DTO, EdoProvidersV2VO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.core.EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<EdoProvidersV2VO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ InterfaceC4008j<EdoProvidersV2Component> $component$delegate;
            final /* synthetic */ j<EdoProvidersV2DTO, EdoProvidersV2VO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(j<EdoProvidersV2DTO, EdoProvidersV2VO> jVar, InterfaceC4008j<? extends EdoProvidersV2Component> interfaceC4008j) {
                super(4);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<EdoProvidersV2VO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<EdoProvidersV2VO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                } else {
                    EdoProvidersV2ComposableKt.m743EdoProvidersV2ComposableLLhsUjk(null, content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12 & 14, 14), EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStore())), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC3967k, 0, 1017);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(j<EdoProvidersV2DTO, EdoProvidersV2VO> jVar, InterfaceC4008j<? extends EdoProvidersV2Component> interfaceC4008j) {
            super(1);
            this.$this_viewMapper = jVar;
            this.$component$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<EdoProvidersV2VO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<EdoProvidersV2VO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 385106692, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
        }
    }

    EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EdoProvidersV2Component invoke$lambda$0(InterfaceC4008j<? extends EdoProvidersV2Component> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<EdoProvidersV2DTO, EdoProvidersV2VO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<EdoProvidersV2DTO, EdoProvidersV2VO> viewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new EdoProvidersV2ViewMapperKt$edoProvidersV2ViewMapper$1$component$2(viewMapper));
        c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
        viewMapper.G(new AnonymousClass2(viewMapper, unsafeLazy));
    }
}
