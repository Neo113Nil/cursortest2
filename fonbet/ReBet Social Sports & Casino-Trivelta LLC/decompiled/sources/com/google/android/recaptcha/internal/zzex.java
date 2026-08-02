package com.google.android.recaptcha.internal;

import com.twilio.voice.VoiceURLConnection;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzex {

    @NotNull
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final zzew zza(@NotNull String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
            zza.setDoOutput(true);
            zza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e11.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = new zzfm();
    }
}
