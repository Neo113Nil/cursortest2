package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.a.InterfaceC0009a;
import xsna.izs;
import xsna.nox;
import xsna.p8v;

/* compiled from: LazyLayoutIntervalContent.kt */
/* loaded from: classes11.dex */
public abstract class a<Interval extends InterfaceC0009a> {

    /* compiled from: LazyLayoutIntervalContent.kt */
    /* renamed from: androidx.compose.foundation.lazy.layout.a$a, reason: collision with other inner class name */
    public interface InterfaceC0009a {

        /* compiled from: LazyLayoutIntervalContent.kt */
        /* renamed from: androidx.compose.foundation.lazy.layout.a$a$a, reason: collision with other inner class name */
        public static final class C0010a implements izs {
            public static final C0010a b = new C0010a();

            @Override // xsna.izs
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default izs<Integer, Object> getKey() {
            return null;
        }

        default izs<Integer, Object> getType() {
            return C0010a.b;
        }
    }

    public final Object k(int i) {
        nox b = l().b(i);
        return b.c.getType().invoke(Integer.valueOf(i - b.a));
    }

    public abstract p8v l();

    public final Object m(int i) {
        Object invoke;
        nox b = l().b(i);
        int i2 = i - b.a;
        izs<Integer, Object> key = b.c.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : invoke;
    }
}
