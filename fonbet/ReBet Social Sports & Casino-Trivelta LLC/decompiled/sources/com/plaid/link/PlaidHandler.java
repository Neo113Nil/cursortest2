package com.plaid.link;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/PlaidHandler;", "", "()V", "open", "", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "submit", "", "submissionData", "Lcom/plaid/link/SubmissionData;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlaidHandler {
    public final boolean open(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return Plaid.INSTANCE.openLinkInternal$link_sdk_release(activity);
    }

    public final void submit(@NotNull SubmissionData submissionData) {
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        Plaid.INSTANCE.submitInternal$link_sdk_release(submissionData);
    }

    public final boolean open(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return Plaid.INSTANCE.openLinkInternal$link_sdk_release(fragment);
    }
}
