package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cb6 extends p8 {
    public final /* synthetic */ int c;
    public final t54 d;
    public final /* synthetic */ nb6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb6(nb6 nb6Var, t54 t54Var, int i) {
        super(t54Var.b);
        this.c = i;
        switch (i) {
            case 1:
                this.e = nb6Var;
                super(t54Var.b);
                this.d = t54Var;
                break;
            case 2:
                this.e = nb6Var;
                super(t54Var.b);
                this.d = t54Var;
                break;
            default:
                this.e = nb6Var;
                this.d = t54Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        FrameLayout frameLayout;
        int s;
        int i3 = this.c;
        nb6 nb6Var = this.e;
        t54 t54Var = this.d;
        Context context = this.b;
        switch (i3) {
            case 0:
                ie9 ie9Var = (ie9) obj;
                ie9Var.getClass();
                be9 be9Var = nb6Var.s;
                boolean z = nb6Var.m;
                if (be9Var != null) {
                    FrameLayout frameLayout2 = t54Var.b;
                    frameLayout2.removeAllViews();
                    ViewParent parent = be9Var.getParent();
                    frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                    }
                    frameLayout2.addView(be9Var);
                    sea.v(frameLayout2, true, ie9Var.a, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int s2 = z ? 0 : ao2.s(8, context);
                        s = z ? 0 : ao2.s(8, context);
                        int i4 = marginLayoutParams.topMargin;
                        int i5 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart(s2);
                        marginLayoutParams.topMargin = i4;
                        marginLayoutParams.setMarginEnd(s);
                        marginLayoutParams.bottomMargin = i5;
                        frameLayout2.setLayoutParams(marginLayoutParams);
                        break;
                    }
                }
                break;
            case 1:
                ml8 ml8Var = (ml8) obj;
                ml8Var.getClass();
                FrameLayout frameLayout3 = t54Var.b;
                frameLayout3.removeAllViews();
                ViewParent parent2 = ml8Var.getParent();
                frameLayout = parent2 instanceof FrameLayout ? (FrameLayout) parent2 : null;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                frameLayout3.addView(ml8Var);
                boolean z2 = nb6Var.m;
                sea.v(frameLayout3, false, z2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int s3 = z2 ? 0 : ao2.s(8, context);
                    s = z2 ? 0 : ao2.s(8, context);
                    int i6 = marginLayoutParams2.topMargin;
                    int i7 = marginLayoutParams2.bottomMargin;
                    marginLayoutParams2.setMarginStart(s3);
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.setMarginEnd(s);
                    marginLayoutParams2.bottomMargin = i7;
                    frameLayout3.setLayoutParams(marginLayoutParams2);
                    break;
                }
            default:
                b56 b56Var = (b56) obj;
                b56Var.getClass();
                FrameLayout frameLayout4 = t54Var.b;
                frameLayout4.removeAllViews();
                ViewParent parent3 = b56Var.getParent();
                frameLayout = parent3 instanceof FrameLayout ? (FrameLayout) parent3 : null;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                frameLayout4.addView(b56Var);
                sea.v(frameLayout4, false, i == i2 + (-1), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                boolean z3 = nb6Var.m;
                ViewGroup.LayoutParams layoutParams3 = frameLayout4.getLayoutParams();
                if (layoutParams3 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    int s4 = z3 ? 0 : ao2.s(8, context);
                    s = z3 ? 0 : ao2.s(8, context);
                    int i8 = marginLayoutParams3.topMargin;
                    int i9 = marginLayoutParams3.bottomMargin;
                    marginLayoutParams3.setMarginStart(s4);
                    marginLayoutParams3.topMargin = i8;
                    marginLayoutParams3.setMarginEnd(s);
                    marginLayoutParams3.bottomMargin = i9;
                    frameLayout4.setLayoutParams(marginLayoutParams3);
                    break;
                }
        }
    }
}
