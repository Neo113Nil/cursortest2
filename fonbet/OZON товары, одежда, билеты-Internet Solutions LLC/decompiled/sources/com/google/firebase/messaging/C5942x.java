package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.C5923d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.messaging.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5942x implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f59749a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future<?> f59750b;

    /* renamed from: c, reason: collision with root package name */
    private Task<Bitmap> f59751c;

    private C5942x(URL url) {
        this.f59749a = url;
    }

    public static C5942x d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C5942x(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public final Bitmap c() throws IOException {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f59749a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] b11 = C5923d.b(new C5923d.a(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + b11.length + " bytes from " + url);
            }
            if (b11.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b11, 0, b11.length);
            if (decodeByteArray == null) {
                throw new IOException("Failed to decode image: " + url);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return decodeByteArray;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59750b.cancel(true);
    }

    public final Task<Bitmap> j() {
        return (Task) Preconditions.checkNotNull(this.f59751c);
    }

    public final void k(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59750b = executorService.submit(new IU.e(5, this, taskCompletionSource));
        this.f59751c = taskCompletionSource.getTask();
    }
}
