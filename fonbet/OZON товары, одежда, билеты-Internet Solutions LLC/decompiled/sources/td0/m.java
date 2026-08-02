package td0;

import androidx.lifecycle.C5418g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements id.f<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5418g0 f99439a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f99440b;

    m(C5418g0 c5418g0, String str) {
        this.f99439a = c5418g0;
        this.f99440b = str;
    }

    @Override // id.e
    public final Object getValue(Object thisRef, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f99439a.c(this.f99440b);
    }

    @Override // id.f
    public final void setValue(Object thisRef, kotlin.reflect.m<?> property, Object obj) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        this.f99439a.g(obj, this.f99440b);
    }
}
