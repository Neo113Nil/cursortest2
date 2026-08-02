package com.plaid.internal;

import androidx.fragment.app.AbstractActivityC2168s;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.R;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.n7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3702n7 {
    public static final void a(@NotNull LinkActivity linkActivity) {
        Intrinsics.checkNotNullParameter(linkActivity, "<this>");
        linkActivity.getWindow().addFlags(Integer.MIN_VALUE);
        linkActivity.getWindow().setStatusBarColor(AbstractC5338c.getColor(linkActivity, R.color.plaid_full_black_opacity_25));
    }

    public static final void a(@NotNull AbstractActivityC2168s abstractActivityC2168s) {
        Intrinsics.checkNotNullParameter(abstractActivityC2168s, "<this>");
        abstractActivityC2168s.getWindow().addFlags(Integer.MIN_VALUE);
        abstractActivityC2168s.getWindow().setStatusBarColor(-1);
        abstractActivityC2168s.getWindow().getDecorView().setSystemUiVisibility(8192);
    }
}
