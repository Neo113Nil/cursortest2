package com.vk.friends.discover;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.hints.HintId;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UserDiscoverState;
import com.vk.friends.discover.UsersDiscoverAdapter;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.home.HomeFragment2;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.azj0;
import xsna.b0u0;
import xsna.bkm;
import xsna.bnc0;
import xsna.bwt0;
import xsna.cim0;
import xsna.df90;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.ey50;
import xsna.fem0;
import xsna.fkq0;
import xsna.fuc0;
import xsna.gxp;
import xsna.gzs;
import xsna.h3p0;
import xsna.h7u0;
import xsna.hri0;
import xsna.ies;
import xsna.ifg0;
import xsna.iut0;
import xsna.j6l0;
import xsna.j6r0;
import xsna.khr;
import xsna.l7v;
import xsna.m52;
import xsna.msy;
import xsna.nds;
import xsna.nf0;
import xsna.nx3;
import xsna.odc0;
import xsna.oo6;
import xsna.oz50;
import xsna.pla;
import xsna.pmv;
import xsna.ptl0;
import xsna.r0r0;
import xsna.rtc0;
import xsna.s170;
import xsna.s3q0;
import xsna.too0;
import xsna.u080;
import xsna.uhq0;
import xsna.vds;
import xsna.vtk0;
import xsna.wc2;
import xsna.whp;
import xsna.ww50;
import xsna.xa80;
import xsna.y7i;
import xsna.z76;

/* compiled from: UsersDiscoverFragment.kt */
/* loaded from: classes13.dex */
public final class UsersDiscoverFragment extends BaseMvpFragment<Object> implements too0, c.n, ies, vds, nds, bkm {
    public static final /* synthetic */ int t0 = 0;
    public final UsersDiscoverPresenter T;
    public UsersDiscoverListView U;
    public TextView V;
    public VkButton W;
    public VkSimpleButton X;
    public TextView Y;
    public TextView Z;
    public ImageView a0;
    public View b0;
    public d c0;
    public ww50<?> d0;
    public boolean e0;
    public int f0;
    public final rtc0 g0;
    public boolean h0;
    public boolean i0;
    public gzs<s3q0> j0;
    public final UsersDiscoverAdapter k0;
    public final Handler l0;
    public final wc2 m0;
    public final nx3 n0;
    public final oo6 o0;
    public final m52 p0;
    public final nf0 q0;
    public final Object r0;
    public final b s0;

    /* compiled from: UsersDiscoverFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(UsersDiscoverFragment.class, null, null);
        }

        public final void A(UserId userId) {
            if (fkq0.c(userId)) {
                this.j.putParcelable("pinned_request_id", userId);
            }
        }

        public final void y(boolean z) {
            this.j.putBoolean("only_recommendations", z);
        }

        public final void z(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            this.j.putString("source", str);
        }
    }

    /* compiled from: UsersDiscoverFragment.kt */
    public static final class b implements uhq0 {
        public b() {
        }

        @Override // xsna.uhq0
        public final void a() {
            UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UsersDiscoverListView usersDiscoverListView = usersDiscoverFragment.U;
            RecyclerView.o layoutManager = usersDiscoverListView != null ? usersDiscoverListView.getLayoutManager() : null;
            UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
            long j = usersDiscoverLayoutManager != null ? usersDiscoverLayoutManager.g.h : 150L;
            if (usersDiscoverLayoutManager != null) {
                usersDiscoverLayoutManager.g.getClass();
            }
            UsersDiscoverListView usersDiscoverListView2 = usersDiscoverFragment.U;
            if (usersDiscoverListView2 != null) {
                usersDiscoverListView2.postDelayed(usersDiscoverFragment.o0, j);
            }
        }

        @Override // xsna.uhq0
        public final boolean b(int i) {
            UsersDiscoverPresenter usersDiscoverPresenter = UsersDiscoverFragment.this.T;
            if (usersDiscoverPresenter != null) {
                return i < usersDiscoverPresenter.c.d.size() && i >= 0;
            }
            return true;
        }

        @Override // xsna.uhq0
        public final void c() {
            UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UsersDiscoverListView usersDiscoverListView = usersDiscoverFragment.U;
            RecyclerView.o layoutManager = usersDiscoverListView != null ? usersDiscoverListView.getLayoutManager() : null;
            UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
            long j = usersDiscoverLayoutManager != null ? usersDiscoverLayoutManager.g.f : 300L;
            long j2 = usersDiscoverLayoutManager != null ? usersDiscoverLayoutManager.g.o : 1000L;
            UsersDiscoverListView usersDiscoverListView2 = usersDiscoverFragment.U;
            if (usersDiscoverListView2 != null) {
                usersDiscoverListView2.postDelayed(usersDiscoverFragment.n0, j + j2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // xsna.uhq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(int i, View view) {
            Object obj;
            UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UsersDiscoverPresenter usersDiscoverPresenter = usersDiscoverFragment.T;
            if (usersDiscoverPresenter != null && i >= 0) {
                ListDataSet<Object> listDataSet = usersDiscoverPresenter.c;
                if (i < listDataSet.d.size()) {
                    obj = listDataSet.d.get(i);
                    if (obj instanceof UserDiscoverItem) {
                        if (view instanceof y7i) {
                            VkButton vkButton = usersDiscoverFragment.W;
                            if (vkButton != null) {
                                UsersDiscoverFragment.ko(4, vkButton);
                            }
                            VkSimpleButton vkSimpleButton = usersDiscoverFragment.X;
                            if (vkSimpleButton != null) {
                                UsersDiscoverFragment.ko(4, vkSimpleButton);
                            }
                            TextView textView = usersDiscoverFragment.Y;
                            if (textView != null) {
                                UsersDiscoverFragment.ko(0, textView);
                            }
                            TextView textView2 = usersDiscoverFragment.Z;
                            if (textView2 != null) {
                                UsersDiscoverFragment.ko(0, textView2);
                            }
                        } else if (view instanceof khr) {
                            VkButton vkButton2 = usersDiscoverFragment.W;
                            if (vkButton2 != null) {
                                UsersDiscoverFragment.ko(4, vkButton2);
                            }
                            VkSimpleButton vkSimpleButton2 = usersDiscoverFragment.X;
                            if (vkSimpleButton2 != null) {
                                UsersDiscoverFragment.ko(4, vkSimpleButton2);
                            }
                            TextView textView3 = usersDiscoverFragment.Y;
                            if (textView3 != null) {
                                UsersDiscoverFragment.ko(4, textView3);
                            }
                            TextView textView4 = usersDiscoverFragment.Z;
                            if (textView4 != null) {
                                UsersDiscoverFragment.ko(0, textView4);
                            }
                        } else if (view instanceof ifg0) {
                            UsersDiscoverFragment.jo(usersDiscoverFragment);
                        } else if (view instanceof azj0) {
                            UsersDiscoverFragment.jo(usersDiscoverFragment);
                        } else {
                            UsersDiscoverFragment.jo(usersDiscoverFragment);
                        }
                    } else if (((UserDiscoverItem) obj).n0) {
                        VkButton vkButton3 = usersDiscoverFragment.W;
                        if (vkButton3 != null) {
                            vkButton3.setText(R.string.users_discover_add);
                        }
                        VkButton vkButton4 = usersDiscoverFragment.W;
                        if (vkButton4 != null) {
                            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_user_add_outline_24);
                            int[] iArr = VkButton.W;
                            vkButton4.a5(true, valueOf);
                        }
                        VkSimpleButton vkSimpleButton3 = usersDiscoverFragment.X;
                        if (vkSimpleButton3 != null) {
                            vkSimpleButton3.setText(R.string.users_discover_skip);
                        }
                        VkButton vkButton5 = usersDiscoverFragment.W;
                        if (vkButton5 != null) {
                            UsersDiscoverFragment.ko(0, vkButton5);
                        }
                        VkSimpleButton vkSimpleButton4 = usersDiscoverFragment.X;
                        if (vkSimpleButton4 != null) {
                            UsersDiscoverFragment.ko(0, vkSimpleButton4);
                        }
                        TextView textView5 = usersDiscoverFragment.Y;
                        if (textView5 != null) {
                            UsersDiscoverFragment.ko(4, textView5);
                        }
                        TextView textView6 = usersDiscoverFragment.Z;
                        if (textView6 != null) {
                            UsersDiscoverFragment.ko(4, textView6);
                        }
                        TextView textView7 = usersDiscoverFragment.V;
                        if (textView7 != null) {
                            textView7.setText(R.string.users_discover_recommendations_title);
                        }
                    } else {
                        VkButton vkButton6 = usersDiscoverFragment.W;
                        if (vkButton6 != null) {
                            vkButton6.setText(R.string.users_discover_accept);
                        }
                        VkSimpleButton vkSimpleButton5 = usersDiscoverFragment.X;
                        if (vkSimpleButton5 != null) {
                            vkSimpleButton5.setText(R.string.users_discover_skip);
                        }
                        VkButton vkButton7 = usersDiscoverFragment.W;
                        if (vkButton7 != null) {
                            UsersDiscoverFragment.ko(0, vkButton7);
                        }
                        VkSimpleButton vkSimpleButton6 = usersDiscoverFragment.X;
                        if (vkSimpleButton6 != null) {
                            UsersDiscoverFragment.ko(0, vkSimpleButton6);
                        }
                        TextView textView8 = usersDiscoverFragment.Y;
                        if (textView8 != null) {
                            UsersDiscoverFragment.ko(4, textView8);
                        }
                        TextView textView9 = usersDiscoverFragment.Z;
                        if (textView9 != null) {
                            UsersDiscoverFragment.ko(4, textView9);
                        }
                        if (!usersDiscoverFragment.i0) {
                            l7v b = pla.e().b();
                            HintId hintId = HintId.INFO_FRIENDS_ONBOARDING_SWIPE;
                            if (b.a(hintId.getId()) && pla.e().b().b(hintId.getId()) != null) {
                                usersDiscoverFragment.i0 = true;
                                UsersDiscoverListView usersDiscoverListView = usersDiscoverFragment.U;
                                if (usersDiscoverListView != null) {
                                    usersDiscoverListView.d = false;
                                }
                                VkButton vkButton8 = usersDiscoverFragment.W;
                                if (vkButton8 != null) {
                                    vkButton8.setEnabled(false);
                                }
                                VkSimpleButton vkSimpleButton7 = usersDiscoverFragment.X;
                                if (vkSimpleButton7 != null) {
                                    vkSimpleButton7.setEnabled(false);
                                }
                                UsersDiscoverListView usersDiscoverListView2 = usersDiscoverFragment.U;
                                Object layoutManager = usersDiscoverListView2 != null ? usersDiscoverListView2.getLayoutManager() : null;
                                UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                                long j = usersDiscoverLayoutManager != null ? usersDiscoverLayoutManager.g.n : 500L;
                                UsersDiscoverListView usersDiscoverListView3 = usersDiscoverFragment.U;
                                if (usersDiscoverListView3 != null) {
                                    usersDiscoverListView3.postDelayed(usersDiscoverFragment.m0, j);
                                }
                            }
                        }
                        TextView textView10 = usersDiscoverFragment.V;
                        if (textView10 != null) {
                            textView10.setText(R.string.users_discover_requests_title);
                        }
                    }
                    if (view instanceof pmv) {
                        return;
                    }
                    ((pmv) view).a();
                    return;
                }
            }
            obj = null;
            if (obj instanceof UserDiscoverItem) {
            }
            if (view instanceof pmv) {
            }
        }

        @Override // xsna.uhq0
        public final void e() {
            UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UsersDiscoverListView usersDiscoverListView = usersDiscoverFragment.U;
            RecyclerView.o layoutManager = usersDiscoverListView != null ? usersDiscoverListView.getLayoutManager() : null;
            long j = (layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null) != null ? r2.g.l : 300L;
            UsersDiscoverListView usersDiscoverListView2 = usersDiscoverFragment.U;
            if (usersDiscoverListView2 != null) {
                usersDiscoverListView2.postDelayed(usersDiscoverFragment.q0, j);
            }
        }

        @Override // xsna.uhq0
        public final boolean f(int i) {
            UsersDiscoverPresenter usersDiscoverPresenter = UsersDiscoverFragment.this.T;
            if (usersDiscoverPresenter != null) {
                return usersDiscoverPresenter.c.c(i) instanceof UserDiscoverItem;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        @Override // xsna.uhq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g(Direction direction, int i, boolean z) {
            ListDataSet<Object> listDataSet;
            ListDataSet.ArrayListImpl<Object> arrayListImpl;
            UserDiscoverItem userDiscoverItem;
            ListDataSet<Object> listDataSet2;
            ListDataSet.ArrayListImpl<Object> arrayListImpl2;
            boolean z2 = direction == Direction.Right;
            UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UsersDiscoverPresenter usersDiscoverPresenter = usersDiscoverFragment.T;
            if (usersDiscoverPresenter == null || (listDataSet = usersDiscoverPresenter.c) == null || (arrayListImpl = listDataSet.d) == null) {
                return;
            }
            if (i >= 0 && i < arrayListImpl.size()) {
                Object obj = arrayListImpl.get(i);
                if (obj instanceof UserDiscoverItem) {
                    userDiscoverItem = (UserDiscoverItem) obj;
                    if (userDiscoverItem != null) {
                        return;
                    }
                    UsersDiscoverPresenter usersDiscoverPresenter2 = usersDiscoverFragment.T;
                    if (usersDiscoverPresenter2 != null && (listDataSet2 = usersDiscoverPresenter2.c) != null && (arrayListImpl2 = listDataSet2.d) != null) {
                        UserId userId = userDiscoverItem.c;
                        boolean z3 = userDiscoverItem.n0;
                        String str = z3 ? "recommended" : "request";
                        String str2 = z2 ? "accept" : "decline";
                        String str3 = z ? "swipe" : "button";
                        Iterator<Object> it = arrayListImpl2.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            Object next = it.next();
                            if ((next instanceof UserDiscoverItem) && ((UserDiscoverItem) next).n0) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        int i3 = i >= i2 ? i - i2 : i;
                        int i4 = userDiscoverItem.n0 ? -1 : usersDiscoverPresenter2.e;
                        Boolean bool = (z3 || z2) ? null : Boolean.TRUE;
                        b.d dVar = new b.d("friend_swipe_decision");
                        dVar.b(userId, "user_id");
                        dVar.b(str2, "decision");
                        dVar.b(str3, "source");
                        dVar.b(str, "type");
                        dVar.b(Integer.valueOf(i3), "offset_in_type");
                        dVar.b(Integer.valueOf(i), "offset_all");
                        if (i4 >= 0) {
                            dVar.b(Integer.valueOf(i4), "total_in_type");
                        }
                        if (bool != null) {
                            dVar.b(Integer.valueOf(bool.booleanValue() ? 1 : 0), "is_request_skip");
                        }
                        dVar.e();
                    }
                    if (z2) {
                        UsersDiscoverPresenter usersDiscoverPresenter3 = usersDiscoverFragment.T;
                        if (usersDiscoverPresenter3 != null) {
                            usersDiscoverPresenter3.x(userDiscoverItem, true);
                            return;
                        }
                        return;
                    }
                    UsersDiscoverPresenter usersDiscoverPresenter4 = usersDiscoverFragment.T;
                    if (usersDiscoverPresenter4 != null) {
                        usersDiscoverPresenter4.x(userDiscoverItem, false);
                        return;
                    }
                    return;
                }
            }
            userDiscoverItem = null;
            if (userDiscoverItem != null) {
            }
        }

        @Override // xsna.uhq0
        public final void h() {
            UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UsersDiscoverListView usersDiscoverListView = usersDiscoverFragment.U;
            RecyclerView.o layoutManager = usersDiscoverListView != null ? usersDiscoverListView.getLayoutManager() : null;
            UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
            long j = usersDiscoverLayoutManager != null ? usersDiscoverLayoutManager.g.j : 150L;
            long j2 = usersDiscoverLayoutManager != null ? usersDiscoverLayoutManager.g.p : 1000L;
            UsersDiscoverListView usersDiscoverListView2 = usersDiscoverFragment.U;
            if (usersDiscoverListView2 != null) {
                usersDiscoverListView2.postDelayed(usersDiscoverFragment.p0, j + j2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (xsna.pla.e().b().a(com.vk.dto.hints.HintId.INFO_FRIENDS_ONBOARDING_ADD_CONFIRMATION.getId()) == false) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
        @Override // xsna.uhq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean i(int i) {
            boolean z;
            ListDataSet<Object> listDataSet;
            ListDataSet.ArrayListImpl<Object> arrayListImpl;
            UsersDiscoverPresenter usersDiscoverPresenter;
            final UsersDiscoverFragment usersDiscoverFragment = UsersDiscoverFragment.this;
            UserDiscoverItem userDiscoverItem = null;
            if (usersDiscoverFragment.c0 == null) {
                if (!usersDiscoverFragment.h0 && (usersDiscoverPresenter = usersDiscoverFragment.T) != null) {
                    Object c = usersDiscoverPresenter.c.c(i);
                    UserDiscoverItem userDiscoverItem2 = c instanceof UserDiscoverItem ? (UserDiscoverItem) c : null;
                    if (userDiscoverItem2 != null) {
                        if (userDiscoverItem2.n0) {
                        }
                    }
                }
                z = false;
                if (z) {
                    UsersDiscoverPresenter usersDiscoverPresenter2 = usersDiscoverFragment.T;
                    if (usersDiscoverPresenter2 != null && (listDataSet = usersDiscoverPresenter2.c) != null && (arrayListImpl = listDataSet.d) != null) {
                        if (i >= 0 && i < arrayListImpl.size()) {
                            Object obj = arrayListImpl.get(i);
                            if (obj instanceof UserDiscoverItem) {
                                userDiscoverItem = (UserDiscoverItem) obj;
                            }
                        }
                        if (userDiscoverItem != null && pla.e().b().b(HintId.INFO_FRIENDS_ONBOARDING_ADD_CONFIRMATION.getId()) != null) {
                            usersDiscoverFragment.h0 = true;
                            final fem0 fem0Var = new fem0(usersDiscoverFragment, 5);
                            final odc0 odc0Var = new odc0(usersDiscoverFragment, 25);
                            FragmentActivity activity = usersDiscoverFragment.getActivity();
                            if (activity == null) {
                                odc0Var.invoke();
                            } else if (usersDiscoverFragment.c0 == null) {
                                h7u0.a aVar = new h7u0.a(activity);
                                String string = userDiscoverItem.s.getString("first_name_acc");
                                if (string == null) {
                                    string = "";
                                }
                                aVar.h0(usersDiscoverFragment.getString(R.string.users_discover_dialog_title, string));
                                aVar.U(userDiscoverItem.K().booleanValue() ? R.string.users_discover_dialog_text_female : R.string.users_discover_dialog_text_male);
                                aVar.c = false;
                                aVar.c0(R.string.users_discover_dialog_positive, new DialogInterface.OnClickListener() { // from class: xsna.t0r0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        int i3 = UsersDiscoverFragment.t0;
                                        dialogInterface.dismiss();
                                        UsersDiscoverFragment.this.c0 = null;
                                        fem0Var.invoke();
                                    }
                                });
                                aVar.W(R.string.users_discover_dialog_negative, new DialogInterface.OnClickListener() { // from class: xsna.u0r0
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        int i3 = UsersDiscoverFragment.t0;
                                        dialogInterface.dismiss();
                                        UsersDiscoverFragment.this.c0 = null;
                                        odc0Var.invoke();
                                    }
                                });
                                usersDiscoverFragment.c0 = aVar.m();
                            }
                        }
                    }
                    return true;
                }
                return !z;
            }
            z = true;
            if (z) {
            }
            return !z;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [xsna.v0r0] */
    public UsersDiscoverFragment() {
        UsersDiscoverPresenter usersDiscoverPresenter = new UsersDiscoverPresenter(this);
        this.T = usersDiscoverPresenter;
        this.g0 = vtk0.c();
        this.k0 = new UsersDiscoverAdapter(usersDiscoverPresenter.c, usersDiscoverPresenter.d, new cim0(this, 6), new xa80() { // from class: xsna.v0r0
            @Override // xsna.xa80
            public final void b() {
                gzs<s3q0> gzsVar = UsersDiscoverFragment.this.j0;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
            }
        }, new z76(this, 8));
        this.l0 = new Handler(Looper.getMainLooper());
        this.m0 = new wc2(this, 19);
        this.n0 = new nx3(this, 18);
        this.o0 = new oo6(this, 11);
        this.p0 = new m52(this, 7);
        this.q0 = new nf0(this, 15);
        this.r0 = msy.a(LazyThreadSafetyMode.NONE, new hri0(this, 10));
        this.s0 = new b();
    }

    public static final void jo(UsersDiscoverFragment usersDiscoverFragment) {
        VkButton vkButton = usersDiscoverFragment.W;
        if (vkButton != null) {
            ko(4, vkButton);
        }
        VkSimpleButton vkSimpleButton = usersDiscoverFragment.X;
        if (vkSimpleButton != null) {
            ko(4, vkSimpleButton);
        }
        TextView textView = usersDiscoverFragment.Y;
        if (textView != null) {
            ko(4, textView);
        }
        TextView textView2 = usersDiscoverFragment.Z;
        if (textView2 != null) {
            ko(4, textView2);
        }
    }

    public static void ko(int i, View view) {
        j6r0.d(view, i, true, 200, null);
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
        UsersDiscoverAdapter.AdapterState adapterState = UsersDiscoverAdapter.AdapterState.Error;
        UsersDiscoverAdapter usersDiscoverAdapter = this.k0;
        usersDiscoverAdapter.i = adapterState;
        usersDiscoverAdapter.notifyItemRangeChanged(usersDiscoverAdapter.getItemCount() - 2, 2);
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        UsersDiscoverListView usersDiscoverListView = this.U;
        if (usersDiscoverListView != null) {
            usersDiscoverListView.M9(df90Var);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        ImageView imageView = this.a0;
        if (imageView != null) {
            imageView.setImageDrawable(dhr0.t.a(R.drawable.ic_cancel_oval_24));
        }
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        UsersDiscoverListView usersDiscoverListView = this.U;
        if (usersDiscoverListView != null) {
            usersDiscoverListView.Om(df90Var);
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // xsna.nds
    public final boolean W9() {
        return !dhr0.M();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Activity h;
        if (super.a0()) {
            return true;
        }
        if (!this.g0.g(kn())) {
            h3p0.b(this);
            return true;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (h = e3m.h(activity)) != null) {
            new HomeFragment2.a().k(h);
        }
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bkm
    public final void bb(int i) {
        UsersDiscoverLayoutManager usersDiscoverLayoutManager;
        UsersDiscoverListView usersDiscoverListView;
        boolean z = this.e0;
        boolean z2 = i > this.f0;
        if (z2 == z) {
            return;
        }
        if (z2) {
            this.e0 = true;
            return;
        }
        this.e0 = false;
        UsersDiscoverPresenter usersDiscoverPresenter = this.T;
        if (usersDiscoverPresenter != null) {
            HashMap<UserId, Integer> hashMap = usersDiscoverPresenter.o;
            ListDataSet<Object> listDataSet = usersDiscoverPresenter.c;
            UsersDiscoverFragment usersDiscoverFragment = usersDiscoverPresenter.b;
            UsersDiscoverListView usersDiscoverListView2 = usersDiscoverFragment.U;
            int topPosition = usersDiscoverListView2 != null ? usersDiscoverListView2.getTopPosition() : -1;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<UserId, Integer>> it = hashMap.entrySet().iterator();
            boolean z3 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<UserId, Integer> next = it.next();
                UserId key = next.getKey();
                int intValue = next.getValue().intValue();
                if (intValue == 1 || intValue == 3) {
                    Iterator<Object> it2 = listDataSet.d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if ((next2 instanceof UserDiscoverItem) && epx.f(((UserDiscoverItem) next2).c, key)) {
                            usersDiscoverLayoutManager = next2;
                            break;
                        }
                    }
                    if (usersDiscoverLayoutManager != null) {
                        int indexOf = listDataSet.d.indexOf(usersDiscoverLayoutManager);
                        if (indexOf >= 0 && indexOf == topPosition) {
                            z3 = true;
                        } else if (indexOf >= 0 && indexOf > topPosition) {
                            arrayList.add(Integer.valueOf(indexOf));
                        }
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Integer valueOf = Integer.valueOf(((Number) it3.next()).intValue());
                ListDataSet.ArrayListImpl<Object> arrayListImpl = listDataSet.d;
                int size = arrayListImpl.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayListImpl.get(i2);
                        if (obj != null && obj.equals(valueOf)) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 >= 0) {
                    listDataSet.k(i2);
                    arrayListImpl.remove(i2);
                    listDataSet.p(i2);
                }
                s170 s170Var = usersDiscoverPresenter.f;
                int a2 = s170Var.a() - 1;
                if (a2 < 0) {
                    a2 = 0;
                }
                s170Var.e(a2);
            }
            if (z3 && (usersDiscoverListView = usersDiscoverFragment.U) != null) {
                RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                if (usersDiscoverLayoutManager != null) {
                    UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
                    int i3 = userDiscoverState.f + 1;
                    if (userDiscoverState.a(i3, usersDiscoverLayoutManager.getItemCount())) {
                        userDiscoverState.g = i3;
                        UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.AutomaticRemove, usersDiscoverLayoutManager);
                        userDiscoverSmoothScroller.setTargetPosition(userDiscoverState.f);
                        usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    }
                }
            }
            hashMap.clear();
        }
    }

    @Override // com.vk.lists.c.n
    public final void e0() {
        UsersDiscoverAdapter.AdapterState adapterState = UsersDiscoverAdapter.AdapterState.Loading;
        UsersDiscoverAdapter usersDiscoverAdapter = this.k0;
        usersDiscoverAdapter.i = adapterState;
        usersDiscoverAdapter.notifyItemRangeChanged(usersDiscoverAdapter.getItemCount() - 2, 2);
    }

    @Override // com.vk.lists.c.n
    public final void f0() {
        UsersDiscoverAdapter.AdapterState adapterState = UsersDiscoverAdapter.AdapterState.Idle;
        UsersDiscoverAdapter usersDiscoverAdapter = this.k0;
        usersDiscoverAdapter.i = adapterState;
        usersDiscoverAdapter.notifyItemRangeChanged(usersDiscoverAdapter.getItemCount() - 2, 2);
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        UsersDiscoverAdapter.AdapterState adapterState = UsersDiscoverAdapter.AdapterState.Error;
        UsersDiscoverAdapter usersDiscoverAdapter = this.k0;
        usersDiscoverAdapter.i = adapterState;
        usersDiscoverAdapter.notifyItemRangeChanged(usersDiscoverAdapter.getItemCount() - 2, 2);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final Object io() {
        return this.T;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
        UsersDiscoverAdapter.AdapterState adapterState = UsersDiscoverAdapter.AdapterState.Loading;
        UsersDiscoverAdapter usersDiscoverAdapter = this.k0;
        usersDiscoverAdapter.i = adapterState;
        usersDiscoverAdapter.notifyItemRangeChanged(usersDiscoverAdapter.getItemCount() - 2, 2);
    }

    public final void lo() {
        UsersDiscoverListView usersDiscoverListView = this.U;
        if (usersDiscoverListView != null) {
            usersDiscoverListView.d = true;
        }
        if (usersDiscoverListView != null) {
            RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
            UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
            if (usersDiscoverLayoutManager != null) {
                usersDiscoverLayoutManager.f.a = UserDiscoverState.Status.Idle;
            }
        }
        VkButton vkButton = this.W;
        if (vkButton != null) {
            vkButton.setEnabled(true);
        }
        VkSimpleButton vkSimpleButton = this.X;
        if (vkSimpleButton != null) {
            vkSimpleButton.setEnabled(true);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ww50<?> Y;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        Object h = activity != null ? e3m.h(activity) : null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        if (ey50Var == null || (Y = ey50Var.Y()) == null) {
            return;
        }
        this.d0 = Y;
        this.f0 = Y.y();
        Y.c0(this);
        Y.j(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        final View inflate = layoutInflater.inflate(R.layout.fragment_users_discover, viewGroup, false);
        UsersDiscoverListView usersDiscoverListView = (UsersDiscoverListView) inflate.findViewById(R.id.users_discover_list);
        usersDiscoverListView.setCardListener(this.s0);
        usersDiscoverListView.setAdapter(this.k0);
        usersDiscoverListView.setHasFixedSize(true);
        usersDiscoverListView.setNestedScrollingEnabled(false);
        usersDiscoverListView.setCanScrollVertical(true);
        this.U = usersDiscoverListView;
        this.Y = (TextView) inflate.findViewById(R.id.users_discover_recommendations);
        this.Z = (TextView) inflate.findViewById(R.id.users_discover_complete);
        this.V = (TextView) inflate.findViewById(R.id.users_discover_title);
        this.W = (VkButton) inflate.findViewById(R.id.users_discover_positive);
        this.X = (VkSimpleButton) inflate.findViewById(R.id.users_discover_negative);
        this.a0 = (ImageView) inflate.findViewById(R.id.users_discover_close);
        this.b0 = inflate.findViewById(R.id.users_discover_progress);
        VkButton vkButton = this.W;
        if (vkButton != null) {
            bwt0.i0(vkButton, new ptl0(this, 9));
        }
        VkSimpleButton vkSimpleButton = this.X;
        if (vkSimpleButton != null) {
            bwt0.i0(vkSimpleButton, new r0r0(this, i));
        }
        TextView textView = this.Y;
        if (textView != null) {
            bwt0.i0(textView, new fuc0(this, 20));
        }
        TextView textView2 = this.Z;
        if (textView2 != null) {
            bwt0.i0(textView2, new j6l0(this, 14));
        }
        ImageView imageView = this.a0;
        if (imageView != null) {
            bwt0.i0(imageView, new bnc0(this, 18));
        }
        VkButton vkButton2 = this.W;
        if (vkButton2 != null) {
            vkButton2.setVisibility(4);
        }
        VkSimpleButton vkSimpleButton2 = this.X;
        if (vkSimpleButton2 != null) {
            vkSimpleButton2.setVisibility(4);
        }
        TextView textView3 = this.Y;
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        TextView textView4 = this.Z;
        if (textView4 != null) {
            textView4.setVisibility(4);
        }
        u080 u080Var = new u080() { // from class: xsna.s0r0
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                int i2 = UsersDiscoverFragment.t0;
                f4m.y(wqx0.a(bqx0Var), inflate);
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(inflate, u080Var);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ww50<?> ww50Var = this.d0;
        if (ww50Var != null) {
            ww50Var.c0(this);
        }
        this.d0 = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        wc2 wc2Var = this.m0;
        Handler handler = this.l0;
        handler.removeCallbacks(wc2Var);
        handler.removeCallbacks(this.n0);
        handler.removeCallbacks(this.o0);
        handler.removeCallbacks(this.p0);
        handler.removeCallbacks(this.q0);
        lo();
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        UsersDiscoverPresenter usersDiscoverPresenter = this.T;
        if (usersDiscoverPresenter != null) {
            Bundle arguments = getArguments();
            UsersDiscoverFragment usersDiscoverFragment = usersDiscoverPresenter.b;
            if (arguments != null) {
                if (arguments.containsKey("pinned_request_id")) {
                    userId = (UserId) arguments.getParcelable("pinned_request_id");
                    if (userId == null) {
                        userId = UserId.d;
                    }
                } else {
                    userId = null;
                }
                usersDiscoverPresenter.l = userId;
                boolean z = arguments.getBoolean("only_recommendations", false);
                usersDiscoverPresenter.m = z;
                if (z) {
                    TextView textView = usersDiscoverFragment.V;
                    if (textView != null) {
                        textView.setText(R.string.users_discover_recommendations_title);
                    }
                } else {
                    TextView textView2 = usersDiscoverFragment.V;
                    if (textView2 != null) {
                        textView2.setText(R.string.users_discover_requests_title);
                    }
                }
            }
        }
        super.onViewCreated(view, bundle);
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
        UsersDiscoverAdapter.AdapterState adapterState = UsersDiscoverAdapter.AdapterState.Idle;
        UsersDiscoverAdapter usersDiscoverAdapter = this.k0;
        usersDiscoverAdapter.i = adapterState;
        usersDiscoverAdapter.notifyItemRangeChanged(usersDiscoverAdapter.getItemCount() - 2, 2);
    }

    @Override // com.vk.lists.c.n
    public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
        this.j0 = gzsVar;
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
    }

    @Override // com.vk.lists.c.n
    public final void setDataObserver(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
    }
}
