package ru.ozon.android.messenger.framework.composer.widgets.di;

import k20.C7475g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<C7475g, JsonParser> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsonParser f86832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(JsonParser jsonParser) {
        super(1);
        this.f86832b = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final JsonParser invoke(C7475g c7475g) {
        C7475g StatusWidget = c7475g;
        Intrinsics.checkNotNullParameter(StatusWidget, "$this$StatusWidget");
        return this.f86832b;
    }
}
