package ru.ozon.composer.compose.widget;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.compose.widget.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aY\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u001c\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Ll20/c;", "I", "LA00/a$J$a;", "U", "Lru/ozon/composer/compose/widget/c;", "", "Lkotlin/Function2;", "handler", "", "a", "(Lru/ozon/composer/compose/widget/c;Lkotlin/jvm/functions/Function2;)V", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* JADX WARN: Unknown type variable: U in type: kotlin.jvm.functions.Function2<U, I, I> */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll20/c;", "I", "LA00/a$J$a;", "update", "old", "handle", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a<I extends l20.c> implements c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<U, I, I> f94632a;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: U in type: kotlin.jvm.functions.Function2<? super U, ? super I extends l20.c, ? extends I extends l20.c> */
        /* JADX WARN: Unknown type variable: U in type: kotlin.jvm.functions.Function2<? super U, ? super I, ? extends I> */
        public a(Function2<? super U, ? super I, ? extends I> function2) {
            this.f94632a = function2;
        }

        @Override // ru.ozon.composer.compose.widget.c.a
        public final I handle(a.J.InterfaceC0007a update, I old) {
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(old, "old");
            throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        }
    }

    public static final <I extends l20.c, U extends a.J.InterfaceC0007a> void a(c<? extends Object, I> cVar, Function2<? super U, ? super I, ? extends I> handler) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        cVar.c();
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
