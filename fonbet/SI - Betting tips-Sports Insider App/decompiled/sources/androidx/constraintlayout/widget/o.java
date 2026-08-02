package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f1196n;

    /* renamed from: a, reason: collision with root package name */
    public float f1197a;

    /* renamed from: b, reason: collision with root package name */
    public float f1198b;

    /* renamed from: c, reason: collision with root package name */
    public float f1199c;

    /* renamed from: d, reason: collision with root package name */
    public float f1200d;

    /* renamed from: e, reason: collision with root package name */
    public float f1201e;

    /* renamed from: f, reason: collision with root package name */
    public float f1202f;

    /* renamed from: g, reason: collision with root package name */
    public float f1203g;

    /* renamed from: h, reason: collision with root package name */
    public int f1204h;

    /* renamed from: i, reason: collision with root package name */
    public float f1205i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f1206k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1207l;

    /* renamed from: m, reason: collision with root package name */
    public float f1208m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1196n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f1223i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            switch (f1196n.get(index)) {
                case 1:
                    this.f1197a = obtainStyledAttributes.getFloat(index, this.f1197a);
                    break;
                case 2:
                    this.f1198b = obtainStyledAttributes.getFloat(index, this.f1198b);
                    break;
                case 3:
                    this.f1199c = obtainStyledAttributes.getFloat(index, this.f1199c);
                    break;
                case 4:
                    this.f1200d = obtainStyledAttributes.getFloat(index, this.f1200d);
                    break;
                case 5:
                    this.f1201e = obtainStyledAttributes.getFloat(index, this.f1201e);
                    break;
                case 6:
                    this.f1202f = obtainStyledAttributes.getDimension(index, this.f1202f);
                    break;
                case 7:
                    this.f1203g = obtainStyledAttributes.getDimension(index, this.f1203g);
                    break;
                case 8:
                    this.f1205i = obtainStyledAttributes.getDimension(index, this.f1205i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f1206k = obtainStyledAttributes.getDimension(index, this.f1206k);
                    break;
                case 11:
                    this.f1207l = true;
                    this.f1208m = obtainStyledAttributes.getDimension(index, this.f1208m);
                    break;
                case 12:
                    this.f1204h = p.f(obtainStyledAttributes, index, this.f1204h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
