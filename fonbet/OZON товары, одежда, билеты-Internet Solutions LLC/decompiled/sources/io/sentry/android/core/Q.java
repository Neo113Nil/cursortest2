package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
abstract class Q extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.e f66960a = new io.sentry.android.core.internal.util.e();

    Q() {
    }

    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, String str, String[] strArr) {
        this.f66960a.a(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(@NotNull Uri uri, ContentValues contentValues) {
        this.f66960a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(@NotNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f66960a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f66960a.a(this);
        return 0;
    }
}
