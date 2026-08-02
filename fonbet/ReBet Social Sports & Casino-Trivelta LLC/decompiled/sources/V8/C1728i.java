package V8;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.core.graphics.AbstractC2074d;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.views.GifView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: V8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1728i {

    /* renamed from: r, reason: collision with root package name */
    public static final a f12733r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public Context f12734a;

    /* renamed from: b, reason: collision with root package name */
    public PopupWindow f12735b;

    /* renamed from: c, reason: collision with root package name */
    public int f12736c;

    /* renamed from: d, reason: collision with root package name */
    public int f12737d;

    /* renamed from: e, reason: collision with root package name */
    public View f12738e;

    /* renamed from: f, reason: collision with root package name */
    public View f12739f;

    /* renamed from: g, reason: collision with root package name */
    public List f12740g;

    /* renamed from: h, reason: collision with root package name */
    public List f12741h;

    /* renamed from: l, reason: collision with root package name */
    public int f12745l;

    /* renamed from: m, reason: collision with root package name */
    public int f12746m;

    /* renamed from: i, reason: collision with root package name */
    public int f12742i = -5855578;

    /* renamed from: j, reason: collision with root package name */
    public int f12743j = -11645362;

    /* renamed from: k, reason: collision with root package name */
    public int f12744k = -11645362;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f12747n = e.f12762d;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f12748o = d.f12761d;

    /* renamed from: p, reason: collision with root package name */
    public Function0 f12749p = f.f12763d;

    /* renamed from: q, reason: collision with root package name */
    public Function0 f12750q = c.f12760d;

    /* renamed from: V8.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: V8.i$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f12760d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
        }
    }

    /* renamed from: V8.i$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f12763d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
        }
    }

    public static final boolean f(C1728i this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n();
        return false;
    }

    public static final void g(C1728i this$0, int i10, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f12747n;
        List list = this$0.f12740g;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emojiList");
            list = null;
        }
        function1.invoke(list.get(i10));
        this$0.n();
    }

    public static final boolean h(C1728i this$0, int i10, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1 function1 = this$0.f12748o;
        List list = this$0.f12740g;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emojiList");
            list = null;
        }
        function1.invoke(list.get(i10));
        return true;
    }

    public static final void i(C1728i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i10, int i11) {
        float f10;
        Context context;
        Context context2;
        Context context3;
        int i12;
        if (this.f12735b != null) {
            return;
        }
        this.f12741h = new ArrayList();
        Context context4 = this.f12734a;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context4 = null;
        }
        LinearLayout linearLayout = new LinearLayout(context4);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        Context context5 = this.f12734a;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context5 = null;
        }
        LinearLayout linearLayout2 = new LinearLayout(context5);
        linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: V8.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean f11;
                f11 = C1728i.f(C1728i.this, view, motionEvent);
                return f11;
            }
        });
        List list = this.f12740g;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emojiList");
            list = null;
        }
        int size = list.size();
        for (final int i13 = 0; i13 < size; i13++) {
            Context context6 = this.f12734a;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context3 = null;
            } else {
                context3 = context6;
            }
            GifView gifView = new GifView(context3, null, 0, 6, null);
            List list2 = this.f12741h;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emojiViewList");
                list2 = null;
            }
            list2.add(gifView);
            gifView.setOnClickListener(new View.OnClickListener() { // from class: V8.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1728i.g(C1728i.this, i13, view);
                }
            });
            gifView.setOnLongClickListener(new View.OnLongClickListener() { // from class: V8.g
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean h10;
                    h10 = C1728i.h(C1728i.this, i13, view);
                    return h10;
                }
            });
            List list3 = this.f12740g;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emojiList");
                list3 = null;
            }
            GifView.z(gifView, (Media) list3.get(i13), RenditionType.fixedWidth, null, 4, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f12736c, this.f12737d);
            List list4 = this.f12740g;
            if (list4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emojiList");
                list4 = null;
            }
            int i14 = list4.size() == 1 ? 2 : 1;
            if (i13 == 0) {
                int a10 = (U8.f.a(5) * i14) + U8.f.a(5);
                i12 = 0;
                int a11 = U8.f.a(8);
                int a12 = U8.f.a(5) * i14;
                List list5 = this.f12740g;
                if (list5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emojiList");
                    list5 = null;
                }
                layoutParams.setMargins(a10, a11, a12 + (list5.size() == 1 ? U8.f.a(5) : 0), this.f12737d / 2);
            } else {
                i12 = 0;
                List list6 = this.f12740g;
                if (list6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emojiList");
                    list6 = null;
                }
                if (i13 == list6.size() - 1) {
                    layoutParams.setMargins(U8.f.a(5) * i14, U8.f.a(8), (U8.f.a(5) * i14) + U8.f.a(5), this.f12737d / 2);
                } else {
                    layoutParams.setMargins(U8.f.a(5) * i14, U8.f.a(8), U8.f.a(5) * i14, this.f12737d / 2);
                }
            }
            gifView.setLayoutParams(layoutParams);
            linearLayout2.addView(gifView);
            List list7 = this.f12740g;
            if (list7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emojiList");
                list7 = null;
            }
            if (list7.size() > 1 && i13 == 0) {
                Context context7 = this.f12734a;
                if (context7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context7 = null;
                }
                View view = new View(context7);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(U8.f.a(2), this.f12737d);
                layoutParams2.gravity = 17;
                layoutParams2.setMargins(U8.f.a(4), (-((this.f12737d / 2) - U8.f.a(8))) / 2, U8.f.a(4), U8.f.a(i12));
                view.setLayoutParams(layoutParams2);
                view.setBackgroundColor(this.f12742i);
                linearLayout2.addView(view);
            }
        }
        Rect m10 = m(linearLayout2);
        int width = m10.width();
        this.f12745l = width;
        if (width > j().width()) {
            this.f12745l = j().width() - U8.f.a(10);
        }
        Context context8 = this.f12734a;
        if (context8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context8 = null;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context8);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        float f11 = this.f12736c * 0.4f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(this.f12745l, -1);
        int i15 = (int) f11;
        int i16 = (-i15) / 4;
        layoutParams3.setMargins(i16, 0, i16, 0);
        horizontalScrollView.setLayoutParams(layoutParams3);
        horizontalScrollView.addView(linearLayout2);
        horizontalScrollView.setBackgroundColor(0);
        Context context9 = this.f12734a;
        if (context9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context9 = null;
        }
        LinearLayout linearLayout3 = new LinearLayout(context9);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
        int i17 = i15 / 4;
        layoutParams4.setMargins(i17, 0, i17, 0);
        linearLayout3.setLayoutParams(layoutParams4);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout3.addView(horizontalScrollView);
        linearLayout.addView(linearLayout3);
        Context context10 = this.f12734a;
        if (context10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context10 = null;
        }
        this.f12739f = new View(context10);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.f12736c, this.f12737d);
        layoutParams5.gravity = 17;
        View view2 = this.f12739f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorPlaceHolderView");
            view2 = null;
        }
        view2.setLayoutParams(layoutParams5);
        View view3 = this.f12739f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorPlaceHolderView");
            view3 = null;
        }
        linearLayout.addView(view3);
        this.f12746m = m10.height() + this.f12737d;
        float f12 = i10;
        int i18 = this.f12745l;
        if (f12 >= i18 / 2.0f) {
            if (i11 - i10 < i18 / 2.0f) {
                f12 += (i18 / 2.0f) - i11;
                if (i18 > i11) {
                    f10 = i18 - i11;
                }
            } else {
                f12 = 0.0f;
            }
            float f13 = this.f12736c * 1.35f;
            context = this.f12734a;
            if (context != null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            } else {
                context2 = context;
            }
            float f14 = 2;
            linearLayout.setBackground(k(m10.width(), m10.height(), l(this.f12745l, (m10.height() - (this.f12737d / 2)) + U8.f.a(8), f12 + (((this.f12745l + f13) + f11) / f14), f13, context2.getResources().getConfiguration().orientation != 2 ? this.f12737d : 0.0f, f11, 0.0f, U8.f.a(4)), null, Float.valueOf(f11 / f14), this.f12743j, this.f12744k));
            linearLayout.setClipChildren(true);
            PopupWindow popupWindow = new PopupWindow((View) linearLayout, this.f12745l, this.f12746m, true);
            this.f12735b = popupWindow;
            Intrinsics.checkNotNull(popupWindow);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: V8.h
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C1728i.i(C1728i.this);
                }
            });
        }
        f10 = i18 / 2.0f;
        f12 -= f10;
        float f132 = this.f12736c * 1.35f;
        context = this.f12734a;
        if (context != null) {
        }
        if (context2.getResources().getConfiguration().orientation != 2) {
        }
        float f142 = 2;
        linearLayout.setBackground(k(m10.width(), m10.height(), l(this.f12745l, (m10.height() - (this.f12737d / 2)) + U8.f.a(8), f12 + (((this.f12745l + f132) + f11) / f142), f132, context2.getResources().getConfiguration().orientation != 2 ? this.f12737d : 0.0f, f11, 0.0f, U8.f.a(4)), null, Float.valueOf(f11 / f142), this.f12743j, this.f12744k));
        linearLayout.setClipChildren(true);
        PopupWindow popupWindow2 = new PopupWindow((View) linearLayout, this.f12745l, this.f12746m, true);
        this.f12735b = popupWindow2;
        Intrinsics.checkNotNull(popupWindow2);
        popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: V8.h
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C1728i.i(C1728i.this);
            }
        });
    }

    public final Rect j() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i10;
        int i11;
        Rect bounds2;
        Context context = this.f12734a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "wm.currentWindowMetrics");
        windowInsets = currentWindowMetrics.getWindowInsets();
        systemBars = WindowInsets.Type.systemBars();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…Insets.Type.systemBars())");
        bounds = currentWindowMetrics.getBounds();
        int width = bounds.width();
        i10 = insetsIgnoringVisibility.left;
        i11 = insetsIgnoringVisibility.right;
        bounds2 = currentWindowMetrics.getBounds();
        return new Rect(0, 0, (width - i10) - i11, bounds2.height());
    }

    public final Drawable k(int i10, int i11, Path path, Path path2, Float f10, int i12, int i13) {
        return new b(path2, new Paint(), i11, i12, i13, f10, path, new Paint(), i10);
    }

    public final Path l(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        Path path = new Path();
        float f18 = f15 + f17;
        path.moveTo(f18, f16);
        float f19 = (f10 - f15) - f17;
        path.lineTo(f19, f16);
        float f20 = f10 - f17;
        float f21 = f15 + f16;
        path.quadTo(f20, f16, f20, f21);
        float f22 = (f11 - f15) + f16;
        path.lineTo(f20, f22);
        if (f14 == 0.0f) {
            float f23 = f11 + f16;
            path.quadTo(f20, f23, f19, f23);
            path.lineTo(f12, f23);
            path.lineTo(f18, f23);
            float f24 = f17 + 0.0f;
            path.quadTo(f24, f23, f24, f22);
            path.lineTo(f24, f21);
            path.quadTo(f24, f16, f18, f16);
            path.close();
            return path;
        }
        float f25 = ((f10 - f12) + f15) - f17;
        if (f25 > f15) {
            float f26 = f11 + f16;
            path.quadTo(f20, f26, f19, f26);
            path.lineTo(f12, f26);
            float f27 = f12 - f15;
            path.quadTo(f27, f26, f27, f11 + f15 + f16);
        } else if (f25 <= f15 * 1.1f) {
            float f28 = f11 + f16;
            float f29 = f12 - f15;
            path.cubicTo(f20, f28, f29, f28, f29, f11 + f15 + f16);
        } else {
            float f30 = f11 + f16;
            path.quadTo(f20, f30, f12 - (f15 / 2), f30);
            float f31 = f12 - f15;
            path.quadTo(f31, f30, f31, f11 + f15 + f16);
        }
        float f32 = f12 - f15;
        float f33 = f11 + f14;
        float f34 = (f33 - f15) + f16;
        path.lineTo(f32, f34);
        float f35 = f33 + f16;
        path.quadTo(f32, f35, f32 - f15, f35);
        path.lineTo((f12 + f15) - f13, f35);
        float f36 = f12 - f13;
        path.quadTo(f36, f35, f36, f34);
        path.lineTo(f36, f11 + f15 + f16);
        float f37 = 2;
        float f38 = f36 - (f15 / f37);
        if (f38 >= f15) {
            float f39 = f11 + f16;
            path.quadTo(f36, f39, f36 - f15, f39);
            path.lineTo(f18, f39);
            float f40 = f17 + 0.0f;
            path.quadTo(f40, f39, f40, f22);
        } else if (f38 <= f15 * 1.1f) {
            float f41 = f11 + f16;
            float f42 = f17 + 0.0f;
            path.cubicTo(f36, f41, f42, f41, f42, f22);
        } else {
            float f43 = f11 + f16;
            path.quadTo(f36, f43, f36 / f37, f43);
            float f44 = f17 + 0.0f;
            path.quadTo(f44, f43, f44, f22);
        }
        float f45 = f17 + 0.0f;
        path.lineTo(f45, f21);
        path.quadTo(f45, f16, f18, f16);
        path.close();
        return path;
    }

    public final Rect m(View view) {
        if (view == null) {
            return new Rect(0, 0, 0, 0);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void n() {
        this.f12750q.invoke();
        PopupWindow popupWindow = this.f12735b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f12735b = null;
    }

    public final void o(Context context, View anchorView, int i10, int i11, int i12, int i13, int i14, List emojiList, Function0 onShown, Function0 onClosed, Function1 onEmojiSelected, Function1 onEmojiPressed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(emojiList, "emojiList");
        Intrinsics.checkNotNullParameter(onShown, "onShown");
        Intrinsics.checkNotNullParameter(onClosed, "onClosed");
        Intrinsics.checkNotNullParameter(onEmojiSelected, "onEmojiSelected");
        Intrinsics.checkNotNullParameter(onEmojiPressed, "onEmojiPressed");
        this.f12734a = context;
        this.f12738e = anchorView;
        this.f12736c = i10;
        this.f12737d = i11;
        this.f12743j = i13;
        this.f12744k = i14;
        this.f12742i = i12;
        this.f12749p = onShown;
        this.f12750q = onClosed;
        this.f12747n = onEmojiSelected;
        this.f12748o = onEmojiPressed;
        this.f12740g = emojiList;
    }

    public final void p() {
        int[] iArr = new int[2];
        View view = this.f12738e;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorView");
            view = null;
        }
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = (int) (i10 + (this.f12736c / 2));
        int i12 = (int) (iArr[1] + this.f12737d);
        e(i11, j().width());
        PopupWindow popupWindow = this.f12735b;
        Intrinsics.checkNotNull(popupWindow);
        View view3 = this.f12738e;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("anchorView");
        } else {
            view2 = view3;
        }
        popupWindow.showAtLocation(view2, 17, i11 - (j().width() / 2), ((i12 - (j().height() / 2)) - this.f12746m) + ((int) (this.f12737d * 1.75f)));
        this.f12749p.invoke();
    }

    public final void q(List emojiList) {
        Intrinsics.checkNotNullParameter(emojiList, "emojiList");
        List list = this.f12740g;
        List list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emojiList");
            list = null;
        }
        if (list.size() != emojiList.size()) {
            return;
        }
        this.f12740g = emojiList;
        List list3 = this.f12741h;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emojiViewList");
        } else {
            list2 = list3;
        }
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            GifView gifView = (GifView) obj;
            if (i10 > 0 && i10 < emojiList.size()) {
                GifView.z(gifView, (Media) emojiList.get(i10), RenditionType.fixedWidth, null, 4, null);
            }
            i10 = i11;
        }
    }

    /* renamed from: V8.i$b */
    public static final class b extends Drawable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Path f12751a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Paint f12752b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12753c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f12754d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f12755e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Float f12756f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Path f12757g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Paint f12758h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f12759i;

        public b(Path path, Paint paint, int i10, int i11, int i12, Float f10, Path path2, Paint paint2, int i13) {
            this.f12751a = path;
            this.f12752b = paint;
            this.f12753c = i10;
            this.f12754d = i11;
            this.f12755e = i12;
            this.f12756f = f10;
            this.f12757g = path2;
            this.f12758h = paint2;
            this.f12759i = i13;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Path path = this.f12751a;
            if (path != null) {
                Paint paint = this.f12758h;
                int i10 = this.f12753c;
                int i11 = this.f12755e;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i10, AbstractC2074d.k(i11, 255), AbstractC2074d.k(i11, 34), Shader.TileMode.MIRROR));
                paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.NORMAL));
                canvas.drawPath(path, paint);
            }
            this.f12752b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f12752b.setStrokeWidth(1.0f);
            this.f12752b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f12753c, this.f12754d, this.f12755e, Shader.TileMode.CLAMP));
            Float f10 = this.f12756f;
            if (f10 != null) {
                this.f12752b.setShadowLayer(f10.floatValue(), 0.0f, 0.0f, -7829368);
            }
            canvas.drawPath(this.f12757g, this.f12752b);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f12753c;
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f12759i;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: V8.i$d */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f12761d = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }

        public final void a(Media media) {
        }
    }

    /* renamed from: V8.i$e */
    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f12762d = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }

        public final void a(Media media) {
        }
    }
}
