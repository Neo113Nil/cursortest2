package ru.ozon.app.android.pikazon.glide.exception;

import Nk.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.ConnectException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/glide/exception/UntrustedHostException;", "Ljava/net/ConnectException;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "message", "getMessage", "()Ljava/lang/String;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UntrustedHostException extends ConnectException {

    @NotNull
    private final String message;

    public UntrustedHostException(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.message = a.b("This host is absent in domains whitelist, ", url);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
