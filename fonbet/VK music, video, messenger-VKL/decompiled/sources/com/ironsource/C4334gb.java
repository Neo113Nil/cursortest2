package com.ironsource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.j5g;
import xsna.n6j;
import xsna.pzl;

/* renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4334gb {
    private final String a;
    private final int b;

    public C4334gb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return String.format("%s %s", Arrays.copyOf(new Object[]{a(stackTrace, 4), b(stackTrace, 4)}, 2));
    }

    public final int a() {
        return this.b;
    }

    public final String c() {
        String str = this.a;
        return (str == null || str.length() == 0) ? b() : pzl.b(b(), " - ", this.a);
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i) {
        Collection collection;
        Collection collection2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        List a = n6j.a(0, "\\.", stackTraceElementArr[i].getClassName());
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = j5g.H0(a, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.b;
        String str = ((String[]) collection.toArray(new String[0]))[r3.length - 1];
        if (!drm0.D(str, "$", false)) {
            return str;
        }
        List a2 = n6j.a(0, "\\$", str);
        if (!a2.isEmpty()) {
            ListIterator listIterator2 = a2.listIterator(a2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    collection2 = j5g.H0(a2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        collection2 = EmptyList.b;
        return ((String[]) collection2.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i) {
        Collection collection;
        int i2;
        Collection collection2;
        Collection collection3;
        if (stackTraceElementArr.length > i) {
            List a = n6j.a(0, "\\.", stackTraceElementArr[i].getClassName());
            if (!a.isEmpty()) {
                ListIterator listIterator = a.listIterator(a.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            if (drm0.D(str, "$", false)) {
                List a2 = n6j.a(0, "\\$", str);
                if (!a2.isEmpty()) {
                    ListIterator listIterator2 = a2.listIterator(a2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            collection3 = j5g.H0(a2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection3 = EmptyList.b;
                return pzl.b(((String[]) collection3.toArray(new String[0]))[1], ".", stackTraceElementArr[i].getMethodName());
            }
            if (drm0.D(stackTraceElementArr[i].getMethodName(), "$", false) && stackTraceElementArr.length > (i2 = i + 1)) {
                List a3 = n6j.a(0, "\\$", stackTraceElementArr[i2].getClassName());
                if (!a3.isEmpty()) {
                    ListIterator listIterator3 = a3.listIterator(a3.size());
                    while (listIterator3.hasPrevious()) {
                        if (((String) listIterator3.previous()).length() != 0) {
                            collection2 = j5g.H0(a3, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection2 = EmptyList.b;
                String[] strArr2 = (String[]) collection2.toArray(new String[0]);
                if (strArr2.length > 1) {
                    return pzl.b(strArr2[1], ".", stackTraceElementArr[i2].getMethodName());
                }
                return stackTraceElementArr[i2].getMethodName();
            }
            return stackTraceElementArr[i].getMethodName();
        }
        return "";
    }
}
