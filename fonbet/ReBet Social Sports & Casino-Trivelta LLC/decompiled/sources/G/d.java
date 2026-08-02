package G;

import B.AbstractC1033h;
import B.InterfaceC1035j;
import B.J;
import E.j;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class d extends E.b implements Map, KMappedMarker, InterfaceC1035j {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3775f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final d f3776g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f3776g;
        }

        public a() {
        }
    }

    static {
        j a10 = j.f2914c.a();
        Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f3776g = new d(a10, 0);
    }

    public d(j jVar, int i10) {
        super(jVar, i10);
    }

    @Override // E.b, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1033h) {
            return g((AbstractC1033h) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof J) {
            return h((J) obj);
        }
        return false;
    }

    public /* bridge */ boolean g(AbstractC1033h abstractC1033h) {
        return super.containsKey(abstractC1033h);
    }

    @Override // E.b, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC1033h) {
            return i((AbstractC1033h) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1033h) ? obj2 : j((AbstractC1033h) obj, (J) obj2);
    }

    public /* bridge */ boolean h(J j10) {
        return super.containsValue(j10);
    }

    public /* bridge */ J i(AbstractC1033h abstractC1033h) {
        return (J) super.get(abstractC1033h);
    }

    public /* bridge */ J j(AbstractC1033h abstractC1033h, J j10) {
        return (J) super.getOrDefault(abstractC1033h, j10);
    }
}
