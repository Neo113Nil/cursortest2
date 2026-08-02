package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzind implements zzavd {
    public static final zzino h = zzino.b(zzind.class);
    public final String a;
    public ByteBuffer d;
    public long e;
    public zzini g;
    public long f = -1;
    public boolean c = true;
    public boolean b = true;

    public zzind(String str) {
        this.a = str;
    }

    public final synchronized void a() {
        try {
            if (this.c) {
                return;
            }
            try {
                zzino zzinoVar = h;
                String str = this.a;
                zzinoVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.d = this.g.a(this.e, this.f);
                this.c = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void b(ByteBuffer byteBuffer);

    public final synchronized void c() {
        try {
            a();
            zzino zzinoVar = h;
            String str = this.a;
            zzinoVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer != null) {
                this.b = true;
                byteBuffer.rewind();
                b(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavd
    public final void e(zzini zziniVar, ByteBuffer byteBuffer, long j, zzauz zzauzVar) {
        this.e = zziniVar.zzc();
        byteBuffer.remaining();
        this.f = j;
        this.g = zziniVar;
        zziniVar.l(zziniVar.zzc() + j);
        this.c = false;
        this.b = false;
        c();
    }
}
