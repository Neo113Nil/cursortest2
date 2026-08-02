package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
public final class zzfa implements zzey {

    @NotNull
    private final Lazy zza;

    public zzfa() {
        int i10 = zzav.zza;
        this.zza = LazyKt.lazy(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final zzsc zza(@NotNull String str, @NotNull zzto zztoVar) {
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = ((zzex) this.zza.getValue()).zza(str);
                    zzewVar.zzc();
                    zzewVar.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                    zzewVar.zzd();
                    return zzscVar;
                } catch (zzbd e10) {
                    if (zzewVar == null) {
                        throw e10;
                    }
                    if (!Intrinsics.areEqual(e10.zza(), zzba.zzau)) {
                        throw e10;
                    }
                    try {
                        throw zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                    } catch (Exception e11) {
                        throw new zzbd(zzbb.zzc, zzba.zzG, e11.getMessage());
                    }
                }
            } catch (Exception e12) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e12.getMessage());
            }
        } catch (Throwable th2) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th2;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    @NotNull
    public final String zzb(@NotNull String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty(Constants.ACCEPT_HEADER, "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return TextStreamsKt.readText(Intrinsics.areEqual("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
