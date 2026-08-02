package ru.ozon.app.android.pikazon.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.bumptech.glide.n;
import i6.k;
import i6.q;
import l6.AbstractC7878a;
import l6.i;

/* loaded from: classes7.dex */
public class GlideRequests extends n {
    public GlideRequests(@NonNull c cVar, @NonNull k kVar, @NonNull q qVar, @NonNull Context context) {
        super(cVar, kVar, qVar, context);
    }

    @Override // com.bumptech.glide.n
    protected void setRequestOptions(@NonNull i iVar) {
        if (iVar instanceof GlideOptions) {
            super.setRequestOptions(iVar);
        } else {
            super.setRequestOptions(new GlideOptions().apply2((AbstractC7878a<?>) iVar));
        }
    }

    @Override // com.bumptech.glide.n
    @NonNull
    public <ResourceType> GlideRequest<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    @Override // com.bumptech.glide.n
    @NonNull
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // com.bumptech.glide.n
    @NonNull
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    @Override // com.bumptech.glide.n
    @NonNull
    public GlideRequest<Drawable> load(String str) {
        return (GlideRequest) super.load(str);
    }

    @Override // com.bumptech.glide.n
    @NonNull
    public GlideRequest<Drawable> load(Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    @Override // com.bumptech.glide.n
    @NonNull
    public GlideRequest<Drawable> load(Object obj) {
        return (GlideRequest) super.load(obj);
    }
}
