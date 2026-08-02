package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityPerson;
import com.vk.catalog2.common.dto.api.style.SearchEntityCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchEntityPersonAnswerVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.music.player.PlayState;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ap0;
import xsna.ayv0;
import xsna.b5a;
import xsna.cfp0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.fha;
import xsna.fkq0;
import xsna.j5g;
import xsna.js5;
import xsna.la;
import xsna.m3a;
import xsna.mcc0;
import xsna.myc0;
import xsna.n14;
import xsna.o0r0;
import xsna.oap;
import xsna.odu0;
import xsna.og8;
import xsna.q3a;
import xsna.u2b0;
import xsna.xwk;

/* compiled from: SearchEntityPersonAnswerVh.kt */
/* loaded from: classes16.dex */
public final class SearchEntityPersonAnswerVh implements CatalogViewHolder {
    public final b5a b;
    public final q3a c;
    public final m3a d;
    public final SearchStatInfoProvider e;
    public final mcc0 f;
    public final u2b0 g;
    public final int h;
    public VkText i;
    public VkText j;
    public View k;
    public VkUserStack l;
    public VkText m;
    public VkAvatar n;
    public View o;
    public VkButton p;
    public VkButton q;
    public UIBlockSearchEntityPerson r;
    public io.reactivex.rxjava3.disposables.c s;
    public final a t = new a();

    /* compiled from: SearchEntityPersonAnswerVh.kt */
    public static final class a extends e.a {
        public a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, f fVar) {
            SearchEntityPersonAnswerVh.this.b();
        }
    }

    public SearchEntityPersonAnswerVh(b5a b5aVar, q3a q3aVar, m3a m3aVar, SearchStatInfoProvider searchStatInfoProvider, mcc0 mcc0Var, u2b0 u2b0Var, int i) {
        this.b = b5aVar;
        this.c = q3aVar;
        this.d = m3aVar;
        this.e = searchStatInfoProvider;
        this.f = mcc0Var;
        this.g = u2b0Var;
        this.h = i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.g.n0(this.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        boolean M;
        String str;
        boolean z;
        if (uIBlock instanceof UIBlockSearchEntityPerson) {
            UIBlockSearchEntityPerson uIBlockSearchEntityPerson = (UIBlockSearchEntityPerson) uIBlock;
            final oap<UserProfile, Group> oapVar = uIBlockSearchEntityPerson.C;
            CatalogSearchEntityPerson catalogSearchEntityPerson = uIBlockSearchEntityPerson.y;
            this.r = uIBlockSearchEntityPerson;
            boolean z2 = ((SearchEntityCatalogViewStyle) uIBlock.l).b == SearchEntityCatalogViewStyle.EntityStyle.Flat;
            View view = this.k;
            Drawable drawable = null;
            if (view != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(catalogSearchEntityPerson.h);
                sb.append(" ");
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfo verifyInfo = catalogSearchEntityPerson.f;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                sb.append(VerifyInfoHelper.c(context, verifyInfo));
                sb.append(" ");
                String str2 = catalogSearchEntityPerson.i;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(" ");
                if (this.m != null) {
                    sb.append(" ");
                    String str3 = catalogSearchEntityPerson.l;
                    sb.append(str3 != null ? str3 : "");
                }
                view.setContentDescription(sb.toString());
            }
            VkText vkText = this.i;
            if (vkText != null) {
                vkText.setText(catalogSearchEntityPerson.h);
            }
            VkText vkText2 = this.j;
            if (vkText2 != null) {
                vkText2.setVisibility(catalogSearchEntityPerson.i != null ? 0 : 8);
            }
            VkText vkText3 = this.j;
            if (vkText3 != null) {
                vkText3.setText(catalogSearchEntityPerson.i);
            }
            final VkAvatar vkAvatar = this.n;
            if (vkAvatar != null) {
                Image image = catalogSearchEntityPerson.e;
                if (image != null) {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    str = Owner.a.a(e3m.a(R.dimen.catalog_link_small_content_item_size_nft, vkAvatar.getContext()), image);
                } else {
                    str = null;
                }
                boolean z3 = oapVar instanceof oap.b;
                if (z3) {
                    boolean z4 = ((Group) ((oap.b) oapVar).a).n0;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z5 = ((UserProfile) ((oap.a) oapVar).a).Y;
                }
                if (z3) {
                    z = ((Group) ((oap.b) oapVar).a).U;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((UserProfile) ((oap.a) oapVar).a).T;
                }
                if (str != null) {
                    vkAvatar.setVisibility(0);
                    vkAvatar.setBorder(z ? new odu0() : null);
                    vkAvatar.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
                    vkAvatar.o0(str, null);
                } else {
                    vkAvatar.setVisibility(8);
                }
                if (z) {
                    vkAvatar.setContentDescription(vkAvatar.getResources().getString(R.string.accessibility_catalog_story_at_avatar));
                    vkAvatar.setOnClickListener(new View.OnClickListener() { // from class: xsna.pqh0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            StoryOwner user;
                            SearchEntityAnswerAnalyticsInfo.ClickTarget clickTarget = SearchEntityAnswerAnalyticsInfo.ClickTarget.ShowStory;
                            SearchEntityPersonAnswerVh searchEntityPersonAnswerVh = SearchEntityPersonAnswerVh.this;
                            searchEntityPersonAnswerVh.c(clickTarget);
                            m3a m3aVar = searchEntityPersonAnswerVh.d;
                            oap oapVar2 = oapVar;
                            if (oapVar2 instanceof oap.b) {
                                user = new StoryOwner.Community((Group) ((oap.b) oapVar2).a, null, 2, null);
                            } else {
                                if (!(oapVar2 instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                user = new StoryOwner.User((UserProfile) ((oap.a) oapVar2).a, null, 2, null);
                            }
                            StoryOwner storyOwner = user;
                            MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR;
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            VkAvatar vkAvatar2 = vkAvatar;
                            m3aVar.j(new fha.a(vkAvatar2, storyOwner, mobileOfficialAppsConStoriesStat$ViewEntryPoint, c, new jl4(19, searchEntityPersonAnswerVh, vkAvatar2)));
                        }
                    });
                } else {
                    vkAvatar.setClickable(false);
                }
            }
            VkUserStack vkUserStack = this.l;
            if (vkUserStack != null) {
                List<UserProfile> list = uIBlockSearchEntityPerson.z;
                String str4 = catalogSearchEntityPerson.k;
                String str5 = catalogSearchEntityPerson.l;
                List<UserProfile> list2 = list;
                if (list2 == null || list2.isEmpty() || str4 == null || str4.length() == 0) {
                    vkUserStack.setVisibility(8);
                } else {
                    vkUserStack.setVisibility(0);
                    List H0 = list != null ? j5g.H0(list, Math.min(list != null ? list.size() : 0, 3)) : null;
                    VkUserStack vkUserStack2 = this.l;
                    if (vkUserStack2 != null && H0 != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = H0.iterator();
                        while (it.hasNext()) {
                            String a2 = js5.a(vkUserStack2.getHeight(), ((UserProfile) it.next()).g);
                            ayv0.c cVar2 = a2 != null ? new ayv0.c(a2) : null;
                            if (cVar2 != null) {
                                arrayList.add(cVar2);
                            }
                        }
                        vkUserStack2.setAvatars(arrayList);
                    }
                }
                VkText vkText4 = this.m;
                if (vkText4 != null) {
                    vkText4.setVisibility((myc0.f(str4) || myc0.f(str5)) ? 0 : 8);
                    if (myc0.f(str4) && myc0.f(str5)) {
                        vkText4.setText(vkText4.getContext().getString(R.string.group_friends_with_members_count, str4, str5));
                    } else if (myc0.f(str4)) {
                        vkText4.setText(str4);
                    } else if (myc0.f(str5)) {
                        vkText4.setText(str5);
                    }
                }
            }
            VkButton vkButton = this.q;
            boolean z6 = (vkButton == null || uIBlockSearchEntityPerson.B == null) ? false : true;
            if (vkButton != null) {
                vkButton.setVisibility(z6 ? 0 : 8);
                if (z6) {
                    this.g.P0(this.t, false);
                    b();
                }
            }
            VkButton vkButton2 = this.p;
            if (vkButton2 != null) {
                UIBlockActionFollow uIBlockActionFollow = uIBlockSearchEntityPerson.A;
                if (oapVar instanceof oap.b) {
                    Group group = (Group) ((oap.b) oapVar).a;
                    M = group.j || group.C == 4;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    M = ((UserProfile) ((oap.a) oapVar).a).M();
                }
                int i = (z2 && M) ? R.drawable.vk_icon_done_16 : z2 ? R.drawable.vk_icon_add_16 : M ? R.drawable.vk_icon_done_24 : R.drawable.vk_icon_add_square_outline_24;
                vkButton2.setVisibility(uIBlockActionFollow != null ? 0 : 8);
                if (uIBlockActionFollow != null) {
                    int i2 = R.string.search_entity_answer_not_subscribed;
                    int i3 = M ? R.string.search_entity_answer_subscribed : R.string.search_entity_answer_not_subscribed;
                    Integer valueOf = Integer.valueOf(i);
                    int[] iArr = VkButton.W;
                    vkButton2.a5(true, valueOf);
                    vkButton2.setText(z6 ? null : vkButton2.getContext().getResources().getString(i3));
                    if (M) {
                        i2 = R.string.search_entity_answer_subscribed_accessibility;
                    }
                    vkButton2.setContentDescription(vkButton2.getContext().getResources().getString(i2));
                    vkButton2.setOnClickListener(new la(this, 10));
                }
            }
            View view2 = this.o;
            if (view2 != null) {
                view2.setVisibility(8);
                Context context2 = view2.getContext();
                VerifyInfo verifyInfo2 = catalogSearchEntityPerson.f;
                if (verifyInfo2 != null) {
                    if (verifyInfo2.Cb() && z2) {
                        drawable = VerifyInfoHelper.j(VerifyInfoHelper.a, context2, verifyInfo2, false, null, 12);
                    } else if (verifyInfo2.Cb()) {
                        drawable = VerifyInfoHelper.i(context2, verifyInfo2);
                    }
                    view2.setBackground(drawable);
                    view2.setVisibility(drawable == null ? 8 : 0);
                }
            }
            View view3 = this.k;
            if (view3 != null) {
                view3.setOnClickListener(new n14(this, 6));
            }
        }
    }

    public final void a(Context context) {
        UIBlockSearchEntityPerson uIBlockSearchEntityPerson = this.r;
        if (uIBlockSearchEntityPerson == null) {
            return;
        }
        CatalogSearchEntityPerson catalogSearchEntityPerson = uIBlockSearchEntityPerson.y;
        String str = catalogSearchEntityPerson.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        UserId userId = catalogSearchEntityPerson.c;
        this.c.b(new ap0(userId), false);
        c(SearchEntityAnswerAnalyticsInfo.ClickTarget.Tap);
        xwk.e().m(context, userId, new o0r0.a(false, null, str2, null, this.e.b(fkq0.b(userId) ? SchemeStat$EventItem.Type.GROUP : SchemeStat$EventItem.Type.PROFILE, str2, false), null, null, false, false, false, false, null, null, null, 65515));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock;
        boolean z;
        VkButton vkButton;
        Context context;
        Context context2;
        UIBlockSearchEntityPerson uIBlockSearchEntityPerson = this.r;
        if (uIBlockSearchEntityPerson == null || (uIBlockActionPlayAudiosFromBlock = uIBlockSearchEntityPerson.B) == null) {
            return;
        }
        u2b0 u2b0Var = this.g;
        String str = null;
        if (u2b0Var.h()) {
            StartPlaySource j = u2b0Var.j();
            StartPlayCatalogSource startPlayCatalogSource = j instanceof StartPlayCatalogSource ? (StartPlayCatalogSource) j : null;
            if (epx.f(startPlayCatalogSource != null ? startPlayCatalogSource.c : null, uIBlockActionPlayAudiosFromBlock.z)) {
                z = true;
                int i = !z ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_play_16;
                vkButton = this.q;
                if (vkButton == null) {
                    Integer valueOf = Integer.valueOf(i);
                    int[] iArr = VkButton.W;
                    vkButton.a5(true, valueOf);
                    if (z) {
                        VkButton vkButton2 = this.q;
                        if (vkButton2 != null && (context2 = vkButton2.getContext()) != null) {
                            str = context2.getString(R.string.search_entity_answer_pause_music);
                        }
                    } else {
                        VkButton vkButton3 = this.q;
                        if (vkButton3 != null && (context = vkButton3.getContext()) != null) {
                            str = context.getString(R.string.search_entity_answer_play_music);
                        }
                    }
                    vkButton.setText(str);
                    return;
                }
                return;
            }
        }
        z = false;
        if (!z) {
        }
        vkButton = this.q;
        if (vkButton == null) {
        }
    }

    public final void c(SearchEntityAnswerAnalyticsInfo.ClickTarget clickTarget) {
        UIBlockSearchEntityPerson uIBlockSearchEntityPerson = this.r;
        if (uIBlockSearchEntityPerson != null) {
            this.b.a(new cfp0(uIBlockSearchEntityPerson, new SearchEntityAnswerAnalyticsInfo(clickTarget)));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.h, viewGroup, false);
        this.i = (VkText) inflate.findViewById(R.id.entity_title);
        this.j = (VkText) inflate.findViewById(R.id.subtitle);
        this.l = (VkUserStack) inflate.findViewById(R.id.common_friends);
        this.m = (VkText) inflate.findViewById(R.id.common_friends_title);
        this.n = (VkAvatar) inflate.findViewById(R.id.avatar);
        this.o = inflate.findViewById(R.id.verify);
        this.p = (VkButton) inflate.findViewById(R.id.follow_button);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.play_button);
        this.q = vkButton;
        this.k = inflate;
        if (vkButton != null) {
            vkButton.setOnClickListener(new og8(this, 6));
        }
        return inflate;
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
}
