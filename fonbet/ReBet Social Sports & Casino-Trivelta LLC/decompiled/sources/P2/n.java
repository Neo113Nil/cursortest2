package P2;

import com.twilio.voice.OpusCodec;
import java.net.URLConnection;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public abstract class n {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName != null ? guessContentTypeFromName : b(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004f, code lost:
    
        if (r5.equals("mhtml") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        char c10 = '.';
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 3315:
                if (lowerCase.equals("gz")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3401:
                if (lowerCase.equals("js")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 97669:
                if (lowerCase.equals("bmp")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 98819:
                if (lowerCase.equals("css")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 102340:
                if (lowerCase.equals("gif")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 103649:
                if (lowerCase.equals("htm")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 104085:
                if (lowerCase.equals("ico")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 105441:
                if (lowerCase.equals("jpg")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 106479:
                if (lowerCase.equals("m4v")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 108089:
                if (lowerCase.equals("mht")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 108150:
                if (lowerCase.equals("mjs")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 108324:
                if (lowerCase.equals("mpg")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 109961:
                if (lowerCase.equals("oga")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 109967:
                if (lowerCase.equals("ogg")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 109973:
                if (lowerCase.equals("ogm")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 109982:
                if (lowerCase.equals("ogv")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 111030:
                if (lowerCase.equals("pjp")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 114276:
                if (lowerCase.equals("svg")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 114791:
                if (lowerCase.equals("tgz")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 114833:
                if (lowerCase.equals("tif")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 118660:
                if (lowerCase.equals("xht")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 118807:
                if (lowerCase.equals("xml")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 120609:
                if (lowerCase.equals("zip")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 3000872:
                if (lowerCase.equals("apng")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 3145576:
                if (lowerCase.equals("flac")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 3213227:
                if (lowerCase.equals("html")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 3259225:
                if (lowerCase.equals("jfif")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 3268712:
                if (lowerCase.equals("jpeg")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 3271912:
                if (lowerCase.equals("json")) {
                    c10 = Typography.quote;
                    break;
                }
                c10 = 65535;
                break;
            case 3358085:
                if (lowerCase.equals("mpeg")) {
                    c10 = '#';
                    break;
                }
                c10 = 65535;
                break;
            case 3418175:
                if (lowerCase.equals(OpusCodec.NAME)) {
                    c10 = Typography.dollar;
                    break;
                }
                c10 = 65535;
                break;
            case 3529614:
                if (lowerCase.equals("shtm")) {
                    c10 = '%';
                    break;
                }
                c10 = 65535;
                break;
            case 3542678:
                if (lowerCase.equals("svgz")) {
                    c10 = Typography.amp;
                    break;
                }
                c10 = 65535;
                break;
            case 3559925:
                if (lowerCase.equals("tiff")) {
                    c10 = '\'';
                    break;
                }
                c10 = 65535;
                break;
            case 3642020:
                if (lowerCase.equals("wasm")) {
                    c10 = '(';
                    break;
                }
                c10 = 65535;
                break;
            case 3645337:
                if (lowerCase.equals("webm")) {
                    c10 = ')';
                    break;
                }
                c10 = 65535;
                break;
            case 3645340:
                if (lowerCase.equals("webp")) {
                    c10 = '*';
                    break;
                }
                c10 = 65535;
                break;
            case 3655064:
                if (lowerCase.equals("woff")) {
                    c10 = '+';
                    break;
                }
                c10 = 65535;
                break;
            case 3678569:
                if (lowerCase.equals("xhtm")) {
                    c10 = ',';
                    break;
                }
                c10 = 65535;
                break;
            case 96488848:
                if (lowerCase.equals("ehtml")) {
                    c10 = '-';
                    break;
                }
                c10 = 65535;
                break;
            case 103877016:
                break;
            case 106703064:
                if (lowerCase.equals("pjpeg")) {
                    c10 = '/';
                    break;
                }
                c10 = 65535;
                break;
            case 109418142:
                if (lowerCase.equals("shtml")) {
                    c10 = '0';
                    break;
                }
                c10 = 65535;
                break;
            case 114035747:
                if (lowerCase.equals("xhtml")) {
                    c10 = '1';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
        }
        return null;
    }
}
