package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "emptyError", "", "isOptional", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getEmptyError", "Z", "()Z", "getError", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BloggerPersonalDataFormInputState {

    @NotNull
    private final String emptyError;
    private final String error;
    private final boolean isOptional;

    @NotNull
    private final String value;

    public BloggerPersonalDataFormInputState() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ BloggerPersonalDataFormInputState copy$default(BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState, String str, String str2, boolean z11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bloggerPersonalDataFormInputState.value;
        }
        if ((i11 & 2) != 0) {
            str2 = bloggerPersonalDataFormInputState.emptyError;
        }
        if ((i11 & 4) != 0) {
            z11 = bloggerPersonalDataFormInputState.isOptional;
        }
        if ((i11 & 8) != 0) {
            str3 = bloggerPersonalDataFormInputState.error;
        }
        return bloggerPersonalDataFormInputState.copy(str, str2, z11, str3);
    }

    @NotNull
    public final BloggerPersonalDataFormInputState copy(@NotNull String value, @NotNull String emptyError, boolean isOptional, String error) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(emptyError, "emptyError");
        return new BloggerPersonalDataFormInputState(value, emptyError, isOptional, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloggerPersonalDataFormInputState)) {
            return false;
        }
        BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState = (BloggerPersonalDataFormInputState) other;
        return Intrinsics.d(this.value, bloggerPersonalDataFormInputState.value) && Intrinsics.d(this.emptyError, bloggerPersonalDataFormInputState.emptyError) && this.isOptional == bloggerPersonalDataFormInputState.isOptional && Intrinsics.d(this.error, bloggerPersonalDataFormInputState.error);
    }

    @NotNull
    public final String getEmptyError() {
        return this.emptyError;
    }

    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(this.value.hashCode() * 31, 31, this.emptyError), 31, this.isOptional);
        String str = this.error;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isOptional, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.emptyError;
        boolean z11 = this.isOptional;
        String str3 = this.error;
        StringBuilder d11 = C3660k.d("BloggerPersonalDataFormInputState(value=", str, ", emptyError=", str2, ", isOptional=");
        d11.append(z11);
        d11.append(", error=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    public BloggerPersonalDataFormInputState(@NotNull String value, @NotNull String emptyError, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(emptyError, "emptyError");
        this.value = value;
        this.emptyError = emptyError;
        this.isOptional = z11;
        this.error = str;
    }

    public /* synthetic */ BloggerPersonalDataFormInputState(String str, String str2, boolean z11, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str3);
    }
}
