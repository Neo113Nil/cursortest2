package com.shopify.reactnative.skia;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import h8.InterfaceC4488a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes4.dex */
public class PlatformContext {

    /* renamed from: a, reason: collision with root package name */
    public final ReactContext f41484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41485b = "PlatformContext";

    /* renamed from: c, reason: collision with root package name */
    public final Handler f41486c = new Handler(Looper.getMainLooper());

    @InterfaceC4488a
    private final HybridData mHybridData;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41487a;

        public a(String str) {
            this.f41487a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformContext.this.f41484a.handleException(new Exception(this.f41487a));
        }
    }

    public PlatformContext(ReactContext reactContext) {
        this.f41484a = reactContext;
        this.mHybridData = initHybrid(reactContext.getResources().getDisplayMetrics().density);
    }

    private native HybridData initHybrid(float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void notifyTaskReadyNative();

    public final byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @InterfaceC4488a
    public Object createVideo(String str) {
        return new g(this.f41484a, str);
    }

    public void finalize() {
        this.mHybridData.resetNative();
        super.finalize();
    }

    @InterfaceC4488a
    public byte[] getJniStreamFromSource(String str) {
        int identifier = this.f41484a.getResources().getIdentifier(str, "drawable", this.f41484a.getPackageName());
        if (identifier == 0) {
            identifier = this.f41484a.getResources().getIdentifier(str, "raw", this.f41484a.getPackageName());
        }
        if (identifier != 0) {
            return c(this.f41484a.getResources().openRawResource(identifier));
        }
        try {
            URI uri = new URI(str);
            if (uri.getScheme() == null) {
                throw new Exception("Invalid URI scheme");
            }
            URL url = uri.toURL();
            url.openConnection().connect();
            return c(new BufferedInputStream(url.openStream(), 8192));
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (URISyntaxException e12) {
            e12.printStackTrace();
            return null;
        } catch (Exception e13) {
            e13.printStackTrace();
            return null;
        }
    }

    @InterfaceC4488a
    public void notifyTaskReady() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            notifyTaskReadyNative();
        } else {
            this.f41486c.post(new Runnable() { // from class: com.shopify.reactnative.skia.a
                @Override // java.lang.Runnable
                public final void run() {
                    PlatformContext.this.notifyTaskReadyNative();
                }
            });
        }
    }

    @InterfaceC4488a
    public void raise(String str) {
        this.f41486c.post(new a(str));
    }

    @InterfaceC4488a
    public Object takeScreenshotFromViewTag(int i10) {
        return o.k(this.f41484a, i10);
    }
}
