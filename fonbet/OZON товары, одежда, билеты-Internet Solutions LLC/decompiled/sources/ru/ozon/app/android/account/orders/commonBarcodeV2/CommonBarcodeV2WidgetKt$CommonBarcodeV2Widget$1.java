package ru.ozon.app.android.account.orders.commonBarcodeV2;

import Ek.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import WZ.l;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import e3.C6285b;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.commonBarcodeV2.data.CommonBarcodeV2DTO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ComposableKt;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeActionHandler;
import ru.ozon.app.android.util.screenshottracker.ScreenshotTracker;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1 extends AbstractC7737t implements Function1<C6018d<CommonBarcodeV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<CommonBarcodeV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, CommonBarcodeV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final CommonBarcodeV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (CommonBarcodeV2DTO) this.$jsonDeserializer.fromJson(it.b(), CommonBarcodeV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<CommonBarcodeV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<CommonBarcodeV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<CommonBarcodeV2DTO, CommonBarcodeV2VO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "invoke", "(Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;Ll20/d;)Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<CommonBarcodeV2DTO, d, CommonBarcodeV2VO> {
            final /* synthetic */ CommonBarcodeV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CommonBarcodeV2Component commonBarcodeV2Component) {
                super(2);
                this.$component = commonBarcodeV2Component;
            }

            @Override // kotlin.jvm.functions.Function2
            public final CommonBarcodeV2VO invoke(CommonBarcodeV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().map(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<CommonBarcodeV2VO>, Unit> {
            final /* synthetic */ CommonBarcodeV2Component $component;
            final /* synthetic */ j<CommonBarcodeV2DTO, CommonBarcodeV2VO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CommonBarcodeV2VO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ CommonBarcodeV2Component $component;
                final /* synthetic */ j<CommonBarcodeV2DTO, CommonBarcodeV2VO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<CommonBarcodeV2DTO, CommonBarcodeV2VO> jVar, CommonBarcodeV2Component commonBarcodeV2Component) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = commonBarcodeV2Component;
                }

                private static final BZ.d invoke$lambda$5(A1<BZ.d> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<CommonBarcodeV2VO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<CommonBarcodeV2VO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    CommonBarcodeV2VO b11 = content.b();
                    Intrinsics.g(b11, "null cannot be cast to non-null type ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO");
                    CommonBarcodeV2VO commonBarcodeV2VO = b11;
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), this.$component.getCustomActionHandlersStoreFactory().create(ShareBarcodeActionHandler.class)));
                    l lVar = (l) interfaceC3967k.m(f.e());
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    interfaceC3967k.o(1740927347);
                    boolean F11 = interfaceC3967k.F(commonBarcodeV2VO) | (i12 == 4) | interfaceC3967k.F(lVar) | interfaceC3967k.F(this.$component);
                    CommonBarcodeV2Component commonBarcodeV2Component = this.$component;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$1$1(commonBarcodeV2VO, content, lVar, commonBarcodeV2Component);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    interfaceC3967k.o(1740949218);
                    Object C12 = interfaceC3967k.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = ScreenshotTracker.INSTANCE.create(c4911f.i(), new CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$screenshotTracker$1$1(commonBarcodeV2VO, c4911f));
                        interfaceC3967k.x(C12);
                    }
                    ScreenshotTracker screenshotTracker = (ScreenshotTracker) C12;
                    interfaceC3967k.k();
                    interfaceC3967k.o(1740972754);
                    boolean F12 = interfaceC3967k.F(screenshotTracker);
                    Object C13 = interfaceC3967k.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$2$1(screenshotTracker);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    e3.i.a(aVar, null, (Function0) C13, interfaceC3967k, 6);
                    AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_PAUSE;
                    interfaceC3967k.o(1740976913);
                    boolean F13 = interfaceC3967k.F(screenshotTracker);
                    Object C14 = interfaceC3967k.C();
                    if (F13 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$3$1(screenshotTracker);
                        interfaceC3967k.x(C14);
                    }
                    interfaceC3967k.k();
                    e3.i.a(aVar2, null, (Function0) C14, interfaceC3967k, 6);
                    h hVar = (h) interfaceC3967k.m(f.f());
                    interfaceC3967k.o(1740981715);
                    Object C15 = interfaceC3967k.C();
                    if (C15 == InterfaceC3967k.a.a()) {
                        C15 = CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$viewModel$1$1.INSTANCE;
                        interfaceC3967k.x(C15);
                    }
                    interfaceC3967k.k();
                    CommonBarcodeV2ViewModel commonBarcodeV2ViewModel = (CommonBarcodeV2ViewModel) ((w0) a00.j.a(hVar.b(), N.b(CommonBarcodeV2ViewModel.class), (Function0) C15).getValue());
                    InterfaceC3978p0 c11 = C6285b.c(this.$component.getMiniAppConfigHolder().h(), interfaceC3967k, 0);
                    AppType appType = this.$component.getAppType();
                    String b12 = invoke$lambda$5(c11).b();
                    interfaceC3967k.o(1740995130);
                    boolean F14 = interfaceC3967k.F(this.$component) | interfaceC3967k.n(m470buildHandlerimpl);
                    CommonBarcodeV2Component commonBarcodeV2Component2 = this.$component;
                    Object C16 = interfaceC3967k.C();
                    if (F14 || C16 == InterfaceC3967k.a.a()) {
                        C16 = new CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$4$1(commonBarcodeV2Component2, m470buildHandlerimpl);
                        interfaceC3967k.x(C16);
                    }
                    interfaceC3967k.k();
                    CommonBarcodeV2ComposableKt.CommonBarcodeV2Composable(commonBarcodeV2VO, commonBarcodeV2ViewModel, appType, b12, (Function1) C16, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<CommonBarcodeV2DTO, CommonBarcodeV2VO> jVar, CommonBarcodeV2Component commonBarcodeV2Component) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = commonBarcodeV2Component;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<CommonBarcodeV2VO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<CommonBarcodeV2VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 570122174, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<CommonBarcodeV2DTO, CommonBarcodeV2VO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<CommonBarcodeV2DTO, CommonBarcodeV2VO> jVar) {
            CommonBarcodeV2Component commonBarcodeV2Component = (CommonBarcodeV2Component) a.c(jVar, "$this$viewMapper", CommonBarcodeV2Component.class);
            c.l(jVar, null, new AnonymousClass1(commonBarcodeV2Component), 1, null);
            jVar.G(new AnonymousClass2(jVar, commonBarcodeV2Component));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<CommonBarcodeV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<CommonBarcodeV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(CommonBarcodeV2Component.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$1$1
                    @Override // k20.InterfaceC7469a
                    public final CommonBarcodeV2Component component() {
                        return CommonBarcodeV2Component.INSTANCE.create(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
