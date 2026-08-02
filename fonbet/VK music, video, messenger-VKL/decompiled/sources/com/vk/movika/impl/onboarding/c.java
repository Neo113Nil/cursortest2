package com.vk.movika.impl.onboarding;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import com.vkontakte.android.R;
import java.util.List;
import xsna.drm0;

/* compiled from: InteractiveOnboardingViewPagerAdapter.kt */
/* loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<RecyclerView.e0> {
    public List<InteractiveOnboardingModalBottomSheet.OnboardingStep> c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = e0Var instanceof a ? (a) e0Var : null;
        if (aVar != null) {
            InteractiveOnboardingModalBottomSheet.OnboardingStep onboardingStep = this.c.get(i);
            int size = this.c.size();
            VkText vkText = aVar.n;
            String str = onboardingStep.c;
            aVar.p.setImageResource(onboardingStep.f);
            aVar.o.setText(aVar.l.getContext().getString(R.string.interactive_videos_onboarding_step, Integer.valueOf(i + 1), Integer.valueOf(size)));
            VkText vkText2 = aVar.m;
            String str2 = onboardingStep.b;
            vkText2.setText(str2);
            vkText2.setVisibility(drm0.N(str2) ? 8 : 0);
            vkText.setText(str);
            vkText.setVisibility(drm0.N(str) ? 8 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
