package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import xsna.bq70;
import xsna.da01;
import xsna.exc0;
import xsna.fmv;
import xsna.h601;
import xsna.xa4;
import xsna.znk0;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class MapsInitializer {
    public static boolean a = false;
    public static Renderer b = Renderer.LEGACY;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public static final class Renderer {

        @NonNull
        public static final Renderer LATEST;

        @NonNull
        public static final Renderer LEGACY;
        private static final /* synthetic */ Renderer[] zza;

        static {
            Renderer renderer = new Renderer("LEGACY", 0);
            LEGACY = renderer;
            Renderer renderer2 = new Renderer("LATEST", 1);
            LATEST = renderer2;
            zza = new Renderer[]{renderer, renderer2};
        }

        public Renderer() {
            throw null;
        }

        @NonNull
        public static Renderer valueOf(@NonNull String str) {
            return (Renderer) Enum.valueOf(Renderer.class, str);
        }

        @NonNull
        public static Renderer[] values() {
            return (Renderer[]) zza.clone();
        }
    }

    public static synchronized int a(@NonNull Context context) {
        synchronized (MapsInitializer.class) {
            try {
                exc0.j(context, "Context is null");
                "preferredRenderer: ".concat("null");
                if (a) {
                    return 0;
                }
                try {
                    da01 a2 = h601.a(context);
                    try {
                        fmv zze = a2.zze();
                        exc0.i(zze);
                        xa4.d = zze;
                        zzi zzj = a2.zzj();
                        if (znk0.c == null) {
                            exc0.j(zzj, "delegate must not be null");
                            znk0.c = zzj;
                        }
                        a = true;
                        try {
                            if (a2.zzd() == 2) {
                                b = Renderer.LATEST;
                            }
                            a2.G1(new bq70(context), 0);
                        } catch (RemoteException e) {
                            Log.e("MapsInitializer", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        "loadedRenderer: ".concat(String.valueOf(b));
                        return 0;
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (GooglePlayServicesNotAvailableException e3) {
                    return e3.errorCode;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
