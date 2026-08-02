package c7;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2894d extends AbstractC2893c {
    public AbstractC2894d(Context context, Z6.a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        if (N7.b.d()) {
            N7.b.a("GenericDraweeView#inflateHierarchy");
        }
        Z6.b d10 = Z6.c.d(context, attributeSet);
        setAspectRatio(d10.f());
        setHierarchy(d10.a());
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    public AbstractC2894d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public AbstractC2894d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        inflateHierarchy(context, attributeSet);
    }
}
