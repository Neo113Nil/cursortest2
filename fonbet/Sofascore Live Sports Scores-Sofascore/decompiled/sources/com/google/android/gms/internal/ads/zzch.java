package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.os.Handler;
import defpackage.arn;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzch {
    public final arn a;
    public final Handler b;
    public final zzd c;
    public final AudioFocusRequest d;

    public zzch(arn arnVar, Handler handler, zzd zzdVar, boolean z) {
        this.b = handler;
        this.c = zzdVar;
        this.a = arnVar;
        this.d = new AudioFocusRequest.Builder(1).setAudioAttributes(zzdVar.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(arnVar, handler).setAcceptsDelayedFocusGain(z).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzch) {
            zzch zzchVar = (zzch) obj;
            if (this.a == zzchVar.a && this.b.equals(zzchVar.b) && Objects.equals(this.c, zzchVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(1, this.a, this.b, this.c, Boolean.FALSE);
    }
}
