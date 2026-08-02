package com.airbnb.lottie;

import B5.A;
import B5.B;
import B5.EnumC2597a;
import B5.t;
import B5.u;
import B5.v;
import B5.w;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final t<Throwable> DEFAULT_FAILURE_LISTENER = new B5.e();
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private B5.g composition;
    private h<B5.g> compositionTask;
    private t<Throwable> failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final t<B5.g> loadedListener;
    private final g lottieDrawable;
    private final Set<u> lottieOnCompositionLoadedListeners;
    private final Set<c> userActionsTaken;
    private final t<Throwable> wrappedFailureListener;

    /* JADX INFO: Add missing generic type declarations: [T] */
    final class a<T> extends P5.c<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P5.e f57286c;

        a(P5.e eVar) {
            this.f57286c = eVar;
        }

        @Override // P5.c
        public final T a(P5.b<T> bVar) {
            return (T) this.f57286c.a(bVar);
        }
    }

    private static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f57287a;

        /* renamed from: b, reason: collision with root package name */
        int f57288b;

        /* renamed from: c, reason: collision with root package name */
        float f57289c;

        /* renamed from: d, reason: collision with root package name */
        boolean f57290d;

        /* renamed from: e, reason: collision with root package name */
        String f57291e;

        /* renamed from: f, reason: collision with root package name */
        int f57292f;

        /* renamed from: g, reason: collision with root package name */
        int f57293g;

        final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                b bVar = new b(parcel);
                bVar.f57287a = parcel.readString();
                bVar.f57289c = parcel.readFloat();
                bVar.f57290d = parcel.readInt() == 1;
                bVar.f57291e = parcel.readString();
                bVar.f57292f = parcel.readInt();
                bVar.f57293g = parcel.readInt();
                return bVar;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f57287a);
            parcel.writeFloat(this.f57289c);
            parcel.writeInt(this.f57290d ? 1 : 0);
            parcel.writeString(this.f57291e);
            parcel.writeInt(this.f57292f);
            parcel.writeInt(this.f57293g);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c PLAY_OPTION;
        public static final c SET_ANIMATION;
        public static final c SET_IMAGE_ASSETS;
        public static final c SET_PROGRESS;
        public static final c SET_REPEAT_COUNT;
        public static final c SET_REPEAT_MODE;

        static {
            c cVar = new c("SET_ANIMATION", 0);
            SET_ANIMATION = cVar;
            c cVar2 = new c("SET_PROGRESS", 1);
            SET_PROGRESS = cVar2;
            c cVar3 = new c("SET_REPEAT_MODE", 2);
            SET_REPEAT_MODE = cVar3;
            c cVar4 = new c("SET_REPEAT_COUNT", 3);
            SET_REPEAT_COUNT = cVar4;
            c cVar5 = new c("SET_IMAGE_ASSETS", 4);
            SET_IMAGE_ASSETS = cVar5;
            c cVar6 = new c("PLAY_OPTION", 5);
            PLAY_OPTION = cVar6;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    private static class d implements t<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f57294a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f57294a = new WeakReference<>(lottieAnimationView);
        }

        @Override // B5.t
        public final void onResult(Throwable th2) {
            Throwable th3 = th2;
            LottieAnimationView lottieAnimationView = this.f57294a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.fallbackResource != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (lottieAnimationView.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : lottieAnimationView.failureListener).onResult(th3);
        }
    }

    private static class e implements t<B5.g> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f57295a;

        public e(LottieAnimationView lottieAnimationView) {
            this.f57295a = new WeakReference<>(lottieAnimationView);
        }

        @Override // B5.t
        public final void onResult(B5.g gVar) {
            B5.g gVar2 = gVar;
            LottieAnimationView lottieAnimationView = this.f57295a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(gVar2);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new e(this);
        this.wrappedFailureListener = new d(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new g();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R.attr.lottieAnimationViewStyle);
    }

    private void cancelLoaderTask() {
        h<B5.g> hVar = this.compositionTask;
        if (hVar != null) {
            hVar.f(this.loadedListener);
            this.compositionTask.e(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.h();
    }

    private h<B5.g> fromAssets(final String str) {
        if (isInEditMode()) {
            return new h<>(new Callable() { // from class: B5.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    w lambda$fromAssets$2;
                    lambda$fromAssets$2 = LottieAnimationView.this.lambda$fromAssets$2(str);
                    return lambda$fromAssets$2;
                }
            }, true);
        }
        if (!this.cacheComposition) {
            return com.airbnb.lottie.a.d(getContext(), str, null);
        }
        Context context = getContext();
        int i11 = com.airbnb.lottie.a.f57299d;
        return com.airbnb.lottie.a.d(context, str, "asset_" + str);
    }

    private h<B5.g> fromRawRes(final int i11) {
        return isInEditMode() ? new h<>(new Callable() { // from class: B5.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w lambda$fromRawRes$1;
                lambda$fromRawRes$1 = LottieAnimationView.this.lambda$fromRawRes$1(i11);
                return lambda$fromRawRes$1;
            }
        }, true) : this.cacheComposition ? com.airbnb.lottie.a.j(i11, getContext()) : com.airbnb.lottie.a.k(getContext(), i11, null);
    }

    private void init(AttributeSet attributeSet, int i11) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, A.f2724a, i11, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(13);
        boolean hasValue2 = obtainStyledAttributes.hasValue(8);
        boolean hasValue3 = obtainStyledAttributes.hasValue(18);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(13, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(8);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(18)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(7, 0));
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(11, false)) {
            this.lottieDrawable.O(-1);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setRepeatMode(obtainStyledAttributes.getInt(16, 1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setRepeatCount(obtainStyledAttributes.getInt(15, -1));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            setSpeed(obtainStyledAttributes.getFloat(17, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(3, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(5));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(10));
        setProgressInternal(obtainStyledAttributes.getFloat(12, 0.0f), obtainStyledAttributes.hasValue(12));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(6, false));
        if (obtainStyledAttributes.hasValue(4)) {
            addValueCallback(new H5.e("**"), (H5.e) v.f2780F, (P5.c<H5.e>) new P5.c(new B(androidx.core.content.a.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(4, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            i iVar = i.AUTOMATIC;
            int i12 = obtainStyledAttributes.getInt(14, iVar.ordinal());
            if (i12 >= i.values().length) {
                i12 = iVar.ordinal();
            }
            setRenderMode(i.values()[i12]);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            EnumC2597a enumC2597a = EnumC2597a.AUTOMATIC;
            int i13 = obtainStyledAttributes.getInt(0, enumC2597a.ordinal());
            if (i13 >= i.values().length) {
                i13 = enumC2597a.ordinal();
            }
            setAsyncUpdates(EnumC2597a.values()[i13]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(9, false));
        if (obtainStyledAttributes.hasValue(19)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(19, false));
        }
        obtainStyledAttributes.recycle();
        g gVar = this.lottieDrawable;
        Context context = getContext();
        int i14 = O5.g.f19991f;
        gVar.R(Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w lambda$fromAssets$2(String str) throws Exception {
        if (!this.cacheComposition) {
            return com.airbnb.lottie.a.e(getContext(), str, null);
        }
        Context context = getContext();
        int i11 = com.airbnb.lottie.a.f57299d;
        return com.airbnb.lottie.a.e(context, str, "asset_" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$fromRawRes$1(int i11) throws Exception {
        return this.cacheComposition ? com.airbnb.lottie.a.l(i11, getContext()) : com.airbnb.lottie.a.m(getContext(), i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$0(Throwable th2) {
        int i11 = O5.g.f19991f;
        if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        O5.c.d("Unable to load composition.", th2);
    }

    private void setCompositionTask(h<B5.g> hVar) {
        this.userActionsTaken.add(c.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        hVar.d(this.loadedListener);
        hVar.c(this.wrappedFailureListener);
        this.compositionTask = hVar;
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.E();
        }
    }

    private void setProgressInternal(float f7, boolean z11) {
        if (z11) {
            this.userActionsTaken.add(c.SET_PROGRESS);
        }
        this.lottieDrawable.M(f7);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.c(animatorListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull u uVar) {
        B5.g gVar = this.composition;
        if (gVar != null) {
            uVar.a(gVar);
        }
        return this.lottieOnCompositionLoadedListeners.add(uVar);
    }

    public <T> void addValueCallback(H5.e eVar, T t2, P5.c<T> cVar) {
        this.lottieDrawable.d(eVar, t2, cVar);
    }

    public void cancelAnimation() {
        this.userActionsTaken.add(c.PLAY_OPTION);
        this.lottieDrawable.g();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z11) {
        this.lottieDrawable.m(z11);
    }

    public float getProgress() {
        return this.lottieDrawable.t();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof g) && ((g) drawable).u() == i.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        g gVar = this.lottieDrawable;
        if (drawable2 == gVar) {
            super.invalidateDrawable(gVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.B();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.animationName = bVar.f57287a;
        Set<c> set = this.userActionsTaken;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = bVar.f57288b;
        if (!this.userActionsTaken.contains(cVar) && (i11 = this.animationResId) != 0) {
            setAnimation(i11);
        }
        if (!this.userActionsTaken.contains(c.SET_PROGRESS)) {
            setProgressInternal(bVar.f57289c, false);
        }
        if (!this.userActionsTaken.contains(c.PLAY_OPTION) && bVar.f57290d) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f57291e);
        }
        if (!this.userActionsTaken.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.f57292f);
        }
        if (this.userActionsTaken.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bVar.f57293g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f57287a = this.animationName;
        bVar.f57288b = this.animationResId;
        bVar.f57289c = this.lottieDrawable.t();
        bVar.f57290d = this.lottieDrawable.z();
        bVar.f57291e = this.lottieDrawable.r();
        bVar.f57292f = this.lottieDrawable.w();
        bVar.f57293g = this.lottieDrawable.v();
        return bVar;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.A();
    }

    public void playAnimation() {
        this.userActionsTaken.add(c.PLAY_OPTION);
        this.lottieDrawable.B();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.C(animatorListener);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(c.PLAY_OPTION);
        this.lottieDrawable.E();
    }

    public void setAnimation(int i11) {
        this.animationResId = i11;
        this.animationName = null;
        setCompositionTask(fromRawRes(i11));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        h<B5.g> n11;
        if (this.cacheComposition) {
            Context context = getContext();
            int i11 = com.airbnb.lottie.a.f57299d;
            n11 = com.airbnb.lottie.a.n(context, str, "url_" + str);
        } else {
            n11 = com.airbnb.lottie.a.n(getContext(), str, null);
        }
        setCompositionTask(n11);
    }

    public void setAsyncUpdates(EnumC2597a enumC2597a) {
        this.lottieDrawable.F(enumC2597a);
    }

    public void setClipToCompositionBounds(boolean z11) {
        this.lottieDrawable.G(z11);
    }

    public void setComposition(@NonNull B5.g gVar) {
        int i11 = B5.c.f2729d;
        this.lottieDrawable.setCallback(this);
        this.composition = gVar;
        this.ignoreUnschedule = true;
        boolean H11 = this.lottieDrawable.H(gVar);
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || H11) {
            if (!H11) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<u> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                it.next().a(gVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.lottieDrawable.I(str);
    }

    public void setFailureListener(t<Throwable> tVar) {
        this.failureListener = tVar;
    }

    public void setFallbackResource(int i11) {
        this.fallbackResource = i11;
    }

    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.lottieDrawable.K(z11);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.L(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        cancelLoaderTask();
        super.setImageResource(i11);
    }

    public void setRenderMode(i iVar) {
        this.lottieDrawable.N(iVar);
    }

    public void setRepeatCount(int i11) {
        this.userActionsTaken.add(c.SET_REPEAT_COUNT);
        this.lottieDrawable.O(i11);
    }

    public void setRepeatMode(int i11) {
        this.userActionsTaken.add(c.SET_REPEAT_MODE);
        this.lottieDrawable.P(i11);
    }

    public void setSpeed(float f7) {
        this.lottieDrawable.Q(f7);
    }

    public void setUseCompositionFrameRate(boolean z11) {
        this.lottieDrawable.S(z11);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        g gVar;
        if (!this.ignoreUnschedule && drawable == (gVar = this.lottieDrawable) && gVar.y()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof g)) {
            g gVar2 = (g) drawable;
            if (gVar2.y()) {
                gVar2.A();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public <T> void addValueCallback(H5.e eVar, T t2, P5.e<T> eVar2) {
        this.lottieDrawable.d(eVar, t2, new a(eVar2));
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(com.airbnb.lottie.a.n(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(com.airbnb.lottie.a.f(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new e(this);
        this.wrappedFailureListener = new d(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new g();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.loadedListener = new e(this);
        this.wrappedFailureListener = new d(this);
        this.fallbackResource = 0;
        this.lottieDrawable = new g();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i11);
    }
}
