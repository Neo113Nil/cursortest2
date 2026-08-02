package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jc implements v6d {
    public final int a;
    public final Bundle b;

    public jc(int i) {
        this.a = i;
        lm5.a.getClass();
        this.b = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
    }

    @Override // defpackage.v6d
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jc.class.equals(obj.getClass()) && this.a == ((jc) obj).a;
    }

    @Override // defpackage.v6d
    public final Bundle getArguments() {
        return this.b;
    }

    public final int hashCode() {
        return 31 + this.a;
    }

    public final String toString() {
        return wv8.j(new StringBuilder("ActionOnlyNavDirections(actionId="), this.a, ')');
    }
}
