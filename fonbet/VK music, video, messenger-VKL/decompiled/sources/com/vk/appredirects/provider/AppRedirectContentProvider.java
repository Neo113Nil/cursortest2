package com.vk.appredirects.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import com.vk.appredirects.filter.AppRedirectOverrides;
import com.vk.metrics.performance.appstart.content_provider.a;
import java.net.URISyntaxException;
import java.util.Set;
import xsna.e83;
import xsna.gq;
import xsna.j5g;
import xsna.l83;
import xsna.lhg;

/* compiled from: AppRedirectContentProvider.kt */
/* loaded from: classes15.dex */
public final class AppRedirectContentProvider extends ContentProvider {
    public UriMatcher b;

    static {
        a.b("com.vk.appredirects.provider.AppRedirectContentProvider.<clinit>(AppRedirectContentProvider.kt)");
        try {
        } finally {
            a.a("com.vk.appredirects.provider.AppRedirectContentProvider.<clinit>(AppRedirectContentProvider.kt)");
        }
    }

    public AppRedirectContentProvider() {
        a.b("com.vk.appredirects.provider.AppRedirectContentProvider.<init>(AppRedirectContentProvider.kt:17)");
        try {
        } finally {
            a.a("com.vk.appredirects.provider.AppRedirectContentProvider.<init>(AppRedirectContentProvider.kt:17)");
        }
    }

    public final MatrixCursor a(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Intent uri is empty");
        }
        try {
            App app2 = App.values()[i];
            e83 b = new l83().b(getContext(), Intent.parseUri(str, 0), app2);
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"can_handle", "is_priority_handler", "is_override_handler"});
            matrixCursor.addRow(new Integer[]{Integer.valueOf(b.a ? 1 : 0), Integer.valueOf(b.b ? 1 : 0), Integer.valueOf(b.c ? 1 : 0)});
            return matrixCursor;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid intent uri", e);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (str == null) {
            throw new IllegalArgumentException("Empty selection");
        }
        UriMatcher uriMatcher = this.b;
        if (uriMatcher == null) {
            uriMatcher = null;
        }
        int match = uriMatcher.match(uri);
        if (match == -1 || match >= 100) {
            throw new IllegalArgumentException("Invalid uri");
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0 || parseInt >= LinkType.values().length) {
                throw new IllegalArgumentException(lhg.a(parseInt, "Invalid link type ordinal "));
            }
            LinkType linkType = LinkType.values()[parseInt];
            Context context = getContext();
            if (context == null) {
                return 0;
            }
            Set R0 = j5g.R0(AppRedirectOverrides.a(context));
            boolean remove = R0.remove(linkType);
            if (remove) {
                AppRedirectOverrides.c(context, R0);
            }
            return remove ? 1 : 2;
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Invalid selection: ".concat(str));
        }
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            throw new IllegalArgumentException("Empty content values");
        }
        UriMatcher uriMatcher = this.b;
        if (uriMatcher == null) {
            uriMatcher = null;
        }
        int match = uriMatcher.match(uri);
        if (match == -1 || match >= 100) {
            throw new IllegalArgumentException("Invalid uri");
        }
        Integer asInteger = contentValues.getAsInteger(CampaignEx.JSON_KEY_LINK_TYPE);
        if (asInteger.intValue() < 0 || asInteger.intValue() >= LinkType.values().length) {
            throw new IllegalArgumentException(gq.d(asInteger, "Invalid link type ordinal "));
        }
        LinkType linkType = LinkType.values()[asInteger.intValue()];
        Context context = getContext();
        if (context != null) {
            Set R0 = j5g.R0(AppRedirectOverrides.a(context));
            if (R0.add(linkType)) {
                AppRedirectOverrides.c(context, R0);
            }
        }
        return Uri.EMPTY;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.b("com.vk.appredirects.provider.AppRedirectContentProvider.onCreate(AppRedirectContentProvider.kt:22)");
        try {
            UriMatcher uriMatcher = new UriMatcher(-1);
            for (App app2 : App.values()) {
                uriMatcher.addURI(app2.i(), "deeplinks", app2.ordinal());
                uriMatcher.addURI(app2.i(), "version", app2.ordinal() + 100);
            }
            this.b = uriMatcher;
            a.a("com.vk.appredirects.provider.AppRedirectContentProvider.onCreate(AppRedirectContentProvider.kt:22)");
            return true;
        } catch (Throwable th) {
            a.a("com.vk.appredirects.provider.AppRedirectContentProvider.onCreate(AppRedirectContentProvider.kt:22)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor a;
        a.b("com.vk.appredirects.provider.AppRedirectContentProvider.query(AppRedirectContentProvider.kt:39)");
        try {
            UriMatcher uriMatcher = this.b;
            if (uriMatcher == null) {
                uriMatcher = null;
            }
            int match = uriMatcher.match(uri);
            int i = match % 100;
            if (i < 0 || i >= App.values().length) {
                throw new IllegalArgumentException("Unrecognized URI: " + uri);
            }
            int i2 = match / 100;
            if (i2 == 0) {
                a = a(i, str);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("Invalid request");
                }
                a = new MatrixCursor(new String[]{"version"});
                a.addRow(new Integer[]{1});
            }
            a.a("com.vk.appredirects.provider.AppRedirectContentProvider.query(AppRedirectContentProvider.kt:39)");
            return a;
        } catch (Throwable th) {
            a.a("com.vk.appredirects.provider.AppRedirectContentProvider.query(AppRedirectContentProvider.kt:39)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
