package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.n1;
import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import v0.I;
import v0.InterfaceC10174n;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1", f = "ReviewGalleryPreviewComposable.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ I $listState;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onLoadNext;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onScroll;
    final /* synthetic */ List<ReviewGalleryPreviewV2VO.ItemVO> $previews;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewScrollState;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<ReviewGalleryPreviewScrollState> {
        final /* synthetic */ I $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(I i11) {
            super(0);
            this.$listState = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReviewGalleryPreviewScrollState invoke() {
            int o11 = this.$listState.o();
            int p11 = this.$listState.p();
            InterfaceC10174n interfaceC10174n = (InterfaceC10174n) C7714v.Z(this.$listState.t().g());
            return new ReviewGalleryPreviewScrollState(o11, p11, interfaceC10174n != null ? interfaceC10174n.getIndex() : -1, this.$listState.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1(I i11, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, List<ReviewGalleryPreviewV2VO.ItemVO> list, d<? super ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1> dVar) {
        super(2, dVar);
        this.$listState = i11;
        this.$onScroll = function2;
        this.$onLoadNext = function22;
        this.$previews = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1(this.$listState, this.$onScroll, this.$onLoadNext, this.$previews, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h o11 = C2399j.o(n1.m(new AnonymousClass1(this.$listState)));
            final Function2<Integer, Integer, Unit> function2 = this.$onScroll;
            final Function2<Integer, Integer, Unit> function22 = this.$onLoadNext;
            final List<ReviewGalleryPreviewV2VO.ItemVO> list = this.$previews;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ReviewGalleryPreviewScrollState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ReviewGalleryPreviewScrollState reviewGalleryPreviewScrollState, d<? super Unit> dVar) {
                    function2.invoke(new Integer(reviewGalleryPreviewScrollState.getFirstIndex()), new Integer(reviewGalleryPreviewScrollState.getOffset()));
                    if (reviewGalleryPreviewScrollState.getIsScrolling() && reviewGalleryPreviewScrollState.getLastIndex() > 0) {
                        function22.invoke(new Integer(reviewGalleryPreviewScrollState.getLastIndex()), new Integer(list.size() - 1));
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (o11.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryPreviewComposableKt$ReviewGalleryPreviewsList$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
