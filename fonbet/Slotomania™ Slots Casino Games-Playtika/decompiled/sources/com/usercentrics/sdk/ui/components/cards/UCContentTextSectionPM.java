package com.usercentrics.sdk.ui.components.cards;

import com.usercentrics.sdk.ui.components.links.UCLinkPMLegacy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UCCardSections.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/usercentrics/sdk/ui/components/cards/UCContentTextSectionPM;", "Lcom/usercentrics/sdk/ui/components/cards/UCContentSectionPM;", "title", "", "description", "link", "Lcom/usercentrics/sdk/ui/components/links/UCLinkPMLegacy;", "tags", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/ui/components/links/UCLinkPMLegacy;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getLink", "()Lcom/usercentrics/sdk/ui/components/links/UCLinkPMLegacy;", "getTags", "()Ljava/util/List;", "getTitle", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UCContentTextSectionPM extends UCContentSectionPM {
    private final String description;
    private final UCLinkPMLegacy link;
    private final List<String> tags;
    private final String title;

    public UCContentTextSectionPM() {
        this(null, null, null, null, 15, null);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final UCLinkPMLegacy getLink() {
        return this.link;
    }

    public /* synthetic */ UCContentTextSectionPM(String str, String str2, UCLinkPMLegacy uCLinkPMLegacy, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : uCLinkPMLegacy, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCContentTextSectionPM(String str, String str2, UCLinkPMLegacy uCLinkPMLegacy, List<String> tags) {
        super(null);
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.title = str;
        this.description = str2;
        this.link = uCLinkPMLegacy;
        this.tags = tags;
    }
}
