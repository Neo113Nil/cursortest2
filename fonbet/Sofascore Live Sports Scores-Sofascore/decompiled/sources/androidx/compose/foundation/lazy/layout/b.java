package androidx.compose.foundation.lazy.layout;

import defpackage.b10;
import defpackage.h9a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b {
    public final Object g(int i) {
        h9a j = h().j(i);
        return j.c.getType().invoke(Integer.valueOf(i - j.a));
    }

    public abstract b10 h();

    public final Object i(int i) {
        Object invoke;
        h9a j = h().j(i);
        int i2 = i - j.a;
        Function1 key = j.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : invoke;
    }
}
