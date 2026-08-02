package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.sports.insider.R;
import com.sports.insider.data.repository.room.sports.db.impl.SportsTable;
import io.sentry.android.replay.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0004\b\u0014\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R2\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/sports/insider/ui/views/MenuCategory;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "", "keys", "", "setLogoKeys", "(Ljava/util/List;)V", "Landroid/graphics/Typeface;", "typeface", "setFontTextName", "(Landroid/graphics/Typeface;)V", "Lkc/a;", "items", "setCategory", "", SportsTable.ID_COLUMN, "setSelectItem", "(I)V", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "i", "Lkotlin/jvm/functions/Function1;", "getBitmapProvider", "()Lkotlin/jvm/functions/Function1;", "setBitmapProvider", "(Lkotlin/jvm/functions/Function1;)V", "bitmapProvider", "j", "getBitmapRequester", "setBitmapRequester", "bitmapRequester", "Lve/d0;", "listenerSelectItem", "Lve/d0;", "getListenerSelectItem", "()Lve/d0;", "setListenerSelectItem", "(Lve/d0;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuCategory.kt\ncom/sports/insider/ui/views/MenuCategory\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,384:1\n404#2:385\n404#2:386\n404#2:387\n404#2:388\n1878#3,3:389\n360#3,7:408\n360#3,7:415\n44#4,8:392\n27#4,7:400\n1#5:407\n*S KotlinDebug\n*F\n+ 1 MenuCategory.kt\ncom/sports/insider/ui/views/MenuCategory\n*L\n64#1:385\n92#1:386\n93#1:387\n111#1:388\n175#1:389,3\n346#1:408,7\n365#1:415,7\n283#1:392,8\n309#1:400,7\n*E\n"})
/* loaded from: classes.dex */
public final class MenuCategory extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f7703a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7704b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7705c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7706d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7707e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7708f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7709g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f7710h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Function1 bitmapProvider;

    /* renamed from: j, reason: from kotlin metadata */
    public Function1 bitmapRequester;

    /* renamed from: k, reason: collision with root package name */
    public int f7712k;

    /* renamed from: l, reason: collision with root package name */
    public int f7713l;

    /* renamed from: m, reason: collision with root package name */
    public final a f7714m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f7715n;

    /* renamed from: o, reason: collision with root package name */
    public final DisplayMetrics f7716o;

    /* renamed from: p, reason: collision with root package name */
    public final TextPaint f7717p;
    public final int[] q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f7718r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f7719s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7720t;

    /* renamed from: u, reason: collision with root package name */
    public float f7721u;

    /* renamed from: v, reason: collision with root package name */
    public float f7722v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuCategory(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7704b = 60.0f;
        this.f7705c = 36.0f;
        this.f7706d = 24.0f;
        this.f7707e = 16.0f;
        this.f7708f = 85.0f;
        this.f7709g = 59.0f;
        this.f7710h = new LinkedHashSet();
        this.f7714m = new a(0, "", null);
        this.f7715n = new ArrayList();
        this.f7717p = new TextPaint(1);
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.q = iArr;
        Paint paint = new Paint(1);
        this.f7718r = paint;
        this.f7719s = new Paint(1);
        this.f7720t = Color.parseColor("#18012E");
        this.f7721u = Float.NaN;
        this.f7722v = Float.NaN;
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f7716o = displayMetrics;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 < 1.0f ? 1.0f : f6;
        this.f7704b = 60 * f6;
        this.f7705c = 36 * f6;
        this.f7706d = 24 * f6;
        this.f7707e = 16 * f6;
        this.f7708f = 85 * f6;
        this.f7709g = 59 * f6;
        iArr[0] = Color.parseColor("#40007E");
        iArr[1] = Color.parseColor("#03F39E");
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        TextPaint textPaint = this.f7717p;
        DisplayMetrics displayMetrics2 = this.f7716o;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        textPaint.setStrokeWidth(i10 >= 34 ? TypedValue.applyDimension(2, 1.0f, displayMetrics2) : displayMetrics2.scaledDensity * 1.0f);
        textPaint.setColor(Color.parseColor("#cbcbcb"));
        textPaint.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics3 = this.f7716o;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics3, "<this>");
        textPaint.setTextSize(i10 >= 34 ? TypedValue.applyDimension(2, 14.0f, displayMetrics3) : displayMetrics3.scaledDensity * 14.0f);
        String string = getResources().getString(R.string.category_all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a aVar = new a(0, string, null);
        this.f7714m = aVar;
        this.f7715n.add(aVar);
        this.f7713l = 0;
        this.f7712k = this.f7714m.f18990a;
    }

    @Nullable
    public final Function1<String, Bitmap> getBitmapProvider() {
        return this.bitmapProvider;
    }

    @Nullable
    public final Function1<String, Unit> getBitmapRequester() {
        return this.bitmapRequester;
    }

    @Nullable
    public final d0 getListenerSelectItem() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        float f6;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(this.f7720t);
        if (this.f7715n.isEmpty()) {
            return;
        }
        Iterator it = this.f7715n.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i10 = i5 + 1;
            if (i5 < 0) {
                u.j();
                throw null;
            }
            a aVar = (a) next;
            int i11 = this.f7713l;
            if (i5 != i11 - 1) {
                save = canvas.save();
                float f10 = i11 == i5 ? 0.0f : this.f7707e;
                float f11 = this.f7704b;
                float f12 = i5 * f11;
                float f13 = (i11 == i5 ? 0.0f : this.f7709g) + f12;
                float f14 = f12 + f11;
                float f15 = this.f7703a;
                if (i11 == i5) {
                    f6 = 0.0f;
                } else {
                    try {
                        f6 = this.f7707e;
                    } finally {
                    }
                }
                canvas.drawRect(new Rect((int) f10, (int) f13, (int) (f15 - f6), (int) f14), this.f7718r);
            }
            String str = aVar.f18991b;
            if (str != null) {
                float f16 = this.f7704b;
                TextPaint textPaint = this.f7717p;
                float f17 = (f16 / 2.0f) + (i5 * f16) + textPaint.getFontMetrics().descent;
                save = canvas.save();
                canvas.translate(this.f7708f, f17);
                try {
                    canvas.drawText(str, 0.0f, 0.0f, textPaint);
                } finally {
                }
            }
            String str2 = aVar.f18992c;
            if (str2 != null) {
                Function1 function1 = this.bitmapProvider;
                Bitmap bitmap = function1 != null ? (Bitmap) function1.invoke(str2) : null;
                if (bitmap != null) {
                    float f18 = this.f7704b;
                    canvas.drawBitmap(bitmap, this.f7705c, ((f18 - this.f7706d) / 2) + (i5 * f18), this.f7719s);
                } else {
                    LinkedHashSet linkedHashSet = this.f7710h;
                    if (!linkedHashSet.contains(str2)) {
                        linkedHashSet.add(str2);
                        post(new c(20, this, str2));
                    }
                }
            }
            i5 = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = !this.f7715n.isEmpty() ? (int) (this.f7715n.size() * this.f7704b) : 0;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(getSuggestedMinimumWidth(), size);
        }
        this.f7703a = size;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size3, size2);
        } else if (mode2 != 1073741824) {
            size2 = size3;
        }
        setMeasuredDimension(this.f7703a, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7703a = i5;
        if (i5 > 0) {
            this.f7718r.setShader(new LinearGradient(0.0f, 0.0f, this.f7703a, 0.0f, this.q, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r0 >= r8.f7715n.size()) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i5;
        if (motionEvent == null) {
            return super.onTouchEvent(null);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7721u = motionEvent.getX();
            this.f7722v = motionEvent.getY();
            return true;
        }
        if (action != 1) {
            if (action == 3) {
                return super.onTouchEvent(motionEvent);
            }
        } else {
            if (Float.isNaN(this.f7721u)) {
                return super.onTouchEvent(motionEvent);
            }
            if (Float.isNaN(this.f7722v)) {
                return super.onTouchEvent(motionEvent);
            }
            float f6 = this.f7721u;
            float f10 = this.f7722v;
            float x10 = motionEvent.getX();
            float y5 = motionEvent.getY();
            float f11 = this.f7703a;
            if (x10 <= f11 && f6 <= f11 && x10 >= 0.0f && f6 >= 0.0f) {
                float f12 = f10 > y5 ? f10 - y5 : y5 - f10;
                float f13 = this.f7704b;
                if (f12 <= f13 && ((int) (f10 / f13)) == ((int) (y5 / f13))) {
                    float f14 = (f10 + y5) / 2;
                    i5 = (int) (f14 / f13);
                    int i10 = (int) (f14 % f13);
                    if (i5 == 0) {
                        i5 = 0;
                    } else if (i5 > 0 && i10 == 0) {
                        i5--;
                    } else if (i5 <= 0 || i10 <= 0) {
                        i5 = -1;
                    }
                    if (i5 != -1) {
                    }
                }
            }
            i5 = -1;
            if (i5 >= 0 && this.f7715n.size() > i5) {
                this.f7713l = i5;
                this.f7712k = ((a) this.f7715n.get(i5)).f18990a;
                invalidate();
            }
            this.f7721u = Float.NaN;
            this.f7722v = Float.NaN;
            if (i5 == -1) {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final void setBitmapProvider(@Nullable Function1<? super String, Bitmap> function1) {
        this.bitmapProvider = function1;
    }

    public final void setBitmapRequester(@Nullable Function1<? super String, Unit> function1) {
        this.bitmapRequester = function1;
    }

    public final void setCategory(@NotNull List<a> items) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList X = CollectionsKt.X(items);
        Iterator it = X.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((a) obj2).f18990a == 0) {
                    break;
                }
            }
        }
        if (((a) obj2) == null) {
            X.add(0, this.f7714m);
        }
        this.f7715n = X;
        Iterator it2 = X.iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i5 = -1;
                break;
            } else if (((a) it2.next()).f18990a == this.f7712k) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            this.f7713l = 0;
            this.f7712k = this.f7714m.f18990a;
        } else if (this.f7713l != i5) {
            this.f7713l = i5;
            Iterator it3 = this.f7715n.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((a) next).f18990a == this.f7712k) {
                    obj = next;
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                this.f7712k = aVar.f18990a;
            }
        }
        requestLayout();
    }

    public final void setFontTextName(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f7717p.setTypeface(typeface);
    }

    public final void setLogoKeys(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        invalidate();
    }

    public final void setSelectItem(int idCategory) {
        Object obj;
        Iterator it = this.f7715n.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (((a) it.next()).f18990a == idCategory) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            this.f7713l = 0;
            this.f7712k = this.f7714m.f18990a;
        } else if (this.f7713l != i5) {
            this.f7713l = i5;
            Iterator it2 = this.f7715n.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((a) obj).f18990a == idCategory) {
                        break;
                    }
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                this.f7712k = aVar.f18990a;
            }
        }
        invalidate();
    }

    public final void setListenerSelectItem(@Nullable d0 d0Var) {
    }
}
