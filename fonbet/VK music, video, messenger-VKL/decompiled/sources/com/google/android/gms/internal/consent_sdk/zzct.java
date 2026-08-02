package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
public final class zzct {
    public static boolean zza(boolean z) {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith(PeerVideoSettingsBitrateTable.CODEC_GENERIC);
        }
        String str = Build.FINGERPRINT;
        return str.contains(PeerVideoSettingsBitrateTable.CODEC_GENERIC) || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
