package org.maplibre.android.http;

import Zf.c;
import androidx.annotation.Keep;
import cg.C5827a;
import ch.C5834e;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;
import org.maplibre.android.http.a;

@Keep
/* loaded from: classes10.dex */
public class NativeHttpRequest implements c {
    private final Zf.a httpRequest;
    private final ReentrantLock lock;

    @Keep
    private long nativePtr;

    final class a implements a.InterfaceC1340a {
        a() {
        }
    }

    @Keep
    private NativeHttpRequest(long j11, String str, String str2, String str3, String str4, boolean z11) {
        ((C5834e) MapLibre.getModuleProvider()).getClass();
        C5827a c5827a = new C5827a();
        this.httpRequest = c5827a;
        this.lock = new ReentrantLock();
        this.nativePtr = j11;
        if (str.startsWith("local://")) {
            executeLocalRequest(str);
        } else {
            c5827a.b(this, str, str2, str3, str4, z11);
        }
    }

    private void executeLocalRequest(String str) {
        new org.maplibre.android.http.a(new a()).execute(str);
    }

    @Keep
    private native void nativeOnFailure(int i11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    public native void nativeOnResponse(int i11, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public void cancel() {
        ((C5827a) this.httpRequest).a();
        this.lock.lock();
        this.nativePtr = 0L;
        this.lock.unlock();
    }

    @Override // Zf.c
    public void handleFailure(int i11, String str) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnFailure(i11, str);
        }
        this.lock.unlock();
    }

    @Override // Zf.c
    public void onResponse(int i11, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnResponse(i11, str, str2, str3, str4, str5, str6, bArr);
        }
        this.lock.unlock();
    }
}
