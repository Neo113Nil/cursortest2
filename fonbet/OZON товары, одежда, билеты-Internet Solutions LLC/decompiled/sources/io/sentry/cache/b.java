package io.sentry.cache;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67778a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f67778a) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b11 = bArr[i11];
                    byte b12 = bArr2[i11];
                    if (b11 != b12) {
                        return b11 - b12;
                    }
                }
                return 0;
        }
    }
}
