package p7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import i7.C7017a;
import ru.ozon.app.android.R;
import s7.C9619n;
import v7.c;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8868a extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private ShapeDrawable f80298a;

    /* renamed from: b, reason: collision with root package name */
    private int f80299b;

    /* renamed from: c, reason: collision with root package name */
    private int f80300c;

    /* renamed from: d, reason: collision with root package name */
    private int f80301d;

    /* renamed from: e, reason: collision with root package name */
    private int f80302e;

    /* renamed from: f, reason: collision with root package name */
    private int f80303f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f80304g;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f80305h = new Rect();

    public C8868a(@NonNull Context context) {
        TypedArray e11 = C9619n.e(context, null, C7017a.f65960z, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f80300c = c.a(context, e11, 0).getDefaultColor();
        this.f80299b = e11.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f80302e = e11.getDimensionPixelOffset(2, 0);
        this.f80303f = e11.getDimensionPixelOffset(1, 0);
        this.f80304g = e11.getBoolean(4, true);
        e11.recycle();
        this.f80298a = new ShapeDrawable();
        a(this.f80300c);
        this.f80301d = 1;
    }

    public final void a(int i11) {
        this.f80300c = i11;
        ShapeDrawable shapeDrawable = this.f80298a;
        this.f80298a = shapeDrawable;
        androidx.core.graphics.drawable.a.i(shapeDrawable, i11);
    }

    public final void b(int i11) {
        this.f80302e = i11;
    }

    public final void c(int i11) {
        this.f80299b = i11;
    }

    public final void d() {
        this.f80304g = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.A a11) {
        rect.set(0, 0, 0, 0);
        if (this.f80301d == 1) {
            rect.bottom = this.f80298a.getIntrinsicHeight() + this.f80299b;
        } else {
            rect.right = this.f80298a.getIntrinsicWidth() + this.f80299b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.A a11) {
        int height;
        int i11;
        int width;
        int i12;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i13 = this.f80301d;
        int i14 = this.f80303f;
        Rect rect = this.f80305h;
        int i15 = 0;
        if (i13 != 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i11 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i11 = 0;
            }
            int i16 = i11 + this.f80302e;
            int i17 = height - i14;
            int childCount = recyclerView.getChildCount();
            while (i15 < childCount) {
                View childAt = recyclerView.getChildAt(i15);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, rect);
                int round = Math.round(childAt.getTranslationX()) + rect.right;
                this.f80298a.setBounds((round - this.f80298a.getIntrinsicWidth()) - this.f80299b, i16, round, i17);
                this.f80298a.draw(canvas);
                i15++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i12 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i12, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i12 = 0;
        }
        int i18 = Y.f42258g;
        boolean z11 = recyclerView.getLayoutDirection() == 1;
        int i19 = i12 + (z11 ? i14 : this.f80302e);
        if (z11) {
            i14 = this.f80302e;
        }
        int i21 = width - i14;
        int childCount2 = recyclerView.getChildCount();
        if (!this.f80304g) {
            childCount2--;
        }
        while (i15 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i15);
            recyclerView.getDecoratedBoundsWithMargins(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
            this.f80298a.setBounds(i19, (round2 - this.f80298a.getIntrinsicHeight()) - this.f80299b, i21, round2);
            this.f80298a.draw(canvas);
            i15++;
        }
        canvas.restore();
    }
}
