package com.logrocket.core.graphics;

import android.widget.ImageView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f6564a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final f f6565b;

    public l(f fVar) {
        this.f6565b = fVar;
    }

    public static void a(k kVar, ImageView imageView, ShimCanvas shimCanvas) {
        int i5 = kVar.f6561a;
        int i10 = kVar.f6563c;
        int i11 = kVar.f6562b;
        if (i5 == 0) {
            return;
        }
        if (imageView.getImageMatrix() == null && imageView.getPaddingTop() == 0 && imageView.getPaddingLeft() == 0) {
            shimCanvas.d(Integer.valueOf(i5), i11, i10, imageView);
            return;
        }
        int saveCount = shimCanvas.getSaveCount();
        shimCanvas.save();
        if (imageView.getCropToPadding()) {
            int scrollX = imageView.getScrollX();
            int scrollY = imageView.getScrollY();
            shimCanvas.clipRect(imageView.getPaddingLeft() + scrollX, imageView.getPaddingTop() + scrollY, (imageView.getWidth() + scrollX) - imageView.getPaddingRight(), (imageView.getHeight() + scrollY) - imageView.getPaddingBottom());
        }
        shimCanvas.translate(imageView.getPaddingLeft(), imageView.getPaddingTop());
        if (imageView.getImageMatrix() != null) {
            shimCanvas.concat(imageView.getImageMatrix());
        }
        shimCanvas.d(Integer.valueOf(i5), i11, i10, imageView);
        shimCanvas.restoreToCount(saveCount);
    }
}
