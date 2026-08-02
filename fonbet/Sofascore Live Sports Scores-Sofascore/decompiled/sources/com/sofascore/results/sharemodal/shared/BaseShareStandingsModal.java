package com.sofascore.results.sharemodal.shared;

import com.sofascore.results.R;
import com.sofascore.results.sharemodal.match.BaseShareMultiPageModal;
import com.sofascore.results.sharemodal.shared.BaseShareStandingsModal;
import com.sofascore.results.sharemodal.shared.ShareStandingsPageFragment;
import defpackage.duf;
import defpackage.hch;
import defpackage.ich;
import defpackage.joa;
import defpackage.mdh;
import defpackage.mqi;
import defpackage.otk;
import defpackage.qdh;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/shared/BaseShareStandingsModal;", "Lcom/sofascore/results/sharemodal/match/BaseShareMultiPageModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseShareStandingsModal extends BaseShareMultiPageModal {
    public final otk x;
    public final joa y;
    public final mqi z;

    public BaseShareStandingsModal() {
        w1 w1Var = new w1(this, 12);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new w1(w1Var, 13));
        int i = 8;
        this.x = new otk(duf.a.getOrCreateKotlinClass(mdh.class), new x1(a, 7), new y1(i, this, a), new x1(a, i));
        final int i2 = 0;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: o61
            public final /* synthetic */ BaseShareStandingsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                BaseShareStandingsModal baseShareStandingsModal = this.b;
                switch (i3) {
                    case 0:
                        return ((mdh) baseShareStandingsModal.x.getValue()).e;
                    default:
                        qdh qdhVar = new qdh(baseShareStandingsModal);
                        ArrayList arrayList = ((mdh) baseShareStandingsModal.x.getValue()).f;
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                b.q();
                                throw null;
                            }
                            ShareStandingsPageFragment shareStandingsPageFragment = new ShareStandingsPageFragment();
                            shareStandingsPageFragment.setArguments(fz8.C(fz8.D(i4, "ARG_STANDINGS_POSITION")));
                            arrayList2.add(shareStandingsPageFragment);
                            i4 = i5;
                        }
                        ArrayList arrayList3 = qdhVar.j;
                        arrayList3.addAll(arrayList2);
                        qdhVar.notifyItemRangeInserted(0, b.i(arrayList3));
                        return qdhVar;
                }
            }
        });
        final int i3 = 1;
        this.z = ypa.b(new Function0(this) { // from class: o61
            public final /* synthetic */ BaseShareStandingsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                BaseShareStandingsModal baseShareStandingsModal = this.b;
                switch (i32) {
                    case 0:
                        return ((mdh) baseShareStandingsModal.x.getValue()).e;
                    default:
                        qdh qdhVar = new qdh(baseShareStandingsModal);
                        ArrayList arrayList = ((mdh) baseShareStandingsModal.x.getValue()).f;
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                b.q();
                                throw null;
                            }
                            ShareStandingsPageFragment shareStandingsPageFragment = new ShareStandingsPageFragment();
                            shareStandingsPageFragment.setArguments(fz8.C(fz8.D(i4, "ARG_STANDINGS_POSITION")));
                            arrayList2.add(shareStandingsPageFragment);
                            i4 = i5;
                        }
                        ArrayList arrayList3 = qdhVar.j;
                        arrayList3.addAll(arrayList2);
                        qdhVar.notifyItemRangeInserted(0, b.i(arrayList3));
                        return qdhVar;
                }
            }
        });
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    public final ich H() {
        return (hch) this.y.getValue();
    }

    @Override // com.sofascore.results.sharemodal.match.BaseShareMultiPageModal
    public final qdh L() {
        return (qdh) this.z.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ShareStandingsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.share_standings_title);
        string.getClass();
        return string;
    }
}
