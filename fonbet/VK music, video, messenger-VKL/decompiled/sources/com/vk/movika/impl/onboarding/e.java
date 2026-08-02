package com.vk.movika.impl.onboarding;

import android.content.Context;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e43;
import xsna.yqf;
import xsna.zqf;

/* compiled from: InteractiveVideoOnboardingController.kt */
/* loaded from: classes3.dex */
public final class e {
    public final zqf a;
    public final List<InteractiveOnboardingModalBottomSheet.OnboardingStep> b;
    public final d c = new d(this);

    public e(Context context, yqf yqfVar, zqf zqfVar) {
        this.a = zqfVar;
        this.b = e43.l(new InteractiveOnboardingModalBottomSheet.OnboardingStep(context.getString(R.string.interactive_videos_onboarding_first_step_title), context.getString(R.string.interactive_videos_onboarding_first_step_desc), context.getString(R.string.interactive_videos_onboarding_next), context.getString(R.string.interactive_videos_onboarding_skip), R.drawable.vk_icon_illustration_interactive_video_200h), new InteractiveOnboardingModalBottomSheet.OnboardingStep(context.getString(R.string.interactive_videos_onboarding_second_step_title), context.getString(R.string.interactive_videos_onboarding_second_step_desc), context.getString(R.string.interactive_videos_onboarding_next), context.getString(R.string.interactive_videos_onboarding_skip), R.drawable.vk_icon_illustration_call_to_action_200h), new InteractiveOnboardingModalBottomSheet.OnboardingStep(context.getString(R.string.interactive_videos_onboarding_third_step_title), context.getString(R.string.interactive_videos_onboarding_third_step_desc), context.getString(R.string.interactive_videos_onboarding_next), context.getString(R.string.interactive_videos_onboarding_skip), R.drawable.vk_icon_illustration_skip_previous_200h), new InteractiveOnboardingModalBottomSheet.OnboardingStep(context.getString(R.string.interactive_videos_onboarding_fourth_step_title), context.getString(R.string.interactive_videos_onboarding_fourth_step_desc), context.getString(R.string.interactive_videos_onboarding_finish), context.getString(R.string.interactive_videos_onboarding_skip), R.drawable.vk_icon_illustration_interactive_restart_200h));
    }
}
