package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.drawee.R$styleable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import xsna.lhs;
import xsna.lpa0;
import xsna.meq0;
import xsna.mpa0;
import xsna.sex0;

@Deprecated
/* loaded from: classes.dex */
public class SimpleDraweeView extends GenericDraweeView {
    public static mpa0 j;
    public AbstractDraweeControllerBuilder i;

    public SimpleDraweeView(Context context) {
        super(context);
        d(context, null);
    }

    public final void d(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (lhs.d()) {
                lhs.a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                sex0.e(j, "SimpleDraweeView was not initialized!");
                this.i = j.get();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
                try {
                    if (obtainStyledAttributes.hasValue(1)) {
                        e(Uri.parse(obtainStyledAttributes.getString(1)), null);
                    } else if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
            if (lhs.d()) {
                lhs.b();
            }
        } catch (Throwable th2) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th2;
        }
    }

    public final void e(Uri uri, Object obj) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.i;
        abstractDraweeControllerBuilder.i(obj);
        lpa0 lpa0Var = (lpa0) abstractDraweeControllerBuilder;
        lpa0Var.r(uri);
        lpa0Var.n(getController());
        setController(lpa0Var.b());
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.i;
    }

    public void setActualImageResource(int i) {
        e(meq0.c(i), null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.i;
        abstractDraweeControllerBuilder.l(imageRequest);
        abstractDraweeControllerBuilder.o(getController());
        setController(abstractDraweeControllerBuilder.b());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        e(uri, null);
    }

    public void setImageURI(String str) {
        e(str != null ? Uri.parse(str) : null, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        d(context, attributeSet);
    }
}
