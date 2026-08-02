package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.E4;
import com.vk.metrics.performance.appstart.content_provider.a;
import xsna.i6n0;

/* loaded from: classes13.dex */
public class CrashProvider extends ContentProvider {
    Context a;
    E4 b;
    String c;
    UriMatcher d;
    Uri e;
    final int f;
    final int g;
    String h;
    String i;
    final String j;

    public CrashProvider() {
        a.b("com.ironsource.environment.CrashProvider.<init>(SourceFile:1)");
        try {
            this.d = new UriMatcher(-1);
            this.f = 1;
            this.g = 2;
            this.j = "REPORTS";
        } finally {
            a.a("com.ironsource.environment.CrashProvider.<init>(SourceFile:1)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.d.match(uri);
        if (match == 1) {
            return this.h;
        }
        if (match == 2) {
            return this.i;
        }
        throw new IllegalArgumentException(i6n0.a(uri, "Invalid URI: "));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("com.ironsource.environment.CrashProvider.onCreate(SourceFile:1)");
        try {
            this.a = getContext();
            this.b = new E4(this.a);
            this.c = this.a.getPackageName();
            this.e = Uri.parse("content://" + this.c + "/REPORTS");
            this.h = "vnd.android.cursor.dir/CrashReporter.Reports";
            this.i = "vnd.android.cursor.item/CrashReporter/Reports";
            return true;
        } finally {
            a.a("com.ironsource.environment.CrashProvider.onCreate(SourceFile:1)");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor c;
        a.b("com.ironsource.environment.CrashProvider.query(SourceFile:1)");
        try {
            int match = this.d.match(uri);
            if (match == 1) {
                c = E4.c();
            } else {
                if (match != 2) {
                    throw new IllegalArgumentException("Invalid URI: " + uri);
                }
                c = E4.a(Integer.parseInt(uri.getLastPathSegment()));
            }
            a.a("com.ironsource.environment.CrashProvider.query(SourceFile:1)");
            return c;
        } catch (Throwable th) {
            a.a("com.ironsource.environment.CrashProvider.query(SourceFile:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
