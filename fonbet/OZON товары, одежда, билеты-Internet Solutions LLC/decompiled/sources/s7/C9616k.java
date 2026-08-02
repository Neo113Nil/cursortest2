package s7;

import a10.AbstractC4920h;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* renamed from: s7.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9616k {

    /* renamed from: c, reason: collision with root package name */
    private float f98335c;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<b> f98337e;

    /* renamed from: f, reason: collision with root package name */
    private v7.d f98338f;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f98333a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4920h f98334b = new a();

    /* renamed from: d, reason: collision with root package name */
    private boolean f98336d = true;

    /* renamed from: s7.k$a */
    final class a extends AbstractC4920h {
        a() {
        }

        @Override // a10.AbstractC4920h
        public final void a(int i11) {
            C9616k c9616k = C9616k.this;
            c9616k.f98336d = true;
            b bVar = (b) c9616k.f98337e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // a10.AbstractC4920h
        public final void b(@NonNull Typeface typeface, boolean z11) {
            if (z11) {
                return;
            }
            C9616k c9616k = C9616k.this;
            c9616k.f98336d = true;
            b bVar = (b) c9616k.f98337e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* renamed from: s7.k$b */
    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C9616k(b bVar) {
        this.f98337e = new WeakReference<>(null);
        this.f98337e = new WeakReference<>(bVar);
    }

    public final v7.d c() {
        return this.f98338f;
    }

    @NonNull
    public final TextPaint d() {
        return this.f98333a;
    }

    public final float e(String str) {
        if (!this.f98336d) {
            return this.f98335c;
        }
        float measureText = str == null ? 0.0f : this.f98333a.measureText((CharSequence) str, 0, str.length());
        this.f98335c = measureText;
        this.f98336d = false;
        return measureText;
    }

    public final void f(v7.d dVar, Context context) {
        if (this.f98338f != dVar) {
            this.f98338f = dVar;
            TextPaint textPaint = this.f98333a;
            AbstractC4920h abstractC4920h = this.f98334b;
            dVar.l(context, textPaint, abstractC4920h);
            b bVar = this.f98337e.get();
            if (bVar != null) {
                textPaint.drawableState = bVar.getState();
            }
            dVar.k(context, textPaint, abstractC4920h);
            this.f98336d = true;
            b bVar2 = this.f98337e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final void g() {
        this.f98336d = true;
    }

    public final void h(Context context) {
        this.f98338f.k(context, this.f98333a, this.f98334b);
    }
}
