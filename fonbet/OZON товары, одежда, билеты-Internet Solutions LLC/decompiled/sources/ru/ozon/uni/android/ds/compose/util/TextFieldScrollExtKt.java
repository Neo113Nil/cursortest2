package ru.ozon.uni.android.ds.compose.util;

import Z1.w;
import androidx.compose.ui.e;
import androidx.compose.ui.input.nestedscroll.a;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w1.InterfaceC10406a;

@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0005\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "", "disabled", "disabledHorizontalPointerInputScroll", "(Landroidx/compose/ui/e;Z)Landroidx/compose/ui/e;", "ru/ozon/uni/android/ds/compose/util/TextFieldScrollExtKt$HorizontalScrollConsumer$1", "HorizontalScrollConsumer", "Lru/ozon/uni/android/ds/compose/util/TextFieldScrollExtKt$HorizontalScrollConsumer$1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextFieldScrollExtKt {

    @NotNull
    private static final TextFieldScrollExtKt$HorizontalScrollConsumer$1 HorizontalScrollConsumer = new InterfaceC10406a() { // from class: ru.ozon.uni.android.ds.compose.util.TextFieldScrollExtKt$HorizontalScrollConsumer$1
        @Override // w1.InterfaceC10406a
        /* renamed from: onPreFling-QWom1Mo */
        public Object mo11onPreFlingQWom1Mo(long j11, d<? super w> dVar) {
            return w.a(w.b(0.0f, 0.0f, 1, j11));
        }

        @Override // w1.InterfaceC10406a
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo12onPreScrollOzD1aCk(long available, int source) {
            return C7459e.b(available, 0.0f, 1);
        }
    };

    @NotNull
    public static final e disabledHorizontalPointerInputScroll(@NotNull e eVar, boolean z11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return z11 ? a.a(eVar, HorizontalScrollConsumer, null) : eVar;
    }
}
