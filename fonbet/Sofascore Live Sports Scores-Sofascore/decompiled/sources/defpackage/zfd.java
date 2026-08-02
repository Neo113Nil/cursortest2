package defpackage;

import com.ironsource.U3;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zfd implements Serializable {
    public final Throwable a;

    public zfd(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zfd)) {
            return false;
        }
        Object obj2 = ((zfd) obj).a;
        Throwable th = this.a;
        if (th != obj2) {
            return th != null && th.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + U3.j.e;
    }
}
