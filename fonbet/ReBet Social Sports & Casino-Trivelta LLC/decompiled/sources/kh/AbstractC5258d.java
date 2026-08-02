package kh;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kh.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5258d {
    public static final Void a(int i10, int i11) {
        throw new EOFException("Unable to discard " + i10 + " bytes: only " + i11 + " available for writing");
    }

    public static final Void b(int i10, int i11) {
        throw new EOFException("Unable to discard " + i10 + " bytes: only " + i11 + " available for reading");
    }

    public static final void c(AbstractC5255a abstractC5255a, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        throw new IllegalArgumentException("End gap " + i10 + " is too big: capacity is " + abstractC5255a.e());
    }

    public static final void d(AbstractC5255a abstractC5255a, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i10 + ": there are already " + (abstractC5255a.j() - abstractC5255a.h()) + " content bytes at offset " + abstractC5255a.h());
    }

    public static final void e(AbstractC5255a abstractC5255a, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        throw new IllegalArgumentException("End gap " + i10 + " is too big: there are already " + abstractC5255a.i() + " bytes reserved in the beginning");
    }

    public static final void f(AbstractC5255a abstractC5255a, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        abstractC5255a.n(abstractC5255a.h() - i10);
    }

    public static final Void g(AbstractC5255a abstractC5255a, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        throw new IllegalStateException("Unable to reserve " + i10 + " start gap: there are already " + (abstractC5255a.j() - abstractC5255a.h()) + " content bytes starting at offset " + abstractC5255a.h());
    }

    public static final Void h(AbstractC5255a abstractC5255a, int i10) {
        Intrinsics.checkNotNullParameter(abstractC5255a, "<this>");
        if (i10 > abstractC5255a.e()) {
            throw new IllegalArgumentException("Start gap " + i10 + " is bigger than the capacity " + abstractC5255a.e());
        }
        throw new IllegalStateException("Unable to reserve " + i10 + " start gap: there are already " + (abstractC5255a.e() - abstractC5255a.f()) + " bytes reserved in the end");
    }
}
