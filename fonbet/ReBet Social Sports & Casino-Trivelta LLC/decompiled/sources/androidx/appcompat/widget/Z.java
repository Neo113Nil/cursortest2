package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class Z extends Q {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f17242b;

    public Z(Context context, Resources resources) {
        super(resources);
        this.f17242b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = (Context) this.f17242b.get();
        if (a10 != null && context != null) {
            P.g().w(context, i10, a10);
        }
        return a10;
    }
}
