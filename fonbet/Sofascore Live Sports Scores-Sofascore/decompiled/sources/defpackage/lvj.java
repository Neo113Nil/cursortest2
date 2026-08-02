package defpackage;

import com.sofascore.model.mvvm.model.Transfer;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lvj {
    public List a;
    public final pvj b;

    public lvj(Transfer transfer, pvj pvjVar) {
        transfer.getClass();
        pvjVar.getClass();
        List c = a.c(transfer);
        c.getClass();
        pvjVar.getClass();
        this.a = c;
        this.b = pvjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvj)) {
            return false;
        }
        lvj lvjVar = (lvj) obj;
        return this.a.equals(lvjVar.a) && this.b == lvjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransferRow(transfers=" + this.a + ", sortType=" + this.b + ")";
    }
}
