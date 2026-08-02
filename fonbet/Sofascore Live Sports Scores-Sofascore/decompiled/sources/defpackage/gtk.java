package defpackage;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gtk extends ot8 implements Function1 {
    public static final gtk b = new gtk();

    public gtk() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewParent viewParent = (ViewParent) obj;
        viewParent.getClass();
        return viewParent.getParent();
    }
}
