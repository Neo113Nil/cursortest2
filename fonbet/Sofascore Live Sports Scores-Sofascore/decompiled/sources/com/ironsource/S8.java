package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import defpackage.n4o;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.io.File;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S8 implements T8 {

    @NotNull
    private final N3 a;

    public /* synthetic */ S8(N3 n3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? E4.a : n3);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            p2g p2gVar = w2g.b;
            return new u2g(new Exception("file does not exists"));
        }
        Drawable createFromPath = Drawable.createFromPath(file.getPath());
        if (createFromPath == null) {
            p2g p2gVar2 = w2g.b;
            return new u2g(new Exception("failed to create a drawable"));
        }
        p2g p2gVar3 = w2g.b;
        return createFromPath;
    }

    private final Object c(String str) {
        InputStream a = this.a.a(str);
        try {
            Drawable createFromStream = Drawable.createFromStream(a, new File(str).getName());
            n4o.x(a, null);
            if (createFromStream == null) {
                p2g p2gVar = w2g.b;
                return new u2g(new Exception("failed to create a drawable"));
            }
            p2g p2gVar2 = w2g.b;
            return createFromStream;
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.T8
    @NotNull
    public Object a(@NotNull String str) {
        str.getClass();
        try {
            return d(str) ? c(str) : b(str);
        } catch (Exception e) {
            C4157k4.d().a(e);
            p2g p2gVar = w2g.b;
            return new u2g(e);
        }
    }

    public S8(@NotNull N3 n3) {
        n3.getClass();
        this.a = n3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S8() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
