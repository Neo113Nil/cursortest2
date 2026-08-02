package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import De.C2859b;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
public final class o implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f87117a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<CellDTO> f87118b;

    /* renamed from: c, reason: collision with root package name */
    private final a f87119c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ButtonV3DTO f87120d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f87121e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f87122f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87123a;

        /* renamed from: b, reason: collision with root package name */
        private final String f87124b;

        /* renamed from: c, reason: collision with root package name */
        private final int f87125c;

        public a(@NotNull String placeholder, String str, int i11) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.f87123a = placeholder;
            this.f87124b = str;
            this.f87125c = i11;
        }

        public final int a() {
            return this.f87125c;
        }

        public final String b() {
            return this.f87124b;
        }

        @NotNull
        public final String c() {
            return this.f87123a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f87123a, aVar.f87123a) && Intrinsics.d(this.f87124b, aVar.f87124b) && this.f87125c == aVar.f87125c;
        }

        public final int hashCode() {
            int hashCode = this.f87123a.hashCode() * 31;
            String str = this.f87124b;
            return Integer.hashCode(this.f87125c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextArea(placeholder=");
            sb2.append(this.f87123a);
            sb2.append(", notEmptyCaption=");
            sb2.append(this.f87124b);
            sb2.append(", maxLength=");
            return K00.b.e(this.f87125c, ")", sb2);
        }
    }

    public o(long j11, @NotNull List elementsCell, a aVar, @NotNull ButtonV3DTO complainButton, @NotNull String widgetBackgroundColor, Map map) {
        Intrinsics.checkNotNullParameter(elementsCell, "elementsCell");
        Intrinsics.checkNotNullParameter(complainButton, "complainButton");
        Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
        Intrinsics.checkNotNullParameter("bgSecondary", "cellsBackgroundColor");
        this.f87117a = j11;
        this.f87118b = elementsCell;
        this.f87119c = aVar;
        this.f87120d = complainButton;
        this.f87121e = widgetBackgroundColor;
        this.f87122f = map;
    }

    @NotNull
    public final ButtonV3DTO a() {
        return this.f87120d;
    }

    @NotNull
    public final List<CellDTO> b() {
        return this.f87118b;
    }

    public final a c() {
        return this.f87119c;
    }

    public final Map<String, MessengerTrackingInfo> d() {
        return this.f87122f;
    }

    @NotNull
    public final String e() {
        return this.f87121e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f87117a == oVar.f87117a && Intrinsics.d(this.f87118b, oVar.f87118b) && Intrinsics.d(this.f87119c, oVar.f87119c) && Intrinsics.d(this.f87120d, oVar.f87120d) && this.f87121e.equals(oVar.f87121e) && Intrinsics.d(this.f87122f, oVar.f87122f);
    }

    @Override // l20.c
    public final long getId() {
        return this.f87117a;
    }

    @Override // l20.c
    public final Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public final int getViewItemKey() {
        return hashCode();
    }

    public final int hashCode() {
        int b11 = G.g.b(Long.hashCode(this.f87117a) * 31, 31, this.f87118b);
        int hashCode = (((this.f87121e.hashCode() + C2859b.c(this.f87120d, (b11 + (this.f87119c == null ? 0 : r3.hashCode())) * 31, 31)) * 31) - 1882226001) * 31;
        Map<String, MessengerTrackingInfo> map = this.f87122f;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportAbuseFormVO(id=");
        sb2.append(this.f87117a);
        sb2.append(", elementsCell=");
        sb2.append(this.f87118b);
        sb2.append(", textArea=");
        sb2.append(this.f87119c);
        sb2.append(", complainButton=");
        sb2.append(this.f87120d);
        sb2.append(", widgetBackgroundColor=");
        sb2.append(this.f87121e);
        sb2.append(", cellsBackgroundColor=bgSecondary, trackingInfo=");
        return P.f(sb2, this.f87122f, ")");
    }
}
