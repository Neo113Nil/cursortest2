package D6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends ArrayList {
    public f(int i10) {
        super(i10);
    }

    public static f a(List list) {
        return new f(list);
    }

    public static f b(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }

    public f(List list) {
        super(list);
    }
}
