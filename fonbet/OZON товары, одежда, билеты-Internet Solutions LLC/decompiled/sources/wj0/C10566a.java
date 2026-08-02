package wj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rj0.InterfaceC9287a;
import xj0.InterfaceC10781a;

/* renamed from: wj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10566a implements InterfaceC9287a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104593a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104594b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC10781a f104595c;

    public C10566a(@NotNull String text, @NotNull String testTag, @NotNull InterfaceC10781a intent) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f104593a = text;
        this.f104594b = testTag;
        this.f104595c = intent;
    }

    @Override // rj0.InterfaceC9287a
    @NotNull
    public final String a() {
        return this.f104594b;
    }

    @NotNull
    public final InterfaceC10781a b() {
        return this.f104595c;
    }

    @Override // rj0.InterfaceC9287a
    @NotNull
    public final String getText() {
        return this.f104593a;
    }
}
