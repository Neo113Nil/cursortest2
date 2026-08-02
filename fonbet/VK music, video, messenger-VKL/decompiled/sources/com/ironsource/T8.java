package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import kotlin.Result;
import xsna.ro;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class T8 implements U8 {
    private final Q3 a;

    /* JADX WARN: Multi-variable type inference failed */
    public T8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return new Result.Failure(new Exception("file does not exists"));
        }
        Drawable createFromPath = Drawable.createFromPath(file.getPath());
        return createFromPath == null ? new Result.Failure(new Exception("failed to create a drawable")) : createFromPath;
    }

    private final Object c(String str) {
        InputStream a = this.a.a(str);
        try {
            Drawable createFromStream = Drawable.createFromStream(a, new File(str).getName());
            ro.e(a, null);
            return createFromStream == null ? new Result.Failure(new Exception("failed to create a drawable")) : createFromStream;
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.U8
    public Object a(String str) {
        try {
            return d(str) ? c(str) : b(str);
        } catch (Exception e) {
            C4452n4.d().a(e);
            return new Result.Failure(e);
        }
    }

    public T8(Q3 q3) {
        this.a = q3;
    }

    public /* synthetic */ T8(Q3 q3, int i, zcl zclVar) {
        this((i & 1) != 0 ? H4.a : q3);
    }
}
