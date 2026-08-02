package Xf;

import android.os.CountDownTimer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class j extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13817a;

    public j(long j10, long j11) {
        super(j10, j11);
        this.f13817a = new ArrayList();
    }

    public void a(cg.h hVar) {
        this.f13817a.add(hVar);
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        Iterator it = this.f13817a.iterator();
        while (it.hasNext()) {
            ((cg.h) it.next()).f();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        Iterator it = this.f13817a.iterator();
        while (it.hasNext()) {
            ((cg.h) it.next()).S(j10);
        }
    }
}
