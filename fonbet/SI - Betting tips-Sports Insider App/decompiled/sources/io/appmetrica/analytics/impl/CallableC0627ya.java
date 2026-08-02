package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0627ya implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0652za f14950a;

    public CallableC0627ya(C0652za c0652za) {
        this.f14950a = c0652za;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f14950a.f14992a.getContentResolver();
        C0652za c0652za = this.f14950a;
        c0652za.f14993b = contentResolver.query(parse, null, null, new String[]{c0652za.f14992a.getPackageName()}, null);
        Cursor cursor = this.f14950a.f14993b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f14950a.f14993b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C0359ng(string, this.f14950a.f14993b.getLong(1), this.f14950a.f14993b.getLong(2), EnumC0334mg.f14268d);
    }
}
