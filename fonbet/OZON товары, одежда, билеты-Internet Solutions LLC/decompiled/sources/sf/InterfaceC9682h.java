package sf;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC9682h extends K, WritableByteChannel {
    @NotNull
    InterfaceC9682h P0() throws IOException;

    @NotNull
    InterfaceC9682h P1(int i11, int i12, @NotNull String str) throws IOException;

    @NotNull
    InterfaceC9682h Q1(@NotNull C9684j c9684j) throws IOException;

    @NotNull
    InterfaceC9682h U(@NotNull byte[] bArr) throws IOException;

    @NotNull
    InterfaceC9682h Y(long j11) throws IOException;

    @NotNull
    InterfaceC9682h Y1(int i11, int i12, @NotNull byte[] bArr) throws IOException;

    @NotNull
    C9681g f();

    @Override // sf.K, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    InterfaceC9682h h0(int i11) throws IOException;

    @NotNull
    InterfaceC9682h h1(@NotNull String str) throws IOException;

    long y0(@NotNull M m11) throws IOException;
}
