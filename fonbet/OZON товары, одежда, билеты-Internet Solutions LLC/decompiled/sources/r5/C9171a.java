package r5;

import java.io.File;
import v5.C10239m;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9171a implements InterfaceC9172b<File> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f82895a;

    public C9171a(boolean z11) {
        this.f82895a = z11;
    }

    @Override // r5.InterfaceC9172b
    public final String a(File file, C10239m c10239m) {
        File file2 = file;
        if (!this.f82895a) {
            return file2.getPath();
        }
        return file2.getPath() + ':' + file2.lastModified();
    }
}
