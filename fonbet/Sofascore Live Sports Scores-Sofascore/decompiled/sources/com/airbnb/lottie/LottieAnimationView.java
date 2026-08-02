package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
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
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.aja;
import defpackage.bl0;
import defpackage.c00;
import defpackage.cmb;
import defpackage.dmi;
import defpackage.ejg;
import defpackage.eq3;
import defpackage.gmb;
import defpackage.ihh;
import defpackage.ji2;
import defpackage.jmb;
import defpackage.klb;
import defpackage.lnb;
import defpackage.mjf;
import defpackage.mlb;
import defpackage.mmb;
import defpackage.myf;
import defpackage.nlb;
import defpackage.nmb;
import defpackage.omb;
import defpackage.or9;
import defpackage.p03;
import defpackage.pf8;
import defpackage.pkc;
import defpackage.plb;
import defpackage.qmb;
import defpackage.rlb;
import defpackage.smb;
import defpackage.tde;
import defpackage.tg3;
import defpackage.ulb;
import defpackage.wj9;
import defpackage.x8j;
import defpackage.yp8;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final klb n = new klb();
    public final nlb a;
    public final nlb b;
    public mmb c;
    public int d;
    public final gmb e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final HashSet k;
    public final HashSet l;
    public qmb m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String a;
        public int b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.a = new nlb(this, 1);
        this.b = new nlb(this, 0);
        this.d = 0;
        gmb gmbVar = new gmb();
        this.e = gmbVar;
        this.h = false;
        this.i = false;
        this.j = true;
        HashSet hashSet = new HashSet();
        this.k = hashSet;
        this.l = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mjf.a, R.attr.lottieAnimationViewStyle, 0);
        this.j = obtainStyledAttributes.getBoolean(4, true);
        boolean hasValue = obtainStyledAttributes.hasValue(16);
        boolean hasValue2 = obtainStyledAttributes.hasValue(11);
        boolean hasValue3 = obtainStyledAttributes.hasValue(21);
        if (hasValue && hasValue2) {
            a70.p("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            throw null;
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
            this.i = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            gmbVar.b.setRepeatCount(-1);
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
            hashSet.add(mlb.b);
        }
        gmbVar.u(f);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet2 = (HashSet) gmbVar.l.a;
        jmb jmbVar = jmb.a;
        boolean add = z ? hashSet2.add(jmbVar) : hashSet2.remove(jmbVar);
        if (gmbVar.a != null && add) {
            gmbVar.c();
        }
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            gmbVar.a(new aja("**"), nmb.I, new wj9(new ihh(eq3.q(obtainStyledAttributes.getResourceId(7, -1), getContext()).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i = obtainStyledAttributes.getInt(17, 0);
            setRenderMode(myf.values()[i >= myf.values().length ? 0 : i]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i2 = obtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(bl0.values()[i2 >= myf.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(qmb qmbVar) {
        omb ombVar = qmbVar.d;
        gmb gmbVar = this.e;
        if (ombVar != null && gmbVar == getDrawable() && gmbVar.a == ombVar.a) {
            return;
        }
        this.k.add(mlb.a);
        this.e.d();
        b();
        qmbVar.b(this.a);
        qmbVar.a(this.b);
        this.m = qmbVar;
    }

    public final void b() {
        qmb qmbVar = this.m;
        if (qmbVar != null) {
            nlb nlbVar = this.a;
            synchronized (qmbVar) {
                qmbVar.a.remove(nlbVar);
            }
            qmb qmbVar2 = this.m;
            nlb nlbVar2 = this.b;
            synchronized (qmbVar2) {
                qmbVar2.b.remove(nlbVar2);
            }
        }
    }

    public bl0 getAsyncUpdates() {
        bl0 bl0Var = this.e.L;
        return bl0Var != null ? bl0Var : bl0.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        bl0 bl0Var = this.e.L;
        if (bl0Var == null) {
            bl0Var = bl0.a;
        }
        return bl0Var == bl0.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.e.u;
    }

    public boolean getClipToCompositionBounds() {
        return this.e.n;
    }

    @Nullable
    public plb getComposition() {
        Drawable drawable = getDrawable();
        gmb gmbVar = this.e;
        if (drawable == gmbVar) {
            return gmbVar.a;
        }
        return null;
    }

    public long getDuration() {
        plb composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.e.b.h;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.e.h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.e.m;
    }

    public float getMaxFrame() {
        return this.e.b.b();
    }

    public float getMinFrame() {
        return this.e.b.c();
    }

    @Nullable
    public tde getPerformanceTracker() {
        plb plbVar = this.e.a;
        if (plbVar != null) {
            return plbVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.e.b.a();
    }

    public myf getRenderMode() {
        return this.e.w ? myf.c : myf.b;
    }

    public int getRepeatCount() {
        return this.e.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.e.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.e.b.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof gmb) {
            boolean z = ((gmb) drawable).w;
            myf myfVar = myf.c;
            if ((z ? myfVar : myf.b) == myfVar) {
                this.e.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        gmb gmbVar = this.e;
        if (drawable2 == gmbVar) {
            super.invalidateDrawable(gmbVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.i) {
            return;
        }
        this.e.k();
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
        this.f = savedState.a;
        HashSet hashSet = this.k;
        mlb mlbVar = mlb.a;
        if (!hashSet.contains(mlbVar) && !TextUtils.isEmpty(this.f)) {
            setAnimation(this.f);
        }
        this.g = savedState.b;
        if (!hashSet.contains(mlbVar) && (i = this.g) != 0) {
            setAnimation(i);
        }
        boolean contains = hashSet.contains(mlb.b);
        gmb gmbVar = this.e;
        if (!contains) {
            gmbVar.u(savedState.c);
        }
        mlb mlbVar2 = mlb.f;
        if (!hashSet.contains(mlbVar2) && savedState.d) {
            hashSet.add(mlbVar2);
            gmbVar.k();
        }
        if (!hashSet.contains(mlb.e)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!hashSet.contains(mlb.c)) {
            setRepeatMode(savedState.f);
        }
        if (hashSet.contains(mlb.d)) {
            return;
        }
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.f;
        savedState.b = this.g;
        gmb gmbVar = this.e;
        smb smbVar = gmbVar.b;
        smb smbVar2 = gmbVar.b;
        savedState.c = smbVar.a();
        if (gmbVar.isVisible()) {
            z = smbVar2.m;
        } else {
            int i = gmbVar.P;
            z = i == 2 || i == 3;
        }
        savedState.d = z;
        savedState.e = gmbVar.h;
        savedState.f = smbVar2.getRepeatMode();
        savedState.g = smbVar2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(String str) {
        qmb a;
        this.f = str;
        this.g = 0;
        int i = 1;
        if (isInEditMode()) {
            a = new qmb(new c00(4, this, str), true);
        } else {
            String str2 = null;
            if (this.j) {
                Context context = getContext();
                HashMap hashMap = ulb.a;
                String q = dmi.q("asset_", str);
                a = ulb.a(q, new rlb(context.getApplicationContext(), str, q, i), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = ulb.a;
                a = ulb.a(null, new rlb(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(a);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(ulb.a(null, new ji2(byteArrayInputStream, 7), new yp8(byteArrayInputStream, 10)));
    }

    public void setAnimationFromUrl(String str) {
        qmb a;
        int i = 0;
        String str2 = null;
        if (this.j) {
            Context context = getContext();
            HashMap hashMap = ulb.a;
            String q = dmi.q("url_", str);
            a = ulb.a(q, new rlb(context, str, q, i), null);
        } else {
            a = ulb.a(null, new rlb(getContext(), str, str2, i), null);
        }
        setCompositionTask(a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.e.s = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.e.t = z;
    }

    public void setAsyncUpdates(bl0 bl0Var) {
        this.e.L = bl0Var;
    }

    public void setCacheComposition(boolean z) {
        this.j = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        gmb gmbVar = this.e;
        if (z != gmbVar.u) {
            gmbVar.u = z;
            gmbVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        gmb gmbVar = this.e;
        if (z != gmbVar.n) {
            gmbVar.n = z;
            tg3 tg3Var = gmbVar.o;
            if (tg3Var != null) {
                tg3Var.L = z;
            }
            gmbVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull plb plbVar) {
        gmb gmbVar = this.e;
        gmbVar.setCallback(this);
        this.h = true;
        boolean n2 = gmbVar.n(plbVar);
        if (this.i) {
            gmbVar.k();
        }
        this.h = false;
        if (getDrawable() != gmbVar || n2) {
            if (!n2) {
                smb smbVar = gmbVar.b;
                boolean z = smbVar != null ? smbVar.m : false;
                setImageDrawable(null);
                setImageDrawable(gmbVar);
                if (z) {
                    gmbVar.m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.l.iterator();
            if (it.hasNext()) {
                throw lnb.i(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        p03 p03Var;
        gmb gmbVar = this.e;
        gmbVar.k = str;
        if (gmbVar.getCallback() == null) {
            p03Var = null;
        } else {
            p03 p03Var2 = gmbVar.i;
            if (p03Var2 == null) {
                p03Var2 = new p03(gmbVar.getCallback());
                gmbVar.i = p03Var2;
                String str2 = gmbVar.k;
                if (str2 != null) {
                    p03Var2.e = str2;
                }
            }
            p03Var = p03Var2;
        }
        if (p03Var != null) {
            p03Var.e = str;
        }
    }

    public void setFailureListener(@Nullable mmb mmbVar) {
        this.c = mmbVar;
    }

    public void setFallbackResource(int i) {
        this.d = i;
    }

    public void setFontAssetDelegate(pf8 pf8Var) {
        p03 p03Var = this.e.i;
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        gmb gmbVar = this.e;
        if (map == gmbVar.j) {
            return;
        }
        gmbVar.j = map;
        gmbVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.e.o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.e.d = z;
    }

    public void setImageAssetDelegate(or9 or9Var) {
        ejg ejgVar = this.e.g;
    }

    public void setImageAssetsFolder(String str) {
        this.e.h = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.g = 0;
        this.f = null;
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.g = 0;
        this.f = null;
        b();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.g = 0;
        this.f = null;
        b();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.e.m = z;
    }

    public void setMaxFrame(int i) {
        this.e.p(i);
    }

    public void setMaxProgress(float f) {
        gmb gmbVar = this.e;
        plb plbVar = gmbVar.a;
        if (plbVar == null) {
            gmbVar.f.add(new cmb(gmbVar, f, 0));
            return;
        }
        smb smbVar = gmbVar.b;
        smbVar.j(smbVar.j, pkc.f(plbVar.l, plbVar.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.e.r(str);
    }

    public void setMinFrame(int i) {
        this.e.s(i);
    }

    public void setMinProgress(float f) {
        gmb gmbVar = this.e;
        plb plbVar = gmbVar.a;
        if (plbVar == null) {
            gmbVar.f.add(new cmb(gmbVar, f, 1));
        } else {
            gmbVar.s((int) pkc.f(plbVar.l, plbVar.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        gmb gmbVar = this.e;
        if (gmbVar.r == z) {
            return;
        }
        gmbVar.r = z;
        tg3 tg3Var = gmbVar.o;
        if (tg3Var != null) {
            tg3Var.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        gmb gmbVar = this.e;
        gmbVar.q = z;
        plb plbVar = gmbVar.a;
        if (plbVar != null) {
            plbVar.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.k.add(mlb.b);
        this.e.u(f);
    }

    public void setRenderMode(myf myfVar) {
        gmb gmbVar = this.e;
        gmbVar.v = myfVar;
        gmbVar.e();
    }

    public void setRepeatCount(int i) {
        this.k.add(mlb.d);
        this.e.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.k.add(mlb.c);
        this.e.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.e.e = z;
    }

    public void setSpeed(float f) {
        this.e.b.d = f;
    }

    public void setTextDelegate(x8j x8jVar) {
        this.e.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.e.b.n = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        gmb gmbVar;
        boolean z = this.h;
        if (!z && drawable == (gmbVar = this.e)) {
            smb smbVar = gmbVar.b;
            if (smbVar == null ? false : smbVar.m) {
                this.i = false;
                gmbVar.j();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z && (drawable instanceof gmb)) {
            gmb gmbVar2 = (gmb) drawable;
            smb smbVar2 = gmbVar2.b;
            if (smbVar2 != null ? smbVar2.m : false) {
                gmbVar2.j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.e.q(str);
    }

    public void setMinFrame(String str) {
        this.e.t(str);
    }

    public void setAnimation(final int i) {
        qmb f;
        this.g = i;
        this.f = null;
        if (isInEditMode()) {
            f = new qmb(new Callable() { // from class: llb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    klb klbVar = LottieAnimationView.n;
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z = lottieAnimationView.j;
                    int i2 = i;
                    if (!z) {
                        return ulb.g(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return ulb.g(context, i2, ulb.l(i2, context));
                }
            }, true);
        } else if (this.j) {
            Context context = getContext();
            f = ulb.f(context, i, ulb.l(i, context));
        } else {
            f = ulb.f(getContext(), i, null);
        }
        setCompositionTask(f);
    }
}
