package kh;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p referent, Object obj) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f19136a = obj;
    }
}
