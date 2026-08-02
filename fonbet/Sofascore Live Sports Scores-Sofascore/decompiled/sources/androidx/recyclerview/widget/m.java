package androidx.recyclerview.widget;

import defpackage.crf;
import defpackage.drf;
import defpackage.e3c;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class m {
    public crf a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(u uVar) {
        int i = uVar.mFlags;
        if (!uVar.isInvalid() && (i & 4) == 0) {
            uVar.getOldPosition();
            uVar.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(u uVar, u uVar2, drf drfVar, drf drfVar2);

    public final void c(u uVar) {
        crf crfVar = this.a;
        if (crfVar != null) {
            RecyclerView recyclerView = (RecyclerView) ((e3c) crfVar).b;
            uVar.setIsRecyclable(true);
            if (uVar.mShadowedHolder != null && uVar.mShadowingHolder == null) {
                uVar.mShadowedHolder = null;
            }
            uVar.mShadowingHolder = null;
            if (uVar.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(uVar.itemView) || !uVar.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(uVar.itemView, false);
        }
    }

    public abstract void d(u uVar);

    public abstract void e();

    public abstract boolean f();
}
