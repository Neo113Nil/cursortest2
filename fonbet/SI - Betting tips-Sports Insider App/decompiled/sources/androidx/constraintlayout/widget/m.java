package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f1183a;

    /* renamed from: b, reason: collision with root package name */
    public int f1184b;

    /* renamed from: c, reason: collision with root package name */
    public int f1185c;

    /* renamed from: d, reason: collision with root package name */
    public float f1186d;

    /* renamed from: e, reason: collision with root package name */
    public float f1187e;

    /* renamed from: f, reason: collision with root package name */
    public float f1188f;

    /* renamed from: g, reason: collision with root package name */
    public int f1189g;

    /* renamed from: h, reason: collision with root package name */
    public String f1190h;

    /* renamed from: i, reason: collision with root package name */
    public int f1191i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1220f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            switch (j.get(index)) {
                case 1:
                    this.f1187e = obtainStyledAttributes.getFloat(index, this.f1187e);
                    break;
                case 2:
                    this.f1185c = obtainStyledAttributes.getInt(index, this.f1185c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = w.a.f24945a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f1183a = p.f(obtainStyledAttributes, index, this.f1183a);
                    break;
                case 6:
                    this.f1184b = obtainStyledAttributes.getInteger(index, this.f1184b);
                    break;
                case 7:
                    this.f1186d = obtainStyledAttributes.getFloat(index, this.f1186d);
                    break;
                case 8:
                    this.f1189g = obtainStyledAttributes.getInteger(index, this.f1189g);
                    break;
                case 9:
                    this.f1188f = obtainStyledAttributes.getFloat(index, this.f1188f);
                    break;
                case 10:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f1191i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i10 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f1190h = string;
                        if (string.indexOf("/") > 0) {
                            this.f1191i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f1191i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
