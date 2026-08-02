package com.sofascore.results.sharemodal.match;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.match.ShareMatchDetailsModal;
import com.sofascore.results.view.SofascoreSmallRatingView;
import defpackage.adh;
import defpackage.dde;
import defpackage.ede;
import defpackage.eej;
import defpackage.g7;
import defpackage.kch;
import defpackage.km5;
import defpackage.ky5;
import defpackage.lch;
import defpackage.mqi;
import defpackage.o8;
import defpackage.om0;
import defpackage.pdh;
import defpackage.qaj;
import defpackage.rfe;
import defpackage.v5f;
import defpackage.vte;
import defpackage.waa;
import defpackage.wt7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z1h;
import defpackage.z82;
import defpackage.zch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/ShareMatchDetailsModal;", "Lcom/sofascore/results/sharemodal/BaseSinglePageShareModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShareMatchDetailsModal extends Hilt_ShareMatchDetailsModal {
    public final mqi D;
    public final mqi E;
    public final mqi F;
    public final mqi G;
    public final mqi H;
    public final mqi I;
    public final mqi J;
    public final mqi K;
    public final kch L = kch.EVENT_DETAILS;
    public final mqi M;

    public ShareMatchDetailsModal() {
        final int i = 0;
        this.D = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i2 = 1;
        this.E = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i3 = 2;
        this.F = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i4 = 3;
        this.G = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i5 = 4;
        this.H = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i6 = 5;
        this.I = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i7 = 6;
        this.J = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i8 = 7;
        this.K = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
        final int i9 = 8;
        this.M = ypa.b(new Function0(this) { // from class: uch
            public final /* synthetic */ ShareMatchDetailsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                ShareMatchDetailsModal shareMatchDetailsModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchDetailsModal.requireArguments();
                        requireArguments.getClass();
                        return (PregameFormResponse) gz8.M(requireArguments, "ARG_PREGAME_FORM", PregameFormResponse.class);
                    case 1:
                        Bundle requireArguments2 = shareMatchDetailsModal.requireArguments();
                        requireArguments2.getClass();
                        return (ky5) gz8.M(requireArguments2, "ARG_FEATURED_PLAYERS", ky5.class);
                    case 2:
                        Bundle requireArguments3 = shareMatchDetailsModal.requireArguments();
                        requireArguments3.getClass();
                        return (EventGraphResponse) gz8.M(requireArguments3, "ARG_GRAPH_DATA", EventGraphResponse.class);
                    case 3:
                        Bundle requireArguments4 = shareMatchDetailsModal.requireArguments();
                        requireArguments4.getClass();
                        return (EventBestPlayersSummaryResponse) gz8.M(requireArguments4, "ARG_BEST_PLAYERS", EventBestPlayersSummaryResponse.class);
                    case 4:
                        Bundle requireArguments5 = shareMatchDetailsModal.requireArguments();
                        requireArguments5.getClass();
                        return (FanPlayerOfTheMatchResponse) gz8.M(requireArguments5, "ARG_POTM_VOTING_OPTIONS", FanPlayerOfTheMatchResponse.class);
                    case 5:
                        Bundle requireArguments6 = shareMatchDetailsModal.requireArguments();
                        requireArguments6.getClass();
                        return (Integer) gz8.M(requireArguments6, "ARG_POTM_VOTED_PLAYER_ID", Integer.class);
                    case 6:
                        Bundle requireArguments7 = shareMatchDetailsModal.requireArguments();
                        requireArguments7.getClass();
                        return (ArrayList) gz8.M(requireArguments7, "ARG_INCIDENTS", ArrayList.class);
                    case 7:
                        IShareContent data = shareMatchDetailsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchDetailsModal.requireContext();
                        requireContext.getClass();
                        return new yy9(requireContext, ok3.r((Event) shareMatchDetailsModal.K.getValue()));
                }
            }
        });
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    /* renamed from: F, reason: from getter */
    public final kch getA() {
        return this.L;
    }

    @Override // com.sofascore.results.sharemodal.BaseSinglePageShareModal
    public final void L() {
        g7 M = M();
        Context requireContext = requireContext();
        requireContext.getClass();
        zch zchVar = new zch(requireContext);
        zchVar.j(getViewLifecycleOwner().getLifecycle(), (Event) this.K.getValue());
        M.p(M.g.size(), zchVar);
    }

    @Override // com.sofascore.results.sharemodal.BaseSinglePageShareModal
    public final g7 M() {
        return (g7) this.M.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        if (r0 == null) goto L39;
     */
    @Override // com.sofascore.results.sharemodal.BaseSinglePageShareModal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        List list;
        List list2;
        int i;
        rfe rfeVar;
        ArrayList arrayList = null;
        if (P() != null && (!r0.isEmpty())) {
            z1h z1hVar = new z1h(8);
            int i2 = ede.m;
            List P = P();
            if (P == null) {
                P = km5.a;
            }
            P.getClass();
            int i3 = !dde.a(P).isEmpty() ? 7 : 10;
            ArrayList P2 = P();
            if (P2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : P2) {
                    Incident incident = (Incident) obj;
                    if (((Boolean) z1hVar.invoke(incident)).booleanValue() && Intrinsics.c(Incident.isHome$default(incident, null, 1, null), Boolean.TRUE)) {
                        arrayList2.add(obj);
                    }
                }
                list = CollectionsKt.L0(arrayList2, i3);
            }
            list = km5.a;
            ArrayList P3 = P();
            if (P3 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : P3) {
                    Incident incident2 = (Incident) obj2;
                    if (((Boolean) z1hVar.invoke(incident2)).booleanValue() && Intrinsics.c(Incident.isHome$default(incident2, null, 1, null), Boolean.FALSE)) {
                        arrayList3.add(obj2);
                    }
                }
                list2 = CollectionsKt.L0(arrayList3, i3);
            }
            list2 = km5.a;
            ArrayList<Incident> P4 = P();
            if (P4 == null || P4.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (Incident incident3 : P4) {
                    if ((incident3 instanceof Incident.GoalIncident) || ((incident3 instanceof Incident.CardIncident) && !Intrinsics.c(((Incident.CardIncident) incident3).getIncidentClass(), Incident.CardIncident.CARD_YELLOW))) {
                        i++;
                        if (i < 0) {
                            b.p();
                            throw null;
                        }
                    }
                }
            }
            int size = list2.size() + list.size();
            int i4 = i - size;
            if (i4 < 0) {
                i4 = 0;
            }
            Integer valueOf = Integer.valueOf(i4);
            if (size <= 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            if (!list.isEmpty() || !list2.isEmpty()) {
                Context requireContext = requireContext();
                requireContext.getClass();
                adh adhVar = new adh(requireContext);
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    rfeVar = adhVar.d;
                    if (!hasNext) {
                        break;
                    } else {
                        ((LinearLayout) rfeVar.c).addView(adhVar.l((Incident) it.next(), true));
                    }
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((LinearLayout) rfeVar.d).addView(adhVar.l((Incident) it2.next(), false));
                }
                if (intValue == 0) {
                    ((TextView) rfeVar.e).setVisibility(8);
                } else {
                    ((TextView) rfeVar.e).setVisibility(0);
                    ((TextView) rfeVar.e).setText(adhVar.getContext().getResources().getQuantityString(R.plurals.football_plus_x_events_in_match, intValue, Integer.valueOf(intValue)));
                }
                o8.d(adhVar, 0, 5);
                r0.p(M().g.size(), adhVar);
            }
        }
        PregameFormResponse pregameFormResponse = (PregameFormResponse) this.D.getValue();
        if (pregameFormResponse != null) {
            g7 M = M();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            v5f v5fVar = new v5f(requireContext2);
            v5fVar.l(pregameFormResponse, Sports.FOOTBALL, true);
            M.p(M.g.size(), v5fVar);
        }
        ky5 ky5Var = (ky5) this.E.getValue();
        if (ky5Var != null) {
            g7 M2 = M();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            lch lchVar = new lch(requireContext3);
            wt7 featuredFootballPlayerBinding = lchVar.getFeaturedFootballPlayerBinding();
            ((TextView) featuredFootballPlayerBinding.c.d).setTextColor(requireContext3.getColor(R.color.n_lv_1));
            z82 z82Var = featuredFootballPlayerBinding.f;
            ((TextView) z82Var.d).setTextColor(requireContext3.getColor(R.color.n_lv_1));
            z82 z82Var2 = featuredFootballPlayerBinding.c;
            ((ImageView) z82Var2.e).setVisibility(8);
            ((ImageView) z82Var.e).setVisibility(8);
            ((SofascoreSmallRatingView) z82Var2.c).setShouldAnimate(false);
            ((SofascoreSmallRatingView) z82Var.c).setShouldAnimate(false);
            LinearLayout linearLayout = featuredFootballPlayerBinding.e.b;
            linearLayout.getClass();
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.bottomMargin = 0;
            linearLayout.setLayoutParams(marginLayoutParams);
            lchVar.getBinding().b.b.setBackground(requireContext3.getDrawable(R.drawable.rounded_surface_level_1));
            o8.d(lchVar, 0, 5);
            lchVar.l(ky5Var, false);
            M2.p(M2.g.size(), lchVar);
        }
        ArrayList P5 = P();
        mqi mqiVar = this.K;
        if (P5 != null) {
            if (!P5.isEmpty()) {
                int i5 = ede.m;
                if (!dde.a(P5).isEmpty()) {
                    arrayList = P5;
                }
            }
            if (arrayList != null) {
                g7 M3 = M();
                Context requireContext4 = requireContext();
                requireContext4.getClass();
                ede edeVar = new ede(requireContext4);
                o8.d(edeVar, 0, 5);
                edeVar.j((Event) mqiVar.getValue(), arrayList);
                M3.p(M3.g.size(), edeVar);
            }
        }
        EventGraphResponse eventGraphResponse = (EventGraphResponse) this.F.getValue();
        if (eventGraphResponse != null) {
            g7 M4 = M();
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            om0 om0Var = new om0(requireContext5);
            o8.d(om0Var, 0, 5);
            om0Var.setAnimateBars(false);
            om0Var.j((Event) mqiVar.getValue(), eventGraphResponse, P(), true, false);
            M4.p(M4.g.size(), om0Var);
        }
        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = (EventBestPlayersSummaryResponse) this.G.getValue();
        if (eventBestPlayersSummaryResponse != null) {
            Context requireContext6 = requireContext();
            requireContext6.getClass();
            vte G = waa.G(requireContext6, eventBestPlayersSummaryResponse, (FanPlayerOfTheMatchResponse) this.H.getValue(), (Integer) this.I.getValue());
            if (G != null) {
                g7 M5 = M();
                Context requireContext7 = requireContext();
                requireContext7.getClass();
                pdh pdhVar = new pdh(requireContext7);
                pdhVar.l(G, ((Event) mqiVar.getValue()).getId(), null, new eej(14), new qaj(16), new eej(15));
                M5.p(M5.g.size(), pdhVar);
            }
        }
    }

    public final ArrayList P() {
        return (ArrayList) this.J.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ShareMatchDetailsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.share_match_details);
        string.getClass();
        return string;
    }
}
