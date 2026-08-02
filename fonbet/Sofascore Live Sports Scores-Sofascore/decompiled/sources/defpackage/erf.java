package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class erf {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, qrf qrfVar) {
        getItemOffsets(rect, ((hrf) view.getLayoutParams()).a.getLayoutPosition(), recyclerView);
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull qrf qrfVar) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull qrf qrfVar) {
        onDrawOver(canvas, recyclerView);
    }

    @Deprecated
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    @Deprecated
    public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }
}
