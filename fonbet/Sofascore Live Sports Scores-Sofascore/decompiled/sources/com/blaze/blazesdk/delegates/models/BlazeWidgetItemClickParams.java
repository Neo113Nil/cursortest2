package com.blaze.blazesdk.delegates.models;

import androidx.annotation.Keep;
import defpackage.l4a;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "", "widgetId", "", "contentIndex", "", "contentId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getContentIndex", "()I", "getContentId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeWidgetItemClickParams {
    public static final int $stable = 0;

    @NotNull
    private final String contentId;
    private final int contentIndex;

    @NotNull
    private final String widgetId;

    public BlazeWidgetItemClickParams(@NotNull String str, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.widgetId = str;
        this.contentIndex = i;
        this.contentId = str2;
    }

    public static /* synthetic */ BlazeWidgetItemClickParams copy$default(BlazeWidgetItemClickParams blazeWidgetItemClickParams, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = blazeWidgetItemClickParams.widgetId;
        }
        if ((i2 & 2) != 0) {
            i = blazeWidgetItemClickParams.contentIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = blazeWidgetItemClickParams.contentId;
        }
        return blazeWidgetItemClickParams.copy(str, i, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getContentIndex() {
        return this.contentIndex;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final BlazeWidgetItemClickParams copy(@NotNull String widgetId, int contentIndex, @NotNull String contentId) {
        widgetId.getClass();
        contentId.getClass();
        return new BlazeWidgetItemClickParams(widgetId, contentIndex, contentId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetItemClickParams)) {
            return false;
        }
        BlazeWidgetItemClickParams blazeWidgetItemClickParams = (BlazeWidgetItemClickParams) other;
        return Intrinsics.c(this.widgetId, blazeWidgetItemClickParams.widgetId) && this.contentIndex == blazeWidgetItemClickParams.contentIndex && Intrinsics.c(this.contentId, blazeWidgetItemClickParams.contentId);
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    public final int getContentIndex() {
        return this.contentIndex;
    }

    @NotNull
    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return this.contentId.hashCode() + l4a.e(this.contentIndex, this.widgetId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeWidgetItemClickParams(widgetId=");
        sb.append(this.widgetId);
        sb.append(", contentIndex=");
        sb.append(this.contentIndex);
        sb.append(", contentId=");
        return lnb.q(sb, this.contentId, ')');
    }
}
