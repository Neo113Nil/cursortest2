package com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/ArticleActionResponse;", "", StackTraceHelper.ID_KEY, "", "", "screenName", "type", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/util/List;", "getScreenName", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ArticleActionResponse {

    @c(StackTraceHelper.ID_KEY)
    @NotNull
    private final List<String> id;

    @c("screenname")
    @NotNull
    private final List<String> screenName;

    @c("type")
    @NotNull
    private final List<String> type;

    public ArticleActionResponse(@NotNull List<String> id2, @NotNull List<String> screenName, @NotNull List<String> type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.screenName = screenName;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleActionResponse copy$default(ArticleActionResponse articleActionResponse, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = articleActionResponse.id;
        }
        if ((i10 & 2) != 0) {
            list2 = articleActionResponse.screenName;
        }
        if ((i10 & 4) != 0) {
            list3 = articleActionResponse.type;
        }
        return articleActionResponse.copy(list, list2, list3);
    }

    @NotNull
    public final List<String> component1() {
        return this.id;
    }

    @NotNull
    public final List<String> component2() {
        return this.screenName;
    }

    @NotNull
    public final List<String> component3() {
        return this.type;
    }

    @NotNull
    public final ArticleActionResponse copy(@NotNull List<String> id2, @NotNull List<String> screenName, @NotNull List<String> type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ArticleActionResponse(id2, screenName, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleActionResponse)) {
            return false;
        }
        ArticleActionResponse articleActionResponse = (ArticleActionResponse) other;
        return Intrinsics.areEqual(this.id, articleActionResponse.id) && Intrinsics.areEqual(this.screenName, articleActionResponse.screenName) && Intrinsics.areEqual(this.type, articleActionResponse.type);
    }

    @NotNull
    public final List<String> getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getScreenName() {
        return this.screenName;
    }

    @NotNull
    public final List<String> getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.screenName.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "ArticleActionResponse(id=" + this.id + ", screenName=" + this.screenName + ", type=" + this.type + ')';
    }
}
