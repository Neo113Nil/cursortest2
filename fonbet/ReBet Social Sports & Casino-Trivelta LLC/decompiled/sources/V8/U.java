package V8;

import W8.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.fragment.app.Fragment;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import com.plaid.internal.EnumC3631g;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lb.C5444x;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0002\u0013\u0016\u0018\u0000 t2\u00020\u0001:\u0004uvwxB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J+\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u0002002\b\u0010)\u001a\u0004\u0018\u00010(H\u0017¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0002062\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\u0003J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020(H\u0016¢\u0006\u0004\b@\u0010+J\u000f\u0010A\u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\u0003R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R2\u0010a\u001a\u001e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Y0]j\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Y`^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010n\u001a\n k*\u0004\u0018\u00010j0j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010p\u001a\n k*\u0004\u0018\u00010j0j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u0016\u0010s\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006y"}, d2 = {"LV8/U;", "Landroidx/fragment/app/m;", "<init>", "()V", "", "drag", "", "s0", "(F)V", "x0", "w0", "G0", "v0", "u0", "t0", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "E0", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "C0", "V8/U$f", "B0", "()LV8/U$f;", "V8/U$e", "A0", "()LV8/U$e;", "Lcom/giphy/sdk/core/models/Media;", "media", "y0", "(Lcom/giphy/sdk/core/models/Media;)V", "Landroid/view/Window;", "window", "z0", "(Landroid/view/Window;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "", "getTheme", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onPause", "onResume", "outState", "onSaveInstanceState", "onDestroyView", "onDestroy", "LW8/a;", X9.m.f13664a, "LW8/a;", "dialogView", "LV8/U$b;", "n", "LV8/U$b;", "getGifSelectionListener", "()LV8/U$b;", "K0", "(LV8/U$b;)V", "gifSelectionListener", "o", "I", "fullBaseViewHeight", "p", "F", "verticalDrag", "Lcom/giphy/sdk/ui/GPHSettings;", "q", "Lcom/giphy/sdk/ui/GPHSettings;", "giphySettings", "", "r", "Ljava/lang/String;", "giphyApiKey", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "s", "Ljava/util/HashMap;", "metadata", "", "t", "Ljava/lang/Boolean;", "giphyVerificationMode", "LV8/E;", "u", "LV8/E;", "containerView", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "v", "Landroid/animation/ValueAnimator;", "translateAnimator", "w", "openAnimator", C5444x.f55808b, "Z", "gifDelivered", "y", "a", com.google.crypto.tink.integration.android.b.f37029b, "c", W9.d.f13160a, "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGiphyDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiphyDialogFragment.kt\ncom/giphy/sdk/ui/views/GiphyDialogFragment\n+ 2 Extensions.kt\ncom/giphy/sdk/ui/utils/ExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,480:1\n14#2,4:481\n19#2,4:485\n1#3:489\n326#4,4:490\n*S KotlinDebug\n*F\n+ 1 GiphyDialogFragment.kt\ncom/giphy/sdk/ui/views/GiphyDialogFragment\n*L\n130#1:481,4\n133#1:485,4\n213#1:490,4\n*E\n"})
/* loaded from: classes2.dex */
public final class U extends DialogInterfaceOnCancelListenerC2163m {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public W8.a dialogView;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public b gifSelectionListener;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int fullBaseViewHeight;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float verticalDrag;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public GPHSettings giphySettings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public String giphyApiKey;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Boolean giphyVerificationMode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public E containerView;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean gifDelivered;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public HashMap metadata = new HashMap();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator translateAnimator = ValueAnimator.ofFloat(new float[0]);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator openAnimator = ValueAnimator.ofFloat(new float[0]);

    /* renamed from: V8.U$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final U a(GPHSettings settings, String str, Boolean bool, Function3 function3, HashMap metadata) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            O8.k.f8390a.p(function3);
            U u10 = new U();
            Bundle bundle = new Bundle();
            bundle.putParcelable("gph_giphy_settings", settings);
            if (str != null) {
                bundle.putString("gph_giphy_api_key", str);
            }
            if (bool != null) {
                bundle.putBoolean("gph_giphy_verification_mode", bool.booleanValue());
            }
            bundle.putSerializable("gph_giphy_metadata_key", metadata);
            u10.setArguments(bundle);
            return u10;
        }

        public Companion() {
        }
    }

    public interface b {
        void a(Media media, String str, GPHContentType gPHContentType);

        void b(GPHContentType gPHContentType);
    }

    public enum c {
        Search,
        Create
    }

    public enum d {
        OPEN,
        CLOSED
    }

    public static final class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            U.this.dismiss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            U.this.dismiss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    public static final class f implements Animator.AnimatorListener {
        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            W8.a aVar = U.this.dialogView;
            W8.a aVar2 = null;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                aVar = null;
            }
            aVar.setTranslationY(0.0f);
            W8.a aVar3 = U.this.dialogView;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                aVar3 = null;
            }
            ViewGroup.LayoutParams layoutParams = aVar3.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) U.this.verticalDrag;
            W8.a aVar4 = U.this.dialogView;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            } else {
                aVar2 = aVar4;
            }
            aVar2.requestLayout();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            W8.a aVar = U.this.dialogView;
            W8.a aVar2 = null;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                aVar = null;
            }
            aVar.setTranslationY(U.this.fullBaseViewHeight);
            W8.a aVar3 = U.this.dialogView;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            } else {
                aVar2 = aVar3;
            }
            aVar2.setVisibility(0);
        }
    }

    public static final class g implements a.b {
        public g() {
        }

        @Override // W8.a.b
        public void a(Media media, String str, GPHContentType selectedContentType) {
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(selectedContentType, "selectedContentType");
            U.this.y0(media);
        }

        @Override // W8.a.b
        public void b() {
            U.this.v0();
        }

        @Override // W8.a.b
        public void c(GPHContentType selectedContentType) {
            Intrinsics.checkNotNullParameter(selectedContentType, "selectedContentType");
        }

        @Override // W8.a.b
        public void d(String term) {
            Intrinsics.checkNotNullParameter(term, "term");
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1 {
        public h(Object obj) {
            super(1, obj, U.class, "accumulateDrag", "accumulateDrag(F)V", 0);
        }

        public final void a(float f10) {
            ((U) this.receiver).s0(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class i extends FunctionReferenceImpl implements Function0 {
        public i(Object obj) {
            super(0, obj, U.class, "handleDragRelease", "handleDragRelease()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m23invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m23invoke() {
            ((U) this.receiver).G0();
        }
    }

    public /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        public j(Object obj) {
            super(0, obj, U.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m24invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m24invoke() {
            ((U) this.receiver).dismiss();
        }
    }

    public static final void D0(U this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.x0(((Float) animatedValue).floatValue());
    }

    public static final void F0(U this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.w0(((Float) animatedValue).floatValue());
    }

    public static final void H0(U this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        W8.a aVar = this$0.dialogView;
        GPHSettings gPHSettings = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        int height = aVar.getHeight();
        this$0.fullBaseViewHeight = height;
        ValueAnimator valueAnimator = this$0.openAnimator;
        float f10 = height;
        GPHSettings gPHSettings2 = this$0.giphySettings;
        if (gPHSettings2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
        } else {
            gPHSettings = gPHSettings2;
        }
        valueAnimator.setFloatValues(f10, (1.0f - gPHSettings.getTrayHeightMultiplier()) * this$0.fullBaseViewHeight);
        ValueAnimator valueAnimator2 = this$0.openAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public static final F0 I0(View v10, F0 windowInsets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        androidx.core.graphics.e f10 = windowInsets.f(F0.p.g());
        Intrinsics.checkNotNullExpressionValue(f10, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = f10.f19098a;
        marginLayoutParams.topMargin = f10.f19099b;
        marginLayoutParams.rightMargin = f10.f19100c;
        marginLayoutParams.bottomMargin = f10.f19101d;
        v10.setLayoutParams(marginLayoutParams);
        return F0.f19136b;
    }

    public static final void J0(U this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public final e A0() {
        return new e();
    }

    public final f B0() {
        return new f();
    }

    public final ValueAnimator.AnimatorUpdateListener C0() {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: V8.T
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                U.D0(U.this, valueAnimator);
            }
        };
    }

    public final ValueAnimator.AnimatorUpdateListener E0() {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: V8.S
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                U.F0(U.this, valueAnimator);
            }
        };
    }

    public final void G0() {
        GPHSettings gPHSettings = this.giphySettings;
        if (gPHSettings == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
            gPHSettings = null;
        }
        float trayHeightMultiplier = 1.0f - gPHSettings.getTrayHeightMultiplier();
        float f10 = ((1.0f - trayHeightMultiplier) / 2) + trayHeightMultiplier;
        float f11 = this.verticalDrag;
        int i10 = this.fullBaseViewHeight;
        if (f11 < i10 * trayHeightMultiplier) {
            v0();
            return;
        }
        if (f11 >= trayHeightMultiplier * i10 && f11 < i10 * f10) {
            u0();
        } else if (f11 >= f10 * i10) {
            t0();
        }
    }

    public final void K0(b bVar) {
        this.gifSelectionListener = bVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public int getTheme() {
        return O8.v.f8567a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.gifSelectionListener == null) {
            b bVar = context instanceof b ? (b) context : null;
            if (bVar != null) {
                this.gifSelectionListener = bVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        GPHSettings gPHSettings;
        GPHSettings gPHSettings2;
        Object obj;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(savedInstanceState);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate ");
        sb2.append(hashCode());
        sb2.append(' ');
        sb2.append(savedInstanceState != null ? Boolean.valueOf(savedInstanceState.getBoolean("key_screen_change")) : null);
        timber.log.a.a(sb2.toString(), new Object[0]);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("gph_giphy_settings", GPHSettings.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("gph_giphy_settings");
                if (!(parcelable3 instanceof GPHSettings)) {
                    parcelable3 = null;
                }
                parcelable = (GPHSettings) parcelable3;
            }
            gPHSettings = (GPHSettings) parcelable;
        }
        gPHSettings = new GPHSettings(null, null, false, false, null, null, null, null, false, 0, null, false, false, false, false, null, false, 0.0f, false, false, 1048575, null);
        this.giphySettings = gPHSettings;
        Bundle arguments2 = getArguments();
        this.giphyApiKey = arguments2 != null ? arguments2.getString("gph_giphy_api_key") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = arguments3.getSerializable("gph_giphy_metadata_key", HashMap.class);
            } else {
                Object serializable = arguments3.getSerializable("gph_giphy_metadata_key");
                if (!(serializable instanceof HashMap)) {
                    serializable = null;
                }
                obj = (HashMap) serializable;
            }
            HashMap hashMap = (HashMap) obj;
            if (hashMap != null) {
                this.metadata = hashMap;
            }
        }
        String str = this.giphyApiKey;
        if (str != null) {
            Bundle arguments4 = getArguments();
            this.giphyVerificationMode = arguments4 != null ? Boolean.valueOf(arguments4.getBoolean("gph_giphy_verification_mode")) : null;
            O8.k kVar = O8.k.f8390a;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            Boolean bool = this.giphyVerificationMode;
            O8.k.c(kVar, requireContext, str, bool != null ? bool.booleanValue() : false, this.metadata, null, 16, null);
        }
        O8.k kVar2 = O8.k.f8390a;
        GPHSettings gPHSettings3 = this.giphySettings;
        if (gPHSettings3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
            gPHSettings3 = null;
        }
        kVar2.o(gPHSettings3.getTheme().b(getContext()));
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        W8.a aVar = new W8.a(requireContext2, null, 0, 6, null);
        GPHSettings gPHSettings4 = this.giphySettings;
        if (gPHSettings4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
            gPHSettings2 = null;
        } else {
            gPHSettings2 = gPHSettings4;
        }
        W8.n.i(aVar, gPHSettings2, this.giphyApiKey, this.giphyVerificationMode, kVar2.i(), this.metadata);
        aVar.setListener(new g());
        this.dialogView = aVar;
        this.translateAnimator.addUpdateListener(E0());
        this.translateAnimator.setDuration(150L);
        this.openAnimator.setDuration(200L);
        this.openAnimator.addUpdateListener(C0());
        this.openAnimator.addListener(B0());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Window window;
        Dialog dialog = new Dialog(requireActivity(), getTheme());
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: V8.Q
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                U.H0(U.this, dialogInterface);
            }
        });
        GPHSettings gPHSettings = this.giphySettings;
        if (gPHSettings == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
            gPHSettings = null;
        }
        if (gPHSettings.getEnableEdgeToEdge() && (window = dialog.getWindow()) != null) {
            z0(window);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        E e10 = new E(requireContext, null, 0, 6, null);
        this.containerView = e10;
        W8.a aVar = this.dialogView;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        e10.addView(aVar, -1, -1);
        E e11 = this.containerView;
        if (e11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e11 = null;
        }
        W8.a aVar2 = this.dialogView;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar2 = null;
        }
        e11.setDragView(aVar2.getSearchBarContainer$giphy_ui_2_3_17_release());
        E e12 = this.containerView;
        if (e12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e12 = null;
        }
        W8.a aVar3 = this.dialogView;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar3 = null;
        }
        e12.setSlideView(aVar3.getBaseView$giphy_ui_2_3_17_release());
        E e13 = this.containerView;
        if (e13 != null) {
            return e13;
        }
        Intrinsics.throwUninitializedPropertyAccessException("containerView");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.gifSelectionListener = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        timber.log.a.a("onDestroyView", new Object[0]);
        this.openAnimator.cancel();
        this.openAnimator.removeAllUpdateListeners();
        this.openAnimator.removeAllListeners();
        E e10 = this.containerView;
        if (e10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e10 = null;
        }
        e10.removeAllViews();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        b bVar;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.gifDelivered && (bVar = this.gifSelectionListener) != null) {
            W8.a aVar = this.dialogView;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                aVar = null;
            }
            bVar.b(aVar.getContentType$giphy_ui_2_3_17_release());
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        W8.a aVar = this.dialogView;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        U8.b videoPlayer$giphy_ui_2_3_17_release = aVar.getVideoPlayer$giphy_ui_2_3_17_release();
        if (videoPlayer$giphy_ui_2_3_17_release != null) {
            videoPlayer$giphy_ui_2_3_17_release.o();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        W8.a aVar = this.dialogView;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        U8.b videoPlayer$giphy_ui_2_3_17_release = aVar.getVideoPlayer$giphy_ui_2_3_17_release();
        if (videoPlayer$giphy_ui_2_3_17_release != null) {
            videoPlayer$giphy_ui_2_3_17_release.p();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        timber.log.a.a("onSaveInstanceState", new Object[0]);
        outState.putBoolean("key_screen_change", true);
        W8.a aVar = this.dialogView;
        GPHSettings gPHSettings = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        outState.putParcelable("key_media_type", aVar.getContentType$giphy_ui_2_3_17_release());
        GPHSettings gPHSettings2 = this.giphySettings;
        if (gPHSettings2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
            gPHSettings2 = null;
        }
        W8.a aVar2 = this.dialogView;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar2 = null;
        }
        gPHSettings2.m0(aVar2.getContentType$giphy_ui_2_3_17_release());
        GPHSettings gPHSettings3 = this.giphySettings;
        if (gPHSettings3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
        } else {
            gPHSettings = gPHSettings3;
        }
        outState.putParcelable("gph_giphy_settings", gPHSettings);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        W8.a aVar = this.dialogView;
        E e10 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        W8.n.f(aVar, view);
        E e11 = this.containerView;
        if (e11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e11 = null;
        }
        AbstractC2082d0.x0(e11, new androidx.core.view.J() { // from class: V8.O
            @Override // androidx.core.view.J
            public final F0 f(View view2, F0 f02) {
                F0 I02;
                I02 = U.I0(view2, f02);
                return I02;
            }
        });
        E e12 = this.containerView;
        if (e12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e12 = null;
        }
        e12.setDragAccumulator(new h(this));
        E e13 = this.containerView;
        if (e13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e13 = null;
        }
        e13.setDragRelease(new i(this));
        E e14 = this.containerView;
        if (e14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
            e14 = null;
        }
        e14.setTouchOutside(new j(this));
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(19);
        }
        E e15 = this.containerView;
        if (e15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("containerView");
        } else {
            e10 = e15;
        }
        e10.setOnClickListener(new View.OnClickListener() { // from class: V8.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                U.J0(U.this, view2);
            }
        });
    }

    public final void s0(float drag) {
        timber.log.a.a("accumulateDrag " + drag, new Object[0]);
        float f10 = this.verticalDrag + drag;
        this.verticalDrag = f10;
        float max = Math.max(f10, 0.0f);
        this.verticalDrag = max;
        w0(max);
    }

    public final void t0() {
        timber.log.a.a("animateToClose", new Object[0]);
        this.translateAnimator.setFloatValues(this.verticalDrag, this.fullBaseViewHeight);
        this.translateAnimator.addListener(A0());
        this.translateAnimator.start();
    }

    public final void u0() {
        timber.log.a.a("animateToHalf", new Object[0]);
        ValueAnimator valueAnimator = this.translateAnimator;
        float f10 = this.verticalDrag;
        GPHSettings gPHSettings = this.giphySettings;
        if (gPHSettings == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
            gPHSettings = null;
        }
        valueAnimator.setFloatValues(f10, (1.0f - gPHSettings.getTrayHeightMultiplier()) * this.fullBaseViewHeight);
        this.translateAnimator.start();
    }

    public final void v0() {
        timber.log.a.a("animateToOpen", new Object[0]);
        this.translateAnimator.setFloatValues(this.verticalDrag, 0.0f);
        this.translateAnimator.start();
    }

    public final void w0(float drag) {
        W8.a aVar = null;
        if (this.fullBaseViewHeight == 0) {
            W8.a aVar2 = this.dialogView;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                aVar2 = null;
            }
            this.fullBaseViewHeight = aVar2.getHeight();
        }
        this.verticalDrag = drag;
        W8.a aVar3 = this.dialogView;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar3 = null;
        }
        ViewGroup.LayoutParams layoutParams = aVar3.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) this.verticalDrag;
        W8.a aVar4 = this.dialogView;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
        } else {
            aVar = aVar4;
        }
        aVar.requestLayout();
    }

    public final void x0(float drag) {
        this.verticalDrag = drag;
        W8.a aVar = this.dialogView;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogView");
            aVar = null;
        }
        aVar.setTranslationY(drag);
    }

    public final void y0(Media media) {
        O8.k.f8390a.g().a(media);
        GPHSettings gPHSettings = null;
        media.setBottleData(null);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            Intent intent = new Intent();
            intent.putExtra("gph_media", media);
            W8.a aVar = this.dialogView;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                aVar = null;
            }
            intent.putExtra("gph_search_term", aVar.getQuery$giphy_ui_2_3_17_release());
            targetFragment.onActivityResult(getTargetRequestCode(), -1, intent);
        } else {
            b bVar = this.gifSelectionListener;
            if (bVar != null) {
                W8.a aVar2 = this.dialogView;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                    aVar2 = null;
                }
                String query$giphy_ui_2_3_17_release = aVar2.getQuery$giphy_ui_2_3_17_release();
                W8.a aVar3 = this.dialogView;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialogView");
                    aVar3 = null;
                }
                bVar.a(media, query$giphy_ui_2_3_17_release, aVar3.getContentType$giphy_ui_2_3_17_release());
            }
        }
        this.gifDelivered = true;
        GPHSettings gPHSettings2 = this.giphySettings;
        if (gPHSettings2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
        } else {
            gPHSettings = gPHSettings2;
        }
        if (gPHSettings.getAutoCloseOnMediaSelect()) {
            dismiss();
        }
    }

    public final void z0(Window window) {
        boolean z10 = (requireContext().getResources().getConfiguration().uiMode & 48) == 32;
        AbstractC2109r0.b(window, false);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(i10 < 29 ? (i10 < 26 || z10) ? Color.argb(128, 27, 27, 27) : Color.argb(EnumC3631g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 255, 255, 255) : 0);
        window.setNavigationBarColor(O8.k.f8390a.h().a());
        if (i10 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i10 >= 30 ? 3 : 1;
        }
        AbstractActivityC2168s activity = getActivity();
        Window window2 = activity != null ? activity.getWindow() : null;
        if (window2 == null) {
            return;
        }
        h1 h1Var = new h1(window2, window2.getDecorView());
        h1 h1Var2 = new h1(window, window.getDecorView());
        h1Var2.e(h1Var.c());
        h1Var2.d(!z10);
    }
}
