package D3;

import E3.c;
import E3.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.AbstractC2932b;
import com.airbnb.lottie.utils.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f2527d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC2932b f2528e;

    /* renamed from: a, reason: collision with root package name */
    public final i f2524a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final Map f2525b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f2526c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public String f2529f = ".ttf";

    public a(Drawable.Callback callback, AbstractC2932b abstractC2932b) {
        this.f2528e = abstractC2932b;
        if (callback instanceof View) {
            this.f2527d = ((View) callback).getContext().getAssets();
        } else {
            g.c("LottieDrawable must be inside of a view for images to work.");
            this.f2527d = null;
        }
    }

    public final Typeface a(c cVar) {
        Typeface typeface;
        String a10 = cVar.a();
        Typeface typeface2 = (Typeface) this.f2526c.get(a10);
        if (typeface2 != null) {
            return typeface2;
        }
        String c10 = cVar.c();
        String b10 = cVar.b();
        AbstractC2932b abstractC2932b = this.f2528e;
        if (abstractC2932b != null) {
            typeface = abstractC2932b.b(a10, c10, b10);
            if (typeface == null) {
                typeface = this.f2528e.a(a10);
            }
        } else {
            typeface = null;
        }
        AbstractC2932b abstractC2932b2 = this.f2528e;
        if (abstractC2932b2 != null && typeface == null) {
            String d10 = abstractC2932b2.d(a10, c10, b10);
            if (d10 == null) {
                d10 = this.f2528e.c(a10);
            }
            if (d10 != null) {
                typeface = Typeface.createFromAsset(this.f2527d, d10);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f2527d, "fonts/" + a10 + this.f2529f);
        }
        this.f2526c.put(a10, typeface);
        return typeface;
    }

    public Typeface b(c cVar) {
        this.f2524a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f2525b.get(this.f2524a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e10 = e(a(cVar), cVar.c());
        this.f2525b.put(this.f2524a, e10);
        return e10;
    }

    public void c(String str) {
        this.f2529f = str;
    }

    public void d(AbstractC2932b abstractC2932b) {
        this.f2528e = abstractC2932b;
    }

    public final Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
