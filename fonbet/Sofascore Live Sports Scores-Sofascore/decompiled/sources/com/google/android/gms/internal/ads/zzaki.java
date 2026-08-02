package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaki implements zzao {
    public final float a;
    public final int b;

    public zzaki(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaki.class == obj.getClass()) {
            zzaki zzakiVar = (zzaki) obj;
            if (this.a == zzakiVar.a && this.b == zzakiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fc6.a(this.a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + this.b;
    }

    public final String toString() {
        float f = this.a;
        int length = String.valueOf(f).length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }
}
