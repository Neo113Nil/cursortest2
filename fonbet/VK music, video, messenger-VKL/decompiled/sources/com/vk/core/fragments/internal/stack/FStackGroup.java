package com.vk.core.fragments.internal.stack;

import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.eventtracking.b;
import defpackage.q0;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.egg0;
import xsna.epx;
import xsna.j5g;
import xsna.wzs;
import xsna.zcl;

/* compiled from: FStackGroup.kt */
/* loaded from: classes.dex */
public final class FStackGroup extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FStackGroup> CREATOR = new a();
    public final LinkedList<FStack> b;
    public final LinkedList<FStack> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public boolean g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FStackGroup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FStackGroup a(Serializer serializer) {
            return new FStackGroup(new LinkedList(serializer.l(FStack.class.getClassLoader())), com.vk.core.serialize.a.a(serializer), serializer.m(), serializer.m(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FStackGroup[i];
        }
    }

    public /* synthetic */ FStackGroup(LinkedList linkedList, List list, boolean z, boolean z2, zcl zclVar) {
        this(linkedList, list, z, z2);
    }

    public final LinkedList Ab(FragmentEntry fragmentEntry) {
        LinkedList linkedList = new LinkedList();
        while (true) {
            LinkedList<FStack> linkedList2 = this.b;
            FragmentEntry Cb = linkedList2.getFirst().Cb();
            if (Cb == null || Cb.equals(fragmentEntry)) {
                break;
            }
            FragmentEntry Ab = linkedList2.getFirst().Ab();
            if (Ab != null) {
                linkedList.add(Ab);
            }
        }
        return linkedList;
    }

    public final void Bb() {
        if (!this.g && this.f) {
            L l = L.a;
            l.getClass();
            boolean m = L.m(LoggerOutputTarget.NONE);
            LinkedList<FStack> linkedList = this.c;
            if (!m) {
                L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root_history = " + linkedList});
            }
            if (Jb() == 1 && Kb().c.isEmpty()) {
                linkedList.clear();
            }
            this.g = true;
        }
    }

    public final FStack Cb(FragmentEntry fragmentEntry, wzs<? super FragmentEntry, ? super FragmentEntry, Boolean> wzsVar) {
        Object obj;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (wzsVar.invoke(((FStack) obj).b, fragmentEntry).booleanValue()) {
                break;
            }
        }
        return (FStack) obj;
    }

    public final FStack Db(FragmentEntry fragmentEntry) {
        Object obj;
        Iterator<T> it = this.b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Iterator<T> it2 = ((FStack) next).c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (epx.f(((FragmentEntry) next2).d, fragmentEntry != null ? fragmentEntry.d : null)) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        return (FStack) obj;
    }

    public final void Eb(NoSuchElementException noSuchElementException) {
        IllegalStateException illegalStateException = new IllegalStateException("Inconsistency in root history. " + this + JwtParser.SEPARATOR_CHAR, noSuchElementException);
        if (!BuildInfo.m()) {
            throw illegalStateException;
        }
        b.a.a(illegalStateException);
    }

    public final void Fb(FragmentEntry fragmentEntry) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((FStack) it.next()).c.remove(fragmentEntry);
        }
    }

    public final void Gb() {
        LinkedList<FStack> linkedList = this.b;
        for (FStack fStack : new ArrayList(linkedList)) {
            if (fStack.c.isEmpty() && linkedList.remove(fStack)) {
                linkedList.addLast(fStack);
            }
        }
    }

    public final void Hb(FragmentEntry fragmentEntry) {
        LinkedList<FStack> linkedList = this.b;
        linkedList.getFirst().c.remove(fragmentEntry);
        linkedList.getFirst().Bb(fragmentEntry);
    }

    public final void Ib() {
        LinkedList<FStack> linkedList = this.b;
        LinkedList<FStack> linkedList2 = this.c;
        try {
            linkedList2.pop();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root_history = " + linkedList2});
            }
            if (linkedList2.isEmpty()) {
                return;
            }
            FStack first = linkedList2.getFirst();
            if (linkedList.remove(first)) {
                linkedList.addFirst(first);
            }
        } catch (NoSuchElementException e) {
            Eb(e);
        }
    }

    public final int Jb() {
        if (!this.d) {
            Eb(null);
        }
        return this.c.size();
    }

    public final FStack Kb() {
        try {
            return this.c.getFirst();
        } catch (NoSuchElementException e) {
            Eb(e);
            return Ob();
        }
    }

    public final void Lb(ArrayList arrayList) {
        zb(new LinkedList<>());
        LinkedList<FStack> linkedList = this.b;
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            ((FStack) it.next()).c.clear();
        }
        linkedList.clear();
        LinkedList<FStack> linkedList2 = this.c;
        boolean z = this.d;
        if (z) {
            linkedList2.clear();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedList.add(new FStack((FragmentEntry) it2.next()));
        }
        if (z && !linkedList.isEmpty()) {
            linkedList2.push(linkedList.getFirst());
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root_history = " + linkedList2});
    }

    public final boolean Mb(FragmentEntry fragmentEntry, wzs<? super FragmentEntry, ? super FragmentEntry, Boolean> wzsVar) {
        Object obj;
        LinkedList<FStack> linkedList = this.b;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (wzsVar.invoke(((FStack) obj).b, fragmentEntry).booleanValue()) {
                break;
            }
        }
        FStack fStack = (FStack) obj;
        if (fStack == null || !linkedList.remove(fStack)) {
            return false;
        }
        linkedList.addFirst(fStack);
        boolean z = this.d;
        if (z) {
            Bb();
        }
        LinkedList<FStack> linkedList2 = this.c;
        if (z && !fStack.equals(linkedList2.peek())) {
            if (!this.e) {
                FStack pollLast = linkedList2.pollLast();
                linkedList2.remove(fStack);
                if (pollLast != null && !pollLast.equals(linkedList2.peekLast())) {
                    linkedList2.addLast(pollLast);
                }
            }
            linkedList2.push(fStack);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return true;
        }
        L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root = " + fragmentEntry + "; root_history = " + linkedList2});
        return true;
    }

    public final boolean Nb(Class<? extends FragmentImpl> cls) {
        Object obj;
        LinkedList<FStack> linkedList = this.b;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((FStack) obj).b.b, cls)) {
                break;
            }
        }
        FStack fStack = (FStack) obj;
        if (fStack == null || !linkedList.remove(fStack)) {
            return false;
        }
        linkedList.addFirst(fStack);
        boolean z = this.d;
        if (z) {
            Bb();
        }
        LinkedList<FStack> linkedList2 = this.c;
        if (z && !fStack.equals(linkedList2.peek())) {
            if (!this.e) {
                FStack pollLast = linkedList2.pollLast();
                linkedList2.remove(fStack);
                if (pollLast != null && !pollLast.equals(linkedList2.peekLast())) {
                    linkedList2.addLast(pollLast);
                }
            }
            linkedList2.push(fStack);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return true;
        }
        L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root = " + cls + "; root_history = " + linkedList2});
        return true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        egg0 egg0Var = new egg0(this.c);
        ArrayList arrayList = new ArrayList(c5g.u(egg0Var, 10));
        Iterator it = egg0Var.iterator();
        while (true) {
            ListIterator<T> listIterator = ((egg0.a) it).b;
            if (!listIterator.hasPrevious()) {
                serializer.l0(arrayList);
                serializer.L(this.d ? (byte) 1 : (byte) 0);
                serializer.L(this.e ? (byte) 1 : (byte) 0);
                return;
            }
            arrayList.add(((FStack) listIterator.previous()).b.d);
        }
    }

    public final FStack Ob() {
        return this.b.getFirst();
    }

    public final int Pb() {
        LinkedList<FStack> linkedList = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(linkedList, 10));
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FStack) it.next()).c.size()));
        }
        return j5g.F0(arrayList);
    }

    public final void Qb(ArrayList arrayList) {
        Object obj;
        LinkedList<FStack> linkedList = this.b;
        LinkedList linkedList2 = new LinkedList(linkedList);
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            FragmentEntry fragmentEntry = (FragmentEntry) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(fragmentEntry.b, ((FStack) next).b.b)) {
                    obj2 = next;
                    break;
                }
            }
            if (obj2 == null) {
                linkedList2.add(new FStack(fragmentEntry));
            }
        }
        Iterator it3 = linkedList2.iterator();
        while (it3.hasNext()) {
            FStack fStack = (FStack) it3.next();
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it4.next();
                    if (epx.f(fStack.b.b, ((FragmentEntry) obj).b)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                fStack.c.clear();
                it3.remove();
            }
        }
        linkedList.clear();
        Iterator it5 = linkedList2.iterator();
        while (it5.hasNext()) {
            linkedList.add((FStack) it5.next());
        }
        Gb();
        boolean z = this.d;
        LinkedList<FStack> linkedList3 = this.c;
        if (z) {
            Iterator<FStack> it6 = linkedList3.iterator();
            while (it6.hasNext()) {
                if (!linkedList.contains(it6.next())) {
                    it6.remove();
                }
            }
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root_history = " + linkedList3});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FStackGroup{stacks=");
        sb.append(this.b);
        sb.append(", rootSwitchingHistory=");
        sb.append(this.c);
        sb.append(", isRootHistoryEnabled=");
        sb.append(this.d);
        sb.append(", isRootHistoryAllowsDuplicates=");
        sb.append(this.e);
        sb.append(", isRootHistoryWasAutofilledOnInit=");
        sb.append(this.f);
        sb.append(", isRootHistoryFirstEntryWasCorrected=");
        return q0.a(sb, this.g, '}');
    }

    public final void zb(LinkedList<FragmentEntry> linkedList) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            linkedList.addAll(((FStack) it.next()).c);
        }
    }

    public FStackGroup(List<FragmentEntry> list, boolean z, boolean z2) {
        this(new LinkedList(), EmptyList.b, z, z2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.b.add(new FStack((FragmentEntry) it.next()));
        }
        if (this.d && this.c.isEmpty() && !this.b.isEmpty()) {
            this.c.push(this.b.getFirst());
            this.f = true;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root_history_enabled = " + this.d + "; root_history_allows_duplicates = " + this.e + "; root_history = " + this.c});
    }

    public FStackGroup(LinkedList<FStack> linkedList, List<String> list, boolean z, boolean z2) {
        Object obj;
        this.b = linkedList;
        this.d = z;
        this.e = z2;
        LinkedList<FStack> linkedList2 = new LinkedList<>();
        if (z) {
            for (String str : list) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((FStack) obj).b.d, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                FStack fStack = (FStack) obj;
                if (fStack != null) {
                    linkedList2.push(fStack);
                }
            }
        }
        this.c = linkedList2;
        if (this.d && linkedList2.isEmpty() && !linkedList.isEmpty()) {
            linkedList2.push(linkedList.getFirst());
            this.f = true;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"FStackGroup", "root_history_enabled = " + this.d + "; root_history_allows_duplicates = " + this.e + "; root_history = " + this.c});
    }
}
