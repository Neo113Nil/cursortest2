package ja;

import android.util.Property;
import android.view.ViewGroup;

/* renamed from: ja.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5107d extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final Property f53864a = new C5107d("childrenAlpha");

    public C5107d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(ia.g.f48407O);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f10) {
        float floatValue = f10.floatValue();
        viewGroup.setTag(ia.g.f48407O, f10);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
