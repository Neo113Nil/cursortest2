package com.braze.triggers.events;

import android.util.Base64;
import com.braze.models.k;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;

/* loaded from: classes6.dex */
public abstract class i implements b {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* renamed from: a, reason: collision with root package name */
    public final long f813a;
    public final long b;
    public k c;

    public i() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.b = nowInMilliseconds;
        this.f813a = nowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            BrazeLogger.e(d, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    public final k b() {
        return this.c;
    }
}
