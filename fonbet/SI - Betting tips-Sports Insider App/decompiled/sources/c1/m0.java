package c1;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f3430c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f3431d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final a2.j f3432a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.q f3433b;

    public m0(a2.q produceFile) {
        a2.j coordinatorProducer = new a2.j(9);
        g1.f serializer = g1.f.f9708a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f3432a = coordinatorProducer;
        this.f3433b = produceFile;
    }
}
