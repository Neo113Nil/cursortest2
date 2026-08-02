package com.vk.catalog2.common.ui.mvp.holder.search;

import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cfp0;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SearchAuthorVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements izs<MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType eventType) {
        MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType eventType2 = eventType;
        SearchAuthorVh searchAuthorVh = (SearchAuthorVh) this.receiver;
        UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorVh.k;
        if (uIBlockSearchAuthor != null) {
            searchAuthorVh.c.a(new cfp0(uIBlockSearchAuthor, eventType2));
        }
        return s3q0.a;
    }
}
