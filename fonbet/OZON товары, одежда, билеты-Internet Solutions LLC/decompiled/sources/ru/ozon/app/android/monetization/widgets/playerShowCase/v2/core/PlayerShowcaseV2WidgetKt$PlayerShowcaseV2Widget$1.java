package ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import d00.C6018d;
import fd.InterfaceC6512o;
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
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.data.PlayerShowcaseV2DTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.di.PlayerShowcaseV2Component;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2ComposableKt;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.presentation.PlayerShowcaseV2VI;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1 extends AbstractC7737t implements Function1<C6018d<PlayerShowcaseV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<PlayerShowcaseV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17981 extends AbstractC7737t implements Function1<C7244b, PlayerShowcaseV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17981(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final PlayerShowcaseV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (PlayerShowcaseV2DTO) this.$jsonDeserializer.fromJson(it.b(), PlayerShowcaseV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<PlayerShowcaseV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<PlayerShowcaseV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17981(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$2$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof PlayerShowcaseV2DTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2VI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/data/PlayerShowcaseV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17992 extends AbstractC7737t implements Function2<PlayerShowcaseV2DTO, d, List<? extends PlayerShowcaseV2VI>> {
            public static final C17992 INSTANCE = new C17992();

            C17992() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PlayerShowcaseV2VI> invoke(PlayerShowcaseV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return C7714v.a0(new PlayerShowcaseV2VI(info.d().hashCode(), state.getVideoFormat(), state.getVideoUrl()));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$2$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<PlayerShowcaseV2VI>, Unit> {
            final /* synthetic */ j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v2/presentation/PlayerShowcaseV2VI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PlayerShowcaseV2VI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PlayerShowcaseV2VI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PlayerShowcaseV2VI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        PlayerShowcaseV2ComposableKt.PlayerShowcaseV2Composable(content.b(), (PlayerShowcaseV2Component) this.$this_viewMapper.getWidgetComponentStorage().getComponent(PlayerShowcaseV2Component.class), e.f40358c0, interfaceC3967k, 384, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PlayerShowcaseV2VI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PlayerShowcaseV2VI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1522572778, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PlayerShowcaseV2DTO, PlayerShowcaseV2VI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, C17992.INSTANCE);
            viewMapper.G(new AnonymousClass3(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<PlayerShowcaseV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<PlayerShowcaseV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt$PlayerShowcaseV2Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return PlayerShowcaseV2Component.INSTANCE.getInstance(it);
            }
        });
    }
}
