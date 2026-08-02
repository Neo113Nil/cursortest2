package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z9k {
    public final int a;
    public final SnapshotStateList b;
    public final SnapshotStateList c;

    public z9k(List list, List list2, int i) {
        this.a = i;
        if (!(i >= 0)) {
            u3a.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            u3a.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.b = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.c = snapshotStateList2;
    }
}
