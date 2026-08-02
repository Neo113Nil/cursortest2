package io.sentry;

import io.sentry.util.l;

/* loaded from: classes.dex */
public final /* synthetic */ class V2 implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66756b;

    public /* synthetic */ V2(Object obj, int i11) {
        this.f66755a = i11;
        this.f66756b = obj;
    }

    @Override // io.sentry.util.l.a
    public final Object g() {
        InterfaceC7126b0 lambda$new$1;
        switch (this.f66755a) {
            case 0:
                lambda$new$1 = ((W2) this.f66756b).lambda$new$1();
                return lambda$new$1;
            default:
                return io.sentry.cache.l.y((io.sentry.cache.l) this.f66756b);
        }
    }
}
