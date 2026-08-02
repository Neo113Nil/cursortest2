package defpackage;

import android.graphics.drawable.ColorDrawable;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class lvg extends m8 {
    @Override // defpackage.o8
    public final int getLayoutId() {
        return R.layout.scrollable_type_header_view;
    }

    @Override // defpackage.m8
    @NotNull
    public final kvg getLayoutProvider() {
        return new kvg(getRoot());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        getRoot().setBackground(new ColorDrawable(i));
    }
}
