package s;

import com.sports.insider.data.repository.room.live.LiveTable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f22539a;

    /* renamed from: b, reason: collision with root package name */
    public int f22540b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22543e;

    public a(int i5) {
        this.f22539a = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22540b < this.f22539a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f22540b;
        switch (this.f22542d) {
            case 0:
                g10 = ((e) this.f22543e).g(i5);
                break;
            case 1:
                g10 = ((e) this.f22543e).j(i5);
                break;
            default:
                g10 = ((f) this.f22543e).f22554b[i5];
                break;
        }
        this.f22540b++;
        this.f22541c = true;
        return g10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22541c) {
            Intrinsics.checkNotNullParameter("Call next() before removing an element.", LiveTable.messageColumn);
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i5 = this.f22540b - 1;
        this.f22540b = i5;
        switch (this.f22542d) {
            case 0:
                ((e) this.f22543e).h(i5);
                break;
            case 1:
                ((e) this.f22543e).h(i5);
                break;
            default:
                ((f) this.f22543e).a(i5);
                break;
        }
        this.f22539a--;
        this.f22541c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f22555c);
        this.f22542d = 2;
        this.f22543e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i5) {
        this(eVar.f22575c);
        this.f22542d = i5;
        switch (i5) {
            case 1:
                this.f22543e = eVar;
                this(eVar.f22575c);
                break;
            default:
                this.f22543e = eVar;
                break;
        }
    }
}
