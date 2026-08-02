package com.vk.profile.user.impl.ui.adapter;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import xsna.apq0;
import xsna.aq6;
import xsna.arq0;
import xsna.b990;
import xsna.boh;
import xsna.bpn0;
import xsna.bpq0;
import xsna.bwt0;
import xsna.cxq0;
import xsna.d7l0;
import xsna.d960;
import xsna.dhr0;
import xsna.drq0;
import xsna.duq0;
import xsna.emq0;
import xsna.eri;
import xsna.erq0;
import xsna.ggd0;
import xsna.grq0;
import xsna.hpq0;
import xsna.hrq0;
import xsna.jaa0;
import xsna.jjv0;
import xsna.jqq0;
import xsna.kex;
import xsna.khc0;
import xsna.kog;
import xsna.mf7;
import xsna.mtq0;
import xsna.ntq0;
import xsna.p6e0;
import xsna.qcy;
import xsna.rpq0;
import xsna.tf3;
import xsna.ttq0;
import xsna.uoq0;
import xsna.utq0;
import xsna.uuk;
import xsna.vif0;
import xsna.vrq0;
import xsna.vuq0;
import xsna.wih;
import xsna.woq0;
import xsna.wtq0;
import xsna.xpq0;
import xsna.xqq0;
import xsna.znq0;
import xsna.zoj0;
import xsna.zoq0;

/* compiled from: UserProfileAdapter.kt */
/* loaded from: classes5.dex */
public final class b extends zoj0<UserProfileAdapterItem, vif0<?>> implements mf7, jjv0 {
    public final hpq0 e;
    public final khc0 f;
    public final LinkedHashSet g;
    public final bpn0 h;
    public final bpn0 i;

    public b(com.vk.lists.a aVar, com.vk.profile.core.cover.a aVar2, hpq0 hpq0Var, khc0 khc0Var, UserProfileHeaderView userProfileHeaderView) {
        super(aVar);
        this.e = hpq0Var;
        this.f = khc0Var;
        this.g = new LinkedHashSet();
        this.h = new bpn0(new jaa0(aVar2, 23));
        this.i = new bpn0(new b990(userProfileHeaderView, 25));
    }

    public final void K0(Configuration configuration) {
        for (vif0 vif0Var : this.g) {
            aq6 aq6Var = vif0Var instanceof aq6 ? (aq6) vif0Var : null;
            if (aq6Var != null) {
                aq6Var.onConfigurationChanged(configuration);
            }
        }
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        uuk uukVar = this.c;
        if (i >= ((ListDataSet) uukVar).d.size()) {
            return 0;
        }
        return ((UserProfileAdapterItem) uukVar.c(i)).e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        UserProfileAdapterItem userProfileAdapterItem = (UserProfileAdapterItem) this.c.c(i);
        if (userProfileAdapterItem != null) {
            return userProfileAdapterItem.a;
        }
        return 0;
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        return (((UserProfileAdapterItem) this.c.c(i)).e() & 2) == 2 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        UserProfileAdapterItem userProfileAdapterItem = (UserProfileAdapterItem) this.c.c(i);
        if (vif0Var instanceof vrq0) {
            ((vrq0) vif0Var).V5((UserProfileAdapterItem.MainInfo) userProfileAdapterItem);
        } else if (vif0Var instanceof cxq0) {
            ((cxq0) vif0Var).V5((UserProfileAdapterItem.q) userProfileAdapterItem);
        } else {
            if (vif0Var instanceof xpq0) {
                ((xpq0) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.i ? (UserProfileAdapterItem.i) userProfileAdapterItem : null);
            } else if (vif0Var instanceof rpq0) {
                ((rpq0) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.h ? (UserProfileAdapterItem.h) userProfileAdapterItem : null);
            } else if (vif0Var instanceof duq0) {
                ((duq0) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.p ? (UserProfileAdapterItem.p) userProfileAdapterItem : null);
            } else if (vif0Var instanceof wtq0) {
                ((wtq0) vif0Var).V5((UserProfileAdapterItem.PromoButtons.a) userProfileAdapterItem);
            } else if (vif0Var instanceof utq0) {
                ((utq0) vif0Var).V5((UserProfileAdapterItem.PromoButtons.BirthdayPromo.a) userProfileAdapterItem);
            } else if (vif0Var instanceof ttq0) {
                ((ttq0) vif0Var).V5((UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip) userProfileAdapterItem);
            } else if (vif0Var instanceof ggd0) {
                ((ggd0) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.o ? (UserProfileAdapterItem.o) userProfileAdapterItem : null);
            } else if (vif0Var instanceof ntq0) {
                ((ntq0) vif0Var).V5((UserProfileAdapterItem.n) userProfileAdapterItem);
            } else if (vif0Var instanceof woq0) {
                ((woq0) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.d ? (UserProfileAdapterItem.d) userProfileAdapterItem : null);
            } else if (vif0Var instanceof vuq0) {
                ((vuq0) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.r ? (UserProfileAdapterItem.r) userProfileAdapterItem : null);
            } else if (vif0Var instanceof d960) {
                ((d960) vif0Var).V5(userProfileAdapterItem instanceof UserProfileAdapterItem.l ? (UserProfileAdapterItem.l) userProfileAdapterItem : null);
            } else if (vif0Var instanceof zoq0) {
                ((zoq0) vif0Var).V5((UserProfileAdapterItem.f) userProfileAdapterItem);
            } else if (vif0Var instanceof mtq0) {
                ((mtq0) vif0Var).V5((UserProfileAdapterItem.m) userProfileAdapterItem);
            } else if (vif0Var instanceof bpq0) {
                ((bpq0) vif0Var).V5((UserProfileAdapterItem.g) userProfileAdapterItem);
            } else if (vif0Var instanceof wih.a) {
                ((wih.a) vif0Var).V5(((UserProfileAdapterItem.b) userProfileAdapterItem).c);
            } else if (vif0Var instanceof boh.a) {
                ((boh.a) vif0Var).V5(((UserProfileAdapterItem.e) userProfileAdapterItem).c);
            } else if (vif0Var instanceof uoq0) {
                ((uoq0) vif0Var).V5((UserProfileAdapterItem.c) userProfileAdapterItem);
            } else if (vif0Var instanceof jqq0) {
                ((jqq0) vif0Var).V5((UserProfileAdapterItem.s) userProfileAdapterItem);
            } else if (vif0Var instanceof emq0) {
                ((emq0) vif0Var).V5((UserProfileAdapterItem.a) userProfileAdapterItem);
            } else if (vif0Var instanceof arq0) {
                ((arq0) vif0Var).V5((UserProfileAdapterItem.j.a) userProfileAdapterItem);
            } else if (vif0Var instanceof grq0) {
                ((grq0) vif0Var).V5((UserProfileAdapterItem.j.e) userProfileAdapterItem);
            } else if (vif0Var instanceof erq0) {
                ((erq0) vif0Var).V5((UserProfileAdapterItem.j.d) userProfileAdapterItem);
            } else if (vif0Var instanceof xqq0) {
                ((xqq0) vif0Var).V5((UserProfileAdapterItem.j.b) userProfileAdapterItem);
            } else if (vif0Var instanceof hrq0) {
                ((hrq0) vif0Var).V5((UserProfileAdapterItem.j.f) userProfileAdapterItem);
            } else if (vif0Var instanceof drq0) {
                ((drq0) vif0Var).V5((UserProfileAdapterItem.j.c) userProfileAdapterItem);
            }
        }
        this.g.add(vif0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        khc0 khc0Var = this.f;
        hpq0 hpq0Var = this.e;
        if (i == -1) {
            return eri.b(xpq0.w, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -4) {
            return eri.b(rpq0.t, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -2) {
            return eri.b(wtq0.s, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -3) {
            return eri.b(vuq0.o, viewGroup.getContext(), hpq0Var, khc0Var, 8);
        }
        if (i == -6) {
            return eri.b(ggd0.r, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -5) {
            return eri.b(ttq0.t, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        uuk uukVar = this.c;
        if (i == R.layout.item_community_full_content) {
            final d7l0 d7l0Var = new d7l0(9);
            return ((UserProfileAdapterItem.b) ((ListDataSet) uukVar).t(new Predicate() { // from class: xsna.tlq0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) d7l0.this.invoke(obj)).booleanValue();
                }
            })).c.a(viewGroup);
        }
        if (i == R.layout.community_profile_empty_content_item) {
            return ((UserProfileAdapterItem.e) ((ListDataSet) uukVar).t(new kog(new p6e0(11), 2))).c.a(viewGroup);
        }
        if (i == -7) {
            return eri.b(uoq0.p, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -8) {
            kex kexVar = new kex(viewGroup.getContext());
            kexVar.setLayoutParams(new RecyclerView.p(-1, -2));
            return new jqq0(kexVar, hpq0Var);
        }
        if (i == -9) {
            return eri.b(emq0.q, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -1000) {
            return eri.b(arq0.v, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -1001) {
            return eri.b(grq0.o, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -1002) {
            return eri.b(erq0.p, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -1003) {
            return eri.b(xqq0.p, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -1004) {
            return eri.b(hrq0.p, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        if (i == -1005) {
            return eri.b(drq0.p, viewGroup.getContext(), hpq0Var, khc0Var, 24);
        }
        View b = tf3.b(viewGroup, i, viewGroup, false);
        bpn0 bpn0Var = this.i;
        bpn0 bpn0Var2 = this.h;
        if (i == R.layout.holder_user_profile_main_info) {
            return new vrq0(b, this.e, this.f, (com.vk.profile.core.cover.a) bpn0Var2.getValue(), (UserProfileHeaderView) bpn0Var.getValue());
        }
        if (i == R.layout.holder_user_profile_content_tabs_load) {
            return new znq0(b);
        }
        if (i == R.layout.holder_user_profile_recommendations_stub) {
            return new duq0(viewGroup, hpq0Var);
        }
        if (i == R.layout.holder_user_profile_wall_selector_mode) {
            return new cxq0(b, hpq0Var);
        }
        if (i == R.layout.placeholder_empty_wall_posting) {
            return new zoq0(b, hpq0Var);
        }
        if (i == R.layout.holder_user_profile_empty_wall) {
            apq0 apq0Var = new apq0(b);
            View view = apq0Var.itemView;
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.h0(R.drawable.profile_card_bottom_rounded_background, view);
            return apq0Var;
        }
        if (i == R.layout.holder_user_profile_empty_error) {
            return new bpq0(b, khc0Var);
        }
        if (i == R.layout.item_birthday_promo) {
            return new utq0(b, hpq0Var, khc0Var);
        }
        if (i == R.layout.holder_user_profile_posting) {
            return new mtq0(b, hpq0Var);
        }
        if (i == R.layout.holder_user_profile_posting_draft) {
            return new woq0(b, hpq0Var);
        }
        if (i == R.layout.holder_user_profile_postponed) {
            return new ntq0(b, hpq0Var);
        }
        if (i == R.layout.item_new_user_onboarding) {
            return new d960(b, hpq0Var, khc0Var);
        }
        return new vrq0(b, this.e, this.f, (com.vk.profile.core.cover.a) bpn0Var2.getValue(), (UserProfileHeaderView) bpn0Var.getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        vif0 vif0Var = (vif0) e0Var;
        super.onViewRecycled(vif0Var);
        this.g.remove(vif0Var);
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
