package com.sofascore.results.event.details.view.tennis;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import defpackage.djf;
import defpackage.nq8;
import defpackage.o8;
import defpackage.yhk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/event/details/view/tennis/SwitchView;", "Lo8;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "", "getLayoutId", "()I", "", "setChecked", "", "setSwitchChecked", "(Z)V", "Lkotlin/Function1;", "d", "Lkotlin/jvm/functions/Function1;", "getOnSwitchListener", "()Lkotlin/jvm/functions/Function1;", "setOnSwitchListener", "(Lkotlin/jvm/functions/Function1;)V", "onSwitchListener", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SwitchView extends o8 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: d, reason: from kotlin metadata */
    public Function1 onSwitchListener;
    public final djf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.pointer_up;
        ImageView imageView = (ImageView) nq8.B(R.id.pointer_up, root);
        if (imageView != null) {
            i = R.id.switcher;
            SwitchCompat switchCompat = (SwitchCompat) nq8.B(R.id.switcher, root);
            if (switchCompat != null) {
                i = R.id.switcher_subtitle;
                TextView textView = (TextView) nq8.B(R.id.switcher_subtitle, root);
                if (textView != null) {
                    i = R.id.switcher_title;
                    TextView textView2 = (TextView) nq8.B(R.id.switcher_title, root);
                    if (textView2 != null) {
                        i = R.id.tennis_switcher_root;
                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.tennis_switcher_root, root);
                        if (constraintLayout != null) {
                            this.e = new djf((LinearLayout) root, imageView, switchCompat, textView, textView2, constraintLayout);
                            setVisibility(8);
                            switchCompat.setOnCheckedChangeListener(this);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.switcher_view;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnSwitchListener() {
        return this.onSwitchListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Function1 function1 = this.onSwitchListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void setOnSwitchListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onSwitchListener = function1;
    }

    public final void setSwitchChecked(boolean setChecked) {
        SwitchCompat switchCompat = (SwitchCompat) this.e.f;
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(setChecked);
        switchCompat.setOnCheckedChangeListener(this);
    }
}
