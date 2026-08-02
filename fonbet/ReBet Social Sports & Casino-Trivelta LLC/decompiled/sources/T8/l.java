package T8;

import com.giphy.sdk.core.models.Media;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final m f11327a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11329c;

    public l(m viewType, Object obj, int i10) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f11327a = viewType;
        this.f11328b = obj;
        this.f11329c = i10;
    }

    public final Object a() {
        return this.f11328b;
    }

    public final Media b() {
        if (!CollectionsKt.listOf((Object[]) new m[]{m.f11331c, m.f11330b, m.f11332d, m.f11333e}).contains(this.f11327a)) {
            return null;
        }
        Object obj = this.f11328b;
        if (obj instanceof Media) {
            return (Media) obj;
        }
        return null;
    }

    public final int c() {
        return this.f11329c;
    }

    public final m d() {
        return this.f11327a;
    }

    public /* synthetic */ l(m mVar, Object obj, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, obj, (i11 & 4) != 0 ? 1 : i10);
    }
}
