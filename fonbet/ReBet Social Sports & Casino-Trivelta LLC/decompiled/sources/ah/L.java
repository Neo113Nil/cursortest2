package ah;

import ch.AbstractC2923C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes3.dex */
public final class L {

    /* renamed from: c, reason: collision with root package name */
    public static final a f15964c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final L f15965d;

    /* renamed from: e, reason: collision with root package name */
    public static final L f15966e;

    /* renamed from: f, reason: collision with root package name */
    public static final L f15967f;

    /* renamed from: g, reason: collision with root package name */
    public static final L f15968g;

    /* renamed from: h, reason: collision with root package name */
    public static final L f15969h;

    /* renamed from: i, reason: collision with root package name */
    public static final Map f15970i;

    /* renamed from: a, reason: collision with root package name */
    public final String f15971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15972b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String c10 = AbstractC2923C.c(name);
            L l10 = (L) L.f15964c.b().get(c10);
            return l10 == null ? new L(c10, 0) : l10;
        }

        public final Map b() {
            return L.f15970i;
        }

        public final L c() {
            return L.f15965d;
        }

        public a() {
        }
    }

    static {
        L l10 = new L("http", 80);
        f15965d = l10;
        L l11 = new L("https", 443);
        f15966e = l11;
        L l12 = new L("ws", 80);
        f15967f = l12;
        L l13 = new L("wss", 443);
        f15968g = l13;
        L l14 = new L("socks", 1080);
        f15969h = l14;
        List listOf = CollectionsKt.listOf((Object[]) new L[]{l10, l11, l12, l13, l14});
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listOf, 10)), 16));
        for (Object obj : listOf) {
            linkedHashMap.put(((L) obj).f15971a, obj);
        }
        f15970i = linkedHashMap;
    }

    public L(String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15971a = name;
        this.f15972b = i10;
        for (int i11 = 0; i11 < name.length(); i11++) {
            if (!ch.k.a(name.charAt(i11))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final int c() {
        return this.f15972b;
    }

    public final String d() {
        return this.f15971a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return Intrinsics.areEqual(this.f15971a, l10.f15971a) && this.f15972b == l10.f15972b;
    }

    public int hashCode() {
        return (this.f15971a.hashCode() * 31) + Integer.hashCode(this.f15972b);
    }

    public String toString() {
        return "URLProtocol(name=" + this.f15971a + ", defaultPort=" + this.f15972b + ')';
    }
}
