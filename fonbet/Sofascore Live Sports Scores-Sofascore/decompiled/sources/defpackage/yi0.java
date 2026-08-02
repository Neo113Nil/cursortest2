package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yi0 implements ez7 {
    public final /* synthetic */ int a;
    public final Uri b;
    public final xvd c;

    public /* synthetic */ yi0(Uri uri, xvd xvdVar, int i) {
        this.a = i;
        this.b = uri;
        this.c = xvdVar;
    }

    @Override // defpackage.ez7
    public final Object a(rq3 rq3Var) {
        Integer intOrNull;
        Drawable drawable;
        int i = this.a;
        Uri uri = this.b;
        xvd xvdVar = this.c;
        boolean z = true;
        switch (i) {
            case 0:
                String f0 = CollectionsKt.f0(CollectionsKt.S(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new nwh(new iwh(new lof(f6a.I(xvdVar.a.getAssets().open(f0))), new au9(xvdVar.a, 1), new ui0()), l.b(MimeTypeMap.getSingleton(), f0), 3);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (StringsKt.R(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) CollectionsKt.j0(uri.getPathSegments());
                        if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                            a70.r(dmi.m(uri, "Invalid android.resource URI: "));
                            return null;
                        }
                        int intValue = intOrNull.intValue();
                        Context context = xvdVar.a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(intValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String b = l.b(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.S(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!Intrinsics.c(b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new nwh(new iwh(new lof(f6a.I(resources.openRawResource(intValue, typedValue2))), new au9(context, 1), new v1g(typedValue2.density)), b, 3);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = td4.d0(intValue, context);
                            if (drawable == null) {
                                hc5.f(ljg.j(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                pvd.r("No start tag found.");
                                return null;
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = z1g.a;
                            drawable = resources.getDrawable(intValue, theme);
                            if (drawable == null) {
                                hc5.f(ljg.j(intValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof gmk)) {
                            z = false;
                        }
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), fqj.r(drawable, xvdVar.b, xvdVar.c, xvdVar.d, xvdVar.e));
                        }
                        return new ya5(3, drawable, z);
                    }
                }
                a70.r(dmi.m(uri, "Invalid android.resource URI: "));
                return null;
        }
    }
}
