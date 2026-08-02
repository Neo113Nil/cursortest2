package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.e;
import com.sofascore.results.base.BaseActivity;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a31 extends AppCompatImageView {
    public final mqi a;
    public final e1d b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = ypa.b(new c6(context, 5));
        this.b = e.f(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.a, 0, 0);
        this.c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.CENTER);
        z8e.a0(this, 1000L, new z0(this, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Context context, Function1 function1) {
        context.getClass();
        Context context2 = context instanceof BaseActivity ? context : null;
        if (context2 == null) {
            ContextThemeWrapper contextThemeWrapper = context instanceof ContextThemeWrapper ? (ContextThemeWrapper) context : null;
            context2 = contextThemeWrapper != null ? contextThemeWrapper.getBaseContext() : null;
        }
        context = context2;
        if (context instanceof BaseActivity) {
            p4h.t((BaseActivity) context, false, function1, null, 56);
        } else {
            function1.invoke(Boolean.FALSE);
        }
    }

    public abstract void b();

    public final void e() {
        setImageResource(getState().d());
        Integer num = this.c ? -1 : null;
        setImageTintList(ColorStateList.valueOf(num != null ? num.intValue() : getContext().getColor(getState().getColor())));
    }

    @NotNull
    public final au1 getBellButtonPopup() {
        return (au1) this.a.getValue();
    }

    @NotNull
    public abstract wu getFollowSource();

    @Nullable
    public final Object getFollowableItem() {
        return ((eoh) this.b).getValue();
    }

    public final boolean getShownInHeader() {
        return this.c;
    }

    @NotNull
    public abstract lb getState();

    public abstract void setFollowSource(@NotNull wu wuVar);

    public final void setFollowableItem(@Nullable Object obj) {
        ((eoh) this.b).setValue(obj);
    }

    public final void setShownInHeader(boolean z) {
        this.c = z;
    }

    public abstract void setState(@NotNull lb lbVar);
}
