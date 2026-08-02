package com.vk.libvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.fnj;
import xsna.gzs;
import xsna.iah0;
import xsna.j5g;
import xsna.qc00;
import xsna.qlq0;
import xsna.s3q0;

/* compiled from: VideoHideView.kt */
/* loaded from: classes3.dex */
public final class VideoHideView extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final TextView t;
    public final TextView u;
    public VideoFile v;
    public List<String> w;
    public boolean x;
    public String y;
    public gzs<s3q0> z;

    /* compiled from: VideoHideView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoScreenMode.values().length];
            try {
                iArr[VideoScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoScreenMode.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoScreenMode.PREVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoHideView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void setCancelText(int i) {
        this.u.setText(i);
    }

    public final void setHiddenBlocksIds(List<String> list) {
        this.w = j5g.O0(list);
    }

    public final void setIsHideByOwner(boolean z) {
        TextView textView = this.t;
        if (z) {
            textView.setText(R.string.video_not_recommend_author_hidden);
        } else {
            textView.setText(R.string.video_hidden_video_text);
        }
        this.x = z;
    }

    public final void setOnCancelClickListener(gzs<s3q0> gzsVar) {
        this.z = gzsVar;
    }

    public final void setScreenMode(VideoScreenMode videoScreenMode) {
        String str;
        int i = videoScreenMode == null ? -1 : a.$EnumSwitchMapping$0[videoScreenMode.ordinal()];
        if (i == -1) {
            str = null;
        } else if (i == 1) {
            str = "discovery";
        } else if (i == 2) {
            str = "fullscreen_landscape";
        } else if (i == 3) {
            str = "fullscreen_portrait";
        } else if (i == 4) {
            str = "invisible";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "preview";
        }
        this.y = str;
    }

    public final void setText(int i) {
        this.t.setText(i);
    }

    public final void setVideoFile(VideoFile videoFile) {
        this.v = videoFile;
    }

    public VideoHideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoHideView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VideoHideView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? R.layout.video_hide_view : R.layout.video_hide_view_large);
    }

    public VideoHideView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.w = EmptyList.b;
        this.z = new qc00(18);
        int i3 = 1;
        LayoutInflater.from(context).inflate(i2, (ViewGroup) this, true);
        bwt0.X(R.drawable.bg_video_hide_view, this);
        TextView textView = (TextView) findViewById(R.id.text);
        this.t = textView;
        textView.setText(R.string.video_hidden_video_text);
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            int a2 = e3m.a(R.dimen.video_hide_view_tablet_vertical_padding, context);
            f4m.B(a2, a2, textView);
        }
        TextView textView2 = (TextView) findViewById(R.id.cancel);
        this.u = textView2;
        textView2.setText(R.string.video_hide_cancel);
        bwt0.i0(textView2, new qlq0(i3, this, context));
    }
}
