package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
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
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di.PlayerShowcaseComponent;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal.PlayerShowcaseHorizontalComposableKt;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal.PlayerShowcaseHorizontalVI;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.single.PlayerShowcaseSingleComposableKt;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.single.PlayerShowcaseSingleVI;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical.PlayerShowcaseVerticalComposableKt;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical.PlayerShowcaseVerticalVI;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1 extends AbstractC7737t implements Function1<C6018d<PlayerShowcaseDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<PlayerShowcaseDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17951 extends AbstractC7737t implements Function1<C7244b, PlayerShowcaseDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17951(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final PlayerShowcaseDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (PlayerShowcaseDTO) this.$jsonDeserializer.fromJson(it.b(), PlayerShowcaseDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<PlayerShowcaseDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<PlayerShowcaseDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17951(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<PlayerShowcaseDTO, PlayerShowcaseSingleVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
            
                if (((ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO) r2).getVideoUrls().size() == 1) goto L8;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11 = obj instanceof PlayerShowcaseDTO;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17962 extends AbstractC7737t implements Function2<PlayerShowcaseDTO, d, List<? extends PlayerShowcaseSingleVI>> {
            public static final C17962 INSTANCE = new C17962();

            C17962() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PlayerShowcaseSingleVI> invoke(PlayerShowcaseDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return C7714v.a0(new PlayerShowcaseSingleVI(info.d().hashCode(), state.getVideoFormat(), (String) C7714v.K(state.getVideoUrls())));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<PlayerShowcaseSingleVI>, Unit> {
            final /* synthetic */ j<PlayerShowcaseDTO, PlayerShowcaseSingleVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/single/PlayerShowcaseSingleVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PlayerShowcaseSingleVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<PlayerShowcaseDTO, PlayerShowcaseSingleVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PlayerShowcaseDTO, PlayerShowcaseSingleVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PlayerShowcaseSingleVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PlayerShowcaseSingleVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        PlayerShowcaseSingleComposableKt.PlayerShowcaseSingleComposable(content.b(), (PlayerShowcaseComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(PlayerShowcaseComponent.class), e.f40358c0, interfaceC3967k, 384, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<PlayerShowcaseDTO, PlayerShowcaseSingleVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PlayerShowcaseSingleVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PlayerShowcaseSingleVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1006970271, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PlayerShowcaseDTO, PlayerShowcaseSingleVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PlayerShowcaseDTO, PlayerShowcaseSingleVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, C17962.INSTANCE);
            viewMapper.G(new AnonymousClass3(viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
            
                if (r3.isVertical() == false) goto L10;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof PlayerShowcaseDTO) {
                    PlayerShowcaseDTO playerShowcaseDTO = (PlayerShowcaseDTO) obj;
                    z11 = true;
                    if (playerShowcaseDTO.getVideoUrls().size() > 1) {
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<PlayerShowcaseDTO, d, List<? extends PlayerShowcaseHorizontalVI>> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PlayerShowcaseHorizontalVI> invoke(PlayerShowcaseDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return C7714v.a0(new PlayerShowcaseHorizontalVI(info.d().hashCode(), state.getVideoFormat(), state.getVideoUrls()));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17973 extends AbstractC7737t implements Function1<k<PlayerShowcaseHorizontalVI>, Unit> {
            final /* synthetic */ j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PlayerShowcaseHorizontalVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PlayerShowcaseHorizontalVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PlayerShowcaseHorizontalVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        PlayerShowcaseHorizontalComposableKt.PlayerShowcaseHorizontalComposable(content.b(), (PlayerShowcaseComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(PlayerShowcaseComponent.class), e.f40358c0, interfaceC3967k, 384, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17973(j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PlayerShowcaseHorizontalVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PlayerShowcaseHorizontalVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -886137848, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PlayerShowcaseDTO, PlayerShowcaseHorizontalVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            viewMapper.G(new C17973(viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
            
                if (r3.isVertical() != false) goto L10;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof PlayerShowcaseDTO) {
                    PlayerShowcaseDTO playerShowcaseDTO = (PlayerShowcaseDTO) obj;
                    z11 = true;
                    if (playerShowcaseDTO.getVideoUrls().size() > 1) {
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<PlayerShowcaseDTO, d, List<? extends PlayerShowcaseVerticalVI>> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PlayerShowcaseVerticalVI> invoke(PlayerShowcaseDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                List<String> videoUrls = state.getVideoUrls();
                ArrayList arrayList = new ArrayList(C7714v.z(videoUrls, 10));
                int i11 = 0;
                for (Object obj : videoUrls) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    String d11 = info.d();
                    arrayList.add(new PlayerShowcaseVerticalVI((d11 + i11).hashCode(), state.getVideoFormat(), (String) obj));
                    i11 = i12;
                }
                return arrayList;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<PlayerShowcaseVerticalVI>, Unit> {
            final /* synthetic */ j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PlayerShowcaseVerticalVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PlayerShowcaseVerticalVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PlayerShowcaseVerticalVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        PlayerShowcaseVerticalComposableKt.PlayerShowcaseVerticalComposable(content.b(), (PlayerShowcaseComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(PlayerShowcaseComponent.class), e.f40358c0, interfaceC3967k, 384, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PlayerShowcaseVerticalVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PlayerShowcaseVerticalVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1232913127, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PlayerShowcaseDTO, PlayerShowcaseVerticalVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            viewMapper.G(new AnonymousClass3(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<PlayerShowcaseDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<PlayerShowcaseDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.p(AnonymousClass4.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt$PlayerShowcaseWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return PlayerShowcaseComponent.INSTANCE.getInstance(it);
            }
        });
    }
}
