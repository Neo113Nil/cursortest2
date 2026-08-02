package com.sofascore.results.profile.editor;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ironsource.U3;
import com.sofascore.results.R;
import defpackage.dk2;
import defpackage.nq8;
import defpackage.o8;
import defpackage.ujf;
import defpackage.uxf;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sofascore/results/profile/editor/ProfileEditorSummaryItemView;", "Lo8;", "", U3.i.X, "", "setValue", "(I)V", "", "text", "setValueText", "(Ljava/lang/String;)V", "getLayoutId", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileEditorSummaryItemView extends o8 {
    public final dk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileEditorSummaryItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.item_label;
        TextView textView = (TextView) nq8.B(R.id.item_label, root);
        if (textView != null) {
            i = R.id.item_value;
            TextView textView2 = (TextView) nq8.B(R.id.item_value, root);
            if (textView2 != null) {
                this.d = new dk2((LinearLayout) root, textView, textView2);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ujf.h, 0, 0);
                try {
                    textView.setText(obtainStyledAttributes.getString(0));
                    return;
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.editor_summary_item;
    }

    public final void setValue(int value) {
        this.d.c.setText(uxf.E(value, 62, false));
    }

    public final void setValueText(@NotNull String text) {
        text.getClass();
        this.d.c.setText(text);
    }
}
