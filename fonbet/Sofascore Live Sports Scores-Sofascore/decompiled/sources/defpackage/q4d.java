package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q4d implements Runnable {
    public static final int[] u = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};
    public final p4d a;
    public ByteBuffer b;
    public boolean c;
    public String d;
    public final char[] e;
    public int f;
    public final char[] g;
    public int h;
    public int i;
    public j0a j;
    public byte[] k;
    public byte[] l;
    public int m;
    public int n;
    public final byte[] o;
    public int p;
    public Future q;
    public Future r;
    public soh s;
    public final AtomicBoolean t = new AtomicBoolean(false);

    public q4d(p4d p4dVar) {
        this.a = p4dVar;
        CompletableFuture completableFuture = new CompletableFuture();
        this.q = completableFuture;
        completableFuture.complete(Boolean.TRUE);
        p4dVar.a.getClass();
        this.b = ByteBuffer.allocate(4096);
        this.g = new char[4096];
        this.e = new char[4];
        this.o = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
        this.p = 0;
    }

    public static String g(char[] cArr, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        if (i == 3) {
            char c13 = cArr[0];
            if ((c13 == 'M' || c13 == 'm') && (((c11 = cArr[1]) == 'S' || c11 == 's') && ((c12 = cArr[2]) == 'G' || c12 == 'g'))) {
                return "MSG";
            }
            if (c13 != '+') {
                return "UNKNOWN";
            }
            char c14 = cArr[1];
            if (c14 != 'O' && c14 != 'o') {
                return "UNKNOWN";
            }
            char c15 = cArr[2];
            return (c15 == 'K' || c15 == 'k') ? "+OK" : "UNKNOWN";
        }
        if (i != 4) {
            return "UNKNOWN";
        }
        char c16 = cArr[1];
        if (c16 == 'I' || c16 == 'i') {
            c = 3;
            char c17 = cArr[0];
            if ((c17 == 'P' || c17 == 'p') && (((c2 = cArr[2]) == 'N' || c2 == 'n') && ((c3 = cArr[3]) == 'G' || c3 == 'g'))) {
                return "PING";
            }
        } else {
            c = 3;
        }
        if ((c16 == 'O' || c16 == 'o') && (((c4 = cArr[0]) == 'P' || c4 == 'p') && (((c5 = cArr[2]) == 'N' || c5 == 'n') && ((c6 = cArr[c]) == 'G' || c6 == 'g')))) {
            return "PONG";
        }
        char c18 = cArr[0];
        if (c18 == '-' && ((c16 == 'E' || c16 == 'e') && (((c9 = cArr[2]) == 'R' || c9 == 'r') && ((c10 = cArr[c]) == 'R' || c10 == 'r')))) {
            return "-ERR";
        }
        if ((c18 == 'I' || c18 == 'i') && ((c16 == 'N' || c16 == 'n') && (((c7 = cArr[2]) == 'F' || c7 == 'f') && ((c8 = cArr[c]) == 'O' || c8 == 'o')))) {
            return "INFO";
        }
        if (c18 != 'H' && c18 != 'h') {
            return "UNKNOWN";
        }
        if (c16 != 'M' && c16 != 'm') {
            return "UNKNOWN";
        }
        char c19 = cArr[2];
        if (c19 != 'S' && c19 != 's') {
            return "UNKNOWN";
        }
        char c20 = cArr[c];
        return (c20 == 'G' || c20 == 'g') ? "HMSG" : "UNKNOWN";
    }

    public static int h(String str) {
        int length = str.length();
        if (length > 10) {
            throw new NumberFormatException(vxd.k(length, "Long in message length \"", str, "\" ", " > 10"));
        }
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            char charAt = str.charAt(i2);
            int i3 = charAt - '0';
            if (i3 > 9) {
                throw new NumberFormatException("Invalid char in message length '" + charAt + "'");
            }
            i += i3 * u[(length - i2) - 1];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025c, code lost:
    
        r5 = "Nats-Stream";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0266, code lost:
    
        if (r6.a(5, defpackage.b5d.e) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0268, code lost:
    
        r5 = "Nats-Sequence";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0272, code lost:
    
        if (r6.a(5, defpackage.b5d.f) == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0274, code lost:
    
        r5 = "Nats-Time-Stamp";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x027e, code lost:
    
        if (r6.a(5, defpackage.b5d.g) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0280, code lost:
    
        r5 = "Nats-Subject";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028a, code lost:
    
        if (r6.a(5, defpackage.b5d.h) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028c, code lost:
    
        r5 = "Nats-Last-Sequence";
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0296, code lost:
    
        if (r6.a(5, defpackage.b5d.i) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0298, code lost:
    
        r5 = "Nats-Num-Pending";
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a2, code lost:
    
        if (r6.a(5, defpackage.b5d.a) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a4, code lost:
    
        r5 = "Nats-Consumer-Stalled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ae, code lost:
    
        if (r6.a(5, defpackage.b5d.b) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b0, code lost:
    
        r5 = "Nats-Msg-Size";
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02bb, code lost:
    
        if (r6.a(5, defpackage.b5d.c) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02bd, code lost:
    
        r5 = "Nats-Marker-Reason";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02c8, code lost:
    
        if (r6.a(5, defpackage.b5d.j) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ca, code lost:
    
        r5 = "Nats-Pending-Messages";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ce, code lost:
    
        r13 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d5, code lost:
    
        if (r6.a(5, defpackage.b5d.k) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d7, code lost:
    
        r5 = "Nats-Pending-Bytes";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02da, code lost:
    
        r5 = r6.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0219, code lost:
    
        if (r7.b != 2) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x021b, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0300, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header composition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0304, code lost:
    
        if (r6.b != 2) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031e, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header composition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0324, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header composition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00b4, code lost:
    
        if (r11 <= 10) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00b6, code lost:
    
        r8 = r13[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00ba, code lost:
    
        if (r8 == 66) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00be, code lost:
    
        if (r8 == 67) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00c2, code lost:
    
        if (r8 == 69) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c6, code lost:
    
        if (r8 == 70) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00ca, code lost:
    
        if (r8 == 73) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00ce, code lost:
    
        if (r8 == 83) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00d0, code lost:
    
        switch(r8) {
            case 76: goto L69;
            case 77: goto L66;
            case 78: goto L60;
            default: goto L59;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01a4, code lost:
    
        r7 = r7.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00db, code lost:
    
        if (r7.a(1, defpackage.wei.e) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00dd, code lost:
    
        r7 = "No Responders Available For Request";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00e7, code lost:
    
        if (r7.a(1, defpackage.wei.h) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00e9, code lost:
    
        r7 = "No Messages";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00f3, code lost:
    
        if (r7.a(1, defpackage.wei.k) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r6 != r4.length) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00f5, code lost:
    
        r7 = "Message Size Exceeds MaxBytes";
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00ff, code lost:
    
        if (r7.a(1, defpackage.wei.r) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0101, code lost:
    
        r7 = "Leadership Change";
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x010b, code lost:
    
        if (r7.a(1, defpackage.wei.q) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x010d, code lost:
    
        r7 = "Server Shutdown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0117, code lost:
    
        if (r7.a(1, defpackage.wei.d) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0119, code lost:
    
        r7 = "Idle Heartbeat";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r1 = r18.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0123, code lost:
    
        if (r7.a(1, defpackage.wei.c) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0125, code lost:
    
        r7 = "FlowControl Request";
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0129, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x012c, code lost:
    
        if (r8 >= defpackage.wjj.i) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0136, code lost:
    
        if (defpackage.wjj.h[r8] == r13[r10 + r8]) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x013a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0146, code lost:
    
        if (r7.a(8, defpackage.wei.l) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0148, code lost:
    
        r7 = "Exceeded MaxWaiting";
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0151, code lost:
    
        if (r7.a(8, defpackage.wei.m) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0153, code lost:
    
        r7 = "Exceeded MaxRequestBatch";
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x015c, code lost:
    
        if (r7.a(8, defpackage.wei.n) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x015e, code lost:
    
        r7 = "Exceeded MaxRequestExpires";
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0167, code lost:
    
        if (r7.a(8, defpackage.wei.o) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0169, code lost:
    
        r7 = "Exceeded MaxRequestMaxBytes";
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0172, code lost:
    
        if (r7.a(1, defpackage.wei.i) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0174, code lost:
    
        r7 = "Consumer Deleted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x017d, code lost:
    
        if (r7.a(1, defpackage.wei.j) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x017f, code lost:
    
        r7 = "Consumer is push based";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r4.length == 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0188, code lost:
    
        if (r7.a(1, defpackage.wei.p) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x018a, code lost:
    
        r7 = "Batch Completed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0193, code lost:
    
        if (r7.a(1, defpackage.wei.g) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0195, code lost:
    
        r7 = "Bad Request";
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x019f, code lost:
    
        if (r7.a(0, defpackage.wei.f) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01a1, code lost:
    
        r7 = "EOB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01c8, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header status code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00a0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01ce, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header status code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0090, code lost:
    
        if (r7.b != 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0092, code lost:
    
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x01d4, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header composition");
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01d8, code lost:
    
        r2 = 2;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r5 = defpackage.t4d.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x032c, code lost:
    
        throw new java.lang.IllegalArgumentException("Serialized header cannot be null or empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01d5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0337, code lost:
    
        defpackage.cp4.i("Gather Header", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x033c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0334, code lost:
    
        throw new java.lang.IllegalStateException("Bad socket data, headers do not match expected length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r3 >= r5) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r4[r3] != defpackage.t4d.e[r3]) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header version");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r3 = r4.length;
        r6 = new defpackage.wjj(r3, r3 - 2, 2, r4);
        r7 = new defpackage.wjj(r3, r5, 0, r4);
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r7.b(1) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        r9 = new defpackage.wjj(r4, r3, r7, 4);
        r7 = new defpackage.wjj(r4, r3, r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r7.b(1) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r14 = new defpackage.wjj(r4, r3, r7, 5);
        r14 = new defpackage.wjj(r4, r3, r14, 2);
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r9.e == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r9 = r9.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        if (r9 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        r9 = java.lang.Integer.parseInt(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r10 = r7.c;
        r13 = r7.a;
        r11 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        if (r11 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a8, code lost:
    
        r15 = new defpackage.wei(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01af, code lost:
    
        if (r14.c != r6.c) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b5, code lost:
    
        if (r14.d != r6.d) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01bb, code lost:
    
        if (r14.b != r6.b) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0306, code lost:
    
        r1.getClass();
        r1.g = r8;
        r1.h = r15;
        r1.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0310, code lost:
    
        r18.k = null;
        r18.m = -1;
        r18.i = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0318, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c0, code lost:
    
        r7 = r14;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01de, code lost:
    
        if (r7.b(r2) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e0, code lost:
    
        r6 = new defpackage.wjj(r4, r3, r7, 0);
        r8 = null;
        r9 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        if (r6.b(r9) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f0, code lost:
    
        r6 = new defpackage.wjj(r4, r3, r7, 3);
        r7 = new defpackage.wjj(r4, r3, r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0200, code lost:
    
        if (r7.b(r5) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0202, code lost:
    
        r7 = new defpackage.wjj(r4, r3, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020d, code lost:
    
        if (r7.b(5) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020f, code lost:
    
        r9 = new defpackage.wjj(r4, r3, r7, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021c, code lost:
    
        if (r8 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021e, code lost:
    
        r8 = new defpackage.p89();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0223, code lost:
    
        r10 = r8;
        r11 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0226, code lost:
    
        if (r11 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0228, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0229, code lost:
    
        r13 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e0, code lost:
    
        if (r7.e == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02e2, code lost:
    
        r6 = r7.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e8, code lost:
    
        r8.a(r5, r6);
        r6 = new defpackage.wjj(r4, r3, r9, 0);
        r7 = r9;
        r8 = r10;
        r9 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e7, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x022c, code lost:
    
        r13 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022d, code lost:
    
        if (r11 <= 5) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0231, code lost:
    
        if (r11 >= 4) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023e, code lost:
    
        if (defpackage.wjj.g[r11] == r6.a[r6.c + r11]) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0247, code lost:
    
        if (r6.a(0, defpackage.b5d.l) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0249, code lost:
    
        r5 = "KV-Operation";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024c, code lost:
    
        r13 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025a, code lost:
    
        if (r6.a(5, defpackage.b5d.d) == false) goto L168;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        while (true) {
            try {
                int i2 = this.p;
                if (i2 >= i) {
                    return;
                }
                int i3 = i - i2;
                byte[] bArr = this.k;
                int length = bArr.length;
                int i4 = this.m;
                int i5 = length - i4;
                byte[] bArr2 = this.o;
                if (i5 > 0 && i5 <= i3) {
                    System.arraycopy(bArr2, i2, bArr, i4, i5);
                    this.m += i5;
                    this.p += i5;
                } else {
                    if (i5 <= 0) {
                        break;
                    }
                    System.arraycopy(bArr2, i2, bArr, i4, i3);
                    this.m += i3;
                    this.p += i3;
                }
            } catch (IllegalStateException | NullPointerException e) {
                e = e;
            }
        }
    }

    public final void b(int i) {
        while (true) {
            try {
                int i2 = this.p;
                if (i2 >= i) {
                    return;
                }
                int i3 = i - i2;
                byte[] bArr = this.l;
                int length = bArr.length;
                int i4 = this.n;
                int i5 = length - i4;
                byte[] bArr2 = this.o;
                if (i5 > 0 && i5 <= i3) {
                    System.arraycopy(bArr2, i2, bArr, i4, i5);
                    this.n += i5;
                    this.p += i5;
                } else if (i5 > 0) {
                    System.arraycopy(bArr2, i2, bArr, i4, i3);
                    this.n += i3;
                    this.p += i3;
                } else {
                    byte b = bArr2[i2];
                    this.p = i2 + 1;
                    if (this.c) {
                        if (b != 10) {
                            throw new IllegalStateException("Bad socket data, no LF after CR");
                        }
                        j0a j0aVar = this.j;
                        j0aVar.f = bArr;
                        this.a.n(j0aVar.a());
                        this.l = null;
                        this.n = 0;
                        this.j = null;
                        this.c = false;
                        this.d = "UNKNOWN";
                        this.i = 1;
                        return;
                    }
                    if (b != 13) {
                        throw new IllegalStateException("Bad socket data, no CRLF after data");
                    }
                    this.c = true;
                }
            } catch (IllegalStateException | NullPointerException e) {
                cp4.i("Gather Message Data", e);
                return;
            }
        }
    }

    public final void c(int i) {
        while (true) {
            try {
                int i2 = this.p;
                if (i2 >= i) {
                    return;
                }
                byte b = this.o[i2];
                this.p = i2 + 1;
                if (this.c) {
                    if (b != 10) {
                        throw new IllegalStateException("Bad socket data, no LF after CR");
                    }
                    this.i = 4;
                    this.c = false;
                    return;
                }
                if (b == 13) {
                    this.c = true;
                } else {
                    int i3 = this.h;
                    char[] cArr = this.g;
                    if (i3 >= cArr.length) {
                        throw new IllegalStateException("Protocol line is too long");
                    }
                    cArr[i3] = (char) b;
                    this.h = i3 + 1;
                }
            } catch (IllegalStateException | NullPointerException | NumberFormatException e) {
                cp4.i("Gather Message", e);
                return;
            }
        }
    }

    public final void d(int i) {
        char[] cArr;
        while (true) {
            try {
                int i2 = this.p;
                if (i2 >= i) {
                    return;
                }
                byte b = this.o[i2];
                this.p = i2 + 1;
                boolean z = this.c;
                cArr = this.e;
                if (!z) {
                    if (b == 32 || b == 9) {
                        break;
                    }
                    if (b == 13) {
                        this.c = true;
                    } else {
                        int i3 = this.f;
                        cArr[i3] = (char) b;
                        this.f = i3 + 1;
                    }
                } else {
                    if (b != 10) {
                        throw new IllegalStateException("Bad socket data, no LF after CR");
                    }
                    this.d = g(cArr, this.f);
                    this.c = false;
                    this.f = 0;
                    this.i = 4;
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalStateException | NullPointerException | NumberFormatException e) {
                cp4.i("Gather Operation", e);
                return;
            }
        }
        String g = g(cArr, this.f);
        this.d = g;
        this.f = 0;
        if (!g.equals("MSG") && !this.d.equals("HMSG")) {
            this.i = 2;
            return;
        }
        this.h = 0;
        this.i = 3;
    }

    public final void e(int i) {
        while (true) {
            try {
                int i2 = this.p;
                if (i2 >= i) {
                    return;
                }
                byte b = this.o[i2];
                this.p = i2 + 1;
                if (this.c) {
                    if (b != 10) {
                        throw new IllegalStateException("Bad socket data, no LF after CR");
                    }
                    this.b.flip();
                    this.i = 4;
                    this.c = false;
                    return;
                }
                if (b == 13) {
                    this.c = true;
                } else {
                    if (!this.b.hasRemaining()) {
                        ByteBuffer byteBuffer = this.b;
                        try {
                            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity() * 2);
                            byteBuffer.flip();
                            allocate.put(byteBuffer);
                            this.b = allocate;
                        } catch (NullPointerException e) {
                            e = e;
                            cp4.i("Gather Protocol", e);
                            return;
                        } catch (NumberFormatException e2) {
                            e = e2;
                            cp4.i("Gather Protocol", e);
                            return;
                        }
                    }
                    this.b.put(b);
                }
            } catch (IllegalStateException | NullPointerException | NumberFormatException e3) {
                e = e3;
            }
        }
    }

    public final String f(int i) {
        char[] cArr;
        char c;
        int i2 = this.h;
        if (i2 >= i) {
            return null;
        }
        do {
            int i3 = this.h;
            cArr = this.g;
            if (i3 >= i) {
                return new String(cArr, i2, i3 - i2);
            }
            c = cArr[i3];
            this.h = i3 + 1;
            if (c == ' ') {
                break;
            }
        } while (c != '\t');
        return new String(cArr, i2, (r1 - i2) - 1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void i() {
        int h;
        int h2;
        try {
            String str = this.d;
            int hashCode = str.hashCode();
            String str2 = null;
            p4d p4dVar = this.a;
            switch (hashCode) {
                case 43847:
                    if (str.equals("+OK")) {
                        ((AtomicLong) p4dVar.b.n).incrementAndGet();
                        this.d = "UNKNOWN";
                        this.i = 1;
                        return;
                    }
                    break;
                case 76641:
                    if (str.equals("MSG")) {
                        int i = this.h;
                        int i2 = i + 4;
                        this.h = 0;
                        String f = f(i);
                        String f2 = f(i);
                        String f3 = f(i);
                        if (this.h < i) {
                            str2 = f3;
                            f3 = f(i);
                        }
                        if (f == null || f.isEmpty() || f2 == null || f2.isEmpty() || f3 == null) {
                            throw new IllegalStateException("Bad MSG control line, missing required fields");
                        }
                        int h3 = h(f3);
                        this.j = new j0a(f2, f, str2, i2);
                        this.i = 6;
                        this.l = new byte[h3];
                        this.n = 0;
                        this.h = 0;
                        return;
                    }
                    break;
                case 1409528:
                    if (str.equals("-ERR")) {
                        p4dVar.g0(StandardCharsets.UTF_8.decode(this.b).toString().replace("'", ""));
                        this.d = "UNKNOWN";
                        this.i = 1;
                        return;
                    }
                    break;
                case 2221593:
                    if (str.equals("HMSG")) {
                        int i3 = this.h;
                        int i4 = i3 + 5;
                        this.h = 0;
                        String f4 = f(i3);
                        String f5 = f(i3);
                        String f6 = f(i3);
                        String f7 = f(i3);
                        if (this.h < i3) {
                            int h4 = h(f7);
                            h2 = h(f(i3));
                            h = h4;
                            str2 = f6;
                        } else {
                            h = h(f6);
                            h2 = h(f7);
                        }
                        if (f4 == null || f4.isEmpty() || f5 == null || f5.isEmpty()) {
                            throw new IllegalStateException("Bad HMSG control line, missing required fields");
                        }
                        this.j = new j0a(f5, f4, str2, i4);
                        this.k = new byte[h];
                        this.l = new byte[h2 - h];
                        this.i = 5;
                        this.m = 0;
                        this.n = 0;
                        this.h = 0;
                        return;
                    }
                    break;
                case 2251950:
                    if (str.equals("INFO")) {
                        p4dVar.C(StandardCharsets.UTF_8.decode(this.b).toString());
                        this.d = "UNKNOWN";
                        this.i = 1;
                        return;
                    }
                    break;
                case 2455922:
                    if (str.equals("PING")) {
                        p4dVar.r0(new sff(p4d.W));
                        this.d = "UNKNOWN";
                        this.i = 1;
                        return;
                    }
                    break;
                case 2461688:
                    if (str.equals("PONG")) {
                        p4dVar.H();
                        this.d = "UNKNOWN";
                        this.i = 1;
                        return;
                    }
                    break;
            }
            throw new IllegalStateException("Unknown protocol operation " + this.d);
        } catch (IllegalStateException e) {
            e = e;
            i3c.m("Parse Protocol OP_", this.d, e);
        } catch (NullPointerException e2) {
            e = e2;
            i3c.m("Parse Protocol OP_", this.d, e);
        } catch (NumberFormatException e3) {
            e = e3;
            i3c.m("Parse Protocol OP_", this.d, e);
        }
    }

    public final void j(CompletableFuture completableFuture) {
        this.r = completableFuture;
        this.t.set(true);
        this.q = this.a.L.submit(this, Boolean.TRUE);
    }

    public final Future k(boolean z) {
        soh sohVar;
        Socket socket;
        AtomicBoolean atomicBoolean = this.t;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            if (z && (sohVar = this.s) != null) {
                try {
                    if (!sohVar.e && (socket = sohVar.d) != null) {
                        socket.shutdownInput();
                    }
                } catch (IOException unused) {
                }
            }
        }
        return this.q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4d p4dVar = this.a;
        dx dxVar = p4dVar.b;
        AtomicBoolean atomicBoolean = this.t;
        try {
            try {
                try {
                    this.s = (soh) this.r.get();
                    this.i = 1;
                    this.c = false;
                    this.f = 0;
                    while (atomicBoolean.get() && !Thread.interrupted()) {
                        this.p = 0;
                        soh sohVar = this.s;
                        byte[] bArr = this.o;
                        int read = sohVar.f.read(bArr, 0, bArr.length);
                        if (read > 0) {
                            dxVar.getClass();
                            while (this.p < read) {
                                int i = this.i;
                                if (i == 1) {
                                    d(read);
                                } else if (i == 3) {
                                    c(read);
                                } else if (i == 2) {
                                    e(read);
                                } else if (i == 5) {
                                    a(read);
                                } else {
                                    b(read);
                                }
                                if (this.i == 4) {
                                    i();
                                    this.b.clear();
                                }
                            }
                        } else {
                            if (read < 0) {
                                throw new IOException("Read channel closed.");
                            }
                            dxVar.getClass();
                        }
                    }
                    atomicBoolean.set(false);
                    this.b.clear();
                } catch (IOException e) {
                    if (atomicBoolean.get()) {
                        p4dVar.t(e);
                    }
                    atomicBoolean.set(false);
                    this.b.clear();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                atomicBoolean.set(false);
                this.b.clear();
            } catch (CancellationException | ExecutionException unused2) {
                atomicBoolean.set(false);
                this.b.clear();
            }
        } catch (Throwable th) {
            atomicBoolean.set(false);
            this.b.clear();
            throw th;
        }
    }
}
