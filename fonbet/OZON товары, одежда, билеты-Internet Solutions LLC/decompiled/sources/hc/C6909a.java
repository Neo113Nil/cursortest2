package hc;

import Hf.q;
import Ub.h;
import Ub.l;
import Ub.r;
import Ub.t;
import Ub.u;
import Vb.p;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import androidx.annotation.NonNull;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6909a extends Ub.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f65277a = 7;

    /* renamed from: hc.a$a, reason: collision with other inner class name */
    final class C1063a implements h.a<p> {
        C1063a() {
        }

        @Override // Ub.h.a
        public final void a(@NonNull p pVar) {
            C6909a c6909a = C6909a.this;
            c6909a.getClass();
            pVar.b(new b(c6909a.f65277a));
        }
    }

    /* renamed from: hc.a$b */
    private static class b implements p.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f65279a;

        b(int i11) {
            this.f65279a = i11;
        }

        @Override // Vb.p.a
        public final void a(@NonNull l lVar, @NonNull String str, int i11) {
            t a11 = lVar.t().e().a(q.class);
            if (a11 == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (Linkify.addLinks(spannableStringBuilder, this.f65279a)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
                    return;
                }
                r i12 = lVar.i();
                u d11 = lVar.d();
                for (URLSpan uRLSpan : uRLSpanArr) {
                    Vb.q.f28496e.e(i12, uRLSpan.getURL());
                    u.f(d11, a11.a(lVar.t(), i12), spannableStringBuilder.getSpanStart(uRLSpan) + i11, spannableStringBuilder.getSpanEnd(uRLSpan) + i11);
                }
            }
        }
    }

    C6909a() {
    }

    @NonNull
    public static C6909a b() {
        return new C6909a();
    }

    @Override // Ub.a, Ub.h
    public final void configure(@NonNull h.b bVar) {
        bVar.a(new C1063a());
    }
}
