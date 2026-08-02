package com.vk.superapp.browser.utils;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import io.reactivex.rxjava3.subjects.f;
import java.util.HashMap;
import kotlin.Pair;
import xsna.y7n0;

/* compiled from: SuperAppLoadingBroadcastReceiver.kt */
/* loaded from: classes6.dex */
public final class SuperAppLoadingBroadcastReceiver extends BroadcastReceiver {
    public static void a(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        if (i == 8) {
            HashMap<Long, f<Pair<Boolean, Integer>>> hashMap = y7n0.a;
            Pair<Boolean, Integer> pair = new Pair<>(Boolean.TRUE, 0);
            f<Pair<Boolean, Integer>> remove = y7n0.a.remove(Long.valueOf(j));
            if (remove != null) {
                remove.onNext(pair);
                return;
            }
            return;
        }
        if (i != 16) {
            return;
        }
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("reason"));
        HashMap<Long, f<Pair<Boolean, Integer>>> hashMap2 = y7n0.a;
        Pair<Boolean, Integer> pair2 = new Pair<>(Boolean.FALSE, Integer.valueOf(i2));
        f<Pair<Boolean, Integer>> remove2 = y7n0.a.remove(Long.valueOf(j));
        if (remove2 != null) {
            remove2.onNext(pair2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (TextUtils.equals("android.intent.action.DOWNLOAD_COMPLETE", intent.getAction())) {
                Cursor cursor = null;
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        throw null;
                    }
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(extras.getLong("extra_download_id"));
                    cursor = ((DownloadManager) context.getSystemService("download")).query(query);
                    if (cursor.moveToFirst()) {
                        a(cursor);
                    }
                    cursor.close();
                } catch (Throwable th) {
                    try {
                        cursor.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
