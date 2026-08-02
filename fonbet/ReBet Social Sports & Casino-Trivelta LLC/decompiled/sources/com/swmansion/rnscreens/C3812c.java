package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.swmansion.rnscreens.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3812c extends SearchView {

    /* renamed from: U4, reason: collision with root package name */
    public SearchView.l f41758U4;

    /* renamed from: V4, reason: collision with root package name */
    public View.OnClickListener f41759V4;

    /* renamed from: W4, reason: collision with root package name */
    public androidx.activity.F f41760W4;

    /* renamed from: X4, reason: collision with root package name */
    public final C3817h f41761X4;

    /* renamed from: com.swmansion.rnscreens.c$a */
    public static final class a extends androidx.activity.F {
        public a() {
            super(true);
        }

        @Override // androidx.activity.F
        public void handleOnBackPressed() {
            C3812c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3812c(Context context, Fragment fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a aVar = new a();
        this.f41760W4 = aVar;
        this.f41761X4 = new C3817h(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3812c.m0(C3812c.this, view);
            }
        });
        super.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.b
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                boolean n02;
                n02 = C3812c.n0(C3812c.this);
                return n02;
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    public static final void m0(C3812c c3812c, View view) {
        View.OnClickListener onClickListener = c3812c.f41759V4;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        c3812c.f41761X4.b();
    }

    public static final boolean n0(C3812c c3812c) {
        SearchView.l lVar = c3812c.f41758U4;
        boolean a10 = lVar != null ? lVar.a() : false;
        c3812c.f41761X4.c();
        return a10;
    }

    public final boolean getOverrideBackAction() {
        return this.f41761X4.a();
    }

    public final void o0() {
        p0();
        setIconified(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (J()) {
            return;
        }
        this.f41761X4.b();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41761X4.c();
    }

    public final void p0() {
        b0("", false);
    }

    public final void q0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(@Nullable SearchView.l lVar) {
        this.f41758U4 = lVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f41759V4 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z10) {
        this.f41761X4.d(z10);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        b0(text, false);
    }
}
