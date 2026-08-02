package ru.ozon.app.android.pdp.widgets.brandV2.core;

import S0.InterfaceC3967k;
import a1.C4912a;
import a1.c;
import d00.C6018d;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import j20.C7244b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.view.shared.TabEmbeddedComposableKt;
import ru.ozon.app.android.pdp.widgets.brandV2.data.BrandV2DTO;
import ru.ozon.app.android.pdp.widgets.brandV2.presentation.BrandV2ComposableKt;
import ru.ozon.app.android.pdp.widgets.brandV2.presentation.BrandV2VI;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<BrandV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<BrandV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18101 extends AbstractC7737t implements Function1<C7244b, BrandV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18101(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BrandV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (BrandV2DTO) this.$jsonDeserializer.fromJson(it.b(), BrandV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<BrandV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<BrandV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18101(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<BrandV2DTO, BrandV2VI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "invoke", "(Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<BrandV2DTO, d, BrandV2VI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final BrandV2VI invoke(BrandV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long widgetId = MapperExtKt.widgetId(info);
                Object content = state.getContent();
                CellDTO cellDTO = content instanceof CellDTO ? (CellDTO) content : null;
                Object content2 = state.getContent();
                return new BrandV2VI(widgetId, state.getTabGroupId(), cellDTO, content2 instanceof BadgeDTO ? (BadgeDTO) content2 : null, state.getHorizontalPadding());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18112 extends AbstractC7737t implements Function1<k<BrandV2VI>, Unit> {
            final /* synthetic */ j<BrandV2DTO, BrandV2VI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<BrandV2VI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<BrandV2DTO, BrandV2VI> $this_viewMapper;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;", "state", "", "invoke", "(Lru/ozon/app/android/pdp/widgets/brandV2/presentation/BrandV2VI;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.app.android.pdp.widgets.brandV2.core.BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C18121 extends AbstractC7737t implements InterfaceC6511n<BrandV2VI, InterfaceC3967k, Integer, Unit> {
                    final /* synthetic */ i<BrandV2VI> $this_content;
                    final /* synthetic */ j<BrandV2DTO, BrandV2VI> $this_viewMapper;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C18121(i<BrandV2VI> iVar, j<BrandV2DTO, BrandV2VI> jVar) {
                        super(3);
                        this.$this_content = iVar;
                        this.$this_viewMapper = jVar;
                    }

                    @Override // fd.InterfaceC6511n
                    public /* bridge */ /* synthetic */ Unit invoke(BrandV2VI brandV2VI, InterfaceC3967k interfaceC3967k, Integer num) {
                        invoke(brandV2VI, interfaceC3967k, num.intValue());
                        return Unit.f71690a;
                    }

                    public final void invoke(BrandV2VI state, InterfaceC3967k interfaceC3967k, int i11) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        if ((i11 & 6) == 0) {
                            i11 |= (i11 & 8) == 0 ? interfaceC3967k.n(state) : interfaceC3967k.F(state) ? 4 : 2;
                        }
                        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                            interfaceC3967k.j();
                        } else {
                            BrandV2ComposableKt.BrandV2Composable(state, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(this.$this_content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, 0, 14)), interfaceC3967k, (i11 & 14) | CellDTO.$stable);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<BrandV2DTO, BrandV2VI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<BrandV2VI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BrandV2VI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        TabEmbeddedComposableKt.TabEmbeddedComposable(content.b(), c.c(1276060158, new C18121(content, this.$this_viewMapper), interfaceC3967k), interfaceC3967k, CellDTO.$stable | 48);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18112(j<BrandV2DTO, BrandV2VI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<BrandV2VI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<BrandV2VI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1757856322, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<BrandV2DTO, BrandV2VI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<BrandV2DTO, BrandV2VI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            ru.ozon.composer.compose.widget.c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new C18112(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandV2ComposeWidgetKt$BrandV2ComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<BrandV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<BrandV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
    }
}
