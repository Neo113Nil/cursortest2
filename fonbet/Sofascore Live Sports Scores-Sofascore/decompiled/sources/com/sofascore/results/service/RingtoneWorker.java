package com.sofascore.results.service;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.sofascore.results.R;
import defpackage.a5f;
import defpackage.ad2;
import defpackage.dmi;
import defpackage.f5g;
import defpackage.fcp;
import defpackage.jdb;
import defpackage.m6k;
import defpackage.p2g;
import defpackage.qv5;
import defpackage.r42;
import defpackage.rq3;
import defpackage.s42;
import defpackage.u2g;
import defpackage.uic;
import defpackage.w2g;
import defpackage.wt3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/results/service/RingtoneWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RingtoneWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RingtoneWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public final void a(SharedPreferences sharedPreferences) {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 29) {
            getApplicationContext().getContentResolver().delete(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "relative_path=?", new String[]{"Notifications/SofaScore/"});
        } else {
            File file = new File(Environment.getExternalStorageDirectory(), "Android/data/com.sofascore.results/");
            if (file.exists() && (listFiles = file.listFiles(new f5g())) != null) {
                for (File file2 : listFiles) {
                    Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(file2.getAbsolutePath());
                    if (contentUriForPath != null) {
                        getApplicationContext().getContentResolver().delete(contentUriForPath, "_data=?", new String[]{file2.getAbsolutePath()});
                    }
                    file2.delete();
                }
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.remove("PREF_SOUND_GOAL");
        edit.remove("PREF_SOUND_INFO");
        edit.remove("PREF_SOUND_START_FINISH");
        edit.apply();
    }

    public final void b(SharedPreferences.Editor editor, String str, String str2, int i, String str3) {
        InputStream openRawResource;
        if (Build.VERSION.SDK_INT >= 29) {
            openRawResource = getApplicationContext().getResources().openRawResource(i);
            openRawResource.getClass();
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            Pair pair = new Pair("_display_name", str.concat(".mp3"));
            Pair pair2 = new Pair("title", str);
            Pair pair3 = new Pair("mime_type", "audio/mp3");
            Pair pair4 = new Pair("relative_path", "Notifications/SofaScore/");
            Pair pair5 = new Pair("is_pending", 1);
            Pair pair6 = new Pair("artist", "SofaScore");
            Boolean bool = Boolean.FALSE;
            ContentValues d0 = fcp.d0(pair, pair2, pair3, pair4, pair5, pair6, new Pair("is_ringtone", bool), new Pair("is_notification", Boolean.TRUE), new Pair("is_alarm", bool), new Pair("is_music", bool));
            Uri insert = getApplicationContext().getContentResolver().insert(uri, d0);
            if (insert == null) {
                return;
            }
            OutputStream openOutputStream = getApplicationContext().getContentResolver().openOutputStream(insert);
            try {
                if (openOutputStream == null) {
                    return;
                }
                try {
                    m6k.z(openRawResource, openOutputStream);
                    openOutputStream.close();
                    openRawResource.close();
                    editor.putString(str3, insert.toString());
                    d0.clear();
                    d0.put("is_pending", (Integer) 0);
                    getApplicationContext().getContentResolver().update(insert, d0, null, null);
                } finally {
                }
            } finally {
            }
        } else {
            openRawResource = getApplicationContext().getResources().openRawResource(i);
            openRawResource.getClass();
            File file = new File(dmi.y(Environment.getExternalStorageDirectory().getAbsolutePath(), "/Android/data/com.sofascore.results/"));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2.concat(".mp3"));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    m6k.z(openRawResource, fileOutputStream);
                    fileOutputStream.close();
                    openRawResource.close();
                    Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(file2.getAbsolutePath());
                    if (contentUriForPath != null) {
                        Pair pair7 = new Pair("_data", file2.getAbsolutePath());
                        Pair pair8 = new Pair("title", str);
                        Pair pair9 = new Pair("_size", Long.valueOf(file2.length()));
                        Pair pair10 = new Pair("mime_type", "audio/mp3");
                        Pair pair11 = new Pair("artist", "SofaScore");
                        Boolean bool2 = Boolean.FALSE;
                        Uri insert2 = getApplicationContext().getContentResolver().insert(contentUriForPath, fcp.d0(pair7, pair8, pair9, pair10, pair11, new Pair("is_ringtone", bool2), new Pair("is_notification", Boolean.TRUE), new Pair("is_alarm", bool2), new Pair("is_music", bool2)));
                        if (insert2 != null) {
                            editor.putString(str3, insert2.toString());
                        }
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(rq3 rq3Var) {
        Object u2gVar;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext2 = applicationContext.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext2);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences sharedPreferences2 = sharedPreferences;
        try {
            p2g p2gVar = w2g.b;
            a(sharedPreferences2);
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.getClass();
            b(edit, "Sofascore Score", "sound_sofascore_score", R.raw.notification_sound_score, "PREF_SOUND_GOAL");
            b(edit, "Sofascore Info", "sound_sofascore_info", R.raw.notification_sound_info, "PREF_SOUND_INFO");
            b(edit, "Sofascore Start Finish", "sound_sofascore_start_finish", R.raw.notification_sound_start_finish, "PREF_SOUND_START_FINISH");
            edit.apply();
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!(u2gVar instanceof u2g)) {
            wt3.v(sharedPreferences2, "ADD_RINGTONE_PREFv2", false);
            ad2 ad2Var = qv5.a;
            qv5.a(s42.a);
        }
        if (w2g.a(u2gVar) != null) {
            ad2 ad2Var2 = qv5.a;
            qv5.a(r42.a);
        }
        return jdb.a();
    }
}
