package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class K implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f37856a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Future f37857b;

    /* renamed from: c, reason: collision with root package name */
    public Task f37858c;

    public K(URL url) {
        this.f37856a = url;
    }

    public static K B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new K(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public static /* synthetic */ void d(K k10, TaskCompletionSource taskCompletionSource) {
        k10.getClass();
        try {
            taskCompletionSource.setResult(k10.k());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public Task J() {
        return (Task) AbstractC3191o.m(this.f37858c);
    }

    public void U(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f37857b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.J
            @Override // java.lang.Runnable
            public final void run() {
                K.d(K.this, taskCompletionSource);
            }
        });
        this.f37858c = taskCompletionSource.getTask();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37857b.cancel(true);
    }

    public Bitmap k() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f37856a);
        }
        byte[] r10 = r();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(r10, 0, r10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(this.f37856a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f37856a);
    }

    public final byte[] r() {
        URLConnection openConnection = this.f37856a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d10 = AbstractC3495b.d(AbstractC3495b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = d10.length;
                Objects.toString(this.f37856a);
            }
            if (d10.length <= 1048576) {
                return d10;
            }
            throw new IOException("Image exceeds max size of 1048576");
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
}
