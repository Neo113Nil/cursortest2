package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextAdapterDelegateKt$textAdapterDelegate$1 extends AbstractC7737t implements Function2<ViewGroup, Integer, View> {
    public static final TextAdapterDelegateKt$textAdapterDelegate$1 INSTANCE = new TextAdapterDelegateKt$textAdapterDelegate$1();

    TextAdapterDelegateKt$textAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ View invoke(ViewGroup viewGroup, Integer num) {
        return invoke(viewGroup, num.intValue());
    }

    public final View invoke(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return textAtomV2View;
    }
}
