package com.google.firebase.provider;

import android.content.ContentProvider;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.metrics.performance.appstart.content_provider.a;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.vn5;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    @Nullable
    public static final vn5 b;

    @NonNull
    public static final AtomicBoolean c;

    static {
        a.b("com.google.firebase.provider.FirebaseInitProvider.<clinit>(FirebaseInitProvider.java:38)");
        try {
            b = new vn5(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
            c = new AtomicBoolean(false);
        } finally {
            a.a("com.google.firebase.provider.FirebaseInitProvider.<clinit>(FirebaseInitProvider.java:38)");
        }
    }
}
