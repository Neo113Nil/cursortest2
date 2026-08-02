package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f29601m = "e";

    /* renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0467a f29602a;
    private int[] act;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f29603b;
    private byte[] block;

    /* renamed from: c, reason: collision with root package name */
    public int f29604c;

    /* renamed from: d, reason: collision with root package name */
    public c f29605d;

    /* renamed from: e, reason: collision with root package name */
    public Bitmap f29606e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29607f;

    /* renamed from: g, reason: collision with root package name */
    public int f29608g;

    /* renamed from: h, reason: collision with root package name */
    public int f29609h;

    /* renamed from: i, reason: collision with root package name */
    public int f29610i;

    /* renamed from: j, reason: collision with root package name */
    public int f29611j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f29612k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap.Config f29613l;
    private byte[] mainPixels;
    private int[] mainScratch;
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private byte[] suffix;

    public e(a.InterfaceC0467a interfaceC0467a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0467a);
        p(cVar, byteBuffer, i10);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int a() {
        return this.f29605d.f29587b;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void advance() {
        this.f29604c = (this.f29604c + 1) % this.f29605d.f29587b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    @Override // com.bumptech.glide.gifdecoder.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Bitmap b() {
        int i10;
        int[] iArr;
        try {
            if (this.f29605d.f29587b > 0) {
                if (this.f29604c < 0) {
                }
                i10 = this.f29608g;
                if (i10 != 1 && i10 != 2) {
                    this.f29608g = 0;
                    if (this.block == null) {
                        this.block = this.f29602a.b(255);
                    }
                    b bVar = (b) this.f29605d.f29589d.get(this.f29604c);
                    int i11 = this.f29604c - 1;
                    b bVar2 = i11 < 0 ? (b) this.f29605d.f29589d.get(i11) : null;
                    iArr = bVar.lct;
                    if (iArr != null) {
                        iArr = this.f29605d.gct;
                    }
                    this.act = iArr;
                    if (iArr != null) {
                        Log.isLoggable(f29601m, 3);
                        this.f29608g = 1;
                        return null;
                    }
                    if (bVar.f29581f) {
                        System.arraycopy(iArr, 0, this.pct, 0, iArr.length);
                        int[] iArr2 = this.pct;
                        this.act = iArr2;
                        iArr2[bVar.f29583h] = 0;
                        if (bVar.f29582g == 2 && this.f29604c == 0) {
                            this.f29612k = Boolean.TRUE;
                        }
                    }
                    return q(bVar, bVar2);
                }
                Log.isLoggable(f29601m, 3);
                return null;
            }
            if (Log.isLoggable(f29601m, 3)) {
                int i12 = this.f29605d.f29587b;
            }
            this.f29608g = 1;
            i10 = this.f29608g;
            if (i10 != 1) {
                this.f29608g = 0;
                if (this.block == null) {
                }
                b bVar3 = (b) this.f29605d.f29589d.get(this.f29604c);
                int i112 = this.f29604c - 1;
                if (i112 < 0) {
                }
                iArr = bVar3.lct;
                if (iArr != null) {
                }
                this.act = iArr;
                if (iArr != null) {
                }
            }
            Log.isLoggable(f29601m, 3);
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f29613l = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f29605d = null;
        byte[] bArr = this.mainPixels;
        if (bArr != null) {
            this.f29602a.e(bArr);
        }
        int[] iArr = this.mainScratch;
        if (iArr != null) {
            this.f29602a.f(iArr);
        }
        Bitmap bitmap = this.f29606e;
        if (bitmap != null) {
            this.f29602a.a(bitmap);
        }
        this.f29606e = null;
        this.f29603b = null;
        this.f29612k = null;
        byte[] bArr2 = this.block;
        if (bArr2 != null) {
            this.f29602a.e(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int d() {
        int i10;
        if (this.f29605d.f29587b <= 0 || (i10 = this.f29604c) < 0) {
            return 0;
        }
        return l(i10);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void e() {
        this.f29604c = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int f() {
        return this.f29604c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int g() {
        return this.f29603b.limit() + this.mainPixels.length + (this.mainScratch.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public ByteBuffer getData() {
        return this.f29603b;
    }

    public final int h(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f29609h + i10; i18++) {
            byte[] bArr = this.mainPixels;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.act[bArr[i18] & UByte.MAX_VALUE];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f29609h + i20; i21++) {
            byte[] bArr2 = this.mainPixels;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.act[bArr2[i21] & UByte.MAX_VALUE];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    public final void i(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.mainScratch;
        int i14 = bVar.f29579d;
        int i15 = this.f29609h;
        int i16 = i14 / i15;
        int i17 = bVar.f29577b / i15;
        int i18 = bVar.f29578c / i15;
        int i19 = bVar.f29576a / i15;
        boolean z10 = this.f29604c == 0;
        int i20 = this.f29611j;
        int i21 = this.f29610i;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        Boolean bool = this.f29612k;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f29580e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f29578c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & UByte.MAX_VALUE];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int h10 = h(i32, i36, bVar.f29578c);
                        if (h10 != 0) {
                            iArr3[i37] = h10;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f29612k == null) {
            this.f29612k = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    public final void j(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.mainScratch;
        int i10 = bVar2.f29579d;
        int i11 = bVar2.f29577b;
        int i12 = bVar2.f29578c;
        int i13 = bVar2.f29576a;
        boolean z10 = this.f29604c == 0;
        int i14 = this.f29611j;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f29578c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & UByte.MAX_VALUE;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f29612k;
        this.f29612k = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f29612k == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void k(b bVar) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f29603b.position(bVar.f29585j);
        }
        if (bVar == null) {
            c cVar = eVar.f29605d;
            i10 = cVar.f29590e;
            i11 = cVar.f29591f;
        } else {
            i10 = bVar.f29578c;
            i11 = bVar.f29579d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = eVar.mainPixels;
        if (bArr2 == null || bArr2.length < i12) {
            eVar.mainPixels = eVar.f29602a.b(i12);
        }
        byte[] bArr3 = eVar.mainPixels;
        if (eVar.prefix == null) {
            eVar.prefix = new short[4096];
        }
        short[] sArr = eVar.prefix;
        if (eVar.suffix == null) {
            eVar.suffix = new byte[4096];
        }
        byte[] bArr4 = eVar.suffix;
        if (eVar.pixelStack == null) {
            eVar.pixelStack = new byte[4097];
        }
        byte[] bArr5 = eVar.pixelStack;
        int o10 = eVar.o();
        int i13 = 1 << o10;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = o10 + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = eVar.block;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (i23 == 0) {
                i23 = eVar.n();
                if (i23 <= 0) {
                    eVar.f29608g = 3;
                    break;
                }
                i24 = b10;
            }
            i26 += (bArr6[i24] & UByte.MAX_VALUE) << i25;
            i24++;
            i23--;
            int i31 = i25 + 8;
            int i32 = i20;
            int i33 = i19;
            int i34 = i30;
            short[] sArr2 = sArr;
            int i35 = i28;
            while (true) {
                bArr = bArr4;
                if (i31 < i33) {
                    i20 = i32;
                    i28 = i35;
                    break;
                }
                int i36 = i26 & i21;
                i26 >>= i33;
                i31 -= i33;
                if (i36 == i13) {
                    i33 = i16;
                    i32 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i34 = -1;
                } else {
                    if (i36 == i14) {
                        i28 = i35;
                        i20 = i32;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i34 == -1) {
                        bArr3[i27] = bArr[i36];
                        i27++;
                        i22++;
                        i34 = i36;
                        i35 = i34;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i36 >= i32) {
                            bArr7[i29] = (byte) i35;
                            i29++;
                            s10 = i34;
                        } else {
                            s10 = i36;
                        }
                        while (s10 >= i13) {
                            bArr7[i29] = bArr[s10];
                            i29++;
                            s10 = sArr2[s10];
                        }
                        int i37 = bArr[s10] & UByte.MAX_VALUE;
                        byte b11 = (byte) i37;
                        bArr3[i27] = b11;
                        while (true) {
                            i27++;
                            i22++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr3[i27] = bArr7[i29];
                        }
                        if (i32 < 4096) {
                            sArr2[i32] = (short) i34;
                            bArr[i32] = b11;
                            i32++;
                            if ((i32 & i21) == 0 && i32 < 4096) {
                                i33++;
                                i21 += i32;
                            }
                        }
                        i34 = i36;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i35 = i37;
                    }
                }
            }
            i25 = i31;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i30 = i34;
            i19 = i33;
            eVar = this;
        }
        Arrays.fill(bArr3, i27, i12, b10);
    }

    public int l(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f29605d;
        if (i10 < cVar.f29587b) {
            return ((b) cVar.f29589d.get(i10)).f29584i;
        }
        return -1;
    }

    public final Bitmap m() {
        Boolean bool = this.f29612k;
        Bitmap c10 = this.f29602a.c(this.f29611j, this.f29610i, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f29613l);
        c10.setHasAlpha(true);
        return c10;
    }

    public final int n() {
        int o10 = o();
        if (o10 <= 0) {
            return o10;
        }
        ByteBuffer byteBuffer = this.f29603b;
        byteBuffer.get(this.block, 0, Math.min(o10, byteBuffer.remaining()));
        return o10;
    }

    public final int o() {
        return this.f29603b.get() & UByte.MAX_VALUE;
    }

    public synchronized void p(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int highestOneBit = Integer.highestOneBit(i10);
            this.f29608g = 0;
            this.f29605d = cVar;
            this.f29604c = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f29603b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f29603b.order(ByteOrder.LITTLE_ENDIAN);
            this.f29607f = false;
            Iterator it = cVar.f29589d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f29582g == 3) {
                    this.f29607f = true;
                    break;
                }
            }
            this.f29609h = highestOneBit;
            int i11 = cVar.f29590e;
            this.f29611j = i11 / highestOneBit;
            int i12 = cVar.f29591f;
            this.f29610i = i12 / highestOneBit;
            this.mainPixels = this.f29602a.b(i11 * i12);
            this.mainScratch = this.f29602a.d(this.f29611j * this.f29610i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Bitmap q(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.mainScratch;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f29606e;
            if (bitmap2 != null) {
                this.f29602a.a(bitmap2);
            }
            this.f29606e = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f29582g == 3 && this.f29606e == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f29582g) > 0) {
            if (i11 == 2) {
                if (!bVar.f29581f) {
                    c cVar = this.f29605d;
                    int i13 = cVar.f29596k;
                    if (bVar.lct == null || cVar.f29594i != bVar.f29583h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f29579d;
                int i15 = this.f29609h;
                int i16 = i14 / i15;
                int i17 = bVar2.f29577b / i15;
                int i18 = bVar2.f29578c / i15;
                int i19 = bVar2.f29576a / i15;
                int i20 = this.f29611j;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f29611j;
                }
            } else if (i11 == 3 && (bitmap = this.f29606e) != null) {
                int i25 = this.f29611j;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f29610i);
            }
        }
        k(bVar);
        if (bVar.f29580e || this.f29609h != 1) {
            i(bVar);
        } else {
            j(bVar);
        }
        if (this.f29607f && ((i10 = bVar.f29582g) == 0 || i10 == 1)) {
            if (this.f29606e == null) {
                this.f29606e = m();
            }
            Bitmap bitmap3 = this.f29606e;
            int i26 = this.f29611j;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f29610i);
        }
        Bitmap m10 = m();
        int i27 = this.f29611j;
        m10.setPixels(iArr, 0, i27, 0, 0, i27, this.f29610i);
        return m10;
    }

    public e(a.InterfaceC0467a interfaceC0467a) {
        this.pct = new int[256];
        this.f29613l = Bitmap.Config.ARGB_8888;
        this.f29602a = interfaceC0467a;
        this.f29605d = new c();
    }
}
