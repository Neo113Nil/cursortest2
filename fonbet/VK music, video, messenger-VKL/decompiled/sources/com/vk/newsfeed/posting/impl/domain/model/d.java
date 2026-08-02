package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import java.util.Collections;
import xsna.e43;
import xsna.j5g;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class d {
    public static final PostingAction a(PostingAction postingAction, PostingAction postingAction2) {
        if (postingAction == null) {
            return postingAction2;
        }
        if (postingAction2 == null) {
            return postingAction;
        }
        boolean z = postingAction instanceof PostingAction.ComposableAction;
        return (z && (postingAction2 instanceof PostingAction.ComposableAction)) ? new PostingAction.ComposableAction(j5g.u0(((PostingAction.ComposableAction) postingAction2).b, ((PostingAction.ComposableAction) postingAction).b)) : (!z || (postingAction2 instanceof PostingAction.ComposableAction)) ? (z || !(postingAction2 instanceof PostingAction.ComposableAction)) ? new PostingAction.ComposableAction(e43.l(postingAction, postingAction2)) : new PostingAction.ComposableAction(j5g.u0(((PostingAction.ComposableAction) postingAction2).b, Collections.singletonList(postingAction))) : new PostingAction.ComposableAction(j5g.v0(postingAction2, ((PostingAction.ComposableAction) postingAction).b));
    }
}
