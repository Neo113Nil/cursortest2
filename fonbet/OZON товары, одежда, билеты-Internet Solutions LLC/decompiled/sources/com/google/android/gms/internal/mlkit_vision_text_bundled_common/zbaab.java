package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes9.dex */
final class zbaab implements zbuj {
    static final zbuj zba = new zbaab();

    private zbaab() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj
    public final boolean zba(int i11) {
        if (i11 == 3000 || i11 == 4000 || i11 == 5000 || i11 == 6000 || i11 == 6001 || i11 == 7000 || i11 == 7001) {
            return true;
        }
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i11) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        return true;
                    default:
                        switch (i11) {
                            case 40:
                            case 41:
                            case 42:
                                return true;
                            default:
                                switch (i11) {
                                    case 1000:
                                    case 1001:
                                    case 1002:
                                    case 1003:
                                    case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                                    case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                                    case 1006:
                                    case 1007:
                                    case 1008:
                                    case 1009:
                                    case 1010:
                                    case 1011:
                                    case 1012:
                                    case 1013:
                                    case 1014:
                                    case 1015:
                                    case 1016:
                                        return true;
                                    default:
                                        switch (i11) {
                                            case 2000:
                                            case 2001:
                                            case 2002:
                                            case 2003:
                                                return true;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
        }
    }
}
