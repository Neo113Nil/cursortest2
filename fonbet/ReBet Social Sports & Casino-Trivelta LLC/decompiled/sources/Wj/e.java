package Wj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e {

    @Gb.c("nickname")
    @NotNull
    private final String digitalLine;

    public e(String digitalLine) {
        Intrinsics.checkNotNullParameter(digitalLine, "digitalLine");
        this.digitalLine = digitalLine;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.digitalLine, ((e) obj).digitalLine);
    }

    public int hashCode() {
        return this.digitalLine.hashCode();
    }

    public String toString() {
        return "AccessTokenRequest(digitalLine=" + this.digitalLine + ')';
    }
}
