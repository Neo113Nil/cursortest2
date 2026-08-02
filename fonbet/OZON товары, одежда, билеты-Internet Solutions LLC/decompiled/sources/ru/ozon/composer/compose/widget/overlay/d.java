package ru.ozon.composer.compose.widget.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import c20.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0011\u000f\r\u0007\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128 X \u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/d;", "", "<init>", "()V", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "b", "(Ll10/i;)Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "", "d", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "a", "f", "e", "Lc20/r$a;", "c", "()Lc20/r$a;", "viewType", "Lru/ozon/composer/compose/widget/overlay/d$a;", "Lru/ozon/composer/compose/widget/overlay/d$b;", "Lru/ozon/composer/compose/widget/overlay/d$c;", "Lru/ozon/composer/compose/widget/overlay/d$d;", "Lru/ozon/composer/compose/widget/overlay/d$e;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f94673a = 0;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/composer/compose/widget/overlay/d$a;", "Lru/ozon/composer/compose/widget/overlay/d;", "<init>", "()V", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "b", "(Ll10/i;)Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "", "a", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "f", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "c", "Lc20/r$a;", "()Lc20/r$a;", "viewType", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f94674b = new a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private static final r.a viewType = r.a.MULTIPLE;

        /* renamed from: d, reason: collision with root package name */
        public static final int f94676d = 0;

        private a() {
            super(null);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void a(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.addView(view);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        public ViewGroup b(@NotNull i container) {
            Intrinsics.checkNotNullParameter(container, "container");
            return C10183a.c(container.Z());
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        /* renamed from: c */
        public r.a getViewType() {
            return viewType;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void f(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.removeView(view);
        }

        public int hashCode() {
            return 196423126;
        }

        @NotNull
        public String toString() {
            return "Bottom";
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u001bR$\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020'8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b!\u0010)¨\u0006+"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/d$b;", "Lru/ozon/composer/compose/widget/overlay/d;", "", "x", "y", "<init>", "(II)V", "", "skipInSnapshot", "(IIZ)V", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "b", "(Ll10/i;)Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "", "d", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "e", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "h", "c", "i", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Z", "g", "()Z", "Lc20/r$a;", "Lc20/r$a;", "()Lc20/r$a;", "viewType", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: f, reason: collision with root package name */
        public static final int f94677f = 8;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int x;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int y;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean skipInSnapshot;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private final r.a viewType;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b() {
            this(r2, r2, 3, null);
            int i11 = 0;
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        public ViewGroup b(@NotNull i container) {
            Intrinsics.checkNotNullParameter(container, "container");
            return container.Z();
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        /* renamed from: c, reason: from getter */
        public r.a getViewType() {
            return this.viewType;
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void d(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setX(ResourceExtKt.toPxF(this.x, context));
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view.setY(ResourceExtKt.toPxF(this.y, context2));
            if (this.skipInSnapshot) {
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setTag(R.id.tag_skip_draw_in_composer_snapshot, Boolean.TRUE);
            } else {
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setTag(R.id.tag_skip_draw_in_composer_snapshot, null);
            }
            viewGroup.addView(view);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void e(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.removeView(view);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!b.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.overlay.OverlayLayout.Floating");
            b bVar = (b) other;
            return this.x == bVar.x && this.y == bVar.y && this.skipInSnapshot == bVar.skipInSnapshot;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getSkipInSnapshot() {
            return this.skipInSnapshot;
        }

        /* renamed from: h, reason: from getter */
        public final int getX() {
            return this.x;
        }

        public int hashCode() {
            return Boolean.hashCode(this.skipInSnapshot) + (((this.x * 31) + this.y) * 31);
        }

        /* renamed from: i, reason: from getter */
        public final int getY() {
            return this.y;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Floating(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            sb2.append(this.y);
            sb2.append(", skipInSnapshot=");
            return Pk0.a.a(")", sb2, this.skipInSnapshot);
        }

        public /* synthetic */ b(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public b(int i11, int i12) {
            super(null);
            this.x = i11;
            this.y = i12;
            this.viewType = r.a.SINGLE;
        }

        public b(int i11, int i12, boolean z11) {
            this(i11, i12);
            this.skipInSnapshot = z11;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/d$c;", "Lru/ozon/composer/compose/widget/overlay/d;", "<init>", "()V", "Ll10/i;", "container", "", "g", "(Ll10/i;)Ljava/lang/Void;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "c", "()Lc20/r$a;", "viewType", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f94682b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f94683c = 0;

        private c() {
            super(null);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public /* bridge */ /* synthetic */ ViewGroup b(i iVar) {
            return (ViewGroup) g(iVar);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        /* renamed from: c */
        public r.a getViewType() {
            throw new IllegalArgumentException("type must specified directly");
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        @NotNull
        public Void g(@NotNull i container) {
            Intrinsics.checkNotNullParameter(container, "container");
            throw new IllegalArgumentException("type must specified directly");
        }

        public int hashCode() {
            return 1408381347;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/composer/compose/widget/overlay/d$d;", "Lru/ozon/composer/compose/widget/overlay/d;", "<init>", "()V", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "b", "(Ll10/i;)Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "", "d", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "e", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "c", "Lc20/r$a;", "()Lc20/r$a;", "viewType", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.composer.compose.widget.overlay.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1971d extends d {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1971d f94684b = new C1971d();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private static final r.a viewType = r.a.SINGLE;

        /* renamed from: d, reason: collision with root package name */
        public static final int f94686d = 0;

        private C1971d() {
            super(null);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public ViewGroup b(@NotNull i container) {
            Intrinsics.checkNotNullParameter(container, "container");
            ViewGroup viewGroup = (ViewGroup) container.Z().findViewById(R.id.toolbarTb);
            if (viewGroup == null) {
                return null;
            }
            ViewExtKt.updatePadding$default(viewGroup, 0, 0, 0, 0, 13, null);
            return viewGroup;
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        /* renamed from: c */
        public r.a getViewType() {
            return viewType;
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void d(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.addView(view);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void e(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.removeView(view);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C1971d);
        }

        public int hashCode() {
            return 584478000;
        }

        @NotNull
        public String toString() {
            return "Toolbar";
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/composer/compose/widget/overlay/d$e;", "Lru/ozon/composer/compose/widget/overlay/d;", "<init>", "()V", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "b", "(Ll10/i;)Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "", "a", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "f", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "c", "Lc20/r$a;", "()Lc20/r$a;", "viewType", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f94687b = new e();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private static final r.a viewType = r.a.MULTIPLE;

        /* renamed from: d, reason: collision with root package name */
        public static final int f94689d = 0;

        private e() {
            super(null);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void a(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.addView(view);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        public ViewGroup b(@NotNull i container) {
            Intrinsics.checkNotNullParameter(container, "container");
            return C10183a.o(container.Z());
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        @NotNull
        /* renamed from: c */
        public r.a getViewType() {
            return viewType;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.d
        public void f(@NotNull ViewGroup viewGroup, @NotNull View view) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(view, "view");
            viewGroup.removeView(view);
        }

        public int hashCode() {
            return 1015268746;
        }

        @NotNull
        public String toString() {
            return "Top";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public void a(@NotNull ViewGroup viewGroup, @NotNull View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract ViewGroup b(@NotNull i container);

    @NotNull
    /* renamed from: c */
    public abstract r.a getViewType();

    public void d(@NotNull ViewGroup viewGroup, @NotNull View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void e(@NotNull ViewGroup viewGroup, @NotNull View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void f(@NotNull ViewGroup viewGroup, @NotNull View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private d() {
    }
}
