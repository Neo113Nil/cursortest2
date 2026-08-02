package com.vk.profile.community.impl.ui.members;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.f;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersComponent;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.fragments.TabbedFragment;
import xsna.bfg0;
import xsna.bjc;
import xsna.cvs;
import xsna.gko;
import xsna.i8g0;
import xsna.m620;
import xsna.mhy;
import xsna.msy;
import xsna.oz50;
import xsna.qbj;
import xsna.qlu;
import xsna.qzg;
import xsna.s1q0;
import xsna.tlo0;
import xsna.tq;
import xsna.tvj;

/* compiled from: GroupMembersFragment.kt */
/* loaded from: classes5.dex */
public final class GroupMembersFragment extends TabbedFragment implements bfg0 {
    public static final /* synthetic */ int k0 = 0;
    public final HashMap<String, Integer> c0 = new HashMap<>();
    public final ArrayList d0 = new ArrayList();
    public UserId e0 = UserId.d;
    public final Object f0;
    public MobileOfficialAppsCoreNavStat$EventScreen g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;

    /* compiled from: GroupMembersFragment.kt */
    public static final class MembersHiddenStubFragment extends BaseFragment {
        @Override // androidx.fragment.app.Fragment
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            Context requireContext = requireContext();
            ScrollView scrollView = new ScrollView(requireContext);
            VkPlaceholder vkPlaceholder = new VkPlaceholder(requireContext, null, 6, 0);
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_hide_outline_56), null, null, 14));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.community_members_is_hiden)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.community_members_is_hiden_description))));
            scrollView.addView(vkPlaceholder, -1, -2);
            ((FrameLayout.LayoutParams) vkPlaceholder.getLayoutParams()).gravity = 16;
            scrollView.setNestedScrollingEnabled(true);
            return scrollView;
        }
    }

    /* compiled from: GroupMembersFragment.kt */
    public static final class a extends oz50 {
    }

    public GroupMembersFragment() {
        qbj qbjVar = new qbj(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, qbjVar);
        this.h0 = msy.a(lazyThreadSafetyMode, new tvj(this, 11));
        this.i0 = msy.a(lazyThreadSafetyMode, new qzg(this, 21));
        this.j0 = msy.a(lazyThreadSafetyMode, new cvs(this, 1));
    }

    @Override // xsna.bfg0
    public final void Sd() {
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            f fVar = (FragmentImpl) this.b0.d.get(i);
            if (fVar instanceof i8g0) {
                ((i8g0) fVar).Zm();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        m620 m620Var = (m620) this.i0.getValue();
        return m620Var != null && m620Var.a0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r4 == null) goto L13;
     */
    @Override // me.grishka.appkit.fragments.TabbedFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttach(Context context) {
        UserId userId;
        Object obj;
        Object serializable;
        Object obj2;
        Object parcelable;
        super.onAttach(context);
        ArrayList arrayList = new ArrayList();
        Bundle arguments = getArguments();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable("gid", UserId.class);
                obj2 = (Parcelable) parcelable;
            } else {
                Object parcelable2 = arguments.getParcelable("gid");
                if (!(parcelable2 instanceof UserId)) {
                    parcelable2 = null;
                }
                obj2 = (UserId) parcelable2;
            }
            userId = (UserId) obj2;
        }
        userId = this.e0;
        this.e0 = userId;
        setTitle((arguments == null || !arguments.containsKey("title")) ? context.getString(R.string.group_members) : String.valueOf(arguments.getCharSequence("title")));
        ArrayList arrayList2 = this.d0;
        if (arguments == null || !arguments.getBoolean("members_is_hidden", false)) {
            arrayList2.add(oo(CommunityMembersFilter.ALL));
        } else {
            arrayList2.add(new MembersHiddenStubFragment());
        }
        HashMap<String, Integer> hashMap = this.c0;
        hashMap.put("members", 0);
        arrayList.add(getString(R.string.followers));
        arrayList2.add(oo(CommunityMembersFilter.FRIENDS));
        arrayList.add(getString(R.string.friends));
        hashMap.put("friends", 1);
        int i = 2;
        if (arguments != null && arguments.getInt("type") == 1) {
            arrayList2.add(oo(CommunityMembersFilter.UNSURE));
            arrayList.add(getString(R.string.unsure_members));
            hashMap.put("unsure", 2);
            i = 3;
        }
        if (arguments != null && arguments.getBoolean("has_donut_tab", false)) {
            arrayList2.add(oo(CommunityMembersFilter.DONUT));
            arrayList.add(getString(R.string.donut_tab_title));
            hashMap.put("donut", Integer.valueOf(i));
        }
        this.b0.o(arrayList2, arrayList);
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("screen", MobileOfficialAppsCoreNavStat$EventScreen.class);
                obj = serializable;
            } else {
                Object serializable2 = arguments.getSerializable("screen");
                obj = (MobileOfficialAppsCoreNavStat$EventScreen) (serializable2 instanceof MobileOfficialAppsCoreNavStat$EventScreen ? serializable2 : null);
            }
            mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) obj;
        }
        this.g0 = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m620 m620Var = (m620) this.i0.getValue();
        if (m620Var != null) {
            m620Var.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.TabbedFragment, androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        m620 m620Var;
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getBoolean("members_is_hidden", false) || (m620Var = (m620) this.i0.getValue()) == null) {
            return;
        }
        m620Var.f(menu, ho(), requireContext());
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.ToolbarFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Integer num;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        TabbedFragment.a aVar = this.b0;
        if (arguments != null && arguments.getBoolean("start_from_friends", false)) {
            aVar.a.setCurrentItem(1);
        }
        if (arguments != null && (string = arguments.getString("primary_tab", null)) != null && (num = this.c0.get(string)) != null) {
            aVar.a.setCurrentItem(num.intValue());
        }
        if (this.b0.a.getCurrentItem() == 0) {
            po(this.b0.a.getCurrentItem());
        }
        m620 m620Var = (m620) this.i0.getValue();
        if (m620Var != null) {
            m620Var.e(requireContext(), viewGroup);
        }
        return onCreateView;
    }

    @Override // me.grishka.appkit.fragments.TabbedFragment
    public final void onPageSelected(int i) {
        mhy.b(getActivity());
        po(i);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PagerAdapter adapter = this.b0.a.getAdapter();
        if (adapter instanceof s1q0) {
            ((s1q0) adapter).e.onResume();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m620 m620Var = (m620) this.i0.getValue();
        if (m620Var != null) {
            m620Var.h(new qlu(this, view.findViewById(R.id.main_content)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FragmentImpl oo(CommunityMembersFilter communityMembersFilter) {
        return (FragmentImpl) ((CommunityMembersComponent) this.j0.getValue()).x1(this.e0.b, communityMembersFilter);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void po(int i) {
        Object obj;
        String str;
        CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        ComFeatures comFeatures = ComFeatures.COM_DONUT_VISIBILITY;
        comFeatures.getClass();
        if (b.A.a(comFeatures)) {
            Iterator<T> it = this.c0.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (i == ((Integer) ((Map.Entry) obj).getValue()).intValue()) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (str = (String) entry.getKey()) == null) {
                return;
            }
            int hashCode = str.hashCode();
            if (hashCode != -600094315) {
                if (hashCode != 95768354) {
                    if (hashCode != 948881689 || !str.equals("members")) {
                        return;
                    } else {
                        clickEventType = CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SUBSCRIBED_LIST;
                    }
                } else if (!str.equals("donut")) {
                    return;
                } else {
                    clickEventType = CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SUBSCRIBED_DONS_LIST;
                }
            } else if (!str.equals("friends")) {
                return;
            } else {
                clickEventType = CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_SUBSCRIBED_FRIENDS_LIST;
            }
            CommonCommunitiesStat$ClickEvent.ClickEventType clickEventType2 = clickEventType;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = this.g0;
            if (mobileOfficialAppsCoreNavStat$EventScreen2 == null) {
                mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            long j = this.e0.b;
            CommonCommunitiesStat$ClickEvent.Source source = (CommonCommunitiesStat$ClickEvent.Source) this.f0.getValue();
            if (source == null) {
                return;
            }
            new bjc(mobileOfficialAppsCoreNavStat$EventScreen2, SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(j, null, null, new CommonCommunitiesStat$ClickEvent(clickEventType2, source, null, 4, null), 30), 2)).q();
            int hashCode2 = str.hashCode();
            if (hashCode2 == -600094315) {
                if (str.equals("friends")) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IN_GROUP;
                }
                mobileOfficialAppsCoreNavStat$EventScreen = null;
            } else if (hashCode2 != 95768354) {
                if (hashCode2 == 948881689 && str.equals("members")) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP_MEMBERS_LIST;
                }
                mobileOfficialAppsCoreNavStat$EventScreen = null;
            } else {
                if (str.equals("donut")) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP_DONATORS_LIST;
                }
                mobileOfficialAppsCoreNavStat$EventScreen = null;
            }
            this.g0 = mobileOfficialAppsCoreNavStat$EventScreen;
        }
    }
}
