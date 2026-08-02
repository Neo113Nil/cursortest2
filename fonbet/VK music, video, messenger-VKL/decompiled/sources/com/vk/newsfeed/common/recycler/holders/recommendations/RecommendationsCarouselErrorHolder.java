package com.vk.newsfeed.common.recycler.holders.recommendations;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.bwt0;
import xsna.cn70;
import xsna.jbf0;
import xsna.rp6;
import xsna.s980;
import xsna.u1c0;
import xsna.w8i;
import xsna.zrp;

/* compiled from: RecommendationsCarouselErrorHolder.kt */
/* loaded from: classes4.dex */
public final class RecommendationsCarouselErrorHolder extends rp6<jbf0, NewsEntry> implements w8i, View.OnClickListener {
    public final View E;
    public final View F;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsCarouselErrorHolder.kt */
    public static final class HeightType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeightType[] $VALUES;
        public static final HeightType DEFAULT;
        public static final HeightType TALL;

        static {
            HeightType heightType = new HeightType("DEFAULT", 0);
            DEFAULT = heightType;
            HeightType heightType2 = new HeightType("TALL", 1);
            TALL = heightType2;
            HeightType[] heightTypeArr = {heightType, heightType2};
            $VALUES = heightTypeArr;
            $ENTRIES = new asp(heightTypeArr);
        }

        public HeightType() {
            throw null;
        }

        public static HeightType valueOf(String str) {
            return (HeightType) Enum.valueOf(HeightType.class, str);
        }

        public static HeightType[] values() {
            return (HeightType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsCarouselErrorHolder(ViewGroup viewGroup, HeightType heightType, int i) {
        super(R.layout.holder_recommendations_carousel_error, viewGroup);
        heightType = (i & 4) != 0 ? HeightType.DEFAULT : heightType;
        View findViewById = this.itemView.findViewById(R.id.container_recom_carousel_error);
        this.E = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.retry_load_button);
        this.F = findViewById2;
        if (heightType == HeightType.TALL) {
            bwt0.c0(cn70.b(375), findViewById);
        }
        findViewById2.setOnClickListener(this);
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(jbf0 jbf0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        ?? q6 = q6();
        if (q6 == 0 || (s980Var = this.y) == 0) {
            return;
        }
        s980Var.d9(q6, t6(), PostActions.ACTION_LAZY_LOAD_RETRY.h(), i);
    }
}
