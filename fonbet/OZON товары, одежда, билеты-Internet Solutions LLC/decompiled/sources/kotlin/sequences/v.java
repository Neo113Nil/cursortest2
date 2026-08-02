package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes.dex */
class v extends o {
    @NotNull
    public static final C7748h a(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        q qVar = q.f71933b;
        return sequence instanceof I ? ((I) sequence).d(qVar) : new C7748h(sequence, s.f71935b, qVar);
    }
}
