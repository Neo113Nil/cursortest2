package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation;

import S0.InterfaceC3967k;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card.B2BUpcomingTripsCardItemContentKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card.B2BUpcomingTripsCardItemVI;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.header.B2BUpcomingTripsHeaderContentKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.header.B2BUpcomingTripsHeaderVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<B2BUpcomingTripsDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<B2BUpcomingTripsDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C19011 extends AbstractC7737t implements Function1<C7244b, B2BUpcomingTripsDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19011(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final B2BUpcomingTripsDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (B2BUpcomingTripsDTO) this.$jsonDeserializer.fromJson(it.b(), B2BUpcomingTripsDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<B2BUpcomingTripsDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<B2BUpcomingTripsDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19011(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<B2BUpcomingTripsDTO, d, B2BUpcomingTripsHeaderVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final B2BUpcomingTripsHeaderVI invoke(B2BUpcomingTripsDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return B2BUpcomingTripsWidgetKt.toHeaderVI(state, info.d());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C19022 extends AbstractC7737t implements Function1<k<B2BUpcomingTripsHeaderVI>, Unit> {
            final /* synthetic */ j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<B2BUpcomingTripsHeaderVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<B2BUpcomingTripsHeaderVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<B2BUpcomingTripsHeaderVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        B2BUpcomingTripsHeaderContentKt.B2BUpcomingTripsHeaderContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19022(j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<B2BUpcomingTripsHeaderVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<B2BUpcomingTripsHeaderVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1349627218, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<B2BUpcomingTripsDTO, B2BUpcomingTripsHeaderVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new C19022(viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<B2BUpcomingTripsDTO, d, List<? extends B2BUpcomingTripsCardItemVI>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<B2BUpcomingTripsCardItemVI> invoke(B2BUpcomingTripsDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return B2BUpcomingTripsWidgetKt.toCardsListVI(state, info.d());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<B2BUpcomingTripsCardItemVI>, Unit> {
            final /* synthetic */ j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<B2BUpcomingTripsCardItemVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<B2BUpcomingTripsCardItemVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<B2BUpcomingTripsCardItemVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        B2BUpcomingTripsCardItemContentKt.B2BUpcomingTripsCardItemContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<B2BUpcomingTripsCardItemVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<B2BUpcomingTripsCardItemVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 362109797, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<B2BUpcomingTripsDTO, B2BUpcomingTripsCardItemVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.j(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new AnonymousClass2(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2BUpcomingTripsWidgetKt$B2BUpcomingTripsWidgetFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<B2BUpcomingTripsDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<B2BUpcomingTripsDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
