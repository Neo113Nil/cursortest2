package defpackage;

import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yj5 {
    public final /* synthetic */ ak5 a;

    public yj5(ak5 ak5Var) {
        this.a = ak5Var;
    }

    public final nyh a(SplitInfo splitInfo) {
        splitInfo.getClass();
        xj5 xj5Var = this.a.b;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        primaryActivityStack.getClass();
        xj5Var.getClass();
        ve c = xj5.c(primaryActivityStack);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        secondaryActivityStack.getClass();
        xj5Var.getClass();
        ve c2 = xj5.c(secondaryActivityStack);
        SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
        splitAttributes.getClass();
        return new nyh(c, c2, ak5.e(splitAttributes), null, null);
    }
}
