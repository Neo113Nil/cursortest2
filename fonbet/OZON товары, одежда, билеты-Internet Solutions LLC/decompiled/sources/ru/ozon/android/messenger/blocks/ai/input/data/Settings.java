package ru.ozon.android.messenger.blocks.ai.input.data;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/input/data/Settings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Settings {
    public static final int $stable = 0;
    private final Paddings bottomPadding;
    private final Paddings leftPadding;
    private final Paddings rightPadding;
    private final Paddings topPadding;

    public Settings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
        this.topPadding = paddings;
        this.bottomPadding = paddings2;
        this.leftPadding = paddings3;
        this.rightPadding = paddings4;
    }

    public static /* synthetic */ Settings copy$default(Settings settings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = settings.topPadding;
        }
        if ((i11 & 2) != 0) {
            paddings2 = settings.bottomPadding;
        }
        if ((i11 & 4) != 0) {
            paddings3 = settings.leftPadding;
        }
        if ((i11 & 8) != 0) {
            paddings4 = settings.rightPadding;
        }
        return settings.copy(paddings, paddings2, paddings3, paddings4);
    }

    /* renamed from: component1, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final Settings copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding) {
        return new Settings(topPadding, bottomPadding, leftPadding, rightPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) other;
        return this.topPadding == settings.topPadding && this.bottomPadding == settings.bottomPadding && this.leftPadding == settings.leftPadding && this.rightPadding == settings.rightPadding;
    }

    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        Paddings paddings = this.topPadding;
        int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
        Paddings paddings2 = this.bottomPadding;
        int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.leftPadding;
        int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.rightPadding;
        return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        return b.e(p.b("Settings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
    }
}
