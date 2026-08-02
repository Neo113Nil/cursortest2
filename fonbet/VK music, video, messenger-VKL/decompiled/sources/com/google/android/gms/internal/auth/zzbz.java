package com.google.android.gms.internal.auth;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    @Nullable
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            Log.e("AUTH", "Error serializing object.", e);
            return null;
        }
    }
}
