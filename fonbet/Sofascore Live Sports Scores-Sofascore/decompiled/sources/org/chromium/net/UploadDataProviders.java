package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.aek;
import defpackage.by9;
import defpackage.e3c;
import defpackage.ydk;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new ydk(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new aek(new by9(parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ydk(byteBuffer.slice());
    }

    public static UploadDataProvider create(File file) {
        return new aek(new e3c(file, 17));
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
