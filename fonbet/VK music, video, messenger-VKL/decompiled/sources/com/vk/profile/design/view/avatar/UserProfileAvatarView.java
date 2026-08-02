package com.vk.profile.design.view.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.profile.core.avatar.StoryBorderMode;
import com.vk.profile.core.cover.a;
import com.vk.profile.design.view.avatar.UserProfileAvatarView;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.stories.design.view.live.LiveShine;
import com.vk.toggle.b;
import com.vk.toggle.d;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import xsna.bnc0;
import xsna.bwt0;
import xsna.cn70;
import xsna.cq5;
import xsna.e3m;
import xsna.epx;
import xsna.fsk;
import xsna.hny;
import xsna.iso0;
import xsna.kmq0;
import xsna.krv0;
import xsna.m33;
import xsna.mmq0;
import xsna.mto0;
import xsna.qcy;
import xsna.ts5;
import xsna.yxl0;

/* compiled from: UserProfileAvatarView.kt */
/* loaded from: classes5.dex */
public final class UserProfileAvatarView extends FrameLayout implements ts5 {
    public static final /* synthetic */ int j = 0;
    public final StringBuffer b;
    public final int c;
    public final StoryAvatarView d;
    public final LiveShine e;
    public final VkImage f;
    public final VkText g;
    public final VkImage h;
    public boolean i;

    public UserProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new StringBuffer();
        qcy<Object>[] qcyVarArr = bwt0.a;
        this.c = (int) getResources().getDimension(R.dimen.profile_avatar_size);
        LayoutInflater.from(context).inflate(R.layout.view_user_profile_main_info_avatar, (ViewGroup) this, true);
        setClipChildren(false);
        setContentDescription(context.getString(R.string.user_profile_accessibility_avatar));
        StoryAvatarView storyAvatarView = (StoryAvatarView) findViewById(R.id.iv_profile_main_info_avatar);
        storyAvatarView.setFromProfile(true);
        this.d = storyAvatarView;
        this.e = (LiveShine) findViewById(R.id.live_badge);
        this.f = (VkImage) findViewById(R.id.profile_online);
        this.g = (VkText) findViewById(R.id.profile_offline);
        this.h = (VkImage) findViewById(R.id.iv_error);
    }

    private final void setOnlineInfo(OnlineInfo onlineInfo) {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.ic_online_web_composite_16, context);
        Drawable a2 = m33.a(R.drawable.ic_online_mobile_vkapp_composite_16, getContext());
        boolean z = onlineInfo instanceof VisibleStatus;
        VkImage vkImage = this.f;
        if (!z) {
            vkImage.setImageDrawable(null);
            return;
        }
        VisibleStatus visibleStatus = (VisibleStatus) onlineInfo;
        if (visibleStatus.c && visibleStatus.Cb()) {
            vkImage.setImageDrawable(a2);
            return;
        }
        boolean z2 = visibleStatus.c;
        if (z2 && visibleStatus.e == Platform.MOBILE) {
            vkImage.setImageDrawable(a2);
        } else if (z2) {
            vkImage.setImageDrawable(a);
        } else {
            vkImage.setImageDrawable(null);
        }
    }

    private final void setupAccessibility(StoryBorderMode storyBorderMode) {
        setContentDescription(getContext().getString((storyBorderMode == StoryBorderMode.LIVE || storyBorderMode == StoryBorderMode.FINISHED_LIVE) ? R.string.user_profile_accessibility_avatar_with_new_lives : storyBorderMode == StoryBorderMode.FINISHED_LIVE_SEEN ? R.string.user_profile_accessibility_avatar_with_seen_lives : storyBorderMode == StoryBorderMode.STORY_SEEN ? R.string.user_profile_accessibility_avatar_with_seen_stories : storyBorderMode == StoryBorderMode.STORY_NEW ? R.string.user_profile_accessibility_avatar_with_new_stories : R.string.user_profile_accessibility_avatar));
    }

    private final void setupError(StoryBorderMode storyBorderMode) {
        bwt0.p0(this.h, storyBorderMode == StoryBorderMode.UPLOAD_ERROR);
    }

    private final void setupLiveBadge(boolean z) {
        bwt0.p0(this.e, z);
    }

    public final int getAvatarSize() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setup(final kmq0 kmq0Var) {
        String str;
        OnlineInfo onlineInfo;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        VkImage vkImage;
        VkText vkText;
        VisibleStatus zb;
        VisibleStatus zb2;
        StoriesContainer storiesContainer = kmq0Var.d;
        AvatarBorderType avatarBorderType = kmq0Var.c;
        bwt0.i0(this, new bnc0(kmq0Var, 16));
        StoryBorderMode storyBorderMode = kmq0Var.e;
        cq5 cq5Var = storyBorderMode == StoryBorderMode.UPLOAD_ERROR ? cq5.d.a : (storyBorderMode == StoryBorderMode.STORY_SEEN || storyBorderMode == StoryBorderMode.FINISHED_LIVE_SEEN) ? cq5.m.a : (storyBorderMode == StoryBorderMode.LIVE || storyBorderMode == StoryBorderMode.FINISHED_LIVE) ? cq5.g.a : storyBorderMode == StoryBorderMode.STORY_NEW ? cq5.h.a : cq5.b.a;
        VKAvatarView.c1(this.d, avatarBorderType, cq5Var, 4);
        String str3 = kmq0Var.a;
        String str4 = kmq0Var.b;
        String str5 = kmq0Var.l;
        cq5.d dVar = cq5.d.a;
        boolean f = epx.f(cq5Var, dVar);
        yxl0 yxl0Var = new yxl0();
        Uri parse = str3 != null ? Uri.parse(str3) : null;
        StoryAvatarView storyAvatarView = this.d;
        if (parse != null) {
            if (str4 != null) {
                storyAvatarView.setPostprocessingEnabled(true);
                if (storiesContainer == null) {
                    iso0 s = d.s();
                    CoreFeatures coreFeatures = CoreFeatures.THUMB_HASH;
                    coreFeatures.getClass();
                    String b = s.b(str5, b.A.a(coreFeatures) && d.s().d);
                    if (b != null) {
                        storyAvatarView.setThumbHash(b);
                    }
                    storyAvatarView.N0(Uri.parse(str4), null, parse, null);
                    str = null;
                } else {
                    iso0 s2 = d.s();
                    CoreFeatures coreFeatures2 = CoreFeatures.THUMB_HASH;
                    coreFeatures2.getClass();
                    String b2 = s2.b(str5, b.A.a(coreFeatures2) && d.s().d);
                    if (b2 != null) {
                        storyAvatarView.setThumbHash(b2);
                    }
                    this.d.t1(storiesContainer, f, yxl0Var, new mmq0(this, f));
                }
            } else {
                storyAvatarView.setPostprocessingEnabled(true);
                Context context = getContext();
                hny hnyVar = new hny(context);
                hnyVar.b(krv0.e(R.drawable.profile_placeholder_avatar_background, context));
                hnyVar.b(krv0.f(R.drawable.vk_icon_camera_outline_36, R.attr.colorAccent, context));
                storyAvatarView.setPlaceholderImage(hnyVar);
                if (storiesContainer == null) {
                    iso0 s3 = d.s();
                    CoreFeatures coreFeatures3 = CoreFeatures.THUMB_HASH;
                    coreFeatures3.getClass();
                    String b3 = s3.b(str5, b.A.a(coreFeatures3) && d.s().d);
                    if (b3 != null) {
                        storyAvatarView.setThumbHash(b3);
                    }
                    str = null;
                    storyAvatarView.L0(parse, null);
                } else {
                    str = null;
                    iso0 s4 = d.s();
                    CoreFeatures coreFeatures4 = CoreFeatures.THUMB_HASH;
                    coreFeatures4.getClass();
                    String b4 = s4.b(str5, b.A.a(coreFeatures4) && d.s().d);
                    if (b4 != null) {
                        storyAvatarView.setThumbHash(b4);
                    }
                    this.d.t1(storiesContainer, f, yxl0Var, new mmq0(this, f));
                }
            }
            StoryBorderMode storyBorderMode2 = StoryBorderMode.LIVE;
            setupLiveBadge(storyBorderMode != storyBorderMode2);
            setupError(storyBorderMode);
            onlineInfo = kmq0Var.f;
            boolean f2 = epx.f(cq5Var, dVar);
            z = storyBorderMode == StoryBorderMode.NONE;
            z2 = (storyBorderMode == storyBorderMode2 || onlineInfo == null) ? false : true;
            boolean z4 = onlineInfo == null && (zb2 = onlineInfo.zb()) != null && (zb2.c ^ true);
            if (onlineInfo != null || (zb = onlineInfo.zb()) == null) {
                z3 = false;
                str2 = str;
            } else {
                StringBuffer stringBuffer = this.b;
                z3 = false;
                stringBuffer.setLength(0);
                mto0.a(zb.b, stringBuffer, mto0.a.b.g);
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(".");
                }
                str2 = stringBuffer.toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            vkImage = this.f;
            vkText = this.g;
            if ((storiesContainer == null && storiesContainer.Rb() && ((storiesContainer.Cb() || fsk.A(storiesContainer)) && storiesContainer.Fb() != null)) || f2) {
                vkImage.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                vkText.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                vkImage.setAlpha(1.0f);
                vkText.setAlpha(1.0f);
            }
            bwt0.p0(vkImage, (z2 || z4) ? z3 : true);
            if (z2 && z4 && str2.length() > 0) {
                z3 = true;
            }
            bwt0.p0(vkText, z3);
            setOnlineInfo(onlineInfo);
            vkText.setText(str2);
            float a = z ? cn70.a() * 2.0f : 0.0f;
            if (z) {
                f3 = avatarBorderType == AvatarBorderType.HEXAGON ? cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : cn70.a() * 4.0f;
            }
            vkText.setTranslationX(a);
            vkText.setTranslationY(f3);
            vkImage.setTranslationX(a);
            vkImage.setTranslationY(f3);
            setupAccessibility(storyBorderMode);
            kmq0Var.k.l.add(new a.InterfaceC1639a() { // from class: xsna.lmq0
                @Override // com.vk.profile.core.cover.a.InterfaceC1639a
                public final void a(float f4) {
                    int i = UserProfileAvatarView.j;
                    float min = 1 - Math.min(f4, 0.5f);
                    UserProfileAvatarView userProfileAvatarView = UserProfileAvatarView.this;
                    userProfileAvatarView.setAlpha(min);
                    if (kmq0Var.g == UserProfileMode.Profile) {
                        userProfileAvatarView.setScaleX(min);
                        userProfileAvatarView.setScaleY(min);
                    }
                }
            });
            if (!kmq0Var.h || this.i) {
                return;
            }
            this.i = true;
            kmq0Var.j.invoke();
            return;
        }
        storyAvatarView.clear();
        Context context2 = getContext();
        hny hnyVar2 = new hny(context2);
        hnyVar2.b(krv0.e(R.drawable.profile_placeholder_avatar_background, context2));
        hnyVar2.b(krv0.f(R.drawable.vk_icon_camera_outline_36, R.attr.colorAccent, context2));
        storyAvatarView.setPlaceholderImage(hnyVar2);
        if (storiesContainer != null) {
            this.d.t1(storiesContainer, f, yxl0Var, new mmq0(this, f));
        }
        str = null;
        StoryBorderMode storyBorderMode22 = StoryBorderMode.LIVE;
        setupLiveBadge(storyBorderMode != storyBorderMode22);
        setupError(storyBorderMode);
        onlineInfo = kmq0Var.f;
        boolean f22 = epx.f(cq5Var, dVar);
        if (storyBorderMode == StoryBorderMode.NONE) {
        }
        if (storyBorderMode == storyBorderMode22) {
            if (onlineInfo == null) {
            }
            if (onlineInfo != null) {
            }
            z3 = false;
            str2 = str;
            if (str2 == null) {
            }
            float f32 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            vkImage = this.f;
            vkText = this.g;
            if (storiesContainer == null) {
            }
            vkImage.setAlpha(1.0f);
            vkText.setAlpha(1.0f);
            bwt0.p0(vkImage, (z2 || z4) ? z3 : true);
            if (z2) {
                z3 = true;
            }
            bwt0.p0(vkText, z3);
            setOnlineInfo(onlineInfo);
            vkText.setText(str2);
            if (z) {
            }
            if (z) {
            }
            vkText.setTranslationX(a);
            vkText.setTranslationY(f32);
            vkImage.setTranslationX(a);
            vkImage.setTranslationY(f32);
            setupAccessibility(storyBorderMode);
            kmq0Var.k.l.add(new a.InterfaceC1639a() { // from class: xsna.lmq0
                @Override // com.vk.profile.core.cover.a.InterfaceC1639a
                public final void a(float f4) {
                    int i = UserProfileAvatarView.j;
                    float min = 1 - Math.min(f4, 0.5f);
                    UserProfileAvatarView userProfileAvatarView = UserProfileAvatarView.this;
                    userProfileAvatarView.setAlpha(min);
                    if (kmq0Var.g == UserProfileMode.Profile) {
                        userProfileAvatarView.setScaleX(min);
                        userProfileAvatarView.setScaleY(min);
                    }
                }
            });
            if (kmq0Var.h) {
                return;
            } else {
                return;
            }
        }
        if (onlineInfo == null) {
        }
        if (onlineInfo != null) {
        }
        z3 = false;
        str2 = str;
        if (str2 == null) {
        }
        float f322 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        vkImage = this.f;
        vkText = this.g;
        if (storiesContainer == null) {
        }
        vkImage.setAlpha(1.0f);
        vkText.setAlpha(1.0f);
        bwt0.p0(vkImage, (z2 || z4) ? z3 : true);
        if (z2) {
        }
        bwt0.p0(vkText, z3);
        setOnlineInfo(onlineInfo);
        vkText.setText(str2);
        if (z) {
        }
        if (z) {
        }
        vkText.setTranslationX(a);
        vkText.setTranslationY(f322);
        vkImage.setTranslationX(a);
        vkImage.setTranslationY(f322);
        setupAccessibility(storyBorderMode);
        kmq0Var.k.l.add(new a.InterfaceC1639a() { // from class: xsna.lmq0
            @Override // com.vk.profile.core.cover.a.InterfaceC1639a
            public final void a(float f4) {
                int i = UserProfileAvatarView.j;
                float min = 1 - Math.min(f4, 0.5f);
                UserProfileAvatarView userProfileAvatarView = UserProfileAvatarView.this;
                userProfileAvatarView.setAlpha(min);
                if (kmq0Var.g == UserProfileMode.Profile) {
                    userProfileAvatarView.setScaleX(min);
                    userProfileAvatarView.setScaleY(min);
                }
            }
        });
        if (kmq0Var.h) {
        }
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
