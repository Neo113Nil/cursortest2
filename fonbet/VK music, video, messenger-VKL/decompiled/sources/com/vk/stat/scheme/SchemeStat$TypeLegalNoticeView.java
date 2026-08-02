package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.pmi0;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeLegalNoticeView implements SchemeStat$TypeView.b {

    @pmi0("notice_type")
    private final SchemeStat$LegalNoticeType noticeType;

    public SchemeStat$TypeLegalNoticeView(SchemeStat$LegalNoticeType schemeStat$LegalNoticeType) {
        this.noticeType = schemeStat$LegalNoticeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeLegalNoticeView) && this.noticeType == ((SchemeStat$TypeLegalNoticeView) obj).noticeType;
    }

    public final int hashCode() {
        return this.noticeType.hashCode();
    }

    public final String toString() {
        return "TypeLegalNoticeView(noticeType=" + this.noticeType + ')';
    }
}
