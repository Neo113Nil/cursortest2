package n8;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class o extends Wf.a {
    public o(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
    }
}
