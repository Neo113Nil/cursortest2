package com.vk.libvideo.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import kotlin.LazyThreadSafetyMode;
import xsna.anj;
import xsna.baf0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e43;
import xsna.e5o;
import xsna.epx;
import xsna.f4m;
import xsna.fxc0;
import xsna.gpt0;
import xsna.iah0;
import xsna.ipq0;
import xsna.j5g;
import xsna.m33;
import xsna.msy;
import xsna.o25;
import xsna.p5;
import xsna.rc;
import xsna.uqm0;
import xsna.uys0;

/* compiled from: VideoBottomBarView.kt */
/* loaded from: classes3.dex */
public final class VideoBottomBarView extends LinearLayout {
    public static final /* synthetic */ int p = 0;
    public final VkImageSimple b;
    public final VkImageSimple c;
    public final View d;
    public final VkText e;
    public final VkImageSimple f;
    public final VkText g;
    public final VkText h;
    public final uys0 i;
    public final Space j;
    public final VkImageSimple k;
    public final VkImageSimple l;
    public View.OnClickListener m;
    public boolean n;
    public final Object o;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoBottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.o = msy.a(LazyThreadSafetyMode.NONE, new ipq0(this, 2));
        LayoutInflater.from(context).inflate(R.layout.video_bottom_bar_view, (ViewGroup) this, true);
        VkText vkText = (VkText) findViewById(R.id.comments);
        this.h = vkText;
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.add_video);
        this.b = vkImageSimple;
        VkImageSimple vkImageSimple2 = (VkImageSimple) findViewById(R.id.watch_video_later);
        this.c = vkImageSimple2;
        VkText vkText2 = (VkText) findViewById(R.id.shares);
        this.g = vkText2;
        View findViewById = findViewById(R.id.likes);
        this.d = findViewById;
        this.e = (VkText) findViewById(R.id.tv_likes);
        this.f = (VkImageSimple) findViewById(R.id.iv_likes);
        this.j = (Space) findViewById(R.id.space);
        VkImageSimple vkImageSimple3 = (VkImageSimple) findViewById(R.id.show_playlist);
        this.k = vkImageSimple3;
        VkImageSimple vkImageSimple4 = (VkImageSimple) findViewById(R.id.show_more);
        this.l = vkImageSimple4;
        uys0 b = fxc0.B().u0().b(context);
        b.setDarkContextMenus(true);
        boolean z = b instanceof View;
        View view = z ? (View) b : null;
        if (view != null) {
            view.setBackgroundResource(R.drawable.highlight_video_player_bottom);
            view.setContentDescription(context.getString(R.string.video_accessibility_download_video));
        }
        this.i = b;
        View view2 = z ? (View) b : null;
        if (view2 != null) {
            addView(view2, indexOfChild(vkImageSimple), new LinearLayout.LayoutParams(iah0.a(56), -1));
        }
        View view3 = z ? (View) b : null;
        if (view3 != null) {
            view3.setTag("download_video");
        }
        findViewById.setTag("bottom_like");
        vkText2.setTag("bottom_share");
        vkText.setTag("bottom_comment");
        vkImageSimple.setTag("bottom_add");
        vkImageSimple2.setTag("bottom_watch_later");
        vkImageSimple3.setTag("playlist_tag");
        vkImageSimple4.setTag("more_tag");
        e(null);
        d(null);
        f(null);
        if (fxc0.B().s().isEnabled()) {
            return;
        }
        b.setVisible(false);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(VideoFile videoFile) {
        String str;
        String str2;
        VideoRestriction O;
        VideoRestriction O2 = videoFile.O();
        boolean z = false;
        boolean z2 = O2 != null && e5o.b(O2) && ((Boolean) this.o.getValue()).booleanValue();
        boolean i0 = videoFile.i0();
        VkText vkText = this.e;
        bwt0.p0(vkText, i0);
        boolean i02 = videoFile.i0();
        View view = this.d;
        bwt0.p0(view, i02);
        boolean Fa = videoFile.Fa();
        VkText vkText2 = this.g;
        bwt0.p0(vkText2, Fa);
        VideoRestriction O3 = videoFile.O();
        boolean z3 = (O3 == null || O3.f || z2) && !this.n;
        VkText vkText3 = this.h;
        bwt0.p0(vkText3, z3);
        boolean e = fxc0.B().b0().e(videoFile);
        view.setSelected(videoFile.O9() && !e);
        String str3 = null;
        if (videoFile.l1() > 0) {
            DecimalFormat decimalFormat = uqm0.a;
            str = uqm0.l(videoFile.l1());
        } else {
            str = null;
        }
        vkText.setText(str);
        if (((this.n || videoFile.W7() <= 0) ? null : this) != null) {
            DecimalFormat decimalFormat2 = uqm0.a;
            str2 = uqm0.l(videoFile.W7());
        } else {
            str2 = null;
        }
        vkText2.setText(str2);
        if (videoFile.c1() > 0 && bwt0.K(vkText3)) {
            DecimalFormat decimalFormat3 = uqm0.a;
            str3 = uqm0.l(videoFile.c1());
        }
        vkText3.setText(str3);
        e(videoFile);
        d(videoFile);
        f(videoFile);
        baf0 baf0Var = new baf0(m33.a(videoFile.X() ? R.drawable.vk_icon_done_24 : R.drawable.vk_icon_clock_outline_24, getContext()), b(false));
        VkImageSimple vkImageSimple = this.c;
        vkImageSimple.setImageDrawable(baf0Var);
        vkImageSimple.setContentDescription(videoFile.X() ? getContext().getString(R.string.remove_from_watch_video_later_content_description) : getContext().getString(R.string.add_to_watch_video_later_content_description));
        baf0 baf0Var2 = new baf0(m33.a(R.drawable.vk_icon_add_24, getContext()), b(false));
        VkImageSimple vkImageSimple2 = this.b;
        vkImageSimple2.setImageDrawable(baf0Var2);
        bwt0.p0(vkImageSimple2, false);
        bwt0.p0(vkImageSimple, (videoFile.J8() && ((!fxc0.B().c(videoFile) && ((O = videoFile.O()) == null || O.f)) || z2) && !e) || !o25.a().b());
        bwt0.i0(view, new rc(e, this, videoFile));
        boolean z4 = (gpt0.D(videoFile) && !e) || z2;
        uys0 uys0Var = this.i;
        uys0Var.a(videoFile);
        uys0Var.setTint(b(e));
        if (z4) {
            uys0Var.setVisible(true);
        } else {
            uys0Var.setVisible(false);
        }
        this.k.setImageDrawable(new baf0(m33.a(R.drawable.vk_icon_list_play_outline_28, getContext()), b(false)));
        baf0 baf0Var3 = new baf0(m33.a(R.drawable.vk_icon_more_vertical_24, getContext()), b(false));
        VkImageSimple vkImageSimple3 = this.l;
        vkImageSimple3.setImageDrawable(baf0Var3);
        if (this.n && !videoFile.T1()) {
            z = true;
        }
        bwt0.p0(vkImageSimple3, z);
    }

    public final int b(boolean z) {
        if (z) {
            return getContext().getColor(R.color.video_dark_white);
        }
        if (this.n) {
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            return dhr0.f.a(R.attr.vk_ui_icon_primary, dhr0.t(context));
        }
        dhr0 dhr0Var2 = dhr0.a;
        Context context2 = getContext();
        dhr0Var2.getClass();
        return dhr0.f.a(R.attr.vk_ui_icon_medium, dhr0.t(context2));
    }

    public final boolean c(View view) {
        CharSequence text;
        CharSequence text2;
        if (!(view instanceof VkText) || (text2 = ((VkText) view).getText()) == null || text2.length() == 0) {
            return (!view.equals(this.d) || (text = this.e.getText()) == null || text.length() == 0) ? false : true;
        }
        return true;
    }

    public final void d(VideoFile videoFile) {
        int a;
        boolean e = fxc0.B().b0().e(videoFile);
        if (e) {
            a = getContext().getColor(R.color.video_dark_white);
        } else {
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            a = dhr0.f.a(R.attr.vk_ui_text_primary, dhr0.t(context));
        }
        baf0 baf0Var = new baf0(m33.a(R.drawable.vk_icon_comment_outline_24, getContext()), b(e));
        VkText vkText = this.h;
        vkText.setCompoundDrawablesWithIntrinsicBounds(baf0Var, (Drawable) null, (Drawable) null, (Drawable) null);
        vkText.setTextColor(a);
    }

    public final void e(VideoFile videoFile) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        boolean e = fxc0.B().b0().e(videoFile);
        VkText vkText = this.e;
        if (e) {
            stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_24, getContext()), getContext().getColor(R.color.video_dark_white)));
            vkText.setTextColor(getContext().getColor(R.color.video_dark_white));
        } else {
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_24, getContext()), getContext().getColor(R.color.vk_red_nice)));
            stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_24, getContext()), b(false)));
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            vkText.setTextColor(anj.b(R.color.video_post_counters_high_contrast, dhr0.t(context)));
        }
        this.f.setImageDrawable(stateListDrawable);
    }

    public final void f(VideoFile videoFile) {
        int a;
        boolean e = fxc0.B().b0().e(videoFile);
        if (e) {
            a = getContext().getColor(R.color.video_dark_white);
        } else {
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            a = dhr0.f.a(R.attr.vk_ui_text_primary, dhr0.t(context));
        }
        baf0 baf0Var = new baf0(m33.a(R.drawable.vk_icon_share_outline_24, getContext()), b(e));
        VkText vkText = this.g;
        vkText.setCompoundDrawablesWithIntrinsicBounds(baf0Var, (Drawable) null, (Drawable) null, (Drawable) null);
        vkText.setTextColor(a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object obj;
        Space space;
        Object obj2;
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iah0.a(48), 1073741824);
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            obj = this.h;
            space = this.j;
            obj2 = this.d;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (bwt0.K(childAt) && c(childAt)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                if (childAt.equals(obj2) || childAt.equals(obj)) {
                    float f = 24;
                    f4m.r(iah0.a(f), childAt);
                    i7 += iah0.a(f);
                }
                i7 += childAt.getMeasuredWidth();
            } else if (bwt0.K(childAt) && !c(childAt) && !childAt.equals(space)) {
                i6++;
            }
            i5++;
        }
        int min = i6 != 0 ? Math.min((size - i7) / i6, iah0.a(24)) : iah0.a(24);
        int childCount2 = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i8 < childCount2) {
            View childAt2 = getChildAt(i8);
            int a = epx.f(childAt2, obj2) ? iah0.a(4) + min : min;
            if (!bwt0.K(childAt2) || c(childAt2) || childAt2.equals(space)) {
                i3 = min;
                z = z2;
            } else {
                z = z2;
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(a, i4), makeMeasureSpec);
                i3 = min;
                if (j5g.P(e43.l(this.b, this.c, this.k, this.l), childAt2)) {
                    float f2 = 24;
                    f4m.s(iah0.a(f2), childAt2);
                    i9 += iah0.a(f2);
                }
                View[] viewArr = new View[2];
                viewArr[z ? 1 : 0] = obj2;
                viewArr[1] = obj;
                if (e43.l(viewArr).contains(childAt2)) {
                    float f3 = 24;
                    f4m.r(iah0.a(f3), childAt2);
                    i9 += iah0.a(f3);
                }
                i9 += a;
            }
            i8++;
            z2 = z;
            min = i3;
            i4 = 1073741824;
        }
        space.measure(View.MeasureSpec.makeMeasureSpec(((size - i7) - i9) - iah0.a(24), 1073741824), makeMeasureSpec);
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    public final void setButtonsOnClickListener(View.OnClickListener onClickListener) {
        bwt0.h0(onClickListener, this.g);
        bwt0.h0(onClickListener, this.h);
        bwt0.h0(onClickListener, this.b);
        bwt0.h0(onClickListener, this.c);
        bwt0.h0(onClickListener, this.k);
        bwt0.h0(onClickListener, this.l);
        this.i.setOnDownloadVideoClicked(new p5(29, onClickListener, this));
        this.m = onClickListener;
    }

    public final void setIsDiscoveryRedesignEnabled(boolean z) {
        this.n = z;
    }

    public final void setShowPlaylist(boolean z) {
    }
}
