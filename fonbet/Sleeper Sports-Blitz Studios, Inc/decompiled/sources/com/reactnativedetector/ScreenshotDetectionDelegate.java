package com.reactnativedetector;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ScreenshotDetectionDelegate.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0012\u0010#\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0018H\u0002J\u001a\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/reactnativedetector/ScreenshotDetectionDelegate;", "", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/reactnativedetector/ScreenshotDetectionListener;", "<init>", "(Landroid/content/Context;Lcom/reactnativedetector/ScreenshotDetectionListener;)V", "getContext", "()Landroid/content/Context;", "getListener", "()Lcom/reactnativedetector/ScreenshotDetectionListener;", "contentObserver", "Landroid/database/ContentObserver;", "getContentObserver", "()Landroid/database/ContentObserver;", "setContentObserver", "(Landroid/database/ContentObserver;)V", "isListening", "", "()Z", "setListening", "(Z)V", "previousPath", "", "getPreviousPath", "()Ljava/lang/String;", "setPreviousPath", "(Ljava/lang/String;)V", "startScreenshotDetection", "", "stopScreenshotDetection", "onScreenCaptured", "path", "onScreenCapturedWithDeniedPermission", "isScreenshotPath", "getFilePathFromContentResolver", "uri", "Landroid/net/Uri;", "isReadExternalStoragePermissionGranted", "react-native-detector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScreenshotDetectionDelegate {
    public ContentObserver contentObserver;
    private final Context context;
    private boolean isListening;
    private final ScreenshotDetectionListener listener;
    private String previousPath;

    public ScreenshotDetectionDelegate(Context context, ScreenshotDetectionListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.listener = listener;
        this.previousPath = "";
    }

    public final Context getContext() {
        return this.context;
    }

    public final ScreenshotDetectionListener getListener() {
        return this.listener;
    }

    public final ContentObserver getContentObserver() {
        ContentObserver contentObserver = this.contentObserver;
        if (contentObserver != null) {
            return contentObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentObserver");
        return null;
    }

    public final void setContentObserver(ContentObserver contentObserver) {
        Intrinsics.checkNotNullParameter(contentObserver, "<set-?>");
        this.contentObserver = contentObserver;
    }

    /* renamed from: isListening, reason: from getter */
    public final boolean getIsListening() {
        return this.isListening;
    }

    public final void setListening(boolean z) {
        this.isListening = z;
    }

    public final String getPreviousPath() {
        return this.previousPath;
    }

    public final void setPreviousPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.previousPath = str;
    }

    public final void startScreenshotDetection() {
        final Handler handler = new Handler();
        setContentObserver(new ContentObserver(handler) { // from class: com.reactnativedetector.ScreenshotDetectionDelegate$startScreenshotDetection$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                boolean isReadExternalStoragePermissionGranted;
                String filePathFromContentResolver;
                boolean isScreenshotPath;
                super.onChange(selfChange, uri);
                isReadExternalStoragePermissionGranted = ScreenshotDetectionDelegate.this.isReadExternalStoragePermissionGranted();
                if (!isReadExternalStoragePermissionGranted || uri == null) {
                    ScreenshotDetectionDelegate.this.onScreenCapturedWithDeniedPermission();
                    return;
                }
                ScreenshotDetectionDelegate screenshotDetectionDelegate = ScreenshotDetectionDelegate.this;
                filePathFromContentResolver = screenshotDetectionDelegate.getFilePathFromContentResolver(screenshotDetectionDelegate.getContext(), uri);
                if (filePathFromContentResolver != null) {
                    isScreenshotPath = ScreenshotDetectionDelegate.this.isScreenshotPath(filePathFromContentResolver);
                    if (isScreenshotPath) {
                        ScreenshotDetectionDelegate.this.setPreviousPath(filePathFromContentResolver);
                        ScreenshotDetectionDelegate.this.onScreenCaptured(filePathFromContentResolver);
                    }
                }
            }
        });
        this.context.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, getContentObserver());
        this.isListening = true;
    }

    public final void stopScreenshotDetection() {
        this.context.getContentResolver().unregisterContentObserver(getContentObserver());
        this.isListening = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScreenCaptured(String path) {
        this.listener.onScreenCaptured(path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScreenCapturedWithDeniedPermission() {
        this.listener.onScreenCapturedWithDeniedPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isScreenshotPath(String path) {
        if (path != null) {
            String lowerCase = path.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "screenshots", false, 2, (Object) null) && !Intrinsics.areEqual(this.previousPath, path)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFilePathFromContentResolver(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name", "_data"}, null, null, null);
            if (query == null || !query.moveToFirst()) {
                return null;
            }
            String string = query.getString(query.getColumnIndex("_data"));
            query.close();
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReadExternalStoragePermissionGranted() {
        return ContextCompat.checkSelfPermission(this.context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
