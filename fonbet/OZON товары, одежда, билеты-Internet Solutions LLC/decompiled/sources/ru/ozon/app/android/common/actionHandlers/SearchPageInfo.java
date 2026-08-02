package ru.ozon.app.android.common.actionHandlers;

import G.g;
import Ul.C4070a;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/SearchPageInfo;", "", "Landroid/net/Uri;", "uri", "", "pageType", "text", "", "queryParameters", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getPageType", "getText", "Ljava/util/Map;", "getQueryParameters", "()Ljava/util/Map;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SearchPageInfo {

    @NotNull
    private final String pageType;

    @NotNull
    private final Map<String, String> queryParameters;

    @NotNull
    private final String text;

    @NotNull
    private final Uri uri;

    public SearchPageInfo(@NotNull Uri uri, @NotNull String pageType, @NotNull String text, @NotNull Map<String, String> queryParameters) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.uri = uri;
        this.pageType = pageType;
        this.text = text;
        this.queryParameters = queryParameters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchPageInfo)) {
            return false;
        }
        SearchPageInfo searchPageInfo = (SearchPageInfo) other;
        return Intrinsics.d(this.uri, searchPageInfo.uri) && Intrinsics.d(this.pageType, searchPageInfo.pageType) && Intrinsics.d(this.text, searchPageInfo.text) && Intrinsics.d(this.queryParameters, searchPageInfo.queryParameters);
    }

    @NotNull
    public final String getPageType() {
        return this.pageType;
    }

    @NotNull
    public final Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.queryParameters.hashCode() + g.a(g.a(this.uri.hashCode() * 31, 31, this.pageType), 31, this.text);
    }

    @NotNull
    public String toString() {
        Uri uri = this.uri;
        String str = this.pageType;
        String str2 = this.text;
        Map<String, String> map = this.queryParameters;
        StringBuilder sb2 = new StringBuilder("SearchPageInfo(uri=");
        sb2.append(uri);
        sb2.append(", pageType=");
        sb2.append(str);
        sb2.append(", text=");
        return C4070a.a(sb2, str2, ", queryParameters=", map, ")");
    }
}
