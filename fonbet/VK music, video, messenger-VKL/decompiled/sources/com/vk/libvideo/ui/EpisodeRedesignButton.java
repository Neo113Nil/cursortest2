package com.vk.libvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: EpisodeRedesignButton.kt */
/* loaded from: classes3.dex */
public final class EpisodeRedesignButton extends ConstraintLayout {
    public final TextView t;
    public final TextView u;

    public EpisodeRedesignButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.video_episode_redesign_button, (ViewGroup) this, true);
        this.t = (TextView) findViewById(R.id.episode_name);
        this.u = (TextView) findViewById(R.id.episode_count);
    }
}
