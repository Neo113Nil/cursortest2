package ru.ozon.app.android.pikazon.glide;

import T5.f;
import T5.h;
import V5.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.i;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import l6.AbstractC7878a;

/* loaded from: classes7.dex */
public class GlideRequest<TranscodeType> extends m<TranscodeType> implements Cloneable {
    GlideRequest(@NonNull c cVar, @NonNull n nVar, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(cVar, nVar, cls, context);
    }

    @Override // com.bumptech.glide.m, l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ m apply(@NonNull AbstractC7878a abstractC7878a) {
        return apply((AbstractC7878a<?>) abstractC7878a);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ AbstractC7878a decode(@NonNull Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ AbstractC7878a set(@NonNull h hVar, @NonNull Object obj) {
        return set((h<h>) hVar, (h) obj);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ AbstractC7878a transform(@NonNull T5.m mVar) {
        return transform((T5.m<Bitmap>) mVar);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> addListener(l6.h<TranscodeType> hVar) {
        return (GlideRequest) super.addListener((l6.h) hVar);
    }

    @Override // com.bumptech.glide.m, l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ AbstractC7878a apply(@NonNull AbstractC7878a abstractC7878a) {
        return apply((AbstractC7878a<?>) abstractC7878a);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> decode(@NonNull Class<?> cls) {
        return (GlideRequest) super.decode(cls);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> diskCacheStrategy(@NonNull k kVar) {
        return (GlideRequest) super.diskCacheStrategy(kVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> downsample(@NonNull c6.n nVar) {
        return (GlideRequest) super.downsample(nVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> fallback(int i11) {
        return (GlideRequest) super.fallback(i11);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> listener(l6.h<TranscodeType> hVar) {
        return (GlideRequest) super.listener((l6.h) hVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> lock() {
        return (GlideRequest) super.lock();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z11) {
        return (GlideRequest) super.onlyRetrieveFromCache(z11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public <Y> GlideRequest<TranscodeType> optionalTransform(@NonNull Class<Y> cls, @NonNull T5.m<Y> mVar) {
        return (GlideRequest) super.optionalTransform((Class) cls, (T5.m) mVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> override(int i11, int i12) {
        return (GlideRequest) super.override(i11, i12);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> placeholder(int i11) {
        return (GlideRequest) super.placeholder(i11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> priority(@NonNull i iVar) {
        return (GlideRequest) super.priority(iVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public <Y> GlideRequest<TranscodeType> set(@NonNull h<Y> hVar, @NonNull Y y11) {
        return (GlideRequest) super.set((h<h<Y>>) hVar, (h<Y>) y11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> signature(@NonNull f fVar) {
        return (GlideRequest) super.signature(fVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> sizeMultiplier(float f7) {
        return (GlideRequest) super.sizeMultiplier(f7);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> skipMemoryCache(boolean z11) {
        return (GlideRequest) super.skipMemoryCache(z11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> thumbnail(m<TranscodeType> mVar) {
        return (GlideRequest) super.thumbnail((m) mVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> transform(@NonNull T5.m<Bitmap> mVar) {
        return (GlideRequest) super.transform(mVar);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> transition(@NonNull o<?, ? super TranscodeType> oVar) {
        return (GlideRequest) super.transition((o) oVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> useAnimationPool(boolean z11) {
        return (GlideRequest) super.useAnimationPool(z11);
    }

    @Override // com.bumptech.glide.m, l6.AbstractC7878a
    @NonNull
    public GlideRequest<TranscodeType> apply(@NonNull AbstractC7878a<?> abstractC7878a) {
        return (GlideRequest) super.apply(abstractC7878a);
    }

    @Override // com.bumptech.glide.m, l6.AbstractC7878a
    /* renamed from: clone */
    public GlideRequest<TranscodeType> mo17clone() {
        return (GlideRequest) super.mo17clone();
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> load(Object obj) {
        return (GlideRequest) super.load(obj);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> load(Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> load(String str) {
        return (GlideRequest) super.load(str);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> load(Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    @Override // com.bumptech.glide.m
    @NonNull
    public GlideRequest<TranscodeType> load(byte[] bArr) {
        return (GlideRequest) super.load(bArr);
    }
}
