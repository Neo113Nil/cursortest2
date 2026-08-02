package jd;

import android.content.Context;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public abstract class e {
    public static void a(Context context, Uri uri, Uri uri2) {
        Throwable th2;
        OutputStream outputStream;
        InputStream openInputStream;
        if (uri.equals(uri2)) {
            return;
        }
        InputStream inputStream = null;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
        } catch (Throwable th3) {
            th2 = th3;
            outputStream = null;
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
            if (!(openInputStream instanceof FileInputStream) || !(openOutputStream instanceof FileOutputStream)) {
                throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
            }
            FileChannel channel = ((FileInputStream) openInputStream).getChannel();
            channel.transferTo(0L, channel.size(), ((FileOutputStream) openOutputStream).getChannel());
            openInputStream.close();
            openOutputStream.close();
        } catch (Throwable th4) {
            th2 = th4;
            inputStream = openInputStream;
            outputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream == null) {
                throw th2;
            }
            outputStream.close();
            throw th2;
        }
    }
}
