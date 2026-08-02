package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Element", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CoroutineContext {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        public static final class a {
            public static <R> R a(@NotNull Element element, R r11, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r11, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E b(@NotNull Element element, @NotNull a<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (Intrinsics.d(element.getKey(), key)) {
                    return element;
                }
                return null;
            }

            @NotNull
            public static CoroutineContext c(@NotNull Element element, @NotNull a<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.d(element.getKey(), key) ? g.f71771a : element;
            }

            @NotNull
            public static CoroutineContext d(@NotNull CoroutineContext context, @NotNull Element element) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                return context == g.f71771a ? element : (CoroutineContext) context.fold(element, f.f71770b);
            }
        }

        @NotNull
        a<?> getKey();
    }

    public interface a<E extends Element> {
    }

    <R> R fold(R r11, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(@NotNull a<E> aVar);

    @NotNull
    CoroutineContext minusKey(@NotNull a<?> aVar);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
