package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.IOUtils;
import defpackage.mpo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfzr {
    public final zzber a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public zzfzr(zzber zzberVar, File file, File file2, File file3) {
        this.a = zzberVar;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        FileInputStream fileInputStream;
        byte[] bArr = this.e;
        FileInputStream fileInputStream2 = null;
        if (bArr == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    mpo mpoVar = zziei.b;
                    ArrayList arrayList = new ArrayList();
                    int i = NotificationCompat.FLAG_LOCAL_ONLY;
                    while (true) {
                        byte[] bArr2 = new byte[i];
                        int i2 = 0;
                        while (i2 < i) {
                            int read = fileInputStream.read(bArr2, i2, i - i2);
                            if (read == -1) {
                                break;
                            }
                            i2 += read;
                        }
                        mpo B = i2 == 0 ? null : zziei.B(0, i2, bArr2);
                        if (B == null) {
                            break;
                        }
                        arrayList.add(B);
                        i = Math.min(i + i, 8192);
                    }
                    bArr = zziei.D(arrayList).d();
                    IOUtils.a(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.a(fileInputStream);
                    bArr = null;
                    this.e = bArr;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.e = bArr;
        }
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
