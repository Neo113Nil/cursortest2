package com.vk.friends.discover;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.profile.Occupation;
import com.vk.dto.user.UserProfile;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.search.models.VkRelation;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.chromium.base.TimeUtils;
import xsna.a8i;
import xsna.aip;
import xsna.asp;
import xsna.azj0;
import xsna.baf0;
import xsna.bwt0;
import xsna.bzj0;
import xsna.c5g;
import xsna.cim0;
import xsna.dhr0;
import xsna.dqa;
import xsna.dsf0;
import xsna.gko;
import xsna.itj0;
import xsna.j5g;
import xsna.jfg0;
import xsna.khr;
import xsna.lhr;
import xsna.m33;
import xsna.oq;
import xsna.pvo0;
import xsna.qcy;
import xsna.rl3;
import xsna.tlo0;
import xsna.u11;
import xsna.v0r0;
import xsna.v2q0;
import xsna.vhq0;
import xsna.vif0;
import xsna.w2q0;
import xsna.whq0;
import xsna.xhq0;
import xsna.z76;
import xsna.z7i;
import xsna.zoj0;
import xsna.zrp;

/* compiled from: UsersDiscoverAdapter.kt */
/* loaded from: classes13.dex */
public final class UsersDiscoverAdapter extends zoj0<Object, vif0<Object>> implements c.i {
    public final String e;
    public final cim0 f;
    public final v0r0 g;
    public final z76 h;
    public AdapterState i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersDiscoverAdapter.kt */
    public static final class AdapterState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdapterState[] $VALUES;
        public static final AdapterState Empty;
        public static final AdapterState Error;
        public static final AdapterState Idle;
        public static final AdapterState Loading;

        static {
            AdapterState adapterState = new AdapterState("Idle", 0);
            Idle = adapterState;
            AdapterState adapterState2 = new AdapterState("Loading", 1);
            Loading = adapterState2;
            AdapterState adapterState3 = new AdapterState("Error", 2);
            Error = adapterState3;
            AdapterState adapterState4 = new AdapterState("Empty", 3);
            Empty = adapterState4;
            AdapterState[] adapterStateArr = {adapterState, adapterState2, adapterState3, adapterState4};
            $VALUES = adapterStateArr;
            $ENTRIES = new asp(adapterStateArr);
        }

        public AdapterState() {
            throw null;
        }

        public static AdapterState valueOf(String str) {
            return (AdapterState) Enum.valueOf(AdapterState.class, str);
        }

        public static AdapterState[] values() {
            return (AdapterState[]) $VALUES.clone();
        }
    }

    public UsersDiscoverAdapter(ListDataSet listDataSet, String str, cim0 cim0Var, v0r0 v0r0Var, z76 z76Var) {
        super(listDataSet);
        this.e = str;
        this.f = cim0Var;
        this.g = v0r0Var;
        this.h = z76Var;
        setHasStableIds(true);
        this.i = AdapterState.Loading;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return super.getItemCount() == 0;
    }

    public final boolean K0(int i) {
        return (getItemCount() - 1) - i == 0;
    }

    public final boolean L0(int i) {
        return (getItemCount() - 1) - i == 1;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return super.getItemCount() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Object c = this.c.c(i);
        if (c instanceof UserDiscoverItem) {
            return ((UserDiscoverItem) c).c.b;
        }
        if (c instanceof z7i) {
            return -2L;
        }
        AdapterState adapterState = this.i;
        AdapterState adapterState2 = AdapterState.Idle;
        if (adapterState == adapterState2 && L0(i)) {
            return -3L;
        }
        if (this.i == adapterState2 && K0(i)) {
            return -6L;
        }
        AdapterState adapterState3 = this.i;
        AdapterState adapterState4 = AdapterState.Loading;
        if (adapterState3 == adapterState4 && L0(i)) {
            return -4L;
        }
        if (this.i == adapterState4 && K0(i)) {
            return -5L;
        }
        AdapterState adapterState5 = this.i;
        AdapterState adapterState6 = AdapterState.Error;
        if (adapterState5 == adapterState6 && L0(i)) {
            return -7L;
        }
        if (this.i == adapterState6 && K0(i)) {
            return -6L;
        }
        AdapterState adapterState7 = this.i;
        AdapterState adapterState8 = AdapterState.Empty;
        if (adapterState7 == adapterState8 && L0(i)) {
            return -3L;
        }
        return (this.i == adapterState8 && K0(i)) ? -6L : 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object c = this.c.c(i);
        if (c instanceof UserDiscoverItem) {
            return 1;
        }
        if (c instanceof z7i) {
            return 2;
        }
        AdapterState adapterState = this.i;
        AdapterState adapterState2 = AdapterState.Idle;
        if (adapterState == adapterState2 && L0(i)) {
            return 3;
        }
        if (this.i == adapterState2 && K0(i)) {
            return 6;
        }
        AdapterState adapterState3 = this.i;
        AdapterState adapterState4 = AdapterState.Loading;
        if (adapterState3 == adapterState4 && L0(i)) {
            return 4;
        }
        if (this.i == adapterState4 && K0(i)) {
            return 5;
        }
        AdapterState adapterState5 = this.i;
        AdapterState adapterState6 = AdapterState.Error;
        if (adapterState5 == adapterState6 && L0(i)) {
            return 7;
        }
        if (this.i == adapterState6 && K0(i)) {
            return 6;
        }
        AdapterState adapterState7 = this.i;
        AdapterState adapterState8 = AdapterState.Empty;
        if (adapterState7 == adapterState8 && L0(i)) {
            return 3;
        }
        if (this.i == adapterState8) {
            K0(i);
        }
        return 6;
    }

    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String str;
        boolean z;
        VkRelation vkRelation;
        ?? r11;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        tlo0.h hVar;
        UserProfile userProfile;
        String str2;
        UserProfile userProfile2;
        String str3;
        List n0;
        vif0 vif0Var = (vif0) e0Var;
        Object c = this.c.c(i);
        if (c == null || !(vif0Var instanceof xhq0)) {
            if (c != null && (vif0Var instanceof a8i)) {
                ((a8i) vif0Var).V5(c);
                return;
            } else {
                if (vif0Var instanceof jfg0) {
                    ((jfg0) vif0Var).n.setOnRetryClickListener(this.g);
                    return;
                }
                return;
            }
        }
        xhq0 xhq0Var = (xhq0) vif0Var;
        dsf0 dsf0Var = new dsf0(this, i, c);
        xhq0Var.V5(c);
        if (c instanceof UserDiscoverItem) {
            whq0 whq0Var = xhq0Var.o;
            UserDiscoverItem userDiscoverItem = (UserDiscoverItem) c;
            String str4 = xhq0Var.n;
            View view = whq0Var.k;
            ViewGroup viewGroup = whq0Var.h;
            TextView textView = whq0Var.p;
            VkMiniInfoCell vkMiniInfoCell = whq0Var.q;
            whq0Var.e = this.f;
            whq0Var.f = dsf0Var;
            whq0Var.g = userDiscoverItem;
            ArrayList<String> arrayList2 = whq0Var.A;
            arrayList2.clear();
            whq0Var.B.setLength(0);
            bwt0.p0(whq0Var.j, userDiscoverItem.n0);
            SpannableStringBuilder spannableStringBuilder = whq0Var.C;
            int e = UserProfile.e(userDiscoverItem);
            String str5 = userDiscoverItem.e;
            TextView textView2 = whq0Var.o;
            bwt0.p0(textView2, !(str5 == null || str5.length() == 0));
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) str5);
            if (str5 != null && str5.length() != 0 && e > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
                int length = spannableStringBuilder.length();
                String quantityString = whq0Var.getResources().getQuantityString(R.plurals.user_age_years, e, Integer.valueOf(e));
                spannableStringBuilder.append((CharSequence) quantityString);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(whq0Var.getContext().getColor(R.color.users_discover_age_color)), length, quantityString.length() + length, 0);
            }
            Drawable a = m33.a(R.drawable.vk_icon_chevron_24, whq0Var.getContext());
            if (a != null) {
                baf0 baf0Var = new baf0(a, -1);
                spannableStringBuilder.append((CharSequence) "  ");
                dqa dqaVar = new dqa(baf0Var);
                dqaVar.b = whq0.E;
                spannableStringBuilder.setSpan(dqaVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            }
            textView2.setText(spannableStringBuilder);
            String string = userDiscoverItem.s.getString("city_name", "");
            Occupation occupation = userDiscoverItem.u0;
            String str6 = occupation != null ? occupation.d : null;
            if (string != null && string.length() != 0) {
                arrayList2.add(string);
            }
            if (str6 != null && str6.length() != 0) {
                arrayList2.add(str6);
            }
            if (arrayList2.isEmpty()) {
                str = "";
                z = false;
            } else {
                str = "";
                StringBuilder sb = whq0Var.B;
                j5g.f0(arrayList2, sb, " · ", null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                textView.setText(sb);
                z = true;
            }
            bwt0.p0(textView, z);
            long j = userDiscoverItem.v0;
            VkRelation[] values = VkRelation.values();
            int length2 = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    vkRelation = VkRelation.none;
                    break;
                }
                vkRelation = values[i2];
                long j2 = j;
                if (vkRelation.id == j2) {
                    break;
                }
                i2++;
                j = j2;
            }
            if (vkRelation == VkRelation.activelySearching || vkRelation == VkRelation.single) {
                vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_like_outline_20), null, 2));
                r11 = 1;
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, vkRelation.a(whq0Var.getContext(), !userDiscoverItem.K().booleanValue())), false, false, false, false, null, 62));
                vkMiniInfoCell.setDecorator(new vhq0(true));
                z2 = true;
            } else {
                r11 = 1;
                z2 = false;
            }
            bwt0.p0(vkMiniInfoCell, z2);
            if (userDiscoverItem.n0) {
                whq0Var.getIconPositive().setBackgroundResource(R.drawable.vk_icon_user_add_outline_56);
                whq0Var.getTitlePositive().setText(whq0Var.getResources().getString(R.string.users_discover_add));
                whq0Var.getTitleNegative().setText(whq0Var.getResources().getString(R.string.users_discover_skip));
            } else {
                whq0Var.getIconPositive().setBackgroundResource(R.drawable.vk_icon_check_circle_outline_56);
                whq0Var.getTitlePositive().setText(whq0Var.getResources().getString(R.string.users_discover_accept));
                whq0Var.getTitleNegative().setText(whq0Var.getResources().getString(R.string.users_discover_skip));
            }
            VkUserStack vkUserStack = whq0Var.s;
            UserProfile[] userProfileArr = userDiscoverItem.j0;
            boolean z4 = (userProfileArr == null || userProfileArr.length == 0) ? r11 : false;
            boolean z5 = !z4;
            if (z4) {
                vkUserStack.setAvatars(EmptyList.b);
                vkUserStack.setText(null);
            } else {
                if (userProfileArr == null || (n0 = rl3.n0(3, userProfileArr)) == null) {
                    arrayList = null;
                } else {
                    List list = n0;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str7 = ((UserProfile) it.next()).h;
                        if (str7 == null) {
                            str7 = str;
                        }
                        itj0.d(str7, arrayList3);
                    }
                    arrayList = arrayList3;
                }
                if (arrayList != null) {
                    vkUserStack.setAvatars(arrayList);
                }
                int i3 = userDiscoverItem.k0;
                if (i3 >= 2) {
                    if (userProfileArr != null && (userProfile2 = (UserProfile) rl3.O(userProfileArr)) != null && (str3 = userProfile2.d) != null) {
                        str = str3;
                    }
                    int i4 = i3 - r11;
                    hVar = whq0.b(whq0Var.getResources().getQuantityString(R.plurals.users_discover_mutual_friends, i4, str, Integer.valueOf(i4)));
                } else if (i3 == r11) {
                    if (userProfileArr != null && (userProfile = (UserProfile) rl3.O(userProfileArr)) != null && (str2 = userProfile.e) != null) {
                        str = str2;
                    }
                    hVar = whq0.b(whq0Var.getResources().getString(R.string.users_discover_mutual_friend, str));
                } else {
                    hVar = null;
                }
                vkUserStack.setText(hVar);
            }
            bwt0.p0(whq0Var.r, z5);
            bwt0.p0(vkUserStack, z5);
            if (userDiscoverItem.S) {
                bwt0.p0(viewGroup, r11);
                z3 = false;
                bwt0.p0(view, false);
            } else {
                bwt0.p0(viewGroup, r11);
                whq0Var.i.setImageResource(R.drawable.user_discover_placeholder);
                bwt0.p0(view, r11);
                whq0Var.l.setBackgroundResource(R.drawable.vk_icon_camera_off_outline_56);
                whq0Var.m.setText(R.string.users_discover_no_photo);
                z3 = false;
            }
            View view2 = whq0Var.n;
            String str8 = userDiscoverItem.h0;
            bwt0.p0(view2, !((str8 == null || str8.length() == 0) ? r11 : z3));
            int a2 = pvo0.a();
            String str9 = "friend_recomm_view:" + userDiscoverItem.c + ':' + str4 + ':' + userDiscoverItem.J;
            if (b.i(str9)) {
                return;
            }
            String str10 = userDiscoverItem.c + '|' + a2 + "||" + str4 + "||" + userDiscoverItem.J;
            b.d dVar = new b.d("show_user_rec");
            dVar.b = r11;
            dVar.c = r11;
            dVar.b(str10, "user_ids");
            dVar.e();
            b.e(TimeUtils.MILLISECONDS_PER_DAY, str9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new xhq0(viewGroup, this.e);
            case 2:
                return new a8i(viewGroup);
            case 3:
                return new lhr(new khr(viewGroup.getContext()), viewGroup);
            case 4:
                return new bzj0(new azj0(viewGroup.getContext()), viewGroup);
            case 5:
                Context context = viewGroup.getContext();
                v2q0 v2q0Var = new v2q0(context, 0);
                v2q0Var.setClickable(true);
                v2q0Var.setBackgroundResource(R.drawable.bg_under_skeleton_discover_card_rounded_tint);
                View view = new View(context);
                u11.h(-1, -1, view);
                qcy<Object>[] qcyVarArr = bwt0.a;
                dhr0.h0(R.drawable.bg_skeleton_background_rounded, view);
                v2q0Var.addView(view);
                return new w2q0(v2q0Var, viewGroup);
            case 6:
                return new aip(viewGroup);
            case 7:
                return new jfg0(viewGroup);
            default:
                return new aip(viewGroup);
        }
    }
}
