package com.margelo.nitro.nitrofetch;

import android.app.Application;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: NitroCronet.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroCronet;", "Lcom/margelo/nitro/nitrofetch/HybridNitroCronetSpec;", "<init>", "()V", "newUrlRequestBuilder", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestBuilderSpec;", "url", "", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroCronet extends HybridNitroCronetSpec {
    private static volatile CronetEngine engineRef;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ExecutorService> ioExecutor$delegate = LazyKt.lazy(new Function0() { // from class: com.margelo.nitro.nitrofetch.NitroCronet$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ExecutorService ioExecutor_delegate$lambda$2;
            ioExecutor_delegate$lambda$2 = NitroCronet.ioExecutor_delegate$lambda$2();
            return ioExecutor_delegate$lambda$2;
        }
    });

    @Override // com.margelo.nitro.nitrofetch.HybridNitroCronetSpec
    public HybridUrlRequestBuilderSpec newUrlRequestBuilder(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Companion companion = INSTANCE;
        return new NitroUrlRequestBuilder(companion.getOrCreateCronetEngine(), url, companion.getIoExecutor());
    }

    /* compiled from: NitroCronet.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\u0005J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroCronet$Companion;", "", "<init>", "()V", "engineRef", "Lorg/chromium/net/CronetEngine;", "ioExecutor", "Ljava/util/concurrent/Executor;", "getIoExecutor", "()Ljava/util/concurrent/Executor;", "ioExecutor$delegate", "Lkotlin/Lazy;", "getOrCreateCronetEngine", "currentApplication", "Landroid/app/Application;", "initialApplication", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Executor getIoExecutor() {
            Object value = NitroCronet.ioExecutor$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Executor) value;
        }

        public final CronetEngine getOrCreateCronetEngine() {
            Object obj;
            CronetEngine.Builder builder;
            CronetEngine cronetEngine = NitroCronet.engineRef;
            if (cronetEngine != null) {
                return cronetEngine;
            }
            synchronized (this) {
                CronetEngine cronetEngine2 = NitroCronet.engineRef;
                if (cronetEngine2 != null) {
                    return cronetEngine2;
                }
                Application currentApplication = NitroCronet.INSTANCE.currentApplication();
                if (currentApplication == null && (currentApplication = NitroCronet.INSTANCE.initialApplication()) == null) {
                    throw new IllegalStateException("NitroCronet: Application not available");
                }
                List<CronetProvider> allProviders = CronetProvider.getAllProviders(currentApplication);
                Intrinsics.checkNotNull(allProviders);
                Iterator<T> it = allProviders.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String name = ((CronetProvider) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (StringsKt.contains((CharSequence) name, (CharSequence) "Native", true)) {
                        break;
                    }
                }
                CronetProvider cronetProvider = (CronetProvider) obj;
                File file = new File(currentApplication.getCacheDir(), "nitro_cronet_cache");
                file.mkdirs();
                if (cronetProvider == null || (builder = cronetProvider.createBuilder()) == null) {
                    builder = new CronetEngine.Builder(currentApplication);
                }
                CronetEngine.Builder userAgent = builder.enableHttp2(true).enableQuic(true).enableBrotli(true).setStoragePath(file.getAbsolutePath()).setUserAgent("NitroCronet/1.0");
                userAgent.enableHttpCache(3, 52428800L);
                CronetEngine build = userAgent.build();
                Companion companion = NitroCronet.INSTANCE;
                NitroCronet.engineRef = build;
                Intrinsics.checkNotNull(build);
                return build;
            }
        }

        private final Application currentApplication() {
            try {
                Object invoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                if (invoke instanceof Application) {
                    return (Application) invoke;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        private final Application initialApplication() {
            try {
                Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
                if (invoke instanceof Application) {
                    return (Application) invoke;
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService ioExecutor_delegate$lambda$2() {
        return Executors.newFixedThreadPool(RangesKt.coerceAtLeast(Runtime.getRuntime().availableProcessors(), 2), new ThreadFactory() { // from class: com.margelo.nitro.nitrofetch.NitroCronet$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread ioExecutor_delegate$lambda$2$lambda$1;
                ioExecutor_delegate$lambda$2$lambda$1 = NitroCronet.ioExecutor_delegate$lambda$2$lambda$1(runnable);
                return ioExecutor_delegate$lambda$2$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread ioExecutor_delegate$lambda$2$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "NitroCronet-io");
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
}
