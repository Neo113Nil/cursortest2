package coil.compose;

import coil.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class h extends AbstractC7737t implements Function1<AsyncImagePainter.State, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State.Loading, Unit> f57284b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<AsyncImagePainter.State.Success, Unit> f57285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(Function1 function1, Function1 function12) {
        super(1);
        this.f57284b = function1;
        this.f57285c = function12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AsyncImagePainter.State state) {
        AsyncImagePainter.State state2 = state;
        if (state2 instanceof AsyncImagePainter.State.Loading) {
            Function1<AsyncImagePainter.State.Loading, Unit> function1 = this.f57284b;
            if (function1 != 0) {
                function1.invoke(state2);
            }
        } else if (state2 instanceof AsyncImagePainter.State.Success) {
            Function1<AsyncImagePainter.State.Success, Unit> function12 = this.f57285c;
            if (function12 != 0) {
                function12.invoke(state2);
            }
        } else if (!(state2 instanceof AsyncImagePainter.State.Error)) {
            boolean z11 = state2 instanceof AsyncImagePainter.State.a;
        }
        return Unit.f71690a;
    }
}
