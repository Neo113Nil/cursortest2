package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;

/* loaded from: classes9.dex */
final class zzi implements zzel {
    static final zzel zza = new zzi();

    private zzi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final boolean zza(int i11) {
        switch (i11) {
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
                return true;
            case 19:
            case 20:
            default:
                return false;
        }
    }
}
