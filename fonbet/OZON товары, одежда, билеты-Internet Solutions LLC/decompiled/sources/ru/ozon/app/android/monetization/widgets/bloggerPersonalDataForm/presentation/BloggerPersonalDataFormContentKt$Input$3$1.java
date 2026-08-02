package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation.BloggerPersonalDataFormVI;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BloggerPersonalDataFormContentKt$Input$3$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ Function2<String, String, Unit> $onInputChanged;
    final /* synthetic */ BloggerPersonalDataFormVI.View.Input $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BloggerPersonalDataFormContentKt$Input$3$1(Function2<? super String, ? super String, Unit> function2, BloggerPersonalDataFormVI.View.Input input) {
        super(1);
        this.$onInputChanged = function2;
        this.$view = input;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.$onInputChanged.invoke(this.$view.getName(), newValue);
    }
}
