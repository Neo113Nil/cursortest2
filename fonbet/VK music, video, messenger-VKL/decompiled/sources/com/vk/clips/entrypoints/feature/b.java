package com.vk.clips.entrypoints.feature;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.entrypoints.feature.ClipsEntryPointAnalyticsEvent;
import com.vk.clips.entrypoints.feature.ClipsEntryPointsState;
import com.vk.clips.entrypoints.feature.a;
import com.vk.clips.entrypoints.feature.c;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.clips.entrypoints.ui.a;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bw;
import xsna.c5g;
import xsna.cmf;
import xsna.cxd;
import xsna.e8r;
import xsna.f4z;
import xsna.fsk0;
import xsna.fvr;
import xsna.fyx;
import xsna.kbk;
import xsna.l3e0;
import xsna.lbk;
import xsna.lpj;
import xsna.lr10;
import xsna.lx90;
import xsna.m1e;
import xsna.m9;
import xsna.m9e;
import xsna.nsd;
import xsna.pd;
import xsna.qsk0;
import xsna.s3q0;
import xsna.tkd;
import xsna.tl0;
import xsna.uh;
import xsna.up2;
import xsna.usl;
import xsna.v5;
import xsna.v9;
import xsna.wk50;
import xsna.xsl;

/* compiled from: ClipsEntryPointsFeature.kt */
/* loaded from: classes16.dex */
public final class b extends wk50<ClipsEntryPointsViewState, ClipsEntryPointsState, com.vk.clips.entrypoints.ui.a, c> {
    public final m1e f;
    public final f4z g;
    public final f4z h;

    public b(e eVar, m1e m1eVar) {
        super(a.C0584a.b, eVar);
        this.f = m1eVar;
        this.g = new f4z();
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ClipsEntryPointsState clipsEntryPointsState, com.vk.clips.entrypoints.ui.a aVar) {
        PrivateFiles.a b;
        ClipsEntryPointsState clipsEntryPointsState2 = clipsEntryPointsState;
        com.vk.clips.entrypoints.ui.a aVar2 = aVar;
        boolean z = aVar2 instanceof a.C0584a;
        int i = 7;
        m1e m1eVar = this.f;
        if (z) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.b) {
                ((xsl) uh.b.b()).e("ClipsCacheCleanerJob", new tkd(new fyx()), new lx90(1L, TimeUnit.DAYS, usl.a(usl.h, WorkPolicy.KEEP, 246)));
                if (!((ClipsEntryPointsState.b) clipsEntryPointsState2).d) {
                    T(new c.d(false, 0));
                    return;
                }
                pd pdVar = new pd(this, 29);
                m1eVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                m9 m9Var = new m9(i, m1eVar, pdVar);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(m9Var);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.h) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                if (!((ClipsEntryPointsState.a) clipsEntryPointsState2).d) {
                    T(new c.d(false, 0));
                    return;
                }
                tl0 tl0Var = new tl0(this, 28);
                m1eVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                m9 m9Var2 = new m9(i, m1eVar, tl0Var);
                clipsDraftPersistentStore2.getClass();
                ClipsDraftPersistentStore.o(m9Var2);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.i) {
            a.i iVar = (a.i) aVar2;
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                T(new c.g(iVar.b));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.b) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                if (((ClipsEntryPointsState.a) clipsEntryPointsState2).g.isEmpty()) {
                    this.g.b(a.C0582a.a);
                    return;
                } else {
                    T(new c.g(EmptyList.b));
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                List<MediaStoreEntry> list = eVar.b;
                lpj lpjVar = eVar.c;
                lbk lbkVar = eVar.d;
                l3e0.a aVar3 = eVar.e;
                v9 v9Var = new v9(this, 24);
                m1eVar.getClass();
                ArrayList arrayList = new ArrayList();
                List<MediaStoreEntry> list2 = list;
                for (MediaStoreEntry mediaStoreEntry : list2) {
                    File u = up2.u(mediaStoreEntry.f());
                    if (u != null) {
                        if (mediaStoreEntry instanceof MediaStoreImageEntry) {
                            arrayList.add(new lr10.a(u, 5000L));
                        } else {
                            arrayList.add(new lr10.b(u));
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(up2.u(((MediaStoreEntry) it.next()).f())));
                }
                lbkVar.c(arrayList2);
                cmf cmfVar = new cmf();
                cxd cxdVar = new cxd(m1eVar.a, m1eVar.b);
                b = e8r.a.b(r3, PrivateSubdir.CLIPS_VIDEO.h(), true);
                File file = b.a;
                fsk0 fsk0Var = qsk0.a;
                kbk context = lbkVar.getContext();
                new m9e(cmfVar, cxdVar, file, lpjVar, fsk0Var, context != null ? Integer.valueOf(context.b) : null).c(arrayList, aVar3).subscribe(new bw(new v5(v9Var, 24), 14));
                return;
            }
            return;
        }
        boolean z2 = aVar2 instanceof a.d;
        f4z f4zVar = this.h;
        if (z2) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                T(c.b.b);
                s3q0 s3q0Var = s3q0.a;
                f4zVar.b(new ClipsEntryPointAnalyticsEvent.TabSelectedEvent(ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.GALLERY));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.c) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                m1eVar.getClass();
                nsd nsdVar = fvr.c;
                if (nsdVar != null) {
                    nsdVar.a();
                } else {
                    Preference.F(0L, "clips_draft_prefs", "unseen_drafts_pref");
                }
                T(c.a.b);
                s3q0 s3q0Var2 = s3q0.a;
                f4zVar.b(new ClipsEntryPointAnalyticsEvent.TabSelectedEvent(ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.DRAFTS));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.f) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                T(c.C0583c.b);
                s3q0 s3q0Var3 = s3q0.a;
                f4zVar.b(new ClipsEntryPointAnalyticsEvent.TabSelectedEvent(ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.TEMPLATES));
                return;
            }
            return;
        }
        if (!(aVar2 instanceof a.g)) {
            throw new NoWhenBranchMatchedException();
        }
        if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
            T(c.e.b);
            s3q0 s3q0Var4 = s3q0.a;
            f4zVar.b(new ClipsEntryPointAnalyticsEvent.TabSelectedEvent(ClipsEntryPointAnalyticsEvent.TabSelectedEvent.EntryPointTabType.TRENDS));
        }
    }
}
