package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function1<Integer, Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f90163b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f90164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(int i11, int i12) {
        super(1);
        this.f90163b = i11;
        this.f90164c = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        return Integer.valueOf(num.intValue() - ((this.f90163b - this.f90164c) + 1));
    }
}
