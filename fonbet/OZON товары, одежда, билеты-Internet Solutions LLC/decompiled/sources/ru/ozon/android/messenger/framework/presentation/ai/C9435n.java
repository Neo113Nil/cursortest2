package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9435n extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9435n(C9413c c9413c) {
        super(0);
        this.f89642b = c9413c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C9413c c9413c = this.f89642b;
        return Integer.valueOf(C9413c.y(c9413c).mainContent.getHeight() - Math.min(C9413c.y(c9413c).bottomContainerLl.getTop(), (int) (C9413c.y(c9413c).scrollButtonContainer.getTranslationY() + C9413c.y(c9413c).scrollButtonContainer.getTop())));
    }
}
