package kc;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public Promise f54478a;

    /* renamed from: b, reason: collision with root package name */
    public int f54479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f54480c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicInteger f54481d;

    /* renamed from: e, reason: collision with root package name */
    public WritableArray f54482e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54483f;

    public final synchronized boolean a() {
        if (this.f54483f) {
            Log.w("image-crop-picker", "Skipping result, already sent...");
            return false;
        }
        if (this.f54478a != null) {
            return true;
        }
        Log.w("image-crop-picker", "Trying to notify success but promise is not set");
        return false;
    }

    public synchronized void b(String str, String str2) {
        if (a()) {
            Log.e("image-crop-picker", "Promise rejected. " + str2);
            this.f54478a.reject(str, str2);
            this.f54483f = true;
        }
    }

    public synchronized void c(String str, Throwable th2) {
        if (a()) {
            Log.e("image-crop-picker", "Promise rejected. " + th2.getMessage());
            this.f54478a.reject(str, th2);
            this.f54483f = true;
        }
    }

    public synchronized void d(WritableMap writableMap) {
        try {
            if (a()) {
                if (this.f54480c) {
                    this.f54482e.pushMap(writableMap);
                    if (this.f54481d.addAndGet(1) == this.f54479b) {
                        this.f54478a.resolve(this.f54482e);
                        this.f54483f = true;
                    }
                } else {
                    this.f54478a.resolve(writableMap);
                    this.f54483f = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e(int i10) {
        this.f54479b = i10;
        this.f54481d = new AtomicInteger(0);
    }

    public synchronized void f(Promise promise, boolean z10) {
        this.f54478a = promise;
        this.f54480c = z10;
        this.f54483f = false;
        this.f54479b = 0;
        this.f54481d = new AtomicInteger(0);
        if (z10) {
            this.f54482e = new WritableNativeArray();
        }
    }
}
