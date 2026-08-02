package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain;

import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;
import xsna.g620;
import xsna.p4g;

/* compiled from: PostingContentAvailabilityResolver.kt */
/* loaded from: classes4.dex */
public final class a {
    public static ListBuilder a(PostingAuthor postingAuthor) {
        boolean z;
        boolean z2;
        boolean z3;
        ListBuilder e = e43.e();
        PostingContentType postingContentType = new PostingContentType(R.drawable.vk_icon_story_outline_28, R.string.newsfeed_newpost_story, PostingContentType.Type.STORY);
        boolean z4 = postingAuthor instanceof PostingAuthor.User;
        boolean z5 = true;
        if (z4) {
            z = true;
        } else {
            if (!(postingAuthor instanceof PostingAuthor.Community)) {
                throw new NoWhenBranchMatchedException();
            }
            z = ((PostingAuthor.Community) postingAuthor).g;
        }
        p4g.a(postingContentType, e, z);
        PostingContentType postingContentType2 = new PostingContentType(R.drawable.vk_icon_write_square_outline_28, R.string.newsfeed_newpost_post, PostingContentType.Type.POST);
        if (z4) {
            z2 = true;
        } else {
            if (!(postingAuthor instanceof PostingAuthor.Community)) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = ((PostingAuthor.Community) postingAuthor).f;
        }
        p4g.a(postingContentType2, e, z2);
        PostingContentType postingContentType3 = new PostingContentType(R.drawable.vk_icon_logo_clips_outline_28, R.string.newsfeed_newpost_clip, PostingContentType.Type.CLIP);
        if (z4) {
            z3 = g620.f().getExperiments().c();
        } else {
            if (!(postingAuthor instanceof PostingAuthor.Community)) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = ((PostingAuthor.Community) postingAuthor).h && g620.f().getExperiments().c();
        }
        p4g.a(postingContentType3, e, z3);
        PostingContentType postingContentType4 = new PostingContentType(R.drawable.vk_icon_video_square_outline_28, R.string.newsfeed_newpost_video, PostingContentType.Type.VIDEO);
        if (!z4) {
            if (!(postingAuthor instanceof PostingAuthor.Community)) {
                throw new NoWhenBranchMatchedException();
            }
            z5 = ((PostingAuthor.Community) postingAuthor).i;
        }
        p4g.a(postingContentType4, e, z5);
        return e.g();
    }
}
