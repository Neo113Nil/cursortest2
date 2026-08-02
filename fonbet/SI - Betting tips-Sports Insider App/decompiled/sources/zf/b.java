package zf;

import java.util.NoSuchElementException;
import kotlin.collections.i0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25971b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25972c;

    /* renamed from: d, reason: collision with root package name */
    public int f25973d;

    public b(int i5, int i10, int i11) {
        this.f25970a = i11;
        this.f25971b = i10;
        boolean z5 = false;
        if (i11 <= 0 ? i5 >= i10 : i5 <= i10) {
            z5 = true;
        }
        this.f25972c = z5;
        this.f25973d = z5 ? i5 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25972c;
    }

    @Override // kotlin.collections.i0
    public final int nextInt() {
        int i5 = this.f25973d;
        if (i5 != this.f25971b) {
            this.f25973d = this.f25970a + i5;
            return i5;
        }
        if (!this.f25972c) {
            throw new NoSuchElementException();
        }
        this.f25972c = false;
        return i5;
    }
}
