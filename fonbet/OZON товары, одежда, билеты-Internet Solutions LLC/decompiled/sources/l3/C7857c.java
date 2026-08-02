package l3;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import m3.N;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7857c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f72638a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f72639b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f72640c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f72641d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f72642e;

    static {
        int i11 = N.f74289a;
        f72638a = Integer.toString(0, 36);
        f72639b = Integer.toString(1, 36);
        f72640c = Integer.toString(2, 36);
        f72641d = Integer.toString(3, 36);
        f72642e = Integer.toString(4, 36);
    }

    public static ArrayList<Bundle> a(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (C7860f c7860f : (C7860f[]) spanned.getSpans(0, spanned.length(), C7860f.class)) {
            arrayList.add(b(spanned, c7860f, 1, c7860f.b()));
        }
        for (C7861g c7861g : (C7861g[]) spanned.getSpans(0, spanned.length(), C7861g.class)) {
            arrayList.add(b(spanned, c7861g, 2, c7861g.b()));
        }
        for (C7858d c7858d : (C7858d[]) spanned.getSpans(0, spanned.length(), C7858d.class)) {
            arrayList.add(b(spanned, c7858d, 3, null));
        }
        for (C7862h c7862h : (C7862h[]) spanned.getSpans(0, spanned.length(), C7862h.class)) {
            arrayList.add(b(spanned, c7862h, 4, c7862h.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i11, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f72638a, spanned.getSpanStart(obj));
        bundle2.putInt(f72639b, spanned.getSpanEnd(obj));
        bundle2.putInt(f72640c, spanned.getSpanFlags(obj));
        bundle2.putInt(f72641d, i11);
        if (bundle != null) {
            bundle2.putBundle(f72642e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, SpannableString spannableString) {
        int i11 = bundle.getInt(f72638a);
        int i12 = bundle.getInt(f72639b);
        int i13 = bundle.getInt(f72640c);
        int i14 = bundle.getInt(f72641d, -1);
        Bundle bundle2 = bundle.getBundle(f72642e);
        if (i14 == 1) {
            bundle2.getClass();
            spannableString.setSpan(C7860f.a(bundle2), i11, i12, i13);
            return;
        }
        if (i14 == 2) {
            bundle2.getClass();
            spannableString.setSpan(C7861g.a(bundle2), i11, i12, i13);
        } else if (i14 == 3) {
            spannableString.setSpan(new C7858d(), i11, i12, i13);
        } else {
            if (i14 != 4) {
                return;
            }
            bundle2.getClass();
            spannableString.setSpan(C7862h.a(bundle2), i11, i12, i13);
        }
    }
}
