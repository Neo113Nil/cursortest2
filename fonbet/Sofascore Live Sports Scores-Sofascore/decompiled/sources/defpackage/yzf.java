package defpackage;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class yzf {

    @NotNull
    public static final xzf Companion = new xzf();

    @NotNull
    public static final yzf EMPTY;

    static {
        gc2 gc2Var = gc2.d;
        gc2Var.getClass();
        EMPTY = new uzf(gc2Var, null);
    }

    @NotNull
    public static final yzf create(@NotNull uae uaeVar, @NotNull s18 s18Var, @Nullable zdc zdcVar) {
        Companion.getClass();
        uaeVar.getClass();
        s18Var.getClass();
        return new tzf(uaeVar, s18Var, zdcVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract zdc contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    @NotNull
    public final gc2 sha256() throws IOException {
        s79 s79Var = new s79(new fx1());
        kof kofVar = new kof(s79Var);
        try {
            writeTo(kofVar);
            Unit unit = Unit.a;
            kofVar.close();
            byte[] digest = s79Var.b.digest();
            digest.getClass();
            return new gc2(digest);
        } finally {
        }
    }

    public abstract void writeTo(k62 k62Var);

    @wx4
    @NotNull
    public static final yzf create(@Nullable zdc zdcVar, @NotNull File file) {
        Companion.getClass();
        file.getClass();
        return new szf(zdcVar, file);
    }

    @wx4
    @NotNull
    public static final yzf create(@Nullable zdc zdcVar, @NotNull String str) {
        Companion.getClass();
        str.getClass();
        return xzf.b(str, zdcVar);
    }

    @wx4
    @NotNull
    public static final yzf create(@Nullable zdc zdcVar, @NotNull byte[] bArr) {
        xzf xzfVar = Companion;
        xzfVar.getClass();
        bArr.getClass();
        return xzf.c(xzfVar, zdcVar, bArr, 0, 12);
    }

    @wx4
    @NotNull
    public static final yzf create(@Nullable zdc zdcVar, @NotNull byte[] bArr, int i) {
        xzf xzfVar = Companion;
        xzfVar.getClass();
        bArr.getClass();
        return xzf.c(xzfVar, zdcVar, bArr, i, 8);
    }

    @wx4
    @NotNull
    public static final yzf create(@Nullable zdc zdcVar, @NotNull gc2 gc2Var) {
        Companion.getClass();
        gc2Var.getClass();
        return new uzf(gc2Var, zdcVar);
    }

    @NotNull
    public static final yzf create(@NotNull FileDescriptor fileDescriptor, @Nullable zdc zdcVar) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new vzf(fileDescriptor, zdcVar);
    }

    @NotNull
    public static final yzf create(@NotNull String str, @Nullable zdc zdcVar) {
        Companion.getClass();
        return xzf.b(str, zdcVar);
    }

    @NotNull
    public static final yzf create(@NotNull byte[] bArr) {
        xzf xzfVar = Companion;
        xzfVar.getClass();
        bArr.getClass();
        return xzf.d(xzfVar, bArr, null, 0, 7);
    }

    @NotNull
    public static final yzf create(@NotNull byte[] bArr, @Nullable zdc zdcVar) {
        xzf xzfVar = Companion;
        xzfVar.getClass();
        bArr.getClass();
        return xzf.d(xzfVar, bArr, zdcVar, 0, 6);
    }

    @NotNull
    public static final yzf create(@NotNull byte[] bArr, @Nullable zdc zdcVar, int i) {
        xzf xzfVar = Companion;
        xzfVar.getClass();
        bArr.getClass();
        return xzf.d(xzfVar, bArr, zdcVar, i, 4);
    }

    @NotNull
    public static final yzf create(@NotNull byte[] bArr, @Nullable zdc zdcVar, int i, int i2) {
        Companion.getClass();
        return xzf.a(zdcVar, bArr, i, i2);
    }

    @NotNull
    public static final yzf create(@NotNull gc2 gc2Var, @Nullable zdc zdcVar) {
        Companion.getClass();
        gc2Var.getClass();
        return new uzf(gc2Var, zdcVar);
    }

    @NotNull
    public static final yzf create(@NotNull File file, @Nullable zdc zdcVar) {
        Companion.getClass();
        file.getClass();
        return new szf(zdcVar, file);
    }

    @wx4
    @NotNull
    public static final yzf create(@Nullable zdc zdcVar, @NotNull byte[] bArr, int i, int i2) {
        Companion.getClass();
        bArr.getClass();
        return xzf.a(zdcVar, bArr, i, i2);
    }
}
