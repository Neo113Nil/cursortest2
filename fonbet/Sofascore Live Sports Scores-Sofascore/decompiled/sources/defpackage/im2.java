package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class im2 extends vm2 {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    public static final int[] D = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] F = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final j9e h = new j9e();
    public final ArrayList m = new ArrayList();
    public gm2 n = new gm2(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public im2(String str, int i) {
        this.i = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            tgj.d0("Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        i(0);
        h();
        this.x = true;
        this.y = C.TIME_UNSET;
    }

    @Override // defpackage.vm2
    public final t9d c() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new t9d(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.vm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(rm2 rm2Var) {
        boolean z2;
        ByteBuffer byteBuffer = rm2Var.i;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        j9e j9eVar = this.h;
        j9eVar.L(array, limit);
        boolean z3 = false;
        while (true) {
            int a = j9eVar.a();
            int i = this.i;
            if (a < i) {
                if (z3) {
                    int i2 = this.q;
                    if (i2 == 1 || i2 == 3) {
                        this.o = g();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int A2 = i == 2 ? -4 : j9eVar.A();
            int A3 = j9eVar.A();
            int A4 = j9eVar.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b = (byte) (A3 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                byte b2 = (byte) (A4 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.s;
                    if ((A2 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[A3] && zArr[A4]) {
                            z2 = true;
                            this.s = z2;
                            if (z2 || (b & 240) != 16) {
                                this.t = false;
                            } else if (this.t && this.u == b && this.v == b2) {
                                this.t = false;
                            } else {
                                this.t = true;
                                this.u = b;
                                this.v = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.x = false;
                                } else if ((b & 246) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.x = true;
                                                break;
                                        }
                                    }
                                    this.x = true;
                                }
                                if (this.x) {
                                    int i3 = b & 224;
                                    if (i3 == 0) {
                                        this.w = (b >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i3 == 0) {
                                            int i4 = b & 247;
                                            if (i4 == 17 && (b2 & 240) == 48) {
                                                this.n.a((char) D[b2 & 15]);
                                            } else {
                                                int i5 = b & 246;
                                                if (i5 == 18 && (b2 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b & 1) == 0 ? E[b2 & 31] : F[b2 & 31]));
                                                } else if (i4 == 17 && (b2 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z5 = (b2 & 1) == 1;
                                                    gm2 gm2Var = this.n;
                                                    gm2Var.a.add(new em2((b2 >> 1) & 7, z5, gm2Var.c.length()));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i6 = z[b & 7];
                                                    if ((b2 & 32) != 0) {
                                                        i6++;
                                                    }
                                                    gm2 gm2Var2 = this.n;
                                                    if (i6 != gm2Var2.d) {
                                                        if (this.q != 1 && !gm2Var2.e()) {
                                                            gm2 gm2Var3 = new gm2(this.q, this.r);
                                                            this.n = gm2Var3;
                                                            this.m.add(gm2Var3);
                                                        }
                                                        gm2Var2 = this.n;
                                                        gm2Var2.d = i6;
                                                    }
                                                    boolean z6 = (b2 & 16) == 16;
                                                    int i7 = (b2 >> 1) & 7;
                                                    gm2Var2.a.add(new em2(z6 ? 8 : i7, (b2 & 1) == 1, gm2Var2.c.length()));
                                                    if (z6) {
                                                        this.n.e = A[i7];
                                                    }
                                                } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.n.f = b2 - 32;
                                                } else if (i5 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        i(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                i(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                i(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                i(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                int i8 = this.q;
                                                                if (i8 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i8 == 1 || i8 == 3) {
                                                                                    h();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i8 == 1 && !this.n.e()) {
                                                                                    gm2 gm2Var4 = this.n;
                                                                                    ArrayList arrayList = gm2Var4.b;
                                                                                    arrayList.add(gm2Var4.d());
                                                                                    gm2Var4.c.setLength(0);
                                                                                    gm2Var4.a.clear();
                                                                                    int min = Math.min(gm2Var4.h, gm2Var4.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.o = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        i(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            gm2 gm2Var5 = this.n;
                                            int[] iArr = C;
                                            gm2Var5.a((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                            if ((b2 & 224) != 0) {
                                                this.n.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                h();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.s = z2;
                    if (z2) {
                    }
                    this.t = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // defpackage.vm2, defpackage.cm4
    /* renamed from: e */
    public final tm2 dequeueOutputBuffer() {
        tm2 tm2Var;
        tm2 dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j = this.l;
        if (j == C.TIME_UNSET) {
            return null;
        }
        long j2 = this.y;
        if (j2 == C.TIME_UNSET || this.e - j2 < j || (tm2Var = (tm2) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = C.TIME_UNSET;
        t9d c = c();
        long j3 = this.e;
        tm2Var.g = j3;
        tm2Var.i = c;
        tm2Var.j = j3;
        return tm2Var;
    }

    @Override // defpackage.vm2
    public final boolean f() {
        return this.o != this.p;
    }

    @Override // defpackage.vm2, defpackage.cm4
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        i(0);
        this.r = 4;
        this.n.h = 4;
        h();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = C.TIME_UNSET;
    }

    public final ArrayList g() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            m74 c = ((gm2) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            m74 m74Var = (m74) arrayList2.get(i3);
            if (m74Var != null) {
                if (m74Var.i != i) {
                    m74Var = ((gm2) arrayList.get(i3)).c(i);
                    m74Var.getClass();
                }
                arrayList3.add(m74Var);
            }
        }
        return arrayList3;
    }

    public final void h() {
        gm2 gm2Var = this.n;
        gm2Var.g = this.q;
        gm2Var.a.clear();
        gm2Var.b.clear();
        gm2Var.c.setLength(0);
        gm2Var.d = 15;
        gm2Var.e = 0;
        gm2Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void i(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            h();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((gm2) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.vm2, defpackage.cm4
    public final void release() {
    }
}
