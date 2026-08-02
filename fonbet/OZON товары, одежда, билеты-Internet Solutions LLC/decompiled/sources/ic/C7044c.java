package ic;

import Hf.u;
import Ub.d;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ic.AbstractC7042a;
import java.util.HashMap;
import lc.C7917b;

/* renamed from: ic.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7044c extends AbstractC7042a.b<u, a> {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f66227a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f66228b;

    /* renamed from: ic.c$a */
    public static class a extends AbstractC7042a.c {

        /* renamed from: a, reason: collision with root package name */
        final TextView f66229a;

        protected a(@NonNull View view) {
            super(view);
            if (!(view instanceof TextView)) {
                throw new IllegalStateException("TextView is not root of layout (specify TextView ID explicitly): " + view);
            }
            TextView textView = (TextView) view;
            this.f66229a = textView;
            textView.setSpannableFactory(C7917b.a());
        }
    }

    public C7044c(int i11) {
        this.f66228b = i11;
    }

    @Override // ic.AbstractC7042a.b
    public final void a(@NonNull d dVar, @NonNull a aVar, @NonNull u uVar) {
        a aVar2 = aVar;
        HashMap hashMap = this.f66227a;
        Spanned spanned = (Spanned) hashMap.get(uVar);
        if (spanned == null) {
            spanned = dVar.d(uVar);
            hashMap.put(uVar, spanned);
        }
        dVar.e(aVar2.f66229a, spanned);
    }

    @Override // ic.AbstractC7042a.b
    public final void b() {
        this.f66227a.clear();
    }

    @Override // ic.AbstractC7042a.b
    @NonNull
    public final a c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        return new a(layoutInflater.inflate(this.f66228b, viewGroup, false));
    }
}
