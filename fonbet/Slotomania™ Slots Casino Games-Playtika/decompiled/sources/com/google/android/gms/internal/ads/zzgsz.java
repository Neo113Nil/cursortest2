package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
enum zzgsz implements zzgsx {
    ALWAYS_TRUE,
    ALWAYS_FALSE,
    IS_NULL,
    NOT_NULL;

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }

    @Override // com.google.android.gms.internal.ads.zzgsx
    public final /* synthetic */ boolean zza(Object obj) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }
}
