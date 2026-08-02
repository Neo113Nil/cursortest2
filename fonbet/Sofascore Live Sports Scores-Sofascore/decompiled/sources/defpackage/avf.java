package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class avf implements IBinder.DeathRecipient {
    public final Messenger a;
    public final tm b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ gvf i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public avf(gvf gvfVar, Messenger messenger) {
        this.i = gvfVar;
        this.a = messenger;
        tm tmVar = new tm(this);
        this.b = tmVar;
        this.c = new Messenger(tmVar);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.j.post(new zuf(this, 1));
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundle);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundle);
    }
}
