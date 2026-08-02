package com.vk.video.profile.presentation.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.b8e0;
import xsna.blk;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c4i;
import xsna.dbg0;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.ezn;
import xsna.f4m;
import xsna.f8t0;
import xsna.fnj;
import xsna.fxc0;
import xsna.g13;
import xsna.gib0;
import xsna.gzs;
import xsna.i9t0;
import xsna.iah0;
import xsna.isb0;
import xsna.ito0;
import xsna.ixj0;
import xsna.izs;
import xsna.jai;
import xsna.jjc;
import xsna.k4;
import xsna.ksg0;
import xsna.kv7;
import xsna.l9t0;
import xsna.m33;
import xsna.mdm0;
import xsna.msy;
import xsna.ndu0;
import xsna.nr2;
import xsna.pre;
import xsna.pyn;
import xsna.qcy;
import xsna.qlw;
import xsna.qup0;
import xsna.s3q0;
import xsna.tdj0;
import xsna.yjg0;
import xsna.yn7;

/* compiled from: VideoNewProfileHeaderViewV2.kt */
/* loaded from: classes6.dex */
public final class VideoNewProfileHeaderViewV2 extends FrameLayout {
    public static final /* synthetic */ int y = 0;
    public final View b;
    public final ShimmerFrameLayout c;
    public final AppCompatTextView d;
    public final Group e;
    public final View f;
    public final ComposeView g;
    public gzs<s3q0> h;
    public final AppCompatTextView i;
    public final VideoProfileSubtitleView j;
    public final VkButton k;
    public final VkButton l;
    public final View m;
    public final VkButton n;
    public final VkButton o;
    public final VkButton p;
    public final VideoProfileCreatorOnboardingItemsView q;
    public final VideoProfileCreatorOnboardingVideoCounterView r;
    public final VkAvatar s;
    public f8t0.c.j t;
    public boolean u;
    public izs<? super ezn, s3q0> v;
    public final l9t0 w;
    public final Object x;

    /* compiled from: VideoNewProfileHeaderViewV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoNewProfileHeaderViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        HashSet hashSet = iah0.a;
        l9t0 l9t0Var = fnj.d(context) ? nr2.d : blk.d;
        this.w = l9t0Var;
        this.x = msy.a(LazyThreadSafetyMode.NONE, new g13(29));
        setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, context)));
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(l9t0Var.g(), (ViewGroup) this, true);
        from.inflate(l9t0Var.f(), (ViewGroup) this, true);
        this.b = findViewById(R.id.video_profile_header_new_v2_default_layout);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.video_profile_header_new_v2_skeleton_layout);
        this.c = shimmerFrameLayout;
        this.d = (AppCompatTextView) findViewById(R.id.video_profile_header_new_v2_title);
        this.e = (Group) findViewById(R.id.video_profile_header_new_v2_verified_group);
        View findViewById = findViewById(R.id.video_profile_header_new_v2_change_owner_icon);
        this.f = findViewById;
        this.g = (ComposeView) findViewById(R.id.title_with_badges);
        this.i = (AppCompatTextView) findViewById(R.id.video_profile_header_new_v2_intertitle);
        this.j = (VideoProfileSubtitleView) findViewById(R.id.video_profile_header_new_v2_subtitle);
        this.k = (VkButton) findViewById(R.id.video_profile_header_new_v2_subscribe_button);
        this.l = (VkButton) findViewById(R.id.video_profile_header_new_v2_donut_button);
        this.m = findViewById(R.id.video_profile_header_new_v2_community_manage_container);
        this.n = (VkButton) findViewById(R.id.video_profile_header_new_v2_upload_video);
        this.o = (VkButton) findViewById(R.id.video_profile_header_new_v2_open_author_cabinet);
        this.p = (VkButton) findViewById(R.id.video_profile_header_new_v2_edit_button);
        this.s = (VkAvatar) findViewById(R.id.video_profile_header_new_v2_image_container);
        this.q = (VideoProfileCreatorOnboardingItemsView) findViewById(R.id.video_profile_header_new_v2_creator_onboarding_items);
        this.r = (VideoProfileCreatorOnboardingVideoCounterView) findViewById(R.id.video_profile_header_new_v2_creator_onboarding_counter);
        findViewById.setContentDescription(context.getString(R.string.video_profile_talkback_change_account));
        shimmerFrameLayout.b(tdj0.a(shimmerFrameLayout.getContext()));
    }

    public static /* synthetic */ SpannableStringBuilder d(VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2) {
        return videoNewProfileHeaderViewV2.c(" " + videoNewProfileHeaderViewV2.getContext().getString(R.string.vk_video_profile_subtitle_expand));
    }

    private final void setupSubscribeButtonForVisible(f8t0.c.i.b bVar) {
        VkButton vkButton = this.k;
        if (vkButton != null) {
            vkButton.setVisibility(0);
        }
        if (vkButton != null) {
            vkButton.setClickable(bVar.c);
        }
        boolean z = bVar.b;
        VideoNotificationsStatus videoNotificationsStatus = bVar.a;
        if (vkButton != null) {
            vkButton.setBackgroundTint(z ? R.attr.vk_ui_background_secondary : R.attr.vk_ui_background_accent_themed);
        }
        if (vkButton != null) {
            vkButton.setTextTint(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_contrast_themed);
        }
        if (vkButton != null) {
            vkButton.setText(z ? R.string.profile_btn_subscribed : R.string.profile_subscribe);
        }
        Drawable drawable = null;
        if (!z) {
            if (vkButton != null) {
                vkButton.a5(true, null);
            }
            if (vkButton != null) {
                vkButton.d5(null);
                return;
            }
            return;
        }
        int i = videoNotificationsStatus == null ? -1 : a.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                Context context = getContext();
                e3m.a aVar = e3m.a;
                drawable = m33.a(R.drawable.vk_icon_notification_waves_24, context);
            } else if (i == 2) {
                Context context2 = getContext();
                e3m.a aVar2 = e3m.a;
                drawable = m33.a(R.drawable.vk_icon_notification_outline_24, context2);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context3 = getContext();
                e3m.a aVar3 = e3m.a;
                drawable = m33.a(R.drawable.vk_icon_notification_slash_outline_24, context3);
            }
        }
        if (drawable != null) {
            if (vkButton != null) {
                vkButton.Z4(drawable, true);
            }
            if (vkButton != null) {
                vkButton.d5(Integer.valueOf(R.drawable.vk_icon_dropdown_12));
            }
            if (vkButton != null) {
                vkButton.setIconTint(R.attr.vk_ui_text_primary);
            }
            if (vkButton != null) {
                vkButton.setTrailingIconTint(R.attr.vk_ui_text_primary);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(f8t0 f8t0Var) {
        String str;
        int i;
        int i2;
        setVisibility(!(f8t0Var instanceof f8t0.a) ? 0 : 8);
        if (getVisibility() == 0) {
            boolean z = f8t0Var instanceof f8t0.b;
            VideoProfileCreatorOnboardingItemsView videoProfileCreatorOnboardingItemsView = this.q;
            VideoProfileCreatorOnboardingVideoCounterView videoProfileCreatorOnboardingVideoCounterView = this.r;
            View view = this.b;
            ShimmerFrameLayout shimmerFrameLayout = this.c;
            if (z) {
                shimmerFrameLayout.setVisibility(0);
                f4m.j(view);
                if (videoProfileCreatorOnboardingVideoCounterView != null) {
                    videoProfileCreatorOnboardingVideoCounterView.setVisibility(8);
                }
                if (videoProfileCreatorOnboardingItemsView != null) {
                    videoProfileCreatorOnboardingItemsView.setVisibility(8);
                    return;
                }
                return;
            }
            if (!(f8t0Var instanceof f8t0.c)) {
                if (!f8t0Var.equals(f8t0.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            f8t0.c cVar = (f8t0.c) f8t0Var;
            f4m.j(shimmerFrameLayout);
            view.setVisibility(0);
            qlw qlwVar = cVar.a;
            f8t0.c.k kVar = cVar.b;
            boolean z2 = qlwVar instanceof qlw.a;
            VkAvatar vkAvatar = this.s;
            if (z2) {
                if (vkAvatar != null) {
                    vkAvatar.q0(((qlw.a) qlwVar).a);
                }
            } else {
                if (!(qlwVar instanceof qlw.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vkAvatar != null) {
                    Image image = ((qlw.b) qlwVar).a;
                    vkAvatar.o0(ixj0.h(image != null ? image.b : null), null);
                }
            }
            if (vkAvatar != null) {
                vkAvatar.setVisibility(0);
            }
            if (vkAvatar != null) {
                Context context = getContext();
                e3m.a aVar = e3m.a;
                vkAvatar.setForeground(m33.a(R.drawable.vk_video_selectable_bg, context));
            }
            boolean o0 = fxc0.B().J().o0();
            ComposeView composeView = this.g;
            if (o0) {
                composeView.setContent(new jai(-2124186363, new yn7(16, cVar, this), true));
            } else if (fxc0.B().J().b1()) {
                f8t0.c.a aVar2 = cVar.i;
                f8t0.c.k.b bVar = kVar instanceof f8t0.c.k.b ? (f8t0.c.k.b) kVar : null;
                if (bVar == null || (str = bVar.a) == null) {
                    str = "";
                }
                composeView.setContent(new jai(527618404, new kv7(aVar2, str, this, 7), true));
            } else {
                boolean f = epx.f(kVar, f8t0.c.k.a.a);
                AppCompatTextView appCompatTextView = this.d;
                if (f) {
                    f4m.j(appCompatTextView);
                } else {
                    if (!(kVar instanceof f8t0.c.k.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appCompatTextView.setVisibility(0);
                    appCompatTextView.setText(((f8t0.c.k.b) kVar).a);
                }
                appCompatTextView.requestLayout();
            }
            f8t0.c.b bVar2 = cVar.h;
            boolean z3 = bVar2 instanceof f8t0.c.b.a;
            View view2 = this.f;
            if (z3) {
                this.u = true;
                view2.setVisibility(0);
                view2.animate().rotation(((f8t0.c.b.a) bVar2).a ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
            } else {
                if (!epx.f(bVar2, f8t0.c.b.C2855b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.u = false;
                f4m.j(view2);
            }
            f8t0.c.g gVar = cVar.c;
            boolean f2 = epx.f(gVar, f8t0.c.g.a.a);
            AppCompatTextView appCompatTextView2 = this.i;
            if (f2) {
                f4m.j(appCompatTextView2);
            } else {
                if (!(gVar instanceof f8t0.c.g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                appCompatTextView2.setVisibility(0);
                appCompatTextView2.setText(((f8t0.c.g.b) gVar).a);
            }
            b(cVar.d);
            f8t0.c.i iVar = cVar.j;
            boolean f3 = epx.f(iVar, f8t0.c.i.a.a);
            VkButton vkButton = this.k;
            if (f3) {
                if (vkButton != null) {
                    f4m.j(vkButton);
                }
            } else {
                if (!(iVar instanceof f8t0.c.i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                setupSubscribeButtonForVisible((f8t0.c.i.b) iVar);
            }
            pyn pynVar = cVar.k.a;
            int i3 = 22;
            b8e0 b8e0Var = new b8e0(this, i3);
            VkButton vkButton2 = this.l;
            if (vkButton2 != null) {
                f4m.j(vkButton2);
            }
            if (pynVar instanceof pyn.a) {
                ConstraintLayout.b bVar3 = (ConstraintLayout.b) getLayoutParams();
                ((ViewGroup.MarginLayoutParams) bVar3).width = -1;
                bVar3.setMarginEnd(0);
                setLayoutParams(bVar3);
            } else {
                if (!(pynVar instanceof pyn.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vkButton2 != null) {
                    pyn.b bVar4 = (pyn.b) pynVar;
                    Integer num = bVar4.b;
                    if (num != null) {
                        vkButton2.setText(num.intValue());
                        ViewGroup.LayoutParams layoutParams = vkButton2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = -2;
                        vkButton2.setLayoutParams(layoutParams);
                    } else {
                        vkButton2.setText((CharSequence) null);
                        awt0.t(vkButton2, new k4(i3, vkButton2, vkButton2));
                    }
                    vkButton2.a5(true, Integer.valueOf(bVar4.a));
                    vkButton2.setIconTint(R.attr.vk_ui_icon_primary);
                    vkButton2.setTextTint(R.attr.vk_ui_text_primary);
                    vkButton2.setMode(VkButton.Mode.Secondary);
                }
                if (!this.w.e()) {
                    if (((pyn.b) pynVar).b != null) {
                        if (vkButton != null) {
                            ViewGroup.LayoutParams layoutParams2 = vkButton.getLayoutParams();
                            if (layoutParams2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams2;
                            i = 0;
                            ((ViewGroup.MarginLayoutParams) bVar5).width = 0;
                            vkButton.setLayoutParams(bVar5);
                        } else {
                            i = 0;
                        }
                        if (vkButton2 != null) {
                            ViewGroup.LayoutParams layoutParams3 = vkButton2.getLayoutParams();
                            if (layoutParams3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.b bVar6 = (ConstraintLayout.b) layoutParams3;
                            ((ViewGroup.MarginLayoutParams) bVar6).width = i;
                            vkButton2.setLayoutParams(bVar6);
                        }
                    } else {
                        if (vkButton2 != null) {
                            ViewGroup.LayoutParams layoutParams4 = vkButton2.getLayoutParams();
                            if (layoutParams4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.b bVar7 = (ConstraintLayout.b) layoutParams4;
                            ((ViewGroup.MarginLayoutParams) bVar7).width = ((ViewGroup.MarginLayoutParams) bVar7).height;
                            vkButton2.setLayoutParams(bVar7);
                        }
                        if (vkButton != null) {
                            ViewGroup.LayoutParams layoutParams5 = vkButton.getLayoutParams();
                            if (layoutParams5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            }
                            ConstraintLayout.b bVar8 = (ConstraintLayout.b) layoutParams5;
                            ((ViewGroup.MarginLayoutParams) bVar8).width = 0;
                            vkButton.setLayoutParams(bVar8);
                        }
                    }
                    if (vkButton != null) {
                        ViewGroup.LayoutParams layoutParams6 = vkButton.getLayoutParams();
                        if (layoutParams6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.b bVar9 = (ConstraintLayout.b) layoutParams6;
                        qcy<Object>[] qcyVarArr = bwt0.a;
                        bVar9.setMarginEnd((int) getResources().getDimension(R.dimen.vk_ui_spacing_size_m));
                        vkButton.setLayoutParams(bVar9);
                    }
                }
                if (vkButton2 != null) {
                    jjc.g(vkButton2, new ito0(4, b8e0Var, pynVar));
                }
                if (vkButton2 != null) {
                    vkButton2.setVisibility(0);
                }
            }
            VkButton vkButton3 = this.n;
            if (vkButton3 != null) {
                vkButton3.a5(true, Integer.valueOf(R.drawable.vk_icon_video_add_square_outline_24));
                vkButton3.setIconTint(R.attr.vk_ui_icon_primary);
                vkButton3.setText(R.string.video_profile_upload_button_title);
                vkButton3.setTextTint(R.attr.vk_ui_text_primary);
                vkButton3.setMode(VkButton.Mode.Secondary);
            }
            f8t0.c.l lVar = cVar.g;
            if (lVar instanceof f8t0.c.l.b) {
                if (vkButton3 != null) {
                    vkButton3.setVisibility(0);
                }
            } else {
                if (!epx.f(lVar, f8t0.c.l.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vkButton3 != null) {
                    f4m.j(vkButton3);
                }
            }
            VkButton vkButton4 = this.o;
            if (vkButton4 != null) {
                vkButton4.setText(R.string.video_profile_open_author_cabinet_title);
                vkButton4.setTextTint(R.attr.vk_ui_text_primary);
                vkButton4.setMode(VkButton.Mode.Secondary);
            }
            f8t0.c.h hVar = cVar.f;
            if (hVar instanceof f8t0.c.h.b) {
                if (vkButton4 != null) {
                    vkButton4.setVisibility(0);
                }
            } else {
                if (!epx.f(hVar, f8t0.c.h.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vkButton4 != null) {
                    f4m.j(vkButton4);
                }
            }
            VkButton vkButton5 = this.p;
            if (vkButton5 != null) {
                vkButton5.a5(true, Integer.valueOf(R.drawable.vk_icon_write_outline_20));
                vkButton5.setIconTint(R.attr.vk_ui_icon_primary);
                vkButton5.setMode(VkButton.Mode.Secondary);
            }
            f8t0.c.f fVar = cVar.e;
            if (fVar instanceof f8t0.c.f.b) {
                i2 = 0;
                if (vkButton5 != null) {
                    vkButton5.setVisibility(0);
                }
            } else {
                i2 = 0;
                if (!epx.f(fVar, f8t0.c.f.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vkButton5 != null) {
                    f4m.j(vkButton5);
                }
            }
            boolean z4 = cVar.n;
            boolean z5 = cVar.p;
            if (vkAvatar != null) {
                vkAvatar.S0();
                boolean booleanValue = ((Boolean) this.x.getValue()).booleanValue();
                Group group = this.e;
                if (booleanValue && z5) {
                    f4m.j(group);
                    vkAvatar.W0(new ndu0(), true);
                    vkAvatar.Q0(new b(null, true, null, null, 27));
                } else {
                    awt0.v(group, z4);
                    vkAvatar.setBorder(null);
                }
            }
            f8t0.c.d dVar = cVar.l;
            f8t0.c.InterfaceC2856c interfaceC2856c = cVar.m;
            if (videoProfileCreatorOnboardingItemsView != null) {
                boolean z6 = dVar instanceof f8t0.c.d.b;
                if (z6) {
                    videoProfileCreatorOnboardingItemsView.setVisibleItems(((f8t0.c.d.b) dVar).a);
                }
                videoProfileCreatorOnboardingItemsView.setVisibility(z6 ? i2 : 8);
            }
            if (videoProfileCreatorOnboardingVideoCounterView != null) {
                boolean z7 = interfaceC2856c instanceof f8t0.c.InterfaceC2856c.b;
                if (z7) {
                    videoProfileCreatorOnboardingVideoCounterView.setProgress(((f8t0.c.InterfaceC2856c.b) interfaceC2856c).a);
                }
                videoProfileCreatorOnboardingVideoCounterView.setVisibility(z7 ? i2 : 8);
            }
        }
    }

    public final void b(f8t0.c.j jVar) {
        this.t = jVar;
        boolean f = epx.f(jVar, f8t0.c.j.b.a);
        VideoProfileSubtitleView videoProfileSubtitleView = this.j;
        if (f) {
            f4m.j(videoProfileSubtitleView);
            return;
        }
        boolean z = jVar instanceof f8t0.c.j.C2857c;
        l9t0 l9t0Var = this.w;
        if (z) {
            videoProfileSubtitleView.setVisibility(0);
            ((f8t0.c.j.C2857c) jVar).getClass();
            CharSequence a2 = i9t0.a(videoProfileSubtitleView, null);
            if (l9t0Var.e()) {
                videoProfileSubtitleView.setMaxLines(2);
            }
            SpannableStringBuilder d = d(this);
            int i = VideoProfileSubtitleView.c;
            this.j.b(a2, d, false, true, false);
            return;
        }
        if (!(jVar instanceof f8t0.c.j.a)) {
            throw new NoWhenBranchMatchedException();
        }
        videoProfileSubtitleView.setVisibility(0);
        CharSequence a3 = i9t0.a(videoProfileSubtitleView, ((f8t0.c.j.a) jVar).a);
        if (l9t0Var.e()) {
            videoProfileSubtitleView.setMaxLines(2);
        }
        if (a3.length() == 0) {
            this.j.b(" ", c(getContext().getString(R.string.vk_video_profile_about_channel_expand)), true, false, true);
        } else {
            this.j.b(a3, d(this), true, true, true);
        }
    }

    public final SpannableStringBuilder c(String str) {
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        Typeface a2 = dbg0.a(R.font.vk_roboto_medium, context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_background_accent_themed, getContext())), 0, spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new qup0(a2), 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f8t0.c.j jVar = this.t;
        if (jVar != null) {
            b(jVar);
        }
    }

    public final void setCreatorOnboardingAnimationEndedCallback(gzs<s3q0> gzsVar) {
        VideoProfileCreatorOnboardingItemsView videoProfileCreatorOnboardingItemsView = this.q;
        if (videoProfileCreatorOnboardingItemsView != null) {
            videoProfileCreatorOnboardingItemsView.setAnimationEndedCallback(gzsVar);
        }
    }

    public final void setCreatorOnboardingItemClickListener(izs<? super VideoProfileCreatorOnboardingItemType, s3q0> izsVar) {
        VideoProfileCreatorOnboardingItemsView videoProfileCreatorOnboardingItemsView = this.q;
        if (videoProfileCreatorOnboardingItemsView != null) {
            videoProfileCreatorOnboardingItemsView.setItemClickListener(izsVar);
        }
    }

    public final void setOnAgeMarkClickListener(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setOnDonutButtonClickListener(izs<? super ezn, s3q0> izsVar) {
        this.v = izsVar;
    }

    public final void setOnEditProfileClickListener(gzs<s3q0> gzsVar) {
        VkButton vkButton = this.p;
        if (vkButton != null) {
            jjc.g(vkButton, new c4i(3, gzsVar));
        }
    }

    public final void setOnOpenAuthorCabinetClickListener(gzs<s3q0> gzsVar) {
        VkButton vkButton = this.o;
        if (vkButton != null) {
            jjc.g(vkButton, new ksg0(gzsVar, 22));
        }
    }

    public final void setOnOwnerChangeTouchZoneClickListener(gzs<s3q0> gzsVar) {
        jjc.g(this.f, new isb0(13, this, gzsVar));
    }

    public final void setOnOwnerPhotoClickListener(gzs<s3q0> gzsVar) {
        VkAvatar vkAvatar = this.s;
        if (vkAvatar != null) {
            jjc.g(vkAvatar, new mdm0(gzsVar, 17));
        }
    }

    public final void setOnSubscribeButtonClickListener(gzs<s3q0> gzsVar) {
        VkButton vkButton = this.k;
        if (vkButton != null) {
            jjc.g(vkButton, new yjg0(1, gzsVar));
        }
    }

    public final void setOnSubtitleClickListener(gzs<s3q0> gzsVar) {
        jjc.g(this.j, new pre(2, gzsVar));
    }

    public final void setOnUploadVideoClickListener(gzs<s3q0> gzsVar) {
        VkButton vkButton = this.n;
        if (vkButton != null) {
            jjc.g(vkButton, new gib0(gzsVar, 22));
        }
    }
}
