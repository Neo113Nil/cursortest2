package k5;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class a3 extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: g, reason: collision with root package name */
    private static final long f70704g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final G1 f70705e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70706f;

    a3(@NonNull G1 g12, @NonNull AbstractC7520h0 abstractC7520h0) {
        super(Mm0.e.VpnApps);
        this.f70705e = g12;
        this.f70706f = abstractC7520h0;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70706f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(f70704g);
        if (p11 != null) {
            return p11;
        }
        HashSet a11 = this.f70705e.a();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        String sb3 = sb2.toString();
        a(sb3);
        return sb3;
    }
}
