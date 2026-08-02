package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes.dex */
public final class c {
    public static final Date d = new Date(-1);
    public static final Date e = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();

    /* compiled from: ConfigMetadataClient.java */
    public static class a {
        public int a;
        public Date b;
    }

    public c(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.c) {
            int i = this.a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            aVar = new a();
            aVar.a = i;
            aVar.b = date;
        }
        return aVar;
    }

    public final void b(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
