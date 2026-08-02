package z5;

import Q4.s;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;
import u5.C6523d;
import u5.o;
import v5.g;
import y5.C6854a;
import y5.d;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6930a {

    /* renamed from: z5.a$a, reason: collision with other inner class name */
    public static final class C0981a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            Integer valueOf = Integer.valueOf(((WindowManager.LayoutParams) layoutParams).type);
            ViewGroup.LayoutParams layoutParams2 = ((View) obj2).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            return ComparisonsKt.compareValues(valueOf, Integer.valueOf(((WindowManager.LayoutParams) layoutParams2).type));
        }
    }

    public static final String a(int i10) {
        return "0x" + HexExtensionsKt.toHexString$default(i10, (HexFormat) null, 1, (Object) null);
    }

    public static final String b(View view) {
        String hexString;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Integer d10 = d(view);
        return (d10 == null || (hexString = Integer.toHexString(d10.intValue())) == null) ? "" : hexString;
    }

    public static final boolean c(int i10) {
        return i10 >= 2130706432;
    }

    public static final Integer d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Drawable background = view.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    public static final int e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Integer valueOf = Integer.valueOf(view.getId());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        Object tag = view.getTag(s.f9355a);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        int generateViewId = View.generateViewId();
        view.setTag(s.f9355a, Integer.valueOf(generateViewId));
        return generateViewId;
    }

    public static final Window f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        o oVar = o.f66174a;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return oVar.f(rootView);
    }

    public static final String g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int id2 = view.getId();
        if (!c(id2)) {
            return a(e(view));
        }
        try {
            return view.getResources().getResourceName(id2);
        } catch (Exception unused) {
            return a(id2);
        }
    }

    public static final List h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.sortedWith(list, new C0981a());
    }

    public static final d i(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return g.f67034a.h(view, C6523d.f66138a.i());
    }

    public static final C6854a j(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLocationOnScreen(new int[2]);
        return new C6854a(r0[0], r0[1]);
    }
}
