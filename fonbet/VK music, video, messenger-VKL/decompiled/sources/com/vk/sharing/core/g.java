package com.vk.sharing.core;

import com.vk.core.ui.themes.ThemableActivity;
import com.vk.dto.articles.Article;
import com.vk.sharing.api.dto.AttachmentInfo;
import xsna.e810;
import xsna.gmq;
import xsna.lo7;
import xsna.lxz;
import xsna.qbj0;
import xsna.tmq;

/* compiled from: SharingFaveHelper.kt */
/* loaded from: classes5.dex */
public final class g {
    public static final void a(ThemableActivity themableActivity, Article article, AttachmentInfo attachmentInfo, com.vk.sharing.core.view.f fVar, a aVar) {
        fVar.setToggleFaveActionIsEnabled(false);
        tmq.a().d(themableActivity, article, new lo7(article, aVar, fVar, attachmentInfo), null, new e810(fVar, 28), false, attachmentInfo != null ? attachmentInfo.e : null, attachmentInfo != null ? attachmentInfo.r() : null);
    }

    public static final void b(ThemableActivity themableActivity, gmq gmqVar, AttachmentInfo attachmentInfo, com.vk.sharing.core.view.f fVar, a aVar) {
        fVar.setToggleFaveActionIsEnabled(false);
        tmq.a().h(themableActivity, gmqVar, new qbj0(aVar, fVar, attachmentInfo), null, new lxz(fVar, 29), false, attachmentInfo != null ? attachmentInfo.e : null, null, attachmentInfo != null ? attachmentInfo.r() : null);
    }
}
