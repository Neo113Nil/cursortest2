package ru.ozon.composer.ui.widget;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class l extends C7854a implements N10.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l20.b f94878b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f94879c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final W10.d f94880d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final W10.c f94881e;

    /* renamed from: f, reason: collision with root package name */
    private final t f94882f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f94883g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Class f94884h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, List<l>> f94885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull l20.b viewItemInfo, @NotNull h widgetSpan, @NotNull W10.d trackingDataHolder, @NotNull W10.c trackingData, t tVar) {
        super(viewItemInfo);
        Intrinsics.checkNotNullParameter(viewItemInfo, "viewItemInfo");
        Intrinsics.checkNotNullParameter(widgetSpan, "widgetSpan");
        Intrinsics.checkNotNullParameter(trackingDataHolder, "trackingDataHolder");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.f94878b = viewItemInfo;
        this.f94879c = widgetSpan;
        this.f94880d = trackingDataHolder;
        this.f94881e = trackingData;
        this.f94882f = tVar;
        this.f94883g = "";
        this.f94884h = d().getClass();
        Map f7 = viewItemInfo.f();
        this.f94885i = f7 instanceof Map ? f7 : null;
    }

    @Override // N10.a
    @NotNull
    public final Class a() {
        return this.f94884h;
    }

    @Override // l20.C7854a
    @NotNull
    public final <I extends C7854a> I b(@NotNull l20.b viewItemInfo) {
        Intrinsics.checkNotNullParameter(viewItemInfo, "viewItemInfo");
        Intrinsics.checkNotNullParameter(viewItemInfo, "viewItemInfo");
        h widgetSpan = this.f94879c;
        Intrinsics.checkNotNullParameter(widgetSpan, "widgetSpan");
        W10.d trackingDataHolder = this.f94880d;
        Intrinsics.checkNotNullParameter(trackingDataHolder, "trackingDataHolder");
        W10.c trackingData = this.f94881e;
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        return new l(viewItemInfo, widgetSpan, trackingDataHolder, trackingData, this.f94882f);
    }

    @Override // l20.C7854a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.ui.widget.WidgetViewItem");
        l lVar = (l) obj;
        return Intrinsics.d(this.f94878b, lVar.f94878b) && Intrinsics.d(this.f94879c, lVar.f94879c) && Intrinsics.d(this.f94882f, lVar.f94882f);
    }

    @Override // l20.C7854a
    public final Map<String, List<l>> g() {
        return this.f94885i;
    }

    @Override // l20.C7854a
    public final int hashCode() {
        int hashCode = (this.f94881e.hashCode() + ((this.f94879c.hashCode() + (this.f94878b.hashCode() * 31)) * 31)) * 31;
        t tVar = this.f94882f;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @Override // l20.C7854a
    @NotNull
    public final l20.b i() {
        return this.f94878b;
    }

    @NotNull
    public final String l() {
        return this.f94883g;
    }

    public final t m() {
        return this.f94882f;
    }

    @NotNull
    public final W10.c n() {
        return this.f94881e;
    }

    @NotNull
    public final W10.d o() {
        return this.f94880d;
    }

    @NotNull
    public final h p() {
        return this.f94879c;
    }

    public final void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f94883g = str;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetViewItem(viewItemInfo=");
        sb2.append(this.f94878b);
        sb2.append(", widgetSpan=");
        sb2.append(this.f94879c);
        sb2.append(", trackingDataHolder=");
        sb2.append(this.f94880d);
        sb2.append(", trackingData=");
        sb2.append(this.f94881e);
        sb2.append(", tokenizedEvent=");
        return Tl.b.d(sb2, this.f94882f, ")");
    }
}
