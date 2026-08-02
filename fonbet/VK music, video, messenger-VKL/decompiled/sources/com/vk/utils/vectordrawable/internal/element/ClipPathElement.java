package com.vk.utils.vectordrawable.internal.element;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.annotation.Keep;
import com.vk.utils.vectordrawable.AnimationTarget;
import defpackage.h;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.rq90;
import xsna.x9;

/* compiled from: ClipPathElement.kt */
@Keep
/* loaded from: classes6.dex */
public final class ClipPathElement implements AnimationTarget {
    private final Paint clipPaint;
    private final String name;
    private final Path originalPath;
    private final Lazy path$delegate;

    public ClipPathElement(String str, String str2) {
        this.name = str;
        this.path$delegate = new bpn0(new h(this, 17));
        this.originalPath = str2 != null ? rq90.d(str2) : new Path();
        Paint c = x9.c(true);
        c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clipPaint = c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path path_delegate$lambda$0(ClipPathElement clipPathElement) {
        return new Path(clipPathElement.originalPath);
    }

    public final String getName() {
        return this.name;
    }

    public final Path getPath() {
        return (Path) this.path$delegate.getValue();
    }

    public final void transform(Matrix matrix) {
        getPath().set(this.originalPath);
        getPath().transform(matrix);
    }

    public ClipPathElement(ClipPathElement clipPathElement) {
        this(clipPathElement.name, null);
        this.originalPath.set(clipPathElement.originalPath);
        getPath().set(clipPathElement.getPath());
        this.clipPaint.set(clipPathElement.clipPaint);
    }
}
