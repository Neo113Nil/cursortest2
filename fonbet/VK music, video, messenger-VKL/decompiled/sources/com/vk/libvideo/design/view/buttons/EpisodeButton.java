package com.vk.libvideo.design.view.buttons;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.R$styleable;
import com.vk.libvideo.autoplay.j;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;
import xsna.e43;
import xsna.j5g;
import xsna.jw5;
import xsna.lpj;

/* compiled from: EpisodeButton.kt */
@SuppressLint({"UseCompatTextViewDrawableApis"})
/* loaded from: classes2.dex */
public final class EpisodeButton extends ConstraintLayout {
    public final TextView t;
    public final TextView u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EpisodeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!BuildInfo.q()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            try {
                context = obtainStyledAttributes.getBoolean(0, false) ? new lpj(context, R.style.Vk_Theme_VkApp_Dark) : context;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Context context2 = getContext();
        LayoutInflater.from(context2).inflate(R.layout.video_episode_button, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.episode_name);
        this.t = textView;
        TextView textView2 = (TextView) findViewById(R.id.episode_count);
        this.u = textView2;
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_subhead, context2));
        textView2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context2));
        textView2.setCompoundDrawableTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, context2)));
        setBackgroundResource(R.drawable.episode_button_background);
        setClickable(true);
        setFocusable(true);
    }

    public static String Q4(int i, VideoFile videoFile) {
        int i2;
        if (i < 0 || i > videoFile.getDuration()) {
            i2 = -1;
        } else {
            List<VideoEpisode> Y3 = videoFile.Y3();
            Integer valueOf = Integer.valueOf(i);
            int size = Y3.size();
            e43.q(Y3.size(), size);
            int i3 = size - 1;
            int i4 = 0;
            while (true) {
                if (i4 > i3) {
                    i2 = -(i4 + 1);
                    break;
                }
                i2 = (i4 + i3) >>> 1;
                int b = jw5.b(Integer.valueOf(Y3.get(i2).b), valueOf);
                if (b >= 0) {
                    if (b <= 0) {
                        break;
                    }
                    i3 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            }
            if (i2 < 0) {
                i2 = (-i2) - 2;
            }
        }
        VideoEpisode videoEpisode = (VideoEpisode) j5g.b0(i2, videoFile.Y3());
        String str = videoEpisode != null ? videoEpisode.c : null;
        return str == null ? "" : str;
    }

    public final void P4(VideoFile videoFile) {
        this.u.setText(getResources().getQuantityString(R.plurals.video_episodes_count, videoFile.Y3().size(), Integer.valueOf(videoFile.Y3().size())));
        this.t.setText(Q4((int) (j.b(videoFile) / 1000), videoFile));
    }
}
