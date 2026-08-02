package com.vk.libvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.d220;
import xsna.d27;
import xsna.e3m;
import xsna.epx;
import xsna.ho8;
import xsna.ikv0;
import xsna.isk;
import xsna.izs;
import xsna.jsk;
import xsna.s3q0;

/* compiled from: VideoHidePollView.kt */
/* loaded from: classes3.dex */
public final class VideoHidePollView extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final VkSimpleButton t;
    public final VkSimpleButton u;
    public izs<? super a, s3q0> v;

    /* compiled from: VideoHidePollView.kt */
    public static abstract class a {

        /* compiled from: VideoHidePollView.kt */
        /* renamed from: com.vk.libvideo.ui.VideoHidePollView$a$a, reason: collision with other inner class name */
        public static final class C1250a extends a {
            public final int a;
            public final String b;

            public C1250a(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1250a)) {
                    return false;
                }
                C1250a c1250a = (C1250a) obj;
                return this.a == c1250a.a && epx.f(this.b, c1250a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Answer(numeric=");
                sb.append(this.a);
                sb.append(", text=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: VideoHidePollView.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public VideoHidePollView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void P4() {
        ikv0.a aVar = new ikv0.a(getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(getContext().getString(R.string.video_hide_poll_completed_text), (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    public final void setOnCloseListener(izs<? super a, s3q0> izsVar) {
        this.v = izsVar;
    }

    public VideoHidePollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoHidePollView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VideoHidePollView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, R.layout.video_hide_poll_view);
    }

    public VideoHidePollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.v = new d220(26);
        LayoutInflater.from(context).inflate(i2, (ViewGroup) this, true);
        bwt0.X(R.drawable.bg_video_hide_view, this);
        ImageView imageView = (ImageView) findViewById(R.id.close_poll);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) findViewById(R.id.poll_first_action);
        this.t = vkSimpleButton;
        VkSimpleButton vkSimpleButton2 = (VkSimpleButton) findViewById(R.id.poll_second_action);
        this.u = vkSimpleButton2;
        vkSimpleButton.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
        vkSimpleButton2.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
        imageView.setOnClickListener(new isk(this, 8));
        vkSimpleButton.setOnClickListener(new jsk(this, 13));
        vkSimpleButton2.setOnClickListener(new d27(this, 9));
    }
}
