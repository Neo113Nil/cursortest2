package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzwd;
import com.google.android.gms.internal.ads.zzwl;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zrj {
    public static ContentCaptureSession a(View view) {
        return view.getContentCaptureSession();
    }

    public static float b(View view) {
        return view.getTransitionAlpha();
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static JSONArray d() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i2;
        String valueOf;
        HashSet hashSet = new HashSet();
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        int length = codecInfos.length;
        int i3 = 0;
        while (i3 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i3];
            if (!mediaCodecInfo.isEncoder() && (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias())) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length2 = supportedTypes.length;
                int i4 = 0;
                while (i4 < length2) {
                    if (supportedTypes[i4].equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i5 = 0;
                        while (i5 < length3) {
                            int i6 = codecProfileLevelArr[i5].level;
                            Field[] fields = MediaCodecInfo.CodecProfileLevel.class.getFields();
                            int length4 = fields.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length4) {
                                    mediaCodecInfoArr = codecInfos;
                                    i = length;
                                    i2 = i3;
                                    valueOf = String.valueOf(i6);
                                    break;
                                }
                                Field field = fields[i7];
                                mediaCodecInfoArr = codecInfos;
                                valueOf = field.getName();
                                i = length;
                                i2 = i3;
                                if (field.getType() == Integer.TYPE && valueOf.contains("HEVC")) {
                                    try {
                                        if (field.getInt(null) == i6) {
                                            break;
                                        }
                                    } catch (IllegalAccessException unused) {
                                        continue;
                                    }
                                }
                                i7++;
                                codecInfos = mediaCodecInfoArr;
                                length = i;
                                i3 = i2;
                            }
                            hashSet.add(valueOf);
                            i5++;
                            codecInfos = mediaCodecInfoArr;
                            length = i;
                            i3 = i2;
                        }
                    }
                    i4++;
                    codecInfos = codecInfos;
                    length = length;
                    i3 = i3;
                }
            }
            i3++;
            codecInfos = codecInfos;
            length = length;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    public static void e(int i, Paint paint) {
        paint.setBlendMode(eq3.X(i));
    }

    public static void f(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public static void g(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public static void h(int i, View view) {
        view.setTransitionVisibility(i);
    }

    public static void i(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    public static void j(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void k(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static int l(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint d2 = by1.d(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (sw9.f(supportedPerformancePoints.get(i4)).covers(d2)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && rha.e == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int m = m(true);
                    if (i5 < 35) {
                        rha.e = Boolean.valueOf(z);
                        if (z) {
                        }
                    } else {
                        rha.e = Boolean.valueOf(z);
                        if (z) {
                        }
                    }
                }
                z = false;
                rha.e = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static int m(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.d("video/avc");
            zzv zzvVar = new zzv(zztVar);
            if (zzvVar.o != null) {
                s b = zzwl.b(zzvVar, z, false);
                for (int i = 0; i < b.d; i++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((zzvs) b.get(i)).d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        by1.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (sw9.f(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (zzwd unused) {
        }
        return 0;
    }
}
