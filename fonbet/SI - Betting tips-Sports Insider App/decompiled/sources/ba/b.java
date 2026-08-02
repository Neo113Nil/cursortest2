package ba;

import androidx.recyclerview.widget.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    public int f3120e;

    public b(d dVar) {
        super(dVar);
        this.f3120e = 0;
    }

    @Override // ba.c
    public final CharSequence c(CharSequence charSequence) {
        int i5 = this.f3120e;
        if (i5 == 0) {
            return charSequence;
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() + (i5 * 2));
        for (int i10 = 0; i10 < this.f3120e; i10++) {
            sb2.append("  ");
        }
        sb2.append(charSequence);
        return sb2;
    }

    @Override // ba.c
    public final void i(j jVar) {
        this.f3120e--;
        super.i(jVar);
    }

    @Override // ba.c
    public final void k(j jVar) {
        super.k(jVar);
        this.f3120e++;
    }
}
