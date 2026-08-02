package com.google.android.gms.internal.measurement;

import com.socure.docv.capturesdk.core.parser.MrzParserKt;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
public enum zzfp implements zzjm {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);

    private final int zzh;

    @Override // com.google.android.gms.internal.measurement.zzjm
    public final int zza() {
        return this.zzh;
    }

    public static zzfp zza(int i) {
        if (i == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static zzjp zzb() {
        return zzfo.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return MrzParserKt.FILLER + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + Typography.greater;
    }

    zzfp(int i) {
        this.zzh = i;
    }
}
