package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import defpackage.lnb;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavg extends zzinf {
    public Date j;
    public Date k;
    public long l;
    public long m;
    public double n;
    public float o;
    public zzinp p;
    public long q;

    public zzavg() {
        super("mvhd");
        this.n = 1.0d;
        this.o = 1.0f;
        this.p = zzinp.j;
    }

    @Override // com.google.android.gms.internal.ads.zzind
    public final void b(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += NotificationCompat.FLAG_LOCAL_ONLY;
        }
        this.i = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.b) {
            c();
        }
        if (this.i == 1) {
            this.j = zzink.a(zzavc.b(byteBuffer));
            this.k = zzink.a(zzavc.b(byteBuffer));
            this.l = zzavc.a(byteBuffer);
            this.m = zzavc.b(byteBuffer);
        } else {
            this.j = zzink.a(zzavc.a(byteBuffer));
            this.k = zzink.a(zzavc.a(byteBuffer));
            this.l = zzavc.a(byteBuffer);
            this.m = zzavc.a(byteBuffer);
        }
        this.n = zzavc.c(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.o = ((short) ((r1[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        zzavc.a(byteBuffer);
        zzavc.a(byteBuffer);
        this.p = new zzinp(zzavc.c(byteBuffer), zzavc.c(byteBuffer), zzavc.c(byteBuffer), zzavc.c(byteBuffer), zzavc.d(byteBuffer), zzavc.d(byteBuffer), zzavc.d(byteBuffer), zzavc.c(byteBuffer), zzavc.c(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.q = zzavc.a(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.j);
        sb.append(";modificationTime=");
        sb.append(this.k);
        sb.append(";timescale=");
        sb.append(this.l);
        sb.append(";duration=");
        sb.append(this.m);
        sb.append(";rate=");
        sb.append(this.n);
        sb.append(";volume=");
        sb.append(this.o);
        sb.append(";matrix=");
        sb.append(this.p);
        sb.append(";nextTrackId=");
        return lnb.l(this.q, U3.j.e, sb);
    }
}
