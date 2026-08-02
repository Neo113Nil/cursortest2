package com.vk.profile.community.impl.ui.profile;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.movika.sdk.base.observable.u;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a9h;
import xsna.asg;
import xsna.beh;
import xsna.bi0;
import xsna.bsh;
import xsna.bwd0;
import xsna.c0h;
import xsna.c5g;
import xsna.cph;
import xsna.ctg;
import xsna.cuh;
import xsna.deh;
import xsna.dm50;
import xsna.duh;
import xsna.e43;
import xsna.ed0;
import xsna.epx;
import xsna.erh;
import xsna.frh;
import xsna.g5g;
import xsna.gwh;
import xsna.heh;
import xsna.hs1;
import xsna.i4e;
import xsna.iea0;
import xsna.j15;
import xsna.j5g;
import xsna.jmh;
import xsna.jph;
import xsna.kdh;
import xsna.lbe;
import xsna.lrh;
import xsna.nmh;
import xsna.p8u;
import xsna.pqs0;
import xsna.r4h;
import xsna.r8h;
import xsna.s3q0;
import xsna.s4i;
import xsna.sjw;
import xsna.spg;
import xsna.sst0;
import xsna.stc0;
import xsna.t6;
import xsna.tsh;
import xsna.vig0;
import xsna.vkh;
import xsna.wph;
import xsna.xrh;
import xsna.ynh;
import xsna.yph;
import xsna.z5a;
import xsna.zph;

/* compiled from: CommunityProfileReducer.kt */
/* loaded from: classes5.dex */
public final class e extends dm50<CommunityProfileViewState, d, CommunityProfileState> {
    public final UserId d;
    public final boolean e;
    public final duh f;
    public final jmh g;
    public final vkh h;
    public final a9h i;
    public final s4i j;
    public final cph k;
    public final frh l;
    public final heh m;
    public final bsh n;
    public final jph o;
    public final deh p;
    public final nmh q;
    public final tsh r;
    public final beh s;

    public e(UserId userId, CommunityProfileState communityProfileState, Context context, vig0 vig0Var, ctg ctgVar, ynh ynhVar, boolean z) {
        super(communityProfileState);
        this.d = userId;
        this.e = z;
        this.f = new duh();
        jmh jmhVar = new jmh();
        this.g = jmhVar;
        this.h = new vkh();
        this.i = new a9h();
        this.j = new s4i();
        cph cphVar = new cph(new lrh(context, vig0Var, ctgVar, ynhVar), z);
        this.k = cphVar;
        this.l = new frh(cphVar);
        this.m = z ? new yph(cphVar, jmhVar, new zph(new asg(context, ynhVar.e()))) : new wph();
        this.n = new bsh(cphVar);
        this.o = new jph(cphVar);
        this.p = new deh(cphVar);
        this.q = new nmh();
        this.r = new tsh(cphVar);
        this.s = new beh(cphVar);
    }

    public static CommunityProfileState i(CommunityProfileState communityProfileState, d.k kVar) {
        CommunityProfileState.LifecycleState lifecycleState;
        if (epx.f(kVar, d.k.a.b)) {
            lifecycleState = CommunityProfileState.LifecycleState.Created;
        } else if (epx.f(kVar, d.k.b.b)) {
            lifecycleState = CommunityProfileState.LifecycleState.Destroy;
        } else if (epx.f(kVar, d.k.c.b)) {
            lifecycleState = CommunityProfileState.LifecycleState.Pause;
        } else {
            if (!epx.f(kVar, d.k.C1613d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            lifecycleState = CommunityProfileState.LifecycleState.Resume;
        }
        return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, lifecycleState, false, 201326591);
    }

    @Override // xsna.dm50
    public final CommunityProfileState c(CommunityProfileState communityProfileState, d dVar) {
        List<r4h> list;
        List<r4h> list2;
        List<r4h> list3;
        List<r4h> a;
        List<r4h> list4;
        List<r4h> list5;
        ArrayList arrayList;
        xrh xrhVar;
        xrh c4043b;
        List<r4h> list6;
        int i;
        vkh.a aVar;
        boolean z;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList<StoriesContainer> arrayList6;
        CommunityProfileState communityProfileState2 = communityProfileState;
        d dVar2 = dVar;
        List<r4h> list7 = communityProfileState2.n;
        CommunityProfileContent communityProfileContent = communityProfileState2.d;
        CommunityProfileState.a aVar2 = communityProfileState2.l;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState2.b;
        boolean z2 = dVar2 instanceof d.i;
        frh frhVar = this.l;
        int i2 = 0;
        spg spgVar = null;
        r8h a2 = null;
        r8h a3 = null;
        CommunityProfileContent communityProfileContent2 = null;
        if (z2) {
            d.i iVar = (d.i) dVar2;
            frhVar.getClass();
            if (iVar.equals(d.i.b.b)) {
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, true, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435375);
            }
            if (iVar instanceof d.i.a) {
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, true, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435375);
            }
            if (!(iVar instanceof d.i.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d.i.c cVar = (d.i.c) iVar;
            ExtendedCommunityProfile extendedCommunityProfile2 = cVar.b;
            if (extendedCommunityProfile2.n2 == null) {
                if ((extendedCommunityProfile != null ? extendedCommunityProfile.n2 : null) != null) {
                    extendedCommunityProfile2.n2 = extendedCommunityProfile.n2;
                }
            }
            ArrayList<StoriesContainer> arrayList7 = extendedCommunityProfile2.d2;
            if (arrayList7 != null) {
                arrayList4 = new ArrayList();
                Iterator<StoriesContainer> it = arrayList7.iterator();
                while (it.hasNext()) {
                    g5g.y(it.next().g, arrayList4);
                }
            } else {
                arrayList4 = null;
            }
            if (extendedCommunityProfile == null || (arrayList6 = extendedCommunityProfile.d2) == null) {
                arrayList5 = null;
            } else {
                arrayList5 = new ArrayList();
                Iterator<StoriesContainer> it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    g5g.y(it2.next().g, arrayList5);
                }
            }
            if (epx.f(arrayList4, arrayList5)) {
                a2 = aVar2.a;
            } else {
                ArrayList<StoriesContainer> arrayList8 = extendedCommunityProfile2.d2;
                if (arrayList8 != null) {
                    a2 = r8h.a.a(bwd0.i(extendedCommunityProfile2), arrayList8, extendedCommunityProfile2.e2);
                }
            }
            kdh a4 = frh.a(extendedCommunityProfile2);
            List<r4h> a5 = frhVar.a.a(communityProfileState2, extendedCommunityProfile2, new erh(iVar, a2, a4, i2));
            boolean z3 = cVar.c;
            aVar2.getClass();
            return CommunityProfileState.a(communityProfileState2, extendedCommunityProfile2, 0, null, null, false, false, false, null, null, new CommunityProfileState.a(a2, z3), null, a5, cuh.a(communityProfileState2, extendedCommunityProfile2, false), null, 0, false, null, null, null, 0, a4, null, null, false, 125802414);
        }
        if (dVar2 instanceof d.o) {
            d.o oVar = (d.o) dVar2;
            frhVar.getClass();
            if (oVar.equals(d.o.b.b)) {
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, true, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435327);
            }
            if (oVar instanceof d.o.a) {
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435327);
            }
            if (!(oVar instanceof d.o.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d.o.c cVar2 = (d.o.c) oVar;
            ExtendedCommunityProfile extendedCommunityProfile3 = cVar2.b;
            if (extendedCommunityProfile != null && extendedCommunityProfile3.e2 == extendedCommunityProfile.e2) {
                ArrayList<StoriesContainer> arrayList9 = extendedCommunityProfile3.d2;
                if (arrayList9 != null) {
                    arrayList2 = new ArrayList();
                    Iterator<StoriesContainer> it3 = arrayList9.iterator();
                    while (it3.hasNext()) {
                        g5g.y(it3.next().g, arrayList2);
                    }
                } else {
                    arrayList2 = null;
                }
                ArrayList<StoriesContainer> arrayList10 = extendedCommunityProfile.d2;
                if (arrayList10 != null) {
                    arrayList3 = new ArrayList();
                    Iterator<StoriesContainer> it4 = arrayList10.iterator();
                    while (it4.hasNext()) {
                        g5g.y(it4.next().g, arrayList3);
                    }
                } else {
                    arrayList3 = null;
                }
                if (epx.f(arrayList2, arrayList3)) {
                    a3 = aVar2.a;
                    kdh a6 = frh.a(extendedCommunityProfile3);
                    return CommunityProfileState.a(communityProfileState2, extendedCommunityProfile3, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar2, a3, false, 2), null, frhVar.a.a(communityProfileState2, extendedCommunityProfile3, new bi0(9, a3, a6)), cuh.a(communityProfileState2, extendedCommunityProfile3, cVar2.c), null, 0, false, null, null, null, 0, a6, null, null, false, 125802366);
                }
            }
            ArrayList<StoriesContainer> arrayList11 = extendedCommunityProfile3.d2;
            if (arrayList11 != null) {
                a3 = r8h.a.a(bwd0.i(extendedCommunityProfile3), arrayList11, extendedCommunityProfile3.e2);
            }
            kdh a62 = frh.a(extendedCommunityProfile3);
            return CommunityProfileState.a(communityProfileState2, extendedCommunityProfile3, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar2, a3, false, 2), null, frhVar.a.a(communityProfileState2, extendedCommunityProfile3, new bi0(9, a3, a62)), cuh.a(communityProfileState2, extendedCommunityProfile3, cVar2.c), null, 0, false, null, null, null, 0, a62, null, null, false, 125802366);
        }
        boolean z4 = dVar2 instanceof d.g;
        vkh vkhVar = this.h;
        if (z4) {
            vkhVar.getClass();
            CommunityProfileContent communityProfileContent3 = ((d.g) dVar2).b;
            if (communityProfileContent == null) {
                aVar = new vkh.a(true, null);
            } else {
                List<CommunityProfileContentItem> list8 = communityProfileContent.b;
                int size = list8.size();
                List<CommunityProfileContentItem> list9 = communityProfileContent3.b;
                if (size != list9.size()) {
                    aVar = new vkh.a(true, CommunityProfileContent.a(communityProfileContent3, null, null, communityProfileContent.g, 1983));
                } else {
                    Iterator<T> it5 = list8.iterator();
                    CommunityProfileContent communityProfileContent4 = communityProfileContent;
                    boolean z5 = false;
                    while (true) {
                        if (!it5.hasNext()) {
                            aVar = new vkh.a(z5, communityProfileContent4);
                            break;
                        }
                        Object next = it5.next();
                        int i3 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        CommunityProfileContentItem communityProfileContentItem = (CommunityProfileContentItem) next;
                        CommunityProfileContentItem communityProfileContentItem2 = list9.get(i);
                        if (communityProfileContentItem2.h != communityProfileContentItem.h) {
                            aVar = new vkh.a(true, null);
                            break;
                        }
                        if (communityProfileContentItem2.f() == CommunityProfileContentItem.State.RELOAD) {
                            aVar = new vkh.a(true, null);
                            break;
                        }
                        if (communityProfileContentItem instanceof iea0) {
                            CommunityProfileContentItem.ContentType contentType = ((iea0) communityProfileContentItem).l;
                            iea0 iea0Var = communityProfileContentItem2 instanceof iea0 ? (iea0) communityProfileContentItem2 : null;
                            i = contentType == (iea0Var != null ? iea0Var.l : null) ? i3 : 0;
                            ArrayList arrayList12 = new ArrayList(communityProfileContent4.b);
                            arrayList12.set(i, communityProfileContentItem2);
                            s3q0 s3q0Var = s3q0.a;
                            communityProfileContent4 = CommunityProfileContent.a(communityProfileContent4, arrayList12, null, null, 1789);
                            z5 = true;
                        } else if (communityProfileContentItem instanceof sst0) {
                            CommunityProfileContentItem.ContentType contentType2 = ((sst0) communityProfileContentItem).l;
                            sst0 sst0Var = communityProfileContentItem2 instanceof sst0 ? (sst0) communityProfileContentItem2 : null;
                            if (contentType2 == (sst0Var != null ? sst0Var.l : null)) {
                            }
                            ArrayList arrayList122 = new ArrayList(communityProfileContent4.b);
                            arrayList122.set(i, communityProfileContentItem2);
                            s3q0 s3q0Var2 = s3q0.a;
                            communityProfileContent4 = CommunityProfileContent.a(communityProfileContent4, arrayList122, null, null, 1789);
                            z5 = true;
                        } else if (communityProfileContentItem instanceof j15) {
                            CommunityProfileContentItem.ContentType contentType3 = ((j15) communityProfileContentItem).k;
                            j15 j15Var = communityProfileContentItem2 instanceof j15 ? (j15) communityProfileContentItem2 : null;
                            if (contentType3 == (j15Var != null ? j15Var.k : null)) {
                            }
                            ArrayList arrayList1222 = new ArrayList(communityProfileContent4.b);
                            arrayList1222.set(i, communityProfileContentItem2);
                            s3q0 s3q0Var22 = s3q0.a;
                            communityProfileContent4 = CommunityProfileContent.a(communityProfileContent4, arrayList1222, null, null, 1789);
                            z5 = true;
                        } else if (communityProfileContentItem instanceof Clips) {
                            CommunityProfileContentItem.ContentType contentType4 = ((Clips) communityProfileContentItem).l;
                            Clips clips = communityProfileContentItem2 instanceof Clips ? (Clips) communityProfileContentItem2 : null;
                            if (contentType4 == (clips != null ? clips.l : null)) {
                            }
                            ArrayList arrayList12222 = new ArrayList(communityProfileContent4.b);
                            arrayList12222.set(i, communityProfileContentItem2);
                            s3q0 s3q0Var222 = s3q0.a;
                            communityProfileContent4 = CommunityProfileContent.a(communityProfileContent4, arrayList12222, null, null, 1789);
                            z5 = true;
                        } else if (communityProfileContentItem instanceof p8u) {
                            CommunityProfileContentItem.ContentType contentType5 = ((p8u) communityProfileContentItem).l;
                            p8u p8uVar = communityProfileContentItem2 instanceof p8u ? (p8u) communityProfileContentItem2 : null;
                            if (contentType5 == (p8uVar != null ? p8uVar.l : null)) {
                            }
                            ArrayList arrayList122222 = new ArrayList(communityProfileContent4.b);
                            arrayList122222.set(i, communityProfileContentItem2);
                            s3q0 s3q0Var2222 = s3q0.a;
                            communityProfileContent4 = CommunityProfileContent.a(communityProfileContent4, arrayList122222, null, null, 1789);
                            z5 = true;
                        } else {
                            if (communityProfileContentItem instanceof Services) {
                                CommunityProfileContentItem.ContentType contentType6 = ((Services) communityProfileContentItem).l;
                                Services services = communityProfileContentItem2 instanceof Services ? (Services) communityProfileContentItem2 : null;
                                if (contentType6 == (services != null ? services.l : null)) {
                                }
                                ArrayList arrayList1222222 = new ArrayList(communityProfileContent4.b);
                                arrayList1222222.set(i, communityProfileContentItem2);
                                s3q0 s3q0Var22222 = s3q0.a;
                                communityProfileContent4 = CommunityProfileContent.a(communityProfileContent4, arrayList1222222, null, null, 1789);
                                z5 = true;
                            }
                        }
                    }
                    if (!aVar.a) {
                        List<CommunityProfileContentItem> list10 = list9;
                        if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                            Iterator<T> it6 = list10.iterator();
                            while (it6.hasNext()) {
                                if (((CommunityProfileContentItem) it6.next()).f() == CommunityProfileContentItem.State.INITIAL) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        aVar = new vkh.a(!z, null);
                    }
                }
            }
            if (!aVar.a) {
                return CommunityProfileState.a(communityProfileState2, null, 0, communityProfileContent != null ? CommunityProfileContent.a(communityProfileContent, null, null, null, 1791) : null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435451);
            }
            CommunityProfileContent communityProfileContent5 = aVar.b;
            return CommunityProfileState.a(communityProfileState2, null, 0, communityProfileContent5 == null ? communityProfileContent3 : communityProfileContent5, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435451);
        }
        if (dVar2 instanceof d.f) {
            vkhVar.getClass();
            CommunityProfileContentItem communityProfileContentItem3 = ((d.f) dVar2).b;
            if (communityProfileContent != null) {
                List<CommunityProfileContentItem> list11 = communityProfileContent.b;
                Iterator<CommunityProfileContentItem> it7 = list11.iterator();
                int i4 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (it7.next().getClass().equals(communityProfileContentItem3.getClass())) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1) {
                    ArrayList arrayList13 = new ArrayList(list11);
                    arrayList13.set(i4, communityProfileContentItem3);
                    s3q0 s3q0Var3 = s3q0.a;
                    return CommunityProfileState.a(communityProfileState2, null, 0, CommunityProfileContent.a(communityProfileContent, arrayList13, null, null, 2045), null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435451);
                }
            }
            return communityProfileState2;
        }
        if (dVar2 instanceof d.p) {
            vkhVar.getClass();
            return CommunityProfileState.a(communityProfileState2, null, 0, null, ((d.p) dVar2).b, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435447);
        }
        boolean z6 = dVar2 instanceof d.w;
        int i5 = 10;
        cph cphVar = this.k;
        if (z6) {
            d.w wVar = (d.w) dVar2;
            ExtendedCommunityProfile extendedCommunityProfile4 = wVar.b;
            int i6 = communityProfileState2.c + 1;
            if (extendedCommunityProfile4 == null || (list6 = cphVar.a(communityProfileState2, extendedCommunityProfile4, new h0(i5, wVar, communityProfileState2))) == null) {
                list6 = EmptyList.b;
            }
            return CommunityProfileState.a(communityProfileState2, extendedCommunityProfile4, i6, null, null, false, false, false, null, null, null, null, list6, null, null, wVar.c, false, null, null, null, 0, null, null, null, false, 268361724);
        }
        if (dVar2 instanceof d.v) {
            return j(communityProfileState2, (d.v) dVar2);
        }
        int i7 = 5;
        if (dVar2 instanceof d.s) {
            d.s sVar = (d.s) dVar2;
            boolean z7 = sVar.c;
            xrh xrhVar2 = communityProfileState2.i;
            if (xrhVar2 != null) {
                if (xrhVar2 instanceof xrh.b) {
                    xrh.b bVar = (xrh.b) xrhVar2;
                    if (bVar instanceof xrh.b.a) {
                        xrh.b.a aVar3 = (xrh.b.a) xrhVar2;
                        c4043b = new xrh.b.a(aVar3.e, aVar3.f, aVar3.g, z7);
                    } else {
                        if (!(bVar instanceof xrh.b.C4043b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        xrh.b.C4043b c4043b2 = (xrh.b.C4043b) xrhVar2;
                        c4043b = new xrh.b.C4043b(c4043b2.e, c4043b2.f, c4043b2.g, z7);
                    }
                    xrhVar2 = c4043b;
                }
                xrhVar = xrhVar2;
            } else {
                xrhVar = null;
            }
            CommunityProfileState.a a7 = CommunityProfileState.a.a(aVar2, null, sVar.b, 1);
            List<r4h> a8 = extendedCommunityProfile != null ? cphVar.a(communityProfileState2, extendedCommunityProfile, new hs1(sVar, communityProfileState2, xrhVar, i7)) : null;
            if (a8 == null) {
                a8 = EmptyList.b;
            }
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, xrhVar, null, a7, null, a8, null, null, 0, false, null, null, null, 0, null, null, null, false, 268424959);
        }
        if (dVar2 instanceof d.t) {
            this.j.getClass();
            return s4i.a(communityProfileState2, (d.t) dVar2);
        }
        if (dVar2 instanceof d.r) {
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, ((d.r) dVar2).b, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268434943);
        }
        if (dVar2 instanceof d.z) {
            d.z zVar = (d.z) dVar2;
            if (communityProfileContent != null) {
                List<CommunityProfileContentItem> list12 = communityProfileContent.b;
                ArrayList arrayList14 = new ArrayList(c5g.u(list12, 10));
                for (Object obj : list12) {
                    if (obj instanceof sst0) {
                        sst0 sst0Var2 = (sst0) obj;
                        List<sst0.b> list13 = sst0Var2.j;
                        if (list13 != null) {
                            List<sst0.b> list14 = list13;
                            ArrayList arrayList15 = new ArrayList(c5g.u(list14, i5));
                            for (sst0.b bVar2 : list14) {
                                if (epx.f(bVar2.a.r1(), zVar.b.r1())) {
                                    bVar2 = new sst0.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, zVar.c);
                                }
                                arrayList15.add(bVar2);
                            }
                            arrayList = arrayList15;
                        } else {
                            arrayList = null;
                        }
                        obj = sst0.i(sst0Var2, arrayList, null, null, null, false, false, null, null, null, 32766);
                    }
                    arrayList14.add(obj);
                    i5 = 10;
                }
                communityProfileContent2 = CommunityProfileContent.a(communityProfileContent, arrayList14, null, null, 2045);
            }
            return CommunityProfileState.a(communityProfileState2, null, 0, communityProfileContent2, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435451);
        }
        if (dVar2 instanceof d.y) {
            d.y yVar = (d.y) dVar2;
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, new stc0(yVar.b, yVar.c, yVar.d), null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268431359);
        }
        if (dVar2.equals(d.a0.b)) {
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268434431);
        }
        if (dVar2 instanceof d.m) {
            d.m mVar = (d.m) dVar2;
            bsh bshVar = this.n;
            bshVar.getClass();
            cph cphVar2 = bshVar.a;
            int i8 = 26;
            if (mVar instanceof d.m.b) {
                xrh xrhVar3 = ((d.m.b) mVar).b;
                if (extendedCommunityProfile == null || (list5 = cphVar2.a(communityProfileState2, extendedCommunityProfile, new t6(xrhVar3, i8))) == null) {
                    list5 = EmptyList.b;
                }
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, xrhVar3, null, null, null, list5, null, null, 0, false, null, null, null, 0, null, null, null, false, 268427007);
            }
            if (!mVar.equals(d.m.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (extendedCommunityProfile == null || (list4 = cphVar2.a(communityProfileState2, extendedCommunityProfile, new t6(spgVar, i8))) == null) {
                list4 = EmptyList.b;
            }
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, list4, null, null, 0, false, null, null, null, 0, null, null, null, false, 268427007);
        }
        if (dVar2 instanceof d.x) {
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, ((d.x) dVar2).b, null, 0, false, null, null, null, 0, null, null, null, false, 268419071);
        }
        if (dVar2 instanceof d.l) {
            d.l lVar = (d.l) dVar2;
            boolean z8 = lVar instanceof d.l.c;
            CommunityProfileState.b dVar3 = z8 ? new CommunityProfileState.b.d(((d.l.c) lVar).b) : lVar instanceof d.l.a ? CommunityProfileState.b.a.a : lVar instanceof d.l.b ? new CommunityProfileState.b.C1623b(((d.l.b) lVar).b) : CommunityProfileState.b.c.a;
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, (!z8 || extendedCommunityProfile == null || (a = cphVar.a(communityProfileState2, extendedCommunityProfile, new z5a(i7, dVar3, communityProfileState2))) == null) ? list7 : a, null, dVar3, 0, false, null, null, null, 0, null, null, null, false, 268394495);
        }
        if (dVar2 instanceof d.u) {
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, ((d.u) dVar2).b, null, null, null, 0, null, null, null, false, 268304383);
        }
        if (dVar2 instanceof d.c) {
            d.c cVar3 = (d.c) dVar2;
            cph cphVar3 = this.p.a;
            int i9 = 11;
            if (cVar3 instanceof d.c.b) {
                ed0 ed0Var = ((d.c.b) cVar3).b;
                ExtendedCommunityProfile extendedCommunityProfile5 = communityProfileState2.b;
                if (extendedCommunityProfile5 == null || (list3 = cphVar3.a(communityProfileState2, extendedCommunityProfile5, new i4e(ed0Var, i9))) == null) {
                    list3 = EmptyList.b;
                }
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, list3, null, null, 0, false, ed0Var, null, null, 0, null, null, null, false, 268165119);
            }
            if (!(cVar3 instanceof d.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ExtendedCommunityProfile extendedCommunityProfile6 = communityProfileState2.b;
            if (extendedCommunityProfile6 == null || (list2 = cphVar3.a(communityProfileState2, extendedCommunityProfile6, new i4e(spgVar, i9))) == null) {
                list2 = EmptyList.b;
            }
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, list2, null, null, 0, false, null, null, null, 0, null, null, null, false, 268165119);
        }
        if (dVar2 instanceof d.h) {
            this.q.getClass();
            if (!(((d.h) dVar2) instanceof d.h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            List<r4h> list15 = communityProfileState2.n;
            ArrayList arrayList16 = new ArrayList();
            for (Object obj2 : list15) {
                if (!(j5g.Y(((r4h) obj2).a) instanceof c0h)) {
                    arrayList16.add(obj2);
                }
            }
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, arrayList16, null, null, 0, false, null, null, null, 0, null, null, null, false, 268427263);
        }
        if (dVar2 instanceof d.q) {
            return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, ((d.q) dVar2).b, null, 0, null, null, null, false, 267386879);
        }
        boolean z9 = dVar2 instanceof d.e;
        heh hehVar = this.m;
        if (z9) {
            return hehVar.f(communityProfileState2, (d.e) dVar2);
        }
        if (dVar2 instanceof d.C1611d) {
            return hehVar.d(communityProfileState2, (d.C1611d) dVar2);
        }
        if (dVar2 instanceof d.n) {
            return this.r.a(communityProfileState2, (d.n) dVar2);
        }
        if (!(dVar2 instanceof d.b)) {
            if (dVar2 instanceof d.k) {
                return i(communityProfileState2, (d.k) dVar2);
            }
            if (dVar2 instanceof d.j) {
                return this.o.a(communityProfileState2, (d.j) dVar2);
            }
            if (dVar2 instanceof d.a) {
                return CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, ((d.a) dVar2).b, 134217727);
            }
            throw new NoWhenBranchMatchedException();
        }
        d.b bVar3 = (d.b) dVar2;
        beh behVar = this.s;
        behVar.getClass();
        if (bVar3 instanceof d.b.C1610b) {
            spgVar = ((d.b.C1610b) bVar3).b;
        } else if (!bVar3.equals(d.b.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        CommunityProfileState a9 = CommunityProfileState.a(communityProfileState2, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, spgVar, null, false, 218103807);
        ExtendedCommunityProfile extendedCommunityProfile7 = a9.b;
        if (extendedCommunityProfile7 == null || (list = behVar.a.a(a9, extendedCommunityProfile7, new u(17))) == null) {
            list = EmptyList.b;
        }
        return CommunityProfileState.a(a9, null, 0, null, null, false, false, false, null, null, null, null, list, null, null, 0, false, null, null, null, 0, null, null, null, false, 268427263);
    }

    @Override // xsna.dm50
    public final CommunityProfileViewState d() {
        return new CommunityProfileViewState(e(new lbe(this, 10)));
    }

    @Override // xsna.dm50
    public final void h(CommunityProfileState communityProfileState, CommunityProfileViewState communityProfileViewState) {
        f(communityProfileViewState.a, communityProfileState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    public final CommunityProfileState j(CommunityProfileState communityProfileState, d.v vVar) {
        CommunityProfileState a;
        ?? arrayList;
        this.i.getClass();
        CommunityProfileState.a aVar = communityProfileState.l;
        if (vVar.equals(d.v.b.b)) {
            r8h r8hVar = aVar.a;
            if (r8hVar != null) {
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8hVar.f ? a9h.a(r8hVar, false) : r8h.a(r8hVar, null, 0, false, true, false, false, false, 239), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else if (vVar instanceof d.v.g) {
            r8h r8hVar2 = aVar.a;
            if (r8hVar2 != null) {
                d.v.g gVar = (d.v.g) vVar;
                int i = gVar.b;
                List<gwh<?, ?>> list = r8hVar2.a;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList2.add(((gwh) obj).a(i2 == gVar.b % r8hVar2.l));
                    i2 = i3;
                }
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8h.a(r8hVar2, arrayList2, i, false, false, false, false, false, 250), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else if (vVar instanceof d.v.c) {
            r8h r8hVar3 = aVar.a;
            if (r8hVar3 != null) {
                boolean z = ((d.v.c) vVar).b;
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, (z || !r8hVar3.e) ? r8h.a(r8hVar3, null, 0, false, false, !z, false, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE) : a9h.a(r8hVar3, true), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else if (vVar instanceof d.v.e) {
            r8h r8hVar4 = aVar.a;
            if (r8hVar4 != null) {
                List<gwh<?, ?>> list2 = r8hVar4.a;
                boolean z2 = ((d.v.e) vVar).b;
                if (z2) {
                    arrayList = list2;
                } else {
                    List<gwh<?, ?>> list3 = list2;
                    arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        gwh gwhVar = (gwh) it.next();
                        if (!(gwhVar instanceof sjw)) {
                            if (!(gwhVar instanceof pqs0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pqs0 pqs0Var = (pqs0) gwhVar;
                            gwhVar = new pqs0(pqs0Var.a, pqs0.b.b(pqs0Var.b, false, false, 1));
                        }
                        arrayList.add(gwhVar);
                    }
                }
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8h.a(r8hVar4, arrayList, 0, z2, false, false, false, false, 246), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else if (vVar instanceof d.v.C1622d) {
            r8h r8hVar5 = aVar.a;
            if (r8hVar5 != null) {
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8h.a(r8hVar5, null, 0, false, false, false, ((d.v.C1622d) vVar).b, false, 191), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else if (vVar instanceof d.v.a) {
            r8h r8hVar6 = aVar.a;
            if (r8hVar6 != null) {
                List<gwh<?, ?>> list4 = r8hVar6.a;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    gwh gwhVar2 = (gwh) it2.next();
                    if (gwhVar2 instanceof sjw) {
                        sjw sjwVar = (sjw) gwhVar2;
                        gwhVar2 = new sjw(sjwVar.a, new sjw.b(sjwVar.b.a, true));
                    } else if (!(gwhVar2 instanceof pqs0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList3.add(gwhVar2);
                }
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8h.a(r8hVar6, arrayList3, 0, false, false, false, false, false, 254), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else if (vVar instanceof d.v.h) {
            r8h r8hVar7 = aVar.a;
            if (r8hVar7 != null) {
                List<gwh<?, ?>> list5 = r8hVar7.a;
                ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    gwh gwhVar3 = (gwh) it3.next();
                    if (gwhVar3.getState().a() && (gwhVar3 instanceof pqs0)) {
                        pqs0 pqs0Var2 = (pqs0) gwhVar3;
                        gwhVar3 = new pqs0(pqs0Var2.a, pqs0.b.b(pqs0Var2.b, false, !((d.v.h) vVar).b, 1));
                    }
                    arrayList4.add(gwhVar3);
                }
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8h.a(r8hVar7, arrayList4, 0, false, false, false, false, false, 254), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        } else {
            if (!(vVar instanceof d.v.f)) {
                throw new NoWhenBranchMatchedException();
            }
            r8h r8hVar8 = aVar.a;
            if (r8hVar8 != null) {
                a = CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, CommunityProfileState.a.a(aVar, r8h.a(r8hVar8, null, 0, false, false, false, false, ((d.v.f) vVar).b, 127), false, 2), null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268433407);
            }
            a = communityProfileState;
        }
        return this.m.a(a, vVar);
    }
}
