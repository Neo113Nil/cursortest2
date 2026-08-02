package v2;

import android.graphics.Typeface;
import androidx.core.graphics.g;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC10186a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g.a f101676a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Typeface f101677b;

    RunnableC10186a(g.a aVar, Typeface typeface) {
        this.f101676a = aVar;
        this.f101677b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f101676a.b(this.f101677b);
    }
}
