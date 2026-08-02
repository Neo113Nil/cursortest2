package ru.ozon.android.messenger.blocks.input.views;

import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<b.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PastePlainTextEditText f85680b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(PastePlainTextEditText pastePlainTextEditText) {
        super(0);
        this.f85680b = pastePlainTextEditText;
    }

    @Override // kotlin.jvm.functions.Function0
    public final b.a invoke() {
        PastePlainTextEditText pastePlainTextEditText = this.f85680b;
        J a11 = C0.a(pastePlainTextEditText);
        return new b.a(pastePlainTextEditText, a11 != null ? K.a(a11) : null);
    }
}
