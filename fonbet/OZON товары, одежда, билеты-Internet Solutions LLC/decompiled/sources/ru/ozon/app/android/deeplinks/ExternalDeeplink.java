package ru.ozon.app.android.deeplinks;

import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/deeplinks/ExternalDeeplink;", "", "link", "Landroid/net/Uri;", "ref", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "getLink", "()Landroid/net/Uri;", "getRef", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExternalDeeplink {
    private final Uri link;
    private final Uri ref;

    public ExternalDeeplink(Uri uri, Uri uri2) {
        this.link = uri;
        this.ref = uri2;
    }

    public final Uri getLink() {
        return this.link;
    }

    public final Uri getRef() {
        return this.ref;
    }
}
