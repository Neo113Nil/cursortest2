package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzlm<FieldDescriptorType> extends zzln<FieldDescriptorType, Object> {
    zzlm(int i) {
        super(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zza() {
        if (!zze()) {
            for (int i = 0; i < zzb(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzb = zzb(i);
                if (((zzjc) zzb.getKey()).zze()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzc()) {
                if (((zzjc) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
