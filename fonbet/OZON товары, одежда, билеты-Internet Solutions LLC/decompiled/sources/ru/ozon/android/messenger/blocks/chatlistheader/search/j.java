package ru.ozon.android.messenger.blocks.chatlistheader.search;

import K1.Q;
import K1.S;
import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<K, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Integer f84815b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84816c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<K> f84817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    j(Integer num, Function1<? super K, Unit> function1, InterfaceC3978p0<K> interfaceC3978p0) {
        super(1);
        this.f84815b = num;
        this.f84816c = function1;
        this.f84817d = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(K k11) {
        CharSequence charSequence;
        K query = k11;
        Intrinsics.checkNotNullParameter(query, "query");
        Integer num = this.f84815b;
        if (num != null) {
            String q02 = kotlin.text.h.q0(num.intValue(), query.f());
            long e11 = query.e();
            int i11 = Q.f15010c;
            int i12 = (int) (e11 >> 32);
            int length = q02.length();
            if (i12 > length) {
                i12 = length;
            }
            int i13 = (int) (e11 & 4294967295L);
            int length2 = q02.length();
            if (i13 > length2) {
                i13 = length2;
            }
            query = K.b(query, q02, S.a(i12, i13), 4);
        }
        String f7 = query.f();
        Intrinsics.checkNotNullParameter(f7, "<this>");
        int length3 = f7.length();
        int i14 = 0;
        while (true) {
            if (i14 >= length3) {
                charSequence = "";
                break;
            }
            if (!CharsKt.c(f7.charAt(i14))) {
                charSequence = f7.subSequence(i14, f7.length());
                break;
            }
            i14++;
        }
        K b11 = K.b(query, charSequence.toString(), 0L, 6);
        this.f84817d.setValue(b11);
        this.f84816c.invoke(b11);
        return Unit.f71690a;
    }
}
