package hh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a extends rh.g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f10814f = new a();

    @Override // rh.g
    public final rh.g E(ag.c key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        return obj != null ? new b(key, obj, this) : this;
    }

    @Override // rh.g
    public final Object o(ag.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final String toString() {
        return "{}";
    }
}
