package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.hkj;
import defpackage.yy0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/view/ToolbarBackgroundAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Lyy0;", "backgroundType", "", "setBackground", "(Lyy0;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ToolbarBackgroundAppBarLayout extends AppBarLayout {
    public final hkj C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarBackgroundAppBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        hkj hkjVar = new hkj(context);
        this.C = hkjVar;
        setBackground(hkjVar);
    }

    public final void setBackground(@Nullable yy0 backgroundType) {
        int i = hkj.n;
        this.C.c(backgroundType, null);
    }
}
