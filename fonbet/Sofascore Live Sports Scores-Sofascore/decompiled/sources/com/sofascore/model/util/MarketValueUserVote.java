package com.sofascore.model.util;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sofascore/model/util/MarketValueUserVote;", "", "playerId", "", "playerValue", "", InAppPurchaseMetaData.KEY_CURRENCY, "", "voteType", "Lcom/sofascore/model/util/MarketValueVoteType;", "<init>", "(IJLjava/lang/String;Lcom/sofascore/model/util/MarketValueVoteType;)V", "getPlayerId", "()I", "getPlayerValue", "()J", "getCurrency", "()Ljava/lang/String;", "getVoteType", "()Lcom/sofascore/model/util/MarketValueVoteType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MarketValueUserVote {

    @NotNull
    private final String currency;
    private final int playerId;
    private final long playerValue;

    @NotNull
    private final MarketValueVoteType voteType;

    public MarketValueUserVote(int i, long j, @NotNull String str, @NotNull MarketValueVoteType marketValueVoteType) {
        str.getClass();
        marketValueVoteType.getClass();
        this.playerId = i;
        this.playerValue = j;
        this.currency = str;
        this.voteType = marketValueVoteType;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public final long getPlayerValue() {
        return this.playerValue;
    }

    @NotNull
    public final MarketValueVoteType getVoteType() {
        return this.voteType;
    }
}
