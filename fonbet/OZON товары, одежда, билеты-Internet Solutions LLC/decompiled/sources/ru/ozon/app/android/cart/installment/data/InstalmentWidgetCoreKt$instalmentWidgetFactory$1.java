package ru.ozon.app.android.cart.installment.data;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import d00.C6018d;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6616a;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.flags.CartInstallmentComposeUiEnabler;
import ru.ozon.app.android.cart.installment.di.InstallmentComponent;
import ru.ozon.app.android.cart.installment.presentation.InstallmentVO;
import ru.ozon.app.android.cart.installment.presentation.InstallmentViewMapper;
import ru.ozon.app.android.cart.installment.presentation.compose.InstallmentComposeWidgetKt;
import ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/cart/installment/data/InstallmentDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class InstalmentWidgetCoreKt$instalmentWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<InstallmentDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/cart/installment/data/InstallmentDTO;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<e<InstallmentDTO, InstallmentVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$4$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ FeatureChecker $featureChecker;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FeatureChecker featureChecker) {
                super(1);
                this.$featureChecker = featureChecker;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(this.$featureChecker.isEnabled(CartInstallmentComposeUiEnabler.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/cart/installment/data/InstallmentDTO;", "dto", "Ll20/d;", "info", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "invoke", "(Lru/ozon/app/android/cart/installment/data/InstallmentDTO;Ll20/d;)Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$4$2, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<InstallmentDTO, d, InstallmentVO> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final InstallmentVO invoke(InstallmentDTO dto, d info) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(info, "info");
                return InstallmentMapperKt.toVo(dto, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$4$3, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<InstallmentVO>, Unit> {
            final /* synthetic */ InstallmentComponent $component;
            final /* synthetic */ e<InstallmentDTO, InstallmentVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<InstallmentVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InstallmentComponent $component;
                final /* synthetic */ e<InstallmentDTO, InstallmentVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<InstallmentDTO, InstallmentVO> eVar, InstallmentComponent installmentComponent) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component = installmentComponent;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<InstallmentVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(i<InstallmentVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    interfaceC3967k.B(1729797275);
                    B0 a11 = C6616a.a(interfaceC3967k);
                    if (a11 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    w0 a12 = C6617b.a(N.b(TotalVisibilityViewModel.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    if (((Boolean) C6285b.c(((TotalVisibilityViewModel) a12).isVisibleFlow(), interfaceC3967k, 0).getValue()).booleanValue()) {
                        return;
                    }
                    InstallmentComposeWidgetKt.InstallmentComposeWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(PostRefreshWithScrollActionHandler.class))), interfaceC3967k, CellDTO.$stable);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(e<InstallmentDTO, InstallmentVO> eVar, InstallmentComponent installmentComponent) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component = installmentComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<InstallmentVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<InstallmentVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -629309411, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<InstallmentDTO, InstallmentVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<InstallmentDTO, InstallmentVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            InstallmentComponent installmentComponent = (InstallmentComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(InstallmentComponent.class);
            overlayViewMapper.k(new AnonymousClass1(((NetworkComponentApi) overlayViewMapper.getWidgetComponentStorage().getComponent(NetworkComponentApi.class)).getFeatureChecker()), AnonymousClass2.INSTANCE);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper, installmentComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstalmentWidgetCoreKt$instalmentWidgetFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<InstallmentDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<InstallmentDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final InstallmentComponent.Companion companion = InstallmentComponent.INSTANCE;
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstallmentComponent.Companion.this.create(it);
            }
        });
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new InstallmentConfig(JsonParser.this);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt$instalmentWidgetFactory$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InstallmentViewMapper installmentViewMapper = new InstallmentViewMapper();
                installmentViewMapper.setComponent(it.getComponent(InstallmentComponent.class));
                return installmentViewMapper;
            }
        });
        ComposeWidget.l(AnonymousClass4.INSTANCE);
    }
}
