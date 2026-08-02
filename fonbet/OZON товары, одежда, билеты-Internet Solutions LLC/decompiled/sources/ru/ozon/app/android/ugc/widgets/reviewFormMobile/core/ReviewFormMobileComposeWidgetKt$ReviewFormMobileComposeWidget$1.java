package ru.ozon.app.android.ugc.widgets.reviewFormMobile.core;

import d00.C6018d;
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
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.di.IslandSeparatorWidgetComponent;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.stickyIslandSeparator.StickyIslandSeparatorViewMapper;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerViewMapper;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.HidableIndicatorVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous.ReviewFormAnonymousViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAuthorCell.ReviewFormAuthorCellViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormCell.ReviewFormCellVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormCell.ReviewFormCellWidgetKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormDisclaimer.ReviewFormDisclaimerViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellContentKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2VO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2WidgetKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormQuestions.ReviewFormQuestionsViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewFormSubmitButtonViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker.ReviewFormVariantPickerViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    final /* synthetic */ CommonIslandSeparatorViewMapper2 $islandSeparatorViewMapper;
    final /* synthetic */ MediaPickerViewMapper $mediaPickerViewMapper;
    final /* synthetic */ PlainTextViewMapper2 $plainTextViewMapper2;
    final /* synthetic */ SeparatorViewMapper $separatorViewMapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        /* synthetic */ class C19611 extends C7735q implements Function1<C7244b, List<? extends Object>> {
            C19611(Object obj) {
                super(1, obj, ReviewFormMobileParser.class, "parse", "parse(Lru/ozon/composer/widget/config/WidgetParsedState;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<Object> invoke(C7244b p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return ((ReviewFormMobileParser) this.receiver).parse(p02);
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
            b.h(config, null, new C19611(((ReviewFormComponent) config.getWidgetComponentStorage().getComponent(ReviewFormComponent.class)).getParser()), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<Object, ReviewFormRatingVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, ReviewFormRatingVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, ReviewFormRatingVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            ReviewFormRatingContentKt.reviewFormRatingContent(viewMapper);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormCell/ReviewFormCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<Object, ReviewFormCellVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, ReviewFormCellVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, ReviewFormCellVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            ReviewFormCellWidgetKt.reviewFormCellWidget(viewMapper);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/HidableIndicatorVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<Object, HidableIndicatorVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof HidableIndicatorVO);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "state", "Ll20/d;", "<unused var>", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/HidableIndicatorVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/HidableIndicatorVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, HidableIndicatorVO> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final HidableIndicatorVO invoke(Object state, d dVar) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(dVar, "<unused var>");
                return (HidableIndicatorVO) state;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/HidableIndicatorVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<HidableIndicatorVO>, Unit> {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<HidableIndicatorVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<HidableIndicatorVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(ComposableSingletons$ReviewFormMobileComposeWidgetKt.INSTANCE.m1530getLambda1$ugc_prodGoogleAllVendorsRelease());
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<Object, HidableIndicatorVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<Object, HidableIndicatorVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            viewMapper.G(AnonymousClass3.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<e<Object, ReviewFormHeaderV2VO>, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<Object, ReviewFormHeaderV2VO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<Object, ReviewFormHeaderV2VO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            ReviewFormHeaderV2WidgetKt.reviewFormHeaderV2Widget(overlayViewMapper);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function1<e<Object, ReviewFormFooterCellVO>, Unit> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<Object, ReviewFormFooterCellVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<Object, ReviewFormFooterCellVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            ReviewFormFooterCellContentKt.reviewFormFooterCellContent(overlayViewMapper);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1(SeparatorViewMapper separatorViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, PlainTextViewMapper2 plainTextViewMapper2, MediaPickerViewMapper mediaPickerViewMapper) {
        super(1);
        this.$separatorViewMapper = separatorViewMapper;
        this.$islandSeparatorViewMapper = commonIslandSeparatorViewMapper2;
        this.$plainTextViewMapper2 = plainTextViewMapper2;
        this.$mediaPickerViewMapper = mediaPickerViewMapper;
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
        ComposeWidgetExtKt.rawViewMappers(ComposeWidget, this.$separatorViewMapper, this.$islandSeparatorViewMapper, this.$plainTextViewMapper2);
        ViewMapper2[] viewMapper2Arr = {new ReviewFormAnonymousViewMapper(), new ReviewFormAuthorCellViewMapper(), new ReviewFormCommentViewMapper(), new ReviewFormDisclaimerViewMapper(), new ReviewFormHeaderViewMapper(), new ReviewFormPointsProgressViewMapper(), new ReviewFormQuestionsViewMapper(), new ReviewFormSubmitButtonViewMapper(), new ReviewFormVariantPickerViewMapper(), new ReviewFormNoUiWidgetMapper()};
        for (int i11 = 0; i11 < 10; i11++) {
            final ViewMapper2 viewMapper2 = viewMapper2Arr[i11];
            ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$invoke$$inlined$rawComponentMappers$1
                @Override // d00.C6018d.a
                public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ViewMapper2.this.setComponent(it.getComponent(ReviewFormComponent.class));
                    Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                    return ViewMapper2.this;
                }
            });
        }
        final ViewMapper2 viewMapper22 = new ViewMapper2[]{this.$mediaPickerViewMapper}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$invoke$$inlined$rawComponentMappers$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(MediaPickerComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        final ViewMapper2 viewMapper23 = new ViewMapper2[]{new StickyIslandSeparatorViewMapper()}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$invoke$$inlined$rawComponentMappers$3
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(IslandSeparatorWidgetComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.p(AnonymousClass4.INSTANCE);
        ComposeWidget.l(AnonymousClass5.INSTANCE);
        ComposeWidget.l(AnonymousClass6.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ReviewFormComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.core.ReviewFormMobileComposeWidgetKt$ReviewFormMobileComposeWidget$1$invoke$$inlined$widgetComponent$2
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MediaPickerComponent.INSTANCE.getInstance(it);
            }
        });
    }
}
