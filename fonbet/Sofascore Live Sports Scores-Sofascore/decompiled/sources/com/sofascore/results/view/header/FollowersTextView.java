package com.sofascore.results.view.header;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.uxf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/view/header/FollowersTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "userCount", "", "setCount", "(J)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FollowersTextView extends AppCompatTextView {
    public long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        g();
    }

    public final void g() {
        setText(uxf.E(this.h, 58, false));
    }

    public final void setCount(long userCount) {
        if (userCount > this.h) {
            this.h = userCount;
            g();
        }
    }
}
