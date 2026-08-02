package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a50 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ rsk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a50(rsk rskVar, int i) {
        super(0);
        this.i = i;
        this.j = rskVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        uyd snapshotObserver;
        int i = this.i;
        rsk rskVar = this.j;
        switch (i) {
            case 0:
                rskVar.getLayoutNode().C();
                break;
            case 1:
                if (rskVar.e && rskVar.isAttachedToWindow() && rskVar.getView().getParent() == rskVar) {
                    snapshotObserver = rskVar.getSnapshotObserver();
                    snapshotObserver.a.i(rskVar, ry.s, rskVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                rskVar.A.saveHierarchyState(sparseArray);
                break;
            case 3:
                rskVar.getReleaseBlock().invoke(rskVar.A);
                rskVar.n();
                break;
            case 4:
                rskVar.getResetBlock().invoke(rskVar.A);
                break;
            default:
                rskVar.getUpdateBlock().invoke(rskVar.A);
                break;
        }
        return Unit.a;
    }
}
