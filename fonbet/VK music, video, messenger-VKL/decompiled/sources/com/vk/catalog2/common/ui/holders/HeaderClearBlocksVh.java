package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b5a;
import xsna.brj0;
import xsna.c98;
import xsna.cfp0;
import xsna.dw20;
import xsna.epx;
import xsna.lwf0;
import xsna.oq;
import xsna.q3a;
import xsna.y280;
import xsna.yf7;

/* compiled from: HeaderClearBlocksVh.kt */
/* loaded from: classes16.dex */
public final class HeaderClearBlocksVh extends HeaderVh {
    public final q3a s;
    public final b5a t;
    public final a u;

    /* compiled from: HeaderClearBlocksVh.kt */
    public static final class a {
        public static final a c = new a(false, null);
        public final boolean a;
        public final Integer b;

        public a(boolean z, Integer num) {
            this.a = z;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Integer num = this.b;
            return Integer.hashCode(R.color.vk_red) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfirmationSettings(confirmationNeeded=");
            sb.append(this.a);
            sb.append(", themeRes=");
            return oq.b(sb, this.b, ", confirmationTextColor=2131101272)");
        }
    }

    public HeaderClearBlocksVh(q3a q3aVar, b5a b5aVar, int i) {
        this(q3aVar, b5aVar, i, a.c);
    }

    public final void b(UIBlockActionClearRecent uIBlockActionClearRecent) {
        this.s.b(new lwf0(uIBlockActionClearRecent.z), false);
        y280 y280Var = new y280(uIBlockActionClearRecent);
        b5a b5aVar = this.t;
        b5aVar.a(y280Var);
        b5aVar.a(new cfp0(uIBlockActionClearRecent, null));
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        k5.findViewById(R.id.clear_container).setOnClickListener(new c98(this, 1));
        return k5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, xsna.dw20] */
    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockHeader uIBlockHeader;
        UIBlockActionClearRecent uIBlockActionClearRecent;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.clear_container || (uIBlockHeader = this.k) == null || (uIBlockActionClearRecent = uIBlockHeader.H) == null) {
            return;
        }
        a aVar = this.u;
        if (!aVar.a) {
            b(uIBlockActionClearRecent);
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b P = new dw20.b(view.getContext(), null).P(Collections.singletonList(new brj0(0, 0, null, 0, view.getContext().getString(R.string.clear_recents), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new yf7(ref$ObjectRef, this, uIBlockActionClearRecent, 6));
        dw20.b bVar = P;
        Integer num = aVar.b;
        if (num != null) {
            bVar.u0(num.intValue());
        }
        ref$ObjectRef.element = P.I0(null);
    }

    public HeaderClearBlocksVh(q3a q3aVar, b5a b5aVar, int i, a aVar) {
        super(i, q3aVar, b5aVar, 8);
        this.s = q3aVar;
        this.t = b5aVar;
        this.u = aVar;
    }
}
