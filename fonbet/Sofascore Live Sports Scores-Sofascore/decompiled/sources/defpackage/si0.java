package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzhcv;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class si0 implements zzhcv {
    public final Context a;

    public si0(Context context) {
        context.getClass();
        this.a = context;
    }

    public static qy3 a(si0 si0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return si0Var.c();
        }
        if (obj instanceof fx8) {
            for (ix8 ix8Var : ((fx8) obj).a) {
            }
        }
        Context context = si0Var.a;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return si0Var.c();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            wy3 wy3Var = new wy3(context);
            wy3 wy3Var2 = wy3Var.isAvailableOnDevice() ? wy3Var : null;
            return wy3Var2 == null ? si0Var.c() : wy3Var2;
        }
        if (i <= 33) {
            return si0Var.c();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0057, code lost:
    
        if (r4.equals("mhtml") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName == null) {
            char c = '.';
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case 3315:
                        if (lowerCase.equals("gz")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3401:
                        if (lowerCase.equals("js")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 97669:
                        if (lowerCase.equals("bmp")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 98819:
                        if (lowerCase.equals("css")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 102340:
                        if (lowerCase.equals("gif")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 103649:
                        if (lowerCase.equals("htm")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104085:
                        if (lowerCase.equals("ico")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 105441:
                        if (lowerCase.equals("jpg")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 106458:
                        if (lowerCase.equals("m4a")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 106479:
                        if (lowerCase.equals("m4v")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108089:
                        if (lowerCase.equals("mht")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108150:
                        if (lowerCase.equals("mjs")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108272:
                        if (lowerCase.equals("mp3")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108273:
                        if (lowerCase.equals("mp4")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 108324:
                        if (lowerCase.equals("mpg")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109961:
                        if (lowerCase.equals("oga")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109967:
                        if (lowerCase.equals("ogg")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109973:
                        if (lowerCase.equals("ogm")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109982:
                        if (lowerCase.equals("ogv")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110834:
                        if (lowerCase.equals("pdf")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 111030:
                        if (lowerCase.equals("pjp")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 111145:
                        if (lowerCase.equals("png")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 114276:
                        if (lowerCase.equals("svg")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 114791:
                        if (lowerCase.equals("tgz")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 114833:
                        if (lowerCase.equals("tif")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 117484:
                        if (lowerCase.equals("wav")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 118660:
                        if (lowerCase.equals("xht")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 118807:
                        if (lowerCase.equals("xml")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 120609:
                        if (lowerCase.equals("zip")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3000872:
                        if (lowerCase.equals("apng")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3145576:
                        if (lowerCase.equals("flac")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3213227:
                        if (lowerCase.equals("html")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3259225:
                        if (lowerCase.equals("jfif")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3268712:
                        if (lowerCase.equals("jpeg")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3271912:
                        if (lowerCase.equals("json")) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3358085:
                        if (lowerCase.equals("mpeg")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3418175:
                        if (lowerCase.equals("opus")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3529614:
                        if (lowerCase.equals("shtm")) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3542678:
                        if (lowerCase.equals("svgz")) {
                            c = '&';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3559925:
                        if (lowerCase.equals("tiff")) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3642020:
                        if (lowerCase.equals("wasm")) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3645337:
                        if (lowerCase.equals("webm")) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3645340:
                        if (lowerCase.equals("webp")) {
                            c = '*';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3655064:
                        if (lowerCase.equals("woff")) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3678569:
                        if (lowerCase.equals("xhtm")) {
                            c = ',';
                            break;
                        }
                        c = 65535;
                        break;
                    case 96488848:
                        if (lowerCase.equals("ehtml")) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 103877016:
                        break;
                    case 106703064:
                        if (lowerCase.equals("pjpeg")) {
                            c = '/';
                            break;
                        }
                        c = 65535;
                        break;
                    case 109418142:
                        if (lowerCase.equals("shtml")) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 114035747:
                        if (lowerCase.equals("xhtml")) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 23:
                        guessContentTypeFromName = "application/gzip";
                        break;
                    case 1:
                    case 11:
                        guessContentTypeFromName = "text/javascript";
                        break;
                    case 2:
                        guessContentTypeFromName = "image/bmp";
                        break;
                    case 3:
                        guessContentTypeFromName = "text/css";
                        break;
                    case 4:
                        guessContentTypeFromName = "image/gif";
                        break;
                    case 5:
                    case 31:
                    case '%':
                    case '-':
                    case '0':
                        guessContentTypeFromName = "text/html";
                        break;
                    case 6:
                        guessContentTypeFromName = "image/x-icon";
                        break;
                    case 7:
                    case 20:
                    case ' ':
                    case '!':
                    case '/':
                        guessContentTypeFromName = "image/jpeg";
                        break;
                    case '\b':
                        guessContentTypeFromName = "audio/x-m4a";
                        break;
                    case '\t':
                    case '\r':
                        guessContentTypeFromName = MimeTypes.VIDEO_MP4;
                        break;
                    case '\n':
                    case '.':
                        guessContentTypeFromName = "multipart/related";
                        break;
                    case '\f':
                        guessContentTypeFromName = MimeTypes.AUDIO_MPEG;
                        break;
                    case 14:
                    case '#':
                        guessContentTypeFromName = MimeTypes.VIDEO_MPEG;
                        break;
                    case 15:
                    case 16:
                    case '$':
                        guessContentTypeFromName = "audio/ogg";
                        break;
                    case 17:
                    case 18:
                        guessContentTypeFromName = "video/ogg";
                        break;
                    case 19:
                        guessContentTypeFromName = "application/pdf";
                        break;
                    case 21:
                        guessContentTypeFromName = "image/png";
                        break;
                    case 22:
                    case '&':
                        guessContentTypeFromName = "image/svg+xml";
                        break;
                    case 24:
                    case '\'':
                        guessContentTypeFromName = "image/tiff";
                        break;
                    case 25:
                        guessContentTypeFromName = "audio/wav";
                        break;
                    case 26:
                    case ',':
                    case '1':
                        guessContentTypeFromName = "application/xhtml+xml";
                        break;
                    case 27:
                        guessContentTypeFromName = "text/xml";
                        break;
                    case 28:
                        guessContentTypeFromName = "application/zip";
                        break;
                    case 29:
                        guessContentTypeFromName = "image/apng";
                        break;
                    case 30:
                        guessContentTypeFromName = MimeTypes.AUDIO_FLAC;
                        break;
                    case '\"':
                        guessContentTypeFromName = C4427z5.M;
                        break;
                    case '(':
                        guessContentTypeFromName = "application/wasm";
                        break;
                    case ')':
                        guessContentTypeFromName = "video/webm";
                        break;
                    case '*':
                        guessContentTypeFromName = "image/webp";
                        break;
                    case '+':
                        guessContentTypeFromName = "application/font-woff";
                        break;
                }
            }
            guessContentTypeFromName = null;
        }
        return guessContentTypeFromName == null ? "text/plain" : guessContentTypeFromName;
    }

    public qy3 c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List S0 = CollectionsKt.S0(arrayList);
        if (S0.isEmpty()) {
            return null;
        }
        Iterator it = S0.iterator();
        qy3 qy3Var = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                qy3 qy3Var2 = (qy3) newInstance;
                if (!qy3Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (qy3Var != null) {
                        return null;
                    }
                    qy3Var = qy3Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return qy3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        if (((Boolean) zzbkz.h.c()).booleanValue() && (th instanceof zzaz)) {
            zzbir.a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbkz.j.c()).booleanValue()) {
            zzbir.a(this.a);
        }
    }
}
