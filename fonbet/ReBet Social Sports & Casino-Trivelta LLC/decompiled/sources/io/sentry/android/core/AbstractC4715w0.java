package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: io.sentry.android.core.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4715w0 extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.m f51330a = new io.sentry.android.core.internal.util.m();

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.f51330a.a(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.f51330a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f51330a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f51330a.a(this);
        return 0;
    }
}
