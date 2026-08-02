package com.google.android.gms.internal.fitness;

import android.app.PendingIntent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;
import xsna.cv90;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzey {
    public final cv90<Status> insertSession(c cVar, SessionInsertRequest sessionInsertRequest) {
        return cVar.a(new zzeq(this, cVar, sessionInsertRequest));
    }

    public final cv90<SessionReadResult> readSession(c cVar, SessionReadRequest sessionReadRequest) {
        return cVar.a(new zzer(this, cVar, sessionReadRequest));
    }

    public final cv90<Status> registerForSessions(c cVar, PendingIntent pendingIntent) {
        return cVar.b(new zzes(this, cVar, pendingIntent));
    }

    public final cv90<Status> startSession(c cVar, Session session) {
        exc0.j(session, "Session cannot be null");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        exc0.a("Cannot start a session which has already ended", timeUnit.convert(session.c, timeUnit) == 0);
        return cVar.b(new zzeo(this, cVar, session));
    }

    public final cv90<SessionStopResult> stopSession(c cVar, @Nullable String str) {
        return cVar.b(new zzep(this, cVar, null, str));
    }

    public final cv90<Status> unregisterForSessions(c cVar, PendingIntent pendingIntent) {
        return cVar.b(new zzet(this, cVar, pendingIntent));
    }
}
