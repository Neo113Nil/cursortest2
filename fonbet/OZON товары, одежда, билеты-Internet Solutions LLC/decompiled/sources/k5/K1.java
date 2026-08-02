package k5;

import androidx.annotation.NonNull;
import java.util.UUID;

/* loaded from: classes8.dex */
final class K1 extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70598e;

    K1(@NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.AppKey);
        this.f70598e = abstractC7520h0;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70598e;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(InterfaceC7500c0.f70717a);
        if (p11 != null) {
            return p11;
        }
        String uuid = UUID.randomUUID().toString();
        a(uuid);
        return uuid;
    }
}
