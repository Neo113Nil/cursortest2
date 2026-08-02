package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import xsna.a900;
import xsna.anj;
import xsna.d700;
import xsna.e700;
import xsna.ful;
import xsna.g800;
import xsna.i700;
import xsna.ix90;
import xsna.k800;
import xsna.ls20;
import xsna.ofw;
import xsna.p4s;
import xsna.q4s;
import xsna.q700;
import xsna.r800;
import xsna.rdo0;
import xsna.s800;
import xsna.sfw;
import xsna.t800;
import xsna.tky;
import xsna.u800;
import xsna.udy;
import xsna.upj0;
import xsna.w800;
import xsna.z700;
import xsna.z800;
import xsna.zzd;

/* loaded from: classes12.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final e700 o = new e700();
    public final c b;
    public final b c;

    @Nullable
    public r800<Throwable> d;
    public int e;
    public final k800 f;
    public String g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final HashSet l;
    public final HashSet m;

    @Nullable
    public w800<i700> n;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String b;
        public int c;
        public float d;
        public boolean e;
        public String f;
        public int g;
        public int h;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = parcel.readString();
                savedState.d = parcel.readFloat();
                savedState.e = parcel.readInt() == 1;
                savedState.f = parcel.readString();
                savedState.g = parcel.readInt();
                savedState.h = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.b);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a PLAY_OPTION;
        public static final a SET_ANIMATION;
        public static final a SET_IMAGE_ASSETS;
        public static final a SET_PROGRESS;
        public static final a SET_REPEAT_COUNT;
        public static final a SET_REPEAT_MODE;

        static {
            a aVar = new a("SET_ANIMATION", 0);
            SET_ANIMATION = aVar;
            a aVar2 = new a("SET_PROGRESS", 1);
            SET_PROGRESS = aVar2;
            a aVar3 = new a("SET_REPEAT_MODE", 2);
            SET_REPEAT_MODE = aVar3;
            a aVar4 = new a("SET_REPEAT_COUNT", 3);
            SET_REPEAT_COUNT = aVar4;
            a aVar5 = new a("SET_IMAGE_ASSETS", 4);
            SET_IMAGE_ASSETS = aVar5;
            a aVar6 = new a("PLAY_OPTION", 5);
            PLAY_OPTION = aVar6;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static class b implements r800<Throwable> {
        public final WeakReference<LottieAnimationView> a;

        public b(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // xsna.r800
        public final void onResult(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i = lottieAnimationView.e;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            r800 r800Var = lottieAnimationView.d;
            if (r800Var == null) {
                r800Var = LottieAnimationView.o;
            }
            r800Var.onResult(th2);
        }
    }

    public static class c implements r800<i700> {
        public final WeakReference<LottieAnimationView> a;

        public c(LottieAnimationView lottieAnimationView) {
            this.a = new WeakReference<>(lottieAnimationView);
        }

        @Override // xsna.r800
        public final void onResult(i700 i700Var) {
            i700 i700Var2 = i700Var;
            LottieAnimationView lottieAnimationView = this.a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(i700Var2);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.b = new c(this);
        this.c = new b(this);
        this.e = 0;
        this.f = new k800();
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = new HashSet();
        this.m = new HashSet();
        c0(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(w800<i700> w800Var) {
        u800<i700> u800Var = w800Var.d;
        k800 k800Var = this.f;
        if (u800Var != null && k800Var == getDrawable() && k800Var.b == u800Var.a) {
            return;
        }
        this.l.add(a.SET_ANIMATION);
        this.f.e();
        b0();
        w800Var.b(this.b);
        w800Var.a(this.c);
        this.n = w800Var;
    }

    public final void U(Animator.AnimatorListener animatorListener) {
        this.f.c.addListener(animatorListener);
    }

    public final void V(udy udyVar, ColorFilter colorFilter, a900 a900Var) {
        this.f.a(udyVar, colorFilter, a900Var);
    }

    public final void W() {
        this.j = false;
        this.l.add(a.PLAY_OPTION);
        this.f.d();
    }

    public final void b0() {
        w800<i700> w800Var = this.n;
        if (w800Var != null) {
            c cVar = this.b;
            synchronized (w800Var) {
                w800Var.a.remove(cVar);
            }
            w800<i700> w800Var2 = this.n;
            b bVar = this.c;
            synchronized (w800Var2) {
                w800Var2.b.remove(bVar);
            }
        }
    }

    public final void c0(@Nullable AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, i, 0);
        this.k = obtainStyledAttributes.getBoolean(4, true);
        boolean hasValue = obtainStyledAttributes.hasValue(16);
        boolean hasValue2 = obtainStyledAttributes.hasValue(11);
        boolean hasValue3 = obtainStyledAttributes.hasValue(21);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(10, 0));
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.j = true;
        }
        boolean z = obtainStyledAttributes.getBoolean(14, false);
        k800 k800Var = this.f;
        if (z) {
            k800Var.c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(19)) {
            setRepeatMode(obtainStyledAttributes.getInt(19, 1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setRepeatCount(obtainStyledAttributes.getInt(18, -1));
        }
        if (obtainStyledAttributes.hasValue(20)) {
            setSpeed(obtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(6, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(5, false));
        }
        if (obtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(13));
        boolean hasValue4 = obtainStyledAttributes.hasValue(15);
        float f = obtainStyledAttributes.getFloat(15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (hasValue4) {
            this.l.add(a.SET_PROGRESS);
        }
        k800Var.B(f);
        k800Var.i(LottieFeatureFlag.MergePathsApi19, obtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            V(new udy("**"), t800.I, new a900(new upj0(anj.b(obtainStyledAttributes.getResourceId(7, -1), getContext()).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i2 = obtainStyledAttributes.getInt(17, renderMode.ordinal());
            if (i2 >= RenderMode.values().length) {
                i2 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i2]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int i3 = obtainStyledAttributes.getInt(2, asyncUpdates.ordinal());
            if (i3 >= RenderMode.values().length) {
                i3 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.f.O;
        return asyncUpdates != null ? asyncUpdates : tky.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        AsyncUpdates asyncUpdates = this.f.O;
        if (asyncUpdates == null) {
            asyncUpdates = tky.a;
        }
        return asyncUpdates == AsyncUpdates.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f.x;
    }

    public boolean getClipToCompositionBounds() {
        return this.f.q;
    }

    @Nullable
    public i700 getComposition() {
        Drawable drawable = getDrawable();
        k800 k800Var = this.f;
        if (drawable == k800Var) {
            return k800Var.b;
        }
        return null;
    }

    public long getDuration() {
        i700 composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f.c.i;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f.j;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f.p;
    }

    public float getMaxFrame() {
        return this.f.c.j();
    }

    public float getMinFrame() {
        return this.f.c.k();
    }

    @Nullable
    public ix90 getPerformanceTracker() {
        i700 i700Var = this.f.b;
        if (i700Var != null) {
            return i700Var.a;
        }
        return null;
    }

    public float getProgress() {
        return this.f.c.i();
    }

    public RenderMode getRenderMode() {
        return this.f.z ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f.c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f.c.getRepeatMode();
    }

    public float getSpeed() {
        return this.f.c.e;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof k800) {
            if ((((k800) drawable).z ? RenderMode.SOFTWARE : RenderMode.HARDWARE) == RenderMode.SOFTWARE) {
                this.f.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        k800 k800Var = this.f;
        if (drawable2 == k800Var) {
            super.invalidateDrawable(k800Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void l0() {
        this.j = false;
        this.f.o();
    }

    public void m0() {
        this.l.add(a.PLAY_OPTION);
        this.f.p();
    }

    public final void o0() {
        this.f.c.removeAllListeners();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.j) {
            return;
        }
        this.f.p();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.g = savedState.b;
        a aVar = a.SET_ANIMATION;
        HashSet hashSet = this.l;
        if (!hashSet.contains(aVar) && !TextUtils.isEmpty(this.g)) {
            setAnimation(this.g);
        }
        this.h = savedState.c;
        if (!hashSet.contains(aVar) && (i = this.h) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(a.SET_PROGRESS)) {
            this.f.B(savedState.d);
        }
        if (!hashSet.contains(a.PLAY_OPTION) && savedState.e) {
            m0();
        }
        if (!hashSet.contains(a.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f);
        }
        if (!hashSet.contains(a.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.g);
        }
        if (hashSet.contains(a.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.g;
        savedState.c = this.h;
        k800 k800Var = this.f;
        z800 z800Var = k800Var.c;
        z800 z800Var2 = k800Var.c;
        savedState.d = z800Var.i();
        if (k800Var.isVisible()) {
            z = z800Var2.n;
        } else {
            k800.b bVar = k800Var.g;
            z = bVar == k800.b.PLAY || bVar == k800.b.RESUME;
        }
        savedState.e = z;
        savedState.f = k800Var.j;
        savedState.g = z800Var2.getRepeatMode();
        savedState.h = z800Var2.getRepeatCount();
        return savedState;
    }

    public final void p0() {
        this.l.add(a.PLAY_OPTION);
        this.f.r();
    }

    public final void q0(ByteArrayInputStream byteArrayInputStream, @Nullable String str) {
        setCompositionTask(q700.e(byteArrayInputStream, str));
    }

    public final void s0(String str, @Nullable String str2) {
        setCompositionTask(q700.a(str2, new ful(getContext(), str, str2, 1), null));
    }

    public void setAnimation(final int i) {
        w800<i700> h;
        this.h = i;
        this.g = null;
        if (isInEditMode()) {
            h = new w800<>(new Callable() { // from class: xsna.f700
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z = lottieAnimationView.k;
                    int i2 = i;
                    if (!z) {
                        return q700.i(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return q700.i(context, i2, q700.o(i2, context));
                }
            }, true);
        } else if (this.k) {
            Context context = getContext();
            h = q700.h(context, i, q700.o(i, context));
        } else {
            h = q700.h(getContext(), i, null);
        }
        setCompositionTask(h);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        q0(new ByteArrayInputStream(str.getBytes()), null);
    }

    public void setAnimationFromUrl(String str) {
        w800<i700> a2;
        if (this.k) {
            a2 = q700.j(getContext(), str);
        } else {
            a2 = q700.a(null, new ful(getContext(), str, null, 1), null);
        }
        setCompositionTask(a2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f.v = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.f.w = z;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.f.O = asyncUpdates;
    }

    public void setCacheComposition(boolean z) {
        this.k = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        k800 k800Var = this.f;
        if (z != k800Var.x) {
            k800Var.x = z;
            k800Var.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        k800 k800Var = this.f;
        if (z != k800Var.q) {
            k800Var.q = z;
            com.airbnb.lottie.model.layer.b bVar = k800Var.r;
            if (bVar != null) {
                bVar.L = z;
            }
            k800Var.invalidateSelf();
        }
    }

    public void setComposition(@NonNull i700 i700Var) {
        AsyncUpdates asyncUpdates = tky.a;
        k800 k800Var = this.f;
        k800Var.setCallback(this);
        this.i = true;
        boolean s = k800Var.s(i700Var);
        if (this.j) {
            k800Var.p();
        }
        this.i = false;
        if (getDrawable() != k800Var || s) {
            if (!s) {
                boolean m = k800Var.m();
                setImageDrawable(null);
                setImageDrawable(k800Var);
                if (m) {
                    k800Var.r();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((s800) it.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        k800 k800Var = this.f;
        k800Var.n = str;
        q4s l = k800Var.l();
        if (l != null) {
            l.e = str;
        }
    }

    public void setFailureListener(@Nullable r800<Throwable> r800Var) {
        this.d = r800Var;
    }

    public void setFallbackResource(int i) {
        this.e = i;
    }

    public void setFontAssetDelegate(p4s p4sVar) {
        q4s q4sVar = this.f.l;
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        k800 k800Var = this.f;
        if (map == k800Var.m) {
            return;
        }
        k800Var.m = map;
        k800Var.invalidateSelf();
    }

    public void setFrame(int i) {
        this.f.t(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f.e = z;
    }

    public void setImageAssetDelegate(ofw ofwVar) {
        k800 k800Var = this.f;
        k800Var.k = ofwVar;
        sfw sfwVar = k800Var.i;
        if (sfwVar != null) {
            sfwVar.c = ofwVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f.j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.h = 0;
        this.g = null;
        b0();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.h = 0;
        this.g = null;
        b0();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.h = 0;
        this.g = null;
        b0();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f.p = z;
    }

    public void setMaxFrame(int i) {
        this.f.u(i);
    }

    public void setMaxProgress(float f) {
        k800 k800Var = this.f;
        i700 i700Var = k800Var.b;
        if (i700Var == null) {
            k800Var.h.add(new z700(k800Var, f));
            return;
        }
        z800 z800Var = k800Var.c;
        z800Var.o(z800Var.k, ls20.f(i700Var.l, i700Var.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.f.x(str);
    }

    public void setMinFrame(int i) {
        this.f.z(i);
    }

    public void setMinProgress(float f) {
        k800 k800Var = this.f;
        i700 i700Var = k800Var.b;
        if (i700Var == null) {
            k800Var.h.add(new g800(k800Var, f));
        } else {
            k800Var.z((int) ls20.f(i700Var.l, i700Var.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        k800 k800Var = this.f;
        if (k800Var.u == z) {
            return;
        }
        k800Var.u = z;
        com.airbnb.lottie.model.layer.b bVar = k800Var.r;
        if (bVar != null) {
            bVar.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        k800 k800Var = this.f;
        k800Var.t = z;
        i700 i700Var = k800Var.b;
        if (i700Var != null) {
            i700Var.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.l.add(a.SET_PROGRESS);
        this.f.B(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        k800 k800Var = this.f;
        k800Var.y = renderMode;
        k800Var.f();
    }

    public void setRepeatCount(int i) {
        this.l.add(a.SET_REPEAT_COUNT);
        this.f.c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.l.add(a.SET_REPEAT_MODE);
        this.f.c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f.f = z;
    }

    public void setSpeed(float f) {
        this.f.c.e = f;
    }

    public void setTextDelegate(rdo0 rdo0Var) {
        this.f.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f.c.o = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        k800 k800Var;
        if (!this.i && drawable == (k800Var = this.f) && k800Var.m()) {
            l0();
        } else if (!this.i && (drawable instanceof k800)) {
            k800 k800Var2 = (k800) drawable;
            if (k800Var2.m()) {
                k800Var2.o();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f.v(str);
    }

    public void setMinFrame(String str) {
        this.f.A(str);
    }

    public void setAnimation(String str) {
        w800<i700> a2;
        this.g = str;
        int i = 0;
        this.h = 0;
        if (isInEditMode()) {
            a2 = new w800<>(new d700(i, this, str), true);
        } else if (this.k) {
            a2 = q700.b(getContext(), str);
        } else {
            Context context = getContext();
            HashMap hashMap = q700.a;
            a2 = q700.a(null, new zzd(context.getApplicationContext(), str, null), null);
        }
        setCompositionTask(a2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new c(this);
        this.c = new b(this);
        this.e = 0;
        this.f = new k800();
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = new HashSet();
        this.m = new HashSet();
        c0(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new c(this);
        this.c = new b(this);
        this.e = 0;
        this.f = new k800();
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = new HashSet();
        this.m = new HashSet();
        c0(attributeSet, 0);
    }
}
