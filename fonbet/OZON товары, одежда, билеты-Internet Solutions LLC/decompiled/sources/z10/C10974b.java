package z10;

import H00.b;
import Kg0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import y10.ViewOnClickListenerC10823a;

/* renamed from: z10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10974b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f106911a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f106912b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106913c;

    /* renamed from: d, reason: collision with root package name */
    private float f106914d;

    /* renamed from: e, reason: collision with root package name */
    private long f106915e;

    /* renamed from: z10.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function1<Bitmap, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f106917c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f106918d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f106919e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewGroup f106920f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, int i11, int i12, ViewGroup viewGroup) {
            super(1);
            this.f106917c = j11;
            this.f106918d = i11;
            this.f106919e = i12;
            this.f106920f = viewGroup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
            C10974b c10974b = C10974b.this;
            if (c10974b.f106915e == this.f106917c) {
                c10974b.f106912b.setLayoutParams(new CoordinatorLayout.f(this.f106918d, this.f106919e));
                c10974b.f106912b.setImageBitmap(bitmap2);
                c10974b.f106912b.setVisibility(0);
                ViewGroup viewGroup = this.f106920f;
                ((z10.c) viewGroup).a(false);
                c10974b.f106912b.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10973a(c10974b, viewGroup));
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: z10.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C2321b extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f106921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2321b(ViewGroup viewGroup) {
            super(1);
            this.f106921b = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable throwable = th2;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            ((z10.c) this.f106921b).a(false);
            if (H00.b.a() != b.a.C0214a.a()) {
                H00.b.a().logError(throwable);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: z10.b$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f106922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ViewGroup viewGroup) {
            super(0);
            this.f106922b = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((z10.c) this.f106922b).a(false);
            return Unit.f71690a;
        }
    }

    /* renamed from: z10.b$d */
    static final class d extends AbstractC7737t implements Function0<ViewGroup> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return (ViewGroup) C10974b.this.f106911a.Y().findViewById(R.id.stickyPlaceholder);
        }
    }

    public C10974b(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f106911a = container;
        ImageView imageView = (ImageView) container.Y().findViewById(R.id.fullComposerSnapshot);
        if (imageView != null) {
            imageView.setBackground(container.Y().getBackground());
            imageView.setOnClickListener(new ViewOnClickListenerC10823a());
        } else {
            imageView = null;
        }
        this.f106912b = imageView;
        this.f106913c = k.b(new d());
    }

    public final void d() {
        this.f106915e++;
        ImageView imageView = this.f106912b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ((ViewGroup) this.f106913c.getValue()).setElevation(this.f106914d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        ViewGroup Z11 = this.f106911a.Z();
        ImageView imageView = this.f106912b;
        if (imageView == null || imageView.getVisibility() == 0 || !(Z11 instanceof z10.c)) {
            return;
        }
        int width = Z11.getWidth();
        int height = Z11.getHeight();
        ((z10.c) Z11).a(true);
        InterfaceC4008j interfaceC4008j = this.f106913c;
        this.f106914d = ((ViewGroup) interfaceC4008j.getValue()).getElevation();
        ((ViewGroup) interfaceC4008j.getValue()).setElevation(0.0f);
        long j11 = this.f106915e + 1;
        this.f106915e = j11;
        e.c(Z11, new a(j11, width, height, Z11), new C2321b(Z11), new c(Z11));
    }
}
