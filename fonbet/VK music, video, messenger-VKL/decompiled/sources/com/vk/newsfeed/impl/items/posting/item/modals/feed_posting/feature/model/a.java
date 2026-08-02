package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model;

import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostingAuthorUiModel.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final PostingAuthor a(PostingAuthorUiModel postingAuthorUiModel) {
        if (postingAuthorUiModel instanceof PostingAuthorUiModel.Community) {
            PostingAuthorUiModel.Community community = (PostingAuthorUiModel.Community) postingAuthorUiModel;
            return new PostingAuthor.Community(community.b, community.c, community.d, community.e, community.f, community.g, community.h, community.i);
        }
        if (!(postingAuthorUiModel instanceof PostingAuthorUiModel.User)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingAuthorUiModel.User user = (PostingAuthorUiModel.User) postingAuthorUiModel;
        return new PostingAuthor.User(user.b, user.c, user.d, user.e);
    }

    public static final PostingAuthorUiModel b(PostingAuthor postingAuthor) {
        if (postingAuthor instanceof PostingAuthor.Community) {
            return new PostingAuthorUiModel.Community((PostingAuthor.Community) postingAuthor);
        }
        if (postingAuthor instanceof PostingAuthor.User) {
            return new PostingAuthorUiModel.User((PostingAuthor.User) postingAuthor);
        }
        throw new NoWhenBranchMatchedException();
    }
}
