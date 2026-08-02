package com.vk.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import xsna.jw5;

/* compiled from: AppBarLayoutWithDrawingOrderCallback.kt */
/* loaded from: classes17.dex */
public final class AppBarLayoutWithDrawingOrderCallback extends AppBarLayout {
    public a B;

    public AppBarLayoutWithDrawingOrderCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChildrenDrawingOrderEnabled(true);
        this.B = a.C0783a.a;
    }

    private final void setChildrenScrollFlags(int[] iArr) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((AppBarLayout.d) getChildAt(i).getLayoutParams()).a = iArr[i];
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return this.B.getChildDrawingOrder(i, i2);
    }

    public final a getDrawingOrderCallback() {
        return this.B;
    }

    public final void k() {
        int[] iArr = new int[getChildCount()];
        jw5.o(0, 0, 6, iArr);
        setChildrenScrollFlags(iArr);
    }

    public final void setDrawingOrderCallback(a aVar) {
        this.B = aVar;
    }

    /* compiled from: AppBarLayoutWithDrawingOrderCallback.kt */
    public interface a {
        int getChildDrawingOrder(int i, int i2);

        /* compiled from: AppBarLayoutWithDrawingOrderCallback.kt */
        /* renamed from: com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback$a$a, reason: collision with other inner class name */
        public static final class C0783a {
            public static final C0784a a = new C0784a();
            public static final b b = new b();

            /* compiled from: AppBarLayoutWithDrawingOrderCallback.kt */
            /* renamed from: com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback$a$a$b */
            public static final class b implements a {
                @Override // com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback.a
                public final int getChildDrawingOrder(int i, int i2) {
                    return (i - i2) - 1;
                }
            }

            /* compiled from: AppBarLayoutWithDrawingOrderCallback.kt */
            /* renamed from: com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback$a$a$a, reason: collision with other inner class name */
            public static final class C0784a implements a {
                @Override // com.vk.core.ui.AppBarLayoutWithDrawingOrderCallback.a
                public final int getChildDrawingOrder(int i, int i2) {
                    return i2;
                }
            }
        }
    }
}
