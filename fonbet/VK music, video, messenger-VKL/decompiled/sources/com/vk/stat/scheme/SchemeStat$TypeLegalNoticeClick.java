package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.pmi0;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeLegalNoticeClick implements SchemeStat$TypeClick.b {

    @pmi0("notice_type")
    private final SchemeStat$LegalNoticeType noticeType;

    public SchemeStat$TypeLegalNoticeClick(SchemeStat$LegalNoticeType schemeStat$LegalNoticeType) {
        this.noticeType = schemeStat$LegalNoticeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeLegalNoticeClick) && this.noticeType == ((SchemeStat$TypeLegalNoticeClick) obj).noticeType;
    }

    public final int hashCode() {
        return this.noticeType.hashCode();
    }

    public final String toString() {
        return "TypeLegalNoticeClick(noticeType=" + this.noticeType + ')';
    }
}
