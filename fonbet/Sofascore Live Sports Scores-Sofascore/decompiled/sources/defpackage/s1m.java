package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s1m {
    public final String a;
    public final Function2 b;
    public final long c;
    public yda d;

    public s1m(@NotNull String str, @NotNull Function2<? super Long, ? super rq3<? super yda>, ? extends Object> function2, long j, @Nullable yda ydaVar) {
        str.getClass();
        function2.getClass();
        this.a = str;
        this.b = function2;
        this.c = j;
        this.d = ydaVar;
    }

    public static s1m copy$default(s1m s1mVar, String str, Function2 function2, long j, yda ydaVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = s1mVar.a;
        }
        if ((i & 2) != 0) {
            function2 = s1mVar.b;
        }
        if ((i & 4) != 0) {
            j = s1mVar.c;
        }
        if ((i & 8) != 0) {
            ydaVar = s1mVar.d;
        }
        yda ydaVar2 = ydaVar;
        s1mVar.getClass();
        str.getClass();
        function2.getClass();
        long j2 = j;
        return new s1m(str, function2, j2, ydaVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1m)) {
            return false;
        }
        s1m s1mVar = (s1m) obj;
        return Intrinsics.c(this.a, s1mVar.a) && Intrinsics.c(this.b, s1mVar.b) && this.c == s1mVar.c && Intrinsics.c(this.d, s1mVar.d);
    }

    public final int hashCode() {
        int c = ljg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        yda ydaVar = this.d;
        return c + (ydaVar == null ? 0 : ydaVar.hashCode());
    }

    public final String toString() {
        return "PeriodicTask(taskName=" + this.a + ", taskExecuter=" + this.b + ", taskInterval=" + this.c + ", taskCurrentJob=" + this.d + ')';
    }

    public /* synthetic */ s1m(String str, Function2 function2, long j, yda ydaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function2, j, (i & 8) != 0 ? null : ydaVar);
    }
}
