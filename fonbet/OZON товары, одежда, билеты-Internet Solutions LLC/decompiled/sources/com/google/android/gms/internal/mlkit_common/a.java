package com.google.android.gms.internal.mlkit_common;

import O7.e;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import java.util.HashMap;
import l3.C7855a;
import r8.c;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.ReviewFormBottomSheetFragment;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements e, D {
    public static ConstraintLayout.b a(BadgeView badgeView, int i11, int i12, int i13) {
        badgeView.setId(i11);
        return new ConstraintLayout.b(i12, i13);
    }

    public static void b(int i11, c.a aVar) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i11);
        aVar.b(zzayVar.zzb());
        aVar.a();
    }

    public static void c(HashMap hashMap, String str, Integer num, int i11, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i11));
    }

    @Override // O7.e
    public Object apply(Object obj) {
        return C7855a.b((Bundle) obj);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 configureDialogWindow$lambda$9;
        configureDialogWindow$lambda$9 = ReviewFormBottomSheetFragment.configureDialogWindow$lambda$9(view, c5353y0);
        return configureDialogWindow$lambda$9;
    }
}
