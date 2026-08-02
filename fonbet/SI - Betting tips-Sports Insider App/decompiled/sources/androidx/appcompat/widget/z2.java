package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1036a;

    public /* synthetic */ z2(int i5) {
        this.f1036a = i5;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f1036a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) z2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        l.a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e7) {
                        io.sentry.android.core.w0.e("DrawableDelegate", "Exception while inflating <drawable>", e7);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e9) {
                    io.sentry.android.core.w0.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e9);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    androidx.vectordrawable.graphics.drawable.h hVar = new androidx.vectordrawable.graphics.drawable.h(context, 0);
                    hVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e10) {
                    io.sentry.android.core.w0.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    androidx.vectordrawable.graphics.drawable.t tVar = new androidx.vectordrawable.graphics.drawable.t();
                    tVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e11) {
                    io.sentry.android.core.w0.e("VdcInflateDelegate", "Exception while inflating <vector>", e11);
                    return null;
                }
        }
        return null;
    }
}
