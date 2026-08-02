package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public int f19249a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f19250b;

    /* renamed from: c, reason: collision with root package name */
    public int f19251c;

    /* renamed from: d, reason: collision with root package name */
    public IntRange f19252d;

    /* renamed from: e, reason: collision with root package name */
    public int f19253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f19254f;

    public b(c cVar) {
        this.f19254f = cVar;
        int length = cVar.f19257a.length();
        if (length < 0) {
            throw new IllegalArgumentException(d9.e.f(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f19250b = length;
        this.f19251c = length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i5 = this.f19251c;
        if (i5 < 0) {
            this.f19249a = 0;
            this.f19252d = null;
            return;
        }
        c cVar = this.f19254f;
        int i10 = cVar.f19258b;
        if (i10 > 0) {
            int i11 = this.f19253e + 1;
            this.f19253e = i11;
        }
        if (i5 <= cVar.f19257a.length()) {
            Pair pair = (Pair) cVar.f19259c.invoke(cVar.f19257a, Integer.valueOf(this.f19251c));
            if (pair == null) {
                this.f19252d = new IntRange(this.f19250b, StringsKt__StringsKt.q(cVar.f19257a), 1);
                this.f19251c = -1;
            } else {
                int intValue = ((Number) pair.f19192a).intValue();
                int intValue2 = ((Number) pair.f19193b).intValue();
                this.f19252d = zf.j.d(this.f19250b, intValue);
                int i12 = intValue + intValue2;
                this.f19250b = i12;
                this.f19251c = i12 + (intValue2 == 0 ? 1 : 0);
            }
            this.f19249a = 1;
        }
        this.f19252d = new IntRange(this.f19250b, StringsKt__StringsKt.q(cVar.f19257a), 1);
        this.f19251c = -1;
        this.f19249a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19249a == -1) {
            a();
        }
        return this.f19249a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f19249a == -1) {
            a();
        }
        if (this.f19249a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f19252d;
        Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f19252d = null;
        this.f19249a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
