package ru.ozon.android.messenger.blocks.chatlistheader.search;

import Q1.K;
import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class p extends AbstractC7737t implements Function0<InterfaceC3978p0<K>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f84826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(String str) {
        super(0);
        this.f84826b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC3978p0<K> invoke() {
        C3991w0 f7;
        String str = this.f84826b;
        if (str == null) {
            str = "";
        }
        f7 = n1.f(new K(6, 0L, str), D1.f25195a);
        return f7;
    }
}
