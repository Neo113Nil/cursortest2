package com.sofascore.model.newNetwork.post;

import defpackage.a7a;
import defpackage.lkb;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 52\u00020\u0001:\u000265Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010(\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/post/TransferSuggestPostBody;", "Ljava/io/Serializable;", "", "transferFrom", "transferTo", "", "timestamp", "", "transferCurrency", "transferFee", "contractUntil", "type", "link", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/post/TransferSuggestPostBody;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getTransferFrom", "()Ljava/lang/Integer;", "setTransferFrom", "(Ljava/lang/Integer;)V", "getTransferTo", "setTransferTo", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/String;", "getTransferCurrency", "()Ljava/lang/String;", "setTransferCurrency", "(Ljava/lang/String;)V", "getTransferFee", "setTransferFee", "getContractUntil", "setContractUntil", "getType", "setType", "getLink", "setLink", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransferSuggestPostBody implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long contractUntil;

    @Nullable
    private String link;

    @Nullable
    private Long timestamp;

    @Nullable
    private String transferCurrency;

    @Nullable
    private Long transferFee;

    @Nullable
    private Integer transferFrom;

    @Nullable
    private Integer transferTo;

    @Nullable
    private Integer type;

    public /* synthetic */ TransferSuggestPostBody(int i, Integer num, Integer num2, Long l, String str, Long l2, Long l3, Integer num3, String str2, t5h t5hVar) {
        if ((i & 1) == 0) {
            this.transferFrom = null;
        } else {
            this.transferFrom = num;
        }
        if ((i & 2) == 0) {
            this.transferTo = null;
        } else {
            this.transferTo = num2;
        }
        if ((i & 4) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l;
        }
        if ((i & 8) == 0) {
            this.transferCurrency = null;
        } else {
            this.transferCurrency = str;
        }
        if ((i & 16) == 0) {
            this.transferFee = null;
        } else {
            this.transferFee = l2;
        }
        if ((i & 32) == 0) {
            this.contractUntil = null;
        } else {
            this.contractUntil = l3;
        }
        if ((i & 64) == 0) {
            this.type = null;
        } else {
            this.type = num3;
        }
        if ((i & 128) == 0) {
            this.link = null;
        } else {
            this.link = str2;
        }
    }

    public static final /* synthetic */ void write$Self$model_release(TransferSuggestPostBody self, wf3 output, SerialDescriptor serialDesc) {
        if (output.o(serialDesc) || self.transferFrom != null) {
            output.h(serialDesc, 0, a7a.a, self.transferFrom);
        }
        if (output.o(serialDesc) || self.transferTo != null) {
            output.h(serialDesc, 1, a7a.a, self.transferTo);
        }
        if (output.o(serialDesc) || self.timestamp != null) {
            output.h(serialDesc, 2, lkb.a, self.timestamp);
        }
        if (output.o(serialDesc) || self.transferCurrency != null) {
            output.h(serialDesc, 3, uhi.a, self.transferCurrency);
        }
        if (output.o(serialDesc) || self.transferFee != null) {
            output.h(serialDesc, 4, lkb.a, self.transferFee);
        }
        if (output.o(serialDesc) || self.contractUntil != null) {
            output.h(serialDesc, 5, lkb.a, self.contractUntil);
        }
        if (output.o(serialDesc) || self.type != null) {
            output.h(serialDesc, 6, a7a.a, self.type);
        }
        if (!output.o(serialDesc) && self.link == null) {
            return;
        }
        output.h(serialDesc, 7, uhi.a, self.link);
    }

    @Nullable
    public final Long getContractUntil() {
        return this.contractUntil;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTransferCurrency() {
        return this.transferCurrency;
    }

    @Nullable
    public final Long getTransferFee() {
        return this.transferFee;
    }

    @Nullable
    public final Integer getTransferFrom() {
        return this.transferFrom;
    }

    @Nullable
    public final Integer getTransferTo() {
        return this.transferTo;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setContractUntil(@Nullable Long l) {
        this.contractUntil = l;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setTimestamp(@Nullable Long l) {
        this.timestamp = l;
    }

    public final void setTransferCurrency(@Nullable String str) {
        this.transferCurrency = str;
    }

    public final void setTransferFee(@Nullable Long l) {
        this.transferFee = l;
    }

    public final void setTransferFrom(@Nullable Integer num) {
        this.transferFrom = num;
    }

    public final void setTransferTo(@Nullable Integer num) {
        this.transferTo = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/post/TransferSuggestPostBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/post/TransferSuggestPostBody;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TransferSuggestPostBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TransferSuggestPostBody() {
        this((Integer) null, (Integer) null, (Long) null, (String) null, (Long) null, (Long) null, (Integer) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public TransferSuggestPostBody(@Nullable Integer num, @Nullable Integer num2, @Nullable Long l, @Nullable String str, @Nullable Long l2, @Nullable Long l3, @Nullable Integer num3, @Nullable String str2) {
        this.transferFrom = num;
        this.transferTo = num2;
        this.timestamp = l;
        this.transferCurrency = str;
        this.transferFee = l2;
        this.contractUntil = l3;
        this.type = num3;
        this.link = str2;
    }

    public /* synthetic */ TransferSuggestPostBody(Integer num, Integer num2, Long l, String str, Long l2, Long l3, Integer num3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str2);
    }
}
