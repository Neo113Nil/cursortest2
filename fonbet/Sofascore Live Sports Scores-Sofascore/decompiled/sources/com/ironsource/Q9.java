package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Q9 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends GZIPOutputStream {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OutputStream outputStream, int i) throws IOException {
            super(outputStream);
            this.a = i;
            if (i < 0 || i > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i);
        }
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("exception while decompressing " + e);
            return null;
        } catch (OutOfMemoryError e2) {
            C4157k4.d().a(e2);
            String str = "Error while decompressing:" + e2.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }

    private static void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Ib.a0().q().a(new C4355v5(EnumC4373w5.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObject));
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static byte[] a(String str, int i) throws Exception {
        byte[] bArr = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i);
            aVar.write(str.getBytes());
            aVar.close();
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr;
        } catch (OutOfMemoryError e) {
            C4157k4.d().a(e);
            String str2 = "Error while compressing:" + e.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return bArr;
        }
    }
}
