package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem {

    @pmi0("draft_id")
    private final Long draftId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("snippet_delete_reason")
    private final SnippetDeleteReason snippetDeleteReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class SnippetDeleteReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SnippetDeleteReason[] $VALUES;

        @pmi0("detect_classifieds_not_product")
        public static final SnippetDeleteReason DETECT_CLASSIFIEDS_NOT_PRODUCT;

        @pmi0("empty_message")
        public static final SnippetDeleteReason EMPTY_MESSAGE;

        @pmi0("unknown")
        public static final SnippetDeleteReason UNKNOWN;

        @pmi0("wrong_attach_added")
        public static final SnippetDeleteReason WRONG_ATTACH_ADDED;

        @pmi0("wrong_setting_added")
        public static final SnippetDeleteReason WRONG_SETTING_ADDED;

        static {
            SnippetDeleteReason snippetDeleteReason = new SnippetDeleteReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = snippetDeleteReason;
            SnippetDeleteReason snippetDeleteReason2 = new SnippetDeleteReason("EMPTY_MESSAGE", 1);
            EMPTY_MESSAGE = snippetDeleteReason2;
            SnippetDeleteReason snippetDeleteReason3 = new SnippetDeleteReason("WRONG_ATTACH_ADDED", 2);
            WRONG_ATTACH_ADDED = snippetDeleteReason3;
            SnippetDeleteReason snippetDeleteReason4 = new SnippetDeleteReason("WRONG_SETTING_ADDED", 3);
            WRONG_SETTING_ADDED = snippetDeleteReason4;
            SnippetDeleteReason snippetDeleteReason5 = new SnippetDeleteReason("DETECT_CLASSIFIEDS_NOT_PRODUCT", 4);
            DETECT_CLASSIFIEDS_NOT_PRODUCT = snippetDeleteReason5;
            SnippetDeleteReason[] snippetDeleteReasonArr = {snippetDeleteReason, snippetDeleteReason2, snippetDeleteReason3, snippetDeleteReason4, snippetDeleteReason5};
            $VALUES = snippetDeleteReasonArr;
            $ENTRIES = new asp(snippetDeleteReasonArr);
        }

        private SnippetDeleteReason(String str, int i) {
        }

        public static SnippetDeleteReason valueOf(String str) {
            return (SnippetDeleteReason) Enum.valueOf(SnippetDeleteReason.class, str);
        }

        public static SnippetDeleteReason[] values() {
            return (SnippetDeleteReason[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem(long j, Long l, SnippetDeleteReason snippetDeleteReason) {
        this.ownerId = j;
        this.draftId = l;
        this.snippetDeleteReason = snippetDeleteReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem = (SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem) obj;
        return this.ownerId == schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem.ownerId && epx.f(this.draftId, schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem.draftId) && this.snippetDeleteReason == schemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem.snippetDeleteReason;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Long l = this.draftId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        SnippetDeleteReason snippetDeleteReason = this.snippetDeleteReason;
        return hashCode2 + (snippetDeleteReason != null ? snippetDeleteReason.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem(ownerId=" + this.ownerId + ", draftId=" + this.draftId + ", snippetDeleteReason=" + this.snippetDeleteReason + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsAutorecognitionSnippetAutoDeletedClickItem(long j, Long l, SnippetDeleteReason snippetDeleteReason, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : snippetDeleteReason);
    }
}
