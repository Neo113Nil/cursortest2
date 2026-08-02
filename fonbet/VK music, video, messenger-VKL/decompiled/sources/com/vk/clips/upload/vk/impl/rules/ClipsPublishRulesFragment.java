package com.vk.clips.upload.vk.impl.rules;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.gr3;
import xsna.oz50;
import xsna.tlo0;
import xsna.tq;

/* compiled from: ClipsPublishRulesFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsPublishRulesFragment extends FragmentImpl {
    public static final /* synthetic */ int N = 0;

    /* compiled from: ClipsPublishRulesFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ClipsPublishRulesFragment.class, null, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_clips_rules, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        gko.b bVar = gko.Companion;
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_back_24), tq.h(tlo0.Companion, R.string.accessibility_back), new f(this, 25), null, null, 56));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.clip_rules_title), null, null, null, null, 30), null, null, b.a(null, new gr3(vkTopBar, 18), 3), 6));
        vkTopBar.setShowBottomDivider(true);
    }
}
