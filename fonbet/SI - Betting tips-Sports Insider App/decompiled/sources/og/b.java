package og;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final List f21221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List missingFields, String str, b bVar) {
        super(str, bVar);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f21221a = missingFields;
    }
}
