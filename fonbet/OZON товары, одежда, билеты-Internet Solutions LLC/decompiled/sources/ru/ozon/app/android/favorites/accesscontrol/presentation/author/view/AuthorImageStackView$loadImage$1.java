package ru.ozon.app.android.favorites.accesscontrol.presentation.author.view;

import Nu.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/favorites/accesscontrol/presentation/author/view/AuthorImageStackView$loadImage$1", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "onLoadSuccessful", "", "resource", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthorImageStackView$loadImage$1 implements PikazonLoaderCallback<Drawable> {
    final /* synthetic */ ImageView $this_loadImage;
    final /* synthetic */ AuthorImageStackView this$0;

    AuthorImageStackView$loadImage$1(AuthorImageStackView authorImageStackView, ImageView imageView) {
        this.this$0 = authorImageStackView;
        this.$this_loadImage = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoadSuccessful$lambda$0(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public void onLoadFailed(Exception exc) {
        PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public void onLoadSuccessful(Drawable resource) {
        Bitmap createBitmapForAva;
        createBitmapForAva = this.this$0.createBitmapForAva();
        Canvas canvas = new Canvas(createBitmapForAva);
        this.this$0.drawBackgroundCircle(canvas);
        this.this$0.drawImage(canvas, resource);
        ImageView imageView = this.$this_loadImage;
        imageView.post(new a(1, imageView, createBitmapForAva));
    }
}
