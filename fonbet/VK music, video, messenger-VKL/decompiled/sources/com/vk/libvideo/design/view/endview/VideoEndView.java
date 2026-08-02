package com.vk.libvideo.design.view.endview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.design.view.play.PlayButton;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeEndVideoClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import defpackage.h0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.avt0;
import xsna.baf0;
import xsna.bjc;
import xsna.bwt0;
import xsna.cim0;
import xsna.ejs0;
import xsna.enj;
import xsna.epx;
import xsna.ho8;
import xsna.iah0;
import xsna.js00;
import xsna.m33;
import xsna.msy;
import xsna.n9;
import xsna.pg7;
import xsna.qoy;
import xsna.rl3;
import xsna.s7c0;
import xsna.uzp0;
import xsna.wd3;
import xsna.zrp;

/* compiled from: VideoEndView.kt */
/* loaded from: classes2.dex */
public final class VideoEndView extends LinearLayout {
    public static final /* synthetic */ int z = 0;
    public final Object b;
    public final PlayButton c;
    public final PlayButton d;
    public final PlayButton e;
    public final PlayButton f;
    public final PlayButton g;
    public final PlayButton h;
    public View.OnClickListener i;
    public a j;
    public final Drawable k;
    public final StateListDrawable l;
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final StateListDrawable r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;
    public final Drawable v;
    public boolean w;
    public boolean x;
    public IconSize y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoEndView.kt */
    public static final class IconSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconSize[] $VALUES;
        public static final IconSize DP_28;
        public static final IconSize DP_36;

        static {
            IconSize iconSize = new IconSize("DP_36", 0);
            DP_36 = iconSize;
            IconSize iconSize2 = new IconSize("DP_28", 1);
            DP_28 = iconSize2;
            IconSize[] iconSizeArr = {iconSize, iconSize2};
            $VALUES = iconSizeArr;
            $ENTRIES = new asp(iconSizeArr);
        }

        public IconSize() {
            throw null;
        }

        public static IconSize valueOf(String str) {
            return (IconSize) Enum.valueOf(IconSize.class, str);
        }

        public static IconSize[] values() {
            return (IconSize[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoEndView.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final Long f;
        public final Long g;
        public final String h;

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, Long l2, String str) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = l;
            this.g = l2;
            this.h = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            Long l = this.f;
            int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.g;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.h;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(liked=");
            sb.append(this.a);
            sb.append(", add=");
            sb.append(this.b);
            sb.append(", isLocal=");
            sb.append(this.c);
            sb.append(", canAdd=");
            sb.append(this.d);
            sb.append(", canLike=");
            sb.append(this.e);
            sb.append(", id=");
            sb.append(this.f);
            sb.append(", ownerId=");
            sb.append(this.g);
            sb.append(", trackCode=");
            return ho8.a(sb, this.h, ')');
        }
    }

    public VideoEndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new s7c0(14));
        this.b = a2;
        this.y = IconSize.DP_36;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.video_end_view, (ViewGroup) this, true);
        PlayButton playButton = (PlayButton) findViewById(R.id.video_end_replay);
        this.c = playButton;
        PlayButton playButton2 = (PlayButton) findViewById(R.id.video_end_like);
        this.d = playButton2;
        PlayButton playButton3 = (PlayButton) findViewById(R.id.video_end_add);
        this.e = playButton3;
        PlayButton playButton4 = (PlayButton) findViewById(R.id.video_end_share);
        this.f = playButton4;
        PlayButton playButton5 = (PlayButton) findViewById(R.id.video_end_skip_back);
        this.g = playButton5;
        PlayButton playButton6 = (PlayButton) findViewById(R.id.video_end_skip_forward);
        this.h = playButton6;
        this.k = enj.d(R.drawable.vk_icon_replay_36, R.color.vk_white, context);
        this.n = enj.d(R.drawable.vk_icon_done_36, R.color.vk_white, context);
        this.m = enj.d(R.drawable.vk_icon_add_36, R.color.vk_white, context);
        this.o = enj.d(R.drawable.vk_icon_skip_back_36, R.color.vk_white, context);
        this.p = enj.d(R.drawable.vk_icon_skip_forward_36, R.color.vk_white, context);
        this.q = enj.d(R.drawable.vk_icon_replay_outline_28, R.color.vk_white, context);
        this.t = enj.d(R.drawable.vk_icon_done_outline_28, R.color.vk_white, context);
        this.s = enj.d(R.drawable.vk_icon_add_outline_28, R.color.vk_white, context);
        this.u = enj.d(R.drawable.vk_icon_skip_back_28, R.color.vk_white, context);
        this.v = enj.d(R.drawable.vk_icon_skip_forward_28, R.color.vk_white, context);
        playButton.setTag("end_reply");
        playButton2.setTag("end_like");
        playButton3.setTag("end_add");
        playButton4.setTag("end_share");
        playButton5.setTag("end_previous");
        playButton6.setTag("end_next");
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_36, context), context.getColor(R.color.vk_red_nice)));
        stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_36, context), -1));
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        this.r = stateListDrawable2;
        stateListDrawable2.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_28, context), context.getColor(R.color.vk_red_nice)));
        stateListDrawable2.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_28, context), -1));
        playButton2.setImageDrawable(stateListDrawable);
        bwt0.i0(playButton2, new cim0(this, 9));
        if (((Boolean) a2.getValue()).booleanValue()) {
            a(playButton);
            a(playButton5);
            a(playButton6);
        }
    }

    public static void a(PlayButton playButton) {
        playButton.setBackgroundResource(R.drawable.video_blurred_circled_button_background);
        playButton.setOutlineProvider(new ejs0());
        playButton.setClipToOutline(true);
    }

    public final void b(MobileOfficialAppsVideoStat$TypeEndVideoClick.EventType eventType) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
        a aVar = this.j;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, aVar != null ? aVar.f : null, aVar != null ? aVar.g : null, null, aVar != null ? aVar.h : null, null, 40, null), new MobileOfficialAppsVideoStat$TypeEndVideoClick(eventType), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(a aVar, boolean z2) {
        this.j = aVar;
        boolean z3 = aVar.a;
        PlayButton playButton = this.d;
        playButton.setSelected(z3);
        boolean z4 = aVar.b;
        Drawable drawable = (z4 && this.y == IconSize.DP_36) ? this.n : z4 ? this.t : (z4 || this.y != IconSize.DP_36) ? this.s : this.m;
        drawable.setAlpha(z4 ? 173 : 255);
        PlayButton playButton2 = this.e;
        playButton2.setImageDrawable(drawable);
        IconSize iconSize = this.y;
        IconSize iconSize2 = IconSize.DP_28;
        PlayButton playButton3 = this.c;
        PlayButton playButton4 = this.h;
        PlayButton playButton5 = this.g;
        if (iconSize == iconSize2) {
            playButton.setImageDrawable(this.r);
            playButton3.setImageDrawable(this.q);
            playButton5.setImageDrawable(this.u);
            playButton4.setImageDrawable(this.v);
        } else {
            playButton.setImageDrawable(this.l);
            playButton3.setImageDrawable(this.k);
            playButton5.setImageDrawable(this.o);
            playButton4.setImageDrawable(this.p);
        }
        int a2 = this.y == IconSize.DP_36 ? iah0.a(72) : iah0.a(48);
        playButton.getLayoutParams().width = a2;
        playButton.getLayoutParams().height = a2;
        playButton2.getLayoutParams().width = a2;
        playButton2.getLayoutParams().height = a2;
        PlayButton playButton6 = this.f;
        playButton6.getLayoutParams().width = a2;
        playButton6.getLayoutParams().height = a2;
        if (((Boolean) this.b.getValue()).booleanValue()) {
            int a3 = iah0.a(64);
            int a4 = iah0.a(42);
            playButton3.getLayoutParams().width = a3;
            playButton3.getLayoutParams().height = a3;
            playButton4.getLayoutParams().width = a4;
            playButton4.getLayoutParams().height = a4;
            playButton5.getLayoutParams().width = a4;
            playButton5.getLayoutParams().height = a4;
        } else {
            playButton3.getLayoutParams().width = a2;
            playButton3.getLayoutParams().height = a2;
            playButton5.getLayoutParams().width = a2;
            playButton5.getLayoutParams().height = a2;
            playButton4.getLayoutParams().width = a2;
            playButton4.getLayoutParams().height = a2;
        }
        boolean z5 = aVar.c;
        if (z2) {
            bwt0.p0(playButton, false);
            bwt0.p0(playButton2, false);
            playButton5.setVisibility((z5 || !this.x) ? 4 : 0);
            playButton4.setVisibility((z5 || !this.w) ? 4 : 0);
        } else {
            bwt0.p0(playButton, !z5 && aVar.e);
            bwt0.p0(playButton2, !z5 && aVar.d);
            bwt0.p0(playButton5, false);
            bwt0.p0(playButton4, false);
        }
        requestLayout();
    }

    public final IconSize getIconsSize() {
        return this.y;
    }

    public final void setBlurSnapshots(avt0.a... aVarArr) {
        List u0 = rl3.u0(aVarArr);
        this.c.setDrawer(new pg7(this, u0));
        this.g.setDrawer(new pg7(this, u0));
        this.h.setDrawer(new pg7(this, u0));
    }

    public final void setButtonsOnClickListener(View.OnClickListener onClickListener) {
        bwt0.i0(this.c, new n9(29, this, onClickListener));
        bwt0.i0(this.e, new js00(12, this, onClickListener));
        bwt0.h0(onClickListener, this.f);
        bwt0.i0(this.g, new h0(29, this, onClickListener));
        bwt0.i0(this.h, new wd3(29, this, onClickListener));
        this.i = onClickListener;
    }

    public final void setIconsSize(IconSize iconSize) {
        if (iconSize == this.y) {
            return;
        }
        this.y = iconSize;
        a aVar = this.j;
        if (aVar != null) {
            c(aVar, false);
        }
    }
}
