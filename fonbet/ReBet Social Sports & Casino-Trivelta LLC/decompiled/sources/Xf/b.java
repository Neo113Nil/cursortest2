package Xf;

import android.os.CountDownTimer;
import cg.InterfaceC2919b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b extends CountDownTimer {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f13782b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f13783a;

    public b(String str, long j10, long j11) {
        super(j10, j11);
        this.f13783a = new ArrayList();
        ArrayList arrayList = f13782b;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static boolean b(String str) {
        return f13782b.contains(str);
    }

    public static void c(String str) {
        f13782b.remove(str);
    }

    public void a(InterfaceC2919b interfaceC2919b) {
        this.f13783a.add(interfaceC2919b);
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        Iterator it = this.f13783a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2919b) it.next()).H();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        Iterator it = this.f13783a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2919b) it.next()).G(j10);
        }
    }
}
