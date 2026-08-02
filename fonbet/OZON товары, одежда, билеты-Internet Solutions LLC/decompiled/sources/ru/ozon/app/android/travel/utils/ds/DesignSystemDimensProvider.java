package ru.ozon.app.android.travel.utils.ds;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0010\b\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0018\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001b\u0010\u001b\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u001b\u0010\u001e\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u001b\u0010!\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u001b\u0010$\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u001b\u0010'\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u001b\u0010*\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u001b\u0010-\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u001b\u00100\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\f\u001a\u0004\b7\u00104R\u001b\u0010;\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\f\u001a\u0004\b:\u00104R\u001b\u0010>\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b=\u00104R\u001b\u0010A\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\f\u001a\u0004\b@\u00104R\u001b\u0010D\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\f\u001a\u0004\bC\u00104R\u001b\u0010G\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\f\u001a\u0004\bF\u00104R\u001b\u0010J\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\f\u001a\u0004\bI\u00104R\u001b\u0010M\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\f\u001a\u0004\bL\u00104R\u001b\u0010P\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\f\u001a\u0004\bO\u00104R\u001b\u0010S\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010\f\u001a\u0004\bR\u00104R\u001b\u0010V\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010\f\u001a\u0004\bU\u00104R\u001b\u0010Y\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\f\u001a\u0004\bX\u00104R\u001b\u0010\\\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010\f\u001a\u0004\b[\u00104R\u001b\u0010_\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010\f\u001a\u0004\b^\u00104R\u001b\u0010b\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010\f\u001a\u0004\ba\u00104R\u001b\u0010e\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010\f\u001a\u0004\bd\u00104¨\u0006f"}, d2 = {"Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "Landroid/content/Context;", "context", "LSc/n;", "lazyMode", "<init>", "(Landroid/content/Context;LSc/n;)V", "Landroid/content/Context;", "LSc/n;", "", "radius4$delegate", "LSc/j;", "getRadius4", "()F", "radius4", "radius6$delegate", "getRadius6", "radius6", "radius8$delegate", "getRadius8", "radius8", "radius10$delegate", "getRadius10", "radius10", "radius12$delegate", "getRadius12", "radius12", "radius14$delegate", "getRadius14", "radius14", "radius16$delegate", "getRadius16", "radius16", "radius18$delegate", "getRadius18", "radius18", "radius20$delegate", "getRadius20", "radius20", "radius24$delegate", "getRadius24", "radius24", "radius28$delegate", "getRadius28", "radius28", "radius32$delegate", "getRadius32", "radius32", "", "margin2$delegate", "getMargin2", "()I", "margin2", "margin4$delegate", "getMargin4", "margin4", "margin6$delegate", "getMargin6", "margin6", "margin8$delegate", "getMargin8", "margin8", "margin10$delegate", "getMargin10", "margin10", "margin12$delegate", "getMargin12", "margin12", "margin14$delegate", "getMargin14", "margin14", "margin16$delegate", "getMargin16", "margin16", "margin18$delegate", "getMargin18", "margin18", "margin20$delegate", "getMargin20", "margin20", "margin24$delegate", "getMargin24", "margin24", "margin32$delegate", "getMargin32", "margin32", "margin40$delegate", "getMargin40", "margin40", "margin44$delegate", "getMargin44", "margin44", "margin48$delegate", "getMargin48", "margin48", "margin52$delegate", "getMargin52", "margin52", "margin56$delegate", "getMargin56", "margin56", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DesignSystemDimensProvider {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    @NotNull
    private final n lazyMode;

    /* renamed from: margin10$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin10;

    /* renamed from: margin12$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin12;

    /* renamed from: margin14$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin14;

    /* renamed from: margin16$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin16;

    /* renamed from: margin18$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin18;

    /* renamed from: margin2$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin2;

    /* renamed from: margin20$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin20;

    /* renamed from: margin24$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin24;

    /* renamed from: margin32$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin32;

    /* renamed from: margin4$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin4;

    /* renamed from: margin40$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin40;

    /* renamed from: margin44$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin44;

    /* renamed from: margin48$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin48;

    /* renamed from: margin52$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin52;

    /* renamed from: margin56$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin56;

    /* renamed from: margin6$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin6;

    /* renamed from: margin8$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j margin8;

    /* renamed from: radius10$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius10;

    /* renamed from: radius12$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius12;

    /* renamed from: radius14$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius14;

    /* renamed from: radius16$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius16;

    /* renamed from: radius18$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius18;

    /* renamed from: radius20$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius20;

    /* renamed from: radius24$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius24;

    /* renamed from: radius28$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius28;

    /* renamed from: radius32$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius32;

    /* renamed from: radius4$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius4;

    /* renamed from: radius6$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius6;

    /* renamed from: radius8$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j radius8;

    public DesignSystemDimensProvider(@NotNull Context context, @NotNull n lazyMode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lazyMode, "lazyMode");
        this.context = context;
        this.lazyMode = lazyMode;
        this.radius4 = k.a(lazyMode, new DesignSystemDimensProvider$radius4$2(this));
        this.radius6 = k.a(lazyMode, new DesignSystemDimensProvider$radius6$2(this));
        this.radius8 = k.a(lazyMode, new DesignSystemDimensProvider$radius8$2(this));
        this.radius10 = k.a(lazyMode, new DesignSystemDimensProvider$radius10$2(this));
        this.radius12 = k.a(lazyMode, new DesignSystemDimensProvider$radius12$2(this));
        this.radius14 = k.a(lazyMode, new DesignSystemDimensProvider$radius14$2(this));
        this.radius16 = k.a(lazyMode, new DesignSystemDimensProvider$radius16$2(this));
        this.radius18 = k.a(lazyMode, new DesignSystemDimensProvider$radius18$2(this));
        this.radius20 = k.a(lazyMode, new DesignSystemDimensProvider$radius20$2(this));
        this.radius24 = k.a(lazyMode, new DesignSystemDimensProvider$radius24$2(this));
        this.radius28 = k.a(lazyMode, new DesignSystemDimensProvider$radius28$2(this));
        this.radius32 = k.a(lazyMode, new DesignSystemDimensProvider$radius32$2(this));
        this.margin2 = k.a(lazyMode, new DesignSystemDimensProvider$margin2$2(this));
        this.margin4 = k.a(lazyMode, new DesignSystemDimensProvider$margin4$2(this));
        this.margin6 = k.a(lazyMode, new DesignSystemDimensProvider$margin6$2(this));
        this.margin8 = k.a(lazyMode, new DesignSystemDimensProvider$margin8$2(this));
        this.margin10 = k.a(lazyMode, new DesignSystemDimensProvider$margin10$2(this));
        this.margin12 = k.a(lazyMode, new DesignSystemDimensProvider$margin12$2(this));
        this.margin14 = k.a(lazyMode, new DesignSystemDimensProvider$margin14$2(this));
        this.margin16 = k.a(lazyMode, new DesignSystemDimensProvider$margin16$2(this));
        this.margin18 = k.a(lazyMode, new DesignSystemDimensProvider$margin18$2(this));
        this.margin20 = k.a(lazyMode, new DesignSystemDimensProvider$margin20$2(this));
        this.margin24 = k.a(lazyMode, new DesignSystemDimensProvider$margin24$2(this));
        this.margin32 = k.a(lazyMode, new DesignSystemDimensProvider$margin32$2(this));
        this.margin40 = k.a(lazyMode, new DesignSystemDimensProvider$margin40$2(this));
        this.margin44 = k.a(lazyMode, new DesignSystemDimensProvider$margin44$2(this));
        this.margin48 = k.a(lazyMode, new DesignSystemDimensProvider$margin48$2(this));
        this.margin52 = k.a(lazyMode, new DesignSystemDimensProvider$margin52$2(this));
        this.margin56 = k.a(lazyMode, new DesignSystemDimensProvider$margin56$2(this));
    }

    public final int getMargin10() {
        return ((Number) this.margin10.getValue()).intValue();
    }

    public final int getMargin12() {
        return ((Number) this.margin12.getValue()).intValue();
    }

    public final int getMargin14() {
        return ((Number) this.margin14.getValue()).intValue();
    }

    public final int getMargin16() {
        return ((Number) this.margin16.getValue()).intValue();
    }

    public final int getMargin18() {
        return ((Number) this.margin18.getValue()).intValue();
    }

    public final int getMargin2() {
        return ((Number) this.margin2.getValue()).intValue();
    }

    public final int getMargin20() {
        return ((Number) this.margin20.getValue()).intValue();
    }

    public final int getMargin24() {
        return ((Number) this.margin24.getValue()).intValue();
    }

    public final int getMargin32() {
        return ((Number) this.margin32.getValue()).intValue();
    }

    public final int getMargin4() {
        return ((Number) this.margin4.getValue()).intValue();
    }

    public final int getMargin40() {
        return ((Number) this.margin40.getValue()).intValue();
    }

    public final int getMargin44() {
        return ((Number) this.margin44.getValue()).intValue();
    }

    public final int getMargin48() {
        return ((Number) this.margin48.getValue()).intValue();
    }

    public final int getMargin52() {
        return ((Number) this.margin52.getValue()).intValue();
    }

    public final int getMargin56() {
        return ((Number) this.margin56.getValue()).intValue();
    }

    public final int getMargin6() {
        return ((Number) this.margin6.getValue()).intValue();
    }

    public final int getMargin8() {
        return ((Number) this.margin8.getValue()).intValue();
    }

    public final float getRadius10() {
        return ((Number) this.radius10.getValue()).floatValue();
    }

    public final float getRadius12() {
        return ((Number) this.radius12.getValue()).floatValue();
    }

    public final float getRadius16() {
        return ((Number) this.radius16.getValue()).floatValue();
    }

    public final float getRadius20() {
        return ((Number) this.radius20.getValue()).floatValue();
    }

    public final float getRadius24() {
        return ((Number) this.radius24.getValue()).floatValue();
    }

    public final float getRadius32() {
        return ((Number) this.radius32.getValue()).floatValue();
    }

    public final float getRadius4() {
        return ((Number) this.radius4.getValue()).floatValue();
    }

    public final float getRadius6() {
        return ((Number) this.radius6.getValue()).floatValue();
    }

    public final float getRadius8() {
        return ((Number) this.radius8.getValue()).floatValue();
    }

    public /* synthetic */ DesignSystemDimensProvider(Context context, n nVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? n.NONE : nVar);
    }
}
