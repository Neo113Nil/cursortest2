package com.plaid.link;

import android.content.Context;
import android.content.Intent;
import com.plaid.internal.C3556a6;
import com.plaid.internal.L2;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import io.agora.rtc2.internal.AudioRoutingController;
import k.AbstractC5140a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/plaid/link/FastOpenPlaidLink;", "Lk/a;", "Lcom/plaid/link/PlaidHandler;", "Lcom/plaid/link/result/LinkResult;", "<init>", "()V", "Landroid/content/Context;", "context", "plaidHandler", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/plaid/link/PlaidHandler;)Landroid/content/Intent;", "", "resultCode", "result", "parseResult", "(ILandroid/content/Intent;)Lcom/plaid/link/result/LinkResult;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FastOpenPlaidLink extends AbstractC5140a {
    @Override // k.AbstractC5140a
    @NotNull
    public Intent createIntent(@NotNull Context context, @NotNull PlaidHandler plaidHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(plaidHandler, "plaidHandler");
        int i10 = LinkActivity.f40774e;
        Intrinsics.checkNotNullParameter(context, "context");
        Plaid.INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    @Override // k.AbstractC5140a
    @NotNull
    public LinkResult parseResult(int resultCode, @Nullable Intent result) {
        LinkExit b10;
        LinkExit b11;
        if (result == null) {
            C3556a6.a.b(C3556a6.f39823a, "Null result returned " + resultCode);
            b11 = L2.b(new LinkException("No result returned."), null);
            return b11;
        }
        try {
            if (resultCode == 96171) {
                LinkSuccess linkSuccess = (LinkSuccess) result.getParcelableExtra("link_result");
                Intrinsics.checkNotNull(linkSuccess);
                return linkSuccess;
            }
            LinkExit linkExit = (LinkExit) result.getParcelableExtra("link_result");
            Intrinsics.checkNotNull(linkExit);
            return linkExit;
        } catch (Throwable th2) {
            C3556a6.a.a(C3556a6.f39823a, th2, "Invalid result returned " + resultCode);
            b10 = L2.b(new LinkException("Invalid result returned, please ensure you aren't using 3364 as a request code to open other activities"), null);
            return b10;
        }
    }
}
