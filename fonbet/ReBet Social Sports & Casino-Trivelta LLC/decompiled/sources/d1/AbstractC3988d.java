package d1;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import e1.AbstractC4134a;
import e1.Z;
import java.util.ArrayList;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3988d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f44899a = Z.K0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final String f44900b = Z.K0(1);

    /* renamed from: c, reason: collision with root package name */
    public static final String f44901c = Z.K0(2);

    /* renamed from: d, reason: collision with root package name */
    public static final String f44902d = Z.K0(3);

    /* renamed from: e, reason: collision with root package name */
    public static final String f44903e = Z.K0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C3991g c3991g : (C3991g[]) spanned.getSpans(0, spanned.length(), C3991g.class)) {
            arrayList.add(b(spanned, c3991g, 1, c3991g.b()));
        }
        for (C3993i c3993i : (C3993i[]) spanned.getSpans(0, spanned.length(), C3993i.class)) {
            arrayList.add(b(spanned, c3993i, 2, c3993i.b()));
        }
        for (C3989e c3989e : (C3989e[]) spanned.getSpans(0, spanned.length(), C3989e.class)) {
            arrayList.add(b(spanned, c3989e, 3, null));
        }
        for (C3994j c3994j : (C3994j[]) spanned.getSpans(0, spanned.length(), C3994j.class)) {
            arrayList.add(b(spanned, c3994j, 4, c3994j.b()));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f44899a, spanned.getSpanStart(obj));
        bundle2.putInt(f44900b, spanned.getSpanEnd(obj));
        bundle2.putInt(f44901c, spanned.getSpanFlags(obj));
        bundle2.putInt(f44902d, i10);
        if (bundle != null) {
            bundle2.putBundle(f44903e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f44899a);
        int i11 = bundle.getInt(f44900b);
        int i12 = bundle.getInt(f44901c);
        int i13 = bundle.getInt(f44902d, -1);
        Bundle bundle2 = bundle.getBundle(f44903e);
        if (i13 == 1) {
            spannable.setSpan(C3991g.a((Bundle) AbstractC4134a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(C3993i.a((Bundle) AbstractC4134a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new C3989e(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(C3994j.a((Bundle) AbstractC4134a.e(bundle2)), i10, i11, i12);
        }
    }
}
