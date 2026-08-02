package com.vk.profile.user.impl.ui.adapter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.cyd0;
import xsna.f4m;
import xsna.krv0;
import xsna.too0;

/* compiled from: ProfileItemDecoration.kt */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.n implements too0 {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h = true;
    public final boolean i = true;
    public final Paint j;
    public final Rect k;

    /* compiled from: ProfileItemDecoration.kt */
    /* renamed from: com.vk.profile.user.impl.ui.adapter.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1704a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MergeMode.values().length];
            try {
                iArr[MergeMode.FlatMerge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MergeMode.MergeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MergeMode.MergeBoth.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MergeMode.MergeBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i2;
        this.g = i5;
        Paint paint = new Paint(1);
        paint.setColor(krv0.l(R.attr.vk_ui_background_content));
        this.j = paint;
        this.k = new Rect();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.j.setColor(krv0.l(R.attr.vk_ui_background_content));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z = view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
        if (childAdapterPosition != 0 || this.h) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (childAdapterPosition != (adapter != null ? adapter.getItemCount() : -1) - 1 || this.i) {
                RecyclerView.Adapter<?> a = cyd0.a(recyclerView, childAdapterPosition);
                boolean z2 = a instanceof b;
                if (!(z2 && ((b) a).getItemViewType(childAdapterPosition) == R.layout.holder_user_profile_wall_selector_mode) && z2) {
                    UserProfileAdapterItem userProfileAdapterItem = (UserProfileAdapterItem) ((b) a).c.c(childAdapterPosition);
                    MergeMode mergeMode = userProfileAdapterItem.b;
                    int[] iArr = C1704a.$EnumSwitchMapping$0;
                    int i = iArr[mergeMode.ordinal()];
                    int i2 = i != 1 ? (i == 2 || i == 3) ? this.f : this.c : 0;
                    int i3 = iArr[userProfileAdapterItem.b.ordinal()];
                    int i4 = i3 != 1 ? (i3 == 3 || i3 == 4) ? this.g : this.e : 0;
                    rect.top = i2;
                    rect.bottom = i4;
                    int i5 = this.b;
                    int i6 = this.d;
                    rect.left = z ? i6 : i5;
                    if (!z) {
                        i5 = i6;
                    }
                    rect.right = i5;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View childAt;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.Adapter<?> a = cyd0.a(recyclerView, i);
            if ((a instanceof b) && ((b) a).getItemViewType(i) == -3 && (childAt = recyclerView.getChildAt(i)) != null) {
                if (childAt.getBottom() < recyclerView.getBottom()) {
                    int bottom = childAt.getBottom();
                    Rect rect = this.k;
                    rect.top = bottom;
                    rect.left = childAt.getLeft();
                    rect.right = childAt.getRight();
                    rect.bottom = recyclerView.getBottom();
                    canvas.drawRect(rect, this.j);
                    f4m.q(recyclerView.getBottom() - childAt.getBottom(), childAt);
                } else {
                    f4m.q(0, childAt);
                }
            }
        }
    }
}
