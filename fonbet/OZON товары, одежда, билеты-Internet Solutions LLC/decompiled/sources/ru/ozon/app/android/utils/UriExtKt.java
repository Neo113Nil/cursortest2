package ru.ozon.app.android.utils;

import K1.G;
import Nk.a;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\"#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"", "removeSchema", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "Landroid/content/ContentResolver;", "contentResolver", "", "getFileSize", "(Landroid/net/Uri;Landroid/content/ContentResolver;)J", "replaceUriForSelect", "", "replaceHostsForSelect", "Ljava/util/List;", "getReplaceHostsForSelect", "()Ljava/util/List;", "getReplaceHostsForSelect$annotations", "()V", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UriExtKt {

    @NotNull
    private static final List<String> replaceHostsForSelect = C7714v.b0("ozon.ru", "ozon.kz", "ozon.tm", "ozon.by", "ozon.com", "ozon.uz", "ozonru.me", "ozoncom.me", "ozon-stg.ozonru.me", "by-stg.ozonru.me", "tm-com.stg.ozonru.me", "kz-stg.ozoncom.me", "mn-stg.ozoncom.me");

    public static final long getFileSize(@NotNull Uri uri, @NotNull ContentResolver contentResolver) throws IOException {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
        if (openFileDescriptor == null) {
            throw new IOException(G.b(uri, "Can't extract file size for "));
        }
        try {
            long statSize = openFileDescriptor.getStatSize();
            openFileDescriptor.close();
            return statSize;
        } finally {
        }
    }

    @NotNull
    public static final String removeSchema(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String X9 = h.X(h.X(h.X(str, "ozon://", "/", false), "https://", "/", false), "http://", "/", false);
        return X9.length() == 0 ? "/" : X9;
    }

    @NotNull
    public static final String replaceUriForSelect(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !h.t(scheme, "http", false)) {
            String scheme2 = parse.getScheme();
            if (scheme2 == null) {
                scheme2 = "ozon";
            }
            return a.b("ozonselect", h.S(str, scheme2));
        }
        String host = parse.getHost();
        if (host != null) {
            String S11 = h.S(host, "www.");
            if (replaceHostsForSelect.contains(S11)) {
                str2 = h.X(str, host, "select." + S11, false);
            } else {
                str2 = str;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
