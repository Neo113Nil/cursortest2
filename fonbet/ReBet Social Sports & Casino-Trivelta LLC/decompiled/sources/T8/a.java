package T8;

import O8.r;
import T8.g;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.views.GifView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final C0214a f11247c = new C0214a(null);

    /* renamed from: a, reason: collision with root package name */
    public final g.a f11248a;

    /* renamed from: b, reason: collision with root package name */
    public final GifView f11249b;

    /* renamed from: T8.a$a, reason: collision with other inner class name */
    public static final class C0214a {

        /* renamed from: T8.a$a$a, reason: collision with other inner class name */
        public static final class C0215a extends Lambda implements Function2 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f11250d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215a(boolean z10) {
                super(2);
                this.f11250d = z10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ViewGroup parent, g.a adapterHelper) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(adapterHelper, "adapterHelper");
                P8.c c10 = P8.c.c(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(c10, "inflate(\n               …  false\n                )");
                boolean z10 = this.f11250d;
                c10.f8844d.setBackgroundResource(r.f8421i);
                ViewGroup.LayoutParams layoutParams = c10.f8842b.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                if (z10) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadii(new float[]{60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f, 60.0f});
                    gradientDrawable.setColor(-921103);
                    c10.f8845e.setBackground(gradientDrawable);
                    bVar.f18130I = "H,2:2";
                } else {
                    c10.f8845e.setVisibility(8);
                    bVar.f18130I = "H,3:2";
                }
                c10.f8842b.setLayoutParams(bVar);
                ConstraintLayout b10 = c10.b();
                Intrinsics.checkNotNullExpressionValue(b10, "binding.root");
                return new a(b10, adapterHelper);
            }
        }

        public /* synthetic */ C0214a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 a(boolean z10) {
            return new C0215a(z10);
        }

        public C0214a() {
        }
    }

    public static final class b implements GifView.b {
        public b() {
        }

        @Override // com.giphy.sdk.ui.views.GifView.b
        public void a(H7.m mVar, Animatable animatable, long j10, int i10) {
            a.this.h(false);
        }

        @Override // com.giphy.sdk.ui.views.GifView.b
        public void onFailure(Throwable th2) {
            a.this.h(false);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f11252d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0) {
            super(0);
            this.f11252d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            this.f11252d.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, g.a adapterHelper) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adapterHelper, "adapterHelper");
        this.f11248a = adapterHelper;
        GifView gifView = P8.c.a(this.itemView).f8843c;
        Intrinsics.checkNotNullExpressionValue(gifView, "bind(itemView).gifView");
        this.f11249b = gifView;
    }

    @Override // T8.o
    public void b(Object obj) {
        h(true);
        this.f11249b.setGifCallback(new b());
        Media media = obj instanceof Media ? (Media) obj : null;
        if (media != null) {
            this.f11249b.setScaleType(com.facebook.drawee.drawable.r.f30524e);
            this.f11249b.setImageFormat(this.f11248a.f());
            GifView.z(this.f11249b, (Media) obj, this.f11248a.h(), null, 4, null);
            String str = "Media # " + (getBindingAdapterPosition() + 1) + " of " + this.f11248a.g() + ' ';
            String altText = media.getAltText();
            if (altText == null || altText.length() == 0) {
                String title = media.getTitle();
                if (title != null && title.length() != 0) {
                    str = str + media.getTitle();
                }
            } else {
                str = str + media.getAltText();
            }
            this.f11249b.setContentDescription(str);
            this.f11249b.setScaleX(1.0f);
            this.f11249b.setScaleY(1.0f);
        }
    }

    @Override // T8.o
    public boolean c(Function0 onLoad) {
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        if (!g()) {
            this.f11249b.setOnPingbackGifLoadSuccess(new c(onLoad));
        }
        return g();
    }

    @Override // T8.o
    public void d() {
        this.f11249b.setGifCallback(null);
        this.f11249b.u();
    }

    public final boolean g() {
        return this.f11249b.getLoaded();
    }

    public final void h(boolean z10) {
        P8.c a10 = P8.c.a(this.itemView);
        Drawable background = a10.f8844d.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        if (z10) {
            a10.f8844d.setVisibility(0);
            animationDrawable.start();
        } else {
            a10.f8844d.setVisibility(8);
            animationDrawable.stop();
        }
    }
}
