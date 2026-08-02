package T8;

import T8.g;
import android.graphics.drawable.Drawable;
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
public final class n extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final b f11338c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function2 f11339d = a.f11342d;

    /* renamed from: a, reason: collision with root package name */
    public final g.a f11340a;

    /* renamed from: b, reason: collision with root package name */
    public final GifView f11341b;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11342d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke(ViewGroup parent, g.a adapterHelper) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(adapterHelper, "adapterHelper");
            P8.f c10 = P8.f.c(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(\n               …  false\n                )");
            ConstraintLayout b10 = c10.b();
            Intrinsics.checkNotNullExpressionValue(b10, "binding.root");
            return new n(b10, adapterHelper);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 a() {
            return n.f11339d;
        }

        public b() {
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f11343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0 function0) {
            super(0);
            this.f11343d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m19invoke() {
            this.f11343d.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view, g.a adapterHelper) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adapterHelper, "adapterHelper");
        this.f11340a = adapterHelper;
        GifView gifView = P8.f.a(this.itemView).f8870b;
        Intrinsics.checkNotNullExpressionValue(gifView, "bind(itemView).gifView");
        this.f11341b = gifView;
    }

    private final boolean g() {
        return this.f11341b.getLoaded();
    }

    @Override // T8.o
    public void b(Object obj) {
        Media media = obj instanceof Media ? (Media) obj : null;
        if (media != null) {
            Drawable c10 = O8.a.c(getBindingAdapterPosition());
            this.f11341b.setImageFormat(this.f11340a.f());
            this.f11341b.y((Media) obj, this.f11340a.b(), c10);
            String str = "Media # " + (getBindingAdapterPosition() + 1) + " of " + this.f11340a.g() + ' ';
            String altText = media.getAltText();
            if (altText == null || altText.length() == 0) {
                String title = media.getTitle();
                if (title != null && title.length() != 0) {
                    str = str + media.getTitle();
                }
            } else {
                str = str + media.getAltText();
            }
            this.f11341b.setContentDescription(str);
            this.f11341b.setScaleX(1.0f);
            this.f11341b.setScaleY(1.0f);
            this.f11341b.setCornerRadius(GifView.INSTANCE.a());
        }
    }

    @Override // T8.o
    public boolean c(Function0 onLoad) {
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        if (!g()) {
            this.f11341b.setOnPingbackGifLoadSuccess(new c(onLoad));
        }
        return g();
    }

    @Override // T8.o
    public void d() {
        this.f11341b.setGifCallback(null);
        this.f11341b.u();
    }
}
