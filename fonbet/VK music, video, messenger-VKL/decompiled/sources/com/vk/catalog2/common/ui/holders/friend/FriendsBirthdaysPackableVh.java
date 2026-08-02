package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfilesList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ams;
import xsna.c5g;
import xsna.cks;
import xsna.epx;
import xsna.g1j;
import xsna.ny3;
import xsna.o0r0;
import xsna.qjc;
import xsna.wd3;
import xsna.xwk;

/* compiled from: FriendsBirthdaysPackableVh.kt */
/* loaded from: classes16.dex */
public final class FriendsBirthdaysPackableVh implements CatalogViewHolder, View.OnClickListener {
    public final cks b;
    public LinkedTextView c;
    public VKAvatarView d;
    public PhotoStackView e;
    public ImageView f;
    public ny3 g;
    public UIBlockProfilesList h;

    /* compiled from: FriendsBirthdaysPackableVh.kt */
    public static final class b implements PhotoStackView.c {
        public b() {
        }

        @Override // com.vk.core.view.PhotoStackView.c
        public final void a(int i) {
            FriendsBirthdaysPackableVh friendsBirthdaysPackableVh = FriendsBirthdaysPackableVh.this;
            UIBlockProfilesList uIBlockProfilesList = friendsBirthdaysPackableVh.h;
            if (uIBlockProfilesList != null) {
                List<UserProfile> list = uIBlockProfilesList.z;
                if (i < (list != null ? list.size() : 0)) {
                    int i2 = i + 1;
                    UserId userId = friendsBirthdaysPackableVh.h.z.get(i2).c;
                    cks cksVar = friendsBirthdaysPackableVh.b;
                    if (cksVar != null) {
                        cksVar.b(friendsBirthdaysPackableVh.h.y.get(i2), null);
                    }
                    o0r0 e = xwk.e();
                    PhotoStackView photoStackView = friendsBirthdaysPackableVh.e;
                    if (photoStackView == null) {
                        photoStackView = null;
                    }
                    Context context = photoStackView.getContext();
                    CatalogUserMeta a = FriendsBirthdaysPackableVh.a(friendsBirthdaysPackableVh.h, userId);
                    e.m(context, userId, new o0r0.a(false, "friends", a != null ? a.d : null, null, null, null, null, false, false, false, false, null, null, null, 65528));
                }
            }
        }
    }

    public FriendsBirthdaysPackableVh(cks cksVar) {
        this.b = cksVar;
    }

    public static CatalogUserMeta a(UIBlockProfilesList uIBlockProfilesList, UserId userId) {
        Object obj;
        Iterator<T> it = uIBlockProfilesList.y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((CatalogUserMeta) obj).c, userId)) {
                break;
            }
        }
        return (CatalogUserMeta) obj;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        cks cksVar;
        String str;
        UIBlockProfilesList uIBlockProfilesList = this.h;
        if (uIBlockProfilesList == null || (cksVar = this.b) == null || (str = uIBlockProfilesList.B) == null) {
            return;
        }
        cksVar.a(str, uIBlockProfilesList.b);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ny3 ny3Var = this.g;
        if (ny3Var == null) {
            ny3Var = null;
        }
        wd3 wd3Var = new wd3(15, uIBlock, this);
        if (ny3Var.c) {
            wd3Var.invoke(ny3Var);
        } else {
            ny3Var.e = wd3Var;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ny3 ny3Var = new ny3(viewGroup.getContext(), -1, -2, R.layout.catalog_friends_birthdays_packable);
        ny3Var.a(new g1j(this, 10));
        this.g = ny3Var;
        return ny3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.h == null) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.first_photo) {
            UserId userId = this.h.z.get(0).c;
            cks cksVar = this.b;
            if (cksVar != null) {
                cksVar.b(this.h.y.get(0), null);
            }
            o0r0 e = xwk.e();
            Context context = view.getContext();
            CatalogUserMeta a2 = a(this.h, userId);
            e.m(context, userId, new o0r0.a(false, "friends", a2 != null ? a2.d : null, null, null, null, null, false, false, false, false, null, null, null, 65528));
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.button) {
            if (valueOf != null && valueOf.intValue() == R.id.birthdays_layout_root) {
                ams.a().h(view.getContext());
                return;
            }
            return;
        }
        List<UserProfile> list = this.h.z;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserProfile) it.next()).c.b));
        }
        ams.a().g(view.getContext(), "friends_birthday", arrayList);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    /* compiled from: FriendsBirthdaysPackableVh.kt */
    public final class a extends qjc {
        public final CatalogUserMeta i;

        public a(CatalogUserMeta catalogUserMeta) {
            super(null);
            this.i = catalogUserMeta;
            this.b = true;
        }

        @Override // xsna.rku0
        public final void f(Context context, View view) {
            if (context == null) {
                return;
            }
            o0r0 e = xwk.e();
            CatalogUserMeta catalogUserMeta = this.i;
            e.m(context, catalogUserMeta.c, new o0r0.a(false, "friends", catalogUserMeta.d, null, null, null, null, false, false, false, false, null, null, null, 65528));
        }

        @Override // xsna.rku0
        public final void a(Context context, View view) {
        }
    }
}
