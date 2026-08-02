package com.vk.superapp.logs;

import android.content.ContentProvider;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import com.vk.metrics.performance.appstart.content_provider.a;
import java.io.FileNotFoundException;

/* compiled from: LogsFileProvider.kt */
/* loaded from: classes11.dex */
public final class LogsFileProvider extends FileProvider {
    public LogsFileProvider() {
        a.b("com.vk.superapp.logs.LogsFileProvider.<init>(LogsFileProvider.kt:41)");
        try {
        } finally {
            a.a("com.vk.superapp.logs.LogsFileProvider.<init>(LogsFileProvider.kt:41)");
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        if (getCallingPackage() != null) {
            return super.openAssetFile(uri, str);
        }
        return null;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (getCallingPackage() != null) {
            return super.openFile(uri, str);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final <T> ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, T t, ContentProvider.PipeDataWriter<T> pipeDataWriter) {
        ParcelFileDescriptor openPipeHelper = getCallingPackage() != null ? super.openPipeHelper(uri, str, bundle, t, pipeDataWriter) : null;
        if (openPipeHelper != null) {
            return openPipeHelper;
        }
        throw new FileNotFoundException("Can't find file for " + getCallingPackage() + ": " + uri);
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        if (getCallingPackage() != null) {
            return super.openTypedAssetFile(uri, str, bundle);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        if (getCallingPackage() != null) {
            return super.openAssetFile(uri, str, cancellationSignal);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        if (getCallingPackage() != null) {
            return super.openFile(uri, str);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        if (getCallingPackage() != null) {
            return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        return null;
    }
}
