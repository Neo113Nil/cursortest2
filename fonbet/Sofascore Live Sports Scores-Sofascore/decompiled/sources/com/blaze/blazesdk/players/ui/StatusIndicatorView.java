package com.blaze.blazesdk.players.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.sofascore.results.R;
import defpackage.bf3;
import defpackage.deh;
import defpackage.evl;
import defpackage.g7a;
import defpackage.joa;
import defpackage.l4a;
import defpackage.lnb;
import defpackage.nq8;
import defpackage.o6a;
import defpackage.pqm;
import defpackage.s6a;
import defpackage.tam;
import defpackage.td4;
import defpackage.tl3;
import defpackage.u7g;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.z1g;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eR\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/players/ui/StatusIndicatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/blaze/blazesdk/players/ui/StatusIndicatorView$b;", "params", "", "applyPadding", "(Lcom/blaze/blazesdk/players/ui/StatusIndicatorView$b;)V", "applyTextStyle", "applyFontWeight", "()V", "applyIconStyle", "applyBackground", "setupView", "Lpqm;", "binding$delegate", "Ljoa;", "getBinding", "()Lpqm;", "binding", "Companion", "b", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusIndicatorView extends ConstraintLayout {
    private static final int DEFAULT_ICON_START_PADDING_DP = 2;
    private static final int DEFAULT_ICON_TEXT_SPACING_DP = 4;
    private static final int TEXT_FONT_WEIGHT = 600;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa binding;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        public final boolean a;
        public final String b;
        public final int c;
        public final float d;
        public final Integer e;
        public final int f;
        public final Integer g;
        public final BlazeDp h;
        public final Float i;
        public final int j;
        public final int k;
        public final a l;
        public final BlazeInsets m;
        public final String n;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a {
            public final int a;
            public final Integer b;

            public a(int i, @Nullable Integer num) {
                this.a = i;
                this.b = num;
            }

            public static a copy$default(a aVar, int i, Integer num, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = aVar.a;
                }
                if ((i2 & 2) != 0) {
                    num = aVar.b;
                }
                aVar.getClass();
                return new a(i, num);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && Intrinsics.c(this.b, aVar.b);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                Integer num = this.b;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("IconParams(iconResId=");
                sb.append(this.a);
                sb.append(", iconTint=");
                return bf3.n(sb, this.b, ')');
            }
        }

        public b(boolean z, @NotNull String str, int i, float f, @Nullable Integer num, int i2, @Nullable Integer num2, @NotNull BlazeDp blazeDp, @Nullable Float f2, int i3, int i4, @Nullable a aVar, @NotNull BlazeInsets blazeInsets, @Nullable String str2) {
            str.getClass();
            blazeDp.getClass();
            blazeInsets.getClass();
            this.a = z;
            this.b = str;
            this.c = i;
            this.d = f;
            this.e = num;
            this.f = i2;
            this.g = num2;
            this.h = blazeDp;
            this.i = f2;
            this.j = i3;
            this.k = i4;
            this.l = aVar;
            this.m = blazeInsets;
            this.n = str2;
        }

        public static b copy$default(b bVar, boolean z, String str, int i, float f, Integer num, int i2, Integer num2, BlazeDp blazeDp, Float f2, int i3, int i4, a aVar, BlazeInsets blazeInsets, String str2, int i5, Object obj) {
            boolean z2 = (i5 & 1) != 0 ? bVar.a : z;
            String str3 = (i5 & 2) != 0 ? bVar.b : str;
            int i6 = (i5 & 4) != 0 ? bVar.c : i;
            float f3 = (i5 & 8) != 0 ? bVar.d : f;
            Integer num3 = (i5 & 16) != 0 ? bVar.e : num;
            int i7 = (i5 & 32) != 0 ? bVar.f : i2;
            Integer num4 = (i5 & 64) != 0 ? bVar.g : num2;
            BlazeDp blazeDp2 = (i5 & 128) != 0 ? bVar.h : blazeDp;
            Float f4 = (i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? bVar.i : f2;
            int i8 = (i5 & 512) != 0 ? bVar.j : i3;
            int i9 = (i5 & 1024) != 0 ? bVar.k : i4;
            a aVar2 = (i5 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? bVar.l : aVar;
            BlazeInsets blazeInsets2 = (i5 & 4096) != 0 ? bVar.m : blazeInsets;
            String str4 = (i5 & 8192) != 0 ? bVar.n : str2;
            bVar.getClass();
            str3.getClass();
            blazeDp2.getClass();
            blazeInsets2.getClass();
            return new b(z2, str3, i6, f3, num3, i7, num4, blazeDp2, f4, i8, i9, aVar2, blazeInsets2, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.c(this.b, bVar.b) && this.c == bVar.c && Float.compare(this.d, bVar.d) == 0 && Intrinsics.c(this.e, bVar.e) && this.f == bVar.f && Intrinsics.c(this.g, bVar.g) && Intrinsics.c(this.h, bVar.h) && Intrinsics.c(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k && Intrinsics.c(this.l, bVar.l) && Intrinsics.c(this.m, bVar.m) && Intrinsics.c(this.n, bVar.n);
        }

        public final int hashCode() {
            int o = g7a.o(this.d, l4a.e(this.c, o6a.k(this.b, Boolean.hashCode(this.a) * 31)));
            Integer num = this.e;
            int e = l4a.e(this.f, (o + (num == null ? 0 : num.hashCode())) * 31);
            Integer num2 = this.g;
            int n = s6a.n(this.h, (e + (num2 == null ? 0 : num2.hashCode())) * 31);
            Float f = this.i;
            int e2 = l4a.e(this.k, l4a.e(this.j, (n + (f == null ? 0 : f.hashCode())) * 31));
            a aVar = this.l;
            int hashCode = (this.m.hashCode() + ((e2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
            String str = this.n;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewParams(isVisible=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", textColor=");
            sb.append(this.c);
            sb.append(", textSize=");
            sb.append(this.d);
            sb.append(", fontResId=");
            sb.append(this.e);
            sb.append(", backgroundColor=");
            sb.append(this.f);
            sb.append(", backgroundImageResId=");
            sb.append(this.g);
            sb.append(", cornerRadius=");
            sb.append(this.h);
            sb.append(", cornerRadiusRatio=");
            sb.append(this.i);
            sb.append(", borderColor=");
            sb.append(this.j);
            sb.append(", borderWidth=");
            sb.append(this.k);
            sb.append(", icon=");
            sb.append(this.l);
            sb.append(", padding=");
            sb.append(this.m);
            sb.append(", backgroundImageUrl=");
            return lnb.q(sb, this.n, ')');
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements View.OnLayoutChangeListener {
        public final /* synthetic */ b a;
        public final /* synthetic */ StatusIndicatorView b;

        public c(b bVar, StatusIndicatorView statusIndicatorView) {
            this.a = bVar;
            this.b = statusIndicatorView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StatusIndicatorView statusIndicatorView = this.b;
            b bVar = this.a;
            view.removeOnLayoutChangeListener(this);
            try {
                float a = tam.a(bVar.h, bVar.i, view.getWidth(), view.getHeight());
                statusIndicatorView.setBackground(tam.b(a, bVar.j, bVar.k, Integer.valueOf(bVar.f)));
                ImageView imageView = statusIndicatorView.getBinding().b;
                imageView.getClass();
                Integer num = bVar.g;
                evl.loadAndCacheImage$default(imageView, bVar.n, num != null ? td4.d0(num.intValue(), statusIndicatorView.getContext()) : null, null, null, false, null, a.c(new u7g(a, a, a, a)), null, null, null, null, 1980, null);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.binding = ypa.b(new deh(12, context, this));
    }

    private final void applyBackground(b params) {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new c(params, this));
            return;
        }
        try {
            float a = tam.a(params.h, params.i, getWidth(), getHeight());
            setBackground(tam.b(a, params.j, params.k, Integer.valueOf(params.f)));
            ImageView imageView = getBinding().b;
            imageView.getClass();
            Integer num = params.g;
            evl.loadAndCacheImage$default(imageView, params.n, num != null ? td4.d0(num.intValue(), getContext()) : null, null, null, false, null, a.c(new u7g(a, a, a, a)), null, null, null, null, 1980, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    private final void applyFontWeight() {
        BlazeTextView blazeTextView = getBinding().d;
        if (Build.VERSION.SDK_INT >= 28) {
            blazeTextView.setTypeface(Typeface.create(blazeTextView.getTypeface(), 600, false));
        } else {
            blazeTextView.setTypeface(blazeTextView.getTypeface(), 1);
        }
    }

    private final void applyIconStyle(b params) {
        b.a aVar = params.l;
        if (aVar == null) {
            ImageView imageView = getBinding().c;
            imageView.getClass();
            evl.q(imageView);
            BlazeTextView blazeTextView = getBinding().d;
            blazeTextView.getClass();
            ViewGroup.LayoutParams layoutParams = blazeTextView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            tl3 tl3Var = (tl3) layoutParams;
            tl3Var.setMarginStart(0);
            blazeTextView.setLayoutParams(tl3Var);
            return;
        }
        ImageView imageView2 = getBinding().c;
        imageView2.getClass();
        evl.u(imageView2);
        imageView2.setImageDrawable(imageView2.getContext().getDrawable(aVar.a));
        Integer num = aVar.b;
        if (num != null) {
            imageView2.setColorFilter(num.intValue());
        } else {
            imageView2.clearColorFilter();
        }
        BlazeTextView blazeTextView2 = getBinding().d;
        blazeTextView2.getClass();
        ViewGroup.LayoutParams layoutParams2 = blazeTextView2.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var2 = (tl3) layoutParams2;
        Context context = getContext();
        context.getClass();
        tl3Var2.setMarginStart(evl.a(context, 4));
        blazeTextView2.setLayoutParams(tl3Var2);
    }

    private final void applyPadding(b params) {
        b.a aVar = params.l;
        BlazeInsets blazeInsets = params.m;
        setPadding(blazeInsets.getStart().subtractNonNegative$blazesdk_release(new BlazeDp(aVar != null ? 2 : 0)).getToPx$blazesdk_release(), blazeInsets.getTop().getToPx$blazesdk_release(), blazeInsets.getEnd().getToPx$blazesdk_release(), blazeInsets.getBottom().getToPx$blazesdk_release());
    }

    private final void applyTextStyle(b params) {
        BlazeTextView blazeTextView = getBinding().d;
        blazeTextView.setText(params.b);
        blazeTextView.setTextSize(params.d);
        blazeTextView.setTextColor(params.c);
        Integer num = params.e;
        if (num == null) {
            applyFontWeight();
            return;
        }
        try {
            blazeTextView.setTypeface(z1g.a(num.intValue(), blazeTextView.getContext()));
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pqm binding_delegate$lambda$0(Context context, StatusIndicatorView statusIndicatorView) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_status_indicator, (ViewGroup) statusIndicatorView, false);
        statusIndicatorView.addView(inflate);
        int i = R.id.blaze_status_indicator_background_image;
        ImageView imageView = (ImageView) nq8.B(R.id.blaze_status_indicator_background_image, inflate);
        if (imageView != null) {
            i = R.id.blaze_status_indicator_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.blaze_status_indicator_icon, inflate);
            if (imageView2 != null) {
                i = R.id.blaze_status_indicator_text;
                BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_status_indicator_text, inflate);
                if (blazeTextView != null) {
                    return new pqm((ConstraintLayout) inflate, imageView, imageView2, blazeTextView);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pqm getBinding() {
        return (pqm) this.binding.getValue();
    }

    public final void setupView(@NotNull b params) {
        params.getClass();
        if (!params.a) {
            setVisibility(8);
            return;
        }
        applyPadding(params);
        applyTextStyle(params);
        applyIconStyle(params);
        applyBackground(params);
        setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ StatusIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
