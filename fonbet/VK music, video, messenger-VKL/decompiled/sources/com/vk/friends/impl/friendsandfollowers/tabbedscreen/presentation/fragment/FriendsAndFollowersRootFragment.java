package com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.ao50;
import xsna.c5g;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.eks;
import xsna.els;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.fls;
import xsna.gks;
import xsna.gm50;
import xsna.h3p0;
import xsna.j5g;
import xsna.k1q0;
import xsna.km50;
import xsna.lpj;
import xsna.mbs;
import xsna.mc0;
import xsna.mk50;
import xsna.msy;
import xsna.nhe;
import xsna.nks;
import xsna.o0q0;
import xsna.omf;
import xsna.on00;
import xsna.oz50;
import xsna.p4g;
import xsna.qpo;
import xsna.rks;
import xsna.sks;
import xsna.swe0;
import xsna.tks;
import xsna.tlo0;
import xsna.tls;
import xsna.too0;
import xsna.tq;
import xsna.u1r0;
import xsna.u3k;
import xsna.uks;
import xsna.uqm0;
import xsna.uzp;
import xsna.vk50;
import xsna.vks;
import xsna.wks;
import xsna.xks;
import xsna.y1z;

/* compiled from: FriendsAndFollowersRootFragment.kt */
/* loaded from: classes15.dex */
public final class FriendsAndFollowersRootFragment extends MviImplFragment<gks, tls, eks> implements too0, o0q0 {
    public static final /* synthetic */ int Z = 0;
    public UserId Q;
    public k1q0 R;
    public e S;
    public uks T;
    public boolean U;
    public mc0 W;
    public final d Y;
    public els V = els.e;
    public final Object X = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.a(8));

    /* compiled from: FriendsAndFollowersRootFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: FriendsAndFollowersRootFragment.kt */
    public static final class b {
        public static FriendsAndFollowersTabType a(Bundle bundle, els elsVar) {
            Object failure;
            FriendsAndFollowersTabType friendsAndFollowersTabType;
            List<els.a> list = elsVar.d;
            String string = bundle.getString("selected_tab_type");
            FriendsAndFollowersTabType friendsAndFollowersTabType2 = null;
            if (string != null) {
                try {
                    failure = FriendsAndFollowersTabType.valueOf(string);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                FriendsAndFollowersTabType friendsAndFollowersTabType3 = (FriendsAndFollowersTabType) failure;
                if (friendsAndFollowersTabType3 != null) {
                    List<els.a> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((els.a) it.next()).b == friendsAndFollowersTabType3) {
                                friendsAndFollowersTabType2 = friendsAndFollowersTabType3;
                                break;
                            }
                        }
                    }
                }
            }
            if (friendsAndFollowersTabType2 != null) {
                return friendsAndFollowersTabType2;
            }
            els.a aVar = (els.a) j5g.b0(bundle.getInt("selected_tab_position", -1), list);
            if (aVar != null && (friendsAndFollowersTabType = aVar.b) != null) {
                return friendsAndFollowersTabType;
            }
            els.a aVar2 = (els.a) j5g.a0(list);
            return aVar2 != null ? aVar2.b : FriendsAndFollowersTabType.ALL_FRIENDS;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
        public static els b(Bundle bundle) {
            ?? r2;
            Object failure;
            UserId userId = (UserId) bundle.getParcelable("uid");
            if (userId == null) {
                userId = UserId.d;
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("tabs");
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("counters");
            boolean z = bundle.getBoolean("can_access_profile");
            String string = bundle.getString("owner_name");
            if (string == null) {
                string = "";
            }
            if (stringArrayList == null || integerArrayList == null) {
                r2 = EmptyList.b;
            } else {
                ArrayList X0 = j5g.X0(stringArrayList, integerArrayList);
                r2 = new ArrayList();
                Iterator it = X0.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    String str = (String) pair.d();
                    Integer num = (Integer) pair.g();
                    try {
                        failure = FriendsAndFollowersTabType.valueOf(str);
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    FriendsAndFollowersTabType friendsAndFollowersTabType = (FriendsAndFollowersTabType) failure;
                    els.a aVar = friendsAndFollowersTabType != null ? new els.a(num.intValue(), friendsAndFollowersTabType) : null;
                    if (aVar != null) {
                        r2.add(aVar);
                    }
                }
            }
            return new els(userId, r2, string, z);
        }

        public static els c(els elsVar, boolean z) {
            String str = elsVar.c;
            List<els.a> list = elsVar.d;
            List l = z ? e43.l(FriendsAndFollowersTabType.ALL_FRIENDS, FriendsAndFollowersTabType.ONLINE_FRIENDS, FriendsAndFollowersTabType.MUTUAL, FriendsAndFollowersTabType.FOLLOWERS) : e43.l(FriendsAndFollowersTabType.FOLLOWERS, FriendsAndFollowersTabType.ALL_FRIENDS, FriendsAndFollowersTabType.MUTUAL);
            List<els.a> list2 = list;
            int e = on00.e(c5g.u(list2, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj : list2) {
                linkedHashMap.put(((els.a) obj).b, obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = l.iterator();
            while (it.hasNext()) {
                els.a aVar = (els.a) linkedHashMap.get((FriendsAndFollowersTabType) it.next());
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            String str2 = z ? str : null;
            if (str2 == null) {
                str2 = "";
            }
            return (epx.f(list, arrayList) && epx.f(str, str2)) ? elsVar : els.a(elsVar, str2, arrayList, 3);
        }

        public static void d(Bundle bundle, els elsVar) {
            bundle.putParcelable("uid", elsVar.a);
            bundle.putBoolean("can_access_profile", elsVar.b);
            bundle.putString("owner_name", elsVar.c);
            List<els.a> list = elsVar.d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((els.a) it.next()).b.name());
            }
            bundle.putStringArrayList("tabs", p4g.q(arrayList));
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((els.a) it2.next()).a));
            }
            bundle.putIntegerArrayList("counters", p4g.q(arrayList2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            if (r1 != (-1)) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            r4 = java.lang.Integer.valueOf(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r4 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            return r4.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        
            return 0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int e(FriendsAndFollowersTabType friendsAndFollowersTabType, List list) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                Integer num = null;
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (((els.a) next).b == friendsAndFollowersTabType) {
                    break;
                }
                i++;
            }
        }
    }

    /* compiled from: FriendsAndFollowersRootFragment.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsAndFollowersTabType.values().length];
            try {
                iArr[FriendsAndFollowersTabType.FOLLOWERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsAndFollowersTabType.ALL_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FriendsAndFollowersTabType.ONLINE_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FriendsAndFollowersTabType.MUTUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FriendsAndFollowersRootFragment.kt */
    public static final class d extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = FriendsAndFollowersRootFragment.Z;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public FriendsAndFollowersRootFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.Y = new d();
    }

    public static final void fo(FriendsAndFollowersRootFragment friendsAndFollowersRootFragment, VkTabs.c cVar, int i) {
        com.vk.core.view.components.tabs.d dVar = cVar.a;
        els.a aVar = (els.a) j5g.b0(i, friendsAndFollowersRootFragment.V.d);
        if (aVar == null) {
            return;
        }
        int i2 = aVar.a;
        int i3 = c.$EnumSwitchMapping$0[aVar.b.ordinal()];
        if (i3 == 1) {
            dVar.setId(R.id.friends_and_followers_screen_followers_tab);
            if (friendsAndFollowersRootFragment.ho()) {
                friendsAndFollowersRootFragment.jo(cVar, i2, R.string.followers_count_zero, R.string.followers_tab_count_formatted);
            } else {
                friendsAndFollowersRootFragment.io(cVar, i2, R.plurals.followers_count, R.string.followers_count_zero, R.string.followers_count_formatted);
            }
        } else if (i3 == 2) {
            dVar.setId(R.id.friends_and_followers_screen_all_friends_tab);
            if (friendsAndFollowersRootFragment.ho()) {
                friendsAndFollowersRootFragment.jo(cVar, i2, R.string.friends_count_zero, R.string.friends_tab_count_formatted);
            } else {
                friendsAndFollowersRootFragment.io(cVar, i2, R.plurals.friends_count, R.string.friends_count_zero, R.string.friends_count_formatted);
            }
        } else if (i3 == 3) {
            dVar.setId(R.id.friends_and_followers_screen_online_friends_tab);
            friendsAndFollowersRootFragment.jo(cVar, i2, R.string.online_friends_tab_count_zero, R.string.online_friends_tab_count_formatted);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.setId(R.id.friends_and_followers_screen_mutual_friends_tab);
            if (friendsAndFollowersRootFragment.ho()) {
                dVar.Y4(friendsAndFollowersRootFragment.requireContext().getString(R.string.mutual_friends_tab_count_formatted, uqm0.d(i2)), null);
            } else {
                friendsAndFollowersRootFragment.io(cVar, i2, R.plurals.mutual_count, R.string.mutual_count_zero, R.string.mutual_count_formatted);
            }
        }
        dVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.friends_and_followers_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((tls) ao50Var).a, new omf(this, 17));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.Y;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((gks) vk50Var).g.a(new nhe(this, 24), this);
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        int currentItem = ((ViewPager2) go().c).getCurrentItem();
        k1q0 k1q0Var = this.R;
        if (k1q0Var != null) {
            return k1q0Var.F0(currentItem);
        }
        return null;
    }

    public final mc0 go() {
        mc0 mc0Var = this.W;
        if (mc0Var != null) {
            return mc0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean ho() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    public final void io(VkTabs.c cVar, int i, int i2, int i3, int i4) {
        String d2 = uqm0.d(i);
        cVar.a.Y4(i < 1000 ? enj.i(requireContext().getResources(), i2, i, i3, d2) : requireContext().getResources().getString(i4, d2), null);
    }

    public final void jo(VkTabs.c cVar, int i, int i2, int i3) {
        cVar.a.Y4(i == 0 ? requireContext().getResources().getString(i2) : requireContext().getResources().getString(i3, uqm0.d(i)), null);
    }

    public final void ko(FriendsAndFollowersTabType friendsAndFollowersTabType) {
        int itemCount;
        int g;
        k1q0 k1q0Var = this.R;
        if (k1q0Var == null || (itemCount = k1q0Var.getItemCount()) == 0 || ((ViewPager2) go().c).getCurrentItem() == (g = swe0.g(b.e(friendsAndFollowersTabType, this.V.d), 0, itemCount - 1))) {
            return;
        }
        ((ViewPager2) go().c).e(g, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewPager2 viewPager2;
        mc0 mc0Var;
        ViewPager2 viewPager22;
        super.onDestroyView();
        uks uksVar = this.T;
        if (uksVar != null && (mc0Var = this.W) != null && (viewPager22 = (ViewPager2) mc0Var.c) != null) {
            viewPager22.g(uksVar);
        }
        this.T = null;
        e eVar = this.S;
        if (eVar != null) {
            eVar.b();
        }
        this.S = null;
        mc0 mc0Var2 = this.W;
        if (mc0Var2 != null && (viewPager2 = (ViewPager2) mc0Var2.c) != null) {
            viewPager2.setAdapter(null);
        }
        this.R = null;
        this.W = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        els elsVar;
        FriendsAndFollowersTabType friendsAndFollowersTabType;
        Bundle arguments;
        super.onSaveInstanceState(bundle);
        if (ho()) {
            els c2 = b.c(this.V, ho());
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                b.d(arguments2, c2);
            }
            els.a aVar = (els.a) j5g.b0(((ViewPager2) go().c).getCurrentItem(), c2.d);
            if (aVar == null || (friendsAndFollowersTabType = aVar.b) == null || (arguments = getArguments()) == null) {
                return;
            }
            arguments.putString("selected_tab_type", friendsAndFollowersTabType.name());
            return;
        }
        k1q0 k1q0Var = this.R;
        nks nksVar = k1q0Var instanceof nks ? (nks) k1q0Var : null;
        if (nksVar == null || (elsVar = nksVar.t) == null) {
            elsVar = this.V;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            b.d(arguments3, elsVar);
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            arguments4.remove("selected_tab_type");
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.putInt("selected_tab_position", ((ViewPager2) go().c).getCurrentItem());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
    
        if (r9 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0217, code lost:
    
        if (r11 != (-1)) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0231 A[SYNTHETIC] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer num;
        Integer num2;
        Bundle arguments;
        FriendsAndFollowersTabType a2;
        super.onViewCreated(view, bundle);
        this.W = new mc0(view);
        Bundle arguments2 = getArguments();
        els b2 = arguments2 != null ? b.b(arguments2) : null;
        els c2 = b2 != null ? b.c(b2, ho()) : null;
        FriendsAndFollowersTabType a3 = (b2 == null || c2 == null || (arguments = getArguments()) == null || (a2 = b.a(arguments, b2)) == null) ? null : fls.a(a2, c2.d);
        if (a3 == null) {
            a3 = FriendsAndFollowersTabType.ALL_FRIENDS;
        }
        mc0 go = go();
        VkTopBar vkTopBar = (VkTopBar) go.a;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = b.b(arguments3).c) != null) {
            if (!ho() || drm0.N(string)) {
                string = null;
            }
        }
        string = getString(R.string.followers);
        vkTopBar.setBack(new VkTopBar.b(new u3k(this, 12), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.h(string), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new tks(string, 0), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        h3p0.d(this, vkTopBar);
        ViewPager2 viewPager2 = (ViewPager2) go.c;
        VkTabs vkTabs = (VkTabs) go.b;
        Object[] objArr = bundle != null;
        f4m.t(cn70.b(52) + e3m.d(R.attr.actionBarSize, requireContext()), viewPager2);
        viewPager2.setOffscreenPageLimit(1);
        boolean ho = ho();
        mbs mbsVar = this.D;
        if (ho) {
            vkTabs.setMode(Tab$Mode.Secondary);
            qpo qpoVar = new qpo(viewPager2, this, mbsVar, In().a);
            this.R = qpoVar;
            viewPager2.setAdapter(qpoVar);
            if (c2 != null) {
                this.V = c2;
                qpoVar.J0(c2);
                List<els.a> list = c2.d;
                if (!list.isEmpty()) {
                    viewPager2.e(swe0.g(b.e(a3, list), 0, e43.h(list)), false);
                }
            }
            e eVar = new e(vkTabs, viewPager2, false, new vks(this));
            this.S = eVar;
            eVar.a();
            if (objArr != false) {
                qpoVar.p.clear();
                int i = 0;
                for (Object obj : qpoVar.t.d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    qpoVar.G0(null, i);
                    i = i2;
                }
                for (Fragment fragment : qpoVar.s.c.f()) {
                    FriendsAndFollowersTabType m = uzp.m(fragment);
                    if (m != null) {
                        Iterator<els.a> it = qpoVar.t.d.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                                break;
                            } else if (it.next().b == m) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        num2 = Integer.valueOf(i3);
                    }
                    num2 = null;
                    if (num2 != null) {
                        qpoVar.G0(fragment, num2.intValue());
                    }
                }
            }
        } else {
            nks nksVar = new nks(viewPager2, this, mbsVar, In().a);
            this.R = nksVar;
            viewPager2.setAdapter(nksVar);
            if (ho()) {
                vkTabs.setMode(Tab$Mode.Secondary);
            }
            e eVar2 = new e(vkTabs, viewPager2, true, new wks(this));
            this.S = eVar2;
            eVar2.a();
            if (c2 != null) {
                if (objArr == false) {
                    c2 = null;
                }
                if (c2 != null) {
                    this.V = c2;
                    for (Fragment fragment2 : nksVar.s.c.f()) {
                        FriendsAndFollowersTabType m2 = uzp.m(fragment2);
                        if (m2 != null) {
                            Iterator<els.a> it2 = c2.d.iterator();
                            int i4 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i4 = -1;
                                    break;
                                } else if (it2.next().b == m2) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            num = Integer.valueOf(i4);
                        } else {
                            Bundle arguments4 = fragment2.getArguments();
                            if (arguments4 != null) {
                                int i5 = arguments4.getInt("friends_and_followers_tab_adapter_position", -1);
                                Integer valueOf = Integer.valueOf(i5);
                                if (i5 != -1) {
                                    num = valueOf;
                                    if (num == null) {
                                        nksVar.G0(fragment2, num.intValue());
                                    }
                                }
                            }
                            num = null;
                            if (num == null) {
                            }
                        }
                    }
                    if (!epx.f(nksVar.t, c2)) {
                        nksVar.t = c2;
                        nksVar.notifyDataSetChanged();
                    }
                }
            }
        }
        uks uksVar = new uks(this);
        viewPager2.b(uksVar);
        this.T = uksVar;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId = (UserId) bundle.getParcelable("uid");
        if (userId == null) {
            userId = UserId.d;
        }
        this.Q = userId;
        els b2 = b.b(bundle);
        els c2 = b.c(b2, ho());
        FriendsAndFollowersTabType a2 = fls.a(b.a(bundle, b2), c2.d);
        xks xksVar = ho() ? new xks(a2, c2) : new xks(FriendsAndFollowersTabType.FOLLOWERS, els.e);
        u1r0 u1r0Var = new u1r0();
        UserId userId2 = this.Q;
        if (userId2 == null) {
            userId2 = null;
        }
        return new gks(new sks(u1r0Var, userId2), new rks(xksVar), new eks.a(a2, c2));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
    }
}
