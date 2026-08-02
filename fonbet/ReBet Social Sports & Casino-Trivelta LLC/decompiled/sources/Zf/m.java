package Zf;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.L;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends L {

    /* renamed from: j, reason: collision with root package name */
    public com.zoho.livechat.android.modules.conversations.ui.fragments.a f14859j;

    /* renamed from: k, reason: collision with root package name */
    public nf.g f14860k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f14861l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:0: B:39:0x009c->B:53:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(FragmentManager fragmentManager, boolean z10, boolean z11, ZohoSalesIQ.l lVar, String str, FragmentManager.m baseFragmentBackStackChangeListener) {
        super(fragmentManager, 1);
        nf.g gVar;
        com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(baseFragmentBackStackChangeListener, "baseFragmentBackStackChangeListener");
        this.f14861l = new ArrayList();
        if (z10 && (lVar == null || lVar == ZohoSalesIQ.l.Conversations)) {
            com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar2 = (com.zoho.livechat.android.modules.conversations.ui.fragments.a) t(fragmentManager, com.zoho.livechat.android.modules.conversations.ui.fragments.a.class);
            if (aVar2 == null) {
                aVar2 = new com.zoho.livechat.android.modules.conversations.ui.fragments.a();
                if (str != null) {
                    if (aVar2.getArguments() == null) {
                        aVar2.setArguments(new Bundle());
                    }
                    Bundle arguments = aVar2.getArguments();
                    if (arguments != null) {
                        arguments.putString("chat_id", str);
                    }
                }
                aVar2.l0(baseFragmentBackStackChangeListener);
            }
            this.f14859j = aVar2;
        }
        if (z11 && lVar != ZohoSalesIQ.l.Conversations) {
            nf.g gVar2 = (nf.g) t(fragmentManager, nf.g.class);
            if (gVar2 == null) {
                gVar2 = new nf.g();
                if (str != null) {
                    if (gVar2.getArguments() == null) {
                        gVar2.setArguments(new Bundle());
                    }
                    Bundle arguments2 = gVar2.getArguments();
                    if (arguments2 != null) {
                        arguments2.putString("resource_id", str);
                    }
                    Bundle arguments3 = gVar2.getArguments();
                    if (arguments3 != null) {
                        arguments3.putBoolean("invoked_from_present_api", true);
                    }
                    Bundle arguments4 = gVar2.getArguments();
                    if (arguments4 != null) {
                        arguments4.putBoolean("is_first_page", true);
                    }
                }
            }
            this.f14860k = gVar2;
        }
        for (ZohoSalesIQ.l lVar2 : MobilistenUtil.h()) {
            if (lVar2 == ZohoSalesIQ.l.Conversations && (aVar = this.f14859j) != null) {
                ArrayList arrayList = this.f14861l;
                Intrinsics.checkNotNull(aVar);
                if (!arrayList.contains(aVar)) {
                    ArrayList arrayList2 = this.f14861l;
                    com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar3 = this.f14859j;
                    Intrinsics.checkNotNull(aVar3);
                    arrayList2.add(aVar3);
                    if (this.f14861l.size() != 2) {
                        return;
                    }
                }
            }
            if ((lVar2 == ZohoSalesIQ.l.KnowledgeBase || lVar2 == ZohoSalesIQ.l.FAQ) && (gVar = this.f14860k) != null) {
                ArrayList arrayList3 = this.f14861l;
                Intrinsics.checkNotNull(gVar);
                if (!arrayList3.contains(gVar)) {
                    ArrayList arrayList4 = this.f14861l;
                    nf.g gVar3 = this.f14860k;
                    Intrinsics.checkNotNull(gVar3);
                    arrayList4.add(gVar3);
                }
            }
            if (this.f14861l.size() != 2) {
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.f14861l.size();
    }

    @Override // androidx.fragment.app.L
    public Fragment s(int i10) {
        Object obj = this.f14861l.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Fragment) obj;
    }

    public final Fragment t(FragmentManager fragmentManager, Class cls) {
        Object obj;
        List C02 = fragmentManager.C0();
        Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
        ListIterator listIterator = C02.listIterator(C02.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (cls.isInstance(obj)) {
                break;
            }
        }
        return (Fragment) obj;
    }

    public final ArrayList u() {
        return this.f14861l;
    }

    public final int v(Class model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator it = this.f14861l.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (model.isInstance(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean w(Class model) {
        Object obj;
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator it = this.f14861l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (model.isInstance(obj)) {
                break;
            }
        }
        return obj != null;
    }
}
