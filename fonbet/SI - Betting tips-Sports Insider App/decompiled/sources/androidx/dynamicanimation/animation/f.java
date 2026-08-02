package androidx.dynamicanimation.animation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1782a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar) {
        super("FloatValueHolder");
        this.f1782a = kVar;
    }

    @Override // androidx.dynamicanimation.animation.j
    public final float getValue(Object obj) {
        return this.f1782a.f1786a;
    }

    @Override // androidx.dynamicanimation.animation.j
    public final void setValue(Object obj, float f6) {
        this.f1782a.f1786a = f6;
    }
}
