package ru.ozon.app.android.monetization.widgets.achievementsList.core;

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
import ru.ozon.app.android.monetization.widgets.achievementsList.data.AchievementsListDTO;
import ru.ozon.app.android.monetization.widgets.achievementsList.data.AchievementsListMapperKt;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementVO;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementWidgetKt;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementsListAnalyticsVO;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementsOffsetModifier;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.composer.compose.widget.scrollable.m;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AchievementsListComposeWidgetKt$AchievementsListWidget$1 extends AbstractC7737t implements Function1<C6018d<AchievementsListDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<AchievementsListDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17871 extends AbstractC7737t implements Function1<C7244b, AchievementsListDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17871(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final AchievementsListDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (AchievementsListDTO) this.$jsonDeserializer.fromJson(it.b(), AchievementsListDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<AchievementsListDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<AchievementsListDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17871(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<AchievementsListDTO, AchievementVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "invoke", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<AchievementsListDTO, d, List<? extends AchievementVO>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<AchievementVO> invoke(AchievementsListDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AchievementsListMapperKt.toAchievementVOList(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17882 extends AbstractC7737t implements Function1<k<AchievementVO>, Unit> {
            final /* synthetic */ j<AchievementsListDTO, AchievementVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<AchievementVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<AchievementsListDTO, AchievementVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<AchievementsListDTO, AchievementVO> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<AchievementVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<AchievementVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        AchievementWidgetKt.AchievementWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, AtomAction.$stable);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17882(j<AchievementsListDTO, AchievementVO> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<AchievementVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<AchievementVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 427625448, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "it", "Lru/ozon/composer/compose/widget/scrollable/m;", "invoke", "(Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;)Lru/ozon/composer/compose/widget/scrollable/m;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<AchievementVO, m> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final m invoke(AchievementVO it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return m.e.f94775e;
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<AchievementsListDTO, AchievementVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<AchievementsListDTO, AchievementVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.j(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new C17882(viewMapper));
            viewMapper.E(AnonymousClass3.INSTANCE);
            viewMapper.t(new AchievementsOffsetModifier());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsListAnalyticsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<AchievementsListDTO, AchievementsListAnalyticsVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsListAnalyticsVO;", "invoke", "(Lru/ozon/app/android/monetization/widgets/achievementsList/data/AchievementsListDTO;Ll20/d;)Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsListAnalyticsVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<AchievementsListDTO, d, AchievementsListAnalyticsVO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final AchievementsListAnalyticsVO invoke(AchievementsListDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AchievementsListMapperKt.toAchievementsListAnalytics(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsListAnalyticsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt$AchievementsListWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<AchievementsListAnalyticsVO>, Unit> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<AchievementsListAnalyticsVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<AchievementsListAnalyticsVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$AchievementsListComposeWidgetKt.INSTANCE.m807getLambda1$monetization_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<AchievementsListDTO, AchievementsListAnalyticsVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<AchievementsListDTO, AchievementsListAnalyticsVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            overlayViewMapper.s(d.e.f94687b, AnonymousClass2.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchievementsListComposeWidgetKt$AchievementsListWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<AchievementsListDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<AchievementsListDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
