package io.sentry.cache;

import io.sentry.protocol.C7187c;
import v3.o;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f67795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f67796c;

    public /* synthetic */ j(int i11, Object obj, Object obj2) {
        this.f67794a = i11;
        this.f67795b = obj;
        this.f67796c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67794a) {
            case 0:
                ((l) this.f67795b).K((C7187c) this.f67796c, "contexts.json");
                break;
            default:
                o.a.m((o.a) this.f67795b, (String) this.f67796c);
                break;
        }
    }
}
