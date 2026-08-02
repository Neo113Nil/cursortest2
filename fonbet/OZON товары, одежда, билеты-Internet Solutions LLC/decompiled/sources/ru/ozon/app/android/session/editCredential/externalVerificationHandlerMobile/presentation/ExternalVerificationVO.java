package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", ImagesContract.URL, "redirectUrl", "errorRedirectUrl", "action", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "J", "getId", "()J", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getRedirectUrl", "getErrorRedirectUrl", "getAction", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalVerificationVO implements c {
    private final String action;
    private final String errorRedirectUrl;
    private final long id;
    private final String redirectUrl;

    @NotNull
    private final String url;

    public ExternalVerificationVO(long j11, @NotNull String url, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = j11;
        this.url = url;
        this.redirectUrl = str;
        this.errorRedirectUrl = str2;
        this.action = str3;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getErrorRedirectUrl() {
        return this.errorRedirectUrl;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
