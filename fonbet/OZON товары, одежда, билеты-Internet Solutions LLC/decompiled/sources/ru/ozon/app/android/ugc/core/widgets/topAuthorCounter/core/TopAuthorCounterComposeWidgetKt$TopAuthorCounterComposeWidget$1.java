package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core;

import Ek.a;
import S0.InterfaceC3967k;
import WZ.l;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6616a;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorCounterDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationStateViewModel;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates.CounterWidgetStateKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates.TopAuthorAnimationStateKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates.TopAuthorWidgetStateKt;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    final /* synthetic */ CellListV2ViewMapper $cellListV2ViewMapper;
    final /* synthetic */ CommonIslandSeparatorViewMapper2 $islandSeparatorViewMapper;
    final /* synthetic */ SeparatorViewMapper $separatorViewMapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19561 extends AbstractC7737t implements Function1<C7244b, List<? extends Object>> {
            final /* synthetic */ TopAuthorCounterComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19561(TopAuthorCounterComponent topAuthorCounterComponent) {
                super(1);
                this.$component = topAuthorCounterComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<Object> invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.$component.getParser().invoke(it.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<Object> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<Object> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new C19561((TopAuthorCounterComponent) config.getWidgetComponentStorage().getComponent(TopAuthorCounterComponent.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ TopAuthorCounterComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TopAuthorCounterComponent topAuthorCounterComponent) {
                super(1);
                this.$component = topAuthorCounterComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof TopAuthorCounterDTO) {
                    TopAuthorCounterDTO topAuthorCounterDTO = (TopAuthorCounterDTO) obj;
                    if (topAuthorCounterDTO.getCounter() != null && topAuthorCounterDTO.getAuthor() != null && this.$component.getTopAuthorRepository().needToShowAnimation(topAuthorCounterDTO.getDate())) {
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19572 extends AbstractC7737t implements Function2<Object, d, TopAuthorWidgetViewState.TopAuthorWithAnimation> {
            final /* synthetic */ TopAuthorCounterComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19572(TopAuthorCounterComponent topAuthorCounterComponent) {
                super(2);
                this.$component = topAuthorCounterComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final TopAuthorWidgetViewState.TopAuthorWithAnimation invoke(Object state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return (TopAuthorWidgetViewState.TopAuthorWithAnimation) C7714v.K(this.$component.getTopAuthorAnimationMapper().invoke((TopAuthorCounterDTO) state, info));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<TopAuthorWidgetViewState.TopAuthorWithAnimation>, Unit> {
            final /* synthetic */ j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<TopAuthorWidgetViewState.TopAuthorWithAnimation>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<TopAuthorWidgetViewState.TopAuthorWithAnimation> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TopAuthorWidgetViewState.TopAuthorWithAnimation> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
                    interfaceC3967k.B(1729797275);
                    B0 a11 = C6616a.a(interfaceC3967k);
                    if (a11 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    w0 a12 = C6617b.a(N.b(TopAuthorAnimationStateViewModel.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    TopAuthorAnimationStateViewModel topAuthorAnimationStateViewModel = (TopAuthorAnimationStateViewModel) a12;
                    TopAuthorWidgetViewState.TopAuthorWithAnimation b11 = content.b();
                    interfaceC3967k.o(-875235950);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$2$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    TopAuthorAnimationStateKt.TopAuthorAnimationState(b11, topAuthorAnimationStateViewModel, (Function1) C11, m470buildHandlerimpl, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TopAuthorWidgetViewState.TopAuthorWithAnimation> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TopAuthorWidgetViewState.TopAuthorWithAnimation> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1042142080, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, TopAuthorWidgetViewState.TopAuthorWithAnimation> jVar) {
            TopAuthorCounterComponent topAuthorCounterComponent = (TopAuthorCounterComponent) a.c(jVar, "$this$viewMapper", TopAuthorCounterComponent.class);
            jVar.k(new AnonymousClass1(topAuthorCounterComponent), new C19572(topAuthorCounterComponent));
            jVar.G(new AnonymousClass3(jVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<Object, TopAuthorWidgetViewState.Counter>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof TopAuthorCounterDTO) {
                    TopAuthorCounterDTO topAuthorCounterDTO = (TopAuthorCounterDTO) obj;
                    if (topAuthorCounterDTO.getCounter() != null && topAuthorCounterDTO.getAuthor() == null) {
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, TopAuthorWidgetViewState.Counter> {
            final /* synthetic */ TopAuthorCounterComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TopAuthorCounterComponent topAuthorCounterComponent) {
                super(2);
                this.$component = topAuthorCounterComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final TopAuthorWidgetViewState.Counter invoke(Object state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return (TopAuthorWidgetViewState.Counter) C7714v.K(this.$component.getCounterMapper().invoke((TopAuthorCounterDTO) state, info));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19583 extends AbstractC7737t implements Function1<k<TopAuthorWidgetViewState.Counter>, Unit> {
            final /* synthetic */ j<Object, TopAuthorWidgetViewState.Counter> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<TopAuthorWidgetViewState.Counter>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<Object, TopAuthorWidgetViewState.Counter> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<Object, TopAuthorWidgetViewState.Counter> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<TopAuthorWidgetViewState.Counter> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TopAuthorWidgetViewState.Counter> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
                    TopAuthorWidgetViewState.Counter b11 = content.b();
                    interfaceC3967k.o(-875205422);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$3$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    CounterWidgetStateKt.CounterWidgetState(b11, (Function1) C11, m470buildHandlerimpl, 0.0f, 0.0f, interfaceC3967k, 0, 24);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19583(j<Object, TopAuthorWidgetViewState.Counter> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TopAuthorWidgetViewState.Counter> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TopAuthorWidgetViewState.Counter> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1227210423, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, TopAuthorWidgetViewState.Counter> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, TopAuthorWidgetViewState.Counter> jVar) {
            jVar.k(AnonymousClass1.INSTANCE, new AnonymousClass2((TopAuthorCounterComponent) a.c(jVar, "$this$viewMapper", TopAuthorCounterComponent.class)));
            jVar.G(new C19583(jVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<Object, TopAuthorWidgetViewState.TopAuthor>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ TopAuthorCounterComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TopAuthorCounterComponent topAuthorCounterComponent) {
                super(1);
                this.$component = topAuthorCounterComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof TopAuthorCounterDTO) {
                    TopAuthorCounterDTO topAuthorCounterDTO = (TopAuthorCounterDTO) obj;
                    if (topAuthorCounterDTO.getCounter() != null && topAuthorCounterDTO.getAuthor() != null && !this.$component.getTopAuthorRepository().needToShowAnimation(topAuthorCounterDTO.getDate())) {
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "info", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, TopAuthorWidgetViewState.TopAuthor> {
            final /* synthetic */ TopAuthorCounterComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TopAuthorCounterComponent topAuthorCounterComponent) {
                super(2);
                this.$component = topAuthorCounterComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final TopAuthorWidgetViewState.TopAuthor invoke(Object state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return (TopAuthorWidgetViewState.TopAuthor) C7714v.K(this.$component.getTopAuthorMapper().invoke((TopAuthorCounterDTO) state, info));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<TopAuthorWidgetViewState.TopAuthor>, Unit> {
            final /* synthetic */ j<Object, TopAuthorWidgetViewState.TopAuthor> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<TopAuthorWidgetViewState.TopAuthor>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<Object, TopAuthorWidgetViewState.TopAuthor> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<Object, TopAuthorWidgetViewState.TopAuthor> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<TopAuthorWidgetViewState.TopAuthor> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TopAuthorWidgetViewState.TopAuthor> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
                    TopAuthorWidgetViewState.TopAuthor b11 = content.b();
                    interfaceC3967k.o(-875173006);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    TopAuthorWidgetStateKt.TopAuthorWidgetState(b11, (Function1) C11, m470buildHandlerimpl, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<Object, TopAuthorWidgetViewState.TopAuthor> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TopAuthorWidgetViewState.TopAuthor> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TopAuthorWidgetViewState.TopAuthor> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -714898632, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, TopAuthorWidgetViewState.TopAuthor> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, TopAuthorWidgetViewState.TopAuthor> jVar) {
            TopAuthorCounterComponent topAuthorCounterComponent = (TopAuthorCounterComponent) a.c(jVar, "$this$viewMapper", TopAuthorCounterComponent.class);
            jVar.k(new AnonymousClass1(topAuthorCounterComponent), new AnonymousClass2(topAuthorCounterComponent));
            jVar.G(new AnonymousClass3(jVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1(SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, CellListV2ViewMapper cellListV2ViewMapper) {
        super(1);
        this.$separatorViewMapper = separatorViewMapper;
        this.$islandSeparatorViewMapper = commonIslandSeparatorViewMapper2;
        this.$cellListV2ViewMapper = cellListV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<Object> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<Object> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.p(AnonymousClass4.INSTANCE);
        final SeparatorViewMapper separatorViewMapper = this.$separatorViewMapper;
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.g(SeparatorViewMapper.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.composer.widget.item.ViewItem>");
                return SeparatorViewMapper.this;
            }
        });
        final CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2 = this.$islandSeparatorViewMapper;
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$invoke$$inlined$rawViewMapper$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.g(CommonIslandSeparatorViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.composer.widget.item.ViewItem>");
                return CommonIslandSeparatorViewMapper2.this;
            }
        });
        final CellListV2ViewMapper cellListV2ViewMapper = this.$cellListV2ViewMapper;
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$invoke$$inlined$rawViewMapper$3
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CellListV2ViewMapper.this.setComponent(it.getComponent(CellListWidgetComponent.class));
                Intrinsics.g(CellListV2ViewMapper.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.app.android.common.cellList.v2.presentation.CellV2VO>");
                return CellListV2ViewMapper.this;
            }
        });
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core.TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TopAuthorCounterComponent.INSTANCE.create(it);
            }
        });
    }
}
