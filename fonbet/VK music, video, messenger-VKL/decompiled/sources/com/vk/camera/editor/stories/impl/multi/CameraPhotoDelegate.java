package com.vk.camera.editor.stories.impl.multi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import com.vk.core.files.ExternalDirType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.camera.CameraEditorContentType;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.MediaUtils;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.stories.b;
import com.vk.story.api.media.StoryMediaData;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import java.io.File;
import java.util.List;
import kotlin.Triple;
import xsna.Cnew;
import xsna.asp;
import xsna.bpn0;
import xsna.erm0;
import xsna.g440;
import xsna.h440;
import xsna.hwg0;
import xsna.is1;
import xsna.kd7;
import xsna.kwg0;
import xsna.llo;
import xsna.m130;
import xsna.mcr0;
import xsna.mny;
import xsna.n1;
import xsna.p41;
import xsna.q6x;
import xsna.qro0;
import xsna.s9;
import xsna.skd;
import xsna.tam0;
import xsna.txl0;
import xsna.uq10;
import xsna.vf6;
import xsna.wd3;
import xsna.wj9;
import xsna.yaa0;
import xsna.yo9;
import xsna.z9r;
import xsna.zcl0;
import xsna.zrp;

/* compiled from: CameraPhotoDelegate.kt */
/* loaded from: classes16.dex */
public final class CameraPhotoDelegate {
    public final Cnew a;
    public final CameraEditorContentType b;
    public final mny c;
    public final m130 d;
    public final h440 e;
    public final Paint f = new Paint(1);
    public final q6x g = new q6x();
    public final bpn0 h = new bpn0(new n1(9));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraPhotoDelegate.kt */
    public static final class ProcessType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProcessType[] $VALUES;
        public static final ProcessType SAVE;
        public static final ProcessType STORY_SHARE;

        static {
            ProcessType processType = new ProcessType("STORY_SHARE", 0);
            STORY_SHARE = processType;
            ProcessType processType2 = new ProcessType("SAVE", 1);
            SAVE = processType2;
            ProcessType[] processTypeArr = {processType, processType2};
            $VALUES = processTypeArr;
            $ENTRIES = new asp(processTypeArr);
        }

        public ProcessType() {
            throw null;
        }

        public static ProcessType valueOf(String str) {
            return (ProcessType) Enum.valueOf(ProcessType.class, str);
        }

        public static ProcessType[] values() {
            return (ProcessType[]) $VALUES.clone();
        }
    }

    public CameraPhotoDelegate(Cnew cnew, CameraEditorContentType cameraEditorContentType, vf6 vf6Var, m130 m130Var, h440 h440Var) {
        this.a = cnew;
        this.b = cameraEditorContentType;
        this.c = vf6Var;
        this.d = m130Var;
        this.e = h440Var;
    }

    public static MediaUtils.d a(tam0 tam0Var) {
        MediaUtils.d h;
        Bitmap bitmap;
        Bitmap bitmap2;
        yaa0 yaa0Var = tam0Var.a;
        MediaUtils.d dVar = null;
        Integer valueOf = (yaa0Var == null || (bitmap2 = yaa0Var.b) == null) ? null : Integer.valueOf(bitmap2.getHeight());
        yaa0 yaa0Var2 = tam0Var.a;
        Integer valueOf2 = (yaa0Var2 == null || (bitmap = yaa0Var2.b) == null) ? null : Integer.valueOf(bitmap.getWidth());
        if (valueOf != null && valueOf2 != null) {
            dVar = new MediaUtils.d(valueOf2.intValue(), valueOf.intValue());
        }
        if (dVar != null) {
            b.a.getClass();
            h = dVar.b < 1920 ? b.h(0.5625f, Math.max(dVar.a, 1080), Math.max(dVar.b, 1920)) : b.h(0.5625f, 1080, 1920);
        } else {
            b.a.getClass();
            h = b.h(0.5625f, 1080, 1920);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return h;
        }
        L.u(l, L.LogType.d, new Object[]{"CameraPhotoDelegate", "PublishSize for aspectRatio: 0.5625 story: " + tam0Var + " = " + h});
        return h;
    }

    public static /* synthetic */ MediaUtils.d b(tam0 tam0Var) {
        b.a.getClass();
        return a(tam0Var);
    }

    public static b0 c(tam0 tam0Var) {
        yaa0 yaa0Var = tam0Var.a;
        q i = mcr0.i(yaa0Var != null ? yaa0Var.a : null, 0, 0, 94848, null, null);
        is1 is1Var = new is1(new s9(tam0Var, 11), 6);
        a.l lVar = a.d;
        a.k kVar = a.c;
        return i.E(is1Var, lVar, kVar, kVar);
    }

    public final StoryMediaData d(tam0 tam0Var, ProcessType processType, StoryUploadParams storyUploadParams) {
        Object obj;
        Triple<List<uq10>, MediaUtils.d, Float> g;
        LoggerOutputTarget loggerOutputTarget;
        boolean z;
        StringBuilder sb;
        Bitmap d;
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        zcl0 zcl0Var = tam0Var.h;
        yaa0 yaa0Var = tam0Var.a;
        boolean z2 = zcl0Var.o() || tam0Var.h.r();
        boolean z3 = ((Boolean) this.h.getValue()).booleanValue() && processType == ProcessType.SAVE && yaa0Var != null && yaa0Var.c;
        mny mnyVar = this.c;
        if (z2) {
            obj = "CameraPhotoDelegate";
            g = mny.d(this.c, tam0Var, true, b(tam0Var), false, z3, 8);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{obj, "create story video layers"});
            }
        } else {
            obj = "CameraPhotoDelegate";
            g = mnyVar.g(tam0Var, b(tam0Var), z3);
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{obj, "create story photo layers"});
            }
        }
        if (g != null) {
            List<uq10> d2 = g.d();
            MediaUtils.d g2 = g.g();
            MediaUtils.d dVar = z2 ? g2 : null;
            if (dVar == null) {
                b.a.getClass();
                dVar = a(tam0Var);
            }
            L l3 = L.a;
            l3.getClass();
            LoggerOutputTarget loggerOutputTarget2 = LoggerOutputTarget.NONE;
            if (L.m(loggerOutputTarget2)) {
                loggerOutputTarget = loggerOutputTarget2;
            } else {
                loggerOutputTarget = loggerOutputTarget2;
                L.u(l3, L.LogType.d, new Object[]{obj, "create background bitmap resultSize " + dVar});
            }
            sb3.append("resultSize: " + dVar);
            sb3.append('\n');
            Bitmap bitmap = yaa0Var != null ? yaa0Var.b : null;
            if (tam0Var.t == null) {
                Bitmap f = mnyVar.f(tam0Var, dVar.b(), sb3);
                if (L.m(loggerOutputTarget)) {
                    z = z2;
                } else {
                    z = z2;
                    L.u(l3, L.LogType.d, new Object[]{obj, "background for rendering bitmap = " + f});
                }
                tam0Var.t = f;
            } else {
                z = z2;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l3, L.LogType.d, new Object[]{obj, "has background for rendering bitmap"});
                }
            }
            Bitmap bitmap2 = tam0Var.t;
            StringBuilder sb4 = new StringBuilder("sourceBitmap: a) ");
            sb4.append(bitmap2 != null ? Integer.valueOf(bitmap2.getWidth()) : null);
            sb4.append(" x ");
            sb4.append(bitmap2 != null ? Integer.valueOf(bitmap2.getHeight()) : null);
            sb3.append(sb4.toString());
            sb3.append('\n');
            if (bitmap2 == null && bitmap != null) {
                bitmap2 = kd7.e(dVar.a, dVar.b, bitmap);
            }
            StringBuilder sb5 = new StringBuilder("sourceBitmap: b)");
            sb5.append(bitmap2 != null ? Integer.valueOf(bitmap2.getWidth()) : null);
            sb5.append(" x ");
            sb5.append(bitmap2 != null ? Integer.valueOf(bitmap2.getHeight()) : null);
            sb3.append(sb5.toString());
            sb3.append('\n');
            if (bitmap2 == null) {
                sb = sb3;
                d = null;
            } else {
                Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                sb = sb3;
                Rect rect2 = new Rect(0, 0, dVar.a, dVar.b);
                int i = dVar.a;
                int i2 = dVar.b;
                d = kd7.d(i, i2);
                Canvas canvas = d != null ? new Canvas(d) : null;
                canvas.drawBitmap(bitmap2, rect, rect2, this.f);
                if (!llo.b.a(d, canvas, i, i2) && (d = kd7.d(i, i2)) != null) {
                    new Canvas(d);
                }
            }
            if (z && processType == ProcessType.SAVE) {
                b bVar = b.a;
                MediaUtils.d b = b(tam0Var);
                bVar.getClass();
                CameraVideoEncoderParameters b2 = b.b(null, d2, b);
                b2.f = false;
                bpn0 bpn0Var = qro0.a;
                qro0.a(new wj9(this, d, b2, 0));
                return null;
            }
            File g3 = b.g(b.a, d2, g2, -1, com.vk.core.files.a.t());
            l3.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l3, L.LogType.d, new Object[]{obj, z9r.a(g3, "save preview in ")});
            }
            if (this.b == CameraEditorContentType.MEDIA && g3 != null) {
                int c = mnyVar.c();
                this.g.getClass();
                if (g3.exists()) {
                    ExifInterface exifInterface = new ExifInterface(g3.getAbsolutePath());
                    exifInterface.setAttribute("Orientation", String.valueOf(c != 0 ? c != 1 ? c != 2 ? c != 3 ? 0 : 8 : 3 : 6 : 1));
                    exifInterface.saveAttributes();
                }
            }
            if (processType == ProcessType.SAVE && g3 != null) {
                Context requireContext = ((g440) this.a.c).getRequireContext();
                io.reactivex.rxjava3.internal.operators.single.b0 m = com.vk.core.files.b.c(new com.vk.core.files.b(requireContext), g3, ExternalDirType.IMAGES, 4).m(io.reactivex.rxjava3.android.schedulers.a.b());
                p41 p41Var = new p41(new wd3(4, requireContext, this), 7);
                int i3 = kwg0.a;
                this.e.invoke(m.subscribe(p41Var, new hwg0()));
                return null;
            }
            l3.getClass();
            if (!L.m(loggerOutputTarget)) {
                L.u(l3, L.LogType.d, new Object[]{obj, "story upload params " + storyUploadParams});
            }
            if (storyUploadParams != null) {
                yo9 b3 = mnyVar.b(tam0Var, g2);
                l3.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.LogType logType = L.LogType.d;
                    StringBuilder sb6 = new StringBuilder("overlay data ");
                    sb6.append(b3 != null ? (Bitmap) b3.c : null);
                    L.u(l3, logType, new Object[]{obj, sb6.toString()});
                }
                storyUploadParams.j = b3 != null ? (ClickableStickers) b3.d : null;
                if (!z) {
                    Serializer.c<StoryMediaData> cVar = StoryMediaData.CREATOR;
                    if (g3 == null) {
                        return null;
                    }
                    return new StoryMediaData(g3, null, storyUploadParams, null);
                }
                File f2 = b.f(d, com.vk.core.files.a.t());
                l3.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l3, L.LogType.d, new Object[]{obj, z9r.a(f2, "save bitmap at ")});
                }
                if (f2 != null) {
                    CameraVideoEncoderParameters b4 = b.b(f2, d2, b(tam0Var));
                    b4.d = g3;
                    txl0 txl0Var = tam0Var.v;
                    if (txl0Var != null) {
                        skd.k(b4, txl0Var);
                        b4.f = false;
                    }
                    return new StoryMediaData(null, b4, storyUploadParams, null);
                }
                if (d == null) {
                    sb2 = sb;
                    sb2.append("background bitmap is null");
                    sb2.append('\n');
                } else {
                    sb2 = sb;
                    sb2.append("inputFile is null");
                    sb2.append('\n');
                }
                AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.BITMAP_ERRORS);
                aggregateEventBuilder.w(0, erm0.D0(255, sb2.toString()));
                aggregateEventBuilder.q();
                return null;
            }
        }
        return null;
    }
}
