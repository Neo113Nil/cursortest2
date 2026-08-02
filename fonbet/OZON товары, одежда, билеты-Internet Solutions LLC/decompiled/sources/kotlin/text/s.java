package kotlin.text;

import kotlin.collections.AbstractC7713u;

/* loaded from: classes10.dex */
public final class s extends AbstractC7713u {

    /* renamed from: a, reason: collision with root package name */
    private int f71975a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CharSequence f71976b;

    s(CharSequence charSequence) {
        this.f71976b = charSequence;
    }

    @Override // kotlin.collections.AbstractC7713u
    public final char b() {
        int i11 = this.f71975a;
        this.f71975a = i11 + 1;
        return this.f71976b.charAt(i11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71975a < this.f71976b.length();
    }
}
