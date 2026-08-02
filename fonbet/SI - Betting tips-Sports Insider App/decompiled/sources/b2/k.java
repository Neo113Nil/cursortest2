package b2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y1.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3010b;

    public /* synthetic */ k(x xVar, int i5) {
        this.f3009a = i5;
        this.f3010b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        String key = (String) obj;
        switch (this.f3009a) {
            case 0:
                Intrinsics.checkNotNullParameter(key, "key");
                contains = this.f3010b.b().contains(key);
                break;
            default:
                Intrinsics.checkNotNullParameter(key, "key");
                contains = this.f3010b.b().contains(key);
                break;
        }
        return Boolean.valueOf(!contains);
    }
}
