package ru.ozon.app.android.orderdetails.cancelReasons.presentation.common;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;", "", "<init>", "()V", "getComment", "Lkotlin/Function0;", "", "getGetComment", "()Lkotlin/jvm/functions/Function0;", "setGetComment", "(Lkotlin/jvm/functions/Function0;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonCommentProvider {

    @NotNull
    private Function0<String> getComment = SelectCancelReasonCommentProvider$getComment$1.INSTANCE;

    @NotNull
    public final Function0<String> getGetComment() {
        return this.getComment;
    }

    public final void setGetComment(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.getComment = function0;
    }
}
