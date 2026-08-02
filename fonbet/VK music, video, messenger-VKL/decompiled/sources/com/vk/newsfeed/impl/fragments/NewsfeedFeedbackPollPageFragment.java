package com.vk.newsfeed.impl.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.tool.view.disableable.DisableableFrameLayout;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.util.j;
import com.vkontakte.android.R;
import xsna.b2c0;
import xsna.oz50;
import xsna.qhh0;
import xsna.qi6;
import xsna.s1c0;

/* compiled from: NewsfeedFeedbackPollPageFragment.kt */
/* loaded from: classes4.dex */
public final class NewsfeedFeedbackPollPageFragment extends BaseFragment implements qhh0 {
    public NestedScrollView S;
    public final a T = new a();
    public final j U = new j();
    public final s1c0 V;

    /* compiled from: NewsfeedFeedbackPollPageFragment.kt */
    public static final class a extends b2c0 {
        @Override // xsna.b2c0, androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: L0 */
        public final qi6 onCreateViewHolder(int i, ViewGroup viewGroup) {
            if (i == 7) {
                i = 11;
            } else if (i == 353 || i == 58 || i == 59) {
                i = 51;
            }
            return super.onCreateViewHolder(i, viewGroup);
        }
    }

    /* compiled from: NewsfeedFeedbackPollPageFragment.kt */
    public static final class b extends oz50 {
    }

    public NewsfeedFeedbackPollPageFragment() {
        s1c0.a aVar = new s1c0.a();
        aVar.c = true;
        this.V = aVar.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed_feedback_poll_page, viewGroup, false);
        this.S = inflate instanceof NestedScrollView ? (NestedScrollView) inflate : null;
        ((DisableableFrameLayout) inflate.findViewById(R.id.container)).setTouchEnabled(false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(this.T);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.S = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NewsEntry newsEntry;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (newsEntry = (NewsEntry) arguments.getParcelable("payload")) == null) {
            return;
        }
        this.T.setItems(j.g(this.U, newsEntry, this.V, "unknown", "unknown"));
    }

    @Override // xsna.qhh0
    public final boolean s() {
        NestedScrollView nestedScrollView = this.S;
        if (nestedScrollView == null) {
            return true;
        }
        nestedScrollView.scrollTo(0, 0);
        return true;
    }
}
