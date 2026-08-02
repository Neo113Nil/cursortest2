package com.vk.clips.editor.voiceover.impl;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.f;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a1e;
import xsna.ak;
import xsna.c1e;
import xsna.c9d;
import xsna.cxd;
import xsna.d1e;
import xsna.e1e;
import xsna.e2e;
import xsna.el6;
import xsna.hg1;
import xsna.hwd;
import xsna.l00;
import xsna.l4p;
import xsna.lyd;
import xsna.msy;
import xsna.op1;
import xsna.pm1;
import xsna.q0e;
import xsna.s1;
import xsna.s6;
import xsna.szd;
import xsna.vl0;
import xsna.vu5;
import xsna.vzd;
import xsna.wzd;
import xsna.x8d;
import xsna.yzd;

/* compiled from: ClipsEditorVoiceoverDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class a implements x8d.a {
    public final Context a;
    public final q0e.e b;
    public final c9d c;
    public final szd d;
    public final e2e e;
    public final hwd f;
    public c h;
    public c i;
    public c j;
    public a1e l;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new s1(this, 24));
    public final f<Integer> k = new f<>();

    public a(Context context, q0e.e eVar, c9d c9dVar, szd szdVar, e2e e2eVar, hwd hwdVar) {
        this.a = context;
        this.b = eVar;
        this.c = c9dVar;
        this.d = szdVar;
        this.e = e2eVar;
        this.f = hwdVar;
    }

    public static String g(ClipsEditorMusicInfo clipsEditorMusicInfo) {
        StringBuilder sb = new StringBuilder("ClipsEditorMusicInfo[startMs=");
        sb.append(clipsEditorMusicInfo.d);
        sb.append(" finishMs=");
        sb.append(clipsEditorMusicInfo.e);
        sb.append(" delayMs=");
        sb.append(clipsEditorMusicInfo.f);
        sb.append("] musicTrack[durationMs=");
        return vu5.b(sb, clipsEditorMusicInfo.b.e, ']');
    }

    public final void a() {
        a1e a1eVar = this.l;
        if (a1eVar == null) {
            a1eVar = null;
        }
        if (a1eVar.f) {
            StringBuilder sb = new StringBuilder("already finishing return state=");
            a1e a1eVar2 = this.l;
            sb.append(a1eVar2 != null ? a1eVar2 : null);
            lyd.a.e(Arrays.copyOf(new Object[]{"ClipsEditorVoiceoverDelegateImpl", sb.toString()}, 2));
            return;
        }
        hg1.f(this.h);
        a1e a1eVar3 = this.l;
        if (a1eVar3 == null) {
            a1eVar3 = null;
        }
        this.l = a1e.a(a1eVar3, false, null, 30);
        this.c.d(true);
        v vVar = new v(new e1e(this, 0));
        e2e e2eVar = this.e;
        this.i = vVar.q(e2eVar.i.e().c()).m(e2eVar.i.e().d()).subscribe(new el6(new op1(this, 22), 10), new pm1(new l00(this, 20), 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsEditorVoiceOverAudioRecorder b() {
        return (ClipsEditorVoiceOverAudioRecorder) this.g.getValue();
    }

    @Override // xsna.x8d.a
    public final void c(long j) {
        a1e a1eVar = this.l;
        if (!(a1eVar == null ? null : a1eVar).a) {
            if (a1eVar == null) {
                a1eVar = null;
            }
            this.b.e(String.valueOf(a1eVar.b.b), false, d(), null);
            return;
        }
        com.vk.clips.editor.state.model.a aVar = this.d.o.a;
        if (a1eVar == null) {
            a1eVar = null;
        }
        ClipsEditorAudioItem a = aVar.a(String.valueOf(a1eVar.b.b));
        ClipsEditorMusicInfo clipsEditorMusicInfo = a.a;
        int i = (int) (j - clipsEditorMusicInfo.f);
        ClipsEditorAudioItem a2 = ClipsEditorAudioItem.a(a, ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, ClipsEditorMusicTrack.zb(clipsEditorMusicInfo.b, 0, i, null, 2039), null, 0, i, 0, null, 0, 2038), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
        h(a2, a2.f, EmptyList.b);
    }

    public final boolean d() {
        cxd cxdVar = this.e.k;
        return this.d.o.a.e() - this.c.n() > 100;
    }

    public final void e() {
        this.c.h(this);
        b().c = null;
        b().b.release();
        c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b.c(false);
    }

    public final void f() {
        c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        a1e a1eVar = this.l;
        if (a1eVar == null) {
            a1eVar = null;
        }
        if (a1eVar.a) {
            ClipsEditorVoiceOverAudioRecorder b = b();
            b.b(b.b);
            b().b.release();
        }
        a1e a1eVar2 = this.l;
        if (a1eVar2 == null) {
            a1eVar2 = null;
        }
        this.l = a1e.a(a1eVar2, false, null, 62);
        this.c.d(true);
        a1e a1eVar3 = this.l;
        String valueOf = String.valueOf((a1eVar3 != null ? a1eVar3 : null).b.b);
        EmptyList emptyList = EmptyList.b;
        szd szdVar = this.d;
        vzd.a(szdVar, valueOf, emptyList);
        vzd.c(szdVar, yzd.a(szdVar.o.a.b, false, false, false, false, false, 15));
        q0e.e eVar = this.b;
        eVar.b();
        eVar.a(false);
        e();
        v vVar = new v(new c1e(this, 0));
        e2e e2eVar = this.e;
        this.j = vVar.q(e2eVar.i.e().c()).m(e2eVar.i.e().d()).subscribe(new d1e(new ak(10), 0), new vl0(new s6(this, 20), 11));
    }

    public final void h(ClipsEditorAudioItem clipsEditorAudioItem, String str, List<? extends wzd> list) {
        szd szdVar = this.d;
        com.vk.clips.editor.state.model.a aVar = szdVar.o.a;
        szdVar.c(com.vk.clips.editor.state.model.a.c(aVar, null, null, null, l4p.d(aVar.e, str, clipsEditorAudioItem), null, null, 111), list);
    }
}
