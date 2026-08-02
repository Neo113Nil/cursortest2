package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import n.AbstractC5596a;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: r, reason: collision with root package name */
    public static final O f28404r = new O() { // from class: com.airbnb.lottie.g
        @Override // com.airbnb.lottie.O
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public final O f28405d;

    /* renamed from: e, reason: collision with root package name */
    public final O f28406e;

    /* renamed from: f, reason: collision with root package name */
    public O f28407f;

    /* renamed from: g, reason: collision with root package name */
    public int f28408g;

    /* renamed from: h, reason: collision with root package name */
    public final K f28409h;

    /* renamed from: i, reason: collision with root package name */
    public String f28410i;

    /* renamed from: j, reason: collision with root package name */
    public int f28411j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28412k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28413l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28414n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f28415o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f28416p;

    /* renamed from: q, reason: collision with root package name */
    public V f28417q;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f28418a;

        /* renamed from: b, reason: collision with root package name */
        public int f28419b;

        /* renamed from: c, reason: collision with root package name */
        public float f28420c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28421d;

        /* renamed from: e, reason: collision with root package name */
        public String f28422e;

        /* renamed from: f, reason: collision with root package name */
        public int f28423f;

        /* renamed from: g, reason: collision with root package name */
        public int f28424g;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, AbstractC2939i abstractC2939i) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f28418a);
            parcel.writeFloat(this.f28420c);
            parcel.writeInt(this.f28421d ? 1 : 0);
            parcel.writeString(this.f28422e);
            parcel.writeInt(this.f28423f);
            parcel.writeInt(this.f28424g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f28418a = parcel.readString();
            this.f28420c = parcel.readFloat();
            this.f28421d = parcel.readInt() == 1;
            this.f28422e = parcel.readString();
            this.f28423f = parcel.readInt();
            this.f28424g = parcel.readInt();
        }
    }

    public enum a {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static class b implements O {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f28431a;

        public b(LottieAnimationView lottieAnimationView) {
            this.f28431a = new WeakReference(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.O
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f28431a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f28408g != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f28408g);
            }
            (lottieAnimationView.f28407f == null ? LottieAnimationView.f28404r : lottieAnimationView.f28407f).onResult(th2);
        }
    }

    public static class c implements O {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f28432a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f28432a = new WeakReference(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.O
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C2940j c2940j) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f28432a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c2940j);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f28405d = new c(this);
        this.f28406e = new b(this);
        this.f28408g = 0;
        this.f28409h = new K();
        this.f28412k = false;
        this.f28413l = false;
        this.f28414n = true;
        this.f28415o = new HashSet();
        this.f28416p = new HashSet();
        r(null, X.f28498a);
    }

    public static /* synthetic */ T c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f28414n ? AbstractC2963t.n(lottieAnimationView.getContext(), str) : AbstractC2963t.o(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th2) {
        if (!com.airbnb.lottie.utils.z.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        com.airbnb.lottie.utils.g.d("Unable to load composition.", th2);
    }

    public static /* synthetic */ T e(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.f28414n ? AbstractC2963t.z(lottieAnimationView.getContext(), i10) : AbstractC2963t.A(lottieAnimationView.getContext(), i10, null);
    }

    private void setCompositionTask(V v10) {
        T e10 = v10.e();
        K k10 = this.f28409h;
        if (e10 != null && k10 == getDrawable() && k10.J() == e10.b()) {
            return;
        }
        this.f28415o.add(a.SET_ANIMATION);
        n();
        m();
        this.f28417q = v10.d(this.f28405d).c(this.f28406e);
    }

    public void A(String str, String str2) {
        setCompositionTask(AbstractC2963t.C(getContext(), str, str2));
    }

    public final void B() {
        boolean s10 = s();
        setImageDrawable(null);
        setImageDrawable(this.f28409h);
        if (s10) {
            this.f28409h.o0();
        }
    }

    public void C(int i10, int i11) {
        this.f28409h.I0(i10, i11);
    }

    public final void D(float f10, boolean z10) {
        if (z10) {
            this.f28415o.add(a.SET_PROGRESS);
        }
        this.f28409h.P0(f10);
    }

    public EnumC2931a getAsyncUpdates() {
        return this.f28409h.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f28409h.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f28409h.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f28409h.I();
    }

    public C2940j getComposition() {
        Drawable drawable = getDrawable();
        K k10 = this.f28409h;
        if (drawable == k10) {
            return k10.J();
        }
        return null;
    }

    public long getDuration() {
        C2940j composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f28409h.M();
    }

    public String getImageAssetsFolder() {
        return this.f28409h.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f28409h.Q();
    }

    public float getMaxFrame() {
        return this.f28409h.S();
    }

    public float getMinFrame() {
        return this.f28409h.T();
    }

    public W getPerformanceTracker() {
        return this.f28409h.U();
    }

    public float getProgress() {
        return this.f28409h.V();
    }

    public Z getRenderMode() {
        return this.f28409h.W();
    }

    public int getRepeatCount() {
        return this.f28409h.X();
    }

    public int getRepeatMode() {
        return this.f28409h.Y();
    }

    public float getSpeed() {
        return this.f28409h.Z();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f28409h.q(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof K) && ((K) drawable).W() == Z.SOFTWARE) {
            this.f28409h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        K k10 = this.f28409h;
        if (drawable2 == k10) {
            super.invalidateDrawable(k10);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(Q q10) {
        C2940j composition = getComposition();
        if (composition != null) {
            q10.a(composition);
        }
        return this.f28416p.add(q10);
    }

    public void k(E3.e eVar, Object obj, G3.c cVar) {
        this.f28409h.r(eVar, obj, cVar);
    }

    public void l() {
        this.f28413l = false;
        this.f28415o.add(a.PLAY_OPTION);
        this.f28409h.u();
    }

    public final void m() {
        V v10 = this.f28417q;
        if (v10 != null) {
            v10.k(this.f28405d);
            this.f28417q.j(this.f28406e);
        }
    }

    public final void n() {
        this.f28409h.v();
    }

    public void o(boolean z10) {
        this.f28409h.A(L.MergePathsApi19, z10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f28413l) {
            return;
        }
        this.f28409h.l0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f28410i = savedState.f28418a;
        Set set = this.f28415o;
        a aVar = a.SET_ANIMATION;
        if (!set.contains(aVar) && !TextUtils.isEmpty(this.f28410i)) {
            setAnimation(this.f28410i);
        }
        this.f28411j = savedState.f28419b;
        if (!this.f28415o.contains(aVar) && (i10 = this.f28411j) != 0) {
            setAnimation(i10);
        }
        if (!this.f28415o.contains(a.SET_PROGRESS)) {
            D(savedState.f28420c, false);
        }
        if (!this.f28415o.contains(a.PLAY_OPTION) && savedState.f28421d) {
            u();
        }
        if (!this.f28415o.contains(a.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f28422e);
        }
        if (!this.f28415o.contains(a.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f28423f);
        }
        if (this.f28415o.contains(a.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f28424g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f28418a = this.f28410i;
        savedState.f28419b = this.f28411j;
        savedState.f28420c = this.f28409h.V();
        savedState.f28421d = this.f28409h.e0();
        savedState.f28422e = this.f28409h.O();
        savedState.f28423f = this.f28409h.Y();
        savedState.f28424g = this.f28409h.X();
        return savedState;
    }

    public final V p(final String str) {
        return isInEditMode() ? new V(new Callable() { // from class: com.airbnb.lottie.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.c(LottieAnimationView.this, str);
            }
        }, true) : this.f28414n ? AbstractC2963t.l(getContext(), str) : AbstractC2963t.m(getContext(), str, null);
    }

    public final V q(final int i10) {
        return isInEditMode() ? new V(new Callable() { // from class: com.airbnb.lottie.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.e(LottieAnimationView.this, i10);
            }
        }, true) : this.f28414n ? AbstractC2963t.x(getContext(), i10) : AbstractC2963t.y(getContext(), i10, null);
    }

    public final void r(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Y.LottieAnimationView, i10, 0);
        this.f28414n = obtainStyledAttributes.getBoolean(Y.f28503e, true);
        boolean hasValue = obtainStyledAttributes.hasValue(Y.f28515q);
        boolean hasValue2 = obtainStyledAttributes.hasValue(Y.f28510l);
        boolean hasValue3 = obtainStyledAttributes.hasValue(Y.f28520v);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(Y.f28515q, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(Y.f28510l);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(Y.f28520v)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(Y.f28509k, 0));
        if (obtainStyledAttributes.getBoolean(Y.f28502d, false)) {
            this.f28413l = true;
        }
        if (obtainStyledAttributes.getBoolean(Y.f28513o, false)) {
            this.f28409h.R0(-1);
        }
        if (obtainStyledAttributes.hasValue(Y.f28518t)) {
            setRepeatMode(obtainStyledAttributes.getInt(Y.f28518t, 1));
        }
        if (obtainStyledAttributes.hasValue(Y.f28517s)) {
            setRepeatCount(obtainStyledAttributes.getInt(Y.f28517s, -1));
        }
        if (obtainStyledAttributes.hasValue(Y.f28519u)) {
            setSpeed(obtainStyledAttributes.getFloat(Y.f28519u, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(Y.f28505g)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(Y.f28505g, true));
        }
        if (obtainStyledAttributes.hasValue(Y.f28504f)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(Y.f28504f, false));
        }
        if (obtainStyledAttributes.hasValue(Y.f28507i)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(Y.f28507i));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(Y.f28512n));
        D(obtainStyledAttributes.getFloat(Y.f28514p, 0.0f), obtainStyledAttributes.hasValue(Y.f28514p));
        o(obtainStyledAttributes.getBoolean(Y.f28508j, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(Y.f28499a, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(Y.f28500b, true));
        if (obtainStyledAttributes.hasValue(Y.f28506h)) {
            k(new E3.e("**"), S.f28453N, new G3.c(new a0(AbstractC5596a.a(getContext(), obtainStyledAttributes.getResourceId(Y.f28506h, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(Y.f28516r)) {
            int i11 = Y.f28516r;
            Z z10 = Z.AUTOMATIC;
            int i12 = obtainStyledAttributes.getInt(i11, z10.ordinal());
            if (i12 >= Z.values().length) {
                i12 = z10.ordinal();
            }
            setRenderMode(Z.values()[i12]);
        }
        if (obtainStyledAttributes.hasValue(Y.f28501c)) {
            int i13 = Y.f28501c;
            EnumC2931a enumC2931a = EnumC2931a.AUTOMATIC;
            int i14 = obtainStyledAttributes.getInt(i13, enumC2931a.ordinal());
            if (i14 >= Z.values().length) {
                i14 = enumC2931a.ordinal();
            }
            setAsyncUpdates(EnumC2931a.values()[i14]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(Y.f28511m, false));
        if (obtainStyledAttributes.hasValue(Y.f28521w)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(Y.f28521w, false));
        }
        obtainStyledAttributes.recycle();
    }

    public boolean s() {
        return this.f28409h.d0();
    }

    public void setAnimation(int i10) {
        this.f28411j = i10;
        this.f28410i = null;
        setCompositionTask(q(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f28414n ? AbstractC2963t.B(getContext(), str) : AbstractC2963t.C(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f28409h.r0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f28409h.s0(z10);
    }

    public void setAsyncUpdates(EnumC2931a enumC2931a) {
        this.f28409h.t0(enumC2931a);
    }

    public void setCacheComposition(boolean z10) {
        this.f28414n = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f28409h.u0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f28409h.v0(z10);
    }

    public void setComposition(@NonNull C2940j c2940j) {
        if (AbstractC2935e.f28681a) {
            Objects.toString(c2940j);
        }
        this.f28409h.setCallback(this);
        this.f28412k = true;
        boolean w02 = this.f28409h.w0(c2940j);
        if (this.f28413l) {
            this.f28409h.l0();
        }
        this.f28412k = false;
        if (getDrawable() != this.f28409h || w02) {
            if (!w02) {
                B();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f28416p.iterator();
            while (it.hasNext()) {
                ((Q) it.next()).a(c2940j);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f28409h.x0(str);
    }

    public void setFailureListener(O o10) {
        this.f28407f = o10;
    }

    public void setFallbackResource(int i10) {
        this.f28408g = i10;
    }

    public void setFontAssetDelegate(AbstractC2932b abstractC2932b) {
        this.f28409h.y0(abstractC2932b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f28409h.z0(map);
    }

    public void setFrame(int i10) {
        this.f28409h.A0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f28409h.B0(z10);
    }

    public void setImageAssetDelegate(InterfaceC2933c interfaceC2933c) {
        this.f28409h.C0(interfaceC2933c);
    }

    public void setImageAssetsFolder(String str) {
        this.f28409h.D0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f28411j = 0;
        this.f28410i = null;
        m();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f28411j = 0;
        this.f28410i = null;
        m();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f28411j = 0;
        this.f28410i = null;
        m();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f28409h.E0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f28409h.F0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f28409h.H0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f28409h.J0(str);
    }

    public void setMinFrame(int i10) {
        this.f28409h.K0(i10);
    }

    public void setMinProgress(float f10) {
        this.f28409h.M0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f28409h.N0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f28409h.O0(z10);
    }

    public void setProgress(float f10) {
        D(f10, true);
    }

    public void setRenderMode(Z z10) {
        this.f28409h.Q0(z10);
    }

    public void setRepeatCount(int i10) {
        this.f28415o.add(a.SET_REPEAT_COUNT);
        this.f28409h.R0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f28415o.add(a.SET_REPEAT_MODE);
        this.f28409h.S0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f28409h.T0(z10);
    }

    public void setSpeed(float f10) {
        this.f28409h.U0(f10);
    }

    public void setTextDelegate(b0 b0Var) {
        this.f28409h.V0(b0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f28409h.W0(z10);
    }

    public void t() {
        this.f28413l = false;
        this.f28409h.k0();
    }

    public void u() {
        this.f28415o.add(a.PLAY_OPTION);
        this.f28409h.l0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        K k10;
        if (!this.f28412k && drawable == (k10 = this.f28409h) && k10.d0()) {
            t();
        } else if (!this.f28412k && (drawable instanceof K)) {
            K k11 = (K) drawable;
            if (k11.d0()) {
                k11.k0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f28415o.add(a.PLAY_OPTION);
        this.f28409h.o0();
    }

    public void w() {
        this.f28409h.p0();
    }

    public void x(InputStream inputStream, String str) {
        setCompositionTask(AbstractC2963t.q(inputStream, str));
    }

    public void y(ZipInputStream zipInputStream, String str) {
        setCompositionTask(AbstractC2963t.E(zipInputStream, str));
    }

    public void z(String str, String str2) {
        x(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f28409h.G0(str);
    }

    public void setMinFrame(String str) {
        this.f28409h.L0(str);
    }

    public void setAnimation(String str) {
        this.f28410i = str;
        this.f28411j = 0;
        setCompositionTask(p(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28405d = new c(this);
        this.f28406e = new b(this);
        this.f28408g = 0;
        this.f28409h = new K();
        this.f28412k = false;
        this.f28413l = false;
        this.f28414n = true;
        this.f28415o = new HashSet();
        this.f28416p = new HashSet();
        r(attributeSet, X.f28498a);
    }
}
