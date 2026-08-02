package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import S0.A1;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ImagesComposableKt$ImagesComposable$3$2$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ A1<List<ComposableImageVO>> $images$delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "", "image", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose.ImagesComposableKt$ImagesComposable$3$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<Integer, ComposableImageVO, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ComposableImageVO composableImageVO) {
            return invoke(num.intValue(), composableImageVO);
        }

        public final Object invoke(int i11, ComposableImageVO image) {
            Intrinsics.checkNotNullParameter(image, "image");
            return image.getKey();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ImagesComposableKt$ImagesComposable$3$2$1(A1<? extends List<ComposableImageVO>> a12, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$images$delegate = a12;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        List ImagesComposable$lambda$3;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        ImagesComposable$lambda$3 = ImagesComposableKt.ImagesComposable$lambda$3(this.$images$delegate);
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        LazyRow.a(ImagesComposable$lambda$3.size(), anonymousClass1 != null ? new ImagesComposableKt$ImagesComposable$3$2$1$invoke$$inlined$itemsIndexed$default$1(anonymousClass1, ImagesComposable$lambda$3) : null, new ImagesComposableKt$ImagesComposable$3$2$1$invoke$$inlined$itemsIndexed$default$2(ImagesComposable$lambda$3), new C4912a(true, -1091073711, new ImagesComposableKt$ImagesComposable$3$2$1$invoke$$inlined$itemsIndexed$default$3(ImagesComposable$lambda$3, this.$actionHandler)));
    }
}
