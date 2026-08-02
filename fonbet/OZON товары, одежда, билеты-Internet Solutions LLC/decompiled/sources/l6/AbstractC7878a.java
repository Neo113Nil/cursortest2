package l6;

import T5.m;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import c6.l;
import c6.n;
import c6.o;
import c6.q;
import c6.s;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e6.C6309g;
import java.util.Map;
import l6.AbstractC7878a;
import o6.C8651c;
import p6.C8862b;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7878a<T extends AbstractC7878a<T>> implements Cloneable {
    private int errorId;
    private Drawable errorPlaceholder;
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isLocked;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    private Drawable placeholderDrawable;
    private int placeholderId;
    private Resources.Theme theme;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;
    private float sizeMultiplier = 1.0f;

    @NonNull
    private V5.k diskCacheStrategy = V5.k.f28206c;

    @NonNull
    private com.bumptech.glide.i priority = com.bumptech.glide.i.NORMAL;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;

    @NonNull
    private T5.f signature = C8651c.a();
    private boolean isTransformationAllowed = true;

    @NonNull
    private T5.i options = new T5.i();

    @NonNull
    private Map<Class<?>, m<?>> transformations = new C8862b();

    @NonNull
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    private static boolean isSet(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    @NonNull
    private T optionalScaleOnlyTransform(@NonNull n nVar, @NonNull m<Bitmap> mVar) {
        return scaleOnlyTransform(nVar, mVar, false);
    }

    @NonNull
    private T scaleOnlyTransform(@NonNull n nVar, @NonNull m<Bitmap> mVar, boolean z11) {
        T transform = z11 ? transform(nVar, mVar) : optionalTransform(nVar, mVar);
        transform.isScaleOnlyOrNoTransform = true;
        return transform;
    }

    private T self() {
        return this;
    }

    @NonNull
    public T apply(@NonNull AbstractC7878a<?> abstractC7878a) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().apply(abstractC7878a);
        }
        if (isSet(abstractC7878a.fields, 2)) {
            this.sizeMultiplier = abstractC7878a.sizeMultiplier;
        }
        if (isSet(abstractC7878a.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = abstractC7878a.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(abstractC7878a.fields, 1048576)) {
            this.useAnimationPool = abstractC7878a.useAnimationPool;
        }
        if (isSet(abstractC7878a.fields, 4)) {
            this.diskCacheStrategy = abstractC7878a.diskCacheStrategy;
        }
        if (isSet(abstractC7878a.fields, 8)) {
            this.priority = abstractC7878a.priority;
        }
        if (isSet(abstractC7878a.fields, 16)) {
            this.errorPlaceholder = abstractC7878a.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(abstractC7878a.fields, 32)) {
            this.errorId = abstractC7878a.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(abstractC7878a.fields, 64)) {
            this.placeholderDrawable = abstractC7878a.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(abstractC7878a.fields, UserVerificationMethods.USER_VERIFY_PATTERN)) {
            this.placeholderId = abstractC7878a.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(abstractC7878a.fields, 256)) {
            this.isCacheable = abstractC7878a.isCacheable;
        }
        if (isSet(abstractC7878a.fields, UserVerificationMethods.USER_VERIFY_NONE)) {
            this.overrideWidth = abstractC7878a.overrideWidth;
            this.overrideHeight = abstractC7878a.overrideHeight;
        }
        if (isSet(abstractC7878a.fields, UserVerificationMethods.USER_VERIFY_ALL)) {
            this.signature = abstractC7878a.signature;
        }
        if (isSet(abstractC7878a.fields, 4096)) {
            this.resourceClass = abstractC7878a.resourceClass;
        }
        if (isSet(abstractC7878a.fields, 8192)) {
            this.fallbackDrawable = abstractC7878a.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(abstractC7878a.fields, 16384)) {
            this.fallbackId = abstractC7878a.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(abstractC7878a.fields, 32768)) {
            this.theme = abstractC7878a.theme;
        }
        if (isSet(abstractC7878a.fields, 65536)) {
            this.isTransformationAllowed = abstractC7878a.isTransformationAllowed;
        }
        if (isSet(abstractC7878a.fields, 131072)) {
            this.isTransformationRequired = abstractC7878a.isTransformationRequired;
        }
        if (isSet(abstractC7878a.fields, 2048)) {
            this.transformations.putAll(abstractC7878a.transformations);
            this.isScaleOnlyOrNoTransform = abstractC7878a.isScaleOnlyOrNoTransform;
        }
        if (isSet(abstractC7878a.fields, 524288)) {
            this.onlyRetrieveFromCache = abstractC7878a.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i11 = this.fields;
            this.isTransformationRequired = false;
            this.fields = i11 & (-133121);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= abstractC7878a.fields;
        this.options.b(abstractC7878a.options);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return lock();
    }

    @NonNull
    public T circleCrop() {
        return transform(n.f56564d, new l());
    }

    @NonNull
    public T decode(@NonNull Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().decode(cls);
        }
        p6.k.c(cls, "Argument must not be null");
        this.resourceClass = cls;
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T diskCacheStrategy(@NonNull V5.k kVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().diskCacheStrategy(kVar);
        }
        p6.k.c(kVar, "Argument must not be null");
        this.diskCacheStrategy = kVar;
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T downsample(@NonNull n nVar) {
        T5.h hVar = n.f56568h;
        p6.k.c(nVar, "Argument must not be null");
        return set(hVar, nVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC7878a) {
            return isEquivalentTo((AbstractC7878a) obj);
        }
        return false;
    }

    @NonNull
    public T fallback(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().fallback(i11);
        }
        this.fallbackId = i11;
        int i12 = this.fields | 16384;
        this.fallbackDrawable = null;
        this.fields = i12 & (-8193);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T format(@NonNull T5.b bVar) {
        p6.k.b(bVar);
        return (T) set(o.f56570f, bVar).set(g6.i.f63921a, bVar);
    }

    @NonNull
    public final V5.k getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    @NonNull
    public final T5.i getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    @NonNull
    public final com.bumptech.glide.i getPriority() {
        return this.priority;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    @NonNull
    public final T5.f getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    @NonNull
    public final Map<Class<?>, m<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        float f7 = this.sizeMultiplier;
        int i11 = p6.l.f80283d;
        return p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.g(this.onlyRetrieveFromCache ? 1 : 0, p6.l.g(this.useUnlimitedSourceGeneratorsPool ? 1 : 0, p6.l.g(this.isTransformationAllowed ? 1 : 0, p6.l.g(this.isTransformationRequired ? 1 : 0, p6.l.g(this.overrideWidth, p6.l.g(this.overrideHeight, p6.l.g(this.isCacheable ? 1 : 0, p6.l.h(p6.l.g(this.fallbackId, p6.l.h(p6.l.g(this.placeholderId, p6.l.h(p6.l.g(this.errorId, p6.l.g(Float.floatToIntBits(f7), 17)), this.errorPlaceholder)), this.placeholderDrawable)), this.fallbackDrawable)))))))), this.diskCacheStrategy), this.priority), this.options), this.transformations), this.resourceClass), this.signature), this.theme);
    }

    protected final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isEquivalentTo(AbstractC7878a<?> abstractC7878a) {
        return Float.compare(abstractC7878a.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == abstractC7878a.errorId && p6.l.b(this.errorPlaceholder, abstractC7878a.errorPlaceholder) && this.placeholderId == abstractC7878a.placeholderId && p6.l.b(this.placeholderDrawable, abstractC7878a.placeholderDrawable) && this.fallbackId == abstractC7878a.fallbackId && p6.l.b(this.fallbackDrawable, abstractC7878a.fallbackDrawable) && this.isCacheable == abstractC7878a.isCacheable && this.overrideHeight == abstractC7878a.overrideHeight && this.overrideWidth == abstractC7878a.overrideWidth && this.isTransformationRequired == abstractC7878a.isTransformationRequired && this.isTransformationAllowed == abstractC7878a.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == abstractC7878a.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == abstractC7878a.onlyRetrieveFromCache && this.diskCacheStrategy.equals(abstractC7878a.diskCacheStrategy) && this.priority == abstractC7878a.priority && this.options.equals(abstractC7878a.options) && this.transformations.equals(abstractC7878a.transformations) && this.resourceClass.equals(abstractC7878a.resourceClass) && p6.l.b(this.signature, abstractC7878a.signature) && p6.l.b(this.theme, abstractC7878a.theme);
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isValidOverride() {
        return p6.l.i(this.overrideWidth, this.overrideHeight);
    }

    @NonNull
    public T lock() {
        this.isLocked = true;
        return self();
    }

    @NonNull
    public T onlyRetrieveFromCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().onlyRetrieveFromCache(z11);
        }
        this.onlyRetrieveFromCache = z11;
        this.fields |= 524288;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T optionalCenterCrop() {
        return optionalTransform(n.f56565e, new c6.j());
    }

    @NonNull
    public T optionalCenterInside() {
        return optionalScaleOnlyTransform(n.f56564d, new c6.k());
    }

    @NonNull
    public T optionalFitCenter() {
        return optionalScaleOnlyTransform(n.f56563c, new s());
    }

    @NonNull
    final T optionalTransform(@NonNull n nVar, @NonNull m<Bitmap> mVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().optionalTransform(nVar, mVar);
        }
        downsample(nVar);
        return transform(mVar, false);
    }

    @NonNull
    public T override(int i11, int i12) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().override(i11, i12);
        }
        this.overrideWidth = i11;
        this.overrideHeight = i12;
        this.fields |= UserVerificationMethods.USER_VERIFY_NONE;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T placeholder(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().placeholder(i11);
        }
        this.placeholderId = i11;
        int i12 = this.fields | UserVerificationMethods.USER_VERIFY_PATTERN;
        this.placeholderDrawable = null;
        this.fields = i12 & (-65);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T priority(@NonNull com.bumptech.glide.i iVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().priority(iVar);
        }
        p6.k.c(iVar, "Argument must not be null");
        this.priority = iVar;
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    T removeOption(@NonNull T5.h<?> hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().removeOption(hVar);
        }
        this.options.c(hVar);
        return selfOrThrowIfLocked();
    }

    @NonNull
    protected final T selfOrThrowIfLocked() {
        if (this.isLocked) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return self();
    }

    @NonNull
    public <Y> T set(@NonNull T5.h<Y> hVar, @NonNull Y y11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().set(hVar, y11);
        }
        p6.k.b(hVar);
        p6.k.b(y11);
        this.options.d(hVar, y11);
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T signature(@NonNull T5.f fVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().signature(fVar);
        }
        p6.k.c(fVar, "Argument must not be null");
        this.signature = fVar;
        this.fields |= UserVerificationMethods.USER_VERIFY_ALL;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T sizeMultiplier(float f7) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().sizeMultiplier(f7);
        }
        if (f7 < 0.0f || f7 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f7;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T skipMemoryCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().skipMemoryCache(true);
        }
        this.isCacheable = !z11;
        this.fields |= 256;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public T theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().theme(theme);
        }
        this.theme = theme;
        if (theme != null) {
            this.fields |= 32768;
            return set(C6309g.f62024b, theme);
        }
        this.fields &= -32769;
        return removeOption(C6309g.f62024b);
    }

    @NonNull
    final T transform(@NonNull n nVar, @NonNull m<Bitmap> mVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().transform(nVar, mVar);
        }
        downsample(nVar);
        return transform(mVar);
    }

    @NonNull
    public T useAnimationPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().useAnimationPool(z11);
        }
        this.useAnimationPool = z11;
        this.fields |= 1048576;
        return selfOrThrowIfLocked();
    }

    private boolean isSet(int i11) {
        return isSet(this.fields, i11);
    }

    @Override // 
    /* renamed from: clone */
    public T mo17clone() {
        try {
            T t2 = (T) super.clone();
            T5.i iVar = new T5.i();
            t2.options = iVar;
            iVar.b(this.options);
            C8862b c8862b = new C8862b();
            t2.transformations = c8862b;
            c8862b.putAll(this.transformations);
            t2.isLocked = false;
            t2.isAutoCloneEnabled = false;
            return t2;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    @NonNull
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull m<Y> mVar) {
        return transform(cls, mVar, false);
    }

    @NonNull
    public T transform(@NonNull m<Bitmap> mVar) {
        return transform(mVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    T transform(@NonNull m<Bitmap> mVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().transform(mVar, z11);
        }
        q qVar = new q(mVar, z11);
        transform(Bitmap.class, mVar, z11);
        transform(Drawable.class, qVar, z11);
        transform(BitmapDrawable.class, qVar, z11);
        transform(g6.c.class, new g6.f(mVar), z11);
        return selfOrThrowIfLocked();
    }

    @NonNull
    <Y> T transform(@NonNull Class<Y> cls, @NonNull m<Y> mVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo17clone().transform(cls, mVar, z11);
        }
        p6.k.b(cls);
        p6.k.b(mVar);
        this.transformations.put(cls, mVar);
        int i11 = this.fields;
        this.isTransformationAllowed = true;
        this.fields = 67584 | i11;
        this.isScaleOnlyOrNoTransform = false;
        if (z11) {
            this.fields = i11 | 198656;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }
}
