package defpackage;

import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.model.mvvm.model.Gender;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xy9 extends p8 {
    public final ez0 c;
    public final Gender d;
    public final mqi e;
    public final mqi f;
    public final /* synthetic */ yy9 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xy9(yy9 yy9Var, ez0 ez0Var, Gender gender) {
        super(r1);
        this.g = yy9Var;
        FrameLayout frameLayout = (FrameLayout) ez0Var.b;
        frameLayout.getClass();
        this.c = ez0Var;
        this.d = gender;
        this.e = ypa.b(new us9(4));
        this.f = ypa.b(new sr8(this, 10));
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        gz9 gz9Var = (gz9) obj;
        gz9Var.getClass();
        ez0 ez0Var = this.c;
        FrameLayout frameLayout = (FrameLayout) ez0Var.b;
        frameLayout.getClass();
        sea.v(frameLayout, gz9Var.a, gz9Var.b, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        FrameLayout frameLayout2 = (FrameLayout) ez0Var.b;
        frameLayout2.getClass();
        frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingEnd(), gz9Var.b ? ((Number) this.f.getValue()).intValue() : 0);
        ((ComposeView) ez0Var.c).setContent(new tc3(456510760, new zt7(gz9Var, this, this.g, i, 3), true));
    }
}
