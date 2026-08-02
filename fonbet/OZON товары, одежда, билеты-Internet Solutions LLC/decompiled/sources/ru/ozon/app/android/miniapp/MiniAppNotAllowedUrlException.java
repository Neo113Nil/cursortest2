package ru.ozon.app.android.miniapp;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/miniapp/MiniAppNotAllowedUrlException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MiniAppNotAllowedUrlException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppNotAllowedUrlException(@NotNull String url) {
        super("Not allowed url for MiniApp: " + url);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
