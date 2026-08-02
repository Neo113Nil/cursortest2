package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipAudioTemplate;
import kotlin.LazyThreadSafetyMode;
import xsna.asu0;
import xsna.bpf;
import xsna.c40;
import xsna.d9f;
import xsna.dhr0;
import xsna.fks0;
import xsna.itg0;
import xsna.j41;
import xsna.krv0;
import xsna.msy;
import xsna.o2e;
import xsna.qzv0;
import xsna.rte;
import xsna.v8f;
import xsna.vyd;

/* compiled from: DraftShortVideoEvent.kt */
/* loaded from: classes.dex */
public final class d {
    public final vyd a;
    public final v8f b;
    public final d9f c;
    public final qzv0 d;
    public final Object e;

    public d(vyd vydVar, v8f v8fVar, d9f d9fVar, qzv0 qzv0Var, fks0 fks0Var) {
        this.a = vydVar;
        this.b = v8fVar;
        this.c = d9fVar;
        this.d = qzv0Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new bpf(fks0Var, 1));
    }

    public final void a(VideoFile videoFile, View view, Activity activity) {
        String Y6 = videoFile.Y6();
        if (Y6 == null) {
            return;
        }
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        ClipAudioTemplate Mb = clipVideoFile != null ? clipVideoFile.Mb() : null;
        if (Mb != null) {
            v8f v8fVar = this.b;
            itg0.b(view, v8fVar.a(activity, Mb.zb()).m(asu0.a.d()).subscribe(new c40(new o2e(this, v8fVar, view, Mb, Y6, 1), 18), new j41(new rte(v8fVar, activity, Y6, 1), 13)));
            return;
        }
        vyd.a aVar = new vyd.a(4, (Integer) null, Y6);
        TypedValue typedValue = krv0.a;
        if (krv0.b != null) {
            this.a.b(activity, aVar, new vyd.c(dhr0.u().c, 12, null), new ClipsEditorSessionParams(null, false, false, false, null, false, 63, null));
        }
    }
}
