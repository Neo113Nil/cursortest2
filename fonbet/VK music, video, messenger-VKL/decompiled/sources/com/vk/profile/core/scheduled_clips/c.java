package com.vk.profile.core.scheduled_clips;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistDto;
import com.vk.dto.common.id.UserId;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.profile.core.scheduled_clips.d;
import com.vk.profile.core.scheduled_clips.g;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1i;
import xsna.a7f0;
import xsna.c1i;
import xsna.e1i;
import xsna.gr3;
import xsna.kf3;
import xsna.lgj0;
import xsna.mo1;
import xsna.ngj0;
import xsna.rsg0;
import xsna.wk50;
import xsna.wx4;
import xsna.yfb;

/* compiled from: CommunityScheduledClipsGridFeature.kt */
/* loaded from: classes5.dex */
public final class c extends wk50<c1i, a1i, b, d> {
    public final e1i f;
    public final wx4 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(e1i e1iVar, UserId userId) {
        super(new b.a(userId, false), new e(e1iVar, r0));
        wx4 wx4Var = new wx4(2);
        this.f = e1iVar;
        this.g = wx4Var;
    }

    @Override // xsna.wk50
    public final void N(a1i a1iVar, b bVar) {
        b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            if (aVar.c) {
                T(d.C1643d.b);
            }
            UserId userId = aVar.b;
            this.f.getClass();
            a7f0.a.f(this, rsg0.D0(yfb.x(lgj0.a.g(new ngj0(), userId, null, null, null, Boolean.FALSE, ShortVideoGetOwnerVideosPlaylistDto.SCHEDULED, null, null, null, null, 65486))).l(new kf3(new mo1(21), 14)), new gr3(this, 29), new com.vk.im.engine.internal.api_commands.messages.a(this, 28), 1);
            return;
        }
        boolean equals = bVar2.equals(b.C1642b.b);
        wx4 wx4Var = this.g;
        if (equals) {
            wx4Var.a(g.a.a);
        } else if (bVar2 instanceof b.c) {
            wx4Var.a(new g.b(((b.c) bVar2).b));
        } else {
            if (!(bVar2 instanceof b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new d.e(((b.d) bVar2).b));
        }
    }
}
