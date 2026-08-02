package ru.ozon.fintech.features.finwebview.domain.webbridge.groups.callback.models;

import G.g;
import I0.C3173b;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/webbridge/groups/callback/models/CallbackData;", "", "groupName", "", "methodName", "id", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupName", "()Ljava/lang/String;", "getMethodName", "getId", "getData", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CallbackData {
    private final String data;

    @NotNull
    private final String groupName;
    private final String id;

    @NotNull
    private final String methodName;

    public CallbackData(@i(name = "group") @NotNull String groupName, @i(name = "method") @NotNull String methodName, @i(name = "id") String str, @i(name = "data") String str2) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        this.groupName = groupName;
        this.methodName = methodName;
        this.id = str;
        this.data = str2;
    }

    public static /* synthetic */ CallbackData copy$default(CallbackData callbackData, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = callbackData.groupName;
        }
        if ((i11 & 2) != 0) {
            str2 = callbackData.methodName;
        }
        if ((i11 & 4) != 0) {
            str3 = callbackData.id;
        }
        if ((i11 & 8) != 0) {
            str4 = callbackData.data;
        }
        return callbackData.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMethodName() {
        return this.methodName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final CallbackData copy(@i(name = "group") @NotNull String groupName, @i(name = "method") @NotNull String methodName, @i(name = "id") String id2, @i(name = "data") String data) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return new CallbackData(groupName, methodName, id2, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallbackData)) {
            return false;
        }
        CallbackData callbackData = (CallbackData) other;
        return Intrinsics.d(this.groupName, callbackData.groupName) && Intrinsics.d(this.methodName, callbackData.methodName) && Intrinsics.d(this.id, callbackData.id) && Intrinsics.d(this.data, callbackData.data);
    }

    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMethodName() {
        return this.methodName;
    }

    public int hashCode() {
        int a11 = g.a(this.groupName.hashCode() * 31, 31, this.methodName);
        String str = this.id;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.groupName;
        String str2 = this.methodName;
        return C3173b.c(C3660k.d("CallbackData(groupName=", str, ", methodName=", str2, ", id="), this.id, ", data=", this.data, ")");
    }
}
