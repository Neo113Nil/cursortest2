package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class d0 extends AbstractC3815f {

    /* renamed from: g, reason: collision with root package name */
    public int f41773g;

    /* renamed from: h, reason: collision with root package name */
    public int f41774h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41775i;

    /* renamed from: j, reason: collision with root package name */
    public a f41776j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f41777a = new a("LEFT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f41778b = new a("CENTER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f41779c = new a("RIGHT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f41780d = new a("BACK", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f41781e = new a("SEARCH_BAR", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f41782f;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f41782f = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f41777a, f41778b, f41779c, f41780d, f41781e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public d0(ReactContext reactContext) {
        super(reactContext);
        this.f41776j = a.f41777a;
    }

    @Nullable
    public final b0 getConfig() {
        ViewParent parent = getParent();
        C3813d c3813d = parent instanceof C3813d ? (C3813d) parent : null;
        if (c3813d != null) {
            return c3813d.getConfig();
        }
        return null;
    }

    @NotNull
    public final a getType() {
        return this.f41776j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f41775i) {
                b(i14, i15, i10, i11);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) {
            this.f41773g = View.MeasureSpec.getSize(i10);
            this.f41774h = View.MeasureSpec.getSize(i11);
            this.f41775i = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f41773g, this.f41774h);
    }

    public final void setType(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f41776j = aVar;
    }
}
