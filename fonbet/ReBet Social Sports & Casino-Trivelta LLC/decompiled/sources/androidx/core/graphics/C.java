package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.h;
import com.facebook.react.common.assets.ReactFontManager;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import v0.i;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f19055a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // androidx.core.graphics.C.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(i.b bVar) {
            return bVar.g();
        }

        @Override // androidx.core.graphics.C.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(i.b bVar) {
            return bVar.h();
        }
    }

    public interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    public static Object f(Object[] objArr, int i10, b bVar) {
        return g(objArr, (i10 & 1) == 0 ? 400 : ReactFontManager.TypefaceStyle.BOLD, (i10 & 2) != 0, bVar);
    }

    public static Object g(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.b(obj2) - i10) * 2) + (bVar.a(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > abs) {
                obj = obj2;
                i11 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, h.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, i.b[] bVarArr, int i10);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e10 = D.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (D.d(e10, inputStream)) {
                return Typeface.createFromFile(e10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = D.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (D.c(e10, resources, i10)) {
                return Typeface.createFromFile(e10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public i.b h(i.b[] bVarArr, int i10) {
        return (i.b) f(bVarArr, i10, new a());
    }
}
