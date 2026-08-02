package androidx.fragment.app;

import android.os.Bundle;
import defpackage.a70;
import defpackage.dp8;
import defpackage.fc6;
import defpackage.fq8;
import defpackage.wt3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r implements dp8 {
    public final /* synthetic */ int a;
    public final String b;
    public final /* synthetic */ s c;

    public /* synthetic */ r(s sVar, String str, int i) {
        this.a = i;
        this.c = sVar;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r5 != 8) goto L34;
     */
    @Override // defpackage.dp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2 = this.a;
        Throwable th = null;
        String str = this.b;
        s sVar = this.c;
        boolean z = false;
        switch (i2) {
            case 0:
                BackStackState backStackState = (BackStackState) sVar.l.remove(str);
                if (backStackState != null) {
                    HashMap hashMap = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar.w) {
                            Iterator it2 = aVar.c.iterator();
                            while (it2.hasNext()) {
                                Fragment fragment = ((fq8) it2.next()).b;
                                if (fragment != null) {
                                    hashMap.put(fragment.mWho, fragment);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = backStackState.a;
                    HashMap hashMap2 = new HashMap(arrayList3.size());
                    for (String str2 : arrayList3) {
                        Fragment fragment2 = (Fragment) hashMap.get(str2);
                        if (fragment2 != null) {
                            hashMap2.put(fragment2.mWho, fragment2);
                        } else {
                            Bundle i3 = sVar.c.i(null, str2);
                            if (i3 != null) {
                                ClassLoader classLoader = sVar.x.b.getClassLoader();
                                Fragment a = ((FragmentState) i3.getParcelable("state")).a(sVar.M());
                                a.mSavedFragmentState = i3;
                                if (i3.getBundle("savedInstanceState") == null) {
                                    a.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = i3.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                a.setArguments(bundle);
                                hashMap2.put(a.mWho, a);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = backStackState.b.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            BackStackRecordState backStackRecordState = (BackStackRecordState) it3.next();
                            ArrayList arrayList5 = backStackRecordState.b;
                            a aVar2 = new a(sVar);
                            backStackRecordState.a(aVar2);
                            for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                                String str3 = (String) arrayList5.get(i4);
                                if (str3 != null) {
                                    Fragment fragment3 = (Fragment) hashMap2.get(str3);
                                    if (fragment3 != null) {
                                        ((fq8) aVar2.c.get(i4)).b = fragment3;
                                    } else {
                                        a70.r(fc6.o(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f, " failed due to missing saved state for Fragment (", str3, ")"));
                                    }
                                }
                            }
                            arrayList4.add(aVar2);
                        } else {
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                ((a) it4.next()).a(arrayList, arrayList2);
                                z = true;
                            }
                        }
                    }
                }
                return z;
            default:
                int C = sVar.C(-1, str, true);
                if (C < 0) {
                    return false;
                }
                for (int i5 = C; i5 < sVar.d.size(); i5++) {
                    a aVar3 = (a) sVar.d.get(i5);
                    if (!aVar3.r) {
                        sVar.m0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i6 = C;
                while (i6 < sVar.d.size()) {
                    a aVar4 = (a) sVar.d.get(i6);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator it5 = aVar4.c.iterator();
                    while (it5.hasNext()) {
                        fq8 fq8Var = (fq8) it5.next();
                        Fragment fragment4 = fq8Var.b;
                        if (fragment4 != null) {
                            Throwable th2 = th;
                            if (fq8Var.c) {
                                int i7 = fq8Var.a;
                                i = i6;
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        break;
                                    }
                                }
                            } else {
                                i = i6;
                            }
                            hashSet.add(fragment4);
                            hashSet2.add(fragment4);
                            int i8 = fq8Var.a;
                            if (i8 == 1 || i8 == 2) {
                                hashSet3.add(fragment4);
                            }
                            i6 = i;
                            th = th2;
                        }
                    }
                    Throwable th3 = th;
                    int i9 = i6;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder q = wt3.q("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        q.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        q.append(" in ");
                        q.append(aVar4);
                        q.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        sVar.m0(new IllegalArgumentException(q.toString()));
                        throw th3;
                    }
                    i6 = i9 + 1;
                    th = th3;
                }
                Throwable th4 = th;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    Fragment fragment5 = (Fragment) arrayDeque.removeFirst();
                    if (fragment5.mRetainInstance) {
                        StringBuilder q2 = wt3.q("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        q2.append(hashSet.contains(fragment5) ? "direct reference to retained " : "retained child ");
                        q2.append("fragment ");
                        q2.append(fragment5);
                        sVar.m0(new IllegalArgumentException(q2.toString()));
                        throw th4;
                    }
                    Iterator it6 = fragment5.mChildFragmentManager.c.e().iterator();
                    while (it6.hasNext()) {
                        Fragment fragment6 = (Fragment) it6.next();
                        if (fragment6 != null) {
                            arrayDeque.addLast(fragment6);
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it7 = hashSet.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(((Fragment) it7.next()).mWho);
                }
                ArrayList arrayList7 = new ArrayList(sVar.d.size() - C);
                int i10 = C;
                while (i10 < sVar.d.size()) {
                    arrayList7.add(th4);
                    i10++;
                    th4 = null;
                }
                BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
                for (int size = sVar.d.size() - 1; size >= C; size--) {
                    a aVar5 = (a) sVar.d.remove(size);
                    a aVar6 = new a(aVar5);
                    aVar6.e();
                    arrayList7.set(size - C, new BackStackRecordState(aVar6));
                    aVar5.w = true;
                    arrayList.add(aVar5);
                    arrayList2.add(Boolean.TRUE);
                }
                sVar.l.put(str, backStackState2);
                return true;
        }
    }
}
