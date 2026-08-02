package ve;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.sports.insider.ui.views.FloatingActionButton;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f24825a;

    public r(FloatingActionButton floatingActionButton) {
        this.f24825a = floatingActionButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        FloatingActionButton floatingActionButton = this.f24825a;
        float f6 = floatingActionButton.f7450n;
        float f10 = floatingActionButton.f7438a;
        float f11 = floatingActionButton.f7451o;
        outline.setOval((int) (f6 - f10), (int) (f11 - f10), (int) (f6 + f10), (int) (f11 + f10));
    }
}
