package ru.ozon.app.android.cart.postRender.core;

import S0.InterfaceC3967k;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6511n;
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
import ru.ozon.app.android.cart.postRender.customAction.PostRenderActionHandler;
import ru.ozon.app.android.cart.postRender.data.PostRenderDTO;
import ru.ozon.app.android.cart.postRender.data.PostRenderMapperKt;
import ru.ozon.app.android.cart.postRender.di.PostRenderComponent;
import ru.ozon.app.android.cart.postRender.presentation.PostRenderComposeWidgetKt;
import ru.ozon.app.android.cart.postRender.presentation.PostRenderVO;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<PostRenderDTO>, Unit> {
    public static final PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1 INSTANCE = new PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<PostRenderDTO>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes11.dex */
        static final class C17391 extends AbstractC7737t implements Function1<C7244b, PostRenderDTO> {
            final /* synthetic */ PostRenderComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17391(PostRenderComponent postRenderComponent) {
                super(1);
                this.$component = postRenderComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public final PostRenderDTO invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return this.$component.getParser().invoke(state.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<PostRenderDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<PostRenderDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17391((PostRenderComponent) config.getWidgetComponentStorage().getComponent(PostRenderComponent.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<e<PostRenderDTO, PostRenderVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "dto", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof PostRenderDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;", "dto", "Ll20/d;", "info", "Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "invoke", "(Lru/ozon/app/android/cart/postRender/data/PostRenderDTO;Ll20/d;)Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes11.dex */
        static final class C17402 extends AbstractC7737t implements Function2<PostRenderDTO, d, PostRenderVO> {
            public static final C17402 INSTANCE = new C17402();

            C17402() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final PostRenderVO invoke(PostRenderDTO dto, d info) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                Intrinsics.checkNotNullParameter(info, "info");
                return PostRenderMapperKt.toVO(dto, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$2$3, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<PostRenderVO>, Unit> {
            final /* synthetic */ PostRenderComponent $component;
            final /* synthetic */ e<PostRenderDTO, PostRenderVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/cart/postRender/presentation/PostRenderVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<PostRenderVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ PostRenderComponent $component;
                final /* synthetic */ e<PostRenderDTO, PostRenderVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<PostRenderDTO, PostRenderVO> eVar, PostRenderComponent postRenderComponent) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component = postRenderComponent;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<PostRenderVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PostRenderVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        PostRenderComposeWidgetKt.PostRenderComposeWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(PostRenderActionHandler.class))), interfaceC3967k, AtomAction.$stable);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(e<PostRenderDTO, PostRenderVO> eVar, PostRenderComponent postRenderComponent) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component = postRenderComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<PostRenderVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<PostRenderVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1536483722, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<PostRenderDTO, PostRenderVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<PostRenderDTO, PostRenderVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            PostRenderComponent postRenderComponent = (PostRenderComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(PostRenderComponent.class);
            overlayViewMapper.k(AnonymousClass1.INSTANCE, C17402.INSTANCE);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper, postRenderComponent));
        }
    }

    PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<PostRenderDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<PostRenderDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidget.l(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.cart.postRender.core.PostRenderComposeWidgetCoreKt$postRenderWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return PostRenderComponent.INSTANCE.create(it);
            }
        });
    }
}
