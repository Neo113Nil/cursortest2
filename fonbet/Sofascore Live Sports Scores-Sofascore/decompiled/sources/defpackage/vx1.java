package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vx1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ vx1(FrameLayout frameLayout, int i) {
        this.a = i;
        this.b = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        FrameLayout frameLayout = this.b;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                context.getClass();
                break;
            case 1:
                context.getClass();
                break;
            default:
                context.getClass();
                break;
        }
        return frameLayout;
    }
}
