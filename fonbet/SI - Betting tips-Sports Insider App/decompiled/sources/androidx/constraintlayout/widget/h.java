package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1120c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1121d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1122e;

    /* renamed from: f, reason: collision with root package name */
    public final p f1123f;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f1118a = Float.NaN;
        this.f1119b = Float.NaN;
        this.f1120c = Float.NaN;
        this.f1121d = Float.NaN;
        this.f1122e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1122e);
                this.f1122e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    p pVar = new p();
                    this.f1123f = pVar;
                    pVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1121d = obtainStyledAttributes.getDimension(index, this.f1121d);
            } else if (index == 2) {
                this.f1119b = obtainStyledAttributes.getDimension(index, this.f1119b);
            } else if (index == 3) {
                this.f1120c = obtainStyledAttributes.getDimension(index, this.f1120c);
            } else if (index == 4) {
                this.f1118a = obtainStyledAttributes.getDimension(index, this.f1118a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f6, float f10) {
        float f11 = this.f1118a;
        if (!Float.isNaN(f11) && f6 < f11) {
            return false;
        }
        float f12 = this.f1119b;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f1120c;
        if (!Float.isNaN(f13) && f6 > f13) {
            return false;
        }
        float f14 = this.f1121d;
        return Float.isNaN(f14) || f10 <= f14;
    }
}
