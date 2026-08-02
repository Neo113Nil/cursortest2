package ru.ozon.app.android.ugc.core.widgets.rowList.core;

import A00.a;
import Ek.a;
import S0.InterfaceC3967k;
import S0.Q;
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
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.SubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.UnsubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.ugc.core.widgets.rowList.data.RowListDTO;
import ru.ozon.app.android.ugc.core.widgets.rowList.di.RowListComponent;
import ru.ozon.app.android.ugc.core.widgets.rowList.presentation.RowListComposableKt;
import ru.ozon.app.android.ugc.core.widgets.rowList.presentation.RowListItemVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class RowListComposeWidgetKt$RowListComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<RowListDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<RowListDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19491 extends AbstractC7737t implements Function1<C7244b, List<? extends RowListDTO>> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19491(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<RowListDTO> invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return C7714v.a0(this.$jsonDeserializer.fromJson(it.b(), RowListDTO.class));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<RowListDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<RowListDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new C19491(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<RowListDTO, RowListItemVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19503 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final C19503 INSTANCE = new C19503();

            C19503() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof RowListDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function2<RowListDTO, d, List<? extends RowListItemVO>> {
            final /* synthetic */ RowListComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(RowListComponent rowListComponent) {
                super(2);
                this.$component = rowListComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<RowListItemVO> invoke(RowListDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$5, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass5 extends AbstractC7737t implements Function1<k<RowListItemVO>, Unit> {
            final /* synthetic */ RowListComponent $component;
            final /* synthetic */ j<RowListDTO, RowListItemVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<RowListItemVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ RowListComponent $component;
                final /* synthetic */ j<RowListDTO, RowListItemVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<RowListDTO, RowListItemVO> jVar, RowListComponent rowListComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = rowListComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<RowListItemVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<RowListItemVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), this.$component.getCustomActionHandlersStoreFactory().create(SubscribeAuthorActionHandler.class, UnsubscribeAuthorActionHandler.class)));
                    Unit unit = Unit.f71690a;
                    interfaceC3967k.o(-788860728);
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(this.$component) | interfaceC3967k.F(interfaceC7851b);
                    RowListComponent rowListComponent = this.$component;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new RowListComposeWidgetKt$RowListComposeWidget$1$3$5$1$1$1(content, rowListComponent, interfaceC7851b, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C11);
                    RowListComposableKt.RowListComposable(content.b(), m470buildHandlerimpl, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(j<RowListDTO, RowListItemVO> jVar, RowListComponent rowListComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = rowListComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<RowListItemVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<RowListItemVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 782986725, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<RowListDTO, RowListItemVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<RowListDTO, RowListItemVO> jVar) {
            RowListComponent rowListComponent = (RowListComponent) a.c(jVar, "$this$viewMapper", RowListComponent.class);
            jVar.c().put(SubscribeAuthorUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    RowListItemVO updateIfAuthorMatches;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updateIfAuthorMatches = RowListComposeWidgetKt.updateIfAuthorMatches((RowListItemVO) old, ((SubscribeAuthorUpdateKey) update).getAuthorId(), true);
                    return updateIfAuthorMatches;
                }
            });
            jVar.c().put(UnsubscribeAuthorUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$3$invoke$$inlined$update$2
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    RowListItemVO updateIfAuthorMatches;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updateIfAuthorMatches = RowListComposeWidgetKt.updateIfAuthorMatches((RowListItemVO) old, ((UnsubscribeAuthorUpdateKey) update).getAuthorId(), false);
                    return updateIfAuthorMatches;
                }
            });
            jVar.i(C19503.INSTANCE, new AnonymousClass4(rowListComponent));
            jVar.G(new AnonymousClass5(jVar, rowListComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RowListComposeWidgetKt$RowListComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<RowListDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<RowListDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.rowList.core.RowListComposeWidgetKt$RowListComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RowListComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
