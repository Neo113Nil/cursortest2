package spay.sdk.view;

import B1.C2548q;
import Ve.C4218ek;
import Ve.InterfaceC4273gh;
import Ve.Mg;
import Ve.O7;
import Ve.Oh;
import Ve.Sh;
import Ve.ViewOnClickListenerC4243fg;
import Ve.Yj;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import org.jetbrains.annotations.NotNull;
import spay.sdk.R;
import spay.sdk.SPaySdkApp;
import v5.C10234h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lspay/sdk/view/SpayUserDataCompositeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LVe/Mg;", "data", "", "setClientData", "(LVe/Mg;)V", "Lkotlin/Function1;", "Landroid/view/View;", "callback", "setOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "merchantLogo", "Ljava/lang/String;", "setMerchantLogo", "(Ljava/lang/String;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpayUserDataCompositeView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Oh f98897a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayUserDataCompositeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setMerchantLogo(String str) {
        MerchantLogoCompositeView merchantLogoCompositeView = this.f98897a.f29628b;
        ImageView targetView = merchantLogoCompositeView.f98871b;
        ShimmerFrameLayout shimmerFrame = merchantLogoCompositeView.f98872c;
        Drawable drawable = merchantLogoCompositeView.f98873d;
        Intrinsics.checkNotNullParameter(targetView, "shimmerImageView");
        Intrinsics.checkNotNullParameter(shimmerFrame, "shimmerFrame");
        O7 imageRequestListener = new O7(shimmerFrame, targetView, drawable);
        Sh coilImpl = merchantLogoCompositeView.getCoilImpl();
        Intrinsics.checkNotNullParameter(targetView, "<this>");
        Intrinsics.checkNotNullParameter(imageRequestListener, "imageRequestListener");
        if (coilImpl != null) {
            C4218ek imageRequestBuilder = new C4218ek(imageRequestListener);
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
            C10234h.a aVar = new C10234h.a(coilImpl.f29980a);
            aVar.b(str);
            aVar.h(targetView);
            imageRequestBuilder.invoke(aVar);
            coilImpl.f29981b.a(aVar.a());
        }
    }

    public final void setClientData(@NotNull Mg data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setMerchantLogo(data.f29475a);
    }

    public final void setOnClickListener(@NotNull Function1<? super View, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ShapeableImageView shapeableImageView = this.f98897a.f29629c;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.spayScludIvUserIcon");
        shapeableImageView.setOnClickListener(new ViewOnClickListenerC4243fg(new L(), callback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpayUserDataCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SpayUserDataCompositeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayUserDataCompositeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC4273gh sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        if (sdkComponent != null) {
            ((Yj) sdkComponent).a();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.spay_composite_layout_user_data, (ViewGroup) this, false);
        addView(inflate);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i12 = R.id.spay_sclud_iv_logo;
        MerchantLogoCompositeView merchantLogoCompositeView = (MerchantLogoCompositeView) C2548q.d(i12, inflate);
        if (merchantLogoCompositeView != null) {
            i12 = R.id.spay_sclud_iv_user_icon;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i12, inflate);
            if (shapeableImageView != null) {
                Oh oh2 = new Oh(frameLayout, merchantLogoCompositeView, shapeableImageView);
                Intrinsics.checkNotNullExpressionValue(oh2, "inflate(\n        LayoutI… this,\n        true\n    )");
                this.f98897a = oh2;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }
}
