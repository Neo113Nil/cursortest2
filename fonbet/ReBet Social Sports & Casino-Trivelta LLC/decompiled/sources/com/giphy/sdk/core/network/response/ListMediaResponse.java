package com.giphy.sdk.core.network.response;

import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.Pagination;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/giphy/sdk/core/network/response/ListMediaResponse;", "Lcom/giphy/sdk/core/network/response/GenericResponse;", EventKeys.DATA, "", "Lcom/giphy/sdk/core/models/Media;", "pagination", "Lcom/giphy/sdk/core/models/Pagination;", "meta", "Lcom/giphy/sdk/core/models/Meta;", "(Ljava/util/List;Lcom/giphy/sdk/core/models/Pagination;Lcom/giphy/sdk/core/models/Meta;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getMeta", "()Lcom/giphy/sdk/core/models/Meta;", "setMeta", "(Lcom/giphy/sdk/core/models/Meta;)V", "getPagination", "()Lcom/giphy/sdk/core/models/Pagination;", "setPagination", "(Lcom/giphy/sdk/core/models/Pagination;)V", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListMediaResponse implements GenericResponse {

    @Nullable
    private List<Media> data;

    @Nullable
    private Meta meta;

    @Nullable
    private Pagination pagination;

    public ListMediaResponse() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final List<Media> getData() {
        return this.data;
    }

    @Nullable
    public final Meta getMeta() {
        return this.meta;
    }

    @Nullable
    public final Pagination getPagination() {
        return this.pagination;
    }

    public final void setData(@Nullable List<Media> list) {
        this.data = list;
    }

    public final void setMeta(@Nullable Meta meta) {
        this.meta = meta;
    }

    public final void setPagination(@Nullable Pagination pagination) {
        this.pagination = pagination;
    }

    public ListMediaResponse(@Nullable List<Media> list, @Nullable Pagination pagination, @Nullable Meta meta) {
        this.data = list;
        this.pagination = pagination;
        this.meta = meta;
    }

    public /* synthetic */ ListMediaResponse(List list, Pagination pagination, Meta meta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : pagination, (i10 & 4) != 0 ? null : meta);
    }
}
