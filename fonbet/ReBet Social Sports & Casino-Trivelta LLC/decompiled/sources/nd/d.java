package nd;

import android.os.CountDownTimer;
import com.zoho.livechat.android.listeners.LoaderTimerListener;
import java.util.ArrayList;
import java.util.Iterator;
import od.C5875a;

/* loaded from: classes4.dex */
public class d extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f57285a;

    /* renamed from: b, reason: collision with root package name */
    public C5875a f57286b;

    public d(long j10, long j11, C5875a c5875a) {
        super(j10, j11);
        this.f57285a = new ArrayList();
        this.f57286b = c5875a;
    }

    public void a(LoaderTimerListener loaderTimerListener) {
        this.f57285a.add(loaderTimerListener);
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        Iterator it = this.f57285a.iterator();
        while (it.hasNext()) {
            ((LoaderTimerListener) it.next()).onFinish(this.f57286b);
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        Iterator it = this.f57285a.iterator();
        while (it.hasNext()) {
            ((LoaderTimerListener) it.next()).onTick((int) (j10 / 1000));
        }
    }
}
