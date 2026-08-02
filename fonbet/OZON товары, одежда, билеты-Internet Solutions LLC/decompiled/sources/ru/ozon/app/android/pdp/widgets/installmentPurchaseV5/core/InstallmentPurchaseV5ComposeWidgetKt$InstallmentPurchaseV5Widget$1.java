package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import WZ.l;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import f3.AbstractC6409a;
import f3.C6411c;
import fd.InterfaceC6512o;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data.InstallmentPurchaseV5DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.productsList.InstallmentV5ProductsListWidgetKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct.InstallmentV5SingleProductWidgetKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.title.InstallmentV5TitleWidgetKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1 extends AbstractC7737t implements Function1<C6018d<InstallmentPurchaseV5DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<InstallmentPurchaseV5DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18211 extends AbstractC7737t implements Function1<C7244b, InstallmentPurchaseV5DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18211(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InstallmentPurchaseV5DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (InstallmentPurchaseV5DTO) this.$jsonDeserializer.fromJson(it.b(), InstallmentPurchaseV5DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<InstallmentPurchaseV5DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<InstallmentPurchaseV5DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18211(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof InstallmentPurchaseV5DTO) && ((InstallmentPurchaseV5DTO) obj).getTitleBlock() != null);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<InstallmentPurchaseV5DTO, d, List<? extends InstallmentPurchaseV5VO.Title>> {
            AnonymousClass2(Object obj) {
                super(2, obj, InstallmentV5TitleMapper.class, "invoke", "invoke(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;Lru/ozon/composer/widget/item/WidgetInfo;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<InstallmentPurchaseV5VO.Title> invoke(InstallmentPurchaseV5DTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((InstallmentV5TitleMapper) this.receiver).invoke(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18223 extends AbstractC7737t implements Function1<k<InstallmentPurchaseV5VO.Title>, Unit> {
            final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$Title;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<InstallmentPurchaseV5VO.Title>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<InstallmentPurchaseV5VO.Title> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<InstallmentPurchaseV5VO.Title> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    InstallmentPurchaseV5VO.Title b11 = content.b();
                    interfaceC3967k.o(-689791462);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    InstallmentV5TitleWidgetKt.InstallmentPurchaseV5TitleWidget(b11, (Function1) C11, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18223(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<InstallmentPurchaseV5VO.Title> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<InstallmentPurchaseV5VO.Title> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1416809318, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        private static final InstallmentPurchaseV5Component invoke$lambda$0(InterfaceC4008j<? extends InstallmentPurchaseV5Component> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.Title> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(invoke$lambda$0(Sc.k.b(new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$3$component$2(viewMapper))).getTitleMapper()));
            viewMapper.G(new C18223(viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof InstallmentPurchaseV5DTO) && (((InstallmentPurchaseV5DTO) obj).getContentBlock().getContent() instanceof InstallmentPurchaseV5DTO.SingleCreditProduct));
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<InstallmentPurchaseV5DTO, d, List<? extends InstallmentPurchaseV5VO.SingleProduct>> {
            AnonymousClass2(Object obj) {
                super(2, obj, InstallmentV5SingleProductMapper.class, "invoke", "invoke(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;Lru/ozon/composer/widget/item/WidgetInfo;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<InstallmentPurchaseV5VO.SingleProduct> invoke(InstallmentPurchaseV5DTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((InstallmentV5SingleProductMapper) this.receiver).invoke(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$3, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<InstallmentPurchaseV5VO.SingleProduct>, Unit> {
            final /* synthetic */ InterfaceC4008j<InstallmentPurchaseV5Component> $component$delegate;
            final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<InstallmentPurchaseV5VO.SingleProduct>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<InstallmentPurchaseV5Component> $component$delegate;
                final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(InterfaceC4008j<? extends InstallmentPurchaseV5Component> interfaceC4008j, j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct> jVar) {
                    super(4);
                    this.$component$delegate = interfaceC4008j;
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<InstallmentPurchaseV5VO.SingleProduct> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<InstallmentPurchaseV5VO.SingleProduct> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    boolean z11 = AnonymousClass4.invoke$lambda$0(this.$component$delegate).getAppType() == AppType.SELECT;
                    B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
                    interfaceC3967k.o(-689761514);
                    boolean F11 = interfaceC3967k.F(this.$component$delegate);
                    InterfaceC4008j<InstallmentPurchaseV5Component> interfaceC4008j = this.$component$delegate;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$3$1$onboardingViewModel$1$1(interfaceC4008j);
                        interfaceC3967k.x(C11);
                    }
                    Function1 function1 = (Function1) C11;
                    interfaceC3967k.k();
                    interfaceC3967k.B(419377738);
                    kotlin.reflect.d b11 = N.b(BaseOnBoardingViewModel.Default.class);
                    C6411c c6411c = new C6411c();
                    c6411c.a(N.b(BaseOnBoardingViewModel.Default.class), function1);
                    w0 a12 = C6617b.a(b11, a11, null, c6411c.b(), a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    BaseOnBoardingViewModel.Default r14 = (BaseOnBoardingViewModel.Default) a12;
                    InstallmentPurchaseV5VO.SingleProduct b12 = content.b();
                    interfaceC3967k.o(-689755462);
                    boolean F12 = interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$3$1$1$1(lVar);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    InstallmentV5SingleProductWidgetKt.InstallmentV5SingleProductWidget(b12, z11, (Function1) C12, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), r14, interfaceC3967k, BaseOnBoardingViewModel.Default.$stable << 12, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(InterfaceC4008j<? extends InstallmentPurchaseV5Component> interfaceC4008j, j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct> jVar) {
                super(1);
                this.$component$delegate = interfaceC4008j;
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<InstallmentPurchaseV5VO.SingleProduct> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<InstallmentPurchaseV5VO.SingleProduct> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 650634321, new AnonymousClass1(this.$component$delegate, this.$this_viewMapper)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstallmentPurchaseV5Component invoke$lambda$0(InterfaceC4008j<? extends InstallmentPurchaseV5Component> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.SingleProduct> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$4$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(invoke$lambda$0(b11).getSingleProductMapper()));
            viewMapper.G(new AnonymousClass3(b11, viewMapper));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList>, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof InstallmentPurchaseV5DTO) && (((InstallmentPurchaseV5DTO) obj).getContentBlock().getContent() instanceof InstallmentPurchaseV5DTO.CreditProductsList));
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<InstallmentPurchaseV5DTO, d, List<? extends InstallmentPurchaseV5VO.CreditProductsList>> {
            AnonymousClass2(Object obj) {
                super(2, obj, InstallmentV5ProductsListMapper.class, "invoke", "invoke(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/data/InstallmentPurchaseV5DTO;Lru/ozon/composer/widget/item/WidgetInfo;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<InstallmentPurchaseV5VO.CreditProductsList> invoke(InstallmentPurchaseV5DTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((InstallmentV5ProductsListMapper) this.receiver).invoke(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$3, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<InstallmentPurchaseV5VO.CreditProductsList>, Unit> {
            final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<InstallmentPurchaseV5VO.CreditProductsList>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<InstallmentPurchaseV5VO.CreditProductsList> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<InstallmentPurchaseV5VO.CreditProductsList> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    InstallmentPurchaseV5VO.CreditProductsList b11 = content.b();
                    interfaceC3967k.o(-689728614);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    InstallmentV5ProductsListWidgetKt.InstallmentV5ProductsListWidget(b11, (Function1) C11, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<InstallmentPurchaseV5VO.CreditProductsList> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<InstallmentPurchaseV5VO.CreditProductsList> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1828845486, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass5() {
            super(1);
        }

        private static final InstallmentPurchaseV5Component invoke$lambda$0(InterfaceC4008j<? extends InstallmentPurchaseV5Component> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(invoke$lambda$0(Sc.k.b(new InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$component$2(viewMapper))).getProductsListMapper()));
            viewMapper.G(new AnonymousClass3(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<InstallmentPurchaseV5DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<InstallmentPurchaseV5DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core.InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstallmentPurchaseV5Component.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.p(AnonymousClass4.INSTANCE);
        ComposeWidget.p(AnonymousClass5.INSTANCE);
    }
}
