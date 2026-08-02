package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter2;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import defpackage.a70;
import defpackage.aac;
import defpackage.akf;
import defpackage.bac;
import defpackage.bbc;
import defpackage.bsk;
import defpackage.dac;
import defpackage.hda;
import defpackage.ibc;
import defpackage.l4a;
import defpackage.nac;
import defpackage.obc;
import defpackage.pbc;
import defpackage.q9;
import defpackage.qkj;
import defpackage.sbc;
import defpackage.tac;
import defpackage.td4;
import defpackage.wb0;
import defpackage.y9;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    public static final SparseArray p = new SparseArray(2);
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {R.attr.state_checkable};
    public final pbc a;
    public final aac b;
    public ibc c;
    public nac d;
    public boolean e;
    public boolean f;
    public bac g;
    public Drawable h;
    public int i;
    public int j;
    public int k;
    public final ColorStateList l;
    public final int m;
    public final int n;
    public boolean o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaRouteButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(r8 != 0 ? new ContextThemeWrapper(r0, r8) : r0, attributeSet, com.sofascore.results.R.attr.mediaRouteButtonStyle);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, hda.F(context));
        int I = hda.I(com.sofascore.results.R.attr.mediaRouteTheme, contextThemeWrapper);
        this.c = ibc.c;
        this.d = nac.a;
        Context context2 = getContext();
        int[] iArr = akf.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.sofascore.results.R.attr.mediaRouteButtonStyle, 0);
        bsk.p(this, context2, iArr, attributeSet, obtainStyledAttributes, com.sofascore.results.R.attr.mediaRouteButtonStyle);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.h = td4.d0(obtainStyledAttributes.getResourceId(3, 0), context2);
            return;
        }
        this.a = pbc.d(context2);
        this.b = new aac(this, 0);
        obc f = pbc.f();
        int i = !f.d() ? f.i : 0;
        this.k = i;
        this.j = i;
        this.l = obtainStyledAttributes.getColorStateList(4);
        this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.i = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.i;
        SparseArray sparseArray = p;
        if (i2 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i2)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.h == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    bac bacVar = new bac(this, resourceId, getContext());
                    this.g = bacVar;
                    bacVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        d();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private s getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).k();
        }
        return null;
    }

    public final void a() {
        if (this.i > 0) {
            bac bacVar = this.g;
            if (bacVar != null) {
                bacVar.cancel(false);
            }
            bac bacVar2 = new bac(this, this.i, getContext());
            this.g = bacVar2;
            this.i = 0;
            bacVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        obc f = pbc.f();
        int i = !f.d() ? f.i : 0;
        if (this.k != i) {
            this.k = i;
            d();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
    }

    public final boolean c() {
        s fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            a70.r("The activity must be a subclass of FragmentActivity");
            return false;
        }
        this.a.getClass();
        if (pbc.f().d()) {
            if (fragmentManager.F("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
                this.d.getClass();
                MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
                ibc ibcVar = this.c;
                if (ibcVar == null) {
                    a70.p("selector must not be null");
                    return false;
                }
                mediaRouteChooserDialogFragment.q();
                if (!mediaRouteChooserDialogFragment.s.equals(ibcVar)) {
                    mediaRouteChooserDialogFragment.s = ibcVar;
                    Bundle arguments = mediaRouteChooserDialogFragment.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putBundle("selector", ibcVar.a);
                    mediaRouteChooserDialogFragment.setArguments(arguments);
                    wb0 wb0Var = mediaRouteChooserDialogFragment.r;
                    if (wb0Var != null) {
                        if (mediaRouteChooserDialogFragment.q) {
                            ((tac) wb0Var).g(ibcVar);
                        } else {
                            ((dac) wb0Var).h(ibcVar);
                        }
                    }
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                aVar.i(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                aVar.g(true, true);
                return true;
            }
        } else if (fragmentManager.F("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
            this.d.getClass();
            MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
            ibc ibcVar2 = this.c;
            if (ibcVar2 == null) {
                a70.p("selector must not be null");
                return false;
            }
            ibc ibcVar3 = mediaRouteControllerDialogFragment.s;
            if (ibcVar3 == null) {
                Bundle arguments2 = mediaRouteControllerDialogFragment.getArguments();
                if (arguments2 != null) {
                    mediaRouteControllerDialogFragment.s = ibc.b(arguments2.getBundle("selector"));
                }
                ibcVar3 = mediaRouteControllerDialogFragment.s;
                if (ibcVar3 == null) {
                    ibcVar3 = ibc.c;
                    mediaRouteControllerDialogFragment.s = ibcVar3;
                }
            }
            if (!ibcVar3.equals(ibcVar2)) {
                mediaRouteControllerDialogFragment.s = ibcVar2;
                Bundle arguments3 = mediaRouteControllerDialogFragment.getArguments();
                if (arguments3 == null) {
                    arguments3 = new Bundle();
                }
                arguments3.putBundle("selector", ibcVar2.a);
                mediaRouteControllerDialogFragment.setArguments(arguments3);
                wb0 wb0Var2 = mediaRouteControllerDialogFragment.r;
                if (wb0Var2 != null && mediaRouteControllerDialogFragment.q) {
                    ((bbc) wb0Var2).i(ibcVar2);
                }
            }
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.i(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
            aVar2.g(true, true);
            return true;
        }
        return false;
    }

    public final void d() {
        int i = this.k;
        String string = getContext().getString(i != 1 ? i != 2 ? com.sofascore.results.R.string.mr_cast_button_disconnected : com.sofascore.results.R.string.mr_cast_button_connected : com.sofascore.results.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.o || TextUtils.isEmpty(string)) {
            string = null;
        }
        qkj.a(this, string);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            this.h.setState(getDrawableState());
            if (this.h.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.h.getCurrent();
                int i = this.k;
                if (i == 1 || this.j != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.j = this.k;
    }

    @NonNull
    public nac getDialogFactory() {
        return this.d;
    }

    @NonNull
    public ibc getRouteSelector() {
        return this.c;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.e = true;
        if (!this.c.d()) {
            this.a.a(this.c, this.b, 0);
        }
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a != null && !this.f) {
            int i2 = this.k;
            if (i2 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, r);
                return onCreateDrawableState;
            }
            if (i2 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, q);
                return onCreateDrawableState;
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.e = false;
            if (!this.c.d()) {
                this.a.h(this.b);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.h.getIntrinsicWidth();
            int intrinsicHeight = this.h.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.h.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.h.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.h;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.m, i3);
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.n, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00a0, code lost:
    
        if (defpackage.l4a.M(r2) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performClick() {
        boolean c;
        boolean M;
        ApplicationInfo applicationInfo;
        boolean z;
        ApplicationInfo applicationInfo2;
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (this.e) {
            this.a.getClass();
            pbc.b();
            sbc sbcVar = pbc.c().u;
            if (sbcVar != null) {
                if (sbcVar.b) {
                    if (pbc.c == null ? false : pbc.c().i()) {
                        Context context = getContext();
                        int i = Build.VERSION.SDK_INT;
                        if (i < 34) {
                            if (i < 31) {
                                if (i == 30) {
                                    M = l4a.M(context);
                                    if (!M) {
                                    }
                                    c = true;
                                    break;
                                }
                                M = false;
                                if (!M) {
                                }
                                c = true;
                                break;
                            }
                            Intent putExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                            Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(putExtra, 0).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityInfo activityInfo = it.next().activityInfo;
                                    if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                        context.sendBroadcast(putExtra);
                                        break;
                                    }
                                }
                            }
                            M = true;
                            if (!M) {
                            }
                            c = true;
                            break;
                        }
                        if (i >= 30) {
                            MediaRouter2 c2 = y9.c(context);
                            if (i >= 34) {
                                M = q9.L(c2);
                                if (!M) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                        Intent putExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) context.getSystemService(AudioManager.class)).getDevices(2)) {
                                            int type = audioDeviceInfo.getType();
                                            if (type == 3 || type == 4 || type == 5 || type == 6 || type == 8 || type == 11 || type == 30 || type == 22 || type == 23 || type == 26 || type == 27) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        z = false;
                                        Intent putExtra3 = putExtra2.putExtra("EXTRA_CLOSE_ON_CONNECT", !z);
                                        Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(putExtra3, 0).iterator();
                                        while (it2.hasNext()) {
                                            ActivityInfo activityInfo2 = it2.next().activityInfo;
                                            if (activityInfo2 != null && (applicationInfo2 = activityInfo2.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                                                putExtra3.setPackage(applicationInfo2.packageName);
                                                context.startActivity(putExtra3);
                                            }
                                        }
                                    }
                                }
                                c = true;
                                break;
                            }
                        }
                        M = false;
                        if (!M) {
                        }
                        c = true;
                        break;
                    }
                }
                c = c();
            } else {
                c = c();
            }
        } else {
            c = false;
        }
        return c || performClick;
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            d();
        }
    }

    public void setDialogFactory(@NonNull nac nacVar) {
        if (nacVar != null) {
            this.d = nacVar;
        } else {
            a70.p("factory must not be null");
        }
    }

    public void setRemoteIndicatorDrawable(@Nullable Drawable drawable) {
        this.i = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        bac bacVar = this.g;
        if (bacVar != null) {
            bacVar.cancel(false);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.l;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.h = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(@NonNull ibc ibcVar) {
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return;
        }
        if (this.c.equals(ibcVar)) {
            return;
        }
        if (this.e) {
            boolean d = this.c.d();
            aac aacVar = this.b;
            pbc pbcVar = this.a;
            if (!d) {
                pbcVar.h(aacVar);
            }
            if (!ibcVar.d()) {
                pbcVar.a(ibcVar, aacVar, 0);
            }
        }
        this.c = ibcVar;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }
}
