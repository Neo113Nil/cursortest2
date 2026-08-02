package i2;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7001d extends C6999b {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // i2.C6999b, i2.C7000c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7001d) || Objects.equals(b(), ((C7001d) obj).b())) {
            return super.equals(obj);
        }
        return false;
    }
}
