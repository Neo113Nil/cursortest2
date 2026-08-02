package oi;

import java.util.List;
import oi.L;

/* renamed from: oi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5905a implements L {
    public boolean b() {
        List a10 = a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((L.a) a10.get(i10)).a() > 0) {
                return false;
            }
        }
        return true;
    }
}
