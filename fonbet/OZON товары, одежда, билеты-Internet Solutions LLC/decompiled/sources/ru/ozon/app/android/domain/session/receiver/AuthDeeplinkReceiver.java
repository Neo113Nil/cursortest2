package ru.ozon.app.android.domain.session.receiver;

import Nc.C3669c;
import android.net.Uri;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/domain/session/receiver/AuthDeeplinkReceiver;", "", "<init>", "()V", "Lio/reactivex/p;", "Landroid/net/Uri;", "observe", "()Lio/reactivex/p;", "uri", "", "postValue", "(Landroid/net/Uri;)V", "LNc/c;", "kotlin.jvm.PlatformType", "deeplinkSubject", "LNc/c;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthDeeplinkReceiver {

    @NotNull
    private final C3669c<Uri> deeplinkSubject;

    public AuthDeeplinkReceiver() {
        C3669c<Uri> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.deeplinkSubject = d11;
    }

    @NotNull
    public final p<Uri> observe() {
        return this.deeplinkSubject;
    }

    public final void postValue(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.deeplinkSubject.onNext(uri);
    }
}
