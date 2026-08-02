package ru.ozon.app.android.ugc.core.widgets.blockList.core;

import Ek.a;
import S0.InterfaceC3967k;
import WZ.l;
import a1.C4912a;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
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
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;
import ru.ozon.app.android.ugc.core.widgets.blockList.data.BlockListDTO;
import ru.ozon.app.android.ugc.core.widgets.blockList.di.BlockListComponent;
import ru.ozon.app.android.ugc.core.widgets.blockList.presentation.BlockListKt;
import ru.ozon.app.android.ugc.core.widgets.blockList.presentation.BlockListVO;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class BlockListComposeWidgetKt$BlockListComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    final /* synthetic */ CellListV2ViewMapper $cellListV2ViewMapper;
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19381 extends AbstractC7737t implements Function1<C7244b, List<? extends Object>> {
            final /* synthetic */ BlockListComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19381(BlockListComponent blockListComponent) {
                super(1);
                this.$component = blockListComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<Object> invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.$component.getParser().invoke(it.b());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<Object> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<Object> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new C19381((BlockListComponent) config.getWidgetComponentStorage().getComponent(BlockListComponent.class)), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<Object, BlockListVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof BlockListDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19392 extends AbstractC7737t implements Function2<Object, d, List<? extends BlockListVO>> {
            final /* synthetic */ BlockListComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19392(BlockListComponent blockListComponent) {
                super(2);
                this.$component = blockListComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<BlockListVO> invoke(Object state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke((BlockListDTO) state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<BlockListVO>, Unit> {
            final /* synthetic */ j<Object, BlockListVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<BlockListVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<Object, BlockListVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<Object, BlockListVO> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<BlockListVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BlockListVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
                    l lVar = (l) interfaceC3967k.m(f.e());
                    BlockListVO b11 = content.b();
                    interfaceC3967k.o(-1034199858);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new BlockListComposeWidgetKt$BlockListComposeWidget$1$2$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    BlockListKt.BlockList(b11, (Function2) C11, m470buildHandlerimpl, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<Object, BlockListVO> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<BlockListVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<BlockListVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 156986862, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, BlockListVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, BlockListVO> jVar) {
            jVar.i(AnonymousClass1.INSTANCE, new C19392((BlockListComponent) a.c(jVar, "$this$viewMapper", BlockListComponent.class)));
            jVar.G(new AnonymousClass3(jVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockListComposeWidgetKt$BlockListComposeWidget$1(CellListV2ViewMapper cellListV2ViewMapper, JsonParser jsonParser) {
        super(1);
        this.$cellListV2ViewMapper = cellListV2ViewMapper;
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<Object> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<Object> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(AnonymousClass1.INSTANCE);
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        final CellListV2ViewMapper cellListV2ViewMapper = this.$cellListV2ViewMapper;
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CellListV2ViewMapper.this.setComponent(it.getComponent(CellListWidgetComponent.class));
                Intrinsics.g(CellListV2ViewMapper.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.app.android.common.cellList.v2.presentation.CellV2VO>");
                return CellListV2ViewMapper.this;
            }
        });
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListComposeWidgetKt$BlockListComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BlockListComponent.INSTANCE.create(it, JsonParser.this);
            }
        });
    }
}
