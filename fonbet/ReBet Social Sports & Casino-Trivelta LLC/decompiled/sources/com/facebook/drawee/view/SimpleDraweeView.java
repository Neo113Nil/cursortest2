package com.facebook.drawee.view;

import D6.k;
import D6.n;
import S6.a;
import W6.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import c7.AbstractC2894d;
import com.facebook.common.util.f;

@Deprecated
/* loaded from: classes2.dex */
public class SimpleDraweeView extends AbstractC2894d {

    /* renamed from: b, reason: collision with root package name */
    public static n f30539b;

    /* renamed from: a, reason: collision with root package name */
    public b f30540a;

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public static void d(n nVar) {
        f30539b = nVar;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (N7.b.d()) {
                N7.b.a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                k.h(f30539b, "SimpleDraweeView was not initialized!");
                this.f30540a = (b) f30539b.get();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.SimpleDraweeView);
                try {
                    if (obtainStyledAttributes.hasValue(a.f10601E)) {
                        f(Uri.parse(obtainStyledAttributes.getString(a.f10601E)), null);
                    } else if (obtainStyledAttributes.hasValue(a.f10600D) && (resourceId = obtainStyledAttributes.getResourceId(a.f10600D, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    obtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            if (N7.b.d()) {
                N7.b.b();
            }
        } catch (Throwable th3) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th3;
        }
    }

    public void e(int i10, Object obj) {
        f(f.h(i10), obj);
    }

    public void f(Uri uri, Object obj) {
        setController(this.f30540a.B(obj).b(uri).a(getController()).build());
    }

    public void g(String str, Object obj) {
        f(str != null ? Uri.parse(str) : null, obj);
    }

    public b getControllerBuilder() {
        return this.f30540a;
    }

    public void setActualImageResource(int i10) {
        e(i10, null);
    }

    public void setImageRequest(com.facebook.imagepipeline.request.b bVar) {
        setController(this.f30540a.E(bVar).a(getController()).build());
    }

    @Override // c7.AbstractC2893c, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
    }

    @Override // c7.AbstractC2893c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        f(uri, null);
    }

    public void setImageURI(String str) {
        g(str, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet);
    }
}
