package ru.ozon.composer.compose.widget;

import S0.InterfaceC3967k;
import d00.InterfaceC6021g;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import l20.c;
import org.jetbrains.annotations.NotNull;

@InterfaceC6021g
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BI\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R2\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Ll20/c;", "I", "", "item", "Ll20/d;", "info", "Ll20/a;", "viewItem", "LW10/c;", "trackingData", "Lkotlin/Function2;", "", "", "", "Le00/c;", "placeholders", "<init>", "(Ll20/c;Ll20/d;Ll20/a;LW10/c;Lfd/o;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ll20/c;", "b", "()Ll20/c;", "Ll20/d;", "()Ll20/d;", "c", "Ll20/a;", "e", "()Ll20/a;", "d", "LW10/c;", "()LW10/c;", "Lfd/o;", "()Lfd/o;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i<I extends l20.c> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f94636f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final I item;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final l20.d info;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final C7854a viewItem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final W10.c trackingData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC6512o<String, Boolean, InterfaceC3967k, Integer, List<e00.c>> placeholders;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull I item, @NotNull l20.d info, @NotNull C7854a viewItem, @NotNull W10.c trackingData, @NotNull InterfaceC6512o<? super String, ? super Boolean, ? super InterfaceC3967k, ? super Integer, ? extends List<e00.c>> placeholders) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.item = item;
        this.info = info;
        this.viewItem = viewItem;
        this.trackingData = trackingData;
        this.placeholders = placeholders;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final l20.d getInfo() {
        return this.info;
    }

    @NotNull
    public final I b() {
        return this.item;
    }

    @NotNull
    public final InterfaceC6512o<String, Boolean, InterfaceC3967k, Integer, List<e00.c>> c() {
        return this.placeholders;
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final W10.c getTrackingData() {
        return this.trackingData;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final C7854a getViewItem() {
        return this.viewItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!i.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.WidgetState<*>");
        i iVar = (i) other;
        return Intrinsics.d(this.item, iVar.item) && Intrinsics.d(this.info, iVar.info) && Intrinsics.d(this.trackingData, iVar.trackingData) && Intrinsics.d(this.placeholders, iVar.placeholders) && Intrinsics.d(this.viewItem, iVar.viewItem);
    }

    public int hashCode() {
        return this.viewItem.hashCode() + ((this.placeholders.hashCode() + ((this.trackingData.hashCode() + ((this.info.hashCode() + (this.item.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
