package ru.ozon.app.android.minifyLink.data;

import com.squareup.moshi.j;
import kotlin.Metadata;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/minifyLink/data/MinifyLinkDTO;", "", "shortURL", "", "<init>", "(Ljava/lang/String;)V", "getShortURL", "()Ljava/lang/String;", "minify-link_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MinifyLinkDTO {
    private final String shortURL;

    public MinifyLinkDTO(String str) {
        this.shortURL = str;
    }

    public final String getShortURL() {
        return this.shortURL;
    }
}
