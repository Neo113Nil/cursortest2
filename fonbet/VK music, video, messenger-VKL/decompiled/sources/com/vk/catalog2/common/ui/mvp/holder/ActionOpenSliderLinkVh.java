package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.ActionOpenSliderVh;
import com.vk.catalog2.common.ui.mvp.util.a;
import xsna.b5a;
import xsna.cfp0;
import xsna.nda;

/* compiled from: ActionOpenSliderLinkVh.kt */
/* loaded from: classes16.dex */
public final class ActionOpenSliderLinkVh extends ActionOpenSliderVh {
    public final a e;
    public final nda f;
    public final b5a g;

    public ActionOpenSliderLinkVh(a aVar, nda ndaVar, b5a b5aVar) {
        super(null);
        this.e = aVar;
        this.f = ndaVar;
        this.g = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.ActionOpenSliderVh
    public final String a(UIBlock uIBlock) {
        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlock instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlock : null;
        if (uIBlockActionOpenUrl != null) {
            return uIBlockActionOpenUrl.z;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.ActionOpenSliderVh
    public final void b(UIBlock uIBlock, Context context) {
        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlock instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlock : null;
        if (uIBlockActionOpenUrl == null) {
            return;
        }
        this.g.a(new cfp0(uIBlockActionOpenUrl, null));
        a.e(this.e, context, uIBlockActionOpenUrl, uIBlockActionOpenUrl, this.f, 48);
    }
}
