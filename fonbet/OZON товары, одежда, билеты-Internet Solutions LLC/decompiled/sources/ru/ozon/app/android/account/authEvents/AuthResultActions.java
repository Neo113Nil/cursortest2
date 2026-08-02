package ru.ozon.app.android.account.authEvents;

import D40.c;
import N3.C3660k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u0010R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\"\u0010!R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/account/authEvents/AuthResultActions;", "", "", "startDeeplink", "successRedirectDeeplink", "", "successRedirectProperties", "failureRedirectDeeplink", "Lkotlin/Function0;", "", "onSuccess", "onCancel", "onFinal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartDeeplink", "getSuccessRedirectDeeplink", "Ljava/util/Map;", "getSuccessRedirectProperties", "()Ljava/util/Map;", "getFailureRedirectDeeplink", "Lkotlin/jvm/functions/Function0;", "getOnSuccess", "()Lkotlin/jvm/functions/Function0;", "getOnCancel", "getOnFinal", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthResultActions {
    private final String failureRedirectDeeplink;
    private final Function0<Unit> onCancel;
    private final Function0<Unit> onFinal;
    private final Function0<Unit> onSuccess;
    private final String startDeeplink;
    private final String successRedirectDeeplink;

    @NotNull
    private final Map<String, Object> successRedirectProperties;

    public AuthResultActions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthResultActions)) {
            return false;
        }
        AuthResultActions authResultActions = (AuthResultActions) other;
        return Intrinsics.d(this.startDeeplink, authResultActions.startDeeplink) && Intrinsics.d(this.successRedirectDeeplink, authResultActions.successRedirectDeeplink) && Intrinsics.d(this.successRedirectProperties, authResultActions.successRedirectProperties) && Intrinsics.d(this.failureRedirectDeeplink, authResultActions.failureRedirectDeeplink) && Intrinsics.d(this.onSuccess, authResultActions.onSuccess) && Intrinsics.d(this.onCancel, authResultActions.onCancel) && Intrinsics.d(this.onFinal, authResultActions.onFinal);
    }

    public final String getFailureRedirectDeeplink() {
        return this.failureRedirectDeeplink;
    }

    public final Function0<Unit> getOnCancel() {
        return this.onCancel;
    }

    public final Function0<Unit> getOnFinal() {
        return this.onFinal;
    }

    public final Function0<Unit> getOnSuccess() {
        return this.onSuccess;
    }

    public final String getStartDeeplink() {
        return this.startDeeplink;
    }

    public final String getSuccessRedirectDeeplink() {
        return this.successRedirectDeeplink;
    }

    @NotNull
    public final Map<String, Object> getSuccessRedirectProperties() {
        return this.successRedirectProperties;
    }

    public int hashCode() {
        String str = this.startDeeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.successRedirectDeeplink;
        int a11 = c.a(this.successRedirectProperties, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.failureRedirectDeeplink;
        int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int hashCode3 = (hashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Unit> function02 = this.onCancel;
        int hashCode4 = (hashCode3 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0<Unit> function03 = this.onFinal;
        return hashCode4 + (function03 != null ? function03.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.startDeeplink;
        String str2 = this.successRedirectDeeplink;
        Map<String, Object> map = this.successRedirectProperties;
        String str3 = this.failureRedirectDeeplink;
        Function0<Unit> function0 = this.onSuccess;
        Function0<Unit> function02 = this.onCancel;
        Function0<Unit> function03 = this.onFinal;
        StringBuilder d11 = C3660k.d("AuthResultActions(startDeeplink=", str, ", successRedirectDeeplink=", str2, ", successRedirectProperties=");
        d11.append(map);
        d11.append(", failureRedirectDeeplink=");
        d11.append(str3);
        d11.append(", onSuccess=");
        d11.append(function0);
        d11.append(", onCancel=");
        d11.append(function02);
        d11.append(", onFinal=");
        d11.append(function03);
        d11.append(")");
        return d11.toString();
    }

    public AuthResultActions(String str, String str2, @NotNull Map<String, ? extends Object> successRedirectProperties, String str3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(successRedirectProperties, "successRedirectProperties");
        this.startDeeplink = str;
        this.successRedirectDeeplink = str2;
        this.successRedirectProperties = successRedirectProperties;
        this.failureRedirectDeeplink = str3;
        this.onSuccess = function0;
        this.onCancel = function02;
        this.onFinal = function03;
    }

    public /* synthetic */ AuthResultActions(String str, String str2, Map map, String str3, Function0 function0, Function0 function02, Function0 function03, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? U.c() : map, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : function0, (i11 & 32) != 0 ? null : function02, (i11 & 64) != 0 ? null : function03);
    }
}
