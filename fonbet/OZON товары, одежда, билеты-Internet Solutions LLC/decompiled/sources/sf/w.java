package sf;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w extends AbstractC9686l {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final RandomAccessFile f98764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z11, @NotNull RandomAccessFile randomAccessFile) {
        super(z11);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f98764e = randomAccessFile;
    }

    @Override // sf.AbstractC9686l
    protected final synchronized void m() {
        this.f98764e.close();
    }

    @Override // sf.AbstractC9686l
    protected final synchronized void o() {
        this.f98764e.getFD().sync();
    }

    @Override // sf.AbstractC9686l
    protected final synchronized int p(long j11, @NotNull byte[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f98764e.seek(j11);
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int read = this.f98764e.read(array, i11, i12 - i13);
            if (read != -1) {
                i13 += read;
            } else if (i13 == 0) {
                return -1;
            }
        }
        return i13;
    }

    @Override // sf.AbstractC9686l
    protected final synchronized long q() {
        return this.f98764e.length();
    }

    @Override // sf.AbstractC9686l
    protected final synchronized void r(long j11, @NotNull byte[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f98764e.seek(j11);
        this.f98764e.write(array, i11, i12);
    }
}
