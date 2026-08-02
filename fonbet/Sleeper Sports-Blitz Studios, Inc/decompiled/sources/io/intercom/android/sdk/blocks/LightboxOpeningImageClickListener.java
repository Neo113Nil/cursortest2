package io.intercom.android.sdk.blocks;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.lightbox.LightBoxActivity;
import io.intercom.android.sdk.utilities.LinkOpener;

/* loaded from: classes9.dex */
public class LightboxOpeningImageClickListener implements ImageClickListener {
    private final Api api;

    public LightboxOpeningImageClickListener(Api api) {
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(String str, String str2, View view, int i, int i2) {
        Context context = view.getContext();
        if (!TextUtils.isEmpty(str2)) {
            LinkOpener.handleUrl(str2, context, this.api);
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.startActivity(LightBoxActivity.imageIntent(activity, str, (activity.getWindow().getAttributes().flags & 1024) != 0), ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, LightBoxActivity.TRANSITION_KEY).toBundle());
        } else {
            context.startActivity(LightBoxActivity.imageIntent(context, str, false));
        }
    }
}
