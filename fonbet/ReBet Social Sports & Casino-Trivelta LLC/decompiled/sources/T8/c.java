package T8;

import O8.r;
import T8.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.views.GifView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l0.AbstractC5338c;

/* loaded from: classes2.dex */
public final class c extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final b f11256c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Function2 f11257d = a.f11260d;

    /* renamed from: a, reason: collision with root package name */
    public final g.a f11258a;

    /* renamed from: b, reason: collision with root package name */
    public final GifView f11259b;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11260d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(ViewGroup parent, g.a adapterHelper) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(adapterHelper, "adapterHelper");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            GifView gifView = new GifView(context, null, 0, 6, null);
            gifView.setForeground(AbstractC5338c.getDrawable(context, r.f8437y));
            return new c(gifView, adapterHelper);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 a() {
            return c.f11257d;
        }

        public b() {
        }
    }

    /* renamed from: T8.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0217c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GPHContentType.values().length];
            try {
                iArr[GPHContentType.sticker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GPHContentType.emoji.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GPHContentType.text.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GPHContentType.recents.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f11261d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f11261d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            this.f11261d.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View itemView, g.a adapterHelper) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(adapterHelper, "adapterHelper");
        this.f11258a = adapterHelper;
        this.f11259b = (GifView) itemView;
    }

    private final boolean g() {
        return this.f11259b.getLoaded();
    }

    @Override // T8.o
    public void b(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = null;
        Media media = obj instanceof Media ? (Media) obj : null;
        if (media != null) {
            this.f11259b.setFixedAspectRatio(this.f11258a.j() ? this.f11258a.a() : null);
            this.f11259b.setScaleType(this.f11258a.j() ? com.facebook.drawee.drawable.r.f30524e : null);
            this.f11259b.setBackgroundVisible(this.f11258a.i());
            this.f11259b.setImageFormat(this.f11258a.f());
            GPHContentType c10 = this.f11258a.c();
            int i10 = c10 == null ? -1 : C0217c.$EnumSwitchMapping$0[c10.ordinal()];
            if (i10 == 1) {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = true;
            } else if (i10 == 2) {
                z13 = false;
                z10 = false;
                z12 = false;
                z11 = true;
            } else if (i10 == 3) {
                z13 = false;
                z11 = false;
                z12 = false;
                z10 = true;
            } else if (i10 != 4) {
                z13 = false;
                z10 = false;
                z11 = false;
                z12 = false;
            } else {
                z13 = false;
                z10 = false;
                z11 = false;
                z12 = true;
            }
            this.f11258a.d();
            if (!z13 && !z10 && !z11 && !z12) {
                drawable = O8.a.c(getBindingAdapterPosition());
            }
            this.f11259b.y(media, this.f11258a.h(), drawable);
            String str = "Media # " + (getBindingAdapterPosition() + 1) + " of " + this.f11258a.g() + ' ';
            String altText = media.getAltText();
            if (altText == null || altText.length() == 0) {
                String title = media.getTitle();
                if (title != null && title.length() != 0) {
                    str = str + media.getTitle();
                }
            } else {
                str = str + media.getAltText();
            }
            this.f11259b.setContentDescription(str);
            if (media.getIsHidden()) {
                this.f11259b.x();
            } else {
                this.f11259b.v();
            }
            boolean z14 = z13 || z10 || z11;
            this.f11259b.setScaleX(z14 ? 0.7f : 1.0f);
            this.f11259b.setScaleY(z14 ? 0.7f : 1.0f);
            if (z13 || z10 || z11) {
                return;
            }
            this.f11259b.setCornerRadius(GifView.INSTANCE.a());
        }
    }

    @Override // T8.o
    public boolean c(Function0 onLoad) {
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        if (!g()) {
            this.f11259b.setOnPingbackGifLoadSuccess(new d(onLoad));
        }
        return g();
    }

    @Override // T8.o
    public void d() {
        this.f11259b.u();
    }
}
