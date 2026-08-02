package ru.ozon.composer.compose.widget.scrollable;

import T7.P;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c00.InterfaceC5696a;
import java.util.Locale;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.g;

@InterfaceC5696a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/a;", "LC10/i;", "Lru/ozon/composer/compose/widget/c;", "spec", "Lru/ozon/composer/compose/widget/scrollable/e;", "offsetModifier", "<init>", "(Lru/ozon/composer/compose/widget/c;Lru/ozon/composer/compose/widget/scrollable/e;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "toString", "()Ljava/lang/String;", "", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "key", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends C10.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f94703e = 8;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.compose.widget.c<?, ?> f94704b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f94705c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.compose.widget.c f94706d;

    public a(@NotNull ru.ozon.composer.compose.widget.c<?, ?> spec, @NotNull e offsetModifier) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(offsetModifier, "offsetModifier");
        this.f94704b = spec;
        this.f94705c = offsetModifier;
        this.f94706d = spec;
    }

    @Override // C10.i
    @NotNull
    public Object a() {
        return this.f94706d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        ru.ozon.composer.ui.widget.l viewItem;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        if (e11 instanceof b) {
            b bVar = (b) e11;
            if (bVar.i() == this.f94704b && (viewItem = bVar.getViewItem()) != null) {
                C7460f modify = this.f94705c.modify(new C7460f(outRect.left, outRect.top, outRect.right, outRect.bottom), new ru.ozon.composer.compose.widget.i<>(viewItem.d(), viewItem.c(), viewItem, viewItem.n(), ru.ozon.composer.compose.widget.j.a()), new g.a(bVar.getAdapterPosition()));
                outRect.set((int) modify.n(), (int) modify.q(), (int) modify.o(), (int) modify.h());
            }
        }
    }

    @NotNull
    public String toString() {
        String valueOf;
        String valueOf2;
        ru.ozon.composer.compose.widget.c<?, ?> cVar = this.f94704b;
        String vertical = cVar.f().getVertical();
        if (vertical.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = vertical.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                valueOf2 = CharsKt.e(charAt, locale);
            } else {
                valueOf2 = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf2);
            String substring = vertical.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
            vertical = sb2.toString();
        }
        String component = cVar.f().getComponent();
        if (component.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            char charAt2 = component.charAt(0);
            if (Character.isLowerCase(charAt2)) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                valueOf = CharsKt.e(charAt2, locale2);
            } else {
                valueOf = String.valueOf(charAt2);
            }
            sb3.append((Object) valueOf);
            String substring2 = component.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb3.append(substring2);
            component = sb3.toString();
        }
        return G.g.c(vertical, component, "ComposeDecorator");
    }
}
