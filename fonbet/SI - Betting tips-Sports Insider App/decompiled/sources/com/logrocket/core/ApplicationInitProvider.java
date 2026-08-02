package com.logrocket.core;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ApplicationInitProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final long f6378b = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public static final i f6379c = new i();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6380a = false;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.e("LogRocket", "Unable to get application context!");
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !Application.class.isAssignableFrom(applicationContext.getClass())) {
            Log.e("LogRocket", "The provided context does not have a valid Application instance attached.");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z5 = this.f6380a;
        i iVar = f6379c;
        if (!z5) {
            iVar.a(f6378b, eh.d.APPLICATION_INITIALIZED);
        }
        iVar.a(currentTimeMillis, eh.d.CONTENT_PROVIDER_CREATED);
        this.f6380a = true;
        ((Application) context).registerActivityLifecycleCallbacks(iVar);
        n.a();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
