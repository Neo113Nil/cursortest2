package V6;

import V6.a;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b extends V6.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f12523b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f12527f = new a();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f12525d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f12526e = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f12524c = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f12523b) {
                ArrayList arrayList = b.this.f12526e;
                b bVar = b.this;
                bVar.f12526e = bVar.f12525d;
                b.this.f12525d = arrayList;
            }
            int size = b.this.f12526e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a.InterfaceC0262a) b.this.f12526e.get(i10)).release();
            }
            b.this.f12526e.clear();
        }
    }

    @Override // V6.a
    public void a(a.InterfaceC0262a interfaceC0262a) {
        synchronized (this.f12523b) {
            this.f12525d.remove(interfaceC0262a);
        }
    }

    @Override // V6.a
    public void d(a.InterfaceC0262a interfaceC0262a) {
        if (!V6.a.c()) {
            interfaceC0262a.release();
            return;
        }
        synchronized (this.f12523b) {
            try {
                if (this.f12525d.contains(interfaceC0262a)) {
                    return;
                }
                this.f12525d.add(interfaceC0262a);
                boolean z10 = true;
                if (this.f12525d.size() != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f12524c.post(this.f12527f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
