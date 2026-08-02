package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import l6.AbstractC7878a;
import l6.C7879b;
import l6.InterfaceC7882e;
import l6.InterfaceFutureC7881d;
import o6.C8649a;

/* loaded from: classes.dex */
public class m<TranscodeType> extends AbstractC7878a<m<TranscodeType>> {
    protected static final l6.i DOWNLOAD_ONLY_OPTIONS = new l6.i().diskCacheStrategy(V5.k.f28205b).priority(i.LOW).skipMemoryCache(true);
    private final Context context;
    private m<TranscodeType> errorBuilder;
    private final c glide;
    private final f glideContext;
    private boolean isDefaultTransitionOptionsSet = true;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<l6.h<TranscodeType>> requestListeners;
    private final n requestManager;
    private Float thumbSizeMultiplier;
    private m<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;

    @NonNull
    private o<?, ? super TranscodeType> transitionOptions;

    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57646a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f57647b;

        static {
            int[] iArr = new int[i.values().length];
            f57647b = iArr;
            try {
                iArr[i.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57647b[i.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57647b[i.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57647b[i.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f57646a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57646a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57646a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57646a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57646a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57646a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57646a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57646a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected m(@NonNull c cVar, n nVar, Class<TranscodeType> cls, Context context) {
        this.glide = cVar;
        this.requestManager = nVar;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = nVar.getDefaultTransitionOptions(cls);
        this.glideContext = cVar.f();
        initRequestListeners(nVar.getDefaultRequestListeners());
        apply((AbstractC7878a<?>) nVar.getDefaultRequestOptions());
    }

    private m<TranscodeType> applyResourceThemeAndSignature(m<TranscodeType> mVar) {
        return mVar.theme(this.context.getTheme()).signature(C8649a.a(this.context));
    }

    private InterfaceC7882e buildRequest(m6.h<TranscodeType> hVar, l6.h<TranscodeType> hVar2, AbstractC7878a<?> abstractC7878a, Executor executor) {
        return buildRequestRecursive(new Object(), hVar, hVar2, null, this.transitionOptions, abstractC7878a.getPriority(), abstractC7878a.getOverrideWidth(), abstractC7878a.getOverrideHeight(), abstractC7878a, executor);
    }

    private InterfaceC7882e buildRequestRecursive(Object obj, m6.h<TranscodeType> hVar, l6.h<TranscodeType> hVar2, l6.f fVar, o<?, ? super TranscodeType> oVar, i iVar, int i11, int i12, AbstractC7878a<?> abstractC7878a, Executor executor) {
        C7879b c7879b;
        l6.f fVar2;
        Object obj2;
        m6.h<TranscodeType> hVar3;
        l6.h<TranscodeType> hVar4;
        o<?, ? super TranscodeType> oVar2;
        i iVar2;
        int i13;
        int i14;
        AbstractC7878a<?> abstractC7878a2;
        Executor executor2;
        m<TranscodeType> mVar;
        if (this.errorBuilder != null) {
            c7879b = new C7879b(obj, fVar);
            fVar2 = c7879b;
            mVar = this;
            obj2 = obj;
            hVar3 = hVar;
            hVar4 = hVar2;
            oVar2 = oVar;
            iVar2 = iVar;
            i13 = i11;
            i14 = i12;
            abstractC7878a2 = abstractC7878a;
            executor2 = executor;
        } else {
            c7879b = null;
            fVar2 = fVar;
            obj2 = obj;
            hVar3 = hVar;
            hVar4 = hVar2;
            oVar2 = oVar;
            iVar2 = iVar;
            i13 = i11;
            i14 = i12;
            abstractC7878a2 = abstractC7878a;
            executor2 = executor;
            mVar = this;
        }
        InterfaceC7882e buildThumbnailRequestRecursive = mVar.buildThumbnailRequestRecursive(obj2, hVar3, hVar4, fVar2, oVar2, iVar2, i13, i14, abstractC7878a2, executor2);
        if (c7879b == null) {
            return buildThumbnailRequestRecursive;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (p6.l.i(i11, i12) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = abstractC7878a.getOverrideWidth();
            overrideHeight = abstractC7878a.getOverrideHeight();
        }
        m<TranscodeType> mVar2 = this.errorBuilder;
        C7879b c7879b2 = c7879b;
        c7879b2.k(buildThumbnailRequestRecursive, mVar2.buildRequestRecursive(obj, hVar, hVar2, c7879b2, mVar2.transitionOptions, mVar2.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return c7879b2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l6.a] */
    private InterfaceC7882e buildThumbnailRequestRecursive(Object obj, m6.h<TranscodeType> hVar, l6.h<TranscodeType> hVar2, l6.f fVar, o<?, ? super TranscodeType> oVar, i iVar, int i11, int i12, AbstractC7878a<?> abstractC7878a, Executor executor) {
        m<TranscodeType> mVar = this.thumbnailBuilder;
        if (mVar == null) {
            if (this.thumbSizeMultiplier == null) {
                return obtainRequest(obj, hVar, hVar2, abstractC7878a, fVar, oVar, iVar, i11, i12, executor);
            }
            l6.k kVar = new l6.k(obj, fVar);
            kVar.k(obtainRequest(obj, hVar, hVar2, abstractC7878a, kVar, oVar, iVar, i11, i12, executor), obtainRequest(obj, hVar, hVar2, abstractC7878a.mo17clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), kVar, oVar, getThumbnailPriority(iVar), i11, i12, executor));
            return kVar;
        }
        if (this.isThumbnailBuilt) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        o<?, ? super TranscodeType> oVar2 = mVar.isDefaultTransitionOptionsSet ? oVar : mVar.transitionOptions;
        i priority = mVar.isPrioritySet() ? this.thumbnailBuilder.getPriority() : getThumbnailPriority(iVar);
        int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
        int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
        if (p6.l.i(i11, i12) && !this.thumbnailBuilder.isValidOverride()) {
            overrideWidth = abstractC7878a.getOverrideWidth();
            overrideHeight = abstractC7878a.getOverrideHeight();
        }
        l6.k kVar2 = new l6.k(obj, fVar);
        InterfaceC7882e obtainRequest = obtainRequest(obj, hVar, hVar2, abstractC7878a, kVar2, oVar, iVar, i11, i12, executor);
        this.isThumbnailBuilt = true;
        m<TranscodeType> mVar2 = this.thumbnailBuilder;
        InterfaceC7882e buildRequestRecursive = mVar2.buildRequestRecursive(obj, hVar, hVar2, kVar2, oVar2, priority, overrideWidth, overrideHeight, mVar2, executor);
        this.isThumbnailBuilt = false;
        kVar2.k(obtainRequest, buildRequestRecursive);
        return kVar2;
    }

    @NonNull
    private i getThumbnailPriority(@NonNull i iVar) {
        int i11 = a.f57647b[iVar.ordinal()];
        if (i11 == 1) {
            return i.NORMAL;
        }
        if (i11 == 2) {
            return i.HIGH;
        }
        if (i11 == 3 || i11 == 4) {
            return i.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @SuppressLint({"CheckResult"})
    private void initRequestListeners(List<l6.h<Object>> list) {
        Iterator<l6.h<Object>> it = list.iterator();
        while (it.hasNext()) {
            addListener((l6.h) it.next());
        }
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(AbstractC7878a<?> abstractC7878a, InterfaceC7882e interfaceC7882e) {
        return !abstractC7878a.isMemoryCacheable() && interfaceC7882e.e();
    }

    @NonNull
    private m<TranscodeType> loadGeneric(Object obj) {
        if (isAutoCloneEnabled()) {
            return mo17clone().loadGeneric(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return selfOrThrowIfLocked();
    }

    private m<TranscodeType> maybeApplyOptionsResourceUri(Uri uri, m<TranscodeType> mVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? mVar : applyResourceThemeAndSignature(mVar);
    }

    private InterfaceC7882e obtainRequest(Object obj, m6.h<TranscodeType> hVar, l6.h<TranscodeType> hVar2, AbstractC7878a<?> abstractC7878a, l6.f fVar, o<?, ? super TranscodeType> oVar, i iVar, int i11, int i12, Executor executor) {
        Context context = this.context;
        f fVar2 = this.glideContext;
        return l6.j.l(context, fVar2, obj, this.model, this.transcodeClass, abstractC7878a, i11, i12, iVar, hVar, hVar2, this.requestListeners, fVar, fVar2.f(), oVar.b(), executor);
    }

    @NonNull
    public m<TranscodeType> addListener(l6.h<TranscodeType> hVar) {
        if (isAutoCloneEnabled()) {
            return mo17clone().addListener(hVar);
        }
        if (hVar != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(hVar);
        }
        return selfOrThrowIfLocked();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ AbstractC7878a apply(@NonNull AbstractC7878a abstractC7878a) {
        return apply((AbstractC7878a<?>) abstractC7878a);
    }

    @Override // l6.AbstractC7878a
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (super.equals(mVar) && Objects.equals(this.transcodeClass, mVar.transcodeClass) && this.transitionOptions.equals(mVar.transitionOptions) && Objects.equals(this.model, mVar.model) && Objects.equals(this.requestListeners, mVar.requestListeners) && Objects.equals(this.thumbnailBuilder, mVar.thumbnailBuilder) && Objects.equals(this.errorBuilder, mVar.errorBuilder) && Objects.equals(this.thumbSizeMultiplier, mVar.thumbSizeMultiplier) && this.isDefaultTransitionOptionsSet == mVar.isDefaultTransitionOptionsSet && this.isModelSet == mVar.isModelSet) {
                return true;
            }
        }
        return false;
    }

    @Override // l6.AbstractC7878a
    public int hashCode() {
        return p6.l.g(this.isModelSet ? 1 : 0, p6.l.g(this.isDefaultTransitionOptionsSet ? 1 : 0, p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.h(p6.l.h(super.hashCode(), this.transcodeClass), this.transitionOptions), this.model), this.requestListeners), this.thumbnailBuilder), this.errorBuilder), this.thumbSizeMultiplier)));
    }

    @NonNull
    public <Y extends m6.h<TranscodeType>> Y into(@NonNull Y y11) {
        return (Y) into(y11, null, p6.e.b());
    }

    @NonNull
    public m<TranscodeType> listener(l6.h<TranscodeType> hVar) {
        if (isAutoCloneEnabled()) {
            return mo17clone().listener(hVar);
        }
        this.requestListeners = null;
        return addListener(hVar);
    }

    @NonNull
    public m<TranscodeType> load(Object obj) {
        return loadGeneric(obj);
    }

    @NonNull
    public InterfaceFutureC7881d<TranscodeType> submit() {
        return submit(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    }

    @NonNull
    public m<TranscodeType> thumbnail(m<TranscodeType> mVar) {
        if (isAutoCloneEnabled()) {
            return mo17clone().thumbnail(mVar);
        }
        this.thumbnailBuilder = mVar;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public m<TranscodeType> transition(@NonNull o<?, ? super TranscodeType> oVar) {
        if (isAutoCloneEnabled()) {
            return mo17clone().transition(oVar);
        }
        p6.k.c(oVar, "Argument must not be null");
        this.transitionOptions = oVar;
        this.isDefaultTransitionOptionsSet = false;
        return selfOrThrowIfLocked();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public m<TranscodeType> apply(@NonNull AbstractC7878a<?> abstractC7878a) {
        p6.k.b(abstractC7878a);
        return (m) super.apply(abstractC7878a);
    }

    @NonNull
    <Y extends m6.h<TranscodeType>> Y into(@NonNull Y y11, l6.h<TranscodeType> hVar, Executor executor) {
        return (Y) into(y11, hVar, this, executor);
    }

    @NonNull
    public m<TranscodeType> load(Bitmap bitmap) {
        return loadGeneric(bitmap).apply((AbstractC7878a<?>) l6.i.diskCacheStrategyOf(V5.k.f28204a));
    }

    @NonNull
    public InterfaceFutureC7881d<TranscodeType> submit(int i11, int i12) {
        l6.g gVar = new l6.g(i11, i12);
        return (InterfaceFutureC7881d) into(gVar, gVar, p6.e.a());
    }

    private <Y extends m6.h<TranscodeType>> Y into(@NonNull Y y11, l6.h<TranscodeType> hVar, AbstractC7878a<?> abstractC7878a, Executor executor) {
        p6.k.b(y11);
        if (this.isModelSet) {
            InterfaceC7882e buildRequest = buildRequest(y11, hVar, abstractC7878a, executor);
            InterfaceC7882e request = y11.getRequest();
            if (buildRequest.b(request) && !isSkipMemoryCacheWithCompletePreviousRequest(abstractC7878a, request)) {
                p6.k.c(request, "Argument must not be null");
                if (!request.isRunning()) {
                    request.j();
                }
                return y11;
            }
            this.requestManager.clear((m6.h<?>) y11);
            y11.setRequest(buildRequest);
            this.requestManager.track(y11, buildRequest);
            return y11;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @Override // l6.AbstractC7878a
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public m<TranscodeType> mo17clone() {
        m<TranscodeType> mVar = (m) super.mo17clone();
        mVar.transitionOptions = (o<?, ? super TranscodeType>) mVar.transitionOptions.clone();
        if (mVar.requestListeners != null) {
            mVar.requestListeners = new ArrayList(mVar.requestListeners);
        }
        m<TranscodeType> mVar2 = mVar.thumbnailBuilder;
        if (mVar2 != null) {
            mVar.thumbnailBuilder = mVar2.mo17clone();
        }
        m<TranscodeType> mVar3 = mVar.errorBuilder;
        if (mVar3 != null) {
            mVar.errorBuilder = mVar3.mo17clone();
        }
        return mVar;
    }

    @NonNull
    public m<TranscodeType> load(String str) {
        return loadGeneric(str);
    }

    @NonNull
    public m<TranscodeType> load(Uri uri) {
        return maybeApplyOptionsResourceUri(uri, loadGeneric(uri));
    }

    @NonNull
    public m<TranscodeType> load(byte[] bArr) {
        m<TranscodeType> loadGeneric = loadGeneric(bArr);
        if (!loadGeneric.isDiskCacheStrategySet()) {
            loadGeneric = loadGeneric.apply((AbstractC7878a<?>) l6.i.diskCacheStrategyOf(V5.k.f28204a));
        }
        return !loadGeneric.isSkipMemoryCacheSet() ? loadGeneric.apply((AbstractC7878a<?>) l6.i.skipMemoryCacheOf(true)) : loadGeneric;
    }

    @NonNull
    public m6.i<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        AbstractC7878a<?> abstractC7878a;
        p6.l.a();
        p6.k.b(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f57646a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC7878a = mo17clone().optionalCenterCrop();
                    break;
                case 2:
                    abstractC7878a = mo17clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC7878a = mo17clone().optionalFitCenter();
                    break;
                case 6:
                    abstractC7878a = mo17clone().optionalCenterInside();
                    break;
            }
            return (m6.i) into(this.glideContext.a(imageView, this.transcodeClass), null, abstractC7878a, p6.e.b());
        }
        abstractC7878a = this;
        return (m6.i) into(this.glideContext.a(imageView, this.transcodeClass), null, abstractC7878a, p6.e.b());
    }
}
