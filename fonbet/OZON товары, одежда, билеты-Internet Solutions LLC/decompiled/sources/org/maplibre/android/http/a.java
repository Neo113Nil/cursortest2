package org.maplibre.android.http;

import android.os.AsyncTask;
import androidx.recyclerview.widget.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;
import org.maplibre.android.b;
import org.maplibre.android.log.Logger;

/* loaded from: classes10.dex */
final class a extends AsyncTask<String, Void, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1340a f79629a;

    /* renamed from: org.maplibre.android.http.a$a, reason: collision with other inner class name */
    public interface InterfaceC1340a {
    }

    a(InterfaceC1340a interfaceC1340a) {
        this.f79629a = interfaceC1340a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final byte[] doInBackground(String[] strArr) {
        byte[] bArr;
        InputStream open;
        InputStream inputStream = null;
        byte[] bArr2 = null;
        inputStream = null;
        try {
            open = MapLibre.getApplicationContext().getAssets().open("integration/" + strArr[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", ","));
        } catch (IOException e11) {
            e = e11;
            bArr = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bArr2 = new byte[open.available()];
            open.read(bArr2);
            try {
                open.close();
                return bArr2;
            } catch (IOException e12) {
                Logger.e("Mbgl-LocalRequestTask", "Load file failed", e12);
                b.d("Load file failed", e12);
                return bArr2;
            }
        } catch (IOException e13) {
            e = e13;
            byte[] bArr3 = bArr2;
            inputStream = open;
            bArr = bArr3;
            try {
                Logger.e("Mbgl-LocalRequestTask", "Load file failed", e);
                b.d("Load file failed", e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e14) {
                        Logger.e("Mbgl-LocalRequestTask", "Load file failed", e14);
                        b.d("Load file failed", e14);
                    }
                }
                return bArr;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e15) {
                        Logger.e("Mbgl-LocalRequestTask", "Load file failed", e15);
                        b.d("Load file failed", e15);
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = open;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(byte[] bArr) {
        InterfaceC1340a interfaceC1340a;
        ReentrantLock reentrantLock;
        long j11;
        ReentrantLock reentrantLock2;
        byte[] bArr2 = bArr;
        super.onPostExecute(bArr2);
        if (bArr2 == null || (interfaceC1340a = this.f79629a) == null) {
            return;
        }
        NativeHttpRequest nativeHttpRequest = NativeHttpRequest.this;
        reentrantLock = nativeHttpRequest.lock;
        reentrantLock.lock();
        j11 = nativeHttpRequest.nativePtr;
        if (j11 != 0) {
            nativeHttpRequest.nativeOnResponse(m.e.DEFAULT_DRAG_ANIMATION_DURATION, null, null, null, null, null, null, bArr2);
        }
        reentrantLock2 = nativeHttpRequest.lock;
        reentrantLock2.unlock();
    }
}
