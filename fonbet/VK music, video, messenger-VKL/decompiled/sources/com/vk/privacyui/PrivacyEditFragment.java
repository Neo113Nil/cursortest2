package com.vk.privacyui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.FriendFolder;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.CardRecyclerFragment;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.aed0;
import xsna.asu0;
import xsna.b25;
import xsna.bq00;
import xsna.bt3;
import xsna.bwt0;
import xsna.cr20;
import xsna.dh40;
import xsna.do3;
import xsna.e40;
import xsna.f410;
import xsna.f880;
import xsna.fed0;
import xsna.fkq0;
import xsna.fl40;
import xsna.g880;
import xsna.gb0;
import xsna.ged0;
import xsna.gkc0;
import xsna.gzs;
import xsna.h3p0;
import xsna.h7u0;
import xsna.hs;
import xsna.iah0;
import xsna.irt;
import xsna.izi0;
import xsna.j5g;
import xsna.jno0;
import xsna.jsb0;
import xsna.jzo0;
import xsna.kr5;
import xsna.kw5;
import xsna.lt9;
import xsna.m960;
import xsna.mf7;
import xsna.na80;
import xsna.nl30;
import xsna.nts;
import xsna.o25;
import xsna.ots;
import xsna.oz50;
import xsna.p37;
import xsna.pfd0;
import xsna.q010;
import xsna.qyc0;
import xsna.r1r0;
import xsna.r3j0;
import xsna.rsg0;
import xsna.ste0;
import xsna.t970;
import xsna.tfd0;
import xsna.ver0;
import xsna.vif0;
import xsna.vt30;
import xsna.xdd0;
import xsna.xj50;
import xsna.xq;
import xsna.ydd0;
import xsna.yfb;
import xsna.zj0;

/* loaded from: classes5.dex */
public class PrivacyEditFragment extends CardRecyclerFragment<Void> implements na80<PrivacySetting.PrivacyRule> {
    public static final int[] W0 = {R.drawable.ic_friendlist_4, R.drawable.ic_friendlist_5, R.drawable.ic_friendlist_3, R.drawable.ic_friendlist_1, R.drawable.ic_friendlist_2, R.drawable.ic_friendlist_6, R.drawable.ic_friendlist_7, R.drawable.ic_friendlist_8};
    public PrivacySetting J0;
    public lt9 K0;
    public e L0;
    public e M0;
    public d N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public io.reactivex.rxjava3.disposables.c R0;
    public io.reactivex.rxjava3.disposables.c S0;
    public UserId T0;
    public final aed0 U0;
    public final ots V0;

    public static class a extends oz50 {
        public final void y(@NonNull MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.j.putSerializable("PrivacyEditFragment.ref", mobileOfficialAppsCoreNavStat$EventScreen);
        }

        public final void z(PrivacySetting privacySetting) {
            this.j.putParcelable("setting", new PrivacySetting(privacySetting));
        }
    }

    public class d extends UsableRecyclerView.c<vif0> implements mf7 {
        public final ArrayList<fed0> c = new ArrayList<>();

        public d() {
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            if (i == 0) {
                return 2;
            }
            return i == getItemCount() - 1 ? 4 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size() + 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 20;
            }
            if (i == getItemCount() - 1) {
                return 21;
            }
            return this.c.get(i + (-1)).b != null ? 23 : 22;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            vif0 vif0Var = (vif0) e0Var;
            boolean z = vif0Var instanceof qyc0;
            ArrayList<fed0> arrayList = this.c;
            PrivacyEditFragment privacyEditFragment = PrivacyEditFragment.this;
            if (z) {
                qyc0 qyc0Var = (qyc0) vif0Var;
                int i2 = i - 1;
                ((VkCell) qyc0Var.itemView).setRight(i2 == privacyEditFragment.O0 ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(4, new gkc0(qyc0Var, 2), true), null, 27) : null);
                qyc0Var.V5(arrayList.get(i2).a);
            }
            if (vif0Var instanceof ste0) {
                ste0 ste0Var = (ste0) vif0Var;
                int i3 = i - 1;
                ((VkCell) ste0Var.itemView).setRight(i3 == privacyEditFragment.O0 ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(4, new vt30(ste0Var, 27), true), null, 27) : null);
                ste0Var.V5(arrayList.get(i3));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PrivacyEditFragment.this.Lo(i, viewGroup);
        }
    }

    public class e extends UsableRecyclerView.c<UsableRecyclerView.x> implements mf7 {
        public final ArrayList<UserProfile> c = new ArrayList<>();
        public boolean d = true;
        public final r3j0.a e;
        public final r3j0.a f;
        public final gzs<Void> g;
        public final boolean h;

        public e(gzs<Void> gzsVar, gzs<Void> gzsVar2, gzs<Void> gzsVar3, boolean z) {
            this.e = new r3j0.a(R.string.pick_friends, gzsVar);
            this.f = new r3j0.a(R.string.pick_lists, gzsVar2);
            this.g = gzsVar3;
            this.h = z;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            int i3 = i - 1;
            if (i3 < 0) {
                return null;
            }
            ArrayList<UserProfile> arrayList = this.c;
            if (i3 < arrayList.size()) {
                return arrayList.get(i3).h;
            }
            return null;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return (i == 0 || i >= getItemCount() + (-3) || this.c.get(i - 1).c.b > 2000000000) ? 0 : 1;
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            if (i == 0) {
                return 2;
            }
            return i != getItemCount() - 1 ? 1 : 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.d) {
                return this.c.size() + 4;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 10;
            }
            if (i == getItemCount() - 1) {
                return 11;
            }
            if (i == getItemCount() - 2) {
                return 14;
            }
            return i == getItemCount() + (-3) ? 12 : 13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            UsableRecyclerView.x xVar = (UsableRecyclerView.x) e0Var;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 10) {
                boolean z = xVar instanceof tfd0;
                int i2 = R.string.privacy_denied_to;
                boolean z2 = this.h;
                if (z) {
                    ((tfd0) xVar).V5(Integer.valueOf(z2 ? R.string.privacy_allowed_to : R.string.privacy_denied_to));
                }
                if (xVar instanceof jzo0) {
                    jzo0 jzo0Var = (jzo0) xVar;
                    if (z2) {
                        i2 = R.string.privacy_allowed_to;
                    }
                    jzo0Var.V5(Integer.valueOf(i2));
                }
            } else if (itemViewType == 12) {
                ((r3j0) xVar).V5(this.e);
            } else if (itemViewType == 14) {
                ((r3j0) xVar).V5(this.f);
            }
            if (xVar instanceof pfd0) {
                pfd0 pfd0Var = (pfd0) xVar;
                int i3 = i - 1;
                ArrayList<UserProfile> arrayList = this.c;
                pfd0Var.V5(arrayList.get(i3));
                long j = arrayList.get(i3).c.b;
                if (j >= 2000000000) {
                    VKImageView vKImageView = pfd0Var.n;
                    if (vKImageView instanceof VKAvatarView) {
                        kr5.a aVar = new kr5.a(null);
                        aVar.b(PrivacyEditFragment.W0[((int) (j - 2000000001)) % 8]);
                        ((VKAvatarView) vKImageView).Y0(aVar.a());
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PrivacyEditFragment.this.Mo(viewGroup, i, this.c, this.g);
        }
    }

    public PrivacyEditFragment() {
        super(10);
        this.O0 = -1;
        this.P0 = false;
        this.Q0 = false;
        this.U0 = new aed0();
        this.V0 = new ots();
    }

    public View[] Ko() {
        TextView textView = new TextView(getActivity());
        int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(R.dimen.standard_list_item_padding);
        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        textView.setMinHeight(iah0.a(72.0f));
        jno0.c(textView, R.attr.vk_ui_text_muted);
        textView.setLineSpacing(iah0.a(4), 1.0f);
        textView.setGravity(16);
        textView.setTextSize(1, 18.0f);
        textView.setText(this.J0.c);
        return new View[]{textView};
    }

    public vif0 Lo(int i, ViewGroup viewGroup) {
        if (i == 20) {
            int i2 = jzo0.o;
            jzo0 a2 = jzo0.a.a(viewGroup);
            a2.n.setText(getString(R.string.privacy_allowed_to));
            return a2;
        }
        if (i != 21) {
            return i != 23 ? new qyc0(new VkCell(viewGroup.getContext()), viewGroup, this) : new ste0(new VkCell(viewGroup.getContext()), viewGroup, this);
        }
        kw5 kw5Var = new kw5(viewGroup);
        kw5Var.itemView.setBackgroundResource(R.drawable.apps_top_padding_white_8);
        return kw5Var;
    }

    public vif0 Mo(ViewGroup viewGroup, int i, ArrayList arrayList, gzs gzsVar) {
        switch (i) {
            case 10:
                tfd0 tfd0Var = new tfd0(new VkGroupHeader(viewGroup.getContext(), null, 6));
                ((VkGroupHeader) tfd0Var.itemView).setSize(VkGroupHeader.Size.Small);
                return tfd0Var;
            case 11:
                kw5 kw5Var = new kw5(viewGroup);
                kw5Var.itemView.setBackgroundResource(R.drawable.apps_top_padding_white_8);
                return kw5Var;
            case 12:
            case 14:
                return new r3j0(viewGroup.getContext());
            case 13:
            default:
                VKAvatarView vKAvatarView = new VKAvatarView(viewGroup.getContext(), null, 6, 0);
                float f = 60;
                vKAvatarView.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
                vKAvatarView.setPlaceholderImage(R.drawable.photo_loading);
                return new pfd0(vKAvatarView, viewGroup.getContext(), new irt(15), new p37(this, arrayList, gzsVar, 3));
        }
    }

    @Override // xsna.na80
    /* renamed from: No, reason: merged with bridge method [inline-methods] */
    public void fk(PrivacySetting.PrivacyRule privacyRule) {
        int a2 = ged0.a(this.N0.c, privacyRule);
        this.O0 = a2;
        String str = this.J0.f.get(a2);
        this.L0.d = str.equals("some");
        q();
        this.Q0 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f A[LOOP:1: B:42:0x0169->B:44:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Po(Intent intent) {
        PrivacySetting privacySetting;
        String str;
        char c2;
        Iterator<UserProfile> it;
        if (this.Q0) {
            this.J0.e.clear();
            String str2 = this.J0.f.get(this.O0);
            str2.getClass();
            switch (str2.hashCode()) {
                case -1942494185:
                    if (str2.equals("friends_of_friends")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1887957850:
                    if (str2.equals("editors")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1313660149:
                    if (str2.equals("only_me")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1144722732:
                    if (str2.equals("friends_of_friends_only")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1040220445:
                    if (str2.equals("nobody")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -600094315:
                    if (str2.equals("friends")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 96673:
                    if (str2.equals("all")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3536116:
                    if (str2.equals("some")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 95768354:
                    if (str2.equals("donut")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 336231138:
                    if (str2.equals("by_link")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 948881689:
                    if (str2.equals("members")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            privacySetting = null;
            switch (c2) {
                case 0:
                    this.J0.e.add(PrivacyRules.j);
                    if (this.M0.c.size() > 0 && !"nobody".equals(str2) && !"only_me".equals(str2)) {
                        PrivacyRules.Exclude exclude = new PrivacyRules.Exclude();
                        it = this.M0.c.iterator();
                        while (it.hasNext()) {
                            exclude.Fb(it.next().c);
                        }
                        this.J0.e.add(exclude);
                    }
                    if (this.J0.e.size() != 0) {
                        privacySetting = this.J0;
                        break;
                    }
                    break;
                case 1:
                    this.J0.e.add(PrivacyRules.g);
                    if (this.M0.c.size() > 0) {
                        PrivacyRules.Exclude exclude2 = new PrivacyRules.Exclude();
                        it = this.M0.c.iterator();
                        while (it.hasNext()) {
                        }
                        this.J0.e.add(exclude2);
                        break;
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case 2:
                    this.J0.e.add(PrivacyRules.b);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case 3:
                    this.J0.e.add(PrivacyRules.l);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case 4:
                    this.J0.e.add(PrivacyRules.c);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case 5:
                    this.J0.e.add(PrivacyRules.h);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case 6:
                    this.J0.e.add(PrivacyRules.a);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case 7:
                    PrivacyRules.Include include = new PrivacyRules.Include();
                    Iterator<UserProfile> it2 = this.L0.c.iterator();
                    while (it2.hasNext()) {
                        include.Fb(it2.next().c);
                    }
                    if (include.c.size() != 0) {
                        this.J0.e.add(include);
                        if (this.M0.c.size() > 0) {
                        }
                        if (this.J0.e.size() != 0) {
                        }
                    }
                    break;
                case '\b':
                    this.J0.e.add(PrivacyRules.f);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case '\t':
                    this.J0.e.add(PrivacyRules.e);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                case '\n':
                    this.J0.e.add(PrivacyRules.d);
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
                default:
                    if (this.M0.c.size() > 0) {
                    }
                    if (this.J0.e.size() != 0) {
                    }
                    break;
            }
        } else {
            privacySetting = this.J0;
        }
        if (privacySetting != null && (str = privacySetting.b) != null) {
            hs hsVar = new hs(str, privacySetting.zb(), 0);
            hsVar.k = true;
            hsVar.p();
            if (this.Q0) {
                Oo();
            }
        }
        Mf(-1, intent.putExtra("setting", privacySetting));
    }

    public final void Qo() {
        Po(new Intent());
    }

    public final void Ro() {
        if (this.L0.c.size() == 0) {
            this.Q0 = true;
            this.L0.d = false;
            this.O0 = 0;
            q();
        }
    }

    public final void So(final e eVar) {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.S0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.S0 = rsg0.W(yfb.x(this.V0.s(o25.a().c())), 7).l(new xq(28)).m(asu0.a.d()).subscribe(new f() { // from class: xsna.wdd0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                PrivacyEditFragment.e eVar2;
                int[] iArr = PrivacyEditFragment.W0;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    eVar2 = eVar;
                    if (!hasNext) {
                        break;
                    }
                    FriendFolder friendFolder = (FriendFolder) it.next();
                    UserProfile userProfile = new UserProfile();
                    userProfile.c = new UserId(friendFolder.b + 2000000000);
                    String str = friendFolder.c;
                    userProfile.e = str;
                    arrayList.add(str);
                    arrayList2.add(userProfile);
                    arrayList3.add(Boolean.valueOf(eVar2.c.contains(userProfile)));
                }
                boolean[] zArr = new boolean[arrayList3.size()];
                boolean[] zArr2 = new boolean[arrayList3.size()];
                for (int i = 0; i < arrayList3.size(); i++) {
                    zArr[i] = ((Boolean) arrayList3.get(i)).booleanValue();
                    zArr2[i] = ((Boolean) arrayList3.get(i)).booleanValue();
                }
                h7u0.a aVar = new h7u0.a(activity);
                aVar.g0(R.string.pick_lists);
                aVar.V((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), zArr, new com.vk.privacyui.a(zArr));
                aVar.c0(R.string.ok, null);
                aVar.W(R.string.cancel, null);
                androidx.appcompat.app.d m = aVar.m();
                m.h.j.setOnClickListener(new com.vk.privacyui.b(PrivacyEditFragment.this, zArr, zArr2, arrayList2, eVar2, m));
            }
        }, new xj50(this, 10));
    }

    public final void To(PrivacySetting.PrivacyRule privacyRule, String str) {
        int a2 = ged0.a(this.N0.c, privacyRule);
        if (a2 != -1) {
            this.N0.c.set(a2, new fed0(this.N0.c.get(a2).a, str));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        Qo();
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment
    public void go() {
        if (h3p0.a(this)) {
            Qo();
        } else {
            h3p0.b(this);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onActivityResult(final int i, final int i2, Intent intent) {
        StoriesFeatures storiesFeatures = StoriesFeatures.FRIENDS_SELECTION_TO_FILE;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            if (i2 != -1 && i == 101) {
                Ro();
                return;
            } else {
                if (intent == null) {
                    return;
                }
                v vVar = new v(new gb0(intent, 0));
                asu0 asu0Var = asu0.a;
                ver0.c(requireContext(), vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new f() { // from class: xsna.vdd0
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        ArrayList arrayList = (ArrayList) obj;
                        int[] iArr = PrivacyEditFragment.W0;
                        PrivacyEditFragment privacyEditFragment = PrivacyEditFragment.this;
                        int i3 = i2;
                        int i4 = i;
                        if (i3 == -1) {
                            int i5 = 1;
                            if (i4 == 101) {
                                privacyEditFragment.L0.c.removeIf(new iqk(i5));
                                privacyEditFragment.L0.c.addAll(arrayList);
                                Iterator<UserProfile> it = privacyEditFragment.M0.c.iterator();
                                while (it.hasNext()) {
                                    if (privacyEditFragment.L0.c.contains(it.next())) {
                                        it.remove();
                                    }
                                }
                                privacyEditFragment.Q0 = true;
                            } else if (i4 == 102) {
                                privacyEditFragment.M0.c.removeIf(new jqk(i5));
                                privacyEditFragment.M0.c.addAll(arrayList);
                                Iterator<UserProfile> it2 = privacyEditFragment.L0.c.iterator();
                                while (it2.hasNext()) {
                                    if (privacyEditFragment.M0.c.contains(it2.next())) {
                                        it2.remove();
                                    }
                                }
                                privacyEditFragment.Q0 = true;
                            }
                            privacyEditFragment.q();
                        }
                        if (i4 == 101) {
                            privacyEditFragment.Ro();
                        } else {
                            privacyEditFragment.getClass();
                        }
                    }
                }));
                return;
            }
        }
        if (i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("result");
            if (i == 101) {
                this.L0.c.removeIf(new xdd0());
                this.L0.c.addAll(parcelableArrayListExtra);
                Iterator<UserProfile> it = this.M0.c.iterator();
                while (it.hasNext()) {
                    if (this.L0.c.contains(it.next())) {
                        it.remove();
                    }
                }
                this.Q0 = true;
            } else if (i == 102) {
                this.M0.c.removeIf(new ydd0());
                this.M0.c.addAll(parcelableArrayListExtra);
                Iterator<UserProfile> it2 = this.L0.c.iterator();
                while (it2.hasNext()) {
                    if (this.M0.c.contains(it2.next())) {
                        it2.remove();
                    }
                }
                this.Q0 = true;
            }
            q();
        }
        if (i == 101) {
            Ro();
        }
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.J0 = (PrivacySetting) getArguments().getParcelable("setting");
        Ho(false);
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.R0;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.S0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("owner_id")) {
            return;
        }
        this.T0 = (UserId) arguments.getParcelable("owner_id");
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void q() {
        boolean z;
        boolean z2;
        UserId userId;
        String str = this.J0.f.get(this.O0);
        Iterator<UserProfile> it = this.L0.c.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (it.next().c.b > 2000000000) {
                z2 = true;
                break;
            }
        }
        e eVar = this.M0;
        if (str.equals(PrivacyRules.b.d) || str.equals(PrivacyRules.c.d) || str.equals(PrivacyRules.e.d) || str.equals(PrivacyRules.d.d) || str.equals(PrivacyRules.f.d) || str.equals(PrivacyRules.g.d) || ((str.equals(PrivacyRules.a.d) && (userId = this.T0) != null && fkq0.b(userId)) || (str.equals("some") && !z2))) {
            z = false;
        }
        eVar.d = z;
        super.q();
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View ro = super.ro(layoutInflater, viewGroup, bundle);
        bwt0.Z(R.attr.vk_ui_background_content, ro);
        return ro;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        List<PrivacySetting.PrivacyRule> list = this.J0.e;
        aed0 aed0Var = this.U0;
        aed0Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PrivacyRules.UserListPrivacyRule) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PrivacyRules.UserListPrivacyRule userListPrivacyRule = (PrivacyRules.UserListPrivacyRule) it.next();
            int Db = userListPrivacyRule.Db();
            for (int i3 = 0; i3 < Db; i3++) {
                UserId Eb = userListPrivacyRule.Eb(i3);
                if (userListPrivacyRule instanceof PrivacyRules.Include) {
                    linkedHashSet.add(Eb);
                } else if (userListPrivacyRule instanceof PrivacyRules.Exclude) {
                    linkedHashSet2.add(Eb);
                }
            }
        }
        List O0 = j5g.O0(izi0.j(linkedHashSet, linkedHashSet2));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : O0) {
            if (((UserId) obj2).b < 2000000000) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.d();
        List list3 = (List) pair.g();
        this.R0 = x.B(list2.isEmpty() ? x.k(EmptyList.b) : rsg0.W(yfb.x(r1r0.a.b(aed0Var.b, list2, aed0Var.e, null, null, 58)), 7).l(new do3(new nl30(aed0Var, 18), 29)).o(EmptyList.b), list3.isEmpty() ? x.k(EmptyList.b) : rsg0.W(yfb.x(nts.f(aed0Var.c, ((b25) aed0Var.d.getValue()).c(), 6)), 7).l(new e40(new bq00(list3, 26), 24)).o(EmptyList.b), new zj0(new bt3(O0, 13), 24)).l(new fl40(new f410(linkedHashSet, 26), 5)).m(asu0.a.d()).subscribe(new jsb0(this, 6), new dh40(this, 13));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00d8, code lost:
    
        if (r3.equals("nobody") == false) goto L17;
     */
    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecyclerView.Adapter wo() {
        PrivacyEditFragment privacyEditFragment;
        lt9 lt9Var = this.K0;
        if (lt9Var == null) {
            if (lt9Var == null) {
                this.N0 = new d();
                privacyEditFragment = this;
                privacyEditFragment.L0 = privacyEditFragment.new e(new f880(this, 12), new q010(this, 18), new g880(this, 11), true);
                privacyEditFragment.M0 = privacyEditFragment.new e(new m960(this, 16), new cr20(this, 26), new t970(5), false);
                Iterator<String> it = privacyEditFragment.J0.f.iterator();
                while (true) {
                    char c2 = 4;
                    int i = 1;
                    if (it.hasNext()) {
                        String next = it.next();
                        PrivacySetting.PrivacyRule privacyRule = privacyEditFragment.J0.e.isEmpty() ? null : privacyEditFragment.J0.e.get(0);
                        if (next == null) {
                            next = "";
                        }
                        switch (next.hashCode()) {
                            case -1942494185:
                                if (next.equals("friends_of_friends")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1887957850:
                                if (next.equals("editors")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1313660149:
                                if (next.equals("only_me")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1144722732:
                                if (next.equals("friends_of_friends_only")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1040220445:
                                break;
                            case -600094315:
                                if (next.equals("friends")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96673:
                                if (next.equals("all")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3536116:
                                if (next.equals("some")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 95768354:
                                if (next.equals("donut")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 336231138:
                                if (next.equals("by_link")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 948881689:
                                if (next.equals("members")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.j;
                                if (predefinedSet.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet, null));
                                break;
                            case 1:
                                PrivacyRules.PredefinedSet predefinedSet2 = PrivacyRules.g;
                                if (predefinedSet2.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    privacyEditFragment.M0.d = false;
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet2, null));
                                break;
                            case 2:
                                PrivacyRules.PredefinedSet predefinedSet3 = PrivacyRules.b;
                                if (predefinedSet3.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    privacyEditFragment.M0.d = false;
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet3, null));
                                break;
                            case 3:
                                PrivacyRules.PredefinedSet predefinedSet4 = PrivacyRules.l;
                                if (predefinedSet4.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet4, null));
                                break;
                            case 4:
                                PrivacyRules.PredefinedSet predefinedSet5 = PrivacyRules.c;
                                if (predefinedSet5.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    privacyEditFragment.M0.d = false;
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet5, null));
                                break;
                            case 5:
                                PrivacyRules.PredefinedSet predefinedSet6 = PrivacyRules.h;
                                if (predefinedSet6.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet6, null));
                                break;
                            case 6:
                                PrivacyRules.PredefinedSet predefinedSet7 = PrivacyRules.a;
                                if (predefinedSet7.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    UserId userId = privacyEditFragment.T0;
                                    if (userId != null && fkq0.b(userId)) {
                                        privacyEditFragment.M0.d = false;
                                    }
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet7, null));
                                break;
                            case 7:
                                privacyEditFragment.N0.c.add(new fed0(new PrivacyRules.Include(), null));
                                privacyEditFragment.P0 = true;
                                break;
                            case '\b':
                                PrivacyRules.PredefinedSet predefinedSet8 = PrivacyRules.f;
                                if (predefinedSet8.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    privacyEditFragment.M0.d = false;
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet8, ""));
                                break;
                            case '\t':
                                PrivacyRules.PredefinedSet predefinedSet9 = PrivacyRules.e;
                                if (predefinedSet9.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    privacyEditFragment.M0.d = false;
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet9, null));
                                break;
                            case '\n':
                                PrivacyRules.PredefinedSet predefinedSet10 = PrivacyRules.d;
                                if (predefinedSet10.equals(privacyRule)) {
                                    privacyEditFragment.O0 = privacyEditFragment.N0.c.size();
                                    privacyEditFragment.M0.d = false;
                                }
                                privacyEditFragment.N0.c.add(new fed0(predefinedSet10, null));
                                break;
                        }
                    } else {
                        if (privacyEditFragment.O0 == -1) {
                            privacyEditFragment.O0 = privacyEditFragment.N0.c.size() - 1;
                            privacyEditFragment.L0.d = true;
                        } else {
                            privacyEditFragment.L0.d = false;
                        }
                        View[] Ko = Ko();
                        UsableRecyclerView.c[] cVarArr = new UsableRecyclerView.c[Ko.length + 4];
                        cVarArr[0] = new c();
                        int i2 = 0;
                        while (i2 < Ko.length) {
                            cVarArr[i] = new b(Ko[i2]);
                            i2++;
                            i++;
                        }
                        cVarArr[i] = privacyEditFragment.N0;
                        cVarArr[i + 1] = privacyEditFragment.L0;
                        cVarArr[i + 2] = privacyEditFragment.M0;
                        privacyEditFragment.K0 = new lt9(cVarArr);
                        if (!privacyEditFragment.P0) {
                            privacyEditFragment.M0.d = false;
                        }
                    }
                }
            } else {
                privacyEditFragment = this;
            }
            qo();
        } else {
            privacyEditFragment = this;
        }
        return privacyEditFragment.K0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        if (arguments == null || !getArguments().containsKey("PrivacyEditFragment.ref")) {
            return;
        }
        uiTrackingScreen.a = (MobileOfficialAppsCoreNavStat$EventScreen) arguments.getSerializable("PrivacyEditFragment.ref");
    }

    public void Oo() {
    }

    public class b extends UsableRecyclerView.c implements mf7 {
        public final View c;

        public class a extends vif0<Void> {
            @Override // xsna.vif0
            public final /* bridge */ /* synthetic */ void i6(Void r1) {
            }
        }

        public b(View view) {
            this.c = view;
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            return 4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 30;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(this.c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        }
    }

    public class c extends UsableRecyclerView.c implements mf7 {
        public c() {
        }

        @Override // xsna.mf7
        public final int e0(int i) {
            int[] iArr = PrivacyEditFragment.W0;
            return PrivacyEditFragment.this.U ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 40;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            kw5 kw5Var = new kw5(viewGroup);
            kw5Var.itemView.setBackgroundResource(R.drawable.card_top_fix_item);
            return kw5Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        }
    }
}
