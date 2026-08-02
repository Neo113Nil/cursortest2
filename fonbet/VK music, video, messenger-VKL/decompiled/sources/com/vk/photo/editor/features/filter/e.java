package com.vk.photo.editor.features.filter;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.features.filter.a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FiltersOffsetDecorator.kt */
/* loaded from: classes4.dex */
public final class e extends RecyclerView.n {
    public final d b;

    /* compiled from: FiltersOffsetDecorator.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterUiModel.Type.values().length];
            try {
                iArr[FilterUiModel.Type.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterUiModel.Type.GROUP_ENTRY_POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterUiModel.Type.SUB_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e(d dVar) {
        this.b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        double floor;
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            d dVar = this.b;
            if (childAdapterPosition == 0) {
                rect.left = (int) Math.floor(16 * Resources.getSystem().getDisplayMetrics().density);
            } else if (childAdapterPosition == dVar.getItemCount() - 1) {
                rect.right = (int) Math.floor(16 * Resources.getSystem().getDisplayMetrics().density);
            }
            if (childAdapterPosition > 0) {
                com.vk.photo.editor.features.filter.a x0 = dVar.x0(childAdapterPosition);
                if (!(x0 instanceof a.C1457a)) {
                    if (x0 instanceof a.b) {
                        rect.left = (int) Math.floor(12 * Resources.getSystem().getDisplayMetrics().density);
                        return;
                    } else {
                        if (x0 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                int i = a.$EnumSwitchMapping$0[((a.C1457a) x0).a.f.ordinal()];
                if (i == 1 || i == 2) {
                    floor = Math.floor(12 * Resources.getSystem().getDisplayMetrics().density);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    floor = Math.floor(8 * Resources.getSystem().getDisplayMetrics().density);
                }
                rect.left = (int) floor;
            }
        }
    }
}
