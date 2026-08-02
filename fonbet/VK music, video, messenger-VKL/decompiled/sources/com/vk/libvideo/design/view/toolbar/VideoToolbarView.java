package com.vk.libvideo.design.view.toolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.apps.BuildInfo;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.VideoChevronMode;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.views.AutoPlaySwitchView;
import xsna.azn;
import xsna.baf0;
import xsna.bpn0;
import xsna.c5g;
import xsna.cem0;
import xsna.d3m;
import xsna.d8s0;
import xsna.dbs0;
import xsna.dss0;
import xsna.e3m;
import xsna.e43;
import xsna.e6s0;
import xsna.ebs0;
import xsna.enj;
import xsna.epx;
import xsna.etn;
import xsna.f4m;
import xsna.fo50;
import xsna.fxc0;
import xsna.gpt0;
import xsna.gsi0;
import xsna.hri0;
import xsna.i0q0;
import xsna.iah0;
import xsna.j5g;
import xsna.jjc;
import xsna.jkc;
import xsna.k5o;
import xsna.kgt0;
import xsna.kst0;
import xsna.kyc;
import xsna.l4s0;
import xsna.l5o;
import xsna.m33;
import xsna.msy;
import xsna.n14;
import xsna.nkt0;
import xsna.nx3;
import xsna.o25;
import xsna.pro0;
import xsna.ptl0;
import xsna.pvo0;
import xsna.q01;
import xsna.qkt0;
import xsna.qws0;
import xsna.r0t0;
import xsna.rcg0;
import xsna.rqs0;
import xsna.s490;
import xsna.s6s0;
import xsna.sgt0;
import xsna.t6t0;
import xsna.ubt0;
import xsna.uit0;
import xsna.uko;
import xsna.w6s0;
import xsna.wh4;
import xsna.yzr0;
import xsna.zyn;

/* compiled from: VideoToolbarView.kt */
/* loaded from: classes2.dex */
public final class VideoToolbarView extends RelativeLayout {
    public static final /* synthetic */ int M = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public VideoFile E;
    public final boolean F;
    public final etn G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public boolean L;
    public final VKAvatarView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final ImageView l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final ImageView r;
    public final View s;
    public ebs0 t;
    public a u;
    public final AutoPlaySwitchView v;
    public final TextView w;
    public boolean x;
    public boolean y;
    public final kyc z;

    /* compiled from: VideoToolbarView.kt */
    public static final class a {
        public final boolean a;
        public final VideoChevronMode b;
        public final rcg0 c;
        public final boolean d;

        public a() {
            this(null, 15);
        }

        public static a a(a aVar, VideoChevronMode videoChevronMode, rcg0 rcg0Var, int i) {
            boolean z = (i & 1) != 0 ? aVar.a : false;
            if ((i & 2) != 0) {
                videoChevronMode = aVar.b;
            }
            boolean z2 = aVar.d;
            aVar.getClass();
            return new a(z, videoChevronMode, rcg0Var, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
            rcg0 rcg0Var = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (rcg0Var == null ? 0 : rcg0Var.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoToolbarViewSettings(hideShareButton=");
            sb.append(this.a);
            sb.append(", videoChevronMode=");
            sb.append(this.b);
            sb.append(", restrictedUserActions=");
            sb.append(this.c);
            sb.append(", forceOwnerNameInTitle=");
            return q0.a(sb, this.d, ')');
        }

        public a(boolean z, VideoChevronMode videoChevronMode, rcg0 rcg0Var, boolean z2) {
            this.a = z;
            this.b = videoChevronMode;
            this.c = rcg0Var;
            this.d = z2;
        }

        public /* synthetic */ a(VideoChevronMode videoChevronMode, int i) {
            this(false, (i & 2) != 0 ? VideoChevronMode.Pip : videoChevronMode, null, (i & 8) == 0);
        }
    }

    /* compiled from: VideoToolbarView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoChevronMode.values().length];
            try {
                iArr[VideoChevronMode.Pip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoChevronMode.Minimize.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.u = new a(null, 15);
        Features.Type type = Features.Type.FEATURE_VIDEO_DISCOVERY_PUBDATE;
        type.getClass();
        this.F = com.vk.toggle.b.A.a(type);
        this.G = gsi0.b();
        int i = 3;
        cem0 cem0Var = new cem0(i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H = msy.a(lazyThreadSafetyMode, cem0Var);
        this.I = msy.a(lazyThreadSafetyMode, new rqs0(this, i));
        this.J = msy.a(lazyThreadSafetyMode, new sgt0(this, 1));
        this.K = msy.a(lazyThreadSafetyMode, new hri0(this, 16));
        LayoutInflater.from(context).inflate(R.layout.video_player_toolbar, (ViewGroup) this, true);
        ((ViewStub) findViewById(R.id.user_photo_stub)).inflate();
        setBackgroundColor(0);
        setClipToPadding(false);
        setClipChildren(false);
        VKAvatarView vKAvatarView = (VKAvatarView) findViewById(R.id.user_photo);
        this.b = vKAvatarView;
        this.g = findViewById(R.id.profile);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f = textView;
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.d = textView2;
        this.e = (TextView) findViewById(R.id.subtitle_suffix);
        this.h = findViewById(R.id.verified_top);
        this.i = findViewById(R.id.verified_bottom);
        ImageView imageView = (ImageView) findViewById(R.id.subscribe);
        this.c = imageView;
        View findViewById = findViewById(R.id.cancel);
        this.j = findViewById;
        ImageView imageView2 = (ImageView) findViewById(R.id.share);
        this.p = imageView2;
        View findViewById2 = findViewById(R.id.more);
        this.k = findViewById2;
        ImageView imageView3 = (ImageView) findViewById(R.id.like);
        this.n = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.comment);
        this.o = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.add);
        this.l = imageView5;
        ImageView imageView6 = (ImageView) findViewById(R.id.watch_later);
        this.m = imageView6;
        ImageView imageView7 = (ImageView) findViewById(R.id.back);
        this.q = imageView7;
        this.s = findViewById(R.id.more_extra_space);
        AutoPlaySwitchView autoPlaySwitchView = (AutoPlaySwitchView) findViewById(R.id.auto_play_switch);
        this.v = autoPlaySwitchView;
        this.w = (TextView) findViewById(R.id.autoplay_mode_info);
        ImageView imageView8 = (ImageView) findViewById(R.id.playlist);
        this.r = imageView8;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_24, context), context.getColor(R.color.vk_red_nice)));
        stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_24, context), context.getColor(R.color.vk_white)));
        imageView3.setImageDrawable(stateListDrawable);
        if (autoPlaySwitchView != null) {
            e eVar = e.a;
            autoPlaySwitchView.setChecked(e.a());
        }
        imageView.setOnClickListener(e(uit0.a));
        t6t0 t6t0Var = t6t0.a;
        vKAvatarView.setOnClickListener(e(t6t0Var));
        imageView2.setOnClickListener(e(kgt0.a));
        imageView3.setOnClickListener(e(dss0.a));
        imageView4.setOnClickListener(e(r0t0.a));
        imageView5.setOnClickListener(e(yzr0.a));
        jjc.g(textView, new ptl0(this, 14));
        textView2.setOnClickListener(e(t6t0Var));
        findViewById.setOnClickListener(e(d8s0.a));
        findViewById2.setOnClickListener(e(new qws0(15, null, false)));
        imageView7.setOnClickListener(e(l4s0.a));
        imageView6.setOnClickListener(e(kst0.a));
        if (autoPlaySwitchView != null) {
            jjc.g(autoPlaySwitchView, new ubt0(this, 1));
        }
        if (autoPlaySwitchView != null) {
            autoPlaySwitchView.setOnTouchListener(new qkt0(this, 0));
        }
        this.z = new kyc(this, 10);
        imageView8.setOnClickListener(new n14(this, 8));
    }

    public static l5o a(VideoToolbarView videoToolbarView) {
        return videoToolbarView.getDonutVideoComponent().wb();
    }

    public static zyn b(VideoToolbarView videoToolbarView) {
        return videoToolbarView.getDonutVideoComponent().s3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zyn getDonutChipSpanFactory() {
        return (zyn) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final DonutVideoComponent getDonutVideoComponent() {
        return (DonutVideoComponent) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final l5o getDonutVideoUiModelProvider() {
        return (l5o) this.J.getValue();
    }

    private final void setAutoplaySwitchInactive(boolean z) {
        if (this.L == z) {
            return;
        }
        this.L = z;
        AutoPlaySwitchView autoPlaySwitchView = this.v;
        if (z) {
            if (autoPlaySwitchView != null) {
                autoPlaySwitchView.setAlpha(0.4f);
            }
        } else if (autoPlaySwitchView != null) {
            autoPlaySwitchView.setAlpha(1.0f);
        }
    }

    private final void setupToolbarForDownloadableVideo(VideoFile videoFile) {
        boolean j = videoFile.F4().j();
        VKAvatarView vKAvatarView = this.b;
        View view = this.k;
        View view2 = this.j;
        ImageView imageView = this.q;
        View view3 = this.s;
        if (j) {
            view.setVisibility(0);
            view3.setVisibility(0);
            imageView.setVisibility(0);
            vKAvatarView.setVisibility(8);
            this.p.setVisibility(8);
            this.g.setVisibility(4);
            this.n.setVisibility(8);
            this.l.setVisibility(8);
            this.c.setVisibility(8);
            view2.setVisibility(8);
            return;
        }
        if (!g() || videoFile.isExternal()) {
            imageView.setVisibility(8);
            view3.setVisibility(8);
            view2.setVisibility(0);
            view3.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        view2.setVisibility(8);
        view.setVisibility(0);
        view3.setVisibility(0);
        vKAvatarView.setVisibility(8);
    }

    public final void c(boolean z) {
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(textView.getContext().getString(z ? R.string.autoplay_enabled : R.string.autoplay_disabled));
            d3m.c(textView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new nx3(this, 20), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0598  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AdsDataProvider adsDataProvider, VideoFile videoFile, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        String str;
        boolean f;
        CharSequence a2;
        azn a3;
        String i;
        String g0;
        Image image;
        ImageSize Cb;
        CharSequence d;
        boolean z6;
        boolean z7;
        Context context;
        int i2;
        boolean z8;
        boolean z9;
        AutoPlaySwitchView autoPlaySwitchView;
        VerifyInfo Y;
        boolean Cb2;
        int i3;
        boolean z10;
        boolean z11;
        int i4;
        View view;
        boolean z12;
        VideoFile videoFile2;
        boolean a4;
        baf0 f2;
        Owner s;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        this.D = b.C1208b.a().e(videoFile, null).t0();
        this.C = z2;
        this.E = videoFile;
        boolean s2 = BuildInfo.s();
        boolean t = BuildInfo.t();
        TextView textView = this.e;
        f4m.j(textView);
        etn etnVar = this.G;
        VKAvatarView vKAvatarView = this.b;
        TextView textView2 = this.f;
        View view2 = this.k;
        TextView textView3 = this.d;
        if (adsDataProvider != null) {
            Owner s3 = adsDataProvider.s();
            textView2.setText(s3 != null ? s3.c : null);
            textView3.setText(TextUtils.isEmpty(adsDataProvider.getDescription()) ? getResources().getString(R.string.sponsored_post) : adsDataProvider.getDescription());
            view2.setVisibility(8);
            Owner s4 = adsDataProvider.s();
            String f3 = s4 != null ? s4.f(vKAvatarView.getWidth()) : null;
            Owner s5 = adsDataProvider.s();
            VKAvatarView.Z0(this.b, f3, null, (s5 == null || !s5.i(1024)) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON, null, 10);
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            z4 = s2;
            z5 = t;
        } else {
            boolean z13 = videoFile instanceof MusicVideoFile;
            String str2 = "";
            boolean z14 = this.F;
            if (z13) {
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                List<Artist> list = musicVideoFile.C1;
                List<Artist> list2 = musicVideoFile.B1;
                if (fxc0.B().J().M0()) {
                    z4 = s2;
                    z5 = t;
                    String str3 = musicVideoFile.p0;
                    textView2.setText((str3 == null || str3.length() == 0) ? s490.d(getContext(), s490.i(list2), s490.c(list), R.attr.vk_ui_text_secondary) : musicVideoFile.p0);
                } else {
                    if (z2) {
                        z4 = s2;
                        z5 = t;
                        d = s490.d(getContext(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary);
                    } else {
                        z4 = s2;
                        z5 = t;
                        d = s490.d(getContext(), s490.i(list2), s490.c(list), R.attr.vk_ui_text_secondary);
                    }
                    textView2.setText(d);
                    Drawable e = (z2 && musicVideoFile.A1) ? enj.e(R.drawable.ic_explicit_16, R.attr.vk_ui_icon_tertiary, getContext()) : null;
                    uko.a aVar = uko.a;
                    if (e != null) {
                        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, e, (Drawable) null);
                    } else {
                        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    textView2.setCompoundDrawablePadding(iah0.a(4.0f));
                }
                if (fxc0.B().J().M0()) {
                    if (z14) {
                        gpt0 gpt0Var = gpt0.a;
                        i = gpt0.k(getContext(), musicVideoFile);
                    } else {
                        i = pvo0.i(false, musicVideoFile.q, false, false);
                    }
                    List<Genre> list3 = musicVideoFile.E1;
                    if (list3 != null) {
                        List<Genre> list4 = list3;
                        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                        Iterator<T> it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Genre) it.next()).c);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            String str4 = (String) next;
                            if (str4 != null && str4.length() != 0) {
                                arrayList2.add(next);
                            }
                        }
                        String g02 = j5g.g0(arrayList2, ", ", null, null, 0, null, 62);
                        if (g02 != null) {
                            str2 = g02;
                        }
                    }
                    List l = e43.l(i, str2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : l) {
                        if (((CharSequence) obj).length() > 0) {
                            arrayList3.add(obj);
                        }
                    }
                    g0 = j5g.g0(arrayList3, " · ", null, null, 0, null, 62);
                } else {
                    g0 = z2 ? s490.d(getContext(), s490.i(list2), s490.c(list), R.attr.vk_ui_text_secondary).toString() : b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1);
                }
                textView3.setText(g0);
                fo50.r(vKAvatarView, "artist_not_transparent");
                int width = vKAvatarView.getWidth();
                Artist artist = list2 != null ? (Artist) j5g.a0(list2) : null;
                String str5 = (artist == null || (image = artist.f) == null || (Cb = image.Cb(width, true, false)) == null) ? null : Cb.d.d;
                if (str5 != null) {
                    Owner owner = musicVideoFile.v0;
                    VKAvatarView.Z0(this.b, str5, null, (owner == null || !owner.i(1024)) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON, null, 10);
                }
                view2.setVisibility(!musicVideoFile.Q ? 0 : 8);
            } else {
                z4 = s2;
                z5 = t;
                boolean s6 = BuildInfo.s();
                String string = TextUtils.isEmpty(videoFile.getTitle()) ? getResources().getString(R.string.album_unnamed) : videoFile.getTitle();
                if (!(etnVar.f(z2, Boolean.valueOf(videoFile.T1())) ? true : (!this.u.d && (z2 || TextUtils.isEmpty(videoFile.P()))) ? s6 : false)) {
                    string = videoFile.P();
                }
                textView2.setText(string);
                if (etnVar.f(z2, Boolean.valueOf(videoFile.T1())) || (!this.u.d && z2 && !TextUtils.isEmpty(videoFile.P()) && (s6 || etnVar.f(true, Boolean.valueOf(videoFile.T1()))))) {
                    str2 = videoFile.P();
                } else if (videoFile.b0() != 0) {
                    if (z14) {
                        gpt0 gpt0Var2 = gpt0.a;
                        str2 = gpt0.k(getContext(), videoFile);
                    } else {
                        str2 = pvo0.i(false, videoFile.b0(), false, false);
                    }
                }
                textView3.setText(str2);
                String M0 = videoFile.M0();
                if (M0 == null) {
                    Owner s7 = videoFile.s();
                    if (s7 != null) {
                        M0 = s7.d;
                    } else {
                        str = null;
                        Owner s8 = videoFile.s();
                        VKAvatarView.Z0(this.b, str, null, (s8 == null && s8.i(1024)) ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 10);
                        f = etnVar.f(z2, Boolean.valueOf(videoFile.T1()));
                        if (f) {
                            f4m.q(0, textView2);
                            f4m.t(0, textView3);
                            textView3.setTextColor(getContext().getColor(R.color.vk_white));
                        } else {
                            int a5 = iah0.a(2);
                            f4m.q(a5, textView2);
                            f4m.t(a5, textView3);
                            textView3.setTextColor(getContext().getColor(R.color.vk_white_alpha60));
                        }
                        Drawable c = (!f ? this : null) == null ? enj.c(R.drawable.vk_icon_chevron_outline_12, e3m.f(R.attr.vk_ui_icon_secondary, getContext()), textView2.getContext()) : null;
                        if (f) {
                            textView2.setCompoundDrawablePadding(iah0.a(2));
                        }
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, c, (Drawable) null);
                        view2.setVisibility(fxc0.B().b0().e(videoFile) ? 0 : 8);
                        DonutVideoUiModel a6 = getDonutVideoUiModelProvider().a(nkt0.a(videoFile), DonutVideoCardSource.PLAYER);
                        a2 = (a6 != null || (a3 = k5o.a(a6)) == null) ? null : getDonutChipSpanFactory().a(a3, getContext(), null);
                        if (a2 != null) {
                            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) " · ").append(a2);
                            textView.setVisibility(0);
                            textView.setText(append);
                        }
                    }
                }
                str = M0;
                Owner s82 = videoFile.s();
                VKAvatarView.Z0(this.b, str, null, (s82 == null && s82.i(1024)) ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 10);
                f = etnVar.f(z2, Boolean.valueOf(videoFile.T1()));
                if (f) {
                }
                if ((!f ? this : null) == null) {
                }
                if (f) {
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, c, (Drawable) null);
                view2.setVisibility(fxc0.B().b0().e(videoFile) ? 0 : 8);
                DonutVideoUiModel a62 = getDonutVideoUiModelProvider().a(nkt0.a(videoFile), DonutVideoCardSource.PLAYER);
                if (a62 != null) {
                }
                if (a2 != null) {
                }
            }
        }
        this.A = fxc0.B().J().a2() && videoFile.T1();
        boolean a7 = o25.a().a(videoFile.I0());
        boolean z15 = videoFile.j0() || a7;
        int i5 = videoFile.U() ? R.drawable.vk_icon_user_added_24 : R.drawable.vk_icon_user_add_24;
        int i6 = R.drawable.vk_icon_done_24;
        int i7 = z15 ? R.drawable.vk_icon_done_24 : R.drawable.vk_icon_add_outline_24;
        int i8 = videoFile.X() ? R.drawable.vk_icon_done_24 : R.drawable.vk_icon_clock_outline_24;
        baf0 f4 = f(i7, false, z15);
        ImageView imageView = this.l;
        imageView.setImageDrawable(f4);
        baf0 f5 = f(i5, false, false);
        ImageView imageView2 = this.c;
        imageView2.setImageDrawable(f5);
        baf0 f6 = f(i8, false, false);
        ImageView imageView3 = this.m;
        imageView3.setImageDrawable(f6);
        if (g()) {
            ImageView imageView4 = this.q;
            imageView4.setImageResource(R.drawable.vk_icon_chevron_down_24);
            f4m.s(0, imageView4);
        }
        boolean z16 = this.u.a;
        ImageView imageView5 = this.p;
        if (!z16) {
            imageView5.setImageDrawable(f(R.drawable.vk_icon_share_outline_24, false, false));
        }
        imageView.setVisibility(8);
        imageView5.setVisibility((adsDataProvider == null && z2 && videoFile.Fa() && !this.u.a) ? 0 : 8);
        vKAvatarView.setVisibility((z2 || !z5) ? 0 : 4);
        this.g.setVisibility((z2 || !z5) ? 0 : 4);
        CharSequence text = textView3.getText();
        textView3.setVisibility(!(text == null || text.length() == 0) ? 0 : 8);
        this.r.setVisibility(z3 && z2 ? 0 : 8);
        rcg0 rcg0Var = this.u.c;
        textView2.setClickable(true);
        textView3.setClickable(true);
        vKAvatarView.setClickable(true);
        boolean e2 = fxc0.B().b0().e(videoFile);
        if (!fxc0.B().c(videoFile)) {
            VideoRestriction O = videoFile.O();
            if (!((O == null || O.f) ? false : true)) {
                z6 = true;
                if (videoFile.J8() || !z6 || e2) {
                    z7 = false;
                } else {
                    rcg0 rcg0Var2 = this.u.c;
                    z7 = true;
                }
                imageView3.setVisibility(!(adsDataProvider != null && z2 && z7) ? 0 : 8);
                if (videoFile.X()) {
                    context = getContext();
                    i2 = R.string.add_to_watch_video_later_content_description;
                } else {
                    context = getContext();
                    i2 = R.string.remove_from_watch_video_later_content_description;
                }
                imageView3.setContentDescription(context.getString(i2));
                if (this.B) {
                    rcg0 rcg0Var3 = this.u.c;
                    if (!this.A) {
                        z8 = true;
                        this.o.setVisibility(z8 ? 0 : 8);
                        baf0 f7 = f(videoFile.O9() ? R.drawable.vk_icon_like_24 : R.drawable.vk_icon_like_outline_24, videoFile.O9(), false);
                        ImageView imageView6 = this.n;
                        imageView6.setImageDrawable(f7);
                        if (adsDataProvider == null && z2 && videoFile.i0()) {
                            rcg0 rcg0Var4 = this.u.c;
                            if (!this.A) {
                                z9 = true;
                                imageView6.setVisibility(!z9 ? 0 : 8);
                                imageView6.setOnClickListener(new jkc(7, this, videoFile));
                                autoPlaySwitchView = this.v;
                                if (autoPlaySwitchView != null) {
                                    e eVar = e.a;
                                    autoPlaySwitchView.setChecked(e.a());
                                }
                                if (adsDataProvider != null || (s = adsDataProvider.s()) == null || (Y = s.f) == null) {
                                    Y = videoFile.Y();
                                }
                                Cb2 = Y.Cb();
                                View view3 = this.i;
                                View view4 = this.h;
                                if (Cb2) {
                                    i3 = 8;
                                    view4.setVisibility(8);
                                    view3.setVisibility(8);
                                } else {
                                    if (Y.c) {
                                        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                                        f2 = VerifyInfoHelper.f(getContext(), VerifyInfoHelper.ColorTheme.normal, Y);
                                    } else {
                                        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                                        f2 = VerifyInfoHelper.f(getContext(), VerifyInfoHelper.ColorTheme.white, Y);
                                    }
                                    view4.setBackground(f2);
                                    view3.setBackground(f2);
                                    if (etnVar.f(z2, Boolean.valueOf(videoFile.T1()))) {
                                        view4.setVisibility(8);
                                        view3.setVisibility(adsDataProvider == null && z2 ? 0 : 8);
                                    } else if (fxc0.B().J().K1()) {
                                        view4.setVisibility(adsDataProvider == null ? 0 : 8);
                                        i3 = 8;
                                        view3.setVisibility(8);
                                    } else {
                                        view4.setVisibility((adsDataProvider == null || z2) ? 8 : 0);
                                        view3.setVisibility((adsDataProvider == null && z2) ? 0 : 8);
                                    }
                                    i3 = 8;
                                }
                                z10 = (adsDataProvider == null || z2 || !videoFile.h1() || a7 || !z || TextUtils.isEmpty(videoFile.P()) || videoFile.L9()) ? false : true;
                                if (!videoFile.U()) {
                                    i6 = R.drawable.vk_icon_user_add_24;
                                }
                                imageView2.setImageResource(i6);
                                imageView2.setVisibility((z4 || !z10 || this.y) ? i3 : 0);
                                kyc kycVar = this.z;
                                pro0.d(kycVar);
                                if (z10 && videoFile.U()) {
                                    if (imageView2.getVisibility() != 0) {
                                        i0q0.d(5000L, kycVar);
                                    }
                                }
                                if (((Boolean) this.H.getValue()).booleanValue()) {
                                    z11 = true;
                                    i4 = i3;
                                    view = view2;
                                    z12 = false;
                                    int i9 = e6s0.f;
                                    videoFile2 = videoFile;
                                    a4 = e6s0.a.a(new s6s0(videoFile2, null, null, null, false, null, false, false, false, null, null, null, null, false, null, false, null, false, null, null, null, false, 536870910));
                                } else {
                                    float f8 = w6s0.d;
                                    view = view2;
                                    z11 = true;
                                    z12 = false;
                                    i4 = i3;
                                    a4 = w6s0.a.a(new s6s0(videoFile, null, null, null, false, null, false, false, false, null, null, null, null, false, null, false, null, false, null, null, null, false, 536870910));
                                    videoFile2 = videoFile;
                                }
                                if (((view.getVisibility() != 0 ? z11 : z12) && videoFile2.H6()) || !a4) {
                                    view.setVisibility(i4);
                                }
                                setupToolbarForDownloadableVideo(videoFile2);
                            }
                        }
                        z9 = false;
                        imageView6.setVisibility(!z9 ? 0 : 8);
                        imageView6.setOnClickListener(new jkc(7, this, videoFile));
                        autoPlaySwitchView = this.v;
                        if (autoPlaySwitchView != null) {
                        }
                        if (adsDataProvider != null) {
                        }
                        Y = videoFile.Y();
                        Cb2 = Y.Cb();
                        View view32 = this.i;
                        View view42 = this.h;
                        if (Cb2) {
                        }
                        if (adsDataProvider == null) {
                        }
                        if (!videoFile.U()) {
                        }
                        imageView2.setImageResource(i6);
                        imageView2.setVisibility((z4 || !z10 || this.y) ? i3 : 0);
                        kyc kycVar2 = this.z;
                        pro0.d(kycVar2);
                        if (z10) {
                            if (imageView2.getVisibility() != 0) {
                            }
                        }
                        if (((Boolean) this.H.getValue()).booleanValue()) {
                        }
                        if (view.getVisibility() != 0 ? z11 : z12) {
                            view.setVisibility(i4);
                            setupToolbarForDownloadableVideo(videoFile2);
                        }
                        view.setVisibility(i4);
                        setupToolbarForDownloadableVideo(videoFile2);
                    }
                }
                z8 = false;
                this.o.setVisibility(z8 ? 0 : 8);
                baf0 f72 = f(videoFile.O9() ? R.drawable.vk_icon_like_24 : R.drawable.vk_icon_like_outline_24, videoFile.O9(), false);
                ImageView imageView62 = this.n;
                imageView62.setImageDrawable(f72);
                if (adsDataProvider == null) {
                    rcg0 rcg0Var42 = this.u.c;
                    if (!this.A) {
                    }
                }
                z9 = false;
                imageView62.setVisibility(!z9 ? 0 : 8);
                imageView62.setOnClickListener(new jkc(7, this, videoFile));
                autoPlaySwitchView = this.v;
                if (autoPlaySwitchView != null) {
                }
                if (adsDataProvider != null) {
                }
                Y = videoFile.Y();
                Cb2 = Y.Cb();
                View view322 = this.i;
                View view422 = this.h;
                if (Cb2) {
                }
                if (adsDataProvider == null) {
                }
                if (!videoFile.U()) {
                }
                imageView2.setImageResource(i6);
                imageView2.setVisibility((z4 || !z10 || this.y) ? i3 : 0);
                kyc kycVar22 = this.z;
                pro0.d(kycVar22);
                if (z10) {
                }
                if (((Boolean) this.H.getValue()).booleanValue()) {
                }
                if (view.getVisibility() != 0 ? z11 : z12) {
                }
                view.setVisibility(i4);
                setupToolbarForDownloadableVideo(videoFile2);
            }
        }
        z6 = false;
        if (videoFile.J8()) {
        }
        z7 = false;
        imageView3.setVisibility(!(adsDataProvider != null && z2 && z7) ? 0 : 8);
        if (videoFile.X()) {
        }
        imageView3.setContentDescription(context.getString(i2));
        if (this.B) {
        }
        z8 = false;
        this.o.setVisibility(z8 ? 0 : 8);
        baf0 f722 = f(videoFile.O9() ? R.drawable.vk_icon_like_24 : R.drawable.vk_icon_like_outline_24, videoFile.O9(), false);
        ImageView imageView622 = this.n;
        imageView622.setImageDrawable(f722);
        if (adsDataProvider == null) {
        }
        z9 = false;
        imageView622.setVisibility(!z9 ? 0 : 8);
        imageView622.setOnClickListener(new jkc(7, this, videoFile));
        autoPlaySwitchView = this.v;
        if (autoPlaySwitchView != null) {
        }
        if (adsDataProvider != null) {
        }
        Y = videoFile.Y();
        Cb2 = Y.Cb();
        View view3222 = this.i;
        View view4222 = this.h;
        if (Cb2) {
        }
        if (adsDataProvider == null) {
        }
        if (!videoFile.U()) {
        }
        imageView2.setImageResource(i6);
        imageView2.setVisibility((z4 || !z10 || this.y) ? i3 : 0);
        kyc kycVar222 = this.z;
        pro0.d(kycVar222);
        if (z10) {
        }
        if (((Boolean) this.H.getValue()).booleanValue()) {
        }
        if (view.getVisibility() != 0 ? z11 : z12) {
        }
        view.setVisibility(i4);
        setupToolbarForDownloadableVideo(videoFile2);
    }

    public final q01 e(dbs0 dbs0Var) {
        wh4 wh4Var = new wh4(5, this, dbs0Var);
        bpn0 bpn0Var = jjc.a;
        return new q01(wh4Var, 2);
    }

    public final baf0 f(int i, boolean z, boolean z2) {
        Context context = getContext();
        baf0 baf0Var = new baf0(m33.a(i, context), context.getColor(z ? R.color.vk_red_nice : R.color.vk_white));
        baf0Var.setAlpha(z2 ? 173 : 255);
        return baf0Var;
    }

    public final boolean g() {
        boolean g;
        Features.Type type = Features.Type.FEATURE_VIDEO_SHORT_ACTIONS;
        type.getClass();
        if (!com.vk.toggle.b.A.a(type) && (!fxc0.B().J().J1() || this.D)) {
            return false;
        }
        int i = b.$EnumSwitchMapping$0[this.u.b.ordinal()];
        if (i == 1) {
            VideoPipStateHolder.a.getClass();
            g = VideoPipStateHolder.g();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g = true;
        }
        return g;
    }

    public final a getToolbarSettings() {
        return this.u;
    }

    public final void h(boolean z) {
        this.x = z;
        AutoPlaySwitchView autoPlaySwitchView = this.v;
        if (autoPlaySwitchView != null) {
            autoPlaySwitchView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        boolean z2;
        this.B = z;
        if (z) {
            rcg0 rcg0Var = this.u.c;
            if (!this.A) {
                z2 = true;
                this.o.setVisibility(z2 ? 0 : 8);
            }
        }
        z2 = false;
        this.o.setVisibility(z2 ? 0 : 8);
    }

    public final void setAutoPlayEnabled(boolean z) {
        AutoPlaySwitchView autoPlaySwitchView;
        if (this.x && (autoPlaySwitchView = this.v) != null) {
            autoPlaySwitchView.setChecked(z);
        }
    }

    public final void setAutoplayInactive(boolean z) {
        setAutoplaySwitchInactive(z);
    }

    public final void setToolbarSettings(a aVar) {
        this.u = aVar;
    }

    public final void setVideoActionsCallback(ebs0 ebs0Var) {
        this.t = ebs0Var;
    }
}
