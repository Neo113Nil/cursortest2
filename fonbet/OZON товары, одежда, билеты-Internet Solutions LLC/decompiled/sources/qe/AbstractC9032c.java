package qe;

import gd.InterfaceC6712a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9032c<T> implements Iterable<T>, InterfaceC6712a {
    public AbstractC9032c(int i11) {
    }

    public abstract void b(int i11, @NotNull T t2);

    public abstract T get(int i11);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
