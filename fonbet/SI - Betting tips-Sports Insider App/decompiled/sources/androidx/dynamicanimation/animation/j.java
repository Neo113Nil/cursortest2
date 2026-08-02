package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {
    final String mPropertyName;

    public j(String str) {
        this.mPropertyName = str;
    }

    public static <T> j createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new i(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f6);
}
