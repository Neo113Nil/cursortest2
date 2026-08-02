package ru.ozon.app.android.common.actionHandlers.shareLink;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/shareLink/ShareLinkViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareButtonRepository;", "shareButtonRepository", "<init>", "(Lru/ozon/app/android/common/actionHandlers/shareLink/ShareButtonRepository;)V", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareRequestLink;", "action", "Lkotlin/Function1;", "", "", "showLink", "onClickShare", "(Lru/ozon/app/android/common/actionHandlers/shareLink/ShareRequestLink;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/common/actionHandlers/shareLink/ShareButtonRepository;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareLinkViewModel extends w0 {

    @NotNull
    private final ShareButtonRepository shareButtonRepository;

    public ShareLinkViewModel(@NotNull ShareButtonRepository shareButtonRepository) {
        Intrinsics.checkNotNullParameter(shareButtonRepository, "shareButtonRepository");
        this.shareButtonRepository = shareButtonRepository;
    }

    public final void onClickShare(@NotNull ShareRequestLink action, @NotNull Function1<? super String, Unit> showLink) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(showLink, "showLink");
        C10727i.c(x0.a(this), null, null, new ShareLinkViewModel$onClickShare$1(showLink, this, action, null), 3);
    }
}
