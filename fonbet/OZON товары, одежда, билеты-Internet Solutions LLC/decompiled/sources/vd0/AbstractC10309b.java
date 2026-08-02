package vd0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* renamed from: vd0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10309b {

    /* renamed from: a, reason: collision with root package name */
    private String f102853a;

    /* renamed from: b, reason: collision with root package name */
    private String f102854b;

    /* renamed from: c, reason: collision with root package name */
    private String f102855c;

    /* renamed from: d, reason: collision with root package name */
    private String f102856d;

    /* renamed from: e, reason: collision with root package name */
    private OzonSpannableString f102857e;

    /* renamed from: f, reason: collision with root package name */
    private OzonSpannableString f102858f;

    /* renamed from: g, reason: collision with root package name */
    private Function1<? super String, Unit> f102859g;

    /* renamed from: h, reason: collision with root package name */
    private TextDTO.TextAlignment f102860h;

    /* renamed from: i, reason: collision with root package name */
    private a f102861i;

    /* renamed from: j, reason: collision with root package name */
    private a f102862j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC7737t f102863k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f102864l;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: vd0.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f102865a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC7737t f102866b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String text, @NotNull Function1<? super InterfaceC10308a, Unit> onClick) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f102865a = text;
            this.f102866b = (AbstractC7737t) onClick;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<vd0.a, kotlin.Unit>, kotlin.jvm.internal.t] */
        @NotNull
        public final Function1<InterfaceC10308a, Unit> a() {
            return this.f102866b;
        }

        @NotNull
        public final String b() {
            return this.f102865a;
        }
    }

    @NotNull
    public final void a() {
        this.f102864l = true;
    }

    protected final String b() {
        return this.f102853a;
    }

    protected final a c() {
        return this.f102862j;
    }

    protected final boolean d() {
        return this.f102864l;
    }

    protected final String e() {
        return this.f102855c;
    }

    protected final String f() {
        return this.f102854b;
    }

    protected final String g() {
        return this.f102856d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.internal.t] */
    protected final Function0<Unit> h() {
        return this.f102863k;
    }

    protected final Function1<String, Unit> i() {
        return this.f102859g;
    }

    protected final a j() {
        return this.f102861i;
    }

    protected final OzonSpannableString k() {
        return this.f102858f;
    }

    protected final OzonSpannableString l() {
        return this.f102857e;
    }

    protected final TextDTO.TextAlignment m() {
        return this.f102860h;
    }

    @NotNull
    public final void n(@NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f102853a = imageUrl;
    }

    @NotNull
    public final void o(@NotNull String text, @NotNull Function1 onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f102862j = new a(text, onClick);
    }

    @NotNull
    public final void p(@NotNull String icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f102855c = icon;
    }

    @NotNull
    public final void q(@NotNull String initials) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        this.f102854b = initials;
    }

    @NotNull
    public final void r(@NotNull String logoUrl) {
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f102856d = logoUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final void s(@NotNull Function0 onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        this.f102863k = (AbstractC7737t) onDismiss;
    }

    @NotNull
    public final void t(@NotNull Function1 onUrlClicked) {
        Intrinsics.checkNotNullParameter(onUrlClicked, "onUrlClicked");
        this.f102859g = onUrlClicked;
    }

    @NotNull
    public final void u(@NotNull String text, @NotNull Function1 onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f102861i = new a(text, onClick);
    }

    @NotNull
    public final void v(@NotNull OzonSpannableString subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f102858f = subtitle;
    }

    @NotNull
    public final void w(@NotNull OzonSpannableString title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f102857e = title;
    }

    @NotNull
    public final void x(@NotNull TextDTO.TextAlignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f102860h = alignment;
    }
}
