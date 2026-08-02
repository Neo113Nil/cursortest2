package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import WZ.l;
import WZ.x;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.DeliveryType;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.WholeSaleModalDTO;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.di.WholeSaleModalComponent;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.di.WholeSaleModalViewModelFactory;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.WholeSaleModalViewModel;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleButton.WholeSaleModalButtonVI;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleButton.WholeSaleOverlayButtonComposableKt;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalComposableKt;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class WholeSaleModalComposeWidgetKt$wholeSaleModal$1 extends AbstractC7737t implements Function1<C6018d<WholeSaleModalDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<WholeSaleModalDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18321 extends AbstractC7737t implements Function1<C7244b, WholeSaleModalDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18321(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final WholeSaleModalDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (WholeSaleModalDTO) this.$jsonDeserializer.fromJson(it.b(), WholeSaleModalDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<WholeSaleModalDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<WholeSaleModalDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18321(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<WholeSaleModalDTO, WholeSaleModalVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "invoke", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<WholeSaleModalDTO, d, WholeSaleModalVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final WholeSaleModalVI invoke(WholeSaleModalDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long widgetId = MapperExtKt.widgetId(info);
                WholeSaleModalVI.TextInput vI$default = WholeSaleModalComposeWidgetKt.toVI$default(state.getCountTextInput(), true, (short) 0, 2, null);
                WholeSaleModalVI.TextInput vI$default2 = WholeSaleModalComposeWidgetKt.toVI$default(state.getRegionTextInput(), false, (short) 250, 1, null);
                WholeSaleModalDTO.Tabs deliveryTabs = state.getDeliveryTabs();
                WholeSaleModalVI.Tabs tabs = new WholeSaleModalVI.Tabs(deliveryTabs.getMessagePlaceholderKey(), deliveryTabs.getTabs(), deliveryTabs.getTrackingTypes());
                TextDTO deliveryText = state.getDeliveryText();
                TextDTO footerText = state.getFooterText();
                Map<String, TokenizedTrackingInfo> closeTrackingInfo = state.getCloseTrackingInfo();
                return new WholeSaleModalVI(widgetId, vI$default, vI$default2, tabs, deliveryText, footerText, closeTrackingInfo != null ? x.b(closeTrackingInfo, Long.valueOf(widgetId), null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<WholeSaleModalVI>, Unit> {
            final /* synthetic */ WholeSaleModalComponent $component;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<WholeSaleModalVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ WholeSaleModalComponent $component;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(WholeSaleModalComponent wholeSaleModalComponent) {
                    super(4);
                    this.$component = wholeSaleModalComponent;
                }

                private static final DeliveryType invoke$lambda$1(A1<? extends DeliveryType> a12) {
                    return a12.getValue();
                }

                private static final Pair<String, String> invoke$lambda$2(A1<Pair<String, String>> a12) {
                    return a12.getValue();
                }

                private static final Pair<String, String> invoke$lambda$3(A1<Pair<String, String>> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<WholeSaleModalVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<WholeSaleModalVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
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
                    WholeSaleModalViewModelFactory viewModelFactory = this.$component.getViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(WholeSaleModalViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    WholeSaleModalViewModel wholeSaleModalViewModel = (WholeSaleModalViewModel) a12;
                    WholeSaleModalVI b11 = content.b();
                    WholeSaleModalVI wholeSaleModalVI = b11 instanceof WholeSaleModalVI ? b11 : null;
                    String valueOf = String.valueOf(wholeSaleModalVI != null ? Long.valueOf(wholeSaleModalVI.getId()) : null);
                    interfaceC3967k.o(-179666736);
                    boolean F11 = ((i11 & 14) == 4) | interfaceC3967k.F(wholeSaleModalViewModel);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1(wholeSaleModalViewModel, content, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, valueOf, (Function2) C11);
                    InterfaceC3978p0 c11 = C6285b.c(wholeSaleModalViewModel.getSelectedTab(), interfaceC3967k, 0);
                    InterfaceC3978p0 c12 = C6285b.c(wholeSaleModalViewModel.getCountFlow(), interfaceC3967k, 0);
                    InterfaceC3978p0 c13 = C6285b.c(wholeSaleModalViewModel.getRegionFlow(), interfaceC3967k, 0);
                    WholeSaleModalVI b12 = content.b();
                    DeliveryType invoke$lambda$1 = invoke$lambda$1(c11);
                    Pair<String, String> invoke$lambda$2 = invoke$lambda$2(c12);
                    Pair<String, String> invoke$lambda$3 = invoke$lambda$3(c13);
                    interfaceC3967k.o(-179648539);
                    boolean F12 = interfaceC3967k.F(wholeSaleModalViewModel);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$2$1(wholeSaleModalViewModel);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    WholeSaleModalComposableKt.WholeSaleModalComposable(b12, invoke$lambda$1, invoke$lambda$2, invoke$lambda$3, (Function1) ((kotlin.reflect.h) C12), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(WholeSaleModalComponent wholeSaleModalComponent) {
                super(1);
                this.$component = wholeSaleModalComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<WholeSaleModalVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<WholeSaleModalVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 2139550013, new AnonymousClass1(this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<WholeSaleModalDTO, WholeSaleModalVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<WholeSaleModalDTO, WholeSaleModalVI> jVar) {
            WholeSaleModalComponent wholeSaleModalComponent = (WholeSaleModalComponent) Ek.a.c(jVar, "$this$viewMapper", WholeSaleModalComponent.class);
            c.l(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.G(new AnonymousClass2(wholeSaleModalComponent));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<e<WholeSaleModalDTO, WholeSaleModalButtonVI>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "invoke", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/WholeSaleModalDTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<WholeSaleModalDTO, d, WholeSaleModalButtonVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final WholeSaleModalButtonVI invoke(WholeSaleModalDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return new WholeSaleModalButtonVI(state.getSendButton().hashCode() + info.d().hashCode(), state.getSendButton(), state.getMessageTemplate());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.f<WholeSaleModalButtonVI>, Unit> {
            final /* synthetic */ WholeSaleModalComponent $component;
            final /* synthetic */ e<WholeSaleModalDTO, WholeSaleModalButtonVI> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<WholeSaleModalButtonVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ WholeSaleModalComponent $component;
                final /* synthetic */ e<WholeSaleModalDTO, WholeSaleModalButtonVI> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(WholeSaleModalComponent wholeSaleModalComponent, e<WholeSaleModalDTO, WholeSaleModalButtonVI> eVar) {
                    super(3);
                    this.$component = wholeSaleModalComponent;
                    this.$this_overlayViewMapper = eVar;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<WholeSaleModalButtonVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<WholeSaleModalButtonVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
                    WholeSaleModalViewModelFactory viewModelFactory = this.$component.getViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(WholeSaleModalViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    WholeSaleModalViewModel wholeSaleModalViewModel = (WholeSaleModalViewModel) a12;
                    wholeSaleModalViewModel.setTokenizedAnalytics(lVar);
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14));
                    WholeSaleModalButtonVI b11 = content.b();
                    interfaceC3967k.o(-179609081);
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(wholeSaleModalViewModel) | interfaceC3967k.n(m470buildHandlerimpl) | interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$2$1$1$1(wholeSaleModalViewModel, content, m470buildHandlerimpl, lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    WholeSaleOverlayButtonComposableKt.WholeSaleOverlayButtonComposable(b11, (Function0) C11, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(WholeSaleModalComponent wholeSaleModalComponent, e<WholeSaleModalDTO, WholeSaleModalButtonVI> eVar) {
                super(1);
                this.$component = wholeSaleModalComponent;
                this.$this_overlayViewMapper = eVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ru.ozon.composer.compose.widget.overlay.f<WholeSaleModalButtonVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ru.ozon.composer.compose.widget.overlay.f<WholeSaleModalButtonVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -958811023, new AnonymousClass1(this.$component, this.$this_overlayViewMapper)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<WholeSaleModalDTO, WholeSaleModalButtonVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<WholeSaleModalDTO, WholeSaleModalButtonVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            WholeSaleModalComponent wholeSaleModalComponent = (WholeSaleModalComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(WholeSaleModalComponent.class);
            c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(wholeSaleModalComponent, overlayViewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholeSaleModalComposeWidgetKt$wholeSaleModal$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<WholeSaleModalDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<WholeSaleModalDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return WholeSaleModalComponent.INSTANCE.getInstance();
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.l(AnonymousClass4.INSTANCE);
    }
}
