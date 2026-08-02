package io.sentry.android.core.anr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f50901a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f50902a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50903b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50904c = a();

        @NotNull
        private final StackTraceElement[] stack;

        public a(StackTraceElement[] stackTraceElementArr, int i10, int i11) {
            this.stack = stackTraceElementArr;
            this.f50902a = i10;
            this.f50903b = i11;
        }

        public final int a() {
            int i10 = 1;
            for (int i11 = this.f50902a; i11 <= this.f50903b; i11++) {
                i10 = (i10 * 31) + this.stack[i11].hashCode();
            }
            return i10;
        }

        public boolean equals(Object obj) {
            int i10;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f50904c != aVar.f50904c || (i10 = (this.f50903b - this.f50902a) + 1) != (aVar.f50903b - aVar.f50902a) + 1) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.stack[this.f50902a + i11].equals(aVar.stack[aVar.f50902a + i11])) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f50904c;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(11);
        f50901a = arrayList;
        arrayList.add("java.lang");
        arrayList.add("java.util");
        arrayList.add("android.app");
        arrayList.add("android.os.Handler");
        arrayList.add("android.os.Looper");
        arrayList.add("android.view");
        arrayList.add("android.widget");
        arrayList.add("com.android.internal");
        arrayList.add("com.google.android");
        arrayList.add("kotlin");
        arrayList.add("kotlinx.coroutines");
    }

    public static io.sentry.android.core.anr.a b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            StackTraceElement[] stackTraceElementArr = iVar.stack;
            if (stackTraceElementArr.length >= 2) {
                int i10 = 0;
                for (int length = stackTraceElementArr.length - 1; length >= 0; length--) {
                    if (!c(iVar.stack[length].getClassName())) {
                        i10++;
                    }
                    float length2 = i10 / (r3.length - length);
                    a aVar = new a(iVar.stack, length, r3.length - 1);
                    io.sentry.android.core.anr.a aVar2 = (io.sentry.android.core.anr.a) hashMap.get(aVar);
                    if (aVar2 == null) {
                        hashMap.put(aVar, new io.sentry.android.core.anr.a(iVar.stack, length, r6.length - 1, iVar.f50915a, length2));
                    } else {
                        aVar2.a(iVar.f50915a);
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return (io.sentry.android.core.anr.a) Collections.max(hashMap.values(), new Comparator() { // from class: io.sentry.android.core.anr.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                a aVar3 = (a) obj;
                a aVar4 = (a) obj2;
                compare = Float.compare(aVar3.f50898e * (aVar3.f50895b + 1.0f) * aVar3.f50894a, aVar4.f50898e * (aVar4.f50895b + 1.0f) * aVar4.f50894a);
                return compare;
            }
        });
    }

    public static boolean c(String str) {
        Iterator it = f50901a.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
