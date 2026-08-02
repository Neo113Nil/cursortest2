package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatProperty f1785a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, FloatProperty floatProperty) {
        super(str);
        this.f1785a = floatProperty;
    }

    @Override // androidx.dynamicanimation.animation.j
    public final float getValue(Object obj) {
        return ((Float) this.f1785a.get(obj)).floatValue();
    }

    @Override // androidx.dynamicanimation.animation.j
    public final void setValue(Object obj, float f6) {
        this.f1785a.setValue(obj, f6);
    }
}
