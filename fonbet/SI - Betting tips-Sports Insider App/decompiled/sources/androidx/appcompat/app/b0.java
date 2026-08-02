package androidx.appcompat.app;

import android.text.Editable;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements androidx.transition.z, o8.d, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206a;

    public /* synthetic */ b0(int i5) {
        this.f206a = i5;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // androidx.transition.z
    public void a(androidx.transition.y yVar, androidx.transition.a0 a0Var, boolean z5) {
        switch (this.f206a) {
            case 12:
                yVar.onTransitionStart(a0Var, z5);
                break;
            case 13:
                yVar.onTransitionEnd(a0Var, z5);
                break;
            case 14:
                yVar.onTransitionCancel(a0Var);
                break;
            case 15:
                yVar.onTransitionPause(a0Var);
                break;
            default:
                yVar.onTransitionResume(a0Var);
                break;
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        CornerSize lambda$setShapeAppearanceModel$0;
        lambda$setShapeAppearanceModel$0 = MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
        return lambda$setShapeAppearanceModel$0;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        int lambda$new$0;
        lambda$new$0 = TextInputLayout.lambda$new$0(editable);
        return lambda$new$0;
    }

    @Override // w7.a
    public Object f(Task task) {
        return 403;
    }

    @Override // o8.d
    public Object h(com.google.firebase.messaging.x xVar) {
        b9.e lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(xVar);
        return lambda$getComponents$0;
    }
}
