package com.vk.stat.scheme;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$ParsedLinksEvent {

    @pmi0("parsed_link_attachments")
    private final List<MobileOfficialAppsConPostingStat$ParsedLinkAttachment> parsedLinkAttachments;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$ParsedLinksEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$ParsedLinksEvent) && epx.f(this.parsedLinkAttachments, ((MobileOfficialAppsConPostingStat$ParsedLinksEvent) obj).parsedLinkAttachments);
    }

    public final int hashCode() {
        List<MobileOfficialAppsConPostingStat$ParsedLinkAttachment> list = this.parsedLinkAttachments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ParsedLinksEvent(parsedLinkAttachments="), this.parsedLinkAttachments);
    }

    public MobileOfficialAppsConPostingStat$ParsedLinksEvent(List<MobileOfficialAppsConPostingStat$ParsedLinkAttachment> list) {
        this.parsedLinkAttachments = list;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$ParsedLinksEvent(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
