package xa;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public float f68075c;

    /* renamed from: d, reason: collision with root package name */
    public float f68076d;

    /* renamed from: g, reason: collision with root package name */
    public Ca.e f68079g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f68073a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final Ca.g f68074b = new a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f68077e = true;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f68078f = new WeakReference(null);

    public class a extends Ca.g {
        public a() {
        }

        @Override // Ca.g
        public void a(int i10) {
            i.this.f68077e = true;
            b bVar = (b) i.this.f68078f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // Ca.g
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            i.this.f68077e = true;
            b bVar = (b) i.this.f68078f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        j(bVar);
    }

    public final float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f68073a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f68073a.measureText(charSequence, 0, charSequence.length());
    }

    public Ca.e e() {
        return this.f68079g;
    }

    public float f(String str) {
        if (!this.f68077e) {
            return this.f68076d;
        }
        i(str);
        return this.f68076d;
    }

    public TextPaint g() {
        return this.f68073a;
    }

    public float h(String str) {
        if (!this.f68077e) {
            return this.f68075c;
        }
        i(str);
        return this.f68075c;
    }

    public final void i(String str) {
        this.f68075c = d(str);
        this.f68076d = c(str);
        this.f68077e = false;
    }

    public void j(b bVar) {
        this.f68078f = new WeakReference(bVar);
    }

    public void k(Ca.e eVar, Context context) {
        if (this.f68079g != eVar) {
            this.f68079g = eVar;
            if (eVar != null) {
                eVar.q(context, this.f68073a, this.f68074b);
                b bVar = (b) this.f68078f.get();
                if (bVar != null) {
                    this.f68073a.drawableState = bVar.getState();
                }
                eVar.p(context, this.f68073a, this.f68074b);
                this.f68077e = true;
            }
            b bVar2 = (b) this.f68078f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f68077e = z10;
    }

    public void m(boolean z10) {
        this.f68077e = z10;
    }

    public void n(Context context) {
        this.f68079g.p(context, this.f68073a, this.f68074b);
    }
}
