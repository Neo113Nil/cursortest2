package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S8 implements T8 {
    private final Q3 a;

    /* JADX WARN: Multi-variable type inference failed */
    public S8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("file does not exists")));
        }
        Drawable createFromPath = Drawable.createFromPath(file.getPath());
        if (createFromPath == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m11180constructorimpl(createFromPath);
    }

    private final Object c(String str) {
        InputStream a = this.a.a(str);
        try {
            Drawable createFromStream = Drawable.createFromStream(a, new File(str).getName());
            CloseableKt.closeFinally(a, null);
            if (createFromStream == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m11180constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11180constructorimpl(createFromStream);
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.T8
    public Object a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e) {
            C2556n4.d().a(e);
            Result.Companion companion = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(e));
        }
    }

    public S8(Q3 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.a = connectionFactory;
    }

    public /* synthetic */ S8(Q3 q3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? H4.a : q3);
    }
}
