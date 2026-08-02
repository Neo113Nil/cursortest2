package ru.ozon.composer.compose.widget.config;

import C.o0;
import N3.C3660k;
import Sc.InterfaceC3999a;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010$\u001a\u00020\u001e8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\u0018\u0010#\u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/composer/compose/widget/config/a;", "", "S", "Lj20/a;", "Lru/ozon/composer/compose/widget/config/b;", "scope", "<init>", "(Lru/ozon/composer/compose/widget/config/b;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/lang/Object;", "", "canParse", "(Lj20/b;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lru/ozon/composer/compose/widget/config/b;", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "parser", "", "c", "[J", "getSupportedVersions", "()[J", "()V", "supportedVersions", "", "d", "Ljava/util/Set;", "getSupportedPlaceholders", "()Ljava/util/Set;", "supportedPlaceholders", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a<S> implements InterfaceC7243a<Object> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f94619e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final b<S> scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Function1<C7244b, Object> parser;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final long[] supportedVersions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Set<String> supportedPlaceholders;

    public a(@NotNull b<S> scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        Function1<C7244b, Object> c11 = scope.c();
        if (c11 != null) {
            this.parser = c11;
            this.supportedVersions = scope.e().getVersion();
            this.supportedPlaceholders = scope.d();
        } else {
            throw new IllegalArgumentException((scope.e() + " parser == null").toString());
        }
    }

    @InterfaceC3999a
    public static /* synthetic */ void a() {
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<C7244b, Boolean> a11 = this.scope.a();
        if (a11 != null) {
            return a11.invoke(state).booleanValue();
        }
        InterfaceC7243a.C1128a.a(state);
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a) && Intrinsics.d(this.scope, ((a) other).scope);
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return this.supportedVersions;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // j20.InterfaceC7243a
    public Object parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.parser.invoke(state);
    }

    @NotNull
    public String toString() {
        String vertical = this.scope.e().getVertical();
        String component = this.scope.e().getComponent();
        String arrays = Arrays.toString(this.scope.e().getVersion());
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        return o0.c(C3660k.d("config(vertical=", vertical, ", component=", component, ", versions="), arrays, ")");
    }
}
