package com.vk.catalog2.common.ui.holders;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.ui.holders.HeaderClearBlocksVh;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b5a;
import xsna.brj0;
import xsna.cfp0;
import xsna.dw20;
import xsna.enh;
import xsna.gd5;
import xsna.lwf0;
import xsna.q3a;
import xsna.y280;

/* compiled from: ComposeHeaderClearBlocksVh.kt */
/* loaded from: classes16.dex */
public final class ComposeHeaderClearBlocksVh extends ComposeHeaderVh {
    public static final /* synthetic */ int r = 0;
    public final q3a o;
    public final b5a p;
    public final HeaderClearBlocksVh.a q;

    public ComposeHeaderClearBlocksVh(q3a q3aVar, b5a b5aVar) {
        super(q3aVar, b5aVar, false, 12);
        this.o = q3aVar;
        this.p = b5aVar;
        this.q = HeaderClearBlocksVh.a.c;
    }

    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        this.h.setValue(this, ComposeHeaderVh.n[2], null);
        a().setRight(new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.b(new enh(this, 2), a().getContext().getString(R.string.close)), 3));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, xsna.dw20] */
    @Override // com.vk.catalog2.common.ui.holders.ComposeHeaderVh
    public final void b(ClickType clickType) {
        UIBlockHeader uIBlockHeader;
        UIBlockActionClearRecent uIBlockActionClearRecent;
        if (clickType != ClickType.CLOSE_ITEM || (uIBlockHeader = this.k) == null || (uIBlockActionClearRecent = uIBlockHeader.H) == null) {
            return;
        }
        HeaderClearBlocksVh.a aVar = this.q;
        if (!aVar.a) {
            d(uIBlockActionClearRecent);
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b P = new dw20.b(a().getContext(), null).P(Collections.singletonList(new brj0(0, 0, null, 0, a().getContext().getString(R.string.clear_recents), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new gd5(ref$ObjectRef, this, uIBlockActionClearRecent, 5));
        dw20.b bVar = P;
        Integer num = aVar.b;
        if (num != null) {
            bVar.u0(num.intValue());
        }
        ref$ObjectRef.element = P.I0(null);
    }

    public final void d(UIBlockActionClearRecent uIBlockActionClearRecent) {
        this.o.b(new lwf0(uIBlockActionClearRecent.z), false);
        y280 y280Var = new y280(uIBlockActionClearRecent);
        b5a b5aVar = this.p;
        b5aVar.a(y280Var);
        b5aVar.a(new cfp0(uIBlockActionClearRecent, null));
    }
}
