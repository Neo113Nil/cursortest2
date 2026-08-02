package com.google.android.gms.internal.wearable;

import android.bluetooth.BluetoothSocket;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr {
    /* JADX WARN: Multi-variable type inference failed */
    public static File a(ParcelFileDescriptor parcelFileDescriptor, File file) {
        IOException e;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        try {
            file.mkdirs();
            File createTempFile = File.createTempFile("asset", ".tmp", file);
            BluetoothSocket bluetoothSocket = 0;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = autoCloseInputStream.read(bArr);
                            if (read < 0) {
                                b(autoCloseInputStream);
                                b(fileOutputStream);
                                return createTempFile;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    bluetoothSocket = ".tmp";
                    b(autoCloseInputStream);
                    b(bluetoothSocket);
                    createTempFile.delete();
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                b(autoCloseInputStream);
                b(bluetoothSocket);
                createTempFile.delete();
                throw th;
            }
        } finally {
            b(autoCloseInputStream);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
