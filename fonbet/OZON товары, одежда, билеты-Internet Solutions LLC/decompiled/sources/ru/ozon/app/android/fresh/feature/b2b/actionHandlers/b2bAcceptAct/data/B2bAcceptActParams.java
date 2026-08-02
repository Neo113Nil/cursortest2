package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.data;

import C.o0;
import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "", "", "postData", "", "shouldPopToRoot", "successMessage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPostData", "Z", "getShouldPopToRoot", "()Z", "getSuccessMessage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bAcceptActParams {
    private final String postData;
    private final boolean shouldPopToRoot;
    private final String successMessage;

    public B2bAcceptActParams(String str, boolean z11, String str2) {
        this.postData = str;
        this.shouldPopToRoot = z11;
        this.successMessage = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bAcceptActParams)) {
            return false;
        }
        B2bAcceptActParams b2bAcceptActParams = (B2bAcceptActParams) other;
        return Intrinsics.d(this.postData, b2bAcceptActParams.postData) && this.shouldPopToRoot == b2bAcceptActParams.shouldPopToRoot && Intrinsics.d(this.successMessage, b2bAcceptActParams.successMessage);
    }

    public final String getPostData() {
        return this.postData;
    }

    public final boolean getShouldPopToRoot() {
        return this.shouldPopToRoot;
    }

    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public int hashCode() {
        String str = this.postData;
        int a11 = C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.shouldPopToRoot);
        String str2 = this.successMessage;
        return a11 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.postData;
        boolean z11 = this.shouldPopToRoot;
        return o0.c(C4636t5.b("B2bAcceptActParams(postData=", str, ", shouldPopToRoot=", ", successMessage=", z11), this.successMessage, ")");
    }
}
