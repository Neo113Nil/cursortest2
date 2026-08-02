package com.vk.attachpicker.impl.gifts;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.Gift;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserProfileGift;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.flow.binding.g;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.gifts.GiftModalButtonType;
import com.vk.stickers.views.gift.GiftView;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.GridFragment;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.baf0;
import xsna.ckc;
import xsna.cn70;
import xsna.cs5;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fgz;
import xsna.fkq0;
import xsna.g2v;
import xsna.gzs;
import xsna.h7u0;
import xsna.his0;
import xsna.iah0;
import xsna.j6r0;
import xsna.jjc;
import xsna.js5;
import xsna.jt9;
import xsna.jx2;
import xsna.jzt;
import xsna.m33;
import xsna.m7z;
import xsna.maz;
import xsna.n9;
import xsna.o0r0;
import xsna.o25;
import xsna.o7z;
import xsna.oq;
import xsna.oz50;
import xsna.pvo0;
import xsna.rjc;
import xsna.szt;
import xsna.tlo0;
import xsna.tq;
import xsna.ucp;
import xsna.vif0;
import xsna.vw0;
import xsna.x48;
import xsna.xs5;
import xsna.xwk;
import xsna.z4d0;
import xsna.zal0;

/* compiled from: ProfileGiftsFragment.kt */
/* loaded from: classes15.dex */
public final class ProfileGiftsFragment extends GridFragment<GiftItem> implements View.OnClickListener {
    public static final /* synthetic */ int Q0 = 0;
    public final x48 L0;
    public Drawable M0;
    public UserId N0;
    public UserProfile O0;
    public boolean P0;

    /* compiled from: ProfileGiftsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ProfileGiftsFragment.kt */
    public final class c extends GridFragment<GiftItem>.b<vif0<GiftItem>> implements x48.a {
        public c() {
            super();
        }

        @Override // com.vkontakte.android.fragments.base.GridFragment.b, xsna.mf7
        public final int e0(int i) {
            return 4;
        }

        @Override // com.vkontakte.android.fragments.base.GridFragment.b, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            super.onBindViewHolder(i, (vif0) e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return ProfileGiftsFragment.this.new b(viewGroup);
        }

        @Override // xsna.x48.a
        public final boolean u0(int i) {
            return true;
        }
    }

    public ProfileGiftsFragment() {
        super(25);
        x48.a aVar = (x48.a) wo();
        WeakHashMap weakHashMap = j6r0.a;
        this.L0 = new x48(aVar, Math.max(1, iah0.a(0.5f)));
        this.N0 = UserId.d;
        to(R.layout.fab_loader_fragment);
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final GridFragment<GiftItem>.b<?> Io() {
        return new c();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final int Ko() {
        return 1;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final jt9 Lo() {
        jt9 jt9Var = new jt9(wo(), !this.U);
        WeakHashMap weakHashMap = j6r0.a;
        int a2 = iah0.a(8.0f);
        int a3 = this.V >= 924 ? iah0.a(Math.max(16, (r2 - 924) / 2)) : 0;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.post_side_padding) + a3;
        this.n0.setPadding(a3, a2, a3, 0);
        UsableRecyclerView usableRecyclerView = this.n0;
        x48 x48Var = this.L0;
        x48Var.e = dimensionPixelSize;
        x48Var.f = dimensionPixelSize;
        usableRecyclerView.addItemDecoration(x48Var);
        jt9Var.m = a2;
        return jt9Var;
    }

    public final void Mo(UserId userId) {
        if (((int) userId.b) == 0) {
            return;
        }
        xwk.e().m(requireContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    public final void No(UserProfile userProfile) {
        if (userProfile == null) {
            Oo(o25.a().o().b(), "gifts_own");
        } else if (o25.a().a(userProfile.c)) {
            Oo(userProfile, "gifts_own");
        } else {
            Oo(userProfile, "gifts");
        }
    }

    public final void Oo(UserProfile userProfile, String str) {
        g2v.d().a().r(requireContext(), userProfile.c, str);
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ArrayList<T> arrayList = this.v0;
        if (arrayList == 0 || arrayList.isEmpty()) {
            qo();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        No(this.O0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        super.onCreate(bundle);
        UserProfile userProfile = (UserProfile) requireArguments().getParcelable("user");
        this.O0 = userProfile;
        if (userProfile == null || (userId = userProfile.c) == null) {
            userId = o25.a().o().a;
        }
        this.N0 = userId;
        this.P0 = o25.a().a(this.N0);
        Context requireContext = requireContext();
        e3m.a aVar = e3m.a;
        this.M0 = m33.a(R.drawable.gift_placeholder, requireContext);
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Drawable drawable = null;
        if (o25.a().a(this.N0)) {
            string = getString(R.string.gifts_my);
        } else {
            Bundle arguments = getArguments();
            string = arguments != null ? arguments.getString("title") : null;
        }
        setTitle(string);
        ImageView imageView = (ImageView) this.d0.findViewById(R.id.fab);
        if (!fkq0.c(o25.a().o().a)) {
            imageView.setVisibility(8);
            ((CoordinatorLayout.f) imageView.getLayoutParams()).c(null);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            e3m.a aVar = e3m.a;
            drawable = m33.a(R.drawable.vk_icon_gift_24, activity);
        }
        imageView.setImageDrawable(new baf0(drawable, -1));
        imageView.setContentDescription(getString(R.string.accessibility_send_gift));
        imageView.setOnClickListener(this);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        this.i0 = new jx2(new szt(this.N0, i, i2), new fgz(this)).a();
    }

    /* compiled from: ProfileGiftsFragment.kt */
    public final class b extends vif0<GiftItem> implements UsableRecyclerView.e, View.OnClickListener, PopupMenu.OnMenuItemClickListener {
        public final GiftView n;
        public final TextView o;
        public final TextView p;
        public final TextView q;
        public final VkCell r;
        public final VkSimpleButton s;
        public final VkButton t;
        public final ImageView u;
        public final LinearLayout v;
        public final VKImageView w;
        public final TextView x;
        public final Drawable y;

        /* compiled from: ProfileGiftsFragment.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GiftType.values().length];
                try {
                    iArr[GiftType.GIFT_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GiftType.IMAGE_STATUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GiftType.IMAGE_STATUS_PACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GiftType.RANDOM_STICKERS_PACK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GiftType.REGULAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[GiftType.STICKERS_PACK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[GiftType.STICKERS_PACK_FOR_CHOICES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(ViewGroup viewGroup) {
            super(viewGroup, R.layout.list_item_gift, 0);
            this.n = (GiftView) this.itemView.findViewById(R.id.gift_view);
            this.o = (TextView) this.itemView.findViewById(R.id.gift_type_title);
            this.p = (TextView) this.itemView.findViewById(R.id.gift_message_text);
            this.q = (TextView) this.itemView.findViewById(R.id.privacy_text);
            this.r = (VkCell) this.itemView.findViewById(R.id.profile_cell);
            this.s = (VkSimpleButton) this.itemView.findViewById(R.id.action_button);
            this.t = (VkButton) this.itemView.findViewById(R.id.reply_button);
            this.u = (ImageView) this.itemView.findViewById(R.id.votes_plus_icon);
            this.v = (LinearLayout) this.itemView.findViewById(R.id.votes_container);
            this.w = (VKImageView) this.itemView.findViewById(R.id.votes_image);
            this.x = (TextView) this.itemView.findViewById(R.id.votes_text);
            this.y = dhr0.w(R.drawable.user_placeholder_icon, viewGroup.getContext());
        }

        @Override // xsna.vif0
        public final void i6(GiftItem giftItem) {
            ImageSize Cb;
            String str;
            tlo0 h;
            String str2;
            GiftItem giftItem2 = giftItem;
            Gift gift = giftItem2.i;
            ProfileGiftsFragment profileGiftsFragment = ProfileGiftsFragment.this;
            if (gift != null) {
                this.n.c(gift, profileGiftsFragment.N0, getLayoutPosition(), 2, true);
            }
            GiftVotesAttachment giftVotesAttachment = giftItem2.l;
            boolean z = true;
            ImageView imageView = this.u;
            GiftView giftView = this.n;
            LinearLayout linearLayout = this.v;
            if (giftVotesAttachment == null) {
                int a2 = e3m.a(R.dimen.gift_size, this.itemView.getContext());
                f4m.z(a2, a2, giftView);
                f4m.j(imageView);
                f4m.j(linearLayout);
            } else {
                int a3 = e3m.a(R.dimen.gift_votes_size, this.itemView.getContext());
                f4m.z(a3, a3, giftView);
                imageView.setVisibility(0);
                linearLayout.setVisibility(0);
                Image image = giftVotesAttachment.c;
                if (image != null && (Cb = image.Cb(cn70.b(92), true, false)) != null && (str = Cb.d.d) != null) {
                    this.w.load(str);
                }
                Resources b6 = b6();
                int i = giftVotesAttachment.b;
                this.x.setText(b6.getQuantityString(R.plurals.profile_gifts_votes, i, Integer.valueOf(i)));
                linearLayout.setOnClickListener(new vw0(profileGiftsFragment, 14));
            }
            TextView textView = this.o;
            textView.setVisibility(0);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            GiftType giftType = giftItem2.i.n;
            switch (giftType == null ? -1 : a.$EnumSwitchMapping$0[giftType.ordinal()]) {
                case 1:
                    his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                    textView.setText(R.string.profile_gifts_certificate);
                    break;
                case 2:
                    his0.v(textView, R.drawable.vk_icon_smile_16, 0);
                    textView.setText(R.string.profile_gifts_status);
                    break;
                case 3:
                    his0.v(textView, R.drawable.vk_icon_smile_16, 0);
                    textView.setText(R.string.profile_gifts_status_pack);
                    break;
                case 4:
                    his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                    textView.setText(R.string.profile_gifts_random_pack);
                    break;
                case 5:
                    GiftRarity giftRarity = giftItem2.i.l;
                    if (giftRarity == null) {
                        f4m.j(textView);
                        break;
                    } else {
                        GiftRarity.Type type = giftRarity.c;
                        int i2 = type == null ? -1 : o7z.$EnumSwitchMapping$0[type.ordinal()];
                        Integer valueOf = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Integer.valueOf(R.drawable.vk_icon_crown_16) : Integer.valueOf(R.drawable.vk_icon_diamond_16) : Integer.valueOf(R.drawable.vk_icon_sparkle_16);
                        if (valueOf != null) {
                            his0.v(textView, valueOf.intValue(), 0);
                        }
                        textView.setText(giftRarity.b);
                        break;
                    }
                case 6:
                    if (!giftItem2.i.h.booleanValue()) {
                        his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                        textView.setText(R.string.profile_gifts_stickers_title);
                        break;
                    } else {
                        his0.v(textView, R.drawable.vk_icon_sticker_smile_outline_16, 0);
                        textView.setText(R.string.profile_gifts_stickers_style);
                        break;
                    }
                case 7:
                    if (giftItem2.i.c != 10002) {
                        his0.v(textView, R.drawable.vk_icon_gift_16, 0);
                        textView.setText(R.string.profile_gifts_any_sticker);
                        break;
                    } else {
                        textView.setText(R.string.profile_gifts_any_animated_sticker);
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String str3 = giftItem2.g;
            TextView textView2 = this.p;
            if (str3 == null || str3.length() <= 0) {
                f4m.j(textView2);
            } else {
                ucp ucpVar = ucp.a;
                textView2.setText(ucp.i(xwk.d().a().m(giftItem2.g)));
                textView2.setVisibility(0);
            }
            TextView textView3 = this.q;
            f4m.j(textView3);
            if (profileGiftsFragment.P0) {
                GiftCard giftCard = giftItem2.i.q;
                boolean z2 = giftCard != null && giftCard.d;
                Integer valueOf2 = (z2 && giftItem2.d()) ? Integer.valueOf(R.string.gifts_owner_message_naminal_privacy) : z2 ? Integer.valueOf(R.string.gifts_owner_naminal_privacy) : (giftItem2.d() && giftItem2.e()) ? Integer.valueOf(R.string.gifts_owner_message_privacy) : (!giftItem2.d() || giftItem2.e()) ? null : Integer.valueOf(R.string.gifts_owner_privacy);
                if (valueOf2 != null) {
                    textView3.setText(valueOf2.intValue());
                    textView3.setVisibility(0);
                }
            }
            GiftType giftType2 = giftItem2.i.n;
            int i3 = giftType2 != null ? a.$EnumSwitchMapping$0[giftType2.ordinal()] : -1;
            VkSimpleButton vkSimpleButton = this.s;
            if (i3 == 1) {
                vkSimpleButton.setText(R.string.profile_gifts_certificate_action);
                vkSimpleButton.setOnClickListener(new rjc(2, this, giftItem2));
                vkSimpleButton.setVisibility(0);
            } else {
                f4m.j(vkSimpleButton);
            }
            boolean z3 = profileGiftsFragment.P0;
            int i4 = 4;
            VkButton vkButton = this.t;
            if (z3) {
                vkButton.setOnClickListener(new ckc(i4, profileGiftsFragment, giftItem2));
                vkButton.setVisibility(0);
            } else {
                f4m.j(vkButton);
            }
            cs5 cs5Var = new cs5();
            VkCell vkCell = this.r;
            vkCell.setLeftMainAvatarController(cs5Var);
            VkCell.Left.a aVar = VkCell.Left.Companion;
            UserProfileGift userProfileGift = giftItem2.f;
            String a4 = js5.a(iah0.a(40), userProfileGift != null ? userProfileGift.g : null);
            String str4 = "";
            if (a4 == null) {
                a4 = "";
            }
            vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new xs5(this.y, a4), VkCell.Left.Main.Size.Small)));
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            if (giftItem2.f == null || giftItem2.e()) {
                h = tq.h(tlo0.Companion, R.string.gifts_anonymous);
            } else {
                tlo0.a aVar3 = tlo0.Companion;
                UserProfileGift userProfileGift2 = giftItem2.f;
                if (userProfileGift2 != null && (str2 = userProfileGift2.e) != null) {
                    str4 = str2;
                }
                h = oq.d(aVar3, str4);
            }
            VkCell.Middle.e eVar = new VkCell.Middle.e(h, 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            tlo0.a aVar4 = tlo0.Companion;
            int i5 = (int) giftItem2.h;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String k = pvo0.k(i5, context.getResources(), false);
            aVar4.getClass();
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, new VkCell.Middle.d(new tlo0.h(k), (gzs) null, 1, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 58), null, 12));
            VkCell.Right.d a5 = VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new z4d0(this, 2), new tlo0.f(R.string.menu), 4), null, 27);
            UserProfileGift userProfileGift3 = giftItem2.f;
            if ((userProfileGift3 == null || !userProfileGift3.h0) && !o25.a().a(profileGiftsFragment.N0)) {
                z = false;
            }
            vkCell.setRight(z ? a5 : null);
            jjc.g(vkCell, new n9(24, profileGiftsFragment, this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            if (epx.f(view, this.itemView)) {
                Gift gift = ((GiftItem) this.m).i;
                GiftType giftType = gift.n;
                switch (giftType == null ? -1 : a.$EnumSwitchMapping$0[giftType.ordinal()]) {
                    case 1:
                        q6(((GiftItem) this.m).k);
                        return;
                    case 2:
                    case 3:
                        ImageStatus imageStatus = gift.o;
                        if (imageStatus == null || (str = imageStatus.b) == null) {
                            ImageStatusPack imageStatusPack = gift.p;
                            if (imageStatusPack == null) {
                                return;
                            } else {
                                str = imageStatusPack.b;
                            }
                        }
                        maz.c(xwk.d().e(), this.itemView.getContext(), str, LaunchContext.A, null, null, 24);
                        return;
                    case 4:
                    case 5:
                    case 7:
                        GiftRarity giftRarity = gift.l;
                        ProfileGiftsFragment profileGiftsFragment = ProfileGiftsFragment.this;
                        if (giftRarity == null) {
                            profileGiftsFragment.Mo(((GiftItem) this.m).d);
                            return;
                        }
                        Pair pair = o25.a().a(profileGiftsFragment.N0) ? new Pair(GiftModalButtonType.SEND_IN_RETURN, "gifts_own") : new Pair(GiftModalButtonType.SEND, "gifts");
                        GiftModalButtonType giftModalButtonType = (GiftModalButtonType) pair.d();
                        String str2 = (String) pair.g();
                        int i = m7z.c;
                        m7z.a.a(this.itemView.getContext(), gift, new jzt(giftModalButtonType, ((GiftItem) this.m).d.b, gift.c, str2, new g(20, profileGiftsFragment, this)));
                        return;
                    case 6:
                        Integer num = gift.g;
                        if (num != null) {
                            zal0.H(g2v.d().a(), this.itemView.getContext(), num.intValue(), GiftData.d, null, "gifts", null, 72);
                            return;
                        }
                        return;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            final GiftItem giftItem = (GiftItem) this.m;
            if (giftItem == null) {
                return false;
            }
            final ProfileGiftsFragment profileGiftsFragment = ProfileGiftsFragment.this;
            if (itemId == R.string.gifts_of_placeholder) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("user", giftItem.f);
                UserProfileGift userProfileGift = giftItem.f;
                if (userProfileGift != null) {
                    bundle.putString("title", profileGiftsFragment.getString(R.string.gifts_of_placeholder, userProfileGift.i0));
                }
                new oz50(ProfileGiftsFragment.class, null, bundle).k(profileGiftsFragment.getActivity());
                return true;
            }
            if (itemId != R.string.delete) {
                return true;
            }
            h7u0.a aVar = new h7u0.a(profileGiftsFragment.requireContext());
            aVar.g0(R.string.confirm);
            aVar.U(R.string.gift_delete_confirm);
            aVar.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.lxd0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = ProfileGiftsFragment.Q0;
                    VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_LISTS;
                    vasFeatures.getClass();
                    qzt qztVar = new qzt(com.vk.toggle.b.A.a(vasFeatures) ? "gifts.deleteAlias" : "gifts.delete");
                    GiftItem giftItem2 = giftItem;
                    qztVar.C(giftItem2.c, "id");
                    qztVar.K("gift_hash", giftItem2.e);
                    ProfileGiftsFragment profileGiftsFragment2 = profileGiftsFragment;
                    jx2 jx2Var = new jx2(qztVar, new mxd0(profileGiftsFragment2, giftItem2));
                    jx2Var.g = profileGiftsFragment2.getActivity();
                    jx2Var.a();
                }
            });
            aVar.W(R.string.no, null);
            aVar.m();
            return true;
        }

        public final void q6(String str) {
            if (str == null) {
                return;
            }
            zal0 a2 = g2v.d().a();
            ProfileGiftsFragment profileGiftsFragment = ProfileGiftsFragment.this;
            a2.x(profileGiftsFragment.requireContext(), str, profileGiftsFragment.P0 ? "gifts_own" : "gifts", profileGiftsFragment.N0.b);
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            onClick(this.itemView);
        }
    }
}
