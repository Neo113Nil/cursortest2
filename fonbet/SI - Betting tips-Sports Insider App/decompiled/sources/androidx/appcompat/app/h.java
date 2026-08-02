package androidx.appcompat.app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f256b;

    public /* synthetic */ h() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        io.sentry.util.network.b[] bVarArr;
        switch (this.f255a) {
            case 0:
                int i5 = message.what;
                if (i5 == -3 || i5 == -2 || i5 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f256b).get(), message.what);
                    return;
                } else {
                    if (i5 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                x1.b bVar = (x1.b) this.f256b;
                while (true) {
                    synchronized (bVar.f25378b) {
                        try {
                            size = bVar.f25380d.size();
                            if (size <= 0) {
                                return;
                            }
                            bVarArr = new io.sentry.util.network.b[size];
                            bVar.f25380d.toArray(bVarArr);
                            bVar.f25380d.clear();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        io.sentry.util.network.b bVar2 = bVarArr[i10];
                        int size2 = ((ArrayList) bVar2.f17177c).size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            x1.a aVar = (x1.a) ((ArrayList) bVar2.f17177c).get(i11);
                            if (!aVar.f25374d) {
                                aVar.f25372b.onReceive(bVar.f25377a, (Intent) bVar2.f17176b);
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x1.b bVar, Looper looper) {
        super(looper);
        this.f256b = bVar;
    }
}
