package ru.ozon.composer.compose.widget.overlay;

import I0.C3173b;
import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d00.C6018d;
import d00.InterfaceC6021g;
import d00.h;
import java.util.Arrays;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.overlay.d;

@InterfaceC6021g
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B'\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR6\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\"R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R'\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)8PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "", "S", "Ll20/c;", "I", "Lru/ozon/composer/compose/widget/c;", "", "index", "Ld00/d;", "widget", "Lk20/g;", "widgetComponentStorage", "<init>", "(ILd00/d;Lk20/g;)V", "Lru/ozon/composer/compose/widget/overlay/d;", "layout", "Lkotlin/Function1;", "Lru/ozon/composer/compose/widget/overlay/f;", "", "spec", "s", "(Lru/ozon/composer/compose/widget/overlay/d;Lkotlin/jvm/functions/Function1;)V", "q", "()Lkotlin/jvm/functions/Function1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "g", "Lkotlin/jvm/functions/Function1;", "p", "r", "(Lkotlin/jvm/functions/Function1;)V", "widgetSpec", AppMeasurementSdk.ConditionalUserProperty.VALUE, "h", "Lru/ozon/composer/compose/widget/overlay/d;", "o", "()Lru/ozon/composer/compose/widget/overlay/d;", "Lm20/a;", "i", "LSc/j;", "e", "()Lm20/a;", "viewMapper", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e<S, I extends l20.c> extends ru.ozon.composer.compose.widget.c<S, I> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f94690j = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function1<? super f<I>, Unit> widgetSpec;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private d layout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewMapper;

    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0004\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "S", "Ll20/c;", "I", "ru/ozon/composer/compose/widget/overlay/e$a$a", "b", "()Lru/ozon/composer/compose/widget/overlay/e$a$a;"}, k = 3, mv = {2, 0, 0})
    static final class a extends AbstractC7737t implements Function0<C1972a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<S, I> f94694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94695c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6018d<S> f94696d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/ozon/composer/compose/widget/overlay/e$a$a", "Lru/ozon/composer/compose/widget/overlay/c;", "", "toString", "()Ljava/lang/String;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.composer.compose.widget.overlay.e$a$a, reason: collision with other inner class name */
        public static final class C1972a extends c<S, I> {

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f94697h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C6018d<S> f94698i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1972a(e<S, I> eVar, int i11, C6018d<S> c6018d) {
                super(eVar);
                this.f94697h = i11;
                this.f94698i = c6018d;
            }

            public String toString() {
                int i11 = this.f94697h;
                String vertical = this.f94698i.getVertical();
                String component = this.f94698i.getComponent();
                String arrays = Arrays.toString(this.f94698i.getVersion());
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                return C3173b.c(Cm.e.g(i11, "overlayViewMapper(index=", ", vertical=", vertical, ", component="), component, ", versions=", arrays, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<S, I> eVar, int i11, C6018d<S> c6018d) {
            super(0);
            this.f94694b = eVar;
            this.f94695c = i11;
            this.f94696d = c6018d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1972a invoke() {
            return new C1972a(this.f94694b, this.f94695c, this.f94696d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, @NotNull C6018d<S> widget, @NotNull C7475g widgetComponentStorage) {
        super(widget, widgetComponentStorage);
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        this.layout = d.c.f94682b;
        this.viewMapper = k.b(new a(this, i11, widget));
    }

    @Override // ru.ozon.composer.compose.widget.c
    @NotNull
    public InterfaceC8046a<S, I> e() {
        return (InterfaceC8046a) this.viewMapper.getValue();
    }

    @Override // ru.ozon.composer.compose.widget.c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!e.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.overlay.OverlayViewMapperSpec<*, *>");
        e eVar = (e) other;
        if (Intrinsics.d(this.widgetSpec, eVar.widgetSpec)) {
            return Intrinsics.d(this.layout, eVar.layout);
        }
        return false;
    }

    @Override // ru.ozon.composer.compose.widget.c
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Function1<? super f<I>, Unit> function1 = this.widgetSpec;
        return this.layout.hashCode() + ((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @NotNull
    /* renamed from: o, reason: from getter */
    public final d getLayout() {
        return this.layout;
    }

    public final Function1<f<I>, Unit> p() {
        return this.widgetSpec;
    }

    @NotNull
    public final Function1<f<I>, Unit> q() {
        Function1<? super f<I>, Unit> function1 = this.widgetSpec;
        if (function1 != null) {
            return function1;
        }
        throw new IllegalArgumentException((f() + " widgetSpec is null").toString());
    }

    public final void r(Function1<? super f<I>, Unit> function1) {
        this.widgetSpec = function1;
    }

    @h
    public final void s(@NotNull d layout, @NotNull Function1<? super f<I>, Unit> spec) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.layout = layout;
        this.widgetSpec = spec;
    }
}
