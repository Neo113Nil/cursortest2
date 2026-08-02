package com.vk.clips.upload.vk.impl.uploader;

import android.os.Handler;
import android.os.Looper;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.log.L;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import xsna.asu0;
import xsna.bi5;
import xsna.gpa0;
import xsna.hed;
import xsna.ied;
import xsna.uq10;
import xsna.xke;

/* compiled from: ClipsVideoEncoder.kt */
/* loaded from: classes17.dex */
public final class f {
    public final MediaPipelineComponent a;
    public final File b;
    public final ClipsEncoderParameters c;
    public final hed d;
    public final int e;
    public final xke f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicReference<gpa0> i = new AtomicReference<>();
    public List<? extends uq10> j = EmptyList.b;

    /* compiled from: ClipsVideoEncoder.kt */
    public final class a implements ied {
        public a() {
        }

        @Override // xsna.ied
        public final File a() {
            return f.this.b;
        }

        @Override // xsna.ied
        public final void cancel() {
            L.e("cancel encode");
            f fVar = f.this;
            fVar.h.set(true);
            gpa0 gpa0Var = fVar.i.get();
            if (gpa0Var != null) {
                gpa0Var.cancel();
            } else {
                L.e("ClipsVideoEncoder", "try to cancel but encoder is NULL");
            }
        }
    }

    public f(MediaPipelineComponent mediaPipelineComponent, File file, ClipsEncoderParameters clipsEncoderParameters, hed hedVar, int i, xke xkeVar) {
        this.a = mediaPipelineComponent;
        this.b = file;
        this.c = clipsEncoderParameters;
        this.d = hedVar;
        this.e = i;
        this.f = xkeVar;
    }

    public final a a() {
        asu0.a.getClass();
        asu0.h().execute(new bi5(this, 3));
        return new a();
    }

    public final void b() {
        Iterator<T> it = this.j.iterator();
        while (it.hasNext()) {
            ((uq10) it.next()).e();
        }
    }
}
