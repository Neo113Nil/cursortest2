package com.vk.stories.design.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dhk0;
import xsna.e3m;
import xsna.gvu;
import xsna.hlq;
import xsna.iah0;
import xsna.k50;
import xsna.rm3;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: HashtagHintsView.kt */
/* loaded from: classes6.dex */
public final class HashtagHintsView extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final gvu b;
    public wzs<? super String, ? super Integer, s3q0> c;

    public HashtagHintsView(Context context) {
        super(context);
        gvu gvuVar = new gvu();
        this.b = gvuVar;
        LayoutInflater.from(getContext()).inflate(R.layout.hashtag_hints_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, getContext()));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.hashtags_suggest_list);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(gvuVar);
        float f = 12;
        setPadding(0, iah0.a(f), 0, iah0.a(f));
        float f2 = 4;
        recyclerView.addItemDecoration(new dhk0(iah0.a(f2), 0, iah0.a(f2), 0));
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(List<String> list, List<? extends View> list2) {
        gvu gvuVar = this.b;
        boolean z = gvuVar.getItemCount() == 0;
        boolean isEmpty = list.isEmpty();
        if (z == isEmpty) {
            gvuVar.setItems(list);
            return;
        }
        if (isEmpty) {
            clearAnimation();
            animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).setStartDelay(list2.isEmpty() ? 0L : 200L).withStartAction(new rm3(3, list2, this)).setListener(new a(list)).setInterpolator(new hlq()).start();
        } else {
            clearAnimation();
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            gvuVar.setItems(list);
            animate().alpha(1.0f).setDuration(200L).setListener(null).setStartDelay(list2.isEmpty() ? 0L : 200L).withStartAction(new k50(4, list2, this)).setInterpolator(new hlq()).start();
        }
    }

    public final wzs<String, Integer, s3q0> getOnClick() {
        return this.c;
    }

    public final void setOnClick(wzs<? super String, ? super Integer, s3q0> wzsVar) {
        this.b.e = wzsVar;
        this.c = wzsVar;
    }

    public HashtagHintsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        gvu gvuVar = new gvu();
        this.b = gvuVar;
        LayoutInflater.from(getContext()).inflate(R.layout.hashtag_hints_view, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, getContext()));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.hashtags_suggest_list);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(gvuVar);
        float f = 12;
        setPadding(0, iah0.a(f), 0, iah0.a(f));
        float f2 = 4;
        recyclerView.addItemDecoration(new dhk0(iah0.a(f2), 0, iah0.a(f2), 0));
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* compiled from: HashtagHintsView.kt */
    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ List<String> c;

        public a(List<String> list) {
            this.c = list;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HashtagHintsView.this.b.setItems(this.c);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
