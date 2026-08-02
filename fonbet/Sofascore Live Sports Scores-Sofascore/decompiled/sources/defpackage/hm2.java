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
/* loaded from: classes2.dex */
public final class hm2 extends um2 {
    public final int h;
    public final int i;
    public final int j;
    public List n;
    public List o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 241, 9632};
    public static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final nkk g = new nkk(4, false);
    public final ArrayList l = new ArrayList();
    public fm2 m = new fm2(0, 4);
    public int v = 0;
    public final long k = 16000000;

    public hm2(String str, int i) {
        this.h = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            m6k.f0();
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        h(0);
        g();
        this.w = true;
        this.x = C.TIME_UNSET;
    }

    @Override // defpackage.um2
    public final wm2 b() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new wm2(list, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.um2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(qm2 qm2Var) {
        boolean z2;
        ByteBuffer byteBuffer = qm2Var.h;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        nkk nkkVar = this.g;
        nkkVar.C(array, limit);
        boolean z3 = false;
        while (true) {
            int c = nkkVar.c();
            int i = this.h;
            if (c < i) {
                if (z3) {
                    int i2 = this.p;
                    if (i2 == 1 || i2 == 3) {
                        this.n = f();
                        this.x = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int s = i == 2 ? -4 : nkkVar.s();
            int s2 = nkkVar.s();
            int s3 = nkkVar.s();
            if ((s & 2) == 0 && (s & 1) == this.i) {
                byte b = (byte) (s2 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                byte b2 = (byte) (s3 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((s & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[s2] && zArr[s3]) {
                            z2 = true;
                            this.r = z2;
                            if (z2 || (b & 240) != 16) {
                                this.s = false;
                            } else if (this.s && this.t == b && this.u == b2) {
                                this.s = false;
                            } else {
                                this.s = true;
                                this.t = b;
                                this.u = b2;
                            }
                            if (!z2) {
                                if (1 <= b && b <= 15) {
                                    this.w = false;
                                } else if ((b & 246) == 20) {
                                    if (b2 != 32 && b2 != 47) {
                                        switch (b2) {
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                    case 43:
                                                        this.w = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.w = true;
                                                break;
                                        }
                                    }
                                    this.w = true;
                                }
                                if (this.w) {
                                    int i3 = b & 224;
                                    if (i3 == 0) {
                                        this.v = (b >> 3) & 1;
                                    }
                                    if (this.v == this.j) {
                                        if (i3 == 0) {
                                            int i4 = b & 247;
                                            if (i4 == 17 && (b2 & 240) == 48) {
                                                this.m.a((char) C[b2 & 15]);
                                            } else {
                                                int i5 = b & 246;
                                                if (i5 == 18 && (b2 & 224) == 32) {
                                                    this.m.b();
                                                    this.m.a((char) ((b & 1) == 0 ? D[b2 & 31] : E[b2 & 31]));
                                                } else if (i4 == 17 && (b2 & 240) == 32) {
                                                    this.m.a(' ');
                                                    boolean z5 = (b2 & 1) == 1;
                                                    fm2 fm2Var = this.m;
                                                    fm2Var.a.add(new dm2((b2 >> 1) & 7, z5, fm2Var.c.length()));
                                                } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                    int i6 = y[b & 7];
                                                    if ((b2 & 32) != 0) {
                                                        i6++;
                                                    }
                                                    fm2 fm2Var2 = this.m;
                                                    if (i6 != fm2Var2.d) {
                                                        if (this.p != 1 && !fm2Var2.e()) {
                                                            fm2 fm2Var3 = new fm2(this.p, this.q);
                                                            this.m = fm2Var3;
                                                            this.l.add(fm2Var3);
                                                        }
                                                        fm2Var2 = this.m;
                                                        fm2Var2.d = i6;
                                                    }
                                                    boolean z6 = (b2 & 16) == 16;
                                                    int i7 = (b2 >> 1) & 7;
                                                    fm2Var2.a.add(new dm2(z6 ? 8 : i7, (b2 & 1) == 1, fm2Var2.c.length()));
                                                    if (z6) {
                                                        this.m.e = z[i7];
                                                    }
                                                } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                    this.m.f = b2 - 32;
                                                } else if (i5 == 20 && (b2 & 240) == 32) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.q = 2;
                                                                this.m.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.q = 3;
                                                                this.m.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.q = 4;
                                                                this.m.h = 4;
                                                                break;
                                                            default:
                                                                int i8 = this.p;
                                                                if (i8 != 0) {
                                                                    if (b2 == 33) {
                                                                        this.m.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.n = Collections.EMPTY_LIST;
                                                                                if (i8 == 1 || i8 == 3) {
                                                                                    g();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i8 == 1 && !this.m.e()) {
                                                                                    fm2 fm2Var4 = this.m;
                                                                                    ArrayList arrayList = fm2Var4.b;
                                                                                    arrayList.add(fm2Var4.d());
                                                                                    fm2Var4.c.setLength(0);
                                                                                    fm2Var4.a.clear();
                                                                                    int min = Math.min(fm2Var4.h, fm2Var4.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.n = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            fm2 fm2Var5 = this.m;
                                            int[] iArr = B;
                                            fm2Var5.a((char) iArr[(b & Byte.MAX_VALUE) - 32]);
                                            if ((b2 & 224) != 0) {
                                                this.m.a((char) iArr[(b2 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                g();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.r = z2;
                    if (z2) {
                    }
                    this.s = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // defpackage.um2, defpackage.bm4
    /* renamed from: d */
    public final sm2 dequeueOutputBuffer() {
        sm2 sm2Var;
        sm2 dequeueOutputBuffer = super.dequeueOutputBuffer();
        if (dequeueOutputBuffer != null) {
            return dequeueOutputBuffer;
        }
        long j = this.k;
        if (j == C.TIME_UNSET) {
            return null;
        }
        long j2 = this.x;
        if (j2 == C.TIME_UNSET || this.e - j2 < j || (sm2Var = (sm2) this.b.pollFirst()) == null) {
            return null;
        }
        this.n = Collections.EMPTY_LIST;
        this.x = C.TIME_UNSET;
        sm2Var.B(this.e, b(), Long.MAX_VALUE);
        return sm2Var;
    }

    @Override // defpackage.um2
    public final boolean e() {
        return this.n != this.o;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            l74 c = ((fm2) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            l74 l74Var = (l74) arrayList2.get(i3);
            if (l74Var != null) {
                if (l74Var.i != i) {
                    l74Var = ((fm2) arrayList.get(i3)).c(i);
                    l74Var.getClass();
                }
                arrayList3.add(l74Var);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.um2, defpackage.bm4
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        h(0);
        this.q = 4;
        this.m.h = 4;
        g();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = C.TIME_UNSET;
    }

    public final void g() {
        fm2 fm2Var = this.m;
        fm2Var.g = this.p;
        fm2Var.a.clear();
        fm2Var.b.clear();
        fm2Var.c.setLength(0);
        fm2Var.d = 15;
        fm2Var.e = 0;
        fm2Var.f = 0;
        ArrayList arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    public final void h(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i != 3) {
            g();
            if (i2 == 3 || i == 1 || i == 0) {
                this.n = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((fm2) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    @Override // defpackage.um2, defpackage.bm4
    public final void release() {
    }
}
