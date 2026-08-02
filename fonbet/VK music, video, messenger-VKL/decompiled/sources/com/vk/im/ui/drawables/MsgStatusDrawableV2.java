package com.vk.im.ui.drawables;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.asp;
import xsna.dbg0;
import xsna.iah0;
import xsna.pn00;
import xsna.sjo;
import xsna.x9;
import xsna.zrp;

/* compiled from: MsgStatusDrawableV2.kt */
/* loaded from: classes2.dex */
public final class MsgStatusDrawableV2 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public Drawable f;
    public final Paint g;
    public StatusState h;
    public final Object i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgStatusDrawableV2.kt */
    public static final class StatusState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusState[] $VALUES;
        public static final StatusState ERROR;
        public static final StatusState READ;
        public static final StatusState SENDING;
        public static final StatusState UNREAD;

        static {
            StatusState statusState = new StatusState("SENDING", 0);
            SENDING = statusState;
            StatusState statusState2 = new StatusState("UNREAD", 1);
            UNREAD = statusState2;
            StatusState statusState3 = new StatusState("READ", 2);
            READ = statusState3;
            StatusState statusState4 = new StatusState("ERROR", 3);
            ERROR = statusState4;
            StatusState[] statusStateArr = {statusState, statusState2, statusState3, statusState4};
            $VALUES = statusStateArr;
            $ENTRIES = new asp(statusStateArr);
        }

        public StatusState() {
            throw null;
        }

        public static StatusState valueOf(String str) {
            return (StatusState) Enum.valueOf(StatusState.class, str);
        }

        public static StatusState[] values() {
            return (StatusState[]) $VALUES.clone();
        }
    }

    /* compiled from: MsgStatusDrawableV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusState.values().length];
            try {
                iArr[StatusState.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusState.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusState.READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MsgStatusDrawableV2(Context context) {
        Drawable mutate = b(R.drawable.vk_icon_clock_outline_12, context).mutate();
        this.a = mutate;
        Drawable mutate2 = b(R.drawable.vk_icon_check_outline_16, context).mutate();
        this.b = mutate2;
        Drawable mutate3 = b(R.drawable.vk_icon_check_double_outline_16, context).mutate();
        this.c = mutate3;
        Drawable mutate4 = b(R.drawable.vk_icon_error_circle_fill_12, context).mutate();
        this.d = mutate4;
        Drawable b = b(R.drawable.vk_icon_error_circle_12, context);
        if (b != null) {
            sjo.b(b, -1, PorterDuff.Mode.SRC_IN);
        } else {
            b = null;
        }
        this.e = b.mutate();
        this.f = mutate4;
        Paint c = x9.c(true);
        c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.g = c;
        this.i = pn00.k(new Pair(StatusState.SENDING, mutate), new Pair(StatusState.UNREAD, mutate2), new Pair(StatusState.READ, mutate3), new Pair(StatusState.ERROR, this.f));
        c();
    }

    public static Drawable b(int i, Context context) {
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        return resources.getDrawable(i, theme);
    }

    public final void a(Canvas canvas, Drawable drawable) {
        canvas.save();
        Paint paint = this.g;
        if (paint.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawCircle(drawable.getBounds().centerX(), drawable.getBounds().centerY(), (paint.getStrokeWidth() / 2) + (drawable.getBounds().height() / 2), paint);
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void c() {
        this.h = null;
        this.a.setAlpha(0);
        this.b.setAlpha(0);
        this.c.setAlpha(0);
        this.d.setAlpha(0);
        this.e.setAlpha(0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        boolean z = drawable.getAlpha() != 0;
        Drawable drawable2 = this.b;
        boolean z2 = drawable2.getAlpha() != 0;
        Drawable drawable3 = this.c;
        boolean z3 = drawable3.getAlpha() != 0;
        boolean z4 = (this.d.getAlpha() == 0 && this.e.getAlpha() == 0) ? false : true;
        if (z || z3 || z2 || z4) {
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY());
            if (z) {
                a(canvas, drawable);
            }
            if (z3) {
                a(canvas, drawable3);
            }
            if (z2) {
                a(canvas, drawable2);
            }
            if (z4) {
                a(canvas, this.f);
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return iah0.a(16);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return iah0.a(16);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        Drawable drawable = this.a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (i5 <= intrinsicWidth) {
            intrinsicWidth = i5;
        }
        int i7 = intrinsicWidth / 2;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (i6 <= intrinsicHeight) {
            intrinsicHeight = i6;
        }
        int i8 = intrinsicHeight / 2;
        drawable.setBounds(-i7, -i8, i7, i8);
        Drawable drawable2 = this.b;
        int intrinsicWidth2 = drawable2.getIntrinsicWidth();
        if (i5 <= intrinsicWidth2) {
            intrinsicWidth2 = i5;
        }
        int i9 = intrinsicWidth2 / 2;
        int intrinsicHeight2 = drawable2.getIntrinsicHeight();
        if (i6 <= intrinsicHeight2) {
            intrinsicHeight2 = i6;
        }
        int i10 = intrinsicHeight2 / 2;
        drawable2.setBounds(-i9, -i10, i9, i10);
        Drawable drawable3 = this.c;
        int intrinsicWidth3 = drawable3.getIntrinsicWidth();
        if (i5 <= intrinsicWidth3) {
            intrinsicWidth3 = i5;
        }
        int i11 = intrinsicWidth3 / 2;
        int intrinsicHeight3 = drawable3.getIntrinsicHeight();
        if (i6 <= intrinsicHeight3) {
            intrinsicHeight3 = i6;
        }
        int i12 = intrinsicHeight3 / 2;
        drawable3.setBounds(-i11, -i12, i11, i12);
        int intrinsicWidth4 = this.f.getIntrinsicWidth();
        if (i5 > intrinsicWidth4) {
            i5 = intrinsicWidth4;
        }
        int i13 = i5 / 2;
        int intrinsicHeight4 = this.f.getIntrinsicHeight();
        if (i6 > intrinsicHeight4) {
            i6 = intrinsicHeight4;
        }
        int i14 = i6 / 2;
        int i15 = -i13;
        int i16 = -i14;
        this.d.setBounds(i15, i16, i13, i14);
        this.e.setBounds(i15, i16, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
