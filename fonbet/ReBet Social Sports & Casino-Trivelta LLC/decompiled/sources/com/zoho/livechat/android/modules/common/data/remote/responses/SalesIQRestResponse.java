package com.zoho.livechat.android.modules.common.data.remote.responses;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\"\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJH\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R \u0010\u0006\u001a\u00028\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018¨\u0006,"}, d2 = {"Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "ResultType", "", EventKeys.URL, "", "responseObject", EventKeys.DATA, "moreDataAvailable", "", "syncTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Long;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getMoreDataAvailable", "()Z", "setMoreDataAvailable", "(Z)V", "getResponseObject", "()Ljava/lang/String;", "setResponseObject", "(Ljava/lang/String;)V", "getSyncTime", "()Ljava/lang/Long;", "setSyncTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Long;)Lcom/zoho/livechat/android/modules/common/data/remote/responses/SalesIQRestResponse;", "equals", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SalesIQRestResponse<ResultType> {

    @c(EventKeys.DATA)
    private ResultType data;

    @c("more_data_available")
    private boolean moreDataAvailable;

    @c("object")
    @NotNull
    private String responseObject;

    @c("sync_time")
    @Nullable
    private Long syncTime;

    @c(EventKeys.URL)
    @NotNull
    private String url;

    public SalesIQRestResponse(@NotNull String url, @NotNull String responseObject, ResultType resulttype, boolean z10, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseObject, "responseObject");
        this.url = url;
        this.responseObject = responseObject;
        this.data = resulttype;
        this.moreDataAvailable = z10;
        this.syncTime = l10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SalesIQRestResponse copy$default(SalesIQRestResponse salesIQRestResponse, String str, String str2, Object obj, boolean z10, Long l10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = salesIQRestResponse.url;
        }
        if ((i10 & 2) != 0) {
            str2 = salesIQRestResponse.responseObject;
        }
        ResultType resulttype = obj;
        if ((i10 & 4) != 0) {
            resulttype = salesIQRestResponse.data;
        }
        if ((i10 & 8) != 0) {
            z10 = salesIQRestResponse.moreDataAvailable;
        }
        if ((i10 & 16) != 0) {
            l10 = salesIQRestResponse.syncTime;
        }
        Long l11 = l10;
        ResultType resulttype2 = resulttype;
        return salesIQRestResponse.copy(str, str2, resulttype2, z10, l11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getResponseObject() {
        return this.responseObject;
    }

    public final ResultType component3() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMoreDataAvailable() {
        return this.moreDataAvailable;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getSyncTime() {
        return this.syncTime;
    }

    @NotNull
    public final SalesIQRestResponse<ResultType> copy(@NotNull String url, @NotNull String responseObject, ResultType data, boolean moreDataAvailable, @Nullable Long syncTime) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(responseObject, "responseObject");
        return new SalesIQRestResponse<>(url, responseObject, data, moreDataAvailable, syncTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesIQRestResponse)) {
            return false;
        }
        SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) other;
        return Intrinsics.areEqual(this.url, salesIQRestResponse.url) && Intrinsics.areEqual(this.responseObject, salesIQRestResponse.responseObject) && Intrinsics.areEqual(this.data, salesIQRestResponse.data) && this.moreDataAvailable == salesIQRestResponse.moreDataAvailable && Intrinsics.areEqual(this.syncTime, salesIQRestResponse.syncTime);
    }

    public final ResultType getData() {
        return this.data;
    }

    public final boolean getMoreDataAvailable() {
        return this.moreDataAvailable;
    }

    @NotNull
    public final String getResponseObject() {
        return this.responseObject;
    }

    @Nullable
    public final Long getSyncTime() {
        return this.syncTime;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.responseObject.hashCode()) * 31;
        ResultType resulttype = this.data;
        int hashCode2 = (hashCode + (resulttype == null ? 0 : resulttype.hashCode())) * 31;
        boolean z10 = this.moreDataAvailable;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        Long l10 = this.syncTime;
        return i11 + (l10 != null ? l10.hashCode() : 0);
    }

    public final void setData(ResultType resulttype) {
        this.data = resulttype;
    }

    public final void setMoreDataAvailable(boolean z10) {
        this.moreDataAvailable = z10;
    }

    public final void setResponseObject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.responseObject = str;
    }

    public final void setSyncTime(@Nullable Long l10) {
        this.syncTime = l10;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "SalesIQRestResponse(url=" + this.url + ", responseObject=" + this.responseObject + ", data=" + this.data + ", moreDataAvailable=" + this.moreDataAvailable + ", syncTime=" + this.syncTime + ')';
    }

    public /* synthetic */ SalesIQRestResponse(String str, String str2, Object obj, boolean z10, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, obj, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : l10);
    }
}
