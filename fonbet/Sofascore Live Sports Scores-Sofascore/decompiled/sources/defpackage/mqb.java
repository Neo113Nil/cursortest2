package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mqb implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final TextView c;

    public mqb(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = 2;
        this.b = constraintLayout;
        this.c = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public /* synthetic */ mqb(ConstraintLayout constraintLayout, TextView textView, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = textView;
    }
}
