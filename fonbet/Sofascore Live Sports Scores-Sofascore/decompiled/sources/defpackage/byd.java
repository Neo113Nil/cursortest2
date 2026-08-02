package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class byd extends erf {
    public final Context a;
    public final int b;

    public byd(Context context) {
        context.getClass();
        this.a = context;
        this.b = ao2.s(8, context);
    }

    @Override // defpackage.erf
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        rect.getClass();
        qrfVar.getClass();
        if (Intrinsics.c(view.getTag(), "CRICKET_SUMMARY_TAG")) {
            int i = this.b;
            rect.left = i;
            rect.right = i;
        }
    }
}
