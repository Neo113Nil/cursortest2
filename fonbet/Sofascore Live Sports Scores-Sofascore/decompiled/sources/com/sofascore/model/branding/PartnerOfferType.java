package com.sofascore.model.branding;

import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/model/branding/PartnerOfferType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Streaming", "Product", "Giveaway", "SeeMore", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartnerOfferType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ PartnerOfferType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final PartnerOfferType Streaming = new PartnerOfferType("Streaming", 0, "streaming");
    public static final PartnerOfferType Product = new PartnerOfferType("Product", 1, "product");
    public static final PartnerOfferType Giveaway = new PartnerOfferType("Giveaway", 2, "giveaway");
    public static final PartnerOfferType SeeMore = new PartnerOfferType("SeeMore", 3, "see-more");

    private static final /* synthetic */ PartnerOfferType[] $values() {
        return new PartnerOfferType[]{Streaming, Product, Giveaway, SeeMore};
    }

    static {
        PartnerOfferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private PartnerOfferType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static PartnerOfferType valueOf(String str) {
        return (PartnerOfferType) Enum.valueOf(PartnerOfferType.class, str);
    }

    public static PartnerOfferType[] values() {
        return (PartnerOfferType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/branding/PartnerOfferType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/sofascore/model/branding/PartnerOfferType;", U3.i.X, "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final PartnerOfferType fromValue(@Nullable String value) {
            Object obj;
            Iterator<E> it = PartnerOfferType.getEntries().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String value2 = ((PartnerOfferType) next).getValue();
                if (value != null) {
                    obj = value.toLowerCase(Locale.ROOT);
                    obj.getClass();
                }
                if (Intrinsics.c(value2, obj)) {
                    obj = next;
                    break;
                }
            }
            return (PartnerOfferType) obj;
        }

        private Companion() {
        }
    }
}
