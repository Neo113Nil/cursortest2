package p5;

import K1.G;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import j.C7232a;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n5.EnumC8444d;
import n5.q;
import n5.r;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;
import p5.h;
import sf.z;
import v5.C10239m;

/* loaded from: classes8.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f80245a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80246b;

    public static final class a implements h.a<Uri> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            Uri uri = (Uri) obj;
            if (Intrinsics.d(uri.getScheme(), "android.resource")) {
                return new l(uri, c10239m);
            }
            return null;
        }
    }

    public l(@NotNull Uri uri, @NotNull C10239m c10239m) {
        this.f80245a = uri;
        this.f80246b = c10239m;
    }

    @Override // p5.h
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        Integer w02;
        Drawable d11;
        Uri uri = this.f80245a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (kotlin.text.h.K(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) C7714v.Z(uri.getPathSegments());
                if (str == null || (w02 = kotlin.text.h.w0(str)) == null) {
                    throw new IllegalStateException(G.b(uri, "Invalid android.resource URI: "));
                }
                int intValue = w02.intValue();
                C10239m c10239m = this.f80246b;
                Context f7 = c10239m.f();
                Resources resources = authority.equals(f7.getPackageName()) ? f7.getResources() : f7.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                boolean z11 = true;
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String c11 = A5.k.c(MimeTypeMap.getSingleton(), charSequence.subSequence(kotlin.text.h.N('/', 0, 6, charSequence), charSequence.length()).toString());
                if (!Intrinsics.d(c11, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(q.b(z.d(z.k(resources.openRawResource(intValue, typedValue2))), f7, new r(typedValue2.density)), c11, EnumC8444d.DISK);
                }
                if (authority.equals(f7.getPackageName())) {
                    d11 = C7232a.a(f7, intValue);
                    if (d11 == null) {
                        throw new IllegalStateException(Ej.b.a(intValue, "Invalid resource ID: ").toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(intValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    d11 = androidx.core.content.res.g.d(resources, intValue, f7.getTheme());
                    if (d11 == null) {
                        throw new IllegalStateException(Ej.b.a(intValue, "Invalid resource ID: ").toString());
                    }
                }
                if (!(d11 instanceof VectorDrawable) && !(d11 instanceof androidx.vectordrawable.graphics.drawable.e)) {
                    z11 = false;
                }
                if (z11) {
                    d11 = new BitmapDrawable(f7.getResources(), A5.m.a(d11, c10239m.e(), c10239m.n(), c10239m.m(), c10239m.b()));
                }
                return new f(d11, z11, EnumC8444d.DISK);
            }
        }
        throw new IllegalStateException(G.b(uri, "Invalid android.resource URI: "));
    }
}
