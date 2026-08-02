package com.vk.story.viewer.impl.presentation.stories.util;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.ai9;
import xsna.anm0;
import xsna.b290;
import xsna.drm0;
import xsna.fnj;
import xsna.iah0;
import xsna.ies;
import xsna.jjc;
import xsna.mhy;
import xsna.msy;
import xsna.oz50;
import xsna.rno0;
import xsna.ucp;
import xsna.vnb0;
import xsna.y8g0;

/* compiled from: StoryQuestionMessageDialog.kt */
/* loaded from: classes6.dex */
public final class StoryQuestionMessageDialog extends BaseFragment implements ies {
    public static final /* synthetic */ int W = 0;
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new b290(this, 23));
    public StoryEntry T;
    public StoryQuestionEntry U;
    public ai9 V;

    /* compiled from: StoryQuestionMessageDialog.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: StoryQuestionMessageDialog.kt */
    public static final class b extends rno0 {
        public final /* synthetic */ VkInputSelect b;
        public final /* synthetic */ TextView c;

        public b(VkInputSelect vkInputSelect, TextView textView) {
            this.b = vkInputSelect;
            this.c = textView;
        }

        @Override // xsna.rno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ucp ucpVar = ucp.a;
            ucp.i(editable);
            boolean z = drm0.p0(editable).length() > 0;
            this.b.setActivated(z);
            this.c.setEnabled(z);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.T = arguments != null ? (StoryEntry) arguments.getParcelable("story_entry_key") : null;
        Bundle arguments2 = getArguments();
        this.U = arguments2 != null ? (StoryQuestionEntry) arguments2.getParcelable("story_question_key") : null;
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        Window window = this.s.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = this.s.getWindow();
        if (window2 != null) {
            window2.requestFeature(1);
        }
        View inflate = layoutInflater.inflate(R.layout.layout_story_question_send_message, viewGroup, false);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.iv_story_view);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_question_author_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_question);
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.et_message);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_question_send);
        vkInputSelect.b(new b(vkInputSelect, textView3));
        jjc.g(textView3, new vnb0(2, this, vkInputSelect));
        StoryEntry storyEntry = this.T;
        if (storyEntry == null) {
            storyEntry = null;
        }
        vKImageView.load(storyEntry.Cb(true));
        StoryQuestionEntry storyQuestionEntry = this.U;
        if (storyQuestionEntry == null) {
            storyQuestionEntry = null;
        }
        UserProfile userProfile = storyQuestionEntry.g;
        String string = (userProfile == null || (bundle2 = userProfile.s) == null) ? null : bundle2.getString("name_gen");
        if (string == null) {
            StoryQuestionEntry storyQuestionEntry2 = this.U;
            if (storyQuestionEntry2 == null) {
                storyQuestionEntry2 = null;
            }
            UserProfile userProfile2 = storyQuestionEntry2.g;
            string = userProfile2 != null ? userProfile2.e : null;
        }
        textView.setText(y8g0.f(R.string.story_question_option_from, string));
        ucp ucpVar = ucp.a;
        StoryQuestionEntry storyQuestionEntry3 = this.U;
        textView2.setText(ucp.i((storyQuestionEntry3 != null ? storyQuestionEntry3 : null).d));
        ((anm0) this.S.getValue()).N();
        mhy.j(vkInputSelect);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WindowManager.LayoutParams attributes = this.s.getWindow().getAttributes();
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        attributes.width = fnj.d(requireContext) ? Math.min(iah0.f().widthPixels, iah0.a(400)) : Math.min(iah0.f().heightPixels, iah0.f().widthPixels) - iah0.a(16);
        attributes.height = -2;
        this.s.getWindow().setAttributes(attributes);
    }
}
