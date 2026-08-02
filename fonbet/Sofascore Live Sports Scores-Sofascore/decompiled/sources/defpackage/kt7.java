package defpackage;

import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kt7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeatureWalkthroughFullScreenDialog b;

    public /* synthetic */ kt7(FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog, int i) {
        this.a = i;
        this.b = featureWalkthroughFullScreenDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = this.b;
        switch (i) {
            case 0:
                String string = featureWalkthroughFullScreenDialog.requireArguments().getString("TYPE");
                Object obj = st7.a;
                if (!Intrinsics.c(string, st7.e)) {
                    obj = ut7.a;
                    if (!Intrinsics.c(string, ut7.e)) {
                        obj = tt7.a;
                        if (!Intrinsics.c(string, tt7.e)) {
                            obj = null;
                        }
                    }
                }
                if (obj != null) {
                    return obj;
                }
                a70.p("Required value was null.");
                return null;
            default:
                featureWalkthroughFullScreenDialog.k(false, false);
                return Unit.a;
        }
    }
}
