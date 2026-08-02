package ru.ozon.app.android.storefront.widgets.placementSlider.core;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import a1.c;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.storefront.widgets.placementSlider.data.PromoPlacementDTO;
import ru.ozon.app.android.storefront.widgets.placementSlider.di.PromoPlacementWidgetComponent;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementViewModel;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.singleBanner.PromoPlacementSingleWidgetKt;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<PromoPlacementDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<PromoPlacementDTO, PromoPlacementVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
            
                if (((ru.ozon.app.android.storefront.widgets.placementSlider.data.PromoPlacementDTO) r2).getItems().size() == 1) goto L8;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11 = obj instanceof PromoPlacementDTO;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<PromoPlacementDTO, d, List<? extends PromoPlacementVO>> {
            AnonymousClass2(Object obj) {
                super(2, obj, PromoPlacementMapper.class, "invoke", "invoke(Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;Lru/ozon/composer/widget/item/WidgetInfo;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PromoPlacementVO> invoke(PromoPlacementDTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((PromoPlacementMapper) this.receiver).invoke(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18763 extends AbstractC7737t implements Function1<k<PromoPlacementVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<PromoPlacementWidgetComponent> $component$delegate;
            final /* synthetic */ j<PromoPlacementDTO, PromoPlacementVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PromoPlacementVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<PromoPlacementWidgetComponent> $component$delegate;
                final /* synthetic */ j<PromoPlacementDTO, PromoPlacementVO> $this_viewMapper;

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "invoke", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C18771 extends AbstractC7737t implements InterfaceC6512o<PromoPlacementViewModel, Function1<? super AtomAction, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
                    final /* synthetic */ BannerVO $banner;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C18771(BannerVO bannerVO) {
                        super(4);
                        this.$banner = bannerVO;
                    }

                    @Override // fd.InterfaceC6512o
                    public /* bridge */ /* synthetic */ Unit invoke(PromoPlacementViewModel promoPlacementViewModel, Function1<? super AtomAction, ? extends Unit> function1, InterfaceC3967k interfaceC3967k, Integer num) {
                        invoke(promoPlacementViewModel, (Function1<? super AtomAction, Unit>) function1, interfaceC3967k, num.intValue());
                        return Unit.f71690a;
                    }

                    public final void invoke(PromoPlacementViewModel viewModel, Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
                        PromoPlacementSingleWidgetKt.PromoPlacementSingleWidget(this.$banner, viewModel, actionHandler, interfaceC3967k, (i11 << 3) & 1008);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PromoPlacementDTO, PromoPlacementVO> jVar, InterfaceC4008j<PromoPlacementWidgetComponent> interfaceC4008j) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PromoPlacementVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PromoPlacementVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    BannerVO bannerVO = (BannerVO) C7714v.M(content.b().getItems());
                    if (bannerVO == null) {
                        return;
                    }
                    PromoPlacementComposeWidgetFactoryKt.PromoPlacementWidgetContent(content, AnonymousClass3.invoke$lambda$0(this.$component$delegate), this.$this_viewMapper.getWidgetComponentStorage(), c.c(-696792, new C18771(bannerVO), interfaceC3967k), interfaceC3967k, (i11 & 14) | 3072);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18763(j<PromoPlacementDTO, PromoPlacementVO> jVar, InterfaceC4008j<PromoPlacementWidgetComponent> interfaceC4008j) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PromoPlacementVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PromoPlacementVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1422611871, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromoPlacementWidgetComponent invoke$lambda$0(InterfaceC4008j<PromoPlacementWidgetComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PromoPlacementDTO, PromoPlacementVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PromoPlacementDTO, PromoPlacementVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$3$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(invoke$lambda$0(b11).getMapper()));
            viewMapper.G(new C18763(viewMapper, b11));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<PromoPlacementDTO, PromoPlacementVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
            
                if (((ru.ozon.app.android.storefront.widgets.placementSlider.data.PromoPlacementDTO) r2).getItems().size() > 1) goto L8;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke(Object obj) {
                boolean z11 = obj instanceof PromoPlacementDTO;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<PromoPlacementDTO, d, List<? extends PromoPlacementVO>> {
            AnonymousClass2(Object obj) {
                super(2, obj, PromoPlacementMapper.class, "invoke", "invoke(Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;Lru/ozon/composer/widget/item/WidgetInfo;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<PromoPlacementVO> invoke(PromoPlacementDTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((PromoPlacementMapper) this.receiver).invoke(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<PromoPlacementVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<PromoPlacementWidgetComponent> $component$delegate;
            final /* synthetic */ j<PromoPlacementDTO, PromoPlacementVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PromoPlacementVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<PromoPlacementWidgetComponent> $component$delegate;
                final /* synthetic */ j<PromoPlacementDTO, PromoPlacementVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PromoPlacementDTO, PromoPlacementVO> jVar, InterfaceC4008j<PromoPlacementWidgetComponent> interfaceC4008j) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PromoPlacementVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PromoPlacementVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        PromoPlacementComposeWidgetFactoryKt.PromoPlacementWidgetContent(content, AnonymousClass4.invoke$lambda$0(this.$component$delegate), this.$this_viewMapper.getWidgetComponentStorage(), ComposableSingletons$PromoPlacementComposeWidgetFactoryKt.INSTANCE.m1051getLambda1$storefront_prodGoogleAllVendorsRelease(), interfaceC3967k, (i11 & 14) | 3072);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<PromoPlacementDTO, PromoPlacementVO> jVar, InterfaceC4008j<PromoPlacementWidgetComponent> interfaceC4008j) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PromoPlacementVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PromoPlacementVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1160618410, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromoPlacementWidgetComponent invoke$lambda$0(InterfaceC4008j<PromoPlacementWidgetComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PromoPlacementDTO, PromoPlacementVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PromoPlacementDTO, PromoPlacementVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$4$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(invoke$lambda$0(b11).getMapper()));
            viewMapper.G(new AnonymousClass3(viewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<PromoPlacementDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<PromoPlacementDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new PromoPlacementConfig(JsonParser.this);
            }
        });
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(PromoPlacementWidgetComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1$2$1
                    @Override // k20.InterfaceC7469a
                    public final PromoPlacementWidgetComponent component() {
                        return new PromoPlacementWidgetComponent(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
