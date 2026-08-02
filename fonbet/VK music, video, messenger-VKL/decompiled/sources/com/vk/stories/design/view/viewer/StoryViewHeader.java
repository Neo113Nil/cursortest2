package com.vk.stories.design.view.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.stories.model.ExternalAdsInfo;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryMemoryType;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StorySubscribersHeader;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.dto.stories.model.clickable.ClickableChannelPost;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableReply;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.stories.design.view.viewer.AnimatedSubtitleView;
import com.vk.stories.design.view.viewer.AnimatedSubtitleView.a;
import com.vk.story.viewer.impl.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.a5;
import xsna.baf0;
import xsna.bqz;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.cq3;
import xsna.dhr0;
import xsna.dij0;
import xsna.dmm0;
import xsna.drm0;
import xsna.dt50;
import xsna.e43;
import xsna.epx;
import xsna.erm0;
import xsna.fkq0;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.jl4;
import xsna.ku1;
import xsna.l7s;
import xsna.lfa;
import xsna.lpj;
import xsna.m33;
import xsna.mnh0;
import xsna.nqo;
import xsna.ob50;
import xsna.po40;
import xsna.pvo0;
import xsna.qq2;
import xsna.qxi;
import xsna.rim0;
import xsna.s3q0;
import xsna.sim0;
import xsna.wqb;
import xsna.x0n0;
import xsna.xpm0;
import xsna.y8g0;

/* compiled from: StoryViewHeader.kt */
/* loaded from: classes6.dex */
public final class StoryViewHeader extends FrameLayout {
    public final StoryAvatarView b;
    public final ShimmerFrameLayout c;
    public final View d;
    public final View e;
    public final View f;
    public final TextView g;
    public final View h;
    public final View i;
    public final ViewGroup j;
    public final AnimatedSubtitleView k;
    public final TextView l;
    public final ImageView m;
    public dmm0 n;
    public rim0 o;

    public StoryViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        int i = obtainStyledAttributes.getBoolean(0, false) ? R.layout.layout_story_view_header_my_target : R.layout.layout_story_view_header;
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        LayoutInflater.from((valueOf == null || valueOf.intValue() != dhr0.u().c) ? new l7s(context, dhr0.u().c) : context).inflate(i, this);
        obtainStyledAttributes.recycle();
        this.b = (StoryAvatarView) findViewById(R.id.iv_avatar);
        this.g = (TextView) findViewById(R.id.tv_title);
        this.h = findViewById(R.id.iv_close);
        this.i = findViewById(R.id.iv_menu);
        this.j = (ViewGroup) findViewById(R.id.ownerBlock);
        this.k = (AnimatedSubtitleView) findViewById(R.id.animated_subtitle);
        this.l = (TextView) findViewById(R.id.tv_time);
        this.m = (ImageView) findViewById(R.id.verified_image);
        this.c = (ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer);
        this.d = findViewById(R.id.skeleton_avatar);
        this.e = findViewById(R.id.skeleton_title_subtitle_container);
        this.f = findViewById(R.id.real_title_subtitle_container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x0795, code lost:
    
        if (r8.Db() != false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0797, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x079a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x07b4, code lost:
    
        if (r8.Db() != false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x01f6, code lost:
    
        if (r2 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ce, code lost:
    
        if (r2 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d0, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(StoryEntry storyEntry) {
        Image image;
        ImageSize Cb;
        dt50 dt50Var;
        dt50 dt50Var2;
        StoryOwner storyOwner;
        Integer num;
        String str;
        ClickableSituationalTemplate clickableSituationalTemplate;
        int i;
        Integer num2;
        boolean z;
        Integer num3;
        List list;
        List list2;
        boolean z2;
        VerifyInfo verifyInfo;
        Integer num4;
        List<ClickableSticker> list3;
        List<ClickableSticker> list4;
        HashMap<StoryEntry, dt50> hashMap;
        String Db;
        Drawable drawable;
        HashMap<StoryEntry, dt50> hashMap2;
        String g;
        PromoInfo promoInfo;
        int i2;
        String Db2;
        Integer valueOf = Integer.valueOf(R.color.vk_white_alpha60);
        Integer valueOf2 = Integer.valueOf(R.color.vk_white);
        dmm0 dmm0Var = this.n;
        if (dmm0Var == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.e, new Object[]{new IllegalStateException("refresh StoryViewHeader without StoriesContainer, call setContainer before")});
            return;
        }
        Context context = dmm0Var.e;
        StoriesContainer storiesContainer = dmm0Var.a;
        View view = dmm0Var.c;
        int i3 = dmm0Var.f;
        StoryAvatarView storyAvatarView = dmm0Var.b;
        StoryOwner storyOwner2 = storyEntry != null ? storyEntry.l0 : null;
        AvatarBorderType avatarBorderType = AvatarBorderType.CIRCLE;
        int i4 = 1;
        if (storiesContainer instanceof HighlightStoriesContainer) {
            Serializer.c<Narrative> cVar = Narrative.CREATOR;
            storyAvatarView.load(Narrative.a.b(((HighlightStoriesContainer) storiesContainer).o, i3));
        } else if (storyOwner2 != null) {
            storyAvatarView.s1(storyOwner2.Bb(), avatarBorderType);
        } else if (storiesContainer instanceof MyTargetAdStoriesContainer) {
            VKAvatarView.c1(storyAvatarView, avatarBorderType, null, 6);
            storyAvatarView.setPlaceholderImage(R.drawable.vk_icon_stories_advertising_32);
            Bitmap bitmap = (storyEntry == null || (dt50Var2 = ((MyTargetAdStoriesContainer) storiesContainer).o.get(storyEntry)) == null) ? null : dt50Var2.a;
            String str2 = (storyEntry == null || (dt50Var = ((MyTargetAdStoriesContainer) storiesContainer).o.get(storyEntry)) == null) ? null : dt50Var.b;
            if (bitmap != null) {
                storyAvatarView.setImageBitmap(bitmap);
            } else if (str2 != null) {
                storyAvatarView.load(str2);
            }
        } else if ((storyEntry != null ? storyEntry.m0 : null) != null) {
            ExternalAdsInfo externalAdsInfo = storyEntry.m0;
            storyAvatarView.load((externalAdsInfo == null || (image = externalAdsInfo.b) == null || (Cb = image.Cb(i3, true, false)) == null) ? null : Cb.d.d);
        } else {
            StoryOwner storyOwner3 = storiesContainer.b;
            storyAvatarView.s1(storyOwner3 != null ? storyOwner3.Bb() : null, avatarBorderType);
        }
        if ((storyEntry != null && (storyOwner = storyEntry.l0) != null) || (storyOwner = storiesContainer.b) != null) {
            if (!(storyOwner instanceof StoryOwner.Community)) {
                StoryOwner.Owner owner = storyOwner instanceof StoryOwner.Owner ? (StoryOwner.Owner) storyOwner : null;
                if (owner == null || !owner.l) {
                    i2 = R.string.story_accessibility_author_profile;
                    if (storyOwner instanceof StoryOwner.User) {
                        Db2 = storyOwner.Db();
                    } else {
                        UserProfile userProfile = ((StoryOwner.User) storyOwner).c;
                        Db2 = userProfile != null ? userProfile.D() : null;
                        if (Db2 == null) {
                            Db2 = "";
                        }
                    }
                    view.setContentDescription(context.getString(i2, Db2));
                }
            }
            i2 = R.string.story_accessibility_group_profile;
            if (storyOwner instanceof StoryOwner.User) {
            }
            view.setContentDescription(context.getString(i2, Db2));
        }
        boolean z3 = (storyEntry == null || (promoInfo = storyEntry.t) == null || !promoInfo.d) ? false : true;
        bwt0.p0(view, !z3);
        if (!z3) {
            view.setBackground(context.getDrawable(R.drawable.picker_white_ripple_bounded_2dp));
        }
        if (storyEntry != null) {
            PromoInfo promoInfo2 = storyEntry.t;
            bwt0.d0(view, promoInfo2 != null && promoInfo2.d);
            bwt0.p0(dmm0Var.d, !storyEntry.B && storyEntry.C);
            rim0 rim0Var = this.o;
            if (rim0Var != null) {
                ImageView imageView = rim0Var.d;
                StoriesContainer storiesContainer2 = rim0Var.e;
                if (storyEntry.F || storyEntry.B) {
                    num = valueOf;
                } else {
                    boolean z4 = storiesContainer2.j;
                    TextView textView = rim0Var.b;
                    Resources resources = textView.getResources();
                    num = valueOf;
                    long j = storyEntry.f;
                    if (z4) {
                        Calendar d = pvo0.d();
                        d.setTime(new Date(j));
                        g = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(d.get(11)), Integer.valueOf(d.get(12))}, 2));
                    } else {
                        g = mnh0.g(j, resources);
                    }
                    textView.setText(g);
                }
                boolean z5 = storiesContainer2.j;
                str = "";
                int i5 = (int) (storyEntry.f / 1000);
                ExternalAdsInfo externalAdsInfo2 = storyEntry.m0;
                if (storyEntry.Nb()) {
                    MyTargetAdStoriesContainer myTargetAdStoriesContainer = storiesContainer2 instanceof MyTargetAdStoriesContainer ? (MyTargetAdStoriesContainer) storiesContainer2 : null;
                    dt50 dt50Var3 = (myTargetAdStoriesContainer == null || (hashMap2 = myTargetAdStoriesContainer.o) == null) ? null : hashMap2.get(storyEntry);
                    Db = dt50Var3 != null ? dt50Var3.c : null;
                } else {
                    if (z5) {
                        Db = pvo0.o(i5, true, false);
                    } else if (externalAdsInfo2 != null) {
                        Db = externalAdsInfo2.c;
                    } else if (storiesContainer2 instanceof HighlightStoriesContainer) {
                        Db = ((HighlightStoriesContainer) storiesContainer2).o.d;
                    } else {
                        StoryOwner storyOwner4 = storiesContainer2.b;
                        Db = storyOwner4 != null ? storyOwner4.Db() : null;
                    }
                    rim0Var.c.setText(Db);
                    if (!storiesContainer2.j) {
                        StoryOwner storyOwner5 = storiesContainer2.b;
                        VerifyInfo Y = storyOwner5 != null ? storyOwner5.Y() : null;
                        if (Y != null) {
                            boolean z6 = Y.b;
                            boolean Db3 = Y.Db();
                            if (z6) {
                                Context context2 = imageView.getContext();
                                drawable = new baf0(m33.a(R.drawable.vk_icon_verified_16, context2), context2.getColor(R.color.vk_white));
                            } else if (Db3) {
                                Context context3 = imageView.getContext();
                                drawable = new baf0(m33.a(R.drawable.vk_icon_verified_16, context3), context3.getColor(R.color.vk_white_alpha60));
                            }
                            imageView.setImageDrawable(drawable);
                            bwt0.p0(imageView, drawable == null);
                        }
                        drawable = null;
                        imageView.setImageDrawable(drawable);
                        bwt0.p0(imageView, drawable == null);
                    }
                }
            } else {
                num = valueOf;
                str = "";
            }
            rim0 rim0Var2 = this.o;
            if (rim0Var2 != null) {
                AnimatedSubtitleView animatedSubtitleView = rim0Var2.a;
                StoriesContainer storiesContainer3 = rim0Var2.e;
                ArrayList arrayList = new ArrayList();
                if (fkq0.d(storyEntry.d) && storyEntry.K) {
                    if (epx.f(storyEntry.x0, "nobody")) {
                        arrayList.add(new nqo.n(y8g0.e(R.string.story_restricted_only_me_capitalized)));
                    } else if (storyEntry.w0) {
                        arrayList.add(new nqo.b(y8g0.e(R.string.story_restricted_best_friends_capitalized)));
                    } else if (storiesContainer3.Rb()) {
                        arrayList.add(new nqo.f(y8g0.e(R.string.story_restricted_friends_capitalized)));
                    }
                }
                if (storyEntry.M) {
                    arrayList.add(nqo.h.d);
                }
                if (storyEntry.Nb()) {
                    MyTargetAdStoriesContainer myTargetAdStoriesContainer2 = storiesContainer3 instanceof MyTargetAdStoriesContainer ? (MyTargetAdStoriesContainer) storiesContainer3 : null;
                    dt50 dt50Var4 = (myTargetAdStoriesContainer2 == null || (hashMap = myTargetAdStoriesContainer2.o) == null) ? null : hashMap.get(storyEntry);
                    String str3 = dt50Var4 != null ? dt50Var4.d : null;
                    if (str3 == null) {
                        str3 = str;
                    }
                    arrayList.add(new nqo.k(str3));
                } else if (storyEntry.F) {
                    String str4 = storyEntry.s;
                    if (str4 == null || drm0.N(str4)) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = str;
                    }
                    arrayList.add(new nqo.a(str4));
                } else if (storyEntry.v0) {
                    arrayList.add(new nqo.a(y8g0.e(R.string.story_author_ads)));
                }
                StorySubscribersHeader storySubscribersHeader = storyEntry.r0;
                if (storySubscribersHeader != null) {
                    String str5 = storySubscribersHeader.b;
                    if (str5 == null) {
                        str5 = str;
                    }
                    List<Owner> list5 = storySubscribersHeader.c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list5.iterator();
                    while (it.hasNext()) {
                        String f = ((Owner) it.next()).f(iah0.a(12));
                        if (f != null) {
                            arrayList2.add(f);
                        }
                    }
                    arrayList.add(new nqo.t(str5, arrayList2));
                }
                if (!TextUtils.isEmpty(storyEntry.v) && !storyEntry.v.equals("0") && qxi.a().a()) {
                    arrayList.add(new nqo.i(y8g0.f(R.string.mask_name, storyEntry.w)));
                }
                if (storyEntry.n0 > 0 && !(storiesContainer3 instanceof HighlightStoriesContainer) && storiesContainer3.Rb()) {
                    int i6 = storyEntry.n0;
                    boolean z7 = i6 == 1;
                    arrayList.add(new nqo.l(storyEntry.A0, storyEntry.d, z7 ? y8g0.f(R.string.in_narrative, storyEntry.p0) : y8g0.f(R.string.in_narratives, String.valueOf(i6)), z7));
                }
                if (storyEntry.s0) {
                    arrayList.add(nqo.q.d);
                }
                ClickableStickers clickableStickers = storyEntry.X;
                if (clickableStickers == null || (list4 = clickableStickers.d) == null) {
                    clickableSituationalTemplate = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list4) {
                        if (obj instanceof ClickableSituationalTemplate) {
                            arrayList3.add(obj);
                        }
                    }
                    clickableSituationalTemplate = (ClickableSituationalTemplate) j5g.a0(arrayList3);
                }
                ClickableSituationalTemplate.RepliedUsersInfo repliedUsersInfo = clickableSituationalTemplate != null ? clickableSituationalTemplate.f : null;
                if (repliedUsersInfo != null) {
                    Context context4 = animatedSubtitleView.getContext();
                    int i7 = repliedUsersInfo.b;
                    int i8 = repliedUsersInfo.e;
                    arrayList.add(new nqo.u(i7 == 0 ? context4.getString(R.string.story_template_meta_text_empty) : i8 >= 5 ? context4.getString(R.string.story_template_meta_text_friends, xpm0.b(i8)) : context4.getString(R.string.story_template_meta_text_default, context4.getResources().getQuantityString(R.plurals.stories_count, i7, xpm0.b(i7))), j5g.H0(repliedUsersInfo.d, 2)));
                }
                ClickableMusic Ab = storyEntry.Ab();
                if (Ab != null) {
                    MusicTrack musicTrack = Ab.e;
                    if (!storyEntry.z0) {
                        arrayList.add(new nqo.j(y8g0.f(R.string.story_subtitle_song, musicTrack != null ? ob50.a(musicTrack) : null, musicTrack != null ? musicTrack.d : null), Ab));
                    }
                }
                ClickableStickers clickableStickers2 = storyEntry.X;
                if (clickableStickers2 != null && (list3 = clickableStickers2.d) != null) {
                    for (ClickableSticker clickableSticker : list3) {
                        if (clickableSticker instanceof ClickableReply) {
                            StoryEntryExtended storyEntryExtended = storyEntry.R;
                            StoryOwner storyOwner6 = storyEntryExtended != null ? storyEntryExtended.c : null;
                            if (epx.f(((ClickableReply) clickableSticker).g, "fullview") && storyOwner6 != null) {
                                arrayList.add(new nqo.r(erm0.w0(2, y8g0.f(R.string.sticker_type_prefix_story, str)), storyOwner6.Fb()));
                            }
                        } else if (clickableSticker instanceof ClickablePost) {
                            ClickablePost clickablePost = (ClickablePost) clickableSticker;
                            if (epx.f(clickablePost.g, "fullview")) {
                                arrayList.add(new nqo.m(erm0.w0(2, y8g0.f(R.string.sticker_type_prefix_post, str)), clickablePost.h));
                            }
                        } else if (clickableSticker instanceof ClickableClip) {
                            ClickableClip clickableClip = (ClickableClip) clickableSticker;
                            if (epx.f(clickableClip.g, "fullview")) {
                                arrayList.add(new nqo.d(erm0.w0(2, y8g0.f(R.string.sticker_type_prefix_clip, str)), clickableClip));
                            }
                        } else if (clickableSticker instanceof ClickablePhoto) {
                            ClickablePhoto clickablePhoto = (ClickablePhoto) clickableSticker;
                            if (storyEntry.C0 == StoryMemoryType.AVATAR) {
                                arrayList.add(new nqo.p(y8g0.e(R.string.new_sticker_avatar), clickablePhoto.f, clickablePhoto.g, clickablePhoto.i));
                            } else if (epx.f(clickablePhoto.h, "fullview")) {
                                String str6 = clickablePhoto.e;
                                if (str6 == null) {
                                    str6 = str;
                                }
                                arrayList.add(new nqo.o(y8g0.f(R.string.sticker_type_prefix_photo_gen, str6), clickablePhoto.f, clickablePhoto.g, clickablePhoto.i));
                            }
                        } else if (clickableSticker instanceof ClickableChannelPost) {
                            ClickableChannelPost clickableChannelPost = (ClickableChannelPost) clickableSticker;
                            String str7 = clickableChannelPost.h;
                            String str8 = clickableChannelPost.i;
                            if (epx.f(str7, "fullview")) {
                                arrayList.add(new nqo.c((str8 == null || drm0.N(str8)) ? erm0.w0(2, y8g0.f(R.string.sticker_type_prefix_channel_post, str)) : y8g0.f(R.string.sticker_type_prefix_channel_post, str8), po40.j(clickableChannelPost)));
                            }
                        }
                    }
                }
                if (storyEntry.Mb() && !storyEntry.F) {
                    arrayList.add(nqo.e.d);
                }
                if (storyEntry.L) {
                    arrayList.add(nqo.s.d);
                }
                StoryMemoryType storyMemoryType = storyEntry.C0;
                if (storyMemoryType != null && storyMemoryType != StoryMemoryType.BIRTHDAY && storyMemoryType != StoryMemoryType.MY_TOP_TRACK) {
                    if (rim0.g.contains(storyMemoryType)) {
                        try {
                            arrayList.add(new nqo.g(storyEntry.D0));
                        } catch (Throwable th) {
                            arrayList.add(new nqo.g(null));
                            L.i(th);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    } else {
                        arrayList.add(new nqo.g(null));
                    }
                }
                List<nqo> D0 = j5g.D0(new bqz(2), arrayList);
                ArrayList arrayList4 = new ArrayList(c5g.u(D0, 10));
                for (nqo nqoVar : D0) {
                    String a = nqoVar.a();
                    Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_users_12);
                    Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_arrow_uturn_right_12);
                    boolean z8 = nqoVar instanceof nqo.i;
                    if (z8) {
                        valueOf3 = Integer.valueOf(R.drawable.vk_icon_mask_12);
                    } else if (nqoVar instanceof nqo.q) {
                        valueOf3 = Integer.valueOf(R.drawable.vk_icon_question_12);
                    } else if (nqoVar instanceof nqo.b) {
                        valueOf3 = Integer.valueOf(R.drawable.vk_icon_favorite_12);
                    } else if (!(nqoVar instanceof nqo.f) && !(nqoVar instanceof nqo.n)) {
                        if (nqoVar instanceof nqo.l) {
                            valueOf3 = Integer.valueOf(R.drawable.vk_icon_narrative_active_outline_12);
                        } else {
                            if (!(nqoVar instanceof nqo.d) && !(nqoVar instanceof nqo.r)) {
                                if (nqoVar instanceof nqo.h) {
                                    valueOf3 = Integer.valueOf(R.drawable.vk_icon_stars_12);
                                } else if (!(nqoVar instanceof nqo.m) && !(nqoVar instanceof nqo.c) && !(nqoVar instanceof nqo.o)) {
                                    if (nqoVar instanceof nqo.s) {
                                        valueOf3 = Integer.valueOf(R.drawable.vk_icon_message_12);
                                    } else {
                                        num2 = null;
                                        Integer valueOf5 = Integer.valueOf(R.drawable.vk_icon_verified_16);
                                        z = nqoVar instanceof nqo.j;
                                        if (z) {
                                            ClickableMusic clickableMusic = ((nqo.j) nqoVar).e;
                                            boolean z9 = clickableMusic.h != null;
                                            MusicTrack musicTrack2 = clickableMusic.e;
                                            boolean z10 = musicTrack2 != null && musicTrack2.s;
                                            if (z9 && z10) {
                                                valueOf5 = Integer.valueOf(R.drawable.vk_icon_explicit_12);
                                                num3 = valueOf5;
                                            }
                                        } else {
                                            num3 = !(nqoVar instanceof nqo.p) ? null : null;
                                        }
                                        String str9 = z ? "waves.json" : null;
                                        if (nqoVar instanceof nqo.t) {
                                            list = ((nqo.t) nqoVar).e;
                                        } else {
                                            if (nqoVar instanceof nqo.r) {
                                            } else if (nqoVar instanceof nqo.u) {
                                                list = ((nqo.u) nqoVar).e;
                                            }
                                            list2 = null;
                                            boolean z11 = (!z8 || (nqoVar instanceof nqo.q) || z || (nqoVar instanceof nqo.h) || (nqoVar instanceof nqo.g)) ? true : nqoVar instanceof nqo.l ? ((nqo.l) nqoVar).g : false;
                                            int i9 = (!(nqoVar instanceof nqo.a) || (nqoVar instanceof nqo.k)) ? Integer.MAX_VALUE : 1;
                                            z2 = nqoVar.c;
                                            Boolean valueOf6 = Boolean.valueOf(z2);
                                            if (!z2) {
                                                valueOf6 = null;
                                            }
                                            jl4 jl4Var = valueOf6 == null ? new jl4(23, rim0Var2, nqoVar) : null;
                                            if (nqoVar instanceof nqo.p) {
                                                if ((nqoVar instanceof nqo.o) && (verifyInfo = ((nqo.o) nqoVar).g) != null) {
                                                    if (!verifyInfo.b) {
                                                    }
                                                    Integer num5 = valueOf2;
                                                    num4 = num5;
                                                    arrayList4.add(new x0n0(a, num2, num3, str9, list2, z11, i9, jl4Var, z2, num4));
                                                }
                                                num4 = null;
                                                arrayList4.add(new x0n0(a, num2, num3, str9, list2, z11, i9, jl4Var, z2, num4));
                                            } else {
                                                VerifyInfo verifyInfo2 = ((nqo.p) nqoVar).g;
                                                if (verifyInfo2 != null) {
                                                    if (!verifyInfo2.b) {
                                                    }
                                                    Integer num52 = valueOf2;
                                                    num4 = num52;
                                                    arrayList4.add(new x0n0(a, num2, num3, str9, list2, z11, i9, jl4Var, z2, num4));
                                                }
                                                num4 = null;
                                                arrayList4.add(new x0n0(a, num2, num3, str9, list2, z11, i9, jl4Var, z2, num4));
                                            }
                                        }
                                        list2 = list;
                                        if (z8) {
                                        }
                                        if (nqoVar instanceof nqo.a) {
                                        }
                                        z2 = nqoVar.c;
                                        Boolean valueOf62 = Boolean.valueOf(z2);
                                        if (!z2) {
                                        }
                                        if (valueOf62 == null) {
                                        }
                                        if (nqoVar instanceof nqo.p) {
                                        }
                                    }
                                }
                            }
                            num2 = valueOf4;
                            Integer valueOf52 = Integer.valueOf(R.drawable.vk_icon_verified_16);
                            z = nqoVar instanceof nqo.j;
                            if (z) {
                            }
                            if (z) {
                            }
                            if (nqoVar instanceof nqo.t) {
                            }
                            list2 = list;
                            if (z8) {
                            }
                            if (nqoVar instanceof nqo.a) {
                            }
                            z2 = nqoVar.c;
                            Boolean valueOf622 = Boolean.valueOf(z2);
                            if (!z2) {
                            }
                            if (valueOf622 == null) {
                            }
                            if (nqoVar instanceof nqo.p) {
                            }
                        }
                    }
                    num2 = valueOf3;
                    Integer valueOf522 = Integer.valueOf(R.drawable.vk_icon_verified_16);
                    z = nqoVar instanceof nqo.j;
                    if (z) {
                    }
                    if (z) {
                    }
                    if (nqoVar instanceof nqo.t) {
                    }
                    list2 = list;
                    if (z8) {
                    }
                    if (nqoVar instanceof nqo.a) {
                    }
                    z2 = nqoVar.c;
                    Boolean valueOf6222 = Boolean.valueOf(z2);
                    if (!z2) {
                    }
                    if (valueOf6222 == null) {
                    }
                    if (nqoVar instanceof nqo.p) {
                    }
                }
                animatedSubtitleView.setItems(arrayList4);
                Handler handler = animatedSubtitleView.d;
                if (animatedSubtitleView.getChildCount() != 1) {
                    if (!qq2.d(animatedSubtitleView.getContext())) {
                        int childCount = animatedSubtitleView.getChildCount();
                        int i10 = 0;
                        while (i10 < childCount) {
                            View childAt = animatedSubtitleView.getChildAt(i10);
                            float textSize = ((sim0) childAt).getTextSize();
                            float[] fArr = new float[2];
                            fArr[0] = -textSize;
                            fArr[i4] = 0.0f;
                            Property property = FrameLayout.TRANSLATION_Y;
                            ObjectAnimator duration = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr).setDuration(320L);
                            float[] fArr2 = new float[i4];
                            fArr2[0] = 1.0f;
                            Property property2 = FrameLayout.ALPHA;
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2).setDuration(320L);
                            float[] fArr3 = new float[i4];
                            fArr3[0] = textSize;
                            ObjectAnimator duration3 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr3).setDuration(320L);
                            duration3.setStartDelay(2400L);
                            s3q0 s3q0Var2 = s3q0.a;
                            float[] fArr4 = new float[i4];
                            fArr4[0] = 0.0f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr4);
                            int i11 = i4;
                            int i12 = i10;
                            ObjectAnimator duration4 = ofFloat.setDuration(320L);
                            duration4.setStartDelay(2400L);
                            List l2 = e43.l(duration, duration2, duration3, duration4);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(l2);
                            animatorSet.addListener(new dij0(childAt, i12 == animatedSubtitleView.getChildCount() - i11 ? i11 : 0));
                            animatedSubtitleView.c.add(animatorSet);
                            i10 = i12 + 1;
                            i4 = i11;
                        }
                        i = i4;
                        Runnable runnable = animatedSubtitleView.e;
                        if (runnable != null) {
                            handler.removeCallbacks(runnable);
                            animatedSubtitleView.e = null;
                        }
                        AnimatedSubtitleView.a aVar = animatedSubtitleView.new a();
                        animatedSubtitleView.e = aVar;
                        handler.post(aVar);
                        bwt0.p0(animatedSubtitleView, (arrayList.isEmpty() ? 1 : 0) ^ i);
                    }
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < animatedSubtitleView.getChildCount()) {
                        int i15 = i13 + 1;
                        View childAt2 = animatedSubtitleView.getChildAt(i13);
                        if (childAt2 == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        int i16 = i14 + 1;
                        if (i14 < 0) {
                            e43.t();
                            throw null;
                        }
                        childAt2.setVisibility(i14 != animatedSubtitleView.getChildCount() + (-2) ? 8 : 0);
                        i13 = i15;
                        i14 = i16;
                    }
                }
                i = 1;
                bwt0.p0(animatedSubtitleView, (arrayList.isEmpty() ? 1 : 0) ^ i);
            }
        }
    }

    public final StoryAvatarView getAvatarView() {
        return this.b;
    }

    public final View getMenuView() {
        return this.i;
    }

    public final View getOwnerLayer() {
        return this.j;
    }

    public final View getSubtitleView() {
        return this.k;
    }

    public final View getTitleView() {
        return this.g;
    }

    public final void setContainer(StoriesContainer storiesContainer) {
        ((StoryProgressView) findViewById(R.id.vrpv_progress)).c = cn70.b(2);
        this.o = new rim0(this.k, this.l, this.g, this.m, storiesContainer);
        this.n = new dmm0(storiesContainer, this.b, this.j, this.i);
    }

    public final void setOnAuthorClickListener(izs<? super View, s3q0> izsVar) {
        bwt0.i0(this.b, new a5(23, izsVar, this));
        bwt0.i0(this.g, new cq3(29, izsVar, this));
    }

    public final void setOnCloseClickListener(izs<? super View, s3q0> izsVar) {
        bwt0.i0(this.h, new ku1(28, izsVar, this));
    }

    public final void setOnMenuClickListener(izs<? super View, s3q0> izsVar) {
        bwt0.i0(this.i, new wqb(24, izsVar, this));
    }

    public final void setOwnerLayerClickListener(izs<? super View, s3q0> izsVar) {
        bwt0.i0(this.j, new lfa(20, izsVar, this));
    }

    public final void setSubtitleClickListener(izs<? super nqo, s3q0> izsVar) {
        rim0 rim0Var = this.o;
        if (rim0Var != null) {
            rim0Var.f = izsVar;
        }
    }
}
