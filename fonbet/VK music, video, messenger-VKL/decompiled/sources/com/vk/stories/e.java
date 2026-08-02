package com.vk.stories;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.stories.StoryPrivacySettingsActivity;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import xsna.epx;
import xsna.ked0;
import xsna.rpj0;

/* compiled from: StoryPrivacySettingsActivity.kt */
/* loaded from: classes6.dex */
public final class e extends rpj0<ArrayList<ked0>> {
    public final /* synthetic */ StoryPrivacySettingsActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StoryPrivacySettingsActivity storyPrivacySettingsActivity) {
        super(storyPrivacySettingsActivity);
        this.d = storyPrivacySettingsActivity;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        StoryPrivacySettingsActivity storyPrivacySettingsActivity = this.d;
        storyPrivacySettingsActivity.w = emptyDisposable;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (("stories".equals(((ked0) arrayList.get(i)).a) || "lives".equals(((ked0) arrayList.get(i)).a)) && ((ked0) arrayList.get(i)).b != null && ((ked0) arrayList.get(i)).b.size() > 0) {
                    FrameLayout frameLayout = storyPrivacySettingsActivity.v;
                    PrivacySetting privacySetting = null;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    frameLayout.removeAllViews();
                    int size2 = ((ked0) arrayList.get(i)).b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (epx.f(((ked0) arrayList.get(i)).b.get(i2).b, storyPrivacySettingsActivity.x)) {
                            privacySetting = ((ked0) arrayList.get(i)).b.get(i2);
                        }
                    }
                    if (privacySetting != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("setting", new PrivacySetting(privacySetting));
                        FragmentImpl Ab = new FragmentEntry(StoryPrivacySettingsActivity.StoryPrivacySettingsFragment.class, bundle).Ab();
                        storyPrivacySettingsActivity.y = Ab;
                        storyPrivacySettingsActivity.n().q().c(R.id.fragment_wrapper, Ab);
                        return;
                    }
                }
            }
        }
        storyPrivacySettingsActivity.finish();
    }

    @Override // xsna.rpj0, xsna.q76, xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        super.e(vKApiExecutionException);
        this.d.finish();
    }
}
