package com.vk.catalog2.common.ui.mvp.holder.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockQuestionnaire;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.dto.common.Image;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.ajd0;
import xsna.b5a;
import xsna.bpn0;
import xsna.fxc0;
import xsna.hjx;
import xsna.iah0;
import xsna.jl4;
import xsna.msy;
import xsna.q3a;
import xsna.s7a;
import xsna.w8i;
import xsna.wt30;

/* compiled from: QuestionnaireVh.kt */
/* loaded from: classes16.dex */
public final class QuestionnaireVh extends VideoItemVh implements w8i {
    public static final /* synthetic */ int q = 0;
    public final q3a m;
    public final bpn0 n;
    public final Object o;
    public hjx p;

    static {
        new Image(EmptyList.b);
    }

    public QuestionnaireVh(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        super(b5aVar, searchStatInfoProvider, fxc0.B(), null, null, null, null, null, 248);
        this.m = q3aVar;
        this.n = new bpn0(new wt30(this, 12));
        this.o = msy.a(LazyThreadSafetyMode.NONE, new ajd0(this, 1));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        UIBlockQuestionnaire uIBlockQuestionnaire = uIBlock instanceof UIBlockQuestionnaire ? (UIBlockQuestionnaire) uIBlock : null;
        if (uIBlockQuestionnaire == null) {
            return;
        }
        QuestionsTexts questionsTexts = uIBlockQuestionnaire.z;
        if (questionsTexts != null) {
            hjx hjxVar = this.p;
            if (hjxVar == null) {
                hjxVar = null;
            }
            hjxVar.e(questionsTexts);
        }
        hjx hjxVar2 = this.p;
        (hjxVar2 != null ? hjxVar2 : null).f(uIBlockQuestionnaire.y, uIBlockQuestionnaire.b, new jl4(17, this, uIBlock));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.p = ((s7a) this.o.getValue()).a(layoutInflater.getContext());
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        float f = 12;
        frameLayout.setPadding(iah0.a(f), 0, iah0.a(f), iah0.a(f));
        hjx hjxVar = this.p;
        if (hjxVar == null) {
            hjxVar = null;
        }
        frameLayout.addView(hjxVar.getView());
        return frameLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
