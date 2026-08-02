package com.vk.video.profile.presentation;

import android.content.res.Resources;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.video.profile.exceptions.DeactivatedUserException;
import com.vk.video.profile.exceptions.UserNotAuthorizedException;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.profile.presentation.f;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.c9t0;
import xsna.dm50;
import xsna.drm0;
import xsna.epx;
import xsna.fs1;
import xsna.m9t0;
import xsna.o25;
import xsna.o5o;
import xsna.ou1;
import xsna.p7t0;
import xsna.qtk0;
import xsna.rgt0;
import xsna.skj0;
import xsna.u490;
import xsna.y88;

/* compiled from: VideoProfileReducer.kt */
/* loaded from: classes6.dex */
public final class g extends dm50<m9t0, f, c9t0> {
    public final Resources d;
    public final boolean e;
    public final String f;
    public final o5o g;
    public final bpn0 h;

    public g(Resources resources, boolean z, String str, o5o o5oVar, VideoProfileSource videoProfileSource, ou1 ou1Var) {
        super(new c9t0.d(videoProfileSource));
        this.d = resources;
        this.e = z;
        this.f = str;
        this.g = o5oVar;
        this.h = new bpn0(new rgt0(1, this, ou1Var));
    }

    public static c9t0.b i(c9t0 c9t0Var, u490 u490Var, List list) {
        Owner owner = u490Var.a;
        if (owner.i(8)) {
            return new c9t0.c(c9t0Var.b, new DeactivatedUserException(), owner.b);
        }
        return new c9t0.e(c9t0Var.b, new qtk0.a(list), new qtk0.a(u490Var));
    }

    public static c9t0.a j(VideoProfileSource videoProfileSource, Throwable th) {
        if (th instanceof UserNotAuthorizedException) {
            return new c9t0.a(videoProfileSource, EmptyList.b, false, y88.b.a, fs1.c.a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dm50
    public final c9t0 c(c9t0 c9t0Var, f fVar) {
        UserId userId;
        p7t0 p7t0Var;
        c9t0 c9t0Var2 = c9t0Var;
        f fVar2 = fVar;
        VideoProfileSource videoProfileSource = c9t0Var2.b;
        if (fVar2 instanceof f.e) {
            f.e eVar = (f.e) fVar2;
            if (eVar instanceof f.e.b) {
                return new c9t0.e(videoProfileSource, new qtk0.b(), new qtk0.b());
            }
            if (eVar instanceof f.e.c) {
                f.e.c cVar = (f.e.c) eVar;
                return i(c9t0Var2, cVar.c, cVar.b);
            }
            if (!(eVar instanceof f.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f.e.a aVar = (f.e.a) eVar;
            c9t0.a j = j(videoProfileSource, aVar.b);
            if (j == null) {
                return new c9t0.c(c9t0Var2.b, aVar.b, aVar.c);
            }
            return j;
        }
        if (fVar2 instanceof f.g) {
            f.g gVar = (f.g) fVar2;
            if (c9t0Var2 instanceof c9t0.a) {
                c9t0.a aVar2 = (c9t0.a) c9t0Var2;
                if (gVar instanceof f.g.b) {
                    return c9t0.a.h(aVar2, null, null, true, null, null, 27);
                }
                if (gVar instanceof f.g.a) {
                    return c9t0.a.h(aVar2, null, null, false, null, null, 27);
                }
                if (!(gVar instanceof f.g.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f.g.c cVar2 = (f.g.c) gVar;
                return i(aVar2, cVar2.c, cVar2.b);
            }
            if (c9t0Var2 instanceof c9t0.e) {
                c9t0.e eVar2 = (c9t0.e) c9t0Var2;
                if (gVar instanceof f.g.b) {
                    return c9t0.e.h(eVar2, null, null, false, false, null, null, null, true, 255);
                }
                if (gVar instanceof f.g.a) {
                    c9t0.a j2 = j(eVar2.c, ((f.g.a) gVar).b);
                    return j2 == null ? c9t0.e.h(eVar2, null, null, false, false, null, null, null, false, 255) : j2;
                }
                if (!(gVar instanceof f.g.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f.g.c cVar3 = (f.g.c) gVar;
                return i(eVar2, cVar3.c, cVar3.b);
            }
            if (!(c9t0Var2 instanceof c9t0.c)) {
                if (c9t0Var2 instanceof c9t0.d) {
                    return c9t0Var2;
                }
                throw new NoWhenBranchMatchedException();
            }
            c9t0.c cVar4 = (c9t0.c) c9t0Var2;
            if (gVar instanceof f.g.b) {
                return cVar4;
            }
            if (gVar instanceof f.g.a) {
                f.g.a aVar3 = (f.g.a) gVar;
                c9t0.a j3 = j(cVar4.c, aVar3.b);
                return j3 == null ? c9t0.c.h(cVar4, null, aVar3.b, aVar3.c, null, null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) : j3;
            }
            if (!(gVar instanceof f.g.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f.g.c cVar5 = (f.g.c) gVar;
            return i(cVar4, cVar5.c, cVar5.b);
        }
        if (fVar2 instanceof f.b) {
            f.b bVar = (f.b) fVar2;
            if (bVar instanceof f.b.a) {
                return c9t0.c(c9t0Var2, y88.a.a);
            }
            if (epx.f(bVar, f.b.c.b)) {
                return c9t0.c(c9t0Var2, y88.c.a);
            }
            if (epx.f(bVar, f.b.C1959b.b)) {
                return c9t0.c(c9t0Var2, y88.b.a);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fVar2 instanceof f.a) {
            f.a aVar4 = (f.a) fVar2;
            if (!(c9t0Var2 instanceof c9t0.e)) {
                return c9t0Var2;
            }
            if (aVar4 instanceof f.a.b) {
                ((f.a.b) aVar4).getClass();
                return c9t0.e.h((c9t0.e) c9t0Var2, null, null, false, false, null, null, new fs1.b(), false, 383);
            }
            if (epx.f(aVar4, f.a.C1958a.b)) {
                return c9t0.e.h((c9t0.e) c9t0Var2, null, null, false, false, null, null, fs1.a.a, false, 383);
            }
            if (epx.f(aVar4, f.a.c.b)) {
                return c9t0.e.h((c9t0.e) c9t0Var2, null, null, false, false, null, null, fs1.c.a, false, 383);
            }
            throw new NoWhenBranchMatchedException();
        }
        VideoProfileSource videoProfileSource2 = null;
        if (fVar2 instanceof f.c) {
            f.c cVar6 = (f.c) fVar2;
            if (!(c9t0Var2 instanceof c9t0.e)) {
                return c9t0Var2;
            }
            c9t0.e eVar3 = (c9t0.e) c9t0Var2;
            qtk0<u490> qtk0Var = eVar3.e;
            if (!(qtk0Var instanceof qtk0.a)) {
                return c9t0Var2;
            }
            if (!(cVar6 instanceof f.c.a)) {
                if (cVar6 instanceof f.c.b) {
                    return c9t0.e.h(eVar3, null, new qtk0.a(null), false, false, null, null, null, false, 507);
                }
                throw new NoWhenBranchMatchedException();
            }
            u490 u490Var = (u490) ((qtk0.a) qtk0Var).a;
            p7t0 p7t0Var2 = u490Var.s;
            if (p7t0Var2 != null) {
                ((f.c.a) cVar6).getClass();
                p7t0Var = new p7t0(p7t0Var2.e, p7t0Var2.a, !drm0.N(null) || u490Var.s.b, p7t0Var2.c, p7t0Var2.d);
            } else {
                p7t0Var = null;
            }
            ((f.c.a) cVar6).getClass();
            return c9t0.e.h(eVar3, null, new qtk0.a(u490.a(u490Var, false, null, p7t0Var, 3932031)), false, false, null, null, null, false, 507);
        }
        if (fVar2 instanceof f.AbstractC1960f) {
            f.AbstractC1960f abstractC1960f = (f.AbstractC1960f) fVar2;
            if (!(c9t0Var2 instanceof c9t0.e)) {
                return c9t0Var2;
            }
            if (epx.f(abstractC1960f, f.AbstractC1960f.a.b)) {
                return c9t0.e.h((c9t0.e) c9t0Var2, null, null, false, false, null, null, null, false, 503);
            }
            if (epx.f(abstractC1960f, f.AbstractC1960f.b.b)) {
                return c9t0.e.h((c9t0.e) c9t0Var2, null, null, true, false, null, null, null, false, 503);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (fVar2 instanceof f.h) {
            f.h hVar = (f.h) fVar2;
            if (!(c9t0Var2 instanceof c9t0.e)) {
                return c9t0Var2;
            }
            c9t0.e eVar4 = (c9t0.e) c9t0Var2;
            qtk0<u490> qtk0Var2 = eVar4.e;
            if (!(qtk0Var2 instanceof qtk0.a)) {
                return c9t0Var2;
            }
            if (epx.f(hVar, f.h.e.b)) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, !r0.i, null, null, 4194047)), false, true, null, null, null, false, 491);
            }
            if (epx.f(hVar, f.h.g.b)) {
                return c9t0.e.h(eVar4, null, null, false, false, null, null, null, false, 495);
            }
            if (epx.f(hVar, f.h.i.b)) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, false, null, null, 4193791)), false, false, null, null, null, false, 491);
            }
            if (epx.f(hVar, f.h.C1962h.b)) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, false, VideoNotificationsStatus.PREFERRED, null, 4193791)), false, false, null, null, null, false, 491);
            }
            if (epx.f(hVar, f.h.c.b)) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, !r0.i, null, null, 4194047)), false, false, null, null, null, false, 491);
            }
            if (hVar instanceof f.h.d) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, false, ((f.h.d) hVar).b, null, 4193791)), false, false, null, null, null, false, 491);
            }
            if (hVar instanceof f.h.b) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, ((f.h.b) hVar).b, null, null, 4194047)), false, false, null, null, null, false, 491);
            }
            if (hVar instanceof f.h.a) {
                return c9t0.e.h(eVar4, null, new qtk0.a(u490.a((u490) ((qtk0.a) qtk0Var2).a, false, ((f.h.a) hVar).b, null, 4193791)), false, true, null, null, null, false, 491);
            }
            if (hVar instanceof f.h.C1961f) {
                return c9t0.c(c9t0Var2, y88.d.a);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(fVar2 instanceof f.i)) {
            if (fVar2 instanceof f.d) {
                return c9t0Var2;
            }
            if (!(fVar2 instanceof f.j)) {
                throw new NoWhenBranchMatchedException();
            }
            WarningNotification warningNotification = ((f.j) fVar2).b;
            if (c9t0Var2 instanceof c9t0.a) {
                c9t0.a aVar5 = (c9t0.a) c9t0Var2;
                ArrayList arrayList = new ArrayList(aVar5.d);
                arrayList.add(Integer.valueOf(warningNotification.b));
                return c9t0.a.h(aVar5, null, arrayList, false, null, null, 29);
            }
            if (!(c9t0Var2 instanceof c9t0.e)) {
                return c9t0Var2;
            }
            c9t0.e eVar5 = (c9t0.e) c9t0Var2;
            ArrayList arrayList2 = new ArrayList(eVar5.h);
            arrayList2.add(Integer.valueOf(warningNotification.b));
            return c9t0.e.h(eVar5, null, null, false, false, arrayList2, null, null, false, 479);
        }
        if ((videoProfileSource instanceof VideoProfileSource.ForeignProfile) && o25.a().b() && o25.a().a(((VideoProfileSource.ForeignProfile) videoProfileSource).b)) {
            videoProfileSource2 = videoProfileSource;
        }
        if (videoProfileSource2 != null) {
            if (videoProfileSource2 instanceof VideoProfileSource.ForeignProfile) {
                userId = ((VideoProfileSource.ForeignProfile) videoProfileSource2).b;
            } else {
                if (!(videoProfileSource2 instanceof VideoProfileSource.OwnProfile)) {
                    throw new NoWhenBranchMatchedException();
                }
                userId = ((VideoProfileSource.OwnProfile) videoProfileSource2).b;
            }
            videoProfileSource = new VideoProfileSource.OwnProfile(userId);
        }
        if (c9t0Var2 instanceof c9t0.a) {
            return c9t0.a.h((c9t0.a) c9t0Var2, videoProfileSource, null, false, null, null, 30);
        }
        if (c9t0Var2 instanceof c9t0.e) {
            return c9t0.e.h((c9t0.e) c9t0Var2, videoProfileSource, null, false, false, null, null, null, false, 510);
        }
        if (c9t0Var2 instanceof c9t0.c) {
            return c9t0.c.h((c9t0.c) c9t0Var2, videoProfileSource, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        if (c9t0Var2 instanceof c9t0.d) {
            return new c9t0.d(videoProfileSource);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final m9t0 d() {
        return new m9t0(e(new skj0(this, 15)));
    }

    @Override // xsna.dm50
    public final void h(c9t0 c9t0Var, m9t0 m9t0Var) {
        c9t0 c9t0Var2 = c9t0Var;
        m9t0 m9t0Var2 = m9t0Var;
        if (c9t0Var2 instanceof c9t0.b) {
            f(m9t0Var2.a, c9t0Var2);
        }
    }
}
