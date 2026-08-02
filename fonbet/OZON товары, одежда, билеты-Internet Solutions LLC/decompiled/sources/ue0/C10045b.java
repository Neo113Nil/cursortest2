package ue0;

import com.google.gson.l;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ue0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10045b {
    public static final boolean a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return (th2 instanceof EOFException) || (th2 instanceof MalformedJsonException) || (th2 instanceof com.google.gson.j) || (th2 instanceof l);
    }
}
