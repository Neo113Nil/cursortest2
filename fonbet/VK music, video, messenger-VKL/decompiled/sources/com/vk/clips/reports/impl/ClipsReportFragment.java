package com.vk.clips.reports.impl;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.clips.reports.impl.data.ClipsReportCategory;
import com.vk.clips.reports.impl.data.ClipsReportReason;
import com.vk.core.fragments.BaseFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.subjects.d;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import xsna.asu0;
import xsna.bwt0;
import xsna.d1f;
import xsna.e43;
import xsna.g1f;
import xsna.g86;
import xsna.gr3;
import xsna.h1f;
import xsna.hg1;
import xsna.i1f;
import xsna.j1f;
import xsna.jgp;
import xsna.krv0;
import xsna.m1f;
import xsna.oz50;
import xsna.p7;
import xsna.pn00;
import xsna.qm0;
import xsna.rdi;
import xsna.s6g0;

/* compiled from: ClipsReportFragment.kt */
/* loaded from: classes16.dex */
public final class ClipsReportFragment extends BaseFragment {
    public static final /* synthetic */ int V = 0;
    public final d<m1f> S = d.N0();
    public final s6g0 T = new s6g0();
    public final d1f U = new d1f(new c());

    /* compiled from: ClipsReportFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsReportFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReportsAddTypeDto.values().length];
            try {
                iArr[ReportsAddTypeDto.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReportsAddTypeDto.VIDEO_COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReportsAddTypeDto.USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReportsAddTypeDto.COMMUNITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipsReportFragment.kt */
    public static final class c implements g1f {
        public c() {
        }

        @Override // xsna.g1f
        public final void a(j1f j1fVar) {
            ClipsReportFragment clipsReportFragment = ClipsReportFragment.this;
            m1f P0 = clipsReportFragment.S.P0();
            if (P0 == null) {
                return;
            }
            clipsReportFragment.S.onNext(new m1f(P0.a, j1fVar.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Map k;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.report_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(R.id.report_toolbar);
        TypedValue typedValue = krv0.a;
        krv0.r(toolbar, R.drawable.vk_icon_back_24);
        toolbar.setNavigationOnClickListener(new i1f(this, 0 == true ? 1 : 0));
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.report_recycler);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.U);
        View findViewById = viewGroup2.findViewById(R.id.report_send_button);
        bwt0.i0(findViewById, new gr3(this, 19));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        w i = asu0.i();
        d<m1f> dVar = this.S;
        this.O.b(hg1.h(dVar.a0(i).U(new p7(new qm0(this, 13), 18)).a0(asu0Var.d()), new g86(5, this, findViewById)));
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("type") : null;
        ReportsAddTypeDto reportsAddTypeDto = serializable instanceof ReportsAddTypeDto ? (ReportsAddTypeDto) serializable : null;
        if (reportsAddTypeDto == null) {
            throw new IllegalArgumentException("No type argument is specified");
        }
        Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean("is_original_audio") : false;
        int i2 = h1f.$EnumSwitchMapping$0[reportsAddTypeDto.ordinal()];
        if (i2 == 1) {
            k = z ? pn00.k(new Pair(ClipsReportCategory.SPAM, Collections.singletonList(ClipsReportReason.SPAM)), new Pair(ClipsReportCategory.FRAUD, e43.l(ClipsReportReason.MISLEADING, ClipsReportReason.FRAUD)), new Pair(ClipsReportCategory.VIOLENCE_AND_HOSTILITY, e43.l(ClipsReportReason.VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS, ClipsReportReason.INSULTS, ClipsReportReason.INCLINATION_TO_SUICIDE, ClipsReportReason.HOSTILE_REMARKS, ClipsReportReason.EXTREMISM, ClipsReportReason.CALLS_FOR_BULLYING))) : pn00.k(new Pair(ClipsReportCategory.SPAM, Collections.singletonList(ClipsReportReason.SPAM)), new Pair(ClipsReportCategory.RESTRICTED_PRODUCT, e43.l(ClipsReportReason.WEAPON, ClipsReportReason.DRUGS, ClipsReportReason.PROSTITUTION, ClipsReportReason.OTHER)), new Pair(ClipsReportCategory.FRAUD, e43.l(ClipsReportReason.MISLEADING, ClipsReportReason.FRAUD)), new Pair(ClipsReportCategory.VIOLENCE_AND_HOSTILITY, e43.l(ClipsReportReason.VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS, ClipsReportReason.INSULTS, ClipsReportReason.INCLINATION_TO_SUICIDE, ClipsReportReason.HOSTILE_REMARKS, ClipsReportReason.EXTREMISM, ClipsReportReason.CALLS_FOR_BULLYING)), new Pair(ClipsReportCategory.ADULT_CONTENT, e43.l(ClipsReportReason.PORNO, ClipsReportReason.CHILD_PORNO)));
        } else if (i2 == 2) {
            k = pn00.k(new Pair(ClipsReportCategory.SPAM, Collections.singletonList(ClipsReportReason.SPAM)), new Pair(ClipsReportCategory.RESTRICTED_PRODUCT, e43.l(ClipsReportReason.WEAPON, ClipsReportReason.DRUGS, ClipsReportReason.PROSTITUTION, ClipsReportReason.OTHER)), new Pair(ClipsReportCategory.FRAUD, e43.l(ClipsReportReason.MISLEADING, ClipsReportReason.FRAUD)), new Pair(ClipsReportCategory.VIOLENCE_AND_HOSTILITY, e43.l(ClipsReportReason.VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS, ClipsReportReason.INSULTS, ClipsReportReason.INCLINATION_TO_SUICIDE, ClipsReportReason.HOSTILE_REMARKS, ClipsReportReason.EXTREMISM, ClipsReportReason.CALLS_FOR_BULLYING)), new Pair(ClipsReportCategory.ADULT_CONTENT, e43.l(ClipsReportReason.PORNO, ClipsReportReason.CHILD_PORNO)));
        } else if (i2 == 3) {
            k = pn00.k(new Pair(ClipsReportCategory.SPAM, Collections.singletonList(ClipsReportReason.SPAM)), new Pair(ClipsReportCategory.FRAUD, e43.l(ClipsReportReason.MISLEADING, ClipsReportReason.FRAUD)), new Pair(ClipsReportCategory.ADULT_CONTENT, e43.l(ClipsReportReason.PORNO, ClipsReportReason.CHILD_PORNO)), new Pair(ClipsReportCategory.PROFILE, e43.l(ClipsReportReason.PROFILE_CLONE, ClipsReportReason.PROFILE_MINE)));
        } else if (i2 != 4) {
            k = jgp.b;
            rdi.F(k);
        } else {
            k = pn00.k(new Pair(ClipsReportCategory.SPAM, Collections.singletonList(ClipsReportReason.SPAM)), new Pair(ClipsReportCategory.RESTRICTED_PRODUCT, e43.l(ClipsReportReason.WEAPON, ClipsReportReason.DRUGS, ClipsReportReason.PROSTITUTION, ClipsReportReason.OTHER)), new Pair(ClipsReportCategory.FRAUD, e43.l(ClipsReportReason.MISLEADING, ClipsReportReason.FRAUD)), new Pair(ClipsReportCategory.VIOLENCE_AND_HOSTILITY, e43.l(ClipsReportReason.VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS, ClipsReportReason.INSULTS, ClipsReportReason.INCLINATION_TO_SUICIDE, ClipsReportReason.HOSTILE_REMARKS, ClipsReportReason.EXTREMISM, ClipsReportReason.CALLS_FOR_BULLYING)), new Pair(ClipsReportCategory.ADULT_CONTENT, e43.l(ClipsReportReason.PORNO, ClipsReportReason.CHILD_PORNO)));
        }
        dVar.onNext(new m1f(k, null));
        return viewGroup2;
    }
}
