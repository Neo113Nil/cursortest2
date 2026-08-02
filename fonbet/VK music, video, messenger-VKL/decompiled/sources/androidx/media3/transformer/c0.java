package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import com.google.common.collect.ImmutableList;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import xsna.c0u;
import xsna.i4h0;
import xsna.io20;
import xsna.kr10;
import xsna.o19;
import xsna.p8p;
import xsna.uxo0;
import xsna.v9p;

/* compiled from: TransformerUtil.java */
/* loaded from: classes12.dex */
public final class c0 {

    /* compiled from: TransformerUtil.java */
    public static final class a {
        public static void a(MediaFormat mediaFormat, LogSessionId logSessionId) {
            boolean equals;
            String stringId;
            LogSessionId unused;
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (equals) {
                return;
            }
            stringId = logSessionId.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean a(v9p v9pVar, boolean z) {
        ?? r0 = z;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = v9pVar.a;
            ImmutableList<p8p> immutableList2 = v9pVar.b;
            if (r0 >= immutableList.size()) {
                for (int i = 0; i < immutableList2.size(); i++) {
                    if ((immutableList2.get(i) instanceof uxo0) && (!z || i > 0)) {
                        return true;
                    }
                }
                return false;
            }
            if ((immutableList.get(r0) instanceof androidx.media3.common.audio.f) || immutableList.get(r0).c(1000000000L) != 1000000000) {
                return true;
            }
            r0++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0165, code lost:
    
        if (r4.equals("bmp") == false) goto L20;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(Context context, kr10 kr10Var) {
        kr10.f fVar = kr10Var.b;
        if (fVar == null) {
            return null;
        }
        String str = fVar.b;
        Uri uri = fVar.a;
        if (str == null) {
            if (Objects.equals(uri.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                return context.getContentResolver().getType(uri);
            }
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            int lastIndexOf = path.lastIndexOf(".");
            if (lastIndexOf >= 0) {
                char c = 1;
                if (lastIndexOf < path.length() - 1) {
                    String u = o19.u(path.substring(lastIndexOf + 1));
                    u.getClass();
                    switch (u.hashCode()) {
                        case 96870:
                            if (u.equals("arw")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 97669:
                            break;
                        case 98723:
                            if (u.equals("cr2")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 99453:
                            if (u.equals("dib")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102340:
                            if (u.equals("gif")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104085:
                            if (u.equals("ico")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104430:
                            if (u.equals("k25")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105133:
                            if (u.equals("jfi")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105223:
                            if (u.equals("jif")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 105439:
                            if (u.equals("jpe")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 105441:
                            if (u.equals("jpg")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 111145:
                            if (u.equals("png")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 112680:
                            if (u.equals("raw")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 114276:
                            if (u.equals("svg")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 114833:
                            if (u.equals("tif")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3006482:
                            if (u.equals("avif")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3198679:
                            if (u.equals("heic")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3198682:
                            if (u.equals("heif")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3259225:
                            if (u.equals("jfif")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3268712:
                            if (u.equals("jpeg")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3542678:
                            if (u.equals("svgz")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3559925:
                            if (u.equals("tiff")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3645340:
                            if (u.equals("webp")) {
                                c = 22;
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
                        case 2:
                        case 6:
                        case '\f':
                            return "image/raw";
                        case 1:
                        case 3:
                            return "image/bmp";
                        case 4:
                            return "image/gif";
                        case 5:
                            return "image/x-icon";
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 18:
                        case 19:
                            return "image/jpeg";
                        case 11:
                            return "image/png";
                        case '\r':
                        case 20:
                            return "image/svg+xml";
                        case 14:
                        case 21:
                            return "image/tiff";
                        case 15:
                            return "image/avif";
                        case 16:
                            return "image/heic";
                        case 17:
                            return "image/heif";
                        case 22:
                            return "image/webp";
                        default:
                            return null;
                    }
                }
            }
        }
        return str;
    }

    public static int c(@Nullable String str) {
        int i = io20.i(str);
        if (i == 4) {
            return 2;
        }
        return i;
    }

    public static float d(androidx.media3.common.a aVar, ImmutableList immutableList) {
        int i = aVar.z;
        int i2 = aVar.v;
        int i3 = aVar.u;
        int i4 = i % 180;
        int i5 = i4 == 0 ? i3 : i2;
        int i6 = i4 == 0 ? i2 : i3;
        float f = 0.0f;
        for (int i7 = 0; i7 < immutableList.size(); i7++) {
            p8p p8pVar = (p8p) immutableList.get(i7);
            if (!(p8pVar instanceof c0u)) {
                return -1.0f;
            }
            c0u c0uVar = (c0u) p8pVar;
            if (p8pVar instanceof i4h0) {
                i4h0 i4h0Var = (i4h0) p8pVar;
                i4h0Var.getClass();
                float f2 = i4h0Var.a;
                if (f2 % 90.0f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return -1.0f;
                }
                f += f2;
                float f3 = f % 180.0f;
                i5 = f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? i3 : i2;
                i6 = f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? i2 : i3;
            } else if (!c0uVar.g(i5, i6)) {
                return -1.0f;
            }
        }
        float f4 = f % 360.0f;
        if (f4 % 90.0f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f4;
        }
        return -1.0f;
    }
}
