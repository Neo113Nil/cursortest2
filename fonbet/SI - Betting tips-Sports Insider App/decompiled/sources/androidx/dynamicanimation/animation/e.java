package androidx.dynamicanimation.animation;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, int i5) {
        super(str);
        this.f1781a = i5;
    }

    @Override // androidx.dynamicanimation.animation.j
    public final float getValue(Object obj) {
        switch (this.f1781a) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // androidx.dynamicanimation.animation.j
    public final void setValue(Object obj, float f6) {
        switch (this.f1781a) {
            case 0:
                ((View) obj).setAlpha(f6);
                break;
            case 1:
                ((View) obj).setScaleX(f6);
                break;
            case 2:
                ((View) obj).setScaleY(f6);
                break;
            case 3:
                ((View) obj).setRotation(f6);
                break;
            case 4:
                ((View) obj).setRotationX(f6);
                break;
            default:
                ((View) obj).setRotationY(f6);
                break;
        }
    }
}
