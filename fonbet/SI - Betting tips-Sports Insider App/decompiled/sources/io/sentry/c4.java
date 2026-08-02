package io.sentry;

import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements io.sentry.util.runtime.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f16232b;

    public /* synthetic */ c4(File file, int i5) {
        this.f16231a = i5;
        this.f16232b = file;
    }

    @Override // io.sentry.util.runtime.a
    public final Object run() {
        switch (this.f16231a) {
            case 0:
                return Boolean.valueOf(this.f16232b.mkdirs());
            case 1:
                return Boolean.valueOf(this.f16232b.mkdirs());
            case 2:
                return Boolean.valueOf(this.f16232b.mkdirs());
            case 3:
                return Boolean.valueOf(this.f16232b.exists());
            default:
                return Boolean.valueOf(this.f16232b.delete());
        }
    }
}
