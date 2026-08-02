package k5;

import androidx.annotation.NonNull;

/* renamed from: k5.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7513f1 extends D0<Integer> implements InterfaceC7500c0<Integer> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70737e;

    C7513f1(@NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.OSFontsHash);
        this.f70737e = abstractC7520h0;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70737e;
    }

    @Override // k5.D0
    @NonNull
    protected final Integer s() throws D1 {
        Integer p11 = p(InterfaceC7500c0.f70717a);
        if (p11 != null) {
            return p11;
        }
        throw new C7571u0("cachedValue == null");
    }
}
