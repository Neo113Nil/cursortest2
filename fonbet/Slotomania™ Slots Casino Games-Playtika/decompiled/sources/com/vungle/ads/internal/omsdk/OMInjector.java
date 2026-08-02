package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.reporters.b;
import com.vungle.ads.R;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: OMInjector.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000eJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/omsdk/OMInjector;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cachedOMSDKJS", "Ljava/util/concurrent/atomic/AtomicReference;", "", "cachedOMSessionJS", "getContext", "()Landroid/content/Context;", "uiHandler", "Landroid/os/Handler;", "getOMSDKJS", "getOMSDKJS$vungle_ads_release", "getOMSessionJS", "init", "", "injectJsFiles", "", "Ljava/io/File;", "dir", "injectJsFiles$vungle_ads_release", "loadJsFromRaw", "resId", "", "writeToFile", b.d, "outputFile", k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class OMInjector {
    private static final String TAG = "OMInjector";
    private AtomicReference<String> cachedOMSDKJS;
    private AtomicReference<String> cachedOMSessionJS;
    private final Context context;
    private final Handler uiHandler;

    public OMInjector(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.OMInjector$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OMInjector.m10696init$lambda2(OMInjector.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m10696init$lambda2(OMInjector this$0) {
        Object m11180constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!Omid.isActive()) {
                Omid.activate(this$0.context);
            }
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "error: " + m11183exceptionOrNullimpl.getLocalizedMessage());
        }
    }

    public final List<File> injectJsFiles$vungle_ads_release(File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, Constants.OM_SDK_JS);
        if (!file.exists()) {
            Logger.INSTANCE.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, Constants.OM_SESSION_JS);
        if (!file2.exists()) {
            Logger.INSTANCE.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }

    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String loadJsFromRaw = loadJsFromRaw(R.raw.omsdk_v1_6_2);
        this.cachedOMSDKJS.set(loadJsFromRaw);
        return loadJsFromRaw;
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String loadJsFromRaw = loadJsFromRaw(R.raw.omid_session_client_v1_6_2);
        this.cachedOMSessionJS.set(loadJsFromRaw);
        return loadJsFromRaw;
    }

    private final String loadJsFromRaw(int resId) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            OMInjector oMInjector = this;
            InputStream openRawResource = this.context.getResources().openRawResource(resId);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRawResource(resId)");
            Reader inputStreamReader = new InputStreamReader(openRawResource, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                m11180constructorimpl = Result.m11180constructorimpl(readText);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
    }

    private final File writeToFile(String lines, File outputFile) {
        if (lines == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(outputFile);
        try {
            FileWriter fileWriter2 = fileWriter;
            fileWriter2.write(lines);
            fileWriter2.flush();
            CloseableKt.closeFinally(fileWriter, null);
            return outputFile;
        } finally {
        }
    }
}
