package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core;

import A00.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.n1;
import WZ.l;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipCloseUpdateKey;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.data.AvatarAchievementsDTO;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.di.AvatarAchievementsComponent;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsKt;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.presentation.AvatarAchievementsVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<AvatarAchievementsDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<AvatarAchievementsDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19361 extends AbstractC7737t implements Function1<C7244b, AvatarAchievementsDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19361(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final AvatarAchievementsDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (AvatarAchievementsDTO) this.$jsonDeserializer.fromJson(it.b(), AvatarAchievementsDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<AvatarAchievementsDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<AvatarAchievementsDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19361(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<AvatarAchievementsDTO, AvatarAchievementsVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/data/AvatarAchievementsDTO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<AvatarAchievementsDTO, d, AvatarAchievementsVO> {
            final /* synthetic */ AvatarAchievementsComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AvatarAchievementsComponent avatarAchievementsComponent) {
                super(2);
                this.$component = avatarAchievementsComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final AvatarAchievementsVO invoke(AvatarAchievementsDTO state, d info) {
                AvatarAchievementsVO.AvatarVO vo;
                ArrayList arrayList;
                AvatarAchievementsVO.PaddingsVO vo2;
                AvatarAchievementsVO.AchievementVO vo3;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                AvatarAchievementsComponent avatarAchievementsComponent = this.$component;
                vo = AvatarAchievementsComposeWidgetKt.toVO(state.getAvatar(), hashCode);
                List<AvatarAchievementsDTO.AchievementDTO> achievements = state.getAchievements();
                if (achievements != null) {
                    List<AvatarAchievementsDTO.AchievementDTO> list = achievements;
                    arrayList = new ArrayList(C7714v.z(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        vo3 = AvatarAchievementsComposeWidgetKt.toVO((AvatarAchievementsDTO.AchievementDTO) it.next(), hashCode);
                        arrayList.add(vo3);
                    }
                } else {
                    arrayList = null;
                }
                String backgroundColor = state.getBackgroundColor();
                if (backgroundColor == null) {
                    backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
                }
                String str = backgroundColor;
                vo2 = AvatarAchievementsComposeWidgetKt.toVO(state.getPaddings());
                Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
                AvatarAchievementsVO avatarAchievementsVO = new AvatarAchievementsVO(hashCode, vo, arrayList, false, str, vo2, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null);
                avatarAchievementsComponent.getImagePrefetcher().prefetchAchievements(avatarAchievementsVO, avatarAchievementsComponent.getIsDarkTheme());
                return avatarAchievementsVO;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19373 extends AbstractC7737t implements Function1<k<AvatarAchievementsVO>, Unit> {
            final /* synthetic */ AvatarAchievementsComponent $component;
            final /* synthetic */ j<AvatarAchievementsDTO, AvatarAchievementsVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/avatarAchievements/presentation/AvatarAchievementsVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<AvatarAchievementsVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ AvatarAchievementsComponent $component;
                final /* synthetic */ j<AvatarAchievementsDTO, AvatarAchievementsVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<AvatarAchievementsDTO, AvatarAchievementsVO> jVar, AvatarAchievementsComponent avatarAchievementsComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = avatarAchievementsComponent;
                }

                private static final a invoke$lambda$2(A1<? extends a> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<AvatarAchievementsVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<AvatarAchievementsVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    ComponentCallbacksC5392m c11 = ((C4911f) interfaceC3967k.m(f.d())).c();
                    String tag = c11 != null ? c11.getTag() : null;
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14));
                    l lVar = (l) interfaceC3967k.m(f.e());
                    h hVar = (h) interfaceC3967k.m(f.f());
                    final AvatarAchievementsComponent avatarAchievementsComponent = this.$component;
                    TooltipViewModel tooltipViewModel = (TooltipViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            TooltipViewModel onboardingViewModel = AvatarAchievementsComponent.this.getOnboardingViewModel();
                            Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return onboardingViewModel;
                        }
                    }).a(TooltipViewModel.class);
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    interfaceC3967k.o(634147140);
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(interfaceC7851b);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$onTooltipClosed$1$1(content, interfaceC7851b);
                        interfaceC3967k.x(C11);
                    }
                    Function0 function0 = (Function0) C11;
                    interfaceC3967k.k();
                    if (Intrinsics.d(invoke$lambda$2(n1.a(interfaceC7851b.getEventsFlow(), null, null, interfaceC3967k, 48, 2)), a.u.c.f253a)) {
                        function0.invoke();
                    }
                    AvatarAchievementsVO b11 = content.b();
                    interfaceC3967k.o(634160291);
                    boolean F12 = interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$1$1(lVar);
                        interfaceC3967k.x(C12);
                    }
                    Function1 function1 = (Function1) C12;
                    interfaceC3967k.k();
                    interfaceC3967k.o(634163093);
                    boolean n11 = interfaceC3967k.n(m470buildHandlerimpl);
                    Object C13 = interfaceC3967k.C();
                    if (n11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$2$1(m470buildHandlerimpl);
                        interfaceC3967k.x(C13);
                    }
                    Function1 function12 = (Function1) C13;
                    interfaceC3967k.k();
                    interfaceC3967k.o(634166024);
                    boolean F13 = interfaceC3967k.F(tooltipViewModel) | interfaceC3967k.n(tag);
                    Object C14 = interfaceC3967k.C();
                    if (F13 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$3$1(tooltipViewModel, tag);
                        interfaceC3967k.x(C14);
                    }
                    Function1 function13 = (Function1) C14;
                    interfaceC3967k.k();
                    interfaceC3967k.o(634176240);
                    boolean F14 = interfaceC3967k.F(tooltipViewModel);
                    Object C15 = interfaceC3967k.C();
                    if (F14 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$4$1(tooltipViewModel);
                        interfaceC3967k.x(C15);
                    }
                    interfaceC3967k.k();
                    AvatarAchievementsKt.AvatarAchievements(b11, function1, function12, function13, (Function1) C15, function0, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19373(j<AvatarAchievementsDTO, AvatarAchievementsVO> jVar, AvatarAchievementsComponent avatarAchievementsComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = avatarAchievementsComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<AvatarAchievementsVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<AvatarAchievementsVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1314170868, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<AvatarAchievementsDTO, AvatarAchievementsVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<AvatarAchievementsDTO, AvatarAchievementsVO> jVar) {
            AvatarAchievementsComponent avatarAchievementsComponent = (AvatarAchievementsComponent) Ek.a.c(jVar, "$this$viewMapper", AvatarAchievementsComponent.class);
            c.l(jVar, null, new AnonymousClass1(avatarAchievementsComponent), 1, null);
            jVar.c().put(TooltipCloseUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    AvatarAchievementsVO avatarAchievementsVO = (AvatarAchievementsVO) old;
                    return ((TooltipCloseUpdateKey) update).getWidgetId() == avatarAchievementsVO.getId() ? AvatarAchievementsVO.copy$default(avatarAchievementsVO, 0L, null, null, true, null, null, null, 119, null) : avatarAchievementsVO;
                }
            });
            jVar.G(new C19373(jVar, avatarAchievementsComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<AvatarAchievementsDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<AvatarAchievementsDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core.AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AvatarAchievementsComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
