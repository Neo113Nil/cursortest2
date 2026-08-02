package com.my.tracker.obfuscated;

import android.text.TextUtils;
import android.util.Base64;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import ru.ok.android.commons.http.Http;
import xsna.jax0;
import xsna.ji;

/* loaded from: classes.dex */
public final class m2 {
    final o2 a;
    final y2 b;
    final int c;

    public static class a implements s0.a {
        private final s2[] a;
        private long b;

        private a(s2[] s2VarArr) {
            this.a = s2VarArr;
        }

        public static a a(s2[] s2VarArr) {
            return new a(s2VarArr);
        }

        public s2[] b() {
            return this.a;
        }

        public String toString() {
            String join = TextUtils.join(StringUtils.COMMA, this.a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream);
            } catch (Exception unused) {
            }
            StringBuilder sb = new StringBuilder("[ChunkProtobufPacket]\n| sendTimestamp = ");
            sb.append(this.b);
            sb.append("\n| contain ");
            jax0.a(this.a.length, " packets: ", join, "\n| content (base64): ", sb);
            sb.append(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
            sb.append("\n[/ChunkProtobufPacket]");
            return sb.toString();
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public String a() {
            return Http.ContentType.APPLICATION_OCTET_STREAM;
        }

        @Override // com.my.tracker.obfuscated.s0.a
        public void a(OutputStream outputStream) {
            q qVar = new q(16384);
            q qVar2 = new q(16384);
            for (s2 s2Var : this.a) {
                qVar.a();
                qVar2.a();
                a(s2Var, qVar2);
                qVar.a(1, qVar2);
                qVar.a(outputStream);
            }
        }

        public void a(long j) {
            this.b = j;
        }

        private void a(s2 s2Var, q qVar) {
            try {
                qVar.b(s2Var.b());
                qVar.a(4, this.b);
            } catch (Exception unused) {
                x2.b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");
            }
        }
    }

    private m2(int i, y2 y2Var, o2 o2Var) {
        this.c = i;
        this.a = o2Var;
        this.b = y2Var;
    }

    public static m2 a(int i, y2 y2Var, o2 o2Var) {
        return new m2(i, y2Var, o2Var);
    }

    public void b(a aVar) {
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        String p = this.b.p();
        aVar.a(System.currentTimeMillis());
        if (x2.a()) {
            x2.a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);
        }
        if (!s0.a(aVar, n, true).a(p).c()) {
            throw new Exception("packet didn't delivered to server");
        }
        x2.a("TimeSpentPacketSender: packet successfully delivered to server");
    }

    public void c() {
        x2.a("TimeSpentPacketSender: i'm notified about new packet");
        m.e(new Runnable() { // from class: xsna.j5z0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.m2.this.a();
            }
        });
    }

    public void a() {
        x2.a("TimeSpentPacketSender: start flushing database chunk...");
        try {
            a b = b();
            b(b);
            a(b);
            x2.a("TimeSpentPacketSender: database chunk successfully flushed");
        } catch (Exception e) {
            x2.b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e.getMessage());
        }
    }

    public void a(a aVar) {
        s2[] b = aVar.b();
        int length = b.length;
        long[] jArr = new long[length];
        for (int i = 0; i < b.length; i++) {
            jArr[i] = b[i].a();
        }
        this.a.a(jArr);
        x2.a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");
    }

    private a b() {
        s2[] a2 = this.a.a(this.c);
        int length = a2 == null ? 0 : a2.length;
        StringBuilder b = ji.b(length, "TimeSpentPacketSender: got database chunk, size = ", ", requested = ");
        b.append(this.c);
        x2.a(b.toString());
        if (length != 0) {
            return a.a(a2);
        }
        throw new Exception("database chunk is empty, nothing to send");
    }
}
