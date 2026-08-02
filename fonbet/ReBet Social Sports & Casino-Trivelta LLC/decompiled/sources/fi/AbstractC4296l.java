package fi;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4296l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f46775a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public int f46776b;

    public final void a(char[] array) {
        int i10;
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int length = this.f46776b + array.length;
                i10 = AbstractC4294j.f46773a;
                if (length < i10) {
                    this.f46776b += array.length;
                    this.f46775a.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f46775a.removeLastOrNull();
            if (cArr != null) {
                this.f46776b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
