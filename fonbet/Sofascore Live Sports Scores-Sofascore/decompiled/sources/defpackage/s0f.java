package defpackage;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class s0f implements r0f {
    public final Object[] a;
    public int b;

    public s0f(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            a70.p("The max pool size must be > 0");
            throw null;
        }
    }

    public void a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    @Override // defpackage.r0f
    public boolean b(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                a70.r("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    @Override // defpackage.r0f
    public Object c() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public s0f() {
        this.a = new Object[NotificationCompat.FLAG_LOCAL_ONLY];
    }
}
