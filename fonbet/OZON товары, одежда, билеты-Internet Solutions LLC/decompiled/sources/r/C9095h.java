package r;

import androidx.lifecycle.W;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9095h implements W<CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82318a;

    C9095h(C9091d c9091d) {
        this.f82318a = c9091d;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence2 != null) {
            C9091d c9091d = this.f82318a;
            c9091d.B(charSequence2);
            c9091d.f82304b.G0(null);
        }
    }
}
