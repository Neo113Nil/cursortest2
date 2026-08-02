package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.Locale;
import xsna.b25;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.d10;
import xsna.da;
import xsna.dhr0;
import xsna.e4h;
import xsna.ea;
import xsna.gzs;
import xsna.izs;
import xsna.k7a;
import xsna.m33;
import xsna.nof0;
import xsna.o0r0;
import xsna.o25;
import xsna.q3a;
import xsna.s00;
import xsna.t00;
import xsna.t6;
import xsna.u00;
import xsna.uqm0;
import xsna.v00;
import xsna.w00;
import xsna.x00;
import xsna.xwk;
import xsna.y00;
import xsna.z00;

/* compiled from: ActionFollowVh.kt */
/* loaded from: classes16.dex */
public final class ActionFollowVh extends ActionVh {
    public final q3a b;
    public final k7a c;
    public final b5a d;
    public final SearchStatInfoProvider e;
    public final gzs<MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source> f;
    public final gzs<FullSourceJoinApi> g;
    public TextView h;
    public ImageView i;
    public TextView j;
    public ImageView k;
    public VKAvatarView l;
    public UIBlockActionFollow m;
    public io.reactivex.rxjava3.disposables.c n;

    public /* synthetic */ ActionFollowVh(q3a q3aVar, k7a k7aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this(q3aVar, k7aVar, b5aVar, searchStatInfoProvider, null, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.n.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionFollow uIBlockActionFollow = uIBlock instanceof UIBlockActionFollow ? (UIBlockActionFollow) uIBlock : null;
        this.m = uIBlockActionFollow;
        if (uIBlockActionFollow == null) {
            return;
        }
        UserProfile userProfile = uIBlockActionFollow.A;
        k7a k7aVar = this.c;
        if (userProfile != null) {
            if (userProfile.K > 0) {
                TextView textView = this.h;
                if (textView == null) {
                    textView = null;
                }
                Resources resources = textView.getResources();
                int i = userProfile.K;
                String quantityString = resources.getQuantityString(R.plurals.followers_count, i, uqm0.f(i));
                if (userProfile.r == null) {
                    TextView textView2 = this.j;
                    if (textView2 != null) {
                        textView2.setText(quantityString);
                    }
                } else {
                    TextView textView3 = this.j;
                    if (textView3 != null) {
                        TextView textView4 = this.h;
                        if (textView4 == null) {
                            textView4 = null;
                        }
                        textView3.setText(textView4.getResources().getString(R.string.two_strings_concatenation, userProfile.r, quantityString));
                    }
                }
            } else {
                TextView textView5 = this.j;
                if (textView5 != null) {
                    textView5.setText(userProfile.r);
                }
            }
            TextView textView6 = this.h;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setText(userProfile.e);
            VKAvatarView vKAvatarView = this.l;
            if (vKAvatarView == null) {
                vKAvatarView = null;
            }
            k7aVar.b(vKAvatarView, ContentType.PROFILE, uIBlock.e, uIBlock.d, -1.0f);
            VKAvatarView vKAvatarView2 = this.l;
            VKAvatarView.Z0(vKAvatarView2 == null ? null : vKAvatarView2, userProfile.h, null, userProfile.Y ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 10);
            VerifyInfo verifyInfo = userProfile.B;
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            ImageView imageView = this.i;
            VerifyInfoHelper.k(imageView == null ? null : imageView, false, verifyInfo, false, false, 56);
        }
        Group group = uIBlockActionFollow.z;
        if (group != null) {
            if (group.v > 0) {
                TextView textView7 = this.h;
                if (textView7 == null) {
                    textView7 = null;
                }
                Resources resources2 = textView7.getResources();
                int i2 = group.v;
                String quantityString2 = resources2.getQuantityString(R.plurals.members_count, i2, uqm0.f(i2));
                if (group.z == null) {
                    TextView textView8 = this.j;
                    if (textView8 != null) {
                        textView8.setText(quantityString2);
                    }
                } else {
                    TextView textView9 = this.j;
                    if (textView9 != null) {
                        TextView textView10 = this.h;
                        if (textView10 == null) {
                            textView10 = null;
                        }
                        textView9.setText(textView10.getResources().getString(R.string.two_strings_concatenation, group.z, quantityString2));
                    }
                }
            } else {
                TextView textView11 = this.j;
                if (textView11 != null) {
                    textView11.setText(group.z);
                }
            }
            TextView textView12 = this.h;
            if (textView12 == null) {
                textView12 = null;
            }
            textView12.setText(group.d);
            VKAvatarView vKAvatarView3 = this.l;
            if (vKAvatarView3 == null) {
                vKAvatarView3 = null;
            }
            k7aVar.b(vKAvatarView3, ContentType.GROUP, uIBlock.e, uIBlock.d, -1.0f);
            VKAvatarView vKAvatarView4 = this.l;
            VKAvatarView.Z0(vKAvatarView4 == null ? null : vKAvatarView4, group.e, null, group.n0 ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 10);
            VerifyInfo verifyInfo2 = group.y;
            VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
            ImageView imageView2 = this.i;
            VerifyInfoHelper.k(imageView2 == null ? null : imageView2, false, verifyInfo2, false, false, 56);
        }
        a(uIBlockActionFollow.U());
    }

    public final void a(boolean z) {
        if (z) {
            int c = dhr0.t.c(R.attr.vk_ui_icon_secondary);
            ImageView imageView = this.k;
            if (imageView == null) {
                imageView = null;
            }
            Drawable a = m33.a(R.drawable.vk_icon_user_added_outline_24, imageView.getContext());
            a.setTint(c);
            ImageView imageView2 = this.k;
            (imageView2 != null ? imageView2 : null).setImageDrawable(a);
            return;
        }
        int c2 = dhr0.t.c(R.attr.vk_ui_icon_accent);
        ImageView imageView3 = this.k;
        if (imageView3 == null) {
            imageView3 = null;
        }
        Drawable a2 = m33.a(R.drawable.vk_icon_user_add_outline_24, imageView3.getContext());
        a2.setTint(c2);
        ImageView imageView4 = this.k;
        (imageView4 != null ? imageView4 : null).setImageDrawable(a2);
    }

    public final io.reactivex.rxjava3.disposables.c b(q<Boolean> qVar, View view, UIBlockActionFollow uIBlockActionFollow, boolean z, Group group) {
        t00 t00Var = new t00(new d10(view, 0), 0);
        qVar.getClass();
        m1 a0 = new a0(new c0(qVar, t00Var, io.reactivex.rxjava3.internal.functions.a.c), new u00(view, 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        w00 w00Var = new w00(new v00(z, this, group, uIBlockActionFollow), 0);
        int i = 0;
        return a0.subscribe(w00Var, new y00(new x00(this, view, i), i));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_subscribe_list_item, viewGroup, false);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (ImageView) inflate.findViewById(R.id.icon_meta);
        this.j = (TextView) inflate.findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.subscribe);
        imageView.setOnClickListener(new c98(new z00(this, 0), 1));
        this.k = imageView;
        this.l = (VKAvatarView) inflate.findViewById(R.id.icon);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source invoke;
        String name;
        final UIBlockActionFollow uIBlockActionFollow = this.m;
        if (uIBlockActionFollow == null) {
            return;
        }
        UserId userId = uIBlockActionFollow.g;
        int id = view.getId();
        b5a b5aVar = this.d;
        if (id == R.id.subscribe) {
            UserProfile userProfile = uIBlockActionFollow.A;
            final Group group = uIBlockActionFollow.z;
            final boolean U = uIBlockActionFollow.U();
            b5aVar.a(new cfp0(uIBlockActionFollow, new SearchAuthorAnalyticsInfo(U ? SearchAuthorAnalyticsInfo.ClickTarget.Unsubscribe : SearchAuthorAnalyticsInfo.ClickTarget.Subscribe)));
            if (userProfile != null) {
                int i = userProfile.v;
                m1 a0 = xwk.e().q(userId, U).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                s00 s00Var = new s00(userProfile, i, this, uIBlockActionFollow, U, view);
                uIBlockActionFollow = uIBlockActionFollow;
                this.n = a0.subscribe(new da(s00Var, 1), new ea(new t6(this, view), 1));
            } else if (group != null) {
                gzs<FullSourceJoinApi> gzsVar = this.g;
                FullSourceJoinApi invoke2 = gzsVar != null ? gzsVar.invoke() : null;
                b25 a = o25.a();
                view.getContext();
                a.getClass();
                final UserId userId2 = uIBlockActionFollow.g;
                gzs<MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source> gzsVar2 = this.f;
                String lowerCase = (gzsVar2 == null || (invoke = gzsVar2.invoke()) == null || (name = invoke.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
                if (U) {
                    e4h h0 = xwk.e().h0();
                    Context context = view.getContext();
                    final String str = lowerCase;
                    izs izsVar = new izs() { // from class: xsna.c10
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            io.reactivex.rxjava3.core.q<Boolean> e = o0r0.e(xwk.e(), userId2, null, str, (AdminLeaveAction) obj, 2);
                            ActionFollowVh actionFollowVh = ActionFollowVh.this;
                            actionFollowVh.n = actionFollowVh.b(e, view, uIBlockActionFollow, U, group);
                            return s3q0.a;
                        }
                    };
                    uIBlockActionFollow = uIBlockActionFollow;
                    e4h.l(h0, context, userId2, izsVar, group, 16);
                } else {
                    this.n = b(xwk.e().s(userId2, lowerCase, invoke2), view, uIBlockActionFollow, U, group);
                }
            }
        } else {
            b5aVar.a(new cfp0(uIBlockActionFollow, new SearchAuthorAnalyticsInfo(SearchAuthorAnalyticsInfo.ClickTarget.Open)));
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
            String str2 = uIBlockActionFollow.B;
            if (str2 == null) {
                str2 = "";
            }
            xwk.e().m(view.getContext(), userId, new o0r0.a(false, "", null, null, this.e.b(type, str2, false), null, null, false, false, false, false, null, null, null, 65516));
        }
        b5aVar.a(new cfp0(uIBlockActionFollow, null));
    }

    public ActionFollowVh(q3a q3aVar, k7a k7aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, nof0 nof0Var, gzs gzsVar) {
        this.b = q3aVar;
        this.c = k7aVar;
        this.d = b5aVar;
        this.e = searchStatInfoProvider;
        this.f = nof0Var;
        this.g = gzsVar;
        this.n = EmptyDisposable.INSTANCE;
    }
}
