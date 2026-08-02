package com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain;

import xsna.xcc0;

/* compiled from: PostingAuthorLoadError.kt */
/* loaded from: classes4.dex */
public final class PostingAuthorLoadException extends RuntimeException {
    private final xcc0 error;

    public PostingAuthorLoadException(xcc0 xcc0Var, Throwable th) {
        super("Posting author load error: " + xcc0Var, th);
        this.error = xcc0Var;
    }

    public final xcc0 d() {
        return this.error;
    }
}
