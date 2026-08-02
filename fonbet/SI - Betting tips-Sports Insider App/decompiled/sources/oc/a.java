package oc;

import android.content.Context;
import gf.k;
import gf.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21154a;

    /* renamed from: b, reason: collision with root package name */
    public final t f21155b;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21154a = context;
        this.f21155b = k.b(new me.a(5, this));
    }

    public static final int a(a aVar) {
        return ((Number) aVar.f21155b.getValue()).intValue();
    }
}
