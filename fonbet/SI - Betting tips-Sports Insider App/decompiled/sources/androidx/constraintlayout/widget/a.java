package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1054a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1055b;

    /* renamed from: c, reason: collision with root package name */
    public int f1056c;

    /* renamed from: d, reason: collision with root package name */
    public float f1057d;

    /* renamed from: e, reason: collision with root package name */
    public String f1058e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1059f;

    /* renamed from: g, reason: collision with root package name */
    public int f1060g;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f1055b = aVar.f1055b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f1218d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i5 = 0;
        boolean z5 = false;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z5 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i5 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i5 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i5 = i11;
                            }
                        }
                        i5 = 7;
                    }
                }
                i5 = i12;
            }
        }
        if (str != null && obj != null) {
            a aVar = new a();
            aVar.f1055b = i5;
            aVar.f1054a = z5;
            aVar.b(obj);
            hashMap.put(str, aVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (v.f.d(this.f1055b)) {
            case 0:
            case 7:
                this.f1056c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f1057d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f1060g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1058e = (String) obj;
                break;
            case 5:
                this.f1059f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f1057d = ((Float) obj).floatValue();
                break;
        }
    }
}
