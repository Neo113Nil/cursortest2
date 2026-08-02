package defpackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zq4 implements Closeable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zq4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static String i(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((HttpURLConnection) obj).disconnect();
                break;
            default:
                ((e45) obj).close();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String h() {
        boolean z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.b;
        try {
        } catch (IOException unused) {
        } catch (NullPointerException e) {
            e = e;
            ajb.c("get error failed ");
            return e.getMessage();
        }
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            z = true;
            if (!z) {
                return null;
            }
            try {
                return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + i(httpURLConnection);
            } catch (IOException | NullPointerException e2) {
                e = e2;
                ajb.c("get error failed ");
                return e.getMessage();
            }
        }
        z = false;
        if (!z) {
        }
    }
}
