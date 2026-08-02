package androidx.appcompat.widget;

import android.util.Property;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v3 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((x3) obj).mThumbPosition);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((x3) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
