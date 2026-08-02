package com.vk.clips.sdk.shared.item.clips_grid_block.presentation;

import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.ClipsGridBlockAction;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.c5g;
import xsna.cce;
import xsna.e43;
import xsna.epx;
import xsna.f4z;
import xsna.hlh0;
import xsna.ix2;
import xsna.j5g;
import xsna.jbe;
import xsna.k4b0;
import xsna.kae;
import xsna.kih0;
import xsna.lae;
import xsna.mae;
import xsna.nae;
import xsna.oae;
import xsna.p4g;
import xsna.po1;
import xsna.qbe;
import xsna.qi5;
import xsna.tbe;
import xsna.uae;
import xsna.ube;
import xsna.vbe;
import xsna.wk50;
import xsna.xae;
import xsna.ybe;
import xsna.zae;
import xsna.zg5;

/* compiled from: ClipsGridBlockFeature.kt */
/* loaded from: classes17.dex */
public final class a extends wk50<cce, ybe, ClipsGridBlockAction, c> {
    public final jbe f;
    public final uae g;
    public final xae h;
    public final zae i;
    public final kae j;
    public final hlh0 k;
    public final f4z l;
    public final f4z m;

    /* compiled from: ClipsGridBlockFeature.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0665a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGridBlockAction.HandleOnBlockFocusChanged.values().length];
            try {
                iArr[ClipsGridBlockAction.HandleOnBlockFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGridBlockAction.HandleOnBlockFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(vbe vbeVar, jbe jbeVar, uae uaeVar, xae xaeVar, zae zaeVar, kae kaeVar, hlh0 hlh0Var) {
        super(null, vbeVar);
        this.f = jbeVar;
        this.g = uaeVar;
        this.h = xaeVar;
        this.i = zaeVar;
        this.j = kaeVar;
        this.k = hlh0Var;
        this.l = new f4z();
        this.m = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ybe ybeVar, ClipsGridBlockAction clipsGridBlockAction) {
        ybe ybeVar2 = ybeVar;
        ClipsGridBlockAction clipsGridBlockAction2 = clipsGridBlockAction;
        if (clipsGridBlockAction2 instanceof lae) {
            lae laeVar = (lae) clipsGridBlockAction2;
            if (ybeVar2 instanceof ybe.b) {
                U(laeVar);
                return;
            } else {
                if (!(ybeVar2 instanceof ybe.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (epx.f(((ybe.a) ybeVar2).b, laeVar.b)) {
                    return;
                }
                U(laeVar);
                return;
            }
        }
        if (clipsGridBlockAction2 instanceof mae) {
            T(ube.b);
            this.e.e();
            return;
        }
        boolean z = clipsGridBlockAction2 instanceof ClipsGridBlockAction.e;
        f4z f4zVar = this.m;
        if (z) {
            if ((ybeVar2 instanceof ybe.a) && !((ybe.a) ybeVar2).k) {
                f4zVar.b(nae.a);
                T(c.g.a.b);
                a7f0.a.f(this, this.f.a(0), new po1(this, 20), new ix2(this, 24), 1);
                return;
            }
            return;
        }
        if (clipsGridBlockAction2 instanceof ClipsGridBlockAction.HandleOnBlockFocusChanged) {
            int i = C0665a.$EnumSwitchMapping$0[((ClipsGridBlockAction.HandleOnBlockFocusChanged) clipsGridBlockAction2).ordinal()];
            if (i == 1) {
                T(c.a.C0666a.b);
                f4zVar.b(oae.a);
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T(c.a.b.b);
                return;
            }
        }
        if (clipsGridBlockAction2 instanceof ClipsGridBlockAction.c) {
            ClipsGridBlockAction.c cVar = (ClipsGridBlockAction.c) clipsGridBlockAction2;
            if (cVar instanceof ClipsGridBlockAction.c.a) {
                ClipsGridBlockAction.c.a aVar = (ClipsGridBlockAction.c.a) cVar;
                T(new c.b.a(aVar.b, aVar.c));
                return;
            } else {
                if (!(cVar instanceof ClipsGridBlockAction.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(c.b.C0667b.b);
                return;
            }
        }
        boolean z2 = clipsGridBlockAction2 instanceof ClipsGridBlockAction.b;
        f4z f4zVar2 = this.l;
        if (z2) {
            int i2 = ((ClipsGridBlockAction.b) clipsGridBlockAction2).b;
            if (ybeVar2 instanceof ybe.a) {
                zg5 zg5Var = (zg5) j5g.b0(i2, ((ybe.a) ybeVar2).c);
                kih0 kih0Var = zg5Var != null ? zg5Var.b : null;
                if (kih0Var != null) {
                    f4zVar2.b(new qbe.a(i2, kih0Var));
                    return;
                }
                return;
            }
            return;
        }
        if (clipsGridBlockAction2 instanceof ClipsGridBlockAction.d) {
            if (ybeVar2 instanceof ybe.a) {
                T(c.d.b);
                return;
            }
            return;
        }
        if (!(clipsGridBlockAction2 instanceof ClipsGridBlockAction.f)) {
            if (!(clipsGridBlockAction2 instanceof ClipsGridBlockAction.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ybeVar2 instanceof ybe.a) {
                T(c.C0668c.b);
                return;
            }
            return;
        }
        ClipsGridBlockAction.f fVar = (ClipsGridBlockAction.f) clipsGridBlockAction2;
        k4b0 k4b0Var = fVar.c;
        boolean z3 = k4b0Var.a;
        qi5 qi5Var = fVar.b;
        boolean z4 = ybeVar2 instanceof ybe.a;
        if (z4) {
            T(new c.f(qi5Var, k4b0Var));
        }
        if (z4) {
            if (!z3 || ((ybe.a) ybeVar2).n.contains(qi5Var)) {
                boolean z5 = k4b0Var.b;
                if (z3) {
                    Set<kih0> set = ((ybe.a) ybeVar2).n;
                    if (set.contains(qi5Var)) {
                        T(new c.e(p4g.f(set, qi5Var)));
                        return;
                    }
                }
                if (z5) {
                    ybe.a aVar2 = (ybe.a) ybeVar2;
                    Set<kih0> set2 = aVar2.n;
                    if (set2.contains(qi5Var)) {
                        if (set2.size() == aVar2.c.size()) {
                            f4zVar2.b(qbe.b.a);
                            return;
                        } else {
                            T(c.d.b);
                            return;
                        }
                    }
                }
                if (z5) {
                    ybe.a aVar3 = (ybe.a) ybeVar2;
                    Set<kih0> set3 = aVar3.n;
                    if (set3.contains(qi5Var)) {
                        return;
                    }
                    HashSet e = p4g.e(set3, qi5Var);
                    T(new c.e(e));
                    if (e.size() == aVar3.c.size()) {
                        f4zVar2.b(qbe.b.a);
                    } else {
                        T(c.d.b);
                    }
                }
            }
        }
    }

    public final void U(lae laeVar) {
        this.f.b.onNext(new jbe.a(laeVar.e, 5));
        T(new tbe(laeVar.b, V(laeVar.c), this.i.c(), this.j.b()));
    }

    public final ArrayList V(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj;
            SdkImages I7 = sdkClipVideoFile.I7();
            uae uaeVar = this.g;
            arrayList.add(new zg5(I7, uaeVar.a(sdkClipVideoFile), uaeVar.b(sdkClipVideoFile), this.h.a(sdkClipVideoFile), this.j.a(i, list.size(), sdkClipVideoFile)));
            i = i2;
        }
        return arrayList;
    }
}
