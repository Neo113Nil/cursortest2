package io.sentry.android.replay.viewhierarchy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.P2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import io.sentry.android.replay.util.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@SuppressLint({"UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f67714a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67715b;

    /* renamed from: c, reason: collision with root package name */
    private final float f67716c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f67717d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f67718e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f67719f;

    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
        
            if (kotlin.text.h.t(r3, "sentry-unmask", false) == true) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ec, code lost:
        
            if (kotlin.text.h.t(r9, "sentry-mask", false) == true) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static b a(@NotNull View view, b bVar, @NotNull P2 options) {
            Pair pair;
            boolean z11;
            boolean z12;
            boolean z13;
            Bitmap bitmap;
            int extendedPaddingTop;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!view.isAttachedToWindow()) {
                pair = new Pair(Boolean.FALSE, null);
            } else if (view.getWindowVisibility() != 0) {
                pair = new Pair(Boolean.FALSE, null);
            } else {
                Object obj = view;
                while (obj instanceof View) {
                    float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) obj).getTransitionAlpha() : 1.0f;
                    View view2 = (View) obj;
                    if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                        pair = new Pair(Boolean.FALSE, null);
                        break;
                    }
                    obj = view2.getParent();
                }
                Rect rect = new Rect();
                pair = new Pair(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
            }
            boolean booleanValue = ((Boolean) pair.a()).booleanValue();
            Rect rect2 = (Rect) pair.b();
            if (booleanValue) {
                Object tag = view.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if (str != null) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                    }
                }
                if (!Intrinsics.d(view.getTag(R.id.sentry_privacy), "unmask")) {
                    Object tag2 = view.getTag();
                    String str2 = tag2 instanceof String ? (String) tag2 : null;
                    if (str2 != null) {
                        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (lowerCase2 != null) {
                        }
                    }
                    if (!Intrinsics.d(view.getTag(R.id.sentry_privacy), FormPageDTO.Field.FIELD_TYPE_MASK)) {
                        options.getClass();
                        if (view.getParent() != null) {
                            Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                        }
                        Class<?> cls = view.getClass();
                        CopyOnWriteArraySet c11 = options.c();
                        Intrinsics.checkNotNullExpressionValue(c11, "getUnmaskViewClasses(...)");
                        while (true) {
                            if (cls == null) {
                                CopyOnWriteArraySet b11 = options.b();
                                Intrinsics.checkNotNullExpressionValue(b11, "getMaskViewClasses(...)");
                                for (Class<?> cls2 = view.getClass(); cls2 != null; cls2 = cls2.getSuperclass()) {
                                    if (!b11.contains(cls2.getName())) {
                                    }
                                }
                            } else {
                                if (c11.contains(cls.getName())) {
                                    break;
                                }
                                cls = cls.getSuperclass();
                            }
                        }
                    }
                    options.f();
                    z11 = true;
                    if (!(view instanceof TextView)) {
                        TextView textView = (TextView) view;
                        Layout layout = textView.getLayout();
                        io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
                        int currentTextColor = textView.getCurrentTextColor() | (-16777216);
                        int totalPaddingLeft = textView.getTotalPaddingLeft();
                        Intrinsics.checkNotNullParameter(textView, "<this>");
                        try {
                            extendedPaddingTop = textView.getTotalPaddingTop();
                        } catch (NullPointerException unused) {
                            extendedPaddingTop = textView.getExtendedPaddingTop();
                        }
                        int i11 = extendedPaddingTop;
                        textView.getX();
                        textView.getY();
                        return new d(aVar, Integer.valueOf(currentTextColor), totalPaddingLeft, i11, textView.getWidth(), textView.getHeight(), textView.getElevation() + (bVar != null ? bVar.a() : 0.0f), bVar, z11, rect2);
                    }
                    if (!(view instanceof ImageView)) {
                        view.getX();
                        view.getY();
                        return new C1110b(view.getWidth(), view.getHeight(), view.getElevation() + (bVar != null ? bVar.a() : 0.0f), bVar, z11, rect2);
                    }
                    ImageView imageView = (ImageView) view;
                    imageView.getX();
                    imageView.getY();
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    float elevation = imageView.getElevation() + (bVar != null ? bVar.a() : 0.0f);
                    if (z11) {
                        Drawable drawable = imageView.getDrawable();
                        if (drawable != null) {
                            if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                                z13 = true;
                                if (z13) {
                                    z12 = true;
                                    return new c(width, height, elevation, bVar, z12, rect2);
                                }
                            }
                        }
                        z13 = false;
                        if (z13) {
                        }
                    }
                    z12 = false;
                    return new c(width, height, elevation, bVar, z12, rect2);
                }
                options.f();
            }
            z11 = false;
            if (!(view instanceof TextView)) {
            }
        }
    }

    /* renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    public static final class C1110b extends b {
    }

    public static final class c extends b {
    }

    public static final class d extends b {

        /* renamed from: g, reason: collision with root package name */
        private final m f67720g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f67721h;

        /* renamed from: i, reason: collision with root package name */
        private final int f67722i;

        /* renamed from: j, reason: collision with root package name */
        private final int f67723j;

        public d(m mVar, Integer num, int i11, int i12, int i13, int i14, float f7, b bVar, boolean z11, Rect rect) {
            super(i13, i14, f7, bVar, z11, rect);
            this.f67720g = mVar;
            this.f67721h = num;
            this.f67722i = i11;
            this.f67723j = i12;
        }

        public final Integer h() {
            return this.f67721h;
        }

        public final m i() {
            return this.f67720g;
        }

        public final int j() {
            return this.f67722i;
        }

        public final int k() {
            return this.f67723j;
        }
    }

    public b(int i11, int i12, float f7, b bVar, boolean z11, Rect rect) {
        this.f67714a = i11;
        this.f67715b = i12;
        this.f67716c = f7;
        this.f67717d = z11;
        this.f67718e = rect;
    }

    public final float a() {
        return this.f67716c;
    }

    public final int b() {
        return this.f67715b;
    }

    public final boolean c() {
        return this.f67717d;
    }

    public final Rect d() {
        return this.f67718e;
    }

    public final int e() {
        return this.f67714a;
    }

    public final void f(ArrayList arrayList) {
        this.f67719f = arrayList;
    }

    public final void g(@NotNull Function1<? super b, Boolean> callback) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!callback.invoke(this).booleanValue() || (arrayList = this.f67719f) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).g(callback);
        }
    }
}
