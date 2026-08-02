package ru.ozon.composer.compose.widget.scrollable;

import S0.B1;
import S0.G0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"LS0/G0;", "Lru/ozon/composer/compose/widget/scrollable/o;", "a", "LS0/G0;", "()LS0/G0;", "LocalWidgetVisibleAreaChangedCallbacks", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f94782a = new B1(a.f94783b);

    static final class a extends AbstractC7737t implements Function0<o> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f94783b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final o invoke() {
            throw new IllegalStateException("WidgetVisibleAreaChangedCallbacks should be provided");
        }
    }

    @NotNull
    public static final G0<o> a() {
        return f94782a;
    }
}
