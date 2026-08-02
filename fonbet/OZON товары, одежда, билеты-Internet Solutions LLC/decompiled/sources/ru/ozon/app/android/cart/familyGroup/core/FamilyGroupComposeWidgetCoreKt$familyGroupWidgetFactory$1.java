package ru.ozon.app.android.cart.familyGroup.core;

import Ek.a;
import S0.InterfaceC3967k;
import WZ.l;
import a1.C4912a;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
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
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.cart.familyGroup.data.FamilyGroupDTO;
import ru.ozon.app.android.cart.familyGroup.di.FamilyGroupWidgetComponent;
import ru.ozon.app.android.cart.familyGroup.presentation.FamilyGroupVO;
import ru.ozon.app.android.cart.familyGroup.presentation.compose.FamilyGroupComposableKt;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<FamilyGroupDTO>, Unit> {
    public static final FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1 INSTANCE = new FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<FamilyGroupDTO>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes11.dex */
        static final class C17371 extends AbstractC7737t implements Function1<C7244b, FamilyGroupDTO> {
            final /* synthetic */ FamilyGroupWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17371(FamilyGroupWidgetComponent familyGroupWidgetComponent) {
                super(1);
                this.$component = familyGroupWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public final FamilyGroupDTO invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return this.$component.getParser().invoke(state.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<FamilyGroupDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<FamilyGroupDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17371((FamilyGroupWidgetComponent) config.getWidgetComponentStorage().getComponent(FamilyGroupWidgetComponent.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<FamilyGroupDTO, FamilyGroupVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof FamilyGroupDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "invoke", "(Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO;Ll20/d;)Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes11.dex */
        static final class C17382 extends AbstractC7737t implements Function2<FamilyGroupDTO, d, FamilyGroupVO> {
            final /* synthetic */ FamilyGroupWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17382(FamilyGroupWidgetComponent familyGroupWidgetComponent) {
                super(2);
                this.$component = familyGroupWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final FamilyGroupVO invoke(FamilyGroupDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info.d());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$2$3, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<FamilyGroupVO>, Unit> {
            final /* synthetic */ j<FamilyGroupDTO, FamilyGroupVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<FamilyGroupVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<FamilyGroupDTO, FamilyGroupVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<FamilyGroupDTO, FamilyGroupVO> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<FamilyGroupVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<FamilyGroupVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
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
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
                    FamilyGroupVO b11 = content.b();
                    interfaceC3967k.o(-938919999);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$2$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    FamilyGroupComposableKt.FamilyGroupComposable(b11, (Function2) C11, m470buildHandlerimpl, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<FamilyGroupDTO, FamilyGroupVO> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<FamilyGroupVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<FamilyGroupVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 125651843, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<FamilyGroupDTO, FamilyGroupVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<FamilyGroupDTO, FamilyGroupVO> jVar) {
            jVar.k(AnonymousClass1.INSTANCE, new C17382((FamilyGroupWidgetComponent) a.c(jVar, "$this$viewMapper", FamilyGroupWidgetComponent.class)));
            jVar.G(new AnonymousClass3(jVar));
        }
    }

    FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<FamilyGroupDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<FamilyGroupDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.cart.familyGroup.core.FamilyGroupComposeWidgetCoreKt$familyGroupWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return FamilyGroupWidgetComponent.INSTANCE.create(it);
            }
        });
    }
}
