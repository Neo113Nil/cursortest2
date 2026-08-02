package we0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f104462b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f104463c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f104464d;

    public static final class a extends ArrayList<u> {
        public a() {
            throw null;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof u) {
                return super.contains((u) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || super.size() != super.size()) {
                return false;
            }
            ArrayList b12 = C7714v.b1(this, (Iterable) obj);
            if (b12.isEmpty()) {
                return true;
            }
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (!Intrinsics.d(((u) pair.a()).e(), ((u) pair.b()).e())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            Iterator<u> it = iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            int i11 = 1;
            while (it.hasNext()) {
                u next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                i11 = (i11 * 31) + next.e().hashCode();
            }
            return i11;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof u) {
                return super.indexOf((u) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof u) {
                return super.lastIndexOf((u) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof u) {
                return super.remove((u) obj);
            }
            return false;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f104465b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<m, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f104466b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m mVar) {
            m it = mVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f104467b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    public s(@NotNull String id2, @NotNull m coordinates, @NotNull a includePoints, @NotNull t displayOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(includePoints, "includePoints");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        this.f104461a = id2;
        this.f104462b = coordinates;
        this.f104463c = includePoints;
        this.f104464d = displayOptions;
    }

    public static s a(s sVar, t displayOptions) {
        a includePoints = sVar.f104463c;
        String id2 = sVar.f104461a;
        Intrinsics.checkNotNullParameter(id2, "id");
        m coordinates = sVar.f104462b;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(includePoints, "includePoints");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        return new s(id2, coordinates, includePoints, displayOptions);
    }

    @NotNull
    public final m b() {
        return this.f104462b;
    }

    @NotNull
    public final t c() {
        return this.f104464d;
    }

    @NotNull
    public final String d() {
        return this.f104461a;
    }

    @NotNull
    public final u e() {
        t tVar = this.f104464d;
        tVar.getClass();
        u uVar = new u(this.f104462b, new z(tVar.b(), tVar.c(), false, tVar.d(), 1.0f, 0.0f, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN), null, this.f104461a, null, b.f104465b, c.f104466b, d.f104467b, true);
        uVar.m(null);
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return Intrinsics.d(this.f104461a, ((s) obj).f104461a);
    }

    public final int hashCode() {
        return this.f104461a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "MapCluster(id=" + this.f104461a + ", coordinates=" + this.f104462b + ", includePoints=" + this.f104463c + ", displayOptions=" + this.f104464d + ")";
    }
}
