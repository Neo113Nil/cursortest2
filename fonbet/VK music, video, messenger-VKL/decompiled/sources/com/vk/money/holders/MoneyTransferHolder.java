package com.vk.money.holders;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.money.MoneyTransfer;
import com.vk.log.L;
import com.vk.money.ui.avatar.MoneyAvatarView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import xsna.cvk;
import xsna.d3r0;
import xsna.dhr0;
import xsna.hf8;
import xsna.i730;
import xsna.jno0;
import xsna.jx2;
import xsna.n2i0;
import xsna.p730;
import xsna.pvo0;
import xsna.rpj0;
import xsna.ucp;
import xsna.vif0;

/* loaded from: classes3.dex */
public final class MoneyTransferHolder extends vif0<MoneyTransfer> implements View.OnClickListener {
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final MoneyAvatarView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final Drawable u;

    public enum TransferType {
        TRANSFER(R.layout.money_transfer_item),
        DEBTOR(R.layout.money_transfer_for_debtor_item);

        private final int layout;

        TransferType(int i) {
            this.layout = i;
        }
    }

    public class a extends rpj0<Integer> {
        public final /* synthetic */ View d;
        public final /* synthetic */ int e;

        public a(View view, int i) {
            this.d = view;
            this.e = i;
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            View view = this.d;
            if (view == null || view.getContext() == null) {
                return;
            }
            Intent intent = new Intent("com.vkontakte.android.ACTION_MONEY_TRANSFER_CANCELLED");
            intent.putExtra("transfer_id", this.e);
            n2i0.a(view.getContext(), hf8.a, intent);
        }

        @Override // xsna.rpj0, xsna.q76, xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            super.e(vKApiExecutionException);
            cvk.u(R.string.default_network_error, false);
        }
    }

    public MoneyTransferHolder(ViewGroup viewGroup, TransferType transferType) {
        super(viewGroup, transferType.layout, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.p = (TextView) this.itemView.findViewById(R.id.info);
        this.q = (MoneyAvatarView) this.itemView.findViewById(R.id.photo);
        TextView textView = (TextView) this.itemView.findViewById(R.id.positive);
        this.r = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.negative);
        this.s = textView2;
        this.t = (TextView) this.itemView.findViewById(R.id.tv_mt_sum);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        this.itemView.setOnClickListener(this);
        this.u = dhr0.w(R.drawable.user_placeholder, viewGroup.getContext());
    }

    @Override // xsna.vif0
    public final void i6(MoneyTransfer moneyTransfer) {
        MoneyTransfer moneyTransfer2 = moneyTransfer;
        TextView textView = this.o;
        TextView textView2 = this.t;
        try {
            L.A("MoneyTransferHolder", "bind " + moneyTransfer2.toString());
            AvatarBorderType avatarBorderType = moneyTransfer2.f().Y ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
            MoneyAvatarView moneyAvatarView = this.q;
            String str = moneyTransfer2.f().h;
            Drawable drawable = this.u;
            moneyAvatarView.getClass();
            VKAvatarView.Z0(moneyAvatarView, str, drawable, avatarBorderType, null, 8);
            this.n.setText(q6());
            ucp ucpVar = ucp.a;
            boolean isEmpty = TextUtils.isEmpty(ucp.i(moneyTransfer2.o));
            textView.setText(!isEmpty ? ucp.i(moneyTransfer2.o) : "");
            textView.setVisibility(!isEmpty ? 0 : 8);
            this.p.setText(pvo0.i(false, moneyTransfer2.k, false, false));
            boolean z = moneyTransfer2.u() && moneyTransfer2.j == 0;
            boolean z2 = !moneyTransfer2.u() && moneyTransfer2.j == 0;
            TextView textView3 = this.r;
            TextView textView4 = this.s;
            if (z) {
                textView3.setVisibility(0);
                textView4.setVisibility(0);
            } else {
                textView3.setVisibility(8);
                textView4.setVisibility(8);
            }
            if (z) {
                textView4.setText(g6(R.string.money_transfer_decline));
            } else if (z2) {
                textView4.setText(g6(R.string.money_transfer_cancel));
            }
            textView2.setText(moneyTransfer2.g());
            int i = moneyTransfer2.j;
            if (i == 0) {
                jno0.c(textView2, R.attr.vk_legacy_text_secondary);
            } else if (i == 1) {
                jno0.c(textView2, R.attr.vk_legacy_text_primary);
            } else {
                if (i != 2) {
                    return;
                }
                jno0.c(textView2, R.attr.vk_legacy_destructive);
            }
        } catch (Exception e) {
            L.l("MoneyTransferHolder", e.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.s) {
            int i = ((MoneyTransfer) this.m).c;
            i730 i730Var = new i730("money.declineTransfer", 0);
            i730Var.C(i, "id");
            jx2 jx2Var = new jx2(i730Var, new a(view, i));
            jx2Var.g = view.getContext();
            jx2Var.h = 200L;
            jx2Var.a();
            return;
        }
        MoneyTransfer moneyTransfer = (MoneyTransfer) this.m;
        Activity a2 = d3r0.a(view.getContext());
        boolean u = ((MoneyTransfer) this.m).u();
        int i2 = p730.m1;
        if (moneyTransfer.f() != null && (a2 instanceof FragmentActivity)) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_transfer_info", moneyTransfer);
            bundle.putBoolean("arg_hide_history", u);
            p730 p730Var = new p730();
            p730Var.setArguments(bundle);
            p730Var.Td(((FragmentActivity) a2).getSupportFragmentManager(), "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String q6() {
        if (((MoneyTransfer) this.m).u()) {
            MoneyTransfer moneyTransfer = (MoneyTransfer) this.m;
            return h6(R.string.money_transfer_from, FriendsUtils.b(moneyTransfer.g, moneyTransfer.l ? 11 : 1));
        }
        MoneyTransfer moneyTransfer2 = (MoneyTransfer) this.m;
        return h6(R.string.money_transfer_to, FriendsUtils.b(moneyTransfer2.h, moneyTransfer2.l ? 12 : 2));
    }
}
