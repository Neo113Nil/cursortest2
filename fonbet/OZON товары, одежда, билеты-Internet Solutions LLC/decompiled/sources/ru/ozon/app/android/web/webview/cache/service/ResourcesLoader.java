package ru.ozon.app.android.web.webview.cache.service;

import Lm0.a;
import We.E;
import We.G;
import We.L;
import We.M;
import bd.C5652b;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/ResourcesLoader;", "", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "helper", "LWe/E;", "client", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;LWe/E;)V", "", ImagesContract.URL, "", "loadResource", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "LWe/E;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourcesLoader {

    @NotNull
    private final E client;

    @NotNull
    private final LocalCacheHelper helper;

    public ResourcesLoader(@NotNull LocalCacheHelper helper, @NotNull E client) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(client, "client");
        this.helper = helper;
        this.client = client;
    }

    public final boolean loadResource(@NotNull String url) {
        InputStream byteStream;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            G.a aVar = new G.a();
            aVar.k(url);
            L execute = this.client.a(aVar.b()).execute();
            if (!execute.v()) {
                return false;
            }
            File absoluteTempFileFromResourceUrl = this.helper.getAbsoluteTempFileFromResourceUrl(url);
            File parentFile = absoluteTempFileFromResourceUrl.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            M c11 = execute.c();
            if (c11 != null && (byteStream = c11.byteStream()) != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(absoluteTempFileFromResourceUrl);
                    try {
                        fileOutputStream.write(C5652b.c(byteStream));
                        Unit unit = Unit.f71690a;
                        fileOutputStream.close();
                        byteStream.close();
                    } finally {
                    }
                } finally {
                }
            }
            absoluteTempFileFromResourceUrl.renameTo(this.helper.getAbsoluteFileFromTempFile(absoluteTempFileFromResourceUrl));
            return true;
        } catch (Exception e11) {
            a.b bVar = a.f17149a;
            bVar.b("WebViewCache");
            bVar.e(e11);
            return false;
        }
    }
}
