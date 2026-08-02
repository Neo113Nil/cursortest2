package com.zoho.livechat.android.modules.authentication.ui.models;

import Bd.b;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/zoho/livechat/android/modules/authentication/ui/models/SalesIQJWTAuth;", "LBd/b;", "", "token", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "setToken", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SalesIQJWTAuth extends b {

    @NotNull
    private String token;

    public SalesIQJWTAuth(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
    }

    @Override // Bd.b
    @NotNull
    public String getToken() {
        return this.token;
    }

    @Override // Bd.b
    public void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }
}
