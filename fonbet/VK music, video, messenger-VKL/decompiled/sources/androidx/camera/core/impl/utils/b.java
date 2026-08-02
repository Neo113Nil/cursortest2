package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.fu8;
import xsna.o4q;
import xsna.obr;
import xsna.t4q;
import xsna.t5y0;

/* compiled from: ExifOutputStream.java */
/* loaded from: classes11.dex */
public final class b extends FilterOutputStream {
    public static final byte[] h = "Exif\u0000\u0000".getBytes(o4q.d);
    public final ExifData b;
    public final byte[] c;
    public final ByteBuffer d;
    public int e;
    public int f;
    public int g;

    public b(@NonNull t5y0.a aVar, @NonNull ExifData exifData) {
        super(new BufferedOutputStream(aVar, 65536));
        this.c = new byte[1];
        this.d = ByteBuffer.allocate(4);
        this.e = 0;
        this.b = exifData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0369, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x036e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0367, code lost:
    
        if (r3 <= 0) goto L166;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
        ExifData exifData;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.f;
            if ((i5 > 0 || this.g > 0 || this.e != 2) && i4 > 0) {
                if (i5 > 0) {
                    int min = Math.min(i4, i5);
                    i4 -= min;
                    this.f -= min;
                    i3 += min;
                }
                int i6 = this.g;
                if (i6 > 0) {
                    int min2 = Math.min(i4, i6);
                    ((FilterOutputStream) this).out.write(bArr, i3, min2);
                    i4 -= min2;
                    this.g -= min2;
                    i3 += min2;
                }
                if (i4 == 0) {
                    return;
                }
                int i7 = this.e;
                int i8 = 0;
                int i9 = 4;
                ByteBuffer byteBuffer = this.d;
                if (i7 == 0) {
                    int min3 = Math.min(i4, 2 - byteBuffer.position());
                    byteBuffer.put(bArr, i3, min3);
                    i3 += min3;
                    i4 -= min3;
                    if (byteBuffer.position() < 2) {
                        return;
                    }
                    byteBuffer.rewind();
                    if (byteBuffer.getShort() != -40) {
                        throw new IOException("Not a valid jpeg image, cannot write exif");
                    }
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    this.e = 1;
                    byteBuffer.rewind();
                    OutputStream outputStream = ((FilterOutputStream) this).out;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    fu8 fu8Var = new fu8(outputStream);
                    fu8Var.c((short) -31);
                    int[] iArr = new int[4];
                    int[] iArr2 = new int[4];
                    t4q[] t4qVarArr = ExifData.c;
                    int i10 = 0;
                    while (true) {
                        exifData = this.b;
                        if (i10 >= i9) {
                            break;
                        }
                        t4q t4qVar = t4qVarArr[i10];
                        int i11 = 0;
                        while (true) {
                            t4q[] t4qVarArr2 = ExifData.c;
                            if (i11 < i9) {
                                exifData.a(i11).remove(t4qVar.b);
                                i11++;
                                i9 = 4;
                            }
                        }
                        i10++;
                        i9 = 4;
                    }
                    Map<String, o4q> a = exifData.a(1);
                    ByteOrder byteOrder2 = exifData.b;
                    if (!a.isEmpty()) {
                        exifData.a(0).put(ExifData.c[1].b, o4q.a(0L, byteOrder2));
                    }
                    if (!exifData.a(2).isEmpty()) {
                        exifData.a(0).put(ExifData.c[2].b, o4q.a(0L, byteOrder2));
                    }
                    if (!exifData.a(3).isEmpty()) {
                        exifData.a(1).put(ExifData.c[3].b, o4q.a(0L, byteOrder2));
                    }
                    int i12 = 0;
                    while (true) {
                        t4q[] t4qVarArr3 = ExifData.c;
                        if (i12 >= 4) {
                            break;
                        }
                        Iterator<Map.Entry<String, o4q>> it = exifData.a(i12).entrySet().iterator();
                        int i13 = i8;
                        while (it.hasNext()) {
                            o4q value = it.next().getValue();
                            int i14 = o4q.f[value.a] * value.b;
                            if (i14 > 4) {
                                i13 += i14;
                            }
                        }
                        iArr2[i12] = iArr2[i12] + i13;
                        i12++;
                        i8 = 0;
                    }
                    int i15 = 8;
                    int i16 = 0;
                    while (true) {
                        t4q[] t4qVarArr4 = ExifData.c;
                        if (i16 >= 4) {
                            break;
                        }
                        if (!exifData.a(i16).isEmpty()) {
                            iArr[i16] = i15;
                            i15 = (exifData.a(i16).size() * 12) + 6 + iArr2[i16] + i15;
                        }
                        i16++;
                    }
                    int i17 = i15 + 8;
                    if (!exifData.a(1).isEmpty()) {
                        exifData.a(0).put(ExifData.c[1].b, o4q.a(iArr[1], byteOrder2));
                    }
                    if (!exifData.a(2).isEmpty()) {
                        exifData.a(0).put(ExifData.c[2].b, o4q.a(iArr[2], byteOrder2));
                    }
                    if (!exifData.a(3).isEmpty()) {
                        exifData.a(1).put(ExifData.c[3].b, o4q.a(iArr[3], byteOrder2));
                    }
                    fu8Var.c((short) i17);
                    fu8Var.write(h);
                    fu8Var.c(byteOrder2 == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                    fu8Var.c = byteOrder2;
                    fu8Var.c((short) 42);
                    fu8Var.b((int) 8);
                    int i18 = 0;
                    while (true) {
                        t4q[] t4qVarArr5 = ExifData.c;
                        if (i18 >= 4) {
                            break;
                        }
                        if (!exifData.a(i18).isEmpty()) {
                            fu8Var.c((short) exifData.a(i18).size());
                            int size = (exifData.a(i18).size() * 12) + iArr[i18] + 2 + 4;
                            for (Map.Entry<String, o4q> entry : exifData.a(i18).entrySet()) {
                                t4q t4qVar2 = (t4q) ((HashMap) ExifData.b.f.get(i18)).get(entry.getKey());
                                obr.e(t4qVar2, "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.");
                                int i19 = t4qVar2.a;
                                o4q value2 = entry.getValue();
                                int[] iArr3 = o4q.f;
                                int i20 = value2.a;
                                int i21 = value2.b;
                                int i22 = iArr3[i20] * i21;
                                fu8Var.c((short) i19);
                                fu8Var.c((short) value2.a);
                                fu8Var.b(i21);
                                if (i22 > 4) {
                                    fu8Var.b(size);
                                    size += i22;
                                } else {
                                    fu8Var.write(value2.c);
                                    if (i22 < 4) {
                                        for (int i23 = 4; i22 < i23; i23 = 4) {
                                            fu8Var.b.write(0);
                                            i22++;
                                        }
                                    }
                                }
                            }
                            fu8Var.b((int) 0);
                            Iterator<Map.Entry<String, o4q>> it2 = exifData.a(i18).entrySet().iterator();
                            while (it2.hasNext()) {
                                byte[] bArr2 = it2.next().getValue().c;
                                if (bArr2.length > 4) {
                                    fu8Var.write(bArr2, 0, bArr2.length);
                                }
                            }
                        }
                        i18++;
                    }
                    fu8Var.c = ByteOrder.BIG_ENDIAN;
                } else if (i7 != 1) {
                    continue;
                } else {
                    int min4 = Math.min(i4, 4 - byteBuffer.position());
                    byteBuffer.put(bArr, i3, min4);
                    i3 += min4;
                    i4 -= min4;
                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                        byteBuffer.rewind();
                    }
                    if (byteBuffer.position() < 4) {
                        return;
                    }
                    byteBuffer.rewind();
                    short s = byteBuffer.getShort();
                    if (s == -31) {
                        this.f = (byteBuffer.getShort() & 65535) - 2;
                        this.e = 2;
                    } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.g = (byteBuffer.getShort() & 65535) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                        this.e = 2;
                    }
                    byteBuffer.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.c;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
