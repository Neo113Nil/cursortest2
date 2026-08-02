package g6;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g6.J, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4338J extends AbstractList {

    /* renamed from: g, reason: collision with root package name */
    public static final b f46956g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicInteger f46957h = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public Handler f46958a;

    /* renamed from: b, reason: collision with root package name */
    public int f46959b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46960c;

    /* renamed from: d, reason: collision with root package name */
    public List f46961d;

    /* renamed from: e, reason: collision with root package name */
    public List f46962e;

    /* renamed from: f, reason: collision with root package name */
    public String f46963f;

    /* renamed from: g6.J$a */
    public interface a {
        void a(C4338J c4338j);
    }

    /* renamed from: g6.J$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public C4338J() {
        this.f46960c = String.valueOf(Integer.valueOf(f46957h.incrementAndGet()));
        this.f46962e = new ArrayList();
        this.f46961d = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f46961d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f46961d.add(element);
    }

    public final void c(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f46962e.contains(callback)) {
            return;
        }
        this.f46962e.add(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f46961d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return e((GraphRequest) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    public final List f() {
        return g();
    }

    public final List g() {
        return GraphRequest.f30314n.i(this);
    }

    public final AsyncTaskC4337I h() {
        return i();
    }

    public final AsyncTaskC4337I i() {
        return GraphRequest.f30314n.l(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return r((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i10) {
        return (GraphRequest) this.f46961d.get(i10);
    }

    public final String k() {
        return this.f46963f;
    }

    public final Handler l() {
        return this.f46958a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return s((GraphRequest) obj);
        }
        return -1;
    }

    public final List m() {
        return this.f46962e;
    }

    public final String n() {
        return this.f46960c;
    }

    public final List o() {
        return this.f46961d;
    }

    public int p() {
        return this.f46961d.size();
    }

    public final int q() {
        return this.f46959b;
    }

    public /* bridge */ int r(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    public /* bridge */ int s(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return p();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i10) {
        return v(i10);
    }

    public /* bridge */ boolean u(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    public GraphRequest v(int i10) {
        return (GraphRequest) this.f46961d.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i10, GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (GraphRequest) this.f46961d.set(i10, element);
    }

    public final void x(Handler handler) {
        this.f46958a = handler;
    }

    public final void y(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.");
        }
        this.f46959b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return u((GraphRequest) obj);
        }
        return false;
    }

    public C4338J(Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f46960c = String.valueOf(Integer.valueOf(f46957h.incrementAndGet()));
        this.f46962e = new ArrayList();
        this.f46961d = new ArrayList(requests);
    }

    public C4338J(GraphRequest... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f46960c = String.valueOf(Integer.valueOf(f46957h.incrementAndGet()));
        this.f46962e = new ArrayList();
        this.f46961d = new ArrayList(ArraysKt.asList(requests));
    }
}
