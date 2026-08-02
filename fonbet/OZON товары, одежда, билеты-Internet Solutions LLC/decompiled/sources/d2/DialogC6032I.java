package d2;

import S0.AbstractC3984t;
import a1.C4912a;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.core.view.C5334o0;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: d2.I, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class DialogC6032I extends androidx.activity.s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f60992a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C6030G f60993b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final View f60994c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6029F f60995d;

    /* renamed from: e, reason: collision with root package name */
    private final int f60996e;

    /* renamed from: d2.I$a */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* renamed from: d2.I$b */
    static final class b extends AbstractC7737t implements Function1<androidx.activity.C, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(androidx.activity.C c11) {
            DialogC6032I dialogC6032I = DialogC6032I.this;
            if (dialogC6032I.f60993b.b()) {
                dialogC6032I.f60992a.invoke();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: d2.I$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60998a;

        static {
            int[] iArr = new int[Z1.s.values().length];
            try {
                iArr[Z1.s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z1.s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60998a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogC6032I(@NotNull Function0<Unit> function0, @NotNull C6030G c6030g, @NotNull View view, @NotNull Z1.s sVar, @NotNull Z1.d dVar, @NotNull UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || c6030g.a()) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.f60992a = function0;
        this.f60993b = c6030g;
        this.f60994c = view;
        float f7 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f60996e = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        C5334o0.a(window, this.f60993b.a());
        C6029F c6029f = new C6029F(window, getContext());
        c6029f.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c6029f.setClipChildren(false);
        c6029f.setElevation(dVar.v1(f7));
        c6029f.setOutlineProvider(new a());
        this.f60995d = c6029f;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            b(viewGroup);
        }
        setContentView(c6029f);
        C0.b(c6029f, C0.a(view));
        D0.b(c6029f, D0.a(view));
        M4.f.b(c6029f, M4.f.a(view));
        g(this.f60992a, this.f60993b, sVar);
        androidx.activity.L.a(getOnBackPressedDispatcher(), this, new b(), 2);
    }

    private static final void b(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C6029F) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                b(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e() {
        this.f60995d.disposeComposition();
    }

    public final void f(@NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        this.f60995d.b(abstractC3984t, c4912a);
    }

    public final void g(@NotNull Function0<Unit> function0, @NotNull C6030G c6030g, @NotNull Z1.s sVar) {
        Window window;
        this.f60992a = function0;
        this.f60993b = c6030g;
        EnumC6042T d11 = c6030g.d();
        boolean c11 = C6054l.c(this.f60994c);
        int i11 = U.f61034a[d11.ordinal()];
        int i12 = 0;
        if (i11 == 1) {
            c11 = false;
        } else if (i11 == 2) {
            c11 = true;
        } else if (i11 != 3) {
            throw new Sc.o();
        }
        Window window2 = getWindow();
        Intrinsics.f(window2);
        window2.setFlags(c11 ? 8192 : -8193, 8192);
        int i13 = c.f60998a[sVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new Sc.o();
            }
            i12 = 1;
        }
        C6029F c6029f = this.f60995d;
        c6029f.setLayoutDirection(i12);
        if (c6030g.e() && !c6029f.a() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        c6029f.c(c6030g.e());
        if (Build.VERSION.SDK_INT < 31) {
            if (c6030g.a()) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f60996e);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f60993b.c()) {
            this.f60992a.invoke();
        }
        return onTouchEvent;
    }
}
