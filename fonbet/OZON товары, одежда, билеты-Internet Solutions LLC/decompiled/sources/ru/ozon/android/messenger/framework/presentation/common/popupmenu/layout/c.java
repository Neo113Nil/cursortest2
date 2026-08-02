package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface c {

    public static abstract class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f90935a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f90936b;

        /* renamed from: c, reason: collision with root package name */
        private final int f90937c;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c$a$a, reason: collision with other inner class name */
        public static final class C1693a extends a {

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            public static final C1693a f90938d = new C1693a(0, false, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1693a);
            }

            public final int hashCode() {
                return 1032994661;
            }

            @NotNull
            public final String toString() {
                return "BottomLeft";
            }
        }

        public static final class b extends a {

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            public static final b f90939d = new b(0, false, true);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1963724414;
            }

            @NotNull
            public final String toString() {
                return "BottomRight";
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c$a$c, reason: collision with other inner class name */
        public static final class C1694c extends a {

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            public static final C1694c f90940d = new C1694c(0, true, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1694c);
            }

            public final int hashCode() {
                return -1899805367;
            }

            @NotNull
            public final String toString() {
                return "TopLeft";
            }
        }

        public static final class d extends a {

            /* renamed from: d, reason: collision with root package name */
            @NotNull
            public static final d f90941d = new d(0, true, true);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1241236762;
            }

            @NotNull
            public final String toString() {
                return "TopRight";
            }
        }

        public a(int i11, boolean z11, boolean z12) {
            this.f90935a = z11;
            this.f90936b = z12;
            this.f90937c = i11;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c
        public final void a(@NotNull LinearLayout actionsView, @NotNull ru.ozon.android.messenger.framework.presentation.common.screenshot.a selectionView) {
            Intrinsics.checkNotNullParameter(actionsView, "actionsView");
            Intrinsics.checkNotNullParameter(selectionView, "selectionView");
            selectionView.getViewTreeObserver().addOnGlobalLayoutListener(new ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.d(selectionView, actionsView, this, selectionView));
        }
    }

    public static abstract class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f90942a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f90943b;

        public static final class a extends b {

            /* renamed from: c, reason: collision with root package name */
            private final boolean f90944c;

            public a(boolean z11) {
                super(false, z11);
                this.f90944c = z11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f90944c == ((a) obj).f90944c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f90944c);
            }

            @NotNull
            public final String toString() {
                return Pk0.a.a(")", new StringBuilder("Left(isHaveAvatar="), this.f90944c);
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c$b$b, reason: collision with other inner class name */
        public static final class C1695b extends b {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final C1695b f90945c = new C1695b(true, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1695b);
            }

            public final int hashCode() {
                return 184503184;
            }

            @NotNull
            public final String toString() {
                return "Right";
            }
        }

        public b(boolean z11, boolean z12) {
            this.f90942a = z11;
            this.f90943b = z12;
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c
        public final void a(@NotNull LinearLayout actionsView, @NotNull ru.ozon.android.messenger.framework.presentation.common.screenshot.a selectionView) {
            Intrinsics.checkNotNullParameter(actionsView, "actionsView");
            Intrinsics.checkNotNullParameter(selectionView, "selectionView");
            selectionView.getViewTreeObserver().addOnGlobalLayoutListener(new f(selectionView, actionsView, this, selectionView));
        }
    }

    void a(@NotNull LinearLayout linearLayout, @NotNull ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar);
}
