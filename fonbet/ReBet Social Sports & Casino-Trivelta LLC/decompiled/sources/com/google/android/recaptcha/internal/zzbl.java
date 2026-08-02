package com.google.android.recaptcha.internal;

import io.agora.rtc2.internal.RtcEngineEvent;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbl {

    @JvmField
    @NotNull
    public static final zzbl zza = new zzbl(9999);

    @JvmField
    @NotNull
    public static final zzbl zzb = new zzbl(1004);

    @JvmField
    @NotNull
    public static final zzbl zzc = new zzbl(1005);

    @JvmField
    @NotNull
    public static final zzbl zzd = new zzbl(RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_START_CALL_SUCCESS);

    @JvmField
    @NotNull
    public static final zzbl zze = new zzbl(RtcEngineEvent.EvtType.EVT_VIDEO_STOPPED);

    @JvmField
    @NotNull
    public static final zzbl zzf = new zzbl(1008);

    @JvmField
    @NotNull
    public static final zzbl zzg = new zzbl(1009);

    @JvmField
    @NotNull
    public static final zzbl zzh = new zzbl(1010);
    private final int zzi;

    private zzbl(int i10) {
        this.zzi = i10;
    }

    public final int zza() {
        return this.zzi;
    }
}
