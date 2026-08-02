package ru.ozon.app.android.action;

import Tg.b;
import Vg.c;
import Vg.e;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u0012*\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010#\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010'\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006)"}, d2 = {"Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "", "LVg/e$a;", "builder", "constructor-impl", "(LVg/e$a;)LVg/e$a;", "LVg/c;", "store", "handlersStore-DnHbjWo", "(LVg/e$a;LVg/c;)LVg/e$a;", "handlersStore", "Lkotlin/Function1;", "LTg/b;", "", "handler", "onPreProcess-DnHbjWo", "(LVg/e$a;Lkotlin/jvm/functions/Function1;)LVg/e$a;", "onPreProcess", "T", "Ljava/lang/Class;", "key", "", "localHandler-6vmflP0", "(LVg/e$a;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)LVg/e$a;", "localHandler", "buildHandler-impl", "(LVg/e$a;)Lkotlin/jvm/functions/Function1;", "buildHandler", "", "toString-impl", "(LVg/e$a;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(LVg/e$a;)I", "hashCode", "other", "equals-impl", "(LVg/e$a;Ljava/lang/Object;)Z", "equals", "LVg/e$a;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetActionHandlerBuilder {

    @NotNull
    private final e.a builder;

    private /* synthetic */ WidgetActionHandlerBuilder(e.a aVar) {
        this.builder = aVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WidgetActionHandlerBuilder m469boximpl(e.a aVar) {
        return new WidgetActionHandlerBuilder(aVar);
    }

    @NotNull
    /* renamed from: buildHandler-impl, reason: not valid java name */
    public static final Function1<b, Unit> m470buildHandlerimpl(e.a aVar) {
        return new WidgetActionHandlerBuilder$buildHandler$1(aVar.a());
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static e.a m471constructorimpl(@NotNull e.a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m472equalsimpl(e.a aVar, Object obj) {
        return (obj instanceof WidgetActionHandlerBuilder) && Intrinsics.d(aVar, ((WidgetActionHandlerBuilder) obj).getBuilder());
    }

    @NotNull
    /* renamed from: handlersStore-DnHbjWo, reason: not valid java name */
    public static final e.a m473handlersStoreDnHbjWo(e.a aVar, @NotNull c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        aVar.c(store);
        return aVar;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m474hashCodeimpl(e.a aVar) {
        return aVar.hashCode();
    }

    @NotNull
    /* renamed from: localHandler-6vmflP0, reason: not valid java name */
    public static final <T extends b> e.a m475localHandler6vmflP0(e.a aVar, @NotNull Class<? extends T> key, @NotNull Function1<? super T, Unit> handler) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        aVar.d(key, handler);
        return aVar;
    }

    @NotNull
    /* renamed from: onPreProcess-DnHbjWo, reason: not valid java name */
    public static final e.a m476onPreProcessDnHbjWo(e.a aVar, @NotNull Function1<? super b, Boolean> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        aVar.e(handler);
        return aVar;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m477toStringimpl(e.a aVar) {
        return "WidgetActionHandlerBuilder(builder=" + aVar + ")";
    }

    public boolean equals(Object obj) {
        return m472equalsimpl(this.builder, obj);
    }

    public int hashCode() {
        return m474hashCodeimpl(this.builder);
    }

    public String toString() {
        return m477toStringimpl(this.builder);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ e.a getBuilder() {
        return this.builder;
    }
}
