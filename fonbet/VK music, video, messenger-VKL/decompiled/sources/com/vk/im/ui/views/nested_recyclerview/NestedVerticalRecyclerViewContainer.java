package com.vk.im.ui.views.nested_recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.q160;
import xsna.s160;
import xsna.u160;
import xsna.v160;
import xsna.zrp;

/* compiled from: NestedVerticalRecyclerViewContainer.kt */
/* loaded from: classes2.dex */
public final class NestedVerticalRecyclerViewContainer extends FrameLayout implements u160, q160, AppBarLayout.f {
    public final v160 b;
    public final s160 c;
    public final int[] d;
    public a e;
    public NestedScrollingHostState f;
    public final com.vk.im.ui.views.nested_recyclerview.a g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NestedVerticalRecyclerViewContainer.kt */
    public static final class NestedScrollingHostState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NestedScrollingHostState[] $VALUES;
        public static final NestedScrollingHostState ACTIVE;
        public static final NestedScrollingHostState IDLE;

        static {
            NestedScrollingHostState nestedScrollingHostState = new NestedScrollingHostState(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = nestedScrollingHostState;
            NestedScrollingHostState nestedScrollingHostState2 = new NestedScrollingHostState("IDLE", 1);
            IDLE = nestedScrollingHostState2;
            NestedScrollingHostState[] nestedScrollingHostStateArr = {nestedScrollingHostState, nestedScrollingHostState2};
            $VALUES = nestedScrollingHostStateArr;
            $ENTRIES = new asp(nestedScrollingHostStateArr);
        }

        public NestedScrollingHostState() {
            throw null;
        }

        public static NestedScrollingHostState valueOf(String str) {
            return (NestedScrollingHostState) Enum.valueOf(NestedScrollingHostState.class, str);
        }

        public static NestedScrollingHostState[] values() {
            return (NestedScrollingHostState[]) $VALUES.clone();
        }
    }

    /* compiled from: NestedVerticalRecyclerViewContainer.kt */
    public interface a {
        void a(NestedScrollingHostState nestedScrollingHostState);
    }

    /* compiled from: NestedVerticalRecyclerViewContainer.kt */
    public interface b {
        void L();

        void c(int i, int[] iArr);

        boolean d();

        void w();
    }

    public NestedVerticalRecyclerViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new v160();
        this.c = new s160(this);
        this.d = new int[2];
        this.f = NestedScrollingHostState.IDLE;
        this.g = new com.vk.im.ui.views.nested_recyclerview.a(this);
        setNestedScrollingEnabled(true);
    }

    public static b b(View view) {
        int childCount;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof b)) {
                    if (i == childCount) {
                        break;
                    }
                    i++;
                } else {
                    return (b) childAt;
                }
            }
        }
        return null;
    }

    private final RecyclerView getChildRecyclerView() {
        View childAt = getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    private final void setScrollableHostState(NestedScrollingHostState nestedScrollingHostState) {
        if (this.f != nestedScrollingHostState) {
            this.f = nestedScrollingHostState;
            a aVar = this.e;
            if (aVar != null) {
                aVar.a(nestedScrollingHostState);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i) {
        b b2;
        if (i == 0 || (b2 = b(getChildRecyclerView())) == null) {
            return;
        }
        b2.w();
    }

    @Override // xsna.u160
    public final void a2(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b b2 = b(view);
        if (b2 == null || !b2.d()) {
            setScrollableHostState(NestedScrollingHostState.IDLE);
        } else {
            int[] iArr2 = this.d;
            iArr2[0] = 0;
            iArr2[1] = 0;
            b2.c(i4, iArr);
            int i6 = iArr2[1];
            iArr[1] = iArr[1] + i6;
            i4 -= i6;
            setScrollableHostState(NestedScrollingHostState.ACTIVE);
        }
        int i7 = i4;
        if (this.c.h(2, i5)) {
            this.c.d(i, iArr[1], i3, i7, null, i5, iArr);
            if (b2 != null) {
                b2.w();
            }
        }
    }

    @Override // xsna.t160
    public final void c0(int i, View view) {
        v160 v160Var = this.b;
        if (i == 1) {
            v160Var.b = 0;
        } else {
            v160Var.a = 0;
        }
    }

    public final a getListener() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.a();
    }

    public final NestedScrollingHostState getScrollableHostState() {
        return this.f;
    }

    @Override // xsna.t160
    public final boolean h4(View view, View view2, int i, int i2) {
        return view == getChildRecyclerView() && i == 2;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.d;
    }

    @Override // xsna.t160
    public final void l0(View view, View view2, int i, int i2) {
        this.b.a = i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.b.a = 0;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (!(view instanceof RecyclerView)) {
            throw new IllegalStateException("Only RecyclerView can be a child of NestedRecyclerViewScrollerContainer");
        }
        if (getChildCount() > 1) {
            throw new IllegalStateException("NestedRecyclerViewScrollerContainer can hold only one RecyclerView");
        }
        getChildRecyclerView().addOnScrollListener(this.g);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        getChildRecyclerView().removeOnScrollListener(this.g);
        super.onViewRemoved(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // xsna.t160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s1(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        b b2 = b(view);
        boolean h = this.c.h(2, i3);
        int[] iArr2 = this.d;
        if (h) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            i4 = i2;
            if (this.c.c(i, i4, iArr2, null, i3)) {
                i5 = i4 - iArr2[1];
                if (b2 != null) {
                    b2.w();
                }
                if (i5 != 0) {
                    iArr[1] = iArr[1] + i4;
                    return;
                }
                if (b2 == null || !b2.d()) {
                    setScrollableHostState(NestedScrollingHostState.IDLE);
                    return;
                }
                iArr2[0] = 0;
                iArr2[1] = 0;
                b2.c(i5, iArr2);
                iArr[1] = iArr[1] + iArr2[1];
                setScrollableHostState(NestedScrollingHostState.ACTIVE);
                return;
            }
        } else {
            i4 = i2;
        }
        i5 = i4;
        if (i5 != 0) {
        }
    }

    public final void setListener(a aVar) {
        this.e = aVar;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.c.g(z);
    }

    @Override // xsna.q160
    public final void stopNestedScroll(int i) {
        this.c.i(i);
    }

    @Override // xsna.t160
    public final void H0(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
