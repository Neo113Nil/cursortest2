package ru.ozon.app.android.pdp.widgets.delivery.v5.presentation;

import G.g;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryFooter;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryHeader;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliverySection;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005BG\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0013\u0010\u0014J\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b\u0010\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b/\u0010,R\u001a\u00100\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019¨\u00063"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5Vo;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", CommentV3DTO.FOOTER_FIELD_NAME, "", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection;", "sections", "", "isHidden", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", "deliveryItems", "<init>", "(JLru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;Ljava/util/List;ZLjava/util/List;)V", "copy", "(JLru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;Ljava/util/List;ZLjava/util/List;)Lru/ozon/app/android/pdp/widgets/delivery/v5/presentation/DeliveryV5Vo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", "getHeader", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", "getFooter", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "Z", "()Z", "getDeliveryItems", "widgetName", "Ljava/lang/String;", "getWidgetName", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryV5Vo implements c, InterfaceC8039a, m, o {

    @NotNull
    private final List<DeliveryAdapterItem> deliveryItems;
    private final DeliveryFooter footer;
    private final DeliveryHeader header;
    private final long id;
    private final boolean isHidden;

    @NotNull
    private final List<DeliverySection> sections;

    @NotNull
    private final String widgetName;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryV5Vo(long j11, DeliveryHeader deliveryHeader, DeliveryFooter deliveryFooter, @NotNull List<? extends DeliverySection> sections, boolean z11, @NotNull List<? extends DeliveryAdapterItem> deliveryItems) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(deliveryItems, "deliveryItems");
        this.id = j11;
        this.header = deliveryHeader;
        this.footer = deliveryFooter;
        this.sections = sections;
        this.isHidden = z11;
        this.deliveryItems = deliveryItems;
        this.widgetName = "pdp_delivery";
    }

    public static /* synthetic */ DeliveryV5Vo copy$default(DeliveryV5Vo deliveryV5Vo, long j11, DeliveryHeader deliveryHeader, DeliveryFooter deliveryFooter, List list, boolean z11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = deliveryV5Vo.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            deliveryHeader = deliveryV5Vo.header;
        }
        DeliveryHeader deliveryHeader2 = deliveryHeader;
        if ((i11 & 4) != 0) {
            deliveryFooter = deliveryV5Vo.footer;
        }
        DeliveryFooter deliveryFooter2 = deliveryFooter;
        if ((i11 & 8) != 0) {
            list = deliveryV5Vo.sections;
        }
        List list3 = list;
        if ((i11 & 16) != 0) {
            z11 = deliveryV5Vo.isHidden;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            list2 = deliveryV5Vo.deliveryItems;
        }
        return deliveryV5Vo.copy(j12, deliveryHeader2, deliveryFooter2, list3, z12, list2);
    }

    @NotNull
    public final DeliveryV5Vo copy(long id2, DeliveryHeader header, DeliveryFooter footer, @NotNull List<? extends DeliverySection> sections, boolean isHidden, @NotNull List<? extends DeliveryAdapterItem> deliveryItems) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(deliveryItems, "deliveryItems");
        return new DeliveryV5Vo(id2, header, footer, sections, isHidden, deliveryItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryV5Vo)) {
            return false;
        }
        DeliveryV5Vo deliveryV5Vo = (DeliveryV5Vo) other;
        return this.id == deliveryV5Vo.id && Intrinsics.d(this.header, deliveryV5Vo.header) && Intrinsics.d(this.footer, deliveryV5Vo.footer) && Intrinsics.d(this.sections, deliveryV5Vo.sections) && this.isHidden == deliveryV5Vo.isHidden && Intrinsics.d(this.deliveryItems, deliveryV5Vo.deliveryItems);
    }

    @NotNull
    public final List<DeliveryAdapterItem> getDeliveryItems() {
        return this.deliveryItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<DeliverySection> getSections() {
        return this.sections;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        DeliveryHeader deliveryHeader = this.header;
        int hashCode2 = (hashCode + (deliveryHeader == null ? 0 : deliveryHeader.hashCode())) * 31;
        DeliveryFooter deliveryFooter = this.footer;
        return this.deliveryItems.hashCode() + C3532b.a(g.b((hashCode2 + (deliveryFooter != null ? deliveryFooter.hashCode() : 0)) * 31, 31, this.sections), 31, this.isHidden);
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        return "DeliveryV5Vo(id=" + this.id + ", header=" + this.header + ", footer=" + this.footer + ", sections=" + this.sections + ", isHidden=" + this.isHidden + ", deliveryItems=" + this.deliveryItems + ")";
    }
}
