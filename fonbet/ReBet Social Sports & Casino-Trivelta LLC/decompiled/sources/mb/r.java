package mb;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final List f56484a;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f56484a = list;
    }
}
