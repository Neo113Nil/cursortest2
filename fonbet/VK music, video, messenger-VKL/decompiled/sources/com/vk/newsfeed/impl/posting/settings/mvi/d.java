package com.vk.newsfeed.impl.posting.settings.mvi;

import com.vk.newsfeed.impl.posting.settings.mvi.a;
import xsna.ptj;
import xsna.qtj;
import xsna.xn50;

/* compiled from: PostingSettingsFragmentMvi.kt */
/* loaded from: classes4.dex */
public final class d implements qtj {
    public final /* synthetic */ PostingSettingsFragmentMvi b;

    public d(PostingSettingsFragmentMvi postingSettingsFragmentMvi) {
        this.b = postingSettingsFragmentMvi;
    }

    @Override // xsna.qtj
    public final void f0(String str) {
        PostingSettingsFragmentMvi postingSettingsFragmentMvi = this.b;
        ptj ptjVar = postingSettingsFragmentMvi.S;
        if (ptjVar == null) {
            ptjVar = null;
        }
        androidx.appcompat.app.d dVar = ptjVar.c;
        if (dVar != null) {
            dVar.hide();
        }
        if (str.length() > 0) {
            xn50.a.c(postingSettingsFragmentMvi, new a.k.C1389a(str));
        }
    }
}
