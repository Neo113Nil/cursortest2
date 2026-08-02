package com.vk.upload.impl;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.vk.core.files.a;
import java.util.HashSet;
import xsna.n8o;
import xsna.vao;

/* loaded from: classes6.dex */
public class LoadingBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        int columnIndex;
        try {
            if (!TextUtils.equals("android.intent.action.DOWNLOAD_COMPLETE", intent.getAction())) {
                if (!TextUtils.equals("com.vkontakte.android.UPLOAD_RETRY", intent.getAction()) || (extras = intent.getExtras()) == null) {
                    return;
                }
                a.e(extras.getInt("task_id"));
                return;
            }
            Cursor cursor = null;
            try {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    return;
                }
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(extras2.getLong("extra_download_id"));
                cursor = ((DownloadManager) context.getSystemService("download")).query(query);
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(cursor.getColumnIndex("_id"));
                    if (cursor.getInt(cursor.getColumnIndex("status")) == 8) {
                        String string = cursor.getString(cursor.getColumnIndex("local_uri"));
                        Uri parse = Uri.parse(string);
                        if (vao.b.remove(Long.valueOf(j))) {
                            if (parse.getPath() != null && (columnIndex = cursor.getColumnIndex("uri")) != -1) {
                                vao.c.a(new n8o.b(cursor.getString(columnIndex), parse.getPath()));
                            }
                            HashSet<Long> hashSet = vao.a;
                            if (hashSet.contains(Long.valueOf(j))) {
                                hashSet.remove(Long.valueOf(j));
                                vao.g(context, string);
                            }
                        }
                    }
                }
                a.c.a(cursor);
            } catch (Throwable th) {
                a.c.a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            com.vk.metrics.eventtracking.b.a.q(th2);
        }
    }
}
