package ru.ozon.android.messenger.utils.spans;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
public final class a extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.navigation.action.a f91981a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f91982b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f91983c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f91984d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f91985e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f91986f;

    /* renamed from: ru.ozon.android.messenger.utils.spans.a$a, reason: collision with other inner class name */
    static final class C1727a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.navigation.action.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1727a f91987b = new C1727a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar) {
            ru.ozon.android.messenger.framework.navigation.action.a it = aVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<ru.ozon.android.messenger.framework.navigation.action.a, Map<String, ? extends MessengerTrackingInfo>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f91988b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, ? extends MessengerTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(aVar, "<unused var>");
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull String urlToNavigate, @NotNull Context context, Map<String, MessengerTrackingInfo> map) {
        super(urlToNavigate);
        Intrinsics.checkNotNullParameter(urlToNavigate, "urlToNavigate");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91981a = aVar;
        this.f91982b = urlToNavigate;
        this.f91983c = context;
        this.f91984d = map;
        this.f91985e = b.f91988b;
        this.f91986f = C1727a.f91987b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void a() {
        ru.ozon.android.messenger.framework.navigation.action.a aVar = this.f91981a;
        if (aVar == null) {
            aVar = ru.ozon.android.messenger.framework.navigation.action.b.e(new AtomAction.Click("openWebView", this.f91982b, null, null, null, 12, null), null, 3);
        }
        this.f91985e.invoke(aVar, this.f91984d);
        this.f91986f.invoke(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull Function1<? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f91986f = (AbstractC7737t) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@NotNull Function2<? super ru.ozon.android.messenger.framework.navigation.action.a, ? super Map<String, MessengerTrackingInfo>, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f91985e = (AbstractC7737t) function2;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setColor(StyleParser.INSTANCE.parseColor(this.f91983c, "textAction", R$color.text_action));
        textPaint.linkColor = textPaint.getColor();
        textPaint.setUnderlineText(false);
    }
}
