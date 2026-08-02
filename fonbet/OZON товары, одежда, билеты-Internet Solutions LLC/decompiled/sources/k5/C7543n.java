package k5;

import Ve.Sp;
import android.content.Context;
import androidx.annotation.NonNull;
import k5.InterfaceC7518g2;

/* renamed from: k5.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7543n extends D0<String> implements InterfaceC7518g2<String>, v3 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70787e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70788f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final Sp f70789g;

    C7543n(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, @NonNull Sp sp) {
        super(Mm0.e.ApplicationMD5);
        this.f70787e = context;
        this.f70788f = abstractC7520h0;
        this.f70789g = sp;
    }

    @Override // k5.v3
    @NonNull
    public final Pm0.a<?> c() {
        return this.f70789g;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70788f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String str = (String) p(InterfaceC7500c0.f70717a);
        if (str != null) {
            return str;
        }
        e();
        throw new P1("cachedValue == null");
    }

    @Override // k5.InterfaceC7518g2
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new C7539m(this);
    }
}
