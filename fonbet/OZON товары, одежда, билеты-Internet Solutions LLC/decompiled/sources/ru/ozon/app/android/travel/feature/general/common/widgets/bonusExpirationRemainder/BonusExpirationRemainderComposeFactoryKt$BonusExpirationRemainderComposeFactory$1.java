package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6616a;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.travel.feature.general.common.flags.IsBonusExpirationRemainderComposeEnabled;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose.BonusExpirationRemainderKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data.BonusExpirationRemainderDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.di.BonusExpirationRemainderComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1 extends AbstractC7737t implements Function1<C6018d<BonusExpirationRemainderDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<BonusExpirationRemainderDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C19081 extends AbstractC7737t implements Function1<C7244b, BonusExpirationRemainderDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19081(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BonusExpirationRemainderDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (BonusExpirationRemainderDTO) this.$jsonDeserializer.fromJson(it.b(), BonusExpirationRemainderDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<BonusExpirationRemainderDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<BonusExpirationRemainderDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19081(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<BonusExpirationRemainderDTO, BonusExpirationRemainderVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ BonusExpirationRemainderComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BonusExpirationRemainderComponent bonusExpirationRemainderComponent) {
                super(1);
                this.$component = bonusExpirationRemainderComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof BonusExpirationRemainderDTO) && this.$component.getFeatureChecker().isEnabled(IsBonusExpirationRemainderComposeEnabled.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<BonusExpirationRemainderDTO, d, BonusExpirationRemainderVI> {
            final /* synthetic */ BonusExpirationRemainderComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BonusExpirationRemainderComponent bonusExpirationRemainderComponent) {
                super(2);
                this.$component = bonusExpirationRemainderComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final BonusExpirationRemainderVI invoke(BonusExpirationRemainderDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().map(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$3$3, reason: invalid class name and collision with other inner class name */
        static final class C19093 extends AbstractC7737t implements Function1<f<BonusExpirationRemainderVI>, Unit> {
            final /* synthetic */ BonusExpirationRemainderComponent $component;
            final /* synthetic */ C7475g $storage;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<BonusExpirationRemainderVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ BonusExpirationRemainderComponent $component;
                final /* synthetic */ C7475g $storage;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C7475g c7475g, BonusExpirationRemainderComponent bonusExpirationRemainderComponent) {
                    super(3);
                    this.$storage = c7475g;
                    this.$component = bonusExpirationRemainderComponent;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<BonusExpirationRemainderVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BonusExpirationRemainderVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    final BonusExpirationRemainderComponent bonusExpirationRemainderComponent = this.$component;
                    z0.b bVar = new z0.b() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$3$3$1$viewModel$1
                        @Override // androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel = BonusExpirationRemainderComponent.this.getViewModelProvider().get();
                            Intrinsics.g(bonusExpirationRemainderViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt.BonusExpirationRemainderComposeFactory.<no name provided>.invoke.<no name provided>.invoke.<no name provided>.invoke.<no name provided>.invoke.<no name provided>.create");
                            return bonusExpirationRemainderViewModel;
                        }
                    };
                    interfaceC3967k.B(1729797275);
                    B0 a11 = C6616a.a(interfaceC3967k);
                    if (a11 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    w0 a12 = C6617b.a(N.b(BonusExpirationRemainderViewModel.class), a11, "BonusExpirationRemainderViewModel", bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    BonusExpirationRemainderKt.BonusExpirationRemainder(content.b(), (BonusExpirationRemainderViewModel) a12, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$storage, null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19093(C7475g c7475g, BonusExpirationRemainderComponent bonusExpirationRemainderComponent) {
                super(1);
                this.$storage = c7475g;
                this.$component = bonusExpirationRemainderComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<BonusExpirationRemainderVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<BonusExpirationRemainderVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 2048728718, new AnonymousClass1(this.$storage, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<BonusExpirationRemainderDTO, BonusExpirationRemainderVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<BonusExpirationRemainderDTO, BonusExpirationRemainderVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            BonusExpirationRemainderComponent bonusExpirationRemainderComponent = (BonusExpirationRemainderComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(BonusExpirationRemainderComponent.class);
            C7475g widgetComponentStorage = overlayViewMapper.getWidgetComponentStorage();
            overlayViewMapper.k(new AnonymousClass1(bonusExpirationRemainderComponent), new AnonymousClass2(bonusExpirationRemainderComponent));
            overlayViewMapper.s(d.a.f94674b, new C19093(widgetComponentStorage, bonusExpirationRemainderComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<BonusExpirationRemainderDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<BonusExpirationRemainderDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(BonusExpirationRemainderComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt$BonusExpirationRemainderComposeFactory$1$2$1
                    @Override // k20.InterfaceC7469a
                    public final BonusExpirationRemainderComponent component() {
                        return new BonusExpirationRemainderComponent(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
