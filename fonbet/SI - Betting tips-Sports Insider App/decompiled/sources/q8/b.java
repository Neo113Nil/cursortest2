package q8;

import ag.u;
import android.content.Context;
import c1.i;
import f3.x;
import h9.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f22061d = {Reflection.property2(new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final String f22062a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f22063b;

    /* renamed from: c, reason: collision with root package name */
    public final i f22064c;

    public b(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f22062a = name;
        this.f22063b = new ThreadLocal();
        this.f22064c = (i) x.p0(name, new c(new a(this, 0)), new a(this, 1), 8).a(context, f22061d[0]);
    }

    public final void a(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
    }
}
