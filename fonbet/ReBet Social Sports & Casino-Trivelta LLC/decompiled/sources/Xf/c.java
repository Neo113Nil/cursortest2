package Xf;

import android.os.CountDownTimer;
import cg.InterfaceC2920c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class c extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13784a;

    public c(long j10, long j11) {
        super(j10, j11);
        this.f13784a = new ArrayList();
    }

    public void a(InterfaceC2920c interfaceC2920c) {
        this.f13784a.add(interfaceC2920c);
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        Iterator it = this.f13784a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2920c) it.next()).d();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        Iterator it = this.f13784a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2920c) it.next()).onTick((int) (j10 / 1000));
        }
    }
}
