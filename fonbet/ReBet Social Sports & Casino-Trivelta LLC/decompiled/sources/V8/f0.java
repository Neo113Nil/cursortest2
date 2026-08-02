package V8;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.AbstractC2071a;
import androidx.core.graphics.EnumC2072b;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.ui.views.GifView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class f0 extends PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12721a;

    /* renamed from: b, reason: collision with root package name */
    public User f12722b;

    /* renamed from: c, reason: collision with root package name */
    public P8.g f12723c;

    /* renamed from: d, reason: collision with root package name */
    public l0 f12724d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f12725e;

    public static final class a extends BottomSheetBehavior.g {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 5) {
                f0.this.dismiss();
            }
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f12727d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m27invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
        }
    }

    public f0(Context context, User user) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f12721a = context;
        this.f12722b = user;
        this.f12725e = b.f12727d;
        setContentView(View.inflate(context, O8.t.f8542m, null));
        this.f12723c = P8.g.a(getContentView());
        setWidth(-1);
        setHeight(-1);
        setOverlapAnchor(true);
        setOutsideTouchable(true);
        h();
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: V8.c0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                f0.d(f0.this);
            }
        });
    }

    public static final void d(f0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    public static final void g(f0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        P8.g e10 = this$0.e();
        e10.f8876d.setMaxLines(Integer.MAX_VALUE);
        BottomSheetBehavior.q0(e10.f8874b).X0(e10.f8874b.getHeight());
        BottomSheetBehavior.q0(e10.f8874b).c1(3);
    }

    public static final void i(f0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public final P8.g e() {
        P8.g gVar = this.f12723c;
        Intrinsics.checkNotNull(gVar);
        return gVar;
    }

    public final void f() {
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(e().f8874b);
        Intrinsics.checkNotNullExpressionValue(q02, "from(binding.body)");
        q02.c0(new a());
        getContentView().postDelayed(new Runnable() { // from class: V8.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.g(f0.this);
            }
        }, 100L);
    }

    public final void h() {
        View contentView = getContentView();
        O8.k kVar = O8.k.f8390a;
        contentView.setBackgroundColor(kVar.h().g());
        this.f12724d = new l0(this.f12721a, this.f12722b);
        P8.g e10 = e();
        e10.f8874b.getBackground().setColorFilter(AbstractC2071a.a(kVar.h().a(), EnumC2072b.SRC_ATOP));
        e10.f8881i.setTextColor(kVar.h().w());
        e10.f8877e.setTextColor(kVar.h().w());
        e10.f8876d.setTextColor(kVar.h().f());
        l0 l0Var = this.f12724d;
        l0 l0Var2 = null;
        if (l0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileLoader");
            l0Var = null;
        }
        TextView userName = e10.f8881i;
        Intrinsics.checkNotNullExpressionValue(userName, "userName");
        TextView channelName = e10.f8877e;
        Intrinsics.checkNotNullExpressionValue(channelName, "channelName");
        ImageView verifiedBadge = e10.f8882j;
        Intrinsics.checkNotNullExpressionValue(verifiedBadge, "verifiedBadge");
        GifView userChannelGifAvatar = e10.f8880h;
        Intrinsics.checkNotNullExpressionValue(userChannelGifAvatar, "userChannelGifAvatar");
        l0Var.i(userName, channelName, verifiedBadge, userChannelGifAvatar);
        l0 l0Var3 = this.f12724d;
        if (l0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileLoader");
        } else {
            l0Var2 = l0Var3;
        }
        TextView channelDescription = e10.f8876d;
        Intrinsics.checkNotNullExpressionValue(channelDescription, "channelDescription");
        TextView websiteUrl = e10.f8883k;
        Intrinsics.checkNotNullExpressionValue(websiteUrl, "websiteUrl");
        LinearLayout socialContainer = e10.f8879g;
        Intrinsics.checkNotNullExpressionValue(socialContainer, "socialContainer");
        l0Var2.j(channelDescription, websiteUrl, socialContainer);
        e10.f8878f.setOnClickListener(new View.OnClickListener() { // from class: V8.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.i(f0.this, view);
            }
        });
        f();
    }

    public final void j() {
        this.f12723c = null;
        this.f12725e.invoke();
    }
}
