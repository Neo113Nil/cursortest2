package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotIntro.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/BotIntro;", "", "id", "", "operator", "Lio/intercom/android/sdk/models/Participant$Builder;", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/models/Participant$Builder;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getOperator", "()Lio/intercom/android/sdk/models/Participant$Builder;", "getBlocks", "()Ljava/util/List;", "getBuiltParticipant", "Lio/intercom/android/sdk/models/Participant;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BotIntro {

    @SerializedName("parts")
    private final List<List<Block.Builder>> blocks;

    @SerializedName("id")
    private final String id;

    @SerializedName("operator")
    private final Participant.Builder operator;
    public static final int $stable = 8;
    public static final BotIntro NULL = new BotIntro(null, null, null, 7, null);

    public BotIntro() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotIntro copy$default(BotIntro botIntro, String str, Participant.Builder builder, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botIntro.id;
        }
        if ((i & 2) != 0) {
            builder = botIntro.operator;
        }
        if ((i & 4) != 0) {
            list = botIntro.blocks;
        }
        return botIntro.copy(str, builder, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Participant.Builder getOperator() {
        return this.operator;
    }

    public final List<List<Block.Builder>> component3() {
        return this.blocks;
    }

    public final BotIntro copy(String id, Participant.Builder operator, List<? extends List<Block.Builder>> blocks) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new BotIntro(id, operator, blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotIntro)) {
            return false;
        }
        BotIntro botIntro = (BotIntro) other;
        return Intrinsics.areEqual(this.id, botIntro.id) && Intrinsics.areEqual(this.operator, botIntro.operator) && Intrinsics.areEqual(this.blocks, botIntro.blocks);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.operator.hashCode()) * 31) + this.blocks.hashCode();
    }

    public String toString() {
        return "BotIntro(id=" + this.id + ", operator=" + this.operator + ", blocks=" + this.blocks + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BotIntro(String id, Participant.Builder operator, List<? extends List<Block.Builder>> blocks) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.id = id;
        this.operator = operator;
        this.blocks = blocks;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ BotIntro(String str, Participant.Builder builder, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new Participant.Builder() : builder, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final Participant.Builder getOperator() {
        return this.operator;
    }

    public final List<List<Block.Builder>> getBlocks() {
        return this.blocks;
    }

    public final Participant getBuiltParticipant() {
        Participant build = this.operator.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
