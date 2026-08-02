package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.c;
import com.google.android.gms.fitness.request.GoalsReadRequest;
import com.google.android.gms.fitness.result.GoalsResult;
import xsna.cv90;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzdo {
    public final cv90<GoalsResult> readCurrentGoals(c cVar, GoalsReadRequest goalsReadRequest) {
        return cVar.a(new zzdn(this, cVar, goalsReadRequest));
    }
}
