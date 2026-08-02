package com.vk.clips.playlists.ui.picker;

import android.content.Context;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.clips.playlists.ui.picker.a;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.playlists.ui.picker.e;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.cse;
import xsna.due;
import xsna.e1;
import xsna.f4z;
import xsna.fq1;
import xsna.gre;
import xsna.hg1;
import xsna.ix2;
import xsna.j9;
import xsna.jue;
import xsna.kue;
import xsna.nqe;
import xsna.nve;
import xsna.on;
import xsna.oqe;
import xsna.p7;
import xsna.po1;
import xsna.pqe;
import xsna.qqe;
import xsna.uqe;
import xsna.v5;
import xsna.w5;
import xsna.wk50;

/* compiled from: ClipsPlaylistPickerFeature.kt */
/* loaded from: classes16.dex */
public final class b extends wk50<f, ClipsPlaylistPickerState, a, c> {
    public final Context f;
    public final ClipsPlaylistPickerParams g;
    public final kue h;
    public final due i;
    public final cse j;
    public final f4z<uqe> k;
    public final f4z<e> l;

    public b(Context context, ClipsPlaylistPickerParams clipsPlaylistPickerParams, kue kueVar, due dueVar, cse cseVar, d dVar) {
        super(a.b.b, dVar);
        this.f = context;
        this.g = clipsPlaylistPickerParams;
        this.h = kueVar;
        this.i = dueVar;
        this.j = cseVar;
        this.k = new f4z<>();
        this.l = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(ClipsPlaylistPickerState clipsPlaylistPickerState, a aVar) {
        ClipsPlaylistPickerState clipsPlaylistPickerState2 = clipsPlaylistPickerState;
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.C0631a;
        f4z<uqe> f4zVar = this.k;
        if (z) {
            f4zVar.b(uqe.a.a);
            return;
        }
        boolean z2 = aVar2 instanceof a.b;
        c.b.d dVar = c.b.d.b;
        if (z2) {
            cse cseVar = this.j;
            a7f0.a.e(this, cseVar.b(), null, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 22), null, null, 13);
            a7f0.a.e(this, cseVar.c(), null, new e1(this, 27), null, null, 13);
            T(dVar);
            W(null);
            return;
        }
        if (aVar2 instanceof a.d) {
            T(dVar);
            W(null);
            return;
        }
        if (aVar2 instanceof a.e) {
            if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content) {
                ClipsPlaylistPickerState.Content content = (ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2;
                String str = content.f;
                if (content.g != ClipsPlaylistPickerState.Content.LoadingState.NONE || str == null) {
                    return;
                }
                T(c.b.C0633b.b);
                W(str);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.c) {
            a.c cVar = (a.c) aVar2;
            if (!(cVar instanceof a.c.C0632a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content) {
                ClipsPlaylistPickerState.Content content2 = (ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2;
                int i = content2.c;
                ClipsPlaylistPickerState.c cVar2 = content2.b;
                if (cVar2 instanceof ClipsPlaylistPickerState.c.b) {
                    String str2 = ((a.c.C0632a) cVar).b;
                    if (cVar2 instanceof ClipsPlaylistPickerState.c.b.a) {
                        ClipsPlaylistPickerState.c.b.a aVar3 = (ClipsPlaylistPickerState.c.b.a) cVar2;
                        boolean z3 = aVar3.b.size() + content2.d == i;
                        boolean contains = aVar3.b.contains(str2);
                        if (z3 && !contains) {
                            this.l.b(new e.a(new nve(i)));
                            return;
                        }
                    }
                    T(new c.InterfaceC0635c.a(str2));
                    return;
                }
                return;
            }
            return;
        }
        if (aVar2 instanceof pqe) {
            f4zVar.b(uqe.b.a);
            return;
        }
        boolean z4 = aVar2 instanceof nqe;
        Context context = this.f;
        ClipsPlaylistPickerParams clipsPlaylistPickerParams = this.g;
        due dueVar = this.i;
        if (z4) {
            ClipsPlaylistPickerState.c g = clipsPlaylistPickerState2.g();
            if ((clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content) && (g instanceof ClipsPlaylistPickerState.c.b.a)) {
                List<VideoFile> list = ((ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2).e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ClipsPlaylistPickerState.c.b.a) g).b.contains(((VideoFile) obj).r1())) {
                        arrayList.add(obj);
                    }
                }
                T(new c.a(true));
                a7f0.a.f(this, hg1.n(dueVar.g(clipsPlaylistPickerParams.Z0(), arrayList), context, false, null, 62), new po1(this, 22), new ix2(this, 27), 1);
                return;
            }
            return;
        }
        if (!(aVar2 instanceof oqe)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsPlaylistPickerState.c g2 = clipsPlaylistPickerState2.g();
        if ((clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content) && (g2 instanceof ClipsPlaylistPickerState.c.b.C0630b)) {
            List<VideoFile> list2 = ((ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2).e;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((ClipsPlaylistPickerState.c.b.C0630b) g2).a.contains(((VideoFile) obj2).r1())) {
                    arrayList2.add(obj2);
                }
            }
            T(new c.a(true));
            a7f0.a.f(this, hg1.n(dueVar.f(clipsPlaylistPickerParams.Z0(), arrayList2), context, false, null, 62), new j9(this, 25), new com.vk.movika.sdk.base.data.a(this, 25), 1);
        }
    }

    public final f4z<uqe> U() {
        return this.k;
    }

    public final f4z<e> V() {
        return this.l;
    }

    public final void W(String str) {
        y b;
        x B;
        ClipsPlaylistPickerParams clipsPlaylistPickerParams = this.g;
        kue kueVar = this.h;
        if (str != null) {
            if (clipsPlaylistPickerParams instanceof ClipsPlaylistPickerParams.AddClips) {
                ClipsPlaylist clipsPlaylist = ((ClipsPlaylistPickerParams.AddClips) clipsPlaylistPickerParams).b;
                b = kueVar.a(clipsPlaylist.b, clipsPlaylist.f, str);
            } else {
                if (!(clipsPlaylistPickerParams instanceof ClipsPlaylistPickerParams.RemoveClips)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsPlaylist clipsPlaylist2 = ((ClipsPlaylistPickerParams.RemoveClips) clipsPlaylistPickerParams).b;
                b = kueVar.b(clipsPlaylist2.b, clipsPlaylist2.f, str);
            }
            a7f0.a.f(this, b, new w5(this, 24), new on(this, 22), 1);
            return;
        }
        if (clipsPlaylistPickerParams instanceof ClipsPlaylistPickerParams.AddClips) {
            ClipsPlaylist clipsPlaylist3 = ((ClipsPlaylistPickerParams.AddClips) clipsPlaylistPickerParams).b;
            UserId userId = clipsPlaylist3.f;
            int i = clipsPlaylist3.b;
            B = x.B(kueVar.c(i, userId), kueVar.a(i, userId, null), new p7(new gre(1), 17));
        } else {
            if (!(clipsPlaylistPickerParams instanceof ClipsPlaylistPickerParams.RemoveClips)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipsPlaylist clipsPlaylist4 = ((ClipsPlaylistPickerParams.RemoveClips) clipsPlaylistPickerParams).b;
            UserId userId2 = clipsPlaylist4.f;
            int i2 = clipsPlaylist4.b;
            B = x.B(kueVar.c(i2, userId2), kueVar.b(i2, userId2, null), new fq1(new jue(0), 8));
        }
        a7f0.a.f(this, B, new qqe(this, 0), new v5(this, 27), 1);
    }
}
