package ru.ozon.android.messenger.framework.presentation.ai;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;

/* loaded from: classes10.dex */
final class G extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f89256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(View view) {
        super(0);
        this.f89256b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        HapticVibrator.INSTANCE.vibrate(this.f89256b, HapticToken.SOFT);
        return Unit.f71690a;
    }
}
