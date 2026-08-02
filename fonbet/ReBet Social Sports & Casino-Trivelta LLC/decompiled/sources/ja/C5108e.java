package ja;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: ja.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5108e extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f53865a;

    public C5108e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f53865a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f53865a.set(imageView.getImageMatrix());
        return this.f53865a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
