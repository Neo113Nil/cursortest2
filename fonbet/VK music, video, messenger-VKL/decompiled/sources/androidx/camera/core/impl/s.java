package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SurfaceCombination.java */
/* loaded from: classes11.dex */
public final class s {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(@NonNull b bVar) {
        this.a.add(bVar);
    }

    public final boolean c(@NonNull ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.a;
            if (size <= arrayList2.size()) {
                int size2 = arrayList2.size();
                ArrayList arrayList3 = new ArrayList();
                b(arrayList3, size2, new int[size2], 0);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    int[] iArr = (int[]) it.next();
                    boolean z = true;
                    for (int i = 0; i < arrayList2.size(); i++) {
                        if (iArr[i] < arrayList.size()) {
                            SurfaceConfig surfaceConfig = (SurfaceConfig) arrayList2.get(i);
                            SurfaceConfig surfaceConfig2 = (SurfaceConfig) arrayList.get(iArr[i]);
                            surfaceConfig.getClass();
                            z &= surfaceConfig2.a().mId <= surfaceConfig.a().mId && surfaceConfig2.b() == surfaceConfig.b();
                            if (!z) {
                                break;
                            }
                        }
                    }
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
