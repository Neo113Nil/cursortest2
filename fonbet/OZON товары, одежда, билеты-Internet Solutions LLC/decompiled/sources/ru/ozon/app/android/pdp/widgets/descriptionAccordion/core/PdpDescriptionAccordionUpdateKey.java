package ru.ozon.app.android.pdp.widgets.descriptionAccordion.core;

import A00.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/PdpDescriptionAccordionUpdateKey;", "LA00/a$J$a;", "", "isExpanded", "", "id", "<init>", "(ZJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "J", "getId", "()J", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PdpDescriptionAccordionUpdateKey implements a.J.InterfaceC0007a {
    private final long id;
    private final boolean isExpanded;

    public PdpDescriptionAccordionUpdateKey(boolean z11, long j11) {
        this.isExpanded = z11;
        this.id = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpDescriptionAccordionUpdateKey)) {
            return false;
        }
        PdpDescriptionAccordionUpdateKey pdpDescriptionAccordionUpdateKey = (PdpDescriptionAccordionUpdateKey) other;
        return this.isExpanded == pdpDescriptionAccordionUpdateKey.isExpanded && this.id == pdpDescriptionAccordionUpdateKey.id;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.id) + (Boolean.hashCode(this.isExpanded) * 31);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        return "PdpDescriptionAccordionUpdateKey(isExpanded=" + this.isExpanded + ", id=" + this.id + ")";
    }
}
