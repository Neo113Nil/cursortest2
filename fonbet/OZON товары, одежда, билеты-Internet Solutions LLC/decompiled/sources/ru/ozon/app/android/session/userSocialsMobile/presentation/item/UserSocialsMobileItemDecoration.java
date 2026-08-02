package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.a;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "currentPosition", "", "shouldDraw", "(Landroidx/recyclerview/widget/RecyclerView;I)Z", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "height", "I", "whitePartWidth", "Landroid/graphics/Paint;", "whitePartPaint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/Rect;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserSocialsMobileItemDecoration extends RecyclerView.n {
    private final int height;

    @NotNull
    private Rect rect;

    @NotNull
    private final Paint whitePartPaint;
    private final int whitePartWidth;

    public UserSocialsMobileItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.height = ResourceExtKt.toPx(1);
        this.whitePartWidth = ResourceExtKt.toPx(76);
        Paint paint = new Paint();
        paint.setColor(a.getColor(context, R$color.oz_semantic_bg_secondary));
        this.whitePartPaint = paint;
        this.rect = new Rect();
    }

    private final boolean shouldDraw(RecyclerView parent, int currentPosition) {
        int i11;
        Object adapter = parent.getAdapter();
        l lVar = adapter instanceof l ? (l) adapter : null;
        if (lVar != null && (lVar.b(currentPosition) instanceof UserSocialsMobileItemVO) && (i11 = currentPosition + 1) < lVar.getItemCount()) {
            return lVar.b(i11) instanceof UserSocialsMobileItemVO;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        if (shouldDraw(parent, Nh.a.a(parent, "parent", state, "state", view))) {
            outRect.bottom += this.height;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            parent.getDecoratedBoundsWithMargins(view, this.rect);
            if (shouldDraw(parent, childAdapterPosition)) {
                Rect rect = this.rect;
                rect.top = rect.bottom - this.height;
                rect.right = this.whitePartWidth;
                canvas.drawRect(rect, this.whitePartPaint);
            }
        }
    }
}
