package spay.sdk.view;

import Ve.InterfaceC4273gh;
import Ve.InterfaceC4639t8;
import Ve.Sh;
import Ve.Yj;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.res.g;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;
import spay.sdk.SPaySdkApp;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lspay/sdk/view/BnplLogoCompositeView;", "Landroid/widget/FrameLayout;", "LVe/t8;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LVe/Sh;", "a", "LVe/Sh;", "getCoilImpl", "()LVe/Sh;", "coilImpl", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BnplLogoCompositeView extends FrameLayout implements InterfaceC4639t8 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Sh coilImpl;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f98862b;

    /* renamed from: c, reason: collision with root package name */
    public final ShimmerFrameLayout f98863c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f98864d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f98865e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplLogoCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // Ve.InterfaceC4639t8
    public Sh getCoilImpl() {
        return this.coilImpl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BnplLogoCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BnplLogoCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BnplLogoCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        this.coilImpl = sdkComponent != null ? ((Yj) sdkComponent).a() : null;
        this.f98864d = g.d(getResources(), R.drawable.spay_ic_bnpl_on, null);
        this.f98865e = g.d(getResources(), R.drawable.spay_ic_bnpl_off, null);
        LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_bnpl_logo, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.spay_iv_bnpl_logo);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<ImageView>(R.id.spay_iv_bnpl_logo)");
        this.f98862b = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.spay_shimmer_fl_bnpl_logo);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<ShimmerFram…er_fl_bnpl_logo\n        )");
        this.f98863c = (ShimmerFrameLayout) findViewById2;
    }
}
