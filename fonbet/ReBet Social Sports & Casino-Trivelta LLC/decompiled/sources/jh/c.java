package jh;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class c extends MalformedInputException {

    /* renamed from: a, reason: collision with root package name */
    public final String f53980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message) {
        super(0);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f53980a = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public String getMessage() {
        return this.f53980a;
    }
}
