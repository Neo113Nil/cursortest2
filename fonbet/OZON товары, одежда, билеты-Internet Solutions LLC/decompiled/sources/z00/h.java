package z00;

import A00.a;
import R00.b;
import i10.C6997c;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public class h<I extends C7854a> {
    @NotNull
    public R00.b createIncident(@NotNull a.p event, @NotNull C6997c<I> state, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return b.a.a();
    }

    @NotNull
    public f createIssue(@NotNull a.p event, @NotNull C6997c<I> state, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return g.a(throwable, state.l().d(), event.e());
    }
}
