package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s72 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SnapshotStateList b;

    public /* synthetic */ s72(SnapshotStateList snapshotStateList, int i) {
        this.a = i;
        this.b = snapshotStateList;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        SnapshotStateList snapshotStateList = this.b;
        switch (i) {
            case 0:
                i7a i7aVar = (i7a) obj;
                if (i7aVar instanceof sf9) {
                    snapshotStateList.add(i7aVar);
                } else if (i7aVar instanceof tf9) {
                    snapshotStateList.remove(((tf9) i7aVar).a);
                } else if (i7aVar instanceof rd8) {
                    snapshotStateList.add(i7aVar);
                } else if (i7aVar instanceof sd8) {
                    snapshotStateList.remove(((sd8) i7aVar).a);
                } else if (i7aVar instanceof l6f) {
                    snapshotStateList.add(i7aVar);
                } else if (i7aVar instanceof m6f) {
                    snapshotStateList.remove(((m6f) i7aVar).a);
                } else if (i7aVar instanceof k6f) {
                    snapshotStateList.remove(((k6f) i7aVar).a);
                }
                break;
            case 1:
                i7a i7aVar2 = (i7a) obj;
                if (i7aVar2 instanceof sf9) {
                    snapshotStateList.add(i7aVar2);
                } else if (i7aVar2 instanceof tf9) {
                    snapshotStateList.remove(((tf9) i7aVar2).a);
                } else if (i7aVar2 instanceof rd8) {
                    snapshotStateList.add(i7aVar2);
                } else if (i7aVar2 instanceof sd8) {
                    snapshotStateList.remove(((sd8) i7aVar2).a);
                } else if (i7aVar2 instanceof l6f) {
                    snapshotStateList.add(i7aVar2);
                } else if (i7aVar2 instanceof m6f) {
                    snapshotStateList.remove(((m6f) i7aVar2).a);
                } else if (i7aVar2 instanceof k6f) {
                    snapshotStateList.remove(((k6f) i7aVar2).a);
                } else if (i7aVar2 instanceof m95) {
                    snapshotStateList.add(i7aVar2);
                } else if (i7aVar2 instanceof n95) {
                    snapshotStateList.remove(((n95) i7aVar2).a);
                } else if (i7aVar2 instanceof l95) {
                    snapshotStateList.remove(((l95) i7aVar2).a);
                }
                break;
            default:
                i7a i7aVar3 = (i7a) obj;
                if (i7aVar3 instanceof sf9) {
                    snapshotStateList.add(i7aVar3);
                } else if (i7aVar3 instanceof tf9) {
                    snapshotStateList.remove(((tf9) i7aVar3).a);
                } else if (i7aVar3 instanceof rd8) {
                    snapshotStateList.add(i7aVar3);
                } else if (i7aVar3 instanceof sd8) {
                    snapshotStateList.remove(((sd8) i7aVar3).a);
                } else if (i7aVar3 instanceof l6f) {
                    snapshotStateList.add(i7aVar3);
                } else if (i7aVar3 instanceof m6f) {
                    snapshotStateList.remove(((m6f) i7aVar3).a);
                } else if (i7aVar3 instanceof k6f) {
                    snapshotStateList.remove(((k6f) i7aVar3).a);
                }
                break;
        }
        return Unit.a;
    }
}
