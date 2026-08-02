package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core;

import Ek.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.Q;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
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
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data.MercuryCertificatesAddressDTO;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data.MercuryCertificatesAddressMapperKt;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di.MercuryCertificatesAddressComponent;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di.MercuryCertificatesAddressViewModelFactory;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressViewModel;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressWidgetKt;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.UiState;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.MercuryCertificatesAddressVO;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1 extends AbstractC7737t implements Function1<C6018d<MercuryCertificatesAddressDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<MercuryCertificatesAddressDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, MercuryCertificatesAddressDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final MercuryCertificatesAddressDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (MercuryCertificatesAddressDTO) this.$jsonDeserializer.fromJson(it.b(), MercuryCertificatesAddressDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<MercuryCertificatesAddressDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<MercuryCertificatesAddressDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<MercuryCertificatesAddressDTO, d, MercuryCertificatesAddressVO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final MercuryCertificatesAddressVO invoke(MercuryCertificatesAddressDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return MercuryCertificatesAddressMapperKt.toVO(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<MercuryCertificatesAddressVO>, Unit> {
            final /* synthetic */ MercuryCertificatesAddressComponent $component;
            final /* synthetic */ j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<MercuryCertificatesAddressVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ MercuryCertificatesAddressComponent $component;
                final /* synthetic */ j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MercuryCertificatesAddressComponent mercuryCertificatesAddressComponent, j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO> jVar) {
                    super(4);
                    this.$component = mercuryCertificatesAddressComponent;
                    this.$this_viewMapper = jVar;
                }

                private static final String invoke$lambda$1(A1<String> a12) {
                    return a12.getValue();
                }

                private static final UiState invoke$lambda$2(A1<? extends UiState> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<MercuryCertificatesAddressVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<MercuryCertificatesAddressVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
                    MercuryCertificatesAddressViewModelFactory viewModelFactory = this.$component.getViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(MercuryCertificatesAddressViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    MercuryCertificatesAddressViewModel mercuryCertificatesAddressViewModel = (MercuryCertificatesAddressViewModel) a12;
                    MercuryCertificatesAddressVO b11 = content.b();
                    MercuryCertificatesAddressVO mercuryCertificatesAddressVO = b11 instanceof MercuryCertificatesAddressVO ? b11 : null;
                    String valueOf = String.valueOf(mercuryCertificatesAddressVO != null ? Long.valueOf(mercuryCertificatesAddressVO.getId()) : null);
                    interfaceC3967k.o(1853335098);
                    int i12 = i11 & 14;
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(mercuryCertificatesAddressViewModel);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$3$2$1$1$1(mercuryCertificatesAddressViewModel, content, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, valueOf, (Function2) C11);
                    MercuryCertificatesAddressWidgetKt.MercuryCertificatesAddressWidget(content.b(), invoke$lambda$1(C6285b.c(mercuryCertificatesAddressViewModel.getSearchState$checkout_prodGoogleAllVendorsRelease(), interfaceC3967k, 0)), invoke$lambda$2(C6285b.c(mercuryCertificatesAddressViewModel.getAddressesState$checkout_prodGoogleAllVendorsRelease(), interfaceC3967k, 0)), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), ((MercuryCertificatesAddressComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(MercuryCertificatesAddressComponent.class)).getCustomActionHandlersStoreFactory().create(ComposerActionWithActionHandler.class))), mercuryCertificatesAddressViewModel, interfaceC3967k, AtomAction.$stable);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MercuryCertificatesAddressComponent mercuryCertificatesAddressComponent, j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO> jVar) {
                super(1);
                this.$component = mercuryCertificatesAddressComponent;
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<MercuryCertificatesAddressVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<MercuryCertificatesAddressVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1338458151, new AnonymousClass1(this.$component, this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<MercuryCertificatesAddressDTO, MercuryCertificatesAddressVO> jVar) {
            MercuryCertificatesAddressComponent mercuryCertificatesAddressComponent = (MercuryCertificatesAddressComponent) a.c(jVar, "$this$viewMapper", MercuryCertificatesAddressComponent.class);
            c.l(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.G(new AnonymousClass2(mercuryCertificatesAddressComponent, jVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<MercuryCertificatesAddressDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<MercuryCertificatesAddressDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.core.MercuryCertificatesAddressComposeWidgetKt$mercuryCertificatesAddressWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MercuryCertificatesAddressComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
