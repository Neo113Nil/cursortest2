package androidx.core.view;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.sports.insider.ui.views.CustomBottomNavigationView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1318b;

    public /* synthetic */ f1(int i5, Object obj) {
        this.f1317a = i5;
        this.f1318b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int i5 = this.f1317a;
        Object obj = this.f1318b;
        switch (i5) {
            case 0:
                ((View) ((androidx.appcompat.app.y0) ((h9.c) obj).f10430b).f385d.getParent()).invalidate();
                break;
            case 1:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$1((ClippableRoundedCornerLayout) obj, animation);
                break;
            case 2:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) obj, animation);
                break;
            case 3:
                ((DeterminateDrawable) obj).lambda$maybeInitializeAmplitudeAnimator$1(animation);
                break;
            case 4:
                ve.h hVar = (ve.h) obj;
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                hVar.f24720u = ((Float) animatedValue).floatValue();
                Rect rect = hVar.f24723x;
                if (rect == null) {
                    hVar.postInvalidateDelayed(200L);
                    break;
                } else {
                    hVar.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                    break;
                }
            case 5:
                CustomBottomNavigationView customBottomNavigationView = (CustomBottomNavigationView) obj;
                int i10 = CustomBottomNavigationView.f7260x;
                Intrinsics.checkNotNullParameter(animation, "it");
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                customBottomNavigationView.f7277s = ((Float) animatedValue2).floatValue();
                customBottomNavigationView.invalidate();
                break;
            default:
                ze.k kVar = (ze.k) obj;
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue3 = animation.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                kVar.a(((Float) animatedValue3).floatValue(), kVar.f25967d);
                break;
        }
    }

    public /* synthetic */ f1(h9.c cVar, View view) {
        this.f1317a = 0;
        this.f1318b = cVar;
    }
}
