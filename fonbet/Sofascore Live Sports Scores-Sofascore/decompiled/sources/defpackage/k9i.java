package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k9i {
    public int[] a;
    public final fp4 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public ey8 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public k9i(fp4 fp4Var, ey8 ey8Var, ByteBuffer byteBuffer, int i) {
        this.c = fp4Var;
        this.l = new ey8();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = ey8Var;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = ey8Var.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((ay8) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = ey8Var.f;
                this.r = i2 / highestOneBit;
                int i3 = ey8Var.g;
                this.q = i3 / highestOneBit;
                int i4 = i2 * i3;
                kn4 kn4Var = (kn4) this.c.c;
                this.i = kn4Var == null ? new byte[i4] : (byte[]) kn4Var.d(i4, byte[].class);
                fp4 fp4Var2 = this.c;
                int i5 = this.r * this.q;
                kn4 kn4Var2 = (kn4) fp4Var2.c;
                this.j = kn4Var2 == null ? new int[i5] : (int[]) kn4Var2.d(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap h = ((dx1) this.c.b).h(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        h.setHasAlpha(true);
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x000d, TRY_LEAVE, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001f, B:13:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x0045, B:19:0x003d, B:20:0x0047, B:22:0x0058, B:23:0x0064, B:26:0x006d, B:28:0x0071, B:32:0x0075, B:34:0x0079, B:36:0x008b, B:38:0x008f, B:39:0x0093, B:42:0x0069, B:46:0x0010, B:48:0x0019, B:49:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap b() {
        int i;
        int[] iArr;
        try {
            if (this.l.c > 0) {
                if (this.k < 0) {
                }
                i = this.o;
                if (i != 1 && i != 2) {
                    this.o = 0;
                    if (this.e == null) {
                        kn4 kn4Var = (kn4) this.c.c;
                        this.e = kn4Var == null ? new byte[255] : (byte[]) kn4Var.d(255, byte[].class);
                    }
                    ay8 ay8Var = (ay8) this.l.e.get(this.k);
                    int i2 = this.k - 1;
                    ay8 ay8Var2 = i2 < 0 ? (ay8) this.l.e.get(i2) : null;
                    iArr = ay8Var.k;
                    if (iArr != null) {
                        iArr = this.l.a;
                    }
                    this.a = iArr;
                    if (iArr != null) {
                        this.o = 1;
                        return null;
                    }
                    if (ay8Var.f) {
                        System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                        int[] iArr2 = this.b;
                        this.a = iArr2;
                        iArr2[ay8Var.h] = 0;
                        if (ay8Var.g == 2 && this.k == 0) {
                            this.s = Boolean.TRUE;
                        }
                    }
                    return d(ay8Var, ay8Var2);
                }
                return null;
            }
            if (Log.isLoggable("k9i", 3)) {
                int i3 = this.l.c;
            }
            this.o = 1;
            i = this.o;
            if (i != 1) {
                this.o = 0;
                if (this.e == null) {
                }
                ay8 ay8Var3 = (ay8) this.l.e.get(this.k);
                int i22 = this.k - 1;
                if (i22 < 0) {
                }
                iArr = ay8Var3.k;
                if (iArr != null) {
                }
                this.a = iArr;
                if (iArr != null) {
                }
            }
            return null;
        } finally {
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r7.j == r37.h) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc A[LOOP:2: B:52:0x00da->B:53:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(ay8 ay8Var, ay8 ay8Var2) {
        int i;
        byte[] bArr;
        short[] sArr;
        byte[] bArr2;
        byte[] bArr3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        short[] sArr2;
        byte[] bArr4;
        short s;
        int i13;
        int i14;
        int i15;
        int i16;
        fp4 fp4Var = this.c;
        byte b = 0;
        int[] iArr3 = this.j;
        if (ay8Var2 == null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                ((dx1) fp4Var.b).i(bitmap);
            }
            this.m = null;
            Arrays.fill(iArr3, 0);
        }
        if (ay8Var2 != null && ay8Var2.g == 3 && this.m == null) {
            Arrays.fill(iArr3, 0);
        }
        int i17 = this.r;
        int i18 = this.p;
        if (ay8Var2 != null && (i13 = ay8Var2.g) > 0) {
            if (i13 == 2) {
                if (!ay8Var.f) {
                    ey8 ey8Var = this.l;
                    i14 = ey8Var.k;
                    if (ay8Var.k != null) {
                    }
                    int i19 = ay8Var2.d / i18;
                    int i20 = ay8Var2.b / i18;
                    int i21 = ay8Var2.c / i18;
                    i15 = (i20 * i17) + (ay8Var2.a / i18);
                    i16 = (i19 * i17) + i15;
                    while (i15 < i16) {
                        int i22 = i15 + i21;
                        for (int i23 = i15; i23 < i22; i23++) {
                            iArr3[i23] = i14;
                        }
                        i15 += i17;
                    }
                }
                i14 = 0;
                int i192 = ay8Var2.d / i18;
                int i202 = ay8Var2.b / i18;
                int i212 = ay8Var2.c / i18;
                i15 = (i202 * i17) + (ay8Var2.a / i18);
                i16 = (i192 * i17) + i15;
                while (i15 < i16) {
                }
            } else if (i13 == 3) {
                Bitmap bitmap2 = this.m;
                if (bitmap2 != null) {
                    int i24 = this.q;
                    int i25 = this.r;
                    bitmap2.getPixels(iArr3, 0, i25, 0, 0, i25, i24);
                }
                this.d.position(ay8Var.j);
                i = ay8Var.c * ay8Var.d;
                bArr = this.i;
                if (bArr != null || bArr.length < i) {
                    kn4 kn4Var = (kn4) fp4Var.c;
                    bArr = kn4Var != null ? new byte[i] : (byte[]) kn4Var.d(i, byte[].class);
                    this.i = bArr;
                }
                sArr = this.f;
                if (sArr == null) {
                    sArr = new short[4096];
                    this.f = sArr;
                }
                bArr2 = this.g;
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    this.g = bArr2;
                }
                bArr3 = this.h;
                if (bArr3 == null) {
                    bArr3 = new byte[4097];
                    this.h = bArr3;
                }
                int i26 = this.d.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i2 = 1 << i26;
                int i27 = i2 + 1;
                int i28 = i2 + 2;
                int i29 = i26 + 1;
                int i30 = (1 << i29) - 1;
                for (i3 = 0; i3 < i2; i3++) {
                    sArr[i3] = 0;
                    bArr2[i3] = (byte) i3;
                }
                byte[] bArr5 = this.e;
                i4 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = i29;
                int i39 = i28;
                int i40 = i30;
                short s2 = -1;
                short s3 = -1;
                while (true) {
                    if (i4 < i) {
                        iArr = iArr3;
                        break;
                    }
                    if (i31 == 0) {
                        int i41 = this.d.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i41 <= 0) {
                            sArr2 = sArr;
                            i31 = i41;
                            iArr = iArr3;
                            bArr4 = bArr5;
                        } else {
                            sArr2 = sArr;
                            ByteBuffer byteBuffer = this.d;
                            iArr = iArr3;
                            bArr4 = bArr5;
                            i31 = i41;
                            byteBuffer.get(this.e, 0, Math.min(i41, byteBuffer.remaining()));
                        }
                        if (i31 <= 0) {
                            this.o = 3;
                            b = 0;
                            break;
                        }
                        i32 = 0;
                    } else {
                        sArr2 = sArr;
                        iArr = iArr3;
                        bArr4 = bArr5;
                    }
                    i34 += (bArr4[i32] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i33;
                    i32++;
                    i31--;
                    short s4 = s3;
                    int i42 = i33 + 8;
                    int i43 = i39;
                    int i44 = i38;
                    byte[] bArr6 = bArr2;
                    int i45 = i37;
                    while (true) {
                        i33 = i42;
                        if (i42 < i44) {
                            i37 = i45;
                            bArr2 = bArr6;
                            i38 = i44;
                            bArr5 = bArr4;
                            b = 0;
                            s2 = -1;
                            s3 = s4;
                            i39 = i43;
                            sArr = sArr2;
                            iArr3 = iArr;
                            break;
                        }
                        int i46 = i34 & i40;
                        i34 >>= i44;
                        i33 -= i44;
                        if (i46 == i2) {
                            i44 = i29;
                            i43 = i28;
                            i40 = i30;
                            s4 = s2;
                            i42 = i33;
                        } else {
                            if (i46 == i27) {
                                i39 = i43;
                                i38 = i44;
                                i37 = i45;
                                bArr2 = bArr6;
                                iArr3 = iArr;
                                bArr5 = bArr4;
                                b = 0;
                                s3 = s4;
                                sArr = sArr2;
                                break;
                            }
                            int i47 = i44;
                            if (s4 == s2) {
                                bArr[i35] = bArr6[i46 == true ? 1 : 0];
                                i35++;
                                i4++;
                                s4 = i46 == true ? 1 : 0;
                                i45 = s4;
                                i42 = i33;
                                i44 = i47;
                            } else {
                                if (i46 >= i43) {
                                    bArr3[i36] = (byte) i45;
                                    i36++;
                                    s = s4;
                                } else {
                                    s = i46 == true ? 1 : 0;
                                }
                                while (s >= i2) {
                                    bArr3[i36] = bArr6[s];
                                    i36++;
                                    s = sArr2[s];
                                }
                                i45 = bArr6[s] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                byte b2 = (byte) i45;
                                bArr[i35] = b2;
                                while (true) {
                                    i35++;
                                    i4++;
                                    if (i36 <= 0) {
                                        break;
                                    }
                                    i36--;
                                    bArr[i35] = bArr3[i36];
                                }
                                int i48 = i2;
                                if (i43 < 4096) {
                                    sArr2[i43] = s4;
                                    bArr6[i43] = b2;
                                    i43++;
                                    if ((i43 & i40) == 0 && i43 < 4096) {
                                        i44 = i47 + 1;
                                        i40 += i43;
                                        s4 = i46 == true ? 1 : 0;
                                        i42 = i33;
                                        i2 = i48;
                                    }
                                }
                                i44 = i47;
                                s4 = i46 == true ? 1 : 0;
                                i42 = i33;
                                i2 = i48;
                            }
                            s2 = -1;
                        }
                    }
                }
                Arrays.fill(bArr, i35, i, b);
                z = ay8Var.e;
                int[] iArr4 = this.j;
                if (z && i18 == 1) {
                    int i49 = ay8Var.d;
                    int i50 = ay8Var.b;
                    int i51 = ay8Var.c;
                    int i52 = ay8Var.a;
                    byte b3 = this.k == 0 ? (byte) 1 : b;
                    byte[] bArr7 = this.i;
                    int[] iArr5 = this.a;
                    int i53 = -1;
                    for (int i54 = b; i54 < i49; i54++) {
                        int i55 = (i54 + i50) * i17;
                        int i56 = i55 + i52;
                        int i57 = i56 + i51;
                        int i58 = i55 + i17;
                        if (i58 < i57) {
                            i57 = i58;
                        }
                        int i59 = ay8Var.c * i54;
                        while (i56 < i57) {
                            int i60 = i49;
                            int i61 = bArr7[i59];
                            int[] iArr6 = iArr4;
                            int i62 = i61 & 255;
                            if (i62 != i53) {
                                int i63 = iArr5[i62];
                                if (i63 != 0) {
                                    iArr6[i56] = i63;
                                } else {
                                    i53 = i61;
                                }
                            }
                            i59++;
                            i56++;
                            i49 = i60;
                            iArr4 = iArr6;
                        }
                    }
                    Boolean bool = this.s;
                    this.s = Boolean.valueOf((bool != null && bool.booleanValue()) || !(this.s != null || b3 == 0 || i53 == -1));
                } else {
                    i5 = ay8Var.d / i18;
                    int i64 = ay8Var.b / i18;
                    int i65 = ay8Var.c / i18;
                    int i66 = ay8Var.a / i18;
                    boolean z2 = this.k != 0;
                    byte[] bArr8 = this.i;
                    int[] iArr7 = this.a;
                    Boolean bool2 = this.s;
                    int i67 = 8;
                    i6 = 0;
                    int i68 = 0;
                    int i69 = 1;
                    while (i6 < i5) {
                        int i70 = i64;
                        if (ay8Var.e) {
                            if (i68 >= i5) {
                                i69++;
                                if (i69 == 2) {
                                    i68 = 4;
                                } else if (i69 == 3) {
                                    i67 = 4;
                                    i68 = 2;
                                } else if (i69 == 4) {
                                    i68 = 1;
                                    i67 = 2;
                                }
                            }
                            i7 = i68 + i67;
                        } else {
                            i7 = i68;
                            i68 = i6;
                        }
                        int i71 = i68 + i70;
                        int i72 = i5;
                        boolean z3 = i18 == 1;
                        if (i71 < this.q) {
                            int i73 = i71 * i17;
                            int i74 = i73 + i66;
                            int i75 = i74 + i65;
                            int i76 = i73 + i17;
                            if (i76 < i75) {
                                i75 = i76;
                            }
                            i8 = i7;
                            int i77 = i6 * i18 * ay8Var.c;
                            if (z3) {
                                int i78 = i74;
                                while (i78 < i75) {
                                    int i79 = i78;
                                    int i80 = iArr7[bArr8[i77] & 255];
                                    if (i80 != 0) {
                                        iArr4[i79] = i80;
                                    } else if (z2 && bool2 == null) {
                                        bool2 = Boolean.TRUE;
                                    }
                                    i77 += i18;
                                    i78 = i79 + 1;
                                }
                            } else {
                                int i81 = ((i75 - i74) * i18) + i77;
                                Boolean bool3 = bool2;
                                int i82 = i77;
                                int i83 = i74;
                                while (i83 < i75) {
                                    int i84 = i75;
                                    int i85 = ay8Var.c;
                                    int i86 = i65;
                                    int i87 = i82;
                                    int i88 = 0;
                                    int i89 = 0;
                                    int i90 = 0;
                                    int i91 = 0;
                                    int i92 = 0;
                                    while (true) {
                                        if (i87 >= i82 + i18) {
                                            i11 = i66;
                                            break;
                                        }
                                        byte[] bArr9 = this.i;
                                        i11 = i66;
                                        if (i87 >= bArr9.length || i87 >= i81) {
                                            break;
                                        }
                                        int i93 = this.a[bArr9[i87] & 255];
                                        if (i93 != 0) {
                                            i88 += (i93 >> 24) & 255;
                                            i89 += (i93 >> 16) & 255;
                                            i90 += (i93 >> 8) & 255;
                                            i91 += i93 & 255;
                                            i92++;
                                        }
                                        i87++;
                                        i66 = i11;
                                    }
                                    int i94 = i82 + i85;
                                    int i95 = i94;
                                    while (i95 < i94 + i18) {
                                        byte[] bArr10 = this.i;
                                        int i96 = i94;
                                        if (i95 >= bArr10.length || i95 >= i81) {
                                            break;
                                        }
                                        int i97 = this.a[bArr10[i95] & 255];
                                        if (i97 != 0) {
                                            i88 += (i97 >> 24) & 255;
                                            i89 += (i97 >> 16) & 255;
                                            i90 += (i97 >> 8) & 255;
                                            i91 += i97 & 255;
                                            i92++;
                                        }
                                        i95++;
                                        i94 = i96;
                                    }
                                    int i98 = i92 == 0 ? 0 : ((i88 / i92) << 24) | ((i89 / i92) << 16) | ((i90 / i92) << 8) | (i91 / i92);
                                    if (i98 != 0) {
                                        iArr4[i83] = i98;
                                    } else if (z2 && bool3 == null) {
                                        bool3 = Boolean.TRUE;
                                    }
                                    i82 += i18;
                                    i83++;
                                    i75 = i84;
                                    i65 = i86;
                                    i66 = i11;
                                }
                                i10 = i65;
                                i9 = i66;
                                bool2 = bool3;
                                i6++;
                                i64 = i70;
                                i5 = i72;
                                i68 = i8;
                                i65 = i10;
                                i66 = i9;
                            }
                        } else {
                            i8 = i7;
                        }
                        i10 = i65;
                        i9 = i66;
                        i6++;
                        i64 = i70;
                        i5 = i72;
                        i68 = i8;
                        i65 = i10;
                        i66 = i9;
                    }
                    if (this.s == null) {
                        this.s = Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
                    }
                }
                if (this.n || !((i12 = ay8Var.g) == 0 || i12 == 1)) {
                    iArr2 = iArr;
                } else {
                    Bitmap bitmap3 = this.m;
                    if (bitmap3 == null) {
                        bitmap3 = a();
                        this.m = bitmap3;
                    }
                    int i99 = this.q;
                    int i100 = this.r;
                    iArr2 = iArr;
                    bitmap3.setPixels(iArr2, 0, i100, 0, 0, i100, i99);
                }
                Bitmap a = a();
                int i101 = this.q;
                int i102 = this.r;
                a.setPixels(iArr2, 0, i102, 0, 0, i102, i101);
                return a;
            }
        }
        this.d.position(ay8Var.j);
        i = ay8Var.c * ay8Var.d;
        bArr = this.i;
        if (bArr != null) {
        }
        kn4 kn4Var2 = (kn4) fp4Var.c;
        bArr = kn4Var2 != null ? new byte[i] : (byte[]) kn4Var2.d(i, byte[].class);
        this.i = bArr;
        sArr = this.f;
        if (sArr == null) {
        }
        bArr2 = this.g;
        if (bArr2 == null) {
        }
        bArr3 = this.h;
        if (bArr3 == null) {
        }
        int i262 = this.d.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        i2 = 1 << i262;
        int i272 = i2 + 1;
        int i282 = i2 + 2;
        int i292 = i262 + 1;
        int i302 = (1 << i292) - 1;
        while (i3 < i2) {
        }
        byte[] bArr52 = this.e;
        i4 = 0;
        int i312 = 0;
        int i322 = 0;
        int i332 = 0;
        int i342 = 0;
        int i352 = 0;
        int i362 = 0;
        int i372 = 0;
        int i382 = i292;
        int i392 = i282;
        int i402 = i302;
        short s22 = -1;
        short s32 = -1;
        while (true) {
            if (i4 < i) {
            }
        }
        Arrays.fill(bArr, i352, i, b);
        z = ay8Var.e;
        int[] iArr42 = this.j;
        if (z) {
        }
        i5 = ay8Var.d / i18;
        int i642 = ay8Var.b / i18;
        int i652 = ay8Var.c / i18;
        int i662 = ay8Var.a / i18;
        if (this.k != 0) {
        }
        byte[] bArr82 = this.i;
        int[] iArr72 = this.a;
        Boolean bool22 = this.s;
        int i672 = 8;
        i6 = 0;
        int i682 = 0;
        int i692 = 1;
        while (i6 < i5) {
        }
        if (this.s == null) {
        }
        if (this.n) {
        }
        iArr2 = iArr;
        Bitmap a2 = a();
        int i1012 = this.q;
        int i1022 = this.r;
        a2.setPixels(iArr2, 0, i1022, 0, 0, i1022, i1012);
        return a2;
    }
}
