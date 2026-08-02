package H7;

/* loaded from: classes2.dex */
public abstract class h extends a {
    public void finalize() {
        if (isClosed()) {
            return;
        }
        E6.a.M("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
