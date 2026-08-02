package androidx.media3.transformer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.c0;
import androidx.media3.transformer.e;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import xsna.ahn;
import xsna.hq10;
import xsna.hr10;
import xsna.io20;
import xsna.lq10;
import xsna.m6g;
import xsna.o19;
import xsna.qq;
import xsna.ryt0;
import xsna.tzf;

/* compiled from: DefaultDecoderFactory.java */
/* loaded from: classes12.dex */
public final class j implements e.a {
    public final Context a;
    public final ryt0 b;
    public final int c;
    public final qq d;

    /* compiled from: DefaultDecoderFactory.java */
    public static final class a {
        public final Context a;
        public final ryt0 b = new ryt0();
        public final int c = -2000;
        public final qq d = androidx.media3.exoplayer.mediacodec.e.T6;

        public a(Context context) {
            this.a = context.getApplicationContext();
        }
    }

    public j(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
    }

    public static ExportException d(androidx.media3.common.a aVar, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String aVar2 = aVar.toString();
        String str2 = aVar.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, new ExportException.a(aVar2, null, io20.p(str2), true));
    }

    @Override // androidx.media3.transformer.e.a
    public final i a(androidx.media3.common.a aVar, @Nullable LogSessionId logSessionId) throws ExportException {
        return c(hr10.a(aVar), aVar, null, false, logSessionId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r4.equals("SM-X900") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L28;
     */
    @Override // androidx.media3.transformer.e.a
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i b(androidx.media3.common.a aVar, Surface surface, boolean z, @Nullable LogSessionId logSessionId) throws ExportException {
        androidx.media3.common.a aVar2;
        String str;
        if (m6g.h(aVar.D)) {
            if (z) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    m6g m6gVar = aVar.D;
                    m6gVar.getClass();
                    int i2 = m6gVar.c;
                    if (!Build.MANUFACTURER.equals("Google") || !Build.ID.startsWith("TP1A")) {
                        if (i2 == 7) {
                            String str2 = Build.MODEL;
                            if (!str2.startsWith("SM-F936")) {
                                if (!str2.startsWith("SM-F916")) {
                                    if (!str2.startsWith("SM-F721")) {
                                    }
                                }
                            }
                        }
                        if (i < 34) {
                            if (i2 == 6) {
                            }
                        }
                    }
                }
                throw d(aVar, "Tone-mapping HDR is not supported on this device.");
            }
            if (Build.VERSION.SDK_INT < 29) {
                throw d(aVar, "Decoding HDR is not supported on this device.");
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && aVar.u >= 7680 && aVar.v >= 4320 && (str = aVar.n) != null && str.equals("video/hevc")) {
            String str3 = Build.MODEL;
            if (str3.equals("SM-F711U1") || str3.equals("SM-F926U1")) {
                throw d(aVar, "Decoding 8k is not supported on this device.");
            }
        }
        if (i3 >= 30 || !Build.DEVICE.equals("joyeuse")) {
            aVar2 = aVar;
        } else {
            a.C0043a a2 = aVar.a();
            a2.x = -1.0f;
            aVar2 = new androidx.media3.common.a(a2);
        }
        MediaFormat a3 = hr10.a(aVar2);
        boolean z2 = false;
        if (i3 >= 29 && this.a.getApplicationInfo().targetSdkVersion >= 29) {
            a3.setInteger("allow-frame-drop", 0);
        }
        if (i3 >= 31 && z) {
            a3.setInteger("color-transfer-request", 3);
        }
        Pair<Integer, Integer> b = tzf.b(aVar2);
        if (b != null) {
            hr10.c(a3, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) b.first).intValue());
            hr10.c(a3, "level", ((Integer) b.second).intValue());
        }
        if (i3 >= 35) {
            a3.setInteger("importance", Math.max(0, -this.c));
        }
        if (aVar2.u * aVar2.v >= 2073600) {
            String str4 = Build.MODEL;
            if (o19.h(str4, "vivo 1906") || o19.h(str4, "redmi 7a") || o19.h(str4, "redmi 8")) {
                z2 = true;
            }
        }
        return c(a3, aVar2, surface, z2, logSessionId);
    }

    public final i c(MediaFormat mediaFormat, final androidx.media3.common.a aVar, @Nullable Surface surface, boolean z, @Nullable LogSessionId logSessionId) throws ExportException {
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        aVar.n.getClass();
        try {
            final Context context = this.a;
            ArrayList arrayList = new ArrayList(MediaCodecUtil.g(this.d, aVar, false, false));
            Collections.sort(arrayList, new lq10(new MediaCodecUtil.c() { // from class: xsna.mq10
                @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
                public final int a(Object obj) {
                    return ((hq10) obj).e(context, aVar) ? 1 : 0;
                }
            }));
            if (arrayList.isEmpty()) {
                throw d(aVar, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    hq10 hq10Var = (hq10) arrayList.get(i);
                    if (!hq10Var.h) {
                        arrayList2.add(hq10Var);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31 && ((hq10) arrayList.get(0)).c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            if (i2 >= 35 && logSessionId != null) {
                c0.a.a(mediaFormat, logSessionId);
            }
            ArrayList arrayList3 = new ArrayList();
            Context context2 = this.a;
            for (hq10 hq10Var2 : arrayList.subList(0, 1)) {
                mediaFormat.setString("mime", hq10Var2.c);
                try {
                    i iVar = new i(context2, aVar, mediaFormat, hq10Var2.a, true, surface);
                    iVar.c();
                    this.b.getClass();
                    return iVar;
                } catch (ExportException e) {
                    arrayList3.add(e);
                }
            }
            throw ((ExportException) arrayList3.get(0));
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            ahn.o("DefaultDecoderFactory", "Error querying decoders", e2);
            throw d(aVar, "Querying codecs failed");
        }
    }
}
