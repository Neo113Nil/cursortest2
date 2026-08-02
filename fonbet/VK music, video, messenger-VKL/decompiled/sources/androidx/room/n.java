package androidx.room;

import android.os.Looper;
import androidx.room.e;
import java.util.Set;
import xsna.gg3;
import xsna.qb3;

/* compiled from: RoomTrackingLiveData.android.kt */
/* loaded from: classes.dex */
public final class n extends e.a {
    public final /* synthetic */ o<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String[] strArr, o<Object> oVar) {
        super(strArr);
        this.b = oVar;
    }

    @Override // androidx.room.e.a
    public final void a(Set<String> set) {
        gg3 a = gg3.a();
        qb3 qb3Var = new qb3(this.b, 11);
        a.g.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qb3Var.run();
        } else {
            a.c(qb3Var);
        }
    }
}
