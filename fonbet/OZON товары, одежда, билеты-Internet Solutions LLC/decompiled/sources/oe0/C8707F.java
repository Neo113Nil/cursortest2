package oe0;

import Sc.r;
import android.location.Location;
import java.util.function.Consumer;
import xe.C10737n;

/* renamed from: oe0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8707F<T> implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f78125a;

    C8707F(C10737n c10737n) {
        this.f78125a = c10737n;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        r.Companion companion = Sc.r.INSTANCE;
        this.f78125a.resumeWith((Location) obj);
    }
}
