package Sc;

import android.R;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.appbar.a;
import com.swmansion.rnscreens.gamma.stack.header.StackHeaderAppBarLayoutBehavior;
import dd.AbstractC4058e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class a extends AppBarLayout {

    /* renamed from: B, reason: collision with root package name */
    public static final b f10707B = new b(null);

    /* renamed from: Sc.a$a, reason: collision with other inner class name */
    public static final class C0206a extends a {

        /* renamed from: C, reason: collision with root package name */
        public final Tc.f f10708C;

        /* renamed from: D, reason: collision with root package name */
        public final MaterialToolbar f10709D;

        /* renamed from: E, reason: collision with root package name */
        public final com.google.android.material.appbar.a f10710E;

        /* renamed from: Sc.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0207a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Tc.f.values().length];
                try {
                    iArr[Tc.f.f11450b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tc.f.f11451c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0206a(Context context, Tc.f type) {
            super(context, null);
            Pair pair;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f10708C = type;
            MaterialToolbar materialToolbar = new MaterialToolbar(context);
            materialToolbar.setElevation(0.0f);
            a.c cVar = new a.c(-1, AbstractC4058e.a(context, R.attr.actionBarSize));
            cVar.b(1);
            materialToolbar.setLayoutParams(cVar);
            this.f10709D = materialToolbar;
            int i10 = C0207a.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 == 1) {
                pair = new Pair(Integer.valueOf(ia.c.f48242k), Integer.valueOf(ia.c.f48240j));
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("[RNScreens] Invalid header mode.");
                }
                pair = new Pair(Integer.valueOf(ia.c.f48238i), Integer.valueOf(ia.c.f48236h));
            }
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            com.google.android.material.appbar.a aVar = new com.google.android.material.appbar.a(context, null, intValue);
            aVar.setLayoutParams(new AppBarLayout.e(-1, AbstractC4058e.a(context, intValue2)));
            aVar.addView(getToolbar());
            this.f10710E = aVar;
            if (type != Tc.f.f11450b && type != Tc.f.f11451c) {
                throw new IllegalArgumentException("[RNScreens] Collapsing StackHeaderAppBarLayout must be MEDIUM or LARGE type.");
            }
            addView(aVar);
        }

        @NotNull
        public final com.google.android.material.appbar.a getCollapsingToolbarLayout$react_native_screens_release() {
            return this.f10710E;
        }

        @Override // Sc.a
        @NotNull
        public MaterialToolbar getToolbar() {
            return this.f10709D;
        }

        @NotNull
        public final Tc.f getType() {
            return this.f10708C;
        }
    }

    public static final class b {

        /* renamed from: Sc.a$b$a, reason: collision with other inner class name */
        public /* synthetic */ class C0208a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Tc.f.values().length];
                try {
                    iArr[Tc.f.f11449a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Tc.f.f11450b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Tc.f.f11451c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context, Tc.f type) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            int i10 = C0208a.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 == 1) {
                return new c(context);
            }
            if (i10 == 2 || i10 == 3) {
                return new C0206a(context, type);
            }
            throw new NoWhenBranchMatchedException();
        }

        public b() {
        }
    }

    public static final class c extends a {

        /* renamed from: C, reason: collision with root package name */
        public final MaterialToolbar f10711C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context, null);
            Intrinsics.checkNotNullParameter(context, "context");
            MaterialToolbar materialToolbar = new MaterialToolbar(context);
            materialToolbar.setElevation(0.0f);
            materialToolbar.setLayoutParams(new AppBarLayout.e(-1, -2));
            this.f10711C = materialToolbar;
            addView(getToolbar());
        }

        @Override // Sc.a
        @NotNull
        public MaterialToolbar getToolbar() {
            return this.f10711C;
        }
    }

    public /* synthetic */ a(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @NotNull
    public abstract MaterialToolbar getToolbar();

    public a(Context context) {
        super(context);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.o(new StackHeaderAppBarLayoutBehavior());
        setLayoutParams(fVar);
        setLiftOnScroll(true);
        setFitsSystemWindows(true);
    }
}
