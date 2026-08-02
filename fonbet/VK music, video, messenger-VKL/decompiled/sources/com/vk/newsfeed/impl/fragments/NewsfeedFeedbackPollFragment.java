package com.vk.newsfeed.impl.fragments;

import android.content.DialogInterface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.h;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollPageFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.bgy;
import xsna.bwt0;
import xsna.d410;
import xsna.gbg0;
import xsna.h3p0;
import xsna.h7u0;
import xsna.ies;
import xsna.jjc;
import xsna.ku1;
import xsna.oz50;
import xsna.qhh0;
import xsna.qi60;
import xsna.ri60;
import xsna.u1u0;
import xsna.uzb;
import xsna.vbs;
import xsna.w620;

/* compiled from: NewsfeedFeedbackPollFragment.kt */
/* loaded from: classes4.dex */
public final class NewsfeedFeedbackPollFragment extends BaseMvpFragment<Object> implements ies, TabLayout.d {
    public static final /* synthetic */ int g0 = 0;
    public Toolbar T;
    public VKTabLayout U;
    public ViewPager V;
    public b W;
    public View X;
    public TextView Y;
    public LinearLayout Z;
    public TextView a0;
    public View b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public final ri60 f0 = new ri60(this);

    /* compiled from: NewsfeedFeedbackPollFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: NewsfeedFeedbackPollFragment.kt */
    public static final class b extends h {
        public final ArrayList<FeedbackPoll.QuestionEntry> k;
        public final SparseArray<WeakReference<FragmentImpl>> l;

        public b(vbs vbsVar) {
            super(vbsVar, true);
            this.k = new ArrayList<>();
            this.l = new SparseArray<>();
        }

        @Override // com.vk.core.fragments.h
        public final FragmentImpl c(int i) {
            NewsEntry newsEntry = this.k.get(i).c;
            NewsfeedFeedbackPollPageFragment.b bVar = new NewsfeedFeedbackPollPageFragment.b(NewsfeedFeedbackPollPageFragment.class, null, null);
            bVar.j.putParcelable("payload", newsEntry);
            FragmentImpl f = bVar.f();
            this.l.put(i, new WeakReference<>(f));
            return f;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.k.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.k.get(i).b;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        if (gVar.e != 0) {
            TextView textView = this.a0;
            if (textView != null) {
                bwt0.p0(textView, false);
            }
            LinearLayout linearLayout = this.Z;
            if (linearLayout != null) {
                bwt0.p0(linearLayout, true);
            }
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (!mo()) {
            return super.a0();
        }
        no();
        return true;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        b bVar = this.W;
        f fVar = null;
        if (bVar != null) {
            WeakReference<FragmentImpl> weakReference = bVar.l.get(gVar.e);
            if (weakReference != null) {
                fVar = (FragmentImpl) weakReference.get();
            }
        }
        if (fVar instanceof qhh0) {
            ((qhh0) fVar).s();
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final Object io() {
        return this.f0;
    }

    public final void jo(LinearLayout linearLayout, FeedbackPoll.Answer answer) {
        VkSimpleButton vkSimpleButton = new VkSimpleButton(requireContext(), null, 6);
        vkSimpleButton.setMode(VkButton.Mode.Secondary);
        vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
        vkSimpleButton.setSize(VkButton.Size.Medium);
        vkSimpleButton.setText(answer.c);
        jjc.g(vkSimpleButton, new ku1(22, this, answer));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (linearLayout != null) {
            linearLayout.addView(vkSimpleButton, layoutParams);
        }
    }

    public final void ko(FeedbackPoll.Question question) {
        b bVar = this.W;
        if (bVar != null) {
            List<FeedbackPoll.QuestionEntry> list = question.c;
            bVar.l.clear();
            ArrayList<FeedbackPoll.QuestionEntry> arrayList = bVar.k;
            arrayList.clear();
            arrayList.addAll(list);
            bVar.notifyDataSetChanged();
        }
        ViewPager viewPager = this.V;
        if (viewPager != null) {
            viewPager.setCurrentItem(0, false);
        }
        TextView textView = this.Y;
        if (textView != null) {
            textView.setText(question.b);
        }
        LinearLayout linearLayout = this.Z;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        List<FeedbackPoll.Answer> list2 = question.d;
        if ((list2 instanceof List) && (list2 instanceof RandomAccess)) {
            List<FeedbackPoll.Answer> list3 = list2;
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                jo(this.Z, list3.get(i));
            }
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                jo(this.Z, (FeedbackPoll.Answer) it.next());
            }
        }
        LinearLayout linearLayout2 = this.Z;
        if (linearLayout2 != null) {
            bwt0.p0(linearLayout2, false);
        }
        TextView textView2 = this.a0;
        if (textView2 != null) {
            textView2.setText(question.e);
        }
        TextView textView3 = this.a0;
        if (textView3 != null) {
            bwt0.p0(textView3, true);
        }
    }

    public final void lo(int i, int i2) {
        Toolbar toolbar = this.T;
        if (toolbar != null) {
            toolbar.setSubtitle(getString(R.string.newsfeed_feedback_poll_subtitle, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public final boolean mo() {
        FeedbackPoll feedbackPoll;
        ri60 ri60Var = this.f0;
        return ri60Var != null && ri60Var.e > 0 && (feedbackPoll = ri60Var.c) != null && ri60Var.d < feedbackPoll.j.c.size();
    }

    public final void no() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        h7u0.a aVar = new h7u0.a(activity);
        aVar.g0(R.string.newsfeed_feedback_poll_exit_dialog_title);
        aVar.U(R.string.newsfeed_feedback_poll_exit_dialog_message);
        aVar.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.pi60
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = NewsfeedFeedbackPollFragment.g0;
                dialogInterface.dismiss();
                NewsfeedFeedbackPollFragment.this.finish();
            }
        });
        aVar.W(R.string.no, new qi60(0));
        aVar.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed_feedback_poll, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            d410 d410Var = new d410(this, 12);
            if (!h3p0.f(this, toolbar)) {
                u1u0.k(toolbar, R.drawable.vk_icon_cancel_24, R.string.accessibility_close);
                toolbar.setNavigationOnClickListener(new uzb(d410Var, 7));
            }
            toolbar.t(R.style.FeedbackPollTitle_Small, getActivity());
            toolbar.s(R.style.FeedbackPollSubtitle, getActivity());
        } else {
            toolbar = null;
        }
        this.T = toolbar;
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(1);
        b bVar = new b(In());
        this.W = bVar;
        viewPager.setAdapter(bVar);
        this.V = viewPager;
        VKTabLayout vKTabLayout = (VKTabLayout) inflate.findViewById(R.id.tabs);
        vKTabLayout.setupWithViewPager(this.V);
        vKTabLayout.f(this);
        this.U = vKTabLayout;
        this.X = inflate.findViewById(R.id.footer);
        this.Y = (TextView) inflate.findViewById(R.id.tv_question);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.buttons_container);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicWidth(gbg0.a(getResources(), 8.0f));
        shapeDrawable.getPaint().setColor(0);
        linearLayout.setDividerDrawable(shapeDrawable);
        this.Z = linearLayout;
        TextView textView = (TextView) inflate.findViewById(R.id.next);
        jjc.g(textView, new w620(this, 7));
        this.a0 = textView;
        this.b0 = inflate.findViewById(R.id.gratitude);
        this.c0 = (TextView) inflate.findViewById(R.id.gratitude_title);
        this.d0 = (TextView) inflate.findViewById(R.id.gratitude_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.gratitude_button);
        jjc.g(textView2, new bgy(this, 16));
        this.e0 = textView2;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.T = null;
        this.U = null;
        this.V = null;
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.X = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        ri60 ri60Var = this.f0;
        if (ri60Var != null) {
            bundle2 = new Bundle();
            bundle2.putInt("current_position", ri60Var.d);
            bundle2.putInt("answers_given", ri60Var.e);
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            bundle.putBundle("feedback_poll_state", bundle2);
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        ri60 ri60Var = this.f0;
        if (ri60Var != null) {
            Bundle arguments = getArguments();
            ri60Var.c = arguments != null ? (FeedbackPoll) arguments.getParcelable("payload") : null;
        }
        if (ri60Var != null && bundle != null && (bundle2 = bundle.getBundle("feedback_poll_state")) != null) {
            ri60Var.d = bundle2.getInt("current_position", 0);
            ri60Var.e = bundle2.getInt("answers_given", 0);
        }
        super.onViewCreated(view, bundle);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
    }
}
