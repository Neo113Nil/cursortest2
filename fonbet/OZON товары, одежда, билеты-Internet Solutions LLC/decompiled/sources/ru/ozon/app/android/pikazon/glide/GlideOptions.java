package ru.ozon.app.android.pikazon.glide;

import T5.b;
import T5.f;
import T5.h;
import T5.m;
import V5.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c6.n;
import l6.AbstractC7878a;
import l6.i;

/* loaded from: classes7.dex */
public final class GlideOptions extends i implements Cloneable {
    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ i apply(@NonNull AbstractC7878a abstractC7878a) {
        return apply2((AbstractC7878a<?>) abstractC7878a);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ i decode(@NonNull Class cls) {
        return decode2((Class<?>) cls);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ i set(@NonNull h hVar, @NonNull Object obj) {
        return set2((h<h>) hVar, (h) obj);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public /* bridge */ /* synthetic */ i transform(@NonNull m mVar) {
        return transform2((m<Bitmap>) mVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public i apply2(@NonNull AbstractC7878a<?> abstractC7878a) {
        return (GlideOptions) super.apply(abstractC7878a);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i autoClone() {
        return (GlideOptions) super.autoClone();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    /* renamed from: decode, reason: avoid collision after fix types in other method */
    public i decode2(@NonNull Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i diskCacheStrategy(@NonNull k kVar) {
        return (GlideOptions) super.diskCacheStrategy(kVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i downsample(@NonNull n nVar) {
        return (GlideOptions) super.downsample(nVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i fallback(int i11) {
        return (GlideOptions) super.fallback(i11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i format(@NonNull b bVar) {
        return (GlideOptions) super.format(bVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i lock() {
        return (GlideOptions) super.lock();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i onlyRetrieveFromCache(boolean z11) {
        return (GlideOptions) super.onlyRetrieveFromCache(z11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i override(int i11, int i12) {
        return (GlideOptions) super.override(i11, i12);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i placeholder(int i11) {
        return (GlideOptions) super.placeholder(i11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i priority(@NonNull com.bumptech.glide.i iVar) {
        return (GlideOptions) super.priority(iVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    /* renamed from: set, reason: avoid collision after fix types in other method */
    public <Y> i set2(@NonNull h<Y> hVar, @NonNull Y y11) {
        return (GlideOptions) super.set((h<h<Y>>) hVar, (h<Y>) y11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i signature(@NonNull f fVar) {
        return (GlideOptions) super.signature(fVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i sizeMultiplier(float f7) {
        return (GlideOptions) super.sizeMultiplier(f7);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i skipMemoryCache(boolean z11) {
        return (GlideOptions) super.skipMemoryCache(z11);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i theme(Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    /* renamed from: transform, reason: avoid collision after fix types in other method */
    public i transform2(@NonNull m<Bitmap> mVar) {
        return (GlideOptions) super.transform(mVar);
    }

    @Override // l6.AbstractC7878a
    @NonNull
    public i useAnimationPool(boolean z11) {
        return (GlideOptions) super.useAnimationPool(z11);
    }

    @Override // l6.AbstractC7878a
    /* renamed from: clone */
    public GlideOptions mo17clone() {
        return (GlideOptions) super.mo17clone();
    }
}
