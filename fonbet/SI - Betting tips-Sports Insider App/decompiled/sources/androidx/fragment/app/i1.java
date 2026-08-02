package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f1956c;

    public /* synthetic */ i1(j1 j1Var, String str, int i5) {
        this.f1954a = i5;
        this.f1956c = j1Var;
        this.f1955b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r8 != 8) goto L34;
     */
    @Override // androidx.fragment.app.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        int i5;
        Iterator it;
        switch (this.f1954a) {
            case 0:
                j1 j1Var = this.f1956c;
                BackStackState backStackState = (BackStackState) j1Var.f1973l.remove(this.f1955b);
                boolean z5 = false;
                if (backStackState != null) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a aVar = (a) it2.next();
                        if (aVar.f1863u) {
                            Iterator it3 = aVar.f2069a.iterator();
                            while (it3.hasNext()) {
                                Fragment fragment = ((r1) it3.next()).f2061b;
                                if (fragment != null) {
                                    hashMap.put(fragment.mWho, fragment);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = backStackState.f1828a;
                    HashMap hashMap2 = new HashMap(arrayList3.size());
                    for (String str : arrayList3) {
                        Fragment fragment2 = (Fragment) hashMap.get(str);
                        if (fragment2 != null) {
                            hashMap2.put(fragment2.mWho, fragment2);
                        } else {
                            Bundle i10 = j1Var.f1965c.i(null, str);
                            if (i10 != null) {
                                ClassLoader classLoader = j1Var.f1983w.f2087b.getClassLoader();
                                Fragment a7 = ((FragmentState) i10.getParcelable("state")).a(j1Var.I());
                                a7.mSavedFragmentState = i10;
                                if (i10.getBundle("savedInstanceState") == null) {
                                    a7.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = i10.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                a7.setArguments(bundle);
                                hashMap2.put(a7.mWho, a7);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (BackStackRecordState backStackRecordState : backStackState.f1829b) {
                        ArrayList arrayList5 = backStackRecordState.f1816b;
                        a aVar2 = new a(j1Var);
                        backStackRecordState.a(aVar2);
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            String str2 = (String) arrayList5.get(i11);
                            if (str2 != null) {
                                Fragment fragment3 = (Fragment) hashMap2.get(str2);
                                if (fragment3 == null) {
                                    throw new IllegalStateException(d9.e.n(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f1820f, " failed due to missing saved state for Fragment (", str2, ")"));
                                }
                                ((r1) aVar2.f2069a.get(i11)).f2061b = fragment3;
                            }
                        }
                        arrayList4.add(aVar2);
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((a) it4.next()).a(arrayList, arrayList2);
                        z5 = true;
                    }
                }
                return z5;
            default:
                j1 j1Var2 = this.f1956c;
                String str3 = this.f1955b;
                int C = j1Var2.C(str3, -1, true);
                if (C < 0) {
                    return false;
                }
                int i12 = C;
                while (true) {
                    Throwable th2 = null;
                    if (i12 >= j1Var2.f1966d.size()) {
                        HashSet hashSet = new HashSet();
                        int i13 = C;
                        while (i13 < j1Var2.f1966d.size()) {
                            a aVar3 = (a) j1Var2.f1966d.get(i13);
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Iterator it5 = aVar3.f2069a.iterator();
                            while (it5.hasNext()) {
                                r1 r1Var = (r1) it5.next();
                                Throwable th3 = th2;
                                Fragment fragment4 = r1Var.f2061b;
                                if (fragment4 == null) {
                                    th2 = th3;
                                } else {
                                    if (r1Var.f2062c) {
                                        i5 = i13;
                                        int i14 = r1Var.f2060a;
                                        it = it5;
                                        if (i14 != 1) {
                                            if (i14 != 2) {
                                                break;
                                            }
                                        }
                                    } else {
                                        i5 = i13;
                                        it = it5;
                                    }
                                    hashSet.add(fragment4);
                                    hashSet2.add(fragment4);
                                    int i15 = r1Var.f2060a;
                                    if (i15 == 1 || i15 == 2) {
                                        hashSet3.add(fragment4);
                                    }
                                    th2 = th3;
                                    i13 = i5;
                                    it5 = it;
                                }
                            }
                            int i16 = i13;
                            Throwable th4 = th2;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder p10 = d9.e.p("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                p10.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                                p10.append(" in ");
                                p10.append(aVar3);
                                p10.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                j1Var2.f0(new IllegalArgumentException(p10.toString()));
                                throw th4;
                            }
                            i13 = i16 + 1;
                            th2 = th4;
                        }
                        Throwable th5 = th2;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            Fragment fragment5 = (Fragment) arrayDeque.removeFirst();
                            if (fragment5.mRetainInstance) {
                                StringBuilder p11 = d9.e.p("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                                p11.append(hashSet.contains(fragment5) ? "direct reference to retained " : "retained child ");
                                p11.append("fragment ");
                                p11.append(fragment5);
                                j1Var2.f0(new IllegalArgumentException(p11.toString()));
                                throw th5;
                            }
                            Iterator it6 = fragment5.mChildFragmentManager.f1965c.e().iterator();
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
                        ArrayList arrayList7 = new ArrayList(j1Var2.f1966d.size() - C);
                        for (int i17 = C; i17 < j1Var2.f1966d.size(); i17++) {
                            arrayList7.add(th5);
                        }
                        BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
                        for (int size = j1Var2.f1966d.size() - 1; size >= C; size--) {
                            a aVar4 = (a) j1Var2.f1966d.remove(size);
                            a aVar5 = new a(aVar4);
                            aVar5.e();
                            arrayList7.set(size - C, new BackStackRecordState(aVar5));
                            aVar4.f1863u = true;
                            arrayList.add(aVar4);
                            arrayList2.add(Boolean.TRUE);
                        }
                        j1Var2.f1973l.put(str3, backStackState2);
                        return true;
                    }
                    a aVar6 = (a) j1Var2.f1966d.get(i12);
                    if (!aVar6.f2083p) {
                        j1Var2.f0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar6 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                    i12++;
                }
        }
    }
}
