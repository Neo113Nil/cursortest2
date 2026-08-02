package ru.ozon.composer.ui.widget;

import A00.a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h20.InterfaceC6786a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.h;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010%\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00028\u0001H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u0001H\u0016¢\u0006\u0004\b.\u0010/R\u001c\u00101\u001a\u0004\u0018\u0001008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u00107\u001a\f\u0012\u0006\b\u0001\u0012\u000206\u0018\u0001058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0;0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010@\u001a\u0004\u0018\u00010\u00018\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\t\u001a\u0004\bB\u0010CR\u001c\u0010E\u001a\u0004\u0018\u00010)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b*\u0010GR\u001b\u0010M\u001a\u00020H8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lru/ozon/composer/ui/widget/g;", "", "S", "Ll20/c;", "I", "Lm20/a;", "LI00/d;", "Lru/ozon/composer/ui/widget/e;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "newItem", "getPayload", "(Ll20/c;Ll20/c;)Ljava/lang/Object;", "item", "LN10/h;", "getStickyWidgetConfig", "(Ll20/c;)LN10/h;", "state", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Ljava/lang/Object;Ll20/c;)Lru/ozon/composer/ui/widget/h;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "LPc/a;", "Lh20/a;", "viewModelWidgetProvider", "LPc/a;", "getViewModelWidgetProvider", "()LPc/a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "widgetStickyConfig", "Ljava/lang/String;", "getWidgetStickyConfig-EWFG4vI", "()Ljava/lang/String;", "getWidgetStickyConfig-EWFG4vI$annotations", "stickyWidgetConfig", "LN10/h;", "()LN10/h;", "", "isFullScreenViewMapper$delegate", "LSc/j;", "isFullScreenViewMapper$composer_recycler_ui_release", "()Z", "isFullScreenViewMapper", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class g<S, I extends l20.c> implements InterfaceC8046a<S, I>, I00.d<S, I>, e<S, I> {
    private final Integer layout;
    private final N10.h stickyWidgetConfig;
    private final Pc.a<? extends InterfaceC6786a> viewModelWidgetProvider;
    private final String widgetStickyConfig;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = K.f71697a;

    /* renamed from: isFullScreenViewMapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isFullScreenViewMapper = Sc.k.a(Sc.n.NONE, new a(this));

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g<S, I> f94867b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<S, I> gVar) {
            super(0);
            this.f94867b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f94867b.getClass().isAnnotationPresent(b.class));
        }
    }

    @InterfaceC3999a
    /* renamed from: getWidgetStickyConfig-EWFG4vI$annotations, reason: not valid java name */
    public static /* synthetic */ void m1593getWidgetStickyConfigEWFG4vI$annotations() {
    }

    @Override // m20.InterfaceC8046a
    public boolean canMap(Object obj) {
        return true;
    }

    public void constructLayout(@NotNull l10.i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
    }

    @NotNull
    public abstract k<I> createHolder(@NotNull l10.i container, @NotNull View view);

    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return null;
    }

    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return K.f71697a;
    }

    public Integer getLayout() {
        return this.layout;
    }

    public Object getPayload(@NotNull I oldItem, @NotNull I newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return null;
    }

    public N10.h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }

    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.viewModelWidgetProvider;
    }

    @NotNull
    public h getWidgetSpan(@NotNull S state, @NotNull I item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.f.f94874b;
    }

    /* renamed from: getWidgetStickyConfig-EWFG4vI, reason: from getter */
    public String getWidgetStickyConfig() {
        return this.widgetStickyConfig;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public InterfaceC8047b getWidgetType() {
        return InterfaceC8047b.a.f74254a;
    }

    public I handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return null;
    }

    public final boolean isFullScreenViewMapper$composer_recycler_ui_release() {
        return ((Boolean) this.isFullScreenViewMapper.getValue()).booleanValue();
    }

    public N10.h getStickyWidgetConfig(@NotNull I item) {
        Intrinsics.checkNotNullParameter(item, "item");
        N10.h stickyWidgetConfig = getStickyWidgetConfig();
        if (stickyWidgetConfig != null) {
            return stickyWidgetConfig;
        }
        String tag = getWidgetStickyConfig();
        if (tag == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new N10.h(tag, 6);
    }
}
