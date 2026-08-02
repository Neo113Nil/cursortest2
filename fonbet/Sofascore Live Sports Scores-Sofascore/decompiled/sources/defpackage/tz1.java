package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class tz1 implements kpd, qdb, pdb, sa {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tz1(int i, View view) {
        this.a = 0;
        this.b = i;
        this.c = view;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        int s;
        View view2 = (View) this.c;
        view.getClass();
        u4a i = x9lVar.a.i(IronSourceError.ERROR_NON_EXISTENT_INSTANCE);
        i.getClass();
        int i2 = i.d;
        Context context = view.getContext();
        context.getClass();
        int max = Math.max(i2, ao2.s(56, context));
        boolean z = kik.s;
        int i3 = this.b;
        if (z) {
            Context context2 = view.getContext();
            context2.getClass();
            int s2 = ao2.s(i3, context2);
            Context context3 = view2.getContext();
            context3.getClass();
            s = ao2.s(28, context3) + s2;
        } else {
            Context context4 = view.getContext();
            context4.getClass();
            s = ao2.s(i3, context4);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = max + s;
        view.setLayoutParams(marginLayoutParams);
        return x9lVar;
    }

    @Override // defpackage.qdb
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                int i3 = vg6.r0;
                ((wke) obj).onTimelineChanged(((fke) obj2).a, i2);
                break;
            case 2:
                int i4 = vg6.r0;
                ((wke) obj).onMediaItemTransition((h6c) obj2, i2);
                break;
            default:
                ((vke) obj).o((f6c) obj2, i2);
                break;
        }
    }

    @Override // defpackage.sa
    public boolean n(View view) {
        ((SideSheetBehavior) this.c).w(this.b);
        return true;
    }

    public /* synthetic */ tz1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
