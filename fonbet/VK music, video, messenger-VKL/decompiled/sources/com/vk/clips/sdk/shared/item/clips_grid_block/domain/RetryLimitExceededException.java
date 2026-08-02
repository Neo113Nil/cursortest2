package com.vk.clips.sdk.shared.item.clips_grid_block.domain;

/* compiled from: ClipsGridBlockInteractor.kt */
/* loaded from: classes17.dex */
public final class RetryLimitExceededException extends Exception {
    public RetryLimitExceededException() {
        this(0);
    }

    public RetryLimitExceededException(int i) {
        super("ClipsGridBlock: Maximum retry attempts exceeded");
    }
}
