package defpackage;

import android.os.IBinder;
import androidx.window.extensions.embedding.SplitInfo;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nyh {
    public final ve a;
    public final ve b;
    public final lyh c;
    public final IBinder d;
    public final SplitInfo.Token e;

    public nyh(ve veVar, ve veVar2, lyh lyhVar, IBinder iBinder, SplitInfo.Token token) {
        this.a = veVar;
        this.b = veVar2;
        this.c = lyhVar;
        this.d = iBinder;
        this.e = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyh)) {
            return false;
        }
        nyh nyhVar = (nyh) obj;
        return Intrinsics.c(this.a, nyhVar.a) && Intrinsics.c(this.b, nyhVar.b) && Intrinsics.c(this.c, nyhVar.c) && Intrinsics.c(this.e, nyhVar.e) && Intrinsics.c(this.d, nyhVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        SplitInfo.Token token = this.e;
        int hashCode2 = (hashCode + (token != null ? token.hashCode() : 0)) * 31;
        IBinder iBinder = this.d;
        return hashCode2 + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.a + ", ");
        sb.append("secondaryActivityStack=" + this.b + ", ");
        sb.append("splitAttributes=" + this.c + ", ");
        if (this.e != null) {
            sb.append("token=" + this.e);
        }
        IBinder iBinder = this.d;
        if (iBinder != null) {
            sb.append("binder=" + iBinder);
        }
        sb.append("}");
        return sb.toString();
    }
}
