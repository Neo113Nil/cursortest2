package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19273a;

    /* renamed from: b, reason: collision with root package name */
    public int f19274b;

    /* renamed from: c, reason: collision with root package name */
    public int f19275c;

    /* renamed from: d, reason: collision with root package name */
    public int f19276d;

    /* renamed from: e, reason: collision with root package name */
    public int f19277e;

    public k(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f19273a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        int i10;
        int i11 = this.f19274b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f19277e < 0) {
            this.f19274b = 2;
            return false;
        }
        CharSequence charSequence = this.f19273a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f19275c; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i5 = (charAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f19274b = 1;
                this.f19277e = i5;
                this.f19276d = length;
                return true;
            }
        }
        i5 = -1;
        this.f19274b = 1;
        this.f19277e = i5;
        this.f19276d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19274b = 0;
        int i5 = this.f19276d;
        int i10 = this.f19275c;
        this.f19275c = this.f19277e + i5;
        return this.f19273a.subSequence(i10, i5).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
