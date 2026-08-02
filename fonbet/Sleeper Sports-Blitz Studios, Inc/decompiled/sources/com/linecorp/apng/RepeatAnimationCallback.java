package com.linecorp.apng;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RepeatAnimationCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/linecorp/apng/RepeatAnimationCallback;", "", "onRepeat", "", "drawable", "Lcom/linecorp/apng/ApngDrawable;", "nextLoop", "", "onAnimationRepeat", "nextLoopIndex", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface RepeatAnimationCallback {

    /* compiled from: RepeatAnimationCallback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAnimationRepeat(RepeatAnimationCallback repeatAnimationCallback, ApngDrawable drawable, int i) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
        }

        @Deprecated(message = "Use onAnimationRepeat", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static void onRepeat(RepeatAnimationCallback repeatAnimationCallback, ApngDrawable drawable, int i) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
        }
    }

    void onAnimationRepeat(ApngDrawable drawable, int nextLoopIndex);

    @Deprecated(message = "Use onAnimationRepeat", replaceWith = @ReplaceWith(expression = "", imports = {}))
    void onRepeat(ApngDrawable drawable, int nextLoop);
}
