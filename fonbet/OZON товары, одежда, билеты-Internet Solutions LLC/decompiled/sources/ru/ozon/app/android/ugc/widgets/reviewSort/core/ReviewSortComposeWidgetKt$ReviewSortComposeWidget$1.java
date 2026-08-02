package ru.ozon.app.android.ugc.widgets.reviewSort.core;

import A00.a;
import Ek.a;
import S0.InterfaceC3967k;
import Vg.e;
import WZ.l;
import a00.C4911f;
import a1.C4912a;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.ArrayList;
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
import ru.ozon.app.android.ugc.widgets.reviewSort.FilterSelectUpdateKey;
import ru.ozon.app.android.ugc.widgets.reviewSort.data.ReviewSortDTO;
import ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent;
import ru.ozon.app.android.ugc.widgets.reviewSort.presentation.ReviewSortComposableKt;
import ru.ozon.app.android.ugc.widgets.reviewSort.presentation.ReviewSortVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<ReviewSortDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ReviewSortDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19621 extends AbstractC7737t implements Function1<C7244b, ReviewSortDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19621(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ReviewSortDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ReviewSortDTO) this.$jsonDeserializer.fromJson(it.b(), ReviewSortDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ReviewSortDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ReviewSortDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19621(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<ReviewSortDTO, ReviewSortVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ReviewSortDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<ReviewSortDTO, d, List<? extends ReviewSortVO>> {
            final /* synthetic */ ReviewSortButtonComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ReviewSortButtonComponent reviewSortButtonComponent) {
                super(2);
                this.$component = reviewSortButtonComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<ReviewSortVO> invoke(ReviewSortDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<k<ReviewSortVO>, Unit> {
            final /* synthetic */ ReviewSortButtonComponent $component;
            final /* synthetic */ j<ReviewSortDTO, ReviewSortVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ReviewSortVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ ReviewSortButtonComponent $component;
                final /* synthetic */ j<ReviewSortDTO, ReviewSortVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ReviewSortButtonComponent reviewSortButtonComponent, j<ReviewSortDTO, ReviewSortVO> jVar) {
                    super(4);
                    this.$component = reviewSortButtonComponent;
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ReviewSortVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ReviewSortVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    CellDTO modifyCellDTO;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    int i12 = (i11 & 6) == 0 ? i11 | (interfaceC3967k.n(content) ? 4 : 2) : i11;
                    if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    l lVar = (l) interfaceC3967k.m(f.e());
                    boolean z11 = this.$component.getAppType() == AppType.SELECT;
                    ReviewSortVO b11 = content.b();
                    List<CellDTO> cells = content.b().getCells();
                    ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
                    int i13 = 0;
                    for (Object obj : cells) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        modifyCellDTO = ReviewSortComposeWidgetKt.modifyCellDTO((CellDTO) obj, i13 == content.b().getSelectItemIndex(), z11);
                        arrayList.add(modifyCellDTO);
                        i13 = i14;
                    }
                    ReviewSortVO copy$default = ReviewSortVO.copy$default(b11, 0L, null, arrayList, null, null, null, null, 0, null, 507, null);
                    e.a widgetActionHandlerBuilder = WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12 & 14, 14);
                    interfaceC3967k.o(1822935048);
                    boolean F11 = interfaceC3967k.F(copy$default) | interfaceC3967k.F(interfaceC7851b);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1$actionHandler$1$1(copy$default, interfaceC7851b);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(widgetActionHandlerBuilder, (Function1) C11));
                    interfaceC3967k.o(1822961214);
                    boolean F12 = interfaceC3967k.F(this.$component) | interfaceC3967k.F(copy$default) | interfaceC3967k.F(c4911f) | interfaceC3967k.F(lVar);
                    ReviewSortButtonComponent reviewSortButtonComponent = this.$component;
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$4$1$buttonAction$1$1(reviewSortButtonComponent, copy$default, c4911f, lVar);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    ReviewSortComposableKt.ReviewSortComposable(copy$default, z11, m470buildHandlerimpl, (Function1) C12, null, interfaceC3967k, 0, 16);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ReviewSortButtonComponent reviewSortButtonComponent, j<ReviewSortDTO, ReviewSortVO> jVar) {
                super(1);
                this.$component = reviewSortButtonComponent;
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ReviewSortVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ReviewSortVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 246853176, new AnonymousClass1(this.$component, this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ReviewSortDTO, ReviewSortVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ReviewSortDTO, ReviewSortVO> jVar) {
            ReviewSortButtonComponent reviewSortButtonComponent = (ReviewSortButtonComponent) a.c(jVar, "$this$viewMapper", ReviewSortButtonComponent.class);
            jVar.i(AnonymousClass1.INSTANCE, new AnonymousClass2(reviewSortButtonComponent));
            jVar.c().put(FilterSelectUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    AtomActionDTO action;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    FilterSelectUpdateKey filterSelectUpdateKey = (FilterSelectUpdateKey) update;
                    ReviewSortVO reviewSortVO = (ReviewSortVO) old;
                    int index = filterSelectUpdateKey.getIndex();
                    ButtonV3DTO applyButton = reviewSortVO.getApplyButton();
                    CommonControlSettings common = reviewSortVO.getApplyButton().getCommon();
                    CommonControlSettings commonControlSettings = null;
                    r2 = null;
                    AtomActionDTO atomActionDTO = null;
                    if (common != null) {
                        CommonControlSettings common2 = reviewSortVO.getApplyButton().getCommon();
                        if (common2 != null && (action = common2.getAction()) != null) {
                            atomActionDTO = AtomActionDTO.copy$default(action, null, null, filterSelectUpdateKey.getActionId(), null, null, 27, null);
                        }
                        commonControlSettings = CommonControlSettings.copy$default(common, atomActionDTO, null, null, 6, null);
                    }
                    return ReviewSortVO.copy$default(reviewSortVO, 0L, null, null, null, null, ButtonV3DTO.copy$default(applyButton, null, null, null, null, null, null, null, null, null, null, null, null, null, commonControlSettings, null, null, null, 122879, null), null, index, null, 351, null);
                }
            });
            jVar.G(new AnonymousClass4(reviewSortButtonComponent, jVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ReviewSortDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ReviewSortDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewSort.core.ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ReviewSortButtonComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
