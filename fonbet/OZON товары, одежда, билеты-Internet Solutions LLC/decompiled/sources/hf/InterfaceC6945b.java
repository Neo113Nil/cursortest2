package hf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import sf.K;
import sf.M;

/* renamed from: hf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC6945b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InterfaceC6945b f65492a = new C6944a();

    void a(@NotNull File file) throws IOException;

    void b(@NotNull File file, @NotNull File file2) throws IOException;

    void c(@NotNull File file) throws IOException;

    boolean d(@NotNull File file);

    @NotNull
    K e(@NotNull File file) throws FileNotFoundException;

    long f(@NotNull File file);

    @NotNull
    M g(@NotNull File file) throws FileNotFoundException;

    @NotNull
    K h(@NotNull File file) throws FileNotFoundException;
}
