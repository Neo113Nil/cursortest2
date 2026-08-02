package ru.ozon.app.android.checkoutcomposer.split.core;

import d00.C6018d;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import ru.ozon.app.android.checkoutcomposer.celllist.di.CheckoutCellListWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.celllist.presentation.CheckoutCellListViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector.LogosCarouselViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.CellVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.CellViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.compose.CellComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.disclaimer.DisclaimerViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.productBlock.ProductBlockViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.SeparatorVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.SeparatorViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator.compose.SeparatorComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tabs.TabsViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagListViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.verticalSpacer.VerticalSpacerVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.verticalSpacer.VerticalSpacerViewMapper;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.verticalSpacer.compose.VerticalSpacerComposeWidgetKt;
import ru.ozon.app.android.checkoutcomposer.utils.ComposeExtKt;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SplitWidgetKt$splitWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    public static final SplitWidgetKt$splitWidget$1 INSTANCE = new SplitWidgetKt$splitWidget$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17511 extends AbstractC7737t implements Function1<C7244b, List<? extends Object>> {
            final /* synthetic */ SplitWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17511(SplitWidgetComponent splitWidgetComponent) {
                super(1);
                this.$component = splitWidgetComponent;
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
            b.h(config, null, new C17511((SplitWidgetComponent) config.getWidgetComponentStorage().getComponent(SplitWidgetComponent.class)), 1, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$10, reason: invalid class name */
    /* synthetic */ class AnonymousClass10 extends C7735q implements Function1<SplitWidgetComponent, VerticalSpacerViewMapper> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(1, VerticalSpacerViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final VerticalSpacerViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new VerticalSpacerViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$11, reason: invalid class name */
    /* synthetic */ class AnonymousClass11 extends C7735q implements Function1<CheckoutCellListWidgetComponent, CheckoutCellListViewMapper> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        AnonymousClass11() {
            super(1, CheckoutCellListViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/celllist/di/CheckoutCellListWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CheckoutCellListViewMapper invoke(CheckoutCellListWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new CheckoutCellListViewMapper(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$12, reason: invalid class name */
    static final class AnonymousClass12 extends AbstractC7737t implements Function1<j<Object, CellVO>, Unit> {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        AnonymousClass12() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, CellVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, CellVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            CellComposeWidgetKt.cellComposeWidget(viewMapper);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$13, reason: invalid class name */
    static final class AnonymousClass13 extends AbstractC7737t implements Function1<j<Object, SeparatorVO>, Unit> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        AnonymousClass13() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, SeparatorVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, SeparatorVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            SeparatorComposeWidgetKt.separatorComposeWidget(viewMapper);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/verticalSpacer/VerticalSpacerVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$14, reason: invalid class name */
    static final class AnonymousClass14 extends AbstractC7737t implements Function1<j<Object, VerticalSpacerVO>, Unit> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        AnonymousClass14() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, VerticalSpacerVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, VerticalSpacerVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            VerticalSpacerComposeWidgetKt.verticalSpacerComposeWidget(viewMapper);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<SplitWidgetComponent, CellViewMapper> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1, CellViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CellViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new CellViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<SplitWidgetComponent, LogosCarouselViewMapper> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1, LogosCarouselViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final LogosCarouselViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new LogosCarouselViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$5, reason: invalid class name */
    /* synthetic */ class AnonymousClass5 extends C7735q implements Function1<SplitWidgetComponent, DisclaimerViewMapper> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(1, DisclaimerViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisclaimerViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new DisclaimerViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends C7735q implements Function1<SplitWidgetComponent, ProductBlockViewMapper> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(1, ProductBlockViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ProductBlockViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new ProductBlockViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$7, reason: invalid class name */
    /* synthetic */ class AnonymousClass7 extends C7735q implements Function1<SplitWidgetComponent, SeparatorViewMapper> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(1, SeparatorViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SeparatorViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new SeparatorViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$8, reason: invalid class name */
    /* synthetic */ class AnonymousClass8 extends C7735q implements Function1<SplitWidgetComponent, TabsViewMapper> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(1, TabsViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TabsViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new TabsViewMapper(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$9, reason: invalid class name */
    /* synthetic */ class AnonymousClass9 extends C7735q implements Function1<SplitWidgetComponent, TagListViewMapper> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        AnonymousClass9() {
            super(1, TagListViewMapper.class, "<init>", "<init>(Lru/ozon/app/android/checkoutcomposer/split/di/SplitWidgetComponent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TagListViewMapper invoke(SplitWidgetComponent p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new TagListViewMapper(p02);
        }
    }

    SplitWidgetKt$splitWidget$1() {
        super(1);
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
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SplitWidgetComponent.INSTANCE.create(it);
            }
        });
        ComposeExtKt.rawViewMappers(ComposeWidget, new CommonIslandSeparatorViewMapper2());
        Function1[] function1Arr = {AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE, AnonymousClass5.INSTANCE, AnonymousClass6.INSTANCE, AnonymousClass7.INSTANCE, AnonymousClass8.INSTANCE, AnonymousClass9.INSTANCE, AnonymousClass10.INSTANCE};
        for (int i11 = 0; i11 < 8; i11++) {
            final Function1 function1 = function1Arr[i11];
            ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$invoke$$inlined$rawViewMappersWithComponent$1
                @Override // d00.C6018d.a
                public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Object invoke = Function1.this.invoke(it.getComponent(SplitWidgetComponent.class));
                    Intrinsics.g(invoke, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.composer.widget.item.ViewItem>");
                    return (InterfaceC8046a) invoke;
                }
            });
        }
        final Function1 function12 = new Function1[]{AnonymousClass11.INSTANCE}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutcomposer.split.core.SplitWidgetKt$splitWidget$1$invoke$$inlined$rawViewMappersWithComponent$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Object invoke = Function1.this.invoke(it.getComponent(CheckoutCellListWidgetComponent.class));
                Intrinsics.g(invoke, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<kotlin.Any, ru.ozon.composer.widget.item.ViewItem>");
                return (InterfaceC8046a) invoke;
            }
        });
        ComposeWidget.p(AnonymousClass12.INSTANCE);
        ComposeWidget.p(AnonymousClass13.INSTANCE);
        ComposeWidget.p(AnonymousClass14.INSTANCE);
    }
}
