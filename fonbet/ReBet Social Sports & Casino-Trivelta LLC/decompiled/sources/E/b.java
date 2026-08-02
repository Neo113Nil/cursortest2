package E;

import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public class b extends AbstractMap implements Map, KMappedMarker {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2904c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f2905d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2906e = new b(j.f2914c.a(), 0);

    /* renamed from: a, reason: collision with root package name */
    public final j f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2908b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(j jVar, int i10) {
        this.f2907a = jVar;
        this.f2908b = i10;
    }

    public final D.b b() {
        return new d(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public D.b getKeys() {
        return new f(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f2907a.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final j d() {
        return this.f2907a;
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public D.a getValues() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f2907a.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getEntries() {
        return b();
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.f2908b;
    }
}
