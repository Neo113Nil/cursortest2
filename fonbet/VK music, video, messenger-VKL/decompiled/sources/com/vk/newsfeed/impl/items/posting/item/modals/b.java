package com.vk.newsfeed.impl.items.posting.item.modals;

import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.newsfeed.impl.items.posting.item.modals.Onboarding;
import com.vk.newsfeed.impl.items.posting.item.modals.PostingType;
import com.vk.newsfeed.impl.items.posting.item.modals.a;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.aq0;
import xsna.b010;
import xsna.b410;
import xsna.b990;
import xsna.bi80;
import xsna.by20;
import xsna.dj60;
import xsna.e43;
import xsna.gd40;
import xsna.h7v;
import xsna.hk70;
import xsna.jaa0;
import xsna.ln20;
import xsna.msy;
import xsna.oq;
import xsna.pgc0;
import xsna.pp00;
import xsna.re40;
import xsna.rf20;
import xsna.rs80;
import xsna.tlo0;
import xsna.tu80;

/* compiled from: PostingItemsFactory.kt */
/* loaded from: classes4.dex */
public final class b {
    public final rs80 a;
    public final pgc0 b;
    public final h7v c;
    public final Object d;
    public final Object e;

    public b(rs80 rs80Var, pgc0 pgc0Var, h7v h7vVar) {
        this.a = rs80Var;
        this.b = pgc0Var;
        this.c = h7vVar;
        gd40 gd40Var = new gd40(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, gd40Var);
        this.e = msy.a(lazyThreadSafetyMode, new re40(this, 15));
    }

    public static a.b e(b bVar) {
        String str = bVar.a.k.a;
        return new a.b(R.drawable.vk_icon_write_square_outline_28, R.string.newsfeed_newpost_post, new aq0(10), new by20(bVar, 17), null, str != null ? new a.c(str) : null, "CreatePostButton", 16);
    }

    public final a.C1383a a() {
        return new a.C1383a(new b410(this, 16), new pp00(this, 25), this.a.j);
    }

    public final a.b b() {
        return new a.b(R.drawable.vk_icon_logo_clips_outline_28, R.string.newsfeed_newpost_clip, new ln20(this, 15), new jaa0(this, 5), null, null, "CreateClipButton", 112);
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    public final List<a> c(PostingType postingType) {
        if (postingType instanceof PostingType.a) {
            return (List) this.d.getValue();
        }
        if (postingType instanceof PostingType.b) {
            return (List) this.e.getValue();
        }
        if (!(postingType instanceof PostingType.UserRedesigned)) {
            throw new NoWhenBranchMatchedException();
        }
        ListBuilder e = e43.e();
        e.add(f());
        e.add(e(this));
        e.add(new a.b(R.drawable.vk_icon_picture_outline_28, R.string.newsfeed_newpost_photo, new aq0(10), new b990(this, 5), null, null, "CreatePhotoButton", 112));
        e.add(a());
        e.add(b());
        e.add(g(((PostingType.UserRedesigned) postingType).a == PostingType.UserRedesigned.Onboarding.Video));
        e.add(d());
        return e.g();
    }

    public final a.b d() {
        return new a.b(R.drawable.vk_icon_live_outline_28, R.string.newsfeed_newpost_live, new rf20(this, 16), new hk70(this, 8), null, null, "CreateLivesButton", 112);
    }

    public final a.b f() {
        return new a.b(R.drawable.vk_icon_story_outline_28, R.string.newsfeed_newpost_story, new tu80(this, 11), new dj60(this, 14), null, null, "CreateStoryButton", 112);
    }

    public final a.b g(boolean z) {
        Onboarding onboarding;
        String id = HintId.VIDEO_BUTTON_RELOCATION_IN_POSTING_COMMUNITY_MODAL.getId();
        h7v h7vVar = this.c;
        Hint p = h7vVar.p(id);
        Onboarding onboarding2 = null;
        if (this.a.f && p != null && h7vVar.a(id)) {
            String str = p.c;
            if (str != null) {
                onboarding2 = new Onboarding(oq.d(tlo0.Companion, str), Onboarding.ItemType.CommunityVideo);
            }
        } else if (z) {
            onboarding = new Onboarding(null, Onboarding.ItemType.UserVideo);
            return new a.b(R.drawable.vk_icon_video_square_outline_28, R.string.newsfeed_newpost_video, new bi80(this, 6), new b010(this, 28), onboarding, null, "CreateVideoButton", 80);
        }
        onboarding = onboarding2;
        return new a.b(R.drawable.vk_icon_video_square_outline_28, R.string.newsfeed_newpost_video, new bi80(this, 6), new b010(this, 28), onboarding, null, "CreateVideoButton", 80);
    }
}
