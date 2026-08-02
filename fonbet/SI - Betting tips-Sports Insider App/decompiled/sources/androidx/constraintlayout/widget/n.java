package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f1192a;

    /* renamed from: b, reason: collision with root package name */
    public int f1193b;

    /* renamed from: c, reason: collision with root package name */
    public float f1194c;

    /* renamed from: d, reason: collision with root package name */
    public float f1195d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1221g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == 1) {
                this.f1194c = obtainStyledAttributes.getFloat(index, this.f1194c);
            } else if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f1192a);
                this.f1192a = i10;
                this.f1192a = p.f1209d[i10];
            } else if (index == 4) {
                this.f1193b = obtainStyledAttributes.getInt(index, this.f1193b);
            } else if (index == 3) {
                this.f1195d = obtainStyledAttributes.getFloat(index, this.f1195d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
