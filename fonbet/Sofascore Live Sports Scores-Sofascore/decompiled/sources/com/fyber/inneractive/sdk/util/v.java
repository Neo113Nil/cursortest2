package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.is8;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class v {
    public static byte[] a(InputStream inputStream) {
        ByteBuffer byteBuffer = (ByteBuffer) f.b.a.poll();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(16384);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] array = (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
        while (true) {
            int read = inputStream.read(array, 0, array.length);
            if (read == -1) {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                b(byteArrayOutputStream);
                f.b.a.offer(byteBuffer);
                return byteArray;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
    }

    public static StringBuffer b(InputStream inputStream) {
        if (inputStream == null) {
            a70.p("stream required");
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) f.b.a.poll();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(16384);
        }
        StringBuffer stringBuffer = new StringBuffer();
        byte[] array = (byteBuffer == null || !byteBuffer.hasArray()) ? new byte[8192] : byteBuffer.array();
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(array, 0, i));
            i = inputStream.read(array);
        }
        f.b.a.offer(byteBuffer);
        return stringBuffer;
    }

    public static void a(InputStream inputStream, FileOutputStream fileOutputStream) {
        if (inputStream != null) {
            byte[] bArr = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    i += read;
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    IAlog.a("Copied stream content length = %d", Integer.valueOf(i));
                    return;
                }
            }
        } else {
            is8.e("Unable to copy from or to a null stream.");
        }
    }

    public static void a(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        } catch (Exception unused) {
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

    public static String b(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    public static RelativeLayout.LayoutParams a(int i, int i2, int... iArr) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        if (iArr.length > 0) {
            for (int i3 : iArr) {
                layoutParams.addRule(i3);
            }
        }
        return layoutParams;
    }

    public static Object a(Reference reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    public static int a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static int a(int i, int i2) {
        return Integer.compare(i, i2);
    }

    public static String a(Throwable th) {
        String message;
        if (th == null) {
            return null;
        }
        do {
            message = th.getMessage();
            th = th.getCause();
        } while (th != null);
        return message;
    }

    public static boolean a(String str) {
        return (TextUtils.isEmpty(str) || str.trim().isEmpty()) ? false : true;
    }

    public static String a(JSONObject jSONObject, String str) {
        return (jSONObject == null || jSONObject.isNull(str)) ? "" : jSONObject.optString(str);
    }
}
