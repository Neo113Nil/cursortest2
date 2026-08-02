package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"I", "T", "item", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "invoke", "(Ljava/lang/Object;Ljava/util/List;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TextAdapterDelegateKt$textAdapterDelegate$$inlined$adapterDelegateLayoutContainer$default$1 extends AbstractC7737t implements InterfaceC6511n<TextWidgetVO.TextWidgetItemVO, List<? extends TextWidgetVO.TextWidgetItemVO>, Integer, Boolean> {
    public static final TextAdapterDelegateKt$textAdapterDelegate$$inlined$adapterDelegateLayoutContainer$default$1 INSTANCE = new TextAdapterDelegateKt$textAdapterDelegate$$inlined$adapterDelegateLayoutContainer$default$1();

    public TextAdapterDelegateKt$textAdapterDelegate$$inlined$adapterDelegateLayoutContainer$default$1() {
        super(3);
    }

    @NotNull
    public final Boolean invoke(TextWidgetVO.TextWidgetItemVO textWidgetItemVO, @NotNull List<? extends TextWidgetVO.TextWidgetItemVO> list, int i11) {
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 1>");
        return Boolean.valueOf(textWidgetItemVO instanceof TextWidgetVO.TextWidgetItemVO.TextVO);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Boolean invoke(TextWidgetVO.TextWidgetItemVO textWidgetItemVO, List<? extends TextWidgetVO.TextWidgetItemVO> list, Integer num) {
        return invoke(textWidgetItemVO, list, num.intValue());
    }
}
