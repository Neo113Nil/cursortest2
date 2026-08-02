package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core;

import A00.a;
import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import WZ.l;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import b1.C5503f;
import b1.C5517t;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.ugc.core.flags.ReviewGalleryPreviewComposeEnabled;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.data.ReviewGalleryPreviewV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewComposableKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import v0.I;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<ReviewGalleryPreviewV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ReviewGalleryPreviewV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "it", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19461 extends AbstractC7737t implements Function1<C7244b, List<? extends ReviewGalleryPreviewV2DTO>> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19461(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<ReviewGalleryPreviewV2DTO> invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return C7714v.a0(this.$jsonDeserializer.fromJson(it.b(), ReviewGalleryPreviewV2DTO.class));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ReviewGalleryPreviewV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ReviewGalleryPreviewV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new C19461(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ ReviewGalleryPreviewV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReviewGalleryPreviewV2Component reviewGalleryPreviewV2Component) {
                super(1);
                this.$component = reviewGalleryPreviewV2Component;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof ReviewGalleryPreviewV2DTO) && this.$component.getFeatureChecker().isEnabled(ReviewGalleryPreviewComposeEnabled.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<ReviewGalleryPreviewV2DTO, d, List<? extends ReviewGalleryPreviewV2VO>> {
            final /* synthetic */ ReviewGalleryPreviewV2Component $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ReviewGalleryPreviewV2Component reviewGalleryPreviewV2Component) {
                super(2);
                this.$component = reviewGalleryPreviewV2Component;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<ReviewGalleryPreviewV2VO> invoke(ReviewGalleryPreviewV2DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<ReviewGalleryPreviewV2VO>, Unit> {
            final /* synthetic */ ReviewGalleryPreviewV2Component $component;
            final /* synthetic */ j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ReviewGalleryPreviewV2VO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ ReviewGalleryPreviewV2Component $component;
                final /* synthetic */ j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO> jVar, ReviewGalleryPreviewV2Component reviewGalleryPreviewV2Component) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = reviewGalleryPreviewV2Component;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ReviewGalleryPreviewViewModel.Previews invoke$lambda$2(A1<ReviewGalleryPreviewViewModel.Previews> a12) {
                    return a12.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final a invoke$lambda$3(A1<? extends a> a12) {
                    return a12.getValue();
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ReviewGalleryPreviewV2VO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ReviewGalleryPreviewV2VO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    l lVar = (l) interfaceC3967k.m(f.e());
                    int i13 = i12 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14));
                    PreviewItemListAdapter.VideoPreloader videoPreloader = this.$component.getVideoPreloader();
                    B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
                    final ReviewGalleryPreviewV2Component reviewGalleryPreviewV2Component = this.$component;
                    ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl = (ReviewGalleryPreviewViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelImpl2 = ReviewGalleryPreviewV2Component.this.getReviewGalleryPreviewViewModelProvider().get();
                            Intrinsics.g(reviewGalleryPreviewViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return reviewGalleryPreviewViewModelImpl2;
                        }
                    }).b(ReviewGalleryPreviewViewModelImpl.class, String.valueOf(content.b().getId()));
                    Object[] objArr = {Long.valueOf(content.b().getId())};
                    C5517t c5517t = I.f101467x;
                    interfaceC3967k.o(678658083);
                    boolean F11 = interfaceC3967k.F(reviewGalleryPreviewViewModelImpl);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$listState$1$1(reviewGalleryPreviewViewModelImpl);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    I i14 = (I) C5503f.c(objArr, c5517t, (Function0) C11, interfaceC3967k, 0, 4);
                    InterfaceC3978p0 b11 = n1.b(reviewGalleryPreviewViewModelImpl.getPreviews(), interfaceC3967k);
                    InterfaceC3978p0 a12 = n1.a(interfaceC7851b.getEventsFlow(), null, null, interfaceC3967k, 48, 2);
                    Long valueOf = Long.valueOf(content.b().getId());
                    interfaceC3967k.o(678668697);
                    boolean F12 = interfaceC3967k.F(reviewGalleryPreviewViewModelImpl) | (i13 == 4);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$1$1(reviewGalleryPreviewViewModelImpl, content, null);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, valueOf, (Function2) C12);
                    a invoke$lambda$3 = invoke$lambda$3(a12);
                    ReviewGalleryPreviewViewModel.Previews invoke$lambda$2 = invoke$lambda$2(b11);
                    interfaceC3967k.o(678681147);
                    boolean n11 = interfaceC3967k.n(a12) | interfaceC3967k.n(b11) | interfaceC3967k.n(i14);
                    Object C13 = interfaceC3967k.C();
                    if (n11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$2$1(i14, a12, b11, null);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    Q.g(invoke$lambda$3, invoke$lambda$2, (Function2) C13, interfaceC3967k);
                    ReviewGalleryPreviewV2VO b12 = content.b();
                    List<ReviewGalleryPreviewV2VO.ItemVO> items = invoke$lambda$2(b11).getItems();
                    interfaceC3967k.o(678695692);
                    boolean F13 = interfaceC3967k.F(reviewGalleryPreviewViewModelImpl);
                    Object C14 = interfaceC3967k.C();
                    if (F13 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$3$1(reviewGalleryPreviewViewModelImpl);
                        interfaceC3967k.x(C14);
                    }
                    interfaceC3967k.k();
                    Function2 function2 = (Function2) ((kotlin.reflect.h) C14);
                    interfaceC3967k.o(678697803);
                    boolean F14 = interfaceC3967k.F(reviewGalleryPreviewViewModelImpl);
                    Object C15 = interfaceC3967k.C();
                    if (F14 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$4$1(reviewGalleryPreviewViewModelImpl);
                        interfaceC3967k.x(C15);
                    }
                    interfaceC3967k.k();
                    Function2 function22 = (Function2) ((kotlin.reflect.h) C15);
                    interfaceC3967k.o(678699781);
                    boolean F15 = interfaceC3967k.F(lVar);
                    Object C16 = interfaceC3967k.C();
                    if (F15 || C16 == InterfaceC3967k.a.a()) {
                        C16 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$5$1(lVar);
                        interfaceC3967k.x(C16);
                    }
                    Function1 function1 = (Function1) C16;
                    interfaceC3967k.k();
                    interfaceC3967k.o(678702856);
                    boolean F16 = interfaceC3967k.F(videoPreloader) | interfaceC3967k.n(m470buildHandlerimpl);
                    Object C17 = interfaceC3967k.C();
                    if (F16 || C17 == InterfaceC3967k.a.a()) {
                        C17 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$6$1(videoPreloader, m470buildHandlerimpl);
                        interfaceC3967k.x(C17);
                    }
                    Function1 function12 = (Function1) C17;
                    interfaceC3967k.k();
                    interfaceC3967k.o(678709730);
                    boolean n12 = interfaceC3967k.n(m470buildHandlerimpl);
                    Object C18 = interfaceC3967k.C();
                    if (n12 || C18 == InterfaceC3967k.a.a()) {
                        C18 = new ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$4$3$1$7$1(m470buildHandlerimpl);
                        interfaceC3967k.x(C18);
                    }
                    interfaceC3967k.k();
                    ReviewGalleryPreviewComposableKt.ReviewGalleryPreviewComposable(b12, items, function2, function22, function1, function12, (Function1) ((kotlin.reflect.h) C18), i14, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO> jVar, ReviewGalleryPreviewV2Component reviewGalleryPreviewV2Component) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = reviewGalleryPreviewV2Component;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ReviewGalleryPreviewV2VO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ReviewGalleryPreviewV2VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 652982567, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ReviewGalleryPreviewV2DTO, ReviewGalleryPreviewV2VO> jVar) {
            ReviewGalleryPreviewV2Component reviewGalleryPreviewV2Component = (ReviewGalleryPreviewV2Component) Ek.a.c(jVar, "$this$viewMapper", ReviewGalleryPreviewV2Component.class);
            jVar.i(new AnonymousClass1(reviewGalleryPreviewV2Component), new AnonymousClass2(reviewGalleryPreviewV2Component));
            jVar.G(new AnonymousClass3(jVar, reviewGalleryPreviewV2Component));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ReviewGalleryPreviewV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ReviewGalleryPreviewV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ReviewGalleryPreviewV2Component.INSTANCE.create(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewComposeWidgetKt$ReviewGalleryPreviewComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new ReviewGalleryPreviewV2ViewMapper((ReviewGalleryPreviewV2Component) it.getComponent(ReviewGalleryPreviewV2Component.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
