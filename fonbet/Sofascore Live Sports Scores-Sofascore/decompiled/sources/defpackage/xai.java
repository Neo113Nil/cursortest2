package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xai extends p8 {
    public final n9i c;
    public final iai d;
    public final boolean e;
    public final boolean f;
    public final List g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xai(n9i n9iVar, iai iaiVar, boolean z, boolean z2) {
        super(r0);
        iaiVar.getClass();
        ConstraintLayout constraintLayout = n9iVar.a;
        constraintLayout.getClass();
        this.c = n9iVar;
        this.d = iaiVar;
        this.e = z;
        this.f = z2;
        this.g = b.j(n9iVar.b, n9iVar.c, n9iVar.d, n9iVar.e, n9iVar.f, n9iVar.g, n9iVar.h, n9iVar.i, n9iVar.j);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        wai waiVar = (wai) obj;
        waiVar.getClass();
        List list = this.g;
        boolean z = this.f;
        n9i n9iVar = this.c;
        y6a.t(n9iVar, waiVar, this.d, list, z);
        ConstraintLayout constraintLayout = n9iVar.a;
        constraintLayout.getClass();
        sea.v(constraintLayout, false, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        if (this.e) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.topMargin;
            int i4 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.bottomMargin = i4;
            constraintLayout.setLayoutParams(marginLayoutParams);
        }
    }
}
