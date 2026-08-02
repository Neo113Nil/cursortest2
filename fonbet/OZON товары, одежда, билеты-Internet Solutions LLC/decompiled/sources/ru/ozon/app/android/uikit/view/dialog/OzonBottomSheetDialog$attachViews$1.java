package ru.ozon.app.android.uikit.view.dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/view/ViewGroup;", "contentView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OzonBottomSheetDialog$attachViews$1 extends AbstractC7737t implements Function2<ViewGroup, View, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ OzonBottomSheetDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonBottomSheetDialog$attachViews$1(OzonBottomSheetDialog ozonBottomSheetDialog, Context context) {
        super(2);
        this.this$0 = ozonBottomSheetDialog;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup, View view) {
        invoke2(viewGroup, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewGroup viewGroup, View contentView) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (!this.this$0.getShowHandle()) {
            if (this.this$0.getRoundedCorners()) {
                this.this$0.addCorners(viewGroup);
            }
            this.this$0.addContent(viewGroup, contentView);
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.$context);
        OzonBottomSheetDialog ozonBottomSheetDialog = this.this$0;
        linearLayout.setOrientation(1);
        if (ozonBottomSheetDialog.getRoundedCorners()) {
            ozonBottomSheetDialog.addCorners(linearLayout);
        }
        ozonBottomSheetDialog.addHandler(linearLayout);
        ozonBottomSheetDialog.addContent(linearLayout, contentView);
        viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
    }
}
