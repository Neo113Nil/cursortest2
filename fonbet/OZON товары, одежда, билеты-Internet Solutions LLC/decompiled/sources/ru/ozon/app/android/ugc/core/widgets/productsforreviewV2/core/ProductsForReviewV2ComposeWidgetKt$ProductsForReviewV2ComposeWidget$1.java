package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core;

import A00.a;
import I0.C3173b;
import QZ.a;
import S0.A1;
import S0.D;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Vg.e;
import WZ.l;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d00.C6018d;
import e3.C6285b;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2DTO;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.data.ProductsForReviewV2Mapper;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.di.ProductsForReviewV2Component;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductForReviewV2VI;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductVI;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ViewModel;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<ProductsForReviewV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ProductsForReviewV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19441 extends AbstractC7737t implements Function1<C7244b, ProductsForReviewV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19441(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ProductsForReviewV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ProductsForReviewV2DTO) this.$jsonDeserializer.fromJson(it.b(), ProductsForReviewV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ProductsForReviewV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ProductsForReviewV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19441(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<ProductsForReviewV2DTO, ProductForReviewV2VI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/data/ProductsForReviewV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<ProductsForReviewV2DTO, d, List<? extends ProductForReviewV2VI>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<ProductForReviewV2VI> invoke(ProductsForReviewV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return new ProductsForReviewV2Mapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19453 extends AbstractC7737t implements Function1<k<ProductForReviewV2VI>, Unit> {
            final /* synthetic */ j<ProductsForReviewV2DTO, ProductForReviewV2VI> $this_viewMapper;
            final /* synthetic */ ProductsForReviewV2Component $widgetComponent;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/productsforreviewV2/presentation/ProductForReviewV2VI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ProductForReviewV2VI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<ProductsForReviewV2DTO, ProductForReviewV2VI> $this_viewMapper;
                final /* synthetic */ ProductsForReviewV2Component $widgetComponent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<ProductsForReviewV2DTO, ProductForReviewV2VI> jVar, ProductsForReviewV2Component productsForReviewV2Component) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$widgetComponent = productsForReviewV2Component;
                }

                private static final boolean invoke$lambda$2(A1<Boolean> a12) {
                    return a12.getValue().booleanValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ProductForReviewV2VI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ProductForReviewV2VI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    Object C11 = interfaceC3967k.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        Object d11 = new D(Q.j(kotlin.coroutines.g.f71771a, interfaceC3967k));
                        interfaceC3967k.x(d11);
                        C11 = d11;
                    }
                    M a11 = ((D) C11).a();
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    InterfaceC7851b o11 = ((a) interfaceC3967k.m(f.a())).o();
                    l lVar = (l) interfaceC3967k.m(f.e());
                    ProductForReviewV2VI b11 = content.b();
                    Intrinsics.g(b11, "null cannot be cast to non-null type ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductForReviewV2VI");
                    ProductForReviewV2VI productForReviewV2VI = b11;
                    interfaceC3967k.o(-1440313040);
                    boolean F11 = interfaceC3967k.F(c4911f);
                    Object C12 = interfaceC3967k.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$showNotification$1$1(c4911f);
                        interfaceC3967k.x(C12);
                    }
                    Function1 function1 = (Function1) C12;
                    interfaceC3967k.k();
                    B0 a12 = ((h) interfaceC3967k.m(f.f())).a();
                    final ProductsForReviewV2Component productsForReviewV2Component = this.$widgetComponent;
                    ProductsForReviewV2ViewModel productsForReviewV2ViewModel = (ProductsForReviewV2ViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            ProductsForReviewV2ViewModel productsForReviewV2ViewModel2 = ProductsForReviewV2Component.this.getViewModel().get();
                            Intrinsics.g(productsForReviewV2ViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return productsForReviewV2ViewModel2;
                        }
                    }).b(ProductsForReviewV2ViewModel.class, C3173b.b(productForReviewV2VI.getId(), "ProductsForReviewV2_"));
                    InterfaceC3978p0 a13 = C6285b.a(productsForReviewV2ViewModel.getShouldShowOnboarding(), Boolean.FALSE, interfaceC3967k, 48);
                    e.a widgetActionHandlerBuilder = WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12 & 14, 14);
                    interfaceC3967k.o(-1440280554);
                    boolean F12 = interfaceC3967k.F(productsForReviewV2ViewModel) | interfaceC3967k.F(o11) | interfaceC3967k.F(productForReviewV2VI) | interfaceC3967k.n(function1);
                    Object C13 = interfaceC3967k.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$actionHandler$1$1(productsForReviewV2ViewModel, o11, productForReviewV2VI, function1);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m475localHandler6vmflP0(widgetActionHandlerBuilder, AtomAction.ComposerAction.class, (Function1) C13));
                    Unit unit = Unit.f71690a;
                    interfaceC3967k.o(-1440264737);
                    boolean F13 = interfaceC3967k.F(productsForReviewV2ViewModel);
                    Object C14 = interfaceC3967k.C();
                    if (F13 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$1$1(productsForReviewV2ViewModel, null);
                        interfaceC3967k.x(C14);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C14);
                    boolean invoke$lambda$2 = invoke$lambda$2(a13);
                    interfaceC3967k.o(-1440257281);
                    boolean F14 = interfaceC3967k.F(lVar);
                    Object C15 = interfaceC3967k.C();
                    if (F14 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$2$1(lVar);
                        interfaceC3967k.x(C15);
                    }
                    Function1 function12 = (Function1) C15;
                    interfaceC3967k.k();
                    interfaceC3967k.o(-1440254372);
                    boolean n11 = interfaceC3967k.n(m470buildHandlerimpl);
                    Object C16 = interfaceC3967k.C();
                    if (n11 || C16 == InterfaceC3967k.a.a()) {
                        C16 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$3$1(m470buildHandlerimpl);
                        interfaceC3967k.x(C16);
                    }
                    interfaceC3967k.k();
                    Function1 function13 = (Function1) ((kotlin.reflect.h) C16);
                    interfaceC3967k.o(-1440252311);
                    boolean F15 = interfaceC3967k.F(a11) | interfaceC3967k.F(o11);
                    Object C17 = interfaceC3967k.C();
                    if (F15 || C17 == InterfaceC3967k.a.a()) {
                        C17 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$4$1(a11, o11);
                        interfaceC3967k.x(C17);
                    }
                    Function0 function0 = (Function0) C17;
                    interfaceC3967k.k();
                    interfaceC3967k.o(-1440244806);
                    boolean n12 = interfaceC3967k.n(m470buildHandlerimpl);
                    Object C18 = interfaceC3967k.C();
                    if (n12 || C18 == InterfaceC3967k.a.a()) {
                        C18 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$5$1(m470buildHandlerimpl);
                        interfaceC3967k.x(C18);
                    }
                    Function1 function14 = (Function1) C18;
                    interfaceC3967k.k();
                    interfaceC3967k.o(-1440239873);
                    boolean F16 = interfaceC3967k.F(o11) | interfaceC3967k.F(productForReviewV2VI);
                    Object C19 = interfaceC3967k.C();
                    if (F16 || C19 == InterfaceC3967k.a.a()) {
                        C19 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$6$1(o11, productForReviewV2VI);
                        interfaceC3967k.x(C19);
                    }
                    Function0 function02 = (Function0) C19;
                    interfaceC3967k.k();
                    interfaceC3967k.o(-1440234732);
                    boolean F17 = interfaceC3967k.F(productsForReviewV2ViewModel);
                    Object C21 = interfaceC3967k.C();
                    if (F17 || C21 == InterfaceC3967k.a.a()) {
                        C21 = new ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$3$1$7$1(productsForReviewV2ViewModel);
                        interfaceC3967k.x(C21);
                    }
                    interfaceC3967k.k();
                    ProductsForReviewV2ComposableKt.ProductsForReviewV2Composable(productForReviewV2VI, invoke$lambda$2, function12, function13, function0, function14, function02, (Function0) C21, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19453(j<ProductsForReviewV2DTO, ProductForReviewV2VI> jVar, ProductsForReviewV2Component productsForReviewV2Component) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$widgetComponent = productsForReviewV2Component;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ProductForReviewV2VI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ProductForReviewV2VI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1780979578, new AnonymousClass1(this.$this_viewMapper, this.$widgetComponent)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ProductsForReviewV2DTO, ProductForReviewV2VI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ProductsForReviewV2DTO, ProductForReviewV2VI> jVar) {
            ProductsForReviewV2Component productsForReviewV2Component = (ProductsForReviewV2Component) Ek.a.c(jVar, "$this$viewMapper", ProductsForReviewV2Component.class);
            c.j(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.c().put(ProductForReviewSwipedUpdate.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    ProductVI m1491copyzadm560;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    ProductForReviewV2VI productForReviewV2VI = (ProductForReviewV2VI) old;
                    m1491copyzadm560 = r2.m1491copyzadm560((r29 & 1) != 0 ? r2.id : 0L, (r29 & 2) != 0 ? r2.image : null, (r29 & 4) != 0 ? r2.badges : null, (r29 & 8) != 0 ? r2.badgesLeftPadding : null, (r29 & 16) != 0 ? r2.title : null, (r29 & 32) != 0 ? r2.spacerAboveAspectHeight : 0.0f, (r29 & 64) != 0 ? r2.aspectText : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r2.rating : null, (r29 & 256) != 0 ? r2.cornerRadius : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r2.backgroundColor : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r2.isLast : false, (r29 & 2048) != 0 ? r2.isFirst : false, (r29 & 4096) != 0 ? productForReviewV2VI.getProduct().swipeActions : ProductVI.SwipeActionsVI.copy$default(productForReviewV2VI.getProduct().getSwipeActions(), null, null, 0.0f, ((ProductForReviewSwipedUpdate) update).getId() == productForReviewV2VI.getProduct().getId(), 7, null));
                    return ProductForReviewV2VI.copy$default(productForReviewV2VI, 0L, m1491copyzadm560, null, null, null, null, null, 125, null);
                }
            });
            jVar.G(new C19453(jVar, productsForReviewV2Component));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ProductsForReviewV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ProductsForReviewV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.core.ProductsForReviewV2ComposeWidgetKt$ProductsForReviewV2ComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ProductsForReviewV2Component.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
