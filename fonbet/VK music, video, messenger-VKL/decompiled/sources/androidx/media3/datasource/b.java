package androidx.media3.datasource;

import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.media3.datasource.c;
import xsna.avk;
import xsna.fin0;
import xsna.jhz;
import xsna.kc7;
import xsna.zhn0;

/* compiled from: DataSourceBitmapLoader.java */
/* loaded from: classes12.dex */
public final class b implements kc7 {
    public static final zhn0<jhz> d = fin0.a(new avk());
    public final jhz a;
    public final c.a b;

    @Nullable
    public final BitmapFactory.Options c;

    @Deprecated
    public b(jhz jhzVar, c.a aVar, @Nullable BitmapFactory.Options options) {
        this.a = jhzVar;
        this.b = aVar;
        this.c = options;
    }
}
