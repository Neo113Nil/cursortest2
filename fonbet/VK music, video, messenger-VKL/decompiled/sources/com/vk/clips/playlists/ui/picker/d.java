package com.vk.clips.playlists.ui.picker;

import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.clips.playlists.ui.picker.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.dm50;
import xsna.e8b0;
import xsna.ha;
import xsna.izi0;
import xsna.j5g;
import xsna.ka;
import xsna.kf1;
import xsna.tqe;
import xsna.vpe;
import xsna.xpe;

/* compiled from: ClipsPlaylistPickerReducer.kt */
/* loaded from: classes16.dex */
public final class d extends dm50<f, c, ClipsPlaylistPickerState> {
    public final ClipsPlaylistPickerParams d;
    public final vpe e;
    public final tqe f;

    public d(ClipsPlaylistPickerParams clipsPlaylistPickerParams, vpe vpeVar, tqe tqeVar) {
        super(new ClipsPlaylistPickerState.b(ClipsPlaylistPickerState.c.a.a));
        this.d = clipsPlaylistPickerParams;
        this.e = vpeVar;
        this.f = tqeVar;
    }

    @Override // xsna.dm50
    public final ClipsPlaylistPickerState c(ClipsPlaylistPickerState clipsPlaylistPickerState, c cVar) {
        ClipsPlaylistPickerState.c g;
        ClipsPlaylistPickerState.c cVar2;
        ClipsPlaylistPickerState clipsPlaylistPickerState2 = clipsPlaylistPickerState;
        c cVar3 = cVar;
        if (!(cVar3 instanceof c.b)) {
            if (!(cVar3 instanceof c.InterfaceC0635c)) {
                if (cVar3 instanceof c.a) {
                    return clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content ? ClipsPlaylistPickerState.Content.a((ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2, null, null, null, null, ((c.a) cVar3).b, 63) : clipsPlaylistPickerState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            c.InterfaceC0635c interfaceC0635c = (c.InterfaceC0635c) cVar3;
            if (!(interfaceC0635c instanceof c.InterfaceC0635c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((c.InterfaceC0635c.a) interfaceC0635c).b;
            ClipsPlaylistPickerState.c g2 = clipsPlaylistPickerState2.g();
            if (g2 instanceof ClipsPlaylistPickerState.c.b.a) {
                ClipsPlaylistPickerState.c.b.a aVar = (ClipsPlaylistPickerState.c.b.a) g2;
                Set<String> set = aVar.b;
                Set<String> set2 = aVar.a;
                g = set.contains(str) ? new ClipsPlaylistPickerState.c.b.a(set2, izi0.f(set, str)) : new ClipsPlaylistPickerState.c.b.a(set2, izi0.k(set, str));
            } else if (g2 instanceof ClipsPlaylistPickerState.c.b.C0630b) {
                Set<String> set3 = ((ClipsPlaylistPickerState.c.b.C0630b) g2).a;
                g = set3.contains(str) ? new ClipsPlaylistPickerState.c.b.C0630b(izi0.f(set3, str)) : new ClipsPlaylistPickerState.c.b.C0630b(izi0.k(set3, str));
            } else {
                g = clipsPlaylistPickerState2.g();
            }
            ClipsPlaylistPickerState.c cVar4 = g;
            if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.b) {
                return new ClipsPlaylistPickerState.b(cVar4);
            }
            if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content) {
                return ClipsPlaylistPickerState.Content.a((ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2, cVar4, null, null, null, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.a) {
                return new ClipsPlaylistPickerState.a(cVar4);
            }
            throw new NoWhenBranchMatchedException();
        }
        c.b bVar = (c.b) cVar3;
        if (bVar instanceof c.b.d) {
            return new ClipsPlaylistPickerState.b(clipsPlaylistPickerState2.g());
        }
        if (bVar instanceof c.b.C0633b) {
            return clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content ? ClipsPlaylistPickerState.Content.a((ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2, null, null, null, ClipsPlaylistPickerState.Content.LoadingState.LOADING_NEXT, false, 95) : clipsPlaylistPickerState2;
        }
        if (bVar instanceof c.b.e) {
            c.b.e eVar = (c.b.e) bVar;
            e8b0 e8b0Var = eVar.b;
            int i = e8b0Var.b;
            int i2 = e8b0Var.a;
            xpe xpeVar = eVar.c;
            return new ClipsPlaylistPickerState.Content(this.d instanceof ClipsPlaylistPickerParams.AddClips ? new ClipsPlaylistPickerState.c.b.a(xpeVar.b, EmptySet.b) : new ClipsPlaylistPickerState.c.b.C0630b(EmptySet.b), i2, i, xpeVar.a, xpeVar.c, ClipsPlaylistPickerState.Content.LoadingState.NONE, false);
        }
        if (!(bVar instanceof c.b.C0634c)) {
            if (bVar instanceof c.b.a) {
                return new ClipsPlaylistPickerState.a(clipsPlaylistPickerState2.g());
            }
            throw new NoWhenBranchMatchedException();
        }
        xpe xpeVar2 = ((c.b.C0634c) bVar).b;
        if (!(clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content)) {
            return clipsPlaylistPickerState2;
        }
        ClipsPlaylistPickerState.Content content = (ClipsPlaylistPickerState.Content) clipsPlaylistPickerState2;
        ArrayList u0 = j5g.u0(xpeVar2.a, content.e);
        String str2 = xpeVar2.c;
        ClipsPlaylistPickerState.Content.LoadingState loadingState = ClipsPlaylistPickerState.Content.LoadingState.NONE;
        ClipsPlaylistPickerState.c cVar5 = content.b;
        if (cVar5 instanceof ClipsPlaylistPickerState.c.b.a) {
            ClipsPlaylistPickerState.c.b.a aVar2 = (ClipsPlaylistPickerState.c.b.a) cVar5;
            cVar2 = new ClipsPlaylistPickerState.c.b.a(izi0.j(aVar2.a, xpeVar2.b), aVar2.b);
        } else {
            cVar2 = cVar5;
        }
        return ClipsPlaylistPickerState.Content.a(content, cVar2, u0, str2, loadingState, false, 70);
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new ha(this, 18)), e(new kf1(this, 20)), e(new ka(this, 25)));
    }

    @Override // xsna.dm50
    public final void h(ClipsPlaylistPickerState clipsPlaylistPickerState, f fVar) {
        ClipsPlaylistPickerState clipsPlaylistPickerState2 = clipsPlaylistPickerState;
        f fVar2 = fVar;
        if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.b) {
            f(fVar2.a, clipsPlaylistPickerState2);
        } else if (clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.Content) {
            f(fVar2.b, clipsPlaylistPickerState2);
        } else {
            if (!(clipsPlaylistPickerState2 instanceof ClipsPlaylistPickerState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(fVar2.c, clipsPlaylistPickerState2);
        }
    }
}
